package org.bbaw.bts.ui.commons.converter;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.eclipse.core.databinding.conversion.IConverter;

public class BTSConfigItemToStringConverter implements IConverter {

	@Override
	public Object getToType() {
		return String.class;
	}

	@Override
	public Object getFromType() {
		return BTSConfigItem.class;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof BTSConfigItem) {
			return ((BTSConfigItem) fromObject).getValue();
		}
		return null;
	}
}
