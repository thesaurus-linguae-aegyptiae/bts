/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgySentType;
import CorpusDTDneu.EgySzenarioType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Egy Szenario Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.EgySzenarioTypeImpl#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySzenarioTypeImpl#getInterneNummer <em>Interne Nummer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EgySzenarioTypeImpl extends MinimalEObjectImpl.Container implements EgySzenarioType {
	/**
	 * The cached value of the '{@link #getEgySent() <em>Egy Sent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgySent()
	 * @generated
	 * @ordered
	 */
	protected EList<EgySentType> egySent;

	/**
	 * The default value of the '{@link #getInterneNummer() <em>Interne Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterneNummer()
	 * @generated
	 * @ordered
	 */
	protected static final Object INTERNE_NUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterneNummer() <em>Interne Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterneNummer()
	 * @generated
	 * @ordered
	 */
	protected Object interneNummer = INTERNE_NUMMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EgySzenarioTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.EGY_SZENARIO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgySentType> getEgySent() {
		if (egySent == null) {
			egySent = new EObjectContainmentEList<EgySentType>(EgySentType.class, this, CorpusDTDneuPackage.EGY_SZENARIO_TYPE__EGY_SENT);
		}
		return egySent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInterneNummer() {
		return interneNummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterneNummer(Object newInterneNummer) {
		Object oldInterneNummer = interneNummer;
		interneNummer = newInterneNummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SZENARIO_TYPE__INTERNE_NUMMER, oldInterneNummer, interneNummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__EGY_SENT:
				return ((InternalEList<?>)getEgySent()).basicRemove(otherEnd, msgs);
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
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__EGY_SENT:
				return getEgySent();
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__INTERNE_NUMMER:
				return getInterneNummer();
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
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__EGY_SENT:
				getEgySent().clear();
				getEgySent().addAll((Collection<? extends EgySentType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__INTERNE_NUMMER:
				setInterneNummer(newValue);
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
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__EGY_SENT:
				getEgySent().clear();
				return;
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__INTERNE_NUMMER:
				setInterneNummer(INTERNE_NUMMER_EDEFAULT);
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
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__EGY_SENT:
				return egySent != null && !egySent.isEmpty();
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE__INTERNE_NUMMER:
				return INTERNE_NUMMER_EDEFAULT == null ? interneNummer != null : !INTERNE_NUMMER_EDEFAULT.equals(interneNummer);
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
		result.append(" (interneNummer: ");
		result.append(interneNummer);
		result.append(')');
		return result.toString();
	}

} //EgySzenarioTypeImpl
