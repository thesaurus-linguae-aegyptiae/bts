/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Egy TB1 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getName <em>Name</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getEgyTB1 <em>Egy TB1</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getEgyTB3End <em>Egy TB3 End</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getEgyWord <em>Egy Word</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getNote <em>Note</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getFormattingElement <em>Formatting Element</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getPunctuation <em>Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTB1Type#getEgyPunctuation <em>Egy Punctuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type()
 * @model extendedMetaData="name='EgyTB1_._type' kind='elementOnly'"
 * @generated
 */
public interface EgyTB1Type extends EObject {
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgyTB1Type#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_BtsCodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BtsCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBtsCodes();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgyTB1Type#getBtsCodes <em>Bts Codes</em>}' attribute.
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgyTB1Type#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Egy Sent</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgySentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy Sent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy Sent</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_EgySent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgySent' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgySentType> getEgySent();

	/**
	 * Returns the value of the '<em><b>Egy TB1</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyTB1Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy TB1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy TB1</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_EgyTB1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB1' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgyTB1Type> getEgyTB1();

	/**
	 * Returns the value of the '<em><b>Egy TB3 Start</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyTB3StartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy TB3 Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy TB3 Start</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_EgyTB3Start()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB3Start' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgyTB3StartType> getEgyTB3Start();

	/**
	 * Returns the value of the '<em><b>Egy TB3 End</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyTB3EndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy TB3 End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy TB3 End</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_EgyTB3End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB3End' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgyTB3EndType> getEgyTB3End();

	/**
	 * Returns the value of the '<em><b>Egy Word</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyWordType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy Word</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy Word</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_EgyWord()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyWord' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgyWordType> getEgyWord();

	/**
	 * Returns the value of the '<em><b>Line Count</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.LineCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Count</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_LineCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineCount' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<LineCountType> getLineCount();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.NoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Note' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<NoteType> getNote();

	/**
	 * Returns the value of the '<em><b>Formatting Element</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.FormattingElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formatting Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formatting Element</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_FormattingElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FormattingElement' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<FormattingElementType> getFormattingElement();

	/**
	 * Returns the value of the '<em><b>Punctuation</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.PunctuationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Punctuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Punctuation</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_Punctuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Punctuation' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<PunctuationType> getPunctuation();

	/**
	 * Returns the value of the '<em><b>Egy Punctuation</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyPunctuationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy Punctuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy Punctuation</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTB1Type_EgyPunctuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyPunctuation' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgyPunctuationType> getEgyPunctuation();

} // EgyTB1Type
