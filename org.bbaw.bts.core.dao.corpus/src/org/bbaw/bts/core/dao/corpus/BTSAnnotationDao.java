package org.bbaw.bts.core.dao.corpus;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;


public interface BTSAnnotationDao extends GenericDao<BTSAnnotation, String>
{

	boolean removeBTSAnnotation(BTSAnnotation annotation, String path);

}
