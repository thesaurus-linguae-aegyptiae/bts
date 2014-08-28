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
package org.bbaw.bts.core.dao;

import org.eclipse.e4.core.contexts.IEclipseContext;

/**
 * A factory for creating DAO objects.
 */
public interface DAOFactory
{

	/**
	 * Gets the factory name.
	 *
	 * @return the factory name
	 */
	String getFactoryName();

	/**
	 * Gets the factory description.
	 *
	 * @return the factory description
	 */
	String getFactoryDescription();

	/**
	 * Creates a new DAO object.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @param context the context
	 * @return the t
	 */
	<T> T createDao(Class<T> clazz, IEclipseContext context);
}
