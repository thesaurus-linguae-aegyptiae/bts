/**
 */
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSLease;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTSDB Base Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getLease <em>Lease</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#get_rev <em>rev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSDBBaseObjectImpl extends BTSObservableObjectImpl implements BTSDBBaseObject
{

	/**
	 * The cached value of the '{@link #getLease() <em>Lease</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLease()
	 * @generated
	 * @ordered
	 */
	protected BTSLease lease;

	/**
	 * The default value of the '{@link #get_id() <em>id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_id() <em>id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected String _id = _ID_EDEFAULT;

	/**
	 * The default value of the '{@link #get_rev() <em>rev</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected static final String _REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_rev() <em>rev</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected String _rev = _REV_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSDBBaseObjectImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BtsmodelPackage.Literals.BTSDB_BASE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSLease getLease()
	{
		return lease;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLease(BTSLease newLease, NotificationChain msgs)
	{
		BTSLease oldLease = lease;
		lease = newLease;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE, oldLease, newLease);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLease(BTSLease newLease)
	{
		if (newLease != lease)
		{
			NotificationChain msgs = null;
			if (lease != null)
				msgs = ((InternalEObject)lease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE, null, msgs);
			if (newLease != null)
				msgs = ((InternalEObject)newLease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE, null, msgs);
			msgs = basicSetLease(newLease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE, newLease, newLease));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id()
	{
		return _id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id)
	{
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String get_rev()
	{
		return _rev;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void set_rev(String new_rev)
	{
		String old_rev = _rev;
		_rev = new_rev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__REV, old_rev, _rev));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE:
				return basicSetLease(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE:
				return getLease();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__ID:
				return get_id();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
				return get_rev();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE:
				setLease((BTSLease)newValue);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__ID:
				set_id((String)newValue);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
				set_rev((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE:
				setLease((BTSLease)null);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__ID:
				set_id(_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
				set_rev(_REV_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE:
				return lease != null;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
				return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (_id: ");
		result.append(_id);
		result.append(", _rev: ");
		result.append(_rev);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof BTSDBBaseObject)
		{
			BTSDBBaseObject o = (BTSDBBaseObject) obj;
			if (o.get_id() == null || this.get_id() == null)
			{
				return false;
			}
			return this.get_id().equals(o.get_id());
		}
		return false;
	}

} // BTSDBBaseObjectImpl
