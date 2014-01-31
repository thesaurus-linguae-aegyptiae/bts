/**
 */
package org.bbaw.bts.btsmodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphic Selection Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter#getDateOfLastSelection <em>Date Of Last Selection</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter#getSuggest <em>Suggest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getGraphicSelectionCounter()
 * @model
 * @generated
 */
public interface GraphicSelectionCounter extends BTSDBBaseObject {
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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getGraphicSelectionCounter_DateOfLastSelection()
	 * @model
	 * @generated
	 */
	Date getDateOfLastSelection();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter#getDateOfLastSelection <em>Date Of Last Selection</em>}' attribute.
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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getGraphicSelectionCounter_Counter()
	 * @model
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

	/**
	 * Returns the value of the '<em><b>Suggest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suggest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suggest</em>' attribute.
	 * @see #setSuggest(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getGraphicSelectionCounter_Suggest()
	 * @model
	 * @generated
	 */
	String getSuggest();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter#getSuggest <em>Suggest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suggest</em>' attribute.
	 * @see #getSuggest()
	 * @generated
	 */
	void setSuggest(String value);

} // GraphicSelectionCounter
