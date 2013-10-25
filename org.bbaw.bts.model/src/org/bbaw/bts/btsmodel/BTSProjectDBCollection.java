/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Project DB Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getCollectionName <em>Collection Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getRoleDescriptions <em>Role Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection()
 * @model
 * @generated
 */
public interface BTSProjectDBCollection extends BTSIdentifiableItem
{
	/**
	 * Returns the value of the '<em><b>Collection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Name</em>' attribute.
	 * @see #setCollectionName(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_CollectionName()
	 * @model
	 * @generated
	 */
	String getCollectionName();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getCollectionName <em>Collection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Name</em>' attribute.
	 * @see #getCollectionName()
	 * @generated
	 */
	void setCollectionName(String value);

	/**
	 * Returns the value of the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed</em>' attribute.
	 * @see #setIndexed(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_Indexed()
	 * @model
	 * @generated
	 */
	boolean isIndexed();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isIndexed <em>Indexed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexed</em>' attribute.
	 * @see #isIndexed()
	 * @generated
	 */
	void setIndexed(boolean value);

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_Synchronized()
	 * @model
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isSynchronized <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

	/**
	 * Returns the value of the '<em><b>Role Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Descriptions</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_RoleDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSDBCollectionRoleDesc> getRoleDescriptions();

} // BTSProjectDBCollection
