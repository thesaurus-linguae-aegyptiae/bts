package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHitField;

public abstract class AbstractCorpusObjectDaoImpl<E extends BTSCorpusObject, K extends Serializable> 
extends CouchDBDao<E, K>
implements GenericDao<E, K>
{

	@Inject
	protected Logger logger;
	
	protected List<E> loadPartialObjectsFromStrings(
			List<String> allDocs, String dbPath) {
		List<E> results = new Vector<E>(allDocs.size());
		Map<URI, Resource> cache = ((ResourceSetImpl)connectionProvider.getEmfResourceSet()).getURIResourceMap();

		for (String jo : allDocs)
		{
//			System.out.println(jo);
			String id = extractIdFromObjectString(jo);
//			logger.info(id);
			URI uri = URI.createURI(getLocalDBURL() + "/" + dbPath + "/" + id);
			E entity = retrieveFromCache(uri, cache);
			if (entity == null)
			{
				entity = loadObjectFromString(id, dbPath, uri,extractEClassFromObjectString(jo), jo);
				addEntityToCache(uri, cache, entity);
			}
			results.add(entity);
		}
		return results;
	}

	

//	public E loadObjectFromString(String id, String indexName, URI uri, String eclassString, String sourceAsString)
//	{
//		Resource resource;
//		try {
//			resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
//		} catch (Exception e1) {
//			logger.info(e1);
//		} finally {
//			resource = connectionProvider.getEmfResourceSet().createResource(uri);
//		}
//		fillResource(resource, sourceAsString);
//		if (!resource.getContents().isEmpty())
//		{
//			E e = ((E) resource.getContents().get(0));
//			if (e.getDBCollectionKey() == null)
//			{
//				e.setDBCollectionKey(indexName);
//			}
//			checkForConflicts(e, indexName);
//			return e;
//		}
//		logger.info(sourceAsString);
//		return find((K) id, indexName);
//	}



	@Override
	public E loadObjectFromString(String id, String indexName, URI uri, String eclassString, String sourceAsString) {
		if (eclassString == null)
		{
			eclassString = extractEClassFromObjectString(sourceAsString);
		}
		E entity = createObject(eclassString);
		if (entity == null)
		{
			System.out.println(id +  " " + sourceAsString);
			throw new BTSDBException("Unable to identify EClass from source string: " + sourceAsString);
		}
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri); 
		//connectionProvider.getEmfResourceSet().getResource(uri, false);
//		if (resource == null)
//		{
//			resource = connectionProvider.getEmfResourceSet().createResource(uri); 
//		}
		resource.getContents().add(entity);
		entity.set_id(extractIdFromObjectString(sourceAsString));
		
		entity.setName(extractNameFromObjectString(sourceAsString));
		
		entity.setType(extractTypeFromObjectString(sourceAsString));
		
		entity.setSubtype(extractSubTypeFromObjectString(sourceAsString));
		
		// visiblity
		entity.setVisibility(extractVisibilityFromObjectString(sourceAsString));
		
		// readers
		List<String> readers = extractReadersFromObjectString(sourceAsString);
		if (readers != null)
		{
			for (String s : readers)
			{
				entity.getReaders().add(s);
			}
		}
		
		List<String> updaters = extractUpdatersFromObjectString(sourceAsString);
		if (updaters != null)
		{
			for (String s : updaters)
			{
				entity.getUpdaters().add(s);
			}
		}

		entity.setDBCollectionKey(indexName);
		entity.setRevisionState(extractRevisionSateFromObjectString(sourceAsString));
		return entity;
	}

	@Override
	protected E loadObjectFromHit(SearchHit hit, URI uri, String indexName)
	{
		if (hit.getSource() != null)
		{
			String eclass = null;
			if (hit.getFields().containsKey("eClass"))
			{
				eclass = hit.getFields().get("eClass").getValue();
			}
			return loadObjectFromString(hit.getId(), indexName, uri, eclass, hit.getSourceAsString());//loadResourceFromString(hit.getId(), hit.getSourceAsString(), indexName);
		}
		else if (!hit.getFields().isEmpty())
		{
			return loadEntityFromSearchHit(hit, uri, hit.getId(), indexName);
		}
		return null;
	}
	
	private E loadEntityFromSearchHit(SearchHit hit, URI uri, String id,
			String indexName) {
		E entity = null;
		
		if (hit.getFields().containsKey("eClass"))
		{
			entity = createObject(hit.getFields().get("eClass").getValue().toString());
		}
		if (entity == null) return null;
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri); 
		resource.getContents().add(entity);
		entity.set_id(id);
		
		if (hit.getFields().containsKey("name"))
		{
			entity.setName(hit.getFields().get("name").getValue().toString());
		}
		
		
		// type and subtype
		if (hit.getFields().containsKey("type"))
		{
			entity.setType(hit.getFields().get("type").getValue().toString());
		}
		if (hit.getFields().containsKey("subtype"))
		{
			entity.setSubtype(hit.getFields().get("subtype").getValue().toString());
		}
		
		// visiblity
		if (hit.getFields().containsKey("visibility"))
		{
			entity.setVisibility(hit.getFields().get("visibility").getValue().toString());
		}
		
		// readers
		if (hit.getFields().containsKey("readers"))
		{
			for (Object s : hit.getFields().get("readers").getValues())
			{
				entity.getReaders().add((String)s);
			}
		}
		
		if (hit.getFields().containsKey("updaters"))
		{
			for (Object s : hit.getFields().get("updaters").getValues())
			{
				entity.getUpdaters().add((String)s);
			}
		}

//		System.out.println(jo);
		entity.setDBCollectionKey(indexName);
		if (hit.getFields().containsKey("revisionState"))
		{
		
			entity.setRevisionState(hit.getFields().get("revisionState").getValue().toString());
		}
		return entity;
	}


	protected E createObject(String eClass)
	{
//		String eClass = null;
//		Gson gson = new Gson();
////		Phone fooFromJson = gson.fromJson(jsonString, Phone.class);
//		JsonObject json = gson.fromJson(jo, JsonObject.class);
//		if (json != null)
//		{
//			JsonElement mem = json.get("eClass");
//			if (mem != null)
//			{
//				eClass = mem.getAsString();
//			}
//		}
		if (eClass != null)
		{
			if (eClass.endsWith("BTSAnnotation"))
			{
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSAnnotation();
			} else if (eClass.endsWith("BTSImage"))
			{
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSImage();
			}
			else if (eClass.endsWith("BTSLemmaEntry"))
			{
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSLemmaEntry();
			}
			else if (eClass.endsWith("BTSTCObject"))
			{
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSTCObject();
			}
			else if (eClass.endsWith("BTSTextCorpus"))
			{
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSTextCorpus();
			}
			else if (eClass.endsWith("BTSText"))
			{
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSText();
			}
			else if (eClass.endsWith("BTSThsEntry"))
			{
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSThsEntry();
			}
		}
		return null;
		
	}
	protected abstract E createObject();
}
