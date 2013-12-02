/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTSDB Collection Role Desc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getUserNames <em>User Names</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getUserRoles <em>User Roles</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getCachedChildren <em>Cached Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBCollectionRoleDesc()
 * @model
 * @generated
 */
public interface BTSDBCollectionRoleDesc extends BTSIdentifiableItem
{
	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBCollectionRoleDesc_RoleName()
	 * @model
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

	/**
	 * Returns the value of the '<em><b>User Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Names</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBCollectionRoleDesc_UserNames()
	 * @model
	 * @generated
	 */
	EList<String> getUserNames();

	/**
	 * Returns the value of the '<em><b>User Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Roles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Roles</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBCollectionRoleDesc_UserRoles()
	 * @model
	 * @generated
	 */
	EList<String> getUserRoles();

	/**
	 * Returns the value of the '<em><b>Cached Children</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached Children</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Children</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBCollectionRoleDesc_CachedChildren()
	 * @model transient="true"
	 * @generated
	 */
	EList<Object> getCachedChildren();

} // BTSDBCollectionRoleDesc
