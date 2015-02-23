/**
 */
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.BTSIDReservationObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTSID Reservation Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSIDReservationObjectImpl#getBtsUUID <em>Bts UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSIDReservationObjectImpl extends BTSDBBaseObjectImpl implements BTSIDReservationObject {
	/**
	 * The default value of the '{@link #getBtsUUID() <em>Bts UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtsUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String BTS_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtsUUID() <em>Bts UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtsUUID()
	 * @generated
	 * @ordered
	 */
	protected String btsUUID = BTS_UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSIDReservationObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTSID_RESERVATION_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtsUUID() {
		return btsUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtsUUID(String newBtsUUID) {
		String oldBtsUUID = btsUUID;
		btsUUID = newBtsUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSID_RESERVATION_OBJECT__BTS_UUID, oldBtsUUID, btsUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsmodelPackage.BTSID_RESERVATION_OBJECT__BTS_UUID:
				return getBtsUUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtsmodelPackage.BTSID_RESERVATION_OBJECT__BTS_UUID:
				setBtsUUID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BtsmodelPackage.BTSID_RESERVATION_OBJECT__BTS_UUID:
				setBtsUUID(BTS_UUID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BtsmodelPackage.BTSID_RESERVATION_OBJECT__BTS_UUID:
				return BTS_UUID_EDEFAULT == null ? btsUUID != null : !BTS_UUID_EDEFAULT.equals(btsUUID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (btsUUID: ");
		result.append(btsUUID);
		result.append(')');
		return result.toString();
	}

} //BTSIDReservationObjectImpl
