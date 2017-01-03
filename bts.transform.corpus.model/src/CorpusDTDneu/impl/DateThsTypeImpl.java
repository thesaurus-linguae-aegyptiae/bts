/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.DateThsType;
import CorpusDTDneu.TypeType7;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Ths Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.DateThsTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateThsTypeImpl#getLowerTerm <em>Lower Term</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateThsTypeImpl#getUpperTerm <em>Upper Term</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateThsTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateThsTypeImpl#getYearFrom <em>Year From</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DateThsTypeImpl#getYearTo <em>Year To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateThsTypeImpl extends MinimalEObjectImpl.Container implements DateThsType {
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
	 * The default value of the '{@link #getLowerTerm() <em>Lower Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerTerm() <em>Lower Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerTerm()
	 * @generated
	 * @ordered
	 */
	protected String lowerTerm = LOWER_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperTerm() <em>Upper Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperTerm() <em>Upper Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperTerm()
	 * @generated
	 * @ordered
	 */
	protected String upperTerm = UPPER_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType7 TYPE_EDEFAULT = TypeType7.BTS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType7 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getYearFrom() <em>Year From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Object YEAR_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearFrom() <em>Year From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearFrom()
	 * @generated
	 * @ordered
	 */
	protected Object yearFrom = YEAR_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearTo() <em>Year To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearTo()
	 * @generated
	 * @ordered
	 */
	protected static final Object YEAR_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearTo() <em>Year To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearTo()
	 * @generated
	 * @ordered
	 */
	protected Object yearTo = YEAR_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateThsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.DATE_THS_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.DATE_THS_TYPE__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerTerm() {
		return lowerTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerTerm(String newLowerTerm) {
		String oldLowerTerm = lowerTerm;
		lowerTerm = newLowerTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.DATE_THS_TYPE__LOWER_TERM, oldLowerTerm, lowerTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperTerm() {
		return upperTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperTerm(String newUpperTerm) {
		String oldUpperTerm = upperTerm;
		upperTerm = newUpperTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.DATE_THS_TYPE__UPPER_TERM, oldUpperTerm, upperTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType7 newType) {
		TypeType7 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.DATE_THS_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType7 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.DATE_THS_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public Object getYearFrom() {
		return yearFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearFrom(Object newYearFrom) {
		Object oldYearFrom = yearFrom;
		yearFrom = newYearFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_FROM, oldYearFrom, yearFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getYearTo() {
		return yearTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearTo(Object newYearTo) {
		Object oldYearTo = yearTo;
		yearTo = newYearTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_TO, oldYearTo, yearTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusDTDneuPackage.DATE_THS_TYPE__TERM:
				return getTerm();
			case CorpusDTDneuPackage.DATE_THS_TYPE__LOWER_TERM:
				return getLowerTerm();
			case CorpusDTDneuPackage.DATE_THS_TYPE__UPPER_TERM:
				return getUpperTerm();
			case CorpusDTDneuPackage.DATE_THS_TYPE__TYPE:
				return getType();
			case CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_FROM:
				return getYearFrom();
			case CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_TO:
				return getYearTo();
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
			case CorpusDTDneuPackage.DATE_THS_TYPE__TERM:
				setTerm((String)newValue);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__LOWER_TERM:
				setLowerTerm((String)newValue);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__UPPER_TERM:
				setUpperTerm((String)newValue);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__TYPE:
				setType((TypeType7)newValue);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_FROM:
				setYearFrom(newValue);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_TO:
				setYearTo(newValue);
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
			case CorpusDTDneuPackage.DATE_THS_TYPE__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__LOWER_TERM:
				setLowerTerm(LOWER_TERM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__UPPER_TERM:
				setUpperTerm(UPPER_TERM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__TYPE:
				unsetType();
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_FROM:
				setYearFrom(YEAR_FROM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_TO:
				setYearTo(YEAR_TO_EDEFAULT);
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
			case CorpusDTDneuPackage.DATE_THS_TYPE__TERM:
				return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
			case CorpusDTDneuPackage.DATE_THS_TYPE__LOWER_TERM:
				return LOWER_TERM_EDEFAULT == null ? lowerTerm != null : !LOWER_TERM_EDEFAULT.equals(lowerTerm);
			case CorpusDTDneuPackage.DATE_THS_TYPE__UPPER_TERM:
				return UPPER_TERM_EDEFAULT == null ? upperTerm != null : !UPPER_TERM_EDEFAULT.equals(upperTerm);
			case CorpusDTDneuPackage.DATE_THS_TYPE__TYPE:
				return isSetType();
			case CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_FROM:
				return YEAR_FROM_EDEFAULT == null ? yearFrom != null : !YEAR_FROM_EDEFAULT.equals(yearFrom);
			case CorpusDTDneuPackage.DATE_THS_TYPE__YEAR_TO:
				return YEAR_TO_EDEFAULT == null ? yearTo != null : !YEAR_TO_EDEFAULT.equals(yearTo);
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
		result.append(", lowerTerm: ");
		result.append(lowerTerm);
		result.append(", upperTerm: ");
		result.append(upperTerm);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", yearFrom: ");
		result.append(yearFrom);
		result.append(", yearTo: ");
		result.append(yearTo);
		result.append(')');
		return result.toString();
	}

} //DateThsTypeImpl
