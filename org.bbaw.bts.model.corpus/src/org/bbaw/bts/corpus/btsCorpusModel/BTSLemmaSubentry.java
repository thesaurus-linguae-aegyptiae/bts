/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.bbaw.bts.btsmodel.BTSReferencableItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Lemma Subentry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry#getPassport <em>Passport</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry#getWords <em>Words</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaSubentry()
 * @model
 * @generated
 */
public interface BTSLemmaSubentry extends BTSReferencableItem {
	/**
	 * Returns the value of the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport</em>' containment reference.
	 * @see #setPassport(BTSPassport)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaSubentry_Passport()
	 * @model containment="true"
	 * @generated
	 */
	BTSPassport getPassport();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry#getPassport <em>Passport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport</em>' containment reference.
	 * @see #getPassport()
	 * @generated
	 */
	void setPassport(BTSPassport value);

	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaSubentry_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSWord> getWords();

} // BTSLemmaSubentry
