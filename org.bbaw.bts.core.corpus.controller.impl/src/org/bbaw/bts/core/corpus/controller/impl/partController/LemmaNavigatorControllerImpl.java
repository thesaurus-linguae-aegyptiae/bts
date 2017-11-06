package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.corpus.controller.impl.util.BTSEgyObjectByNameComparator;
import org.bbaw.bts.core.corpus.controller.impl.util.BTSObjectTreeGenerator;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.elasticsearch.index.query.QueryBuilders;

public class LemmaNavigatorControllerImpl extends AbstractCorpusObjectNavigatorControllerImpl<BTSLemmaEntry, String> 
implements LemmaNavigatorController{

	@Inject
	private BTSLemmaEntryService lemmaService;
	
	@Override
	protected List<BTSLemmaEntry> retrieveTypedRootEntries(IProgressMonitor monitor) {
		return lemmaService.listRootEntries(monitor);
	}

	@Override
	protected List<BTSLemmaEntry> executeTypedQuery(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		query.setResponseFields(null);
		return lemmaService.query(query, objectState, monitor);
	}

	@Override
	protected BTSLemmaEntry typedCreateNew() {
		return lemmaService.createNew();
	}

	@Override
	protected List<BTSLemmaEntry> typedListEntries(String objectState, IProgressMonitor monitor) {
		return lemmaService.list(objectState, monitor);
	}

	@Override
	protected List<BTSLemmaEntry> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters, IProgressMonitor monitor) {
		return lemmaService.getOrphanEntries(map, btsFilters, monitor);
	}

	@Override
	public BTSLemmaEntry find(String id, IProgressMonitor monitor) {
		return lemmaService.find(id, monitor);
	}

	@Override
	public BTSLemmaSubentry createNewSubEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void sortEntries(List<BTSLemmaEntry> list) {
		Collections.sort(list, new BTSEgyObjectByNameComparator());
	}

	protected String[] getChildRelationTypes() {
		return new String[]{"partOf", "referencedBy", "referencing", "rootOf"};
	}
	
	protected String[] getChildSubEntryRelationTypes() {
		return new String[]{"partOf"};
	}


	private TreeNodeWrapper createNodeRelationRepresentingBTSRelation(Map<String, TreeNodeWrapper> nodeReg, TreeNodeWrapper node, 
			BTSRelation rel, boolean asChild) {
		if (nodeReg.containsKey(rel.getObjectId())) {
			TreeNodeWrapper relNode = nodeReg.get(rel.getObjectId());
			TreeNodeWrapper parentNode = asChild ? node : relNode;
			TreeNodeWrapper childNode = asChild ? relNode : node;
			if (!parentNode.getChildren().contains(childNode) && !ancestry(parentNode, childNode)) {
				parentNode.getChildren().add(childNode);
				childNode.setParent(parentNode);
			}
			return relNode;
		}
		return null;
	}

	@Override
	public List<TreeNodeWrapper> loadLemmataIntoTree(List<BTSLemmaEntry> entries,
			Map<String, TreeNodeWrapper> registry,
			IProgressMonitor monitor) {
		BTSObjectTreeGenerator<BTSLemmaEntry> treeGen = new BTSObjectTreeGenerator<>(entries, registry, monitor);
		return treeGen.getRootNodes();
	}
	
	@Override
	public LinkedHashMap<String, TreeNodeWrapper> loadNodesWithChildren(
			List<BTSLemmaEntry> subList, IProgressMonitor monitor, boolean b) {

		if (monitor != null) {
			monitor.beginTask("Load nodes", subList.size());
		}

		final HashMap<String, Integer> lemmaPositions = new HashMap<String, Integer>();
		
		TreeMap<String, TreeNodeWrapper> nodeReg = new TreeMap<String, TreeNodeWrapper>(
				new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						try {
							return lemmaPositions.get(o2) - lemmaPositions.get(o1);
						} catch (NullPointerException e) {
							System.out.println("WZF!!! " + o1 + "/" + o2);
							return 0;
						}
					}
				});
		

		// initialize nodes registry with lemma wrappers
		int pos = 0;
		for (BTSLemmaEntry lemma : subList) {
			TreeNodeWrapper node = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			node.setObject(lemma);
			node.setLabel(lemma.getName());
			lemmaPositions.put(lemma.get_id(), pos);
			nodeReg.put(lemma.get_id(), node);
			pos ++;
		}

		// nest wrappers according to subList interrelations
		for (BTSLemmaEntry lemma : subList) {
			TreeNodeWrapper node = nodeReg.get(lemma.get_id());
			for (BTSRelation rel : lemma.getRelations())
				// XXX meh
				if (BTSCoreConstants.BASIC_RELATIONS_CONTAINS.equals(rel.getType())
						|| BTSCoreConstants.BASIC_RELATIONS_HAS_SUCCESSOR.equals(rel.getType())
						|| BTSCoreConstants.BASIC_RELATIONS_REFERENCES.equals(rel.getType())) {
					createNodeRelationRepresentingBTSRelation(nodeReg, node, rel, true);
					// maintain list order
					if (lemmaPositions.containsKey(rel.getObjectId())) {
						if (lemmaPositions.get(rel.getObjectId()) < lemmaPositions.get(lemma.get_id())) {
							lemmaPositions.put(lemma.get_id(), lemmaPositions.get(rel.getObjectId()));
						}
					}
				} else if (BTSCoreConstants.BASIC_RELATIONS_PARTOF.equals(rel.getType())
						|| BTSCoreConstants.BASIC_RELATIONS_SUCCESSOR_OF.equals(rel.getType())
						|| BTSCoreConstants.BASIC_RELATIONS_REFERENCED_BY.equals(rel.getType())) {
					createNodeRelationRepresentingBTSRelation(nodeReg, node, rel, false);
					if (lemmaPositions.containsKey(rel.getObjectId())) {
						// maintain lemma list sort order
						if (lemmaPositions.get(lemma.get_id()) < lemmaPositions.get(rel.getObjectId())) {
							// swap
							lemmaPositions.put(rel.getObjectId(), lemmaPositions.get(lemma.get_id()));
						}
					}
				}

			if (monitor != null)
				monitor.worked(1);
		}


		return new LinkedHashMap<String, TreeNodeWrapper>(nodeReg);
	}
	
	/**
	 * Checks if <code>test</code> is an ancestor of <code>node</code>.
	 * @param node
	 * @param test
	 * @return
	 */
	private static boolean ancestry(TreeNodeWrapper node, TreeNodeWrapper test) {
		for (;node != null; node = node.getParent())
			if (node.equals(test))
				return true;
		return false;
	}

	@Override
	public List<BTSLemmaEntry> findChildrenOnlySubEntries(BTSLemmaEntry parent, Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName, IProgressMonitor monitor) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.boolQuery().must(
				QueryBuilders.matchQuery("relations.objectId",	parent.get_id()))
				.must(QueryBuilders.matchQuery("relations.type", "partOf"))
				);
		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		
		query.setQueryId("relations.objectId-" + parent.get_id());
		System.out.println(query.getQueryId());
		if (queryResultMap != null) {
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(viewer);
			qra.setParentEObject(parentHolder);
			qra.setReferenceName(referenceName);
			qra.setQueryId(query.getQueryId());
			queryResultMap.put(query.getQueryId(), qra);
		}
		List<BTSLemmaEntry> children = executeTypedQuery(query, BTSConstants.OBJECT_STATE_ACTIVE, monitor); //thsService.query(query,BTSConstants.OBJECT_STATE_ACTIVE);
		List<BTSLemmaEntry> result = new Vector<BTSLemmaEntry>(children.size());
		for (BTSLemmaEntry o : children)
		{
			if (!(o instanceof BTSAnnotation))
			{
				result.add(o);
			}
		}
		sortEntries(result);
		return result;
	}


	// zur liste der Kinder auch die Elemente hinzufügen, die sich aus den Relationen des Objekts selber ergeben,
	// über Relationen iterieren und entsp. Objekte finden
	@Override
	public List<BTSLemmaEntry> findChildren(BTSLemmaEntry parent,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		List<BTSLemmaEntry> children = super.findChildren(parent, queryResultMap, viewer, parentHolder,
				referenceName, monitor);
		
		if (children == null)
		{
			children = new Vector<BTSLemmaEntry>();
		}
		for (BTSRelation rel : parent.getRelations())
		{
			Object o = null;
			try {
				try {
					o = lemmaService.find(rel.getObjectId(), null);
				} catch (Exception e) {
				}
				if (o instanceof BTSLemmaEntry && !children.contains(o))
				{
					children.add((BTSLemmaEntry) o);
				}
			} catch (Exception e) {
			}
		}
		return children;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.corpus.controller.partController.GenericCorpusObjectNavigatorController#createNewAnnotation(org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject)
	 */
	@Override
	public BTSAnnotation createNewAnnotation(BTSLemmaEntry selection, String annotationTypePath) {
		BTSAnnotation anno = lemmaService
				.createNewAnnotationRelationPartOf(selection);
		setObjectTypePath(anno, annotationTypePath);

		return anno;
	}

}
