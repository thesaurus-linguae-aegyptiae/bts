package org.bbaw.bts.ui.main.objectTypeSelector;

import org.bbaw.bts.btsmodel.BTSObjectTypePath;
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
		if (parentElement != null && parentElement instanceof BTSObjectTypePath)
		{
			return ((BTSObjectTypePath) parentElement).getChildren().toArray(
					new BTSObjectTypePath[((BTSObjectTypePath) parentElement)
							.getChildren().size()]);
		}
		return new BTSObjectTypePath[] {};
	}

	@Override
	public Object getParent(Object element) {
		if (element != null && element instanceof BTSObjectTypePath) {
			return ((EObject) element).eContainer();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element != null && element instanceof BTSObjectTypePath) {
			return !((BTSObjectTypePath) element).getChildren().isEmpty();
		}
		return false;
	}

}
