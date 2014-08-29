package org.bbaw.bts.ui.corpus.search;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.bbaw.bts.ui.commons.search.SearchViewerFactory;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.parts.LemmaNavigator;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class SearchViewerFactoryLemma implements SearchViewerFactory {

	private SearchViewer searchViewer;
	private IEclipseContext context;
	
	protected BTSResourceProvider resourceProvider = StaticAccessController
			.getResourceProvider();

	@Override
	public <T> boolean hasSearchViewerForObject(Class<T> clazz) {
		return BTSLemmaEntry.class.isAssignableFrom(clazz);
	}

	@Override
	public SearchViewer createSearchViewer(Composite parent, int style, BTSConfigItem relationConfig) {
		if (context == null)
		{
			context = StaticAccessController.getContext();
		}
		IEclipseContext child = context.createChild();
		child.set(Composite.class, parent);
		child.set(BTSConfigItem.class, relationConfig);
		child.set(BTSUIConstants.SELECTION_TYPE,
				BTSUIConstants.SELECTION_TYPE_SECONDARY);
		searchViewer = ContextInjectionFactory.make(
				LemmaNavigator.class, child);
		return searchViewer;
	}

	@Override
	public String getSearchViewerName() {
		return "LemmaNavigator";
	}

	@Override
	public Image getSearchViewerIcon() {
		return resourceProvider.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_LEMMATA);
	}
}
