package org.bbaw.bts.ui.main.objectTypeSelector;

import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class PathTreeContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement != null && parentElement instanceof BTSObjectTypeTreeNode)
		{
			return ((BTSObjectTypeTreeNode) parentElement).getChildren().toArray(
					new BTSObjectTypeTreeNode[((BTSObjectTypeTreeNode) parentElement)
							.getChildren().size()]);
		}
		return new BTSObjectTypeTreeNode[] {};
	}

	@Override
	public Object getParent(Object element) {
		if (element != null && element instanceof BTSObjectTypeTreeNode) {
			return ((EObject) element).eContainer();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element != null && element instanceof BTSObjectTypeTreeNode) {
			return !((BTSObjectTypeTreeNode) element).getChildren().isEmpty();
		}
		return false;
	}

}
