package org.bbaw.bts.ui.commons.filter;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class SuppressNondeletedViewerFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		Object object = element;
		if (element instanceof TreeNodeWrapper
				&& ((TreeNodeWrapper) element).getObject() != null) {
			object = ((TreeNodeWrapper) element).getObject();
		}
		if (object instanceof AdministrativDataObject
				&& !BTSConstants.OBJECT_STATE_ACITVE
						.equals(((AdministrativDataObject) object).getState())) {
			return true;
		}
		return false;
	}

}
