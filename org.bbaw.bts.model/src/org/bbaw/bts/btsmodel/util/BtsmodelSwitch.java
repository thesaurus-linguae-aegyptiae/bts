/**
 */
package org.bbaw.bts.btsmodel.util;

import java.util.Map;
import org.bbaw.bts.btsmodel.*;

import org.eclipse.emf.common.util.EList;
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
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage
 * @generated
 */
public class BtsmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtsmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = BtsmodelPackage.eINSTANCE;
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
			case BtsmodelPackage.BTSTC_OBJECT: {
				BTSTCObject btstcObject = (BTSTCObject)theEObject;
				T result = caseBTSTCObject(btstcObject);
				if (result == null) result = caseBTSCorpusObject(btstcObject);
				if (result == null) result = caseBTSObject(btstcObject);
				if (result == null) result = caseBTSDBBaseObject(btstcObject);
				if (result == null) result = caseAdministrativDataObject(btstcObject);
				if (result == null) result = caseBTSObservableObject(btstcObject);
				if (result == null) result = caseBTSIdentifiableItem(btstcObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TEXT: {
				BTSText btsText = (BTSText)theEObject;
				T result = caseBTSText(btsText);
				if (result == null) result = caseBTSCorpusObject(btsText);
				if (result == null) result = caseBTSObject(btsText);
				if (result == null) result = caseBTSDBBaseObject(btsText);
				if (result == null) result = caseAdministrativDataObject(btsText);
				if (result == null) result = caseBTSObservableObject(btsText);
				if (result == null) result = caseBTSIdentifiableItem(btsText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_SENCTENCE: {
				BTSSenctence btsSenctence = (BTSSenctence)theEObject;
				T result = caseBTSSenctence(btsSenctence);
				if (result == null) result = caseBTSTextItems(btsSenctence);
				if (result == null) result = caseBTSReferencableItem(btsSenctence);
				if (result == null) result = caseBTSObject(btsSenctence);
				if (result == null) result = caseAdministrativDataObject(btsSenctence);
				if (result == null) result = caseBTSObservableObject(btsSenctence);
				if (result == null) result = caseBTSIdentifiableItem(btsSenctence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_WORD: {
				BTSWord btsWord = (BTSWord)theEObject;
				T result = caseBTSWord(btsWord);
				if (result == null) result = caseBTSSentenceItem(btsWord);
				if (result == null) result = caseBTSAmbivalenceItem(btsWord);
				if (result == null) result = caseBTSReferencableItem(btsWord);
				if (result == null) result = caseBTSObject(btsWord);
				if (result == null) result = caseAdministrativDataObject(btsWord);
				if (result == null) result = caseBTSObservableObject(btsWord);
				if (result == null) result = caseBTSIdentifiableItem(btsWord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_MARKER: {
				BTSMarker btsMarker = (BTSMarker)theEObject;
				T result = caseBTSMarker(btsMarker);
				if (result == null) result = caseBTSTextSentenceItem(btsMarker);
				if (result == null) result = caseBTSAmbivalenceItem(btsMarker);
				if (result == null) result = caseBTSSentenceItem(btsMarker);
				if (result == null) result = caseBTSTextItems(btsMarker);
				if (result == null) result = caseBTSReferencableItem(btsMarker);
				if (result == null) result = caseBTSObject(btsMarker);
				if (result == null) result = caseAdministrativDataObject(btsMarker);
				if (result == null) result = caseBTSObservableObject(btsMarker);
				if (result == null) result = caseBTSIdentifiableItem(btsMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TEXT_ITEMS: {
				BTSTextItems btsTextItems = (BTSTextItems)theEObject;
				T result = caseBTSTextItems(btsTextItems);
				if (result == null) result = caseBTSReferencableItem(btsTextItems);
				if (result == null) result = caseBTSObject(btsTextItems);
				if (result == null) result = caseAdministrativDataObject(btsTextItems);
				if (result == null) result = caseBTSObservableObject(btsTextItems);
				if (result == null) result = caseBTSIdentifiableItem(btsTextItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_SENTENCE_ITEM: {
				BTSSentenceItem btsSentenceItem = (BTSSentenceItem)theEObject;
				T result = caseBTSSentenceItem(btsSentenceItem);
				if (result == null) result = caseBTSReferencableItem(btsSentenceItem);
				if (result == null) result = caseBTSObject(btsSentenceItem);
				if (result == null) result = caseAdministrativDataObject(btsSentenceItem);
				if (result == null) result = caseBTSObservableObject(btsSentenceItem);
				if (result == null) result = caseBTSIdentifiableItem(btsSentenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_LIST_ENTRY: {
				BTSListEntry btsListEntry = (BTSListEntry)theEObject;
				T result = caseBTSListEntry(btsListEntry);
				if (result == null) result = caseBTSCorpusObject(btsListEntry);
				if (result == null) result = caseBTSObject(btsListEntry);
				if (result == null) result = caseBTSDBBaseObject(btsListEntry);
				if (result == null) result = caseAdministrativDataObject(btsListEntry);
				if (result == null) result = caseBTSObservableObject(btsListEntry);
				if (result == null) result = caseBTSIdentifiableItem(btsListEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PASSPORT: {
				BTSPassport btsPassport = (BTSPassport)theEObject;
				T result = caseBTSPassport(btsPassport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT: {
				AdministrativDataObject administrativDataObject = (AdministrativDataObject)theEObject;
				T result = caseAdministrativDataObject(administrativDataObject);
				if (result == null) result = caseBTSObservableObject(administrativDataObject);
				if (result == null) result = caseBTSIdentifiableItem(administrativDataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_OBJECT: {
				BTSObject btsObject = (BTSObject)theEObject;
				T result = caseBTSObject(btsObject);
				if (result == null) result = caseAdministrativDataObject(btsObject);
				if (result == null) result = caseBTSObservableObject(btsObject);
				if (result == null) result = caseBTSIdentifiableItem(btsObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_AMBIVALENCE: {
				BTSAmbivalence btsAmbivalence = (BTSAmbivalence)theEObject;
				T result = caseBTSAmbivalence(btsAmbivalence);
				if (result == null) result = caseBTSTextSentenceItem(btsAmbivalence);
				if (result == null) result = caseBTSSentenceItem(btsAmbivalence);
				if (result == null) result = caseBTSTextItems(btsAmbivalence);
				if (result == null) result = caseBTSReferencableItem(btsAmbivalence);
				if (result == null) result = caseBTSObject(btsAmbivalence);
				if (result == null) result = caseAdministrativDataObject(btsAmbivalence);
				if (result == null) result = caseBTSObservableObject(btsAmbivalence);
				if (result == null) result = caseBTSIdentifiableItem(btsAmbivalence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_LEMMA_CASE: {
				BTSLemmaCase btsLemmaCase = (BTSLemmaCase)theEObject;
				T result = caseBTSLemmaCase(btsLemmaCase);
				if (result == null) result = caseBTSReferencableItem(btsLemmaCase);
				if (result == null) result = caseBTSObject(btsLemmaCase);
				if (result == null) result = caseAdministrativDataObject(btsLemmaCase);
				if (result == null) result = caseBTSObservableObject(btsLemmaCase);
				if (result == null) result = caseBTSIdentifiableItem(btsLemmaCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_USER: {
				BTSUser btsUser = (BTSUser)theEObject;
				T result = caseBTSUser(btsUser);
				if (result == null) result = caseBTSDBBaseObject(btsUser);
				if (result == null) result = caseBTSObject(btsUser);
				if (result == null) result = caseAdministrativDataObject(btsUser);
				if (result == null) result = caseBTSIdentifiableItem(btsUser);
				if (result == null) result = caseBTSObservableObject(btsUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_COMMENT: {
				BTSComment btsComment = (BTSComment)theEObject;
				T result = caseBTSComment(btsComment);
				if (result == null) result = caseBTSDBBaseObject(btsComment);
				if (result == null) result = caseBTSObject(btsComment);
				if (result == null) result = caseAdministrativDataObject(btsComment);
				if (result == null) result = caseBTSIdentifiableItem(btsComment);
				if (result == null) result = caseBTSObservableObject(btsComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE: {
				BTSInterTextReference btsInterTextReference = (BTSInterTextReference)theEObject;
				T result = caseBTSInterTextReference(btsInterTextReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TEXT_SENTENCE_ITEM: {
				BTSTextSentenceItem btsTextSentenceItem = (BTSTextSentenceItem)theEObject;
				T result = caseBTSTextSentenceItem(btsTextSentenceItem);
				if (result == null) result = caseBTSSentenceItem(btsTextSentenceItem);
				if (result == null) result = caseBTSTextItems(btsTextSentenceItem);
				if (result == null) result = caseBTSReferencableItem(btsTextSentenceItem);
				if (result == null) result = caseBTSObject(btsTextSentenceItem);
				if (result == null) result = caseAdministrativDataObject(btsTextSentenceItem);
				if (result == null) result = caseBTSObservableObject(btsTextSentenceItem);
				if (result == null) result = caseBTSIdentifiableItem(btsTextSentenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_ANNOTATION: {
				BTSAnnotation btsAnnotation = (BTSAnnotation)theEObject;
				T result = caseBTSAnnotation(btsAnnotation);
				if (result == null) result = caseBTSCorpusObject(btsAnnotation);
				if (result == null) result = caseBTSObject(btsAnnotation);
				if (result == null) result = caseBTSDBBaseObject(btsAnnotation);
				if (result == null) result = caseAdministrativDataObject(btsAnnotation);
				if (result == null) result = caseBTSObservableObject(btsAnnotation);
				if (result == null) result = caseBTSIdentifiableItem(btsAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TRANSLATION: {
				BTSTranslation btsTranslation = (BTSTranslation)theEObject;
				T result = caseBTSTranslation(btsTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_DATE: {
				BTSDate btsDate = (BTSDate)theEObject;
				T result = caseBTSDate(btsDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_GROUP: {
				BTSPassportEntryGroup btsPassportEntryGroup = (BTSPassportEntryGroup)theEObject;
				T result = caseBTSPassportEntryGroup(btsPassportEntryGroup);
				if (result == null) result = caseBTSPassportEntry(btsPassportEntryGroup);
				if (result == null) result = caseBTSIdentifiableItem(btsPassportEntryGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_RELATION: {
				BTSRelation btsRelation = (BTSRelation)theEObject;
				T result = caseBTSRelation(btsRelation);
				if (result == null) result = caseBTSIdentifiableItem(btsRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_CONFIGURATION: {
				BTSConfiguration btsConfiguration = (BTSConfiguration)theEObject;
				T result = caseBTSConfiguration(btsConfiguration);
				if (result == null) result = caseBTSDBBaseObject(btsConfiguration);
				if (result == null) result = caseBTSConfig(btsConfiguration);
				if (result == null) result = caseBTSObject(btsConfiguration);
				if (result == null) result = caseAdministrativDataObject(btsConfiguration);
				if (result == null) result = caseBTSIdentifiableItem(btsConfiguration);
				if (result == null) result = caseBTSObservableObject(btsConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTSDB_BASE_OBJECT: {
				BTSDBBaseObject btsdbBaseObject = (BTSDBBaseObject)theEObject;
				T result = caseBTSDBBaseObject(btsdbBaseObject);
				if (result == null) result = caseBTSIdentifiableItem(btsdbBaseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TEXT_CORPUS: {
				BTSTextCorpus btsTextCorpus = (BTSTextCorpus)theEObject;
				T result = caseBTSTextCorpus(btsTextCorpus);
				if (result == null) result = caseBTSCorpusObject(btsTextCorpus);
				if (result == null) result = caseBTSObject(btsTextCorpus);
				if (result == null) result = caseBTSDBBaseObject(btsTextCorpus);
				if (result == null) result = caseAdministrativDataObject(btsTextCorpus);
				if (result == null) result = caseBTSObservableObject(btsTextCorpus);
				if (result == null) result = caseBTSIdentifiableItem(btsTextCorpus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_REVISION: {
				BTSRevision btsRevision = (BTSRevision)theEObject;
				T result = caseBTSRevision(btsRevision);
				if (result == null) result = caseBTSIdentifiableItem(btsRevision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_IMAGE: {
				BTSImage btsImage = (BTSImage)theEObject;
				T result = caseBTSImage(btsImage);
				if (result == null) result = caseBTSCorpusObject(btsImage);
				if (result == null) result = caseBTSObject(btsImage);
				if (result == null) result = caseBTSDBBaseObject(btsImage);
				if (result == null) result = caseAdministrativDataObject(btsImage);
				if (result == null) result = caseBTSObservableObject(btsImage);
				if (result == null) result = caseBTSIdentifiableItem(btsImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_CORPUS_HEADER: {
				BTSCorpusHeader btsCorpusHeader = (BTSCorpusHeader)theEObject;
				T result = caseBTSCorpusHeader(btsCorpusHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TIMESPAN: {
				BTSTimespan btsTimespan = (BTSTimespan)theEObject;
				T result = caseBTSTimespan(btsTimespan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_CORPUS_OBJECT: {
				BTSCorpusObject btsCorpusObject = (BTSCorpusObject)theEObject;
				T result = caseBTSCorpusObject(btsCorpusObject);
				if (result == null) result = caseBTSObject(btsCorpusObject);
				if (result == null) result = caseBTSDBBaseObject(btsCorpusObject);
				if (result == null) result = caseAdministrativDataObject(btsCorpusObject);
				if (result == null) result = caseBTSObservableObject(btsCorpusObject);
				if (result == null) result = caseBTSIdentifiableItem(btsCorpusObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_EXTERNAL_REFERENCE: {
				BTSExternalReference btsExternalReference = (BTSExternalReference)theEObject;
				T result = caseBTSExternalReference(btsExternalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM: {
				BTSReferencableItem btsReferencableItem = (BTSReferencableItem)theEObject;
				T result = caseBTSReferencableItem(btsReferencableItem);
				if (result == null) result = caseBTSObject(btsReferencableItem);
				if (result == null) result = caseAdministrativDataObject(btsReferencableItem);
				if (result == null) result = caseBTSObservableObject(btsReferencableItem);
				if (result == null) result = caseBTSIdentifiableItem(btsReferencableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_GRAPHIC: {
				BTSGraphic btsGraphic = (BTSGraphic)theEObject;
				T result = caseBTSGraphic(btsGraphic);
				if (result == null) result = caseBTSIdentifiableItem(btsGraphic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TRANSLATIONS: {
				BTSTranslations btsTranslations = (BTSTranslations)theEObject;
				T result = caseBTSTranslations(btsTranslations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_CONFIG_ITEM: {
				BTSConfigItem btsConfigItem = (BTSConfigItem)theEObject;
				T result = caseBTSConfigItem(btsConfigItem);
				if (result == null) result = caseBTSConfig(btsConfigItem);
				if (result == null) result = caseBTSObservableObject(btsConfigItem);
				if (result == null) result = caseBTSIdentifiableItem(btsConfigItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG: {
				BTSPassportEditorConfig btsPassportEditorConfig = (BTSPassportEditorConfig)theEObject;
				T result = caseBTSPassportEditorConfig(btsPassportEditorConfig);
				if (result == null) result = caseBTSIdentifiableItem(btsPassportEditorConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_USER_GROUP: {
				BTSUserGroup btsUserGroup = (BTSUserGroup)theEObject;
				T result = caseBTSUserGroup(btsUserGroup);
				if (result == null) result = caseBTSDBBaseObject(btsUserGroup);
				if (result == null) result = caseBTSObject(btsUserGroup);
				if (result == null) result = caseAdministrativDataObject(btsUserGroup);
				if (result == null) result = caseBTSIdentifiableItem(btsUserGroup);
				if (result == null) result = caseBTSObservableObject(btsUserGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_LIST: {
				BTSList btsList = (BTSList)theEObject;
				T result = caseBTSList(btsList);
				if (result == null) result = caseBTSCorpusObject(btsList);
				if (result == null) result = caseBTSObject(btsList);
				if (result == null) result = caseBTSDBBaseObject(btsList);
				if (result == null) result = caseAdministrativDataObject(btsList);
				if (result == null) result = caseBTSObservableObject(btsList);
				if (result == null) result = caseBTSIdentifiableItem(btsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_ITEM: {
				BTSPassportEntryItem btsPassportEntryItem = (BTSPassportEntryItem)theEObject;
				T result = caseBTSPassportEntryItem(btsPassportEntryItem);
				if (result == null) result = caseBTSPassportEntry(btsPassportEntryItem);
				if (result == null) result = caseBTSIdentifiableItem(btsPassportEntryItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_LIST_SUBENTRY: {
				BTSListSubentry btsListSubentry = (BTSListSubentry)theEObject;
				T result = caseBTSListSubentry(btsListSubentry);
				if (result == null) result = caseBTSReferencableItem(btsListSubentry);
				if (result == null) result = caseBTSObject(btsListSubentry);
				if (result == null) result = caseAdministrativDataObject(btsListSubentry);
				if (result == null) result = caseBTSObservableObject(btsListSubentry);
				if (result == null) result = caseBTSIdentifiableItem(btsListSubentry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_CONFIG: {
				BTSConfig btsConfig = (BTSConfig)theEObject;
				T result = caseBTSConfig(btsConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_OBSERVABLE_OBJECT: {
				BTSObservableObject btsObservableObject = (BTSObservableObject)theEObject;
				T result = caseBTSObservableObject(btsObservableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_THS_ENTRY: {
				BTSThsEntry btsThsEntry = (BTSThsEntry)theEObject;
				T result = caseBTSThsEntry(btsThsEntry);
				if (result == null) result = caseBTSCorpusObject(btsThsEntry);
				if (result == null) result = caseBTSObject(btsThsEntry);
				if (result == null) result = caseBTSDBBaseObject(btsThsEntry);
				if (result == null) result = caseAdministrativDataObject(btsThsEntry);
				if (result == null) result = caseBTSObservableObject(btsThsEntry);
				if (result == null) result = caseBTSIdentifiableItem(btsThsEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PROJECT: {
				BTSProject btsProject = (BTSProject)theEObject;
				T result = caseBTSProject(btsProject);
				if (result == null) result = caseBTSObject(btsProject);
				if (result == null) result = caseBTSDBBaseObject(btsProject);
				if (result == null) result = caseAdministrativDataObject(btsProject);
				if (result == null) result = caseBTSObservableObject(btsProject);
				if (result == null) result = caseBTSIdentifiableItem(btsProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTSDB_CONNECTION: {
				BTSDBConnection btsdbConnection = (BTSDBConnection)theEObject;
				T result = caseBTSDBConnection(btsdbConnection);
				if (result == null) result = caseBTSIdentifiableItem(btsdbConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_WORKFLOW_RULE: {
				BTSWorkflowRule btsWorkflowRule = (BTSWorkflowRule)theEObject;
				T result = caseBTSWorkflowRule(btsWorkflowRule);
				if (result == null) result = caseBTSIdentifiableItem(btsWorkflowRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_OPERATOR: {
				BTSOperator btsOperator = (BTSOperator)theEObject;
				T result = caseBTSOperator(btsOperator);
				if (result == null) result = caseBTSWorkflowRuleItem(btsOperator);
				if (result == null) result = caseBTSObservableObject(btsOperator);
				if (result == null) result = caseBTSIdentifiableItem(btsOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM: {
				BTSWorkflowRuleItem btsWorkflowRuleItem = (BTSWorkflowRuleItem)theEObject;
				T result = caseBTSWorkflowRuleItem(btsWorkflowRuleItem);
				if (result == null) result = caseBTSObservableObject(btsWorkflowRuleItem);
				if (result == null) result = caseBTSIdentifiableItem(btsWorkflowRuleItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.DB_LEASE: {
				DBLease dbLease = (DBLease)theEObject;
				T result = caseDBLease(dbLease);
				if (result == null) result = caseBTSDBBaseObject(dbLease);
				if (result == null) result = caseBTSIdentifiableItem(dbLease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION: {
				BTSProjectDBCollection btsProjectDBCollection = (BTSProjectDBCollection)theEObject;
				T result = caseBTSProjectDBCollection(btsProjectDBCollection);
				if (result == null) result = caseBTSIdentifiableItem(btsProjectDBCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM: {
				BTSIdentifiableItem btsIdentifiableItem = (BTSIdentifiableItem)theEObject;
				T result = caseBTSIdentifiableItem(btsIdentifiableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC: {
				BTSDBCollectionRoleDesc btsdbCollectionRoleDesc = (BTSDBCollectionRoleDesc)theEObject;
				T result = caseBTSDBCollectionRoleDesc(btsdbCollectionRoleDesc);
				if (result == null) result = caseBTSIdentifiableItem(btsdbCollectionRoleDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TEXT_CONTENT: {
				BTSTextContent btsTextContent = (BTSTextContent)theEObject;
				T result = caseBTSTextContent(btsTextContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_AMBIVALENCE_ITEM: {
				BTSAmbivalenceItem btsAmbivalenceItem = (BTSAmbivalenceItem)theEObject;
				T result = caseBTSAmbivalenceItem(btsAmbivalenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER: {
				GraphicSelectionCounter graphicSelectionCounter = (GraphicSelectionCounter)theEObject;
				T result = caseGraphicSelectionCounter(graphicSelectionCounter);
				if (result == null) result = caseBTSDBBaseObject(graphicSelectionCounter);
				if (result == null) result = caseBTSIdentifiableItem(graphicSelectionCounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PASSPORT_ENTRY: {
				BTSPassportEntry btsPassportEntry = (BTSPassportEntry)theEObject;
				T result = caseBTSPassportEntry(btsPassportEntry);
				if (result == null) result = caseBTSIdentifiableItem(btsPassportEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.STRING_TO_STRING_LIST_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EList<String>> stringToStringListMap = (Map.Entry<String, EList<String>>)theEObject;
				T result = caseStringToStringListMap(stringToStringListMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTSTC Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTSTC Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTCObject(BTSTCObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSText(BTSText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Senctence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Senctence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSSenctence(BTSSenctence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSWord(BTSWord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSMarker(BTSMarker object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Text Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Text Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTextItems(BTSTextItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Sentence Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Sentence Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSSentenceItem(BTSSentenceItem object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSListEntry(BTSListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Passport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Passport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSPassport(BTSPassport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrativ Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrativ Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativDataObject(AdministrativDataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSObject(BTSObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Ambivalence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Ambivalence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSAmbivalence(BTSAmbivalence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Lemma Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Lemma Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSLemmaCase(BTSLemmaCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSUser(BTSUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSComment(BTSComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Inter Text Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Inter Text Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSInterTextReference(BTSInterTextReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Text Sentence Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Text Sentence Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTextSentenceItem(BTSTextSentenceItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSAnnotation(BTSAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTranslation(BTSTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSDate(BTSDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Passport Entry Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Passport Entry Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSPassportEntryGroup(BTSPassportEntryGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSRelation(BTSRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSConfiguration(BTSConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTSDB Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTSDB Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSDBBaseObject(BTSDBBaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Text Corpus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Text Corpus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTextCorpus(BTSTextCorpus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSRevision(BTSRevision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSImage(BTSImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Corpus Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Corpus Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSCorpusHeader(BTSCorpusHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Timespan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Timespan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTimespan(BTSTimespan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Corpus Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Corpus Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSCorpusObject(BTSCorpusObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS External Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSExternalReference(BTSExternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Referencable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Referencable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSReferencableItem(BTSReferencableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Graphic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Graphic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSGraphic(BTSGraphic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Translations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Translations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTranslations(BTSTranslations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Config Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Config Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSConfigItem(BTSConfigItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Passport Editor Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Passport Editor Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSPassportEditorConfig(BTSPassportEditorConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS User Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS User Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSUserGroup(BTSUserGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSList(BTSList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Passport Entry Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Passport Entry Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSPassportEntryItem(BTSPassportEntryItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS List Subentry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS List Subentry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSListSubentry(BTSListSubentry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSConfig(BTSConfig object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Observable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Observable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSObservableObject(BTSObservableObject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Ths Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Ths Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSThsEntry(BTSThsEntry object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSProject(BTSProject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTSDB Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTSDB Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSDBConnection(BTSDBConnection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Workflow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Workflow Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSWorkflowRule(BTSWorkflowRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSOperator(BTSOperator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Workflow Rule Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Workflow Rule Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSWorkflowRuleItem(BTSWorkflowRuleItem object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Lease</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Lease</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBLease(DBLease object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Project DB Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Project DB Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSProjectDBCollection(BTSProjectDBCollection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Identifiable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Identifiable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSIdentifiableItem(BTSIdentifiableItem object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTSDB Collection Role Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTSDB Collection Role Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSDBCollectionRoleDesc(BTSDBCollectionRoleDesc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Text Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Text Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTextContent(BTSTextContent object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Ambivalence Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Ambivalence Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSAmbivalenceItem(BTSAmbivalenceItem object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Selection Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Selection Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicSelectionCounter(GraphicSelectionCounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Passport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Passport Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSPassportEntry(BTSPassportEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String List Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String List Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringListMap(Map.Entry<String, EList<String>> object) {
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

} //BtsmodelSwitch
