/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.corpus.btsCorpusModel.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsCorpusModelFactoryImpl extends EFactoryImpl implements BtsCorpusModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtsCorpusModelFactory init() {
		try {
			BtsCorpusModelFactory theBtsCorpusModelFactory = (BtsCorpusModelFactory)EPackage.Registry.INSTANCE.getEFactory(BtsCorpusModelPackage.eNS_URI);
			if (theBtsCorpusModelFactory != null) {
				return theBtsCorpusModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtsCorpusModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsCorpusModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BtsCorpusModelPackage.BTSTC_OBJECT: return createBTSTCObject();
			case BtsCorpusModelPackage.BTS_TEXT: return createBTSText();
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY: return createBTSLemmaEntry();
			case BtsCorpusModelPackage.BTS_PASSPORT: return createBTSPassport();
			case BtsCorpusModelPackage.BTS_ANNOTATION: return createBTSAnnotation();
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_GROUP: return createBTSPassportEntryGroup();
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS: return createBTSTextCorpus();
			case BtsCorpusModelPackage.BTS_IMAGE: return createBTSImage();
			case BtsCorpusModelPackage.BTS_CORPUS_HEADER: return createBTSCorpusHeader();
			case BtsCorpusModelPackage.BTS_THS_ENTRY: return createBTSThsEntry();
			case BtsCorpusModelPackage.BTS_TEXT_CONTENT: return createBTSTextContent();
			case BtsCorpusModelPackage.BTS_LEMMA_SUBENTRY: return createBTSLemmaSubentry();
			case BtsCorpusModelPackage.BTS_WORD: return createBTSWord();
			case BtsCorpusModelPackage.BTS_GRAPHIC: return createBTSGraphic();
			case BtsCorpusModelPackage.BTS_SENCTENCE: return createBTSSenctence();
			case BtsCorpusModelPackage.BTS_MARKER: return createBTSMarker();
			case BtsCorpusModelPackage.BTS_AMBIVALENCE: return createBTSAmbivalence();
			case BtsCorpusModelPackage.BTS_LEMMA_CASE: return createBTSLemmaCase();
			case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM: return createBTSPassportEntryItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	private void setIdentifiableId(EObject eObject)
	{
		if (eObject instanceof BTSIdentifiableItem)
		{
			((BTSIdentifiableItem) eObject).set_id(BTSConstants.getSidWithCalendar());
		}
		if (eObject instanceof AdministrativDataObject)
		{
			((AdministrativDataObject) eObject)
					.setState(BTSConstants.OBJECT_STATE_ACTIVE);
		}
	}
	

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSTCObject createBTSTCObject()
	{
		BTSTCObjectImpl btstcObject = new BTSTCObjectImpl();
		setIdentifiableId(btstcObject);
		return btstcObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSText createBTSText()
	{
		BTSTextImpl btsText = new BTSTextImpl();
		setIdentifiableId(btsText);
		return btsText;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public BTSLemmaEntry createBTSLemmaEntry() {
		BTSLemmaEntryImpl btsLemmaEntry = new BTSLemmaEntryImpl();
		setIdentifiableId(btsLemmaEntry);
		return btsLemmaEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSPassport createBTSPassport()
	{
		BTSPassportImpl btsPassport = new BTSPassportImpl();
		setIdentifiableId(btsPassport);
		return btsPassport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSAnnotation createBTSAnnotation()
	{
		BTSAnnotationImpl btsAnnotation = new BTSAnnotationImpl();
		setIdentifiableId(btsAnnotation);
		return btsAnnotation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSPassportEntryGroup createBTSPassportEntryGroup() {
		BTSPassportEntryGroupImpl btsPassportEntryGroup = new BTSPassportEntryGroupImpl();
		setIdentifiableId(btsPassportEntryGroup);
		return btsPassportEntryGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSTextCorpus createBTSTextCorpus()
	{
		BTSTextCorpusImpl btsTextCorpus = new BTSTextCorpusImpl();
		setIdentifiableId(btsTextCorpus);
		return btsTextCorpus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSImage createBTSImage()
	{
		BTSImageImpl btsImage = new BTSImageImpl();
		setIdentifiableId(btsImage);
		return btsImage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSCorpusHeader createBTSCorpusHeader()
	{
		BTSCorpusHeaderImpl btsCorpusHeader = new BTSCorpusHeaderImpl();
		setIdentifiableId(btsCorpusHeader);
		return btsCorpusHeader;
	}
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSThsEntry createBTSThsEntry()
	{
		BTSThsEntryImpl btsThsEntry = new BTSThsEntryImpl();
		setIdentifiableId(btsThsEntry);
		return btsThsEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public BTSTextContent createBTSTextContent() {
		BTSTextContentImpl btsTextContent = new BTSTextContentImpl();
		setIdentifiableId(btsTextContent);
		return btsTextContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public BTSLemmaSubentry createBTSLemmaSubentry() {
		BTSLemmaSubentryImpl btsLemmaSubentry = new BTSLemmaSubentryImpl();
		setIdentifiableId(btsLemmaSubentry);
		return btsLemmaSubentry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSWord createBTSWord()
	{
		BTSWordImpl btsWord = new BTSWordImpl();
		setIdentifiableId(btsWord);
		return btsWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSGraphic createBTSGraphic() {
		BTSGraphicImpl btsGraphic = new BTSGraphicImpl();
		return btsGraphic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSSenctence createBTSSenctence()
	{
		BTSSenctenceImpl btsSenctence = new BTSSenctenceImpl();
		setIdentifiableId(btsSenctence);
		return btsSenctence;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSMarker createBTSMarker()
	{
		BTSMarkerImpl btsMarker = new BTSMarkerImpl();
		setIdentifiableId(btsMarker);
		return btsMarker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSAmbivalence createBTSAmbivalence()
	{
		BTSAmbivalenceImpl btsAmbivalence = new BTSAmbivalenceImpl();
		setIdentifiableId(btsAmbivalence);
		return btsAmbivalence;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSLemmaCase createBTSLemmaCase()
	{
		BTSLemmaCaseImpl btsLemmaCase = new BTSLemmaCaseImpl();
		setIdentifiableId(btsLemmaCase);
		return btsLemmaCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassportEntryItem createBTSPassportEntryItem() {
		BTSPassportEntryItemImpl btsPassportEntryItem = new BTSPassportEntryItemImpl();
		return btsPassportEntryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsCorpusModelPackage getBtsCorpusModelPackage() {
		return (BtsCorpusModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BtsCorpusModelPackage getPackage() {
		return BtsCorpusModelPackage.eINSTANCE;
	}

	@Override
	public BTSSenctence createBTSSenctence(boolean setId) {
		BTSSenctence entity = createBTSSenctence();
		if (setId) {
			setIdentifiableId(entity);
		}
		return entity;
	}

	@Override
	public BTSWord createBTSWord(boolean setId) {
		BTSWord entity = createBTSWord();
		if (setId) {
			setIdentifiableId(entity);
		}
		return entity;
	}

	@Override
	public BTSMarker createBTSMarker(boolean setId) {
		BTSMarker entity = createBTSMarker();
		if (setId) {
			setIdentifiableId(entity);
		}
		return entity;
	}

	@Override
	public BTSAmbivalence createBTSAmbivalence(boolean setId) {
		BTSAmbivalence entity = createBTSAmbivalence();
		if (setId) {
			setIdentifiableId(entity);
		}
		return entity;
	}

	@Override
	public BTSLemmaCase createBTSLemmaCase(boolean setId) {
		BTSLemmaCase entity = createBTSLemmaCase();
		if (setId) {
			setIdentifiableId(entity);
		}
		return entity;
	}

	@Override
	public BTSTextContent createBTSTextContent(boolean setId) {
		BTSTextContent entity = createBTSTextContent();
		if (setId) {
			setIdentifiableId(entity);
		}
		return entity;
	}

	
} //BtsCorpusModelFactoryImpl
