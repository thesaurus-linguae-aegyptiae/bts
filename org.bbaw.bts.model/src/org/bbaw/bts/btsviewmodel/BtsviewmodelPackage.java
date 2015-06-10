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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface BtsviewmodelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "btsviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://btsviewmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "btsviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsviewmodelPackage eINSTANCE = org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl <em>Tree Node Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getTreeNodeWrapper()
	 * @generated
	 */
	int TREE_NODE_WRAPPER = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER__OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT = 3;

	/**
	 * The feature id for the '<em><b>Children Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER__CHILDREN_LOADED = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER__LABEL = 5;

	/**
	 * The feature id for the '<em><b>Parent Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER__PARENT_OBJECT = 6;

	/**
	 * The number of structural features of the '<em>Tree Node Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = 1;

	/**
	 * The number of operations of the '<em>Tree Node Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_WRAPPER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl <em>Status Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getStatusMessage()
	 * @generated
	 */
	int STATUS_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_MESSAGE__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_MESSAGE__CREATION_TIME = 1;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_MESSAGE__USER_ID = 2;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_MESSAGE__MESSAGE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_MESSAGE__CHILDREN = 4;

	/**
	 * The number of structural features of the '<em>Status Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_MESSAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Status Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsviewmodel.impl.BTSObjectTypeTreeNodeImpl <em>BTS Object Type Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsviewmodel.impl.BTSObjectTypeTreeNodeImpl
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getBTSObjectTypeTreeNode()
	 * @generated
	 */
	int BTS_OBJECT_TYPE_TREE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_TYPE_TREE_NODE__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Referenced Types Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_TYPE_TREE_NODE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_TYPE_TREE_NODE__SELECTED = 3;

	/**
	 * The number of structural features of the '<em>BTS Object Type Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_TYPE_TREE_NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>BTS Object Type Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_TYPE_TREE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl <em>DB Collection Status Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getDBCollectionStatusInformation()
	 * @generated
	 */
	int DB_COLLECTION_STATUS_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Db Collection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Db Doc Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Sync Status To Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE = 2;

	/**
	 * The feature id for the '<em><b>Sync Status From Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE = 3;

	/**
	 * The feature id for the '<em><b>Index Doc Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Index Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS = 5;

	/**
	 * The feature id for the '<em><b>Db Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE = 6;

	/**
	 * The feature id for the '<em><b>Db Doc Del Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Db Purge Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ = 8;

	/**
	 * The feature id for the '<em><b>Db Update Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ = 9;

	/**
	 * The feature id for the '<em><b>Index Update Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ = 10;

	/**
	 * The number of structural features of the '<em>DB Collection Status Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>DB Collection Status Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLLECTION_STATUS_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsviewmodel.MessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsviewmodel.MessageType
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 4;

	/**
	 * The meta object id for the '<em>BTS Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.BTSObject
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getBTSObject()
	 * @generated
	 */
	int BTS_OBJECT = 5;

	/**
	 * The meta object id for the '<em>Property Change Support</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeSupport
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getPropertyChangeSupport()
	 * @generated
	 */
	int PROPERTY_CHANGE_SUPPORT = 6;

	/**
	 * The meta object id for the '<em>Property Change Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeListener
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getPropertyChangeListener()
	 * @generated
	 */
	int PROPERTY_CHANGE_LISTENER = 7;

	/**
	 * The meta object id for the '<em>Property Change Event</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeEvent
	 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getPropertyChangeEvent()
	 * @generated
	 */
	int PROPERTY_CHANGE_EVENT = 8;


	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper <em>Tree Node Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Node Wrapper</em>'.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper
	 * @generated
	 */
	EClass getTreeNodeWrapper();

	/**
	 * Returns the meta object for the reference '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getParent()
	 * @see #getTreeNodeWrapper()
	 * @generated
	 */
	EReference getTreeNodeWrapper_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getChildren()
	 * @see #getTreeNodeWrapper()
	 * @generated
	 */
	EReference getTreeNodeWrapper_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getObject()
	 * @see #getTreeNodeWrapper()
	 * @generated
	 */
	EAttribute getTreeNodeWrapper_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getPropertyChangeSupport <em>Property Change Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Change Support</em>'.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getPropertyChangeSupport()
	 * @see #getTreeNodeWrapper()
	 * @generated
	 */
	EAttribute getTreeNodeWrapper_PropertyChangeSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#isChildrenLoaded <em>Children Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Children Loaded</em>'.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#isChildrenLoaded()
	 * @see #getTreeNodeWrapper()
	 * @generated
	 */
	EAttribute getTreeNodeWrapper_ChildrenLoaded();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getLabel()
	 * @see #getTreeNodeWrapper()
	 * @generated
	 */
	EAttribute getTreeNodeWrapper_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getParentObject <em>Parent Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Object</em>'.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getParentObject()
	 * @see #getTreeNodeWrapper()
	 * @generated
	 */
	EAttribute getTreeNodeWrapper_ParentObject();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#addPropertyChangeListener(java.beans.PropertyChangeListener) <em>Add Property Change Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Property Change Listener</em>' operation.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 * @generated
	 */
	EOperation getTreeNodeWrapper__AddPropertyChangeListener__PropertyChangeListener();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#removePropertyChangeListener(java.beans.PropertyChangeListener) <em>Remove Property Change Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Property Change Listener</em>' operation.
	 * @see org.bbaw.bts.btsviewmodel.TreeNodeWrapper#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 * @generated
	 */
	EOperation getTreeNodeWrapper__RemovePropertyChangeListener__PropertyChangeListener();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsviewmodel.StatusMessage <em>Status Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Message</em>'.
	 * @see org.bbaw.bts.btsviewmodel.StatusMessage
	 * @generated
	 */
	EClass getStatusMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.bbaw.bts.btsviewmodel.StatusMessage#getMessage()
	 * @see #getStatusMessage()
	 * @generated
	 */
	EAttribute getStatusMessage_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see org.bbaw.bts.btsviewmodel.StatusMessage#getCreationTime()
	 * @see #getStatusMessage()
	 * @generated
	 */
	EAttribute getStatusMessage_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.bbaw.bts.btsviewmodel.StatusMessage#getUserId()
	 * @see #getStatusMessage()
	 * @generated
	 */
	EAttribute getStatusMessage_UserId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.bbaw.bts.btsviewmodel.StatusMessage#getMessageType()
	 * @see #getStatusMessage()
	 * @generated
	 */
	EAttribute getStatusMessage_MessageType();

	/**
	 * Returns the meta object for the reference list '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.btsviewmodel.StatusMessage#getChildren()
	 * @see #getStatusMessage()
	 * @generated
	 */
	EReference getStatusMessage_Children();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode <em>BTS Object Type Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Object Type Tree Node</em>'.
	 * @see org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode
	 * @generated
	 */
	EClass getBTSObjectTypeTreeNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getChildren()
	 * @see #getBTSObjectTypeTreeNode()
	 * @generated
	 */
	EReference getBTSObjectTypeTreeNode_Children();

	/**
	 * Returns the meta object for the reference '{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getReferencedTypesPath <em>Referenced Types Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Types Path</em>'.
	 * @see org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getReferencedTypesPath()
	 * @see #getBTSObjectTypeTreeNode()
	 * @generated
	 */
	EReference getBTSObjectTypeTreeNode_ReferencedTypesPath();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getValue()
	 * @see #getBTSObjectTypeTreeNode()
	 * @generated
	 */
	EAttribute getBTSObjectTypeTreeNode_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#isSelected()
	 * @see #getBTSObjectTypeTreeNode()
	 * @generated
	 */
	EAttribute getBTSObjectTypeTreeNode_Selected();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation <em>DB Collection Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Collection Status Information</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation
	 * @generated
	 */
	EClass getDBCollectionStatusInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbCollectionName <em>Db Collection Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Collection Name</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbCollectionName()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_DbCollectionName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDocCount <em>Db Doc Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Doc Count</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDocCount()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_DbDocCount();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getSyncStatusToRemote <em>Sync Status To Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Status To Remote</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getSyncStatusToRemote()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_SyncStatusToRemote();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getSyncStatusFromRemote <em>Sync Status From Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Status From Remote</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getSyncStatusFromRemote()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_SyncStatusFromRemote();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexDocCount <em>Index Doc Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Doc Count</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexDocCount()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_IndexDocCount();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexStatus <em>Index Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Status</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexStatus()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_IndexStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDiskSize <em>Db Disk Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Disk Size</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDiskSize()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_DbDiskSize();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDocDelCount <em>Db Doc Del Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Doc Del Count</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDocDelCount()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_DbDocDelCount();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbPurgeSeq <em>Db Purge Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Purge Seq</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbPurgeSeq()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_DbPurgeSeq();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbUpdateSeq <em>Db Update Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Update Seq</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbUpdateSeq()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_DbUpdateSeq();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexUpdateSeq <em>Index Update Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Update Seq</em>'.
	 * @see org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexUpdateSeq()
	 * @see #getDBCollectionStatusInformation()
	 * @generated
	 */
	EAttribute getDBCollectionStatusInformation_IndexUpdateSeq();

	/**
	 * Returns the meta object for enum '{@link org.bbaw.bts.btsviewmodel.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see org.bbaw.bts.btsviewmodel.MessageType
	 * @generated
	 */
	EEnum getMessageType();

	/**
	 * Returns the meta object for data type '{@link org.bbaw.bts.btsmodel.BTSObject <em>BTS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BTS Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject
	 * @model instanceClass="org.bbaw.bts.btsmodel.BTSObject"
	 * @generated
	 */
	EDataType getBTSObject();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeSupport <em>Property Change Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Support</em>'.
	 * @see java.beans.PropertyChangeSupport
	 * @model instanceClass="java.beans.PropertyChangeSupport"
	 * @generated
	 */
	EDataType getPropertyChangeSupport();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeListener <em>Property Change Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Listener</em>'.
	 * @see java.beans.PropertyChangeListener
	 * @model instanceClass="java.beans.PropertyChangeListener"
	 * @generated
	 */
	EDataType getPropertyChangeListener();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeEvent <em>Property Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Event</em>'.
	 * @see java.beans.PropertyChangeEvent
	 * @model instanceClass="java.beans.PropertyChangeEvent"
	 * @generated
	 */
	EDataType getPropertyChangeEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BtsviewmodelFactory getBtsviewmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl <em>Tree Node Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getTreeNodeWrapper()
		 * @generated
		 */
		EClass TREE_NODE_WRAPPER = eINSTANCE.getTreeNodeWrapper();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE_WRAPPER__PARENT = eINSTANCE.getTreeNodeWrapper_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE_WRAPPER__CHILDREN = eINSTANCE.getTreeNodeWrapper_Children();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE_WRAPPER__OBJECT = eINSTANCE.getTreeNodeWrapper_Object();

		/**
		 * The meta object literal for the '<em><b>Property Change Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT = eINSTANCE.getTreeNodeWrapper_PropertyChangeSupport();

		/**
		 * The meta object literal for the '<em><b>Children Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE_WRAPPER__CHILDREN_LOADED = eINSTANCE.getTreeNodeWrapper_ChildrenLoaded();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE_WRAPPER__LABEL = eINSTANCE.getTreeNodeWrapper_Label();

		/**
		 * The meta object literal for the '<em><b>Parent Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE_WRAPPER__PARENT_OBJECT = eINSTANCE.getTreeNodeWrapper_ParentObject();

		/**
		 * The meta object literal for the '<em><b>Add Property Change Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TREE_NODE_WRAPPER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = eINSTANCE.getTreeNodeWrapper__AddPropertyChangeListener__PropertyChangeListener();

		/**
		 * The meta object literal for the '<em><b>Remove Property Change Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TREE_NODE_WRAPPER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = eINSTANCE.getTreeNodeWrapper__RemovePropertyChangeListener__PropertyChangeListener();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl <em>Status Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getStatusMessage()
		 * @generated
		 */
		EClass STATUS_MESSAGE = eINSTANCE.getStatusMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_MESSAGE__MESSAGE = eINSTANCE.getStatusMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_MESSAGE__CREATION_TIME = eINSTANCE.getStatusMessage_CreationTime();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_MESSAGE__USER_ID = eINSTANCE.getStatusMessage_UserId();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_MESSAGE__MESSAGE_TYPE = eINSTANCE.getStatusMessage_MessageType();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_MESSAGE__CHILDREN = eINSTANCE.getStatusMessage_Children();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsviewmodel.impl.BTSObjectTypeTreeNodeImpl <em>BTS Object Type Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsviewmodel.impl.BTSObjectTypeTreeNodeImpl
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getBTSObjectTypeTreeNode()
		 * @generated
		 */
		EClass BTS_OBJECT_TYPE_TREE_NODE = eINSTANCE.getBTSObjectTypeTreeNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_OBJECT_TYPE_TREE_NODE__CHILDREN = eINSTANCE.getBTSObjectTypeTreeNode_Children();

		/**
		 * The meta object literal for the '<em><b>Referenced Types Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH = eINSTANCE.getBTSObjectTypeTreeNode_ReferencedTypesPath();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT_TYPE_TREE_NODE__VALUE = eINSTANCE.getBTSObjectTypeTreeNode_Value();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT_TYPE_TREE_NODE__SELECTED = eINSTANCE.getBTSObjectTypeTreeNode_Selected();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl <em>DB Collection Status Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getDBCollectionStatusInformation()
		 * @generated
		 */
		EClass DB_COLLECTION_STATUS_INFORMATION = eINSTANCE.getDBCollectionStatusInformation();

		/**
		 * The meta object literal for the '<em><b>Db Collection Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME = eINSTANCE.getDBCollectionStatusInformation_DbCollectionName();

		/**
		 * The meta object literal for the '<em><b>Db Doc Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT = eINSTANCE.getDBCollectionStatusInformation_DbDocCount();

		/**
		 * The meta object literal for the '<em><b>Sync Status To Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE = eINSTANCE.getDBCollectionStatusInformation_SyncStatusToRemote();

		/**
		 * The meta object literal for the '<em><b>Sync Status From Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE = eINSTANCE.getDBCollectionStatusInformation_SyncStatusFromRemote();

		/**
		 * The meta object literal for the '<em><b>Index Doc Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT = eINSTANCE.getDBCollectionStatusInformation_IndexDocCount();

		/**
		 * The meta object literal for the '<em><b>Index Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS = eINSTANCE.getDBCollectionStatusInformation_IndexStatus();

		/**
		 * The meta object literal for the '<em><b>Db Disk Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE = eINSTANCE.getDBCollectionStatusInformation_DbDiskSize();

		/**
		 * The meta object literal for the '<em><b>Db Doc Del Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT = eINSTANCE.getDBCollectionStatusInformation_DbDocDelCount();

		/**
		 * The meta object literal for the '<em><b>Db Purge Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ = eINSTANCE.getDBCollectionStatusInformation_DbPurgeSeq();

		/**
		 * The meta object literal for the '<em><b>Db Update Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ = eINSTANCE.getDBCollectionStatusInformation_DbUpdateSeq();

		/**
		 * The meta object literal for the '<em><b>Index Update Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ = eINSTANCE.getDBCollectionStatusInformation_IndexUpdateSeq();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsviewmodel.MessageType <em>Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsviewmodel.MessageType
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getMessageType()
		 * @generated
		 */
		EEnum MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '<em>BTS Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.BTSObject
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getBTSObject()
		 * @generated
		 */
		EDataType BTS_OBJECT = eINSTANCE.getBTSObject();

		/**
		 * The meta object literal for the '<em>Property Change Support</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeSupport
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getPropertyChangeSupport()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_SUPPORT = eINSTANCE.getPropertyChangeSupport();

		/**
		 * The meta object literal for the '<em>Property Change Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeListener
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getPropertyChangeListener()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_LISTENER = eINSTANCE.getPropertyChangeListener();

		/**
		 * The meta object literal for the '<em>Property Change Event</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeEvent
		 * @see org.bbaw.bts.btsviewmodel.impl.BtsviewmodelPackageImpl#getPropertyChangeEvent()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_EVENT = eINSTANCE.getPropertyChangeEvent();

	}

} //BtsviewmodelPackage
