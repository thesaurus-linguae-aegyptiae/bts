package org.bbaw.bts.ui.commons.compare;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

public interface CompareViewerFactory {
	
	<T> boolean hasViewerForObject(Class<T> clazz);
	
	CompareViewer createViewer(Composite parent, int style);
	
	String getCompareViewerName();
	
	Image getCompareViewerIcon();

}
