package org.bbaw.bts.core.corpus.controller.partController;

import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry;

public interface LemmaNavigatorController extends GenericCorpusObjectNavigatorController<BTSLemmaEntry, String>{

	BTSLemmaSubentry createNewSubEntry();

	BTSAnnotation createNewAnnotation(BTSCorpusObject selection);

	
}
