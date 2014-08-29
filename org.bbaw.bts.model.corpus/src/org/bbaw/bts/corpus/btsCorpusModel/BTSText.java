/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSText#getTextContent <em>Text Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSText()
 * @model
 * @generated
 */
public interface BTSText extends BTSCorpusObject {
	/**
	 * Returns the value of the '<em><b>Text Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Content</em>' containment reference.
	 * @see #setTextContent(BTSTextContent)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSText_TextContent()
	 * @model containment="true"
	 * @generated
	 */
	BTSTextContent getTextContent();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSText#getTextContent <em>Text Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Content</em>' containment reference.
	 * @see #getTextContent()
	 * @generated
	 */
	void setTextContent(BTSTextContent value);

} // BTSText
