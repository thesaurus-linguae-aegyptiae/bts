/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSTranslations;
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
 * An implementation of the model object '<em><b>BTS Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl#getWType <em>WType</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl#getLType <em>LType</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl#getLKey <em>LKey</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl#getFlexCode <em>Flex Code</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl#getWChar <em>WChar</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl#getGraphics <em>Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSWordImpl extends BTSReferencableItemImpl implements BTSWord {
	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected BTSTranslations translation;

	/**
	 * The default value of the '{@link #getWType() <em>WType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWType()
	 * @generated
	 * @ordered
	 */
	protected static final String WTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWType() <em>WType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWType()
	 * @generated
	 * @ordered
	 */
	protected String wType = WTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLType() <em>LType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLType()
	 * @generated
	 * @ordered
	 */
	protected static final String LTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLType() <em>LType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLType()
	 * @generated
	 * @ordered
	 */
	protected String lType = LTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLKey() <em>LKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLKey()
	 * @generated
	 * @ordered
	 */
	protected static final String LKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLKey() <em>LKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLKey()
	 * @generated
	 * @ordered
	 */
	protected String lKey = LKEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlexCode() <em>Flex Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexCode()
	 * @generated
	 * @ordered
	 */
	protected static final String FLEX_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlexCode() <em>Flex Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexCode()
	 * @generated
	 * @ordered
	 */
	protected String flexCode = FLEX_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWChar() <em>WChar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWChar()
	 * @generated
	 * @ordered
	 */
	protected static final String WCHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWChar() <em>WChar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWChar()
	 * @generated
	 * @ordered
	 */
	protected String wChar = WCHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGraphics() <em>Graphics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphics()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSGraphic> graphics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSWordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_WORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTranslations getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(BTSTranslations newTranslation, NotificationChain msgs) {
		BTSTranslations oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORD__TRANSLATION, oldTranslation, newTranslation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(BTSTranslations newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_WORD__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_WORD__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORD__TRANSLATION, newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWType() {
		return wType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWType(String newWType) {
		String oldWType = wType;
		wType = newWType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORD__WTYPE, oldWType, wType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLType() {
		return lType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLType(String newLType) {
		String oldLType = lType;
		lType = newLType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORD__LTYPE, oldLType, lType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLKey() {
		return lKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLKey(String newLKey) {
		String oldLKey = lKey;
		lKey = newLKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORD__LKEY, oldLKey, lKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlexCode() {
		return flexCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlexCode(String newFlexCode) {
		String oldFlexCode = flexCode;
		flexCode = newFlexCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORD__FLEX_CODE, oldFlexCode, flexCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWChar() {
		return wChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWChar(String newWChar) {
		String oldWChar = wChar;
		wChar = newWChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORD__WCHAR, oldWChar, wChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSGraphic> getGraphics() {
		if (graphics == null) {
			graphics = new EObjectContainmentEList<BTSGraphic>(BTSGraphic.class, this, BtsmodelPackage.BTS_WORD__GRAPHICS);
		}
		return graphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_WORD__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case BtsmodelPackage.BTS_WORD__GRAPHICS:
				return ((InternalEList<?>)getGraphics()).basicRemove(otherEnd, msgs);
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
			case BtsmodelPackage.BTS_WORD__TRANSLATION:
				return getTranslation();
			case BtsmodelPackage.BTS_WORD__WTYPE:
				return getWType();
			case BtsmodelPackage.BTS_WORD__LTYPE:
				return getLType();
			case BtsmodelPackage.BTS_WORD__LKEY:
				return getLKey();
			case BtsmodelPackage.BTS_WORD__FLEX_CODE:
				return getFlexCode();
			case BtsmodelPackage.BTS_WORD__WCHAR:
				return getWChar();
			case BtsmodelPackage.BTS_WORD__VALUE:
				return getValue();
			case BtsmodelPackage.BTS_WORD__GRAPHICS:
				return getGraphics();
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
			case BtsmodelPackage.BTS_WORD__TRANSLATION:
				setTranslation((BTSTranslations)newValue);
				return;
			case BtsmodelPackage.BTS_WORD__WTYPE:
				setWType((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORD__LTYPE:
				setLType((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORD__LKEY:
				setLKey((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORD__FLEX_CODE:
				setFlexCode((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORD__WCHAR:
				setWChar((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORD__VALUE:
				setValue((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORD__GRAPHICS:
				getGraphics().clear();
				getGraphics().addAll((Collection<? extends BTSGraphic>)newValue);
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
			case BtsmodelPackage.BTS_WORD__TRANSLATION:
				setTranslation((BTSTranslations)null);
				return;
			case BtsmodelPackage.BTS_WORD__WTYPE:
				setWType(WTYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORD__LTYPE:
				setLType(LTYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORD__LKEY:
				setLKey(LKEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORD__FLEX_CODE:
				setFlexCode(FLEX_CODE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORD__WCHAR:
				setWChar(WCHAR_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORD__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORD__GRAPHICS:
				getGraphics().clear();
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
			case BtsmodelPackage.BTS_WORD__TRANSLATION:
				return translation != null;
			case BtsmodelPackage.BTS_WORD__WTYPE:
				return WTYPE_EDEFAULT == null ? wType != null : !WTYPE_EDEFAULT.equals(wType);
			case BtsmodelPackage.BTS_WORD__LTYPE:
				return LTYPE_EDEFAULT == null ? lType != null : !LTYPE_EDEFAULT.equals(lType);
			case BtsmodelPackage.BTS_WORD__LKEY:
				return LKEY_EDEFAULT == null ? lKey != null : !LKEY_EDEFAULT.equals(lKey);
			case BtsmodelPackage.BTS_WORD__FLEX_CODE:
				return FLEX_CODE_EDEFAULT == null ? flexCode != null : !FLEX_CODE_EDEFAULT.equals(flexCode);
			case BtsmodelPackage.BTS_WORD__WCHAR:
				return WCHAR_EDEFAULT == null ? wChar != null : !WCHAR_EDEFAULT.equals(wChar);
			case BtsmodelPackage.BTS_WORD__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BtsmodelPackage.BTS_WORD__GRAPHICS:
				return graphics != null && !graphics.isEmpty();
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
		result.append(" (wType: ");
		result.append(wType);
		result.append(", lType: ");
		result.append(lType);
		result.append(", lKey: ");
		result.append(lKey);
		result.append(", flexCode: ");
		result.append(flexCode);
		result.append(", wChar: ");
		result.append(wChar);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //BTSWordImpl
