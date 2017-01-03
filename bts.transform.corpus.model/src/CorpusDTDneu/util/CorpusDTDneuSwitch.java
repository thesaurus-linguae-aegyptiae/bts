/**
 */
package CorpusDTDneu.util;

import CorpusDTDneu.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CorpusDTDneu.CorpusDTDneuPackage
 * @generated
 */
public class CorpusDTDneuSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorpusDTDneuPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorpusDTDneuSwitch() {
		if (modelPackage == null) {
			modelPackage = CorpusDTDneuPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorpusDTDneuPackage.BAUSTEIN_PASSAGE_TYPE: {
				BausteinPassageType bausteinPassageType = (BausteinPassageType)theEObject;
				T result = caseBausteinPassageType(bausteinPassageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.DATE_THS_TYPE: {
				DateThsType dateThsType = (DateThsType)theEObject;
				T result = caseDateThsType(dateThsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_PUNCTUATION_TYPE: {
				EgyPunctuationType egyPunctuationType = (EgyPunctuationType)theEObject;
				T result = caseEgyPunctuationType(egyPunctuationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_SENT_TYPE: {
				EgySentType egySentType = (EgySentType)theEObject;
				T result = caseEgySentType(egySentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE: {
				EgySubTxtType egySubTxtType = (EgySubTxtType)theEObject;
				T result = caseEgySubTxtType(egySubTxtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_SZENARIO_TYPE: {
				EgySzenarioType egySzenarioType = (EgySzenarioType)theEObject;
				T result = caseEgySzenarioType(egySzenarioType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_TB1_TYPE: {
				EgyTB1Type egyTB1Type = (EgyTB1Type)theEObject;
				T result = caseEgyTB1Type(egyTB1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_TB3_END_TYPE: {
				EgyTB3EndType egyTB3EndType = (EgyTB3EndType)theEObject;
				T result = caseEgyTB3EndType(egyTB3EndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_TB3_START_TYPE: {
				EgyTB3StartType egyTB3StartType = (EgyTB3StartType)theEObject;
				T result = caseEgyTB3StartType(egyTB3StartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE: {
				EgyTxtCorpusType egyTxtCorpusType = (EgyTxtCorpusType)theEObject;
				T result = caseEgyTxtCorpusType(egyTxtCorpusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_TXT_TYPE: {
				EgyTxtType egyTxtType = (EgyTxtType)theEObject;
				T result = caseEgyTxtType(egyTxtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.EGY_WORD_TYPE: {
				EgyWordType egyWordType = (EgyWordType)theEObject;
				T result = caseEgyWordType(egyWordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.FORMATTING_ELEMENT_TYPE: {
				FormattingElementType formattingElementType = (FormattingElementType)theEObject;
				T result = caseFormattingElementType(formattingElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.GLOSSE_PASSAGE_TYPE: {
				GlossePassageType glossePassageType = (GlossePassageType)theEObject;
				T result = caseGlossePassageType(glossePassageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.GLOSSE_TYPE: {
				GlosseType glosseType = (GlosseType)theEObject;
				T result = caseGlosseType(glosseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.LANGUAGE_PASSAGE_TYPE: {
				LanguagePassageType languagePassageType = (LanguagePassageType)theEObject;
				T result = caseLanguagePassageType(languagePassageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.LEIPZIG_PASSAGE_TYPE: {
				LeipzigPassageType leipzigPassageType = (LeipzigPassageType)theEObject;
				T result = caseLeipzigPassageType(leipzigPassageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.LINE_COUNT_TYPE: {
				LineCountType lineCountType = (LineCountType)theEObject;
				T result = caseLineCountType(lineCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM: {
				PassportDataItem passportDataItem = (PassportDataItem)theEObject;
				T result = casePassportDataItem(passportDataItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.PASSPORT_DATA_ITEM_TYPE: {
				PassportDataItemType passportDataItemType = (PassportDataItemType)theEObject;
				T result = casePassportDataItemType(passportDataItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.PICTURES_TABLE_TYPE: {
				PicturesTableType picturesTableType = (PicturesTableType)theEObject;
				T result = casePicturesTableType(picturesTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.PICTURE_TYPE: {
				PictureType pictureType = (PictureType)theEObject;
				T result = casePictureType(pictureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.PUNCTUATION_TYPE: {
				PunctuationType punctuationType = (PunctuationType)theEObject;
				T result = casePunctuationType(punctuationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_ARRANGEMENT_TYPE: {
				TCArrangementType tcArrangementType = (TCArrangementType)theEObject;
				T result = caseTCArrangementType(tcArrangementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_CAPTION_TYPE: {
				TCCaptionType tcCaptionType = (TCCaptionType)theEObject;
				T result = caseTCCaptionType(tcCaptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_GROUP_TYPE: {
				TCGroupType tcGroupType = (TCGroupType)theEObject;
				T result = caseTCGroupType(tcGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_HEADER_TYPE: {
				TCHeaderType tcHeaderType = (TCHeaderType)theEObject;
				T result = caseTCHeaderType(tcHeaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_LOCATION_TYPE: {
				TCLocationType tcLocationType = (TCLocationType)theEObject;
				T result = caseTCLocationType(tcLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_OBJECT_TYPE: {
				TCObjectType tcObjectType = (TCObjectType)theEObject;
				T result = caseTCObjectType(tcObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_OBJ_PART_TYPE: {
				TCObjPartType tcObjPartType = (TCObjPartType)theEObject;
				T result = caseTCObjPartType(tcObjPartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE: {
				TCPassportType tcPassportType = (TCPassportType)theEObject;
				T result = caseTCPassportType(tcPassportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_PICTURE_TYPE: {
				TCPictureType tcPictureType = (TCPictureType)theEObject;
				T result = caseTCPictureType(tcPictureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_SCENE_TYPE: {
				TCSceneType tcSceneType = (TCSceneType)theEObject;
				T result = caseTCSceneType(tcSceneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE: {
				TCSuperTextType tcSuperTextType = (TCSuperTextType)theEObject;
				T result = caseTCSuperTextType(tcSuperTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.TC_TEXT_TYPE: {
				TCTextType tcTextType = (TCTextType)theEObject;
				T result = caseTCTextType(tcTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.THS_ENTRY_TYPE: {
				ThsEntryType thsEntryType = (ThsEntryType)theEObject;
				T result = caseThsEntryType(thsEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusDTDneuPackage.WORK_TYPE: {
				WorkType workType = (WorkType)theEObject;
				T result = caseWorkType(workType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baustein Passage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baustein Passage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBausteinPassageType(BausteinPassageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Ths Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Ths Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateThsType(DateThsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy Punctuation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy Punctuation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgyPunctuationType(EgyPunctuationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy Sent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy Sent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgySentType(EgySentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy Sub Txt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy Sub Txt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgySubTxtType(EgySubTxtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy Szenario Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy Szenario Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgySzenarioType(EgySzenarioType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy TB1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy TB1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgyTB1Type(EgyTB1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy TB3 End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy TB3 End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgyTB3EndType(EgyTB3EndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy TB3 Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy TB3 Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgyTB3StartType(EgyTB3StartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy Txt Corpus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy Txt Corpus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgyTxtCorpusType(EgyTxtCorpusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy Txt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy Txt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgyTxtType(EgyTxtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Egy Word Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Egy Word Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEgyWordType(EgyWordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formatting Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formatting Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormattingElementType(FormattingElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glosse Passage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glosse Passage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossePassageType(GlossePassageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glosse Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glosse Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlosseType(GlosseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Passage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Passage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguagePassageType(LanguagePassageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leipzig Passage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leipzig Passage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeipzigPassageType(LeipzigPassageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineCountType(LineCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passport Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passport Data Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassportDataItem(PassportDataItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passport Data Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passport Data Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassportDataItemType(PassportDataItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pictures Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pictures Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePicturesTableType(PicturesTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePictureType(PictureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punctuation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punctuation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunctuationType(PunctuationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Arrangement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Arrangement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCArrangementType(TCArrangementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Caption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Caption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCCaptionType(TCCaptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCGroupType(TCGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCHeaderType(TCHeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCLocationType(TCLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCObjectType(TCObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Obj Part Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Obj Part Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCObjPartType(TCObjPartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Passport Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Passport Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCPassportType(TCPassportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Picture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Picture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCPictureType(TCPictureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Scene Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Scene Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCSceneType(TCSceneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Super Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Super Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCSuperTextType(TCSuperTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCTextType(TCTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ths Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ths Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThsEntryType(ThsEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkType(WorkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CorpusDTDneuSwitch
