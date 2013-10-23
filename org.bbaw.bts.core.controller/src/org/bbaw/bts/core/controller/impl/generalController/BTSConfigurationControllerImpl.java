package org.bbaw.bts.core.controller.impl.generalController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import org.bbaw.bts.core.commons.BTSUIConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSConfigurationControllerImpl implements BTSConfigurationController
{

	private static String[] BASIC_OBJECT_TYPES = new String[] { "Annotation", "CorpusObject", "Image", "ListEntry",
			"Text", "TextCorpus" };
	@Inject
	private BTSConfigurationService configService;
	@Inject
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;

	public BTSConfigurationControllerImpl()
	{
		System.out.println("construct BTSConfigurationController");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController#listConfigurations()
	 */
	@Override
	public List<BTSConfiguration> listConfigurations()
	{
		return configService.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController#createNew()
	 */
	@Override
	public BTSConfiguration createNew()
	{
		BTSConfiguration config = configService.createNew();
		return config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController#save(org.bbaw.bts.btsmodel.BTSConfiguration)
	 */
	@Override
	public void save(BTSConfiguration config)
	{
		configService.save(config);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController#createNewConfigItem()
	 */
	@Override
	public BTSConfigItem createNewConfigItem(String label)
	{
		BTSConfigItem config = configService.createNewConfigItem();
		config.getLabel().setTranslation(label, lang);
		return config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController
	 * #getPassportCategories(org.bbaw.bts.btsmodel.BTSCorpusObject)
	 */
	@Override
	public List<BTSConfigItem> getPassportCategories(BTSCorpusObject corpusObject)
	{
		BTSConfigItem passportCI = configService.getActivePassportConfigItem();
		String objectType = findObjectType(corpusObject);
		String objectTypeType = null;
		String objectTypeSubtype = null;
		if (objectType != null && corpusObject.getType() != null && corpusObject.getType().trim().length() > 0)
		{
			objectTypeType = objectType + ">>" + corpusObject.getType();
			if (corpusObject.getSubtype() != null && corpusObject.getSubtype().trim().length() > 0)
			{
				objectTypeSubtype = objectTypeType + ">>" + corpusObject.getSubtype();
			}
		}
		List<BTSConfigItem> categories = new ArrayList<BTSConfigItem>();
		if (passportCI != null && passportCI.getChildren() != null)
		{
			for (BTSConfig c : passportCI.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem categoriesCI = (BTSConfigItem) c;
					if (categoriesCI.getValue() != null && categoriesCI.getValue().equals(BTSUIConstants.CATEGORIES)
							&& categoriesCI.getChildren() != null)
					{
						for (BTSConfig cc : categoriesCI.getChildren())
						{
							if (cc instanceof BTSConfigItem)
							{
								BTSConfigItem ci = (BTSConfigItem) cc;
								// FIXME logic verbessern, ist noch unscharf bei
								// type und subtype!!!
								if (ci.getOwnerType() != null
										&& (ci.getOwnerType().isEmpty() || ci.getOwnerType().contains(objectType)))
								{
									if (objectTypeType != null && ci.getOwnerType().contains(objectTypeType))
									{
										if (objectTypeSubtype != null && ci.getOwnerType().contains(objectTypeSubtype))
										{
											categories.add(ci);
										} else if (objectTypeSubtype == null)
										{
											categories.add(ci);
										}

									} else if (objectTypeType == null)
									{
										categories.add(ci);
									}
								}
							}
						}
						return categories;
					}
				}
			}
		}

		return categories;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController
	 * #getObjectTypes(org.bbaw.bts.btsmodel.BTSCorpusObject)
	 */
	@Override
	public List<BTSConfigItem> getObjectTypes(BTSCorpusObject corpusObject)
	{
		String objectType = findObjectType(corpusObject);
		BTSConfigItem typesCI = configService.getObjectTypesConfigItem();
		List<BTSConfigItem> types = new ArrayList<BTSConfigItem>();
		if (objectType != null && typesCI != null && typesCI.getChildren() != null)
		{
			for (BTSConfig c : typesCI.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null && ci.getValue().equals(objectType) && ci.getChildren() != null)
					{
						for (BTSConfig cc : ci.getChildren())
						{
							if (cc instanceof BTSConfigItem)
							{
								types.add((BTSConfigItem) cc);

							}
						}
						return types;
					}
				}
			}
		}

		return types;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController#getObjectTypes(java.lang.String)
	 */
	@Override
	public String[] getObjectTypes(String objectType)
	{
		BTSConfigItem typesCI = configService.getObjectTypesConfigItem();
		List<String> types = new ArrayList<String>();
		if (objectType != null && typesCI != null && typesCI.getChildren() != null)
		{
			for (BTSConfig c : typesCI.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null && ci.getValue().equals(objectType) && ci.getChildren() != null)
					{
						for (BTSConfig cc : ci.getChildren())
						{
							if (cc instanceof BTSConfigItem)
							{
								types.add(((BTSConfigItem) cc).getValue());

							}
						}
					}
				}
			}
		}
		Collections.sort(types);
		return types.toArray(new String[types.size()]);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController
	 * #findObjectType(org.bbaw.bts.btsmodel.BTSCorpusObject)
	 */
	@Override
	public String findObjectType(BTSCorpusObject corpusObject)
	{
		if (corpusObject instanceof BTSAnnotation)
		{
			return BASIC_OBJECT_TYPES[0];
		} else if (corpusObject instanceof BTSTCObject)
		{
			return BASIC_OBJECT_TYPES[1];
		} else if (corpusObject instanceof BTSImage)
		{
			return BASIC_OBJECT_TYPES[2];
		} else if (corpusObject instanceof BTSListEntry)
		{
			return BASIC_OBJECT_TYPES[3];
		} else if (corpusObject instanceof BTSText)
		{
			return BASIC_OBJECT_TYPES[4];
		} else if (corpusObject instanceof BTSTextCorpus)
		{
			return BASIC_OBJECT_TYPES[5];
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController
	 * #getObjectSubtypes(org.bbaw.bts.btsmodel.BTSCorpusObject)
	 */
	@Override
	public String[] getObjectSubtypes(BTSCorpusObject corpusObject)
	{
		// TODO Auto-generated method stub
		return null;
	}

	// FIXME move to Service

}
