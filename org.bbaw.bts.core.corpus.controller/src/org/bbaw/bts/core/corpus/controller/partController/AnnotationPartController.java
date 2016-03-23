package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.eclipse.core.runtime.IProgressMonitor;

public interface AnnotationPartController {
	
	void save(BTSObject object);

	List<BTSObject> findRelatingObjects(BTSObject object, IProgressMonitor monitor);
	
	boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts);

	/**
	 * Retrieve {@link BTSConfigItem} holding subtype definitions for the {@link BTSAnnotation}
	 * type specified by given parameter.
	 * @param objectTypesConfigItem
	 * @return
	 */
	public BTSConfigItem getAnnoSubtypesConfigItem(BTSConfigItem objectTypesConfigItem);
	
	/**
	 * Retrieve {@link BTSConfigItem} holding type definitions for {@link BTSAnnotation} objects
	 * available in configuration.
	 * @return
	 */
	public BTSConfigItem getAnnoTypesConfigItem();
}
