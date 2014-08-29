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
package org.bbaw.bts.ui.commons.search;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

/**
 * A factory for creating SearchViewer objects.
 */
public interface SearchViewerFactory {

	/**
	 * Checks for search viewer for object.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @return true, if successful
	 */
	<T> boolean hasSearchViewerForObject(Class<T> clazz);
	
	/**
	 * Creates a new SearchViewer object.
	 *
	 * @param parent the parent
	 * @param style the style
	 * @param relationConfig the relation config
	 * @return the search viewer
	 */
	SearchViewer createSearchViewer(Composite parent, int style, BTSConfigItem relationConfig);
	
	/**
	 * Gets the search viewer name.
	 *
	 * @return the search viewer name
	 */
	String getSearchViewerName();
	
	/**
	 * Gets the search viewer icon.
	 *
	 * @return the search viewer icon
	 */
	Image getSearchViewerIcon();

}
