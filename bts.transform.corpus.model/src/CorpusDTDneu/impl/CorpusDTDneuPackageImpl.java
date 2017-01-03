/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.BausteinPassageType;
import CorpusDTDneu.CategoryType;
import CorpusDTDneu.CategoryType1;
import CorpusDTDneu.CorpusDTDneuFactory;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.DateThsType;
import CorpusDTDneu.DateType;
import CorpusDTDneu.DocumentRoot;
import CorpusDTDneu.EgyPunctuationType;
import CorpusDTDneu.EgySentType;
import CorpusDTDneu.EgySubTxtType;
import CorpusDTDneu.EgySzenarioType;
import CorpusDTDneu.EgyTB1Type;
import CorpusDTDneu.EgyTB3EndType;
import CorpusDTDneu.EgyTB3StartType;
import CorpusDTDneu.EgyTxtCorpusType;
import CorpusDTDneu.EgyTxtType;
import CorpusDTDneu.EgyWordType;
import CorpusDTDneu.FormattingElementType;
import CorpusDTDneu.GlossePassageType;
import CorpusDTDneu.GlosseType;
import CorpusDTDneu.LTypeType;
import CorpusDTDneu.LanguagePassageType;
import CorpusDTDneu.LeipzigPassageType;
import CorpusDTDneu.LineCountType;
import CorpusDTDneu.NoteType;
import CorpusDTDneu.PassportDataItem;
import CorpusDTDneu.PassportDataItemType;
import CorpusDTDneu.PictureType;
import CorpusDTDneu.PicturesTableType;
import CorpusDTDneu.PunctuationType;
import CorpusDTDneu.TCArrangementType;
import CorpusDTDneu.TCCaptionType;
import CorpusDTDneu.TCGroupType;
import CorpusDTDneu.TCHeaderType;
import CorpusDTDneu.TCLocationType;
import CorpusDTDneu.TCObjPartType;
import CorpusDTDneu.TCObjectType;
import CorpusDTDneu.TCPassportType;
import CorpusDTDneu.TCPictureType;
import CorpusDTDneu.TCSceneType;
import CorpusDTDneu.TCSuperTextType;
import CorpusDTDneu.TCTextType;
import CorpusDTDneu.ThsEntryType;
import CorpusDTDneu.TypeType;
import CorpusDTDneu.TypeType1;
import CorpusDTDneu.TypeType2;
import CorpusDTDneu.TypeType3;
import CorpusDTDneu.TypeType4;
import CorpusDTDneu.TypeType5;
import CorpusDTDneu.TypeType6;
import CorpusDTDneu.TypeType7;
import CorpusDTDneu.TypeType8;
import CorpusDTDneu.WorkType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class CorpusDTDneuPackageImpl extends EPackageImpl implements CorpusDTDneuPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bausteinPassageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateThsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

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
	private EClass egyPunctuationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egySentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egySubTxtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egySzenarioTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egyTB1TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egyTB3EndTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egyTB3StartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egyTxtCorpusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egyTxtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egyWordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formattingElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossePassageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glosseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languagePassageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leipzigPassageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passportDataItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passportDataItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picturesTableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pictureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass punctuationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcArrangementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcCaptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcHeaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcObjPartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcPassportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcPictureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcSceneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcSuperTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thsEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType6EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType7EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType8EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType categoryTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType categoryTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject6EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject7EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject8EDataType = null;

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorpusDTDneuPackageImpl() {
		super(eNS_URI, CorpusDTDneuFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorpusDTDneuPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorpusDTDneuPackage init() {
		if (isInited) return (CorpusDTDneuPackage)EPackage.Registry.INSTANCE.getEPackage(CorpusDTDneuPackage.eNS_URI);

		// Obtain or create and register package
		CorpusDTDneuPackageImpl theCorpusDTDneuPackage = (CorpusDTDneuPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorpusDTDneuPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorpusDTDneuPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCorpusDTDneuPackage.createPackageContents();

		// Initialize created meta-data
		theCorpusDTDneuPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorpusDTDneuPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorpusDTDneuPackage.eNS_URI, theCorpusDTDneuPackage);
		return theCorpusDTDneuPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBausteinPassageType() {
		return bausteinPassageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBausteinPassageType_Baustein() {
		return (EAttribute)bausteinPassageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBausteinPassageType_PassageID() {
		return (EAttribute)bausteinPassageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBausteinPassageType_Type() {
		return (EAttribute)bausteinPassageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateThsType() {
		return dateThsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateThsType_Term() {
		return (EAttribute)dateThsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateThsType_LowerTerm() {
		return (EAttribute)dateThsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateThsType_UpperTerm() {
		return (EAttribute)dateThsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateThsType_Type() {
		return (EAttribute)dateThsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateThsType_YearFrom() {
		return (EAttribute)dateThsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateThsType_YearTo() {
		return (EAttribute)dateThsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateType() {
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Mixed() {
		return (EAttribute)dateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Group() {
		return (EAttribute)dateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateType_DateThs() {
		return (EReference)dateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Code() {
		return (EAttribute)dateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Comment() {
		return (EAttribute)dateTypeEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getDocumentRoot_Author() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BausteinPassage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Bibliography() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BtsCodes() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Code() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Code1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Code2() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Codes() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Comment() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Date() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateThs() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Definition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Depiction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgyPunctuation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgySent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgySubTxt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgySzenario() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgyTB1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgyTB3End() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgyTB3Start() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgyTxt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgyTxtCorpus() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EgyWord() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FileName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FilePath() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Form() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FormattingElement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FullName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Glosse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GlossePassage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Graphics() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Hierarchy() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LangComment() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Language() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LanguagePassage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LeipzigPassage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LineCount() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LowerTerm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MuseumNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NameSort() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Note() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Notes() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportDataItem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Picture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PicturesTable() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Project() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Protocol() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Provenance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Punctuation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Script() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCArrangement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCCaption() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCGroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCHeader() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TCNotebook() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCObjPart() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCPassport() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCPicture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCScene() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCSuperText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TCText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Term() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ThsEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Translat() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Translation() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UpperTerm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Value() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WbFolder() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WbSlips() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Work() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgyPunctuationType() {
		return egyPunctuationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyPunctuationType_Value() {
		return (EAttribute)egyPunctuationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyPunctuationType_BtsCodes() {
		return (EAttribute)egyPunctuationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyPunctuationType_Comment() {
		return (EAttribute)egyPunctuationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyPunctuationType_Type() {
		return (EAttribute)egyPunctuationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgySentType() {
		return egySentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_Value() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_Translat() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_BtsCodes() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_Comment() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_Group() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_EgySent() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_EgyTB1() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_EgyTB3Start() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_EgyTB3End() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_EgyWord() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_LineCount() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_Note() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_FormattingElement() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_LanguagePassage() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_BausteinPassage() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_LeipzigPassage() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_GlossePassage() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_Punctuation() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySentType_EgyPunctuation() {
		return (EReference)egySentTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_Author() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_Language() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_Leipzig3Modul() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySentType_Type() {
		return (EAttribute)egySentTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgySubTxtType() {
		return egySubTxtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySubTxtType_Name() {
		return (EAttribute)egySubTxtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySubTxtType_BtsCodes() {
		return (EAttribute)egySubTxtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySubTxtType_Comment() {
		return (EAttribute)egySubTxtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySubTxtType_Group() {
		return (EAttribute)egySubTxtTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySubTxtType_EgySubTxt() {
		return (EReference)egySubTxtTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySubTxtType_EgySent() {
		return (EReference)egySubTxtTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySubTxtType_EgyTB1() {
		return (EReference)egySubTxtTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySubTxtType_EgySzenario() {
		return (EReference)egySubTxtTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySubTxtType_Glosse() {
		return (EReference)egySubTxtTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySubTxtType_EgyTB3Start() {
		return (EReference)egySubTxtTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySubTxtType_EgyTB3End() {
		return (EReference)egySubTxtTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySubTxtType_SortKey() {
		return (EAttribute)egySubTxtTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgySzenarioType() {
		return egySzenarioTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgySzenarioType_EgySent() {
		return (EReference)egySzenarioTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgySzenarioType_InterneNummer() {
		return (EAttribute)egySzenarioTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgyTB1Type() {
		return egyTB1TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB1Type_Name() {
		return (EAttribute)egyTB1TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB1Type_BtsCodes() {
		return (EAttribute)egyTB1TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB1Type_Comment() {
		return (EAttribute)egyTB1TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB1Type_Group() {
		return (EAttribute)egyTB1TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_EgySent() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_EgyTB1() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_EgyTB3Start() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_EgyTB3End() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_EgyWord() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_LineCount() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_Note() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_FormattingElement() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_Punctuation() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTB1Type_EgyPunctuation() {
		return (EReference)egyTB1TypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgyTB3EndType() {
		return egyTB3EndTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3EndType_Name() {
		return (EAttribute)egyTB3EndTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3EndType_BtsCodes() {
		return (EAttribute)egyTB3EndTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3EndType_Comment() {
		return (EAttribute)egyTB3EndTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3EndType_Id() {
		return (EAttribute)egyTB3EndTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3EndType_IdRef() {
		return (EAttribute)egyTB3EndTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgyTB3StartType() {
		return egyTB3StartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3StartType_Name() {
		return (EAttribute)egyTB3StartTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3StartType_BtsCodes() {
		return (EAttribute)egyTB3StartTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3StartType_Comment() {
		return (EAttribute)egyTB3StartTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3StartType_Id() {
		return (EAttribute)egyTB3StartTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTB3StartType_IdRef() {
		return (EAttribute)egyTB3StartTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgyTxtCorpusType() {
		return egyTxtCorpusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_TCHeader() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTxtCorpusType_Group() {
		return (EAttribute)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_PicturesTable() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_TCCaption() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_TCGroup() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_TCArrangement() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_TCObject() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_TCObjPart() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_TCScene() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_TCText() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtCorpusType_EgyTxt() {
		return (EReference)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTxtCorpusType_DTDVersion() {
		return (EAttribute)egyTxtCorpusTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgyTxtType() {
		return egyTxtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTxtType_Name() {
		return (EAttribute)egyTxtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTxtType_BtsCodes() {
		return (EAttribute)egyTxtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTxtType_Comment() {
		return (EAttribute)egyTxtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyTxtType_Group() {
		return (EAttribute)egyTxtTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtType_EgySubTxt() {
		return (EReference)egyTxtTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtType_EgySent() {
		return (EReference)egyTxtTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtType_EgyTB1() {
		return (EReference)egyTxtTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtType_EgySzenario() {
		return (EReference)egyTxtTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtType_Glosse() {
		return (EReference)egyTxtTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtType_EgyTB3Start() {
		return (EReference)egyTxtTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEgyTxtType_EgyTB3End() {
		return (EReference)egyTxtTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEgyWordType() {
		return egyWordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Form() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Translat() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Graphics() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_BtsCodes() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Comment() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Author() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Connect() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_FKey() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Leipzig3Modul() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_LKey() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_LType() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Reihenfolge() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_ReihenfolgeID() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Script() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_Status() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_WChr() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEgyWordType_WType() {
		return (EAttribute)egyWordTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormattingElementType() {
		return formattingElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattingElementType_Value() {
		return (EAttribute)formattingElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattingElementType_BtsCodes() {
		return (EAttribute)formattingElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattingElementType_Type() {
		return (EAttribute)formattingElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlossePassageType() {
		return glossePassageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossePassageType_PassageID() {
		return (EAttribute)glossePassageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossePassageType_Script() {
		return (EAttribute)glossePassageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossePassageType_Type() {
		return (EAttribute)glossePassageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlosseType() {
		return glosseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlosseType_Group() {
		return (EAttribute)glosseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_EgySent() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_EgyTB1() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_EgyTB3Start() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_EgyTB3End() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_EgyWord() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_LineCount() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_Note() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_FormattingElement() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_LanguagePassage() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_BausteinPassage() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_LeipzigPassage() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_GlossePassage() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_Punctuation() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosseType_EgyPunctuation() {
		return (EReference)glosseTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlosseType_PassageID() {
		return (EAttribute)glosseTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguagePassageType() {
		return languagePassageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguagePassageType_Language() {
		return (EAttribute)languagePassageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguagePassageType_PassageID() {
		return (EAttribute)languagePassageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguagePassageType_Type() {
		return (EAttribute)languagePassageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeipzigPassageType() {
		return leipzigPassageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeipzigPassageType_Auszeichnung() {
		return (EAttribute)leipzigPassageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeipzigPassageType_PassageID() {
		return (EAttribute)leipzigPassageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeipzigPassageType_Type() {
		return (EAttribute)leipzigPassageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineCountType() {
		return lineCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineCountType_Mixed() {
		return (EAttribute)lineCountTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineCountType_Group() {
		return (EAttribute)lineCountTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineCountType_Value() {
		return (EAttribute)lineCountTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineCountType_Comment() {
		return (EAttribute)lineCountTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteType() {
		return noteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Value() {
		return (EAttribute)noteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_BtsCodes() {
		return (EAttribute)noteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Comment() {
		return (EAttribute)noteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassportDataItem() {
		return passportDataItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportDataItem_PassportDataItem() {
		return (EReference)passportDataItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassportDataItemType() {
		return passportDataItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportDataItemType_ThsEntry() {
		return (EReference)passportDataItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportDataItemType_Code() {
		return (EAttribute)passportDataItemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportDataItemType_Comment() {
		return (EAttribute)passportDataItemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportDataItemType_Category() {
		return (EAttribute)passportDataItemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPicturesTableType() {
		return picturesTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPicturesTableType_Picture() {
		return (EReference)picturesTableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPictureType() {
		return pictureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_FileName() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_FilePath() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Name() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Author() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Bibliography() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Authorization() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Dpi() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Height() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Key() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_PictType() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Scale() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictureType_Width() {
		return (EAttribute)pictureTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPunctuationType() {
		return punctuationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPunctuationType_Value() {
		return (EAttribute)punctuationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPunctuationType_BtsCodes() {
		return (EAttribute)punctuationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPunctuationType_Comment() {
		return (EAttribute)punctuationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCArrangementType() {
		return tcArrangementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCArrangementType_TCPassport() {
		return (EReference)tcArrangementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCArrangementType_TCPicture() {
		return (EReference)tcArrangementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCArrangementType_TCNotebook() {
		return (EAttribute)tcArrangementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCArrangementType_Group() {
		return (EAttribute)tcArrangementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCArrangementType_TCArrangement() {
		return (EReference)tcArrangementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCArrangementType_TCObject() {
		return (EReference)tcArrangementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCArrangementType_Author() {
		return (EAttribute)tcArrangementTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCArrangementType_SortKey() {
		return (EAttribute)tcArrangementTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCArrangementType_TCName() {
		return (EAttribute)tcArrangementTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCCaptionType() {
		return tcCaptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCCaptionType_TCPassport() {
		return (EReference)tcCaptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCCaptionType_TCPicture() {
		return (EReference)tcCaptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCCaptionType_TCNotebook() {
		return (EAttribute)tcCaptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCCaptionType_Group() {
		return (EAttribute)tcCaptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCCaptionType_TCCaption() {
		return (EReference)tcCaptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCCaptionType_TCGroup() {
		return (EReference)tcCaptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCCaptionType_TCArrangement() {
		return (EReference)tcCaptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCCaptionType_TCObject() {
		return (EReference)tcCaptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCCaptionType_TCObjPart() {
		return (EReference)tcCaptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCCaptionType_TCText() {
		return (EReference)tcCaptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCCaptionType_Author() {
		return (EAttribute)tcCaptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCCaptionType_SortKey() {
		return (EAttribute)tcCaptionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCCaptionType_TCName() {
		return (EAttribute)tcCaptionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCGroupType() {
		return tcGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCGroupType_TCPassport() {
		return (EReference)tcGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCGroupType_TCPicture() {
		return (EReference)tcGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCGroupType_TCNotebook() {
		return (EAttribute)tcGroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCGroupType_Group() {
		return (EAttribute)tcGroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCGroupType_TCCaption() {
		return (EReference)tcGroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCGroupType_TCGroup() {
		return (EReference)tcGroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCGroupType_TCArrangement() {
		return (EReference)tcGroupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCGroupType_TCObject() {
		return (EReference)tcGroupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCGroupType_Author() {
		return (EAttribute)tcGroupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCGroupType_SortKey() {
		return (EAttribute)tcGroupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCGroupType_TCName() {
		return (EAttribute)tcGroupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCHeaderType() {
		return tcHeaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCHeaderType_Date() {
		return (EReference)tcHeaderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCHeaderType_Author() {
		return (EAttribute)tcHeaderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCHeaderType_Project() {
		return (EAttribute)tcHeaderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCHeaderType_Title() {
		return (EAttribute)tcHeaderTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCHeaderType_Comment() {
		return (EAttribute)tcHeaderTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCLocationType() {
		return tcLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCLocationType_ThsEntry() {
		return (EReference)tcLocationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCLocationType_MuseumNumber() {
		return (EAttribute)tcLocationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCLocationType_Comment() {
		return (EAttribute)tcLocationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCObjectType() {
		return tcObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjectType_TCPassport() {
		return (EReference)tcObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjectType_TCPicture() {
		return (EReference)tcObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjectType_TCNotebook() {
		return (EAttribute)tcObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjectType_Group() {
		return (EAttribute)tcObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjectType_TCCaption() {
		return (EReference)tcObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjectType_TCObject() {
		return (EReference)tcObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjectType_TCObjPart() {
		return (EReference)tcObjectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjectType_TCScene() {
		return (EReference)tcObjectTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjectType_TCSuperText() {
		return (EReference)tcObjectTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjectType_TCText() {
		return (EReference)tcObjectTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjectType_Author() {
		return (EAttribute)tcObjectTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjectType_Bearbeitungsstand() {
		return (EAttribute)tcObjectTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjectType_GIS() {
		return (EAttribute)tcObjectTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjectType_ObjectID() {
		return (EAttribute)tcObjectTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjectType_SortKey() {
		return (EAttribute)tcObjectTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjectType_TCName() {
		return (EAttribute)tcObjectTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCObjPartType() {
		return tcObjPartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjPartType_TCPassport() {
		return (EReference)tcObjPartTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjPartType_TCPicture() {
		return (EReference)tcObjPartTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjPartType_TCNotebook() {
		return (EAttribute)tcObjPartTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjPartType_Group() {
		return (EAttribute)tcObjPartTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjPartType_TCCaption() {
		return (EReference)tcObjPartTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjPartType_TCObject() {
		return (EReference)tcObjPartTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjPartType_TCObjPart() {
		return (EReference)tcObjPartTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjPartType_TCScene() {
		return (EReference)tcObjPartTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjPartType_TCSuperText() {
		return (EReference)tcObjPartTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCObjPartType_TCText() {
		return (EReference)tcObjPartTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjPartType_Author() {
		return (EAttribute)tcObjPartTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjPartType_SortKey() {
		return (EAttribute)tcObjPartTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCObjPartType_TCName() {
		return (EAttribute)tcObjPartTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCPassportType() {
		return tcPassportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_Definition() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_Protocol() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_Bibliography() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_Provenance() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_Date() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_ObjectType() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_Depiction() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_Script() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_Language() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_LangComment() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_Work() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_TextType() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_LineCount() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_Codes() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_WbFolder() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_WbSlips() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_Code1() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_Code2() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_BtsCodes() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_Comment() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_Notes() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_FullName() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPassportType_NameSort() {
		return (EAttribute)tcPassportTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPassportType_TCLocation() {
		return (EReference)tcPassportTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCPictureType() {
		return tcPictureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPictureType_Mixed() {
		return (EAttribute)tcPictureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPictureType_PictureType() {
		return (EAttribute)tcPictureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCSceneType() {
		return tcSceneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSceneType_TCPassport() {
		return (EReference)tcSceneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSceneType_TCPicture() {
		return (EReference)tcSceneTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSceneType_TCNotebook() {
		return (EAttribute)tcSceneTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSceneType_Group() {
		return (EAttribute)tcSceneTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSceneType_TCCaption() {
		return (EReference)tcSceneTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSceneType_TCScene() {
		return (EReference)tcSceneTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSceneType_TCSuperText() {
		return (EReference)tcSceneTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSceneType_TCText() {
		return (EReference)tcSceneTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSceneType_Author() {
		return (EAttribute)tcSceneTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSceneType_SortKey() {
		return (EAttribute)tcSceneTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSceneType_TCName() {
		return (EAttribute)tcSceneTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCSuperTextType() {
		return tcSuperTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSuperTextType_TCPassport() {
		return (EReference)tcSuperTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSuperTextType_TCPicture() {
		return (EReference)tcSuperTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSuperTextType_TCNotebook() {
		return (EAttribute)tcSuperTextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCSuperTextType_TCText() {
		return (EReference)tcSuperTextTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSuperTextType_Author() {
		return (EAttribute)tcSuperTextTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSuperTextType_SortKey() {
		return (EAttribute)tcSuperTextTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCSuperTextType_TCName() {
		return (EAttribute)tcSuperTextTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCTextType() {
		return tcTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCTextType_TCPassport() {
		return (EReference)tcTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCTextType_TCPicture() {
		return (EReference)tcTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCTextType_TCNotebook() {
		return (EAttribute)tcTextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCTextType_EgyTxt() {
		return (EReference)tcTextTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCTextType_Author() {
		return (EAttribute)tcTextTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCTextType_Bearbeitungsstand() {
		return (EAttribute)tcTextTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCTextType_SortKey() {
		return (EAttribute)tcTextTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCTextType_TCName() {
		return (EAttribute)tcTextTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCTextType_TextID() {
		return (EAttribute)tcTextTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThsEntryType() {
		return thsEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsEntryType_Term() {
		return (EAttribute)thsEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsEntryType_Hierarchy() {
		return (EAttribute)thsEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsEntryType_Comment() {
		return (EAttribute)thsEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsEntryType_Category() {
		return (EAttribute)thsEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsEntryType_Key() {
		return (EAttribute)thsEntryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThsEntryType_Type() {
		return (EAttribute)thsEntryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkType() {
		return workTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkType_Name() {
		return (EAttribute)workTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkType_Comment() {
		return (EAttribute)workTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkType_Thesaurus() {
		return (EAttribute)workTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkType_VersionCode() {
		return (EAttribute)workTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategoryType() {
		return categoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategoryType1() {
		return categoryType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLTypeType() {
		return lTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType1() {
		return typeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType2() {
		return typeType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType3() {
		return typeType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType4() {
		return typeType4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType5() {
		return typeType5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType6() {
		return typeType6EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType7() {
		return typeType7EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType8() {
		return typeType8EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCategoryTypeObject() {
		return categoryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCategoryTypeObject1() {
		return categoryTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLTypeTypeObject() {
		return lTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject1() {
		return typeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject2() {
		return typeTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject3() {
		return typeTypeObject3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject4() {
		return typeTypeObject4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject5() {
		return typeTypeObject5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject6() {
		return typeTypeObject6EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject7() {
		return typeTypeObject7EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject8() {
		return typeTypeObject8EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorpusDTDneuFactory getCorpusDTDneuFactory() {
		return (CorpusDTDneuFactory)getEFactoryInstance();
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
		bausteinPassageTypeEClass = createEClass(BAUSTEIN_PASSAGE_TYPE);
		createEAttribute(bausteinPassageTypeEClass, BAUSTEIN_PASSAGE_TYPE__BAUSTEIN);
		createEAttribute(bausteinPassageTypeEClass, BAUSTEIN_PASSAGE_TYPE__PASSAGE_ID);
		createEAttribute(bausteinPassageTypeEClass, BAUSTEIN_PASSAGE_TYPE__TYPE);

		dateThsTypeEClass = createEClass(DATE_THS_TYPE);
		createEAttribute(dateThsTypeEClass, DATE_THS_TYPE__TERM);
		createEAttribute(dateThsTypeEClass, DATE_THS_TYPE__LOWER_TERM);
		createEAttribute(dateThsTypeEClass, DATE_THS_TYPE__UPPER_TERM);
		createEAttribute(dateThsTypeEClass, DATE_THS_TYPE__TYPE);
		createEAttribute(dateThsTypeEClass, DATE_THS_TYPE__YEAR_FROM);
		createEAttribute(dateThsTypeEClass, DATE_THS_TYPE__YEAR_TO);

		dateTypeEClass = createEClass(DATE_TYPE);
		createEAttribute(dateTypeEClass, DATE_TYPE__MIXED);
		createEAttribute(dateTypeEClass, DATE_TYPE__GROUP);
		createEReference(dateTypeEClass, DATE_TYPE__DATE_THS);
		createEAttribute(dateTypeEClass, DATE_TYPE__CODE);
		createEAttribute(dateTypeEClass, DATE_TYPE__COMMENT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUTHOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BAUSTEIN_PASSAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BIBLIOGRAPHY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BTS_CODES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CODE1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CODE2);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CODES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_THS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DEFINITION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEPICTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_PUNCTUATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_SENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_SUB_TXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_SZENARIO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_TB1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_TB3_END);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_TB3_START);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_TXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_TXT_CORPUS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EGY_WORD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FILE_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FILE_PATH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FORM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FORMATTING_ELEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FULL_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GLOSSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GLOSSE_PASSAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GRAPHICS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HIERARCHY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LANG_COMMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LANGUAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LANGUAGE_PASSAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LEIPZIG_PASSAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINE_COUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LOWER_TERM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MUSEUM_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME_SORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOTE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NOTES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PASSPORT_DATA_ITEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PICTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PICTURES_TABLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROJECT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROTOCOL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROVENANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PUNCTUATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCRIPT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_ARRANGEMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_CAPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_GROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_HEADER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TC_NOTEBOOK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_OBJ_PART);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_PASSPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_PICTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_SCENE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_SUPER_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TC_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TERM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXT_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__THS_ENTRY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSLAT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSLATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__UPPER_TERM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WB_FOLDER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WB_SLIPS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WORK);

		egyPunctuationTypeEClass = createEClass(EGY_PUNCTUATION_TYPE);
		createEAttribute(egyPunctuationTypeEClass, EGY_PUNCTUATION_TYPE__VALUE);
		createEAttribute(egyPunctuationTypeEClass, EGY_PUNCTUATION_TYPE__BTS_CODES);
		createEAttribute(egyPunctuationTypeEClass, EGY_PUNCTUATION_TYPE__COMMENT);
		createEAttribute(egyPunctuationTypeEClass, EGY_PUNCTUATION_TYPE__TYPE);

		egySentTypeEClass = createEClass(EGY_SENT_TYPE);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__VALUE);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__TRANSLAT);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__BTS_CODES);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__COMMENT);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__GROUP);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__EGY_SENT);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__EGY_TB1);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__EGY_TB3_START);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__EGY_TB3_END);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__EGY_WORD);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__LINE_COUNT);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__NOTE);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__FORMATTING_ELEMENT);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__LANGUAGE_PASSAGE);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__BAUSTEIN_PASSAGE);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__LEIPZIG_PASSAGE);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__GLOSSE_PASSAGE);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__PUNCTUATION);
		createEReference(egySentTypeEClass, EGY_SENT_TYPE__EGY_PUNCTUATION);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__AUTHOR);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__LANGUAGE);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__LEIPZIG3_MODUL);
		createEAttribute(egySentTypeEClass, EGY_SENT_TYPE__TYPE);

		egySubTxtTypeEClass = createEClass(EGY_SUB_TXT_TYPE);
		createEAttribute(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__NAME);
		createEAttribute(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__BTS_CODES);
		createEAttribute(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__COMMENT);
		createEAttribute(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__GROUP);
		createEReference(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__EGY_SUB_TXT);
		createEReference(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__EGY_SENT);
		createEReference(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__EGY_TB1);
		createEReference(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__EGY_SZENARIO);
		createEReference(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__GLOSSE);
		createEReference(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__EGY_TB3_START);
		createEReference(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__EGY_TB3_END);
		createEAttribute(egySubTxtTypeEClass, EGY_SUB_TXT_TYPE__SORT_KEY);

		egySzenarioTypeEClass = createEClass(EGY_SZENARIO_TYPE);
		createEReference(egySzenarioTypeEClass, EGY_SZENARIO_TYPE__EGY_SENT);
		createEAttribute(egySzenarioTypeEClass, EGY_SZENARIO_TYPE__INTERNE_NUMMER);

		egyTB1TypeEClass = createEClass(EGY_TB1_TYPE);
		createEAttribute(egyTB1TypeEClass, EGY_TB1_TYPE__NAME);
		createEAttribute(egyTB1TypeEClass, EGY_TB1_TYPE__BTS_CODES);
		createEAttribute(egyTB1TypeEClass, EGY_TB1_TYPE__COMMENT);
		createEAttribute(egyTB1TypeEClass, EGY_TB1_TYPE__GROUP);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__EGY_SENT);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__EGY_TB1);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__EGY_TB3_START);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__EGY_TB3_END);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__EGY_WORD);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__LINE_COUNT);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__NOTE);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__FORMATTING_ELEMENT);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__PUNCTUATION);
		createEReference(egyTB1TypeEClass, EGY_TB1_TYPE__EGY_PUNCTUATION);

		egyTB3EndTypeEClass = createEClass(EGY_TB3_END_TYPE);
		createEAttribute(egyTB3EndTypeEClass, EGY_TB3_END_TYPE__NAME);
		createEAttribute(egyTB3EndTypeEClass, EGY_TB3_END_TYPE__BTS_CODES);
		createEAttribute(egyTB3EndTypeEClass, EGY_TB3_END_TYPE__COMMENT);
		createEAttribute(egyTB3EndTypeEClass, EGY_TB3_END_TYPE__ID);
		createEAttribute(egyTB3EndTypeEClass, EGY_TB3_END_TYPE__ID_REF);

		egyTB3StartTypeEClass = createEClass(EGY_TB3_START_TYPE);
		createEAttribute(egyTB3StartTypeEClass, EGY_TB3_START_TYPE__NAME);
		createEAttribute(egyTB3StartTypeEClass, EGY_TB3_START_TYPE__BTS_CODES);
		createEAttribute(egyTB3StartTypeEClass, EGY_TB3_START_TYPE__COMMENT);
		createEAttribute(egyTB3StartTypeEClass, EGY_TB3_START_TYPE__ID);
		createEAttribute(egyTB3StartTypeEClass, EGY_TB3_START_TYPE__ID_REF);

		egyTxtCorpusTypeEClass = createEClass(EGY_TXT_CORPUS_TYPE);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__TC_HEADER);
		createEAttribute(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__GROUP);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__PICTURES_TABLE);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__TC_CAPTION);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__TC_GROUP);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__TC_OBJECT);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__TC_OBJ_PART);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__TC_SCENE);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__TC_TEXT);
		createEReference(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__EGY_TXT);
		createEAttribute(egyTxtCorpusTypeEClass, EGY_TXT_CORPUS_TYPE__DTD_VERSION);

		egyTxtTypeEClass = createEClass(EGY_TXT_TYPE);
		createEAttribute(egyTxtTypeEClass, EGY_TXT_TYPE__NAME);
		createEAttribute(egyTxtTypeEClass, EGY_TXT_TYPE__BTS_CODES);
		createEAttribute(egyTxtTypeEClass, EGY_TXT_TYPE__COMMENT);
		createEAttribute(egyTxtTypeEClass, EGY_TXT_TYPE__GROUP);
		createEReference(egyTxtTypeEClass, EGY_TXT_TYPE__EGY_SUB_TXT);
		createEReference(egyTxtTypeEClass, EGY_TXT_TYPE__EGY_SENT);
		createEReference(egyTxtTypeEClass, EGY_TXT_TYPE__EGY_TB1);
		createEReference(egyTxtTypeEClass, EGY_TXT_TYPE__EGY_SZENARIO);
		createEReference(egyTxtTypeEClass, EGY_TXT_TYPE__GLOSSE);
		createEReference(egyTxtTypeEClass, EGY_TXT_TYPE__EGY_TB3_START);
		createEReference(egyTxtTypeEClass, EGY_TXT_TYPE__EGY_TB3_END);

		egyWordTypeEClass = createEClass(EGY_WORD_TYPE);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__FORM);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__TRANSLAT);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__GRAPHICS);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__BTS_CODES);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__COMMENT);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__AUTHOR);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__CONNECT);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__FKEY);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__LEIPZIG3_MODUL);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__LKEY);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__LTYPE);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__REIHENFOLGE);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__REIHENFOLGE_ID);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__SCRIPT);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__STATUS);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__WCHR);
		createEAttribute(egyWordTypeEClass, EGY_WORD_TYPE__WTYPE);

		formattingElementTypeEClass = createEClass(FORMATTING_ELEMENT_TYPE);
		createEAttribute(formattingElementTypeEClass, FORMATTING_ELEMENT_TYPE__VALUE);
		createEAttribute(formattingElementTypeEClass, FORMATTING_ELEMENT_TYPE__BTS_CODES);
		createEAttribute(formattingElementTypeEClass, FORMATTING_ELEMENT_TYPE__TYPE);

		glossePassageTypeEClass = createEClass(GLOSSE_PASSAGE_TYPE);
		createEAttribute(glossePassageTypeEClass, GLOSSE_PASSAGE_TYPE__PASSAGE_ID);
		createEAttribute(glossePassageTypeEClass, GLOSSE_PASSAGE_TYPE__SCRIPT);
		createEAttribute(glossePassageTypeEClass, GLOSSE_PASSAGE_TYPE__TYPE);

		glosseTypeEClass = createEClass(GLOSSE_TYPE);
		createEAttribute(glosseTypeEClass, GLOSSE_TYPE__GROUP);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__EGY_SENT);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__EGY_TB1);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__EGY_TB3_START);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__EGY_TB3_END);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__EGY_WORD);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__LINE_COUNT);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__NOTE);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__FORMATTING_ELEMENT);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__LANGUAGE_PASSAGE);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__BAUSTEIN_PASSAGE);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__LEIPZIG_PASSAGE);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__GLOSSE_PASSAGE);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__PUNCTUATION);
		createEReference(glosseTypeEClass, GLOSSE_TYPE__EGY_PUNCTUATION);
		createEAttribute(glosseTypeEClass, GLOSSE_TYPE__PASSAGE_ID);

		languagePassageTypeEClass = createEClass(LANGUAGE_PASSAGE_TYPE);
		createEAttribute(languagePassageTypeEClass, LANGUAGE_PASSAGE_TYPE__LANGUAGE);
		createEAttribute(languagePassageTypeEClass, LANGUAGE_PASSAGE_TYPE__PASSAGE_ID);
		createEAttribute(languagePassageTypeEClass, LANGUAGE_PASSAGE_TYPE__TYPE);

		leipzigPassageTypeEClass = createEClass(LEIPZIG_PASSAGE_TYPE);
		createEAttribute(leipzigPassageTypeEClass, LEIPZIG_PASSAGE_TYPE__AUSZEICHNUNG);
		createEAttribute(leipzigPassageTypeEClass, LEIPZIG_PASSAGE_TYPE__PASSAGE_ID);
		createEAttribute(leipzigPassageTypeEClass, LEIPZIG_PASSAGE_TYPE__TYPE);

		lineCountTypeEClass = createEClass(LINE_COUNT_TYPE);
		createEAttribute(lineCountTypeEClass, LINE_COUNT_TYPE__MIXED);
		createEAttribute(lineCountTypeEClass, LINE_COUNT_TYPE__GROUP);
		createEAttribute(lineCountTypeEClass, LINE_COUNT_TYPE__VALUE);
		createEAttribute(lineCountTypeEClass, LINE_COUNT_TYPE__COMMENT);

		noteTypeEClass = createEClass(NOTE_TYPE);
		createEAttribute(noteTypeEClass, NOTE_TYPE__VALUE);
		createEAttribute(noteTypeEClass, NOTE_TYPE__BTS_CODES);
		createEAttribute(noteTypeEClass, NOTE_TYPE__COMMENT);

		passportDataItemEClass = createEClass(PASSPORT_DATA_ITEM);
		createEReference(passportDataItemEClass, PASSPORT_DATA_ITEM__PASSPORT_DATA_ITEM);

		passportDataItemTypeEClass = createEClass(PASSPORT_DATA_ITEM_TYPE);
		createEReference(passportDataItemTypeEClass, PASSPORT_DATA_ITEM_TYPE__THS_ENTRY);
		createEAttribute(passportDataItemTypeEClass, PASSPORT_DATA_ITEM_TYPE__CODE);
		createEAttribute(passportDataItemTypeEClass, PASSPORT_DATA_ITEM_TYPE__COMMENT);
		createEAttribute(passportDataItemTypeEClass, PASSPORT_DATA_ITEM_TYPE__CATEGORY);

		picturesTableTypeEClass = createEClass(PICTURES_TABLE_TYPE);
		createEReference(picturesTableTypeEClass, PICTURES_TABLE_TYPE__PICTURE);

		pictureTypeEClass = createEClass(PICTURE_TYPE);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__FILE_NAME);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__FILE_PATH);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__NAME);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__AUTHOR);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__BIBLIOGRAPHY);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__AUTHORIZATION);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__DPI);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__HEIGHT);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__KEY);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__PICT_TYPE);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__SCALE);
		createEAttribute(pictureTypeEClass, PICTURE_TYPE__WIDTH);

		punctuationTypeEClass = createEClass(PUNCTUATION_TYPE);
		createEAttribute(punctuationTypeEClass, PUNCTUATION_TYPE__VALUE);
		createEAttribute(punctuationTypeEClass, PUNCTUATION_TYPE__BTS_CODES);
		createEAttribute(punctuationTypeEClass, PUNCTUATION_TYPE__COMMENT);

		tcArrangementTypeEClass = createEClass(TC_ARRANGEMENT_TYPE);
		createEReference(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__TC_PASSPORT);
		createEReference(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__TC_PICTURE);
		createEAttribute(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__TC_NOTEBOOK);
		createEAttribute(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__GROUP);
		createEReference(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__TC_ARRANGEMENT);
		createEReference(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__TC_OBJECT);
		createEAttribute(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__AUTHOR);
		createEAttribute(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__SORT_KEY);
		createEAttribute(tcArrangementTypeEClass, TC_ARRANGEMENT_TYPE__TC_NAME);

		tcCaptionTypeEClass = createEClass(TC_CAPTION_TYPE);
		createEReference(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_PASSPORT);
		createEReference(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_PICTURE);
		createEAttribute(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_NOTEBOOK);
		createEAttribute(tcCaptionTypeEClass, TC_CAPTION_TYPE__GROUP);
		createEReference(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_CAPTION);
		createEReference(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_GROUP);
		createEReference(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_ARRANGEMENT);
		createEReference(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_OBJECT);
		createEReference(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_OBJ_PART);
		createEReference(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_TEXT);
		createEAttribute(tcCaptionTypeEClass, TC_CAPTION_TYPE__AUTHOR);
		createEAttribute(tcCaptionTypeEClass, TC_CAPTION_TYPE__SORT_KEY);
		createEAttribute(tcCaptionTypeEClass, TC_CAPTION_TYPE__TC_NAME);

		tcGroupTypeEClass = createEClass(TC_GROUP_TYPE);
		createEReference(tcGroupTypeEClass, TC_GROUP_TYPE__TC_PASSPORT);
		createEReference(tcGroupTypeEClass, TC_GROUP_TYPE__TC_PICTURE);
		createEAttribute(tcGroupTypeEClass, TC_GROUP_TYPE__TC_NOTEBOOK);
		createEAttribute(tcGroupTypeEClass, TC_GROUP_TYPE__GROUP);
		createEReference(tcGroupTypeEClass, TC_GROUP_TYPE__TC_CAPTION);
		createEReference(tcGroupTypeEClass, TC_GROUP_TYPE__TC_GROUP);
		createEReference(tcGroupTypeEClass, TC_GROUP_TYPE__TC_ARRANGEMENT);
		createEReference(tcGroupTypeEClass, TC_GROUP_TYPE__TC_OBJECT);
		createEAttribute(tcGroupTypeEClass, TC_GROUP_TYPE__AUTHOR);
		createEAttribute(tcGroupTypeEClass, TC_GROUP_TYPE__SORT_KEY);
		createEAttribute(tcGroupTypeEClass, TC_GROUP_TYPE__TC_NAME);

		tcHeaderTypeEClass = createEClass(TC_HEADER_TYPE);
		createEReference(tcHeaderTypeEClass, TC_HEADER_TYPE__DATE);
		createEAttribute(tcHeaderTypeEClass, TC_HEADER_TYPE__AUTHOR);
		createEAttribute(tcHeaderTypeEClass, TC_HEADER_TYPE__PROJECT);
		createEAttribute(tcHeaderTypeEClass, TC_HEADER_TYPE__TITLE);
		createEAttribute(tcHeaderTypeEClass, TC_HEADER_TYPE__COMMENT);

		tcLocationTypeEClass = createEClass(TC_LOCATION_TYPE);
		createEReference(tcLocationTypeEClass, TC_LOCATION_TYPE__THS_ENTRY);
		createEAttribute(tcLocationTypeEClass, TC_LOCATION_TYPE__MUSEUM_NUMBER);
		createEAttribute(tcLocationTypeEClass, TC_LOCATION_TYPE__COMMENT);

		tcObjectTypeEClass = createEClass(TC_OBJECT_TYPE);
		createEReference(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_PASSPORT);
		createEReference(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_PICTURE);
		createEAttribute(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_NOTEBOOK);
		createEAttribute(tcObjectTypeEClass, TC_OBJECT_TYPE__GROUP);
		createEReference(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_CAPTION);
		createEReference(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_OBJECT);
		createEReference(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_OBJ_PART);
		createEReference(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_SCENE);
		createEReference(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_SUPER_TEXT);
		createEReference(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_TEXT);
		createEAttribute(tcObjectTypeEClass, TC_OBJECT_TYPE__AUTHOR);
		createEAttribute(tcObjectTypeEClass, TC_OBJECT_TYPE__BEARBEITUNGSSTAND);
		createEAttribute(tcObjectTypeEClass, TC_OBJECT_TYPE__GIS);
		createEAttribute(tcObjectTypeEClass, TC_OBJECT_TYPE__OBJECT_ID);
		createEAttribute(tcObjectTypeEClass, TC_OBJECT_TYPE__SORT_KEY);
		createEAttribute(tcObjectTypeEClass, TC_OBJECT_TYPE__TC_NAME);

		tcObjPartTypeEClass = createEClass(TC_OBJ_PART_TYPE);
		createEReference(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_PASSPORT);
		createEReference(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_PICTURE);
		createEAttribute(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_NOTEBOOK);
		createEAttribute(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__GROUP);
		createEReference(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_CAPTION);
		createEReference(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_OBJECT);
		createEReference(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_OBJ_PART);
		createEReference(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_SCENE);
		createEReference(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_SUPER_TEXT);
		createEReference(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_TEXT);
		createEAttribute(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__AUTHOR);
		createEAttribute(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__SORT_KEY);
		createEAttribute(tcObjPartTypeEClass, TC_OBJ_PART_TYPE__TC_NAME);

		tcPassportTypeEClass = createEClass(TC_PASSPORT_TYPE);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__DEFINITION);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__PROTOCOL);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__BIBLIOGRAPHY);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__PROVENANCE);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__DATE);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__OBJECT_TYPE);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__DEPICTION);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__SCRIPT);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__LANGUAGE);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__LANG_COMMENT);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__WORK);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__TEXT_TYPE);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__LINE_COUNT);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__CODES);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__WB_FOLDER);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__WB_SLIPS);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__CODE1);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__CODE2);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__BTS_CODES);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__COMMENT);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__NOTES);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__FULL_NAME);
		createEAttribute(tcPassportTypeEClass, TC_PASSPORT_TYPE__NAME_SORT);
		createEReference(tcPassportTypeEClass, TC_PASSPORT_TYPE__TC_LOCATION);

		tcPictureTypeEClass = createEClass(TC_PICTURE_TYPE);
		createEAttribute(tcPictureTypeEClass, TC_PICTURE_TYPE__MIXED);
		createEAttribute(tcPictureTypeEClass, TC_PICTURE_TYPE__PICTURE_TYPE);

		tcSceneTypeEClass = createEClass(TC_SCENE_TYPE);
		createEReference(tcSceneTypeEClass, TC_SCENE_TYPE__TC_PASSPORT);
		createEReference(tcSceneTypeEClass, TC_SCENE_TYPE__TC_PICTURE);
		createEAttribute(tcSceneTypeEClass, TC_SCENE_TYPE__TC_NOTEBOOK);
		createEAttribute(tcSceneTypeEClass, TC_SCENE_TYPE__GROUP);
		createEReference(tcSceneTypeEClass, TC_SCENE_TYPE__TC_CAPTION);
		createEReference(tcSceneTypeEClass, TC_SCENE_TYPE__TC_SCENE);
		createEReference(tcSceneTypeEClass, TC_SCENE_TYPE__TC_SUPER_TEXT);
		createEReference(tcSceneTypeEClass, TC_SCENE_TYPE__TC_TEXT);
		createEAttribute(tcSceneTypeEClass, TC_SCENE_TYPE__AUTHOR);
		createEAttribute(tcSceneTypeEClass, TC_SCENE_TYPE__SORT_KEY);
		createEAttribute(tcSceneTypeEClass, TC_SCENE_TYPE__TC_NAME);

		tcSuperTextTypeEClass = createEClass(TC_SUPER_TEXT_TYPE);
		createEReference(tcSuperTextTypeEClass, TC_SUPER_TEXT_TYPE__TC_PASSPORT);
		createEReference(tcSuperTextTypeEClass, TC_SUPER_TEXT_TYPE__TC_PICTURE);
		createEAttribute(tcSuperTextTypeEClass, TC_SUPER_TEXT_TYPE__TC_NOTEBOOK);
		createEReference(tcSuperTextTypeEClass, TC_SUPER_TEXT_TYPE__TC_TEXT);
		createEAttribute(tcSuperTextTypeEClass, TC_SUPER_TEXT_TYPE__AUTHOR);
		createEAttribute(tcSuperTextTypeEClass, TC_SUPER_TEXT_TYPE__SORT_KEY);
		createEAttribute(tcSuperTextTypeEClass, TC_SUPER_TEXT_TYPE__TC_NAME);

		tcTextTypeEClass = createEClass(TC_TEXT_TYPE);
		createEReference(tcTextTypeEClass, TC_TEXT_TYPE__TC_PASSPORT);
		createEReference(tcTextTypeEClass, TC_TEXT_TYPE__TC_PICTURE);
		createEAttribute(tcTextTypeEClass, TC_TEXT_TYPE__TC_NOTEBOOK);
		createEReference(tcTextTypeEClass, TC_TEXT_TYPE__EGY_TXT);
		createEAttribute(tcTextTypeEClass, TC_TEXT_TYPE__AUTHOR);
		createEAttribute(tcTextTypeEClass, TC_TEXT_TYPE__BEARBEITUNGSSTAND);
		createEAttribute(tcTextTypeEClass, TC_TEXT_TYPE__SORT_KEY);
		createEAttribute(tcTextTypeEClass, TC_TEXT_TYPE__TC_NAME);
		createEAttribute(tcTextTypeEClass, TC_TEXT_TYPE__TEXT_ID);

		thsEntryTypeEClass = createEClass(THS_ENTRY_TYPE);
		createEAttribute(thsEntryTypeEClass, THS_ENTRY_TYPE__TERM);
		createEAttribute(thsEntryTypeEClass, THS_ENTRY_TYPE__HIERARCHY);
		createEAttribute(thsEntryTypeEClass, THS_ENTRY_TYPE__COMMENT);
		createEAttribute(thsEntryTypeEClass, THS_ENTRY_TYPE__CATEGORY);
		createEAttribute(thsEntryTypeEClass, THS_ENTRY_TYPE__KEY);
		createEAttribute(thsEntryTypeEClass, THS_ENTRY_TYPE__TYPE);

		workTypeEClass = createEClass(WORK_TYPE);
		createEAttribute(workTypeEClass, WORK_TYPE__NAME);
		createEAttribute(workTypeEClass, WORK_TYPE__COMMENT);
		createEAttribute(workTypeEClass, WORK_TYPE__THESAURUS);
		createEAttribute(workTypeEClass, WORK_TYPE__VERSION_CODE);

		// Create enums
		categoryTypeEEnum = createEEnum(CATEGORY_TYPE);
		categoryType1EEnum = createEEnum(CATEGORY_TYPE1);
		lTypeTypeEEnum = createEEnum(LTYPE_TYPE);
		typeTypeEEnum = createEEnum(TYPE_TYPE);
		typeType1EEnum = createEEnum(TYPE_TYPE1);
		typeType2EEnum = createEEnum(TYPE_TYPE2);
		typeType3EEnum = createEEnum(TYPE_TYPE3);
		typeType4EEnum = createEEnum(TYPE_TYPE4);
		typeType5EEnum = createEEnum(TYPE_TYPE5);
		typeType6EEnum = createEEnum(TYPE_TYPE6);
		typeType7EEnum = createEEnum(TYPE_TYPE7);
		typeType8EEnum = createEEnum(TYPE_TYPE8);

		// Create data types
		categoryTypeObjectEDataType = createEDataType(CATEGORY_TYPE_OBJECT);
		categoryTypeObject1EDataType = createEDataType(CATEGORY_TYPE_OBJECT1);
		lTypeTypeObjectEDataType = createEDataType(LTYPE_TYPE_OBJECT);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
		typeTypeObject1EDataType = createEDataType(TYPE_TYPE_OBJECT1);
		typeTypeObject2EDataType = createEDataType(TYPE_TYPE_OBJECT2);
		typeTypeObject3EDataType = createEDataType(TYPE_TYPE_OBJECT3);
		typeTypeObject4EDataType = createEDataType(TYPE_TYPE_OBJECT4);
		typeTypeObject5EDataType = createEDataType(TYPE_TYPE_OBJECT5);
		typeTypeObject6EDataType = createEDataType(TYPE_TYPE_OBJECT6);
		typeTypeObject7EDataType = createEDataType(TYPE_TYPE_OBJECT7);
		typeTypeObject8EDataType = createEDataType(TYPE_TYPE_OBJECT8);
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
		initEClass(bausteinPassageTypeEClass, BausteinPassageType.class, "BausteinPassageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBausteinPassageType_Baustein(), theXMLTypePackage.getAnySimpleType(), "baustein", null, 1, 1, BausteinPassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBausteinPassageType_PassageID(), theXMLTypePackage.getNMTOKEN(), "passageID", null, 0, 1, BausteinPassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBausteinPassageType_Type(), this.getTypeType8(), "type", null, 1, 1, BausteinPassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateThsTypeEClass, DateThsType.class, "DateThsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateThsType_Term(), theXMLTypePackage.getString(), "term", null, 0, 1, DateThsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateThsType_LowerTerm(), theXMLTypePackage.getString(), "lowerTerm", null, 0, 1, DateThsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateThsType_UpperTerm(), theXMLTypePackage.getString(), "upperTerm", null, 0, 1, DateThsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateThsType_Type(), this.getTypeType7(), "type", null, 1, 1, DateThsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateThsType_YearFrom(), theXMLTypePackage.getAnySimpleType(), "yearFrom", null, 1, 1, DateThsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateThsType_YearTo(), theXMLTypePackage.getAnySimpleType(), "yearTo", null, 1, 1, DateThsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateType_DateThs(), this.getDateThsType(), null, "dateThs", null, 0, -1, DateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateType_Code(), theXMLTypePackage.getString(), "code", null, 0, -1, DateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, -1, DateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Author(), theXMLTypePackage.getString(), "author", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BausteinPassage(), this.getBausteinPassageType(), null, "bausteinPassage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Bibliography(), theXMLTypePackage.getString(), "bibliography", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Code(), theXMLTypePackage.getString(), "code", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Code1(), theXMLTypePackage.getString(), "code1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Code2(), theXMLTypePackage.getString(), "code2", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Codes(), theXMLTypePackage.getString(), "codes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Comment(), theXMLTypePackage.getString(), "comment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Date(), this.getDateType(), null, "date", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateThs(), this.getDateThsType(), null, "dateThs", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Definition(), theXMLTypePackage.getString(), "definition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Depiction(), this.getPassportDataItem(), null, "depiction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgyPunctuation(), this.getEgyPunctuationType(), null, "egyPunctuation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgySent(), this.getEgySentType(), null, "egySent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgySubTxt(), this.getEgySubTxtType(), null, "egySubTxt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgySzenario(), this.getEgySzenarioType(), null, "egySzenario", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgyTB1(), this.getEgyTB1Type(), null, "egyTB1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgyTB3End(), this.getEgyTB3EndType(), null, "egyTB3End", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgyTB3Start(), this.getEgyTB3StartType(), null, "egyTB3Start", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgyTxt(), this.getEgyTxtType(), null, "egyTxt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgyTxtCorpus(), this.getEgyTxtCorpusType(), null, "egyTxtCorpus", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EgyWord(), this.getEgyWordType(), null, "egyWord", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FilePath(), theXMLTypePackage.getString(), "filePath", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Form(), theXMLTypePackage.getString(), "form", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FormattingElement(), this.getFormattingElementType(), null, "formattingElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FullName(), theXMLTypePackage.getString(), "fullName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Glosse(), this.getGlosseType(), null, "glosse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GlossePassage(), this.getGlossePassageType(), null, "glossePassage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Graphics(), theXMLTypePackage.getString(), "graphics", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Hierarchy(), theXMLTypePackage.getString(), "hierarchy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LangComment(), theXMLTypePackage.getString(), "langComment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Language(), this.getPassportDataItem(), null, "language", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LanguagePassage(), this.getLanguagePassageType(), null, "languagePassage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LeipzigPassage(), this.getLeipzigPassageType(), null, "leipzigPassage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LineCount(), this.getLineCountType(), null, "lineCount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LowerTerm(), theXMLTypePackage.getString(), "lowerTerm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MuseumNumber(), theXMLTypePackage.getString(), "museumNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theXMLTypePackage.getString(), "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NameSort(), theXMLTypePackage.getString(), "nameSort", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Note(), this.getNoteType(), null, "note", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Notes(), theXMLTypePackage.getString(), "notes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ObjectType(), this.getPassportDataItem(), null, "objectType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PassportDataItem(), this.getPassportDataItemType(), null, "passportDataItem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Picture(), this.getPictureType(), null, "picture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PicturesTable(), this.getPicturesTableType(), null, "picturesTable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Project(), theXMLTypePackage.getString(), "project", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Protocol(), theXMLTypePackage.getString(), "protocol", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Provenance(), this.getPassportDataItem(), null, "provenance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Punctuation(), this.getPunctuationType(), null, "punctuation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Script(), this.getPassportDataItem(), null, "script", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCArrangement(), this.getTCArrangementType(), null, "tCArrangement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCCaption(), this.getTCCaptionType(), null, "tCCaption", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCGroup(), this.getTCGroupType(), null, "tCGroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCHeader(), this.getTCHeaderType(), null, "tCHeader", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCLocation(), this.getTCLocationType(), null, "tCLocation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCObject(), this.getTCObjectType(), null, "tCObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCObjPart(), this.getTCObjPartType(), null, "tCObjPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCScene(), this.getTCSceneType(), null, "tCScene", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCSuperText(), this.getTCSuperTextType(), null, "tCSuperText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TCText(), this.getTCTextType(), null, "tCText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Term(), theXMLTypePackage.getString(), "term", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TextType(), this.getPassportDataItem(), null, "textType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ThsEntry(), this.getThsEntryType(), null, "thsEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Title(), theXMLTypePackage.getString(), "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Translat(), theXMLTypePackage.getString(), "translat", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Translation(), theXMLTypePackage.getString(), "translation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UpperTerm(), theXMLTypePackage.getString(), "upperTerm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Value(), theXMLTypePackage.getString(), "value", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_WbFolder(), theXMLTypePackage.getString(), "wbFolder", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_WbSlips(), theXMLTypePackage.getString(), "wbSlips", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Work(), this.getWorkType(), null, "work", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(egyPunctuationTypeEClass, EgyPunctuationType.class, "EgyPunctuationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEgyPunctuationType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, EgyPunctuationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyPunctuationType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, EgyPunctuationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyPunctuationType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EgyPunctuationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyPunctuationType_Type(), this.getTypeType6(), "type", null, 0, 1, EgyPunctuationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(egySentTypeEClass, EgySentType.class, "EgySentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEgySentType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySentType_Translat(), theXMLTypePackage.getString(), "translat", null, 0, 1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySentType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySentType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySentType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_EgySent(), this.getEgySentType(), null, "egySent", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_EgyTB1(), this.getEgyTB1Type(), null, "egyTB1", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_EgyTB3Start(), this.getEgyTB3StartType(), null, "egyTB3Start", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_EgyTB3End(), this.getEgyTB3EndType(), null, "egyTB3End", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_EgyWord(), this.getEgyWordType(), null, "egyWord", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_LineCount(), this.getLineCountType(), null, "lineCount", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_Note(), this.getNoteType(), null, "note", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_FormattingElement(), this.getFormattingElementType(), null, "formattingElement", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_LanguagePassage(), this.getLanguagePassageType(), null, "languagePassage", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_BausteinPassage(), this.getBausteinPassageType(), null, "bausteinPassage", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_LeipzigPassage(), this.getLeipzigPassageType(), null, "leipzigPassage", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_GlossePassage(), this.getGlossePassageType(), null, "glossePassage", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_Punctuation(), this.getPunctuationType(), null, "punctuation", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySentType_EgyPunctuation(), this.getEgyPunctuationType(), null, "egyPunctuation", null, 0, -1, EgySentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySentType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySentType_Language(), theXMLTypePackage.getAnySimpleType(), "language", null, 0, 1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySentType_Leipzig3Modul(), theXMLTypePackage.getAnySimpleType(), "leipzig3Modul", null, 0, 1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySentType_Type(), this.getTypeType5(), "type", null, 1, 1, EgySentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(egySubTxtTypeEClass, EgySubTxtType.class, "EgySubTxtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEgySubTxtType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EgySubTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySubTxtType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, EgySubTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySubTxtType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EgySubTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySubTxtType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EgySubTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEgySubTxtType_EgySubTxt(), this.getEgySubTxtType(), null, "egySubTxt", null, 0, -1, EgySubTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySubTxtType_EgySent(), this.getEgySentType(), null, "egySent", null, 0, -1, EgySubTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySubTxtType_EgyTB1(), this.getEgyTB1Type(), null, "egyTB1", null, 0, -1, EgySubTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySubTxtType_EgySzenario(), this.getEgySzenarioType(), null, "egySzenario", null, 0, -1, EgySubTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySubTxtType_Glosse(), this.getGlosseType(), null, "glosse", null, 0, -1, EgySubTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySubTxtType_EgyTB3Start(), this.getEgyTB3StartType(), null, "egyTB3Start", null, 0, -1, EgySubTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgySubTxtType_EgyTB3End(), this.getEgyTB3EndType(), null, "egyTB3End", null, 0, -1, EgySubTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySubTxtType_SortKey(), ecorePackage.getEString(), "SortKey", null, 0, 1, EgySubTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(egySzenarioTypeEClass, EgySzenarioType.class, "EgySzenarioType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEgySzenarioType_EgySent(), this.getEgySentType(), null, "egySent", null, 0, -1, EgySzenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgySzenarioType_InterneNummer(), theXMLTypePackage.getAnySimpleType(), "interneNummer", null, 0, 1, EgySzenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(egyTB1TypeEClass, EgyTB1Type.class, "EgyTB1Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEgyTB1Type_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EgyTB1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB1Type_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, EgyTB1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB1Type_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EgyTB1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB1Type_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EgyTB1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_EgySent(), this.getEgySentType(), null, "egySent", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_EgyTB1(), this.getEgyTB1Type(), null, "egyTB1", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_EgyTB3Start(), this.getEgyTB3StartType(), null, "egyTB3Start", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_EgyTB3End(), this.getEgyTB3EndType(), null, "egyTB3End", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_EgyWord(), this.getEgyWordType(), null, "egyWord", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_LineCount(), this.getLineCountType(), null, "lineCount", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_Note(), this.getNoteType(), null, "note", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_FormattingElement(), this.getFormattingElementType(), null, "formattingElement", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_Punctuation(), this.getPunctuationType(), null, "punctuation", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTB1Type_EgyPunctuation(), this.getEgyPunctuationType(), null, "egyPunctuation", null, 0, -1, EgyTB1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(egyTB3EndTypeEClass, EgyTB3EndType.class, "EgyTB3EndType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEgyTB3EndType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EgyTB3EndType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB3EndType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, EgyTB3EndType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB3EndType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EgyTB3EndType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB3EndType_Id(), theXMLTypePackage.getNMTOKEN(), "id", null, 1, 1, EgyTB3EndType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB3EndType_IdRef(), theXMLTypePackage.getNMTOKEN(), "idRef", null, 1, 1, EgyTB3EndType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(egyTB3StartTypeEClass, EgyTB3StartType.class, "EgyTB3StartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEgyTB3StartType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EgyTB3StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB3StartType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, EgyTB3StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB3StartType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EgyTB3StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB3StartType_Id(), theXMLTypePackage.getNMTOKEN(), "id", null, 1, 1, EgyTB3StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTB3StartType_IdRef(), theXMLTypePackage.getNMTOKEN(), "idRef", null, 1, 1, EgyTB3StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(egyTxtCorpusTypeEClass, EgyTxtCorpusType.class, "EgyTxtCorpusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEgyTxtCorpusType_TCHeader(), this.getTCHeaderType(), null, "tCHeader", null, 1, 1, EgyTxtCorpusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTxtCorpusType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EgyTxtCorpusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_PicturesTable(), this.getPicturesTableType(), null, "picturesTable", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_TCCaption(), this.getTCCaptionType(), null, "tCCaption", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_TCGroup(), this.getTCGroupType(), null, "tCGroup", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_TCArrangement(), this.getTCArrangementType(), null, "tCArrangement", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_TCObject(), this.getTCObjectType(), null, "tCObject", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_TCObjPart(), this.getTCObjPartType(), null, "tCObjPart", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_TCScene(), this.getTCSceneType(), null, "tCScene", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_TCText(), this.getTCTextType(), null, "tCText", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtCorpusType_EgyTxt(), this.getEgyTxtType(), null, "egyTxt", null, 0, -1, EgyTxtCorpusType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTxtCorpusType_DTDVersion(), theXMLTypePackage.getAnySimpleType(), "dTDVersion", null, 1, 1, EgyTxtCorpusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(egyTxtTypeEClass, EgyTxtType.class, "EgyTxtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEgyTxtType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EgyTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTxtType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, EgyTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTxtType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EgyTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyTxtType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EgyTxtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtType_EgySubTxt(), this.getEgySubTxtType(), null, "egySubTxt", null, 0, -1, EgyTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtType_EgySent(), this.getEgySentType(), null, "egySent", null, 0, -1, EgyTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtType_EgyTB1(), this.getEgyTB1Type(), null, "egyTB1", null, 0, -1, EgyTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtType_EgySzenario(), this.getEgySzenarioType(), null, "egySzenario", null, 0, -1, EgyTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtType_Glosse(), this.getGlosseType(), null, "glosse", null, 0, -1, EgyTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtType_EgyTB3Start(), this.getEgyTB3StartType(), null, "egyTB3Start", null, 0, -1, EgyTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEgyTxtType_EgyTB3End(), this.getEgyTB3EndType(), null, "egyTB3End", null, 0, -1, EgyTxtType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(egyWordTypeEClass, EgyWordType.class, "EgyWordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEgyWordType_Form(), theXMLTypePackage.getString(), "form", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Translat(), theXMLTypePackage.getString(), "translat", null, 0, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Graphics(), theXMLTypePackage.getString(), "graphics", null, 0, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Connect(), theXMLTypePackage.getNMTOKEN(), "connect", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_FKey(), theXMLTypePackage.getNMTOKEN(), "fKey", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Leipzig3Modul(), theXMLTypePackage.getAnySimpleType(), "leipzig3Modul", null, 0, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_LKey(), theXMLTypePackage.getNMTOKEN(), "lKey", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_LType(), this.getLTypeType(), "lType", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Reihenfolge(), theXMLTypePackage.getNMTOKEN(), "reihenfolge", null, 0, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_ReihenfolgeID(), theXMLTypePackage.getNMTOKEN(), "reihenfolgeID", null, 0, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Script(), theXMLTypePackage.getAnySimpleType(), "script", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_Status(), theXMLTypePackage.getAnySimpleType(), "status", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_WChr(), theXMLTypePackage.getNMTOKEN(), "wChr", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEgyWordType_WType(), theXMLTypePackage.getNMTOKEN(), "wType", null, 1, 1, EgyWordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formattingElementTypeEClass, FormattingElementType.class, "FormattingElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormattingElementType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, FormattingElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormattingElementType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, FormattingElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormattingElementType_Type(), this.getTypeType(), "type", null, 0, 1, FormattingElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glossePassageTypeEClass, GlossePassageType.class, "GlossePassageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlossePassageType_PassageID(), theXMLTypePackage.getNMTOKEN(), "passageID", null, 0, 1, GlossePassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossePassageType_Script(), theXMLTypePackage.getAnySimpleType(), "script", null, 1, 1, GlossePassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossePassageType_Type(), this.getTypeType3(), "type", null, 1, 1, GlossePassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glosseTypeEClass, GlosseType.class, "GlosseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlosseType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, GlosseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_EgySent(), this.getEgySentType(), null, "egySent", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_EgyTB1(), this.getEgyTB1Type(), null, "egyTB1", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_EgyTB3Start(), this.getEgyTB3StartType(), null, "egyTB3Start", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_EgyTB3End(), this.getEgyTB3EndType(), null, "egyTB3End", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_EgyWord(), this.getEgyWordType(), null, "egyWord", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_LineCount(), this.getLineCountType(), null, "lineCount", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_Note(), this.getNoteType(), null, "note", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_FormattingElement(), this.getFormattingElementType(), null, "formattingElement", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_LanguagePassage(), this.getLanguagePassageType(), null, "languagePassage", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_BausteinPassage(), this.getBausteinPassageType(), null, "bausteinPassage", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_LeipzigPassage(), this.getLeipzigPassageType(), null, "leipzigPassage", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_GlossePassage(), this.getGlossePassageType(), null, "glossePassage", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_Punctuation(), this.getPunctuationType(), null, "punctuation", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlosseType_EgyPunctuation(), this.getEgyPunctuationType(), null, "egyPunctuation", null, 0, -1, GlosseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlosseType_PassageID(), theXMLTypePackage.getAnySimpleType(), "passageID", null, 0, 1, GlosseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languagePassageTypeEClass, LanguagePassageType.class, "LanguagePassageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguagePassageType_Language(), theXMLTypePackage.getNMTOKEN(), "language", null, 1, 1, LanguagePassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguagePassageType_PassageID(), theXMLTypePackage.getNMTOKEN(), "passageID", null, 0, 1, LanguagePassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguagePassageType_Type(), this.getTypeType1(), "type", null, 1, 1, LanguagePassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leipzigPassageTypeEClass, LeipzigPassageType.class, "LeipzigPassageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeipzigPassageType_Auszeichnung(), theXMLTypePackage.getAnySimpleType(), "auszeichnung", null, 0, 1, LeipzigPassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeipzigPassageType_PassageID(), theXMLTypePackage.getNMTOKEN(), "passageID", null, 1, 1, LeipzigPassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeipzigPassageType_Type(), this.getTypeType2(), "type", null, 1, 1, LeipzigPassageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineCountTypeEClass, LineCountType.class, "LineCountType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineCountType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, LineCountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineCountType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LineCountType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineCountType_Value(), theXMLTypePackage.getString(), "value", null, 0, -1, LineCountType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineCountType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, -1, LineCountType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(noteTypeEClass, NoteType.class, "NoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoteType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, NoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoteType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, NoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoteType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, NoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passportDataItemEClass, PassportDataItem.class, "PassportDataItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassportDataItem_PassportDataItem(), this.getPassportDataItemType(), null, "passportDataItem", null, 1, 1, PassportDataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passportDataItemTypeEClass, PassportDataItemType.class, "PassportDataItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassportDataItemType_ThsEntry(), this.getThsEntryType(), null, "thsEntry", null, 0, 1, PassportDataItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassportDataItemType_Code(), theXMLTypePackage.getString(), "code", null, 0, 1, PassportDataItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassportDataItemType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, PassportDataItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassportDataItemType_Category(), this.getCategoryType(), "category", null, 1, 1, PassportDataItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(picturesTableTypeEClass, PicturesTableType.class, "PicturesTableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPicturesTableType_Picture(), this.getPictureType(), null, "picture", null, 0, -1, PicturesTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pictureTypeEClass, PictureType.class, "PictureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPictureType_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_FilePath(), theXMLTypePackage.getString(), "filePath", null, 0, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Bibliography(), theXMLTypePackage.getString(), "bibliography", null, 0, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Authorization(), theXMLTypePackage.getAnySimpleType(), "authorization", null, 1, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Dpi(), theXMLTypePackage.getAnySimpleType(), "dpi", null, 1, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Height(), theXMLTypePackage.getAnySimpleType(), "height", null, 1, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Key(), theXMLTypePackage.getAnySimpleType(), "key", null, 1, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_PictType(), theXMLTypePackage.getAnySimpleType(), "pictType", null, 1, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Scale(), theXMLTypePackage.getAnySimpleType(), "scale", null, 1, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictureType_Width(), theXMLTypePackage.getAnySimpleType(), "width", null, 1, 1, PictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(punctuationTypeEClass, PunctuationType.class, "PunctuationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPunctuationType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PunctuationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPunctuationType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, PunctuationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPunctuationType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, PunctuationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcArrangementTypeEClass, TCArrangementType.class, "TCArrangementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCArrangementType_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, 1, TCArrangementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCArrangementType_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -1, TCArrangementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCArrangementType_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -1, TCArrangementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCArrangementType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TCArrangementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCArrangementType_TCArrangement(), this.getTCArrangementType(), null, "tCArrangement", null, 0, -1, TCArrangementType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCArrangementType_TCObject(), this.getTCObjectType(), null, "tCObject", null, 0, -1, TCArrangementType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCArrangementType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, TCArrangementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCArrangementType_SortKey(), theXMLTypePackage.getAnySimpleType(), "sortKey", "0", 0, 1, TCArrangementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCArrangementType_TCName(), theXMLTypePackage.getAnySimpleType(), "tCName", null, 1, 1, TCArrangementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcCaptionTypeEClass, TCCaptionType.class, "TCCaptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCCaptionType_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, 1, TCCaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCCaptionType_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -1, TCCaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCCaptionType_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -1, TCCaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCCaptionType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TCCaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCCaptionType_TCCaption(), this.getTCCaptionType(), null, "tCCaption", null, 0, -1, TCCaptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCCaptionType_TCGroup(), this.getTCGroupType(), null, "tCGroup", null, 0, -1, TCCaptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCCaptionType_TCArrangement(), this.getTCArrangementType(), null, "tCArrangement", null, 0, -1, TCCaptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCCaptionType_TCObject(), this.getTCObjectType(), null, "tCObject", null, 0, -1, TCCaptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCCaptionType_TCObjPart(), this.getTCObjPartType(), null, "tCObjPart", null, 0, -1, TCCaptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCCaptionType_TCText(), this.getTCTextType(), null, "tCText", null, 0, -1, TCCaptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCCaptionType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, TCCaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCCaptionType_SortKey(), theXMLTypePackage.getAnySimpleType(), "sortKey", "0", 0, 1, TCCaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCCaptionType_TCName(), theXMLTypePackage.getAnySimpleType(), "tCName", null, 1, 1, TCCaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcGroupTypeEClass, TCGroupType.class, "TCGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCGroupType_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, 1, TCGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCGroupType_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -1, TCGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCGroupType_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -1, TCGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCGroupType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TCGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCGroupType_TCCaption(), this.getTCCaptionType(), null, "tCCaption", null, 0, -1, TCGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCGroupType_TCGroup(), this.getTCGroupType(), null, "tCGroup", null, 0, -1, TCGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCGroupType_TCArrangement(), this.getTCArrangementType(), null, "tCArrangement", null, 0, -1, TCGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCGroupType_TCObject(), this.getTCObjectType(), null, "tCObject", null, 0, -1, TCGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCGroupType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, TCGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCGroupType_SortKey(), theXMLTypePackage.getAnySimpleType(), "sortKey", "0", 0, 1, TCGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCGroupType_TCName(), theXMLTypePackage.getAnySimpleType(), "tCName", null, 1, 1, TCGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcHeaderTypeEClass, TCHeaderType.class, "TCHeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCHeaderType_Date(), this.getDateType(), null, "date", null, 0, 1, TCHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCHeaderType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, TCHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCHeaderType_Project(), theXMLTypePackage.getString(), "project", null, 0, 1, TCHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCHeaderType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, TCHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCHeaderType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, TCHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcLocationTypeEClass, TCLocationType.class, "TCLocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCLocationType_ThsEntry(), this.getThsEntryType(), null, "thsEntry", null, 1, 1, TCLocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCLocationType_MuseumNumber(), theXMLTypePackage.getString(), "museumNumber", null, 0, 1, TCLocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCLocationType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, TCLocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcObjectTypeEClass, TCObjectType.class, "TCObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCObjectType_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, 1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjectType_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjectType_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjectType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjectType_TCCaption(), this.getTCCaptionType(), null, "tCCaption", null, 0, -1, TCObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjectType_TCObject(), this.getTCObjectType(), null, "tCObject", null, 0, -1, TCObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjectType_TCObjPart(), this.getTCObjPartType(), null, "tCObjPart", null, 0, -1, TCObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjectType_TCScene(), this.getTCSceneType(), null, "tCScene", null, 0, -1, TCObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjectType_TCSuperText(), this.getTCSuperTextType(), null, "tCSuperText", null, 0, -1, TCObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjectType_TCText(), this.getTCTextType(), null, "tCText", null, 0, -1, TCObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjectType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjectType_Bearbeitungsstand(), theXMLTypePackage.getNMTOKEN(), "bearbeitungsstand", null, 0, 1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjectType_GIS(), theXMLTypePackage.getAnySimpleType(), "gIS", null, 0, 1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjectType_ObjectID(), theXMLTypePackage.getNMTOKEN(), "objectID", null, 0, 1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjectType_SortKey(), theXMLTypePackage.getAnySimpleType(), "sortKey", "0", 0, 1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjectType_TCName(), theXMLTypePackage.getAnySimpleType(), "tCName", null, 1, 1, TCObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcObjPartTypeEClass, TCObjPartType.class, "TCObjPartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCObjPartType_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, 1, TCObjPartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjPartType_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -1, TCObjPartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjPartType_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -1, TCObjPartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjPartType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TCObjPartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjPartType_TCCaption(), this.getTCCaptionType(), null, "tCCaption", null, 0, -1, TCObjPartType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjPartType_TCObject(), this.getTCObjectType(), null, "tCObject", null, 0, -1, TCObjPartType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjPartType_TCObjPart(), this.getTCObjPartType(), null, "tCObjPart", null, 0, -1, TCObjPartType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjPartType_TCScene(), this.getTCSceneType(), null, "tCScene", null, 0, -1, TCObjPartType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjPartType_TCSuperText(), this.getTCSuperTextType(), null, "tCSuperText", null, 0, -1, TCObjPartType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCObjPartType_TCText(), this.getTCTextType(), null, "tCText", null, 0, -1, TCObjPartType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjPartType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, TCObjPartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjPartType_SortKey(), theXMLTypePackage.getAnySimpleType(), "sortKey", "0", 0, 1, TCObjPartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCObjPartType_TCName(), theXMLTypePackage.getAnySimpleType(), "tCName", null, 1, 1, TCObjPartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcPassportTypeEClass, TCPassportType.class, "TCPassportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCPassportType_Definition(), theXMLTypePackage.getString(), "definition", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_Protocol(), theXMLTypePackage.getString(), "protocol", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_Bibliography(), theXMLTypePackage.getString(), "bibliography", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_Provenance(), this.getPassportDataItem(), null, "provenance", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_Date(), this.getDateType(), null, "date", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_ObjectType(), this.getPassportDataItem(), null, "objectType", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_Depiction(), this.getPassportDataItem(), null, "depiction", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_Script(), this.getPassportDataItem(), null, "script", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_Language(), this.getPassportDataItem(), null, "language", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_LangComment(), theXMLTypePackage.getString(), "langComment", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_Work(), this.getWorkType(), null, "work", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_TextType(), this.getPassportDataItem(), null, "textType", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_LineCount(), this.getLineCountType(), null, "lineCount", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_Codes(), theXMLTypePackage.getString(), "codes", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_WbFolder(), theXMLTypePackage.getString(), "wbFolder", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_WbSlips(), theXMLTypePackage.getString(), "wbSlips", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_Code1(), theXMLTypePackage.getString(), "code1", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_Code2(), theXMLTypePackage.getString(), "code2", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_BtsCodes(), theXMLTypePackage.getString(), "btsCodes", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_Notes(), theXMLTypePackage.getString(), "notes", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_FullName(), theXMLTypePackage.getString(), "fullName", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPassportType_NameSort(), theXMLTypePackage.getString(), "nameSort", null, 0, 1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCPassportType_TCLocation(), this.getTCLocationType(), null, "tCLocation", null, 0, -1, TCPassportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcPictureTypeEClass, TCPictureType.class, "TCPictureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCPictureType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TCPictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPictureType_PictureType(), theXMLTypePackage.getAnySimpleType(), "pictureType", null, 1, 1, TCPictureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcSceneTypeEClass, TCSceneType.class, "TCSceneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCSceneType_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, 1, TCSceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCSceneType_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -1, TCSceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSceneType_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -1, TCSceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSceneType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TCSceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCSceneType_TCCaption(), this.getTCCaptionType(), null, "tCCaption", null, 0, -1, TCSceneType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCSceneType_TCScene(), this.getTCSceneType(), null, "tCScene", null, 0, -1, TCSceneType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCSceneType_TCSuperText(), this.getTCSuperTextType(), null, "tCSuperText", null, 0, -1, TCSceneType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCSceneType_TCText(), this.getTCTextType(), null, "tCText", null, 0, -1, TCSceneType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSceneType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, TCSceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSceneType_SortKey(), theXMLTypePackage.getAnySimpleType(), "sortKey", "0", 0, 1, TCSceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSceneType_TCName(), theXMLTypePackage.getAnySimpleType(), "tCName", null, 1, 1, TCSceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcSuperTextTypeEClass, TCSuperTextType.class, "TCSuperTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCSuperTextType_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, 1, TCSuperTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCSuperTextType_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -1, TCSuperTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSuperTextType_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -1, TCSuperTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCSuperTextType_TCText(), this.getTCTextType(), null, "tCText", null, 0, -1, TCSuperTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSuperTextType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, TCSuperTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSuperTextType_SortKey(), theXMLTypePackage.getAnySimpleType(), "sortKey", "0", 0, 1, TCSuperTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCSuperTextType_TCName(), theXMLTypePackage.getAnySimpleType(), "tCName", null, 1, 1, TCSuperTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcTextTypeEClass, TCTextType.class, "TCTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCTextType_TCPassport(), this.getTCPassportType(), null, "tCPassport", null, 0, 1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCTextType_TCPicture(), this.getTCPictureType(), null, "tCPicture", null, 0, -1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCTextType_TCNotebook(), theXMLTypePackage.getString(), "tCNotebook", null, 0, -1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCTextType_EgyTxt(), this.getEgyTxtType(), null, "egyTxt", null, 0, 1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCTextType_Author(), theXMLTypePackage.getAnySimpleType(), "author", null, 0, 1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCTextType_Bearbeitungsstand(), theXMLTypePackage.getNMTOKEN(), "bearbeitungsstand", null, 0, 1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCTextType_SortKey(), theXMLTypePackage.getAnySimpleType(), "sortKey", "0", 0, 1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCTextType_TCName(), theXMLTypePackage.getAnySimpleType(), "tCName", null, 1, 1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCTextType_TextID(), theXMLTypePackage.getNMTOKEN(), "textID", null, 0, 1, TCTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thsEntryTypeEClass, ThsEntryType.class, "ThsEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThsEntryType_Term(), theXMLTypePackage.getString(), "term", null, 1, 1, ThsEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsEntryType_Hierarchy(), theXMLTypePackage.getString(), "hierarchy", null, 1, 1, ThsEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsEntryType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, ThsEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsEntryType_Category(), this.getCategoryType1(), "category", null, 0, 1, ThsEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsEntryType_Key(), theXMLTypePackage.getAnySimpleType(), "key", null, 1, 1, ThsEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThsEntryType_Type(), this.getTypeType4(), "type", null, 1, 1, ThsEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workTypeEClass, WorkType.class, "WorkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, WorkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkType_Comment(), theXMLTypePackage.getString(), "comment", null, 1, 1, WorkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkType_Thesaurus(), theXMLTypePackage.getAnySimpleType(), "thesaurus", null, 0, 1, WorkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkType_VersionCode(), theXMLTypePackage.getAnySimpleType(), "versionCode", null, 0, 1, WorkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(categoryTypeEEnum, CategoryType.class, "CategoryType");
		addEEnumLiteral(categoryTypeEEnum, CategoryType.PROVENANCE);
		addEEnumLiteral(categoryTypeEEnum, CategoryType.DATE);
		addEEnumLiteral(categoryTypeEEnum, CategoryType.OBJECT_TYPE);
		addEEnumLiteral(categoryTypeEEnum, CategoryType.DEPICTION);
		addEEnumLiteral(categoryTypeEEnum, CategoryType.SCRIPT);
		addEEnumLiteral(categoryTypeEEnum, CategoryType.LANGUAGE);
		addEEnumLiteral(categoryTypeEEnum, CategoryType.TEXT_TYPE);

		initEEnum(categoryType1EEnum, CategoryType1.class, "CategoryType1");
		addEEnumLiteral(categoryType1EEnum, CategoryType1.PROVENANCE);
		addEEnumLiteral(categoryType1EEnum, CategoryType1.DATE);
		addEEnumLiteral(categoryType1EEnum, CategoryType1.OBJECT_TYPE);
		addEEnumLiteral(categoryType1EEnum, CategoryType1.DEPICTION);
		addEEnumLiteral(categoryType1EEnum, CategoryType1.SCRIPT);
		addEEnumLiteral(categoryType1EEnum, CategoryType1.LANGUAGE);
		addEEnumLiteral(categoryType1EEnum, CategoryType1.TEXT_TYPE);
		addEEnumLiteral(categoryType1EEnum, CategoryType1.MUSEUM);

		initEEnum(lTypeTypeEEnum, LTypeType.class, "LTypeType");
		addEEnumLiteral(lTypeTypeEEnum, LTypeType.B);
		addEEnumLiteral(lTypeTypeEEnum, LTypeType.D);

		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.TAB);
		addEEnumLiteral(typeTypeEEnum, TypeType.EOL);

		initEEnum(typeType1EEnum, TypeType1.class, "TypeType1");
		addEEnumLiteral(typeType1EEnum, TypeType1.START);
		addEEnumLiteral(typeType1EEnum, TypeType1.END);

		initEEnum(typeType2EEnum, TypeType2.class, "TypeType2");
		addEEnumLiteral(typeType2EEnum, TypeType2.START);
		addEEnumLiteral(typeType2EEnum, TypeType2.END);

		initEEnum(typeType3EEnum, TypeType3.class, "TypeType3");
		addEEnumLiteral(typeType3EEnum, TypeType3.START);
		addEEnumLiteral(typeType3EEnum, TypeType3.END);

		initEEnum(typeType4EEnum, TypeType4.class, "TypeType4");
		addEEnumLiteral(typeType4EEnum, TypeType4.BTS);

		initEEnum(typeType5EEnum, TypeType5.class, "TypeType5");
		addEEnumLiteral(typeType5EEnum, TypeType5.HS);
		addEEnumLiteral(typeType5EEnum, TypeType5.NS);

		initEEnum(typeType6EEnum, TypeType6.class, "TypeType6");
		addEEnumLiteral(typeType6EEnum, TypeType6.VP);
		addEEnumLiteral(typeType6EEnum, TypeType6.V);
		addEEnumLiteral(typeType6EEnum, TypeType6.DVP);
		addEEnumLiteral(typeType6EEnum, TypeType6.EOC);

		initEEnum(typeType7EEnum, TypeType7.class, "TypeType7");
		addEEnumLiteral(typeType7EEnum, TypeType7.BTS);

		initEEnum(typeType8EEnum, TypeType8.class, "TypeType8");
		addEEnumLiteral(typeType8EEnum, TypeType8.START);
		addEEnumLiteral(typeType8EEnum, TypeType8.END);

		// Initialize data types
		initEDataType(categoryTypeObjectEDataType, CategoryType.class, "CategoryTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(categoryTypeObject1EDataType, CategoryType1.class, "CategoryTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lTypeTypeObjectEDataType, LTypeType.class, "LTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType1.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject1EDataType, TypeType3.class, "TypeTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject2EDataType, TypeType5.class, "TypeTypeObject2", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject3EDataType, TypeType2.class, "TypeTypeObject3", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject4EDataType, TypeType.class, "TypeTypeObject4", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject5EDataType, TypeType6.class, "TypeTypeObject5", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject6EDataType, TypeType4.class, "TypeTypeObject6", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject7EDataType, TypeType7.class, "TypeTypeObject7", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObject8EDataType, TypeType8.class, "TypeTypeObject8", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (bausteinPassageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BausteinPassage_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBausteinPassageType_Baustein(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Baustein",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBausteinPassageType_PassageID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PassageID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBausteinPassageType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (categoryTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "Category_._type"
		   });	
		addAnnotation
		  (categoryType1EEnum, 
		   source, 
		   new String[] {
			 "name", "Category_._1_._type"
		   });	
		addAnnotation
		  (categoryTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Category_._type:Object",
			 "baseType", "Category_._type"
		   });	
		addAnnotation
		  (categoryTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "Category_._1_._type:Object",
			 "baseType", "Category_._1_._type"
		   });	
		addAnnotation
		  (dateThsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DateThs_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDateThsType_Term(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Term",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateThsType_LowerTerm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LowerTerm",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateThsType_UpperTerm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpperTerm",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateThsType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateThsType_YearFrom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "YearFrom",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateThsType_YearTo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "YearTo",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Date_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDateType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDateType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getDateType_DateThs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DateThs",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getDateType_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getDateType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
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
		  (getDocumentRoot_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_BausteinPassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BausteinPassage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Bibliography(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Bibliography",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Code1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code1",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Code2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code2",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Codes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Codes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Date",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_DateThs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DateThs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Definition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Definition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Depiction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Depiction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgyPunctuation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyPunctuation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgySent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgySubTxt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySubTxt",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgySzenario(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySzenario",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgyTB1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB1",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgyTB3End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3End",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgyTB3Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3Start",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgyTxt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTxt",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgyTxtCorpus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTxtCorpus",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_EgyWord(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyWord",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_FileName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FileName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_FilePath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FilePath",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Form(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Form",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_FormattingElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FormattingElement",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_FullName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FullName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Glosse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Glosse",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_GlossePassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GlossePassage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Graphics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Graphics",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Hierarchy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Hierarchy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_LangComment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LangComment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_LanguagePassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LanguagePassage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_LeipzigPassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LeipzigPassage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_LineCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineCount",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_LowerTerm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LowerTerm",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_MuseumNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MuseumNumber",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_NameSort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameSort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Note",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Notes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Notes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ObjectType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_PassportDataItem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PassportDataItem",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Picture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Picture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_PicturesTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PicturesTable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Project(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Project",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Protocol",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Provenance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Provenance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Punctuation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Punctuation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Script",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCArrangement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCArrangement",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCCaption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCCaption",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCGroup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCHeader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCHeader",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCLocation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCLocation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObject",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCObjPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObjPart",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCScene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCScene",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCSuperText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCSuperText",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TCText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCText",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Term(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Term",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TextType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TextType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ThsEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ThsEntry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Translat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Translat",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Translation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Translation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_UpperTerm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpperTerm",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_WbFolder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WbFolder",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_WbSlips(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WbSlips",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Work(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Work",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (egyPunctuationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgyPunctuation_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgyPunctuationType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyPunctuationType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyPunctuationType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyPunctuationType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (egySentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgySent_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgySentType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySentType_Translat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Translat",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySentType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySentType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySentType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_EgySent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySent",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_EgyTB1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB1",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_EgyTB3Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3Start",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_EgyTB3End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3End",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_EgyWord(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyWord",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_LineCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineCount",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Note",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_FormattingElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FormattingElement",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_LanguagePassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LanguagePassage",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_BausteinPassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BausteinPassage",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_LeipzigPassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LeipzigPassage",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_GlossePassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GlossePassage",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_Punctuation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Punctuation",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_EgyPunctuation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyPunctuation",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getEgySentType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySentType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySentType_Leipzig3Modul(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Leipzig3Modul",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySentType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (egySubTxtTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgySubTxt_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgySubTxtType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySubTxtType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySubTxtType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySubTxtType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getEgySubTxtType_EgySubTxt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySubTxt",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgySubTxtType_EgySent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySent",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgySubTxtType_EgyTB1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB1",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgySubTxtType_EgySzenario(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySzenario",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgySubTxtType_Glosse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Glosse",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgySubTxtType_EgyTB3Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3Start",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgySubTxtType_EgyTB3End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3End",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (egySzenarioTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgySzenario_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgySzenarioType_EgySent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgySzenarioType_InterneNummer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "InterneNummer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (egyTB1TypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgyTB1_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgyTB1Type_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB1Type_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB1Type_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB1Type_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_EgySent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySent",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_EgyTB1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB1",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_EgyTB3Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3Start",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_EgyTB3End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3End",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_EgyWord(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyWord",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_LineCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineCount",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Note",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_FormattingElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FormattingElement",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_Punctuation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Punctuation",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTB1Type_EgyPunctuation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyPunctuation",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (egyTB3EndTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgyTB3End_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgyTB3EndType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB3EndType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB3EndType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB3EndType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB3EndType_IdRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IdRef",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (egyTB3StartTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgyTB3Start_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgyTB3StartType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB3StartType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB3StartType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB3StartType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTB3StartType_IdRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IdRef",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (egyTxtCorpusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgyTxtCorpus_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_TCHeader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCHeader",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_PicturesTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PicturesTable",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_TCCaption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCCaption",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_TCGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCGroup",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_TCArrangement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCArrangement",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_TCObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObject",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_TCObjPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObjPart",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_TCScene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCScene",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_TCText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCText",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_EgyTxt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTxt",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getEgyTxtCorpusType_DTDVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DTDVersion",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (egyTxtTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgyTxt_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgyTxtType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTxtType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTxtType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyTxtType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getEgyTxtType_EgySubTxt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySubTxt",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTxtType_EgySent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySent",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTxtType_EgyTB1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB1",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTxtType_EgySzenario(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySzenario",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTxtType_Glosse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Glosse",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTxtType_EgyTB3Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3Start",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getEgyTxtType_EgyTB3End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3End",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (egyWordTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EgyWord_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEgyWordType_Form(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Form",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Translat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Translat",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Graphics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Graphics",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Connect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Connect",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_FKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "FKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Leipzig3Modul(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Leipzig3Modul",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_LKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_LType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Reihenfolge(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Reihenfolge",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_ReihenfolgeID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ReihenfolgeID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Script(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Script",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_Status(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Status",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_WChr(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "WChr",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEgyWordType_WType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "WType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (formattingElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FormattingElement_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFormattingElementType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFormattingElementType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFormattingElementType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (glossePassageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GlossePassage_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getGlossePassageType_PassageID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PassageID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGlossePassageType_Script(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Script",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGlossePassageType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (glosseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Glosse_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getGlosseType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_EgySent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgySent",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_EgyTB1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB1",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_EgyTB3Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3Start",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_EgyTB3End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTB3End",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_EgyWord(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyWord",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_LineCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineCount",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Note",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_FormattingElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FormattingElement",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_LanguagePassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LanguagePassage",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_BausteinPassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BausteinPassage",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_LeipzigPassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LeipzigPassage",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_GlossePassage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GlossePassage",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_Punctuation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Punctuation",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_EgyPunctuation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyPunctuation",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getGlosseType_PassageID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PassageID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (languagePassageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LanguagePassage_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLanguagePassageType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLanguagePassageType_PassageID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PassageID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLanguagePassageType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (leipzigPassageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LeipzigPassage_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLeipzigPassageType_Auszeichnung(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Auszeichnung",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLeipzigPassageType_PassageID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PassageID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLeipzigPassageType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (lineCountTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LineCount_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getLineCountType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getLineCountType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getLineCountType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getLineCountType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (lTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "LType_._type"
		   });	
		addAnnotation
		  (lTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "LType_._type:Object",
			 "baseType", "LType_._type"
		   });	
		addAnnotation
		  (noteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Note_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNoteType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNoteType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNoteType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (passportDataItemEClass, 
		   source, 
		   new String[] {
			 "name", "PassportDataItem",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPassportDataItem_PassportDataItem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PassportDataItem",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (passportDataItemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PassportDataItem_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPassportDataItemType_ThsEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ThsEntry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPassportDataItemType_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPassportDataItemType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPassportDataItemType_Category(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Category",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (picturesTableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PicturesTable_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPicturesTableType_Picture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Picture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (pictureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Picture_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPictureType_FileName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FileName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_FilePath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FilePath",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Bibliography(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Bibliography",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Authorization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Authorization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Dpi(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Dpi",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Height",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Key",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_PictType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PictType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Scale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Scale",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPictureType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Width",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (punctuationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Punctuation_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPunctuationType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPunctuationType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPunctuationType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcArrangementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCArrangement_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCArrangementType_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCArrangementType_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCArrangementType_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCArrangementType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getTCArrangementType_TCArrangement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCArrangement",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCArrangementType_TCObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObject",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCArrangementType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCArrangementType_SortKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SortKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCArrangementType_TCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TCName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcCaptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCCaption_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCCaptionType_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCCaptionType_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCCaptionType_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCCaptionType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getTCCaptionType_TCCaption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCCaption",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCCaptionType_TCGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCGroup",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCCaptionType_TCArrangement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCArrangement",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCCaptionType_TCObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObject",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCCaptionType_TCObjPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObjPart",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCCaptionType_TCText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCText",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCCaptionType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCCaptionType_SortKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SortKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCCaptionType_TCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TCName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcGroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCGroup_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCGroupType_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCGroupType_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCGroupType_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCGroupType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getTCGroupType_TCCaption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCCaption",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCGroupType_TCGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCGroup",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCGroupType_TCArrangement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCArrangement",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCGroupType_TCObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObject",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCGroupType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCGroupType_SortKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SortKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCGroupType_TCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TCName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcHeaderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCHeader_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCHeaderType_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Date",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCHeaderType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCHeaderType_Project(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Project",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCHeaderType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCHeaderType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcLocationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCLocation_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCLocationType_ThsEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ThsEntry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCLocationType_MuseumNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MuseumNumber",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCLocationType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCObject_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCObjectType_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjectType_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjectType_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjectType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getTCObjectType_TCCaption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCCaption",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjectType_TCObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObject",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjectType_TCObjPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObjPart",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjectType_TCScene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCScene",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjectType_TCSuperText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCSuperText",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjectType_TCText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCText",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjectType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjectType_Bearbeitungsstand(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Bearbeitungsstand",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjectType_GIS(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "GIS",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjectType_ObjectID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ObjectID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjectType_SortKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SortKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjectType_TCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TCName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcObjPartTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCObjPart_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCObjPartType_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjPartType_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjPartType_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjPartType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getTCObjPartType_TCCaption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCCaption",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjPartType_TCObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObject",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjPartType_TCObjPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCObjPart",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjPartType_TCScene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCScene",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjPartType_TCSuperText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCSuperText",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjPartType_TCText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCText",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCObjPartType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjPartType_SortKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SortKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCObjPartType_TCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TCName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcPassportTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCPassport_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCPassportType_Definition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Definition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Protocol",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Bibliography(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Bibliography",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Provenance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Provenance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Date",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_ObjectType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ObjectType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Depiction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Depiction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Script",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_LangComment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LangComment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Work(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Work",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_TextType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TextType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_LineCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineCount",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Codes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Codes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_WbFolder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WbFolder",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_WbSlips(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WbSlips",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Code1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code1",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Code2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code2",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_BtsCodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BtsCodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_Notes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Notes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_FullName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FullName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_NameSort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameSort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCPassportType_TCLocation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCLocation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcPictureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCPicture_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getTCPictureType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getTCPictureType_PictureType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PictureType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcSceneTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCScene_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCSceneType_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSceneType_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSceneType_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSceneType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });	
		addAnnotation
		  (getTCSceneType_TCCaption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCCaption",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCSceneType_TCScene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCScene",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCSceneType_TCSuperText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCSuperText",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCSceneType_TCText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCText",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });	
		addAnnotation
		  (getTCSceneType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSceneType_SortKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SortKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSceneType_TCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TCName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcSuperTextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCSuperText_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCSuperTextType_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSuperTextType_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSuperTextType_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSuperTextType_TCText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCText",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSuperTextType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSuperTextType_SortKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SortKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCSuperTextType_TCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TCName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tcTextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TCText_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTCTextType_TCPassport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPassport",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCTextType_TCPicture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCPicture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCTextType_TCNotebook(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TCNotebook",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCTextType_EgyTxt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EgyTxt",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCTextType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCTextType_Bearbeitungsstand(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Bearbeitungsstand",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCTextType_SortKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SortKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCTextType_TCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TCName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTCTextType_TextID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TextID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (thsEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ThsEntry_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getThsEntryType_Term(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Term",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsEntryType_Hierarchy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Hierarchy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsEntryType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsEntryType_Category(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Category",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsEntryType_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Key",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getThsEntryType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (typeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "Type_._type"
		   });	
		addAnnotation
		  (typeType1EEnum, 
		   source, 
		   new String[] {
			 "name", "Type_._1_._type"
		   });	
		addAnnotation
		  (typeType2EEnum, 
		   source, 
		   new String[] {
			 "name", "Type_._2_._type"
		   });	
		addAnnotation
		  (typeType3EEnum, 
		   source, 
		   new String[] {
			 "name", "Type_._3_._type"
		   });	
		addAnnotation
		  (typeType4EEnum, 
		   source, 
		   new String[] {
			 "name", "Type_._4_._type"
		   });	
		addAnnotation
		  (typeType5EEnum, 
		   source, 
		   new String[] {
			 "name", "Type_._5_._type"
		   });	
		addAnnotation
		  (typeType6EEnum, 
		   source, 
		   new String[] {
			 "name", "Type_._6_._type"
		   });	
		addAnnotation
		  (typeType7EEnum, 
		   source, 
		   new String[] {
			 "name", "type_._type"
		   });	
		addAnnotation
		  (typeType8EEnum, 
		   source, 
		   new String[] {
			 "name", "Type_._7_._type"
		   });	
		addAnnotation
		  (typeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Type_._1_._type:Object",
			 "baseType", "Type_._1_._type"
		   });	
		addAnnotation
		  (typeTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "Type_._3_._type:Object",
			 "baseType", "Type_._3_._type"
		   });	
		addAnnotation
		  (typeTypeObject2EDataType, 
		   source, 
		   new String[] {
			 "name", "Type_._5_._type:Object",
			 "baseType", "Type_._5_._type"
		   });	
		addAnnotation
		  (typeTypeObject3EDataType, 
		   source, 
		   new String[] {
			 "name", "Type_._2_._type:Object",
			 "baseType", "Type_._2_._type"
		   });	
		addAnnotation
		  (typeTypeObject4EDataType, 
		   source, 
		   new String[] {
			 "name", "Type_._type:Object",
			 "baseType", "Type_._type"
		   });	
		addAnnotation
		  (typeTypeObject5EDataType, 
		   source, 
		   new String[] {
			 "name", "Type_._6_._type:Object",
			 "baseType", "Type_._6_._type"
		   });	
		addAnnotation
		  (typeTypeObject6EDataType, 
		   source, 
		   new String[] {
			 "name", "Type_._4_._type:Object",
			 "baseType", "Type_._4_._type"
		   });	
		addAnnotation
		  (typeTypeObject7EDataType, 
		   source, 
		   new String[] {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });	
		addAnnotation
		  (typeTypeObject8EDataType, 
		   source, 
		   new String[] {
			 "name", "Type_._7_._type:Object",
			 "baseType", "Type_._7_._type"
		   });	
		addAnnotation
		  (workTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Work_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWorkType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkType_Thesaurus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Thesaurus",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkType_VersionCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "VersionCode",
			 "namespace", "##targetNamespace"
		   });
	}

} //CorpusDTDneuPackageImpl
