/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Workflow Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getSubRules <em>Sub Rules</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getActions <em>Actions</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getAcceptMessage <em>Accept Message</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOcl <em>Ocl</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOclSelfObject <em>Ocl Self Object</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getDenialMessage <em>Denial Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule()
 * @model
 * @generated
 */
public interface BTSWorkflowRule extends EObject
{
	/**
	 * Returns the value of the '<em><b>Sub Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Rules</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_SubRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSWorkflowRuleItem> getSubRules();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_Actions()
	 * @model
	 * @generated
	 */
	EList<String> getActions();

	/**
	 * Returns the value of the '<em><b>Accept Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Message</em>' attribute.
	 * @see #setAcceptMessage(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_AcceptMessage()
	 * @model
	 * @generated
	 */
	String getAcceptMessage();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getAcceptMessage <em>Accept Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Message</em>' attribute.
	 * @see #getAcceptMessage()
	 * @generated
	 */
	void setAcceptMessage(String value);

	/**
	 * Returns the value of the '<em><b>Ocl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl</em>' attribute.
	 * @see #setOcl(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_Ocl()
	 * @model
	 * @generated
	 */
	String getOcl();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOcl <em>Ocl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl</em>' attribute.
	 * @see #getOcl()
	 * @generated
	 */
	void setOcl(String value);

	/**
	 * Returns the value of the '<em><b>Ocl Self Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Self Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Self Object</em>' attribute.
	 * @see #setOclSelfObject(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_OclSelfObject()
	 * @model
	 * @generated
	 */
	String getOclSelfObject();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOclSelfObject <em>Ocl Self Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Self Object</em>' attribute.
	 * @see #getOclSelfObject()
	 * @generated
	 */
	void setOclSelfObject(String value);

	/**
	 * Returns the value of the '<em><b>Denial Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denial Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denial Message</em>' attribute.
	 * @see #setDenialMessage(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_DenialMessage()
	 * @model
	 * @generated
	 */
	String getDenialMessage();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getDenialMessage <em>Denial Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denial Message</em>' attribute.
	 * @see #getDenialMessage()
	 * @generated
	 */
	void setDenialMessage(String value);

} // BTSWorkflowRule
