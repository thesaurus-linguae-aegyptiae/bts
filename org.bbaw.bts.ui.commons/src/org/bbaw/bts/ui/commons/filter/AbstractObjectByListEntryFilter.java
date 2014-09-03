package org.bbaw.bts.ui.commons.filter;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.core.commons.filter.BTSObjectsByListEntryFilter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public abstract class AbstractObjectByListEntryFilter extends ViewerFilter implements BTSObjectsByListEntryFilter{

	private List<Object> objects;
	
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return select(element);
	}

	public List<Object> getObjects() {
		if (objects == null)
		{
			objects = new Vector<Object>(4);
		}
		return objects;
	}
	@Override
	public void setObjects(List<Object> objects) {
		this.objects = objects;
	}

	

}
