/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Inter Text Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class serves to describe references within a text by refering to the ID of 
 * the starting element and to the ID of the ending element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getBeginId <em>Begin Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getEndId <em>End Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSInterTextReference()
 * @model
 * @generated
 */
public interface BTSInterTextReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Id</em>' attribute.
	 * @see #setBeginId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSInterTextReference_BeginId()
	 * @model
	 * @generated
	 */
	String getBeginId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getBeginId <em>Begin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Id</em>' attribute.
	 * @see #getBeginId()
	 * @generated
	 */
	void setBeginId(String value);

	/**
	 * Returns the value of the '<em><b>End Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Id</em>' attribute.
	 * @see #setEndId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSInterTextReference_EndId()
	 * @model
	 * @generated
	 */
	String getEndId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getEndId <em>End Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Id</em>' attribute.
	 * @see #getEndId()
	 * @generated
	 */
	void setEndId(String value);

} // BTSInterTextReference
