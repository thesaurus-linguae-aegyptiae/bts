package org.bbaw.bts.db.couchdb.impl;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBConnection;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.db.DBManager;
import org.eclipse.e4.core.di.extensions.Preference;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexResponse;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.node.Node;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;
import org.lightcouch.NoDocumentException;
import org.lightcouch.Replicator;
import org.lightcouch.ReplicatorDocument;

import com.google.gson.JsonObject;

public class CouchDBManager implements DBManager
{
	//FIXME javascript korrigieren
	private static final String VALIDATE_DOC_READ = "function(doc,userCtx,secObj){if(!doc.visibility){return;}else{if(doc.visibility=='public'||doc.visibility=='repository'||doc.visibility=='project'){return;}} if(userCtx.roles.indexOf('_admin')!==-1||userCtx.roles.indexOf('admin')!==-1){return;}else if(secObj&&secObj.admins&&secObj.admins.roles){for(var i=0,l=secObj.admins.roles.length;i<l;i++){if(userCtx.roles.indexOf(secObj.admins.roles[i])!==-1){return;}}}else{if(userCtx.roles.indexOf('editors')!==-1){return;} if(secObj&&secObj.editors&&secObj.editors.roles){for(var i=0,l=secObj.editors.roles.length;i<l;i++){if(userCtx.roles.indexOf(secObj.editors[i])!==-1){return;}}} for(var i=0,l=doc.readers.length;i<l;i++){if(doc.readers[i]==userCtx.name){return;} if(userCtx.roles.indexOf(doc.readers[i])!==-1){return;}}} throw({forbidden:secObj.admins.names[0]+secObj.editors.names[0]+'name: '+userCtx.name+userCtx.roles[0]+' '+userCtx.roles[1]+' Only admins may edit the database. Hallo Welt22. writers: '+doc.readers[0]});throw({forbidden:secObj.admins.names[0]+' hallo '+secObj.editors.names[0]+' name: '+userCtx.name+userCtx.roles[0]+' '+userCtx.roles[1]+' Only admins may edit the database. Hallo Welt22. writers: '+doc.writers[0]});}";
	//FIXME javascript korrigieren
	private static final String VALIDATE_DOC_UPDATE = "function(newDoc,oldDoc,userCtx,secObj){if(!oldDoc){return;}else{if(userCtx.roles.indexOf('_admin')!==-1||userCtx.roles.indexOf('admin')!==-1){return;}else if(secObj&&secObj.admins&&secObj.admins.roles){for(var i=0,l=secObj.admins.roles.length;i<l;i++){if(userCtx.roles.indexOf(secObj.admins.roles[i])!==-1){return;}}}else{if(userCtx.roles.indexOf('editors')!==-1){return;} if(secObj&&secObj.editors&&secObj.editors.roles){for(var i=0,l=secObj.editors.roles.length;i<l;i++){if(userCtx.roles.indexOf(secObj.editors[i])!==-1){return;}}} for(var i=0,l=oldDoc.writers.length;i<l;i++){if(oldDoc.writers[i]==userCtx.name){return;} if(userCtx.roles.indexOf(oldDoc.writers[i])!==-1){return;}}} throw({forbidden:secObj.admins.names[0]+secObj.editors.names[0]+'name: '+userCtx.name+userCtx.roles[0]+' '+userCtx.roles[1]+' Only admins may edit the database. Hallo Welt22. writers: '+oldDoc.writers[0]});} throw({forbidden:secObj.admins.names[0]+' hallo '+secObj.editors.names[0]+' name: '+userCtx.name+userCtx.roles[0]+' '+userCtx.roles[1]+' Only admins may edit the database. Hallo Welt22. writers: '+oldDoc.writers[0]});}";
	private static final String RIVER_HEART_BEAT = "2s";
	private static final int RIVER_READ_TIMEOUT = 15;

	@Inject
	@Preference(value = "local_db_url", nodePath = "org.bbaw.bts.app")
	protected String local_db_url = "http://127.0.0.1:5985";

	@Inject
	@Preference(value = "local_elasticsearch_url", nodePath = "org.bbaw.bts.app")
	protected String local_elasticsearch_url = "http://127.0.0.1:9200";

	@Inject
	private DBConnectionProvider connectionProvider;

	@Inject
	@Preference(value = "username", nodePath = "org.bbaw.bts.app")
	private String username;

	@Inject
	@Preference(value = "password", nodePath = "org.bbaw.bts.app")
	private String password;

	private CouchDbClient dbClient;
	private Client esClient;

