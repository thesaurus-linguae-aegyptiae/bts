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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

/**
 * The Class StringHttp_s_URLValidator implements the EMF Validator interface and validates
 * if the given String-object is a valid Https_URL.
 *
 * @author Christoph Plutte
 */
public class StringHttp_s_URLValidator implements IValidator
{

//	/** The Constant regex. */
//	private static final String regex = "(https?://)?[a-zA-Z_0-9\\-]+(\\.\\w[a-zA-Z_0-9\\-]+)+(/[#&\\n\\-=?\\+\\%/\\.\\w]+)?";
//	
//	/** The Constant patt. */
//	private static final Pattern patt = Pattern.compile(regex);
//	
	/** The Constant error. */
	private static final String error = "String ist not a valid URL";
	
	/** The error message. */
	private String errorMessage = error;
	
	/** The nullable. */
	private boolean nullable = false;;

	/**
	 * Instantiates a new string http_s_ url validator.
	 *
	 * @param nullable the nullable
	 */
	public StringHttp_s_URLValidator(boolean nullable)
	{
		this.nullable = nullable;
	}

	/**
	 * Instantiates a new string http_s_ url validator.
	 *
	 * @param errorMessage the error message
	 * @param nullable the nullable
	 */
	public StringHttp_s_URLValidator(String errorMessage, boolean nullable)
	{
		this.nullable = nullable;
		if (errorMessage != null)
		{
			this.errorMessage = errorMessage;
		}
	}

	/**
	 * Instantiates a new string http_s_ url validator.
	 */
	public StringHttp_s_URLValidator()
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
				try {
					URL url = new URL(string);
					return ValidationStatus.ok();
				} catch (MalformedURLException e) {
					e.printStackTrace();
					return ValidationStatus.error(errorMessage);
				}

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
