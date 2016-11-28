package org.bbaw.bts.core.corpus.controller.partController;

import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;

public interface ATextNavigatorController extends GenericCorpusObjectNavigatorController<BTSAbstractText, String>{

	BTSAnnotation createNewAnnotation(BTSAbstractText selection);

	
}
