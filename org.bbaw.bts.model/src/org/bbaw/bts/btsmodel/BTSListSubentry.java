/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS List Subentry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSListSubentry#getPassport <em>Passport</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSListSubentry#getWords <em>Words</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSListSubentry()
 * @model
 * @generated
 */
public interface BTSListSubentry extends BTSReferencableItem {
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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSListSubentry_Passport()
	 * @model containment="true"
	 * @generated
	 */
	BTSPassport getPassport();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSListSubentry#getPassport <em>Passport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport</em>' containment reference.
	 * @see #getPassport()
	 * @generated
	 */
	void setPassport(BTSPassport value);

	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSWord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSListSubentry_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSWord> getWords();

} // BTSListSubentry
