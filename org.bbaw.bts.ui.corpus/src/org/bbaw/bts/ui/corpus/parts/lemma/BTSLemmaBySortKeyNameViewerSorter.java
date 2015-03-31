package org.bbaw.bts.ui.corpus.parts.lemma;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.ui.corpus.sorter.BTSEgyObjectByNameViewerSorter;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSLemmaBySortKeyNameViewerSorter extends
		BTSEgyObjectByNameViewerSorter {
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_LEMMA_NAVIGATOR_SORTBYKEY, nodePath = "org.bbaw.bts.ui.corpus")
	protected boolean forceSortKey;

	
	protected boolean isForceSortKey() {
		return this.forceSortKey;
	}
}
