/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.ui.commons.filter;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * The Class SuppressNondeletedViewerFilter filters out objects that have an object status other than DELETED.
 * 
 * In other words this filters filters in only active objects.
 *
 * @author Christoph Plutte
 */
public class SuppressNondeletedViewerFilter extends ViewerFilter implements BTSFilter{

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return select(element);
	}

	@Override
	public boolean select(Object element) {
		Object object = element;
		if (element instanceof TreeNodeWrapper
				&& ((TreeNodeWrapper) element).getObject() != null) {
			object = ((TreeNodeWrapper) element).getObject();
		}
		if (object instanceof AdministrativDataObject
				&& !BTSConstants.OBJECT_STATE_ACTIVE
						.equals(((AdministrativDataObject) object).getState())) {
			return true;
		}
		return false;
	}

}
