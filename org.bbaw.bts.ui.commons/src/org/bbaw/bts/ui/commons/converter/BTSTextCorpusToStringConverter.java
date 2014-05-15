package org.bbaw.bts.ui.commons.converter;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.core.databinding.conversion.IConverter;

public class BTSTextCorpusToStringConverter implements IConverter {

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
			return ((BTSCorpusObject) ((TreeNodeWrapper) fromObject).getObject()).getCorpusPrefix();
		}
		return null;
	}
}
