package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.eclipse.core.runtime.IProgressMonitor;

public interface RelatedObjectsController {
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
