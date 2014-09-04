/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ending</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ending#getChars <em>Chars</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getEnding()
 * @model
 * @generated
 */
public interface Ending extends WordEnding
{
  /**
   * Returns the value of the '<em><b>Chars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chars</em>' containment reference.
   * @see #setChars(SuffixChars)
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getEnding_Chars()
   * @model containment="true"
   * @generated
   */
  SuffixChars getChars();

  /**
   * Sets the value of the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ending#getChars <em>Chars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chars</em>' containment reference.
   * @see #getChars()
   * @generated
   */
  void setChars(SuffixChars value);

} // Ending
