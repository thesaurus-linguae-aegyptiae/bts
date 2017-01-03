/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.DateThsType;
import CorpusDTDneu.DateType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.DateTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateTypeImpl#getDateThs <em>Date Ths</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateTypeImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateTypeImpl extends MinimalEObjectImpl.Container implements DateType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.DATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CorpusDTDneuPackage.DATE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(CorpusDTDneuPackage.Literals.DATE_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateThsType> getDateThs() {
		return getGroup().list(CorpusDTDneuPackage.Literals.DATE_TYPE__DATE_THS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCode() {
		return getGroup().list(CorpusDTDneuPackage.Literals.DATE_TYPE__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComment() {
		return getGroup().list(CorpusDTDneuPackage.Literals.DATE_TYPE__COMMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.DATE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.DATE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.DATE_TYPE__DATE_THS:
				return ((InternalEList<?>)getDateThs()).basicRemove(otherEnd, msgs);
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
			case CorpusDTDneuPackage.DATE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CorpusDTDneuPackage.DATE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorpusDTDneuPackage.DATE_TYPE__DATE_THS:
				return getDateThs();
			case CorpusDTDneuPackage.DATE_TYPE__CODE:
				return getCode();
			case CorpusDTDneuPackage.DATE_TYPE__COMMENT:
				return getComment();
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
			case CorpusDTDneuPackage.DATE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CorpusDTDneuPackage.DATE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorpusDTDneuPackage.DATE_TYPE__DATE_THS:
				getDateThs().clear();
				getDateThs().addAll((Collection<? extends DateThsType>)newValue);
				return;
			case CorpusDTDneuPackage.DATE_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends String>)newValue);
				return;
			case CorpusDTDneuPackage.DATE_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends String>)newValue);
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
			case CorpusDTDneuPackage.DATE_TYPE__MIXED:
				getMixed().clear();
				return;
			case CorpusDTDneuPackage.DATE_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorpusDTDneuPackage.DATE_TYPE__DATE_THS:
				getDateThs().clear();
				return;
			case CorpusDTDneuPackage.DATE_TYPE__CODE:
				getCode().clear();
				return;
			case CorpusDTDneuPackage.DATE_TYPE__COMMENT:
				getComment().clear();
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
			case CorpusDTDneuPackage.DATE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CorpusDTDneuPackage.DATE_TYPE__GROUP:
				return !getGroup().isEmpty();
			case CorpusDTDneuPackage.DATE_TYPE__DATE_THS:
				return !getDateThs().isEmpty();
			case CorpusDTDneuPackage.DATE_TYPE__CODE:
				return !getCode().isEmpty();
			case CorpusDTDneuPackage.DATE_TYPE__COMMENT:
				return !getComment().isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DateTypeImpl
