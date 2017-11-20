package org.bbaw.bts.core.corpus.controller.impl.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Instantiation of this class will take a list of specified generic type objects and transfer them into
 * a tree/forest-like structure in which every object is wrapped within a {@link TreeNodeWrapper} instance that
 * represents its object's relationships to any other object in the input list.
 * 
 * Root elements of resulting tree structure can be retrieved with {@link #getRootNodes()}. The returned
 * {@link TreeNodeWrapper} list can be put into a <code>TreeViewer</code>.
 * 
 * @author jhoeper
 *
 * @param <T> {@link BTSObject} or subclass.
 */
public class BTSObjectTreeGenerator<T extends BTSObject> {

	class BTSObjectTreePositionComparator implements Comparator<TreeNodeWrapper> {
		@SuppressWarnings("unchecked")
		@Override
		public int compare(TreeNodeWrapper o1, TreeNodeWrapper o2) {
			TreeNodeWrapper n1 = nodeRegistry.get(((T)o1.getObject()).get_id());
			TreeNodeWrapper n2 = nodeRegistry.get(((T)o2.getObject()).get_id());
			return foremostPositionOfSubTree(n1) - foremostPositionOfSubTree(n2);
		}
	}

	private List<String> relationsToChildren = Arrays.asList(new String[]{
			BTSCoreConstants.BASIC_RELATIONS_CONTAINS,
			BTSCoreConstants.BASIC_RELATIONS_HAS_SUCCESSOR,
			BTSCoreConstants.BASIC_RELATIONS_REFERENCES
			});
	
	private List<String> relationsToParent = Arrays.asList(new String[]{
			BTSCoreConstants.BASIC_RELATIONS_PARTOF,
			BTSCoreConstants.BASIC_RELATIONS_SUCCESSOR_OF,
			BTSCoreConstants.BASIC_RELATIONS_REFERENCED_BY			
			});
	
	private HashMap<String, Integer> itemPositions;
	
	private Map<String, TreeNodeWrapper> nodeRegistry;

	private List<T> items = null;

	private List<TreeNodeWrapper> roots = null;

	private IProgressMonitor monitor = null;
	
	public BTSObjectTreeGenerator(List<T> items, Map<String, TreeNodeWrapper> registry, IProgressMonitor monitor) {
		itemPositions = new HashMap<String, Integer>(items.size());
		nodeRegistry = registry != null ? registry : new HashMap<String, TreeNodeWrapper>(items.size());
		nodeRegistry.clear();
		this.items = items;
		int pos = 0;
		for (T item : items) {
			TreeNodeWrapper node = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			node.setObject(item);
			nodeRegistry.put(item.get_id(), node);
			itemPositions.put(item.get_id(), pos);
			pos ++;
		}
		assembleTree();
	}

	public List<TreeNodeWrapper> assembleTree() {

		if (monitor != null) {
			monitor.beginTask("Load nodes", items.size());
		}

		roots = new Vector<TreeNodeWrapper>();

		for (T item : items) {
			TreeNodeWrapper node = nodeRegistry.get(item.get_id());
			for (BTSRelation rel : item.getRelations()) {
				if (relationsToChildren.contains(rel.getType())) {
					TreeNodeWrapper child = 
							createNodeRelationRepresentingBTSRelation(node, rel, true);
					// remove child from root list if in there
					if (roots.contains(child)) {
						roots.remove(child);
					}
				} else if (relationsToParent.contains(rel.getType())) {
					createNodeRelationRepresentingBTSRelation(node, rel, false);
					// remove from root list if in there
					if (roots.contains(node)) {
						roots.remove(node);
					}
				}
			}

			// add to root nodes if root so far
			if (node.getParent() == null) {
				roots.add(node);
			}

			if (monitor != null) {
				monitor.worked(1);
			}
		}

		roots.sort(new BTSObjectTreePositionComparator());
		
		return roots;
	}
	
	public void addRelationToChildren(String relation_id) {
		if (!relationsToChildren.contains(relation_id)) {
			relationsToChildren.add(relation_id);
		}
	}
	
	public void addRelationToParent(String relation_id) {
		if (!relationsToParent.contains(relation_id)) {
			relationsToParent.add(relation_id);
		}
	}

	public List<TreeNodeWrapper> getRootNodes() {
		return roots;
	}
	
	@SuppressWarnings("unchecked")
	public int foremostPositionOfSubTree(TreeNodeWrapper node) {
		Integer position = null;
		List<TreeNodeWrapper> frontier = new Vector<>();
		frontier.add(node);
		while (node != null) {
			position = position != null ? 
					Math.min(itemPositions.getOrDefault(((T)node.getObject()).get_id(), Integer.MAX_VALUE), position) :
						itemPositions.getOrDefault(((T)node.getObject()).get_id(), Integer.MAX_VALUE);
			if (node.getChildren() != null) {
				frontier.addAll(node.getChildren());
			}
			node = frontier.isEmpty() ? null : frontier.remove(0);
		}
		return position;
	}

	private TreeNodeWrapper createNodeRelationRepresentingBTSRelation(TreeNodeWrapper node, 
			BTSRelation rel, boolean asChild) {
		if (nodeRegistry.containsKey(rel.getObjectId())) {
			TreeNodeWrapper relNode = nodeRegistry.get(rel.getObjectId());
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
	
}
