/**
 */
package org.bbaw.bts.btsmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSOperator#getOpperator <em>Opperator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSOperator()
 * @model
 * @generated
 */
public interface BTSOperator extends BTSWorkflowRuleItem
{
	/**
	 * Returns the value of the '<em><b>Opperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opperator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opperator</em>' attribute.
	 * @see #setOpperator(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSOperator_Opperator()
	 * @model
	 * @generated
	 */
	String getOpperator();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSOperator#getOpperator <em>Opperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opperator</em>' attribute.
	 * @see #getOpperator()
	 * @generated
	 */
	void setOpperator(String value);

} // BTSOperator
