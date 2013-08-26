package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSText;

public interface BTSTextDao extends GenericDao<BTSText, String>{
	
	boolean removeBTSText(BTSText btsText);

}
