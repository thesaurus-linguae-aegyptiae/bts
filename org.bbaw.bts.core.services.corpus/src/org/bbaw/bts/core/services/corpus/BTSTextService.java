package org.bbaw.bts.core.services.corpus;

import java.util.List;

import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.searchModel.WordFormOccurrenceGroup;
import org.eclipse.core.runtime.IProgressMonitor;

public interface BTSTextService extends GenericCorpusObjectService<BTSText, String>
{

	BTSSenctence createNewSentence();

	BTSWord createNewWord();

	BTSGraphic createNewGraphic();

	BTSSentenceItem copySentenceItem(BTSSentenceItem copyItem);

	BTSSenctence copySentence(BTSSenctence copyItem);

	List<WordFormOccurrenceGroup> queryForWordFormOccurrenceGroups(BTSQueryRequest query, IProgressMonitor monitor);

}
