/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.bbaw.bts.btsmodel.BTSTranslations;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Lemma Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getWords <em>Words</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getTranslations <em>Translations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaEntry()
 * @model
 * @generated
 */
public interface BTSLemmaEntry extends BTSCorpusObject {
	/**
	 * Returns the value of the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore</em>' attribute.
	 * @see #setIgnore(boolean)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaEntry_Ignore()
	 * @model
	 * @generated
	 */
	boolean isIgnore();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#isIgnore <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore</em>' attribute.
	 * @see #isIgnore()
	 * @generated
	 */
	void setIgnore(boolean value);

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
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaEntry_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSWord> getWords();

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(BTSTranslations)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaEntry_Translations()
	 * @model containment="true"
	 * @generated
	 */
	BTSTranslations getTranslations();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(BTSTranslations value);

} // BTSLemmaEntry
