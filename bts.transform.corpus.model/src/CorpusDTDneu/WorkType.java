/**
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.WorkType#getName <em>Name</em>}</li>
 *   <li>{@link CorpusDTDneu.WorkType#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.WorkType#getThesaurus <em>Thesaurus</em>}</li>
 *   <li>{@link CorpusDTDneu.WorkType#getVersionCode <em>Version Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getWorkType()
 * @model extendedMetaData="name='Work_._type' kind='elementOnly'"
 * @generated
 */
public interface WorkType extends EObject {
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getWorkType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.WorkType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getWorkType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.WorkType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Thesaurus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesaurus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesaurus</em>' attribute.
	 * @see #setThesaurus(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getWorkType_Thesaurus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Thesaurus' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getThesaurus();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.WorkType#getThesaurus <em>Thesaurus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesaurus</em>' attribute.
	 * @see #getThesaurus()
	 * @generated
	 */
	void setThesaurus(Object value);

	/**
	 * Returns the value of the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Code</em>' attribute.
	 * @see #setVersionCode(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getWorkType_VersionCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='VersionCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getVersionCode();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.WorkType#getVersionCode <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Code</em>' attribute.
	 * @see #getVersionCode()
	 * @generated
	 */
	void setVersionCode(Object value);

} // WorkType
