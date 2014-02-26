/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;
import org.bbaw.bts.btsmodel.BTSAmbivalence;
import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSCorpusHeader;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSDBConnection;
import org.bbaw.bts.btsmodel.BTSDate;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSImage;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSLemmaCase;
import org.bbaw.bts.btsmodel.BTSList;
import org.bbaw.bts.btsmodel.BTSListEntry;
import org.bbaw.bts.btsmodel.BTSListSubentry;
import org.bbaw.bts.btsmodel.BTSMarker;
import org.bbaw.bts.btsmodel.BTSObjectTypePathRoot;
import org.bbaw.bts.btsmodel.BTSOperator;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BTSPassportEntryGroup;
import org.bbaw.bts.btsmodel.BTSPassportEntryItem;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextContent;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BTSWorkflowRule;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.btsmodel.GraphicSelectionCounter;
import org.bbaw.bts.btsmodel.ObjectTypePathEntry;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class BtsmodelFactoryImpl extends EFactoryImpl implements BtsmodelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static BtsmodelFactory init()
	{
		try {
			BtsmodelFactory theBtsmodelFactory = (BtsmodelFactory)EPackage.Registry.INSTANCE.getEFactory(BtsmodelPackage.eNS_URI);
			if (theBtsmodelFactory != null) {
				return theBtsmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtsmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public BtsmodelFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case BtsmodelPackage.BTSTC_OBJECT: return createBTSTCObject();
			case BtsmodelPackage.BTS_TEXT: return createBTSText();
			case BtsmodelPackage.BTS_SENCTENCE: return createBTSSenctence();
			case BtsmodelPackage.BTS_WORD: return createBTSWord();
			case BtsmodelPackage.BTS_MARKER: return createBTSMarker();
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
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_GROUP: return createBTSPassportEntryGroup();
			case BtsmodelPackage.BTS_RELATION: return createBTSRelation();
			case BtsmodelPackage.BTS_CONFIGURATION: return createBTSConfiguration();
			case BtsmodelPackage.BTS_TEXT_CORPUS: return createBTSTextCorpus();
			case BtsmodelPackage.BTS_REVISION: return createBTSRevision();
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
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_ITEM: return createBTSPassportEntryItem();
			case BtsmodelPackage.BTS_LIST_SUBENTRY: return createBTSListSubentry();
			case BtsmodelPackage.BTS_THS_ENTRY: return createBTSThsEntry();
			case BtsmodelPackage.BTS_PROJECT: return createBTSProject();
			case BtsmodelPackage.BTSDB_CONNECTION: return createBTSDBConnection();
			case BtsmodelPackage.BTS_WORKFLOW_RULE: return createBTSWorkflowRule();
			case BtsmodelPackage.BTS_OPERATOR: return createBTSOperator();
			case BtsmodelPackage.DB_LEASE: return createDBLease();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION: return createBTSProjectDBCollection();
			case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC: return createBTSDBCollectionRoleDesc();
			case BtsmodelPackage.BTS_TEXT_CONTENT: return createBTSTextContent();
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER: return createGraphicSelectionCounter();
			case BtsmodelPackage.OBJECT_TYPE_PATH_ENTRY: return createObjectTypePathEntry();
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH_ROOT: return createBTSObjectTypePathRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	private void setIdentifiableId(EObject eObject)
	{
		if (eObject instanceof BTSDBBaseObject)
		{
			// do something
		} else if (eObject instanceof BTSIdentifiableItem)
		{
			((BTSIdentifiableItem) eObject).set_id(getSidWithCalendar());
		}
	}

	private static final DecimalFormat timeFormat4 = new DecimalFormat("0000;0000");

	public static String getSidWithCalendar()
	{
		Calendar cal = Calendar.getInstance();
		String val = String.valueOf(cal.get(Calendar.YEAR));
		val += timeFormat4.format(cal.get(Calendar.DAY_OF_YEAR));
		val += UUID.randomUUID().toString().replaceAll("-", "");
		return val;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public BTSWord createBTSWord()
	{
		BTSWordImpl btsWord = new BTSWordImpl();
		setIdentifiableId(btsWord);
		return btsWord;
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
	public BTSListEntry createBTSListEntry()
	{
		BTSListEntryImpl btsListEntry = new BTSListEntryImpl();
		setIdentifiableId(btsListEntry);
		return btsListEntry;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSUser createBTSUser()
	{
		BTSUserImpl btsUser = new BTSUserImpl();
		setIdentifiableId(btsUser);
		return btsUser;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSComment createBTSComment()
	{
		BTSCommentImpl btsComment = new BTSCommentImpl();
		setIdentifiableId(btsComment);
		return btsComment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSInterTextReference createBTSInterTextReference()
	{
		BTSInterTextReferenceImpl btsInterTextReference = new BTSInterTextReferenceImpl();
		setIdentifiableId(btsInterTextReference);
		return btsInterTextReference;
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
	public BTSTranslation createBTSTranslation()
	{
		BTSTranslationImpl btsTranslation = new BTSTranslationImpl();
		setIdentifiableId(btsTranslation);
		return btsTranslation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSDate createBTSDate()
	{
		BTSDateImpl btsDate = new BTSDateImpl();
		setIdentifiableId(btsDate);
		return btsDate;
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
	public BTSRelation createBTSRelation()
	{
		BTSRelationImpl btsRelation = new BTSRelationImpl();
		setIdentifiableId(btsRelation);
		return btsRelation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSConfiguration createBTSConfiguration()
	{
		BTSConfigurationImpl btsConfiguration = new BTSConfigurationImpl();
		setIdentifiableId(btsConfiguration);
		return btsConfiguration;
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
	public BTSRevision createBTSRevision()
	{
		BTSRevisionImpl btsRevision = new BTSRevisionImpl();
		setIdentifiableId(btsRevision);
		return btsRevision;
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
	public BTSTimespan createBTSTimespan()
	{
		BTSTimespanImpl btsTimespan = new BTSTimespanImpl();
		setIdentifiableId(btsTimespan);
		return btsTimespan;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSExternalReference createBTSExternalReference()
	{
		BTSExternalReferenceImpl btsExternalReference = new BTSExternalReferenceImpl();
		setIdentifiableId(btsExternalReference);
		return btsExternalReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSGraphic createBTSGraphic()
	{
		BTSGraphicImpl btsGraphic = new BTSGraphicImpl();
		setIdentifiableId(btsGraphic);
		return btsGraphic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSTranslations createBTSTranslations()
	{
		BTSTranslationsImpl btsTranslations = new BTSTranslationsImpl();
		setIdentifiableId(btsTranslations);
		return btsTranslations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSConfigItem createBTSConfigItem()
	{
		BTSConfigItemImpl btsConfigItem = new BTSConfigItemImpl();
		setIdentifiableId(btsConfigItem);
		return btsConfigItem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSPassportEditorConfig createBTSPassportEditorConfig()
	{
		BTSPassportEditorConfigImpl btsPassportEditorConfig = new BTSPassportEditorConfigImpl();
		setIdentifiableId(btsPassportEditorConfig);
		return btsPassportEditorConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSUserGroup createBTSUserGroup()
	{
		BTSUserGroupImpl btsUserGroup = new BTSUserGroupImpl();
		setIdentifiableId(btsUserGroup);
		return btsUserGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSList createBTSList()
	{
		BTSListImpl btsList = new BTSListImpl();
		setIdentifiableId(btsList);
		return btsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSPassportEntryItem createBTSPassportEntryItem() {
		BTSPassportEntryItemImpl btsPassportEntryItem = new BTSPassportEntryItemImpl();
		setIdentifiableId(btsPassportEntryItem);

		return btsPassportEntryItem;
	}



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSListSubentry createBTSListSubentry()
	{
		BTSListSubentryImpl btsListSubentry = new BTSListSubentryImpl();
		setIdentifiableId(btsListSubentry);
		return btsListSubentry;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSProject createBTSProject()
	{
		BTSProjectImpl btsProject = new BTSProjectImpl();
		setIdentifiableId(btsProject);
		return btsProject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSDBConnection createBTSDBConnection()
	{
		BTSDBConnectionImpl btsdbConnection = new BTSDBConnectionImpl();
		setIdentifiableId(btsdbConnection);
		return btsdbConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSWorkflowRule createBTSWorkflowRule()
	{
		BTSWorkflowRuleImpl btsWorkflowRule = new BTSWorkflowRuleImpl();
		setIdentifiableId(btsWorkflowRule);
		return btsWorkflowRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSOperator createBTSOperator()
	{
		BTSOperatorImpl btsOperator = new BTSOperatorImpl();
		setIdentifiableId(btsOperator);
		return btsOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public DBLease createDBLease()
	{
		DBLeaseImpl dbLease = new DBLeaseImpl();
		setIdentifiableId(dbLease);
		return dbLease;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSProjectDBCollection createBTSProjectDBCollection()
	{
		BTSProjectDBCollectionImpl btsProjectDBCollection = new BTSProjectDBCollectionImpl();
		setIdentifiableId(btsProjectDBCollection);
		return btsProjectDBCollection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSDBCollectionRoleDesc createBTSDBCollectionRoleDesc()
	{
		BTSDBCollectionRoleDescImpl btsdbCollectionRoleDesc = new BTSDBCollectionRoleDescImpl();
		setIdentifiableId(btsdbCollectionRoleDesc);
		return btsdbCollectionRoleDesc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTextContent createBTSTextContent()
	{
		BTSTextContentImpl btsTextContent = new BTSTextContentImpl();
		return btsTextContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicSelectionCounter createGraphicSelectionCounter() {
		GraphicSelectionCounterImpl graphicSelectionCounter = new GraphicSelectionCounterImpl();
		return graphicSelectionCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypePathEntry createObjectTypePathEntry() {
		ObjectTypePathEntryImpl objectTypePathEntry = new ObjectTypePathEntryImpl();
		return objectTypePathEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObjectTypePathRoot createBTSObjectTypePathRoot() {
		BTSObjectTypePathRootImpl btsObjectTypePathRoot = new BTSObjectTypePathRootImpl();
		return btsObjectTypePathRoot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BtsmodelPackage getBtsmodelPackage()
	{
		return (BtsmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generatedNOT
	 */
	@Deprecated
	public static BtsmodelPackage getPackage()
	{
		return BtsmodelPackage.eINSTANCE;
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

} // BtsmodelFactoryImpl
