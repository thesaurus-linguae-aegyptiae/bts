/**
 */
package Btsaux.impl;

import Btsaux.AugroupsType;
import Btsaux.AuthorizationType;
import Btsaux.AuthorsType;
import Btsaux.BtsauxFactory;
import Btsaux.BtsauxPackage;
import Btsaux.BwlenglType;
import Btsaux.BwllinkType;
import Btsaux.BwllistType;
import Btsaux.DocumentRoot;
import Btsaux.StupidXMLType;
import Btsaux.ThsdataType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsauxPackageImpl extends EPackageImpl implements BtsauxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass augroupsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bwlenglTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bwllinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bwllistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stupidXMLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thsdataTypeEClass = null;

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
	 * @see Btsaux.BtsauxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BtsauxPackageImpl() {
		super(eNS_URI, BtsauxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BtsauxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BtsauxPackage init() {
		if (isInited) return (BtsauxPackage)EPackage.Registry.INSTANCE.getEPackage(BtsauxPackage.eNS_URI);

		// Obtain or create and register package
		BtsauxPackageImpl theBtsauxPackage = (BtsauxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BtsauxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BtsauxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBtsauxPackage.createPackageContents();

		// Initialize created meta-data
		theBtsauxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtsauxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BtsauxPackage.eNS_URI, theBtsauxPackage);
		return theBtsauxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAugroupsType() {
		return augroupsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAugroupsType_Category() {
		return (EAttribute)augroupsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAugroupsType_Comment() {
		return (EAttribute)augroupsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAugroupsType_Gpct() {
		return (EAttribute)augroupsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationType() {
		return authorizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationType_Auct() {
		return (EAttribute)authorizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationType_Category() {
		return (EAttribute)authorizationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationType_Comment() {
		return (EAttribute)authorizationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorsType() {
		return authorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Auct() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Augp() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Comment() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Line() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Page() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Sigle() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Weblink() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Loginname() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_Pword() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBwlenglType() {
		return bwlenglTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwlenglType_Ecomment() {
		return (EAttribute)bwlenglTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwlenglType_Elabel() {
		return (EAttribute)bwlenglTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwlenglType_Wcn() {
		return (EAttribute)bwlenglTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBwllinkType() {
		return bwllinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllinkType_Lclass() {
		return (EAttribute)bwllinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllinkType_Lcomment() {
		return (EAttribute)bwllinkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllinkType_Lkey() {
		return (EAttribute)bwllinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllinkType_Ltype() {
		return (EAttribute)bwllinkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllinkType_Wcn() {
		return (EAttribute)bwllinkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBwllistType() {
		return bwllistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_ArbVermerk() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Hsort() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Kommentar() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Label() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Lemma() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Lock() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Lsort() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Redaction() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Rstatus() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc00() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc01() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc02() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc03() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc04() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc05() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc06() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc07() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc08() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc09() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Sc10() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Shortref() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Simplify() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Wclass() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Wclassnum() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Wcn() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Woart() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Glyphs() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Predecessor() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBwllistType_Successor() {
		return (EAttribute)bwllistTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Augroups() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Authorization() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Authors() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bwlengl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bwllink() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bwllist() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StupidXML() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Thsdata() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStupidXMLType() {
		return stupidXMLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStupidXMLType_Group() {
		return (EAttribute)stupidXMLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStupidXMLType_Thsdata() {
		return (EReference)stupidXMLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStupidXMLType_Authors() {
		return (EReference)stupidXMLTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStupidXMLType_Bwlengl() {
		return (EReference)stupidXMLTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStupidXMLType_Bwllink() {
		return (EReference)stupidXMLTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStupidXMLType_Bwllist() {
		return (EReference)stupidXMLTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThsdataType() {
		return thsdataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Comment() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Eterm() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Term() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Termsort() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Thsct() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Thslock() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Thsowner() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Thssort() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Thsstrg() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Thstype() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Yearfrom() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Yearto() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsdataType_Subtype() {
		return (EAttribute)thsdataTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsauxFactory getBtsauxFactory() {
		return (BtsauxFactory)getEFactoryInstance();
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
		augroupsTypeEClass = createEClass(AUGROUPS_TYPE);
		createEAttribute(augroupsTypeEClass, AUGROUPS_TYPE__CATEGORY);
		createEAttribute(augroupsTypeEClass, AUGROUPS_TYPE__COMMENT);
		createEAttribute(augroupsTypeEClass, AUGROUPS_TYPE__GPCT);

		authorizationTypeEClass = createEClass(AUTHORIZATION_TYPE);
		createEAttribute(authorizationTypeEClass, AUTHORIZATION_TYPE__AUCT);
		createEAttribute(authorizationTypeEClass, AUTHORIZATION_TYPE__CATEGORY);
		createEAttribute(authorizationTypeEClass, AUTHORIZATION_TYPE__COMMENT);

		authorsTypeEClass = createEClass(AUTHORS_TYPE);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__AUCT);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__AUGP);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__COMMENT);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__LINE);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__PAGE);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__SIGLE);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__WEBLINK);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__LOGINNAME);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__PWORD);

		bwlenglTypeEClass = createEClass(BWLENGL_TYPE);
		createEAttribute(bwlenglTypeEClass, BWLENGL_TYPE__ECOMMENT);
		createEAttribute(bwlenglTypeEClass, BWLENGL_TYPE__ELABEL);
		createEAttribute(bwlenglTypeEClass, BWLENGL_TYPE__WCN);

		bwllinkTypeEClass = createEClass(BWLLINK_TYPE);
		createEAttribute(bwllinkTypeEClass, BWLLINK_TYPE__LCLASS);
		createEAttribute(bwllinkTypeEClass, BWLLINK_TYPE__LCOMMENT);
		createEAttribute(bwllinkTypeEClass, BWLLINK_TYPE__LKEY);
		createEAttribute(bwllinkTypeEClass, BWLLINK_TYPE__LTYPE);
		createEAttribute(bwllinkTypeEClass, BWLLINK_TYPE__WCN);

		bwllistTypeEClass = createEClass(BWLLIST_TYPE);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__ARB_VERMERK);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__HSORT);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__KOMMENTAR);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__LABEL);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__LEMMA);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__LOCK);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__LSORT);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__REDACTION);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__RSTATUS);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC00);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC01);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC02);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC03);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC04);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC05);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC06);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC07);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC08);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC09);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SC10);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SHORTREF);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SIMPLIFY);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__WCLASS);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__WCLASSNUM);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__WCN);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__WOART);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__GLYPHS);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__PREDECESSOR);
		createEAttribute(bwllistTypeEClass, BWLLIST_TYPE__SUCCESSOR);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUGROUPS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTHORIZATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTHORS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BWLENGL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BWLLINK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BWLLIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STUPID_XML);
		createEReference(documentRootEClass, DOCUMENT_ROOT__THSDATA);

		stupidXMLTypeEClass = createEClass(STUPID_XML_TYPE);
		createEAttribute(stupidXMLTypeEClass, STUPID_XML_TYPE__GROUP);
		createEReference(stupidXMLTypeEClass, STUPID_XML_TYPE__THSDATA);
		createEReference(stupidXMLTypeEClass, STUPID_XML_TYPE__AUTHORS);
		createEReference(stupidXMLTypeEClass, STUPID_XML_TYPE__BWLENGL);
		createEReference(stupidXMLTypeEClass, STUPID_XML_TYPE__BWLLINK);
		createEReference(stupidXMLTypeEClass, STUPID_XML_TYPE__BWLLIST);

		thsdataTypeEClass = createEClass(THSDATA_TYPE);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__COMMENT);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__ETERM);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__TERM);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__TERMSORT);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__THSCT);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__THSLOCK);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__THSOWNER);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__THSSORT);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__THSSTRG);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__THSTYPE);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__YEARFROM);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__YEARTO);
		createEAttribute(thsdataTypeEClass, THSDATA_TYPE__SUBTYPE);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(augroupsTypeEClass, AugroupsType.class, "AugroupsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAugroupsType_Category(), theXMLTypePackage.getAnySimpleType(), "category", null, 1, 1, AugroupsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAugroupsType_Comment(), theXMLTypePackage.getAnySimpleType(), "comment", null, 1, 1, AugroupsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAugroupsType_Gpct(), theXMLTypePackage.getNMTOKEN(), "gpct", null, 1, 1, AugroupsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationTypeEClass, AuthorizationType.class, "AuthorizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationType_Auct(), theXMLTypePackage.getNMTOKEN(), "auct", null, 1, 1, AuthorizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizationType_Category(), theXMLTypePackage.getAnySimpleType(), "category", null, 1, 1, AuthorizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizationType_Comment(), theXMLTypePackage.getAnySimpleType(), "comment", null, 1, 1, AuthorizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorsTypeEClass, AuthorsType.class, "AuthorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorsType_Auct(), theXMLTypePackage.getNMTOKEN(), "auct", null, 1, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorsType_Augp(), theXMLTypePackage.getNMTOKEN(), "augp", null, 1, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorsType_Comment(), theXMLTypePackage.getAnySimpleType(), "comment", null, 1, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorsType_Line(), theXMLTypePackage.getAnySimpleType(), "line", null, 1, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorsType_Page(), theXMLTypePackage.getAnySimpleType(), "page", null, 1, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorsType_Sigle(), theXMLTypePackage.getAnySimpleType(), "sigle", null, 1, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorsType_Weblink(), theXMLTypePackage.getAnySimpleType(), "weblink", null, 1, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorsType_Loginname(), ecorePackage.getEString(), "loginname", null, 0, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorsType_Pword(), ecorePackage.getEString(), "pword", null, 0, 1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bwlenglTypeEClass, BwlenglType.class, "BwlenglType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBwlenglType_Ecomment(), theXMLTypePackage.getAnySimpleType(), "ecomment", null, 1, 1, BwlenglType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwlenglType_Elabel(), theXMLTypePackage.getAnySimpleType(), "elabel", null, 1, 1, BwlenglType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwlenglType_Wcn(), theXMLTypePackage.getNMTOKEN(), "wcn", null, 1, 1, BwlenglType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bwllinkTypeEClass, BwllinkType.class, "BwllinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBwllinkType_Lclass(), theXMLTypePackage.getAnySimpleType(), "lclass", null, 1, 1, BwllinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllinkType_Lcomment(), theXMLTypePackage.getAnySimpleType(), "lcomment", null, 1, 1, BwllinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllinkType_Lkey(), theXMLTypePackage.getNMTOKEN(), "lkey", null, 1, 1, BwllinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllinkType_Ltype(), theXMLTypePackage.getAnySimpleType(), "ltype", null, 1, 1, BwllinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllinkType_Wcn(), theXMLTypePackage.getNMTOKEN(), "wcn", null, 1, 1, BwllinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bwllistTypeEClass, BwllistType.class, "BwllistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBwllistType_ArbVermerk(), theXMLTypePackage.getAnySimpleType(), "arbVermerk", null, 0, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Hsort(), theXMLTypePackage.getNMTOKEN(), "hsort", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Kommentar(), theXMLTypePackage.getAnySimpleType(), "kommentar", null, 0, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Label(), theXMLTypePackage.getAnySimpleType(), "label", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Lemma(), theXMLTypePackage.getAnySimpleType(), "lemma", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Lock(), theXMLTypePackage.getAnySimpleType(), "lock", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Lsort(), theXMLTypePackage.getAnySimpleType(), "lsort", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Redaction(), theXMLTypePackage.getNMTOKEN(), "redaction", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Rstatus(), theXMLTypePackage.getNMTOKEN(), "rstatus", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc00(), theXMLTypePackage.getAnySimpleType(), "sc00", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc01(), theXMLTypePackage.getAnySimpleType(), "sc01", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc02(), theXMLTypePackage.getAnySimpleType(), "sc02", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc03(), theXMLTypePackage.getAnySimpleType(), "sc03", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc04(), theXMLTypePackage.getAnySimpleType(), "sc04", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc05(), theXMLTypePackage.getAnySimpleType(), "sc05", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc06(), theXMLTypePackage.getAnySimpleType(), "sc06", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc07(), theXMLTypePackage.getAnySimpleType(), "sc07", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc08(), theXMLTypePackage.getAnySimpleType(), "sc08", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc09(), theXMLTypePackage.getAnySimpleType(), "sc09", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Sc10(), theXMLTypePackage.getAnySimpleType(), "sc10", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Shortref(), theXMLTypePackage.getAnySimpleType(), "shortref", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Simplify(), theXMLTypePackage.getAnySimpleType(), "simplify", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Wclass(), theXMLTypePackage.getAnySimpleType(), "wclass", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Wclassnum(), theXMLTypePackage.getNMTOKEN(), "wclassnum", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Wcn(), theXMLTypePackage.getNMTOKEN(), "wcn", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Woart(), theXMLTypePackage.getNMTOKEN(), "woart", null, 1, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Glyphs(), ecorePackage.getEString(), "glyphs", null, 0, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Predecessor(), ecorePackage.getEString(), "predecessor", null, 0, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBwllistType_Successor(), ecorePackage.getEString(), "successor", null, 0, 1, BwllistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Augroups(), this.getAugroupsType(), null, "augroups", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Authorization(), this.getAuthorizationType(), null, "authorization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Authors(), this.getAuthorsType(), null, "authors", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bwlengl(), this.getBwlenglType(), null, "bwlengl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bwllink(), this.getBwllinkType(), null, "bwllink", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bwllist(), this.getBwllistType(), null, "bwllist", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StupidXML(), this.getStupidXMLType(), null, "stupidXML", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Thsdata(), this.getThsdataType(), null, "thsdata", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stupidXMLTypeEClass, StupidXMLType.class, "StupidXMLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStupidXMLType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, StupidXMLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStupidXMLType_Thsdata(), this.getThsdataType(), null, "thsdata", null, 0, -1, StupidXMLType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStupidXMLType_Authors(), this.getAuthorsType(), null, "authors", null, 0, -1, StupidXMLType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStupidXMLType_Bwlengl(), this.getBwlenglType(), null, "bwlengl", null, 0, -1, StupidXMLType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStupidXMLType_Bwllink(), this.getBwllinkType(), null, "bwllink", null, 0, -1, StupidXMLType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStupidXMLType_Bwllist(), this.getBwllistType(), null, "bwllist", null, 0, -1, StupidXMLType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(thsdataTypeEClass, ThsdataType.class, "ThsdataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThsdataType_Comment(), theXMLTypePackage.getAnySimpleType(), "comment", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Eterm(), theXMLTypePackage.getAnySimpleType(), "eterm", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Term(), theXMLTypePackage.getAnySimpleType(), "term", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Termsort(), theXMLTypePackage.getAnySimpleType(), "termsort", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Thsct(), theXMLTypePackage.getNMTOKEN(), "thsct", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Thslock(), theXMLTypePackage.getNMTOKEN(), "thslock", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Thsowner(), theXMLTypePackage.getNMTOKEN(), "thsowner", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Thssort(), theXMLTypePackage.getNMTOKEN(), "thssort", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Thsstrg(), theXMLTypePackage.getAnySimpleType(), "thsstrg", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Thstype(), theXMLTypePackage.getNMTOKEN(), "thstype", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Yearfrom(), theXMLTypePackage.getNMTOKEN(), "yearfrom", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Yearto(), theXMLTypePackage.getNMTOKEN(), "yearto", null, 1, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsdataType_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, ThsdataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (augroupsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "augroups_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAugroupsType_Category(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "category",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAugroupsType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAugroupsType_Gpct(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gpct",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (authorizationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "authorization_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAuthorizationType_Auct(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "auct",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAuthorizationType_Category(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "category",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAuthorizationType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (authorsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "authors_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAuthorsType_Auct(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "auct",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAuthorsType_Augp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "augp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAuthorsType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAuthorsType_Line(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "line",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAuthorsType_Page(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "page",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAuthorsType_Sigle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sigle",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAuthorsType_Weblink(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "weblink",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (bwlenglTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bwlengl_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBwlenglType_Ecomment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ecomment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwlenglType_Elabel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elabel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwlenglType_Wcn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wcn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (bwllinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bwllink_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBwllinkType_Lclass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lclass",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllinkType_Lcomment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lcomment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllinkType_Lkey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lkey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllinkType_Ltype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ltype",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllinkType_Wcn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wcn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (bwllistTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bwllist_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBwllistType_ArbVermerk(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arb_vermerk",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Hsort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hsort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Kommentar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kommentar",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Lemma(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lemma",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Lock(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lock",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Lsort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lsort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Redaction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "redaction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Rstatus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rstatus",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc00(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc00",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc01(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc01",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc02(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc02",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc03(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc03",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc04(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc04",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc05(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc05",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc06(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc06",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc07(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc07",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc08(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc08",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc09(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc09",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Sc10(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sc10",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Shortref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shortref",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Simplify(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "simplify",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Wclass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wclass",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Wclassnum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wclassnum",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Wcn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wcn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBwllistType_Woart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "woart",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Augroups(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "augroups",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Authorization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authorization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Authors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authors",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Bwlengl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bwlengl",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Bwllink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bwllink",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Bwllist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bwllist",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_StupidXML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StupidXML",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Thsdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thsdata",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (stupidXMLTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StupidXML_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStupidXMLType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getStupidXMLType_Thsdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thsdata",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getStupidXMLType_Authors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authors",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getStupidXMLType_Bwlengl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bwlengl",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getStupidXMLType_Bwllink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bwllink",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getStupidXMLType_Bwllist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bwllist",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (thsdataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "thsdata_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getThsdataType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Eterm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eterm",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Termsort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termsort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Thsct(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thsct",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Thslock(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thslock",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Thsowner(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thsowner",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Thssort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thssort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Thsstrg(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thsstrg",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Thstype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thstype",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Yearfrom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "yearfrom",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsdataType_Yearto(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "yearto",
			 "namespace", "##targetNamespace"
		   });
	}

} //BtsauxPackageImpl
