package org.bbaw.bts.core.services;

import org.bbaw.bts.core.commons.MoveObjectAmongProjectDBCollectionsService;
import org.bbaw.bts.core.commons.filter.BTSFilter;

public interface GeneralMoveObjectAmongProjectsService extends MoveObjectAmongProjectDBCollectionsService{

	BTSFilter getMoveDBCollectionFilter(Object object);


}
