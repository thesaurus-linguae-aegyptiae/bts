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
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem;
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
 * An implementation of the model object '<em><b>BTS Passport Entry Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl#getSubValue <em>Sub Value</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl#getTimespan <em>Timespan</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl#getTranslation <em>Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSPassportEntryItemImpl extends BTSPassportEntryImpl implements BTSPassportEntryItem {
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
	 * The default value of the '{@link #getSubValue() <em>Sub Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubValue() <em>Sub Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubValue()
	 * @generated
	 * @ordered
	 */
	protected String subValue = SUB_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSExternalReference> externalReferences;

	/**
	 * The cached value of the '{@link #getTimespan() <em>Timespan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimespan()
	 * @generated
	 * @ordered
	 */
	protected BTSTimespan timespan;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected BTSTranslations description;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSPassportEntryItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubValue() {
		return subValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubValue(String newSubValue) {
		String oldSubValue = subValue;
		subValue = newSubValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE, oldSubValue, subValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSExternalReference> getExternalReferences() {
		if (externalReferences == null) {
			externalReferences = new EObjectContainmentEList<BTSExternalReference>(BTSExternalReference.class, this, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES);
		}
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTimespan getTimespan() {
		return timespan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimespan(BTSTimespan newTimespan, NotificationChain msgs) {
		BTSTimespan oldTimespan = timespan;
		timespan = newTimespan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN, oldTimespan, newTimespan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimespan(BTSTimespan newTimespan) {
		if (newTimespan != timespan) {
			NotificationChain msgs = null;
			if (timespan != null)
				msgs = ((InternalEObject)timespan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN, null, msgs);
			if (newTimespan != null)
				msgs = ((InternalEObject)newTimespan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN, null, msgs);
			msgs = basicSetTimespan(newTimespan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN, newTimespan, newTimespan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTranslations getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(BTSTranslations newDescription, NotificationChain msgs) {
		BTSTranslations oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(BTSTranslations newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION, oldTranslation, newTranslation);
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
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION, newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES:
				return ((InternalEList<?>)getExternalReferences()).basicRemove(otherEnd, msgs);
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN:
				return basicSetTimespan(null, msgs);
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION:
				return basicSetTranslation(null, msgs);
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
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUBTYPE:
				return getSubtype();
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE:
				return getSubValue();
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN:
				return getTimespan();
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION:
				return getDescription();
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION:
				return getTranslation();
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
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE:
				setSubValue((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				getExternalReferences().addAll((Collection<? extends BTSExternalReference>)newValue);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN:
				setTimespan((BTSTimespan)newValue);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION:
				setDescription((BTSTranslations)newValue);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION:
				setTranslation((BTSTranslations)newValue);
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
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE:
				setSubValue(SUB_VALUE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN:
				setTimespan((BTSTimespan)null);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION:
				setDescription((BTSTranslations)null);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION:
				setTranslation((BTSTranslations)null);
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
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE:
				return SUB_VALUE_EDEFAULT == null ? subValue != null : !SUB_VALUE_EDEFAULT.equals(subValue);
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES:
				return externalReferences != null && !externalReferences.isEmpty();
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN:
				return timespan != null;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION:
				return description != null;
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION:
				return translation != null;
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
		result.append(" (subtype: ");
		result.append(subtype);
		result.append(", subValue: ");
		result.append(subValue);
		result.append(')');
		return result.toString();
	}

} //BTSPassportEntryItemImpl
