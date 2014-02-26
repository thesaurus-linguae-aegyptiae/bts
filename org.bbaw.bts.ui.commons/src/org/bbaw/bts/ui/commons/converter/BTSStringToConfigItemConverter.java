package org.bbaw.bts.ui.commons.converter;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.Viewer;

public class BTSStringToConfigItemConverter implements IConverter {

	private Viewer viewer;

	public BTSStringToConfigItemConverter(Viewer viewer) {
		Assert.isNotNull(viewer);
		this.viewer = viewer;
	}

	@Override
	public Object getFromType() {
		return String.class;
	}

	@Override
	public Object getToType() {
		return BTSConfigItem.class;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof String) {
			Object input = viewer.getInput();
			if (input instanceof BTSConfigItem) {
				for (BTSConfig i : ((BTSConfig) input).getChildren()) {
					if (i instanceof BTSConfigItem
							&& fromObject
									.equals(((BTSConfigItem) i).getValue())) {
						return i;
					}
				}
				BTSConfigItem cci = BtsmodelFactory.eINSTANCE
						.createBTSConfigItem();
				cci.setLabel(BtsmodelFactory.eINSTANCE.createBTSTranslations());

				cci.getLabel().setTranslation((String) fromObject, "en");
				cci.setValue((String) fromObject);
				((BTSConfig) input).getChildren().add(cci);
				return cci;
			}

		}
		return null;
	}
}
