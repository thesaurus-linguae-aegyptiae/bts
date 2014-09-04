package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;

public interface CorpusNavigatorController extends GenericCorpusObjectNavigatorController<BTSCorpusObject, String>
{

//	List<BTSCorpusObject> getRootBTSCorpusObjects(Map<String, BTSQueryResultAbstract> queryResultMap,
//			ContentViewer viewer, TreeNodeWrapper parentHolder, EReference referenceName);

	BTSTextCorpus createNewTextCorpus();

	BTSTCObject createNewTCObject(BTSCorpusObject parentObject);

	BTSText createNewText(BTSCorpusObject parentObject);

	BTSAnnotation createNewAnnotation(BTSCorpusObject annotatedObject);

//	void addRelation(BTSCorpusObject subject, String relationType, TreeNodeWrapper treeNodeWrapper);
//
//	void save(BTSCorpusObject o);
//
//	List<BTSCorpusObject> findChildren(BTSCorpusObject parent, Map<String, BTSQueryResultAbstract> queryResultMap,
//			ContentViewer viewer, TreeNodeWrapper parentHolder, EReference referenceName);
//
//	boolean handleModelUpdate(BTSModelUpdateNotification notification,
//			Map<String, BTSQueryResultAbstract> queryResultMap, Map<String, List<TreeNodeWrapper>> viewHolderMap);
//
//	BTSCorpusObject findObject(String id);
	
	List<BTSTextCorpus> listTextCorpora();
	
	boolean makeAndSaveNewTextCorpus(BTSTextCorpus corpus, boolean synchronizeCorpus);

}