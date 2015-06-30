/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glosse Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.GlosseType#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getEgyTB1 <em>Egy TB1</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getEgyTB3End <em>Egy TB3 End</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getEgyWord <em>Egy Word</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getNote <em>Note</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getFormattingElement <em>Formatting Element</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getLanguagePassage <em>Language Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getBausteinPassage <em>Baustein Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getLeipzigPassage <em>Leipzig Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getGlossePassage <em>Glosse Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getPunctuation <em>Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getEgyPunctuation <em>Egy Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.GlosseType#getPassageID <em>Passage ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType()
 * @model extendedMetaData="name='Glosse_._type' kind='elementOnly'"
 * @generated
 */
public interface GlosseType extends EObject {
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_EgySent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgySent' namespace='##targetNamespace' group='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_EgyTB1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB1' namespace='##targetNamespace' group='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_EgyTB3Start()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB3Start' namespace='##targetNamespace' group='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_EgyTB3End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB3End' namespace='##targetNamespace' group='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_EgyWord()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyWord' namespace='##targetNamespace' group='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_LineCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineCount' namespace='##targetNamespace' group='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Note' namespace='##targetNamespace' group='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_FormattingElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FormattingElement' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<FormattingElementType> getFormattingElement();

	/**
	 * Returns the value of the '<em><b>Language Passage</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.LanguagePassageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Passage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Passage</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_LanguagePassage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LanguagePassage' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<LanguagePassageType> getLanguagePassage();

	/**
	 * Returns the value of the '<em><b>Baustein Passage</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.BausteinPassageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baustein Passage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baustein Passage</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_BausteinPassage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BausteinPassage' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<BausteinPassageType> getBausteinPassage();

	/**
	 * Returns the value of the '<em><b>Leipzig Passage</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.LeipzigPassageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leipzig Passage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leipzig Passage</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_LeipzigPassage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LeipzigPassage' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<LeipzigPassageType> getLeipzigPassage();

	/**
	 * Returns the value of the '<em><b>Glosse Passage</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.GlossePassageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glosse Passage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosse Passage</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_GlossePassage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GlossePassage' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<GlossePassageType> getGlossePassage();

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_Punctuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Punctuation' namespace='##targetNamespace' group='group:0'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_EgyPunctuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyPunctuation' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EgyPunctuationType> getEgyPunctuation();

	/**
	 * Returns the value of the '<em><b>Passage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passage ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passage ID</em>' attribute.
	 * @see #setPassageID(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlosseType_PassageID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='PassageID' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPassageID();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.GlosseType#getPassageID <em>Passage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passage ID</em>' attribute.
	 * @see #getPassageID()
	 * @generated
	 */
	void setPassageID(Object value);

} // GlosseType
