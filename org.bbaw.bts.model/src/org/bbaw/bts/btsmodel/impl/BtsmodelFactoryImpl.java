/**
 */
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class BtsmodelFactoryImpl extends EFactoryImpl implements BtsmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtsmodelFactory init() {
		try
		{
			BtsmodelFactory theBtsmodelFactory = (BtsmodelFactory)EPackage.Registry.INSTANCE.getEFactory(BtsmodelPackage.eNS_URI);
			if (theBtsmodelFactory != null)
			{
				return theBtsmodelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtsmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID())
		{
			case BtsmodelPackage.BTSTC_OBJECT: return createBTSTCObject();
			case BtsmodelPackage.BTS_TEXT: return createBTSText();
			case BtsmodelPackage.BTS_SENCTENCE: return createBTSSenctence();
			case BtsmodelPackage.BTS_WORD: return createBTSWord();
			case BtsmodelPackage.BTS_DELIMITER: return createBTSDelimiter();
			case BtsmodelPackage.BTS_LIST_ENTRY: return createBTSListEntry();
			case BtsmodelPackage.BTS_PASSPORT: return createBTSPassport();
			case BtsmodelPackage.BTS_AMBIVALENCE: return createBTSAmbivalence();
			case BtsmodelPackage.BTS_LEMMA_CASE: return createBTSLemmaCase();
			case BtsmodelPackage.BTS_USER: return createBTSUser();
			case BtsmodelPackage.BTS_COMMENT: return createBTSComment();
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE: return createBTSInterTextReference();
			case BtsmodelPackage.BTS_ANNOTATION: return createBTSAnnotation();
			case BtsmodelPackage.BTS_TRANSLATION: return createBTSTranslation();
			case BtsmodelPackage.BTS_DATE: return createBTSDate();
			case BtsmodelPackage.BTS_PASSPORT_ENTRY: return createBTSPassportEntry();
			case BtsmodelPackage.BTS_RELATION: return createBTSRelation();
			case BtsmodelPackage.BTS_CONFIGURATION: return createBTSConfiguration();
			case BtsmodelPackage.BTS_TEXT_CORPUS: return createBTSTextCorpus();
			case BtsmodelPackage.BTS_REVISION: return createBTSRevision();
			case BtsmodelPackage.BTS_LEASE: return createBTSLease();
			case BtsmodelPackage.BTS_IMAGE: return createBTSImage();
			case BtsmodelPackage.BTS_CORPUS_HEADER: return createBTSCorpusHeader();
			case BtsmodelPackage.BTS_TIMESPAN: return createBTSTimespan();
			case BtsmodelPackage.BTS_EXTERNAL_REFERENCE: return createBTSExternalReference();
			case BtsmodelPackage.BTS_GRAPHIC: return createBTSGraphic();
			case BtsmodelPackage.BTS_TRANSLATIONS: return createBTSTranslations();
			case BtsmodelPackage.BTS_CONFIG_ITEM: return createBTSConfigItem();
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG: return createBTSPassportEditorConfig();
			case BtsmodelPackage.BTS_USER_GROUP: return createBTSUserGroup();
			case BtsmodelPackage.BTS_LIST: return createBTSList();
			case BtsmodelPackage.BTS_PP_SUBENTRY: return createBTSPpSubentry();
			case BtsmodelPackage.BTS_LIST_SUBENTRY: return createBTSListSubentry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID())
		{
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID())
		{
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTCObject createBTSTCObject() {
		BTSTCObjectImpl btstcObject = new BTSTCObjectImpl();
		return btstcObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSText createBTSText() {
		BTSTextImpl btsText = new BTSTextImpl();
		return btsText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSSenctence createBTSSenctence() {
		BTSSenctenceImpl btsSenctence = new BTSSenctenceImpl();
		return btsSenctence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSWord createBTSWord() {
		BTSWordImpl btsWord = new BTSWordImpl();
		return btsWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSDelimiter createBTSDelimiter() {
		BTSDelimiterImpl btsDelimiter = new BTSDelimiterImpl();
		return btsDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSListEntry createBTSListEntry() {
		BTSListEntryImpl btsListEntry = new BTSListEntryImpl();
		return btsListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassport createBTSPassport() {
		BTSPassportImpl btsPassport = new BTSPassportImpl();
		return btsPassport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSAmbivalence createBTSAmbivalence() {
		BTSAmbivalenceImpl btsAmbivalence = new BTSAmbivalenceImpl();
		return btsAmbivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSLemmaCase createBTSLemmaCase() {
		BTSLemmaCaseImpl btsLemmaCase = new BTSLemmaCaseImpl();
		return btsLemmaCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSUser createBTSUser() {
		BTSUserImpl btsUser = new BTSUserImpl();
		return btsUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSComment createBTSComment() {
		BTSCommentImpl btsComment = new BTSCommentImpl();
		return btsComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSInterTextReference createBTSInterTextReference() {
		BTSInterTextReferenceImpl btsInterTextReference = new BTSInterTextReferenceImpl();
		return btsInterTextReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSAnnotation createBTSAnnotation() {
		BTSAnnotationImpl btsAnnotation = new BTSAnnotationImpl();
		return btsAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTranslation createBTSTranslation() {
		BTSTranslationImpl btsTranslation = new BTSTranslationImpl();
		return btsTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSDate createBTSDate() {
		BTSDateImpl btsDate = new BTSDateImpl();
		return btsDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassportEntry createBTSPassportEntry() {
		BTSPassportEntryImpl btsPassportEntry = new BTSPassportEntryImpl();
		return btsPassportEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSRelation createBTSRelation() {
		BTSRelationImpl btsRelation = new BTSRelationImpl();
		return btsRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSConfiguration createBTSConfiguration() {
		BTSConfigurationImpl btsConfiguration = new BTSConfigurationImpl();
		return btsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTextCorpus createBTSTextCorpus() {
		BTSTextCorpusImpl btsTextCorpus = new BTSTextCorpusImpl();
		return btsTextCorpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSRevision createBTSRevision() {
		BTSRevisionImpl btsRevision = new BTSRevisionImpl();
		return btsRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSLease createBTSLease() {
		BTSLeaseImpl btsLease = new BTSLeaseImpl();
		return btsLease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSImage createBTSImage() {
		BTSImageImpl btsImage = new BTSImageImpl();
		return btsImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSCorpusHeader createBTSCorpusHeader() {
		BTSCorpusHeaderImpl btsCorpusHeader = new BTSCorpusHeaderImpl();
		return btsCorpusHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTimespan createBTSTimespan() {
		BTSTimespanImpl btsTimespan = new BTSTimespanImpl();
		return btsTimespan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSExternalReference createBTSExternalReference() {
		BTSExternalReferenceImpl btsExternalReference = new BTSExternalReferenceImpl();
		return btsExternalReference;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTranslations createBTSTranslations() {
		BTSTranslationsImpl btsTranslations = new BTSTranslationsImpl();
		return btsTranslations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSConfigItem createBTSConfigItem() {
		BTSConfigItemImpl btsConfigItem = new BTSConfigItemImpl();
		return btsConfigItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassportEditorConfig createBTSPassportEditorConfig() {
		BTSPassportEditorConfigImpl btsPassportEditorConfig = new BTSPassportEditorConfigImpl();
		return btsPassportEditorConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSUserGroup createBTSUserGroup() {
		BTSUserGroupImpl btsUserGroup = new BTSUserGroupImpl();
		return btsUserGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSList createBTSList() {
		BTSListImpl btsList = new BTSListImpl();
		return btsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPpSubentry createBTSPpSubentry() {
		BTSPpSubentryImpl btsPpSubentry = new BTSPpSubentryImpl();
		return btsPpSubentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSListSubentry createBTSListSubentry() {
		BTSListSubentryImpl btsListSubentry = new BTSListSubentryImpl();
		return btsListSubentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsmodelPackage getBtsmodelPackage() {
		return (BtsmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BtsmodelPackage getPackage() {
		return BtsmodelPackage.eINSTANCE;
	}

} //BtsmodelFactoryImpl
