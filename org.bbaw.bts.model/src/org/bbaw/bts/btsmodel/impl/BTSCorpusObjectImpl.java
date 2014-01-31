/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTS Corpus Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#get_rev <em>rev</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getReaders <em>Readers</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getPassport <em>Passport</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getCorpusPrefix <em>Corpus Prefix</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getWorkPhase <em>Work Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSCorpusObjectImpl extends BTSObjectImpl implements BTSCorpusObject
{

	private List<PropertyChangeListener> propertyChangeListeners = new ArrayList<PropertyChangeListener>();
	/**
	 * The default value of the '{@link #get_id() <em>id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #get_id() <em>id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected String _id = _ID_EDEFAULT;
	/**
	 * The default value of the '{@link #get_rev() <em>rev</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected static final String _REV_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #get_rev() <em>rev</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected String _rev = _REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSRelation> relations;

	/**
	 * The cached value of the '{@link #getPassport() <em>Passport</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassport()
	 * @generated
	 * @ordered
	 */
	protected BTSPassport passport;

	/**
	 * The default value of the '{@link #getCorpusPrefix() <em>Corpus Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCorpusPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPUS_PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCorpusPrefix() <em>Corpus Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCorpusPrefix()
	 * @generated
	 * @ordered
	 */
	protected String corpusPrefix = CORPUS_PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getWorkPhase() <em>Work Phase</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWorkPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_PHASE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWorkPhase() <em>Work Phase</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWorkPhase()
	 * @generated
	 * @ordered
	 */
	protected String workPhase = WORK_PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSCorpusObjectImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BtsmodelPackage.Literals.BTS_CORPUS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id()
	{
		return _id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id)
	{
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String get_rev()
	{
		return _rev;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void set_rev(String new_rev)
	{
		String old_rev = _rev;
		_rev = new_rev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__REV, old_rev, _rev));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject()
	{
		return project;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(String newProject)
	{
		String oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocked()
	{
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(boolean newLocked)
	{
		boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUpdaters()
	{
		if (updaters == null) {
			updaters = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_CORPUS_OBJECT__UPDATERS);
		}
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReaders()
	{
		if (readers == null) {
			readers = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_CORPUS_OBJECT__READERS);
		}
		return readers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSRelation> getRelations()
	{
		if (relations == null) {
			relations = new EObjectContainmentEList<BTSRelation>(BTSRelation.class, this, BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassport getPassport()
	{
		return passport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassport(BTSPassport newPassport, NotificationChain msgs)
	{
		BTSPassport oldPassport = passport;
		passport = newPassport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT, oldPassport, newPassport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassport(BTSPassport newPassport)
	{
		if (newPassport != passport) {
			NotificationChain msgs = null;
			if (passport != null)
				msgs = ((InternalEObject)passport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT, null, msgs);
			if (newPassport != null)
				msgs = ((InternalEObject)newPassport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT, null, msgs);
			msgs = basicSetPassport(newPassport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT, newPassport, newPassport));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorpusPrefix()
	{
		return corpusPrefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorpusPrefix(String newCorpusPrefix)
	{
		String oldCorpusPrefix = corpusPrefix;
		corpusPrefix = newCorpusPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX, oldCorpusPrefix, corpusPrefix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkPhase()
	{
		return workPhase;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkPhase(String newWorkPhase)
	{
		String oldWorkPhase = workPhase;
		workPhase = newWorkPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__WORK_PHASE, oldWorkPhase, workPhase));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		if (propertyChangeListener != null)
		{
			if (!propertyChangeListeners.contains(propertyChangeListener))
			{
				propertyChangeListeners.add(propertyChangeListener);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		propertyChangeListeners.remove(propertyChangeListener);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return basicSetPassport(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_CORPUS_OBJECT__ID:
				return get_id();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__REV:
				return get_rev();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PROJECT:
				return getProject();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LOCKED:
				return isLocked();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__UPDATERS:
				return getUpdaters();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__READERS:
				return getReaders();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				return getRelations();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return getPassport();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX:
				return getCorpusPrefix();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__WORK_PHASE:
				return getWorkPhase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_CORPUS_OBJECT__ID:
				set_id((String)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__REV:
				set_rev((String)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PROJECT:
				setProject((String)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__READERS:
				getReaders().clear();
				getReaders().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends BTSRelation>)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				setPassport((BTSPassport)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX:
				setCorpusPrefix((String)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__WORK_PHASE:
				setWorkPhase((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_CORPUS_OBJECT__ID:
				set_id(_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__REV:
				set_rev(_REV_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__UPDATERS:
				getUpdaters().clear();
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__READERS:
				getReaders().clear();
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				getRelations().clear();
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				setPassport((BTSPassport)null);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX:
				setCorpusPrefix(CORPUS_PREFIX_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__WORK_PHASE:
				setWorkPhase(WORK_PHASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_CORPUS_OBJECT__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__REV:
				return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__UPDATERS:
				return updaters != null && !updaters.isEmpty();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__READERS:
				return readers != null && !readers.isEmpty();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				return relations != null && !relations.isEmpty();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return passport != null;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__CORPUS_PREFIX:
				return CORPUS_PREFIX_EDEFAULT == null ? corpusPrefix != null : !CORPUS_PREFIX_EDEFAULT.equals(corpusPrefix);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__WORK_PHASE:
				return WORK_PHASE_EDEFAULT == null ? workPhase != null : !WORK_PHASE_EDEFAULT.equals(workPhase);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == BTSIdentifiableItem.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CORPUS_OBJECT__ID: return BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CORPUS_OBJECT__REV: return BtsmodelPackage.BTSDB_BASE_OBJECT__REV;
				case BtsmodelPackage.BTS_CORPUS_OBJECT__PROJECT: return BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT;
				case BtsmodelPackage.BTS_CORPUS_OBJECT__LOCKED: return BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED;
				case BtsmodelPackage.BTS_CORPUS_OBJECT__UPDATERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS;
				case BtsmodelPackage.BTS_CORPUS_OBJECT__READERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__READERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == BTSIdentifiableItem.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID: return BtsmodelPackage.BTS_CORPUS_OBJECT__ID;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTSDB_BASE_OBJECT__REV: return BtsmodelPackage.BTS_CORPUS_OBJECT__REV;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT: return BtsmodelPackage.BTS_CORPUS_OBJECT__PROJECT;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED: return BtsmodelPackage.BTS_CORPUS_OBJECT__LOCKED;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS: return BtsmodelPackage.BTS_CORPUS_OBJECT__UPDATERS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS: return BtsmodelPackage.BTS_CORPUS_OBJECT__READERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (_id: ");
		result.append(_id);
		result.append(", _rev: ");
		result.append(_rev);
		result.append(", project: ");
		result.append(project);
		result.append(", locked: ");
		result.append(locked);
		result.append(", updaters: ");
		result.append(updaters);
		result.append(", readers: ");
		result.append(readers);
		result.append(", corpusPrefix: ");
		result.append(corpusPrefix);
		result.append(", workPhase: ");
		result.append(workPhase);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof BTSDBBaseObject)
		{
			BTSDBBaseObject o = (BTSDBBaseObject) obj;
			if (o.get_id() == null || this.get_id() == null)
			{
				return false;
			}
			return this.get_id().equals(o.get_id());
		}
		return false;
	}
} // BTSCorpusObjectImpl
