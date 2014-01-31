/**
 */
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.BTSDBConnection;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTSDB Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl#getMasterServer <em>Master Server</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl#getDbPath <em>Db Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSDBConnectionImpl extends BTSIdentifiableItemImpl implements BTSDBConnection
{
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
	 * The default value of the '{@link #getMasterServer() <em>Master Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterServer()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterServer() <em>Master Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterServer()
	 * @generated
	 * @ordered
	 */
	protected String masterServer = MASTER_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPath() <em>Db Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPath() <em>Db Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPath()
	 * @generated
	 * @ordered
	 */
	protected String dbPath = DB_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSDBConnectionImpl()
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
		return BtsmodelPackage.Literals.BTSDB_CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_CONNECTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterServer()
	{
		return masterServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterServer(String newMasterServer)
	{
		String oldMasterServer = masterServer;
		masterServer = newMasterServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_CONNECTION__MASTER_SERVER, oldMasterServer, masterServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbPath()
	{
		return dbPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbPath(String newDbPath)
	{
		String oldDbPath = dbPath;
		dbPath = newDbPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_CONNECTION__DB_PATH, oldDbPath, dbPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BtsmodelPackage.BTSDB_CONNECTION__TYPE:
				return getType();
			case BtsmodelPackage.BTSDB_CONNECTION__MASTER_SERVER:
				return getMasterServer();
			case BtsmodelPackage.BTSDB_CONNECTION__DB_PATH:
				return getDbPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BtsmodelPackage.BTSDB_CONNECTION__TYPE:
				setType((String)newValue);
				return;
			case BtsmodelPackage.BTSDB_CONNECTION__MASTER_SERVER:
				setMasterServer((String)newValue);
				return;
			case BtsmodelPackage.BTSDB_CONNECTION__DB_PATH:
				setDbPath((String)newValue);
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
		switch (featureID) {
			case BtsmodelPackage.BTSDB_CONNECTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTSDB_CONNECTION__MASTER_SERVER:
				setMasterServer(MASTER_SERVER_EDEFAULT);
				return;
			case BtsmodelPackage.BTSDB_CONNECTION__DB_PATH:
				setDbPath(DB_PATH_EDEFAULT);
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
		switch (featureID) {
			case BtsmodelPackage.BTSDB_CONNECTION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsmodelPackage.BTSDB_CONNECTION__MASTER_SERVER:
				return MASTER_SERVER_EDEFAULT == null ? masterServer != null : !MASTER_SERVER_EDEFAULT.equals(masterServer);
			case BtsmodelPackage.BTSDB_CONNECTION__DB_PATH:
				return DB_PATH_EDEFAULT == null ? dbPath != null : !DB_PATH_EDEFAULT.equals(dbPath);
		}
		return super.eIsSet(featureID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", masterServer: ");
		result.append(masterServer);
		result.append(", dbPath: ");
		result.append(dbPath);
		result.append(')');
		return result.toString();
	}

} //BTSDBConnectionImpl
