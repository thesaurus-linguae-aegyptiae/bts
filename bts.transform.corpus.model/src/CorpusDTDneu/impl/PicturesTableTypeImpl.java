/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.PictureType;
import CorpusDTDneu.PicturesTableType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pictures Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.PicturesTableTypeImpl#getPicture <em>Picture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PicturesTableTypeImpl extends MinimalEObjectImpl.Container implements PicturesTableType {
	/**
	 * The cached value of the '{@link #getPicture() <em>Picture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected EList<PictureType> picture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PicturesTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.PICTURES_TABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PictureType> getPicture() {
		if (picture == null) {
			picture = new EObjectContainmentEList<PictureType>(PictureType.class, this, CorpusDTDneuPackage.PICTURES_TABLE_TYPE__PICTURE);
		}
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.PICTURES_TABLE_TYPE__PICTURE:
				return ((InternalEList<?>)getPicture()).basicRemove(otherEnd, msgs);
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
			case CorpusDTDneuPackage.PICTURES_TABLE_TYPE__PICTURE:
				return getPicture();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorpusDTDneuPackage.PICTURES_TABLE_TYPE__PICTURE:
				getPicture().clear();
				getPicture().addAll((Collection<? extends PictureType>)newValue);
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
			case CorpusDTDneuPackage.PICTURES_TABLE_TYPE__PICTURE:
				getPicture().clear();
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
			case CorpusDTDneuPackage.PICTURES_TABLE_TYPE__PICTURE:
				return picture != null && !picture.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PicturesTableTypeImpl
