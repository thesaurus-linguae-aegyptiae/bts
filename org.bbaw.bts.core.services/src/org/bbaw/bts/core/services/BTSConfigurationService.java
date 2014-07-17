package org.bbaw.bts.core.services;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;

public interface BTSConfigurationService extends GenericObjectService<BTSConfiguration, String>
{

	BTSConfigItem createNewConfigItem();

	BTSConfigItem getActivePassportConfigItem();

	BTSConfiguration getActiveConfiguration();

	BTSConfigItem getObjectTypesConfigItem();

	BTSConfigItem getConfigItemOfObjectType(BTSObject object,
			boolean strict);

	String findObjectClass(BTSObject object);

	BTSConfigItem getRelationsConfigItem();

	boolean objectTypesPathsContainsObjectype(
			Map<String, List<String>> ownerTypesMap,
			BTSObject object);

	BTSConfigItem getVisibilityConfigItem();

	BTSConfigItem getReviewStatusConfigItem();

	BTSConfigItem getReviewStateConfigItemProcessedClones(
			BTSObject corpusObject);

	void calculateChildrenReferncedObjectsRecurcively(
			BTSObjectTypeTreeNode rootpath, BTSConfig config,
			BTSConfigItem pathClonesList, BTSObject object);
	
	void calculateChildrenRecurcively(BTSObjectTypeTreeNode rootpath,
			BTSConfig config, BTSConfigItem pathClonesList,
			BTSObject object);

	BTSConfigItem getObjectTypeConfigItemProcessedClones(
			BTSObject object);

	BTSConfigItem getVisibilityConfigItemProcessedClones(
			BTSObject object);

	BTSConfigItem getObjectSubtypeConfigItemProcessedClones(
			BTSObject object);

	List<BTSConfigItem> getPassportCategories(BTSObject object);

}
