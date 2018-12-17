package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.eclipse.core.runtime.IProgressMonitor;

public interface RelatedObjectsController {

	/**
	 * Just returns a {@link BTSQueryRequest} that matches objects which have {@link BTSRelation}s linking to the
	 * object passed as the `subject` parameter.
	 * @param subject The object to which relations are supposed to point. 
	 * @return
	 */
	BTSQueryRequest getRelatingObjectsQuery(BTSObject subject);

	
	/**
	 * Returns a list of so-called 'related objects' for a given {@link BTSObject}. The types usually falling under this
	 * category are {@link BTSAnnotation} and {@link BTSComment}. Instances of these types are considered a related object
	 * to the given subject if they have a {@link BTSRelation} pointing to it.
	 * @param subject The (corpus) object to which the searched-for objects need to relate to.
	 * @param monitor A monitor for tracking progress
	 * @return
	 */
	List<BTSObject> getRelatingObjects(BTSObject subject, IProgressMonitor monitor);
}