	@Override
	public boolean prepareDBSynchronization(BTSProject project) throws MalformedURLException
	{
		boolean success = true;

		for (BTSProjectDBCollection collection : project.getDbCollections())
		{
			if (collection.isSynchronized())
			{
				if (checkAndSetSyncToRemote(collection, project.getDbConnection())
						&& checkAndSetSyncFromRemote(collection, project.getDbConnection()))
				{
					// fine
				} else
				{
					success = false;
				}
			} else if (!collection.isSynchronized())
			{
				checkAndRemoveReplication(collection, project.getDbConnection());
			}
			checkAndAddAuthentication(collection);

			//TODO check and set _desing/auth docs with custom function
		}

		return success;
	}

	private void checkAndAddAuthentication(BTSProjectDBCollection collection)
	{
		dbClient = connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName());
		JsonObject jsonObject = null;
		try {
			jsonObject = dbClient.find(JsonObject.class, "_design/auth");
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!collection.getRoleDescriptions().isEmpty()) // auth required
		{
			if (jsonObject == null) // auth not found
			{
				String json = "{ ";
				json += "\"_id\": \"_design/auth\",";
				json += "\"language\": \"javascript\",";
				json += "\"validate_doc_read\": \"" + VALIDATE_DOC_READ + "\",";
				json += "\"validate_doc_update\": \"" + VALIDATE_DOC_UPDATE + "\"";
				json += "}";
				System.out.println(json);
				JsonObject jsonobj = dbClient.getGson().fromJson(json, JsonObject.class);
				System.out.println(json);
				dbClient.save(jsonobj);
			} else
			{
				boolean changed = false;
				if (jsonObject.get("validate_doc_read") == null
						|| !jsonObject.get("validate_doc_read").getAsString().equals(VALIDATE_DOC_READ))
				{
					jsonObject.addProperty("validate_doc_read", VALIDATE_DOC_READ);
					changed = true;
				}
				if (jsonObject.get("validate_doc_update") == null
						|| !jsonObject.get("validate_doc_update").getAsString().equals(VALIDATE_DOC_UPDATE))
				{
					jsonObject.addProperty("validate_doc_update", VALIDATE_DOC_UPDATE);
					changed = true;
				}
				if (changed)
				{
					//					jsonObject.remove("_rev");
					dbClient.update(jsonObject);
				}
			}
		} else
		// no auth required
		{
			if (jsonObject != null) // auth  found
			{
				dbClient.remove(jsonObject); // delete auth
			}
		}
	}

	private void checkAndRemoveReplication(BTSProjectDBCollection collection, BTSDBConnection dbConnection)

	{
		try
		{
			connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName()).replicator()
					.replicatorDocId(collection.getCollectionName() + DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE)
					.remove();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try
		{
			connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName()).replicator()
					.replicatorDocId(collection.getCollectionName() + DaoConstants.REPLICATOR_SUFFIX_TO_REMOTE)
					.remove();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean checkAndSetSyncFromRemote(BTSProjectDBCollection collection, BTSDBConnection dbConnection)
			throws MalformedURLException
	{
		List<ReplicatorDocument> docs = getReplicatorDocuments(collection.getCollectionName());
		if (docs != null && !docs.isEmpty())
		{
			for (ReplicatorDocument doc : docs)
			{
				if (matchesDBConnectionFromRemote(doc, dbConnection, collection))
				{
					return true;
				}
			}
		}
		Replicator replicator2 = connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName())
				.replicator();
		replicator2.target(collection.getCollectionName());
		replicator2.source(dbConnection.getMasterServer() + "/" + collection.getCollectionName());
		replicator2.continuous(true);
		replicator2.replicatorDocId(collection.getCollectionName() + DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE);
		replicator2.save(); // triggers a replication

		return true;
	}

	private boolean checkAndSetSyncToRemote(BTSProjectDBCollection collection, BTSDBConnection dbConnection)
			throws MalformedURLException
	{
		List<ReplicatorDocument> docs = getReplicatorDocuments(collection.getCollectionName());
		try
		{
			docs = connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName()).replicator()
					.findAll();
		} catch (NoDocumentException e)
		{

		}
		if (docs != null && !docs.isEmpty())
		{
			for (ReplicatorDocument doc : docs)
			{
				if (matchesDBConnectionToRemote(doc, dbConnection, collection))
				{
					return true;
				}
			}
		}

		Replicator replicator = connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName())
				.replicator();
		replicator.source(collection.getCollectionName());
		replicator.target(dbConnection.getMasterServer() + "/" + collection.getCollectionName());
		replicator.continuous(true);
		replicator.createTarget(true);
		replicator.replicatorDocId(collection.getCollectionName() + DaoConstants.REPLICATOR_SUFFIX_TO_REMOTE);
		replicator.save(); // triggers a replication

		return true;
	}

	private List<ReplicatorDocument> getReplicatorDocuments(String collectionName) throws MalformedURLException
	{
		List<ReplicatorDocument> docs = null;
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, collectionName);
		try
		{
			docs = client.replicator().findAll();
			return docs;
		} catch (NoDocumentException e)
		{
			client.context().createDB(DaoConstants.REPLICATOR);
		}
		try
		{
			docs = client.replicator().findAll();
			return docs;
		} catch (NoDocumentException e)
		{
		}
		return null;
	}

	private boolean matchesDBConnectionToRemote(ReplicatorDocument doc, BTSDBConnection dbConnection,
			BTSProjectDBCollection collection)
	{
		if (doc.getTarget().equals(dbConnection.getMasterServer() + "/" + collection.getCollectionName()))
		{
			return true;
		}
		return false;
	}

	private boolean matchesDBConnectionFromRemote(ReplicatorDocument doc, BTSDBConnection dbConnection,
			BTSProjectDBCollection collection)
	{
		if (doc.getSource().equals(dbConnection.getMasterServer() + "/" + collection.getCollectionName()))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean prepareDBIndexing(BTSProject project) throws URISyntaxException
	{
		boolean success = true;

		for (BTSProjectDBCollection collection : project.getDbCollections())
		{
			if (collection.isIndexed() && !checkAndCreateIndex(collection, getClient()))
			{
				success = false;
			}
		}

		return success;
	}

	private Client getClient() throws URISyntaxException
	{
		if (esClient == null)
		{
			URI uri = new URI(local_elasticsearch_url);
			esClient = new TransportClient().addTransportAddress(new InetSocketTransportAddress(uri.getHost(), uri
					.getPort()));
			Node node = nodeBuilder().node();
			esClient = node.client();
		}
		return esClient;
	}

	private boolean checkAndCreateIndex(BTSProjectDBCollection collection, Client esClient)
	{
		boolean hasIndex = existsIndex(esClient, collection.getCollectionName());

		if (false && hasIndex)
		{
			return true;
		} else
		{
			createRiver(esClient, collection.getCollectionName());
		}

		return true;
	}

	private void createIndex(Client esClient2, String collectionName)
	{
		// TODO Auto-generated method stub

	}

	private void createRiver(Client esClient2, String collectionName)
	{
		try
		{
			URL url = new URL(local_db_url);
			String json = "{\r\n" + "    \"type\" : \"couchdb\",\r\n" + "    \"couchdb\" : {\r\n"
					+ "        \"user\" : \""
					+ username
					+ "\",\r\n"
					+ "        \"password\" : \""
					+ password
					+ "\",\r\n"
					+ "        \"host\" : \""
					+ url.getHost()
					+ "\",\r\n"
					+ "        \"port\" : "
					+ url.getPort()
					+ ",\r\n"
					+ "        \"heartbeat\" : \""
					+ RIVER_HEART_BEAT
					+ "\",\r\n"
					+ "        \"read_timeout\" : "
					+ RIVER_READ_TIMEOUT
					+ ",\r\n"
					+ "        \"db\" : \""
					+ collectionName
					+ "\",\r\n"
					+ "        \"filter\" : null\r\n"
					+ "    }, index: {\r\n"
					+ "index: \""
					+ collectionName.trim()
					+ "\",\r\n"
					+ "\"type\": \""
					+ collectionName
					+ "\",\r\n"
					+ "\"bulk_size\": 100,\r\n" + "\"bulk_timeout\": \"10ms\"\r\n" + "}\r\n}";
			System.out.println(json);
			esClient2.index(Requests.indexRequest("_river").type(collectionName).id("_meta").source(json)).actionGet();
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private boolean existsRiver(Client esClient2, String collectionName)
	{
		// TODO Auto-generated method stub
		return false;
	}

	private boolean existsIndex(Client esClient2, String indexName)
	{
		boolean hasIndex = esClient2.admin().indices().exists(new IndicesExistsRequest(indexName)).actionGet()
				.isExists();
		return hasIndex;
	}

	@Override
	public boolean prepareDB() throws URISyntaxException
	{
		// TODO check if db is installed
		// if yes: start up
		// check if running

		try
		{
			DeleteIndexResponse delete = getClient().admin().indices()
					.delete(new DeleteIndexRequest(DaoConstants.PERCOLATOR)).actionGet();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean databaseIsInstalled()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean installDatabase(String string)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkConnection(String urlString, String username, String password) throws MalformedURLException
	{
		URL url = new URL(urlString);
		try
		{
			CouchDbProperties properties = new CouchDbProperties().setDbName(DaoConstants.ADMIN)
					.setCreateDbIfNotExist(false).setProtocol(url.getProtocol()).setHost(url.getHost())
					.setPort(url.getPort()).setMaxConnections(1).setConnectionTimeout(0).setUsername(username)
					.setPassword(password);
			dbClient = new CouchDbClient(properties);
		} catch (Exception e)
		{
			return false;
		}
		return true;
	}
}
