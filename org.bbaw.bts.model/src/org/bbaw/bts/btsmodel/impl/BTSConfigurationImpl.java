/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getState <em>State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getRevisionState <em>Revision State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#get_rev <em>rev</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getReaders <em>Readers</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#is_deleted <em>deleted</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getConflictingRevs <em>Conflicting Revs</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getDBCollectionKey <em>DB Collection Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getTempSortKey <em>Temp Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSConfigurationImpl extends BTSConfigImpl implements BTSConfiguration {
	/**
	 * The default value of the '{@link #getPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyChangeSupport PROPERTY_CHANGE_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected PropertyChangeSupport propertyChangeSupport = PROPERTY_CHANGE_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #get_id() <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_id() <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected String _id = _ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionState() <em>Revision State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionState()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionState() <em>Revision State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionState()
	 * @generated
	 * @ordered
	 */
	protected String revisionState = REVISION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> revisions;

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
	 * The default value of the '{@link #getDBCollectionKey() <em>DB Collection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBCollectionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_COLLECTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDBCollectionKey() <em>DB Collection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBCollectionKey()
	 * @generated
	 * @ordered
	 */
	protected String dBCollectionKey = DB_COLLECTION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected int sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSRelation> relations;

	/**
	 * The default value of the '{@link #getTempSortKey() <em>Temp Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMP_SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempSortKey() <em>Temp Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempSortKey()
	 * @generated
	 * @ordered
	 */
	protected int tempSortKey = TEMP_SORT_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSExternalReference> externalReferences;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRevisions() {
		if (revisions == null) {
			revisions = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_CONFIGURATION__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevisionState() {
		return revisionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionState(String newRevisionState) {
		String oldRevisionState = revisionState;
		revisionState = newRevisionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__REVISION_STATE, oldRevisionState, revisionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__VISIBILITY, oldVisibility, visibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__REV, old_rev, _rev));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__PROJECT, oldProject, project));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUpdaters() {
		if (updaters == null) {
			updaters = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_CONFIGURATION__UPDATERS);
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
			readers = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_CONFIGURATION__READERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__DELETED, old_deleted, _deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConflictingRevs() {
		if (conflictingRevs == null) {
			conflictingRevs = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_CONFIGURATION__CONFLICTING_REVS);
		}
		return conflictingRevs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortKey()
	{
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(int newSortKey)
	{
		int oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeSupport getPropertyChangeSupport()
	{
		return propertyChangeSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyChangeSupport(PropertyChangeSupport newPropertyChangeSupport)
	{
		PropertyChangeSupport oldPropertyChangeSupport = propertyChangeSupport;
		propertyChangeSupport = newPropertyChangeSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id) {
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType)
	{
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype()
	{
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype)
	{
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode)
	{
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<BTSRelation>(BTSRelation.class, this, BtsmodelPackage.BTS_CONFIGURATION__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTempSortKey() {
		return tempSortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempSortKey(int newTempSortKey) {
		int oldTempSortKey = tempSortKey;
		tempSortKey = newTempSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__TEMP_SORT_KEY, oldTempSortKey, tempSortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSExternalReference> getExternalReferences() {
		if (externalReferences == null) {
			externalReferences = new EObjectContainmentEList<BTSExternalReference>(BTSExternalReference.class, this, BtsmodelPackage.BTS_CONFIGURATION__EXTERNAL_REFERENCES);
		}
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider()
	{
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider)
	{
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public void addRevision(BTSRevision revision) {
		String rev = revision.toRevisionString();
		getRevisions().add(rev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public void addRevision(int rev, Date timestamp, String userId) {
		BTSRevision revision = BtsmodelFactory.eINSTANCE.createBTSRevision(rev, timestamp, userId);
		addRevision(revision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public BTSRevision getRevision(int revisionIndex) {
		String rev = getRevisions().get(revisionIndex);
		BTSRevision revision = BtsmodelFactory.eINSTANCE.createBTSRevision(rev);
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public BTSRevision getLastRevision() {
		String rev = getRevisions().get(getRevisions().size() -1);
		BTSRevision revision = BtsmodelFactory.eINSTANCE.createBTSRevision(rev);
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_CONFIGURATION__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_CONFIGURATION__EXTERNAL_REFERENCES:
				return ((InternalEList<?>)getExternalReferences()).basicRemove(otherEnd, msgs);
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
			case BtsmodelPackage.BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT:
				return getPropertyChangeSupport();
			case BtsmodelPackage.BTS_CONFIGURATION__ID:
				return get_id();
			case BtsmodelPackage.BTS_CONFIGURATION__STATE:
				return getState();
			case BtsmodelPackage.BTS_CONFIGURATION__REVISION_STATE:
				return getRevisionState();
			case BtsmodelPackage.BTS_CONFIGURATION__VISIBILITY:
				return getVisibility();
			case BtsmodelPackage.BTS_CONFIGURATION__REVISIONS:
				return getRevisions();
			case BtsmodelPackage.BTS_CONFIGURATION__REV:
				return get_rev();
			case BtsmodelPackage.BTS_CONFIGURATION__PROJECT:
				return getProject();
			case BtsmodelPackage.BTS_CONFIGURATION__LOCKED:
				return isLocked();
			case BtsmodelPackage.BTS_CONFIGURATION__UPDATERS:
				return getUpdaters();
			case BtsmodelPackage.BTS_CONFIGURATION__READERS:
				return getReaders();
			case BtsmodelPackage.BTS_CONFIGURATION__DELETED:
				return is_deleted();
			case BtsmodelPackage.BTS_CONFIGURATION__CONFLICTING_REVS:
				return getConflictingRevs();
			case BtsmodelPackage.BTS_CONFIGURATION__DB_COLLECTION_KEY:
				return getDBCollectionKey();
			case BtsmodelPackage.BTS_CONFIGURATION__SORT_KEY:
				return getSortKey();
			case BtsmodelPackage.BTS_CONFIGURATION__NAME:
				return getName();
			case BtsmodelPackage.BTS_CONFIGURATION__TYPE:
				return getType();
			case BtsmodelPackage.BTS_CONFIGURATION__SUBTYPE:
				return getSubtype();
			case BtsmodelPackage.BTS_CONFIGURATION__CODE:
				return getCode();
			case BtsmodelPackage.BTS_CONFIGURATION__RELATIONS:
				return getRelations();
			case BtsmodelPackage.BTS_CONFIGURATION__TEMP_SORT_KEY:
				return getTempSortKey();
			case BtsmodelPackage.BTS_CONFIGURATION__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BtsmodelPackage.BTS_CONFIGURATION__PROVIDER:
				return getProvider();
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
			case BtsmodelPackage.BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((PropertyChangeSupport)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__ID:
				set_id((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__STATE:
				setState((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__REVISION_STATE:
				setRevisionState((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__REV:
				set_rev((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__PROJECT:
				setProject((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__READERS:
				getReaders().clear();
				getReaders().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__DELETED:
				set_deleted((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__CONFLICTING_REVS:
				getConflictingRevs().clear();
				getConflictingRevs().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__DB_COLLECTION_KEY:
				setDBCollectionKey((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__SORT_KEY:
				setSortKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__TYPE:
				setType((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__CODE:
				setCode((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends BTSRelation>)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__TEMP_SORT_KEY:
				setTempSortKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				getExternalReferences().addAll((Collection<? extends BTSExternalReference>)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__PROVIDER:
				setProvider((String)newValue);
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
			case BtsmodelPackage.BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__ID:
				set_id(_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__REVISION_STATE:
				setRevisionState(REVISION_STATE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__REVISIONS:
				getRevisions().clear();
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__REV:
				set_rev(_REV_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__UPDATERS:
				getUpdaters().clear();
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__READERS:
				getReaders().clear();
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__DELETED:
				set_deleted(_DELETED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__CONFLICTING_REVS:
				getConflictingRevs().clear();
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__DB_COLLECTION_KEY:
				setDBCollectionKey(DB_COLLECTION_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__RELATIONS:
				getRelations().clear();
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__TEMP_SORT_KEY:
				setTempSortKey(TEMP_SORT_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				return;
			case BtsmodelPackage.BTS_CONFIGURATION__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
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
			case BtsmodelPackage.BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT:
				return PROPERTY_CHANGE_SUPPORT_EDEFAULT == null ? propertyChangeSupport != null : !PROPERTY_CHANGE_SUPPORT_EDEFAULT.equals(propertyChangeSupport);
			case BtsmodelPackage.BTS_CONFIGURATION__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case BtsmodelPackage.BTS_CONFIGURATION__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case BtsmodelPackage.BTS_CONFIGURATION__REVISION_STATE:
				return REVISION_STATE_EDEFAULT == null ? revisionState != null : !REVISION_STATE_EDEFAULT.equals(revisionState);
			case BtsmodelPackage.BTS_CONFIGURATION__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case BtsmodelPackage.BTS_CONFIGURATION__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case BtsmodelPackage.BTS_CONFIGURATION__REV:
				return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
			case BtsmodelPackage.BTS_CONFIGURATION__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case BtsmodelPackage.BTS_CONFIGURATION__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case BtsmodelPackage.BTS_CONFIGURATION__UPDATERS:
				return updaters != null && !updaters.isEmpty();
			case BtsmodelPackage.BTS_CONFIGURATION__READERS:
				return readers != null && !readers.isEmpty();
			case BtsmodelPackage.BTS_CONFIGURATION__DELETED:
				return _deleted != _DELETED_EDEFAULT;
			case BtsmodelPackage.BTS_CONFIGURATION__CONFLICTING_REVS:
				return conflictingRevs != null && !conflictingRevs.isEmpty();
			case BtsmodelPackage.BTS_CONFIGURATION__DB_COLLECTION_KEY:
				return DB_COLLECTION_KEY_EDEFAULT == null ? dBCollectionKey != null : !DB_COLLECTION_KEY_EDEFAULT.equals(dBCollectionKey);
			case BtsmodelPackage.BTS_CONFIGURATION__SORT_KEY:
				return sortKey != SORT_KEY_EDEFAULT;
			case BtsmodelPackage.BTS_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BtsmodelPackage.BTS_CONFIGURATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsmodelPackage.BTS_CONFIGURATION__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case BtsmodelPackage.BTS_CONFIGURATION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case BtsmodelPackage.BTS_CONFIGURATION__RELATIONS:
				return relations != null && !relations.isEmpty();
			case BtsmodelPackage.BTS_CONFIGURATION__TEMP_SORT_KEY:
				return tempSortKey != TEMP_SORT_KEY_EDEFAULT;
			case BtsmodelPackage.BTS_CONFIGURATION__EXTERNAL_REFERENCES:
				return externalReferences != null && !externalReferences.isEmpty();
			case BtsmodelPackage.BTS_CONFIGURATION__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
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
		if (baseClass == BTSObservableObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == BTSIdentifiableItem.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CONFIGURATION__ID: return BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CONFIGURATION__STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE;
				case BtsmodelPackage.BTS_CONFIGURATION__REVISION_STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE;
				case BtsmodelPackage.BTS_CONFIGURATION__VISIBILITY: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY;
				case BtsmodelPackage.BTS_CONFIGURATION__REVISIONS: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CONFIGURATION__REV: return BtsmodelPackage.BTSDB_BASE_OBJECT__REV;
				case BtsmodelPackage.BTS_CONFIGURATION__PROJECT: return BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT;
				case BtsmodelPackage.BTS_CONFIGURATION__LOCKED: return BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED;
				case BtsmodelPackage.BTS_CONFIGURATION__UPDATERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS;
				case BtsmodelPackage.BTS_CONFIGURATION__READERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__READERS;
				case BtsmodelPackage.BTS_CONFIGURATION__DELETED: return BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED;
				case BtsmodelPackage.BTS_CONFIGURATION__CONFLICTING_REVS: return BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS;
				case BtsmodelPackage.BTS_CONFIGURATION__DB_COLLECTION_KEY: return BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY;
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CONFIGURATION__SORT_KEY: return BtsmodelPackage.BTS_OBJECT__SORT_KEY;
				case BtsmodelPackage.BTS_CONFIGURATION__NAME: return BtsmodelPackage.BTS_OBJECT__NAME;
				case BtsmodelPackage.BTS_CONFIGURATION__TYPE: return BtsmodelPackage.BTS_OBJECT__TYPE;
				case BtsmodelPackage.BTS_CONFIGURATION__SUBTYPE: return BtsmodelPackage.BTS_OBJECT__SUBTYPE;
				case BtsmodelPackage.BTS_CONFIGURATION__CODE: return BtsmodelPackage.BTS_OBJECT__CODE;
				case BtsmodelPackage.BTS_CONFIGURATION__RELATIONS: return BtsmodelPackage.BTS_OBJECT__RELATIONS;
				case BtsmodelPackage.BTS_CONFIGURATION__TEMP_SORT_KEY: return BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY;
				case BtsmodelPackage.BTS_CONFIGURATION__EXTERNAL_REFERENCES: return BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES;
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
		if (baseClass == BTSObservableObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == BTSIdentifiableItem.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID: return BtsmodelPackage.BTS_CONFIGURATION__ID;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE: return BtsmodelPackage.BTS_CONFIGURATION__STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE: return BtsmodelPackage.BTS_CONFIGURATION__REVISION_STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY: return BtsmodelPackage.BTS_CONFIGURATION__VISIBILITY;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS: return BtsmodelPackage.BTS_CONFIGURATION__REVISIONS;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTSDB_BASE_OBJECT__REV: return BtsmodelPackage.BTS_CONFIGURATION__REV;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT: return BtsmodelPackage.BTS_CONFIGURATION__PROJECT;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED: return BtsmodelPackage.BTS_CONFIGURATION__LOCKED;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS: return BtsmodelPackage.BTS_CONFIGURATION__UPDATERS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS: return BtsmodelPackage.BTS_CONFIGURATION__READERS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED: return BtsmodelPackage.BTS_CONFIGURATION__DELETED;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS: return BtsmodelPackage.BTS_CONFIGURATION__CONFLICTING_REVS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY: return BtsmodelPackage.BTS_CONFIGURATION__DB_COLLECTION_KEY;
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_OBJECT__SORT_KEY: return BtsmodelPackage.BTS_CONFIGURATION__SORT_KEY;
				case BtsmodelPackage.BTS_OBJECT__NAME: return BtsmodelPackage.BTS_CONFIGURATION__NAME;
				case BtsmodelPackage.BTS_OBJECT__TYPE: return BtsmodelPackage.BTS_CONFIGURATION__TYPE;
				case BtsmodelPackage.BTS_OBJECT__SUBTYPE: return BtsmodelPackage.BTS_CONFIGURATION__SUBTYPE;
				case BtsmodelPackage.BTS_OBJECT__CODE: return BtsmodelPackage.BTS_CONFIGURATION__CODE;
				case BtsmodelPackage.BTS_OBJECT__RELATIONS: return BtsmodelPackage.BTS_CONFIGURATION__RELATIONS;
				case BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY: return BtsmodelPackage.BTS_CONFIGURATION__TEMP_SORT_KEY;
				case BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES: return BtsmodelPackage.BTS_CONFIGURATION__EXTERNAL_REFERENCES;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == BTSObservableObject.class) {
			switch (baseOperationID) {
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_CONFIGURATION___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_CONFIGURATION___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				default: return -1;
			}
		}
		if (baseClass == BTSIdentifiableItem.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (baseOperationID) {
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__BTSREVISION: return BtsmodelPackage.BTS_CONFIGURATION___ADD_REVISION__BTSREVISION;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__INT_DATE_STRING: return BtsmodelPackage.BTS_CONFIGURATION___ADD_REVISION__INT_DATE_STRING;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___GET_REVISION__INT: return BtsmodelPackage.BTS_CONFIGURATION___GET_REVISION__INT;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___GET_LAST_REVISION: return BtsmodelPackage.BTS_CONFIGURATION___GET_LAST_REVISION;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class) {
			switch (baseOperationID) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case BtsmodelPackage.BTS_CONFIGURATION___ADD_REVISION__BTSREVISION:
				addRevision((BTSRevision)arguments.get(0));
				return null;
			case BtsmodelPackage.BTS_CONFIGURATION___ADD_REVISION__INT_DATE_STRING:
				addRevision((Integer)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
				return null;
			case BtsmodelPackage.BTS_CONFIGURATION___GET_REVISION__INT:
				return getRevision((Integer)arguments.get(0));
			case BtsmodelPackage.BTS_CONFIGURATION___GET_LAST_REVISION:
				return getLastRevision();
			case BtsmodelPackage.BTS_CONFIGURATION___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				addPropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
			case BtsmodelPackage.BTS_CONFIGURATION___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				removePropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
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
		result.append(" (propertyChangeSupport: ");
		result.append(propertyChangeSupport);
		result.append(", _id: ");
		result.append(_id);
		result.append(", state: ");
		result.append(state);
		result.append(", revisionState: ");
		result.append(revisionState);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", revisions: ");
		result.append(revisions);
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
		result.append(", _deleted: ");
		result.append(_deleted);
		result.append(", conflictingRevs: ");
		result.append(conflictingRevs);
		result.append(", dBCollectionKey: ");
		result.append(dBCollectionKey);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", code: ");
		result.append(code);
		result.append(", tempSortKey: ");
		result.append(tempSortKey);
		result.append(", provider: ");
		result.append(provider);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDBCollectionKey() {
		return dBCollectionKey;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBCollectionKey(String newDBCollectionKey) {
		String oldDBCollectionKey = dBCollectionKey;
		dBCollectionKey = newDBCollectionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIGURATION__DB_COLLECTION_KEY, oldDBCollectionKey, dBCollectionKey));
	}

	
} //BTSConfigurationImpl
