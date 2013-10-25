package org.bbaw.bts.ui.commons.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class StringHttp_s_URLValidator implements IValidator
{

	private static final String regex = "(@)?(href=')?(HREF=')?(HREF=\")?(href=\")?(http://)?[a-zA-Z_0-9\\-]+(\\.\\w[a-zA-Z_0-9\\-]+)+(/[#&\\n\\-=?\\+\\%/\\.\\w]+)?";
	private static final Pattern patt = Pattern.compile(regex);
	private static final String error = "String ist not a valid URL";
	private String errorMessage = error;
	private boolean nullable = false;;

	public StringHttp_s_URLValidator(boolean nullable)
	{
		this.nullable = nullable;
	}

	public StringHttp_s_URLValidator(String errorMessage, boolean nullable)
	{
		this.nullable = nullable;
		if (errorMessage != null)
		{
			this.errorMessage = errorMessage;
		}
	}

	public StringHttp_s_URLValidator()
	{
	}

	@Override
	public IStatus validate(Object value)
	{
		System.out.println(regex);
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
				if (matcher.find())
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
