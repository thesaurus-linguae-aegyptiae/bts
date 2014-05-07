package org.bbaw.bts.core.controller.impl.generalController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import org.bbaw.bts.btsmodel.BTSObjectTypePath;
import org.bbaw.bts.btsmodel.BTSObjectTypePathRoot;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.ObjectTypePathEntry;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.di.extensions.Preference;
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
		return configService.list(BTSConstants.OBJECT_STATE_ACITVE);
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
		List<BTSConfigItem> categories = new ArrayList<BTSConfigItem>();
		if (passportCI != null && passportCI.getChildren() != null)
		{
			for (BTSConfig c : passportCI.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem categoriesCI = (BTSConfigItem) c;
					if (!categoriesCI.isIgnore()
							&& categoriesCI.getValue() != null
							&& categoriesCI.getValue().equals(
									BTSCoreConstants.CATEGORIES)
							&& categoriesCI.getChildren() != null)
					{
						for (BTSConfig cc : categoriesCI.getChildren())
						{
							if (cc instanceof BTSConfigItem)
							{
								BTSConfigItem ci = (BTSConfigItem) cc;
								if (!ci.isIgnore()
										&& objectTypesPathsContainsObjectype(
										ci.getOwnerTypesPath(), corpusObject))
								{
									categories.add(ci);
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

	private boolean objectTypesPathsContainsObjectype(
			BTSObjectTypePathRoot btsObjectTypePathRoot,
			BTSCorpusObject corpusObject) {
		if (corpusObject == null) {
			return false;
		}
		if (btsObjectTypePathRoot == null)
		{
			return true;
		}
		else
		{
			String oClass = findObjectClass(corpusObject);
			String oType = corpusObject.getType();
			String oSubtype = corpusObject.getSubtype();
			return objectTypesPathContainsObject(btsObjectTypePathRoot, oClass,
					oType, oSubtype, 2);

		}
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


	private boolean objectTypesPathContainsObject(
			BTSObjectTypePathRoot btsObjectTypePathRoot, String oClass,
			String oType, String oSubtype, int level) {
		for (ObjectTypePathEntry entry : btsObjectTypePathRoot.getChildren()) {
			if (oClass.equals(entry.getValue())) {
				// children
				if (entry.getChildren().isEmpty() || level == 0) {
					return true;
				} else {
					for (ObjectTypePathEntry child : entry.getChildren()) {
						if (oType == null
								&& BTSCoreConstants.OBJECT_TYPE_PATH_DEFAULT
										.equals(child.getValue())) {
							return true;
						} else if (oType != null
								&& oType.equals(child.getValue())) {
							// grandchildren
							if (child.getChildren().isEmpty() || level == 1) {
								return true;
							} else {
								for (ObjectTypePathEntry grandChild : child
										.getChildren()) {
									if (oSubtype == null
											&& BTSCoreConstants.OBJECT_TYPE_PATH_DEFAULT
													.equals(grandChild
															.getValue())) {
										return true;
									} else if (oSubtype != null
											&& oSubtype.equals(grandChild
													.getValue())) {
										return true;
									}
								}
								return false;
							}
						}
					}
					return false;
				}
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.generalController.
	 * BTSConfigurationController
	 * #findObjectType(org.bbaw.bts.btsmodel.BTSCorpusObject)
	 */
	@Override
	public String findObjectClass(BTSCorpusObject corpusObject) {
		return configService.findObjectClass(corpusObject);
	}
	@Override
	public String[] getObjectSubtypes(BTSCorpusObject corpusObject)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BTSConfigItem getObjectTypesConfigItem() {
		BTSConfigItem typesCI = configService.getObjectTypesConfigItem();
		return typesCI;

	}

	@Override
	public BTSObjectTypePath processTreeSelectorInputPath(
			BTSConfig parentConfig, BTSObjectTypePathRoot selectionPath) {
		Assert.isNotNull(parentConfig);
		Assert.isNotNull(selectionPath);
		BTSObjectTypePath root = BtsmodelFactory.eINSTANCE.createBTSObjectTypePathRoot();
		for (BTSConfig c : parentConfig.getChildren())
		{
			processChild(c, root, selectionPath);
		}
		return root;
	}

	private void processChild(BTSConfig node, BTSObjectTypePath input,
			BTSObjectTypePathRoot selectionPath) {
		ObjectTypePathEntry child = BtsmodelFactory.eINSTANCE
				.createObjectTypePathEntry();
		child.setValue(((BTSConfigItem) node).getValue());
		child.setSelected(objectTypesPathContainsObject(selectionPath,
				child.getValue(), null, null, 0));
		input.getChildren().add(child);
		for (BTSConfig cc : node.getChildren()) {
			processChild(cc, child, selectionPath);
		}

	}

	@Override
	public List<BTSConfig> getFilteredChildren(BTSConfigItem configItem,
			BTSCorpusObject corpusObject) {
		List<BTSConfig> filteredChildren = new Vector<BTSConfig>();
		for (BTSConfig child : configItem.getChildren()) {
			if (child instanceof BTSConfigItem) {
				if (objectTypesPathsContainsObjectype(
						((BTSConfigItem) child).getOwnerTypesPath(),
						corpusObject)) {
					filteredChildren.add(child);
				}
			}
		}
		return filteredChildren;
	}

	@Override
	public String getIconStringOfObjectType(BTSCorpusObject object) {
		BTSConfigItem typeCI = configService.getConfigItemOfObjectType(object,
				false);
		if (typeCI == null || typeCI.getSubtype() == null || "".equals(typeCI)) {
			if (object instanceof BTSAnnotation) {
				return resourceProvider.IMG_ANNOTATION;
			} else if (object instanceof BTSText) {
				return resourceProvider.IMG_TEXT;
			} else if (object instanceof BTSTextCorpus) {
				return resourceProvider.IMG_CORPUS;
			} else if (object instanceof BTSTCObject) {
				return resourceProvider.IMG_TCOBJECT;
			} else if (object instanceof BTSListEntry) {
				return resourceProvider.IMG_LEMMA;
			} else if (object instanceof BTSThsEntry) {
				return resourceProvider.IMG_THS;
			} else if (object instanceof BTSImage) {
				return resourceProvider.IMG_IMAGE;
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
	public BTSConfigItem getObjectTypeConfigItemProcessedClones(
			BTSCorpusObject corpusObject) {
		BTSConfigItem typesCI = getObjectTypesConfigItem();
		String className = findObjectClass(corpusObject);
		BTSConfigItem typeClone = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		boolean found = false;
		if (typesCI != null && typesCI.getChildren() != null) {
			for (BTSConfig c : typesCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem typeCI = (BTSConfigItem) c;
					if (!typeCI.isIgnore() && typeCI.getValue() != null
							&& typeCI.getValue().equals(className)) {
						for (BTSConfig cc : typeCI.getChildren()) {
							if (cc instanceof BTSConfigItem) {
								BTSConfigItem ci = (BTSConfigItem) cc;
								if (!ci.isIgnore()
) {
									typeClone.getChildren().add(
											EcoreUtil.copy(ci));
									if (corpusObject.getType() != null
											&& !"".equals(corpusObject
													.getType())
											&& ci.getValue() != null
											&& ci.getValue().equals(
													corpusObject.getType())) {
										found = true;
									}
								}
							}
						}
						if (!found && corpusObject.getType() != null
								&& !"".equals(corpusObject.getType())) {
							BTSConfigItem ci = BtsmodelFactory.eINSTANCE
									.createBTSConfigItem();
							ci.setLabel(BtsmodelFactory.eINSTANCE
									.createBTSTranslations());
							ci.getLabel().setTranslation(
									corpusObject.getType(), lang);
							ci.setValue(corpusObject.getType());
							typeClone.getChildren().add(ci);
						}
						return typeClone;
					}
				}
			}
		}

		return typeClone;
	}

	@Override
	public BTSConfigItem getObjectSubtypeConfigItemProcessedClones(
			BTSCorpusObject corpusObject) {
		BTSConfigItem typesCI = getObjectTypesConfigItem();
		String className = findObjectClass(corpusObject);
		BTSConfigItem subtypeClone = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		boolean found = false;
		if (typesCI != null && typesCI.getChildren() != null) {
			for (BTSConfig c : typesCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem typeCI = (BTSConfigItem) c;
					if (!typeCI.isIgnore() && typeCI.getValue() != null
							&& typeCI.getValue().equals(className)) {
						for (BTSConfig cc : typeCI.getChildren()) {
							if (cc instanceof BTSConfigItem) {
								BTSConfigItem ci = (BTSConfigItem) cc;
								if (!ci.isIgnore()
										&& ci.getValue() != null
										&& ci.getValue().equals(
												corpusObject.getType())) {
									for (BTSConfig ccc : ci.getChildren()) {
										if (cc instanceof BTSConfigItem) {
											BTSConfigItem cci = (BTSConfigItem) ccc;
											if (!cci.isIgnore()) {
												subtypeClone.getChildren().add(
														EcoreUtil
														.copy(cci));
												if (corpusObject.getSubtype() != null
														&& !"".equals(corpusObject
																.getSubtype())
														&& cci.getValue() != null
														&& cci.getValue()
																.equals(corpusObject
																		.getSubtype())) {
													found = true;
												}
											}
										}
									}
									if (!found
											&& corpusObject.getSubtype() != null
											&& !"".equals(corpusObject
													.getSubtype())) {
										BTSConfigItem cci = BtsmodelFactory.eINSTANCE
												.createBTSConfigItem();
										cci.setLabel(BtsmodelFactory.eINSTANCE
												.createBTSTranslations());

										cci.getLabel()
												.setTranslation(
														corpusObject
																.getSubtype(),
														lang);
										cci.setValue(corpusObject.getSubtype());
										subtypeClone.getChildren().add(cci);
									}
									BTSConfigItem ci2 = BtsmodelFactory.eINSTANCE
											.createBTSConfigItem();
									ci2.setLabel(BtsmodelFactory.eINSTANCE
											.createBTSTranslations());
									ci2.getLabel().setTranslation("", lang);
									ci2.setValue(null);
									subtypeClone.getChildren().add(ci2);
									return subtypeClone;
								}
							}
						}
					}

				}
			}
		}

		return subtypeClone;
	}

	@Override
	public BTSConfigItem getVisibilityConfigItemProcessedClones(
			BTSCorpusObject corpusObject) {
		BTSConfigItem visibilityCI = getVisibilityConfigItem();

		BTSConfigItem visibilityClone = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		if (corpusObject == null) {
			return visibilityClone;
		}
		boolean found = false;
		if (visibilityCI != null && visibilityCI.getChildren() != null) {
			for (BTSConfig c : visibilityCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem visCI = (BTSConfigItem) c;
					if (!visCI.isIgnore()
							&& objectTypesPathsContainsObjectype(
									visCI.getOwnerTypesPath(), corpusObject)
							&& visCI.getValue() != null) {
						visibilityClone.getChildren()
								.add(EcoreUtil.copy(visCI));
						if (corpusObject.getVisibility() != null
								&& !"".equals(corpusObject.getVisibility())
								&& visCI.getValue() != null
								&& visCI.getValue().equals(
										corpusObject.getVisibility())) {
							found = true;
						}

					}
				}
			}
			if (corpusObject != null && !found
					&& corpusObject.getVisibility() != null
					&& !"".equals(corpusObject.getVisibility())) {
				BTSConfigItem ci = BtsmodelFactory.eINSTANCE
						.createBTSConfigItem();
				ci.setLabel(BtsmodelFactory.eINSTANCE.createBTSTranslations());
				ci.getLabel()
						.setTranslation(corpusObject.getVisibility(), lang);
				ci.setValue(corpusObject.getVisibility());
				visibilityClone.getChildren().add(ci);
			}
			return visibilityClone;
		}

		return visibilityClone;
	}

	private BTSConfigItem getVisibilityConfigItem() {
		BTSConfiguration config = configService.getActiveConfiguration();
		for (BTSConfig c : config.getChildren()) {
			if (BTSCoreConstants.VISIBILITY_CONFIG.equals(((BTSConfigItem) c)
					.getValue())) {
				return (BTSConfigItem) c;
			}
		}
		return null;
	}

	@Override
	public BTSConfigItem getReviewStateConfigItemProcessedClones(
			BTSCorpusObject corpusObject) {
		BTSConfigItem reviewStatusCI = getReviewStatusConfigItem();
		BTSConfigItem reviewStatusClone = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		boolean found = false;
		if (reviewStatusCI != null && reviewStatusCI.getChildren() != null) {
			for (BTSConfig c : reviewStatusCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem visCI = (BTSConfigItem) c;
					if (!visCI.isIgnore()
							&& objectTypesPathsContainsObjectype(
									visCI.getOwnerTypesPath(), corpusObject)
							&& visCI.getValue() != null) {
						reviewStatusClone.getChildren().add(
								EcoreUtil.copy(visCI));
						if (corpusObject.getRevisionState() != null
								&& !"".equals(corpusObject.getRevisionState())
								&& visCI.getValue() != null
								&& visCI.getValue().equals(
										corpusObject.getRevisionState())) {
							found = true;
						}

					}
				}
			}
			if (corpusObject != null && !found
					&& corpusObject.getRevisionState() != null
					&& !"".equals(corpusObject.getRevisionState())) {
				BTSConfigItem ci = BtsmodelFactory.eINSTANCE
						.createBTSConfigItem();
				ci.setLabel(BtsmodelFactory.eINSTANCE.createBTSTranslations());
				ci.getLabel().setTranslation(corpusObject.getRevisionState(),
						lang);
				ci.setValue(corpusObject.getRevisionState());
				reviewStatusClone.getChildren().add(ci);
			}

			return reviewStatusClone;
		}

		return reviewStatusClone;
	}

	private BTSConfigItem getReviewStatusConfigItem() {
		BTSConfiguration config = configService.getActiveConfiguration();
		for (BTSConfig c : config.getChildren()) {
			if (BTSCoreConstants.REVIEW_STATUS_CONFIG
					.equals(((BTSConfigItem) c).getValue())) {
				return (BTSConfigItem) c;
			}
		}
		return null;
	}

	@Override
	public BTSConfigItem getPathConfigItemProcessedClones(
			BTSConfigItem itemConfig, BTSCorpusObject corpusObject) {
		BTSConfiguration configuration = configService.getActiveConfiguration();
		BTSObjectTypePathRoot rootpath = null;
		if (itemConfig != null) {
			rootpath = itemConfig.getPassportEditorConfig()
				.getReferencedTypesPath();
		}
		BTSConfigItem pathClonesList = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		calculateChildrenRecurcively(rootpath, configuration, pathClonesList,
				corpusObject);

		return pathClonesList;
	}

	private void calculateChildrenRecurcively(BTSObjectTypePath rootpath,
			BTSConfig config, BTSConfigItem pathClonesList,
			BTSCorpusObject corpusObject) {
		if (rootpath != null) {
		for (BTSObjectTypePath pathEntry : rootpath.getChildren()) {
			if (pathEntry instanceof ObjectTypePathEntry) {
				for (BTSConfig c : config.getChildren()) {
					if (c instanceof BTSConfigItem) {
						BTSConfigItem l1CI = (BTSConfigItem) c;
						if (!l1CI.isIgnore()
								&& l1CI.getValue() != null
								&& l1CI.getValue().equals(
										((ObjectTypePathEntry) pathEntry)
												.getValue())
								&& objectTypesPathsContainsObjectype(
										l1CI.getOwnerTypesPath(), corpusObject)) {
							int size = pathClonesList.getChildren().size();

							calculateChildrenRecurcively(pathEntry, l1CI,
									pathClonesList, corpusObject);
							if (pathClonesList.getChildren().size() == size) {
								// add this level if no children were added
								pathClonesList.getChildren().add(
										EcoreUtil.copy(l1CI));
							}

						}
					}
				}
			}
		}
		} else {
			for (BTSConfig c : config.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem l1CI = (BTSConfigItem) c;
					if (!l1CI.isIgnore()
							&& l1CI.getValue() != null
							&& objectTypesPathsContainsObjectype(
									l1CI.getOwnerTypesPath(), corpusObject)) {
						int size = pathClonesList.getChildren().size();

						calculateChildrenRecurcively(null, l1CI,
								pathClonesList, corpusObject);
						if (pathClonesList.getChildren().size() == size) {
							// add this level if no children were added
							pathClonesList.getChildren().add(
									EcoreUtil.copy(l1CI));
						}

					}
				}
			}
		}

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
			BTSConfigItem itemConfig, BTSCorpusObject corpusObject) {
		BTSConfigItem config = configService.getRelationsConfigItem();
		BTSObjectTypePathRoot rootpath = null;
		if (itemConfig != null) {
			rootpath = itemConfig.getPassportEditorConfig()
					.getReferencedTypesPath();
		}
		BTSConfigItem pathClonesList = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		calculateChildrenReferncedObjectsRecurcively(rootpath, config,
				pathClonesList,
				corpusObject);

		return pathClonesList;
	}

	private void calculateChildrenReferncedObjectsRecurcively(
			BTSObjectTypePath rootpath, BTSConfig config,
			BTSConfigItem pathClonesList, BTSCorpusObject corpusObject) {
		if (rootpath != null) {
			for (BTSObjectTypePath pathEntry : rootpath.getChildren()) {
				if (pathEntry instanceof ObjectTypePathEntry) {
					for (BTSConfig c : config.getChildren()) {
						if (c instanceof BTSConfigItem) {
							BTSConfigItem l1CI = (BTSConfigItem) c;
							if (!l1CI.isIgnore() && l1CI.getValue() != null
									// && l1CI.getValue().equals(
									// ((ObjectTypePathEntry) pathEntry)
									// .getValue())
									&& objectTypesPathsContainsObjectype(l1CI
											.getPassportEditorConfig()
											.getReferencedTypesPath(),
											corpusObject)) {
								int size = pathClonesList.getChildren().size();

								calculateChildrenReferncedObjectsRecurcively(
										pathEntry, l1CI, pathClonesList,
										corpusObject);
								if (pathClonesList.getChildren().size() == size) {
									// add this level if no children were added
									pathClonesList.getChildren().add(
											EcoreUtil.copy(l1CI));
								}

							}
						}
					}
					break;
				}
			}
		} else {
			for (BTSConfig c : config.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem l1CI = (BTSConfigItem) c;
					if (!l1CI.isIgnore()
							&& l1CI.getValue() != null
							&& objectTypesPathsContainsObjectype(
									l1CI.getOwnerTypesPath(), corpusObject)) {
						int size = pathClonesList.getChildren().size();

						calculateChildrenRecurcively(null, l1CI,
								pathClonesList, corpusObject);
						if (pathClonesList.getChildren().size() == size) {
							// add this level if no children were added
							pathClonesList.getChildren().add(
									EcoreUtil.copy(l1CI));
						}

					}
				}
			}
		}

	}
	// FIXME move to Service

}
