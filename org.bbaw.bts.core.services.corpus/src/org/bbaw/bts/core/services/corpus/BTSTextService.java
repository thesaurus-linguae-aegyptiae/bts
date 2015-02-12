package org.bbaw.bts.core.services.corpus;

import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;

public interface BTSTextService extends GenericCorpusObjectService<BTSText, String>
{

	BTSSenctence createNewSentence();

	BTSWord createNewWord();

	BTSGraphic createNewGraphic();

	

}
