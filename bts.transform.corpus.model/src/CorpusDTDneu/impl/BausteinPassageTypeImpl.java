/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.BausteinPassageType;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.TypeType8;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Baustein Passage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.BausteinPassageTypeImpl#getBaustein <em>Baustein</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.BausteinPassageTypeImpl#getPassageID <em>Passage ID</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.BausteinPassageTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BausteinPassageTypeImpl extends MinimalEObjectImpl.Container implements BausteinPassageType {
	/**
	 * The default value of the '{@link #getBaustein() <em>Baustein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaustein()
	 * @generated
	 * @ordered
	 */
	protected static final Object BAUSTEIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaustein() <em>Baustein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaustein()
	 * @generated
	 * @ordered
	 */
	protected Object baustein = BAUSTEIN_EDEFAULT;

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
	protected static final TypeType8 TYPE_EDEFAULT = TypeType8.START;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType8 type = TYPE_EDEFAULT;

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
	protected BausteinPassageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.BAUSTEIN_PASSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBaustein() {
		return baustein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaustein(Object newBaustein) {
		Object oldBaustein = baustein;
		baustein = newBaustein;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__BAUSTEIN, oldBaustein, baustein));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__PASSAGE_ID, oldPassageID, passageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType8 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType8 newType) {
		TypeType8 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType8 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__BAUSTEIN:
				return getBaustein();
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__PASSAGE_ID:
				return getPassageID();
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__TYPE:
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
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__BAUSTEIN:
				setBaustein(newValue);
				return;
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__PASSAGE_ID:
				setPassageID((String)newValue);
				return;
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__TYPE:
				setType((TypeType8)newValue);
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
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__BAUSTEIN:
				setBaustein(BAUSTEIN_EDEFAULT);
				return;
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__PASSAGE_ID:
				setPassageID(PASSAGE_ID_EDEFAULT);
				return;
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__TYPE:
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
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__BAUSTEIN:
				return BAUSTEIN_EDEFAULT == null ? baustein != null : !BAUSTEIN_EDEFAULT.equals(baustein);
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__PASSAGE_ID:
				return PASSAGE_ID_EDEFAULT == null ? passageID != null : !PASSAGE_ID_EDEFAULT.equals(passageID);
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE__TYPE:
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
		result.append(" (baustein: ");
		result.append(baustein);
		result.append(", passageID: ");
		result.append(passageID);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BausteinPassageTypeImpl
