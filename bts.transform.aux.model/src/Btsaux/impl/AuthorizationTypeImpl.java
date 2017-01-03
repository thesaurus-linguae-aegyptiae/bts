/**
 */
package Btsaux.impl;

import Btsaux.AuthorizationType;
import Btsaux.BtsauxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Btsaux.impl.AuthorizationTypeImpl#getAuct <em>Auct</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorizationTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorizationTypeImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationTypeImpl extends MinimalEObjectImpl.Container implements AuthorizationType {
	/**
	 * The default value of the '{@link #getAuct() <em>Auct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuct()
	 * @generated
	 * @ordered
	 */
	protected static final String AUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuct() <em>Auct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuct()
	 * @generated
	 * @ordered
	 */
	protected String auct = AUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Object CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Object category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Object comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsauxPackage.Literals.AUTHORIZATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuct() {
		return auct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuct(String newAuct) {
		String oldAuct = auct;
		auct = newAuct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORIZATION_TYPE__AUCT, oldAuct, auct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Object newCategory) {
		Object oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORIZATION_TYPE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Object newComment) {
		Object oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORIZATION_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsauxPackage.AUTHORIZATION_TYPE__AUCT:
				return getAuct();
			case BtsauxPackage.AUTHORIZATION_TYPE__CATEGORY:
				return getCategory();
			case BtsauxPackage.AUTHORIZATION_TYPE__COMMENT:
				return getComment();
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
			case BtsauxPackage.AUTHORIZATION_TYPE__AUCT:
				setAuct((String)newValue);
				return;
			case BtsauxPackage.AUTHORIZATION_TYPE__CATEGORY:
				setCategory(newValue);
				return;
			case BtsauxPackage.AUTHORIZATION_TYPE__COMMENT:
				setComment(newValue);
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
			case BtsauxPackage.AUTHORIZATION_TYPE__AUCT:
				setAuct(AUCT_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORIZATION_TYPE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORIZATION_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case BtsauxPackage.AUTHORIZATION_TYPE__AUCT:
				return AUCT_EDEFAULT == null ? auct != null : !AUCT_EDEFAULT.equals(auct);
			case BtsauxPackage.AUTHORIZATION_TYPE__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case BtsauxPackage.AUTHORIZATION_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		result.append(" (auct: ");
		result.append(auct);
		result.append(", category: ");
		result.append(category);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //AuthorizationTypeImpl
