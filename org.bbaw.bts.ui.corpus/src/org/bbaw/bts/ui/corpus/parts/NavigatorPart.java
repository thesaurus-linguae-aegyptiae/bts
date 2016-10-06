package org.bbaw.bts.ui.corpus.parts;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.ui.commons.filter.BTSObjectStateViewerFilter;
import org.eclipse.jface.viewers.ViewerFilter;

public class NavigatorPart {

	private BTSObjectStateViewerFilter suppressDeletedFilter = new BTSObjectStateViewerFilter(BTSConstants.OBJECT_STATE_TERMINATED, true);
	private BTSObjectStateViewerFilter suppressNondeletedFilter = new BTSObjectStateViewerFilter(BTSConstants.OBJECT_STATE_TERMINATED);

	protected ViewerFilter getDeletedFilter(boolean showdeleted) {
		return showdeleted ? suppressNondeletedFilter : suppressDeletedFilter;
	}
}
