package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry;
import org.eclipse.core.runtime.IProgressMonitor;

public interface LemmaNavigatorController extends GenericCorpusObjectNavigatorController<BTSLemmaEntry, String>{

	BTSLemmaSubentry createNewSubEntry();

	BTSAnnotation createNewAnnotation(BTSCorpusObject selection);

	List<TreeNodeWrapper> loadNodesWithChildren(List<BTSLemmaEntry> subList,
			IProgressMonitor monitor, boolean b);

	
}
