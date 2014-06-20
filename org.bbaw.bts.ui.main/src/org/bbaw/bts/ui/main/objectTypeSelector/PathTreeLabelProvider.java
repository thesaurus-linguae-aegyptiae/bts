package org.bbaw.bts.ui.main.objectTypeSelector;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class PathTreeLabelProvider implements ILabelProvider {

	private List listeners = new Vector<>();

	@Override
	public void addListener(ILabelProviderListener listener) {
		listeners.add(listener);

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		listeners.remove(listener);

	}

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof BTSObjectTypeTreeNode) {
			return ((BTSObjectTypeTreeNode) element).getValue();
		}
		return element.toString();
	}


}
