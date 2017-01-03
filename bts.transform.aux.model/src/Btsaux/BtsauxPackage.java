/**
 */
package Btsaux;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Btsaux.BtsauxFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface BtsauxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Btsaux";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/C:/bts/dtd/btsaux.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Btsaux";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsauxPackage eINSTANCE = Btsaux.impl.BtsauxPackageImpl.init();

	/**
	 * The meta object id for the '{@link Btsaux.impl.AugroupsTypeImpl <em>Augroups Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.AugroupsTypeImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getAugroupsType()
	 * @generated
	 */
	int AUGROUPS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGROUPS_TYPE__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGROUPS_TYPE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Gpct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGROUPS_TYPE__GPCT = 2;

	/**
	 * The number of structural features of the '<em>Augroups Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGROUPS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Augroups Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGROUPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Btsaux.impl.AuthorizationTypeImpl <em>Authorization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.AuthorizationTypeImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getAuthorizationType()
	 * @generated
	 */
	int AUTHORIZATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Auct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPE__AUCT = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPE__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPE__COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Authorization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Authorization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Btsaux.impl.AuthorsTypeImpl <em>Authors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.AuthorsTypeImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getAuthorsType()
	 * @generated
	 */
	int AUTHORS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Auct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__AUCT = 0;

	/**
	 * The feature id for the '<em><b>Augp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__AUGP = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__LINE = 3;

	/**
	 * The feature id for the '<em><b>Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__PAGE = 4;

	/**
	 * The feature id for the '<em><b>Sigle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__SIGLE = 5;

	/**
	 * The feature id for the '<em><b>Weblink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__WEBLINK = 6;

	/**
	 * The feature id for the '<em><b>Loginname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__LOGINNAME = 7;

	/**
	 * The feature id for the '<em><b>Pword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__PWORD = 8;

	/**
	 * The number of structural features of the '<em>Authors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Authors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Btsaux.impl.BwlenglTypeImpl <em>Bwlengl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.BwlenglTypeImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getBwlenglType()
	 * @generated
	 */
	int BWLENGL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Ecomment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLENGL_TYPE__ECOMMENT = 0;

	/**
	 * The feature id for the '<em><b>Elabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLENGL_TYPE__ELABEL = 1;

	/**
	 * The feature id for the '<em><b>Wcn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLENGL_TYPE__WCN = 2;

	/**
	 * The number of structural features of the '<em>Bwlengl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLENGL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bwlengl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLENGL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Btsaux.impl.BwllinkTypeImpl <em>Bwllink Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.BwllinkTypeImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getBwllinkType()
	 * @generated
	 */
	int BWLLINK_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Lclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLINK_TYPE__LCLASS = 0;

	/**
	 * The feature id for the '<em><b>Lcomment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLINK_TYPE__LCOMMENT = 1;

	/**
	 * The feature id for the '<em><b>Lkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLINK_TYPE__LKEY = 2;

	/**
	 * The feature id for the '<em><b>Ltype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLINK_TYPE__LTYPE = 3;

	/**
	 * The feature id for the '<em><b>Wcn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLINK_TYPE__WCN = 4;

	/**
	 * The number of structural features of the '<em>Bwllink Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLINK_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bwllink Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLINK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Btsaux.impl.BwllistTypeImpl <em>Bwllist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.BwllistTypeImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getBwllistType()
	 * @generated
	 */
	int BWLLIST_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Arb Vermerk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__ARB_VERMERK = 0;

	/**
	 * The feature id for the '<em><b>Hsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__HSORT = 1;

	/**
	 * The feature id for the '<em><b>Kommentar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__KOMMENTAR = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Lemma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__LEMMA = 4;

	/**
	 * The feature id for the '<em><b>Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__LOCK = 5;

	/**
	 * The feature id for the '<em><b>Lsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__LSORT = 6;

	/**
	 * The feature id for the '<em><b>Redaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__REDACTION = 7;

	/**
	 * The feature id for the '<em><b>Rstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__RSTATUS = 8;

	/**
	 * The feature id for the '<em><b>Sc00</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC00 = 9;

	/**
	 * The feature id for the '<em><b>Sc01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC01 = 10;

	/**
	 * The feature id for the '<em><b>Sc02</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC02 = 11;

	/**
	 * The feature id for the '<em><b>Sc03</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC03 = 12;

	/**
	 * The feature id for the '<em><b>Sc04</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC04 = 13;

	/**
	 * The feature id for the '<em><b>Sc05</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC05 = 14;

	/**
	 * The feature id for the '<em><b>Sc06</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC06 = 15;

	/**
	 * The feature id for the '<em><b>Sc07</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC07 = 16;

	/**
	 * The feature id for the '<em><b>Sc08</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC08 = 17;

	/**
	 * The feature id for the '<em><b>Sc09</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC09 = 18;

	/**
	 * The feature id for the '<em><b>Sc10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SC10 = 19;

	/**
	 * The feature id for the '<em><b>Shortref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SHORTREF = 20;

	/**
	 * The feature id for the '<em><b>Simplify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SIMPLIFY = 21;

	/**
	 * The feature id for the '<em><b>Wclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__WCLASS = 22;

	/**
	 * The feature id for the '<em><b>Wclassnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__WCLASSNUM = 23;

	/**
	 * The feature id for the '<em><b>Wcn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__WCN = 24;

	/**
	 * The feature id for the '<em><b>Woart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__WOART = 25;

	/**
	 * The feature id for the '<em><b>Glyphs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__GLYPHS = 26;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__PREDECESSOR = 27;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE__SUCCESSOR = 28;

	/**
	 * The number of structural features of the '<em>Bwllist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE_FEATURE_COUNT = 29;

	/**
	 * The number of operations of the '<em>Bwllist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWLLIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Btsaux.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.DocumentRootImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Augroups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUGROUPS = 3;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHORIZATION = 4;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHORS = 5;

	/**
	 * The feature id for the '<em><b>Bwlengl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BWLENGL = 6;

	/**
	 * The feature id for the '<em><b>Bwllink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BWLLINK = 7;

	/**
	 * The feature id for the '<em><b>Bwllist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BWLLIST = 8;

	/**
	 * The feature id for the '<em><b>Stupid XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STUPID_XML = 9;

	/**
	 * The feature id for the '<em><b>Thsdata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THSDATA = 10;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Btsaux.impl.StupidXMLTypeImpl <em>Stupid XML Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.StupidXMLTypeImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getStupidXMLType()
	 * @generated
	 */
	int STUPID_XML_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUPID_XML_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Thsdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUPID_XML_TYPE__THSDATA = 1;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUPID_XML_TYPE__AUTHORS = 2;

	/**
	 * The feature id for the '<em><b>Bwlengl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUPID_XML_TYPE__BWLENGL = 3;

	/**
	 * The feature id for the '<em><b>Bwllink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUPID_XML_TYPE__BWLLINK = 4;

	/**
	 * The feature id for the '<em><b>Bwllist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUPID_XML_TYPE__BWLLIST = 5;

	/**
	 * The number of structural features of the '<em>Stupid XML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUPID_XML_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Stupid XML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUPID_XML_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Btsaux.impl.ThsdataTypeImpl <em>Thsdata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Btsaux.impl.ThsdataTypeImpl
	 * @see Btsaux.impl.BtsauxPackageImpl#getThsdataType()
	 * @generated
	 */
	int THSDATA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Eterm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__ETERM = 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__TERM = 2;

	/**
	 * The feature id for the '<em><b>Termsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__TERMSORT = 3;

	/**
	 * The feature id for the '<em><b>Thsct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__THSCT = 4;

	/**
	 * The feature id for the '<em><b>Thslock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__THSLOCK = 5;

	/**
	 * The feature id for the '<em><b>Thsowner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__THSOWNER = 6;

	/**
	 * The feature id for the '<em><b>Thssort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__THSSORT = 7;

	/**
	 * The feature id for the '<em><b>Thsstrg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__THSSTRG = 8;

	/**
	 * The feature id for the '<em><b>Thstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__THSTYPE = 9;

	/**
	 * The feature id for the '<em><b>Yearfrom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__YEARFROM = 10;

	/**
	 * The feature id for the '<em><b>Yearto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__YEARTO = 11;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE__SUBTYPE = 12;

	/**
	 * The number of structural features of the '<em>Thsdata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Thsdata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THSDATA_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Btsaux.AugroupsType <em>Augroups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Augroups Type</em>'.
	 * @see Btsaux.AugroupsType
	 * @generated
	 */
	EClass getAugroupsType();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AugroupsType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see Btsaux.AugroupsType#getCategory()
	 * @see #getAugroupsType()
	 * @generated
	 */
	EAttribute getAugroupsType_Category();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AugroupsType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Btsaux.AugroupsType#getComment()
	 * @see #getAugroupsType()
	 * @generated
	 */
	EAttribute getAugroupsType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AugroupsType#getGpct <em>Gpct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpct</em>'.
	 * @see Btsaux.AugroupsType#getGpct()
	 * @see #getAugroupsType()
	 * @generated
	 */
	EAttribute getAugroupsType_Gpct();

	/**
	 * Returns the meta object for class '{@link Btsaux.AuthorizationType <em>Authorization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Type</em>'.
	 * @see Btsaux.AuthorizationType
	 * @generated
	 */
	EClass getAuthorizationType();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorizationType#getAuct <em>Auct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auct</em>'.
	 * @see Btsaux.AuthorizationType#getAuct()
	 * @see #getAuthorizationType()
	 * @generated
	 */
	EAttribute getAuthorizationType_Auct();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorizationType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see Btsaux.AuthorizationType#getCategory()
	 * @see #getAuthorizationType()
	 * @generated
	 */
	EAttribute getAuthorizationType_Category();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorizationType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Btsaux.AuthorizationType#getComment()
	 * @see #getAuthorizationType()
	 * @generated
	 */
	EAttribute getAuthorizationType_Comment();

	/**
	 * Returns the meta object for class '{@link Btsaux.AuthorsType <em>Authors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authors Type</em>'.
	 * @see Btsaux.AuthorsType
	 * @generated
	 */
	EClass getAuthorsType();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getAuct <em>Auct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auct</em>'.
	 * @see Btsaux.AuthorsType#getAuct()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Auct();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getAugp <em>Augp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Augp</em>'.
	 * @see Btsaux.AuthorsType#getAugp()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Augp();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Btsaux.AuthorsType#getComment()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see Btsaux.AuthorsType#getLine()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Line();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page</em>'.
	 * @see Btsaux.AuthorsType#getPage()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Page();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getSigle <em>Sigle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigle</em>'.
	 * @see Btsaux.AuthorsType#getSigle()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Sigle();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getWeblink <em>Weblink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weblink</em>'.
	 * @see Btsaux.AuthorsType#getWeblink()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Weblink();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getLoginname <em>Loginname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loginname</em>'.
	 * @see Btsaux.AuthorsType#getLoginname()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Loginname();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.AuthorsType#getPword <em>Pword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pword</em>'.
	 * @see Btsaux.AuthorsType#getPword()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_Pword();

	/**
	 * Returns the meta object for class '{@link Btsaux.BwlenglType <em>Bwlengl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bwlengl Type</em>'.
	 * @see Btsaux.BwlenglType
	 * @generated
	 */
	EClass getBwlenglType();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwlenglType#getEcomment <em>Ecomment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecomment</em>'.
	 * @see Btsaux.BwlenglType#getEcomment()
	 * @see #getBwlenglType()
	 * @generated
	 */
	EAttribute getBwlenglType_Ecomment();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwlenglType#getElabel <em>Elabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elabel</em>'.
	 * @see Btsaux.BwlenglType#getElabel()
	 * @see #getBwlenglType()
	 * @generated
	 */
	EAttribute getBwlenglType_Elabel();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwlenglType#getWcn <em>Wcn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcn</em>'.
	 * @see Btsaux.BwlenglType#getWcn()
	 * @see #getBwlenglType()
	 * @generated
	 */
	EAttribute getBwlenglType_Wcn();

	/**
	 * Returns the meta object for class '{@link Btsaux.BwllinkType <em>Bwllink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bwllink Type</em>'.
	 * @see Btsaux.BwllinkType
	 * @generated
	 */
	EClass getBwllinkType();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllinkType#getLclass <em>Lclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lclass</em>'.
	 * @see Btsaux.BwllinkType#getLclass()
	 * @see #getBwllinkType()
	 * @generated
	 */
	EAttribute getBwllinkType_Lclass();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllinkType#getLcomment <em>Lcomment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lcomment</em>'.
	 * @see Btsaux.BwllinkType#getLcomment()
	 * @see #getBwllinkType()
	 * @generated
	 */
	EAttribute getBwllinkType_Lcomment();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllinkType#getLkey <em>Lkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lkey</em>'.
	 * @see Btsaux.BwllinkType#getLkey()
	 * @see #getBwllinkType()
	 * @generated
	 */
	EAttribute getBwllinkType_Lkey();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllinkType#getLtype <em>Ltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltype</em>'.
	 * @see Btsaux.BwllinkType#getLtype()
	 * @see #getBwllinkType()
	 * @generated
	 */
	EAttribute getBwllinkType_Ltype();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllinkType#getWcn <em>Wcn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcn</em>'.
	 * @see Btsaux.BwllinkType#getWcn()
	 * @see #getBwllinkType()
	 * @generated
	 */
	EAttribute getBwllinkType_Wcn();

	/**
	 * Returns the meta object for class '{@link Btsaux.BwllistType <em>Bwllist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bwllist Type</em>'.
	 * @see Btsaux.BwllistType
	 * @generated
	 */
	EClass getBwllistType();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getArbVermerk <em>Arb Vermerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arb Vermerk</em>'.
	 * @see Btsaux.BwllistType#getArbVermerk()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_ArbVermerk();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getHsort <em>Hsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hsort</em>'.
	 * @see Btsaux.BwllistType#getHsort()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Hsort();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getKommentar <em>Kommentar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kommentar</em>'.
	 * @see Btsaux.BwllistType#getKommentar()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Kommentar();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see Btsaux.BwllistType#getLabel()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Label();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getLemma <em>Lemma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lemma</em>'.
	 * @see Btsaux.BwllistType#getLemma()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Lemma();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getLock <em>Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock</em>'.
	 * @see Btsaux.BwllistType#getLock()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Lock();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getLsort <em>Lsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lsort</em>'.
	 * @see Btsaux.BwllistType#getLsort()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Lsort();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getRedaction <em>Redaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redaction</em>'.
	 * @see Btsaux.BwllistType#getRedaction()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Redaction();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getRstatus <em>Rstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rstatus</em>'.
	 * @see Btsaux.BwllistType#getRstatus()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Rstatus();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc00 <em>Sc00</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc00</em>'.
	 * @see Btsaux.BwllistType#getSc00()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc00();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc01 <em>Sc01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc01</em>'.
	 * @see Btsaux.BwllistType#getSc01()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc01();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc02 <em>Sc02</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc02</em>'.
	 * @see Btsaux.BwllistType#getSc02()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc02();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc03 <em>Sc03</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc03</em>'.
	 * @see Btsaux.BwllistType#getSc03()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc03();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc04 <em>Sc04</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc04</em>'.
	 * @see Btsaux.BwllistType#getSc04()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc04();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc05 <em>Sc05</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc05</em>'.
	 * @see Btsaux.BwllistType#getSc05()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc05();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc06 <em>Sc06</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc06</em>'.
	 * @see Btsaux.BwllistType#getSc06()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc06();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc07 <em>Sc07</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc07</em>'.
	 * @see Btsaux.BwllistType#getSc07()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc07();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc08 <em>Sc08</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc08</em>'.
	 * @see Btsaux.BwllistType#getSc08()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc08();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc09 <em>Sc09</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc09</em>'.
	 * @see Btsaux.BwllistType#getSc09()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc09();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSc10 <em>Sc10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sc10</em>'.
	 * @see Btsaux.BwllistType#getSc10()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Sc10();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getShortref <em>Shortref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shortref</em>'.
	 * @see Btsaux.BwllistType#getShortref()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Shortref();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSimplify <em>Simplify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simplify</em>'.
	 * @see Btsaux.BwllistType#getSimplify()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Simplify();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getWclass <em>Wclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wclass</em>'.
	 * @see Btsaux.BwllistType#getWclass()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Wclass();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getWclassnum <em>Wclassnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wclassnum</em>'.
	 * @see Btsaux.BwllistType#getWclassnum()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Wclassnum();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getWcn <em>Wcn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcn</em>'.
	 * @see Btsaux.BwllistType#getWcn()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Wcn();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getWoart <em>Woart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Woart</em>'.
	 * @see Btsaux.BwllistType#getWoart()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Woart();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getGlyphs <em>Glyphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glyphs</em>'.
	 * @see Btsaux.BwllistType#getGlyphs()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Glyphs();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predecessor</em>'.
	 * @see Btsaux.BwllistType#getPredecessor()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Predecessor();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.BwllistType#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successor</em>'.
	 * @see Btsaux.BwllistType#getSuccessor()
	 * @see #getBwllistType()
	 * @generated
	 */
	EAttribute getBwllistType_Successor();

	/**
	 * Returns the meta object for class '{@link Btsaux.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Btsaux.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link Btsaux.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Btsaux.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link Btsaux.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Btsaux.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link Btsaux.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Btsaux.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link Btsaux.DocumentRoot#getAugroups <em>Augroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Augroups</em>'.
	 * @see Btsaux.DocumentRoot#getAugroups()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Augroups();

	/**
	 * Returns the meta object for the containment reference '{@link Btsaux.DocumentRoot#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorization</em>'.
	 * @see Btsaux.DocumentRoot#getAuthorization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Authorization();

	/**
	 * Returns the meta object for the containment reference '{@link Btsaux.DocumentRoot#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authors</em>'.
	 * @see Btsaux.DocumentRoot#getAuthors()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Authors();

	/**
	 * Returns the meta object for the containment reference '{@link Btsaux.DocumentRoot#getBwlengl <em>Bwlengl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bwlengl</em>'.
	 * @see Btsaux.DocumentRoot#getBwlengl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bwlengl();

	/**
	 * Returns the meta object for the containment reference '{@link Btsaux.DocumentRoot#getBwllink <em>Bwllink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bwllink</em>'.
	 * @see Btsaux.DocumentRoot#getBwllink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bwllink();

	/**
	 * Returns the meta object for the containment reference '{@link Btsaux.DocumentRoot#getBwllist <em>Bwllist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bwllist</em>'.
	 * @see Btsaux.DocumentRoot#getBwllist()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bwllist();

	/**
	 * Returns the meta object for the containment reference '{@link Btsaux.DocumentRoot#getStupidXML <em>Stupid XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stupid XML</em>'.
	 * @see Btsaux.DocumentRoot#getStupidXML()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StupidXML();

	/**
	 * Returns the meta object for the containment reference '{@link Btsaux.DocumentRoot#getThsdata <em>Thsdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thsdata</em>'.
	 * @see Btsaux.DocumentRoot#getThsdata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Thsdata();

	/**
	 * Returns the meta object for class '{@link Btsaux.StupidXMLType <em>Stupid XML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stupid XML Type</em>'.
	 * @see Btsaux.StupidXMLType
	 * @generated
	 */
	EClass getStupidXMLType();

	/**
	 * Returns the meta object for the attribute list '{@link Btsaux.StupidXMLType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Btsaux.StupidXMLType#getGroup()
	 * @see #getStupidXMLType()
	 * @generated
	 */
	EAttribute getStupidXMLType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Btsaux.StupidXMLType#getThsdata <em>Thsdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thsdata</em>'.
	 * @see Btsaux.StupidXMLType#getThsdata()
	 * @see #getStupidXMLType()
	 * @generated
	 */
	EReference getStupidXMLType_Thsdata();

	/**
	 * Returns the meta object for the containment reference list '{@link Btsaux.StupidXMLType#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see Btsaux.StupidXMLType#getAuthors()
	 * @see #getStupidXMLType()
	 * @generated
	 */
	EReference getStupidXMLType_Authors();

	/**
	 * Returns the meta object for the containment reference list '{@link Btsaux.StupidXMLType#getBwlengl <em>Bwlengl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bwlengl</em>'.
	 * @see Btsaux.StupidXMLType#getBwlengl()
	 * @see #getStupidXMLType()
	 * @generated
	 */
	EReference getStupidXMLType_Bwlengl();

	/**
	 * Returns the meta object for the containment reference list '{@link Btsaux.StupidXMLType#getBwllink <em>Bwllink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bwllink</em>'.
	 * @see Btsaux.StupidXMLType#getBwllink()
	 * @see #getStupidXMLType()
	 * @generated
	 */
	EReference getStupidXMLType_Bwllink();

	/**
	 * Returns the meta object for the containment reference list '{@link Btsaux.StupidXMLType#getBwllist <em>Bwllist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bwllist</em>'.
	 * @see Btsaux.StupidXMLType#getBwllist()
	 * @see #getStupidXMLType()
	 * @generated
	 */
	EReference getStupidXMLType_Bwllist();

	/**
	 * Returns the meta object for class '{@link Btsaux.ThsdataType <em>Thsdata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thsdata Type</em>'.
	 * @see Btsaux.ThsdataType
	 * @generated
	 */
	EClass getThsdataType();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Btsaux.ThsdataType#getComment()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getEterm <em>Eterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eterm</em>'.
	 * @see Btsaux.ThsdataType#getEterm()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Eterm();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see Btsaux.ThsdataType#getTerm()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Term();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getTermsort <em>Termsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termsort</em>'.
	 * @see Btsaux.ThsdataType#getTermsort()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Termsort();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getThsct <em>Thsct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thsct</em>'.
	 * @see Btsaux.ThsdataType#getThsct()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Thsct();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getThslock <em>Thslock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thslock</em>'.
	 * @see Btsaux.ThsdataType#getThslock()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Thslock();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getThsowner <em>Thsowner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thsowner</em>'.
	 * @see Btsaux.ThsdataType#getThsowner()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Thsowner();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getThssort <em>Thssort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thssort</em>'.
	 * @see Btsaux.ThsdataType#getThssort()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Thssort();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getThsstrg <em>Thsstrg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thsstrg</em>'.
	 * @see Btsaux.ThsdataType#getThsstrg()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Thsstrg();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getThstype <em>Thstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thstype</em>'.
	 * @see Btsaux.ThsdataType#getThstype()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Thstype();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getYearfrom <em>Yearfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yearfrom</em>'.
	 * @see Btsaux.ThsdataType#getYearfrom()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Yearfrom();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getYearto <em>Yearto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yearto</em>'.
	 * @see Btsaux.ThsdataType#getYearto()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Yearto();

	/**
	 * Returns the meta object for the attribute '{@link Btsaux.ThsdataType#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see Btsaux.ThsdataType#getSubtype()
	 * @see #getThsdataType()
	 * @generated
	 */
	EAttribute getThsdataType_Subtype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BtsauxFactory getBtsauxFactory();

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
		 * The meta object literal for the '{@link Btsaux.impl.AugroupsTypeImpl <em>Augroups Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.AugroupsTypeImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getAugroupsType()
		 * @generated
		 */
		EClass AUGROUPS_TYPE = eINSTANCE.getAugroupsType();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUGROUPS_TYPE__CATEGORY = eINSTANCE.getAugroupsType_Category();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUGROUPS_TYPE__COMMENT = eINSTANCE.getAugroupsType_Comment();

		/**
		 * The meta object literal for the '<em><b>Gpct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUGROUPS_TYPE__GPCT = eINSTANCE.getAugroupsType_Gpct();

		/**
		 * The meta object literal for the '{@link Btsaux.impl.AuthorizationTypeImpl <em>Authorization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.AuthorizationTypeImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getAuthorizationType()
		 * @generated
		 */
		EClass AUTHORIZATION_TYPE = eINSTANCE.getAuthorizationType();

		/**
		 * The meta object literal for the '<em><b>Auct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_TYPE__AUCT = eINSTANCE.getAuthorizationType_Auct();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_TYPE__CATEGORY = eINSTANCE.getAuthorizationType_Category();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_TYPE__COMMENT = eINSTANCE.getAuthorizationType_Comment();

		/**
		 * The meta object literal for the '{@link Btsaux.impl.AuthorsTypeImpl <em>Authors Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.AuthorsTypeImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getAuthorsType()
		 * @generated
		 */
		EClass AUTHORS_TYPE = eINSTANCE.getAuthorsType();

		/**
		 * The meta object literal for the '<em><b>Auct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__AUCT = eINSTANCE.getAuthorsType_Auct();

		/**
		 * The meta object literal for the '<em><b>Augp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__AUGP = eINSTANCE.getAuthorsType_Augp();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__COMMENT = eINSTANCE.getAuthorsType_Comment();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__LINE = eINSTANCE.getAuthorsType_Line();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__PAGE = eINSTANCE.getAuthorsType_Page();

		/**
		 * The meta object literal for the '<em><b>Sigle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__SIGLE = eINSTANCE.getAuthorsType_Sigle();

		/**
		 * The meta object literal for the '<em><b>Weblink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__WEBLINK = eINSTANCE.getAuthorsType_Weblink();

		/**
		 * The meta object literal for the '<em><b>Loginname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__LOGINNAME = eINSTANCE.getAuthorsType_Loginname();

		/**
		 * The meta object literal for the '<em><b>Pword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORS_TYPE__PWORD = eINSTANCE.getAuthorsType_Pword();

		/**
		 * The meta object literal for the '{@link Btsaux.impl.BwlenglTypeImpl <em>Bwlengl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.BwlenglTypeImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getBwlenglType()
		 * @generated
		 */
		EClass BWLENGL_TYPE = eINSTANCE.getBwlenglType();

		/**
		 * The meta object literal for the '<em><b>Ecomment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLENGL_TYPE__ECOMMENT = eINSTANCE.getBwlenglType_Ecomment();

		/**
		 * The meta object literal for the '<em><b>Elabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLENGL_TYPE__ELABEL = eINSTANCE.getBwlenglType_Elabel();

		/**
		 * The meta object literal for the '<em><b>Wcn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLENGL_TYPE__WCN = eINSTANCE.getBwlenglType_Wcn();

		/**
		 * The meta object literal for the '{@link Btsaux.impl.BwllinkTypeImpl <em>Bwllink Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.BwllinkTypeImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getBwllinkType()
		 * @generated
		 */
		EClass BWLLINK_TYPE = eINSTANCE.getBwllinkType();

		/**
		 * The meta object literal for the '<em><b>Lclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLINK_TYPE__LCLASS = eINSTANCE.getBwllinkType_Lclass();

		/**
		 * The meta object literal for the '<em><b>Lcomment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLINK_TYPE__LCOMMENT = eINSTANCE.getBwllinkType_Lcomment();

		/**
		 * The meta object literal for the '<em><b>Lkey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLINK_TYPE__LKEY = eINSTANCE.getBwllinkType_Lkey();

		/**
		 * The meta object literal for the '<em><b>Ltype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLINK_TYPE__LTYPE = eINSTANCE.getBwllinkType_Ltype();

		/**
		 * The meta object literal for the '<em><b>Wcn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLINK_TYPE__WCN = eINSTANCE.getBwllinkType_Wcn();

		/**
		 * The meta object literal for the '{@link Btsaux.impl.BwllistTypeImpl <em>Bwllist Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.BwllistTypeImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getBwllistType()
		 * @generated
		 */
		EClass BWLLIST_TYPE = eINSTANCE.getBwllistType();

		/**
		 * The meta object literal for the '<em><b>Arb Vermerk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__ARB_VERMERK = eINSTANCE.getBwllistType_ArbVermerk();

		/**
		 * The meta object literal for the '<em><b>Hsort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__HSORT = eINSTANCE.getBwllistType_Hsort();

		/**
		 * The meta object literal for the '<em><b>Kommentar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__KOMMENTAR = eINSTANCE.getBwllistType_Kommentar();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__LABEL = eINSTANCE.getBwllistType_Label();

		/**
		 * The meta object literal for the '<em><b>Lemma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__LEMMA = eINSTANCE.getBwllistType_Lemma();

		/**
		 * The meta object literal for the '<em><b>Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__LOCK = eINSTANCE.getBwllistType_Lock();

		/**
		 * The meta object literal for the '<em><b>Lsort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__LSORT = eINSTANCE.getBwllistType_Lsort();

		/**
		 * The meta object literal for the '<em><b>Redaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__REDACTION = eINSTANCE.getBwllistType_Redaction();

		/**
		 * The meta object literal for the '<em><b>Rstatus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__RSTATUS = eINSTANCE.getBwllistType_Rstatus();

		/**
		 * The meta object literal for the '<em><b>Sc00</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC00 = eINSTANCE.getBwllistType_Sc00();

		/**
		 * The meta object literal for the '<em><b>Sc01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC01 = eINSTANCE.getBwllistType_Sc01();

		/**
		 * The meta object literal for the '<em><b>Sc02</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC02 = eINSTANCE.getBwllistType_Sc02();

		/**
		 * The meta object literal for the '<em><b>Sc03</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC03 = eINSTANCE.getBwllistType_Sc03();

		/**
		 * The meta object literal for the '<em><b>Sc04</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC04 = eINSTANCE.getBwllistType_Sc04();

		/**
		 * The meta object literal for the '<em><b>Sc05</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC05 = eINSTANCE.getBwllistType_Sc05();

		/**
		 * The meta object literal for the '<em><b>Sc06</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC06 = eINSTANCE.getBwllistType_Sc06();

		/**
		 * The meta object literal for the '<em><b>Sc07</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC07 = eINSTANCE.getBwllistType_Sc07();

		/**
		 * The meta object literal for the '<em><b>Sc08</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC08 = eINSTANCE.getBwllistType_Sc08();

		/**
		 * The meta object literal for the '<em><b>Sc09</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC09 = eINSTANCE.getBwllistType_Sc09();

		/**
		 * The meta object literal for the '<em><b>Sc10</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SC10 = eINSTANCE.getBwllistType_Sc10();

		/**
		 * The meta object literal for the '<em><b>Shortref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SHORTREF = eINSTANCE.getBwllistType_Shortref();

		/**
		 * The meta object literal for the '<em><b>Simplify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SIMPLIFY = eINSTANCE.getBwllistType_Simplify();

		/**
		 * The meta object literal for the '<em><b>Wclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__WCLASS = eINSTANCE.getBwllistType_Wclass();

		/**
		 * The meta object literal for the '<em><b>Wclassnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__WCLASSNUM = eINSTANCE.getBwllistType_Wclassnum();

		/**
		 * The meta object literal for the '<em><b>Wcn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__WCN = eINSTANCE.getBwllistType_Wcn();

		/**
		 * The meta object literal for the '<em><b>Woart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__WOART = eINSTANCE.getBwllistType_Woart();

		/**
		 * The meta object literal for the '<em><b>Glyphs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__GLYPHS = eINSTANCE.getBwllistType_Glyphs();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__PREDECESSOR = eINSTANCE.getBwllistType_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWLLIST_TYPE__SUCCESSOR = eINSTANCE.getBwllistType_Successor();

		/**
		 * The meta object literal for the '{@link Btsaux.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.DocumentRootImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Augroups</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUGROUPS = eINSTANCE.getDocumentRoot_Augroups();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHORIZATION = eINSTANCE.getDocumentRoot_Authorization();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHORS = eINSTANCE.getDocumentRoot_Authors();

		/**
		 * The meta object literal for the '<em><b>Bwlengl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BWLENGL = eINSTANCE.getDocumentRoot_Bwlengl();

		/**
		 * The meta object literal for the '<em><b>Bwllink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BWLLINK = eINSTANCE.getDocumentRoot_Bwllink();

		/**
		 * The meta object literal for the '<em><b>Bwllist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BWLLIST = eINSTANCE.getDocumentRoot_Bwllist();

		/**
		 * The meta object literal for the '<em><b>Stupid XML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STUPID_XML = eINSTANCE.getDocumentRoot_StupidXML();

		/**
		 * The meta object literal for the '<em><b>Thsdata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__THSDATA = eINSTANCE.getDocumentRoot_Thsdata();

		/**
		 * The meta object literal for the '{@link Btsaux.impl.StupidXMLTypeImpl <em>Stupid XML Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.StupidXMLTypeImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getStupidXMLType()
		 * @generated
		 */
		EClass STUPID_XML_TYPE = eINSTANCE.getStupidXMLType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUPID_XML_TYPE__GROUP = eINSTANCE.getStupidXMLType_Group();

		/**
		 * The meta object literal for the '<em><b>Thsdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUPID_XML_TYPE__THSDATA = eINSTANCE.getStupidXMLType_Thsdata();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUPID_XML_TYPE__AUTHORS = eINSTANCE.getStupidXMLType_Authors();

		/**
		 * The meta object literal for the '<em><b>Bwlengl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUPID_XML_TYPE__BWLENGL = eINSTANCE.getStupidXMLType_Bwlengl();

		/**
		 * The meta object literal for the '<em><b>Bwllink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUPID_XML_TYPE__BWLLINK = eINSTANCE.getStupidXMLType_Bwllink();

		/**
		 * The meta object literal for the '<em><b>Bwllist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUPID_XML_TYPE__BWLLIST = eINSTANCE.getStupidXMLType_Bwllist();

		/**
		 * The meta object literal for the '{@link Btsaux.impl.ThsdataTypeImpl <em>Thsdata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Btsaux.impl.ThsdataTypeImpl
		 * @see Btsaux.impl.BtsauxPackageImpl#getThsdataType()
		 * @generated
		 */
		EClass THSDATA_TYPE = eINSTANCE.getThsdataType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__COMMENT = eINSTANCE.getThsdataType_Comment();

		/**
		 * The meta object literal for the '<em><b>Eterm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__ETERM = eINSTANCE.getThsdataType_Eterm();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__TERM = eINSTANCE.getThsdataType_Term();

		/**
		 * The meta object literal for the '<em><b>Termsort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__TERMSORT = eINSTANCE.getThsdataType_Termsort();

		/**
		 * The meta object literal for the '<em><b>Thsct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__THSCT = eINSTANCE.getThsdataType_Thsct();

		/**
		 * The meta object literal for the '<em><b>Thslock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__THSLOCK = eINSTANCE.getThsdataType_Thslock();

		/**
		 * The meta object literal for the '<em><b>Thsowner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__THSOWNER = eINSTANCE.getThsdataType_Thsowner();

		/**
		 * The meta object literal for the '<em><b>Thssort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__THSSORT = eINSTANCE.getThsdataType_Thssort();

		/**
		 * The meta object literal for the '<em><b>Thsstrg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__THSSTRG = eINSTANCE.getThsdataType_Thsstrg();

		/**
		 * The meta object literal for the '<em><b>Thstype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__THSTYPE = eINSTANCE.getThsdataType_Thstype();

		/**
		 * The meta object literal for the '<em><b>Yearfrom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__YEARFROM = eINSTANCE.getThsdataType_Yearfrom();

		/**
		 * The meta object literal for the '<em><b>Yearto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__YEARTO = eINSTANCE.getThsdataType_Yearto();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THSDATA_TYPE__SUBTYPE = eINSTANCE.getThsdataType_Subtype();

	}

} //BtsauxPackage
