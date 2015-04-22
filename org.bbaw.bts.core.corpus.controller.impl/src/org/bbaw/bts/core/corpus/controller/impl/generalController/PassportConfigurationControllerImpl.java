package org.bbaw.bts.core.corpus.controller.impl.generalController;

import java.util.ArrayList;
import java.util.Collections;
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
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.comparator.BTSConfigSortKeyLabelSorter;
import org.bbaw.bts.core.corpus.controller.generalController.PassportConfigurationController;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.ui.commons.filter.BTSObjectTypeSubtypeViewerFilter;
import org.eclipse.core.runtime.Assert;
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
		Collections.sort(filteredChildren, new BTSConfigSortKeyLabelSorter(lang));
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
		List<BTSConfigItem> categories = configService.getPassportCategories(corpusObject); 
		Collections.sort(categories, new BTSConfigSortKeyLabelSorter(lang));
		return categories;
		
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
		BTSObjectTypeTreeNode rootpath = null; //BtsviewmodelFactory.eINSTANCE.createBTSObjectTypeTreeNode();
		
		BTSConfigItem pathClonesList = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		// list BTSObjectTypeTreeNodes that match given BTSCorpusObject
		pathClonesList = configService.calculateReferencedConfigItemsProcessedClones(itemConfig, configuration, corpusObject);
//		pathClonesList
//		// for these BTSObjectTypeTreeNodes, walk there referenceObjects, retrieve referenced BTSConfigItem and add it to children of rootpath
//		configService.calculateChildrenReferncedObjectsRecurcively(rootpath, configuration, pathClonesList, corpusObject);
//		
//		//FIXME update
////		if (itemConfig != null) {
////			rootpath = itemConfig.getPassportEditorConfig()
////				.getReferencedTypesPath();
////		}
//
//		configService.calculateChildrenRecurcively(rootpath, configuration, pathClonesList,
//				corpusObject);

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

	@Override
	public BTSObjectTypeSubtypeViewerFilter createObjectTypeSubtypeFilterByReferencedPath(
			BTSCorpusObject corpusObject, BTSConfigItem itemConfig) {
		BTSObjectTypeSubtypeViewerFilter filter = new BTSObjectTypeSubtypeViewerFilter();
		List<String> strings = 	configService.getListOfReferencedObjectTypeSubtypesOfObject(corpusObject, itemConfig);
		List<Object> obj = new Vector<Object>(strings.size());
		obj.addAll(strings);
		filter.setObjects(obj);
		return filter;
	}

	@Override
	public int checkPassportCompleteness(BTSCorpusObject corpusObject) {
		int requiredCounter = 0;
		int completenessCounter = 0;
		List<BTSConfigItem> categories = getPassportCategories(corpusObject);
		for (BTSConfigItem category : categories)
		{
			BTSPassportEntry group = findMatchingEntryGroup(corpusObject.getPassport(), category);
			int[] result = checkPassportCompletenssGroup(group, category, corpusObject);
			
		}
		return 0;
	}

	private int[] checkPassportCompletenssGroup(BTSPassportEntry group,
			BTSConfigItem category, BTSCorpusObject corpusObject) {
		int requiredCounter = 0;
		int completenessCounter = 0;
		List<BTSConfig> filteredChildren = getFilteredChildren(category, corpusObject);
		for (BTSConfig child : filteredChildren) {
			if (child instanceof BTSConfigItem
					&& !((BTSConfigItem) child).isIgnore()) 
			{
				BTSConfigItem childConfig = (BTSConfigItem) child;
				if (BTSCoreConstants.PASSPORT_ENTRY_GROUP.equals(childConfig
						.getType())) {

					List<BTSPassportEntry> childEntryGroups = findMatchingEntries(
							group, childConfig, null, corpusObject.getPassport(),
							BTSCoreConstants.PASSPORT_ENTRY_GROUP);
				} else if (BTSCoreConstants.PASSPORT_ENTRY_ITEM
						.equals(childConfig.getType())) {
					List<BTSPassportEntry> childEntryGroups = findMatchingEntries(
							group, childConfig, null, corpusObject.getPassport(),
							BTSCoreConstants.PASSPORT_ENTRY_ITEM);
				}
				if (group != null)
				{
					
				}
			}
		}
		
		return null;
	}
	
	protected List<BTSPassportEntry> findMatchingEntries(
			BTSPassportEntry parentEntryGroup, BTSConfigItem groupConfig,
			BTSPassportEntry grandParentEntry, BTSPassport passport, String entryType) {
		Assert.isNotNull(parentEntryGroup);
		Assert.isNotNull(groupConfig);

		List<BTSPassportEntry> entries = new Vector<BTSPassportEntry>();
		for (BTSPassportEntry group : parentEntryGroup.getChildren()) {
			if (group.getType() != null
					&& group.getType().equals(groupConfig.getValue())) {
				entries.add(group);
			}
		}
		return entries;
	}

	@Override
	public BTSPassportEntry findMatchingEntryGroup(BTSPassport passport,
			BTSConfigItem category) {
		Assert.isNotNull(passport);
		Assert.isNotNull(category);

		for (BTSPassportEntry group : passport.getChildren()) {
			if (!category.isIgnore() && group.getType() != null
					&& group.getType().equals(category.getValue())) {
				return group;
			}
		}
		BTSPassportEntryGroup defaultInput = BtsCorpusModelFactory.eINSTANCE
				.createBTSPassportEntryGroup();
		defaultInput.setType(category.getValue());
		passport.getChildren().add(defaultInput);
		return defaultInput;
	}

	
	
	
}
