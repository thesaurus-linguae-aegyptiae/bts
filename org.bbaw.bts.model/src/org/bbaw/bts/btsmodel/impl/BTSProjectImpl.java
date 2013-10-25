/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSDBConnection;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
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
 * An implementation of the model object '<em><b>BTS Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#get_rev <em>rev</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#getReaders <em>Readers</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#getDbConnection <em>Db Connection</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl#getDbCollections <em>Db Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSProjectImpl extends BTSObjectImpl implements BTSProject
{
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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDbConnection() <em>Db Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbConnection()
	 * @generated
	 * @ordered
	 */
	protected BTSDBConnection dbConnection;

	/**
	 * The cached value of the '{@link #getDbCollections() <em>Db Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSProjectDBCollection> dbCollections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSProjectImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BtsmodelPackage.Literals.BTS_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id()
	{
		return _id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id)
	{
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_rev()
	{
		return _rev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_rev(String new_rev)
	{
		String old_rev = _rev;
		_rev = new_rev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT__REV, old_rev, _rev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject()
	{
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(String newProject)
	{
		String oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT__PROJECT, oldProject, project));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUpdaters()
	{
		if (updaters == null)
		{
			updaters = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_PROJECT__UPDATERS);
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
		if (readers == null)
		{
			readers = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_PROJECT__READERS);
		}
		return readers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix()
	{
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix)
	{
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSDBConnection getDbConnection()
	{
		return dbConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbConnection(BTSDBConnection newDbConnection, NotificationChain msgs)
	{
		BTSDBConnection oldDbConnection = dbConnection;
		dbConnection = newDbConnection;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT__DB_CONNECTION, oldDbConnection, newDbConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbConnection(BTSDBConnection newDbConnection)
	{
		if (newDbConnection != dbConnection)
		{
			NotificationChain msgs = null;
			if (dbConnection != null)
				msgs = ((InternalEObject)dbConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PROJECT__DB_CONNECTION, null, msgs);
			if (newDbConnection != null)
				msgs = ((InternalEObject)newDbConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PROJECT__DB_CONNECTION, null, msgs);
			msgs = basicSetDbConnection(newDbConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT__DB_CONNECTION, newDbConnection, newDbConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSProjectDBCollection> getDbCollections()
	{
		if (dbCollections == null)
		{
			dbCollections = new EObjectContainmentEList<BTSProjectDBCollection>(BTSProjectDBCollection.class, this, BtsmodelPackage.BTS_PROJECT__DB_COLLECTIONS);
		}
		return dbCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PROJECT__DB_CONNECTION:
				return basicSetDbConnection(null, msgs);
			case BtsmodelPackage.BTS_PROJECT__DB_COLLECTIONS:
				return ((InternalEList<?>)getDbCollections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PROJECT__ID:
				return get_id();
			case BtsmodelPackage.BTS_PROJECT__REV:
				return get_rev();
			case BtsmodelPackage.BTS_PROJECT__PROJECT:
				return getProject();
			case BtsmodelPackage.BTS_PROJECT__LOCKED:
				return isLocked();
			case BtsmodelPackage.BTS_PROJECT__UPDATERS:
				return getUpdaters();
			case BtsmodelPackage.BTS_PROJECT__READERS:
				return getReaders();
			case BtsmodelPackage.BTS_PROJECT__PREFIX:
				return getPrefix();
			case BtsmodelPackage.BTS_PROJECT__DESCRIPTION:
				return getDescription();
			case BtsmodelPackage.BTS_PROJECT__DB_CONNECTION:
				return getDbConnection();
			case BtsmodelPackage.BTS_PROJECT__DB_COLLECTIONS:
				return getDbCollections();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PROJECT__ID:
				set_id((String)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__REV:
				set_rev((String)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__PROJECT:
				setProject((String)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__READERS:
				getReaders().clear();
				getReaders().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__PREFIX:
				setPrefix((String)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__DB_CONNECTION:
				setDbConnection((BTSDBConnection)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT__DB_COLLECTIONS:
				getDbCollections().clear();
				getDbCollections().addAll((Collection<? extends BTSProjectDBCollection>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PROJECT__ID:
				set_id(_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT__REV:
				set_rev(_REV_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT__UPDATERS:
				getUpdaters().clear();
				return;
			case BtsmodelPackage.BTS_PROJECT__READERS:
				getReaders().clear();
				return;
			case BtsmodelPackage.BTS_PROJECT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT__DB_CONNECTION:
				setDbConnection((BTSDBConnection)null);
				return;
			case BtsmodelPackage.BTS_PROJECT__DB_COLLECTIONS:
				getDbCollections().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PROJECT__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case BtsmodelPackage.BTS_PROJECT__REV:
				return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
			case BtsmodelPackage.BTS_PROJECT__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case BtsmodelPackage.BTS_PROJECT__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case BtsmodelPackage.BTS_PROJECT__UPDATERS:
				return updaters != null && !updaters.isEmpty();
			case BtsmodelPackage.BTS_PROJECT__READERS:
				return readers != null && !readers.isEmpty();
			case BtsmodelPackage.BTS_PROJECT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case BtsmodelPackage.BTS_PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BtsmodelPackage.BTS_PROJECT__DB_CONNECTION:
				return dbConnection != null;
			case BtsmodelPackage.BTS_PROJECT__DB_COLLECTIONS:
				return dbCollections != null && !dbCollections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == BTSIdentifiableItem.class)
		{
			switch (derivedFeatureID)
			{
				case BtsmodelPackage.BTS_PROJECT__ID: return BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class)
		{
			switch (derivedFeatureID)
			{
				case BtsmodelPackage.BTS_PROJECT__REV: return BtsmodelPackage.BTSDB_BASE_OBJECT__REV;
				case BtsmodelPackage.BTS_PROJECT__PROJECT: return BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT;
				case BtsmodelPackage.BTS_PROJECT__LOCKED: return BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED;
				case BtsmodelPackage.BTS_PROJECT__UPDATERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS;
				case BtsmodelPackage.BTS_PROJECT__READERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__READERS;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == BTSIdentifiableItem.class)
		{
			switch (baseFeatureID)
			{
				case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID: return BtsmodelPackage.BTS_PROJECT__ID;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class)
		{
			switch (baseFeatureID)
			{
				case BtsmodelPackage.BTSDB_BASE_OBJECT__REV: return BtsmodelPackage.BTS_PROJECT__REV;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT: return BtsmodelPackage.BTS_PROJECT__PROJECT;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED: return BtsmodelPackage.BTS_PROJECT__LOCKED;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS: return BtsmodelPackage.BTS_PROJECT__UPDATERS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS: return BtsmodelPackage.BTS_PROJECT__READERS;
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
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //BTSProjectImpl
