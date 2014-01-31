/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSPpSubentry;
import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Pp Subentry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getSubValue <em>Sub Value</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getTimespan <em>Timespan</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl#getTranslation <em>Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSPpSubentryImpl extends MinimalEObjectImpl.Container implements BTSPpSubentry {
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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected int key = KEY_EDEFAULT;

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
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

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
	protected BTSPpSubentryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_PP_SUBENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(int newKey) {
		int oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__KEY, oldKey, key));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__SUB_VALUE, oldSubValue, subValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSExternalReference> getExternalReferences() {
		if (externalReferences == null) {
			externalReferences = new EObjectContainmentEList<BTSExternalReference>(BTSExternalReference.class, this, BtsmodelPackage.BTS_PP_SUBENTRY__EXTERNAL_REFERENCES);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN, oldTimespan, newTimespan);
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
				msgs = ((InternalEObject)timespan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN, null, msgs);
			if (newTimespan != null)
				msgs = ((InternalEObject)newTimespan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN, null, msgs);
			msgs = basicSetTimespan(newTimespan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN, newTimespan, newTimespan));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION, oldTranslation, newTranslation);
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
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION, newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_PP_SUBENTRY__EXTERNAL_REFERENCES:
				return ((InternalEList<?>)getExternalReferences()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN:
				return basicSetTimespan(null, msgs);
			case BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION:
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
			case BtsmodelPackage.BTS_PP_SUBENTRY__TYPE:
				return getType();
			case BtsmodelPackage.BTS_PP_SUBENTRY__SUBTYPE:
				return getSubtype();
			case BtsmodelPackage.BTS_PP_SUBENTRY__KEY:
				return getKey();
			case BtsmodelPackage.BTS_PP_SUBENTRY__VALUE:
				return getValue();
			case BtsmodelPackage.BTS_PP_SUBENTRY__SUB_VALUE:
				return getSubValue();
			case BtsmodelPackage.BTS_PP_SUBENTRY__PROVIDER:
				return getProvider();
			case BtsmodelPackage.BTS_PP_SUBENTRY__NAME:
				return getName();
			case BtsmodelPackage.BTS_PP_SUBENTRY__COMMENT:
				return getComment();
			case BtsmodelPackage.BTS_PP_SUBENTRY__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN:
				return getTimespan();
			case BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION:
				return getDescription();
			case BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION:
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
			case BtsmodelPackage.BTS_PP_SUBENTRY__TYPE:
				setType((String)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__KEY:
				setKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__VALUE:
				setValue((String)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__SUB_VALUE:
				setSubValue((String)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__PROVIDER:
				setProvider((String)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__NAME:
				setName((String)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__COMMENT:
				setComment((String)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				getExternalReferences().addAll((Collection<? extends BTSExternalReference>)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN:
				setTimespan((BTSTimespan)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION:
				setDescription((BTSTranslations)newValue);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION:
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
			case BtsmodelPackage.BTS_PP_SUBENTRY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__SUB_VALUE:
				setSubValue(SUB_VALUE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN:
				setTimespan((BTSTimespan)null);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION:
				setDescription((BTSTranslations)null);
				return;
			case BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION:
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
			case BtsmodelPackage.BTS_PP_SUBENTRY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsmodelPackage.BTS_PP_SUBENTRY__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case BtsmodelPackage.BTS_PP_SUBENTRY__KEY:
				return key != KEY_EDEFAULT;
			case BtsmodelPackage.BTS_PP_SUBENTRY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BtsmodelPackage.BTS_PP_SUBENTRY__SUB_VALUE:
				return SUB_VALUE_EDEFAULT == null ? subValue != null : !SUB_VALUE_EDEFAULT.equals(subValue);
			case BtsmodelPackage.BTS_PP_SUBENTRY__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case BtsmodelPackage.BTS_PP_SUBENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BtsmodelPackage.BTS_PP_SUBENTRY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BtsmodelPackage.BTS_PP_SUBENTRY__EXTERNAL_REFERENCES:
				return externalReferences != null && !externalReferences.isEmpty();
			case BtsmodelPackage.BTS_PP_SUBENTRY__TIMESPAN:
				return timespan != null;
			case BtsmodelPackage.BTS_PP_SUBENTRY__DESCRIPTION:
				return description != null;
			case BtsmodelPackage.BTS_PP_SUBENTRY__TRANSLATION:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(", subValue: ");
		result.append(subValue);
		result.append(", provider: ");
		result.append(provider);
		result.append(", name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //BTSPpSubentryImpl
