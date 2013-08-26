package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSConfiguration;

public interface BTSConfigurationDao extends GenericDao<BTSConfiguration, String> {
	
	boolean removeBTSConfiguration(BTSConfiguration btsConfiguration);

}
