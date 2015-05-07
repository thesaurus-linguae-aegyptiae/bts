package org.bbaw.bts.ui.commons.navigator;

import org.eclipse.jface.viewers.StructuredViewer;

public interface StructuredViewerProvider {

	StructuredViewer getActiveStructuredViewer();

	void reloadViewerNodes(StructuredViewer viewer);

	String[] getTypesFilterTerms();
}
