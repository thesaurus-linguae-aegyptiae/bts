/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.btsmodel.BtsmodelFactory
 * @model kind="package"
 * @generated
 */
public interface BtsmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "btsmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://btsmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "btsmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsmodelPackage eINSTANCE = org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl <em>Administrativ Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getAdministrativDataObject()
	 * @generated
	 */
	int ADMINISTRATIV_DATA_OBJECT = 9;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl <em>BTS Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObject()
	 * @generated
	 */
	int BTS_OBJECT = 10;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl <em>BTS Corpus Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSCorpusObject()
	 * @generated
	 */
	int BTS_CORPUS_OBJECT = 30;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTCObjectImpl <em>BTSTC Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTCObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTCObject()
	 * @generated
	 */
	int BTSTC_OBJECT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextImpl <em>BTS Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTextImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSText()
	 * @generated
	 */
	int BTS_TEXT = 1;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl <em>BTS Referencable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReferencableItem()
	 * @generated
	 */
	int BTS_REFERENCABLE_ITEM = 32;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.BTSTextItems <em>BTS Text Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.BTSTextItems
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextItems()
	 * @generated
	 */
	int BTS_TEXT_ITEMS = 5;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSSenctenceImpl <em>BTS Senctence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSSenctenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSSenctence()
	 * @generated
	 */
	int BTS_SENCTENCE = 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl <em>BTS Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSWordImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWord()
	 * @generated
	 */
	int BTS_WORD = 3;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextSentenceItemImpl <em>BTS Text Sentence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTextSentenceItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextSentenceItem()
	 * @generated
	 */
	int BTS_TEXT_SENTENCE_ITEM = 16;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSListEntryImpl <em>BTS List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSListEntryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSListEntry()
	 * @generated
	 */
	int BTS_LIST_ENTRY = 7;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl <em>BTS Passport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPassportImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassport()
	 * @generated
	 */
	int BTS_PASSPORT = 8;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSAmbivalenceImpl <em>BTS Ambivalence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSAmbivalenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAmbivalence()
	 * @generated
	 */
	int BTS_AMBIVALENCE = 11;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSLemmaCaseImpl <em>BTS Lemma Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSLemmaCaseImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSLemmaCase()
	 * @generated
	 */
	int BTS_LEMMA_CASE = 12;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl <em>BTS Observable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObservableObject()
	 * @generated
	 */
	int BTS_OBSERVABLE_OBJECT = 42;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT = 0;

	/**
	 * The number of structural features of the '<em>BTS Observable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = 1;

	/**
	 * The number of operations of the '<em>BTS Observable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__PROPERTY_CHANGE_SUPPORT = BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__REVISIONS = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__STATE = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__REVISION_STATE = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__VISIBILITY = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Administrativ Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>Administrativ Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__PROPERTY_CHANGE_SUPPORT = ADMINISTRATIV_DATA_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__REVISIONS = ADMINISTRATIV_DATA_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__STATE = ADMINISTRATIV_DATA_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__REVISION_STATE = ADMINISTRATIV_DATA_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__VISIBILITY = ADMINISTRATIV_DATA_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__SORT_KEY = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__NAME = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__TYPE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__SUBTYPE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__CODE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BTS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_FEATURE_COUNT = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = ADMINISTRATIV_DATA_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = ADMINISTRATIV_DATA_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_OPERATION_COUNT = ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__STATE = BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REVISION_STATE = BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__VISIBILITY = BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__SORT_KEY = BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__NAME = BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__TYPE = BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__SUBTYPE = BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CODE = BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__ID = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REV = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PROJECT = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__LOCKED = BTS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__UPDATERS = BTS_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__READERS = BTS_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__DELETED = BTS_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CONFLICTING_REVS = BTS_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__RELATIONS = BTS_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PASSPORT = BTS_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CORPUS_PREFIX = BTS_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__WORK_PHASE = BTS_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>BTS Corpus Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY = BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Corpus Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTSTC Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT___GET_DB_COLLECTION_KEY = BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>BTSTC Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__TEXT_CONTENT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT___GET_DB_COLLECTION_KEY = BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>BTS Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__STATE = BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__REVISION_STATE = BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__VISIBILITY = BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__SORT_KEY = BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__NAME = BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__TYPE = BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__SUBTYPE = BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__CODE = BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__ID = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__COMMENT = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PARENT = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PARENT_ID = BTS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS Referencable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Referencable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PROPERTY_CHANGE_SUPPORT = BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__REVISIONS = BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__STATE = BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__REVISION_STATE = BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__VISIBILITY = BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__SORT_KEY = BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__NAME = BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__TYPE = BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__SUBTYPE = BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__CODE = BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__ID = BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__COMMENT = BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PARENT = BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PARENT_ID = BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Text Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS_FEATURE_COUNT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Text Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS_OPERATION_COUNT = BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT = BTS_TEXT_ITEMS__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__REVISIONS = BTS_TEXT_ITEMS__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__STATE = BTS_TEXT_ITEMS__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__REVISION_STATE = BTS_TEXT_ITEMS__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__VISIBILITY = BTS_TEXT_ITEMS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SORT_KEY = BTS_TEXT_ITEMS__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__NAME = BTS_TEXT_ITEMS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__TYPE = BTS_TEXT_ITEMS__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SUBTYPE = BTS_TEXT_ITEMS__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__CODE = BTS_TEXT_ITEMS__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__ID = BTS_TEXT_ITEMS__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__COMMENT = BTS_TEXT_ITEMS__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PARENT = BTS_TEXT_ITEMS__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PARENT_ID = BTS_TEXT_ITEMS__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Sentence Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SENTENCE_ITEMS = BTS_TEXT_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__TRANSLATION = BTS_TEXT_ITEMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BTS Senctence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE_FEATURE_COUNT = BTS_TEXT_ITEMS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_TEXT_ITEMS___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_TEXT_ITEMS___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Senctence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE_OPERATION_COUNT = BTS_TEXT_ITEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.BTSSentenceItem <em>BTS Sentence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.BTSSentenceItem
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSSentenceItem()
	 * @generated
	 */
	int BTS_SENTENCE_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__REVISIONS = BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__STATE = BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__REVISION_STATE = BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__VISIBILITY = BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__SORT_KEY = BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__NAME = BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__TYPE = BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__SUBTYPE = BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__CODE = BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__ID = BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__COMMENT = BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__PARENT = BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__PARENT_ID = BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM_FEATURE_COUNT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM_OPERATION_COUNT = BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PROPERTY_CHANGE_SUPPORT = BTS_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__REVISIONS = BTS_SENTENCE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__STATE = BTS_SENTENCE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__REVISION_STATE = BTS_SENTENCE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__VISIBILITY = BTS_SENTENCE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__SORT_KEY = BTS_SENTENCE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__NAME = BTS_SENTENCE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__TYPE = BTS_SENTENCE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__SUBTYPE = BTS_SENTENCE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__CODE = BTS_SENTENCE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__ID = BTS_SENTENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__COMMENT = BTS_SENTENCE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PARENT = BTS_SENTENCE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PARENT_ID = BTS_SENTENCE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__TRANSLATION = BTS_SENTENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>WType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__WTYPE = BTS_SENTENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__LTYPE = BTS_SENTENCE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__LKEY = BTS_SENTENCE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flex Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__FLEX_CODE = BTS_SENTENCE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>WChar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__WCHAR = BTS_SENTENCE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__VALUE = BTS_SENTENCE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__GRAPHICS = BTS_SENTENCE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>BTS Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD_FEATURE_COUNT = BTS_SENTENCE_ITEM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD_OPERATION_COUNT = BTS_SENTENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__REVISIONS = BTS_SENTENCE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__STATE = BTS_SENTENCE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__REVISION_STATE = BTS_SENTENCE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__VISIBILITY = BTS_SENTENCE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__SORT_KEY = BTS_SENTENCE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__NAME = BTS_SENTENCE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__TYPE = BTS_SENTENCE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__SUBTYPE = BTS_SENTENCE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__CODE = BTS_SENTENCE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__ID = BTS_SENTENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__COMMENT = BTS_SENTENCE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PARENT = BTS_SENTENCE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PARENT_ID = BTS_SENTENCE_ITEM__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Text Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT = BTS_SENTENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Text Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM_OPERATION_COUNT = BTS_SENTENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSMarkerImpl <em>BTS Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSMarkerImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSMarker()
	 * @generated
	 */
	int BTS_MARKER = 4;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__PROPERTY_CHANGE_SUPPORT = BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__REVISIONS = BTS_TEXT_SENTENCE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__STATE = BTS_TEXT_SENTENCE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__REVISION_STATE = BTS_TEXT_SENTENCE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__VISIBILITY = BTS_TEXT_SENTENCE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__SORT_KEY = BTS_TEXT_SENTENCE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__NAME = BTS_TEXT_SENTENCE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__TYPE = BTS_TEXT_SENTENCE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__SUBTYPE = BTS_TEXT_SENTENCE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__CODE = BTS_TEXT_SENTENCE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__ID = BTS_TEXT_SENTENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__COMMENT = BTS_TEXT_SENTENCE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__PARENT = BTS_TEXT_SENTENCE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__PARENT_ID = BTS_TEXT_SENTENCE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__VALUE = BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER_FEATURE_COUNT = BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_TEXT_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_TEXT_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER_OPERATION_COUNT = BTS_TEXT_SENTENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__IGNORE = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__SUBENTRIES = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__WORDS = BTS_CORPUS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTS List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY___GET_DB_COLLECTION_KEY = BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>BTS List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__BIBLIOGRAPHY = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__DATE = 2;

	/**
	 * The feature id for the '<em><b>Wb Slips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__WB_SLIPS = 3;

	/**
	 * The feature id for the '<em><b>Wb Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__WB_FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__PROVENANCE = 5;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__CHILDREN = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__DESCRIPTIONS = 8;

	/**
	 * The number of structural features of the '<em>BTS Passport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>BTS Passport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PROPERTY_CHANGE_SUPPORT = BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__REVISIONS = BTS_TEXT_SENTENCE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__STATE = BTS_TEXT_SENTENCE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__REVISION_STATE = BTS_TEXT_SENTENCE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__VISIBILITY = BTS_TEXT_SENTENCE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__SORT_KEY = BTS_TEXT_SENTENCE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__NAME = BTS_TEXT_SENTENCE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__TYPE = BTS_TEXT_SENTENCE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__SUBTYPE = BTS_TEXT_SENTENCE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__CODE = BTS_TEXT_SENTENCE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__ID = BTS_TEXT_SENTENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__COMMENT = BTS_TEXT_SENTENCE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PARENT = BTS_TEXT_SENTENCE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PARENT_ID = BTS_TEXT_SENTENCE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__CASES = BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Ambivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_FEATURE_COUNT = BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_TEXT_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_TEXT_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Ambivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_OPERATION_COUNT = BTS_TEXT_SENTENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__PROPERTY_CHANGE_SUPPORT = BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__REVISIONS = BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__STATE = BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__REVISION_STATE = BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__VISIBILITY = BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__SORT_KEY = BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__NAME = BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__TYPE = BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__SUBTYPE = BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__CODE = BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__ID = BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__COMMENT = BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__PARENT = BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__PARENT_ID = BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__SCENARIO = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Lemma Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE_FEATURE_COUNT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Lemma Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE_OPERATION_COUNT = BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl <em>BTSDB Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBBaseObject()
	 * @generated
	 */
	int BTSDB_BASE_OBJECT = 24;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl <em>BTS User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSUserImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUser()
	 * @generated
	 */
	int BTS_USER = 13;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSCommentImpl <em>BTS Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSCommentImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSComment()
	 * @generated
	 */
	int BTS_COMMENT = 14;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl <em>BTS Inter Text Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSInterTextReference()
	 * @generated
	 */
	int BTS_INTER_TEXT_REFERENCE = 15;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferenceImpl <em>BTS Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSReferenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReference()
	 * @generated
	 */
	int BTS_REFERENCE = 17;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSAnnotationImpl <em>BTS Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSAnnotationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAnnotation()
	 * @generated
	 */
	int BTS_ANNOTATION = 18;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationImpl <em>BTS Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslation()
	 * @generated
	 */
	int BTS_TRANSLATION = 19;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl <em>BTS Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDateImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDate()
	 * @generated
	 */
	int BTS_DATE = 20;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl <em>BTS Identifiable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSIdentifiableItem()
	 * @generated
	 */
	int BTS_IDENTIFIABLE_ITEM = 51;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IDENTIFIABLE_ITEM__ID = 0;

	/**
	 * The number of structural features of the '<em>BTS Identifiable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BTS Identifiable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__REV = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__PROJECT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__LOCKED = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__UPDATERS = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__READERS = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__DELETED = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__CONFLICTING_REVS = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>BTSDB Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTSDB Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__LOCKED = BTSDB_BASE_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__UPDATERS = BTSDB_BASE_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__READERS = BTSDB_BASE_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__DELETED = BTSDB_BASE_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__CONFLICTING_REVS = BTSDB_BASE_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__PROPERTY_CHANGE_SUPPORT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REVISIONS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REVISION_STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__VISIBILITY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SORT_KEY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__TYPE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SUBTYPE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__CODE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Group Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__GROUP_IDS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sigle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SIGLE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__DESCRIPTION = BTSDB_BASE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Web Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__WEB_DESCRIPTION = BTSDB_BASE_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__USER_NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fore Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__FORE_NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SURE_NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__MAIL = BTSDB_BASE_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Web URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__WEB_URL = BTSDB_BASE_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__COMMENT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>External Referneces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__EXTERNAL_REFERNECES = BTSDB_BASE_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__PASSWORD = BTSDB_BASE_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Logged In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__LOGGED_IN = BTSDB_BASE_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__STATUS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Db Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__DB_ADMIN = BTSDB_BASE_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>BTS User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 25;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___GET_DB_COLLECTION_KEY = BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__LOCKED = BTSDB_BASE_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__UPDATERS = BTSDB_BASE_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__READERS = BTSDB_BASE_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__DELETED = BTSDB_BASE_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__CONFLICTING_REVS = BTSDB_BASE_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__PROPERTY_CHANGE_SUPPORT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REVISIONS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REVISION_STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__VISIBILITY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__SORT_KEY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__TYPE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__SUBTYPE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__CODE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__COMMENT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REFERENCES = BTSDB_BASE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__TAGS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>BTS Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___GET_DB_COLLECTION_KEY = BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Begin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_INTER_TEXT_REFERENCE__BEGIN_ID = 0;

	/**
	 * The feature id for the '<em><b>End Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_INTER_TEXT_REFERENCE__END_ID = 1;

	/**
	 * The number of structural features of the '<em>BTS Inter Text Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_INTER_TEXT_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BTS Inter Text Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_INTER_TEXT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCE__PARTS = 0;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCE__OBJECT_ID = 1;

	/**
	 * The number of structural features of the '<em>BTS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BTS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REFERENCES = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION___GET_DB_COLLECTION_KEY = BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>BTS Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION__LANG = 2;

	/**
	 * The number of structural features of the '<em>BTS Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__MONTH = 2;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__DAY = 3;

	/**
	 * The feature id for the '<em><b>Relative Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__RELATIVE_REF = 4;

	/**
	 * The number of structural features of the '<em>BTS Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>BTS Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl <em>BTS Passport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEntry()
	 * @generated
	 */
	int BTS_PASSPORT_ENTRY = 56;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__PROVIDER = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__COMMENT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__TYPE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__VALUE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__CHILDREN = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__LABEL = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__NAME = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__KEY = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>BTS Passport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>BTS Passport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryGroupImpl <em>BTS Passport Entry Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEntryGroupImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEntryGroup()
	 * @generated
	 */
	int BTS_PASSPORT_ENTRY_GROUP = 21;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__ID = BTS_PASSPORT_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__PROVIDER = BTS_PASSPORT_ENTRY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__COMMENT = BTS_PASSPORT_ENTRY__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__TYPE = BTS_PASSPORT_ENTRY__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__VALUE = BTS_PASSPORT_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__CHILDREN = BTS_PASSPORT_ENTRY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__LABEL = BTS_PASSPORT_ENTRY__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__NAME = BTS_PASSPORT_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__KEY = BTS_PASSPORT_ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__ITEMS = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Passport Entry Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP_FEATURE_COUNT = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Passport Entry Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP_OPERATION_COUNT = BTS_PASSPORT_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl <em>BTS Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSRelationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRelation()
	 * @generated
	 */
	int BTS_RELATION = 22;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__OBJECT_ID = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__TYPE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__SUBTYPE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__COMMENT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__CERTAINTY = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BTS Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>BTS Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl <em>BTS Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfiguration()
	 * @generated
	 */
	int BTS_CONFIGURATION = 23;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__LOCKED = BTSDB_BASE_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__UPDATERS = BTSDB_BASE_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__READERS = BTSDB_BASE_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__DELETED = BTSDB_BASE_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__CONFLICTING_REVS = BTSDB_BASE_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__CHILDREN = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REVISIONS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REVISION_STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__VISIBILITY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__SORT_KEY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__TYPE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__SUBTYPE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__CODE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROVIDER = BTSDB_BASE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>BTS Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___GET_DB_COLLECTION_KEY = BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextCorpusImpl <em>BTS Text Corpus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTextCorpusImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextCorpus()
	 * @generated
	 */
	int BTS_TEXT_CORPUS = 25;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__HEADER = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Text Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS___GET_DB_COLLECTION_KEY = BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>BTS Text Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl <em>BTS Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSRevisionImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRevision()
	 * @generated
	 */
	int BTS_REVISION = 26;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION__REF = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION__USER_ID = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION__TIME_STAMP = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTS Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BTS Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSImageImpl <em>BTS Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSImageImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSImage()
	 * @generated
	 */
	int BTS_IMAGE = 27;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__MEDIA_TYPE = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___GET_DB_COLLECTION_KEY = BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The operation id for the '<em>Get Attachement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___GET_ATTACHEMENT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSCorpusHeaderImpl <em>BTS Corpus Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSCorpusHeaderImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSCorpusHeader()
	 * @generated
	 */
	int BTS_CORPUS_HEADER = 28;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__AUTHOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__PROJECT_ID = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__PROJECT_NAME = 2;

	/**
	 * The number of structural features of the '<em>BTS Corpus Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS Corpus Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTimespanImpl <em>BTS Timespan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTimespanImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTimespan()
	 * @generated
	 */
	int BTS_TIMESPAN = 29;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN__TO = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN__COMMENT = 2;

	/**
	 * The number of structural features of the '<em>BTS Timespan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS Timespan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl <em>BTS External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSExternalReference()
	 * @generated
	 */
	int BTS_EXTERNAL_REFERENCE = 31;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>BTS External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSGraphicImpl <em>BTS Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSGraphicImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSGraphic()
	 * @generated
	 */
	int BTS_GRAPHIC = 33;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Inner Sentence Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__INNER_SENTENCE_ORDER = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__CODE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__REFERENCE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__IGNORED = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>BTS Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl <em>BTS Translations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslations()
	 * @generated
	 */
	int BTS_TRANSLATIONS = 34;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS__TRANSLATIONS = 0;

	/**
	 * The number of structural features of the '<em>BTS Translations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS___GET_TRANSLATION__STRING = 0;

	/**
	 * The operation id for the '<em>Set Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS___SET_TRANSLATION__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Get BTS Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS___GET_BTS_TRANSLATION__STRING = 2;

	/**
	 * The operation id for the '<em>Get Languages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS___GET_LANGUAGES = 3;

	/**
	 * The number of operations of the '<em>BTS Translations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigImpl <em>BTS Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSConfigImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfig()
	 * @generated
	 */
	int BTS_CONFIG = 41;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>BTS Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BTS Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl <em>BTS Config Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfigItem()
	 * @generated
	 */
	int BTS_CONFIG_ITEM = 35;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__CHILDREN = BTS_CONFIG__CHILDREN;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__ID = BTS_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__VALUE = BTS_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__LABEL = BTS_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__DESCRIPTION = BTS_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__SORT_KEY = BTS_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__IGNORE = BTS_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Passport Editor Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG = BTS_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__TYPE = BTS_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__SUBTYPE = BTS_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__RULES = BTS_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Show Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__SHOW_WIDGET = BTS_CONFIG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Owner Referenced Types String List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST = BTS_CONFIG_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>BTS Config Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM_FEATURE_COUNT = BTS_CONFIG_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CONFIG_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner Types Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM___GET_OWNER_TYPES_MAP = BTS_CONFIG_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Clear Owner Types Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM___CLEAR_OWNER_TYPES_MAP = BTS_CONFIG_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>BTS Config Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM_OPERATION_COUNT = BTS_CONFIG_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl <em>BTS Passport Editor Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEditorConfig()
	 * @generated
	 */
	int BTS_PASSPORT_EDITOR_CONFIG = 36;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__REQUIRED = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__REGEX = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Predicate List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_LIST = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>BTS Passport Editor Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>BTS Passport Editor Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl <em>BTS User Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUserGroup()
	 * @generated
	 */
	int BTS_USER_GROUP = 37;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__LOCKED = BTSDB_BASE_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__UPDATERS = BTSDB_BASE_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__READERS = BTSDB_BASE_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__DELETED = BTSDB_BASE_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__CONFLICTING_REVS = BTSDB_BASE_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REVISIONS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REVISION_STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__VISIBILITY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__SORT_KEY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__TYPE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__SUBTYPE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__CODE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__CATEGORY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__COMMENT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>BTS User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___GET_DB_COLLECTION_KEY = BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSListImpl <em>BTS List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSListImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSList()
	 * @generated
	 */
	int BTS_LIST = 38;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTS List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST___GET_DB_COLLECTION_KEY = BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>BTS List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryItemImpl <em>BTS Passport Entry Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEntryItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEntryItem()
	 * @generated
	 */
	int BTS_PASSPORT_ENTRY_ITEM = 39;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__ID = BTS_PASSPORT_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__PROVIDER = BTS_PASSPORT_ENTRY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__COMMENT = BTS_PASSPORT_ENTRY__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__TYPE = BTS_PASSPORT_ENTRY__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__VALUE = BTS_PASSPORT_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__CHILDREN = BTS_PASSPORT_ENTRY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__LABEL = BTS_PASSPORT_ENTRY__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__NAME = BTS_PASSPORT_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__KEY = BTS_PASSPORT_ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__SUBTYPE = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timespan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__TIMESPAN = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__TRANSLATION = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>BTS Passport Entry Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM_FEATURE_COUNT = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>BTS Passport Entry Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM_OPERATION_COUNT = BTS_PASSPORT_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl <em>BTS List Subentry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSListSubentry()
	 * @generated
	 */
	int BTS_LIST_SUBENTRY = 40;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__PROPERTY_CHANGE_SUPPORT = BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__REVISIONS = BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__STATE = BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__REVISION_STATE = BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__VISIBILITY = BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__SORT_KEY = BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__NAME = BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__TYPE = BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__SUBTYPE = BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__CODE = BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__ID = BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__COMMENT = BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__PARENT = BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__PARENT_ID = BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__PASSPORT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__WORDS = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BTS List Subentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY_FEATURE_COUNT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS List Subentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY_OPERATION_COUNT = BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSThsEntryImpl <em>BTS Ths Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSThsEntryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSThsEntry()
	 * @generated
	 */
	int BTS_THS_ENTRY = 43;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTS Ths Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY___GET_DB_COLLECTION_KEY = BTS_CORPUS_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>BTS Ths Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl <em>BTS Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSProjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSProject()
	 * @generated
	 */
	int BTS_PROJECT = 44;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__STATE = BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__REVISION_STATE = BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__VISIBILITY = BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__SORT_KEY = BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__NAME = BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__TYPE = BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__SUBTYPE = BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__CODE = BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__ID = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__REV = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PROJECT = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__LOCKED = BTS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__UPDATERS = BTS_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__READERS = BTS_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DELETED = BTS_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__CONFLICTING_REVS = BTS_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PREFIX = BTS_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DESCRIPTION = BTS_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Db Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DB_CONNECTION = BTS_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Db Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DB_COLLECTIONS = BTS_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>BTS Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___GET_DB_COLLECTION_KEY = BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl <em>BTSDB Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBConnection()
	 * @generated
	 */
	int BTSDB_CONNECTION = 45;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION__TYPE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Master Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION__MASTER_SERVER = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Db Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION__DB_PATH = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTSDB Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BTSDB Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl <em>BTS Workflow Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWorkflowRule()
	 * @generated
	 */
	int BTS_WORKFLOW_RULE = 46;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Sub Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__SUB_RULES = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__ACTIONS = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accept Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__ACCEPT_MESSAGE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ocl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__OCL = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ocl Self Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__OCL_SELF_OBJECT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Denial Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__DENIAL_MESSAGE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>BTS Workflow Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>BTS Workflow Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl <em>BTS Workflow Rule Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWorkflowRuleItem()
	 * @generated
	 */
	int BTS_WORKFLOW_RULE_ITEM = 48;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM__ID = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM__PRIORITY = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM__IGNORE = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTS Workflow Rule Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM_FEATURE_COUNT = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Workflow Rule Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM_OPERATION_COUNT = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSOperatorImpl <em>BTS Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSOperatorImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSOperator()
	 * @generated
	 */
	int BTS_OPERATOR = 47;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__PROPERTY_CHANGE_SUPPORT = BTS_WORKFLOW_RULE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__ID = BTS_WORKFLOW_RULE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__PRIORITY = BTS_WORKFLOW_RULE_ITEM__PRIORITY;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__IGNORE = BTS_WORKFLOW_RULE_ITEM__IGNORE;

	/**
	 * The feature id for the '<em><b>Opperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__OPPERATOR = BTS_WORKFLOW_RULE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR_FEATURE_COUNT = BTS_WORKFLOW_RULE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_WORKFLOW_RULE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_WORKFLOW_RULE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR_OPERATION_COUNT = BTS_WORKFLOW_RULE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl <em>DB Lease</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.DBLeaseImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getDBLease()
	 * @generated
	 */
	int DB_LEASE = 49;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__LOCKED = BTSDB_BASE_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__UPDATERS = BTSDB_BASE_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__READERS = BTSDB_BASE_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__DELETED = BTSDB_BASE_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__CONFLICTING_REVS = BTSDB_BASE_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__PATH = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__OBJECT_ID = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__USER_ID = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__TIME_STAMP = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__OBJECT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__ACTIVE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bts UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__BTS_UUID = BTSDB_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>DB Lease</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE___GET_DB_COLLECTION_KEY = BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>DB Lease</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl <em>BTS Project DB Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSProjectDBCollection()
	 * @generated
	 */
	int BTS_PROJECT_DB_COLLECTION = 50;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Collection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION__INDEXED = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS Project DB Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>BTS Project DB Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl <em>BTSDB Collection Role Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBCollectionRoleDesc()
	 * @generated
	 */
	int BTSDB_COLLECTION_ROLE_DESC = 52;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_COLLECTION_ROLE_DESC__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_COLLECTION_ROLE_DESC__USER_NAMES = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_COLLECTION_ROLE_DESC__USER_ROLES = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cached Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTSDB Collection Role Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_COLLECTION_ROLE_DESC_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>BTSDB Collection Role Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_COLLECTION_ROLE_DESC_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextContentImpl <em>BTS Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTextContentImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextContent()
	 * @generated
	 */
	int BTS_TEXT_CONTENT = 53;

	/**
	 * The feature id for the '<em><b>Text Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CONTENT__TEXT_ITEMS = 0;

	/**
	 * The number of structural features of the '<em>BTS Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BTS Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.BTSAmbivalenceItem <em>BTS Ambivalence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.BTSAmbivalenceItem
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAmbivalenceItem()
	 * @generated
	 */
	int BTS_AMBIVALENCE_ITEM = 54;

	/**
	 * The number of structural features of the '<em>BTS Ambivalence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>BTS Ambivalence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.GraphicSelectionCounterImpl <em>Graphic Selection Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.GraphicSelectionCounterImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getGraphicSelectionCounter()
	 * @generated
	 */
	int GRAPHIC_SELECTION_COUNTER = 55;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__LOCKED = BTSDB_BASE_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__UPDATERS = BTSDB_BASE_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__READERS = BTSDB_BASE_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__DELETED = BTSDB_BASE_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__CONFLICTING_REVS = BTSDB_BASE_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>Date Of Last Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__DATE_OF_LAST_SELECTION = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER__COUNTER = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Graphic Selection Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get DB Collection Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER___GET_DB_COLLECTION_KEY = BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY;

	/**
	 * The number of operations of the '<em>Graphic Selection Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_SELECTION_COUNTER_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.StringToStringListMapImpl <em>String To String List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.StringToStringListMapImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getStringToStringListMap()
	 * @generated
	 */
	int STRING_TO_STRING_LIST_MAP = 57;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Property Change Support</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeSupport
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeSupport()
	 * @generated
	 */
	int PROPERTY_CHANGE_SUPPORT = 58;

	/**
	 * The meta object id for the '<em>Property Change Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeListener
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeListener()
	 * @generated
	 */
	int PROPERTY_CHANGE_LISTENER = 59;

	/**
	 * The meta object id for the '<em>Property Change Event</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeEvent
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeEvent()
	 * @generated
	 */
	int PROPERTY_CHANGE_EVENT = 60;


	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTCObject <em>BTSTC Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSTC Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTCObject
	 * @generated
	 */
	EClass getBTSTCObject();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSText <em>BTS Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSText
	 * @generated
	 */
	EClass getBTSText();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSText#getTextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Content</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSText#getTextContent()
	 * @see #getBTSText()
	 * @generated
	 */
	EReference getBTSText_TextContent();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSSenctence <em>BTS Senctence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Senctence</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSSenctence
	 * @generated
	 */
	EClass getBTSSenctence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSSenctence#getSentenceItems <em>Sentence Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentence Items</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSSenctence#getSentenceItems()
	 * @see #getBTSSenctence()
	 * @generated
	 */
	EReference getBTSSenctence_SentenceItems();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSSenctence#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSSenctence#getTranslation()
	 * @see #getBTSSenctence()
	 * @generated
	 */
	EReference getBTSSenctence_Translation();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSWord <em>BTS Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Word</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord
	 * @generated
	 */
	EClass getBTSWord();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSWord#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getTranslation()
	 * @see #getBTSWord()
	 * @generated
	 */
	EReference getBTSWord_Translation();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getWType <em>WType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WType</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getWType()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_WType();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getLType <em>LType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LType</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getLType()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_LType();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getLKey <em>LKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LKey</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getLKey()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_LKey();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getFlexCode <em>Flex Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flex Code</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getFlexCode()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_FlexCode();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getWChar <em>WChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WChar</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getWChar()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_WChar();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getValue()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSWord#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphics</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getGraphics()
	 * @see #getBTSWord()
	 * @generated
	 */
	EReference getBTSWord_Graphics();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSMarker <em>BTS Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Marker</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSMarker
	 * @generated
	 */
	EClass getBTSMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSMarker#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSMarker#getValue()
	 * @see #getBTSMarker()
	 * @generated
	 */
	EAttribute getBTSMarker_Value();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTextItems <em>BTS Text Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Items</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextItems
	 * @generated
	 */
	EClass getBTSTextItems();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSSentenceItem <em>BTS Sentence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Sentence Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSSentenceItem
	 * @generated
	 */
	EClass getBTSSentenceItem();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSListEntry <em>BTS List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS List Entry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry
	 * @generated
	 */
	EClass getBTSListEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSListEntry#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry#isIgnore()
	 * @see #getBTSListEntry()
	 * @generated
	 */
	EAttribute getBTSListEntry_Ignore();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSListEntry#getSubentries <em>Subentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subentries</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry#getSubentries()
	 * @see #getBTSListEntry()
	 * @generated
	 */
	EReference getBTSListEntry_Subentries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSListEntry#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry#getWords()
	 * @see #getBTSListEntry()
	 * @generated
	 */
	EReference getBTSListEntry_Words();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPassport <em>BTS Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport
	 * @generated
	 */
	EClass getBTSPassport();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getProtocol()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getBibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bibliography</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getBibliography()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Bibliography();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPassport#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getDate()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getWbSlips <em>Wb Slips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wb Slips</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getWbSlips()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_WbSlips();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getWbFolder <em>Wb Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wb Folder</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getWbFolder()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_WbFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provenance</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getProvenance()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Provenance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPassport#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getChildren()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getComment()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPassport#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getDescriptions()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_Descriptions();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.AdministrativDataObject <em>Administrativ Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrativ Data Object</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject
	 * @generated
	 */
	EClass getAdministrativDataObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisions()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EReference getAdministrativDataObject_Revisions();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getState()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EAttribute getAdministrativDataObject_State();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisionState <em>Revision State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision State</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisionState()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EAttribute getAdministrativDataObject_RevisionState();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getVisibility()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EAttribute getAdministrativDataObject_Visibility();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSObject <em>BTS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject
	 * @generated
	 */
	EClass getBTSObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getSortKey <em>Sort Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getSortKey()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_SortKey();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getName()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getType()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getSubtype()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getCode()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_Code();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSAmbivalence <em>BTS Ambivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Ambivalence</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAmbivalence
	 * @generated
	 */
	EClass getBTSAmbivalence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSAmbivalence#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAmbivalence#getCases()
	 * @see #getBTSAmbivalence()
	 * @generated
	 */
	EReference getBTSAmbivalence_Cases();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSLemmaCase <em>BTS Lemma Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Lemma Case</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSLemmaCase
	 * @generated
	 */
	EClass getBTSLemmaCase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSLemmaCase#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSLemmaCase#getScenario()
	 * @see #getBTSLemmaCase()
	 * @generated
	 */
	EReference getBTSLemmaCase_Scenario();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSUser <em>BTS User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS User</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser
	 * @generated
	 */
	EClass getBTSUser();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSUser#getGroupIds <em>Group Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group Ids</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getGroupIds()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_GroupIds();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getSigle <em>Sigle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigle</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getSigle()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Sigle();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getDescription()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getWebDescription <em>Web Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getWebDescription()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_WebDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getUserName()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getForeName <em>Fore Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fore Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getForeName()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_ForeName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getSureName <em>Sure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sure Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getSureName()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_SureName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getMail()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Mail();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getWebURL <em>Web URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web URL</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getWebURL()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_WebURL();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getComment()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSUser#getExternalReferneces <em>External Referneces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Referneces</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getExternalReferneces()
	 * @see #getBTSUser()
	 * @generated
	 */
	EReference getBTSUser_ExternalReferneces();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getPassword()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#isLoggedIn <em>Logged In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logged In</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#isLoggedIn()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_LoggedIn();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getStatus()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#isDbAdmin <em>Db Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Admin</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#isDbAdmin()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_DbAdmin();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSComment <em>BTS Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSComment
	 * @generated
	 */
	EClass getBTSComment();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSComment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSComment#getComment()
	 * @see #getBTSComment()
	 * @generated
	 */
	EAttribute getBTSComment_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSComment#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSComment#getReferences()
	 * @see #getBTSComment()
	 * @generated
	 */
	EReference getBTSComment_References();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSComment#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSComment#getTags()
	 * @see #getBTSComment()
	 * @generated
	 */
	EAttribute getBTSComment_Tags();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSInterTextReference <em>BTS Inter Text Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Inter Text Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSInterTextReference
	 * @generated
	 */
	EClass getBTSInterTextReference();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getBeginId <em>Begin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSInterTextReference#getBeginId()
	 * @see #getBTSInterTextReference()
	 * @generated
	 */
	EAttribute getBTSInterTextReference_BeginId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getEndId <em>End Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSInterTextReference#getEndId()
	 * @see #getBTSInterTextReference()
	 * @generated
	 */
	EAttribute getBTSInterTextReference_EndId();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTextSentenceItem <em>BTS Text Sentence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Sentence Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextSentenceItem
	 * @generated
	 */
	EClass getBTSTextSentenceItem();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSReference <em>BTS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReference
	 * @generated
	 */
	EClass getBTSReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSReference#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReference#getParts()
	 * @see #getBTSReference()
	 * @generated
	 */
	EReference getBTSReference_Parts();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSReference#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReference#getObjectId()
	 * @see #getBTSReference()
	 * @generated
	 */
	EAttribute getBTSReference_ObjectId();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSAnnotation <em>BTS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Annotation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAnnotation
	 * @generated
	 */
	EClass getBTSAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSAnnotation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAnnotation#getReferences()
	 * @see #getBTSAnnotation()
	 * @generated
	 */
	EReference getBTSAnnotation_References();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTranslation <em>BTS Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Translation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation
	 * @generated
	 */
	EClass getBTSTranslation();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSTranslation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation#getValue()
	 * @see #getBTSTranslation()
	 * @generated
	 */
	EAttribute getBTSTranslation_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSTranslation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation#getType()
	 * @see #getBTSTranslation()
	 * @generated
	 */
	EAttribute getBTSTranslation_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSTranslation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation#getLang()
	 * @see #getBTSTranslation()
	 * @generated
	 */
	EAttribute getBTSTranslation_Lang();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSDate <em>BTS Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Date</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate
	 * @generated
	 */
	EClass getBTSDate();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getType()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getYear()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getMonth()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getDay()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_Day();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getRelativeRef <em>Relative Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Ref</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getRelativeRef()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_RelativeRef();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPassportEntryGroup <em>BTS Passport Entry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Entry Group</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryGroup
	 * @generated
	 */
	EClass getBTSPassportEntryGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPassportEntryGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryGroup#getItems()
	 * @see #getBTSPassportEntryGroup()
	 * @generated
	 */
	EReference getBTSPassportEntryGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSRelation <em>BTS Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Relation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation
	 * @generated
	 */
	EClass getBTSRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getObjectId()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_ObjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getType()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getSubtype()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getComment()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getCertainty <em>Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certainty</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getCertainty()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_Certainty();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSConfiguration <em>BTS Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Configuration</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfiguration
	 * @generated
	 */
	EClass getBTSConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfiguration#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfiguration#getProvider()
	 * @see #getBTSConfiguration()
	 * @generated
	 */
	EAttribute getBTSConfiguration_Provider();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject <em>BTSDB Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSDB Base Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject
	 * @generated
	 */
	EClass getBTSDBBaseObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_rev <em>rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>rev</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#get_rev()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject__rev();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#getProject()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject_Project();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#isLocked()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject_Locked();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getUpdaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Updaters</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#getUpdaters()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject_Updaters();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getReaders <em>Readers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Readers</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#getReaders()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject_Readers();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#is_deleted <em>deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>deleted</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#is_deleted()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject__deleted();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getConflictingRevs <em>Conflicting Revs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conflicting Revs</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#getConflictingRevs()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject_ConflictingRevs();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getDBCollectionKey() <em>Get DB Collection Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get DB Collection Key</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#getDBCollectionKey()
	 * @generated
	 */
	EOperation getBTSDBBaseObject__GetDBCollectionKey();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTextCorpus <em>BTS Text Corpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Corpus</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextCorpus
	 * @generated
	 */
	EClass getBTSTextCorpus();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSTextCorpus#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextCorpus#getHeader()
	 * @see #getBTSTextCorpus()
	 * @generated
	 */
	EReference getBTSTextCorpus_Header();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSRevision <em>BTS Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Revision</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision
	 * @generated
	 */
	EClass getBTSRevision();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRevision#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision#getRef()
	 * @see #getBTSRevision()
	 * @generated
	 */
	EAttribute getBTSRevision_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRevision#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision#getUserId()
	 * @see #getBTSRevision()
	 * @generated
	 */
	EAttribute getBTSRevision_UserId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRevision#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision#getTimeStamp()
	 * @see #getBTSRevision()
	 * @generated
	 */
	EAttribute getBTSRevision_TimeStamp();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSImage <em>BTS Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Image</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSImage
	 * @generated
	 */
	EClass getBTSImage();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSImage#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSImage#getMediaType()
	 * @see #getBTSImage()
	 * @generated
	 */
	EAttribute getBTSImage_MediaType();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSImage#getAttachement() <em>Get Attachement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attachement</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSImage#getAttachement()
	 * @generated
	 */
	EOperation getBTSImage__GetAttachement();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader <em>BTS Corpus Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Corpus Header</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader
	 * @generated
	 */
	EClass getBTSCorpusHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader#getAuthorName()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_AuthorName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader#getProjectId()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader#getProjectName()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_ProjectName();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTimespan <em>BTS Timespan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Timespan</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan
	 * @generated
	 */
	EClass getBTSTimespan();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSTimespan#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan#getFrom()
	 * @see #getBTSTimespan()
	 * @generated
	 */
	EReference getBTSTimespan_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSTimespan#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan#getTo()
	 * @see #getBTSTimespan()
	 * @generated
	 */
	EReference getBTSTimespan_To();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSTimespan#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan#getComment()
	 * @see #getBTSTimespan()
	 * @generated
	 */
	EAttribute getBTSTimespan_Comment();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSCorpusObject <em>BTS Corpus Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Corpus Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject
	 * @generated
	 */
	EClass getBTSCorpusObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getRelations()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EReference getBTSCorpusObject_Relations();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getPassport <em>Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passport</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getPassport()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EReference getBTSCorpusObject_Passport();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getCorpusPrefix <em>Corpus Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corpus Prefix</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getCorpusPrefix()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EAttribute getBTSCorpusObject_CorpusPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getWorkPhase <em>Work Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Phase</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getWorkPhase()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EAttribute getBTSCorpusObject_WorkPhase();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSExternalReference <em>BTS External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS External Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference
	 * @generated
	 */
	EClass getBTSExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference#getReference()
	 * @see #getBTSExternalReference()
	 * @generated
	 */
	EAttribute getBTSExternalReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference#getProvider()
	 * @see #getBTSExternalReference()
	 * @generated
	 */
	EAttribute getBTSExternalReference_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference#getType()
	 * @see #getBTSExternalReference()
	 * @generated
	 */
	EAttribute getBTSExternalReference_Type();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSReferencableItem <em>BTS Referencable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Referencable Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem
	 * @generated
	 */
	EClass getBTSReferencableItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem#getComment()
	 * @see #getBTSReferencableItem()
	 * @generated
	 */
	EAttribute getBTSReferencableItem_Comment();

	/**
	 * Returns the meta object for the reference '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem#getParent()
	 * @see #getBTSReferencableItem()
	 * @generated
	 */
	EReference getBTSReferencableItem_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getParentId <em>Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem#getParentId()
	 * @see #getBTSReferencableItem()
	 * @generated
	 */
	EAttribute getBTSReferencableItem_ParentId();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSGraphic <em>BTS Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Graphic</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic
	 * @generated
	 */
	EClass getBTSGraphic();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSGraphic#getInnerSentenceOrder <em>Inner Sentence Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Sentence Order</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic#getInnerSentenceOrder()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_InnerSentenceOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSGraphic#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic#getCode()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSGraphic#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic#getReference()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSGraphic#isIgnored <em>Ignored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignored</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic#isIgnored()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_Ignored();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTranslations <em>BTS Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Translations</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations
	 * @generated
	 */
	EClass getBTSTranslations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSTranslations#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations#getTranslations()
	 * @see #getBTSTranslations()
	 * @generated
	 */
	EReference getBTSTranslations_Translations();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSTranslations#getTranslation(java.lang.String) <em>Get Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Translation</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations#getTranslation(java.lang.String)
	 * @generated
	 */
	EOperation getBTSTranslations__GetTranslation__String();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSTranslations#setTranslation(java.lang.String, java.lang.String) <em>Set Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Translation</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations#setTranslation(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBTSTranslations__SetTranslation__String_String();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSTranslations#getBTSTranslation(java.lang.String) <em>Get BTS Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get BTS Translation</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations#getBTSTranslation(java.lang.String)
	 * @generated
	 */
	EOperation getBTSTranslations__GetBTSTranslation__String();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSTranslations#getLanguages() <em>Get Languages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Languages</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations#getLanguages()
	 * @generated
	 */
	EOperation getBTSTranslations__GetLanguages();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSConfigItem <em>BTS Config Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Config Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem
	 * @generated
	 */
	EClass getBTSConfigItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getValue()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getLabel()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EReference getBTSConfigItem_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getDescription()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EReference getBTSConfigItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getSortKey <em>Sort Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getSortKey()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_SortKey();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#isIgnore()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Ignore();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getPassportEditorConfig <em>Passport Editor Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passport Editor Config</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getPassportEditorConfig()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EReference getBTSConfigItem_PassportEditorConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getType()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getSubtype()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Subtype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getRules()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EReference getBTSConfigItem_Rules();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#isShowWidget <em>Show Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Widget</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#isShowWidget()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_ShowWidget();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getOwnerReferencedTypesStringList <em>Owner Referenced Types String List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Owner Referenced Types String List</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getOwnerReferencedTypesStringList()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_OwnerReferencedTypesStringList();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getOwnerTypesMap() <em>Get Owner Types Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Owner Types Map</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getOwnerTypesMap()
	 * @generated
	 */
	EOperation getBTSConfigItem__GetOwnerTypesMap();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#clearOwnerTypesMap() <em>Clear Owner Types Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Owner Types Map</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#clearOwnerTypesMap()
	 * @generated
	 */
	EOperation getBTSConfigItem__ClearOwnerTypesMap();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig <em>BTS Passport Editor Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Editor Config</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig
	 * @generated
	 */
	EClass getBTSPassportEditorConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getWidgetType <em>Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widget Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getWidgetType()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_WidgetType();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isRequired()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isAllowMultiple <em>Allow Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Multiple</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isAllowMultiple()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_AllowMultiple();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getHorizontalWidth <em>Horizontal Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Width</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getHorizontalWidth()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_HorizontalWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getRegex()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_Regex();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getPredicateList <em>Predicate List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Predicate List</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getPredicateList()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_PredicateList();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSUserGroup <em>BTS User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS User Group</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUserGroup
	 * @generated
	 */
	EClass getBTSUserGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUserGroup#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUserGroup#getCategory()
	 * @see #getBTSUserGroup()
	 * @generated
	 */
	EAttribute getBTSUserGroup_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUserGroup#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUserGroup#getComment()
	 * @see #getBTSUserGroup()
	 * @generated
	 */
	EAttribute getBTSUserGroup_Comment();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSList <em>BTS List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS List</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSList
	 * @generated
	 */
	EClass getBTSList();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPassportEntryItem <em>BTS Passport Entry Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Entry Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryItem
	 * @generated
	 */
	EClass getBTSPassportEntryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntryItem#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryItem#getSubtype()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EAttribute getBTSPassportEntryItem_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntryItem#getSubValue <em>Sub Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryItem#getSubValue()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EAttribute getBTSPassportEntryItem_SubValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPassportEntryItem#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External References</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryItem#getExternalReferences()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EReference getBTSPassportEntryItem_ExternalReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPassportEntryItem#getTimespan <em>Timespan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timespan</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryItem#getTimespan()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EReference getBTSPassportEntryItem_Timespan();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPassportEntryItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryItem#getDescription()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EReference getBTSPassportEntryItem_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPassportEntryItem#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntryItem#getTranslation()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EReference getBTSPassportEntryItem_Translation();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSListSubentry <em>BTS List Subentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS List Subentry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListSubentry
	 * @generated
	 */
	EClass getBTSListSubentry();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSListSubentry#getPassport <em>Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passport</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListSubentry#getPassport()
	 * @see #getBTSListSubentry()
	 * @generated
	 */
	EReference getBTSListSubentry_Passport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSListSubentry#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListSubentry#getWords()
	 * @see #getBTSListSubentry()
	 * @generated
	 */
	EReference getBTSListSubentry_Words();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSConfig <em>BTS Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Config</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfig
	 * @generated
	 */
	EClass getBTSConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSConfig#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfig#getChildren()
	 * @see #getBTSConfig()
	 * @generated
	 */
	EReference getBTSConfig_Children();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSObservableObject <em>BTS Observable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Observable Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject
	 * @generated
	 */
	EClass getBTSObservableObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObservableObject#getPropertyChangeSupport <em>Property Change Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Change Support</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject#getPropertyChangeSupport()
	 * @see #getBTSObservableObject()
	 * @generated
	 */
	EAttribute getBTSObservableObject_PropertyChangeSupport();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSObservableObject#addPropertyChangeListener(java.beans.PropertyChangeListener) <em>Add Property Change Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Property Change Listener</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 * @generated
	 */
	EOperation getBTSObservableObject__AddPropertyChangeListener__PropertyChangeListener();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSObservableObject#removePropertyChangeListener(java.beans.PropertyChangeListener) <em>Remove Property Change Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Property Change Listener</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 * @generated
	 */
	EOperation getBTSObservableObject__RemovePropertyChangeListener__PropertyChangeListener();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSThsEntry <em>BTS Ths Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Ths Entry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSThsEntry
	 * @generated
	 */
	EClass getBTSThsEntry();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSProject <em>BTS Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Project</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject
	 * @generated
	 */
	EClass getBTSProject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProject#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject#getPrefix()
	 * @see #getBTSProject()
	 * @generated
	 */
	EAttribute getBTSProject_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject#getDescription()
	 * @see #getBTSProject()
	 * @generated
	 */
	EAttribute getBTSProject_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSProject#getDbConnection <em>Db Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Db Connection</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject#getDbConnection()
	 * @see #getBTSProject()
	 * @generated
	 */
	EReference getBTSProject_DbConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSProject#getDbCollections <em>Db Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Db Collections</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject#getDbCollections()
	 * @see #getBTSProject()
	 * @generated
	 */
	EReference getBTSProject_DbCollections();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSDBConnection <em>BTSDB Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSDB Connection</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection
	 * @generated
	 */
	EClass getBTSDBConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection#getType()
	 * @see #getBTSDBConnection()
	 * @generated
	 */
	EAttribute getBTSDBConnection_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getMasterServer <em>Master Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Server</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection#getMasterServer()
	 * @see #getBTSDBConnection()
	 * @generated
	 */
	EAttribute getBTSDBConnection_MasterServer();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getDbPath <em>Db Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Path</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection#getDbPath()
	 * @see #getBTSDBConnection()
	 * @generated
	 */
	EAttribute getBTSDBConnection_DbPath();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule <em>BTS Workflow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Workflow Rule</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule
	 * @generated
	 */
	EClass getBTSWorkflowRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getSubRules <em>Sub Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Rules</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getSubRules()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EReference getBTSWorkflowRule_SubRules();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getActions()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_Actions();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getAcceptMessage <em>Accept Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Message</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getAcceptMessage()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_AcceptMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOcl <em>Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getOcl()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_Ocl();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOclSelfObject <em>Ocl Self Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Self Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getOclSelfObject()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_OclSelfObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getDenialMessage <em>Denial Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denial Message</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getDenialMessage()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_DenialMessage();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSOperator <em>BTS Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Operator</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSOperator
	 * @generated
	 */
	EClass getBTSOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSOperator#getOpperator <em>Opperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opperator</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSOperator#getOpperator()
	 * @see #getBTSOperator()
	 * @generated
	 */
	EAttribute getBTSOperator_Opperator();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem <em>BTS Workflow Rule Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Workflow Rule Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRuleItem
	 * @generated
	 */
	EClass getBTSWorkflowRuleItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRuleItem#getPriority()
	 * @see #getBTSWorkflowRuleItem()
	 * @generated
	 */
	EAttribute getBTSWorkflowRuleItem_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRuleItem#isIgnore()
	 * @see #getBTSWorkflowRuleItem()
	 * @generated
	 */
	EAttribute getBTSWorkflowRuleItem_Ignore();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.DBLease <em>DB Lease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Lease</em>'.
	 * @see org.bbaw.bts.btsmodel.DBLease
	 * @generated
	 */
	EClass getDBLease();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.DBLease#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.bbaw.bts.btsmodel.DBLease#getPath()
	 * @see #getDBLease()
	 * @generated
	 */
	EAttribute getDBLease_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.DBLease#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see org.bbaw.bts.btsmodel.DBLease#getObjectId()
	 * @see #getDBLease()
	 * @generated
	 */
	EAttribute getDBLease_ObjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.DBLease#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.bbaw.bts.btsmodel.DBLease#getUserId()
	 * @see #getDBLease()
	 * @generated
	 */
	EAttribute getDBLease_UserId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.DBLease#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.bbaw.bts.btsmodel.DBLease#getTimeStamp()
	 * @see #getDBLease()
	 * @generated
	 */
	EAttribute getDBLease_TimeStamp();

	/**
	 * Returns the meta object for the reference '{@link org.bbaw.bts.btsmodel.DBLease#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.bbaw.bts.btsmodel.DBLease#getObject()
	 * @see #getDBLease()
	 * @generated
	 */
	EReference getDBLease_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.DBLease#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.bbaw.bts.btsmodel.DBLease#getActive()
	 * @see #getDBLease()
	 * @generated
	 */
	EAttribute getDBLease_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.DBLease#getBtsUUID <em>Bts UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bts UUID</em>'.
	 * @see org.bbaw.bts.btsmodel.DBLease#getBtsUUID()
	 * @see #getDBLease()
	 * @generated
	 */
	EAttribute getDBLease_BtsUUID();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection <em>BTS Project DB Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Project DB Collection</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection
	 * @generated
	 */
	EClass getBTSProjectDBCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getCollectionName <em>Collection Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#getCollectionName()
	 * @see #getBTSProjectDBCollection()
	 * @generated
	 */
	EAttribute getBTSProjectDBCollection_CollectionName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isIndexed <em>Indexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexed</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#isIndexed()
	 * @see #getBTSProjectDBCollection()
	 * @generated
	 */
	EAttribute getBTSProjectDBCollection_Indexed();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#isSynchronized()
	 * @see #getBTSProjectDBCollection()
	 * @generated
	 */
	EAttribute getBTSProjectDBCollection_Synchronized();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getRoleDescriptions <em>Role Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Descriptions</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#getRoleDescriptions()
	 * @see #getBTSProjectDBCollection()
	 * @generated
	 */
	EReference getBTSProjectDBCollection_RoleDescriptions();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSIdentifiableItem <em>BTS Identifiable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Identifiable Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSIdentifiableItem
	 * @generated
	 */
	EClass getBTSIdentifiableItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSIdentifiableItem#get_id <em>id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSIdentifiableItem#get_id()
	 * @see #getBTSIdentifiableItem()
	 * @generated
	 */
	EAttribute getBTSIdentifiableItem__id();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc <em>BTSDB Collection Role Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSDB Collection Role Desc</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc
	 * @generated
	 */
	EClass getBTSDBCollectionRoleDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getRoleName()
	 * @see #getBTSDBCollectionRoleDesc()
	 * @generated
	 */
	EAttribute getBTSDBCollectionRoleDesc_RoleName();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getUserNames <em>User Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>User Names</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getUserNames()
	 * @see #getBTSDBCollectionRoleDesc()
	 * @generated
	 */
	EAttribute getBTSDBCollectionRoleDesc_UserNames();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getUserRoles <em>User Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>User Roles</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getUserRoles()
	 * @see #getBTSDBCollectionRoleDesc()
	 * @generated
	 */
	EAttribute getBTSDBCollectionRoleDesc_UserRoles();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getCachedChildren <em>Cached Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cached Children</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc#getCachedChildren()
	 * @see #getBTSDBCollectionRoleDesc()
	 * @generated
	 */
	EAttribute getBTSDBCollectionRoleDesc_CachedChildren();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTextContent <em>BTS Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Content</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextContent
	 * @generated
	 */
	EClass getBTSTextContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSTextContent#getTextItems <em>Text Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Items</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextContent#getTextItems()
	 * @see #getBTSTextContent()
	 * @generated
	 */
	EReference getBTSTextContent_TextItems();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSAmbivalenceItem <em>BTS Ambivalence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Ambivalence Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAmbivalenceItem
	 * @generated
	 */
	EClass getBTSAmbivalenceItem();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter <em>Graphic Selection Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Selection Counter</em>'.
	 * @see org.bbaw.bts.btsmodel.GraphicSelectionCounter
	 * @generated
	 */
	EClass getGraphicSelectionCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter#getDateOfLastSelection <em>Date Of Last Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Last Selection</em>'.
	 * @see org.bbaw.bts.btsmodel.GraphicSelectionCounter#getDateOfLastSelection()
	 * @see #getGraphicSelectionCounter()
	 * @generated
	 */
	EAttribute getGraphicSelectionCounter_DateOfLastSelection();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.GraphicSelectionCounter#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see org.bbaw.bts.btsmodel.GraphicSelectionCounter#getCounter()
	 * @see #getGraphicSelectionCounter()
	 * @generated
	 */
	EAttribute getGraphicSelectionCounter_Counter();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPassportEntry <em>BTS Passport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Entry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry
	 * @generated
	 */
	EClass getBTSPassportEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getProvider()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getComment()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getType()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getValue()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getChildren()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EReference getBTSPassportEntry_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getLabel()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EReference getBTSPassportEntry_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getName()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getKey()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Key();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EEList<org.eclipse.emf.ecore.EString>" valueMany="false" valueTransient="true"
	 * @generated
	 */
	EClass getStringToStringListMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringListMap()
	 * @generated
	 */
	EAttribute getStringToStringListMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringListMap()
	 * @generated
	 */
	EAttribute getStringToStringListMap_Value();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeSupport <em>Property Change Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Support</em>'.
	 * @see java.beans.PropertyChangeSupport
	 * @model instanceClass="java.beans.PropertyChangeSupport" serializeable="false"
	 * @generated
	 */
	EDataType getPropertyChangeSupport();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeListener <em>Property Change Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Listener</em>'.
	 * @see java.beans.PropertyChangeListener
	 * @model instanceClass="java.beans.PropertyChangeListener" serializeable="false"
	 * @generated
	 */
	EDataType getPropertyChangeListener();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeEvent <em>Property Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Event</em>'.
	 * @see java.beans.PropertyChangeEvent
	 * @model instanceClass="java.beans.PropertyChangeEvent" serializeable="false"
	 * @generated
	 */
	EDataType getPropertyChangeEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BtsmodelFactory getBtsmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTCObjectImpl <em>BTSTC Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTCObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTCObject()
		 * @generated
		 */
		EClass BTSTC_OBJECT = eINSTANCE.getBTSTCObject();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextImpl <em>BTS Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTextImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSText()
		 * @generated
		 */
		EClass BTS_TEXT = eINSTANCE.getBTSText();

		/**
		 * The meta object literal for the '<em><b>Text Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TEXT__TEXT_CONTENT = eINSTANCE.getBTSText_TextContent();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSSenctenceImpl <em>BTS Senctence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSSenctenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSSenctence()
		 * @generated
		 */
		EClass BTS_SENCTENCE = eINSTANCE.getBTSSenctence();

		/**
		 * The meta object literal for the '<em><b>Sentence Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_SENCTENCE__SENTENCE_ITEMS = eINSTANCE.getBTSSenctence_SentenceItems();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_SENCTENCE__TRANSLATION = eINSTANCE.getBTSSenctence_Translation();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl <em>BTS Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSWordImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWord()
		 * @generated
		 */
		EClass BTS_WORD = eINSTANCE.getBTSWord();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_WORD__TRANSLATION = eINSTANCE.getBTSWord_Translation();

		/**
		 * The meta object literal for the '<em><b>WType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__WTYPE = eINSTANCE.getBTSWord_WType();

		/**
		 * The meta object literal for the '<em><b>LType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__LTYPE = eINSTANCE.getBTSWord_LType();

		/**
		 * The meta object literal for the '<em><b>LKey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__LKEY = eINSTANCE.getBTSWord_LKey();

		/**
		 * The meta object literal for the '<em><b>Flex Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__FLEX_CODE = eINSTANCE.getBTSWord_FlexCode();

		/**
		 * The meta object literal for the '<em><b>WChar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__WCHAR = eINSTANCE.getBTSWord_WChar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__VALUE = eINSTANCE.getBTSWord_Value();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_WORD__GRAPHICS = eINSTANCE.getBTSWord_Graphics();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSMarkerImpl <em>BTS Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSMarkerImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSMarker()
		 * @generated
		 */
		EClass BTS_MARKER = eINSTANCE.getBTSMarker();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_MARKER__VALUE = eINSTANCE.getBTSMarker_Value();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.BTSTextItems <em>BTS Text Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.BTSTextItems
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextItems()
		 * @generated
		 */
		EClass BTS_TEXT_ITEMS = eINSTANCE.getBTSTextItems();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.BTSSentenceItem <em>BTS Sentence Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.BTSSentenceItem
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSSentenceItem()
		 * @generated
		 */
		EClass BTS_SENTENCE_ITEM = eINSTANCE.getBTSSentenceItem();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSListEntryImpl <em>BTS List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSListEntryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSListEntry()
		 * @generated
		 */
		EClass BTS_LIST_ENTRY = eINSTANCE.getBTSListEntry();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_LIST_ENTRY__IGNORE = eINSTANCE.getBTSListEntry_Ignore();

		/**
		 * The meta object literal for the '<em><b>Subentries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LIST_ENTRY__SUBENTRIES = eINSTANCE.getBTSListEntry_Subentries();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LIST_ENTRY__WORDS = eINSTANCE.getBTSListEntry_Words();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl <em>BTS Passport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPassportImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassport()
		 * @generated
		 */
		EClass BTS_PASSPORT = eINSTANCE.getBTSPassport();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__PROTOCOL = eINSTANCE.getBTSPassport_Protocol();

		/**
		 * The meta object literal for the '<em><b>Bibliography</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__BIBLIOGRAPHY = eINSTANCE.getBTSPassport_Bibliography();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__DATE = eINSTANCE.getBTSPassport_Date();

		/**
		 * The meta object literal for the '<em><b>Wb Slips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__WB_SLIPS = eINSTANCE.getBTSPassport_WbSlips();

		/**
		 * The meta object literal for the '<em><b>Wb Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__WB_FOLDER = eINSTANCE.getBTSPassport_WbFolder();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__PROVENANCE = eINSTANCE.getBTSPassport_Provenance();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__CHILDREN = eINSTANCE.getBTSPassport_Children();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__COMMENT = eINSTANCE.getBTSPassport_Comment();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__DESCRIPTIONS = eINSTANCE.getBTSPassport_Descriptions();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl <em>Administrativ Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getAdministrativDataObject()
		 * @generated
		 */
		EClass ADMINISTRATIV_DATA_OBJECT = eINSTANCE.getAdministrativDataObject();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATIV_DATA_OBJECT__REVISIONS = eINSTANCE.getAdministrativDataObject_Revisions();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIV_DATA_OBJECT__STATE = eINSTANCE.getAdministrativDataObject_State();

		/**
		 * The meta object literal for the '<em><b>Revision State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIV_DATA_OBJECT__REVISION_STATE = eINSTANCE.getAdministrativDataObject_RevisionState();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIV_DATA_OBJECT__VISIBILITY = eINSTANCE.getAdministrativDataObject_Visibility();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl <em>BTS Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObject()
		 * @generated
		 */
		EClass BTS_OBJECT = eINSTANCE.getBTSObject();

		/**
		 * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__SORT_KEY = eINSTANCE.getBTSObject_SortKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__NAME = eINSTANCE.getBTSObject_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__TYPE = eINSTANCE.getBTSObject_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__SUBTYPE = eINSTANCE.getBTSObject_Subtype();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__CODE = eINSTANCE.getBTSObject_Code();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSAmbivalenceImpl <em>BTS Ambivalence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSAmbivalenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAmbivalence()
		 * @generated
		 */
		EClass BTS_AMBIVALENCE = eINSTANCE.getBTSAmbivalence();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_AMBIVALENCE__CASES = eINSTANCE.getBTSAmbivalence_Cases();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSLemmaCaseImpl <em>BTS Lemma Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSLemmaCaseImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSLemmaCase()
		 * @generated
		 */
		EClass BTS_LEMMA_CASE = eINSTANCE.getBTSLemmaCase();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LEMMA_CASE__SCENARIO = eINSTANCE.getBTSLemmaCase_Scenario();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl <em>BTS User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSUserImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUser()
		 * @generated
		 */
		EClass BTS_USER = eINSTANCE.getBTSUser();

		/**
		 * The meta object literal for the '<em><b>Group Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__GROUP_IDS = eINSTANCE.getBTSUser_GroupIds();

		/**
		 * The meta object literal for the '<em><b>Sigle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__SIGLE = eINSTANCE.getBTSUser_Sigle();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__DESCRIPTION = eINSTANCE.getBTSUser_Description();

		/**
		 * The meta object literal for the '<em><b>Web Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__WEB_DESCRIPTION = eINSTANCE.getBTSUser_WebDescription();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__USER_NAME = eINSTANCE.getBTSUser_UserName();

		/**
		 * The meta object literal for the '<em><b>Fore Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__FORE_NAME = eINSTANCE.getBTSUser_ForeName();

		/**
		 * The meta object literal for the '<em><b>Sure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__SURE_NAME = eINSTANCE.getBTSUser_SureName();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__MAIL = eINSTANCE.getBTSUser_Mail();

		/**
		 * The meta object literal for the '<em><b>Web URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__WEB_URL = eINSTANCE.getBTSUser_WebURL();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__COMMENT = eINSTANCE.getBTSUser_Comment();

		/**
		 * The meta object literal for the '<em><b>External Referneces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_USER__EXTERNAL_REFERNECES = eINSTANCE.getBTSUser_ExternalReferneces();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__PASSWORD = eINSTANCE.getBTSUser_Password();

		/**
		 * The meta object literal for the '<em><b>Logged In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__LOGGED_IN = eINSTANCE.getBTSUser_LoggedIn();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__STATUS = eINSTANCE.getBTSUser_Status();

		/**
		 * The meta object literal for the '<em><b>Db Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__DB_ADMIN = eINSTANCE.getBTSUser_DbAdmin();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSCommentImpl <em>BTS Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSCommentImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSComment()
		 * @generated
		 */
		EClass BTS_COMMENT = eINSTANCE.getBTSComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_COMMENT__COMMENT = eINSTANCE.getBTSComment_Comment();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_COMMENT__REFERENCES = eINSTANCE.getBTSComment_References();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_COMMENT__TAGS = eINSTANCE.getBTSComment_Tags();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl <em>BTS Inter Text Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSInterTextReference()
		 * @generated
		 */
		EClass BTS_INTER_TEXT_REFERENCE = eINSTANCE.getBTSInterTextReference();

		/**
		 * The meta object literal for the '<em><b>Begin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_INTER_TEXT_REFERENCE__BEGIN_ID = eINSTANCE.getBTSInterTextReference_BeginId();

		/**
		 * The meta object literal for the '<em><b>End Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_INTER_TEXT_REFERENCE__END_ID = eINSTANCE.getBTSInterTextReference_EndId();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextSentenceItemImpl <em>BTS Text Sentence Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTextSentenceItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextSentenceItem()
		 * @generated
		 */
		EClass BTS_TEXT_SENTENCE_ITEM = eINSTANCE.getBTSTextSentenceItem();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferenceImpl <em>BTS Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSReferenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReference()
		 * @generated
		 */
		EClass BTS_REFERENCE = eINSTANCE.getBTSReference();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_REFERENCE__PARTS = eINSTANCE.getBTSReference_Parts();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REFERENCE__OBJECT_ID = eINSTANCE.getBTSReference_ObjectId();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSAnnotationImpl <em>BTS Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSAnnotationImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAnnotation()
		 * @generated
		 */
		EClass BTS_ANNOTATION = eINSTANCE.getBTSAnnotation();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_ANNOTATION__REFERENCES = eINSTANCE.getBTSAnnotation_References();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationImpl <em>BTS Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslation()
		 * @generated
		 */
		EClass BTS_TRANSLATION = eINSTANCE.getBTSTranslation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_TRANSLATION__VALUE = eINSTANCE.getBTSTranslation_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_TRANSLATION__TYPE = eINSTANCE.getBTSTranslation_Type();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_TRANSLATION__LANG = eINSTANCE.getBTSTranslation_Lang();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl <em>BTS Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSDateImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDate()
		 * @generated
		 */
		EClass BTS_DATE = eINSTANCE.getBTSDate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__TYPE = eINSTANCE.getBTSDate_Type();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__YEAR = eINSTANCE.getBTSDate_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__MONTH = eINSTANCE.getBTSDate_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__DAY = eINSTANCE.getBTSDate_Day();

		/**
		 * The meta object literal for the '<em><b>Relative Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__RELATIVE_REF = eINSTANCE.getBTSDate_RelativeRef();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryGroupImpl <em>BTS Passport Entry Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEntryGroupImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEntryGroup()
		 * @generated
		 */
		EClass BTS_PASSPORT_ENTRY_GROUP = eINSTANCE.getBTSPassportEntryGroup();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_GROUP__ITEMS = eINSTANCE.getBTSPassportEntryGroup_Items();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl <em>BTS Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSRelationImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRelation()
		 * @generated
		 */
		EClass BTS_RELATION = eINSTANCE.getBTSRelation();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__OBJECT_ID = eINSTANCE.getBTSRelation_ObjectId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__TYPE = eINSTANCE.getBTSRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__SUBTYPE = eINSTANCE.getBTSRelation_Subtype();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__COMMENT = eINSTANCE.getBTSRelation_Comment();

		/**
		 * The meta object literal for the '<em><b>Certainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__CERTAINTY = eINSTANCE.getBTSRelation_Certainty();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl <em>BTS Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfiguration()
		 * @generated
		 */
		EClass BTS_CONFIGURATION = eINSTANCE.getBTSConfiguration();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIGURATION__PROVIDER = eINSTANCE.getBTSConfiguration_Provider();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl <em>BTSDB Base Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBBaseObject()
		 * @generated
		 */
		EClass BTSDB_BASE_OBJECT = eINSTANCE.getBTSDBBaseObject();

		/**
		 * The meta object literal for the '<em><b>rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__REV = eINSTANCE.getBTSDBBaseObject__rev();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__PROJECT = eINSTANCE.getBTSDBBaseObject_Project();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__LOCKED = eINSTANCE.getBTSDBBaseObject_Locked();

		/**
		 * The meta object literal for the '<em><b>Updaters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__UPDATERS = eINSTANCE.getBTSDBBaseObject_Updaters();

		/**
		 * The meta object literal for the '<em><b>Readers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__READERS = eINSTANCE.getBTSDBBaseObject_Readers();

		/**
		 * The meta object literal for the '<em><b>deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__DELETED = eINSTANCE.getBTSDBBaseObject__deleted();

		/**
		 * The meta object literal for the '<em><b>Conflicting Revs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__CONFLICTING_REVS = eINSTANCE.getBTSDBBaseObject_ConflictingRevs();

		/**
		 * The meta object literal for the '<em><b>Get DB Collection Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTSDB_BASE_OBJECT___GET_DB_COLLECTION_KEY = eINSTANCE.getBTSDBBaseObject__GetDBCollectionKey();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextCorpusImpl <em>BTS Text Corpus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTextCorpusImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextCorpus()
		 * @generated
		 */
		EClass BTS_TEXT_CORPUS = eINSTANCE.getBTSTextCorpus();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TEXT_CORPUS__HEADER = eINSTANCE.getBTSTextCorpus_Header();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl <em>BTS Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSRevisionImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRevision()
		 * @generated
		 */
		EClass BTS_REVISION = eINSTANCE.getBTSRevision();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REVISION__REF = eINSTANCE.getBTSRevision_Ref();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REVISION__USER_ID = eINSTANCE.getBTSRevision_UserId();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REVISION__TIME_STAMP = eINSTANCE.getBTSRevision_TimeStamp();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSImageImpl <em>BTS Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSImageImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSImage()
		 * @generated
		 */
		EClass BTS_IMAGE = eINSTANCE.getBTSImage();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_IMAGE__MEDIA_TYPE = eINSTANCE.getBTSImage_MediaType();

		/**
		 * The meta object literal for the '<em><b>Get Attachement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_IMAGE___GET_ATTACHEMENT = eINSTANCE.getBTSImage__GetAttachement();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSCorpusHeaderImpl <em>BTS Corpus Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSCorpusHeaderImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSCorpusHeader()
		 * @generated
		 */
		EClass BTS_CORPUS_HEADER = eINSTANCE.getBTSCorpusHeader();

		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__AUTHOR_NAME = eINSTANCE.getBTSCorpusHeader_AuthorName();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__PROJECT_ID = eINSTANCE.getBTSCorpusHeader_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__PROJECT_NAME = eINSTANCE.getBTSCorpusHeader_ProjectName();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTimespanImpl <em>BTS Timespan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTimespanImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTimespan()
		 * @generated
		 */
		EClass BTS_TIMESPAN = eINSTANCE.getBTSTimespan();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TIMESPAN__FROM = eINSTANCE.getBTSTimespan_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TIMESPAN__TO = eINSTANCE.getBTSTimespan_To();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_TIMESPAN__COMMENT = eINSTANCE.getBTSTimespan_Comment();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl <em>BTS Corpus Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSCorpusObject()
		 * @generated
		 */
		EClass BTS_CORPUS_OBJECT = eINSTANCE.getBTSCorpusObject();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CORPUS_OBJECT__RELATIONS = eINSTANCE.getBTSCorpusObject_Relations();

		/**
		 * The meta object literal for the '<em><b>Passport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CORPUS_OBJECT__PASSPORT = eINSTANCE.getBTSCorpusObject_Passport();

		/**
		 * The meta object literal for the '<em><b>Corpus Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_OBJECT__CORPUS_PREFIX = eINSTANCE.getBTSCorpusObject_CorpusPrefix();

		/**
		 * The meta object literal for the '<em><b>Work Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_OBJECT__WORK_PHASE = eINSTANCE.getBTSCorpusObject_WorkPhase();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl <em>BTS External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSExternalReference()
		 * @generated
		 */
		EClass BTS_EXTERNAL_REFERENCE = eINSTANCE.getBTSExternalReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_EXTERNAL_REFERENCE__REFERENCE = eINSTANCE.getBTSExternalReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_EXTERNAL_REFERENCE__PROVIDER = eINSTANCE.getBTSExternalReference_Provider();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_EXTERNAL_REFERENCE__TYPE = eINSTANCE.getBTSExternalReference_Type();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl <em>BTS Referencable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReferencableItem()
		 * @generated
		 */
		EClass BTS_REFERENCABLE_ITEM = eINSTANCE.getBTSReferencableItem();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REFERENCABLE_ITEM__COMMENT = eINSTANCE.getBTSReferencableItem_Comment();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_REFERENCABLE_ITEM__PARENT = eINSTANCE.getBTSReferencableItem_Parent();

		/**
		 * The meta object literal for the '<em><b>Parent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REFERENCABLE_ITEM__PARENT_ID = eINSTANCE.getBTSReferencableItem_ParentId();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSGraphicImpl <em>BTS Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSGraphicImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSGraphic()
		 * @generated
		 */
		EClass BTS_GRAPHIC = eINSTANCE.getBTSGraphic();

		/**
		 * The meta object literal for the '<em><b>Inner Sentence Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__INNER_SENTENCE_ORDER = eINSTANCE.getBTSGraphic_InnerSentenceOrder();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__CODE = eINSTANCE.getBTSGraphic_Code();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__REFERENCE = eINSTANCE.getBTSGraphic_Reference();

		/**
		 * The meta object literal for the '<em><b>Ignored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__IGNORED = eINSTANCE.getBTSGraphic_Ignored();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl <em>BTS Translations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslations()
		 * @generated
		 */
		EClass BTS_TRANSLATIONS = eINSTANCE.getBTSTranslations();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TRANSLATIONS__TRANSLATIONS = eINSTANCE.getBTSTranslations_Translations();

		/**
		 * The meta object literal for the '<em><b>Get Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_TRANSLATIONS___GET_TRANSLATION__STRING = eINSTANCE.getBTSTranslations__GetTranslation__String();

		/**
		 * The meta object literal for the '<em><b>Set Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_TRANSLATIONS___SET_TRANSLATION__STRING_STRING = eINSTANCE.getBTSTranslations__SetTranslation__String_String();

		/**
		 * The meta object literal for the '<em><b>Get BTS Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_TRANSLATIONS___GET_BTS_TRANSLATION__STRING = eINSTANCE.getBTSTranslations__GetBTSTranslation__String();

		/**
		 * The meta object literal for the '<em><b>Get Languages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_TRANSLATIONS___GET_LANGUAGES = eINSTANCE.getBTSTranslations__GetLanguages();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl <em>BTS Config Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfigItem()
		 * @generated
		 */
		EClass BTS_CONFIG_ITEM = eINSTANCE.getBTSConfigItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__VALUE = eINSTANCE.getBTSConfigItem_Value();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG_ITEM__LABEL = eINSTANCE.getBTSConfigItem_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG_ITEM__DESCRIPTION = eINSTANCE.getBTSConfigItem_Description();

		/**
		 * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__SORT_KEY = eINSTANCE.getBTSConfigItem_SortKey();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__IGNORE = eINSTANCE.getBTSConfigItem_Ignore();

		/**
		 * The meta object literal for the '<em><b>Passport Editor Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG = eINSTANCE.getBTSConfigItem_PassportEditorConfig();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__TYPE = eINSTANCE.getBTSConfigItem_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__SUBTYPE = eINSTANCE.getBTSConfigItem_Subtype();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG_ITEM__RULES = eINSTANCE.getBTSConfigItem_Rules();

		/**
		 * The meta object literal for the '<em><b>Show Widget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__SHOW_WIDGET = eINSTANCE.getBTSConfigItem_ShowWidget();

		/**
		 * The meta object literal for the '<em><b>Owner Referenced Types String List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST = eINSTANCE.getBTSConfigItem_OwnerReferencedTypesStringList();

		/**
		 * The meta object literal for the '<em><b>Get Owner Types Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_CONFIG_ITEM___GET_OWNER_TYPES_MAP = eINSTANCE.getBTSConfigItem__GetOwnerTypesMap();

		/**
		 * The meta object literal for the '<em><b>Clear Owner Types Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_CONFIG_ITEM___CLEAR_OWNER_TYPES_MAP = eINSTANCE.getBTSConfigItem__ClearOwnerTypesMap();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl <em>BTS Passport Editor Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEditorConfig()
		 * @generated
		 */
		EClass BTS_PASSPORT_EDITOR_CONFIG = eINSTANCE.getBTSPassportEditorConfig();

		/**
		 * The meta object literal for the '<em><b>Widget Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE = eINSTANCE.getBTSPassportEditorConfig_WidgetType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__REQUIRED = eINSTANCE.getBTSPassportEditorConfig_Required();

		/**
		 * The meta object literal for the '<em><b>Allow Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE = eINSTANCE.getBTSPassportEditorConfig_AllowMultiple();

		/**
		 * The meta object literal for the '<em><b>Horizontal Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH = eINSTANCE.getBTSPassportEditorConfig_HorizontalWidth();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__REGEX = eINSTANCE.getBTSPassportEditorConfig_Regex();

		/**
		 * The meta object literal for the '<em><b>Predicate List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_LIST = eINSTANCE.getBTSPassportEditorConfig_PredicateList();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl <em>BTS User Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUserGroup()
		 * @generated
		 */
		EClass BTS_USER_GROUP = eINSTANCE.getBTSUserGroup();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER_GROUP__CATEGORY = eINSTANCE.getBTSUserGroup_Category();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER_GROUP__COMMENT = eINSTANCE.getBTSUserGroup_Comment();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSListImpl <em>BTS List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSListImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSList()
		 * @generated
		 */
		EClass BTS_LIST = eINSTANCE.getBTSList();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryItemImpl <em>BTS Passport Entry Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEntryItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEntryItem()
		 * @generated
		 */
		EClass BTS_PASSPORT_ENTRY_ITEM = eINSTANCE.getBTSPassportEntryItem();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY_ITEM__SUBTYPE = eINSTANCE.getBTSPassportEntryItem_Subtype();

		/**
		 * The meta object literal for the '<em><b>Sub Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE = eINSTANCE.getBTSPassportEntryItem_SubValue();

		/**
		 * The meta object literal for the '<em><b>External References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES = eINSTANCE.getBTSPassportEntryItem_ExternalReferences();

		/**
		 * The meta object literal for the '<em><b>Timespan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_ITEM__TIMESPAN = eINSTANCE.getBTSPassportEntryItem_Timespan();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION = eINSTANCE.getBTSPassportEntryItem_Description();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_ITEM__TRANSLATION = eINSTANCE.getBTSPassportEntryItem_Translation();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl <em>BTS List Subentry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSListSubentry()
		 * @generated
		 */
		EClass BTS_LIST_SUBENTRY = eINSTANCE.getBTSListSubentry();

		/**
		 * The meta object literal for the '<em><b>Passport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LIST_SUBENTRY__PASSPORT = eINSTANCE.getBTSListSubentry_Passport();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LIST_SUBENTRY__WORDS = eINSTANCE.getBTSListSubentry_Words();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigImpl <em>BTS Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSConfigImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfig()
		 * @generated
		 */
		EClass BTS_CONFIG = eINSTANCE.getBTSConfig();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG__CHILDREN = eINSTANCE.getBTSConfig_Children();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl <em>BTS Observable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObservableObject()
		 * @generated
		 */
		EClass BTS_OBSERVABLE_OBJECT = eINSTANCE.getBTSObservableObject();

		/**
		 * The meta object literal for the '<em><b>Property Change Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT = eINSTANCE.getBTSObservableObject_PropertyChangeSupport();

		/**
		 * The meta object literal for the '<em><b>Add Property Change Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = eINSTANCE.getBTSObservableObject__AddPropertyChangeListener__PropertyChangeListener();

		/**
		 * The meta object literal for the '<em><b>Remove Property Change Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = eINSTANCE.getBTSObservableObject__RemovePropertyChangeListener__PropertyChangeListener();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSThsEntryImpl <em>BTS Ths Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSThsEntryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSThsEntry()
		 * @generated
		 */
		EClass BTS_THS_ENTRY = eINSTANCE.getBTSThsEntry();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl <em>BTS Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSProjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSProject()
		 * @generated
		 */
		EClass BTS_PROJECT = eINSTANCE.getBTSProject();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT__PREFIX = eINSTANCE.getBTSProject_Prefix();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT__DESCRIPTION = eINSTANCE.getBTSProject_Description();

		/**
		 * The meta object literal for the '<em><b>Db Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PROJECT__DB_CONNECTION = eINSTANCE.getBTSProject_DbConnection();

		/**
		 * The meta object literal for the '<em><b>Db Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PROJECT__DB_COLLECTIONS = eINSTANCE.getBTSProject_DbCollections();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl <em>BTSDB Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBConnection()
		 * @generated
		 */
		EClass BTSDB_CONNECTION = eINSTANCE.getBTSDBConnection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_CONNECTION__TYPE = eINSTANCE.getBTSDBConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Master Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_CONNECTION__MASTER_SERVER = eINSTANCE.getBTSDBConnection_MasterServer();

		/**
		 * The meta object literal for the '<em><b>Db Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_CONNECTION__DB_PATH = eINSTANCE.getBTSDBConnection_DbPath();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl <em>BTS Workflow Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWorkflowRule()
		 * @generated
		 */
		EClass BTS_WORKFLOW_RULE = eINSTANCE.getBTSWorkflowRule();

		/**
		 * The meta object literal for the '<em><b>Sub Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_WORKFLOW_RULE__SUB_RULES = eINSTANCE.getBTSWorkflowRule_SubRules();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__ACTIONS = eINSTANCE.getBTSWorkflowRule_Actions();

		/**
		 * The meta object literal for the '<em><b>Accept Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__ACCEPT_MESSAGE = eINSTANCE.getBTSWorkflowRule_AcceptMessage();

		/**
		 * The meta object literal for the '<em><b>Ocl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__OCL = eINSTANCE.getBTSWorkflowRule_Ocl();

		/**
		 * The meta object literal for the '<em><b>Ocl Self Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__OCL_SELF_OBJECT = eINSTANCE.getBTSWorkflowRule_OclSelfObject();

		/**
		 * The meta object literal for the '<em><b>Denial Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__DENIAL_MESSAGE = eINSTANCE.getBTSWorkflowRule_DenialMessage();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSOperatorImpl <em>BTS Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSOperatorImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSOperator()
		 * @generated
		 */
		EClass BTS_OPERATOR = eINSTANCE.getBTSOperator();

		/**
		 * The meta object literal for the '<em><b>Opperator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OPERATOR__OPPERATOR = eINSTANCE.getBTSOperator_Opperator();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl <em>BTS Workflow Rule Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWorkflowRuleItem()
		 * @generated
		 */
		EClass BTS_WORKFLOW_RULE_ITEM = eINSTANCE.getBTSWorkflowRuleItem();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE_ITEM__PRIORITY = eINSTANCE.getBTSWorkflowRuleItem_Priority();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE_ITEM__IGNORE = eINSTANCE.getBTSWorkflowRuleItem_Ignore();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl <em>DB Lease</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.DBLeaseImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getDBLease()
		 * @generated
		 */
		EClass DB_LEASE = eINSTANCE.getDBLease();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_LEASE__PATH = eINSTANCE.getDBLease_Path();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_LEASE__OBJECT_ID = eINSTANCE.getDBLease_ObjectId();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_LEASE__USER_ID = eINSTANCE.getDBLease_UserId();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_LEASE__TIME_STAMP = eINSTANCE.getDBLease_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_LEASE__OBJECT = eINSTANCE.getDBLease_Object();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_LEASE__ACTIVE = eINSTANCE.getDBLease_Active();

		/**
		 * The meta object literal for the '<em><b>Bts UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_LEASE__BTS_UUID = eINSTANCE.getDBLease_BtsUUID();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl <em>BTS Project DB Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSProjectDBCollection()
		 * @generated
		 */
		EClass BTS_PROJECT_DB_COLLECTION = eINSTANCE.getBTSProjectDBCollection();

		/**
		 * The meta object literal for the '<em><b>Collection Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME = eINSTANCE.getBTSProjectDBCollection_CollectionName();

		/**
		 * The meta object literal for the '<em><b>Indexed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT_DB_COLLECTION__INDEXED = eINSTANCE.getBTSProjectDBCollection_Indexed();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED = eINSTANCE.getBTSProjectDBCollection_Synchronized();

		/**
		 * The meta object literal for the '<em><b>Role Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS = eINSTANCE.getBTSProjectDBCollection_RoleDescriptions();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl <em>BTS Identifiable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSIdentifiableItem()
		 * @generated
		 */
		EClass BTS_IDENTIFIABLE_ITEM = eINSTANCE.getBTSIdentifiableItem();

		/**
		 * The meta object literal for the '<em><b>id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_IDENTIFIABLE_ITEM__ID = eINSTANCE.getBTSIdentifiableItem__id();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl <em>BTSDB Collection Role Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBCollectionRoleDesc()
		 * @generated
		 */
		EClass BTSDB_COLLECTION_ROLE_DESC = eINSTANCE.getBTSDBCollectionRoleDesc();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME = eINSTANCE.getBTSDBCollectionRoleDesc_RoleName();

		/**
		 * The meta object literal for the '<em><b>User Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_COLLECTION_ROLE_DESC__USER_NAMES = eINSTANCE.getBTSDBCollectionRoleDesc_UserNames();

		/**
		 * The meta object literal for the '<em><b>User Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_COLLECTION_ROLE_DESC__USER_ROLES = eINSTANCE.getBTSDBCollectionRoleDesc_UserRoles();

		/**
		 * The meta object literal for the '<em><b>Cached Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN = eINSTANCE.getBTSDBCollectionRoleDesc_CachedChildren();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextContentImpl <em>BTS Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTextContentImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextContent()
		 * @generated
		 */
		EClass BTS_TEXT_CONTENT = eINSTANCE.getBTSTextContent();

		/**
		 * The meta object literal for the '<em><b>Text Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TEXT_CONTENT__TEXT_ITEMS = eINSTANCE.getBTSTextContent_TextItems();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.BTSAmbivalenceItem <em>BTS Ambivalence Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.BTSAmbivalenceItem
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAmbivalenceItem()
		 * @generated
		 */
		EClass BTS_AMBIVALENCE_ITEM = eINSTANCE.getBTSAmbivalenceItem();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.GraphicSelectionCounterImpl <em>Graphic Selection Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.GraphicSelectionCounterImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getGraphicSelectionCounter()
		 * @generated
		 */
		EClass GRAPHIC_SELECTION_COUNTER = eINSTANCE.getGraphicSelectionCounter();

		/**
		 * The meta object literal for the '<em><b>Date Of Last Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_SELECTION_COUNTER__DATE_OF_LAST_SELECTION = eINSTANCE.getGraphicSelectionCounter_DateOfLastSelection();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_SELECTION_COUNTER__COUNTER = eINSTANCE.getGraphicSelectionCounter_Counter();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl <em>BTS Passport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEntry()
		 * @generated
		 */
		EClass BTS_PASSPORT_ENTRY = eINSTANCE.getBTSPassportEntry();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__PROVIDER = eINSTANCE.getBTSPassportEntry_Provider();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__COMMENT = eINSTANCE.getBTSPassportEntry_Comment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__TYPE = eINSTANCE.getBTSPassportEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__VALUE = eINSTANCE.getBTSPassportEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY__CHILDREN = eINSTANCE.getBTSPassportEntry_Children();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY__LABEL = eINSTANCE.getBTSPassportEntry_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__NAME = eINSTANCE.getBTSPassportEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__KEY = eINSTANCE.getBTSPassportEntry_Key();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.StringToStringListMapImpl <em>String To String List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.StringToStringListMapImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getStringToStringListMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_LIST_MAP = eINSTANCE.getStringToStringListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_LIST_MAP__KEY = eINSTANCE.getStringToStringListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_LIST_MAP__VALUE = eINSTANCE.getStringToStringListMap_Value();

		/**
		 * The meta object literal for the '<em>Property Change Support</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeSupport
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeSupport()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_SUPPORT = eINSTANCE.getPropertyChangeSupport();

		/**
		 * The meta object literal for the '<em>Property Change Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeListener
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeListener()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_LISTENER = eINSTANCE.getPropertyChangeListener();

		/**
		 * The meta object literal for the '<em>Property Change Event</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeEvent
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeEvent()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_EVENT = eINSTANCE.getPropertyChangeEvent();

	}

} //BtsmodelPackage
