package org.bbaw.bts.ui.commons.converter;

import org.eclipse.core.databinding.conversion.IConverter;

public class BTSBooleanToStringConverter implements IConverter {

	@Override
	public Object getToType() {
		return String.class;
	}

	@Override
	public Object getFromType() {
		return Boolean.class;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof Boolean) {
			return fromObject.toString();
		}
		return "false";
	}
}