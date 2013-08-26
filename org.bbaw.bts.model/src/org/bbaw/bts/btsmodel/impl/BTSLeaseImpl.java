/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Date;

import org.bbaw.bts.btsmodel.BTSLease;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Lease</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSLeaseImpl#getLeasingUserId <em>Leasing User Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSLeaseImpl#getLeaseTimeStamp <em>Lease Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSLeaseImpl extends MinimalEObjectImpl.Container implements BTSLease {
	/**
	 * The default value of the '{@link #getLeasingUserId() <em>Leasing User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeasingUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String LEASING_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeasingUserId() <em>Leasing User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeasingUserId()
	 * @generated
	 * @ordered
	 */
	protected String leasingUserId = LEASING_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaseTimeStamp() <em>Lease Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaseTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date LEASE_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaseTimeStamp() <em>Lease Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaseTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date leaseTimeStamp = LEASE_TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSLeaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_LEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeasingUserId() {
		return leasingUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeasingUserId(String newLeasingUserId) {
		String oldLeasingUserId = leasingUserId;
		leasingUserId = newLeasingUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_LEASE__LEASING_USER_ID, oldLeasingUserId, leasingUserId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLeaseTimeStamp() {
		return leaseTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaseTimeStamp(Date newLeaseTimeStamp) {
		Date oldLeaseTimeStamp = leaseTimeStamp;
		leaseTimeStamp = newLeaseTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_LEASE__LEASE_TIME_STAMP, oldLeaseTimeStamp, leaseTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case BtsmodelPackage.BTS_LEASE__LEASING_USER_ID:
				return getLeasingUserId();
			case BtsmodelPackage.BTS_LEASE__LEASE_TIME_STAMP:
				return getLeaseTimeStamp();
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_LEASE__LEASING_USER_ID:
				setLeasingUserId((String)newValue);
				return;
			case BtsmodelPackage.BTS_LEASE__LEASE_TIME_STAMP:
				setLeaseTimeStamp((Date)newValue);
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_LEASE__LEASING_USER_ID:
				setLeasingUserId(LEASING_USER_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_LEASE__LEASE_TIME_STAMP:
				setLeaseTimeStamp(LEASE_TIME_STAMP_EDEFAULT);
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_LEASE__LEASING_USER_ID:
				return LEASING_USER_ID_EDEFAULT == null ? leasingUserId != null : !LEASING_USER_ID_EDEFAULT.equals(leasingUserId);
			case BtsmodelPackage.BTS_LEASE__LEASE_TIME_STAMP:
				return LEASE_TIME_STAMP_EDEFAULT == null ? leaseTimeStamp != null : !LEASE_TIME_STAMP_EDEFAULT.equals(leaseTimeStamp);
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
		result.append(" (leasingUserId: ");
		result.append(leasingUserId);
		result.append(", leaseTimeStamp: ");
		result.append(leaseTimeStamp);
		result.append(')');
		return result.toString();
	}

} //BTSLeaseImpl
