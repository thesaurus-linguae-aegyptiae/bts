package org.bbaw.bts.core.services;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSCorpusObject;

public interface BTSConfigurationService extends GenericObjectService<BTSConfiguration, String>
{
	static String[] BASIC_OBJECT_TYPES = new String[] { "Annotation",
			"CorpusObject", "Image", "ListEntry", "Text", "TextCorpus" };
	BTSConfigItem createNewConfigItem();

	BTSConfigItem getActivePassportConfigItem();

	BTSConfiguration getActiveConfiguration();

	BTSConfigItem getObjectTypesConfigItem();

	BTSConfigItem getConfigItemOfObjectType(BTSCorpusObject object,
			boolean strict);

	String findObjectClass(BTSCorpusObject corpusObject);

}
