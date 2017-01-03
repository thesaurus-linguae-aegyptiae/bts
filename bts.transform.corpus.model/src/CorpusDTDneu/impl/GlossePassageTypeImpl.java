/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.GlossePassageType;
import CorpusDTDneu.TypeType3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glosse Passage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.GlossePassageTypeImpl#getPassageID <em>Passage ID</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlossePassageTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlossePassageTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlossePassageTypeImpl extends MinimalEObjectImpl.Container implements GlossePassageType {
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
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Object script = SCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType3 TYPE_EDEFAULT = TypeType3.START;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType3 type = TYPE_EDEFAULT;

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
	protected GlossePassageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.GLOSSE_PASSAGE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__PASSAGE_ID, oldPassageID, passageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Object newScript) {
		Object oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType3 newType) {
		TypeType3 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType3 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__PASSAGE_ID:
				return getPassageID();
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__SCRIPT:
				return getScript();
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__TYPE:
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
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__PASSAGE_ID:
				setPassageID((String)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__SCRIPT:
				setScript(newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__TYPE:
				setType((TypeType3)newValue);
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
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__PASSAGE_ID:
				setPassageID(PASSAGE_ID_EDEFAULT);
				return;
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__TYPE:
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
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__PASSAGE_ID:
				return PASSAGE_ID_EDEFAULT == null ? passageID != null : !PASSAGE_ID_EDEFAULT.equals(passageID);
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE__TYPE:
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
		result.append(" (passageID: ");
		result.append(passageID);
		result.append(", script: ");
		result.append(script);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GlossePassageTypeImpl
