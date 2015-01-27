package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.core.corpus.controller.partController.LemmaEditorController;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.elasticsearch.index.query.QueryBuilders;

public class LemmaEditorControllerImpl implements LemmaEditorController{

	@Inject
	private BTSCommentService commentService;
	
	@Inject
	private BTSLemmaEntryService lemmaService;
	
	@Inject
	private BTSTextEditorController textEditorController;
	
	@Override
	public List<BTSObject> getRelatingObjects(BTSLemmaEntry lemmaEntry, IProgressMonitor monitor) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.termQuery("relations.objectId",
				lemmaEntry.get_id()));
		query.setQueryId("relations.objectId-" + lemmaEntry.get_id());
		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		System.out.println(query.getQueryId());
		List<BTSObject> children = new Vector<BTSObject>();
		List<BTSLemmaEntry> obs = lemmaService.query(query,
				BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		for (BTSLemmaEntry o : obs)
		{
			children.add(o);
		}
		children.addAll(commentService.query(query, BTSConstants.OBJECT_STATE_ACTIVE, true, monitor));
		return children;
	}

	@Override
	public void transformToDocument(BTSTextContent textContent, Document doc,
			IAnnotationModel model, List<BTSObject> relatingObjects,
			Map<String, List<BTSInterTextReference>> relatingObjectsMap,
			Map<String, List<Object>> lemmaAnnotationMap) {
		textEditorController.transformToDocument(textContent, doc, model, relatingObjects, relatingObjectsMap, lemmaAnnotationMap, null);
		
	}

	@Override
	public boolean save(BTSLemmaEntry lemmaEntry) {
		return lemmaService.save(lemmaEntry);
	}

	@Override
	public BTSTextContent updateModelFromTextContent(
			BTSTextContent textContent, EObject eo, IAnnotationModel am) {
		return textEditorController.updateModelFromTextContent(textContent, eo, am);
	}

	@Override
	public BTSLemmaEntry findLemmaEntry(String lemmaId, IProgressMonitor monitor) {
		return lemmaService.find(lemmaId, monitor);
	}

}
