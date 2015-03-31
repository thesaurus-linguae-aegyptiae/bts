/**
 */
package org.bbaw.bts.btsmodel;

import java.util.Map;
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
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getPropertyStrings <em>Property Strings</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isDirty <em>Dirty</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Property Strings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Strings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Strings</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_PropertyStrings()
	 * @model
	 * @generated
	 */
	EList<String> getPropertyStrings();

	


	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see #setProperties(Map)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_Properties()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getProperties();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getProperties <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' attribute.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirty</em>' attribute.
	 * @see #setDirty(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_Dirty()
	 * @model transient="true"
	 * @generated
	 */
	boolean isDirty();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isDirty <em>Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirty</em>' attribute.
	 * @see #isDirty()
	 * @generated
	 */
	void setDirty(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setProperty(String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getProperty(String key);

} // BTSProjectDBCollection
