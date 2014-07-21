package org.bbaw.bts.core.controller.impl.generalController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BTSConfigurationControllerImpl implements BTSConfigurationController
{
	private static final String default_admin_display_date_formate = "dd.MM.yyyy HH:mm:ss";

	@Inject
	private BTSConfigurationService configService;
	@Inject
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;

	@Inject
	@Preference(value = "admin_display_date_formate", nodePath = "org.bbaw.bts.app")
	private String admin_display_date_formate;

	@Inject
	private BTSResourceProvider resourceProvider;

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
		return configService.list(BTSConstants.OBJECT_STATE_ACTIVE);
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
		config.setValue(label);
		return config;
	}

	

	
	// /*
	// * (non-Javadoc)
	// *
	// * @see org.bbaw.bts.core.controller.impl.generalController.
	// * BTSConfigurationController
	// * #getObjectTypes(org.bbaw.bts.btsmodel.BTSCorpusObject)
	// */
	// @Override
	// public List<BTSConfigItem> getObjectTypes(BTSCorpusObject corpusObject)
	// {
	// BTSConfigItem typesCI = configService.getObjectTypesConfigItem();
	// List<BTSConfigItem> types = new ArrayList<BTSConfigItem>();
	// if (objectType != null && typesCI != null && typesCI.getChildren() !=
	// null)
	// {
	// for (BTSConfig c : typesCI.getChildren())
	// {
	// if (c instanceof BTSConfigItem)
	// {
	// BTSConfigItem ci = (BTSConfigItem) c;
	// if (ci.getValue() != null && ci.getValue().equals(objectType) &&
	// ci.getChildren() != null)
	// {
	// for (BTSConfig cc : ci.getChildren())
	// {
	// if (cc instanceof BTSConfigItem)
	// {
	// types.add((BTSConfigItem) cc);
	//
	// }
	// }
	// return types;
	// }
	// }
	// }
	// }
	//
	// return types;
	//
	// }


	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController
	 * #findObjectType(org.bbaw.bts.btsmodel.BTSCorpusObject)
	 */
	@Override
	public String findObjectClass(BTSObject object) {
		return configService.findObjectClass(object);
	}
	

	@Override
	public BTSConfigItem getObjectTypesConfigItem() {
		BTSConfigItem typesCI = configService.getObjectTypesConfigItem();
		return typesCI;

	}
	

	@Override
	public List<String> processTreePathToList(BTSObjectTypeTreeNode treePath) {
		List<String> result = new Vector<String>();
		if (treePath.isSelected()) // all owner selected
		{
			result.add(BTSConstants.OWNER_REFERENCED_TYPES_ANY + BTSConstants.OWNER_REFERENCED_TYPES_SEPERATOR + BTSConstants.OWNER_REFERENCED_TYPES_ANY);
		}
		else
		{
			for (BTSObjectTypeTreeNode child : treePath.getChildren())
			{
				processTreePathToListInternal(child, result);
				
			}
		}
		return result;
	}

	private void processTreePathToListInternal(BTSObjectTypeTreeNode node,
			List<String> result) {
		if (node.isSelected())
		{
			// determine path
			String path = determineTypesTreePath(node);
			// check referenced tree
			if (node.getReferencedTypesPath() != null)
			{
				// process refrenced tree to string
				String refs = processTreePathToStringInternal(node.getReferencedTypesPath());
				if (refs != null && !"".equals(refs))
				{
					path += BTSConstants.OWNER_REFERENCED_TYPES_SEPERATOR + refs;
				}
			}
			// combine and add to result list
			result.add(path);
		}
		else{
			for (BTSObjectTypeTreeNode child : node.getChildren())
			{
				processTreePathToListInternal(child, result);
				
			}
		}
	}

	private String determineTypesTreePath(BTSObjectTypeTreeNode node) {
		String path = "";
		if (node.eContainer() != null && node.eContainer() instanceof BTSObjectTypeTreeNode
				&& ((BTSObjectTypeTreeNode) node.eContainer()).getValue() != null)
		{
			path = determineTypesTreePath((BTSObjectTypeTreeNode) node.eContainer());
		}
		if (!"".equals(path.trim()))
		{
			path += BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + node.getValue(); 
		}
		else if (!"".equals(node.getValue()))
		{
			path = node.getValue();
		}
		return path;
	}

	private String processTreePathToStringInternal(
			BTSObjectTypeTreeNode referencedTypesPath) {
		if (referencedTypesPath.isSelected()) // all selected
		{
			return BTSConstants.OWNER_REFERENCED_TYPES_ANY;
		}
		List<String> list = new Vector<String>();
		for (BTSObjectTypeTreeNode child : referencedTypesPath.getChildren())
		{
			processTreePathToListInternal(child, list);
			
		}
		String result = "";
		for (String s : list)
		{
			result += s + BTSConstants.OWNER_REFERENCED_TYPES_LIST_SEPERATOR;
		}
		if (result.length() > 0)
		{
			return result.substring(0, result.length());
		}
		else
		{
			return null;
		}
	}

	@Override
	public BTSObjectTypeTreeNode processTreeSelectorInputPath(
			BTSConfig parentConfig, Map<String, List<String>> ownerTypesMap, boolean includingReferencedObjectTypes) {
		Assert.isNotNull(parentConfig);
		BTSObjectTypeTreeNode root = BtsviewmodelFactory.eINSTANCE.createBTSObjectTypeTreeNode();
		for (BTSConfig c : parentConfig.getChildren())
		{
			processChild(c, parentConfig, root, root, ownerTypesMap, includingReferencedObjectTypes, null, false);
		}
		return root;
	}

	private void processChild(BTSConfig node, BTSConfig parentConfig, BTSObjectTypeTreeNode input, BTSObjectTypeTreeNode root,
			Map<String, List<String>> ownerTypesMap, boolean includingReferencedObjectTypes, List<String> referencedTypesList, boolean parentSelected) {
		
		BTSObjectTypeTreeNode pathChild = BtsviewmodelFactory.eINSTANCE
				.createBTSObjectTypeTreeNode();
		pathChild.setValue(((BTSConfigItem) node).getValue());
		input.getChildren().add(pathChild);
		String pathChildPath = determineTypesTreePath(pathChild);

		if (parentSelected)
		{
			pathChild.setSelected(true);
		}
		else{
			if (ownerTypesMap != null)
			{
				if (ownerTypesMap.containsKey(BTSConstants.OWNER_REFERENCED_TYPES_ANY))
				{
					parentSelected = true;
					root.setSelected(true);
					pathChild.setSelected(true);
				}
				else if (ownerTypesMap.containsKey(pathChildPath))
				{
					pathChild.setSelected(true);
				}
				
			}
			else if (referencedTypesList != null)
			{
				if (referencedTypesList.contains(BTSConstants.OWNER_REFERENCED_TYPES_ANY))
				{
					parentSelected = true;
					root.setSelected(true);
					pathChild.setSelected(true);
				}
				else if (referencedTypesList.contains(pathChildPath))
				{
					pathChild.setSelected(true);
				}
			}
		}
		if (includingReferencedObjectTypes)
		{
			makeSubTree(pathChild, ownerTypesMap,
					parentConfig);
		}
		for (BTSConfig cc : node.getChildren()) {
			
			processChild(cc, parentConfig, pathChild, root, ownerTypesMap, includingReferencedObjectTypes, referencedTypesList, pathChild.isSelected());
		}

	}


	private void makeSubTree(BTSObjectTypeTreeNode pathChild,
			Map<String, List<String>> ownerTypesMap, BTSConfig parentConfig) {
		String pathChildPath = determineTypesTreePath(pathChild);
		List<String> refs = ownerTypesMap.get(pathChildPath);
		BTSObjectTypeTreeNode refRoot = BtsviewmodelFactory.eINSTANCE.createBTSObjectTypeTreeNode();
		pathChild.setReferencedTypesPath(refRoot);
		for (BTSConfig c : parentConfig.getChildren())
		{
			processChild(c, parentConfig, refRoot, refRoot, null, false, refs, false);
		}

		
	}

	

	

	@Override
	public String getIconStringOfObjectType(BTSObject object) {
		BTSConfigItem typeCI = configService.getConfigItemOfObjectType(object,
				false);
		if (typeCI == null || typeCI.getSubtype() == null || "".equals(typeCI.getSubtype())) {
			if (object.eClass().getName().startsWith("BTSAnnotation")) {
				return resourceProvider.IMG_ANNOTATION;
			} else if (object.eClass().getName().startsWith("BTSTCObject")) {
				return resourceProvider.IMG_TCOBJECT;
			} else if (object.eClass().getName().startsWith("BTSImage")) {
				return resourceProvider.IMG_IMAGE;
			} else if (object.eClass().getName().startsWith("BTSLemmaEntry")) {
				return resourceProvider.IMG_LEMMA;
			} else if (object.eClass().getName().startsWith("BTSTextCorpus")) {
				return resourceProvider.IMG_CORPUS;
			} else if (object.eClass().getName().startsWith("BTSText")) {
				return resourceProvider.IMG_TEXT;
			} else if (object.eClass().getName().startsWith("BTSThsEntry")) {
				return resourceProvider.IMG_THS;
			} else if (object.eClass().getName().startsWith("BTSComment")) {
				return resourceProvider.IMG_COMMENT;
			}
		}
		return typeCI.getSubtype();
	}

	@Override
	public String getDisplayPresentationOfDate(Date timeStamp) {
		if (timeStamp == null) {
			return "invalid or null date";
		}
		String date = null;
		if (admin_display_date_formate != null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(
						admin_display_date_formate);
				date = sdf.format(timeStamp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (date != null && !"".equals(date)) {
				return date;
			}
		} else {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(
						default_admin_display_date_formate);
				date = sdf.format(timeStamp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (date != null && !"".equals(date)) {
				return date;
			}
		}
		return timeStamp.toString();
	}

	

	
	
	
	@Override
	public BTSConfiguration getActiveConfiguration() {
		return configService.getActiveConfiguration();
	}

	@Override
	public BTSConfigItem getRelationsConfigItem() {
		BTSConfigItem typesCI = configService.getRelationsConfigItem();
		return typesCI;
	}

	@Override
	public BTSConfigItem getRelationPathConfigItemProcessedClones(
			BTSConfigItem itemConfig, BTSObject object) {
		BTSConfigItem config = configService.getRelationsConfigItem();
		BTSObjectTypeTreeNode rootpath = null;
		if (itemConfig != null) {
			//FIXME update
//			rootpath = itemConfig.getPassportEditorConfig()
//					.getReferencedTypesPath();
		}
		BTSConfigItem pathClonesList = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		configService.calculateChildrenReferncedObjectsRecurcively(rootpath, config,
				pathClonesList,
				object);

		return pathClonesList;
	}

	

	@Override
	public boolean objectMayReferenceToCorpus(BTSObject object,
			BTSConfigItem relationConfig) {
		return objectMayReferenceToElementName(object, relationConfig,
				BTSConstants.CORPUS_OBJECT, BTSConstants.TEXT_CORPUS, BTSConstants.TEXT);
		
	}

	private boolean objectMayReferenceToElementName(BTSObject object,
			BTSConfigItem relationConfig, String... elementNames) {
		

		Set<String> references = getReferenceTypesSet(object, relationConfig);
		
		if (references.isEmpty())
		{
			return false;
		}
		else if(references.contains(BTSConstants.OWNER_REFERENCED_TYPES_ANY))
		{
			return true; // no restriction
		}
		for (String s : references)
		{
			for (String n : elementNames)
			{
				if (s.startsWith(n))
				{
					return true;
				}
			}

		}
		return false;
	}

	public Set<String> getReferenceTypesSet(BTSObject object,
			BTSConfigItem relationConfig) {
		String oClass = findObjectClass(object);
		String oType = object.getType();
		String oSubtype = object.getSubtype();
		Set<String> references = new HashSet<String>();

		if (relationConfig.getOwnerTypesMap().containsKey(BTSConstants.OWNER_REFERENCED_TYPES_ANY))
		{
			Object o = relationConfig.getOwnerTypesMap().get(BTSConstants.OWNER_REFERENCED_TYPES_ANY);
			if (o == null)
			{
				references.add(BTSConstants.OWNER_REFERENCED_TYPES_ANY);
			}
			else
			{
				references.addAll((Collection<String>) o);
			}
			return references;
		}
		List<String> refs = relationConfig.getOwnerTypesMap().get(oClass);
		references.addAll(refs);
		if (oType != null && !"".equals(oType.trim()))
		{
			oClass += BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType;
			List<String> trefs = relationConfig.getOwnerTypesMap().get(oClass);
			if (trefs != null)
			{
				for (String t : trefs)
				{
					if (!references.contains(t))
					{
						references.add(t);
					}
				}
				if (oSubtype != null && !"".equals(oSubtype.trim()))
				{
					oClass += BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oSubtype;
					List<String> srefs = relationConfig.getOwnerTypesMap().get(oClass);
					if (srefs != null)
					{
						for (String sr : srefs)
						{
							if (!references.contains(sr))
							{
								references.add(sr);
							}
						}
					}
				}		
			}
			
		}
		return references;
	}

	

	@Override
	public boolean objectMayReferenceToThs(BTSObject object,
			BTSConfigItem relationConfig) {
		return objectMayReferenceToElementName(object, relationConfig, BTSConstants.THS_ENTRY);

	}

	@Override
	public boolean objectMayReferenceToWList(BTSObject object,
			BTSConfigItem relationConfig) {
		return objectMayReferenceToElementName(object, relationConfig, BTSConstants.WLIST_ENTRY);

	}



}
