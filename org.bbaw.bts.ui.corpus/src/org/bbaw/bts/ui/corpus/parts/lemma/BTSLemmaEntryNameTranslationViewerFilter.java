package org.bbaw.bts.ui.corpus.parts.lemma;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class BTSLemmaEntryNameTranslationViewerFilter extends ViewerFilter {

	private String filterText;

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (filterText == null || filterText.trim().length() == 0) return true;
		BTSLemmaEntry lemma;
		if (element instanceof BTSLemmaEntry)
		{
			lemma = (BTSLemmaEntry) element;
		}
		else if (element instanceof TreeNodeWrapper && ((TreeNodeWrapper)element).getObject() instanceof BTSLemmaEntry)
		{
			lemma = (BTSLemmaEntry) ((TreeNodeWrapper)element).getObject();
		}
		else
		{
			return false;
		}
		
		if (lemma.getName() != null && lemma.getName().contains(filterText))
		{
			return true;
		}
		
		String translation = getTranslationString(lemma);
		if (translation != null && translation.contains(filterText))
		{
			return true;
		}
		
		return false;
	}

	public void setFilterString(String filterText) {
		this.filterText = filterText;
		
	}

	public String getFilterString() {
		return filterText;
	}

	private String getTranslationString(Object object) {
		String translation = "";
		if (object instanceof BTSLemmaEntry)
		{
			BTSLemmaEntry lemma = (BTSLemmaEntry) object;
			if (lemma.getTranslations() == null) return translation;
			translation = lemma.getTranslations().getTranslation("de");
			if ("".equals(translation))
			{
				translation = lemma.getTranslations().getTranslation("en");
			}
		}
		return translation;
	}

}
