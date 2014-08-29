/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.impl.BTSObjectImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Corpus Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#get_rev <em>rev</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#getReaders <em>Readers</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#is_deleted <em>deleted</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl#getConflictingRevs <em>Conflicting Revs</em>}</li>
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
	 * The default value of the '{@link #get_rev() <em>rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected static final String _REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_rev() <em>rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected String _rev = _REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected String project = PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean locked = LOCKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdaters() <em>Updaters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdaters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> updaters;

	/**
	 * The cached value of the '{@link #getReaders() <em>Readers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> readers;

	/**
	 * The default value of the '{@link #is_deleted() <em>deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is_deleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean _DELETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is_deleted() <em>deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is_deleted()
	 * @generated
	 * @ordered
	 */
	protected boolean _deleted = _DELETED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConflictingRevs() <em>Conflicting Revs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictingRevs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> conflictingRevs;

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
	public String get_rev() {
		return _rev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_rev(String new_rev) {
		String old_rev = _rev;
		_rev = new_rev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__REV, old_rev, _rev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(String newProject) {
		String oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(boolean newLocked) {
		boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUpdaters() {
		if (updaters == null) {
			updaters = new EDataTypeUniqueEList<String>(String.class, this, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__UPDATERS);
		}
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReaders() {
		if (readers == null) {
			readers = new EDataTypeUniqueEList<String>(String.class, this, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__READERS);
		}
		return readers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is_deleted() {
		return _deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_deleted(boolean new_deleted) {
		boolean old_deleted = _deleted;
		_deleted = new_deleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__DELETED, old_deleted, _deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConflictingRevs() {
		if (conflictingRevs == null) {
			conflictingRevs = new EDataTypeUniqueEList<String>(String.class, this, BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CONFLICTING_REVS);
		}
		return conflictingRevs;
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__REV:
				return get_rev();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PROJECT:
				return getProject();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__LOCKED:
				return isLocked();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__UPDATERS:
				return getUpdaters();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__READERS:
				return getReaders();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__DELETED:
				return is_deleted();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CONFLICTING_REVS:
				return getConflictingRevs();
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__REV:
				set_rev((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PROJECT:
				setProject((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((Collection<? extends String>)newValue);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__READERS:
				getReaders().clear();
				getReaders().addAll((Collection<? extends String>)newValue);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__DELETED:
				set_deleted((Boolean)newValue);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CONFLICTING_REVS:
				getConflictingRevs().clear();
				getConflictingRevs().addAll((Collection<? extends String>)newValue);
				return;
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__REV:
				set_rev(_REV_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__UPDATERS:
				getUpdaters().clear();
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__READERS:
				getReaders().clear();
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__DELETED:
				set_deleted(_DELETED_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CONFLICTING_REVS:
				getConflictingRevs().clear();
				return;
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__REV:
				return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__UPDATERS:
				return updaters != null && !updaters.isEmpty();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__READERS:
				return readers != null && !readers.isEmpty();
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__DELETED:
				return _deleted != _DELETED_EDEFAULT;
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CONFLICTING_REVS:
				return conflictingRevs != null && !conflictingRevs.isEmpty();
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BTSDBBaseObject.class) {
			switch (derivedFeatureID) {
				case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__REV: return BtsmodelPackage.BTSDB_BASE_OBJECT__REV;
				case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PROJECT: return BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT;
				case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__LOCKED: return BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED;
				case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__UPDATERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS;
				case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__READERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__READERS;
				case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__DELETED: return BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED;
				case BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CONFLICTING_REVS: return BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BTSDBBaseObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTSDB_BASE_OBJECT__REV: return BtsCorpusModelPackage.BTS_CORPUS_OBJECT__REV;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT: return BtsCorpusModelPackage.BTS_CORPUS_OBJECT__PROJECT;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED: return BtsCorpusModelPackage.BTS_CORPUS_OBJECT__LOCKED;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS: return BtsCorpusModelPackage.BTS_CORPUS_OBJECT__UPDATERS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS: return BtsCorpusModelPackage.BTS_CORPUS_OBJECT__READERS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED: return BtsCorpusModelPackage.BTS_CORPUS_OBJECT__DELETED;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS: return BtsCorpusModelPackage.BTS_CORPUS_OBJECT__CONFLICTING_REVS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BTSDBBaseObject.class) {
			switch (baseOperationID) {
				case BtsmodelPackage.BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY: return BtsCorpusModelPackage.BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY:
				return getDBCollectionKey();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (_rev: ");
		result.append(_rev);
		result.append(", project: ");
		result.append(project);
		result.append(", locked: ");
		result.append(locked);
		result.append(", updaters: ");
		result.append(updaters);
		result.append(", readers: ");
		result.append(readers);
		result.append(", _deleted: ");
		result.append(_deleted);
		result.append(", conflictingRevs: ");
		result.append(conflictingRevs);
		result.append(", corpusPrefix: ");
		result.append(corpusPrefix);
		result.append(", workPhase: ");
		result.append(workPhase);
		result.append(')');
		return result.toString();
	}

} //BTSCorpusObjectImpl
