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
 * Copyright (C) 2013-2015  Berlin-Brandenburg Academy
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
package org.bbaw.bts.btsviewmodel;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.DBLease;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage
 * @generated
 */
public interface BtsviewmodelFactory extends EFactory
{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	BtsviewmodelFactory eINSTANCE = org.bbaw.bts.btsviewmodel.impl.BtsviewmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tree Node Wrapper</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Tree Node Wrapper</em>'.
	 * @generated
	 */
	TreeNodeWrapper createTreeNodeWrapper();

	/**
	 * Returns a new object of class '<em>Status Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Message</em>'.
	 * @generated
	 */
	StatusMessage createStatusMessage();

	/**
	 * Returns a new object of class '<em>BTS Object Type Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Object Type Tree Node</em>'.
	 * @generated
	 */
	BTSObjectTypeTreeNode createBTSObjectTypeTreeNode();

	/**
	 * Returns a new object of class '<em>DB Collection Status Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Collection Status Information</em>'.
	 * @generated
	 */
	DBCollectionStatusInformation createDBCollectionStatusInformation();

	StatusMessage createFilteredMessage(int suppressed);
	
	StatusMessage createNotEditingRightsMessage();
	
	StatusMessage createInfoMessage();
	
	StatusMessage createRemoteDBConnnectionFailedMessage();
	
	StatusMessage createLockedMessage(DBLease lease, String userId);
	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtsviewmodelPackage getBtsviewmodelPackage();

	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	TreeNodeWrapper wrappObject(BTSObject object);
} //BtsviewmodelFactory
