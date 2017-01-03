/**
 */
package Btsaux.impl;

import Btsaux.BtsauxPackage;
import Btsaux.BwllinkType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bwllink Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Btsaux.impl.BwllinkTypeImpl#getLclass <em>Lclass</em>}</li>
 *   <li>{@link Btsaux.impl.BwllinkTypeImpl#getLcomment <em>Lcomment</em>}</li>
 *   <li>{@link Btsaux.impl.BwllinkTypeImpl#getLkey <em>Lkey</em>}</li>
 *   <li>{@link Btsaux.impl.BwllinkTypeImpl#getLtype <em>Ltype</em>}</li>
 *   <li>{@link Btsaux.impl.BwllinkTypeImpl#getWcn <em>Wcn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BwllinkTypeImpl extends MinimalEObjectImpl.Container implements BwllinkType {
	/**
	 * The default value of the '{@link #getLclass() <em>Lclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLclass()
	 * @generated
	 * @ordered
	 */
	protected static final Object LCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLclass() <em>Lclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLclass()
	 * @generated
	 * @ordered
	 */
	protected Object lclass = LCLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLcomment() <em>Lcomment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcomment()
	 * @generated
	 * @ordered
	 */
	protected static final Object LCOMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLcomment() <em>Lcomment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcomment()
	 * @generated
	 * @ordered
	 */
	protected Object lcomment = LCOMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLkey() <em>Lkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLkey()
	 * @generated
	 * @ordered
	 */
	protected static final String LKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLkey() <em>Lkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLkey()
	 * @generated
	 * @ordered
	 */
	protected String lkey = LKEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLtype() <em>Ltype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtype()
	 * @generated
	 * @ordered
	 */
	protected static final Object LTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLtype() <em>Ltype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtype()
	 * @generated
	 * @ordered
	 */
	protected Object ltype = LTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWcn() <em>Wcn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcn()
	 * @generated
	 * @ordered
	 */
	protected static final String WCN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWcn() <em>Wcn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcn()
	 * @generated
	 * @ordered
	 */
	protected String wcn = WCN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BwllinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsauxPackage.Literals.BWLLINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLclass() {
		return lclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLclass(Object newLclass) {
		Object oldLclass = lclass;
		lclass = newLclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.BWLLINK_TYPE__LCLASS, oldLclass, lclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLcomment() {
		return lcomment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLcomment(Object newLcomment) {
		Object oldLcomment = lcomment;
		lcomment = newLcomment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.BWLLINK_TYPE__LCOMMENT, oldLcomment, lcomment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLkey() {
		return lkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLkey(String newLkey) {
		String oldLkey = lkey;
		lkey = newLkey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.BWLLINK_TYPE__LKEY, oldLkey, lkey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLtype() {
		return ltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLtype(Object newLtype) {
		Object oldLtype = ltype;
		ltype = newLtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.BWLLINK_TYPE__LTYPE, oldLtype, ltype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWcn() {
		return wcn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWcn(String newWcn) {
		String oldWcn = wcn;
		wcn = newWcn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.BWLLINK_TYPE__WCN, oldWcn, wcn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsauxPackage.BWLLINK_TYPE__LCLASS:
				return getLclass();
			case BtsauxPackage.BWLLINK_TYPE__LCOMMENT:
				return getLcomment();
			case BtsauxPackage.BWLLINK_TYPE__LKEY:
				return getLkey();
			case BtsauxPackage.BWLLINK_TYPE__LTYPE:
				return getLtype();
			case BtsauxPackage.BWLLINK_TYPE__WCN:
				return getWcn();
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
			case BtsauxPackage.BWLLINK_TYPE__LCLASS:
				setLclass(newValue);
				return;
			case BtsauxPackage.BWLLINK_TYPE__LCOMMENT:
				setLcomment(newValue);
				return;
			case BtsauxPackage.BWLLINK_TYPE__LKEY:
				setLkey((String)newValue);
				return;
			case BtsauxPackage.BWLLINK_TYPE__LTYPE:
				setLtype(newValue);
				return;
			case BtsauxPackage.BWLLINK_TYPE__WCN:
				setWcn((String)newValue);
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
			case BtsauxPackage.BWLLINK_TYPE__LCLASS:
				setLclass(LCLASS_EDEFAULT);
				return;
			case BtsauxPackage.BWLLINK_TYPE__LCOMMENT:
				setLcomment(LCOMMENT_EDEFAULT);
				return;
			case BtsauxPackage.BWLLINK_TYPE__LKEY:
				setLkey(LKEY_EDEFAULT);
				return;
			case BtsauxPackage.BWLLINK_TYPE__LTYPE:
				setLtype(LTYPE_EDEFAULT);
				return;
			case BtsauxPackage.BWLLINK_TYPE__WCN:
				setWcn(WCN_EDEFAULT);
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
			case BtsauxPackage.BWLLINK_TYPE__LCLASS:
				return LCLASS_EDEFAULT == null ? lclass != null : !LCLASS_EDEFAULT.equals(lclass);
			case BtsauxPackage.BWLLINK_TYPE__LCOMMENT:
				return LCOMMENT_EDEFAULT == null ? lcomment != null : !LCOMMENT_EDEFAULT.equals(lcomment);
			case BtsauxPackage.BWLLINK_TYPE__LKEY:
				return LKEY_EDEFAULT == null ? lkey != null : !LKEY_EDEFAULT.equals(lkey);
			case BtsauxPackage.BWLLINK_TYPE__LTYPE:
				return LTYPE_EDEFAULT == null ? ltype != null : !LTYPE_EDEFAULT.equals(ltype);
			case BtsauxPackage.BWLLINK_TYPE__WCN:
				return WCN_EDEFAULT == null ? wcn != null : !WCN_EDEFAULT.equals(wcn);
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
		result.append(" (lclass: ");
		result.append(lclass);
		result.append(", lcomment: ");
		result.append(lcomment);
		result.append(", lkey: ");
		result.append(lkey);
		result.append(", ltype: ");
		result.append(ltype);
		result.append(", wcn: ");
		result.append(wcn);
		result.append(')');
		return result.toString();
	}

} //BwllinkTypeImpl
