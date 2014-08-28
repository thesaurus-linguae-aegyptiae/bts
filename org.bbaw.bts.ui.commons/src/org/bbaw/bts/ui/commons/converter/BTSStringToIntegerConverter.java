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
package org.bbaw.bts.ui.commons.converter;

import org.eclipse.core.databinding.conversion.IConverter;

/**
 * The Class BTSStringToIntegerConverter implements Converter and converts String-objects to Integer-objects.
 */
public class BTSStringToIntegerConverter implements IConverter {


		/* (non-Javadoc)
		 * @see org.eclipse.core.databinding.conversion.IConverter#getToType()
		 */
		@Override
		public Object getToType() {
			return Integer.class;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.core.databinding.conversion.IConverter#getFromType()
		 */
		@Override
		public Object getFromType() {
			return String.class;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
		 */
		@Override
		public Object convert(Object fromObject) {
			if (fromObject instanceof String) {
				return new Integer((String) fromObject).intValue();
			}
			return new Integer(0);
		}
}
