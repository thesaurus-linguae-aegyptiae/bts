package org.bbaw.bts.core.services;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSCorpusObject;

public interface BTSConfigurationService extends GenericObjectService<BTSConfiguration, String>
{

	BTSConfigItem createNewConfigItem();

	BTSConfigItem getActivePassportConfigItem();

	BTSConfiguration getActiveConfiguration();

	BTSConfigItem getObjectTypesConfigItem();

	BTSConfigItem getConfigItemOfObjectType(BTSCorpusObject object,
			boolean strict);

	String findObjectClass(BTSCorpusObject corpusObject);

	BTSConfigItem getRelationsConfigItem();

}
