package org.bbaw.bts.core.corpus.controller.generalController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.ui.commons.filter.BTSObjectTypeSubtypeViewerFilter;

public interface PassportConfigurationController {

	List<BTSConfig> getFilteredChildren(BTSConfigItem groupConfig,
			BTSCorpusObject corpusObject);
	
	List<BTSConfigItem> getPassportCategories(BTSCorpusObject corpusObject);

	String[] getObjectSubtypes(BTSCorpusObject corpusObject);


//	String getIconStringOfObjectType(BTSCorpusObject object);


	BTSConfigItem getObjectTypeConfigItemProcessedClones(
			BTSCorpusObject corpusObject);

	BTSConfigItem getObjectSubtypeConfigItemProcessedClones(
			BTSCorpusObject corpusObject);

	BTSConfigItem getVisibilityConfigItemProcessedClones(
			BTSCorpusObject corpusObject);

	BTSConfigItem getReviewStateConfigItemProcessedClones(
			BTSCorpusObject corpusObject);

	BTSConfigItem getPathConfigItemProcessedClones(BTSConfigItem itemConfig,
			BTSCorpusObject corpusObject);

	BTSObjectTypeSubtypeViewerFilter createObjectTypeSubtypeFilterByReferencedPath(
			BTSCorpusObject corpusObject, BTSConfigItem itemConfig2);

	int checkPassportCompleteness(BTSCorpusObject corpusObject);

	BTSPassportEntry findMatchingEntryGroup(BTSPassport passport,
			BTSConfigItem category);

	/**
	 * @param annotation
	 * @param object
	 * @return return typeconfigs if type == null, if type is set it returns subtype configitems
	 */
	BTSConfigItem getObjectTypeConfigItemProcessedClones(String className, String type);

}
