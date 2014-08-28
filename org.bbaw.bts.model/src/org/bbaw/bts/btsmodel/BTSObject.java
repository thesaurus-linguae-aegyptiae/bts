/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>BTS Object</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the basic managed object in BTS.
 * It has basic properties such as name, type etc.
 * It also has typed relations.
 * 
 * All primary objects should extend BTSObject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getName <em>Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getCode <em>Code</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getTempSortKey <em>Temp Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getExternalReferences <em>External References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject()
 * @model abstract="true"
 * @generated
 */
public interface BTSObject extends AdministrativDataObject
{
	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Key</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_SortKey()
	 * @model
	 * @generated
	 */
	int getSortKey();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObject#getSortKey
	 * <em>Sort Key</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObject#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_Subtype()
	 * @model
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObject#getSubtype
	 * <em>Subtype</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObject#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSRelation> getRelations();

	/**
	 * Returns the value of the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Sort Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Sort Key</em>' attribute.
	 * @see #setTempSortKey(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_TempSortKey()
	 * @model transient="true"
	 * @generated
	 */
	int getTempSortKey();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObject#getTempSortKey <em>Temp Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Sort Key</em>' attribute.
	 * @see #getTempSortKey()
	 * @generated
	 */
	void setTempSortKey(int value);

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSExternalReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External References</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_ExternalReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSExternalReference> getExternalReferences();

} // BTSObject
