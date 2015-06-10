/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2015  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSNamedTypedObject;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
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
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getWType <em>WType</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getLType <em>LType</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getLKey <em>LKey</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getFlexCode <em>Flex Code</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getWChar <em>WChar</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl#getGraphics <em>Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSWordImpl extends BTSIdentifiableItemImpl implements BTSWord {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected int sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

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
		return BtsCorpusModelPackage.Literals.BTS_WORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(int newSortKey) {
		int oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__SUBTYPE, oldSubtype, subtype));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__TRANSLATION, oldTranslation, newTranslation);
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
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_WORD__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_WORD__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__TRANSLATION, newTranslation, newTranslation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__WTYPE, oldWType, wType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__LTYPE, oldLType, lType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__LKEY, oldLKey, lKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__FLEX_CODE, oldFlexCode, flexCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__WCHAR, oldWChar, wChar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_WORD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSGraphic> getGraphics() {
		if (graphics == null) {
			graphics = new EObjectContainmentEList<BTSGraphic>(BTSGraphic.class, this, BtsCorpusModelPackage.BTS_WORD__GRAPHICS);
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
			case BtsCorpusModelPackage.BTS_WORD__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case BtsCorpusModelPackage.BTS_WORD__GRAPHICS:
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
			case BtsCorpusModelPackage.BTS_WORD__NAME:
				return getName();
			case BtsCorpusModelPackage.BTS_WORD__TYPE:
				return getType();
			case BtsCorpusModelPackage.BTS_WORD__SORT_KEY:
				return getSortKey();
			case BtsCorpusModelPackage.BTS_WORD__SUBTYPE:
				return getSubtype();
			case BtsCorpusModelPackage.BTS_WORD__TRANSLATION:
				return getTranslation();
			case BtsCorpusModelPackage.BTS_WORD__WTYPE:
				return getWType();
			case BtsCorpusModelPackage.BTS_WORD__LTYPE:
				return getLType();
			case BtsCorpusModelPackage.BTS_WORD__LKEY:
				return getLKey();
			case BtsCorpusModelPackage.BTS_WORD__FLEX_CODE:
				return getFlexCode();
			case BtsCorpusModelPackage.BTS_WORD__WCHAR:
				return getWChar();
			case BtsCorpusModelPackage.BTS_WORD__VALUE:
				return getValue();
			case BtsCorpusModelPackage.BTS_WORD__GRAPHICS:
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
			case BtsCorpusModelPackage.BTS_WORD__NAME:
				setName((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__TYPE:
				setType((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__SORT_KEY:
				setSortKey((Integer)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__TRANSLATION:
				setTranslation((BTSTranslations)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__WTYPE:
				setWType((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__LTYPE:
				setLType((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__LKEY:
				setLKey((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__FLEX_CODE:
				setFlexCode((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__WCHAR:
				setWChar((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__VALUE:
				setValue((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_WORD__GRAPHICS:
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
			case BtsCorpusModelPackage.BTS_WORD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__TRANSLATION:
				setTranslation((BTSTranslations)null);
				return;
			case BtsCorpusModelPackage.BTS_WORD__WTYPE:
				setWType(WTYPE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__LTYPE:
				setLType(LTYPE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__LKEY:
				setLKey(LKEY_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__FLEX_CODE:
				setFlexCode(FLEX_CODE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__WCHAR:
				setWChar(WCHAR_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_WORD__GRAPHICS:
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
			case BtsCorpusModelPackage.BTS_WORD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BtsCorpusModelPackage.BTS_WORD__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsCorpusModelPackage.BTS_WORD__SORT_KEY:
				return sortKey != SORT_KEY_EDEFAULT;
			case BtsCorpusModelPackage.BTS_WORD__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case BtsCorpusModelPackage.BTS_WORD__TRANSLATION:
				return translation != null;
			case BtsCorpusModelPackage.BTS_WORD__WTYPE:
				return WTYPE_EDEFAULT == null ? wType != null : !WTYPE_EDEFAULT.equals(wType);
			case BtsCorpusModelPackage.BTS_WORD__LTYPE:
				return LTYPE_EDEFAULT == null ? lType != null : !LTYPE_EDEFAULT.equals(lType);
			case BtsCorpusModelPackage.BTS_WORD__LKEY:
				return LKEY_EDEFAULT == null ? lKey != null : !LKEY_EDEFAULT.equals(lKey);
			case BtsCorpusModelPackage.BTS_WORD__FLEX_CODE:
				return FLEX_CODE_EDEFAULT == null ? flexCode != null : !FLEX_CODE_EDEFAULT.equals(flexCode);
			case BtsCorpusModelPackage.BTS_WORD__WCHAR:
				return WCHAR_EDEFAULT == null ? wChar != null : !WCHAR_EDEFAULT.equals(wChar);
			case BtsCorpusModelPackage.BTS_WORD__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BtsCorpusModelPackage.BTS_WORD__GRAPHICS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BTSNamedTypedObject.class) {
			switch (derivedFeatureID) {
				case BtsCorpusModelPackage.BTS_WORD__NAME: return BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__NAME;
				case BtsCorpusModelPackage.BTS_WORD__TYPE: return BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__TYPE;
				case BtsCorpusModelPackage.BTS_WORD__SORT_KEY: return BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__SORT_KEY;
				case BtsCorpusModelPackage.BTS_WORD__SUBTYPE: return BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__SUBTYPE;
				default: return -1;
			}
		}
		if (baseClass == BTSSentenceItem.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BTSNamedTypedObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__NAME: return BtsCorpusModelPackage.BTS_WORD__NAME;
				case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__TYPE: return BtsCorpusModelPackage.BTS_WORD__TYPE;
				case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__SORT_KEY: return BtsCorpusModelPackage.BTS_WORD__SORT_KEY;
				case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__SUBTYPE: return BtsCorpusModelPackage.BTS_WORD__SUBTYPE;
				default: return -1;
			}
		}
		if (baseClass == BTSSentenceItem.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", wType: ");
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
