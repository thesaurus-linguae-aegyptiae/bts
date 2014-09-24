/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import org.bbaw.bts.btsmodel.impl.BTSObjectImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Corpus Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#getPassport <em>Passport</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#getCorpusPrefix <em>Corpus Prefix</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#getWorkPhase <em>Work Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSCorpusObjectImpl extends BTSObjectImpl implements BTSCorpusObject {
	/**
	 * The cached value of the '{@link #getPassport() <em>Passport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassport()
	 * @generated
	 * @ordered
	 */
	protected BTSPassport passport;

	/**
	 * The default value of the '{@link #getCorpusPrefix() <em>Corpus Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpusPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPUS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorpusPrefix() <em>Corpus Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpusPrefix()
	 * @generated
	 * @ordered
	 */
	protected String corpusPrefix = CORPUS_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkPhase() <em>Work Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkPhase() <em>Work Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkPhase()
	 * @generated
	 * @ordered
	 */
	protected String workPhase = WORK_PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSCorpusObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_CORPUS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassport getPassport() {
		return passport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassport(BTSPassport newPassport, NotificationChain msgs) {
		BTSPassport oldPassport = passport;
		passport = newPassport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT, oldPassport, newPassport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassport(BTSPassport newPassport) {
		if (newPassport != passport) {
			NotificationChain msgs = null;
			if (passport != null)
				msgs = ((InternalEObject)passport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT, null, msgs);
			if (newPassport != null)
				msgs = ((InternalEObject)newPassport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT, null, msgs);
			msgs = basicSetPassport(newPassport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT, newPassport, newPassport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorpusPrefix() {
		return corpusPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorpusPrefix(String newCorpusPrefix) {
		String oldCorpusPrefix = corpusPrefix;
		corpusPrefix = newCorpusPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX, oldCorpusPrefix, corpusPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkPhase() {
		return workPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkPhase(String newWorkPhase) {
		String oldWorkPhase = workPhase;
		workPhase = newWorkPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__WORK_PHASE, oldWorkPhase, workPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public String getDBCollectionKey() {
		if (this instanceof BTSTextCorpus)
		{
			return getProject() + "_corpus";
		}
		else
		{
			return getProject() + "_corpus_" + getCorpusPrefix();
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return basicSetPassport(null, msgs);
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return getPassport();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX:
				return getCorpusPrefix();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__WORK_PHASE:
				return getWorkPhase();
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				setPassport((BTSPassport)newValue);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX:
				setCorpusPrefix((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__WORK_PHASE:
				setWorkPhase((String)newValue);
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				setPassport((BTSPassport)null);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX:
				setCorpusPrefix(CORPUS_PREFIX_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__WORK_PHASE:
				setWorkPhase(WORK_PHASE_EDEFAULT);
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return passport != null;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX:
				return CORPUS_PREFIX_EDEFAULT == null ? corpusPrefix != null : !CORPUS_PREFIX_EDEFAULT.equals(corpusPrefix);
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__WORK_PHASE:
				return WORK_PHASE_EDEFAULT == null ? workPhase != null : !WORK_PHASE_EDEFAULT.equals(workPhase);
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
		result.append(" (corpusPrefix: ");
		result.append(corpusPrefix);
		result.append(", workPhase: ");
		result.append(workPhase);
		result.append(')');
		return result.toString();
	}

} //BTSCorpusObjectImpl
