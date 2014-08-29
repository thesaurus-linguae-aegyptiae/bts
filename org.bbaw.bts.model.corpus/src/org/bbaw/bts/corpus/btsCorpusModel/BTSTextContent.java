/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Text Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent#getTextItems <em>Text Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSTextContent()
 * @model
 * @generated
 */
public interface BTSTextContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Items</em>' containment reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSTextContent_TextItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSTextItems> getTextItems();

} // BTSTextContent
