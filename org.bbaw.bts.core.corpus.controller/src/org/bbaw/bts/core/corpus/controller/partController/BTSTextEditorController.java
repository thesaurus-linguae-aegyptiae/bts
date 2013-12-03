package org.bbaw.bts.core.corpus.controller.partController;

import grammaticalBase.model.text.TextModel;

import java.util.Map;

import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSWord;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.SourceViewer;

public interface BTSTextEditorController
{

	void transformToDocument(BTSText text, Document doc, IAnnotationModel model);

	BTSText updateTextFromDocument(BTSText text, Document document, IAnnotationModel annotationModel,
			SourceViewer textViewer);

	boolean save(BTSText text);

	TextModel transformToRamsesTextModel(BTSText text, TextModel textModel,
			Map<Object, BTSSentenceItem> ramsesTextModelMap);

	BTSText updateTextFromRamsesModel(BTSText text, TextModel textModel, Map<Object, BTSSentenceItem> ramsesTextModelMap);

	String transformWordToMdCString(BTSWord word);

	void updateBTSWordFromMdCString(BTSWord word, String mdc);
}
