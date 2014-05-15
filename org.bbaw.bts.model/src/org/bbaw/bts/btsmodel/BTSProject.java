/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProject#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProject#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProject#getDbConnection <em>Db Connection</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProject#getDbCollections <em>Db Collections</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProject#getSubProjects <em>Sub Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProject()
 * @model
 * @generated
 */
public interface BTSProject extends BTSObject, BTSDBBaseObject
{
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProject_Prefix()
	 * @model required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProject#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProject#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Db Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Connection</em>' containment reference.
	 * @see #setDbConnection(BTSDBConnection)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProject_DbConnection()
	 * @model containment="true"
	 * @generated
	 */
	BTSDBConnection getDbConnection();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProject#getDbConnection <em>Db Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Connection</em>' containment reference.
	 * @see #getDbConnection()
	 * @generated
	 */
	void setDbConnection(BTSDBConnection value);

	/**
	 * Returns the value of the '<em><b>Db Collections</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSProjectDBCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Collections</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProject_DbCollections()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSProjectDBCollection> getDbCollections();

	/**
	 * Returns the value of the '<em><b>Sub Projects</b></em>' reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Projects</em>' reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProject_SubProjects()
	 * @model transient="true"
	 * @generated
	 */
	EList<BTSProject> getSubProjects();

} // BTSProject
