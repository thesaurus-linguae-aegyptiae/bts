package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSTCObject;

public interface BTSTCObjectDao extends GenericDao<BTSTCObject, String>
{

	boolean removeBTSTCObject(BTSTCObject tcObject, String path);

}
