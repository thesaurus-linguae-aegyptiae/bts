/**
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passport Data Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.PassportDataItem#getPassportDataItem <em>Passport Data Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItem()
 * @model extendedMetaData="name='PassportDataItem' kind='elementOnly'"
 * @generated
 */
public interface PassportDataItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Passport Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passport Data Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport Data Item</em>' containment reference.
	 * @see #setPassportDataItem(PassportDataItemType)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItem_PassportDataItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PassportDataItem' namespace='##targetNamespace'"
	 * @generated
	 */
	PassportDataItemType getPassportDataItem();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.PassportDataItem#getPassportDataItem <em>Passport Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport Data Item</em>' containment reference.
	 * @see #getPassportDataItem()
	 * @generated
	 */
	void setPassportDataItem(PassportDataItemType value);

} // PassportDataItem
