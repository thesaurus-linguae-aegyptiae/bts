/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.TCPictureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TC Picture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.TCPictureTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPictureTypeImpl#getPictureType <em>Picture Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCPictureTypeImpl extends MinimalEObjectImpl.Container implements TCPictureType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getPictureType() <em>Picture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictureType()
	 * @generated
	 * @ordered
	 */
	protected static final Object PICTURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPictureType() <em>Picture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictureType()
	 * @generated
	 * @ordered
	 */
	protected Object pictureType = PICTURE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPictureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.TC_PICTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CorpusDTDneuPackage.TC_PICTURE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPictureType() {
		return pictureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPictureType(Object newPictureType) {
		Object oldPictureType = pictureType;
		pictureType = newPictureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PICTURE_TYPE__PICTURE_TYPE, oldPictureType, pictureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__PICTURE_TYPE:
				return getPictureType();
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
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__PICTURE_TYPE:
				setPictureType(newValue);
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
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__MIXED:
				getMixed().clear();
				return;
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__PICTURE_TYPE:
				setPictureType(PICTURE_TYPE_EDEFAULT);
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
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CorpusDTDneuPackage.TC_PICTURE_TYPE__PICTURE_TYPE:
				return PICTURE_TYPE_EDEFAULT == null ? pictureType != null : !PICTURE_TYPE_EDEFAULT.equals(pictureType);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", pictureType: ");
		result.append(pictureType);
		result.append(')');
		return result.toString();
	}

} //TCPictureTypeImpl
