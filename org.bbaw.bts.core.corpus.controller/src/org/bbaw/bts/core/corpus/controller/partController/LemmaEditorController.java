package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.IAnnotationModel;

public interface LemmaEditorController {

	List<BTSObject> getRelatingObjects(BTSLemmaEntry selection, IProgressMonitor monitor);
	void transformToDocument(BTSTextContent textContent, Document doc, IAnnotationModel model, List<BTSObject> relatingObjects, 
			Map<String, List<BTSInterTextReference>> relatingObjectsMap,
			Map<String, List<Object>> lemmaAnnotationMap);
	boolean save(BTSLemmaEntry lemmaEntry);
	BTSTextContent updateModelFromTextContent(BTSTextContent textContent,
			EObject eo, IAnnotationModel am);
	BTSLemmaEntry findLemmaEntry(String lemmaId, IProgressMonitor monitor);
	List<BTSLemmaEntry> listInAllInvalidLemmata(IProgressMonitor monitor);
}
