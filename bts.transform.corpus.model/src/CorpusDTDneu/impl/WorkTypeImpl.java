/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.WorkType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.WorkTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.WorkTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.WorkTypeImpl#getThesaurus <em>Thesaurus</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.WorkTypeImpl#getVersionCode <em>Version Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkTypeImpl extends MinimalEObjectImpl.Container implements WorkType {
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
	 * The default value of the '{@link #getThesaurus() <em>Thesaurus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesaurus()
	 * @generated
	 * @ordered
	 */
	protected static final Object THESAURUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThesaurus() <em>Thesaurus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesaurus()
	 * @generated
	 * @ordered
	 */
	protected Object thesaurus = THESAURUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object VERSION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected Object versionCode = VERSION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.WORK_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.WORK_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.WORK_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getThesaurus() {
		return thesaurus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThesaurus(Object newThesaurus) {
		Object oldThesaurus = thesaurus;
		thesaurus = newThesaurus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.WORK_TYPE__THESAURUS, oldThesaurus, thesaurus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVersionCode() {
		return versionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionCode(Object newVersionCode) {
		Object oldVersionCode = versionCode;
		versionCode = newVersionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.WORK_TYPE__VERSION_CODE, oldVersionCode, versionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusDTDneuPackage.WORK_TYPE__NAME:
				return getName();
			case CorpusDTDneuPackage.WORK_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.WORK_TYPE__THESAURUS:
				return getThesaurus();
			case CorpusDTDneuPackage.WORK_TYPE__VERSION_CODE:
				return getVersionCode();
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
			case CorpusDTDneuPackage.WORK_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorpusDTDneuPackage.WORK_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.WORK_TYPE__THESAURUS:
				setThesaurus(newValue);
				return;
			case CorpusDTDneuPackage.WORK_TYPE__VERSION_CODE:
				setVersionCode(newValue);
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
			case CorpusDTDneuPackage.WORK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.WORK_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.WORK_TYPE__THESAURUS:
				setThesaurus(THESAURUS_EDEFAULT);
				return;
			case CorpusDTDneuPackage.WORK_TYPE__VERSION_CODE:
				setVersionCode(VERSION_CODE_EDEFAULT);
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
			case CorpusDTDneuPackage.WORK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorpusDTDneuPackage.WORK_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.WORK_TYPE__THESAURUS:
				return THESAURUS_EDEFAULT == null ? thesaurus != null : !THESAURUS_EDEFAULT.equals(thesaurus);
			case CorpusDTDneuPackage.WORK_TYPE__VERSION_CODE:
				return VERSION_CODE_EDEFAULT == null ? versionCode != null : !VERSION_CODE_EDEFAULT.equals(versionCode);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(", thesaurus: ");
		result.append(thesaurus);
		result.append(", versionCode: ");
		result.append(versionCode);
		result.append(')');
		return result.toString();
	}

} //WorkTypeImpl
