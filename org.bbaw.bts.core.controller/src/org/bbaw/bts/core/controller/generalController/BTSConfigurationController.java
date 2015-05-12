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
package org.bbaw.bts.core.controller.generalController;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.eclipse.core.runtime.IProgressMonitor;

/** The ConfigurationController manages all view access to configuration modells.
 * @author Christoph Plutte
 *
 */
public interface BTSConfigurationController
{

	/** Lists all available configurations.
	 * @return list of configurations.
	 */
	List<BTSConfiguration> listConfigurations(IProgressMonitor monitor);

	/** creates a new Configuration.
	 * @return new configuration.
	 */
	BTSConfiguration createNew();

	/** Saves configuration wether new or modified and sets necessary revision statements.
	 * @param config configurtion to be saved.
	 */
	void save(BTSConfiguration config);

	/** Creates new ConfigItem.
	 * @param label label of new configitem
	 * @return new configitem
	 */
	BTSConfigItem createNewConfigItem(String label);

	/** Transforms a given timestamp into its string representation according to the date formating.
	 * @param timeStamp to be displayed.
	 * @return string representation of timestamp
	 */
	String getDisplayPresentationOfDate(Date timeStamp);

	// List<BTSConfigItem> getObjectTypes(BTSCorpusObject corpusObject);

	/** Checks in the currently active configuration for the configitem which defines the object types.
	 * @return configitem defining object types
	 */
	BTSConfigItem getObjectTypesConfigItem();


	BTSObjectTypeTreeNode processTreeSelectorInputPath(
BTSConfig parentConfig, BTSConfig parentConfigReferenced, 
Map<String, List<String>> ownerTypesMap, boolean includingReferencedObjectTypes);

	
	/** Gets the active configuration.
	 * @return active configuration
	 */
	BTSConfiguration getActiveConfiguration();

	/** Checks in the currently active configuration for the configitem which defines the relations.
	 * @return configitem defining relations between objects
	 */
	BTSConfigItem getRelationsConfigItem();

	BTSConfigItem getRelationPathConfigItemProcessedClones(
			BTSConfigItem itemConfig2, BTSObject object);

	List<String> processTreePathToList(
			BTSObjectTypeTreeNode treePath);

	/** Checks whether object may reference to corpus.
	 * @param selectionObject
	 * @param relationConfig
	 * @return
	 */
	boolean objectMayReferenceToCorpus(BTSObject selectionObject,
			BTSConfigItem relationConfig);

	/** Checks whether object may reference to Thesaurus.
	 * @param selectionObject
	 * @param relationConfig
	 * @return
	 */
	boolean objectMayReferenceToThs(BTSObject selectionObject,
			BTSConfigItem relationConfig);

	/** Checks whether object may reference to WordList.
	 * @param selectionObject
	 * @param relationConfig
	 * @return
	 */
	boolean objectMayReferenceToWList(BTSObject selectionObject,
			BTSConfigItem relationConfig);
	
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
	
	Set<String> getReferenceTypesSet(BTSObject object,
			BTSConfigItem relationConfig);

	/** Gets the String representation of the object class.
	 * @param object
	 * @return
	 */
	String findObjectClass(BTSObject object);
	
	/** Gets the icon string representation of the icon for the given object according to the currently active configuration.
	 * @param object
	 * @return
	 */
	String getIconStringOfObjectType(BTSObject object);

	BTSConfigItem getReviewStatusConfigItem();

	BTSConfigItem getVisibilityConfigItem();

	BTSConfigItem getIdentifiersProviderConfigItemProcessedClones(
			BTSConfigItem itemConfig2, BTSObject corpusObject);

	BTSConfig getIdentifiersConfigItem();

	String getIconStringOfRevisionsState(BTSObject object);

	void setActiveConfiguration(BTSConfiguration configuration);

	BTSConfiguration createNew(BTSConfiguration originalconfiguration);

	String getLabelOfTypeSubtypeString(BTSObject object, boolean prefereAbbreviation);


}