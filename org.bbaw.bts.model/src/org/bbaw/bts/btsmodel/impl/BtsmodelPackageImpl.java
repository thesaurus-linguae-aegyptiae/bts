/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSAmbivalence;
import org.bbaw.bts.btsmodel.BTSAmbivalenceItem;
import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSCorpusHeader;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
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
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSObjectTypePath;
import org.bbaw.bts.btsmodel.BTSObjectTypePathRoot;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.btsmodel.BTSOperator;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BTSPassportEntryGroup;
import org.bbaw.bts.btsmodel.BTSPassportEntryItem;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSReferencableItem;
import org.bbaw.bts.btsmodel.BTSReference;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextContent;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BTSTextItems;
import org.bbaw.bts.btsmodel.BTSTextSentenceItem;
import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BTSWorkflowRule;
import org.bbaw.bts.btsmodel.BTSWorkflowRuleItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.btsmodel.GraphicSelectionCounter;
import org.bbaw.bts.btsmodel.ObjectTypePathEntry;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsmodelPackageImpl extends EPackageImpl implements BtsmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btstcObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsSenctenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsSentenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativDataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAmbivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsLemmaCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsInterTextReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextSentenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTranslationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEntryGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsdbBaseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextCorpusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsCorpusHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTimespanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsCorpusObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsExternalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsReferencableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsGraphicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTranslationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsConfigItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEditorConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsUserGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEntryItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsListSubentryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsObservableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsThsEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsdbConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsWorkflowRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsWorkflowRuleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbLeaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsProjectDBCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsIdentifiableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsdbCollectionRoleDescEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAmbivalenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicSelectionCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypePathEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsObjectTypePathRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsObjectTypePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeSupportEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeListenerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeEventEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BtsmodelPackageImpl() {
		super(eNS_URI, BtsmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BtsmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BtsmodelPackage init() {
		if (isInited) return (BtsmodelPackage)EPackage.Registry.INSTANCE.getEPackage(BtsmodelPackage.eNS_URI);

		// Obtain or create and register package
		BtsmodelPackageImpl theBtsmodelPackage = (BtsmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BtsmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BtsmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBtsmodelPackage.createPackageContents();

		// Initialize created meta-data
		theBtsmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtsmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BtsmodelPackage.eNS_URI, theBtsmodelPackage);
		return theBtsmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTCObject() {
		return btstcObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSText() {
		return btsTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSText_TextContent()
	{
		return (EReference)btsTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSSenctence() {
		return btsSenctenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSSenctence_SentenceItems() {
		return (EReference)btsSenctenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSSenctence_Translation() {
		return (EReference)btsSenctenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSWord() {
		return btsWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSWord_Translation() {
		return (EReference)btsWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_WType() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_LType() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_LKey() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_FlexCode() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_WChar() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_Value() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSWord_Graphics() {
		return (EReference)btsWordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSMarker()
	{
		return btsMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSMarker_Value()
	{
		return (EAttribute)btsMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextItems() {
		return btsTextItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSSentenceItem()
	{
		return btsSentenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSListEntry() {
		return btsListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSListEntry_Ignore() {
		return (EAttribute)btsListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSListEntry_Subentries() {
		return (EReference)btsListEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSListEntry_Words()
	{
		return (EReference)btsListEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassport() {
		return btsPassportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Protocol() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Bibliography() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_Date() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_WbSlips() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_WbFolder() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Provenance() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_Children() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Comment() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_Descriptions() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrativDataObject() {
		return administrativDataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativDataObject_Revisions() {
		return (EReference)administrativDataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativDataObject_State() {
		return (EAttribute)administrativDataObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativDataObject_RevisionState() {
		return (EAttribute)administrativDataObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativDataObject_Visibility() {
		return (EAttribute)administrativDataObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSObject() {
		return btsObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_SortKey() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_Name() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_Type() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_Subtype() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_Code() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAmbivalence() {
		return btsAmbivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSAmbivalence_Cases() {
		return (EReference)btsAmbivalenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSLemmaCase() {
		return btsLemmaCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSLemmaCase_Scenario() {
		return (EReference)btsLemmaCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSUser() {
		return btsUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_GroupIds() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Sigle() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Description() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_WebDescription() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_UserName() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_ForeName() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_SureName() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Mail() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_WebURL() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Comment() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSUser_ExternalReferneces() {
		return (EReference)btsUserEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Roles() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Password()
	{
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_LoggedIn()
	{
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Status()
	{
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSComment() {
		return btsCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSComment_Comment() {
		return (EAttribute)btsCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSComment_References() {
		return (EReference)btsCommentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSComment_Tags() {
		return (EAttribute)btsCommentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSInterTextReference() {
		return btsInterTextReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSInterTextReference_BeginId() {
		return (EAttribute)btsInterTextReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSInterTextReference_EndId() {
		return (EAttribute)btsInterTextReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextSentenceItem() {
		return btsTextSentenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSReference() {
		return btsReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSReference_Parts() {
		return (EReference)btsReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSReference_ObjectId() {
		return (EAttribute)btsReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAnnotation() {
		return btsAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSAnnotation_References() {
		return (EReference)btsAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTranslation() {
		return btsTranslationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTranslation_Value() {
		return (EAttribute)btsTranslationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTranslation_Type() {
		return (EAttribute)btsTranslationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTranslation_Lang() {
		return (EAttribute)btsTranslationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSDate() {
		return btsDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_Type() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_Year() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_Month() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_Day() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_RelativeRef() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEntryGroup() {
		return btsPassportEntryGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryGroup_Items() {
		return (EReference)btsPassportEntryGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSRelation() {
		return btsRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_ObjectId() {
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_Type() {
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_Subtype() {
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_Comment() {
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_Certainty()
	{
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSConfiguration() {
		return btsConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfiguration_Provider()
	{
		return (EAttribute)btsConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSDBBaseObject() {
		return btsdbBaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBBaseObject__rev() {
		return (EAttribute)btsdbBaseObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBBaseObject_Project()
	{
		return (EAttribute)btsdbBaseObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBBaseObject_Locked()
	{
		return (EAttribute)btsdbBaseObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBBaseObject_Updaters()
	{
		return (EAttribute)btsdbBaseObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBBaseObject_Readers()
	{
		return (EAttribute)btsdbBaseObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextCorpus() {
		return btsTextCorpusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTextCorpus_Header() {
		return (EReference)btsTextCorpusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSRevision() {
		return btsRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRevision_Ref() {
		return (EAttribute)btsRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRevision_UserId() {
		return (EAttribute)btsRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRevision_TimeStamp() {
		return (EAttribute)btsRevisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSImage() {
		return btsImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSImage_MediaType() {
		return (EAttribute)btsImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSImage__GetAttachement() {
		return btsImageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSCorpusHeader() {
		return btsCorpusHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_AuthorName() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_ProjectId() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_ProjectName() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTimespan() {
		return btsTimespanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTimespan_From() {
		return (EReference)btsTimespanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTimespan_To() {
		return (EReference)btsTimespanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTimespan_Comment() {
		return (EAttribute)btsTimespanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSCorpusObject() {
		return btsCorpusObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSCorpusObject_Relations() {
		return (EReference)btsCorpusObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSCorpusObject_Passport() {
		return (EReference)btsCorpusObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusObject_CorpusPrefix()
	{
		return (EAttribute)btsCorpusObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusObject_WorkPhase()
	{
		return (EAttribute)btsCorpusObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSExternalReference() {
		return btsExternalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSExternalReference_Reference() {
		return (EAttribute)btsExternalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSExternalReference_Provider() {
		return (EAttribute)btsExternalReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSExternalReference_Type() {
		return (EAttribute)btsExternalReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSReferencableItem() {
		return btsReferencableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSReferencableItem_Comment() {
		return (EAttribute)btsReferencableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSReferencableItem_Parent() {
		return (EReference)btsReferencableItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSReferencableItem_ParentId() {
		return (EAttribute)btsReferencableItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSGraphic() {
		return btsGraphicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_InnerSentenceOrder() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_Code() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_Reference() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_Ignored() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTranslations() {
		return btsTranslationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTranslations_Translations() {
		return (EReference)btsTranslationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSTranslations__GetTranslation__String()
	{
		return btsTranslationsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSTranslations__SetTranslation__String_String()
	{
		return btsTranslationsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSTranslations__GetBTSTranslation__String() {
		return btsTranslationsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSTranslations__GetLanguages() {
		return btsTranslationsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSConfigItem() {
		return btsConfigItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_Value() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfigItem_Label() {
		return (EReference)btsConfigItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfigItem_Description() {
		return (EReference)btsConfigItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_SortKey() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_Ignore() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfigItem_PassportEditorConfig() {
		return (EReference)btsConfigItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_Type() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_Subtype() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfigItem_Rules()
	{
		return (EReference)btsConfigItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_ShowWidget()
	{
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfigItem_OwnerTypesPath() {
		return (EReference)btsConfigItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEditorConfig() {
		return btsPassportEditorConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_WidgetType() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_Required() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_AllowMultiple() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_HorizontalWidth() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_Regex()
	{
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEditorConfig_ReferencedTypesPath() {
		return (EReference)btsPassportEditorConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSUserGroup() {
		return btsUserGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUserGroup_Category() {
		return (EAttribute)btsUserGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUserGroup_Comment() {
		return (EAttribute)btsUserGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSList() {
		return btsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEntryItem() {
		return btsPassportEntryItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntryItem_Subtype() {
		return (EAttribute)btsPassportEntryItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntryItem_SubValue() {
		return (EAttribute)btsPassportEntryItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryItem_ExternalReferences() {
		return (EReference)btsPassportEntryItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryItem_Timespan() {
		return (EReference)btsPassportEntryItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryItem_Description() {
		return (EReference)btsPassportEntryItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryItem_Translation() {
		return (EReference)btsPassportEntryItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSListSubentry() {
		return btsListSubentryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSListSubentry_Passport() {
		return (EReference)btsListSubentryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSListSubentry_Words()
	{
		return (EReference)btsListSubentryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSConfig()
	{
		return btsConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfig_Children()
	{
		return (EReference)btsConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSObservableObject()
	{
		return btsObservableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObservableObject_PropertyChangeSupport()
	{
		return (EAttribute)btsObservableObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSObservableObject__AddPropertyChangeListener__PropertyChangeListener()
	{
		return btsObservableObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSObservableObject__RemovePropertyChangeListener__PropertyChangeListener()
	{
		return btsObservableObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSThsEntry()
	{
		return btsThsEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSProject()
	{
		return btsProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSProject_Prefix()
	{
		return (EAttribute)btsProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSProject_Description()
	{
		return (EAttribute)btsProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSProject_DbConnection()
	{
		return (EReference)btsProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSProject_DbCollections()
	{
		return (EReference)btsProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSDBConnection()
	{
		return btsdbConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBConnection_Type()
	{
		return (EAttribute)btsdbConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBConnection_MasterServer()
	{
		return (EAttribute)btsdbConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBConnection_DbPath()
	{
		return (EAttribute)btsdbConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSWorkflowRule()
	{
		return btsWorkflowRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSWorkflowRule_SubRules()
	{
		return (EReference)btsWorkflowRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWorkflowRule_Actions()
	{
		return (EAttribute)btsWorkflowRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWorkflowRule_AcceptMessage()
	{
		return (EAttribute)btsWorkflowRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWorkflowRule_Ocl()
	{
		return (EAttribute)btsWorkflowRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWorkflowRule_OclSelfObject()
	{
		return (EAttribute)btsWorkflowRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWorkflowRule_DenialMessage()
	{
		return (EAttribute)btsWorkflowRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSOperator()
	{
		return btsOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSOperator_Opperator()
	{
		return (EAttribute)btsOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSWorkflowRuleItem()
	{
		return btsWorkflowRuleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWorkflowRuleItem_Priority()
	{
		return (EAttribute)btsWorkflowRuleItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWorkflowRuleItem_Ignore()
	{
		return (EAttribute)btsWorkflowRuleItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBLease()
	{
		return dbLeaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBLease_Path()
	{
		return (EAttribute)dbLeaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBLease_ObjectId()
	{
		return (EAttribute)dbLeaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBLease_UserId()
	{
		return (EAttribute)dbLeaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBLease_TimeStamp()
	{
		return (EAttribute)dbLeaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSProjectDBCollection()
	{
		return btsProjectDBCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSProjectDBCollection_CollectionName()
	{
		return (EAttribute)btsProjectDBCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSProjectDBCollection_Indexed()
	{
		return (EAttribute)btsProjectDBCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSProjectDBCollection_Synchronized()
	{
		return (EAttribute)btsProjectDBCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSProjectDBCollection_RoleDescriptions()
	{
		return (EReference)btsProjectDBCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSIdentifiableItem()
	{
		return btsIdentifiableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSIdentifiableItem__id()
	{
		return (EAttribute)btsIdentifiableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSDBCollectionRoleDesc()
	{
		return btsdbCollectionRoleDescEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBCollectionRoleDesc_RoleName()
	{
		return (EAttribute)btsdbCollectionRoleDescEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBCollectionRoleDesc_UserNames()
	{
		return (EAttribute)btsdbCollectionRoleDescEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBCollectionRoleDesc_UserRoles()
	{
		return (EAttribute)btsdbCollectionRoleDescEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBCollectionRoleDesc_CachedChildren()
	{
		return (EAttribute)btsdbCollectionRoleDescEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextContent()
	{
		return btsTextContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTextContent_TextItems()
	{
		return (EReference)btsTextContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAmbivalenceItem()
	{
		return btsAmbivalenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicSelectionCounter() {
		return graphicSelectionCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicSelectionCounter_DateOfLastSelection() {
		return (EAttribute)graphicSelectionCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicSelectionCounter_Counter() {
		return (EAttribute)graphicSelectionCounterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypePathEntry() {
		return objectTypePathEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypePathEntry_Value() {
		return (EAttribute)objectTypePathEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypePathEntry_Selected() {
		return (EAttribute)objectTypePathEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSObjectTypePathRoot() {
		return btsObjectTypePathRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSObjectTypePath() {
		return btsObjectTypePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSObjectTypePath_Children() {
		return (EReference)btsObjectTypePathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEntry() {
		return btsPassportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Provider() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Comment() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Type() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Value() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntry_Children() {
		return (EReference)btsPassportEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntry_Label() {
		return (EReference)btsPassportEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Name() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Key() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeSupport() {
		return propertyChangeSupportEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeListener() {
		return propertyChangeListenerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeEvent() {
		return propertyChangeEventEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsmodelFactory getBtsmodelFactory() {
		return (BtsmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		btstcObjectEClass = createEClass(BTSTC_OBJECT);

		btsTextEClass = createEClass(BTS_TEXT);
		createEReference(btsTextEClass, BTS_TEXT__TEXT_CONTENT);

		btsSenctenceEClass = createEClass(BTS_SENCTENCE);
		createEReference(btsSenctenceEClass, BTS_SENCTENCE__SENTENCE_ITEMS);
		createEReference(btsSenctenceEClass, BTS_SENCTENCE__TRANSLATION);

		btsWordEClass = createEClass(BTS_WORD);
		createEReference(btsWordEClass, BTS_WORD__TRANSLATION);
		createEAttribute(btsWordEClass, BTS_WORD__WTYPE);
		createEAttribute(btsWordEClass, BTS_WORD__LTYPE);
		createEAttribute(btsWordEClass, BTS_WORD__LKEY);
		createEAttribute(btsWordEClass, BTS_WORD__FLEX_CODE);
		createEAttribute(btsWordEClass, BTS_WORD__WCHAR);
		createEAttribute(btsWordEClass, BTS_WORD__VALUE);
		createEReference(btsWordEClass, BTS_WORD__GRAPHICS);

		btsMarkerEClass = createEClass(BTS_MARKER);
		createEAttribute(btsMarkerEClass, BTS_MARKER__VALUE);

		btsTextItemsEClass = createEClass(BTS_TEXT_ITEMS);

		btsSentenceItemEClass = createEClass(BTS_SENTENCE_ITEM);

		btsListEntryEClass = createEClass(BTS_LIST_ENTRY);
		createEAttribute(btsListEntryEClass, BTS_LIST_ENTRY__IGNORE);
		createEReference(btsListEntryEClass, BTS_LIST_ENTRY__SUBENTRIES);
		createEReference(btsListEntryEClass, BTS_LIST_ENTRY__WORDS);

		btsPassportEClass = createEClass(BTS_PASSPORT);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__PROTOCOL);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__BIBLIOGRAPHY);
		createEReference(btsPassportEClass, BTS_PASSPORT__DATE);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__WB_SLIPS);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__WB_FOLDER);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__PROVENANCE);
		createEReference(btsPassportEClass, BTS_PASSPORT__CHILDREN);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__COMMENT);
		createEReference(btsPassportEClass, BTS_PASSPORT__DESCRIPTIONS);

		administrativDataObjectEClass = createEClass(ADMINISTRATIV_DATA_OBJECT);
		createEReference(administrativDataObjectEClass, ADMINISTRATIV_DATA_OBJECT__REVISIONS);
		createEAttribute(administrativDataObjectEClass, ADMINISTRATIV_DATA_OBJECT__STATE);
		createEAttribute(administrativDataObjectEClass, ADMINISTRATIV_DATA_OBJECT__REVISION_STATE);
		createEAttribute(administrativDataObjectEClass, ADMINISTRATIV_DATA_OBJECT__VISIBILITY);

		btsObjectEClass = createEClass(BTS_OBJECT);
		createEAttribute(btsObjectEClass, BTS_OBJECT__SORT_KEY);
		createEAttribute(btsObjectEClass, BTS_OBJECT__NAME);
		createEAttribute(btsObjectEClass, BTS_OBJECT__TYPE);
		createEAttribute(btsObjectEClass, BTS_OBJECT__SUBTYPE);
		createEAttribute(btsObjectEClass, BTS_OBJECT__CODE);

		btsAmbivalenceEClass = createEClass(BTS_AMBIVALENCE);
		createEReference(btsAmbivalenceEClass, BTS_AMBIVALENCE__CASES);

		btsLemmaCaseEClass = createEClass(BTS_LEMMA_CASE);
		createEReference(btsLemmaCaseEClass, BTS_LEMMA_CASE__SCENARIO);

		btsUserEClass = createEClass(BTS_USER);
		createEAttribute(btsUserEClass, BTS_USER__GROUP_IDS);
		createEAttribute(btsUserEClass, BTS_USER__SIGLE);
		createEAttribute(btsUserEClass, BTS_USER__DESCRIPTION);
		createEAttribute(btsUserEClass, BTS_USER__WEB_DESCRIPTION);
		createEAttribute(btsUserEClass, BTS_USER__USER_NAME);
		createEAttribute(btsUserEClass, BTS_USER__FORE_NAME);
		createEAttribute(btsUserEClass, BTS_USER__SURE_NAME);
		createEAttribute(btsUserEClass, BTS_USER__MAIL);
		createEAttribute(btsUserEClass, BTS_USER__WEB_URL);
		createEAttribute(btsUserEClass, BTS_USER__COMMENT);
		createEReference(btsUserEClass, BTS_USER__EXTERNAL_REFERNECES);
		createEAttribute(btsUserEClass, BTS_USER__ROLES);
		createEAttribute(btsUserEClass, BTS_USER__PASSWORD);
		createEAttribute(btsUserEClass, BTS_USER__LOGGED_IN);
		createEAttribute(btsUserEClass, BTS_USER__STATUS);

		btsCommentEClass = createEClass(BTS_COMMENT);
		createEAttribute(btsCommentEClass, BTS_COMMENT__COMMENT);
		createEReference(btsCommentEClass, BTS_COMMENT__REFERENCES);
		createEAttribute(btsCommentEClass, BTS_COMMENT__TAGS);

		btsInterTextReferenceEClass = createEClass(BTS_INTER_TEXT_REFERENCE);
		createEAttribute(btsInterTextReferenceEClass, BTS_INTER_TEXT_REFERENCE__BEGIN_ID);
		createEAttribute(btsInterTextReferenceEClass, BTS_INTER_TEXT_REFERENCE__END_ID);

		btsTextSentenceItemEClass = createEClass(BTS_TEXT_SENTENCE_ITEM);

		btsReferenceEClass = createEClass(BTS_REFERENCE);
		createEReference(btsReferenceEClass, BTS_REFERENCE__PARTS);
		createEAttribute(btsReferenceEClass, BTS_REFERENCE__OBJECT_ID);

		btsAnnotationEClass = createEClass(BTS_ANNOTATION);
		createEReference(btsAnnotationEClass, BTS_ANNOTATION__REFERENCES);

		btsTranslationEClass = createEClass(BTS_TRANSLATION);
		createEAttribute(btsTranslationEClass, BTS_TRANSLATION__VALUE);
		createEAttribute(btsTranslationEClass, BTS_TRANSLATION__TYPE);
		createEAttribute(btsTranslationEClass, BTS_TRANSLATION__LANG);

		btsDateEClass = createEClass(BTS_DATE);
		createEAttribute(btsDateEClass, BTS_DATE__TYPE);
		createEAttribute(btsDateEClass, BTS_DATE__YEAR);
		createEAttribute(btsDateEClass, BTS_DATE__MONTH);
		createEAttribute(btsDateEClass, BTS_DATE__DAY);
		createEAttribute(btsDateEClass, BTS_DATE__RELATIVE_REF);

		btsPassportEntryGroupEClass = createEClass(BTS_PASSPORT_ENTRY_GROUP);
		createEReference(btsPassportEntryGroupEClass, BTS_PASSPORT_ENTRY_GROUP__ITEMS);

		btsRelationEClass = createEClass(BTS_RELATION);
		createEAttribute(btsRelationEClass, BTS_RELATION__OBJECT_ID);
		createEAttribute(btsRelationEClass, BTS_RELATION__TYPE);
		createEAttribute(btsRelationEClass, BTS_RELATION__SUBTYPE);
		createEAttribute(btsRelationEClass, BTS_RELATION__COMMENT);
		createEAttribute(btsRelationEClass, BTS_RELATION__CERTAINTY);

		btsConfigurationEClass = createEClass(BTS_CONFIGURATION);
		createEAttribute(btsConfigurationEClass, BTS_CONFIGURATION__PROVIDER);

		btsdbBaseObjectEClass = createEClass(BTSDB_BASE_OBJECT);
		createEAttribute(btsdbBaseObjectEClass, BTSDB_BASE_OBJECT__REV);
		createEAttribute(btsdbBaseObjectEClass, BTSDB_BASE_OBJECT__PROJECT);
		createEAttribute(btsdbBaseObjectEClass, BTSDB_BASE_OBJECT__LOCKED);
		createEAttribute(btsdbBaseObjectEClass, BTSDB_BASE_OBJECT__UPDATERS);
		createEAttribute(btsdbBaseObjectEClass, BTSDB_BASE_OBJECT__READERS);

		btsTextCorpusEClass = createEClass(BTS_TEXT_CORPUS);
		createEReference(btsTextCorpusEClass, BTS_TEXT_CORPUS__HEADER);

		btsRevisionEClass = createEClass(BTS_REVISION);
		createEAttribute(btsRevisionEClass, BTS_REVISION__REF);
		createEAttribute(btsRevisionEClass, BTS_REVISION__USER_ID);
		createEAttribute(btsRevisionEClass, BTS_REVISION__TIME_STAMP);

		btsImageEClass = createEClass(BTS_IMAGE);
		createEAttribute(btsImageEClass, BTS_IMAGE__MEDIA_TYPE);
		createEOperation(btsImageEClass, BTS_IMAGE___GET_ATTACHEMENT);

		btsCorpusHeaderEClass = createEClass(BTS_CORPUS_HEADER);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__AUTHOR_NAME);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__PROJECT_ID);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__PROJECT_NAME);

		btsTimespanEClass = createEClass(BTS_TIMESPAN);
		createEReference(btsTimespanEClass, BTS_TIMESPAN__FROM);
		createEReference(btsTimespanEClass, BTS_TIMESPAN__TO);
		createEAttribute(btsTimespanEClass, BTS_TIMESPAN__COMMENT);

		btsCorpusObjectEClass = createEClass(BTS_CORPUS_OBJECT);
		createEReference(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__RELATIONS);
		createEReference(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__PASSPORT);
		createEAttribute(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__CORPUS_PREFIX);
		createEAttribute(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__WORK_PHASE);

		btsExternalReferenceEClass = createEClass(BTS_EXTERNAL_REFERENCE);
		createEAttribute(btsExternalReferenceEClass, BTS_EXTERNAL_REFERENCE__REFERENCE);
		createEAttribute(btsExternalReferenceEClass, BTS_EXTERNAL_REFERENCE__PROVIDER);
		createEAttribute(btsExternalReferenceEClass, BTS_EXTERNAL_REFERENCE__TYPE);

		btsReferencableItemEClass = createEClass(BTS_REFERENCABLE_ITEM);
		createEAttribute(btsReferencableItemEClass, BTS_REFERENCABLE_ITEM__COMMENT);
		createEReference(btsReferencableItemEClass, BTS_REFERENCABLE_ITEM__PARENT);
		createEAttribute(btsReferencableItemEClass, BTS_REFERENCABLE_ITEM__PARENT_ID);

		btsGraphicEClass = createEClass(BTS_GRAPHIC);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__INNER_SENTENCE_ORDER);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__CODE);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__REFERENCE);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__IGNORED);

		btsTranslationsEClass = createEClass(BTS_TRANSLATIONS);
		createEReference(btsTranslationsEClass, BTS_TRANSLATIONS__TRANSLATIONS);
		createEOperation(btsTranslationsEClass, BTS_TRANSLATIONS___GET_TRANSLATION__STRING);
		createEOperation(btsTranslationsEClass, BTS_TRANSLATIONS___SET_TRANSLATION__STRING_STRING);
		createEOperation(btsTranslationsEClass, BTS_TRANSLATIONS___GET_BTS_TRANSLATION__STRING);
		createEOperation(btsTranslationsEClass, BTS_TRANSLATIONS___GET_LANGUAGES);

		btsConfigItemEClass = createEClass(BTS_CONFIG_ITEM);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__VALUE);
		createEReference(btsConfigItemEClass, BTS_CONFIG_ITEM__LABEL);
		createEReference(btsConfigItemEClass, BTS_CONFIG_ITEM__DESCRIPTION);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__SORT_KEY);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__IGNORE);
		createEReference(btsConfigItemEClass, BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__TYPE);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__SUBTYPE);
		createEReference(btsConfigItemEClass, BTS_CONFIG_ITEM__RULES);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__SHOW_WIDGET);
		createEReference(btsConfigItemEClass, BTS_CONFIG_ITEM__OWNER_TYPES_PATH);

		btsPassportEditorConfigEClass = createEClass(BTS_PASSPORT_EDITOR_CONFIG);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__REQUIRED);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__REGEX);
		createEReference(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH);

		btsUserGroupEClass = createEClass(BTS_USER_GROUP);
		createEAttribute(btsUserGroupEClass, BTS_USER_GROUP__CATEGORY);
		createEAttribute(btsUserGroupEClass, BTS_USER_GROUP__COMMENT);

		btsListEClass = createEClass(BTS_LIST);

		btsPassportEntryItemEClass = createEClass(BTS_PASSPORT_ENTRY_ITEM);
		createEAttribute(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__SUBTYPE);
		createEAttribute(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE);
		createEReference(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES);
		createEReference(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__TIMESPAN);
		createEReference(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION);
		createEReference(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__TRANSLATION);

		btsListSubentryEClass = createEClass(BTS_LIST_SUBENTRY);
		createEReference(btsListSubentryEClass, BTS_LIST_SUBENTRY__PASSPORT);
		createEReference(btsListSubentryEClass, BTS_LIST_SUBENTRY__WORDS);

		btsConfigEClass = createEClass(BTS_CONFIG);
		createEReference(btsConfigEClass, BTS_CONFIG__CHILDREN);

		btsObservableObjectEClass = createEClass(BTS_OBSERVABLE_OBJECT);
		createEAttribute(btsObservableObjectEClass, BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT);
		createEOperation(btsObservableObjectEClass, BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER);
		createEOperation(btsObservableObjectEClass, BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER);

		btsThsEntryEClass = createEClass(BTS_THS_ENTRY);

		btsProjectEClass = createEClass(BTS_PROJECT);
		createEAttribute(btsProjectEClass, BTS_PROJECT__PREFIX);
		createEAttribute(btsProjectEClass, BTS_PROJECT__DESCRIPTION);
		createEReference(btsProjectEClass, BTS_PROJECT__DB_CONNECTION);
		createEReference(btsProjectEClass, BTS_PROJECT__DB_COLLECTIONS);

		btsdbConnectionEClass = createEClass(BTSDB_CONNECTION);
		createEAttribute(btsdbConnectionEClass, BTSDB_CONNECTION__TYPE);
		createEAttribute(btsdbConnectionEClass, BTSDB_CONNECTION__MASTER_SERVER);
		createEAttribute(btsdbConnectionEClass, BTSDB_CONNECTION__DB_PATH);

		btsWorkflowRuleEClass = createEClass(BTS_WORKFLOW_RULE);
		createEReference(btsWorkflowRuleEClass, BTS_WORKFLOW_RULE__SUB_RULES);
		createEAttribute(btsWorkflowRuleEClass, BTS_WORKFLOW_RULE__ACTIONS);
		createEAttribute(btsWorkflowRuleEClass, BTS_WORKFLOW_RULE__ACCEPT_MESSAGE);
		createEAttribute(btsWorkflowRuleEClass, BTS_WORKFLOW_RULE__OCL);
		createEAttribute(btsWorkflowRuleEClass, BTS_WORKFLOW_RULE__OCL_SELF_OBJECT);
		createEAttribute(btsWorkflowRuleEClass, BTS_WORKFLOW_RULE__DENIAL_MESSAGE);

		btsOperatorEClass = createEClass(BTS_OPERATOR);
		createEAttribute(btsOperatorEClass, BTS_OPERATOR__OPPERATOR);

		btsWorkflowRuleItemEClass = createEClass(BTS_WORKFLOW_RULE_ITEM);
		createEAttribute(btsWorkflowRuleItemEClass, BTS_WORKFLOW_RULE_ITEM__PRIORITY);
		createEAttribute(btsWorkflowRuleItemEClass, BTS_WORKFLOW_RULE_ITEM__IGNORE);

		dbLeaseEClass = createEClass(DB_LEASE);
		createEAttribute(dbLeaseEClass, DB_LEASE__PATH);
		createEAttribute(dbLeaseEClass, DB_LEASE__OBJECT_ID);
		createEAttribute(dbLeaseEClass, DB_LEASE__USER_ID);
		createEAttribute(dbLeaseEClass, DB_LEASE__TIME_STAMP);

		btsProjectDBCollectionEClass = createEClass(BTS_PROJECT_DB_COLLECTION);
		createEAttribute(btsProjectDBCollectionEClass, BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME);
		createEAttribute(btsProjectDBCollectionEClass, BTS_PROJECT_DB_COLLECTION__INDEXED);
		createEAttribute(btsProjectDBCollectionEClass, BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED);
		createEReference(btsProjectDBCollectionEClass, BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS);

		btsIdentifiableItemEClass = createEClass(BTS_IDENTIFIABLE_ITEM);
		createEAttribute(btsIdentifiableItemEClass, BTS_IDENTIFIABLE_ITEM__ID);

		btsdbCollectionRoleDescEClass = createEClass(BTSDB_COLLECTION_ROLE_DESC);
		createEAttribute(btsdbCollectionRoleDescEClass, BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME);
		createEAttribute(btsdbCollectionRoleDescEClass, BTSDB_COLLECTION_ROLE_DESC__USER_NAMES);
		createEAttribute(btsdbCollectionRoleDescEClass, BTSDB_COLLECTION_ROLE_DESC__USER_ROLES);
		createEAttribute(btsdbCollectionRoleDescEClass, BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN);

		btsTextContentEClass = createEClass(BTS_TEXT_CONTENT);
		createEReference(btsTextContentEClass, BTS_TEXT_CONTENT__TEXT_ITEMS);

		btsAmbivalenceItemEClass = createEClass(BTS_AMBIVALENCE_ITEM);

		graphicSelectionCounterEClass = createEClass(GRAPHIC_SELECTION_COUNTER);
		createEAttribute(graphicSelectionCounterEClass, GRAPHIC_SELECTION_COUNTER__DATE_OF_LAST_SELECTION);
		createEAttribute(graphicSelectionCounterEClass, GRAPHIC_SELECTION_COUNTER__COUNTER);

		objectTypePathEntryEClass = createEClass(OBJECT_TYPE_PATH_ENTRY);
		createEAttribute(objectTypePathEntryEClass, OBJECT_TYPE_PATH_ENTRY__VALUE);
		createEAttribute(objectTypePathEntryEClass, OBJECT_TYPE_PATH_ENTRY__SELECTED);

		btsObjectTypePathRootEClass = createEClass(BTS_OBJECT_TYPE_PATH_ROOT);

		btsObjectTypePathEClass = createEClass(BTS_OBJECT_TYPE_PATH);
		createEReference(btsObjectTypePathEClass, BTS_OBJECT_TYPE_PATH__CHILDREN);

		btsPassportEntryEClass = createEClass(BTS_PASSPORT_ENTRY);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__PROVIDER);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__COMMENT);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__TYPE);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__VALUE);
		createEReference(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__CHILDREN);
		createEReference(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__LABEL);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__NAME);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__KEY);

		// Create data types
		propertyChangeSupportEDataType = createEDataType(PROPERTY_CHANGE_SUPPORT);
		propertyChangeListenerEDataType = createEDataType(PROPERTY_CHANGE_LISTENER);
		propertyChangeEventEDataType = createEDataType(PROPERTY_CHANGE_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		btstcObjectEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsTextEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsSenctenceEClass.getESuperTypes().add(this.getBTSTextItems());
		btsSenctenceEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsWordEClass.getESuperTypes().add(this.getBTSSentenceItem());
		btsWordEClass.getESuperTypes().add(this.getBTSAmbivalenceItem());
		btsWordEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsMarkerEClass.getESuperTypes().add(this.getBTSTextSentenceItem());
		btsMarkerEClass.getESuperTypes().add(this.getBTSTextItems());
		btsMarkerEClass.getESuperTypes().add(this.getBTSAmbivalenceItem());
		btsMarkerEClass.getESuperTypes().add(this.getBTSSentenceItem());
		btsMarkerEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsTextItemsEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsSentenceItemEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsListEntryEClass.getESuperTypes().add(this.getBTSCorpusObject());
		administrativDataObjectEClass.getESuperTypes().add(this.getBTSObservableObject());
		btsObjectEClass.getESuperTypes().add(this.getAdministrativDataObject());
		btsAmbivalenceEClass.getESuperTypes().add(this.getBTSTextSentenceItem());
		btsAmbivalenceEClass.getESuperTypes().add(this.getBTSSentenceItem());
		btsAmbivalenceEClass.getESuperTypes().add(this.getBTSTextItems());
		btsAmbivalenceEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsLemmaCaseEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsUserEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsUserEClass.getESuperTypes().add(this.getBTSObject());
		btsCommentEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsCommentEClass.getESuperTypes().add(this.getBTSObject());
		btsTextSentenceItemEClass.getESuperTypes().add(this.getBTSSentenceItem());
		btsTextSentenceItemEClass.getESuperTypes().add(this.getBTSTextItems());
		btsAnnotationEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsPassportEntryGroupEClass.getESuperTypes().add(this.getBTSPassportEntry());
		btsRelationEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsConfigurationEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsConfigurationEClass.getESuperTypes().add(this.getBTSConfig());
		btsConfigurationEClass.getESuperTypes().add(this.getBTSObject());
		btsdbBaseObjectEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsTextCorpusEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsRevisionEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsImageEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsCorpusObjectEClass.getESuperTypes().add(this.getBTSObject());
		btsCorpusObjectEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsReferencableItemEClass.getESuperTypes().add(this.getBTSObject());
		btsReferencableItemEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsGraphicEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsConfigItemEClass.getESuperTypes().add(this.getBTSConfig());
		btsConfigItemEClass.getESuperTypes().add(this.getBTSObservableObject());
		btsConfigItemEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsPassportEditorConfigEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsUserGroupEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsUserGroupEClass.getESuperTypes().add(this.getBTSObject());
		btsListEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsPassportEntryItemEClass.getESuperTypes().add(this.getBTSPassportEntry());
		btsListSubentryEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsThsEntryEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsProjectEClass.getESuperTypes().add(this.getBTSObject());
		btsProjectEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsdbConnectionEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsWorkflowRuleEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsOperatorEClass.getESuperTypes().add(this.getBTSWorkflowRuleItem());
		btsWorkflowRuleItemEClass.getESuperTypes().add(this.getBTSObservableObject());
		btsWorkflowRuleItemEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		dbLeaseEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsProjectDBCollectionEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		btsdbCollectionRoleDescEClass.getESuperTypes().add(this.getBTSIdentifiableItem());
		graphicSelectionCounterEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		objectTypePathEntryEClass.getESuperTypes().add(this.getBTSObjectTypePath());
		btsObjectTypePathRootEClass.getESuperTypes().add(this.getBTSObjectTypePath());
		btsPassportEntryEClass.getESuperTypes().add(this.getBTSIdentifiableItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(btstcObjectEClass, BTSTCObject.class, "BTSTCObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsTextEClass, BTSText.class, "BTSText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSText_TextContent(), this.getBTSTextContent(), null, "textContent", null, 0, 1, BTSText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsSenctenceEClass, BTSSenctence.class, "BTSSenctence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSSenctence_SentenceItems(), this.getBTSSentenceItem(), null, "sentenceItems", null, 0, -1, BTSSenctence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSSenctence_Translation(), this.getBTSTranslations(), null, "translation", null, 0, 1, BTSSenctence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsWordEClass, BTSWord.class, "BTSWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSWord_Translation(), this.getBTSTranslations(), null, "translation", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_WType(), ecorePackage.getEString(), "wType", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_LType(), ecorePackage.getEString(), "lType", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_LKey(), ecorePackage.getEString(), "lKey", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_FlexCode(), ecorePackage.getEString(), "flexCode", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_WChar(), ecorePackage.getEString(), "wChar", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSWord_Graphics(), this.getBTSGraphic(), null, "graphics", null, 0, -1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsMarkerEClass, BTSMarker.class, "BTSMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSMarker_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextItemsEClass, BTSTextItems.class, "BTSTextItems", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsSentenceItemEClass, BTSSentenceItem.class, "BTSSentenceItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsListEntryEClass, BTSListEntry.class, "BTSListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSListEntry_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, BTSListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSListEntry_Subentries(), this.getBTSListSubentry(), null, "subentries", null, 0, -1, BTSListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSListEntry_Words(), this.getBTSWord(), null, "words", null, 0, -1, BTSListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEClass, BTSPassport.class, "BTSPassport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassport_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_Bibliography(), ecorePackage.getEString(), "bibliography", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassport_Date(), this.getBTSTimespan(), null, "date", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_WbSlips(), ecorePackage.getEString(), "wbSlips", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_WbFolder(), ecorePackage.getEString(), "wbFolder", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_Provenance(), ecorePackage.getEString(), "provenance", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassport_Children(), this.getBTSPassportEntry(), null, "children", null, 0, -1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassport_Descriptions(), this.getBTSTranslations(), null, "descriptions", null, 0, -1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administrativDataObjectEClass, AdministrativDataObject.class, "AdministrativDataObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdministrativDataObject_Revisions(), this.getBTSRevision(), null, "revisions", null, 0, -1, AdministrativDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativDataObject_State(), ecorePackage.getEString(), "state", null, 0, 1, AdministrativDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativDataObject_RevisionState(), ecorePackage.getEString(), "revisionState", null, 0, 1, AdministrativDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativDataObject_Visibility(), ecorePackage.getEString(), "visibility", null, 0, 1, AdministrativDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsObjectEClass, BTSObject.class, "BTSObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSObject_SortKey(), ecorePackage.getEInt(), "sortKey", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObject_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObject_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObject_Code(), ecorePackage.getEString(), "code", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsAmbivalenceEClass, BTSAmbivalence.class, "BTSAmbivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSAmbivalence_Cases(), this.getBTSLemmaCase(), null, "cases", null, 0, -1, BTSAmbivalence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsLemmaCaseEClass, BTSLemmaCase.class, "BTSLemmaCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSLemmaCase_Scenario(), this.getBTSAmbivalenceItem(), null, "scenario", null, 0, -1, BTSLemmaCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsUserEClass, BTSUser.class, "BTSUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSUser_GroupIds(), ecorePackage.getEString(), "groupIds", null, 0, -1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Sigle(), ecorePackage.getEString(), "sigle", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Description(), ecorePackage.getEString(), "description", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_WebDescription(), ecorePackage.getEString(), "webDescription", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_ForeName(), ecorePackage.getEString(), "foreName", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_SureName(), ecorePackage.getEString(), "sureName", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_WebURL(), ecorePackage.getEString(), "webURL", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSUser_ExternalReferneces(), this.getBTSExternalReference(), null, "externalReferneces", null, 0, -1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Roles(), ecorePackage.getEString(), "roles", null, 0, -1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Password(), ecorePackage.getEString(), "password", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_LoggedIn(), ecorePackage.getEBoolean(), "loggedIn", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Status(), ecorePackage.getEString(), "status", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsCommentEClass, BTSComment.class, "BTSComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSComment_References(), this.getBTSReference(), null, "references", null, 0, -1, BTSComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSComment_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, BTSComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsInterTextReferenceEClass, BTSInterTextReference.class, "BTSInterTextReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSInterTextReference_BeginId(), ecorePackage.getEString(), "beginId", null, 0, 1, BTSInterTextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSInterTextReference_EndId(), ecorePackage.getEString(), "endId", null, 0, 1, BTSInterTextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextSentenceItemEClass, BTSTextSentenceItem.class, "BTSTextSentenceItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsReferenceEClass, BTSReference.class, "BTSReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSReference_Parts(), this.getBTSInterTextReference(), null, "parts", null, 0, -1, BTSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSReference_ObjectId(), ecorePackage.getEString(), "objectId", null, 0, 1, BTSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsAnnotationEClass, BTSAnnotation.class, "BTSAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSAnnotation_References(), this.getBTSReference(), null, "references", null, 0, -1, BTSAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTranslationEClass, BTSTranslation.class, "BTSTranslation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSTranslation_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSTranslation_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSTranslation_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, BTSTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsDateEClass, BTSDate.class, "BTSDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSDate_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDate_Year(), ecorePackage.getEInt(), "year", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDate_Month(), ecorePackage.getEInt(), "month", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDate_Day(), ecorePackage.getEInt(), "day", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDate_RelativeRef(), ecorePackage.getEString(), "relativeRef", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEntryGroupEClass, BTSPassportEntryGroup.class, "BTSPassportEntryGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSPassportEntryGroup_Items(), this.getBTSPassportEntryItem(), null, "items", null, 0, -1, BTSPassportEntryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsRelationEClass, BTSRelation.class, "BTSRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSRelation_ObjectId(), ecorePackage.getEString(), "objectId", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRelation_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRelation_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRelation_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRelation_Certainty(), ecorePackage.getEString(), "certainty", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsConfigurationEClass, BTSConfiguration.class, "BTSConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSConfiguration_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, BTSConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsdbBaseObjectEClass, BTSDBBaseObject.class, "BTSDBBaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSDBBaseObject__rev(), ecorePackage.getEString(), "_rev", null, 0, 1, BTSDBBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBBaseObject_Project(), ecorePackage.getEString(), "project", null, 0, 1, BTSDBBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBBaseObject_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, BTSDBBaseObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBBaseObject_Updaters(), ecorePackage.getEString(), "updaters", null, 0, -1, BTSDBBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBBaseObject_Readers(), ecorePackage.getEString(), "readers", null, 0, -1, BTSDBBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextCorpusEClass, BTSTextCorpus.class, "BTSTextCorpus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTextCorpus_Header(), this.getBTSCorpusHeader(), null, "header", null, 0, 1, BTSTextCorpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsRevisionEClass, BTSRevision.class, "BTSRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSRevision_Ref(), ecorePackage.getEInt(), "ref", null, 0, 1, BTSRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRevision_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, BTSRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRevision_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 0, 1, BTSRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsImageEClass, BTSImage.class, "BTSImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSImage_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, BTSImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBTSImage__GetAttachement(), ecorePackage.getEObject(), "getAttachement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(btsCorpusHeaderEClass, BTSCorpusHeader.class, "BTSCorpusHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSCorpusHeader_AuthorName(), ecorePackage.getEString(), "authorName", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusHeader_ProjectId(), ecorePackage.getEString(), "projectId", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusHeader_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTimespanEClass, BTSTimespan.class, "BTSTimespan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTimespan_From(), this.getBTSDate(), null, "from", null, 0, 1, BTSTimespan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSTimespan_To(), this.getBTSDate(), null, "to", null, 0, 1, BTSTimespan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSTimespan_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSTimespan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsCorpusObjectEClass, BTSCorpusObject.class, "BTSCorpusObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSCorpusObject_Relations(), this.getBTSRelation(), null, "relations", null, 0, -1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSCorpusObject_Passport(), this.getBTSPassport(), null, "passport", null, 0, 1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusObject_CorpusPrefix(), ecorePackage.getEString(), "corpusPrefix", null, 0, 1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusObject_WorkPhase(), ecorePackage.getEString(), "workPhase", null, 0, 1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsExternalReferenceEClass, BTSExternalReference.class, "BTSExternalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSExternalReference_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, BTSExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSExternalReference_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, BTSExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSExternalReference_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsReferencableItemEClass, BTSReferencableItem.class, "BTSReferencableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSReferencableItem_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSReferencableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSReferencableItem_Parent(), this.getBTSObject(), null, "parent", null, 0, 1, BTSReferencableItem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSReferencableItem_ParentId(), ecorePackage.getEString(), "parentId", null, 0, 1, BTSReferencableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsGraphicEClass, BTSGraphic.class, "BTSGraphic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSGraphic_InnerSentenceOrder(), ecorePackage.getEInt(), "innerSentenceOrder", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSGraphic_Code(), ecorePackage.getEString(), "code", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSGraphic_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSGraphic_Ignored(), ecorePackage.getEBoolean(), "ignored", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTranslationsEClass, BTSTranslations.class, "BTSTranslations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTranslations_Translations(), this.getBTSTranslation(), null, "translations", null, 0, -1, BTSTranslations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBTSTranslations__GetTranslation__String(), ecorePackage.getEString(), "getTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBTSTranslations__SetTranslation__String_String(), ecorePackage.getEString(), "setTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "translation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBTSTranslations__GetBTSTranslation__String(), this.getBTSTranslation(), "getBTSTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lang", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBTSTranslations__GetLanguages(), ecorePackage.getEEList(), "getLanguages", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(btsConfigItemEClass, BTSConfigItem.class, "BTSConfigItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSConfigItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSConfigItem_Label(), this.getBTSTranslations(), null, "label", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSConfigItem_Description(), this.getBTSTranslations(), null, "description", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_SortKey(), ecorePackage.getEInt(), "sortKey", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSConfigItem_PassportEditorConfig(), this.getBTSPassportEditorConfig(), null, "passportEditorConfig", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSConfigItem_Rules(), this.getBTSWorkflowRuleItem(), null, "rules", null, 0, -1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_ShowWidget(), ecorePackage.getEBoolean(), "showWidget", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSConfigItem_OwnerTypesPath(), this.getBTSObjectTypePathRoot(), null, "ownerTypesPath", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEditorConfigEClass, BTSPassportEditorConfig.class, "BTSPassportEditorConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassportEditorConfig_WidgetType(), ecorePackage.getEString(), "widgetType", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_AllowMultiple(), ecorePackage.getEBoolean(), "allowMultiple", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_HorizontalWidth(), ecorePackage.getEInt(), "horizontalWidth", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEditorConfig_ReferencedTypesPath(), this.getBTSObjectTypePathRoot(), null, "referencedTypesPath", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsUserGroupEClass, BTSUserGroup.class, "BTSUserGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSUserGroup_Category(), ecorePackage.getEString(), "category", null, 0, 1, BTSUserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUserGroup_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSUserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsListEClass, BTSList.class, "BTSList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsPassportEntryItemEClass, BTSPassportEntryItem.class, "BTSPassportEntryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassportEntryItem_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntryItem_SubValue(), ecorePackage.getEString(), "subValue", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntryItem_ExternalReferences(), this.getBTSExternalReference(), null, "externalReferences", null, 0, -1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntryItem_Timespan(), this.getBTSTimespan(), null, "timespan", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntryItem_Description(), this.getBTSTranslations(), null, "description", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntryItem_Translation(), this.getBTSTranslations(), null, "translation", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsListSubentryEClass, BTSListSubentry.class, "BTSListSubentry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSListSubentry_Passport(), this.getBTSPassport(), null, "passport", null, 0, 1, BTSListSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSListSubentry_Words(), this.getBTSWord(), null, "words", null, 0, -1, BTSListSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsConfigEClass, BTSConfig.class, "BTSConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSConfig_Children(), this.getBTSConfig(), null, "children", null, 0, -1, BTSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsObservableObjectEClass, BTSObservableObject.class, "BTSObservableObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSObservableObject_PropertyChangeSupport(), this.getPropertyChangeSupport(), "propertyChangeSupport", null, 0, 1, BTSObservableObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBTSObservableObject__AddPropertyChangeListener__PropertyChangeListener(), null, "addPropertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyChangeListener(), "propertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBTSObservableObject__RemovePropertyChangeListener__PropertyChangeListener(), null, "removePropertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyChangeListener(), "propertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(btsThsEntryEClass, BTSThsEntry.class, "BTSThsEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsProjectEClass, BTSProject.class, "BTSProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSProject_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, BTSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, BTSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSProject_DbConnection(), this.getBTSDBConnection(), null, "dbConnection", null, 0, 1, BTSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSProject_DbCollections(), this.getBTSProjectDBCollection(), null, "dbCollections", null, 0, -1, BTSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsdbConnectionEClass, BTSDBConnection.class, "BTSDBConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSDBConnection_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSDBConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBConnection_MasterServer(), ecorePackage.getEString(), "masterServer", null, 0, 1, BTSDBConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBConnection_DbPath(), ecorePackage.getEString(), "dbPath", null, 0, 1, BTSDBConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsWorkflowRuleEClass, BTSWorkflowRule.class, "BTSWorkflowRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSWorkflowRule_SubRules(), this.getBTSWorkflowRuleItem(), null, "subRules", null, 0, -1, BTSWorkflowRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWorkflowRule_Actions(), ecorePackage.getEString(), "actions", null, 0, -1, BTSWorkflowRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWorkflowRule_AcceptMessage(), ecorePackage.getEString(), "acceptMessage", null, 0, 1, BTSWorkflowRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWorkflowRule_Ocl(), ecorePackage.getEString(), "ocl", null, 0, 1, BTSWorkflowRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWorkflowRule_OclSelfObject(), ecorePackage.getEString(), "oclSelfObject", null, 0, 1, BTSWorkflowRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWorkflowRule_DenialMessage(), ecorePackage.getEString(), "denialMessage", null, 0, 1, BTSWorkflowRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsOperatorEClass, BTSOperator.class, "BTSOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSOperator_Opperator(), ecorePackage.getEString(), "opperator", null, 0, 1, BTSOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsWorkflowRuleItemEClass, BTSWorkflowRuleItem.class, "BTSWorkflowRuleItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSWorkflowRuleItem_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, BTSWorkflowRuleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWorkflowRuleItem_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, BTSWorkflowRuleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbLeaseEClass, DBLease.class, "DBLease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBLease_Path(), ecorePackage.getEString(), "path", null, 0, 1, DBLease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBLease_ObjectId(), ecorePackage.getEString(), "objectId", null, 0, 1, DBLease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBLease_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, DBLease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBLease_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 0, 1, DBLease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsProjectDBCollectionEClass, BTSProjectDBCollection.class, "BTSProjectDBCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSProjectDBCollection_CollectionName(), ecorePackage.getEString(), "collectionName", null, 0, 1, BTSProjectDBCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSProjectDBCollection_Indexed(), ecorePackage.getEBoolean(), "indexed", null, 0, 1, BTSProjectDBCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSProjectDBCollection_Synchronized(), ecorePackage.getEBoolean(), "synchronized", null, 0, 1, BTSProjectDBCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSProjectDBCollection_RoleDescriptions(), this.getBTSDBCollectionRoleDesc(), null, "roleDescriptions", null, 0, -1, BTSProjectDBCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsIdentifiableItemEClass, BTSIdentifiableItem.class, "BTSIdentifiableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSIdentifiableItem__id(), ecorePackage.getEString(), "_id", null, 0, 1, BTSIdentifiableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsdbCollectionRoleDescEClass, BTSDBCollectionRoleDesc.class, "BTSDBCollectionRoleDesc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSDBCollectionRoleDesc_RoleName(), ecorePackage.getEString(), "roleName", null, 0, 1, BTSDBCollectionRoleDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBCollectionRoleDesc_UserNames(), ecorePackage.getEString(), "userNames", null, 0, -1, BTSDBCollectionRoleDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBCollectionRoleDesc_UserRoles(), ecorePackage.getEString(), "userRoles", null, 0, -1, BTSDBCollectionRoleDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBCollectionRoleDesc_CachedChildren(), ecorePackage.getEJavaObject(), "cachedChildren", null, 0, -1, BTSDBCollectionRoleDesc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextContentEClass, BTSTextContent.class, "BTSTextContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTextContent_TextItems(), this.getBTSTextItems(), null, "textItems", null, 0, -1, BTSTextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsAmbivalenceItemEClass, BTSAmbivalenceItem.class, "BTSAmbivalenceItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicSelectionCounterEClass, GraphicSelectionCounter.class, "GraphicSelectionCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicSelectionCounter_DateOfLastSelection(), ecorePackage.getEDate(), "dateOfLastSelection", null, 0, 1, GraphicSelectionCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicSelectionCounter_Counter(), ecorePackage.getEInt(), "counter", null, 0, 1, GraphicSelectionCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypePathEntryEClass, ObjectTypePathEntry.class, "ObjectTypePathEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectTypePathEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, ObjectTypePathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectTypePathEntry_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, ObjectTypePathEntry.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsObjectTypePathRootEClass, BTSObjectTypePathRoot.class, "BTSObjectTypePathRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsObjectTypePathEClass, BTSObjectTypePath.class, "BTSObjectTypePath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSObjectTypePath_Children(), this.getObjectTypePathEntry(), null, "children", null, 0, -1, BTSObjectTypePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEntryEClass, BTSPassportEntry.class, "BTSPassportEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassportEntry_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntry_Children(), this.getBTSPassportEntry(), null, "children", null, 0, -1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntry_Label(), this.getBTSTranslations(), null, "label", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Key(), ecorePackage.getEInt(), "key", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(propertyChangeSupportEDataType, PropertyChangeSupport.class, "PropertyChangeSupport", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeListenerEDataType, PropertyChangeListener.class, "PropertyChangeListener", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeEventEDataType, PropertyChangeEvent.class, "PropertyChangeEvent", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BtsmodelPackageImpl
