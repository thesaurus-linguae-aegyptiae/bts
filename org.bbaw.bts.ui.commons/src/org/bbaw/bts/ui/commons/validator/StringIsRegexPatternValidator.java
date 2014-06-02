package org.bbaw.bts.ui.commons.validator;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class StringIsRegexPatternValidator implements IValidator {

	private static final String errorMessage = "String is not a valid regualar expression.";

	@Override
	public IStatus validate(Object value) {
		if (value instanceof String && !"".equals(value)) {
			try {
				@SuppressWarnings("unused")
				Pattern p = Pattern.compile((String) value);
				return ValidationStatus.ok();
			} catch (PatternSyntaxException e) {
				return ValidationStatus.error(errorMessage);
			}
		}
		return ValidationStatus.ok();
	}

}
