package org.bbaw.bts.core.corpus.controller.partController;

import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.eclipse.jface.text.source.IAnnotationModel;

public interface EgyTextTranslationPartController {

	String loadTranslation(BTSText text, String language,
			IAnnotationModel annotationModel);

}
