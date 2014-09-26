/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage
 * @generated
 */
public interface BtsCorpusModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsCorpusModelFactory eINSTANCE = org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BTSTC Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTSTC Object</em>'.
	 * @generated
	 */
	BTSTCObject createBTSTCObject();

	/**
	 * Returns a new object of class '<em>BTS Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Text</em>'.
	 * @generated
	 */
	BTSText createBTSText();

	/**
	 * Returns a new object of class '<em>BTS Lemma Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Lemma Entry</em>'.
	 * @generated
	 */
	BTSLemmaEntry createBTSLemmaEntry();

	/**
	 * Returns a new object of class '<em>BTS Passport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport</em>'.
	 * @generated
	 */
	BTSPassport createBTSPassport();

	/**
	 * Returns a new object of class '<em>BTS Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Annotation</em>'.
	 * @generated
	 */
	BTSAnnotation createBTSAnnotation();

	/**
	 * Returns a new object of class '<em>BTS Passport Entry Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport Entry Group</em>'.
	 * @generated
	 */
	BTSPassportEntryGroup createBTSPassportEntryGroup();

	/**
	 * Returns a new object of class '<em>BTS Text Corpus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Text Corpus</em>'.
	 * @generated
	 */
	BTSTextCorpus createBTSTextCorpus();

	/**
	 * Returns a new object of class '<em>BTS Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Image</em>'.
	 * @generated
	 */
	BTSImage createBTSImage();

	/**
	 * Returns a new object of class '<em>BTS Corpus Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Corpus Header</em>'.
	 * @generated
	 */
	BTSCorpusHeader createBTSCorpusHeader();

	/**
	 * Returns a new object of class '<em>BTS Ths Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Ths Entry</em>'.
	 * @generated
	 */
	BTSThsEntry createBTSThsEntry();

	/**
	 * Returns a new object of class '<em>BTS Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Word</em>'.
	 * @generated
	 */
	BTSWord createBTSWord();

	/**
	 * Returns a new object of class '<em>BTS Graphic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Graphic</em>'.
	 * @generated
	 */
	BTSGraphic createBTSGraphic();

	/**
	 * Returns a new object of class '<em>BTS Senctence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Senctence</em>'.
	 * @generated
	 */
	BTSSenctence createBTSSenctence();

	/**
	 * Returns a new object of class '<em>BTS Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Marker</em>'.
	 * @generated
	 */
	BTSMarker createBTSMarker();

	/**
	 * Returns a new object of class '<em>BTS Ambivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Ambivalence</em>'.
	 * @generated
	 */
	BTSAmbivalence createBTSAmbivalence();

	/**
	 * Returns a new object of class '<em>BTS Lemma Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Lemma Case</em>'.
	 * @generated
	 */
	BTSLemmaCase createBTSLemmaCase();

	/**
	 * Returns a new object of class '<em>BTS Passport Entry Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport Entry Item</em>'.
	 * @generated
	 */
	BTSPassportEntryItem createBTSPassportEntryItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtsCorpusModelPackage getBtsCorpusModelPackage();
	
	BTSSenctence createBTSSenctence(boolean setId);

	BTSWord createBTSWord(boolean setId);
	BTSMarker createBTSMarker(boolean setId);
	BTSAmbivalence createBTSAmbivalence(boolean setId);
	BTSLemmaCase createBTSLemmaCase(boolean setId);
	
	BTSTextContent createBTSTextContent(boolean setId);

	BTSTextContent createBTSTextContent();
} //BtsCorpusModelFactory
