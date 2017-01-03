/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.core.services;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;

/**
 * The Service Interface BTSConfigurationService provides service layer access to BTSConfiguration-objects.
 * 
 * Service-Implementations should incorporate as much as possible of business logic which 
 * does not depend on UI specific implementation and should be implemented in the controller layer
 * nor database specific logic which should be implemented in the dao layer.
 * 
 * Services should be implemented generically.
 */
public interface BTSConfigurationService extends GenericObjectService<BTSConfiguration, String>
{

	/**
	 * Creates the new config item.
	 *
	 * @return the BTS config item
	 */
	BTSConfigItem createNewConfigItem();

	/**
	 * Gets the active passport config item which contains configuration details 
	 * on the passport from the active configuration.
	 *
	 * @return the active passport config item
	 */
	BTSConfigItem getActivePassportConfigItem();

	/**
	 * Gets the active configuration.
	 *
	 * @return the active configuration
	 */
	BTSConfiguration getActiveConfiguration();

	/**
	 * Gets the object types config item.
	 *
	 * @return the object types config item
	 */
	BTSConfigItem getObjectTypesConfigItem();

	/**
	 * Gets the config item of object type.
	 *
	 * @param object the object
	 * @param strict the strict
	 * @return the config item of object type
	 */
	BTSConfigItem getConfigItemOfObjectType(BTSObject object,
			boolean strict);

	/**
	 * Find object class name as string of given object.
	 *
	 * @param object the object
	 * @return the string
	 */
	String findObjectClass(BTSObject object);

	/**
	 * Gets the relations config item which contains configuration detials on the relations.
	 *
	 * @return the relations config item
	 */
	BTSConfigItem getRelationsConfigItem();

	/**
	 * Object types paths contains objectype.
	 *
	 * @param ownerTypesMap the owner types map
	 * @param object the object
	 * @return true, if successful
	 */
	boolean objectTypesPathsContainsObjectype(
			Map<String, List<String>> ownerTypesMap,
			BTSObject object);

	/**
	 * Gets the visibility config item.
	 *
	 * @return the visibility config item
	 */
	BTSConfigItem getVisibilityConfigItem();

	/**
	 * Gets the review status config item.
	 *
	 * @return the review status config item
	 */
	BTSConfigItem getReviewStatusConfigItem();

	/**
	 * Gets the review state config item processed clones.
	 *
	 * @param corpusObject the corpus object
	 * @return the review state config item processed clones
	 */
	BTSConfigItem getReviewStateConfigItemProcessedClones(
			BTSObject corpusObject);

	/**
	 * Calculate children refernced objects recurcively.
	 *
	 * @param rootpath the rootpath
	 * @param config the config
	 * @param pathClonesList the path clones list
	 * @param object the object
	 */
	void calculateChildrenReferncedObjectsRecurcively(
			BTSObjectTypeTreeNode rootpath, BTSConfig config,
			BTSConfigItem pathClonesList, BTSObject object);
	
	/**
	 * Calculate children recurcively.
	 *
	 * @param rootpath the rootpath
	 * @param config the config
	 * @param pathClonesList the path clones list
	 * @param object the object
	 */
	void calculateChildrenRecurcively(BTSObjectTypeTreeNode rootpath,
			BTSConfig config, BTSConfigItem pathClonesList,
			BTSObject object);

	/**
	 * Gets the object type config item processed clones.
	 *
	 * @param object the object
	 * @return the object type config item processed clones
	 */
	BTSConfigItem getObjectTypeConfigItemProcessedClones(
			BTSObject object);
	
	/**
	 * Gets the object type config item processed clones.
	 * if type is null it returns all config items for type.
	 * if type is set it returns all config items for subtype.
	 *
	 * @param className of object
	 * @param type type string of object
	 * @param subtype subtype string of object
	 * @return the object type config item processed clones
	 */
	BTSConfigItem getObjectTypeConfigItemProcessedClones(
			String className, String type);

	/**
	 * Gets the visibility config item processed clones.
	 *
	 * @param object the object
	 * @return the visibility config item processed clones
	 */
	BTSConfigItem getVisibilityConfigItemProcessedClones(
			BTSObject object);

	/**
	 * Gets the object subtype config item processed clones.
	 *
	 * @param object the object
	 * @return the object subtype config item processed clones
	 */
	BTSConfigItem getObjectSubtypeConfigItemProcessedClones(
			BTSObject object);

	/**
	 * Gets the passport categories.
	 *
	 * @param object the object
	 * @return the passport categories
	 */
	List<BTSConfigItem> getPassportCategories(BTSObject object);

	BTSConfigItem getIdentifiersConfigItem();

	void setActiveConfiguration(BTSConfiguration configuration);

	BTSConfiguration createNew(BTSConfiguration originalconfiguration);

	String getLabelOfTypeSubtypeString(BTSObject object, boolean prefereAbbreviation);

	BTSConfigItem calculateReferencedConfigItemsProcessedClones(
			BTSConfigItem itemConfig, BTSConfig configuration,
			BTSObject object);

	List<String> getListOfReferencedObjectTypeSubtypesOfObject(
			BTSObject object, BTSConfigItem itemConfig);


}
