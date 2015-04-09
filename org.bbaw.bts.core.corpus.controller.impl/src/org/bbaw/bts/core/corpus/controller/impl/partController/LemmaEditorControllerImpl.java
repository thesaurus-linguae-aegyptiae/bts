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
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
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
		for (BTSObject o : obs)
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
	@Override
	public List<BTSLemmaEntry> listInAllInvalidLemmata(IProgressMonitor monitor) {
		String[] params = new String[3];
		List<BTSLemmaEntry> invalidLemmata = new Vector<BTSLemmaEntry>();
		String[] active_lemmaLists= lemmaService.getActiveLemmaLists();
		for (String active_lemmaList : active_lemmaLists)
		{
			try {
				do
				{
					List<BTSLemmaEntry> lemmata = lemmaService.listChunks(100, params, active_lemmaList + "_wlist", BTSConstants.OBJECT_STATE_ACTIVE, monitor);
					if (lemmata == null) break;
					for (BTSLemmaEntry t : lemmata)
					{
						if (monitor.isCanceled()) break;
//						lemmaService.checkAndFullyLoad(t, false);
						monitor.worked(1);
						if (!testTextValidAgainstGrammar(t))
						{
							invalidLemmata.add(t);
						}
						monitor.worked(1);
					}
					 params = new String[]{params[1], params[2], null};
				}
				while(params[1] != null && (!monitor.isCanceled()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return invalidLemmata;
	}

	private boolean testTextValidAgainstGrammar(BTSLemmaEntry lemma) {
		if (lemma.getWords().isEmpty()) {
			return false;
		} else {
			BTSTextContent textContent = BtsCorpusModelFactory.eINSTANCE
					.createBTSTextContent();
			BTSSenctence sentence = BtsCorpusModelFactory.eINSTANCE
					.createBTSSenctence();
			textContent.getTextItems().add(sentence);
			sentence.getSentenceItems().addAll(lemma.getWords());
			return textEditorController.testTextValidAgainstGrammar(
					textContent, lemma);

		}
	}
}
