/**
 */
package org.bbaw.bts.btsmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTSDB Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * describes the connection details to connect to a remote database.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBConnection#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBConnection#getMasterServer <em>Master Server</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBConnection#getDbPath <em>Db Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBConnection()
 * @model
 * @generated
 */
public interface BTSDBConnection extends BTSIdentifiableItem
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBConnection_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Master Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Server</em>' attribute.
	 * @see #setMasterServer(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBConnection_MasterServer()
	 * @model
	 * @generated
	 */
	String getMasterServer();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getMasterServer <em>Master Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Server</em>' attribute.
	 * @see #getMasterServer()
	 * @generated
	 */
	void setMasterServer(String value);

	/**
	 * Returns the value of the '<em><b>Db Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Path</em>' attribute.
	 * @see #setDbPath(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBConnection_DbPath()
	 * @model
	 * @generated
	 */
	String getDbPath();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getDbPath <em>Db Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Path</em>' attribute.
	 * @see #getDbPath()
	 * @generated
	 */
	void setDbPath(String value);

} // BTSDBConnection
