/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Egy Sent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.EgySentType#getValue <em>Value</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getTranslat <em>Translat</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getEgyTB1 <em>Egy TB1</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getEgyTB3End <em>Egy TB3 End</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getEgyWord <em>Egy Word</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getNote <em>Note</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getFormattingElement <em>Formatting Element</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getLanguagePassage <em>Language Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getBausteinPassage <em>Baustein Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getLeipzigPassage <em>Leipzig Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getGlossePassage <em>Glosse Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getPunctuation <em>Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getEgyPunctuation <em>Egy Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getAuthor <em>Author</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getLanguage <em>Language</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getLeipzig3Modul <em>Leipzig3 Modul</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySentType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType()
 * @model extendedMetaData="name='EgySent_._type' kind='elementOnly'"
 * @generated
 */
public interface EgySentType extends EObject {
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySentType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Translat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translat</em>' attribute.
	 * @see #setTranslat(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Translat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Translat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTranslat();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySentType#getTranslat <em>Translat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translat</em>' attribute.
	 * @see #getTranslat()
	 * @generated
	 */
	void setTranslat(String value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_BtsCodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BtsCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBtsCodes();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySentType#getBtsCodes <em>Bts Codes</em>}' attribute.
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySentType#getComment <em>Comment</em>}' attribute.
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_EgySent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgySent' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_EgyTB1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB1' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_EgyTB3Start()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB3Start' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_EgyTB3End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB3End' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_EgyWord()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyWord' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_LineCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineCount' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Note' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_FormattingElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FormattingElement' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_LanguagePassage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LanguagePassage' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_BausteinPassage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BausteinPassage' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_LeipzigPassage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LeipzigPassage' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_GlossePassage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GlossePassage' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Punctuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Punctuation' namespace='##targetNamespace' group='group:4'"
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_EgyPunctuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyPunctuation' namespace='##targetNamespace' group='group:4'"
	 * @generated
	 */
	EList<EgyPunctuationType> getEgyPunctuation();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Author' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAuthor();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySentType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Object value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Language' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLanguage();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySentType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Object value);

	/**
	 * Returns the value of the '<em><b>Leipzig3 Modul</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leipzig3 Modul</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leipzig3 Modul</em>' attribute.
	 * @see #setLeipzig3Modul(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Leipzig3Modul()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Leipzig3Modul' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLeipzig3Modul();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySentType#getLeipzig3Modul <em>Leipzig3 Modul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leipzig3 Modul</em>' attribute.
	 * @see #getLeipzig3Modul()
	 * @generated
	 */
	void setLeipzig3Modul(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CorpusDTDneu.TypeType5}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType5
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType5)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySentType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType5 getType();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySentType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType5
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType5 value);

	/**
	 * Unsets the value of the '{@link CorpusDTDneu.EgySentType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType5)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.EgySentType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType5)
	 * @generated
	 */
	boolean isSetType();

} // EgySentType
