package org.bbaw.bts.core.services;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;

public interface BTSConfigurationService extends GenericObjectService<BTSConfiguration, String>
{

	BTSConfigItem createNewConfigItem();

	BTSConfigItem getActivePassportConfigItem();

	BTSConfiguration getActiveConfiguration();

	BTSConfigItem getObjectTypesConfigItem();

}
