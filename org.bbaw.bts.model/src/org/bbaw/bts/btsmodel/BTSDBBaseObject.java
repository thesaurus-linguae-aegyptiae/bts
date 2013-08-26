/**
 */
package org.bbaw.bts.btsmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTSDB Base Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getLease <em>Lease</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_rev <em>rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject()
 * @model abstract="true"
 * @generated
 */
public interface BTSDBBaseObject extends BTSObservableObject {
	/**
	 * Returns the value of the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lease</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lease</em>' containment reference.
	 * @see #setLease(BTSLease)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject_Lease()
	 * @model containment="true"
	 * @generated
	 */
	BTSLease getLease();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getLease <em>Lease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lease</em>' containment reference.
	 * @see #getLease()
	 * @generated
	 */
	void setLease(BTSLease value);

	/**
	 * Returns the value of the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>id</em>' attribute.
	 * @see #set_id(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject__id()
	 * @model
	 * @generated
	 */
	String get_id();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_id <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>id</em>' attribute.
	 * @see #get_id()
	 * @generated
	 */
	void set_id(String value);

	/**
	 * Returns the value of the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>rev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>rev</em>' attribute.
	 * @see #set_rev(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject__rev()
	 * @model
	 * @generated
	 */
	String get_rev();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_rev <em>rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>rev</em>' attribute.
	 * @see #get_rev()
	 * @generated
	 */
	void set_rev(String value);

} // BTSDBBaseObject
