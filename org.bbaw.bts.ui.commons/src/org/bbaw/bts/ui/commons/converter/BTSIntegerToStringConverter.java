package org.bbaw.bts.ui.commons.converter;

import org.eclipse.core.databinding.conversion.IConverter;

public class BTSIntegerToStringConverter implements IConverter {

	@Override
	public Object getToType() {
		return String.class;
	}

	@Override
	public Object getFromType() {
		return Integer.class;
	}

	@Override
	public Object convert(Object fromObject) {
		return fromObject == null ? 0 : fromObject.toString();
	}
}
