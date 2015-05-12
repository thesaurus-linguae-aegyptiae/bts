package org.bbaw.bts.core.corpus.controller.partController;

import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;

public interface ThsNavigatorController extends GenericCorpusObjectNavigatorController<BTSThsEntry, String>{

	BTSAnnotation createNewAnnotation(BTSThsEntry selection);

	
}
