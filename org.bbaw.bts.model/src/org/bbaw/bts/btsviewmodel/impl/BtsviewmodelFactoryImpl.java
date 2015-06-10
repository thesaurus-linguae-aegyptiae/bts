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
package org.bbaw.bts.btsviewmodel.impl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Calendar;
import java.util.Date;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.btsviewmodel.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class BtsviewmodelFactoryImpl extends EFactoryImpl implements BtsviewmodelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static BtsviewmodelFactory init()
	{
		try {
			BtsviewmodelFactory theBtsviewmodelFactory = (BtsviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(BtsviewmodelPackage.eNS_URI);
			if (theBtsviewmodelFactory != null) {
				return theBtsviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtsviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public BtsviewmodelFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case BtsviewmodelPackage.TREE_NODE_WRAPPER: return createTreeNodeWrapper();
			case BtsviewmodelPackage.STATUS_MESSAGE: return createStatusMessage();
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE: return createBTSObjectTypeTreeNode();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION: return createDBCollectionStatusInformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			case BtsviewmodelPackage.MESSAGE_TYPE:
				return createMessageTypeFromString(eDataType, initialValue);
			case BtsviewmodelPackage.BTS_OBJECT:
				return createBTSObjectFromString(eDataType, initialValue);
			case BtsviewmodelPackage.PROPERTY_CHANGE_SUPPORT:
				return createPropertyChangeSupportFromString(eDataType, initialValue);
			case BtsviewmodelPackage.PROPERTY_CHANGE_LISTENER:
				return createPropertyChangeListenerFromString(eDataType, initialValue);
			case BtsviewmodelPackage.PROPERTY_CHANGE_EVENT:
				return createPropertyChangeEventFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			case BtsviewmodelPackage.MESSAGE_TYPE:
				return convertMessageTypeToString(eDataType, instanceValue);
			case BtsviewmodelPackage.BTS_OBJECT:
				return convertBTSObjectToString(eDataType, instanceValue);
			case BtsviewmodelPackage.PROPERTY_CHANGE_SUPPORT:
				return convertPropertyChangeSupportToString(eDataType, instanceValue);
			case BtsviewmodelPackage.PROPERTY_CHANGE_LISTENER:
				return convertPropertyChangeListenerToString(eDataType, instanceValue);
			case BtsviewmodelPackage.PROPERTY_CHANGE_EVENT:
				return convertPropertyChangeEventToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TreeNodeWrapper createTreeNodeWrapper()
	{
		TreeNodeWrapperImpl treeNodeWrapper = new TreeNodeWrapperImpl();
		return treeNodeWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusMessage createStatusMessage() {
		StatusMessageImpl statusMessage = new StatusMessageImpl();
		return statusMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObjectTypeTreeNode createBTSObjectTypeTreeNode() {
		BTSObjectTypeTreeNodeImpl btsObjectTypeTreeNode = new BTSObjectTypeTreeNodeImpl();
		return btsObjectTypeTreeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBCollectionStatusInformation createDBCollectionStatusInformation() {
		DBCollectionStatusInformationImpl dbCollectionStatusInformation = new DBCollectionStatusInformationImpl();
		return dbCollectionStatusInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageTypeFromString(EDataType eDataType, String initialValue) {
		MessageType result = MessageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObject createBTSObjectFromString(EDataType eDataType, String initialValue)
	{
		return (BTSObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBTSObjectToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeSupport createPropertyChangeSupportFromString(EDataType eDataType, String initialValue)
	{
		return (PropertyChangeSupport)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyChangeSupportToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeListener createPropertyChangeListenerFromString(EDataType eDataType, String initialValue)
	{
		return (PropertyChangeListener)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyChangeListenerToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeEvent createPropertyChangeEventFromString(EDataType eDataType, String initialValue)
	{
		return (PropertyChangeEvent)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyChangeEventToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BtsviewmodelPackage getBtsviewmodelPackage()
	{
		return (BtsviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BtsviewmodelPackage getPackage()
	{
		return BtsviewmodelPackage.eINSTANCE;
	}

	@Override
	public TreeNodeWrapper wrappObject(BTSObject object)
	{
		TreeNodeWrapper tn = createTreeNodeWrapper();
		tn.setObject(object);
		return tn;
	}

	public StatusMessage createFilteredMessage(int suppressed) {
		StatusMessage m = BtsviewmodelFactory.eINSTANCE.createStatusMessage();
		if (suppressed == 1)
		{
			m.setMessage(suppressed + " object is suppressed and not shown.");
		}
		else
		{
			m.setMessage(suppressed + " objects are suppressed and not shown.");
		}
		m.setMessageType(MessageType.FILTERED);
		m.setCreationTime(getTimeStamp());
		return m;
	}

	private static Date getTimeStamp() {
		return Calendar.getInstance().getTime();
	}

	public StatusMessage createNotEditingRightsMessage() {
		StatusMessage m = BtsviewmodelFactory.eINSTANCE.createStatusMessage();
		m.setMessage("You are not allowed to edit the selected object.");
		m.setMessageType(MessageType.NO_EDITING_RIGHTS);
		m.setCreationTime(getTimeStamp());
		return m;
	}

	public StatusMessage createLockedMessage(DBLease lease, String userId) {
		StatusMessage m = BtsviewmodelFactory.eINSTANCE.createStatusMessage();
		m.setMessage("Object is locked at " + lease.getTimeStamp().toString() + " by user: ");
		m.setUserId(userId);
		m.setMessageType(MessageType.LOCKED);
		m.setCreationTime(getTimeStamp());
		return m;
	}

	@Override
	public StatusMessage createInfoMessage() {
		StatusMessage m = BtsviewmodelFactory.eINSTANCE.createStatusMessage();
		m.setMessageType(MessageType.INFORMATION);
		m.setCreationTime(getTimeStamp());
		return m;
	}

	@Override
	public StatusMessage createRemoteDBConnnectionFailedMessage() {
		StatusMessage m = BtsviewmodelFactory.eINSTANCE.createStatusMessage();
		m.setMessageType(MessageType.ERROR);
		m.setMessage("Failed to connect to remote database. Please check internet connection and server availability.");
		m.setCreationTime(getTimeStamp());
		return m;
	}
} //BtsviewmodelFactoryImpl
