package org.bbaw.bts.core.controller.handlerController;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.filter.BTSFilter;

public interface MoveObjectAmongProjectDBCollectionHandlerController {

	TreeNodeWrapper getMoveOptionsRootNode(Object selection);

	boolean move(BTSDBBaseObject selection, String targetDBCollectionPath);

	BTSFilter getMoveDBCollectionFilter(BTSDBBaseObject selection);

}
