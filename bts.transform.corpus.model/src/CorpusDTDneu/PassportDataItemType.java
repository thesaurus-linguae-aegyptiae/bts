/**
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passport Data Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.PassportDataItemType#getThsEntry <em>Ths Entry</em>}</li>
 *   <li>{@link CorpusDTDneu.PassportDataItemType#getCode <em>Code</em>}</li>
 *   <li>{@link CorpusDTDneu.PassportDataItemType#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.PassportDataItemType#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItemType()
 * @model extendedMetaData="name='PassportDataItem_._type' kind='elementOnly'"
 * @generated
 */
public interface PassportDataItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ths Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ths Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ths Entry</em>' containment reference.
	 * @see #setThsEntry(ThsEntryType)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItemType_ThsEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThsEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ThsEntryType getThsEntry();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.PassportDataItemType#getThsEntry <em>Ths Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ths Entry</em>' containment reference.
	 * @see #getThsEntry()
	 * @generated
	 */
	void setThsEntry(ThsEntryType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItemType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Code' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.PassportDataItemType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItemType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.PassportDataItemType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link CorpusDTDneu.CategoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see CorpusDTDneu.CategoryType
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(CategoryType)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItemType_Category()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Category' namespace='##targetNamespace'"
	 * @generated
	 */
	CategoryType getCategory();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.PassportDataItemType#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see CorpusDTDneu.CategoryType
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CategoryType value);

	/**
	 * Unsets the value of the '{@link CorpusDTDneu.PassportDataItemType#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(CategoryType)
	 * @generated
	 */
	void unsetCategory();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.PassportDataItemType#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(CategoryType)
	 * @generated
	 */
	boolean isSetCategory();

} // PassportDataItemType
