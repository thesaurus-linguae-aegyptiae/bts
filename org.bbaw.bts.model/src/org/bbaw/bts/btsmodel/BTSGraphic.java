/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Graphic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSGraphic#getInnerSentenceOrder <em>Inner Sentence Order</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSGraphic#getCode <em>Code</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSGraphic#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSGraphic()
 * @model
 * @generated
 */
public interface BTSGraphic extends EObject {
	/**
	 * Returns the value of the '<em><b>Inner Sentence Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Sentence Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Sentence Order</em>' attribute.
	 * @see #setInnerSentenceOrder(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSGraphic_InnerSentenceOrder()
	 * @model
	 * @generated
	 */
	int getInnerSentenceOrder();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSGraphic#getInnerSentenceOrder <em>Inner Sentence Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Sentence Order</em>' attribute.
	 * @see #getInnerSentenceOrder()
	 * @generated
	 */
	void setInnerSentenceOrder(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSGraphic_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSGraphic#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSGraphic_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSGraphic#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // BTSGraphic
