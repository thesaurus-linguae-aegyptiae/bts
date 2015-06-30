/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CategoryType1;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.ThsEntryType;
import CorpusDTDneu.TypeType4;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ths Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.ThsEntryTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.ThsEntryTypeImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.ThsEntryTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.ThsEntryTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.ThsEntryTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.ThsEntryTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThsEntryTypeImpl extends MinimalEObjectImpl.Container implements ThsEntryType {
	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected String term = TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final String HIERARCHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected String hierarchy = HIERARCHY_EDEFAULT;

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
	protected static final CategoryType1 CATEGORY_EDEFAULT = CategoryType1.PROVENANCE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CategoryType1 category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Object key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType4 TYPE_EDEFAULT = TypeType4.BTS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType4 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThsEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.THS_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(String newTerm) {
		String oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.THS_ENTRY_TYPE__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHierarchy() {
		return hierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchy(String newHierarchy) {
		String oldHierarchy = hierarchy;
		hierarchy = newHierarchy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.THS_ENTRY_TYPE__HIERARCHY, oldHierarchy, hierarchy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.THS_ENTRY_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryType1 getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CategoryType1 newCategory) {
		CategoryType1 oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		boolean oldCategoryESet = categoryESet;
		categoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.THS_ENTRY_TYPE__CATEGORY, oldCategory, category, !oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategory() {
		CategoryType1 oldCategory = category;
		boolean oldCategoryESet = categoryESet;
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.THS_ENTRY_TYPE__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet));
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
	public Object getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Object newKey) {
		Object oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.THS_ENTRY_TYPE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType4 newType) {
		TypeType4 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.THS_ENTRY_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType4 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.THS_ENTRY_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__TERM:
				return getTerm();
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__HIERARCHY:
				return getHierarchy();
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__CATEGORY:
				return getCategory();
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__KEY:
				return getKey();
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__TYPE:
				return getType();
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
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__TERM:
				setTerm((String)newValue);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__HIERARCHY:
				setHierarchy((String)newValue);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__CATEGORY:
				setCategory((CategoryType1)newValue);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__KEY:
				setKey(newValue);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__TYPE:
				setType((TypeType4)newValue);
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
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__HIERARCHY:
				setHierarchy(HIERARCHY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__CATEGORY:
				unsetCategory();
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__TYPE:
				unsetType();
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
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__TERM:
				return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__HIERARCHY:
				return HIERARCHY_EDEFAULT == null ? hierarchy != null : !HIERARCHY_EDEFAULT.equals(hierarchy);
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__CATEGORY:
				return isSetCategory();
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case CorpusDTDneuPackage.THS_ENTRY_TYPE__TYPE:
				return isSetType();
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
		result.append(" (term: ");
		result.append(term);
		result.append(", hierarchy: ");
		result.append(hierarchy);
		result.append(", comment: ");
		result.append(comment);
		result.append(", category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(", key: ");
		result.append(key);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ThsEntryTypeImpl
