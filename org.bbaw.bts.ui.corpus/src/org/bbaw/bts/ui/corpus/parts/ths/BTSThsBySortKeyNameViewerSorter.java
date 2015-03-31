package org.bbaw.bts.ui.corpus.parts.ths;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.ui.commons.viewerSorter.BTSObjectByNameViewerSorter;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSThsBySortKeyNameViewerSorter extends
BTSObjectByNameViewerSorter {
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_THS_NAVIGATOR_SORTBYKEY, nodePath = "org.bbaw.bts.ui.corpus")
	protected boolean forceSortKey;

	protected boolean isForceSortKey() {
		return this.forceSortKey;
	}
}
