/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSText#getTextItems <em>Text Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSText()
 * @model
 * @generated
 */
public interface BTSText extends BTSCorpusObject {
	/**
	 * Returns the value of the '<em><b>Text Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSTextItems}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Items</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSText_TextItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSTextItems> getTextItems();

} // BTSText
