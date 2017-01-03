/**
 */
package Btsaux.impl;

import Btsaux.BtsauxPackage;
import Btsaux.ThsdataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thsdata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getEterm <em>Eterm</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getTermsort <em>Termsort</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getThsct <em>Thsct</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getThslock <em>Thslock</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getThsowner <em>Thsowner</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getThssort <em>Thssort</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getThsstrg <em>Thsstrg</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getThstype <em>Thstype</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getYearfrom <em>Yearfrom</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getYearto <em>Yearto</em>}</li>
 *   <li>{@link Btsaux.impl.ThsdataTypeImpl#getSubtype <em>Subtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThsdataTypeImpl extends MinimalEObjectImpl.Container implements ThsdataType {
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
	 * The default value of the '{@link #getEterm() <em>Eterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEterm()
	 * @generated
	 * @ordered
	 */
	protected static final Object ETERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEterm() <em>Eterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEterm()
	 * @generated
	 * @ordered
	 */
	protected Object eterm = ETERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final Object TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected Object term = TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermsort() <em>Termsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsort()
	 * @generated
	 * @ordered
	 */
	protected static final Object TERMSORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermsort() <em>Termsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsort()
	 * @generated
	 * @ordered
	 */
	protected Object termsort = TERMSORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThsct() <em>Thsct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThsct()
	 * @generated
	 * @ordered
	 */
	protected static final String THSCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThsct() <em>Thsct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThsct()
	 * @generated
	 * @ordered
	 */
	protected String thsct = THSCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThslock() <em>Thslock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThslock()
	 * @generated
	 * @ordered
	 */
	protected static final String THSLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThslock() <em>Thslock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThslock()
	 * @generated
	 * @ordered
	 */
	protected String thslock = THSLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getThsowner() <em>Thsowner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThsowner()
	 * @generated
	 * @ordered
	 */
	protected static final String THSOWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThsowner() <em>Thsowner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThsowner()
	 * @generated
	 * @ordered
	 */
	protected String thsowner = THSOWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getThssort() <em>Thssort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThssort()
	 * @generated
	 * @ordered
	 */
	protected static final String THSSORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThssort() <em>Thssort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThssort()
	 * @generated
	 * @ordered
	 */
	protected String thssort = THSSORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThsstrg() <em>Thsstrg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThsstrg()
	 * @generated
	 * @ordered
	 */
	protected static final Object THSSTRG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThsstrg() <em>Thsstrg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThsstrg()
	 * @generated
	 * @ordered
	 */
	protected Object thsstrg = THSSTRG_EDEFAULT;

	/**
	 * The default value of the '{@link #getThstype() <em>Thstype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThstype()
	 * @generated
	 * @ordered
	 */
	protected static final String THSTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThstype() <em>Thstype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThstype()
	 * @generated
	 * @ordered
	 */
	protected String thstype = THSTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearfrom() <em>Yearfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearfrom()
	 * @generated
	 * @ordered
	 */
	protected static final String YEARFROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearfrom() <em>Yearfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearfrom()
	 * @generated
	 * @ordered
	 */
	protected String yearfrom = YEARFROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearto() <em>Yearto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearto()
	 * @generated
	 * @ordered
	 */
	protected static final String YEARTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearto() <em>Yearto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearto()
	 * @generated
	 * @ordered
	 */
	protected String yearto = YEARTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThsdataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsauxPackage.Literals.THSDATA_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEterm() {
		return eterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEterm(Object newEterm) {
		Object oldEterm = eterm;
		eterm = newEterm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__ETERM, oldEterm, eterm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(Object newTerm) {
		Object oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTermsort() {
		return termsort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsort(Object newTermsort) {
		Object oldTermsort = termsort;
		termsort = newTermsort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__TERMSORT, oldTermsort, termsort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThsct() {
		return thsct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThsct(String newThsct) {
		String oldThsct = thsct;
		thsct = newThsct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__THSCT, oldThsct, thsct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThslock() {
		return thslock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThslock(String newThslock) {
		String oldThslock = thslock;
		thslock = newThslock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__THSLOCK, oldThslock, thslock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThsowner() {
		return thsowner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThsowner(String newThsowner) {
		String oldThsowner = thsowner;
		thsowner = newThsowner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__THSOWNER, oldThsowner, thsowner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThssort() {
		return thssort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThssort(String newThssort) {
		String oldThssort = thssort;
		thssort = newThssort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__THSSORT, oldThssort, thssort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getThsstrg() {
		return thsstrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThsstrg(Object newThsstrg) {
		Object oldThsstrg = thsstrg;
		thsstrg = newThsstrg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__THSSTRG, oldThsstrg, thsstrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThstype() {
		return thstype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThstype(String newThstype) {
		String oldThstype = thstype;
		thstype = newThstype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__THSTYPE, oldThstype, thstype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYearfrom() {
		return yearfrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearfrom(String newYearfrom) {
		String oldYearfrom = yearfrom;
		yearfrom = newYearfrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__YEARFROM, oldYearfrom, yearfrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYearto() {
		return yearto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearto(String newYearto) {
		String oldYearto = yearto;
		yearto = newYearto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__YEARTO, oldYearto, yearto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.THSDATA_TYPE__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsauxPackage.THSDATA_TYPE__COMMENT:
				return getComment();
			case BtsauxPackage.THSDATA_TYPE__ETERM:
				return getEterm();
			case BtsauxPackage.THSDATA_TYPE__TERM:
				return getTerm();
			case BtsauxPackage.THSDATA_TYPE__TERMSORT:
				return getTermsort();
			case BtsauxPackage.THSDATA_TYPE__THSCT:
				return getThsct();
			case BtsauxPackage.THSDATA_TYPE__THSLOCK:
				return getThslock();
			case BtsauxPackage.THSDATA_TYPE__THSOWNER:
				return getThsowner();
			case BtsauxPackage.THSDATA_TYPE__THSSORT:
				return getThssort();
			case BtsauxPackage.THSDATA_TYPE__THSSTRG:
				return getThsstrg();
			case BtsauxPackage.THSDATA_TYPE__THSTYPE:
				return getThstype();
			case BtsauxPackage.THSDATA_TYPE__YEARFROM:
				return getYearfrom();
			case BtsauxPackage.THSDATA_TYPE__YEARTO:
				return getYearto();
			case BtsauxPackage.THSDATA_TYPE__SUBTYPE:
				return getSubtype();
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
			case BtsauxPackage.THSDATA_TYPE__COMMENT:
				setComment(newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__ETERM:
				setEterm(newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__TERM:
				setTerm(newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__TERMSORT:
				setTermsort(newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSCT:
				setThsct((String)newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSLOCK:
				setThslock((String)newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSOWNER:
				setThsowner((String)newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSSORT:
				setThssort((String)newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSSTRG:
				setThsstrg(newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSTYPE:
				setThstype((String)newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__YEARFROM:
				setYearfrom((String)newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__YEARTO:
				setYearto((String)newValue);
				return;
			case BtsauxPackage.THSDATA_TYPE__SUBTYPE:
				setSubtype((String)newValue);
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
			case BtsauxPackage.THSDATA_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__ETERM:
				setEterm(ETERM_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__TERMSORT:
				setTermsort(TERMSORT_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSCT:
				setThsct(THSCT_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSLOCK:
				setThslock(THSLOCK_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSOWNER:
				setThsowner(THSOWNER_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSSORT:
				setThssort(THSSORT_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSSTRG:
				setThsstrg(THSSTRG_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__THSTYPE:
				setThstype(THSTYPE_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__YEARFROM:
				setYearfrom(YEARFROM_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__YEARTO:
				setYearto(YEARTO_EDEFAULT);
				return;
			case BtsauxPackage.THSDATA_TYPE__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
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
			case BtsauxPackage.THSDATA_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BtsauxPackage.THSDATA_TYPE__ETERM:
				return ETERM_EDEFAULT == null ? eterm != null : !ETERM_EDEFAULT.equals(eterm);
			case BtsauxPackage.THSDATA_TYPE__TERM:
				return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
			case BtsauxPackage.THSDATA_TYPE__TERMSORT:
				return TERMSORT_EDEFAULT == null ? termsort != null : !TERMSORT_EDEFAULT.equals(termsort);
			case BtsauxPackage.THSDATA_TYPE__THSCT:
				return THSCT_EDEFAULT == null ? thsct != null : !THSCT_EDEFAULT.equals(thsct);
			case BtsauxPackage.THSDATA_TYPE__THSLOCK:
				return THSLOCK_EDEFAULT == null ? thslock != null : !THSLOCK_EDEFAULT.equals(thslock);
			case BtsauxPackage.THSDATA_TYPE__THSOWNER:
				return THSOWNER_EDEFAULT == null ? thsowner != null : !THSOWNER_EDEFAULT.equals(thsowner);
			case BtsauxPackage.THSDATA_TYPE__THSSORT:
				return THSSORT_EDEFAULT == null ? thssort != null : !THSSORT_EDEFAULT.equals(thssort);
			case BtsauxPackage.THSDATA_TYPE__THSSTRG:
				return THSSTRG_EDEFAULT == null ? thsstrg != null : !THSSTRG_EDEFAULT.equals(thsstrg);
			case BtsauxPackage.THSDATA_TYPE__THSTYPE:
				return THSTYPE_EDEFAULT == null ? thstype != null : !THSTYPE_EDEFAULT.equals(thstype);
			case BtsauxPackage.THSDATA_TYPE__YEARFROM:
				return YEARFROM_EDEFAULT == null ? yearfrom != null : !YEARFROM_EDEFAULT.equals(yearfrom);
			case BtsauxPackage.THSDATA_TYPE__YEARTO:
				return YEARTO_EDEFAULT == null ? yearto != null : !YEARTO_EDEFAULT.equals(yearto);
			case BtsauxPackage.THSDATA_TYPE__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", eterm: ");
		result.append(eterm);
		result.append(", term: ");
		result.append(term);
		result.append(", termsort: ");
		result.append(termsort);
		result.append(", thsct: ");
		result.append(thsct);
		result.append(", thslock: ");
		result.append(thslock);
		result.append(", thsowner: ");
		result.append(thsowner);
		result.append(", thssort: ");
		result.append(thssort);
		result.append(", thsstrg: ");
		result.append(thsstrg);
		result.append(", thstype: ");
		result.append(thstype);
		result.append(", yearfrom: ");
		result.append(yearfrom);
		result.append(", yearto: ");
		result.append(yearto);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(')');
		return result.toString();
	}

} //ThsdataTypeImpl
