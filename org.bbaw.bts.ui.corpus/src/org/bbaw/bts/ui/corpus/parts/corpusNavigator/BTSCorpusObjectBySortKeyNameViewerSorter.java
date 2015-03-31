package org.bbaw.bts.ui.corpus.parts.corpusNavigator;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.ui.commons.viewerSorter.BTSObjectByNameViewerSorter;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.jface.viewers.Viewer;

public class BTSCorpusObjectBySortKeyNameViewerSorter extends
		BTSObjectByNameViewerSorter {
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_CORPUS_NAVIGATOR_SORTBYKEY, nodePath = "org.bbaw.bts.ui.corpus")
	protected boolean forceSortKey;

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		return super.compare(viewer, e1, e2);
	}

	protected boolean isForceSortKey() {
		return this.forceSortKey;
	}
}
