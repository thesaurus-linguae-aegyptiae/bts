package org.bbaw.bts.ui.egy.compare;

import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.compare.CompareViewerFactory;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class CompareViewerFactoryEgyTextImpl implements CompareViewerFactory {

	private CompareViewer compareViewer;
	private IEclipseContext context;

	protected BTSResourceProvider resourceProvider = StaticAccessController.getContext().get(BTSResourceProvider.class);
	@Override
	public <T> boolean hasViewerForObject(Class<T> clazz) {
		return BTSText.class.isAssignableFrom(clazz);
	}

	@Override
	public CompareViewer createViewer(Composite parent, int style) {
		
		if (context == null)
		{
			context = StaticAccessController.getContext();
		}
		IEclipseContext child = context.createChild();
		child.set(Composite.class, parent);
		compareViewer = ContextInjectionFactory.make(
				CompareViewerEgyTextImpl.class, child);
		return compareViewer;
	}

	@Override
	public String getCompareViewerName() {
		return "Egyptian Text Editor";
	}

	@Override
	public Image getCompareViewerIcon() {
		Image i = resourceProvider.getImage(Display.getDefault(), BTSResourceProvider.IMG_TEXTS);
		return i;
	}

}
