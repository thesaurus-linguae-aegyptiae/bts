/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfix Flexion Eding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding#getInterfix <em>Interfix</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding#getChars <em>Chars</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getInterfixFlexionEding()
 * @model
 * @generated
 */
public interface InterfixFlexionEding extends EObject
{
  /**
   * Returns the value of the '<em><b>Interfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfix</em>' containment reference.
   * @see #setInterfix(InterfixFlexion)
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getInterfixFlexionEding_Interfix()
   * @model containment="true"
   * @generated
   */
  InterfixFlexion getInterfix();

  /**
   * Sets the value of the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding#getInterfix <em>Interfix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interfix</em>' containment reference.
   * @see #getInterfix()
   * @generated
   */
  void setInterfix(InterfixFlexion value);

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
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getInterfixFlexionEding_Chars()
   * @model containment="true"
   * @generated
   */
  SuffixChars getChars();

  /**
   * Sets the value of the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding#getChars <em>Chars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chars</em>' containment reference.
   * @see #getChars()
   * @generated
   */
  void setChars(SuffixChars value);

} // InterfixFlexionEding
