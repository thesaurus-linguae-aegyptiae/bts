package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.codehaus.jackson.JsonNode;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipselabs.emfjson.internal.JSONSave;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.percolate.PercolateRequestBuilder;
import org.elasticsearch.action.percolate.PercolateResponse;
import org.elasticsearch.action.percolate.PercolateResponse.Match;
import org.elasticsearch.client.Client;
import org.lightcouch.Changes;
import org.lightcouch.ChangesResult;
import org.lightcouch.Response;
import org.lightcouch.ChangesResult.Row;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbInfo;

import com.google.gson.JsonObject;

public class Backend2ClientUpdateDaoImpl implements Backend2ClientUpdateDao {

	protected static final String CHANGES_STYLE = "all_docs";

	private static final String TRUE = "true";

	@Inject
	private DBConnectionProvider connectionProvider;

	@Inject
	private IEclipseContext context;

	@Inject
	private GeneralPurposeDao generalPurposeDao;

	@Inject
	private Logger logger;

	@Inject
	@Optional
	@Named(BTSCoreConstants.LISTEN_TO_BACKEND_UPDATES)
	private String listen2Updates;

	private List<Backend2ClientUpdateListener> listeners = new Vector<Backend2ClientUpdateListener>(
			1);
	private String since;
	private HashMap<String, Changes> changesMap = new HashMap<String, Changes>();

	private void signalUpdate(Row feed, String docId, String dbCollection) {

		// FIXME dynamisieren für Import!
		// System.out.println(context.get(BTSCoreConstants.LISTEN_TO_BACKEND_UPDATES));
		if (listen2Updates == null && !TRUE.equals(listen2Updates)) {
			return;
		}
//		logger.info("Backend2DB listener on dbCollection: " + dbCollection
//				+ ", Changed object id: " + docId);

		BTSDBBaseObject object = null;
		List<String> queryIds = null;
		BTSModelUpdateNotification notification = new BTSModelUpdateNotification();
		notification.setDbCollection(dbCollection);
		if (feed.isDeleted()) {
			notification.setDeleted(true);
			logger.info("Notify Listener object is deleted. object id: "
					+ docId);
		} else
		// object not deleted
		{
			if (generalPurposeDao.objectIsLoaded(dbCollection, docId)) {
				notification.setLoaded(true);
				try {
					logger.info("Notify Listener object before reload.");

					object = generalPurposeDao.reload(docId, dbCollection);
					logger.info("Notify Listener object after reload: "
							+ object);
					logger.info("Notify Listener object successfully reloaded. object id: "
							+ docId);
				} catch (Exception e) {
					logger.error(e);
				}
			}
			
			JsonObject jso = feed.getDoc();
			queryIds = findQueryIdsInternal(jso.toString(), docId, dbCollection);
			if (queryIds != null && !queryIds.isEmpty() && object == null) {
				try {
					object = generalPurposeDao.find(docId, dbCollection);
				} catch (Exception e) {
					object = loadFromFeed(feed, dbCollection);
				}
			}
		}

		if (object != null || notification.isDeleted()) // object either loaded
														// and deleted or not
														// deleted
		// and loaded or notloaded
		{
			notification.setObject(object);
			notification.setQueryIds(queryIds);
			for (Backend2ClientUpdateListener l : listeners) {
				logger.info("Notify Listener about change: " + dbCollection
						+ ", Changed object id: " + docId);

				l.handleUpdate(notification);
			}
		}

	}

	private BTSDBBaseObject loadFromFeed(Row feed, String dbCollection) {
		JsonObject jso = feed.getDoc();
		URI uri = URI.createURI(connectionProvider.getLocalDBURL() + "/"
				+ dbCollection + "/" + feed.getId());
		System.out.println("loadFromFeed " + uri);
		Resource resource = null;
		// try {
		// resource = connectionProvider.getEmfResourceSet().getResource(uri,
		// true);
		// } catch (Exception e) {
		// logger.error(e);
		// }
		// if (resource != null && !resource.getContents().isEmpty())
		// {
		// return ((BTSDBBaseObject) resource.getContents().get(0));
		// }

		resource = connectionProvider.getEmfResourceSet().createResource(uri);
		logger.info(jso.toString());
		InputStream inputStream;
		if (resource.getContents().isEmpty()) {
			// EmfModelHelper.loadFromString(jso.toString(), classType)

			// inputStream = new
			// ByteArrayInputStream(jso.toString().getBytes(BTSConstants.ENCODING));
			generalPurposeDao.fillResource(resource, jso.toString());
			// final JSONLoad loader = new JSONLoad(inputStream, new
			// HashMap<Object, Object>());
			// loader.fillResource(resource);
		}
		if (!resource.getContents().isEmpty()) {
			return ((BTSDBBaseObject) resource.getContents().get(0));
		}
		logger.info("Object not found, feed object: " + jso);
		return null;
	}

