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
	int ADMINISTRATIV_DATA_OBJECT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl <em>BTS Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObject()
	 * @generated
	 */
	int BTS_OBJECT = 1;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl <em>BTS Referencable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReferencableItem()
	 * @generated
	 */
	int BTS_REFERENCABLE_ITEM = 13;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl <em>BTS Observable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObservableObject()
	 * @generated
	 */
	int BTS_OBSERVABLE_OBJECT = 19;

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
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__ID = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Revisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__REVISIONS = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Administrativ Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 5;

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
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__BTSREVISION = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__INT_DATE_STRING = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT___GET_REVISION__INT = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Last Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT___GET_LAST_REVISION = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Administrativ Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__PROPERTY_CHANGE_SUPPORT = ADMINISTRATIV_DATA_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__ID = ADMINISTRATIV_DATA_OBJECT__ID;

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
	 * The feature id for the '<em><b>Revisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__REVISIONS = ADMINISTRATIV_DATA_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__REV = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__PROJECT = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__LOCKED = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__UPDATERS = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__READERS = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__DELETED = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__CONFLICTING_REVS = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__DB_COLLECTION_KEY = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__NAME = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__TYPE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__SORT_KEY = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__SUBTYPE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__CODE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__RELATIONS = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__TEMP_SORT_KEY = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__EXTERNAL_REFERENCES = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>BTS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_FEATURE_COUNT = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 16;

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
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT___ADD_REVISION__BTSREVISION = ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__BTSREVISION;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT___ADD_REVISION__INT_DATE_STRING = ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__INT_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT___GET_REVISION__INT = ADMINISTRATIV_DATA_OBJECT___GET_REVISION__INT;

	/**
	 * The operation id for the '<em>Get Last Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT___GET_LAST_REVISION = ADMINISTRATIV_DATA_OBJECT___GET_LAST_REVISION;

	/**
	 * The number of operations of the '<em>BTS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_OPERATION_COUNT = ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl <em>BTSDB Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBBaseObject()
	 * @generated
	 */
	int BTSDB_BASE_OBJECT = 9;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl <em>BTS User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSUserImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUser()
	 * @generated
	 */
	int BTS_USER = 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSCommentImpl <em>BTS Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSCommentImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSComment()
	 * @generated
	 */
	int BTS_COMMENT = 3;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl <em>BTS Inter Text Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSInterTextReference()
	 * @generated
	 */
	int BTS_INTER_TEXT_REFERENCE = 4;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationImpl <em>BTS Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslation()
	 * @generated
	 */
	int BTS_TRANSLATION = 5;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl <em>BTS Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDateImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDate()
	 * @generated
	 */
	int BTS_DATE = 6;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl <em>BTS Identifiable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSIdentifiableItem()
	 * @generated
	 */
	int BTS_IDENTIFIABLE_ITEM = 27;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__ID = BTS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__STATE = BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REVISION_STATE = BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__VISIBILITY = BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REV = BTS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__PROJECT = BTS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__LOCKED = BTS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__UPDATERS = BTS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__READERS = BTS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__DELETED = BTS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__CONFLICTING_REVS = BTS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__DB_COLLECTION_KEY = BTS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__NAME = BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__TYPE = BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SORT_KEY = BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SUBTYPE = BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__CODE = BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__RELATIONS = BTS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__TEMP_SORT_KEY = BTS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__EXTERNAL_REFERENCES = BTS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Group Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__GROUP_IDS = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sigle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SIGLE = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__DESCRIPTION = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Web Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__WEB_DESCRIPTION = BTS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__USER_NAME = BTS_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fore Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__FORE_NAME = BTS_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SURE_NAME = BTS_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__MAIL = BTS_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Web URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__WEB_URL = BTS_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__COMMENT = BTS_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__PASSWORD = BTS_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Logged In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__LOGGED_IN = BTS_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__STATUS = BTS_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Db Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__DB_ADMIN = BTS_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>BTS User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___ADD_REVISION__BTSREVISION = BTS_OBJECT___ADD_REVISION__BTSREVISION;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___ADD_REVISION__INT_DATE_STRING = BTS_OBJECT___ADD_REVISION__INT_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___GET_REVISION__INT = BTS_OBJECT___GET_REVISION__INT;

	/**
	 * The operation id for the '<em>Get Last Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___GET_LAST_REVISION = BTS_OBJECT___GET_LAST_REVISION;

	/**
	 * The number of operations of the '<em>BTS User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__ID = BTS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__STATE = BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REVISION_STATE = BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__VISIBILITY = BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REV = BTS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__PROJECT = BTS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__LOCKED = BTS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__UPDATERS = BTS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__READERS = BTS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__DELETED = BTS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__CONFLICTING_REVS = BTS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__DB_COLLECTION_KEY = BTS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__NAME = BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__TYPE = BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__SORT_KEY = BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__SUBTYPE = BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__CODE = BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__RELATIONS = BTS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__TEMP_SORT_KEY = BTS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__EXTERNAL_REFERENCES = BTS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__COMMENT = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__TAGS = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BTS Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___ADD_REVISION__BTSREVISION = BTS_OBJECT___ADD_REVISION__BTSREVISION;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___ADD_REVISION__INT_DATE_STRING = BTS_OBJECT___ADD_REVISION__INT_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___GET_REVISION__INT = BTS_OBJECT___GET_REVISION__INT;

	/**
	 * The operation id for the '<em>Get Last Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___GET_LAST_REVISION = BTS_OBJECT___GET_LAST_REVISION;

	/**
	 * The number of operations of the '<em>BTS Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl <em>BTS Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSRelationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRelation()
	 * @generated
	 */
	int BTS_RELATION = 7;

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
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__PARTS = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__CERTAINTY = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>BTS Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 6;

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
	int BTS_CONFIGURATION = 8;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl <em>BTS Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSRevisionImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRevision()
	 * @generated
	 */
	int BTS_REVISION = 10;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTimespanImpl <em>BTS Timespan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTimespanImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTimespan()
	 * @generated
	 */
	int BTS_TIMESPAN = 11;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl <em>BTS External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSExternalReference()
	 * @generated
	 */
	int BTS_EXTERNAL_REFERENCE = 12;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl <em>BTS Translations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslations()
	 * @generated
	 */
	int BTS_TRANSLATIONS = 14;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigImpl <em>BTS Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSConfigImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfig()
	 * @generated
	 */
	int BTS_CONFIG = 18;

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
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__CHILDREN = BTS_CONFIG__CHILDREN;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT = BTS_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__ID = BTS_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__STATE = BTS_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REVISION_STATE = BTS_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__VISIBILITY = BTS_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REVISIONS = BTS_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REV = BTS_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROJECT = BTS_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__LOCKED = BTS_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__UPDATERS = BTS_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__READERS = BTS_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__DELETED = BTS_CONFIG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__CONFLICTING_REVS = BTS_CONFIG_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__DB_COLLECTION_KEY = BTS_CONFIG_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__NAME = BTS_CONFIG_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__TYPE = BTS_CONFIG_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__SORT_KEY = BTS_CONFIG_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__SUBTYPE = BTS_CONFIG_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__CODE = BTS_CONFIG_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__RELATIONS = BTS_CONFIG_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__TEMP_SORT_KEY = BTS_CONFIG_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__EXTERNAL_REFERENCES = BTS_CONFIG_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROVIDER = BTS_CONFIG_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>BTS Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION_FEATURE_COUNT = BTS_CONFIG_FEATURE_COUNT + 23;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CONFIG_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___ADD_REVISION__BTSREVISION = BTS_CONFIG_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___ADD_REVISION__INT_DATE_STRING = BTS_CONFIG_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___GET_REVISION__INT = BTS_CONFIG_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Last Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___GET_LAST_REVISION = BTS_CONFIG_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>BTS Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION_OPERATION_COUNT = BTS_CONFIG_OPERATION_COUNT + 6;

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
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__DB_COLLECTION_KEY = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>BTSDB Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>BTSDB Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>To Revision String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION___TO_REVISION_STRING = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__REFERENCE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__PROVIDER = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__TYPE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__QUALITY = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>BTS External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__ID = BTS_OBJECT__ID;

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
	 * The feature id for the '<em><b>Revisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__REV = BTS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PROJECT = BTS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__LOCKED = BTS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__UPDATERS = BTS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__READERS = BTS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__DELETED = BTS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__CONFLICTING_REVS = BTS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__DB_COLLECTION_KEY = BTS_OBJECT__DB_COLLECTION_KEY;

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
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__SORT_KEY = BTS_OBJECT__SORT_KEY;

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
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__RELATIONS = BTS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__TEMP_SORT_KEY = BTS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__EXTERNAL_REFERENCES = BTS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__COMMENT = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PARENT = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PARENT_ID = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTS Referencable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 3;

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
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM___ADD_REVISION__BTSREVISION = BTS_OBJECT___ADD_REVISION__BTSREVISION;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM___ADD_REVISION__INT_DATE_STRING = BTS_OBJECT___ADD_REVISION__INT_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM___GET_REVISION__INT = BTS_OBJECT___GET_REVISION__INT;

	/**
	 * The operation id for the '<em>Get Last Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM___GET_LAST_REVISION = BTS_OBJECT___GET_LAST_REVISION;

	/**
	 * The number of operations of the '<em>BTS Referencable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>Get Translation Strict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS___GET_TRANSLATION_STRICT__STRING = 4;

	/**
	 * The number of operations of the '<em>BTS Translations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl <em>BTS Config Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfigItem()
	 * @generated
	 */
	int BTS_CONFIG_ITEM = 15;

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
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__ABBREVIATION = BTS_CONFIG_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>BTS Config Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM_FEATURE_COUNT = BTS_CONFIG_FEATURE_COUNT + 14;

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
	int BTS_PASSPORT_EDITOR_CONFIG = 16;

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
	int BTS_USER_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__ID = BTS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__STATE = BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REVISION_STATE = BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__VISIBILITY = BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REV = BTS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__PROJECT = BTS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__LOCKED = BTS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__UPDATERS = BTS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__READERS = BTS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__DELETED = BTS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__CONFLICTING_REVS = BTS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__DB_COLLECTION_KEY = BTS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__NAME = BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__TYPE = BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__SORT_KEY = BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__SUBTYPE = BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__CODE = BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__RELATIONS = BTS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__TEMP_SORT_KEY = BTS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__EXTERNAL_REFERENCES = BTS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__CATEGORY = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__COMMENT = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BTS User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___ADD_REVISION__BTSREVISION = BTS_OBJECT___ADD_REVISION__BTSREVISION;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___ADD_REVISION__INT_DATE_STRING = BTS_OBJECT___ADD_REVISION__INT_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___GET_REVISION__INT = BTS_OBJECT___GET_REVISION__INT;

	/**
	 * The operation id for the '<em>Get Last Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___GET_LAST_REVISION = BTS_OBJECT___GET_LAST_REVISION;

	/**
	 * The number of operations of the '<em>BTS User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl <em>BTS Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSProjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSProject()
	 * @generated
	 */
	int BTS_PROJECT = 20;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__ID = BTS_OBJECT__ID;

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
	 * The feature id for the '<em><b>Revisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__REV = BTS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PROJECT = BTS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__LOCKED = BTS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__UPDATERS = BTS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__READERS = BTS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DELETED = BTS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__CONFLICTING_REVS = BTS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DB_COLLECTION_KEY = BTS_OBJECT__DB_COLLECTION_KEY;

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
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__SORT_KEY = BTS_OBJECT__SORT_KEY;

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
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__RELATIONS = BTS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__TEMP_SORT_KEY = BTS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__EXTERNAL_REFERENCES = BTS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PREFIX = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DESCRIPTION = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Db Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DB_CONNECTION = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Db Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DB_COLLECTIONS = BTS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 4;

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
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___ADD_REVISION__BTSREVISION = BTS_OBJECT___ADD_REVISION__BTSREVISION;

	/**
	 * The operation id for the '<em>Add Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___ADD_REVISION__INT_DATE_STRING = BTS_OBJECT___ADD_REVISION__INT_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___GET_REVISION__INT = BTS_OBJECT___GET_REVISION__INT;

	/**
	 * The operation id for the '<em>Get Last Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___GET_LAST_REVISION = BTS_OBJECT___GET_LAST_REVISION;

	/**
	 * The number of operations of the '<em>BTS Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl <em>BTSDB Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBConnection()
	 * @generated
	 */
	int BTSDB_CONNECTION = 21;

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
	int BTS_WORKFLOW_RULE = 22;

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
	int BTS_WORKFLOW_RULE_ITEM = 24;

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
	int BTS_OPERATOR = 23;

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
	int DB_LEASE = 25;

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
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_LEASE__DB_COLLECTION_KEY = BTSDB_BASE_OBJECT__DB_COLLECTION_KEY;

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
	int BTS_PROJECT_DB_COLLECTION = 26;

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
	 * The feature id for the '<em><b>Property Strings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION__PROPERTY_STRINGS = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION__PROPERTIES = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION__DIRTY = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>BTS Project DB Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION___SET_PROPERTY__STRING_STRING = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION___GET_PROPERTY__STRING = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Project DB Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_DB_COLLECTION_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl <em>BTSDB Collection Role Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBCollectionRoleDesc()
	 * @generated
	 */
	int BTSDB_COLLECTION_ROLE_DESC = 28;

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
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.UserActionCounterImpl <em>User Action Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.UserActionCounterImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getUserActionCounter()
	 * @generated
	 */
	int USER_ACTION_COUNTER = 29;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__LOCKED = BTSDB_BASE_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__UPDATERS = BTSDB_BASE_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__READERS = BTSDB_BASE_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__DELETED = BTSDB_BASE_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__CONFLICTING_REVS = BTSDB_BASE_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__DB_COLLECTION_KEY = BTSDB_BASE_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Date Of Last Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__DATE_OF_LAST_SELECTION = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER__COUNTER = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Action Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User Action Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_COUNTER_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.StringToStringListMapImpl <em>String To String List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.StringToStringListMapImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getStringToStringListMap()
	 * @generated
	 */
	int STRING_TO_STRING_LIST_MAP = 30;

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
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.StringToStringMapImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 31;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSIDReservationObjectImpl <em>BTSID Reservation Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSIDReservationObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSIDReservationObject()
	 * @generated
	 */
	int BTSID_RESERVATION_OBJECT = 32;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__LOCKED = BTSDB_BASE_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__UPDATERS = BTSDB_BASE_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__READERS = BTSDB_BASE_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__DELETED = BTSDB_BASE_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__CONFLICTING_REVS = BTSDB_BASE_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__DB_COLLECTION_KEY = BTSDB_BASE_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Bts UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT__BTS_UUID = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTSID Reservation Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTSID Reservation Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSID_RESERVATION_OBJECT_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSNamedTypedObjectImpl <em>BTS Named Typed Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSNamedTypedObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSNamedTypedObject()
	 * @generated
	 */
	int BTS_NAMED_TYPED_OBJECT = 33;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_NAMED_TYPED_OBJECT__ID = BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_NAMED_TYPED_OBJECT__NAME = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_NAMED_TYPED_OBJECT__TYPE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_NAMED_TYPED_OBJECT__SORT_KEY = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_NAMED_TYPED_OBJECT__SUBTYPE = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS Named Typed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_NAMED_TYPED_OBJECT_FEATURE_COUNT = BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>BTS Named Typed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_NAMED_TYPED_OBJECT_OPERATION_COUNT = BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Property Change Support</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeSupport
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeSupport()
	 * @generated
	 */
	int PROPERTY_CHANGE_SUPPORT = 34;

	/**
	 * The meta object id for the '<em>Property Change Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeListener
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeListener()
	 * @generated
	 */
	int PROPERTY_CHANGE_LISTENER = 35;

	/**
	 * The meta object id for the '<em>Property Change Event</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeEvent
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeEvent()
	 * @generated
	 */
	int PROPERTY_CHANGE_EVENT = 36;


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
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Revisions</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisions()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EAttribute getAdministrativDataObject_Revisions();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#addRevision(org.bbaw.bts.btsmodel.BTSRevision) <em>Add Revision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Revision</em>' operation.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#addRevision(org.bbaw.bts.btsmodel.BTSRevision)
	 * @generated
	 */
	EOperation getAdministrativDataObject__AddRevision__BTSRevision();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#addRevision(int, java.util.Date, java.lang.String) <em>Add Revision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Revision</em>' operation.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#addRevision(int, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getAdministrativDataObject__AddRevision__int_Date_String();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevision(int) <em>Get Revision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Revision</em>' operation.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getRevision(int)
	 * @generated
	 */
	EOperation getAdministrativDataObject__GetRevision__int();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getLastRevision() <em>Get Last Revision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Revision</em>' operation.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getLastRevision()
	 * @generated
	 */
	EOperation getAdministrativDataObject__GetLastRevision();

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
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSObject#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getRelations()
	 * @see #getBTSObject()
	 * @generated
	 */
	EReference getBTSObject_Relations();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getTempSortKey <em>Temp Sort Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Sort Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getTempSortKey()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_TempSortKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSObject#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External References</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getExternalReferences()
	 * @see #getBTSObject()
	 * @generated
	 */
	EReference getBTSObject_ExternalReferences();

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
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSRelation#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getParts()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EReference getBTSRelation_Parts();

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
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getDBCollectionKey <em>DB Collection Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DB Collection Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#getDBCollectionKey()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject_DBCollectionKey();

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
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSRevision#toRevisionString() <em>To Revision String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Revision String</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSRevision#toRevisionString()
	 * @generated
	 */
	EOperation getBTSRevision__ToRevisionString();

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
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference#getQuality()
	 * @see #getBTSExternalReference()
	 * @generated
	 */
	EAttribute getBTSExternalReference_Quality();

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
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSTranslations#getTranslationStrict(java.lang.String) <em>Get Translation Strict</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Translation Strict</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations#getTranslationStrict(java.lang.String)
	 * @generated
	 */
	EOperation getBTSTranslations__GetTranslationStrict__String();

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
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getAbbreviation()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Abbreviation();

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
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getPropertyStrings <em>Property Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Strings</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#getPropertyStrings()
	 * @see #getBTSProjectDBCollection()
	 * @generated
	 */
	EAttribute getBTSProjectDBCollection_PropertyStrings();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#getProperties()
	 * @see #getBTSProjectDBCollection()
	 * @generated
	 */
	EAttribute getBTSProjectDBCollection_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isDirty <em>Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirty</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#isDirty()
	 * @see #getBTSProjectDBCollection()
	 * @generated
	 */
	EAttribute getBTSProjectDBCollection_Dirty();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#setProperty(java.lang.String, java.lang.String) <em>Set Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Property</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#setProperty(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBTSProjectDBCollection__SetProperty__String_String();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection#getProperty(java.lang.String)
	 * @generated
	 */
	EOperation getBTSProjectDBCollection__GetProperty__String();

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
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.UserActionCounter <em>User Action Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Action Counter</em>'.
	 * @see org.bbaw.bts.btsmodel.UserActionCounter
	 * @generated
	 */
	EClass getUserActionCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.UserActionCounter#getDateOfLastSelection <em>Date Of Last Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Last Selection</em>'.
	 * @see org.bbaw.bts.btsmodel.UserActionCounter#getDateOfLastSelection()
	 * @see #getUserActionCounter()
	 * @generated
	 */
	EAttribute getUserActionCounter_DateOfLastSelection();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.UserActionCounter#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see org.bbaw.bts.btsmodel.UserActionCounter#getCounter()
	 * @see #getUserActionCounter()
	 * @generated
	 */
	EAttribute getUserActionCounter_Counter();

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
	 * Returns the meta object for class '{@link java.util.Map <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map#getKey()
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map#getValue()
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSIDReservationObject <em>BTSID Reservation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSID Reservation Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSIDReservationObject
	 * @generated
	 */
	EClass getBTSIDReservationObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSIDReservationObject#getBtsUUID <em>Bts UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bts UUID</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSIDReservationObject#getBtsUUID()
	 * @see #getBTSIDReservationObject()
	 * @generated
	 */
	EAttribute getBTSIDReservationObject_BtsUUID();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSNamedTypedObject <em>BTS Named Typed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Named Typed Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSNamedTypedObject
	 * @generated
	 */
	EClass getBTSNamedTypedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSNamedTypedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSNamedTypedObject#getName()
	 * @see #getBTSNamedTypedObject()
	 * @generated
	 */
	EAttribute getBTSNamedTypedObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSNamedTypedObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSNamedTypedObject#getType()
	 * @see #getBTSNamedTypedObject()
	 * @generated
	 */
	EAttribute getBTSNamedTypedObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSNamedTypedObject#getSortKey <em>Sort Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSNamedTypedObject#getSortKey()
	 * @see #getBTSNamedTypedObject()
	 * @generated
	 */
	EAttribute getBTSNamedTypedObject_SortKey();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSNamedTypedObject#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSNamedTypedObject#getSubtype()
	 * @see #getBTSNamedTypedObject()
	 * @generated
	 */
	EAttribute getBTSNamedTypedObject_Subtype();

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
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl <em>Administrativ Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getAdministrativDataObject()
		 * @generated
		 */
		EClass ADMINISTRATIV_DATA_OBJECT = eINSTANCE.getAdministrativDataObject();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIV_DATA_OBJECT__REVISIONS = eINSTANCE.getAdministrativDataObject_Revisions();

		/**
		 * The meta object literal for the '<em><b>Add Revision</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__BTSREVISION = eINSTANCE.getAdministrativDataObject__AddRevision__BTSRevision();

		/**
		 * The meta object literal for the '<em><b>Add Revision</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__INT_DATE_STRING = eINSTANCE.getAdministrativDataObject__AddRevision__int_Date_String();

		/**
		 * The meta object literal for the '<em><b>Get Revision</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATIV_DATA_OBJECT___GET_REVISION__INT = eINSTANCE.getAdministrativDataObject__GetRevision__int();

		/**
		 * The meta object literal for the '<em><b>Get Last Revision</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATIV_DATA_OBJECT___GET_LAST_REVISION = eINSTANCE.getAdministrativDataObject__GetLastRevision();

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
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__CODE = eINSTANCE.getBTSObject_Code();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_OBJECT__RELATIONS = eINSTANCE.getBTSObject_Relations();

		/**
		 * The meta object literal for the '<em><b>Temp Sort Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__TEMP_SORT_KEY = eINSTANCE.getBTSObject_TempSortKey();

		/**
		 * The meta object literal for the '<em><b>External References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_OBJECT__EXTERNAL_REFERENCES = eINSTANCE.getBTSObject_ExternalReferences();

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
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_RELATION__PARTS = eINSTANCE.getBTSRelation_Parts();

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
		 * The meta object literal for the '<em><b>DB Collection Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__DB_COLLECTION_KEY = eINSTANCE.getBTSDBBaseObject_DBCollectionKey();

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
		 * The meta object literal for the '<em><b>To Revision String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_REVISION___TO_REVISION_STRING = eINSTANCE.getBTSRevision__ToRevisionString();

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
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_EXTERNAL_REFERENCE__QUALITY = eINSTANCE.getBTSExternalReference_Quality();

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
		 * The meta object literal for the '<em><b>Get Translation Strict</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_TRANSLATIONS___GET_TRANSLATION_STRICT__STRING = eINSTANCE.getBTSTranslations__GetTranslationStrict__String();

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
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__ABBREVIATION = eINSTANCE.getBTSConfigItem_Abbreviation();

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
		 * The meta object literal for the '<em><b>Property Strings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT_DB_COLLECTION__PROPERTY_STRINGS = eINSTANCE.getBTSProjectDBCollection_PropertyStrings();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT_DB_COLLECTION__PROPERTIES = eINSTANCE.getBTSProjectDBCollection_Properties();

		/**
		 * The meta object literal for the '<em><b>Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT_DB_COLLECTION__DIRTY = eINSTANCE.getBTSProjectDBCollection_Dirty();

		/**
		 * The meta object literal for the '<em><b>Set Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_PROJECT_DB_COLLECTION___SET_PROPERTY__STRING_STRING = eINSTANCE.getBTSProjectDBCollection__SetProperty__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_PROJECT_DB_COLLECTION___GET_PROPERTY__STRING = eINSTANCE.getBTSProjectDBCollection__GetProperty__String();

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
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.UserActionCounterImpl <em>User Action Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.UserActionCounterImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getUserActionCounter()
		 * @generated
		 */
		EClass USER_ACTION_COUNTER = eINSTANCE.getUserActionCounter();

		/**
		 * The meta object literal for the '<em><b>Date Of Last Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ACTION_COUNTER__DATE_OF_LAST_SELECTION = eINSTANCE.getUserActionCounter_DateOfLastSelection();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ACTION_COUNTER__COUNTER = eINSTANCE.getUserActionCounter_Counter();

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
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.StringToStringMapImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSIDReservationObjectImpl <em>BTSID Reservation Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSIDReservationObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSIDReservationObject()
		 * @generated
		 */
		EClass BTSID_RESERVATION_OBJECT = eINSTANCE.getBTSIDReservationObject();

		/**
		 * The meta object literal for the '<em><b>Bts UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSID_RESERVATION_OBJECT__BTS_UUID = eINSTANCE.getBTSIDReservationObject_BtsUUID();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSNamedTypedObjectImpl <em>BTS Named Typed Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSNamedTypedObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSNamedTypedObject()
		 * @generated
		 */
		EClass BTS_NAMED_TYPED_OBJECT = eINSTANCE.getBTSNamedTypedObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_NAMED_TYPED_OBJECT__NAME = eINSTANCE.getBTSNamedTypedObject_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_NAMED_TYPED_OBJECT__TYPE = eINSTANCE.getBTSNamedTypedObject_Type();

		/**
		 * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_NAMED_TYPED_OBJECT__SORT_KEY = eINSTANCE.getBTSNamedTypedObject_SortKey();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_NAMED_TYPED_OBJECT__SUBTYPE = eINSTANCE.getBTSNamedTypedObject_Subtype();

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
