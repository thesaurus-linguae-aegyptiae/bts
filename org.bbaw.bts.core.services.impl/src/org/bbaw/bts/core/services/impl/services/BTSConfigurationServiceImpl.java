package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSUIConstants;
import org.bbaw.bts.core.dao.BTSConfigurationDao;
import org.bbaw.bts.core.services.BTSConfigurationService;

public class BTSConfigurationServiceImpl extends GenericObjectServiceImpl<BTSConfiguration, String> implements
		BTSConfigurationService
{

	@Inject
	private BTSConfigurationDao configurationDao;

	@Override
	public BTSConfiguration createNew()
	{
		BTSConfiguration config = BtsmodelFactory.eINSTANCE.createBTSConfiguration();
		super.setId(config);
		super.setRevision(config);
		return config;
	}

	@Override
	public boolean save(BTSConfiguration entity)
	{
		if (entity != null)
		{
			configurationDao.add(entity);
		}
		return false;
	}

	@Override
	public void update(BTSConfiguration entity)
	{
		configurationDao.update(entity);

	}

	@Override
	public void remove(BTSConfiguration entity)
	{
		configurationDao.remove(entity);

	}

	@Override
	public BTSConfiguration find(String key)
	{
		return configurationDao.find(key);
	}

	@Override
	public List<BTSConfiguration> list()
	{
		return configurationDao.list();
	}

	@Override
	public BTSConfigItem createNewConfigItem()
	{
		BTSConfigItem config = BtsmodelFactory.eINSTANCE.createBTSConfigItem();
		config.setLabel(BtsmodelFactory.eINSTANCE.createBTSTranslations());
		config.setDescription(BtsmodelFactory.eINSTANCE.createBTSTranslations());
		config.setPassportEditorConfig(BtsmodelFactory.eINSTANCE.createBTSPassportEditorConfig());
		return config;
	}

	@Override
	public BTSConfigItem getActivePassportConfigItem()
	{
		BTSConfiguration configuration = getActiveConfiguration();
		if (configuration != null && configuration.getChildren() != null)
		{
			for (BTSConfig c : configuration.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null && ci.getValue().equals(BTSUIConstants.PASSPORT))
					{
						return ci;
					}
				}
			}
		}
		return null;
	}

	@Override
	public BTSConfiguration getActiveConfiguration()
	{
		// FIXME logic!!!
		return list().get(0);
	}

	@Override
	public BTSConfigItem getObjectTypesConfigItem()
	{
		BTSConfiguration configuration = getActiveConfiguration();
		if (configuration != null && configuration.getChildren() != null)
		{
			for (BTSConfig c : configuration.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null && ci.getValue().equals(BTSUIConstants.OBJECT_TYPES))
					{
						return ci;
					}
				}
			}
		}
		return null;
	}

}
