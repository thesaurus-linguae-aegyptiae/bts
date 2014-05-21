/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTSDB Base Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#get_rev <em>rev</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getReaders <em>Readers</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#is_deleted <em>deleted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSDBBaseObjectImpl extends BTSIdentifiableItemImpl implements BTSDBBaseObject
{

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSDBBaseObjectImpl()
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
		return BtsmodelPackage.Literals.BTSDB_BASE_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__REV, old_rev, _rev));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT, oldProject, project));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUpdaters()
	{
		if (updaters == null) {
			updaters = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS);
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
			readers = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTSDB_BASE_OBJECT__READERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED, old_deleted, _deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDBCollectionKey() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
				return get_rev();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
				return getProject();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
				return isLocked();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
				return getUpdaters();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
				return getReaders();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
				return is_deleted();
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
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
				set_rev((String)newValue);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
				setProject((String)newValue);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
				getReaders().clear();
				getReaders().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
				set_deleted((Boolean)newValue);
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
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
				set_rev(_REV_EDEFAULT);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
				getUpdaters().clear();
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
				getReaders().clear();
				return;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
				set_deleted(_DELETED_EDEFAULT);
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
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
				return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
			case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
				return updaters != null && !updaters.isEmpty();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
				return readers != null && !readers.isEmpty();
			case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
				return _deleted != _DELETED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BtsmodelPackage.BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY:
				return getDBCollectionKey();
		}
		return super.eInvoke(operationID, arguments);
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

} // BTSDBBaseObjectImpl
