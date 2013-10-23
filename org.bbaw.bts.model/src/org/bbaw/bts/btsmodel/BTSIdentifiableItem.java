/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Identifiable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSIdentifiableItem#get_id <em>id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSIdentifiableItem()
 * @model abstract="true"
 * @generated
 */
public interface BTSIdentifiableItem extends EObject
{
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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSIdentifiableItem__id()
	 * @model
	 * @generated
	 */
	String get_id();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSIdentifiableItem#get_id <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>id</em>' attribute.
	 * @see #get_id()
	 * @generated
	 */
	void set_id(String value);

} // BTSIdentifiableItem
