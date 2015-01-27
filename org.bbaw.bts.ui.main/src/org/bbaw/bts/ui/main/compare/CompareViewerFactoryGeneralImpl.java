package org.bbaw.bts.ui.main.compare;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.compare.CompareViewerFactory;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class CompareViewerFactoryGeneralImpl implements CompareViewerFactory {

	protected BTSResourceProvider resourceProvider = StaticAccessController.getContext().get(BTSResourceProvider.class);
	@Override
	public <T> boolean hasViewerForObject(Class<T> clazz) {
		return BTSDBBaseObject.class.isAssignableFrom(clazz);
	}

	@Override
	public CompareViewer createViewer(Composite parent, int style) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCompareViewerName() {
		return "Json";
	}

	@Override
	public Image getCompareViewerIcon() {
		Image i = resourceProvider.getImage(Display.getDefault(), BTSResourceProvider.IMG_TEXTS);
		return i;
	}
}
