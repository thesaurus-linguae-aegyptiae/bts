/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ambivalence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getAmbivalence()
 * @model
 * @generated
 */
public interface Ambivalence extends SentenceItem
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link org.bbaw.bts.corpus.text.egy.egyDsl.Case}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getAmbivalence_Cases()
   * @model containment="true"
   * @generated
   */
  EList<Case> getCases();

} // Ambivalence
