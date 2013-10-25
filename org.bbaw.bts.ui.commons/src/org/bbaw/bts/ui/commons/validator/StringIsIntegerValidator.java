package org.bbaw.bts.ui.commons.validator;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class StringIsIntegerValidator implements IValidator
{
	private static final String error = "This must be an integer value.";
	private String errorMessage = error;
	private boolean nullable = false;;

	public StringIsIntegerValidator(boolean nullable)
	{
		this.nullable = nullable;
	}

	public StringIsIntegerValidator(String errorMessage, boolean nullable)
	{
		this.nullable = nullable;
		if (errorMessage != null)
		{
			this.errorMessage = errorMessage;
		}
	}

	public StringIsIntegerValidator()
	{
	}

	@Override
	public IStatus validate(Object value)
	{
		if (nullable && value == null)
		{
			return ValidationStatus.ok();
		}
		if (value instanceof String)
		{
			if (value.toString().trim().length() > 0)
			{
				try
				{
					@SuppressWarnings("unused")
					Integer i = new Integer((String) value);
					return ValidationStatus.ok();
				} catch (NumberFormatException e)
				{
					return ValidationStatus.error(errorMessage);
				}
			} else if (nullable)
			{
				return ValidationStatus.ok();
			}
		}
		return ValidationStatus.error(errorMessage);
	}

}
