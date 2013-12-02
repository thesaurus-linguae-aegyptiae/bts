package org.bbaw.bts.core.services;

import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSWord;

public interface BTSTextService extends GenericObjectService<BTSText, String>
{

	BTSSenctence createNewSentence();

	BTSWord createNewWord();

	BTSGraphic createNewGraphic();

}
