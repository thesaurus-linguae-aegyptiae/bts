/**
 */
package org.bbaw.bts.btsmodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Action Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to record user actions such as selections and provide proposals based on
 * frequency users select this action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.UserActionCounter#getDateOfLastSelection <em>Date Of Last Selection</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.UserActionCounter#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getUserActionCounter()
 * @model
 * @generated
 */
public interface UserActionCounter extends BTSDBBaseObject {
	/**
	 * Returns the value of the '<em><b>Date Of Last Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Last Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Last Selection</em>' attribute.
	 * @see #setDateOfLastSelection(Date)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getUserActionCounter_DateOfLastSelection()
	 * @model
	 * @generated
	 */
	Date getDateOfLastSelection();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.UserActionCounter#getDateOfLastSelection <em>Date Of Last Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Last Selection</em>' attribute.
	 * @see #getDateOfLastSelection()
	 * @generated
	 */
	void setDateOfLastSelection(Date value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getUserActionCounter_Counter()
	 * @model
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.UserActionCounter#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

} // UserActionCounter
