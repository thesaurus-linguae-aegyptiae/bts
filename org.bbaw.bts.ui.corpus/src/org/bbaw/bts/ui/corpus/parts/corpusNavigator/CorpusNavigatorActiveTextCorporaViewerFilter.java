package org.bbaw.bts.ui.corpus.parts.corpusNavigator;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class CorpusNavigatorActiveTextCorporaViewerFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof TreeNodeWrapper)
		{
			Object o = ((TreeNodeWrapper)element).getObject();
			if (o != null && o instanceof BTSTextCorpus)
			{
				return ((BTSTextCorpus)o).isActive();
			}
		}
		return true;
	}

}
