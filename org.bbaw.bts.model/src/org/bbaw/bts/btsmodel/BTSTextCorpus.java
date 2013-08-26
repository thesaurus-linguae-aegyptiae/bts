/**
 */
package org.bbaw.bts.btsmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Text Corpus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSTextCorpus#getHeader <em>Header</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSTextCorpus()
 * @model
 * @generated
 */
public interface BTSTextCorpus extends BTSCorpusObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(BTSCorpusHeader)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSTextCorpus_Header()
	 * @model containment="true"
	 * @generated
	 */
	BTSCorpusHeader getHeader();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSTextCorpus#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(BTSCorpusHeader value);

} // BTSTextCorpus
