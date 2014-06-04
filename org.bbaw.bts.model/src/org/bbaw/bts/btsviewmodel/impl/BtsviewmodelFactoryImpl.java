/**
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
		m.setMessage(suppressed + " number of objects not visible.");
		m.setMessageType(MessageType.FILTERED);
		m.setCreationTime(getTimeStamp());
		return m;
	}

	private static Date getTimeStamp() {
		return Calendar.getInstance().getTime();
	}

	public StatusMessage createNotEditingRightsMessage() {
		StatusMessage m = BtsviewmodelFactory.eINSTANCE.createStatusMessage();
		m.setMessage("No editing rights for selected object.");
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
} //BtsviewmodelFactoryImpl
