/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.LeipzigPassageType;
import CorpusDTDneu.TypeType2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leipzig Passage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.LeipzigPassageTypeImpl#getAuszeichnung <em>Auszeichnung</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.LeipzigPassageTypeImpl#getPassageID <em>Passage ID</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.LeipzigPassageTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeipzigPassageTypeImpl extends MinimalEObjectImpl.Container implements LeipzigPassageType {
	/**
	 * The default value of the '{@link #getAuszeichnung() <em>Auszeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuszeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUSZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuszeichnung() <em>Auszeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuszeichnung()
	 * @generated
	 * @ordered
	 */
	protected Object auszeichnung = AUSZEICHNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassageID() <em>Passage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassageID()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassageID() <em>Passage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassageID()
	 * @generated
	 * @ordered
	 */
	protected String passageID = PASSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType2 TYPE_EDEFAULT = TypeType2.START;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType2 type = TYPE_EDEFAULT;

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
	protected LeipzigPassageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.LEIPZIG_PASSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAuszeichnung() {
		return auszeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuszeichnung(Object newAuszeichnung) {
		Object oldAuszeichnung = auszeichnung;
		auszeichnung = newAuszeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__AUSZEICHNUNG, oldAuszeichnung, auszeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassageID() {
		return passageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassageID(String newPassageID) {
		String oldPassageID = passageID;
		passageID = newPassageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__PASSAGE_ID, oldPassageID, passageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType2 newType) {
		TypeType2 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType2 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__AUSZEICHNUNG:
				return getAuszeichnung();
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__PASSAGE_ID:
				return getPassageID();
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__TYPE:
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
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__AUSZEICHNUNG:
				setAuszeichnung(newValue);
				return;
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__PASSAGE_ID:
				setPassageID((String)newValue);
				return;
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__TYPE:
				setType((TypeType2)newValue);
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
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__AUSZEICHNUNG:
				setAuszeichnung(AUSZEICHNUNG_EDEFAULT);
				return;
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__PASSAGE_ID:
				setPassageID(PASSAGE_ID_EDEFAULT);
				return;
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__TYPE:
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
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__AUSZEICHNUNG:
				return AUSZEICHNUNG_EDEFAULT == null ? auszeichnung != null : !AUSZEICHNUNG_EDEFAULT.equals(auszeichnung);
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__PASSAGE_ID:
				return PASSAGE_ID_EDEFAULT == null ? passageID != null : !PASSAGE_ID_EDEFAULT.equals(passageID);
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE__TYPE:
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
		result.append(" (auszeichnung: ");
		result.append(auszeichnung);
		result.append(", passageID: ");
		result.append(passageID);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LeipzigPassageTypeImpl
