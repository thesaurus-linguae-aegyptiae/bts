package org.bbaw.bts.ui.commons.converter;

import org.eclipse.core.databinding.conversion.IConverter;

public class BTSStringToIntegerConverter implements IConverter {


		@Override
		public Object getToType() {
			return Integer.class;
		}

		@Override
		public Object getFromType() {
			return String.class;
		}

		@Override
		public Object convert(Object fromObject) {
			if (fromObject instanceof String) {
				return new Integer((String) fromObject).intValue();
			}
			return new Integer(0);
		}
}
