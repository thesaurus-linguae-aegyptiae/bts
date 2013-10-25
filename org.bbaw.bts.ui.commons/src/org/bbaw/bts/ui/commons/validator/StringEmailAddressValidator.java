package org.bbaw.bts.ui.commons.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class StringEmailAddressValidator implements IValidator
{

	private static final String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern patt = Pattern.compile(regex);
	private static final String error = "String ist not a valid email address";
	private String errorMessage = error;
	private boolean nullable = false;;

	public StringEmailAddressValidator(boolean nullable)
	{
		this.nullable = nullable;
	}

	public StringEmailAddressValidator(String errorMessage, boolean nullable)
	{
		this.nullable = nullable;
		if (errorMessage != null)
		{
			this.errorMessage = errorMessage;
		}
	}

	public StringEmailAddressValidator()
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
