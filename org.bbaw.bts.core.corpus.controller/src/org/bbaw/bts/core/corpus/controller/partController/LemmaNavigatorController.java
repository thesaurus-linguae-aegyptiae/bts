package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;

public interface LemmaNavigatorController
		extends GenericCorpusObjectNavigatorController<BTSLemmaEntry, String>,
		RelatedObjectsController {

	BTSLemmaSubentry createNewSubEntry();

	List<TreeNodeWrapper> loadLemmataIntoTree(List<BTSLemmaEntry> entries,
			Map<String, TreeNodeWrapper> registry,
			IProgressMonitor monitor);

	List<BTSLemmaEntry> findChildrenOnlySubEntries(BTSLemmaEntry parent, Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName, IProgressMonitor monitor);

}
