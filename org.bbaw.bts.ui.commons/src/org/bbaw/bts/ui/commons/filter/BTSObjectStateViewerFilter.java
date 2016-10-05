package org.bbaw.bts.ui.commons.filter;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class BTSObjectStateViewerFilter extends ViewerFilter implements
		BTSFilter {

	private String state = null;
	private boolean inverted = false;

	/**
	 * Instantiates a filter that objects with given {@link AdministrativDataObject#getState()} will pass.
	 * @param state the object state to filter by.
	 * @see BTSConstants#OBJECT_STATE_ACTIVE
	 * @see BTSConstants#OBJECT_STATE_TERMINATED
	 */
	public BTSObjectStateViewerFilter(String state) {
		this(state, false);
	}

	/**
	 * Instantiates a filter that objects will pass based on their {@link AdministrativDataObject#getState()}.
	 * @param state the object state to filter by.
	 * @param inverted whether to let objects pass that don't match given object state.
	 */
	public BTSObjectStateViewerFilter(String state, boolean inverted) {
		super();
		this.state = state;
		this.inverted = inverted;
	}
	
	@Override
	public boolean select(Object object) {
		if (object instanceof TreeNodeWrapper) {
			object = ((TreeNodeWrapper) object).getObject();
		}
		if (object == null)
		{
			return true; // because we want to show nested node wrappers
		}
		if (object instanceof AdministrativDataObject) {
			return inverted != state.equals(((AdministrativDataObject) object).getState());
		}
		return false;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return select(element);
	}

}
