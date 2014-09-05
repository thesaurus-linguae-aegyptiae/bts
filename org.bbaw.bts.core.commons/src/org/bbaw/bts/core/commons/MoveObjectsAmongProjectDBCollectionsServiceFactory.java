package org.bbaw.bts.core.commons;

import org.bbaw.bts.core.commons.filter.BTSFilter;

public interface MoveObjectsAmongProjectDBCollectionsServiceFactory {
	
	BTSFilter getMoveObjectAmongProjectDBCollectionsFilter(Object object);
	
	MoveObjectAmongProjectDBCollectionsService getMoveObjectAmongProjectDBCollectionsService(Object object);

	boolean providesServiceForObject(Object object);

}
