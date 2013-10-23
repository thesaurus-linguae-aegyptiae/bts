package org.bbaw.bts.ui.commons.validator;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class StringIsIntegerValidator implements IValidator
{

	@Override
	public IStatus validate(Object value)
	{
		if (value instanceof String)
		{
			if (value.toString().trim().length() > 0)
			{
				try
				{
					Integer i = new Integer((String) value);
					return ValidationStatus.ok();
				} catch (NumberFormatException e)
				{
					return ValidationStatus.error("This must be an integer value.");
				}
			}
		}
		return ValidationStatus.error("This must be an integer value.");
	}

}
