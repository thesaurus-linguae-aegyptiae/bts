/**
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ths Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.ThsEntryType#getTerm <em>Term</em>}</li>
 *   <li>{@link CorpusDTDneu.ThsEntryType#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link CorpusDTDneu.ThsEntryType#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.ThsEntryType#getCategory <em>Category</em>}</li>
 *   <li>{@link CorpusDTDneu.ThsEntryType#getKey <em>Key</em>}</li>
 *   <li>{@link CorpusDTDneu.ThsEntryType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getThsEntryType()
 * @model extendedMetaData="name='ThsEntry_._type' kind='elementOnly'"
 * @generated
 */
public interface ThsEntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getThsEntryType_Term()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Term' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.ThsEntryType#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' attribute.
	 * @see #setHierarchy(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getThsEntryType_Hierarchy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Hierarchy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHierarchy();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.ThsEntryType#getHierarchy <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy</em>' attribute.
	 * @see #getHierarchy()
	 * @generated
	 */
	void setHierarchy(String value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getThsEntryType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.ThsEntryType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link CorpusDTDneu.CategoryType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see CorpusDTDneu.CategoryType1
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(CategoryType1)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getThsEntryType_Category()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Category' namespace='##targetNamespace'"
	 * @generated
	 */
	CategoryType1 getCategory();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.ThsEntryType#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see CorpusDTDneu.CategoryType1
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CategoryType1 value);

	/**
	 * Unsets the value of the '{@link CorpusDTDneu.ThsEntryType#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(CategoryType1)
	 * @generated
	 */
	void unsetCategory();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.ThsEntryType#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(CategoryType1)
	 * @generated
	 */
	boolean isSetCategory();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getThsEntryType_Key()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='Key' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getKey();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.ThsEntryType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CorpusDTDneu.TypeType4}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType4
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType4)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getThsEntryType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType4 getType();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.ThsEntryType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType4
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType4 value);

	/**
	 * Unsets the value of the '{@link CorpusDTDneu.ThsEntryType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType4)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.ThsEntryType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType4)
	 * @generated
	 */
	boolean isSetType();

} // ThsEntryType
