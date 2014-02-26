package org.bbaw.bts.ui.commons.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class StringRegexValidator implements IValidator {

	private static final String errorMessage = "Input String is not valid against the required regex pattern: ";
	private Pattern pattern;
	private String patternString;

	public StringRegexValidator(String patternString) {
		this.patternString = patternString;
		try {
			this.pattern = Pattern.compile(patternString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
		return ValidationStatus.ok();
	}

}
