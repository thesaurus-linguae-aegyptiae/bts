/**
 */
package org.bbaw.bts.btsmodel.util;

import org.bbaw.bts.btsmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage
 * @generated
 */
public class BtsmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtsmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BtsmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BtsmodelSwitch<Adapter> modelSwitch =
		new BtsmodelSwitch<Adapter>() {
			@Override
			public Adapter caseBTSTCObject(BTSTCObject object) {
				return createBTSTCObjectAdapter();
			}
			@Override
			public Adapter caseBTSText(BTSText object) {
				return createBTSTextAdapter();
			}
			@Override
			public Adapter caseBTSSenctence(BTSSenctence object) {
				return createBTSSenctenceAdapter();
			}
			@Override
			public Adapter caseBTSWord(BTSWord object) {
				return createBTSWordAdapter();
			}
			@Override
			public Adapter caseBTSMarker(BTSMarker object) {
				return createBTSMarkerAdapter();
			}
			@Override
			public Adapter caseBTSTextItems(BTSTextItems object) {
				return createBTSTextItemsAdapter();
			}
			@Override
			public Adapter caseBTSSentenceItem(BTSSentenceItem object) {
				return createBTSSentenceItemAdapter();
			}
			@Override
			public Adapter caseBTSListEntry(BTSListEntry object) {
				return createBTSListEntryAdapter();
			}
			@Override
			public Adapter caseBTSPassport(BTSPassport object) {
				return createBTSPassportAdapter();
			}
			@Override
			public Adapter caseAdministrativDataObject(AdministrativDataObject object) {
				return createAdministrativDataObjectAdapter();
			}
			@Override
			public Adapter caseBTSObject(BTSObject object) {
				return createBTSObjectAdapter();
			}
			@Override
			public Adapter caseBTSAmbivalence(BTSAmbivalence object) {
				return createBTSAmbivalenceAdapter();
			}
			@Override
			public Adapter caseBTSLemmaCase(BTSLemmaCase object) {
				return createBTSLemmaCaseAdapter();
			}
			@Override
			public Adapter caseBTSUser(BTSUser object) {
				return createBTSUserAdapter();
			}
			@Override
			public Adapter caseBTSComment(BTSComment object) {
				return createBTSCommentAdapter();
			}
			@Override
			public Adapter caseBTSInterTextReference(BTSInterTextReference object) {
				return createBTSInterTextReferenceAdapter();
			}
			@Override
			public Adapter caseBTSTextSentenceItem(BTSTextSentenceItem object) {
				return createBTSTextSentenceItemAdapter();
			}
			@Override
			public Adapter caseBTSReference(BTSReference object) {
				return createBTSReferenceAdapter();
			}
			@Override
			public Adapter caseBTSAnnotation(BTSAnnotation object) {
				return createBTSAnnotationAdapter();
			}
			@Override
			public Adapter caseBTSTranslation(BTSTranslation object) {
				return createBTSTranslationAdapter();
			}
			@Override
			public Adapter caseBTSDate(BTSDate object) {
				return createBTSDateAdapter();
			}
			@Override
			public Adapter caseBTSPassportEntry(BTSPassportEntry object) {
				return createBTSPassportEntryAdapter();
			}
			@Override
			public Adapter caseBTSRelation(BTSRelation object) {
				return createBTSRelationAdapter();
			}
			@Override
			public Adapter caseBTSConfiguration(BTSConfiguration object) {
				return createBTSConfigurationAdapter();
			}
			@Override
			public Adapter caseBTSDBBaseObject(BTSDBBaseObject object) {
				return createBTSDBBaseObjectAdapter();
			}
			@Override
			public Adapter caseBTSTextCorpus(BTSTextCorpus object) {
				return createBTSTextCorpusAdapter();
			}
			@Override
			public Adapter caseBTSRevision(BTSRevision object) {
				return createBTSRevisionAdapter();
			}
			@Override
			public Adapter caseBTSImage(BTSImage object) {
				return createBTSImageAdapter();
			}
			@Override
			public Adapter caseBTSCorpusHeader(BTSCorpusHeader object) {
				return createBTSCorpusHeaderAdapter();
			}
			@Override
			public Adapter caseBTSTimespan(BTSTimespan object) {
				return createBTSTimespanAdapter();
			}
			@Override
			public Adapter caseBTSCorpusObject(BTSCorpusObject object) {
				return createBTSCorpusObjectAdapter();
			}
			@Override
			public Adapter caseBTSExternalReference(BTSExternalReference object) {
				return createBTSExternalReferenceAdapter();
			}
			@Override
			public Adapter caseBTSReferencableItem(BTSReferencableItem object) {
				return createBTSReferencableItemAdapter();
			}
			@Override
			public Adapter caseBTSGraphic(BTSGraphic object) {
				return createBTSGraphicAdapter();
			}
			@Override
			public Adapter caseBTSTranslations(BTSTranslations object) {
				return createBTSTranslationsAdapter();
			}
			@Override
			public Adapter caseBTSConfigItem(BTSConfigItem object) {
				return createBTSConfigItemAdapter();
			}
			@Override
			public Adapter caseBTSPassportEditorConfig(BTSPassportEditorConfig object) {
				return createBTSPassportEditorConfigAdapter();
			}
			@Override
			public Adapter caseBTSUserGroup(BTSUserGroup object) {
				return createBTSUserGroupAdapter();
			}
			@Override
			public Adapter caseBTSList(BTSList object) {
				return createBTSListAdapter();
			}
			@Override
			public Adapter caseBTSPpSubentry(BTSPpSubentry object) {
				return createBTSPpSubentryAdapter();
			}
			@Override
			public Adapter caseBTSListSubentry(BTSListSubentry object) {
				return createBTSListSubentryAdapter();
			}
			@Override
			public Adapter caseBTSConfig(BTSConfig object) {
				return createBTSConfigAdapter();
			}
			@Override
			public Adapter caseBTSObservableObject(BTSObservableObject object) {
				return createBTSObservableObjectAdapter();
			}
			@Override
			public Adapter caseBTSThsEntry(BTSThsEntry object) {
				return createBTSThsEntryAdapter();
			}
			@Override
			public Adapter caseBTSProject(BTSProject object) {
				return createBTSProjectAdapter();
			}
			@Override
			public Adapter caseBTSDBConnection(BTSDBConnection object) {
				return createBTSDBConnectionAdapter();
			}
			@Override
			public Adapter caseBTSWorkflowRule(BTSWorkflowRule object) {
				return createBTSWorkflowRuleAdapter();
			}
			@Override
			public Adapter caseBTSOperator(BTSOperator object) {
				return createBTSOperatorAdapter();
			}
			@Override
			public Adapter caseBTSWorkflowRuleItem(BTSWorkflowRuleItem object) {
				return createBTSWorkflowRuleItemAdapter();
			}
			@Override
			public Adapter caseDBLease(DBLease object) {
				return createDBLeaseAdapter();
			}
			@Override
			public Adapter caseBTSProjectDBCollection(BTSProjectDBCollection object) {
				return createBTSProjectDBCollectionAdapter();
			}
			@Override
			public Adapter caseBTSIdentifiableItem(BTSIdentifiableItem object) {
				return createBTSIdentifiableItemAdapter();
			}
			@Override
			public Adapter caseBTSDBCollectionRoleDesc(BTSDBCollectionRoleDesc object) {
				return createBTSDBCollectionRoleDescAdapter();
			}
			@Override
			public Adapter caseBTSTextContent(BTSTextContent object) {
				return createBTSTextContentAdapter();
			}
			@Override
			public Adapter caseBTSAmbivalenceItem(BTSAmbivalenceItem object) {
				return createBTSAmbivalenceItemAdapter();
			}
			@Override
			public Adapter caseGraphicSelectionCounter(GraphicSelectionCounter object) {
				return createGraphicSelectionCounterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTCObject <em>BTSTC Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSTCObject
	 * @generated
	 */
	public Adapter createBTSTCObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSText <em>BTS Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSText
	 * @generated
	 */
	public Adapter createBTSTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSSenctence <em>BTS Senctence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSSenctence
	 * @generated
	 */
	public Adapter createBTSSenctenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSWord <em>BTS Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSWord
	 * @generated
	 */
	public Adapter createBTSWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSMarker <em>BTS Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSMarker
	 * @generated
	 */
	public Adapter createBTSMarkerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTextItems <em>BTS Text Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSTextItems
	 * @generated
	 */
	public Adapter createBTSTextItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSSentenceItem <em>BTS Sentence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSSentenceItem
	 * @generated
	 */
	public Adapter createBTSSentenceItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSListEntry <em>BTS List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry
	 * @generated
	 */
	public Adapter createBTSListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSPassport <em>BTS Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSPassport
	 * @generated
	 */
	public Adapter createBTSPassportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.AdministrativDataObject <em>Administrativ Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject
	 * @generated
	 */
	public Adapter createAdministrativDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSObject <em>BTS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSObject
	 * @generated
	 */
	public Adapter createBTSObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSAmbivalence <em>BTS Ambivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSAmbivalence
	 * @generated
	 */
	public Adapter createBTSAmbivalenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSLemmaCase <em>BTS Lemma Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSLemmaCase
	 * @generated
	 */
	public Adapter createBTSLemmaCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSUser <em>BTS User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSUser
	 * @generated
	 */
	public Adapter createBTSUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSComment <em>BTS Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSComment
	 * @generated
	 */
	public Adapter createBTSCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSInterTextReference <em>BTS Inter Text Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSInterTextReference
	 * @generated
	 */
	public Adapter createBTSInterTextReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTextSentenceItem <em>BTS Text Sentence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSTextSentenceItem
	 * @generated
	 */
	public Adapter createBTSTextSentenceItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSReference <em>BTS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSReference
	 * @generated
	 */
	public Adapter createBTSReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSAnnotation <em>BTS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSAnnotation
	 * @generated
	 */
	public Adapter createBTSAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTranslation <em>BTS Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation
	 * @generated
	 */
	public Adapter createBTSTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSDate <em>BTS Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSDate
	 * @generated
	 */
	public Adapter createBTSDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSPassportEntry <em>BTS Passport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry
	 * @generated
	 */
	public Adapter createBTSPassportEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSRelation <em>BTS Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSRelation
	 * @generated
	 */
	public Adapter createBTSRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSConfiguration <em>BTS Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSConfiguration
	 * @generated
	 */
	public Adapter createBTSConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject <em>BTSDB Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject
	 * @generated
	 */
	public Adapter createBTSDBBaseObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTextCorpus <em>BTS Text Corpus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSTextCorpus
	 * @generated
	 */
	public Adapter createBTSTextCorpusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSRevision <em>BTS Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSRevision
	 * @generated
	 */
	public Adapter createBTSRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSImage <em>BTS Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSImage
	 * @generated
	 */
	public Adapter createBTSImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader <em>BTS Corpus Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader
	 * @generated
	 */
	public Adapter createBTSCorpusHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTimespan <em>BTS Timespan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan
	 * @generated
	 */
	public Adapter createBTSTimespanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSCorpusObject <em>BTS Corpus Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject
	 * @generated
	 */
	public Adapter createBTSCorpusObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSExternalReference <em>BTS External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference
	 * @generated
	 */
	public Adapter createBTSExternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSReferencableItem <em>BTS Referencable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem
	 * @generated
	 */
	public Adapter createBTSReferencableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSGraphic <em>BTS Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic
	 * @generated
	 */
	public Adapter createBTSGraphicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTranslations <em>BTS Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations
	 * @generated
	 */
	public Adapter createBTSTranslationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSConfigItem <em>BTS Config Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem
	 * @generated
	 */
	public Adapter createBTSConfigItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig <em>BTS Passport Editor Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig
	 * @generated
	 */
	public Adapter createBTSPassportEditorConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSUserGroup <em>BTS User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSUserGroup
	 * @generated
	 */
	public Adapter createBTSUserGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSList <em>BTS List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSList
	 * @generated
	 */
	public Adapter createBTSListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSPpSubentry <em>BTS Pp Subentry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry
	 * @generated
	 */
	public Adapter createBTSPpSubentryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSListSubentry <em>BTS List Subentry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSListSubentry
	 * @generated
	 */
	public Adapter createBTSListSubentryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSConfig <em>BTS Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSConfig
	 * @generated
	 */
	public Adapter createBTSConfigAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSObservableObject <em>BTS Observable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject
	 * @generated
	 */
	public Adapter createBTSObservableObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSThsEntry <em>BTS Ths Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSThsEntry
	 * @generated
	 */
	public Adapter createBTSThsEntryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSProject <em>BTS Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSProject
	 * @generated
	 */
	public Adapter createBTSProjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSDBConnection <em>BTSDB Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection
	 * @generated
	 */
	public Adapter createBTSDBConnectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule <em>BTS Workflow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule
	 * @generated
	 */
	public Adapter createBTSWorkflowRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSOperator <em>BTS Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSOperator
	 * @generated
	 */
	public Adapter createBTSOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem <em>BTS Workflow Rule Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRuleItem
	 * @generated
	 */
	public Adapter createBTSWorkflowRuleItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.DBLease <em>DB Lease</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.DBLease
	 * @generated
	 */
	public Adapter createDBLeaseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection <em>BTS Project DB Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection
	 * @generated
	 */
	public Adapter createBTSProjectDBCollectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSIdentifiableItem <em>BTS Identifiable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSIdentifiableItem
	 * @generated
	 */
	public Adapter createBTSIdentifiableItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc <em>BTSDB Collection Role Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc
	 * @generated
	 */
	public Adapter createBTSDBCollectionRoleDescAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTextContent <em>BTS Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSTextContent
	 * @generated
	 */
	public Adapter createBTSTextContentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSAmbivalenceItem <em>BTS Ambivalence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.BTSAmbivalenceItem
	 * @generated
	 */
	public Adapter createBTSAmbivalenceItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter <em>Graphic Selection Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bbaw.bts.btsmodel.GraphicSelectionCounter
	 * @generated
	 */
	public Adapter createGraphicSelectionCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BtsmodelAdapterFactory
