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
 * The Class StringRegexValidator implements the EMF Validator interface and validates
 * if the given String-object is matched by the given Regex.
 *
 * @author Christoph Plutte
 */
public class StringRegexValidator implements IValidator {

	/** The Constant errorMessage. */
	private static final String errorMessage = "Input String is not valid against the required regex pattern: ";
	
	/** The pattern. */
	private Pattern pattern;
	
	/** The pattern string. */
	private String patternString;

	private boolean force;

	/**
	 * Instantiates a new string regex validator.
	 *
	 * @param patternString the pattern string
	 */
	public StringRegexValidator(String patternString, boolean force) {
		this.patternString = patternString;
		this.force = force;
		try {
			this.pattern = Pattern.compile(patternString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public StringRegexValidator(String patternString) {
		this.patternString = patternString;
		this.force = true;
		try {
			this.pattern = Pattern.compile(patternString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.validation.IValidator#validate(java.lang.Object)
	 */
	@Override
	public IStatus validate(Object value) {
		if (value instanceof String && !"".equals(value)) {
			Matcher m = pattern.matcher((CharSequence) value);
			if (m.find()) {
				return ValidationStatus.ok();
			}
			else {
				return ValidationStatus.error(errorMessage + patternString);
			}
		}
		if (force)
		{
			return ValidationStatus.error(errorMessage + patternString);
		}
			return ValidationStatus.ok();
	}

}
