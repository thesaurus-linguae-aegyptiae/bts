/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BTSPpSubentry;
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
 * An implementation of the model object '<em><b>BTS Passport Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl#getSubentries <em>Subentries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSPassportEntryImpl extends BTSIdentifiableItemImpl implements BTSPassportEntry {
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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubentries() <em>Subentries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubentries()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSPpSubentry> subentries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSPassportEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_ENTRY__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_ENTRY__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_ENTRY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_ENTRY__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSPpSubentry> getSubentries() {
		if (subentries == null) {
			subentries = new EObjectContainmentEList<BTSPpSubentry>(BTSPpSubentry.class, this, BtsmodelPackage.BTS_PASSPORT_ENTRY__SUBENTRIES);
		}
		return subentries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__SUBENTRIES:
				return ((InternalEList<?>)getSubentries()).basicRemove(otherEnd, msgs);
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
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__PROVIDER:
				return getProvider();
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__COMMENT:
				return getComment();
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__TYPE:
				return getType();
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__VALUE:
				return getValue();
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__CATEGORY:
				return getCategory();
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__SUBENTRIES:
				return getSubentries();
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
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__PROVIDER:
				setProvider((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__COMMENT:
				setComment((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__TYPE:
				setType((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__VALUE:
				setValue((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__CATEGORY:
				setCategory((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__SUBENTRIES:
				getSubentries().clear();
				getSubentries().addAll((Collection<? extends BTSPpSubentry>)newValue);
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
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__SUBENTRIES:
				getSubentries().clear();
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
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case BtsmodelPackage.BTS_PASSPORT_ENTRY__SUBENTRIES:
				return subentries != null && !subentries.isEmpty();
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
		result.append(" (provider: ");
		result.append(provider);
		result.append(", comment: ");
		result.append(comment);
		result.append(", type: ");
		result.append(type);
		result.append(", value: ");
		result.append(value);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //BTSPassportEntryImpl
