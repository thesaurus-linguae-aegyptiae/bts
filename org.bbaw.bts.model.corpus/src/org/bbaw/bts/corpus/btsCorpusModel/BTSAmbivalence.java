/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Ambivalence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAmbivalence()
 * @model
 * @generated
 */
public interface BTSAmbivalence extends BTSTextSentenceItem, BTSTextItems, BTSSentenceItem {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAmbivalence_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSLemmaCase> getCases();

} // BTSAmbivalence
