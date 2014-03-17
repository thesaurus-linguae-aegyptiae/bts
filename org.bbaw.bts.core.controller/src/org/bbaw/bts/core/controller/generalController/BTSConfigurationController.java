package org.bbaw.bts.core.controller.generalController;

import java.util.Date;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObjectTypePath;
import org.bbaw.bts.btsmodel.BTSObjectTypePathRoot;

public interface BTSConfigurationController
{

	List<BTSConfiguration> listConfigurations();

	BTSConfiguration createNew();

	void save(BTSConfiguration config);

	BTSConfigItem createNewConfigItem(String label);

	List<BTSConfigItem> getPassportCategories(BTSCorpusObject corpusObject);

	// List<BTSConfigItem> getObjectTypes(BTSCorpusObject corpusObject);

	BTSConfigItem getObjectTypesConfigItem();

	String findObjectClass(BTSCorpusObject corpusObject);

	String[] getObjectSubtypes(BTSCorpusObject corpusObject);

	BTSObjectTypePath processTreeSelectorInputPath(
BTSConfig parentConfig,
			BTSObjectTypePathRoot selectionPath);

	List<BTSConfig> getFilteredChildren(BTSConfigItem groupConfig,
			BTSCorpusObject corpusObject);

	String getIconStringOfObjectType(BTSCorpusObject object);

	String getDisplayPresentationOfDate(Date timeStamp);

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

	BTSConfiguration getActiveConfiguration();

	BTSConfigItem getRelationsConfigItem();

	BTSConfigItem getRelationPathConfigItemProcessedClones(
			BTSConfigItem itemConfig2, BTSCorpusObject corpusObject);

}