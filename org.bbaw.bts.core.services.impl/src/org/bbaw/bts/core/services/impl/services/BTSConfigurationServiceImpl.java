package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSImage;
import org.bbaw.bts.btsmodel.BTSListEntry;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.dao.BTSConfigurationDao;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSConfigurationServiceImpl extends GenericObjectServiceImpl<BTSConfiguration, String> implements
		BTSConfigurationService
{

	@Inject
	private BTSConfigurationDao configurationDao;
	@Inject
	private IEclipseContext context;
	@Inject
	@Preference(value = BTSPluginIDs.ACTIVE_CONFIGURATION, nodePath = "org.bbaw.bts.app")
	protected String active_configuration_name;
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
			configurationDao.add(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);
		}
		if (active_configuration_name.equals(entity.getName())) {
			context.set(BTSPluginIDs.ACTIVE_CONFIGURATION, entity);
		}
		return true;
	}

	@Override
	public void update(BTSConfiguration entity)
	{
		configurationDao.update(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);

	}

	@Override
	public void remove(BTSConfiguration entity)
	{
		configurationDao.remove(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);

	}

	@Override
	public BTSConfiguration find(String key)
	{
		BTSConfiguration config = null;
		config = configurationDao.find(key, main_project + ServiceConstants.ADMIN_SUFFIX);
		if (config != null)
		{
			return config;
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			config = configurationDao.find(key, p + ServiceConstants.ADMIN_SUFFIX);
			if (config != null)
			{
				return config;
			}
		}
		return null;
	}

	@Override
	public List<BTSConfiguration> list(String objectState)
	{
		List<BTSConfiguration> configs = new Vector<BTSConfiguration>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			configs.addAll(configurationDao.list(p
					+ ServiceConstants.ADMIN_SUFFIX, objectState));
		}
		return configs;
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
					if (ci.getValue() != null && ci.getValue().equals(BTSCoreConstants.PASSPORT))
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
		BTSConfiguration activeConfig = (BTSConfiguration) context.get(BTSPluginIDs.ACTIVE_CONFIGURATION);
		if (activeConfig != null)
		{
			return (BTSConfiguration) activeConfig;
		}
		List<BTSConfiguration> list = list(BTSConstants.OBJECT_STATE_ACTIVE);
		if (list == null || list.isEmpty())
		{
			BTSConfiguration config = createNew();
			save(config);
		}
		activeConfig = list(BTSConstants.OBJECT_STATE_ACTIVE).get(0);

		for (BTSConfiguration c : list) {
			if (active_configuration_name.equals(c.getName())) {
				activeConfig = c;
			}
		}
		context.set(BTSPluginIDs.ACTIVE_CONFIGURATION, activeConfig);
		return activeConfig;
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
					if (ci.getValue() != null && ci.getValue().equals(BTSCoreConstants.OBJECT_TYPES))
					{
						return ci;
					}
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSConfiguration> query(BTSQueryRequest query,
			String objectState, boolean registerQuery)
	{
		List<BTSConfiguration> objects = new Vector<BTSConfiguration>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			objects.addAll(configurationDao.query(query, p + ServiceConstants.ADMIN_SUFFIX, p
							+ ServiceConstants.ADMIN_SUFFIX, objectState,
							registerQuery));
		}
		return filter(objects);
	}
	@Override
	public List<BTSConfiguration> query(BTSQueryRequest query,
			String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSConfiguration> list(String dbPath, String queryId,
			String objectState)
	{
		return configurationDao.findByQueryId(queryId, dbPath,
				objectState);
	}

	@Override
	public BTSConfigItem getConfigItemOfObjectType(BTSCorpusObject object,
			boolean strict) {
		BTSConfigItem objectTypesCI = getObjectTypesConfigItem();
		String oClass = findObjectClass((BTSCorpusObject) object);
		for (BTSConfig c : objectTypesCI.getChildren()) {
			if (oClass.equals(((BTSConfigItem) c).getValue())) {
				if (object.getType() == null || "".equals(object.getType())) {
					return (BTSConfigItem) c;
				} else {
					for (BTSConfig cc : c.getChildren()) {
						if (object.getType().equals(
								((BTSConfigItem) cc).getValue())) {
							if (object.getSubtype() != null
									&& "".equals(object.getSubtype())) {
								for (BTSConfig ccc : cc.getChildren()) {
									if (object.getSubtype().equals(
											((BTSConfigItem) ccc).getValue())) {
										return (BTSConfigItem) ccc;
									}

								}
								if (!strict) {
									return (BTSConfigItem) cc;
								}
							} else {
								return (BTSConfigItem) cc;
							}
						}

					}
				}
			}

		}
		return null;
	}

	@Override
	public String findObjectClass(BTSCorpusObject corpusObject) {
		if (corpusObject instanceof BTSAnnotation) {
			return BTSConstants.BASIC_OBJECT_TYPES[0];
		} else if (corpusObject instanceof BTSTCObject) {
			return BTSConstants.BASIC_OBJECT_TYPES[1];
		} else if (corpusObject instanceof BTSImage) {
			return BTSConstants.BASIC_OBJECT_TYPES[2];
		} else if (corpusObject instanceof BTSListEntry) {
			return BTSConstants.BASIC_OBJECT_TYPES[3];
		} else if (corpusObject instanceof BTSText) {
			return BTSConstants.BASIC_OBJECT_TYPES[4];
		} else if (corpusObject instanceof BTSTextCorpus) {
			return BTSConstants.BASIC_OBJECT_TYPES[5];
		} else if (corpusObject instanceof BTSThsEntry) {
			return BTSConstants.BASIC_OBJECT_TYPES[6];
		}
		return null;
	}

	@Override
	public BTSConfigItem getRelationsConfigItem() {
		BTSConfiguration configuration = getActiveConfiguration();
		if (configuration != null && configuration.getChildren() != null) {
			for (BTSConfig c : configuration.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null
							&& ci.getValue().equals(BTSCoreConstants.RELATIONS)) {
						return ci;
					}
				}
			}
		}
		return null;
	}
}
