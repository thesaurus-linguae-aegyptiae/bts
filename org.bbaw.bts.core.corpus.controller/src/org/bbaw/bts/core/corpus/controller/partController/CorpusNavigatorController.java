package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.eclipse.core.runtime.IProgressMonitor;

public interface CorpusNavigatorController extends GenericCorpusObjectNavigatorController<BTSCorpusObject, String>
{

	BTSTextCorpus createNewTextCorpus();

	BTSTCObject createNewTCObject(BTSCorpusObject parentObject);

	BTSText createNewText(BTSCorpusObject parentObject);

	List<BTSTextCorpus> listTextCorpora(IProgressMonitor monitor);
	
	boolean makeAndSaveNewTextCorpus(BTSTextCorpus corpus, boolean synchronizeCorpus);

	BTSTextCorpus findTextCorpusByPrefix(String corpusPrefix);
}