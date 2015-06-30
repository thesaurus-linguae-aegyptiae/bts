/**
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.NoteType#getValue <em>Value</em>}</li>
 *   <li>{@link CorpusDTDneu.NoteType#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.NoteType#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getNoteType()
 * @model extendedMetaData="name='Note_._type' kind='elementOnly'"
 * @generated
 */
public interface NoteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getNoteType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.NoteType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Bts Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bts Codes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bts Codes</em>' attribute.
	 * @see #setBtsCodes(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getNoteType_BtsCodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BtsCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBtsCodes();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.NoteType#getBtsCodes <em>Bts Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bts Codes</em>' attribute.
	 * @see #getBtsCodes()
	 * @generated
	 */
	void setBtsCodes(String value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getNoteType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.NoteType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // NoteType
