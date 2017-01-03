/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgyTB3StartType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Egy TB3 Start Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.EgyTB3StartTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTB3StartTypeImpl#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTB3StartTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTB3StartTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTB3StartTypeImpl#getIdRef <em>Id Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EgyTB3StartTypeImpl extends MinimalEObjectImpl.Container implements EgyTB3StartType {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdRef() <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdRef() <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected String idRef = ID_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EgyTB3StartTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.EGY_TB3_START_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TB3_START_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TB3_START_TYPE__BTS_CODES, oldBtsCodes, btsCodes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TB3_START_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdRef() {
		return idRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRef(String newIdRef) {
		String oldIdRef = idRef;
		idRef = newIdRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID_REF, oldIdRef, idRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__NAME:
				return getName();
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__BTS_CODES:
				return getBtsCodes();
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID:
				return getId();
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID_REF:
				return getIdRef();
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
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__BTS_CODES:
				setBtsCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID:
				setId((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID_REF:
				setIdRef((String)newValue);
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
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__BTS_CODES:
				setBtsCodes(BTS_CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID_REF:
				setIdRef(ID_REF_EDEFAULT);
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
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__BTS_CODES:
				return BTS_CODES_EDEFAULT == null ? btsCodes != null : !BTS_CODES_EDEFAULT.equals(btsCodes);
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE__ID_REF:
				return ID_REF_EDEFAULT == null ? idRef != null : !ID_REF_EDEFAULT.equals(idRef);
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
		result.append(", btsCodes: ");
		result.append(btsCodes);
		result.append(", comment: ");
		result.append(comment);
		result.append(", id: ");
		result.append(id);
		result.append(", idRef: ");
		result.append(idRef);
		result.append(')');
		return result.toString();
	}

} //EgyTB3StartTypeImpl
