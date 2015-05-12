/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Abstract Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractText()
 * @model
 * @generated
 */
public interface BTSAbstractText extends BTSCorpusObject {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' reference list.
	 * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractText_Paragraphs()
	 * @model
	 * @generated
	 */
	EList<BTSAbstractParagraph> getParagraphs();

} // BTSAbstractText
