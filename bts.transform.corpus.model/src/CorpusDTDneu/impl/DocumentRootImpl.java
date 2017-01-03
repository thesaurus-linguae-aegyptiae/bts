/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.BausteinPassageType;
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
import CorpusDTDneu.WorkType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getBausteinPassage <em>Baustein Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getCode <em>Code</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getCode1 <em>Code1</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getCode2 <em>Code2</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getCodes <em>Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getDateThs <em>Date Ths</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getDepiction <em>Depiction</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgyPunctuation <em>Egy Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgySubTxt <em>Egy Sub Txt</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgySzenario <em>Egy Szenario</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgyTB1 <em>Egy TB1</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgyTB3End <em>Egy TB3 End</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgyTxt <em>Egy Txt</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgyTxtCorpus <em>Egy Txt Corpus</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getEgyWord <em>Egy Word</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getForm <em>Form</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getFormattingElement <em>Formatting Element</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getGlosse <em>Glosse</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getGlossePassage <em>Glosse Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getLangComment <em>Lang Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getLanguagePassage <em>Language Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getLeipzigPassage <em>Leipzig Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getLowerTerm <em>Lower Term</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getMuseumNumber <em>Museum Number</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getNameSort <em>Name Sort</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getNote <em>Note</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getPassportDataItem <em>Passport Data Item</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getPicturesTable <em>Pictures Table</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getProject <em>Project</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getPunctuation <em>Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCArrangement <em>TC Arrangement</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCCaption <em>TC Caption</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCGroup <em>TC Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCHeader <em>TC Header</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCLocation <em>TC Location</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCNotebook <em>TC Notebook</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCObject <em>TC Object</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCObjPart <em>TC Obj Part</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCPassport <em>TC Passport</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCPicture <em>TC Picture</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCScene <em>TC Scene</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCSuperText <em>TC Super Text</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTCText <em>TC Text</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTextType <em>Text Type</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getThsEntry <em>Ths Entry</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTranslat <em>Translat</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getUpperTerm <em>Upper Term</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getWbFolder <em>Wb Folder</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getWbSlips <em>Wb Slips</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.DocumentRootImpl#getWork <em>Work</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBibliography() <em>Bibliography</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliography()
	 * @generated
	 * @ordered
	 */
	protected static final String BIBLIOGRAPHY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBtsCodes() <em>Bts Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtsCodes()
	 * @generated
	 * @ordered
	 */
	protected static final String BTS_CODES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCode1() <em>Code1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode1()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCode2() <em>Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode2()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE2_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCodes() <em>Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected static final String CODES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGraphics() <em>Graphics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphics()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPHICS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final String HIERARCHY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLangComment() <em>Lang Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangComment()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLowerTerm() <em>Lower Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_TERM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMuseumNumber() <em>Museum Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuseumNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MUSEUM_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNameSort() <em>Name Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSort()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SORT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTCNotebook() <em>TC Notebook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCNotebook()
	 * @generated
	 * @ordered
	 */
	protected static final String TC_NOTEBOOK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTranslat() <em>Translat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslat()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTranslation() <em>Translation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpperTerm() <em>Upper Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_TERM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWbFolder() <em>Wb Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWbFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String WB_FOLDER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWbSlips() <em>Wb Slips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWbSlips()
	 * @generated
	 * @ordered
	 */
	protected static final String WB_SLIPS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CorpusDTDneuPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CorpusDTDneuPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CorpusDTDneuPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__AUTHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BausteinPassageType getBausteinPassage() {
		return (BausteinPassageType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BAUSTEIN_PASSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBausteinPassage(BausteinPassageType newBausteinPassage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BAUSTEIN_PASSAGE, newBausteinPassage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBausteinPassage(BausteinPassageType newBausteinPassage) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BAUSTEIN_PASSAGE, newBausteinPassage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBibliography() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliography(String newBibliography) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHY, newBibliography);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtsCodes() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BTS_CODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtsCodes(String newBtsCodes) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BTS_CODES, newBtsCodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode1() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode1(String newCode1) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE1, newCode1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode2() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode2(String newCode2) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE2, newCode2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodes() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodes(String newCodes) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODES, newCodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType getDate() {
		return (DateType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE, newDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateType newDate) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateThsType getDateThs() {
		return (DateThsType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE_THS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateThs(DateThsType newDateThs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE_THS, newDateThs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateThs(DateThsType newDateThs) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE_THS, newDateThs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEFINITION, newDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getDepiction() {
		return (PassportDataItem)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEPICTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepiction(PassportDataItem newDepiction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEPICTION, newDepiction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepiction(PassportDataItem newDepiction) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEPICTION, newDepiction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgyPunctuationType getEgyPunctuation() {
		return (EgyPunctuationType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_PUNCTUATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgyPunctuation(EgyPunctuationType newEgyPunctuation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_PUNCTUATION, newEgyPunctuation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgyPunctuation(EgyPunctuationType newEgyPunctuation) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_PUNCTUATION, newEgyPunctuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgySentType getEgySent() {
		return (EgySentType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgySent(EgySentType newEgySent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SENT, newEgySent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgySent(EgySentType newEgySent) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SENT, newEgySent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgySubTxtType getEgySubTxt() {
		return (EgySubTxtType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SUB_TXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgySubTxt(EgySubTxtType newEgySubTxt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SUB_TXT, newEgySubTxt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgySubTxt(EgySubTxtType newEgySubTxt) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SUB_TXT, newEgySubTxt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgySzenarioType getEgySzenario() {
		return (EgySzenarioType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SZENARIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgySzenario(EgySzenarioType newEgySzenario, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SZENARIO, newEgySzenario, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgySzenario(EgySzenarioType newEgySzenario) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SZENARIO, newEgySzenario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgyTB1Type getEgyTB1() {
		return (EgyTB1Type)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgyTB1(EgyTB1Type newEgyTB1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB1, newEgyTB1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgyTB1(EgyTB1Type newEgyTB1) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB1, newEgyTB1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgyTB3EndType getEgyTB3End() {
		return (EgyTB3EndType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgyTB3End(EgyTB3EndType newEgyTB3End, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_END, newEgyTB3End, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgyTB3End(EgyTB3EndType newEgyTB3End) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_END, newEgyTB3End);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgyTB3StartType getEgyTB3Start() {
		return (EgyTB3StartType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgyTB3Start(EgyTB3StartType newEgyTB3Start, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_START, newEgyTB3Start, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgyTB3Start(EgyTB3StartType newEgyTB3Start) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_START, newEgyTB3Start);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgyTxtType getEgyTxt() {
		return (EgyTxtType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgyTxt(EgyTxtType newEgyTxt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT, newEgyTxt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgyTxt(EgyTxtType newEgyTxt) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT, newEgyTxt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgyTxtCorpusType getEgyTxtCorpus() {
		return (EgyTxtCorpusType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT_CORPUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgyTxtCorpus(EgyTxtCorpusType newEgyTxtCorpus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT_CORPUS, newEgyTxtCorpus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgyTxtCorpus(EgyTxtCorpusType newEgyTxtCorpus) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT_CORPUS, newEgyTxtCorpus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgyWordType getEgyWord() {
		return (EgyWordType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_WORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEgyWord(EgyWordType newEgyWord, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_WORD, newEgyWord, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgyWord(EgyWordType newEgyWord) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_WORD, newEgyWord);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FILE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FILE_NAME, newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FILE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FILE_PATH, newFilePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForm() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(String newForm) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FORM, newForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattingElementType getFormattingElement() {
		return (FormattingElementType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FORMATTING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormattingElement(FormattingElementType newFormattingElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FORMATTING_ELEMENT, newFormattingElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormattingElement(FormattingElementType newFormattingElement) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FORMATTING_ELEMENT, newFormattingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FULL_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FULL_NAME, newFullName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlosseType getGlosse() {
		return (GlosseType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlosse(GlosseType newGlosse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE, newGlosse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlosse(GlosseType newGlosse) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE, newGlosse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossePassageType getGlossePassage() {
		return (GlossePassageType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE_PASSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossePassage(GlossePassageType newGlossePassage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE_PASSAGE, newGlossePassage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlossePassage(GlossePassageType newGlossePassage) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE_PASSAGE, newGlossePassage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphics() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GRAPHICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphics(String newGraphics) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GRAPHICS, newGraphics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHierarchy() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__HIERARCHY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchy(String newHierarchy) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__HIERARCHY, newHierarchy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangComment() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANG_COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangComment(String newLangComment) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANG_COMMENT, newLangComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getLanguage() {
		return (PassportDataItem)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(PassportDataItem newLanguage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(PassportDataItem newLanguage) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguagePassageType getLanguagePassage() {
		return (LanguagePassageType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE_PASSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguagePassage(LanguagePassageType newLanguagePassage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE_PASSAGE, newLanguagePassage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguagePassage(LanguagePassageType newLanguagePassage) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE_PASSAGE, newLanguagePassage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeipzigPassageType getLeipzigPassage() {
		return (LeipzigPassageType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LEIPZIG_PASSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeipzigPassage(LeipzigPassageType newLeipzigPassage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LEIPZIG_PASSAGE, newLeipzigPassage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeipzigPassage(LeipzigPassageType newLeipzigPassage) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LEIPZIG_PASSAGE, newLeipzigPassage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineCountType getLineCount() {
		return (LineCountType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LINE_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineCount(LineCountType newLineCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LINE_COUNT, newLineCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineCount(LineCountType newLineCount) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LINE_COUNT, newLineCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerTerm() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LOWER_TERM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerTerm(String newLowerTerm) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LOWER_TERM, newLowerTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMuseumNumber() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__MUSEUM_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuseumNumber(String newMuseumNumber) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__MUSEUM_NUMBER, newMuseumNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSort() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NAME_SORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSort(String newNameSort) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NAME_SORT, newNameSort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType getNote() {
		return (NoteType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(NoteType newNote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NOTE, newNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NOTE, newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getObjectType() {
		return (PassportDataItem)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__OBJECT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectType(PassportDataItem newObjectType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__OBJECT_TYPE, newObjectType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(PassportDataItem newObjectType) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__OBJECT_TYPE, newObjectType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItemType getPassportDataItem() {
		return (PassportDataItemType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PASSPORT_DATA_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassportDataItem(PassportDataItemType newPassportDataItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PASSPORT_DATA_ITEM, newPassportDataItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassportDataItem(PassportDataItemType newPassportDataItem) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PASSPORT_DATA_ITEM, newPassportDataItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PictureType getPicture() {
		return (PictureType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPicture(PictureType newPicture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURE, newPicture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPicture(PictureType newPicture) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURE, newPicture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicturesTableType getPicturesTable() {
		return (PicturesTableType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURES_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPicturesTable(PicturesTableType newPicturesTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURES_TABLE, newPicturesTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPicturesTable(PicturesTableType newPicturesTable) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURES_TABLE, newPicturesTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(String newProject) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROJECT, newProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROTOCOL, newProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getProvenance() {
		return (PassportDataItem)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROVENANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvenance(PassportDataItem newProvenance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROVENANCE, newProvenance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvenance(PassportDataItem newProvenance) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROVENANCE, newProvenance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PunctuationType getPunctuation() {
		return (PunctuationType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PUNCTUATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPunctuation(PunctuationType newPunctuation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PUNCTUATION, newPunctuation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPunctuation(PunctuationType newPunctuation) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PUNCTUATION, newPunctuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getScript() {
		return (PassportDataItem)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(PassportDataItem newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__SCRIPT, newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(PassportDataItem newScript) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCArrangementType getTCArrangement() {
		return (TCArrangementType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_ARRANGEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCArrangement(TCArrangementType newTCArrangement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_ARRANGEMENT, newTCArrangement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCArrangement(TCArrangementType newTCArrangement) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_ARRANGEMENT, newTCArrangement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCCaptionType getTCCaption() {
		return (TCCaptionType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_CAPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCCaption(TCCaptionType newTCCaption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_CAPTION, newTCCaption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCCaption(TCCaptionType newTCCaption) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_CAPTION, newTCCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCGroupType getTCGroup() {
		return (TCGroupType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCGroup(TCGroupType newTCGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_GROUP, newTCGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCGroup(TCGroupType newTCGroup) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_GROUP, newTCGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCHeaderType getTCHeader() {
		return (TCHeaderType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_HEADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCHeader(TCHeaderType newTCHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_HEADER, newTCHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCHeader(TCHeaderType newTCHeader) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_HEADER, newTCHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCLocationType getTCLocation() {
		return (TCLocationType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCLocation(TCLocationType newTCLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_LOCATION, newTCLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCLocation(TCLocationType newTCLocation) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_LOCATION, newTCLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTCNotebook() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_NOTEBOOK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCNotebook(String newTCNotebook) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_NOTEBOOK, newTCNotebook);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCObjectType getTCObject() {
		return (TCObjectType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCObject(TCObjectType newTCObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJECT, newTCObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCObject(TCObjectType newTCObject) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJECT, newTCObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCObjPartType getTCObjPart() {
		return (TCObjPartType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJ_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCObjPart(TCObjPartType newTCObjPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJ_PART, newTCObjPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCObjPart(TCObjPartType newTCObjPart) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJ_PART, newTCObjPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCPassportType getTCPassport() {
		return (TCPassportType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PASSPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCPassport(TCPassportType newTCPassport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PASSPORT, newTCPassport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCPassport(TCPassportType newTCPassport) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PASSPORT, newTCPassport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCPictureType getTCPicture() {
		return (TCPictureType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PICTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCPicture(TCPictureType newTCPicture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PICTURE, newTCPicture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCPicture(TCPictureType newTCPicture) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PICTURE, newTCPicture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCSceneType getTCScene() {
		return (TCSceneType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SCENE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCScene(TCSceneType newTCScene, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SCENE, newTCScene, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCScene(TCSceneType newTCScene) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SCENE, newTCScene);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCSuperTextType getTCSuperText() {
		return (TCSuperTextType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SUPER_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCSuperText(TCSuperTextType newTCSuperText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SUPER_TEXT, newTCSuperText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCSuperText(TCSuperTextType newTCSuperText) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SUPER_TEXT, newTCSuperText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCTextType getTCText() {
		return (TCTextType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCText(TCTextType newTCText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_TEXT, newTCText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCText(TCTextType newTCText) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_TEXT, newTCText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerm() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TERM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(String newTerm) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TERM, newTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getTextType() {
		return (PassportDataItem)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TEXT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextType(PassportDataItem newTextType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TEXT_TYPE, newTextType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextType(PassportDataItem newTextType) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TEXT_TYPE, newTextType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThsEntryType getThsEntry() {
		return (ThsEntryType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__THS_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThsEntry(ThsEntryType newThsEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__THS_ENTRY, newThsEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThsEntry(ThsEntryType newThsEntry) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__THS_ENTRY, newThsEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTranslat() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TRANSLAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslat(String newTranslat) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TRANSLAT, newTranslat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTranslation() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TRANSLATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(String newTranslation) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TRANSLATION, newTranslation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperTerm() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__UPPER_TERM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperTerm(String newUpperTerm) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__UPPER_TERM, newUpperTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWbFolder() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WB_FOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWbFolder(String newWbFolder) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WB_FOLDER, newWbFolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWbSlips() {
		return (String)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WB_SLIPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWbSlips(String newWbSlips) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WB_SLIPS, newWbSlips);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkType getWork() {
		return (WorkType)getMixed().get(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(WorkType newWork, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WORK, newWork, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(WorkType newWork) {
		((FeatureMap.Internal)getMixed()).set(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WORK, newWork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BAUSTEIN_PASSAGE:
				return basicSetBausteinPassage(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE:
				return basicSetDate(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE_THS:
				return basicSetDateThs(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEPICTION:
				return basicSetDepiction(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_PUNCTUATION:
				return basicSetEgyPunctuation(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SENT:
				return basicSetEgySent(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SUB_TXT:
				return basicSetEgySubTxt(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SZENARIO:
				return basicSetEgySzenario(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB1:
				return basicSetEgyTB1(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_END:
				return basicSetEgyTB3End(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_START:
				return basicSetEgyTB3Start(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT:
				return basicSetEgyTxt(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT_CORPUS:
				return basicSetEgyTxtCorpus(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_WORD:
				return basicSetEgyWord(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORMATTING_ELEMENT:
				return basicSetFormattingElement(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE:
				return basicSetGlosse(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE_PASSAGE:
				return basicSetGlossePassage(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE_PASSAGE:
				return basicSetLanguagePassage(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LEIPZIG_PASSAGE:
				return basicSetLeipzigPassage(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LINE_COUNT:
				return basicSetLineCount(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTE:
				return basicSetNote(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__OBJECT_TYPE:
				return basicSetObjectType(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PASSPORT_DATA_ITEM:
				return basicSetPassportDataItem(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURE:
				return basicSetPicture(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURES_TABLE:
				return basicSetPicturesTable(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROVENANCE:
				return basicSetProvenance(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PUNCTUATION:
				return basicSetPunctuation(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__SCRIPT:
				return basicSetScript(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_ARRANGEMENT:
				return basicSetTCArrangement(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_CAPTION:
				return basicSetTCCaption(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_GROUP:
				return basicSetTCGroup(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_HEADER:
				return basicSetTCHeader(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_LOCATION:
				return basicSetTCLocation(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJECT:
				return basicSetTCObject(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJ_PART:
				return basicSetTCObjPart(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PASSPORT:
				return basicSetTCPassport(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PICTURE:
				return basicSetTCPicture(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SCENE:
				return basicSetTCScene(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SUPER_TEXT:
				return basicSetTCSuperText(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_TEXT:
				return basicSetTCText(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TEXT_TYPE:
				return basicSetTextType(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__THS_ENTRY:
				return basicSetThsEntry(null, msgs);
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WORK:
				return basicSetWork(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__AUTHOR:
				return getAuthor();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BAUSTEIN_PASSAGE:
				return getBausteinPassage();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				return getBibliography();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BTS_CODES:
				return getBtsCodes();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE:
				return getCode();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE1:
				return getCode1();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE2:
				return getCode2();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODES:
				return getCodes();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE_THS:
				return getDateThs();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEFINITION:
				return getDefinition();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEPICTION:
				return getDepiction();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_PUNCTUATION:
				return getEgyPunctuation();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SENT:
				return getEgySent();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SUB_TXT:
				return getEgySubTxt();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SZENARIO:
				return getEgySzenario();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB1:
				return getEgyTB1();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_END:
				return getEgyTB3End();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_START:
				return getEgyTB3Start();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT:
				return getEgyTxt();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT_CORPUS:
				return getEgyTxtCorpus();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_WORD:
				return getEgyWord();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_NAME:
				return getFileName();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_PATH:
				return getFilePath();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORM:
				return getForm();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORMATTING_ELEMENT:
				return getFormattingElement();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FULL_NAME:
				return getFullName();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE:
				return getGlosse();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE_PASSAGE:
				return getGlossePassage();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GRAPHICS:
				return getGraphics();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__HIERARCHY:
				return getHierarchy();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANG_COMMENT:
				return getLangComment();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE_PASSAGE:
				return getLanguagePassage();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LEIPZIG_PASSAGE:
				return getLeipzigPassage();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LINE_COUNT:
				return getLineCount();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LOWER_TERM:
				return getLowerTerm();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MUSEUM_NUMBER:
				return getMuseumNumber();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME_SORT:
				return getNameSort();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTE:
				return getNote();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTES:
				return getNotes();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__OBJECT_TYPE:
				return getObjectType();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PASSPORT_DATA_ITEM:
				return getPassportDataItem();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURE:
				return getPicture();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURES_TABLE:
				return getPicturesTable();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROJECT:
				return getProject();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROTOCOL:
				return getProtocol();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROVENANCE:
				return getProvenance();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PUNCTUATION:
				return getPunctuation();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_ARRANGEMENT:
				return getTCArrangement();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_CAPTION:
				return getTCCaption();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_GROUP:
				return getTCGroup();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_HEADER:
				return getTCHeader();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_LOCATION:
				return getTCLocation();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_NOTEBOOK:
				return getTCNotebook();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJECT:
				return getTCObject();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJ_PART:
				return getTCObjPart();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PASSPORT:
				return getTCPassport();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PICTURE:
				return getTCPicture();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SCENE:
				return getTCScene();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SUPER_TEXT:
				return getTCSuperText();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_TEXT:
				return getTCText();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TERM:
				return getTerm();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TEXT_TYPE:
				return getTextType();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__THS_ENTRY:
				return getThsEntry();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLAT:
				return getTranslat();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLATION:
				return getTranslation();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__UPPER_TERM:
				return getUpperTerm();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_FOLDER:
				return getWbFolder();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_SLIPS:
				return getWbSlips();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WORK:
				return getWork();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BAUSTEIN_PASSAGE:
				setBausteinPassage((BausteinPassageType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				setBibliography((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BTS_CODES:
				setBtsCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE:
				setCode((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE1:
				setCode1((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE2:
				setCode2((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODES:
				setCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE:
				setDate((DateType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE_THS:
				setDateThs((DateThsType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEFINITION:
				setDefinition((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEPICTION:
				setDepiction((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_PUNCTUATION:
				setEgyPunctuation((EgyPunctuationType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SENT:
				setEgySent((EgySentType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SUB_TXT:
				setEgySubTxt((EgySubTxtType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SZENARIO:
				setEgySzenario((EgySzenarioType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB1:
				setEgyTB1((EgyTB1Type)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_END:
				setEgyTB3End((EgyTB3EndType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_START:
				setEgyTB3Start((EgyTB3StartType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT:
				setEgyTxt((EgyTxtType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT_CORPUS:
				setEgyTxtCorpus((EgyTxtCorpusType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_WORD:
				setEgyWord((EgyWordType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORM:
				setForm((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORMATTING_ELEMENT:
				setFormattingElement((FormattingElementType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FULL_NAME:
				setFullName((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE:
				setGlosse((GlosseType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE_PASSAGE:
				setGlossePassage((GlossePassageType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GRAPHICS:
				setGraphics((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__HIERARCHY:
				setHierarchy((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANG_COMMENT:
				setLangComment((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE_PASSAGE:
				setLanguagePassage((LanguagePassageType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LEIPZIG_PASSAGE:
				setLeipzigPassage((LeipzigPassageType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LINE_COUNT:
				setLineCount((LineCountType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LOWER_TERM:
				setLowerTerm((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MUSEUM_NUMBER:
				setMuseumNumber((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME_SORT:
				setNameSort((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTES:
				setNotes((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__OBJECT_TYPE:
				setObjectType((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PASSPORT_DATA_ITEM:
				setPassportDataItem((PassportDataItemType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURE:
				setPicture((PictureType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURES_TABLE:
				setPicturesTable((PicturesTableType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROJECT:
				setProject((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROVENANCE:
				setProvenance((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PUNCTUATION:
				setPunctuation((PunctuationType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_ARRANGEMENT:
				setTCArrangement((TCArrangementType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_CAPTION:
				setTCCaption((TCCaptionType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_GROUP:
				setTCGroup((TCGroupType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_HEADER:
				setTCHeader((TCHeaderType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_LOCATION:
				setTCLocation((TCLocationType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_NOTEBOOK:
				setTCNotebook((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJECT:
				setTCObject((TCObjectType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJ_PART:
				setTCObjPart((TCObjPartType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PASSPORT:
				setTCPassport((TCPassportType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PICTURE:
				setTCPicture((TCPictureType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SCENE:
				setTCScene((TCSceneType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SUPER_TEXT:
				setTCSuperText((TCSuperTextType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_TEXT:
				setTCText((TCTextType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TERM:
				setTerm((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TEXT_TYPE:
				setTextType((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__THS_ENTRY:
				setThsEntry((ThsEntryType)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TITLE:
				setTitle((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLAT:
				setTranslat((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLATION:
				setTranslation((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__UPPER_TERM:
				setUpperTerm((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__VALUE:
				setValue((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_FOLDER:
				setWbFolder((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_SLIPS:
				setWbSlips((String)newValue);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WORK:
				setWork((WorkType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BAUSTEIN_PASSAGE:
				setBausteinPassage((BausteinPassageType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				setBibliography(BIBLIOGRAPHY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BTS_CODES:
				setBtsCodes(BTS_CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE1:
				setCode1(CODE1_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE2:
				setCode2(CODE2_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODES:
				setCodes(CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE:
				setDate((DateType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE_THS:
				setDateThs((DateThsType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEPICTION:
				setDepiction((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_PUNCTUATION:
				setEgyPunctuation((EgyPunctuationType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SENT:
				setEgySent((EgySentType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SUB_TXT:
				setEgySubTxt((EgySubTxtType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SZENARIO:
				setEgySzenario((EgySzenarioType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB1:
				setEgyTB1((EgyTB1Type)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_END:
				setEgyTB3End((EgyTB3EndType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_START:
				setEgyTB3Start((EgyTB3StartType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT:
				setEgyTxt((EgyTxtType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT_CORPUS:
				setEgyTxtCorpus((EgyTxtCorpusType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_WORD:
				setEgyWord((EgyWordType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORM:
				setForm(FORM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORMATTING_ELEMENT:
				setFormattingElement((FormattingElementType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE:
				setGlosse((GlosseType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE_PASSAGE:
				setGlossePassage((GlossePassageType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GRAPHICS:
				setGraphics(GRAPHICS_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__HIERARCHY:
				setHierarchy(HIERARCHY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANG_COMMENT:
				setLangComment(LANG_COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE_PASSAGE:
				setLanguagePassage((LanguagePassageType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LEIPZIG_PASSAGE:
				setLeipzigPassage((LeipzigPassageType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LINE_COUNT:
				setLineCount((LineCountType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LOWER_TERM:
				setLowerTerm(LOWER_TERM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MUSEUM_NUMBER:
				setMuseumNumber(MUSEUM_NUMBER_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME_SORT:
				setNameSort(NAME_SORT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__OBJECT_TYPE:
				setObjectType((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PASSPORT_DATA_ITEM:
				setPassportDataItem((PassportDataItemType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURE:
				setPicture((PictureType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURES_TABLE:
				setPicturesTable((PicturesTableType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROVENANCE:
				setProvenance((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PUNCTUATION:
				setPunctuation((PunctuationType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_ARRANGEMENT:
				setTCArrangement((TCArrangementType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_CAPTION:
				setTCCaption((TCCaptionType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_GROUP:
				setTCGroup((TCGroupType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_HEADER:
				setTCHeader((TCHeaderType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_LOCATION:
				setTCLocation((TCLocationType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_NOTEBOOK:
				setTCNotebook(TC_NOTEBOOK_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJECT:
				setTCObject((TCObjectType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJ_PART:
				setTCObjPart((TCObjPartType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PASSPORT:
				setTCPassport((TCPassportType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PICTURE:
				setTCPicture((TCPictureType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SCENE:
				setTCScene((TCSceneType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SUPER_TEXT:
				setTCSuperText((TCSuperTextType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_TEXT:
				setTCText((TCTextType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TEXT_TYPE:
				setTextType((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__THS_ENTRY:
				setThsEntry((ThsEntryType)null);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLAT:
				setTranslat(TRANSLAT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLATION:
				setTranslation(TRANSLATION_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__UPPER_TERM:
				setUpperTerm(UPPER_TERM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_FOLDER:
				setWbFolder(WB_FOLDER_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_SLIPS:
				setWbSlips(WB_SLIPS_EDEFAULT);
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WORK:
				setWork((WorkType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CorpusDTDneuPackage.DOCUMENT_ROOT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? getAuthor() != null : !AUTHOR_EDEFAULT.equals(getAuthor());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BAUSTEIN_PASSAGE:
				return getBausteinPassage() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				return BIBLIOGRAPHY_EDEFAULT == null ? getBibliography() != null : !BIBLIOGRAPHY_EDEFAULT.equals(getBibliography());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BTS_CODES:
				return BTS_CODES_EDEFAULT == null ? getBtsCodes() != null : !BTS_CODES_EDEFAULT.equals(getBtsCodes());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE1:
				return CODE1_EDEFAULT == null ? getCode1() != null : !CODE1_EDEFAULT.equals(getCode1());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE2:
				return CODE2_EDEFAULT == null ? getCode2() != null : !CODE2_EDEFAULT.equals(getCode2());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODES:
				return CODES_EDEFAULT == null ? getCodes() != null : !CODES_EDEFAULT.equals(getCodes());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE:
				return getDate() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE_THS:
				return getDateThs() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEFINITION:
				return DEFINITION_EDEFAULT == null ? getDefinition() != null : !DEFINITION_EDEFAULT.equals(getDefinition());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEPICTION:
				return getDepiction() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_PUNCTUATION:
				return getEgyPunctuation() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SENT:
				return getEgySent() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SUB_TXT:
				return getEgySubTxt() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SZENARIO:
				return getEgySzenario() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB1:
				return getEgyTB1() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_END:
				return getEgyTB3End() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_START:
				return getEgyTB3Start() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT:
				return getEgyTxt() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT_CORPUS:
				return getEgyTxtCorpus() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_WORD:
				return getEgyWord() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? getFileName() != null : !FILE_NAME_EDEFAULT.equals(getFileName());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? getFilePath() != null : !FILE_PATH_EDEFAULT.equals(getFilePath());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORM:
				return FORM_EDEFAULT == null ? getForm() != null : !FORM_EDEFAULT.equals(getForm());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORMATTING_ELEMENT:
				return getFormattingElement() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE:
				return getGlosse() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE_PASSAGE:
				return getGlossePassage() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GRAPHICS:
				return GRAPHICS_EDEFAULT == null ? getGraphics() != null : !GRAPHICS_EDEFAULT.equals(getGraphics());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__HIERARCHY:
				return HIERARCHY_EDEFAULT == null ? getHierarchy() != null : !HIERARCHY_EDEFAULT.equals(getHierarchy());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANG_COMMENT:
				return LANG_COMMENT_EDEFAULT == null ? getLangComment() != null : !LANG_COMMENT_EDEFAULT.equals(getLangComment());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE_PASSAGE:
				return getLanguagePassage() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LEIPZIG_PASSAGE:
				return getLeipzigPassage() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LINE_COUNT:
				return getLineCount() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LOWER_TERM:
				return LOWER_TERM_EDEFAULT == null ? getLowerTerm() != null : !LOWER_TERM_EDEFAULT.equals(getLowerTerm());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MUSEUM_NUMBER:
				return MUSEUM_NUMBER_EDEFAULT == null ? getMuseumNumber() != null : !MUSEUM_NUMBER_EDEFAULT.equals(getMuseumNumber());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME_SORT:
				return NAME_SORT_EDEFAULT == null ? getNameSort() != null : !NAME_SORT_EDEFAULT.equals(getNameSort());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTE:
				return getNote() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__OBJECT_TYPE:
				return getObjectType() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PASSPORT_DATA_ITEM:
				return getPassportDataItem() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURE:
				return getPicture() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURES_TABLE:
				return getPicturesTable() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROJECT:
				return PROJECT_EDEFAULT == null ? getProject() != null : !PROJECT_EDEFAULT.equals(getProject());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? getProtocol() != null : !PROTOCOL_EDEFAULT.equals(getProtocol());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROVENANCE:
				return getProvenance() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PUNCTUATION:
				return getPunctuation() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_ARRANGEMENT:
				return getTCArrangement() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_CAPTION:
				return getTCCaption() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_GROUP:
				return getTCGroup() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_HEADER:
				return getTCHeader() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_LOCATION:
				return getTCLocation() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_NOTEBOOK:
				return TC_NOTEBOOK_EDEFAULT == null ? getTCNotebook() != null : !TC_NOTEBOOK_EDEFAULT.equals(getTCNotebook());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJECT:
				return getTCObject() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJ_PART:
				return getTCObjPart() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PASSPORT:
				return getTCPassport() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PICTURE:
				return getTCPicture() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SCENE:
				return getTCScene() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SUPER_TEXT:
				return getTCSuperText() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_TEXT:
				return getTCText() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TERM:
				return TERM_EDEFAULT == null ? getTerm() != null : !TERM_EDEFAULT.equals(getTerm());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TEXT_TYPE:
				return getTextType() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__THS_ENTRY:
				return getThsEntry() != null;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLAT:
				return TRANSLAT_EDEFAULT == null ? getTranslat() != null : !TRANSLAT_EDEFAULT.equals(getTranslat());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLATION:
				return TRANSLATION_EDEFAULT == null ? getTranslation() != null : !TRANSLATION_EDEFAULT.equals(getTranslation());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__UPPER_TERM:
				return UPPER_TERM_EDEFAULT == null ? getUpperTerm() != null : !UPPER_TERM_EDEFAULT.equals(getUpperTerm());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_FOLDER:
				return WB_FOLDER_EDEFAULT == null ? getWbFolder() != null : !WB_FOLDER_EDEFAULT.equals(getWbFolder());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_SLIPS:
				return WB_SLIPS_EDEFAULT == null ? getWbSlips() != null : !WB_SLIPS_EDEFAULT.equals(getWbSlips());
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WORK:
				return getWork() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
