package org.bbaw.bts.ui.commons.converter;

import org.eclipse.core.databinding.conversion.IConverter;

public class BTSStringToBooleanConverter implements IConverter {

	@Override
	public Object getToType() {
		return Boolean.class;
	}

	@Override
	public Object getFromType() {
		return String.class;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof String) {
			return fromObject.equals("true");
		}
		return false;
	}
}