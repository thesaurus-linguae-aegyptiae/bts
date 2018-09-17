/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Destruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction#getWChar <em>WChar</em>}</li>
 * </ul>
 *
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getPartialDestruction()
 * @model
 * @generated
 */
public interface PartialDestruction extends Brackets, NoCartouche, NoDisputableReading, NoDeletion, NoExpandedColumn, NoRasur, NoAncientExpanded, NoRestorationOverRasur
{
  /**
   * Returns the value of the '<em><b>WChar</b></em>' containment reference list.
   * The list contents are of type {@link org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WChar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WChar</em>' containment reference list.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getPartialDestruction_WChar()
   * @model containment="true"
   * @generated
   */
  EList<NoPartialDestruction> getWChar();

} // PartialDestruction
