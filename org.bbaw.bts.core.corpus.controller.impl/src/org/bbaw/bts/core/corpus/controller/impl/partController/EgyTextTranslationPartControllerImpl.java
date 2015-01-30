package org.bbaw.bts.core.corpus.controller.impl.partController;

import org.bbaw.bts.core.corpus.controller.partController.EgyTextTranslationPartController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.eclipse.jface.text.source.IAnnotationModel;

public class EgyTextTranslationPartControllerImpl implements EgyTextTranslationPartController{

	private static final String NO_TRANSLATION_OF_LANG = "## no trans: ";
	private static final String END = " ##";

	@Override
	public String loadTranslation(BTSText text, String language,
			IAnnotationModel annotationModel) {
		if (text.getTextContent() == null || text.getTextContent().getTextItems().isEmpty()) return "";
		StringBuilder stringBuilder = new StringBuilder();
		
		for (BTSTextItems tItem : text.getTextContent().getTextItems())
		{
			if (tItem instanceof BTSSenctence)
			{
				BTSSenctence sentence = (BTSSenctence) tItem;
				String translation = null;
				if (sentence.getTranslation() != null)
				{
					translation = sentence.getTranslation().getTranslationStrict(language);
				}
				if (translation == null)
				{
					translation = NO_TRANSLATION_OF_LANG + language + END;
				}
				stringBuilder.append(translation + "§\n");
			}
		}
		return stringBuilder.toString();
	}

}
