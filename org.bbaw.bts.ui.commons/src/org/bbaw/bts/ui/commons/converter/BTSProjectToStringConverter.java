package org.bbaw.bts.ui.commons.converter;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.core.databinding.conversion.IConverter;

public class BTSProjectToStringConverter implements IConverter {

	@Override
	public Object getToType() {
		return String.class;
	}

	@Override
	public Object getFromType() {
		return TreeNodeWrapper.class;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof TreeNodeWrapper) {
			return ((BTSProject) ((TreeNodeWrapper) fromObject).getObject()).getPrefix();
		}
		return null;
	}
}
