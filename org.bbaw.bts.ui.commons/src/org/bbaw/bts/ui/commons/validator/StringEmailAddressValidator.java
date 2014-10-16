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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

/**
 * The Class StringEmailAddressValidator implements the EMF Validator interface and validates
 * if the given String-object is a valid EmailAddress.
 *
 * @author Christoph Plutte
 */
public class StringEmailAddressValidator implements IValidator
{

	/** The Constant regex. */
	private static final String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-_]+(\\.[_A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	
	/** The Constant patt. */
	private static final Pattern patt = Pattern.compile(regex);
	
	/** The Constant error. */
	private static final String error = "String ist not a valid email address";
	
	/** The error message. */
	private String errorMessage = error;
	
	/** The nullable. */
	private boolean nullable = false;;

	/**
	 * Instantiates a new string email address validator.
	 *
	 * @param nullable true if stirng may be null
	 */
	public StringEmailAddressValidator(boolean nullable)
	{
		this.nullable = nullable;
	}

	/**
	 * Instantiates a new string email address validator.
	 *
	 * @param errorMessage the error message
	 * @param nullable the nullable
	 */
	public StringEmailAddressValidator(String errorMessage, boolean nullable)
	{
		this.nullable = nullable;
		if (errorMessage != null)
		{
			this.errorMessage = errorMessage;
		}
	}

	/**
	 * Instantiates a new string email address validator.
	 */
	public StringEmailAddressValidator()
	{
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.validation.IValidator#validate(java.lang.Object)
	 */
	@Override
	public IStatus validate(Object value)
	{
		if (nullable && value == null)
		{
			return ValidationStatus.ok();
		}
		if (value instanceof String)
		{
			String string = (String) value;
			if (nullable && string.trim().length() == 0)
			{
				return ValidationStatus.ok();
			}
			try
			{
				Matcher matcher = patt.matcher(string);
				if (matcher.matches())
				{
					return ValidationStatus.ok();
				}
				return ValidationStatus.error(errorMessage);

			} catch (RuntimeException e)
			{
				return ValidationStatus.error(errorMessage);
			}

		}
		if (nullable)
		{
			return ValidationStatus.ok();
		}
		return ValidationStatus.error(errorMessage);
	}

}
