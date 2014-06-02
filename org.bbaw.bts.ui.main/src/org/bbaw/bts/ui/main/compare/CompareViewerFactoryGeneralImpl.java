package org.bbaw.bts.ui.main.compare;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.compare.CompareViewerFactory;
import org.eclipse.swt.widgets.Composite;

public class CompareViewerFactoryGeneralImpl implements CompareViewerFactory {

	@Override
	public <T> boolean hasViewerForObject(Class<T> clazz) {
		System.out.println("(BTSDBBaseObject.class.isInstance(clazz) " +BTSDBBaseObject.class.isInstance(clazz));
		System.out.println("(BTSDBBaseObject.class.isAssignableFrom(clazz) " +BTSDBBaseObject.class.isAssignableFrom(clazz));

		System.out.println(" clazz.isInstance(BTSDBBaseObject.class) " + clazz.isInstance(BTSDBBaseObject.class));
		System.out.println(" clazz.isAssignableFrom(BTSDBBaseObject.class) " + clazz.isAssignableFrom(BTSDBBaseObject.class));

		return BTSDBBaseObject.class.isAssignableFrom(clazz);
	}

	@Override
	public CompareViewer createViewer(Composite parent, int style) {
		// TODO Auto-generated method stub
		return null;
	}

}
