package org.bbaw.bts.core.controller.generalController;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;

public interface BTSConfigurationController
{

	List<BTSConfiguration> listConfigurations();

	BTSConfiguration createNew();

	void save(BTSConfiguration config);

	BTSConfigItem createNewConfigItem(String label);

	String getDisplayPresentationOfDate(Date timeStamp);

	// List<BTSConfigItem> getObjectTypes(BTSCorpusObject corpusObject);

	BTSConfigItem getObjectTypesConfigItem();


	BTSObjectTypeTreeNode processTreeSelectorInputPath(
BTSConfig parentConfig,
Map<String, List<String>> ownerTypesMap, boolean includingReferencedObjectTypes);

	
	BTSConfiguration getActiveConfiguration();

	BTSConfigItem getRelationsConfigItem();

	BTSConfigItem getRelationPathConfigItemProcessedClones(
			BTSConfigItem itemConfig2, BTSObject object);

	List<String> processTreePathToList(
			BTSObjectTypeTreeNode treePath);

	boolean objectMayReferenceToCorpus(BTSObject selectionObject,
			BTSConfigItem relationConfig);

	boolean objectMayReferenceToThs(BTSObject selectionObject,
			BTSConfigItem relationConfig);

	boolean objectMayReferenceToWList(BTSObject selectionObject,
			BTSConfigItem relationConfig);
	
	Set<String> getReferenceTypesSet(BTSObject object,
			BTSConfigItem relationConfig);

	String findObjectClass(BTSObject object);
	
	String getIconStringOfObjectType(BTSObject object);

}