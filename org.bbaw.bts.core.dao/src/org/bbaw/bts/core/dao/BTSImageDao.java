package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSImage;

public interface BTSImageDao extends GenericDao<BTSImage, String> {
	
	boolean removeBTSImage(BTSImage btsImage);

}
