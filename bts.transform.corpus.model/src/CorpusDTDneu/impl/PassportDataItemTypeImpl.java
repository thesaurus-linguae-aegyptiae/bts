/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CategoryType;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.PassportDataItemType;
import CorpusDTDneu.ThsEntryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passport Data Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.PassportDataItemTypeImpl#getThsEntry <em>Ths Entry</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PassportDataItemTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PassportDataItemTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PassportDataItemTypeImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassportDataItemTypeImpl extends MinimalEObjectImpl.Container implements PassportDataItemType {
	/**
	 * The cached value of the '{@link #getThsEntry() <em>Ths Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThsEntry()
	 * @generated
	 * @ordered
	 */
	protected ThsEntryType thsEntry;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final CategoryType CATEGORY_EDEFAULT = CategoryType.PROVENANCE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CategoryType category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassportDataItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.PASSPORT_DATA_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThsEntryType getThsEntry() {
		return thsEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThsEntry(ThsEntryType newThsEntry, NotificationChain msgs) {
		ThsEntryType oldThsEntry = thsEntry;
		thsEntry = newThsEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY, oldThsEntry, newThsEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThsEntry(ThsEntryType newThsEntry) {
		if (newThsEntry != thsEntry) {
			NotificationChain msgs = null;
			if (thsEntry != null)
				msgs = ((InternalEObject)thsEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY, null, msgs);
			if (newThsEntry != null)
				msgs = ((InternalEObject)newThsEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY, null, msgs);
			msgs = basicSetThsEntry(newThsEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY, newThsEntry, newThsEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryType getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CategoryType newCategory) {
		CategoryType oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		boolean oldCategoryESet = categoryESet;
		categoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CATEGORY, oldCategory, category, !oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategory() {
		CategoryType oldCategory = category;
		boolean oldCategoryESet = categoryESet;
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY:
				return basicSetThsEntry(null, msgs);
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
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY:
				return getThsEntry();
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CODE:
				return getCode();
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CATEGORY:
				return getCategory();
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
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY:
				setThsEntry((ThsEntryType)newValue);
				return;
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CODE:
				setCode((String)newValue);
				return;
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CATEGORY:
				setCategory((CategoryType)newValue);
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
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY:
				setThsEntry((ThsEntryType)null);
				return;
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CATEGORY:
				unsetCategory();
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
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__THS_ENTRY:
				return thsEntry != null;
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE__CATEGORY:
				return isSetCategory();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", comment: ");
		result.append(comment);
		result.append(", category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PassportDataItemTypeImpl
