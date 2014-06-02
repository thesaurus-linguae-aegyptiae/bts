package org.bbaw.bts.ui.corpus.compare;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.compare.CompareViewerFactory;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.widgets.Composite;

public class CompareViewerFactoryPassportImpl implements CompareViewerFactory {

	private CompareViewer compareViewer;
	private IEclipseContext context;

	@Override
	public <T> boolean hasViewerForObject(Class<T> clazz) {
		return BTSCorpusObject.class.isAssignableFrom(clazz);
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
				CompareViewerPassportImpl.class, child);
		return compareViewer;
	}

}
