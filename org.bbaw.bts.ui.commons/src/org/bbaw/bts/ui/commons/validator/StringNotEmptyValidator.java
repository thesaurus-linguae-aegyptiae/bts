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
package org.bbaw.bts.ui.commons.validator;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

// TODO: Auto-generated Javadoc
/**
 * The Class StringNotEmptyValidator implements the EMF Validator interface and validates
 * if the given String-object is not empty.
 *
 * @author Christoph Plutte
 */
public class StringNotEmptyValidator implements IValidator
{

	/** The Constant error. */
	private static final String error = "String may not be empty";
	
	/** The error message. */
	private String errorMessage = error;

	/**
	 * Instantiates a new string not empty validator.
	 *
	 * @param errorMessage the error message
	 */
	public StringNotEmptyValidator(String errorMessage)
	{
		if (errorMessage != null)
		{
			this.errorMessage = errorMessage;
		}
	}

	/**
	 * Instantiates a new string not empty validator.
	 */
	public StringNotEmptyValidator()
	{
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.validation.IValidator#validate(java.lang.Object)
	 */
	@Override
	public IStatus validate(Object value)
	{
		if (value instanceof String)
		{
			if (value.toString().trim().length() > 0)
			{
				return ValidationStatus.ok();
			}
		}
		return ValidationStatus.error(errorMessage);
	}

}
