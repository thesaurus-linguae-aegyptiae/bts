/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getGroupIds <em>Group Ids</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getSigle <em>Sigle</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getWebDescription <em>Web Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getForeName <em>Fore Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getSureName <em>Sure Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getMail <em>Mail</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getWebURL <em>Web URL</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getExternalReferneces <em>External Referneces</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSUser#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser()
 * @model
 * @generated
 */
public interface BTSUser extends BTSDBBaseObject, AdministrativDataObject {
	/**
	 * Returns the value of the '<em><b>Group Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Ids</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_GroupIds()
	 * @model
	 * @generated
	 */
	EList<String> getGroupIds();

	/**
	 * Returns the value of the '<em><b>Sigle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sigle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigle</em>' attribute.
	 * @see #setSigle(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Sigle()
	 * @model
	 * @generated
	 */
	String getSigle();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getSigle <em>Sigle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigle</em>' attribute.
	 * @see #getSigle()
	 * @generated
	 */
	void setSigle(String value);

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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Web Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Description</em>' attribute.
	 * @see #setWebDescription(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_WebDescription()
	 * @model
	 * @generated
	 */
	String getWebDescription();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getWebDescription <em>Web Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Description</em>' attribute.
	 * @see #getWebDescription()
	 * @generated
	 */
	void setWebDescription(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Fore Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fore Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fore Name</em>' attribute.
	 * @see #setForeName(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_ForeName()
	 * @model
	 * @generated
	 */
	String getForeName();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getForeName <em>Fore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fore Name</em>' attribute.
	 * @see #getForeName()
	 * @generated
	 */
	void setForeName(String value);

	/**
	 * Returns the value of the '<em><b>Sure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sure Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sure Name</em>' attribute.
	 * @see #setSureName(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_SureName()
	 * @model
	 * @generated
	 */
	String getSureName();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getSureName <em>Sure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sure Name</em>' attribute.
	 * @see #getSureName()
	 * @generated
	 */
	void setSureName(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Mail()
	 * @model
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Web URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web URL</em>' attribute.
	 * @see #setWebURL(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_WebURL()
	 * @model
	 * @generated
	 */
	String getWebURL();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getWebURL <em>Web URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web URL</em>' attribute.
	 * @see #getWebURL()
	 * @generated
	 */
	void setWebURL(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSUser#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>External Referneces</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSExternalReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Referneces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Referneces</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_ExternalReferneces()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSExternalReference> getExternalReferneces();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSUser_Roles()
	 * @model
	 * @generated
	 */
	EList<String> getRoles();

} // BTSUser
