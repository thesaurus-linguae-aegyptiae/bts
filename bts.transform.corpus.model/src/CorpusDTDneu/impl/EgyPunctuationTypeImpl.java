/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgyPunctuationType;
import CorpusDTDneu.TypeType6;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Egy Punctuation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.EgyPunctuationTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyPunctuationTypeImpl#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyPunctuationTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyPunctuationTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EgyPunctuationTypeImpl extends MinimalEObjectImpl.Container implements EgyPunctuationType {
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
	 * The default value of the '{@link #getBtsCodes() <em>Bts Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtsCodes()
	 * @generated
	 * @ordered
	 */
	protected static final String BTS_CODES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtsCodes() <em>Bts Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtsCodes()
	 * @generated
	 * @ordered
	 */
	protected String btsCodes = BTS_CODES_EDEFAULT;

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
	protected static final TypeType6 TYPE_EDEFAULT = TypeType6.VP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType6 type = TYPE_EDEFAULT;

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
	protected EgyPunctuationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.EGY_PUNCTUATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtsCodes() {
		return btsCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtsCodes(String newBtsCodes) {
		String oldBtsCodes = btsCodes;
		btsCodes = newBtsCodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__BTS_CODES, oldBtsCodes, btsCodes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType6 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType6 newType) {
		TypeType6 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType6 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__VALUE:
				return getValue();
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__BTS_CODES:
				return getBtsCodes();
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__TYPE:
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
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__BTS_CODES:
				setBtsCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__TYPE:
				setType((TypeType6)newValue);
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
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__BTS_CODES:
				setBtsCodes(BTS_CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__TYPE:
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
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__BTS_CODES:
				return BTS_CODES_EDEFAULT == null ? btsCodes != null : !BTS_CODES_EDEFAULT.equals(btsCodes);
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE__TYPE:
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
		result.append(" (value: ");
		result.append(value);
		result.append(", btsCodes: ");
		result.append(btsCodes);
		result.append(", comment: ");
		result.append(comment);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EgyPunctuationTypeImpl
