package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.IAnnotationModel;

public interface LemmaEditorController {

	List<BTSObject> getRelatingObjects(BTSLemmaEntry selection);
	void transformToDocument(BTSTextContent textContent, Document doc, IAnnotationModel model, List<BTSObject> relatingObjects, Map<String, List<BTSInterTextReference>> relatingObjectsMap);
	boolean save(BTSLemmaEntry lemmaEntry);

}
