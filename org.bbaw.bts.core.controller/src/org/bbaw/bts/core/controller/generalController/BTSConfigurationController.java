package org.bbaw.bts.core.controller.generalController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSCorpusObject;

public interface BTSConfigurationController
{

	List<BTSConfiguration> listConfigurations();

	BTSConfiguration createNew();

	void save(BTSConfiguration config);

	BTSConfigItem createNewConfigItem(String label);

	List<BTSConfigItem> getPassportCategories(BTSCorpusObject corpusObject);

	List<BTSConfigItem> getObjectTypes(BTSCorpusObject corpusObject);

	String[] getObjectTypes(String objectType);

	String findObjectType(BTSCorpusObject corpusObject);

	String[] getObjectSubtypes(BTSCorpusObject corpusObject);

}