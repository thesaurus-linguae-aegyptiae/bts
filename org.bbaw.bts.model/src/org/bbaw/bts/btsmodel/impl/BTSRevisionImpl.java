/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Date;

import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl#isRightsRevoked <em>Rights Revoked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSRevisionImpl extends MinimalEObjectImpl.Container implements BTSRevision {
	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final int REF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected int ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected String userId = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isRightsRevoked() <em>Rights Revoked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightsRevoked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIGHTS_REVOKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRightsRevoked() <em>Rights Revoked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightsRevoked()
	 * @generated
	 * @ordered
	 */
	protected boolean rightsRevoked = RIGHTS_REVOKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(int newRef) {
		int oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_REVISION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(String newUserId) {
		String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_REVISION__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_REVISION__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRightsRevoked()
	{
		return rightsRevoked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightsRevoked(boolean newRightsRevoked)
	{
		boolean oldRightsRevoked = rightsRevoked;
		rightsRevoked = newRightsRevoked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_REVISION__RIGHTS_REVOKED, oldRightsRevoked, rightsRevoked));
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
			case BtsmodelPackage.BTS_REVISION__REF:
				return getRef();
			case BtsmodelPackage.BTS_REVISION__USER_ID:
				return getUserId();
			case BtsmodelPackage.BTS_REVISION__TIME_STAMP:
				return getTimeStamp();
			case BtsmodelPackage.BTS_REVISION__RIGHTS_REVOKED:
				return isRightsRevoked();
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
			case BtsmodelPackage.BTS_REVISION__REF:
				setRef((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_REVISION__USER_ID:
				setUserId((String)newValue);
				return;
			case BtsmodelPackage.BTS_REVISION__TIME_STAMP:
				setTimeStamp((Date)newValue);
				return;
			case BtsmodelPackage.BTS_REVISION__RIGHTS_REVOKED:
				setRightsRevoked((Boolean)newValue);
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
			case BtsmodelPackage.BTS_REVISION__REF:
				setRef(REF_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_REVISION__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_REVISION__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_REVISION__RIGHTS_REVOKED:
				setRightsRevoked(RIGHTS_REVOKED_EDEFAULT);
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
			case BtsmodelPackage.BTS_REVISION__REF:
				return ref != REF_EDEFAULT;
			case BtsmodelPackage.BTS_REVISION__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case BtsmodelPackage.BTS_REVISION__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case BtsmodelPackage.BTS_REVISION__RIGHTS_REVOKED:
				return rightsRevoked != RIGHTS_REVOKED_EDEFAULT;
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
		result.append(" (ref: ");
		result.append(ref);
		result.append(", userId: ");
		result.append(userId);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", rightsRevoked: ");
		result.append(rightsRevoked);
		result.append(')');
		return result.toString();
	}

} //BTSRevisionImpl
