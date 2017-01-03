/**
 */
package Btsaux.impl;

import Btsaux.BtsauxPackage;
import Btsaux.BwlenglType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bwlengl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Btsaux.impl.BwlenglTypeImpl#getEcomment <em>Ecomment</em>}</li>
 *   <li>{@link Btsaux.impl.BwlenglTypeImpl#getElabel <em>Elabel</em>}</li>
 *   <li>{@link Btsaux.impl.BwlenglTypeImpl#getWcn <em>Wcn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BwlenglTypeImpl extends MinimalEObjectImpl.Container implements BwlenglType {
	/**
	 * The default value of the '{@link #getEcomment() <em>Ecomment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcomment()
	 * @generated
	 * @ordered
	 */
	protected static final Object ECOMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcomment() <em>Ecomment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcomment()
	 * @generated
	 * @ordered
	 */
	protected Object ecomment = ECOMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElabel() <em>Elabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object ELABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElabel() <em>Elabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElabel()
	 * @generated
	 * @ordered
	 */
	protected Object elabel = ELABEL_EDEFAULT;

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
	protected BwlenglTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsauxPackage.Literals.BWLENGL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEcomment() {
		return ecomment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcomment(Object newEcomment) {
		Object oldEcomment = ecomment;
		ecomment = newEcomment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.BWLENGL_TYPE__ECOMMENT, oldEcomment, ecomment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getElabel() {
		return elabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElabel(Object newElabel) {
		Object oldElabel = elabel;
		elabel = newElabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.BWLENGL_TYPE__ELABEL, oldElabel, elabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.BWLENGL_TYPE__WCN, oldWcn, wcn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsauxPackage.BWLENGL_TYPE__ECOMMENT:
				return getEcomment();
			case BtsauxPackage.BWLENGL_TYPE__ELABEL:
				return getElabel();
			case BtsauxPackage.BWLENGL_TYPE__WCN:
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
			case BtsauxPackage.BWLENGL_TYPE__ECOMMENT:
				setEcomment(newValue);
				return;
			case BtsauxPackage.BWLENGL_TYPE__ELABEL:
				setElabel(newValue);
				return;
			case BtsauxPackage.BWLENGL_TYPE__WCN:
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
			case BtsauxPackage.BWLENGL_TYPE__ECOMMENT:
				setEcomment(ECOMMENT_EDEFAULT);
				return;
			case BtsauxPackage.BWLENGL_TYPE__ELABEL:
				setElabel(ELABEL_EDEFAULT);
				return;
			case BtsauxPackage.BWLENGL_TYPE__WCN:
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
			case BtsauxPackage.BWLENGL_TYPE__ECOMMENT:
				return ECOMMENT_EDEFAULT == null ? ecomment != null : !ECOMMENT_EDEFAULT.equals(ecomment);
			case BtsauxPackage.BWLENGL_TYPE__ELABEL:
				return ELABEL_EDEFAULT == null ? elabel != null : !ELABEL_EDEFAULT.equals(elabel);
			case BtsauxPackage.BWLENGL_TYPE__WCN:
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
		result.append(" (ecomment: ");
		result.append(ecomment);
		result.append(", elabel: ");
		result.append(elabel);
		result.append(", wcn: ");
		result.append(wcn);
		result.append(')');
		return result.toString();
	}

} //BwlenglTypeImpl
