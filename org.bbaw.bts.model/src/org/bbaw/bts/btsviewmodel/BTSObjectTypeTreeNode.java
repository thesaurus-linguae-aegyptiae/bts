/**
 */
package org.bbaw.bts.btsviewmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Object Type Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getReferencedTypesPath <em>Referenced Types Path</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getValue <em>Value</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getBTSObjectTypeTreeNode()
 * @model
 * @generated
 */
public interface BTSObjectTypeTreeNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getBTSObjectTypeTreeNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSObjectTypeTreeNode> getChildren();

	/**
	 * Returns the value of the '<em><b>Referenced Types Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Types Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Types Path</em>' reference.
	 * @see #setReferencedTypesPath(BTSObjectTypeTreeNode)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getBTSObjectTypeTreeNode_ReferencedTypesPath()
	 * @model
	 * @generated
	 */
	BTSObjectTypeTreeNode getReferencedTypesPath();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getReferencedTypesPath <em>Referenced Types Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Types Path</em>' reference.
	 * @see #getReferencedTypesPath()
	 * @generated
	 */
	void setReferencedTypesPath(BTSObjectTypeTreeNode value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getBTSObjectTypeTreeNode_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getBTSObjectTypeTreeNode_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // BTSObjectTypeTreeNode
