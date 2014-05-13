/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSListSubentry;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS List Subentry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl#getPassport <em>Passport</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl#getWords <em>Words</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSListSubentryImpl extends BTSReferencableItemImpl implements BTSListSubentry {
	/**
	 * The cached value of the '{@link #getPassport() <em>Passport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassport()
	 * @generated
	 * @ordered
	 */
	protected BTSPassport passport;

	/**
	 * The cached value of the '{@link #getWords() <em>Words</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWords()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSWord> words;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSListSubentryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_LIST_SUBENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassport getPassport() {
		return passport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassport(BTSPassport newPassport, NotificationChain msgs) {
		BTSPassport oldPassport = passport;
		passport = newPassport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT, oldPassport, newPassport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassport(BTSPassport newPassport) {
		if (newPassport != passport) {
			NotificationChain msgs = null;
			if (passport != null)
				msgs = ((InternalEObject)passport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT, null, msgs);
			if (newPassport != null)
				msgs = ((InternalEObject)newPassport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT, null, msgs);
			msgs = basicSetPassport(newPassport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT, newPassport, newPassport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSWord> getWords()
	{
		if (words == null) {
			words = new EObjectContainmentEList<BTSWord>(BTSWord.class, this, BtsmodelPackage.BTS_LIST_SUBENTRY__WORDS);
		}
		return words;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT:
				return basicSetPassport(null, msgs);
			case BtsmodelPackage.BTS_LIST_SUBENTRY__WORDS:
				return ((InternalEList<?>)getWords()).basicRemove(otherEnd, msgs);
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
			case BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT:
				return getPassport();
			case BtsmodelPackage.BTS_LIST_SUBENTRY__WORDS:
				return getWords();
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
			case BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT:
				setPassport((BTSPassport)newValue);
				return;
			case BtsmodelPackage.BTS_LIST_SUBENTRY__WORDS:
				getWords().clear();
				getWords().addAll((Collection<? extends BTSWord>)newValue);
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
			case BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT:
				setPassport((BTSPassport)null);
				return;
			case BtsmodelPackage.BTS_LIST_SUBENTRY__WORDS:
				getWords().clear();
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
			case BtsmodelPackage.BTS_LIST_SUBENTRY__PASSPORT:
				return passport != null;
			case BtsmodelPackage.BTS_LIST_SUBENTRY__WORDS:
				return words != null && !words.isEmpty();
		}
		return super.eIsSet(featureID);
	}
} //BTSListSubentryImpl
