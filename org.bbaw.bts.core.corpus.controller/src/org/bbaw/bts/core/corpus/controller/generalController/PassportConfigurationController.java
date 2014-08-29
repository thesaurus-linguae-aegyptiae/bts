package org.bbaw.bts.core.corpus.controller.generalController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;

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

}
