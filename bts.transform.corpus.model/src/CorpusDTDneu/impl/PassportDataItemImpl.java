/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.PassportDataItem;
import CorpusDTDneu.PassportDataItemType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passport Data Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.PassportDataItemImpl#getPassportDataItem <em>Passport Data Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassportDataItemImpl extends MinimalEObjectImpl.Container implements PassportDataItem {
	/**
	 * The cached value of the '{@link #getPassportDataItem() <em>Passport Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportDataItem()
	 * @generated
	 * @ordered
	 */
	protected PassportDataItemType passportDataItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassportDataItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.PASSPORT_DATA_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItemType getPassportDataItem() {
		return passportDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassportDataItem(PassportDataItemType newPassportDataItem, NotificationChain msgs) {
		PassportDataItemType oldPassportDataItem = passportDataItem;
		passportDataItem = newPassportDataItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM, oldPassportDataItem, newPassportDataItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassportDataItem(PassportDataItemType newPassportDataItem) {
		if (newPassportDataItem != passportDataItem) {
			NotificationChain msgs = null;
			if (passportDataItem != null)
				msgs = ((InternalEObject)passportDataItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM, null, msgs);
			if (newPassportDataItem != null)
				msgs = ((InternalEObject)newPassportDataItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM, null, msgs);
			msgs = basicSetPassportDataItem(newPassportDataItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM, newPassportDataItem, newPassportDataItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM:
				return basicSetPassportDataItem(null, msgs);
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
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM:
				return getPassportDataItem();
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
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM:
				setPassportDataItem((PassportDataItemType)newValue);
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
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM:
				setPassportDataItem((PassportDataItemType)null);
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
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM:
				return passportDataItem != null;
		}
		return super.eIsSet(featureID);
	}

} //PassportDataItemImpl
