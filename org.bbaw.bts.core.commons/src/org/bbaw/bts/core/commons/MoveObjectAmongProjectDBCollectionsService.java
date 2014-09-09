package org.bbaw.bts.core.commons;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;

public interface MoveObjectAmongProjectDBCollectionsService {
	
	boolean move(BTSDBBaseObject object, String targetDBCollectionPath, String sourceDBCollectionPath);


}