	@Override
	public void addUpdateListener(Backend2ClientUpdateListener listener) {
		if (!this.listeners.contains(listener)) {
			this.listeners.add(listener);
		}

	}

	@Override
	public void runAndListenToUpdates(GeneralPurposeDao generalPurposeDao,
			final String dbCollection) {
		final CouchDbClient client = connectionProvider.getDBClient(
				CouchDbClient.class, dbCollection);
		CouchDbInfo dbInfo = client.context().info();
		since = dbInfo.getUpdateSeq();
		// feed type continuous
		Runnable runnable = new Runnable() {

			public void run() {
				Changes changes = client.changes().includeDocs(true)
						.since(since).heartBeat(DaoConstants.CHANGES_HEARTBEAT)
						.style(CHANGES_STYLE)

						.continuousChanges();
				changesMap.put(dbCollection, changes);
				try {
					while (changes.hasNext()) {
						// System.out.println("check for changes");
						ChangesResult.Row feed = changes.next();

						if (feed != null) {
							String docId = feed.getId();
							try {
								signalUpdate(feed, docId, dbCollection);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				} catch (Exception e) {
					logger.error(e);
				}
			}
		};
		new Thread(runnable).start();
	}

	@Override
	public void removeUpdateListener(Backend2ClientUpdateListener listener) {
		this.listeners.remove(listener);

	}

	@Override
	public void stopListening() {
		for (String key : changesMap.keySet()) {
			Changes c = changesMap.get(key);
			if (c != null) {
				try {
					c.stop();
				} catch (Exception e) {
					logger.error(
							"trying to stop changes. Change: " + c.toString(),
							e);
				}
			}
		}

	}

	@PreDestroy
	void unregisterListening() {
		for (String key : changesMap.keySet()) {
			changesMap.get(key).stop();
		}

	}

	@Override
	public List<String> fingQueryIds(Object object, String id,
			String dbCollection) {
		String objectAsString = modelToString(object);
		objectAsString = "{\r\n" + "\"doc\":" + objectAsString + "\r\n}";
		return findQueryIdsInternal(objectAsString, id, dbCollection);

	}

	private List<String> findQueryIdsInternal(String objectAsString, String id,
			String dbCollection) {
		// System.out.println("dbCollection " + dbCollection
		// + " doc string percolate: " + objectAsString);
		Client client = connectionProvider.getSearchClient(Client.class);

		PercolateResponse response = null;
		try {
			Match m = null;
			PercolateRequestBuilder rqb = client.preparePercolate()
					.setIndices(dbCollection).setDocumentType(dbCollection);
			rqb.setSource(objectAsString);
			response = rqb.execute().actionGet();
		} catch (ElasticsearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> queryIds = new Vector<String>(1);
		if (response != null) {
			for (Match m : response.getMatches()) {
				queryIds.add(m.getId().toString());
			}
		}
		Map<String, List<String>> map = (Map<String, List<String>>) context
				.get(DaoConstants.QUERY_ID_REGISTRY);
		List<String> ids = null;
		if (map != null) {
			if (map.containsKey(dbCollection)) {
				queryIds.addAll(map.get(dbCollection));
			}
		}
		return queryIds;
	}

	/**
	 * Performs a HTTP PUT request, saves or updates a document.
	 * 
	 * @return {@link Response}
	 */
	public static String modelToString(Object object) {
		// throw new UnsupportedOperationException();
		String string = null;
		Map options = new HashMap<Object, Object>();
		options.put("OPTION_INDENT_OUTPUT", false);
		JSONSave js = new JSONSave(options);
		if (object instanceof EObject) {
			EObject eo = (EObject) object;
			JsonNode node = js.writeEObject(eo, eo.eResource());
			string = node.toString();
		} else {
			ByteArrayOutputStream os = new ByteArrayOutputStream();

			js.writeValue(os, object);

			try {
				string = os.toString(BTSConstants.ENCODING);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return string;
	}
}
