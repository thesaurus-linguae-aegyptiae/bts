/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextContent#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getTextContent()
 * @model
 * @generated
 */
public interface TextContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.bbaw.bts.corpus.text.egy.egyDsl.TextItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getTextContent_Items()
   * @model containment="true"
   * @generated
   */
  EList<TextItem> getItems();

} // TextContent
