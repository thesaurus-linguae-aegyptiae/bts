/**
 */
package org.bbaw.bts.corpus.text.egy.dsl.egyBts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expanded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded#getWChar <em>WChar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsPackage#getExpanded()
 * @model
 * @generated
 */
public interface Expanded extends Brackets, NoEmendation, NoDisputableReading, NoLacuna
{
  /**
   * Returns the value of the '<em><b>WChar</b></em>' containment reference list.
   * The list contents are of type {@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpanded}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WChar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WChar</em>' containment reference list.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsPackage#getExpanded_WChar()
   * @model containment="true"
   * @generated
   */
  EList<NoExpanded> getWChar();

} // Expanded
