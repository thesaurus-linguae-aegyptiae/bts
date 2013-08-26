package org.bbaw.bts.ui.commons.validator;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class StringNotEmptyValidator implements IValidator
{

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
		return ValidationStatus.error("String may not be empty");
	}

}
