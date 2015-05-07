package org.bbaw.bts.ui.corpus.parts.ths;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.ui.commons.viewerSorter.BTSObjectByNameViewerSorter;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.jface.viewers.Viewer;

public class BTSThsBySortKeyNameViewerSorter extends
BTSObjectByNameViewerSorter {

	private final static String PATH_BEGIN = "thesaurus_date>>main_group>>beginning";

	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_THS_NAVIGATOR_SORTBYKEY, nodePath = "org.bbaw.bts.ui.corpus")
	protected boolean forceSortKey;

	protected boolean isForceSortKey() {
		return this.forceSortKey;
	}
	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		if (e1 instanceof TreeNodeWrapper && e2 instanceof TreeNodeWrapper) {
			TreeNodeWrapper t1 = (TreeNodeWrapper) e1;
			TreeNodeWrapper t2 = (TreeNodeWrapper) e2;
			if (t1.getObject() != null && t1.getObject() instanceof BTSCorpusObject
					&& t2.getObject() != null && t2.getObject() instanceof BTSCorpusObject) {
				BTSCorpusObject o1 = (BTSCorpusObject) t1.getObject();
				BTSCorpusObject o2 = (BTSCorpusObject) t2.getObject();
				if ("date".equals(o1.getType()) && "date".equals(o2.getType()))
				{
					BTSPassport p1 = o1.getPassport();
					BTSPassport p2 = o2.getPassport();
					if (p1 != null && p2 != null)
					{
						
						String begin1 = p1.getPassportEntryStringValueByPath(PATH_BEGIN);
						String begin2 = p2.getPassportEntryStringValueByPath(PATH_BEGIN);
						if (begin1 != null && begin2 != null)
						{
							try {
								int beg1 = new Integer(begin1);
								int beg2 = new Integer(begin2);
								return beg1 - beg2;
							} catch (NumberFormatException e) {
								return super.compare(viewer, e1, e2);
							}
						}
					}
				}
			}
		}
		return super.compare(viewer, e1, e2);
	}
}
