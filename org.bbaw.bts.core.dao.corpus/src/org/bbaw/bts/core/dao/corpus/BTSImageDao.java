package org.bbaw.bts.core.dao.corpus;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSImage;

public interface BTSImageDao extends GenericDao<BTSImage, String>
{

	boolean removeBTSImage(BTSImage btsImage, String path);

}
