/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.util;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSNamedTypedObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.corpus.btsCorpusModel.*;
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
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage
 * @generated
 */
public class BtsCorpusModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtsCorpusModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsCorpusModelSwitch() {
		if (modelPackage == null) {
			modelPackage = BtsCorpusModelPackage.eINSTANCE;
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
			case BtsCorpusModelPackage.BTS_CORPUS_OBJECT: {
				BTSCorpusObject btsCorpusObject = (BTSCorpusObject)theEObject;
				T result = caseBTSCorpusObject(btsCorpusObject);
				if (result == null) result = caseBTSObject(btsCorpusObject);
				if (result == null) result = caseAdministrativDataObject(btsCorpusObject);
				if (result == null) result = caseBTSDBBaseObject(btsCorpusObject);
				if (result == null) result = caseBTSNamedTypedObject(btsCorpusObject);
				if (result == null) result = caseBTSObservableObject(btsCorpusObject);
				if (result == null) result = caseBTSIdentifiableItem(btsCorpusObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTSTC_OBJECT: {
				BTSTCObject btstcObject = (BTSTCObject)theEObject;
				T result = caseBTSTCObject(btstcObject);
				if (result == null) result = caseBTSCorpusObject(btstcObject);
				if (result == null) result = caseBTSObject(btstcObject);
				if (result == null) result = caseAdministrativDataObject(btstcObject);
				if (result == null) result = caseBTSDBBaseObject(btstcObject);
				if (result == null) result = caseBTSNamedTypedObject(btstcObject);
				if (result == null) result = caseBTSObservableObject(btstcObject);
				if (result == null) result = caseBTSIdentifiableItem(btstcObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_TEXT: {
				BTSText btsText = (BTSText)theEObject;
				T result = caseBTSText(btsText);
				if (result == null) result = caseBTSCorpusObject(btsText);
				if (result == null) result = caseBTSObject(btsText);
				if (result == null) result = caseAdministrativDataObject(btsText);
				if (result == null) result = caseBTSDBBaseObject(btsText);
				if (result == null) result = caseBTSNamedTypedObject(btsText);
				if (result == null) result = caseBTSObservableObject(btsText);
				if (result == null) result = caseBTSIdentifiableItem(btsText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY: {
				BTSLemmaEntry btsLemmaEntry = (BTSLemmaEntry)theEObject;
				T result = caseBTSLemmaEntry(btsLemmaEntry);
				if (result == null) result = caseBTSCorpusObject(btsLemmaEntry);
				if (result == null) result = caseBTSObject(btsLemmaEntry);
				if (result == null) result = caseAdministrativDataObject(btsLemmaEntry);
				if (result == null) result = caseBTSDBBaseObject(btsLemmaEntry);
				if (result == null) result = caseBTSNamedTypedObject(btsLemmaEntry);
				if (result == null) result = caseBTSObservableObject(btsLemmaEntry);
				if (result == null) result = caseBTSIdentifiableItem(btsLemmaEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_PASSPORT: {
				BTSPassport btsPassport = (BTSPassport)theEObject;
				T result = caseBTSPassport(btsPassport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_ANNOTATION: {
				BTSAnnotation btsAnnotation = (BTSAnnotation)theEObject;
				T result = caseBTSAnnotation(btsAnnotation);
				if (result == null) result = caseBTSCorpusObject(btsAnnotation);
				if (result == null) result = caseBTSObject(btsAnnotation);
				if (result == null) result = caseAdministrativDataObject(btsAnnotation);
				if (result == null) result = caseBTSDBBaseObject(btsAnnotation);
				if (result == null) result = caseBTSNamedTypedObject(btsAnnotation);
				if (result == null) result = caseBTSObservableObject(btsAnnotation);
				if (result == null) result = caseBTSIdentifiableItem(btsAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_GROUP: {
				BTSPassportEntryGroup btsPassportEntryGroup = (BTSPassportEntryGroup)theEObject;
				T result = caseBTSPassportEntryGroup(btsPassportEntryGroup);
				if (result == null) result = caseBTSPassportEntry(btsPassportEntryGroup);
				if (result == null) result = caseBTSIdentifiableItem(btsPassportEntryGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS: {
				BTSTextCorpus btsTextCorpus = (BTSTextCorpus)theEObject;
				T result = caseBTSTextCorpus(btsTextCorpus);
				if (result == null) result = caseBTSCorpusObject(btsTextCorpus);
				if (result == null) result = caseBTSObject(btsTextCorpus);
				if (result == null) result = caseAdministrativDataObject(btsTextCorpus);
				if (result == null) result = caseBTSDBBaseObject(btsTextCorpus);
				if (result == null) result = caseBTSNamedTypedObject(btsTextCorpus);
				if (result == null) result = caseBTSObservableObject(btsTextCorpus);
				if (result == null) result = caseBTSIdentifiableItem(btsTextCorpus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_IMAGE: {
				BTSImage btsImage = (BTSImage)theEObject;
				T result = caseBTSImage(btsImage);
				if (result == null) result = caseBTSCorpusObject(btsImage);
				if (result == null) result = caseBTSObject(btsImage);
				if (result == null) result = caseAdministrativDataObject(btsImage);
				if (result == null) result = caseBTSDBBaseObject(btsImage);
				if (result == null) result = caseBTSNamedTypedObject(btsImage);
				if (result == null) result = caseBTSObservableObject(btsImage);
				if (result == null) result = caseBTSIdentifiableItem(btsImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_CORPUS_HEADER: {
				BTSCorpusHeader btsCorpusHeader = (BTSCorpusHeader)theEObject;
				T result = caseBTSCorpusHeader(btsCorpusHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_THS_ENTRY: {
				BTSThsEntry btsThsEntry = (BTSThsEntry)theEObject;
				T result = caseBTSThsEntry(btsThsEntry);
				if (result == null) result = caseBTSCorpusObject(btsThsEntry);
				if (result == null) result = caseBTSObject(btsThsEntry);
				if (result == null) result = caseAdministrativDataObject(btsThsEntry);
				if (result == null) result = caseBTSDBBaseObject(btsThsEntry);
				if (result == null) result = caseBTSNamedTypedObject(btsThsEntry);
				if (result == null) result = caseBTSObservableObject(btsThsEntry);
				if (result == null) result = caseBTSIdentifiableItem(btsThsEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_TEXT_CONTENT: {
				BTSTextContent btsTextContent = (BTSTextContent)theEObject;
				T result = caseBTSTextContent(btsTextContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY: {
				BTSPassportEntry btsPassportEntry = (BTSPassportEntry)theEObject;
				T result = caseBTSPassportEntry(btsPassportEntry);
				if (result == null) result = caseBTSIdentifiableItem(btsPassportEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_WORD: {
				BTSWord btsWord = (BTSWord)theEObject;
				T result = caseBTSWord(btsWord);
				if (result == null) result = caseBTSAmbivalenceItem(btsWord);
				if (result == null) result = caseBTSSentenceItem(btsWord);
				if (result == null) result = caseBTSNamedTypedObject(btsWord);
				if (result == null) result = caseBTSIdentifiableItem(btsWord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_TEXT_ITEMS: {
				BTSTextItems btsTextItems = (BTSTextItems)theEObject;
				T result = caseBTSTextItems(btsTextItems);
				if (result == null) result = caseAdministrativDataObject(btsTextItems);
				if (result == null) result = caseBTSNamedTypedObject(btsTextItems);
				if (result == null) result = caseBTSObservableObject(btsTextItems);
				if (result == null) result = caseBTSIdentifiableItem(btsTextItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_GRAPHIC: {
				BTSGraphic btsGraphic = (BTSGraphic)theEObject;
				T result = caseBTSGraphic(btsGraphic);
				if (result == null) result = caseBTSIdentifiableItem(btsGraphic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_SENCTENCE: {
				BTSSenctence btsSenctence = (BTSSenctence)theEObject;
				T result = caseBTSSenctence(btsSenctence);
				if (result == null) result = caseBTSTextItems(btsSenctence);
				if (result == null) result = caseAdministrativDataObject(btsSenctence);
				if (result == null) result = caseBTSNamedTypedObject(btsSenctence);
				if (result == null) result = caseBTSObservableObject(btsSenctence);
				if (result == null) result = caseBTSIdentifiableItem(btsSenctence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_MARKER: {
				BTSMarker btsMarker = (BTSMarker)theEObject;
				T result = caseBTSMarker(btsMarker);
				if (result == null) result = caseBTSAmbivalenceItem(btsMarker);
				if (result == null) result = caseBTSTextSentenceItem(btsMarker);
				if (result == null) result = caseBTSSentenceItem(btsMarker);
				if (result == null) result = caseBTSTextItems(btsMarker);
				if (result == null) result = caseBTSNamedTypedObject(btsMarker);
				if (result == null) result = caseAdministrativDataObject(btsMarker);
				if (result == null) result = caseBTSIdentifiableItem(btsMarker);
				if (result == null) result = caseBTSObservableObject(btsMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_SENTENCE_ITEM: {
				BTSSentenceItem btsSentenceItem = (BTSSentenceItem)theEObject;
				T result = caseBTSSentenceItem(btsSentenceItem);
				if (result == null) result = caseBTSNamedTypedObject(btsSentenceItem);
				if (result == null) result = caseBTSIdentifiableItem(btsSentenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_AMBIVALENCE: {
				BTSAmbivalence btsAmbivalence = (BTSAmbivalence)theEObject;
				T result = caseBTSAmbivalence(btsAmbivalence);
				if (result == null) result = caseBTSTextSentenceItem(btsAmbivalence);
				if (result == null) result = caseBTSSentenceItem(btsAmbivalence);
				if (result == null) result = caseBTSTextItems(btsAmbivalence);
				if (result == null) result = caseBTSNamedTypedObject(btsAmbivalence);
				if (result == null) result = caseAdministrativDataObject(btsAmbivalence);
				if (result == null) result = caseBTSIdentifiableItem(btsAmbivalence);
				if (result == null) result = caseBTSObservableObject(btsAmbivalence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_LEMMA_CASE: {
				BTSLemmaCase btsLemmaCase = (BTSLemmaCase)theEObject;
				T result = caseBTSLemmaCase(btsLemmaCase);
				if (result == null) result = caseBTSNamedTypedObject(btsLemmaCase);
				if (result == null) result = caseBTSIdentifiableItem(btsLemmaCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM: {
				BTSTextSentenceItem btsTextSentenceItem = (BTSTextSentenceItem)theEObject;
				T result = caseBTSTextSentenceItem(btsTextSentenceItem);
				if (result == null) result = caseBTSSentenceItem(btsTextSentenceItem);
				if (result == null) result = caseBTSTextItems(btsTextSentenceItem);
				if (result == null) result = caseBTSNamedTypedObject(btsTextSentenceItem);
				if (result == null) result = caseAdministrativDataObject(btsTextSentenceItem);
				if (result == null) result = caseBTSIdentifiableItem(btsTextSentenceItem);
				if (result == null) result = caseBTSObservableObject(btsTextSentenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_AMBIVALENCE_ITEM: {
				BTSAmbivalenceItem btsAmbivalenceItem = (BTSAmbivalenceItem)theEObject;
				T result = caseBTSAmbivalenceItem(btsAmbivalenceItem);
				if (result == null) result = caseBTSIdentifiableItem(btsAmbivalenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM: {
				BTSPassportEntryItem btsPassportEntryItem = (BTSPassportEntryItem)theEObject;
				T result = caseBTSPassportEntryItem(btsPassportEntryItem);
				if (result == null) result = caseBTSPassportEntry(btsPassportEntryItem);
				if (result == null) result = caseBTSIdentifiableItem(btsPassportEntryItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_ABSTRACT_TEXT: {
				BTSAbstractText btsAbstractText = (BTSAbstractText)theEObject;
				T result = caseBTSAbstractText(btsAbstractText);
				if (result == null) result = caseBTSCorpusObject(btsAbstractText);
				if (result == null) result = caseBTSObject(btsAbstractText);
				if (result == null) result = caseAdministrativDataObject(btsAbstractText);
				if (result == null) result = caseBTSDBBaseObject(btsAbstractText);
				if (result == null) result = caseBTSNamedTypedObject(btsAbstractText);
				if (result == null) result = caseBTSObservableObject(btsAbstractText);
				if (result == null) result = caseBTSIdentifiableItem(btsAbstractText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH: {
				BTSAbstractParagraph btsAbstractParagraph = (BTSAbstractParagraph)theEObject;
				T result = caseBTSAbstractParagraph(btsAbstractParagraph);
				if (result == null) result = caseBTSIdentifiableItem(btsAbstractParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>BTS Lemma Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Lemma Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSLemmaEntry(BTSLemmaEntry object) {
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
	public T caseBTSThsEntry(BTSThsEntry object) {
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
	public T caseBTSTextContent(BTSTextContent object) {
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
	public T caseBTSMarker(BTSMarker object) {
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
	public T caseBTSSentenceItem(BTSSentenceItem object) {
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
	public T caseBTSAmbivalenceItem(BTSAmbivalenceItem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>BTS Abstract Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Abstract Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSAbstractText(BTSAbstractText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Abstract Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Abstract Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSAbstractParagraph(BTSAbstractParagraph object) {
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
	public T caseBTSObservableObject(BTSObservableObject object) {
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
	public T caseBTSIdentifiableItem(BTSIdentifiableItem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>BTS Named Typed Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Named Typed Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSNamedTypedObject(BTSNamedTypedObject object) {
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

} //BtsCorpusModelSwitch
