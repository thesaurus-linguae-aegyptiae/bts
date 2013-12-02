/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Senctence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSSenctence#getSentenceItems <em>Sentence Items</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSSenctence#getTranslation <em>Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSSenctence()
 * @model
 * @generated
 */
public interface BTSSenctence extends BTSTextItems, BTSReferencableItem {
	/**
	 * Returns the value of the '<em><b>Sentence Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSSentenceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentence Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence Items</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSSenctence_SentenceItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSSentenceItem> getSentenceItems();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(BTSTranslations)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSSenctence_Translation()
	 * @model containment="true"
	 * @generated
	 */
	BTSTranslations getTranslation();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSSenctence#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(BTSTranslations value);

} // BTSSenctence
