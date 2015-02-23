/**
 */
package org.bbaw.bts.btsmodel;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTSID Reservation Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSIDReservationObject#getBtsUUID <em>Bts UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSIDReservationObject()
 * @model
 * @generated
 */
public interface BTSIDReservationObject extends BTSDBBaseObject {
	/**
	 * Returns the value of the '<em><b>Bts UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bts UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bts UUID</em>' attribute.
	 * @see #setBtsUUID(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSIDReservationObject_BtsUUID()
	 * @model
	 * @generated
	 */
	String getBtsUUID();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSIDReservationObject#getBtsUUID <em>Bts UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bts UUID</em>' attribute.
	 * @see #getBtsUUID()
	 * @generated
	 */
	void setBtsUUID(String value);



} // BTSIDReservationObject
