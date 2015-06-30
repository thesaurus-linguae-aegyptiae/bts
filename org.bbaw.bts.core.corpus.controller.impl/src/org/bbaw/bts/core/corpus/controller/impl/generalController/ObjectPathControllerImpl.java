package org.bbaw.bts.core.corpus.controller.impl.generalController;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.corpus.controller.generalController.ObjectPathController;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.elasticsearch.index.query.QueryBuilders;


public class ObjectPathControllerImpl implements ObjectPathController {

	@Inject
	private CorpusObjectService corpusObjectService;
	
	@Inject
	private BTSTextCorpusService textCorpusService;
	
	@Inject
	private BTSLemmaEntryService lemmaService;
	
	@Inject
	private BTSThsEntryService thsService;

	@Override
	public BTSObject[] loadFullPath(BTSObject[] objects,
			Map<String, List<BTSObject>> pathCache) {
		return loadFullPathInternally(objects, pathCache, corpusObjectService);
	}
	
	private BTSObject[] loadFullPathInternally(BTSObject[] objects,
			Map<String, List<BTSObject>> pathCache, GenericObjectService service) {
		if (objects[0] == null) return objects;
		BTSObject object = objects[0];
		List<BTSObject> fullPath = new Vector<BTSObject>();
		
		fullPath =  findFullSingleParentPath(object, service);
		
		
		// add last
		for (int i = 0; i < objects.length && i <= 12; i++)
		{
			fullPath.add(objects[i]);
		}
		return fullPath.toArray(new BTSObject[fullPath.size()]);
	}

	private List<BTSObject> findFullSingleParentPath(BTSObject object, GenericObjectService service) {
		List<BTSObject> fullPath = new Vector<BTSObject>();
		List<BTSObject> parents = null; //= findParents(object);
		int counter = 0;
		do
		{
			parents = findParents(object, service);
			if (parents != null && !parents.isEmpty())
			{
				object = parents.get(0);
				fullPath.add(0, object);
			}
			counter++;
			if (counter > 12) break;
		}
		while(parents != null && !parents.isEmpty() && object != null);
		
		return fullPath;
	}

	private List<BTSObject> findParents(BTSObject object, GenericObjectService service) {
		List<BTSObject> parents = new Vector<BTSObject>();
		for (BTSRelation rel : object.getRelations().subList(0,	Math.min(object.getRelations().size(), 12)))
		{
			if ("partOf".equals(rel.getType()))
			{
				Object o = null;
				try {
					try {
						o = service.find(rel.getObjectId(), null);
					} catch (Exception e) {
					}
					if (o == null && service instanceof CorpusObjectService) // look in corpora
					{
						try {
							o = textCorpusService.find(rel.getObjectId(), null);
						} catch (Exception e) {
						}
					}
					if (o instanceof BTSObject)
					{
						parents.add((BTSObject) o);
					}
				} catch (Exception e) {
				}
				
			}
		}
		if (parents.isEmpty())
		{
			parents.addAll(queryForParent(object.get_id(), service));
		}
		return parents;
	}

	private List<BTSObject> queryForParent(String objectId, GenericObjectService service) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.matchQuery("relations.objectId",
				objectId));
		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		
		query.setQueryId("relations.objectId-" + objectId);
		List<BTSCorpusObject> rawParents = service.query(query, BTSConstants.OBJECT_STATE_ACTIVE, false, null);
		List<BTSObject> parents = new Vector<BTSObject>();
		for (BTSCorpusObject o : rawParents.subList(0,	Math.min(rawParents.size(), 12)))
		{
			for (BTSRelation rel : o.getRelations())
			{
				if (!"partOf".equals(rel.getType()) && rel.getObjectId().equals(objectId))
				{
					parents.add(o);
				}
			}
		}
		return parents;
	}

	@Override
	public BTSObject[] loadFullPathThs(BTSObject[] objects,
			Map<String, List<BTSObject>> pathCache) {
		return loadFullPathInternally(objects, pathCache, thsService);
	}

	@Override
	public BTSObject[] loadFullPathLemma(BTSObject[] objects,
			Map<String, List<BTSObject>> pathCache) {
		return loadFullPathInternally(objects, pathCache, lemmaService);
	}

}
