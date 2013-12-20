/**
 */
package org.bbaw.bts.corpus.text.egy.dsl.egyBts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsPackage#getChars()
 * @model
 * @generated
 */
public interface Chars extends WordMiddle, NoExpanded, NoEmendation, NoDisputableReading, NoLacuna, NoDeletion, NoExpandedColumn, NoRasur, NoAncientExpanded, NoRestorationOverRasur, NoPartialDestruction
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsPackage#getChars_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Chars
