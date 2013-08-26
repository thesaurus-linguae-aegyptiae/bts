package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSAnnotation;

public interface BTSAnnotationDao extends GenericDao<BTSAnnotation, String> {
	
	boolean removeBTSAnnotation(BTSAnnotation annotation);

}
