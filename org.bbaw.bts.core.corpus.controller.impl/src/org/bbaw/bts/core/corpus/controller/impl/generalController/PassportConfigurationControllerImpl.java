package org.bbaw.bts.core.corpus.controller.impl.generalController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.corpus.controller.generalController.PassportConfigurationController;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class PassportConfigurationControllerImpl implements
		PassportConfigurationController {

	@Inject
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;
	@Inject
	private BTSConfigurationService configService;

	@Override
	public List<BTSConfig> getFilteredChildren(BTSConfigItem configItem,
			BTSCorpusObject corpusObject) {
		List<BTSConfig> filteredChildren = new Vector<BTSConfig>();
		for (BTSConfig child : configItem.getChildren()) {
			if (child instanceof BTSConfigItem) {
				if (configService.objectTypesPathsContainsObjectype(
						((BTSConfigItem) child).getOwnerTypesMap(),
						corpusObject)) {
					filteredChildren.add(child);
				}
			}
		}
		return filteredChildren;
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
		return configService.getPassportCategories(corpusObject);
		
	}

	@Override
	public String[] getObjectSubtypes(BTSCorpusObject corpusObject)
	{
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public BTSConfigItem getObjectTypeConfigItemProcessedClones(
			BTSCorpusObject corpusObject) {
		if (corpusObject == null) return null;
		return configService.getObjectTypeConfigItemProcessedClones(corpusObject);
		
	}

	@Override
	public BTSConfigItem getObjectSubtypeConfigItemProcessedClones(
			BTSCorpusObject corpusObject) {
		return configService.getObjectSubtypeConfigItemProcessedClones(corpusObject);
		
	}

	@Override
	public BTSConfigItem getVisibilityConfigItemProcessedClones(
			BTSCorpusObject corpusObject) {
		return configService.getVisibilityConfigItemProcessedClones(corpusObject);
		
	}
	@Override
	public BTSConfigItem getReviewStateConfigItemProcessedClones(
			BTSCorpusObject corpusObject) {
		return configService.getReviewStateConfigItemProcessedClones(corpusObject);
		
	}

	@Override
	public BTSConfigItem getPathConfigItemProcessedClones(
			BTSConfigItem itemConfig, BTSCorpusObject corpusObject) {
		BTSConfig configuration = configService.getActiveConfiguration();
		BTSObjectTypeTreeNode rootpath = null;
		
		//FIXME update
//		if (itemConfig != null) {
//			rootpath = itemConfig.getPassportEditorConfig()
//				.getReferencedTypesPath();
//		}
		BTSConfigItem pathClonesList = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		configService.calculateChildrenRecurcively(rootpath, configuration, pathClonesList,
				corpusObject);

		return pathClonesList;
	}
	
	private String determineTypesPathByObject(BTSCorpusObject object) {
		String oClass = configService.findObjectClass(object);
		String oType = object.getType();
		String oSubtype = object.getSubtype();
		if (oType != null && !"".equals(oType.trim()))
		{
			oClass += BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType;
			if (oSubtype != null && !"".equals(oSubtype.trim()))
			{
				oClass += BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oSubtype;
						
			}		
		}
		return oClass;
	}

	
	
	
}
