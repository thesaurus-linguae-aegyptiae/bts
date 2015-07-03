/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslFactory
 * @model kind="package"
 * @generated
 */
public interface EgyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "egyDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bbaw.org/bts/corpus/text/egy/EgyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "egyDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EgyDslPackage eINSTANCE = org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl <em>Text Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextContent()
   * @generated
   */
  int TEXT_CONTENT = 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Text Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl <em>Text Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextItem()
   * @generated
   */
  int TEXT_ITEM = 1;

  /**
   * The number of structural features of the '<em>Text Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl <em>Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentence()
   * @generated
   */
  int SENTENCE = 2;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE__ITEMS = TEXT_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = TEXT_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl <em>Sentence Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItem()
   * @generated
   */
  int SENTENCE_ITEM = 3;

  /**
   * The number of structural features of the '<em>Sentence Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl <em>Abstract Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAbstractMarker()
   * @generated
   */
  int ABSTRACT_MARKER = 4;

  /**
   * The number of structural features of the '<em>Abstract Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_MARKER_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl <em>Ambivalence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAmbivalence()
   * @generated
   */
  int AMBIVALENCE = 5;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIVALENCE__CASES = SENTENCE_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ambivalence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIVALENCE_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCase()
   * @generated
   */
  int CASE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__ITEMS = 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl <em>Sentence Item No Ambivalence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItemNoAmbivalence()
   * @generated
   */
  int SENTENCE_ITEM_NO_AMBIVALENCE = 7;

  /**
   * The number of structural features of the '<em>Sentence Item No Ambivalence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_ITEM_NO_AMBIVALENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl <em>Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMarker()
   * @generated
   */
  int MARKER = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER__TYPE = ABSTRACT_MARKER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER_FEATURE_COUNT = ABSTRACT_MARKER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionMarkerImpl <em>Destruction Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestructionMarker()
   * @generated
   */
  int DESTRUCTION_MARKER = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTION_MARKER__TYPE = ABSTRACT_MARKER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Destruction Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTION_MARKER_FEATURE_COUNT = ABSTRACT_MARKER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl <em>Word</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWord()
   * @generated
   */
  int WORD = 10;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD__WCHAR = SENTENCE_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Word</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl <em>Word Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordPart()
   * @generated
   */
  int WORD_PART = 11;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_PART__WCHAR = 0;

  /**
   * The number of structural features of the '<em>Word Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl <em>Word Middle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordMiddle()
   * @generated
   */
  int WORD_MIDDLE = 12;

  /**
   * The number of structural features of the '<em>Word Middle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_MIDDLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl <em>Chars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getChars()
   * @generated
   */
  int CHARS = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARS__NAME = WORD_MIDDLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Chars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARS_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl <em>Brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrackets()
   * @generated
   */
  int BRACKETS = 14;

  /**
   * The number of structural features of the '<em>Brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETS_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.OvalImpl <em>Oval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.OvalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getOval()
   * @generated
   */
  int OVAL = 15;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVAL__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Oval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVAL_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SerechImpl <em>Serech</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SerechImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSerech()
   * @generated
   */
  int SERECH = 16;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERECH__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Serech</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERECH_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CartoucheImpl <em>Cartouche</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CartoucheImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCartouche()
   * @generated
   */
  int CARTOUCHE = 17;

  /**
   * The number of structural features of the '<em>Cartouche</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARTOUCHE_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl <em>No Cartouche</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoCartouche()
   * @generated
   */
  int NO_CARTOUCHE = 18;

  /**
   * The number of structural features of the '<em>No Cartouche</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_CARTOUCHE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl <em>Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpanded()
   * @generated
   */
  int EXPANDED = 19;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDED__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDED_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl <em>Ancient Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpanded()
   * @generated
   */
  int ANCIENT_EXPANDED = 20;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCIENT_EXPANDED__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ancient Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCIENT_EXPANDED_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl <em>No Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpanded()
   * @generated
   */
  int NO_EXPANDED = 21;

  /**
   * The number of structural features of the '<em>No Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EXPANDED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl <em>Emendation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendation()
   * @generated
   */
  int EMENDATION = 22;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMENDATION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Emendation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMENDATION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl <em>No Emendation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoEmendation()
   * @generated
   */
  int NO_EMENDATION = 23;

  /**
   * The number of structural features of the '<em>No Emendation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EMENDATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl <em>Disputable Reading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableReading()
   * @generated
   */
  int DISPUTABLE_READING = 24;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPUTABLE_READING__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disputable Reading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPUTABLE_READING_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl <em>No Disputable Reading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDisputableReading()
   * @generated
   */
  int NO_DISPUTABLE_READING = 25;

  /**
   * The number of structural features of the '<em>No Disputable Reading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_DISPUTABLE_READING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl <em>Lacuna</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getLacuna()
   * @generated
   */
  int LACUNA = 26;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LACUNA__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lacuna</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LACUNA_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl <em>No Lacuna</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoLacuna()
   * @generated
   */
  int NO_LACUNA = 27;

  /**
   * The number of structural features of the '<em>No Lacuna</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_LACUNA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl <em>Deletion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletion()
   * @generated
   */
  int DELETION = 28;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Deletion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl <em>No Deletion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDeletion()
   * @generated
   */
  int NO_DELETION = 29;

  /**
   * The number of structural features of the '<em>No Deletion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_DELETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl <em>Expanded Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpandedColumn()
   * @generated
   */
  int EXPANDED_COLUMN = 30;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDED_COLUMN__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expanded Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDED_COLUMN_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl <em>No Expanded Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpandedColumn()
   * @generated
   */
  int NO_EXPANDED_COLUMN = 31;

  /**
   * The number of structural features of the '<em>No Expanded Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EXPANDED_COLUMN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl <em>Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasur()
   * @generated
   */
  int RASUR = 32;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASUR__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASUR_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl <em>No Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRasur()
   * @generated
   */
  int NO_RASUR = 33;

  /**
   * The number of structural features of the '<em>No Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RASUR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl <em>No Ancient Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoAncientExpanded()
   * @generated
   */
  int NO_ANCIENT_EXPANDED = 34;

  /**
   * The number of structural features of the '<em>No Ancient Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_ANCIENT_EXPANDED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl <em>Restoration Over Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasur()
   * @generated
   */
  int RESTORATION_OVER_RASUR = 35;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTORATION_OVER_RASUR__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Restoration Over Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTORATION_OVER_RASUR_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl <em>No Restoration Over Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRestorationOverRasur()
   * @generated
   */
  int NO_RESTORATION_OVER_RASUR = 36;

  /**
   * The number of structural features of the '<em>No Restoration Over Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RESTORATION_OVER_RASUR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl <em>Partial Destruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestruction()
   * @generated
   */
  int PARTIAL_DESTRUCTION = 37;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_DESTRUCTION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Partial Destruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_DESTRUCTION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl <em>No Partial Destruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoPartialDestruction()
   * @generated
   */
  int NO_PARTIAL_DESTRUCTION = 38;

  /**
   * The number of structural features of the '<em>No Partial Destruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PARTIAL_DESTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl <em>Interfix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfix()
   * @generated
   */
  int INTERFIX = 39;

  /**
   * The number of structural features of the '<em>Interfix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl <em>Interfix Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixLexical()
   * @generated
   */
  int INTERFIX_LEXICAL = 40;

  /**
   * The number of structural features of the '<em>Interfix Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl <em>Interfix Flexion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixFlexion()
   * @generated
   */
  int INTERFIX_FLEXION = 41;

  /**
   * The number of structural features of the '<em>Interfix Flexion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FLEXION_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl <em>Interfix Suffix Pronom Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixSuffixPronomLexical()
   * @generated
   */
  int INTERFIX_SUFFIX_PRONOM_LEXICAL = 42;

  /**
   * The number of structural features of the '<em>Interfix Suffix Pronom Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_SUFFIX_PRONOM_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl <em>Interfix Prefix Non Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixNonLexical()
   * @generated
   */
  int INTERFIX_PREFIX_NON_LEXICAL = 43;

  /**
   * The number of structural features of the '<em>Interfix Prefix Non Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_PREFIX_NON_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl <em>Interfix Prefix Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixLexical()
   * @generated
   */
  int INTERFIX_PREFIX_LEXICAL = 44;

  /**
   * The number of structural features of the '<em>Interfix Prefix Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_PREFIX_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl <em>Interfix Connection Syllabic Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixConnectionSyllabicGroup()
   * @generated
   */
  int INTERFIX_CONNECTION_SYLLABIC_GROUP = 45;

  /**
   * The number of structural features of the '<em>Interfix Connection Syllabic Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_CONNECTION_SYLLABIC_GROUP_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixCompoundWordsImpl <em>Interfix Compound Words</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixCompoundWordsImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixCompoundWords()
   * @generated
   */
  int INTERFIX_COMPOUND_WORDS = 46;

  /**
   * The number of structural features of the '<em>Interfix Compound Words</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_COMPOUND_WORDS_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPhoneticalComplementImpl <em>Interfix Phonetical Complement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPhoneticalComplementImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPhoneticalComplement()
   * @generated
   */
  int INTERFIX_PHONETICAL_COMPLEMENT = 47;

  /**
   * The number of structural features of the '<em>Interfix Phonetical Complement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_PHONETICAL_COMPLEMENT_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl <em>Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersMarker()
   * @generated
   */
  int VERS_MARKER = 48;

  /**
   * The number of structural features of the '<em>Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERS_MARKER_FEATURE_COUNT = ABSTRACT_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationVersMarkerImpl <em>Emendation Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendationVersMarker()
   * @generated
   */
  int EMENDATION_VERS_MARKER = 49;

  /**
   * The number of structural features of the '<em>Emendation Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMENDATION_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableVersMarkerImpl <em>Disputable Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableVersMarker()
   * @generated
   */
  int DISPUTABLE_VERS_MARKER = 50;

  /**
   * The number of structural features of the '<em>Disputable Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPUTABLE_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableDestroyedVersMarkerImpl <em>Disputable Destroyed Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableDestroyedVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableDestroyedVersMarker()
   * @generated
   */
  int DISPUTABLE_DESTROYED_VERS_MARKER = 51;

  /**
   * The number of structural features of the '<em>Disputable Destroyed Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPUTABLE_DESTROYED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableDeletedVersMarkerImpl <em>Disputable Deleted Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableDeletedVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableDeletedVersMarker()
   * @generated
   */
  int DISPUTABLE_DELETED_VERS_MARKER = 52;

  /**
   * The number of structural features of the '<em>Disputable Deleted Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPUTABLE_DELETED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedVersMarkerImpl <em>Deleted Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletedVersMarker()
   * @generated
   */
  int DELETED_VERS_MARKER = 53;

  /**
   * The number of structural features of the '<em>Deleted Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedDisputableVersMarkerImpl <em>Deleted Disputable Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedDisputableVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletedDisputableVersMarker()
   * @generated
   */
  int DELETED_DISPUTABLE_VERS_MARKER = 54;

  /**
   * The number of structural features of the '<em>Deleted Disputable Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETED_DISPUTABLE_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedDestroyedVersMarkerImpl <em>Deleted Destroyed Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedDestroyedVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletedDestroyedVersMarker()
   * @generated
   */
  int DELETED_DESTROYED_VERS_MARKER = 55;

  /**
   * The number of structural features of the '<em>Deleted Destroyed Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETED_DESTROYED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersMarkerImpl <em>Destroyed Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedVersMarker()
   * @generated
   */
  int DESTROYED_VERS_MARKER = 56;

  /**
   * The number of structural features of the '<em>Destroyed Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTROYED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersFrontierMarkerImpl <em>Destroyed Vers Frontier Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersFrontierMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedVersFrontierMarker()
   * @generated
   */
  int DESTROYED_VERS_FRONTIER_MARKER = 57;

  /**
   * The number of structural features of the '<em>Destroyed Vers Frontier Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTROYED_VERS_FRONTIER_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedDisputableVersFrontierMarkerImpl <em>Destroyed Disputable Vers Frontier Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedDisputableVersFrontierMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedDisputableVersFrontierMarker()
   * @generated
   */
  int DESTROYED_DISPUTABLE_VERS_FRONTIER_MARKER = 58;

  /**
   * The number of structural features of the '<em>Destroyed Disputable Vers Frontier Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTROYED_DISPUTABLE_VERS_FRONTIER_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedDeletedVersMarkerImpl <em>Destroyed Deleted Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedDeletedVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedDeletedVersMarker()
   * @generated
   */
  int DESTROYED_DELETED_VERS_MARKER = 59;

  /**
   * The number of structural features of the '<em>Destroyed Deleted Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTROYED_DELETED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedVersMarkerImpl <em>Partial Destroyed Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestroyedVersMarker()
   * @generated
   */
  int PARTIAL_DESTROYED_VERS_MARKER = 60;

  /**
   * The number of structural features of the '<em>Partial Destroyed Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_DESTROYED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedDisputableVersMarkerImpl <em>Partial Destroyed Disputable Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedDisputableVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestroyedDisputableVersMarker()
   * @generated
   */
  int PARTIAL_DESTROYED_DISPUTABLE_VERS_MARKER = 61;

  /**
   * The number of structural features of the '<em>Partial Destroyed Disputable Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_DESTROYED_DISPUTABLE_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedDeletedVersMarkerImpl <em>Partial Destroyed Deleted Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedDeletedVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestroyedDeletedVersMarker()
   * @generated
   */
  int PARTIAL_DESTROYED_DELETED_VERS_MARKER = 62;

  /**
   * The number of structural features of the '<em>Partial Destroyed Deleted Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_DESTROYED_DELETED_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingVersMarkerImpl <em>Missing Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMissingVersMarker()
   * @generated
   */
  int MISSING_VERS_MARKER = 63;

  /**
   * The number of structural features of the '<em>Missing Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSING_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingDisputableVersMarkerImpl <em>Missing Disputable Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingDisputableVersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMissingDisputableVersMarker()
   * @generated
   */
  int MISSING_DISPUTABLE_VERS_MARKER = 64;

  /**
   * The number of structural features of the '<em>Missing Disputable Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSING_DISPUTABLE_VERS_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurMarkerImpl <em>Restoration Over Rasur Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasurMarker()
   * @generated
   */
  int RESTORATION_OVER_RASUR_MARKER = 65;

  /**
   * The number of structural features of the '<em>Restoration Over Rasur Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTORATION_OVER_RASUR_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedMarkerImpl <em>Ancient Expanded Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpandedMarker()
   * @generated
   */
  int ANCIENT_EXPANDED_MARKER = 66;

  /**
   * The number of structural features of the '<em>Ancient Expanded Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCIENT_EXPANDED_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurMarkerImpl <em>Rasur Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasurMarker()
   * @generated
   */
  int RASUR_MARKER = 67;

  /**
   * The number of structural features of the '<em>Rasur Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASUR_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl <em>Vers Frontier Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersFrontierMarker()
   * @generated
   */
  int VERS_FRONTIER_MARKER = 68;

  /**
   * The number of structural features of the '<em>Vers Frontier Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERS_FRONTIER_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl <em>Versbreak Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersbreakMarker()
   * @generated
   */
  int VERSBREAK_MARKER = 69;

  /**
   * The number of structural features of the '<em>Versbreak Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSBREAK_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl <em>Broken Versbreak Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrokenVersbreakMarker()
   * @generated
   */
  int BROKEN_VERSBREAK_MARKER = 70;

  /**
   * The number of structural features of the '<em>Broken Versbreak Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROKEN_VERSBREAK_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextContent <em>Text Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Content</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextContent
   * @generated
   */
  EClass getTextContent();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextContent#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextContent#getItems()
   * @see #getTextContent()
   * @generated
   */
  EReference getTextContent_Items();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextItem <em>Text Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Item</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextItem
   * @generated
   */
  EClass getTextItem();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Sentence
   * @generated
   */
  EClass getSentence();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Sentence#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Sentence#getItems()
   * @see #getSentence()
   * @generated
   */
  EReference getSentence_Items();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem <em>Sentence Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence Item</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem
   * @generated
   */
  EClass getSentenceItem();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker <em>Abstract Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker
   * @generated
   */
  EClass getAbstractMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence <em>Ambivalence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ambivalence</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence
   * @generated
   */
  EClass getAmbivalence();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence#getCases()
   * @see #getAmbivalence()
   * @generated
   */
  EReference getAmbivalence_Cases();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case#getName()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case#getItems()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Items();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence <em>Sentence Item No Ambivalence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence Item No Ambivalence</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence
   * @generated
   */
  EClass getSentenceItemNoAmbivalence();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Marker <em>Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Marker
   * @generated
   */
  EClass getMarker();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Marker#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Marker#getType()
   * @see #getMarker()
   * @generated
   */
  EAttribute getMarker_Type();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker <em>Destruction Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destruction Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker
   * @generated
   */
  EClass getDestructionMarker();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker#getType()
   * @see #getDestructionMarker()
   * @generated
   */
  EAttribute getDestructionMarker_Type();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Word
   * @generated
   */
  EClass getWord();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Word#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Word#getWChar()
   * @see #getWord()
   * @generated
   */
  EReference getWord_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart <em>Word Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word Part</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordPart
   * @generated
   */
  EClass getWordPart();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordPart#getWChar()
   * @see #getWordPart()
   * @generated
   */
  EReference getWordPart_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle <em>Word Middle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word Middle</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle
   * @generated
   */
  EClass getWordMiddle();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Chars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Chars
   * @generated
   */
  EClass getChars();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Chars#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Chars#getName()
   * @see #getChars()
   * @generated
   */
  EAttribute getChars_Name();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Brackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Brackets</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Brackets
   * @generated
   */
  EClass getBrackets();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Oval <em>Oval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Oval</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Oval
   * @generated
   */
  EClass getOval();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Oval#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Oval#getWChar()
   * @see #getOval()
   * @generated
   */
  EReference getOval_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Serech <em>Serech</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Serech</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Serech
   * @generated
   */
  EClass getSerech();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Serech#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Serech#getWChar()
   * @see #getSerech()
   * @generated
   */
  EReference getSerech_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Cartouche <em>Cartouche</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cartouche</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Cartouche
   * @generated
   */
  EClass getCartouche();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche <em>No Cartouche</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Cartouche</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche
   * @generated
   */
  EClass getNoCartouche();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Expanded <em>Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Expanded
   * @generated
   */
  EClass getExpanded();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Expanded#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Expanded#getWChar()
   * @see #getExpanded()
   * @generated
   */
  EReference getExpanded_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded <em>Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancient Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded
   * @generated
   */
  EClass getAncientExpanded();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded#getWChar()
   * @see #getAncientExpanded()
   * @generated
   */
  EReference getAncientExpanded_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded <em>No Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded
   * @generated
   */
  EClass getNoExpanded();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Emendation <em>Emendation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emendation</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Emendation
   * @generated
   */
  EClass getEmendation();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Emendation#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Emendation#getWChar()
   * @see #getEmendation()
   * @generated
   */
  EReference getEmendation_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation <em>No Emendation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Emendation</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation
   * @generated
   */
  EClass getNoEmendation();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading <em>Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disputable Reading</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading
   * @generated
   */
  EClass getDisputableReading();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading#getWChar()
   * @see #getDisputableReading()
   * @generated
   */
  EReference getDisputableReading_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading <em>No Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Disputable Reading</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading
   * @generated
   */
  EClass getNoDisputableReading();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna <em>Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lacuna</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna
   * @generated
   */
  EClass getLacuna();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna#getWChar()
   * @see #getLacuna()
   * @generated
   */
  EReference getLacuna_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna <em>No Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Lacuna</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna
   * @generated
   */
  EClass getNoLacuna();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Deletion <em>Deletion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deletion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Deletion
   * @generated
   */
  EClass getDeletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Deletion#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Deletion#getWChar()
   * @see #getDeletion()
   * @generated
   */
  EReference getDeletion_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion <em>No Deletion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Deletion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion
   * @generated
   */
  EClass getNoDeletion();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn <em>Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expanded Column</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn
   * @generated
   */
  EClass getExpandedColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn#getWChar()
   * @see #getExpandedColumn()
   * @generated
   */
  EReference getExpandedColumn_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn <em>No Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Expanded Column</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn
   * @generated
   */
  EClass getNoExpandedColumn();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Rasur <em>Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Rasur
   * @generated
   */
  EClass getRasur();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Rasur#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Rasur#getWChar()
   * @see #getRasur()
   * @generated
   */
  EReference getRasur_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur <em>No Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur
   * @generated
   */
  EClass getNoRasur();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded <em>No Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ancient Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded
   * @generated
   */
  EClass getNoAncientExpanded();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur <em>Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restoration Over Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur
   * @generated
   */
  EClass getRestorationOverRasur();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur#getWChar()
   * @see #getRestorationOverRasur()
   * @generated
   */
  EReference getRestorationOverRasur_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur <em>No Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Restoration Over Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur
   * @generated
   */
  EClass getNoRestorationOverRasur();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction <em>Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Destruction</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction
   * @generated
   */
  EClass getPartialDestruction();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction#getWChar()
   * @see #getPartialDestruction()
   * @generated
   */
  EReference getPartialDestruction_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction <em>No Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Partial Destruction</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction
   * @generated
   */
  EClass getNoPartialDestruction();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Interfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Interfix
   * @generated
   */
  EClass getInterfix();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical <em>Interfix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical
   * @generated
   */
  EClass getInterfixLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion <em>Interfix Flexion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Flexion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion
   * @generated
   */
  EClass getInterfixFlexion();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical <em>Interfix Suffix Pronom Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Suffix Pronom Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical
   * @generated
   */
  EClass getInterfixSuffixPronomLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical <em>Interfix Prefix Non Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Prefix Non Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical
   * @generated
   */
  EClass getInterfixPrefixNonLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical <em>Interfix Prefix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Prefix Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical
   * @generated
   */
  EClass getInterfixPrefixLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup <em>Interfix Connection Syllabic Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Connection Syllabic Group</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup
   * @generated
   */
  EClass getInterfixConnectionSyllabicGroup();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixCompoundWords <em>Interfix Compound Words</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Compound Words</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixCompoundWords
   * @generated
   */
  EClass getInterfixCompoundWords();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPhoneticalComplement <em>Interfix Phonetical Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Phonetical Complement</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPhoneticalComplement
   * @generated
   */
  EClass getInterfixPhoneticalComplement();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker <em>Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker
   * @generated
   */
  EClass getVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.EmendationVersMarker <em>Emendation Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emendation Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.EmendationVersMarker
   * @generated
   */
  EClass getEmendationVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker <em>Disputable Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disputable Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker
   * @generated
   */
  EClass getDisputableVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableDestroyedVersMarker <em>Disputable Destroyed Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disputable Destroyed Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableDestroyedVersMarker
   * @generated
   */
  EClass getDisputableDestroyedVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableDeletedVersMarker <em>Disputable Deleted Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disputable Deleted Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableDeletedVersMarker
   * @generated
   */
  EClass getDisputableDeletedVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker <em>Deleted Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deleted Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker
   * @generated
   */
  EClass getDeletedVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DeletedDisputableVersMarker <em>Deleted Disputable Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deleted Disputable Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DeletedDisputableVersMarker
   * @generated
   */
  EClass getDeletedDisputableVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DeletedDestroyedVersMarker <em>Deleted Destroyed Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deleted Destroyed Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DeletedDestroyedVersMarker
   * @generated
   */
  EClass getDeletedDestroyedVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker <em>Destroyed Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destroyed Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker
   * @generated
   */
  EClass getDestroyedVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersFrontierMarker <em>Destroyed Vers Frontier Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destroyed Vers Frontier Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersFrontierMarker
   * @generated
   */
  EClass getDestroyedVersFrontierMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedDisputableVersFrontierMarker <em>Destroyed Disputable Vers Frontier Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destroyed Disputable Vers Frontier Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedDisputableVersFrontierMarker
   * @generated
   */
  EClass getDestroyedDisputableVersFrontierMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedDeletedVersMarker <em>Destroyed Deleted Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destroyed Deleted Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedDeletedVersMarker
   * @generated
   */
  EClass getDestroyedDeletedVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedVersMarker <em>Partial Destroyed Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Destroyed Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedVersMarker
   * @generated
   */
  EClass getPartialDestroyedVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedDisputableVersMarker <em>Partial Destroyed Disputable Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Destroyed Disputable Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedDisputableVersMarker
   * @generated
   */
  EClass getPartialDestroyedDisputableVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedDeletedVersMarker <em>Partial Destroyed Deleted Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Destroyed Deleted Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedDeletedVersMarker
   * @generated
   */
  EClass getPartialDestroyedDeletedVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker <em>Missing Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Missing Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker
   * @generated
   */
  EClass getMissingVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.MissingDisputableVersMarker <em>Missing Disputable Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Missing Disputable Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.MissingDisputableVersMarker
   * @generated
   */
  EClass getMissingDisputableVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker <em>Restoration Over Rasur Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restoration Over Rasur Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker
   * @generated
   */
  EClass getRestorationOverRasurMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker <em>Ancient Expanded Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancient Expanded Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker
   * @generated
   */
  EClass getAncientExpandedMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker <em>Rasur Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rasur Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker
   * @generated
   */
  EClass getRasurMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker <em>Vers Frontier Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vers Frontier Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker
   * @generated
   */
  EClass getVersFrontierMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker <em>Versbreak Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Versbreak Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker
   * @generated
   */
  EClass getVersbreakMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker <em>Broken Versbreak Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broken Versbreak Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker
   * @generated
   */
  EClass getBrokenVersbreakMarker();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EgyDslFactory getEgyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl <em>Text Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextContent()
     * @generated
     */
    EClass TEXT_CONTENT = eINSTANCE.getTextContent();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_CONTENT__ITEMS = eINSTANCE.getTextContent_Items();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl <em>Text Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextItem()
     * @generated
     */
    EClass TEXT_ITEM = eINSTANCE.getTextItem();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentence()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSentence();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENTENCE__ITEMS = eINSTANCE.getSentence_Items();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl <em>Sentence Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItem()
     * @generated
     */
    EClass SENTENCE_ITEM = eINSTANCE.getSentenceItem();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl <em>Abstract Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAbstractMarker()
     * @generated
     */
    EClass ABSTRACT_MARKER = eINSTANCE.getAbstractMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl <em>Ambivalence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAmbivalence()
     * @generated
     */
    EClass AMBIVALENCE = eINSTANCE.getAmbivalence();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AMBIVALENCE__CASES = eINSTANCE.getAmbivalence_Cases();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__NAME = eINSTANCE.getCase_Name();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__ITEMS = eINSTANCE.getCase_Items();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl <em>Sentence Item No Ambivalence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItemNoAmbivalence()
     * @generated
     */
    EClass SENTENCE_ITEM_NO_AMBIVALENCE = eINSTANCE.getSentenceItemNoAmbivalence();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl <em>Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMarker()
     * @generated
     */
    EClass MARKER = eINSTANCE.getMarker();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MARKER__TYPE = eINSTANCE.getMarker_Type();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionMarkerImpl <em>Destruction Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestructionMarker()
     * @generated
     */
    EClass DESTRUCTION_MARKER = eINSTANCE.getDestructionMarker();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESTRUCTION_MARKER__TYPE = eINSTANCE.getDestructionMarker_Type();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl <em>Word</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWord()
     * @generated
     */
    EClass WORD = eINSTANCE.getWord();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORD__WCHAR = eINSTANCE.getWord_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl <em>Word Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordPart()
     * @generated
     */
    EClass WORD_PART = eINSTANCE.getWordPart();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORD_PART__WCHAR = eINSTANCE.getWordPart_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl <em>Word Middle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordMiddle()
     * @generated
     */
    EClass WORD_MIDDLE = eINSTANCE.getWordMiddle();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl <em>Chars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getChars()
     * @generated
     */
    EClass CHARS = eINSTANCE.getChars();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARS__NAME = eINSTANCE.getChars_Name();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl <em>Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrackets()
     * @generated
     */
    EClass BRACKETS = eINSTANCE.getBrackets();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.OvalImpl <em>Oval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.OvalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getOval()
     * @generated
     */
    EClass OVAL = eINSTANCE.getOval();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OVAL__WCHAR = eINSTANCE.getOval_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SerechImpl <em>Serech</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SerechImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSerech()
     * @generated
     */
    EClass SERECH = eINSTANCE.getSerech();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERECH__WCHAR = eINSTANCE.getSerech_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CartoucheImpl <em>Cartouche</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CartoucheImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCartouche()
     * @generated
     */
    EClass CARTOUCHE = eINSTANCE.getCartouche();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl <em>No Cartouche</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoCartouche()
     * @generated
     */
    EClass NO_CARTOUCHE = eINSTANCE.getNoCartouche();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl <em>Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpanded()
     * @generated
     */
    EClass EXPANDED = eINSTANCE.getExpanded();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPANDED__WCHAR = eINSTANCE.getExpanded_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl <em>Ancient Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpanded()
     * @generated
     */
    EClass ANCIENT_EXPANDED = eINSTANCE.getAncientExpanded();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCIENT_EXPANDED__WCHAR = eINSTANCE.getAncientExpanded_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl <em>No Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpanded()
     * @generated
     */
    EClass NO_EXPANDED = eINSTANCE.getNoExpanded();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl <em>Emendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendation()
     * @generated
     */
    EClass EMENDATION = eINSTANCE.getEmendation();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMENDATION__WCHAR = eINSTANCE.getEmendation_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl <em>No Emendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoEmendation()
     * @generated
     */
    EClass NO_EMENDATION = eINSTANCE.getNoEmendation();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl <em>Disputable Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableReading()
     * @generated
     */
    EClass DISPUTABLE_READING = eINSTANCE.getDisputableReading();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPUTABLE_READING__WCHAR = eINSTANCE.getDisputableReading_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl <em>No Disputable Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDisputableReading()
     * @generated
     */
    EClass NO_DISPUTABLE_READING = eINSTANCE.getNoDisputableReading();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl <em>Lacuna</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getLacuna()
     * @generated
     */
    EClass LACUNA = eINSTANCE.getLacuna();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LACUNA__WCHAR = eINSTANCE.getLacuna_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl <em>No Lacuna</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoLacuna()
     * @generated
     */
    EClass NO_LACUNA = eINSTANCE.getNoLacuna();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl <em>Deletion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletion()
     * @generated
     */
    EClass DELETION = eINSTANCE.getDeletion();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETION__WCHAR = eINSTANCE.getDeletion_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl <em>No Deletion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDeletion()
     * @generated
     */
    EClass NO_DELETION = eINSTANCE.getNoDeletion();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl <em>Expanded Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpandedColumn()
     * @generated
     */
    EClass EXPANDED_COLUMN = eINSTANCE.getExpandedColumn();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPANDED_COLUMN__WCHAR = eINSTANCE.getExpandedColumn_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl <em>No Expanded Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpandedColumn()
     * @generated
     */
    EClass NO_EXPANDED_COLUMN = eINSTANCE.getNoExpandedColumn();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl <em>Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasur()
     * @generated
     */
    EClass RASUR = eINSTANCE.getRasur();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RASUR__WCHAR = eINSTANCE.getRasur_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl <em>No Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRasur()
     * @generated
     */
    EClass NO_RASUR = eINSTANCE.getNoRasur();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl <em>No Ancient Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoAncientExpanded()
     * @generated
     */
    EClass NO_ANCIENT_EXPANDED = eINSTANCE.getNoAncientExpanded();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl <em>Restoration Over Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasur()
     * @generated
     */
    EClass RESTORATION_OVER_RASUR = eINSTANCE.getRestorationOverRasur();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTORATION_OVER_RASUR__WCHAR = eINSTANCE.getRestorationOverRasur_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl <em>No Restoration Over Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRestorationOverRasur()
     * @generated
     */
    EClass NO_RESTORATION_OVER_RASUR = eINSTANCE.getNoRestorationOverRasur();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl <em>Partial Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestruction()
     * @generated
     */
    EClass PARTIAL_DESTRUCTION = eINSTANCE.getPartialDestruction();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL_DESTRUCTION__WCHAR = eINSTANCE.getPartialDestruction_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl <em>No Partial Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoPartialDestruction()
     * @generated
     */
    EClass NO_PARTIAL_DESTRUCTION = eINSTANCE.getNoPartialDestruction();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl <em>Interfix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfix()
     * @generated
     */
    EClass INTERFIX = eINSTANCE.getInterfix();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl <em>Interfix Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixLexical()
     * @generated
     */
    EClass INTERFIX_LEXICAL = eINSTANCE.getInterfixLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl <em>Interfix Flexion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixFlexion()
     * @generated
     */
    EClass INTERFIX_FLEXION = eINSTANCE.getInterfixFlexion();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl <em>Interfix Suffix Pronom Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixSuffixPronomLexical()
     * @generated
     */
    EClass INTERFIX_SUFFIX_PRONOM_LEXICAL = eINSTANCE.getInterfixSuffixPronomLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl <em>Interfix Prefix Non Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixNonLexical()
     * @generated
     */
    EClass INTERFIX_PREFIX_NON_LEXICAL = eINSTANCE.getInterfixPrefixNonLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl <em>Interfix Prefix Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixLexical()
     * @generated
     */
    EClass INTERFIX_PREFIX_LEXICAL = eINSTANCE.getInterfixPrefixLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl <em>Interfix Connection Syllabic Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixConnectionSyllabicGroup()
     * @generated
     */
    EClass INTERFIX_CONNECTION_SYLLABIC_GROUP = eINSTANCE.getInterfixConnectionSyllabicGroup();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixCompoundWordsImpl <em>Interfix Compound Words</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixCompoundWordsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixCompoundWords()
     * @generated
     */
    EClass INTERFIX_COMPOUND_WORDS = eINSTANCE.getInterfixCompoundWords();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPhoneticalComplementImpl <em>Interfix Phonetical Complement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPhoneticalComplementImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPhoneticalComplement()
     * @generated
     */
    EClass INTERFIX_PHONETICAL_COMPLEMENT = eINSTANCE.getInterfixPhoneticalComplement();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl <em>Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersMarker()
     * @generated
     */
    EClass VERS_MARKER = eINSTANCE.getVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationVersMarkerImpl <em>Emendation Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendationVersMarker()
     * @generated
     */
    EClass EMENDATION_VERS_MARKER = eINSTANCE.getEmendationVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableVersMarkerImpl <em>Disputable Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableVersMarker()
     * @generated
     */
    EClass DISPUTABLE_VERS_MARKER = eINSTANCE.getDisputableVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableDestroyedVersMarkerImpl <em>Disputable Destroyed Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableDestroyedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableDestroyedVersMarker()
     * @generated
     */
    EClass DISPUTABLE_DESTROYED_VERS_MARKER = eINSTANCE.getDisputableDestroyedVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableDeletedVersMarkerImpl <em>Disputable Deleted Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableDeletedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableDeletedVersMarker()
     * @generated
     */
    EClass DISPUTABLE_DELETED_VERS_MARKER = eINSTANCE.getDisputableDeletedVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedVersMarkerImpl <em>Deleted Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletedVersMarker()
     * @generated
     */
    EClass DELETED_VERS_MARKER = eINSTANCE.getDeletedVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedDisputableVersMarkerImpl <em>Deleted Disputable Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedDisputableVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletedDisputableVersMarker()
     * @generated
     */
    EClass DELETED_DISPUTABLE_VERS_MARKER = eINSTANCE.getDeletedDisputableVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedDestroyedVersMarkerImpl <em>Deleted Destroyed Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletedDestroyedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletedDestroyedVersMarker()
     * @generated
     */
    EClass DELETED_DESTROYED_VERS_MARKER = eINSTANCE.getDeletedDestroyedVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersMarkerImpl <em>Destroyed Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedVersMarker()
     * @generated
     */
    EClass DESTROYED_VERS_MARKER = eINSTANCE.getDestroyedVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersFrontierMarkerImpl <em>Destroyed Vers Frontier Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedVersFrontierMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedVersFrontierMarker()
     * @generated
     */
    EClass DESTROYED_VERS_FRONTIER_MARKER = eINSTANCE.getDestroyedVersFrontierMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedDisputableVersFrontierMarkerImpl <em>Destroyed Disputable Vers Frontier Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedDisputableVersFrontierMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedDisputableVersFrontierMarker()
     * @generated
     */
    EClass DESTROYED_DISPUTABLE_VERS_FRONTIER_MARKER = eINSTANCE.getDestroyedDisputableVersFrontierMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedDeletedVersMarkerImpl <em>Destroyed Deleted Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestroyedDeletedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestroyedDeletedVersMarker()
     * @generated
     */
    EClass DESTROYED_DELETED_VERS_MARKER = eINSTANCE.getDestroyedDeletedVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedVersMarkerImpl <em>Partial Destroyed Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestroyedVersMarker()
     * @generated
     */
    EClass PARTIAL_DESTROYED_VERS_MARKER = eINSTANCE.getPartialDestroyedVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedDisputableVersMarkerImpl <em>Partial Destroyed Disputable Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedDisputableVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestroyedDisputableVersMarker()
     * @generated
     */
    EClass PARTIAL_DESTROYED_DISPUTABLE_VERS_MARKER = eINSTANCE.getPartialDestroyedDisputableVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedDeletedVersMarkerImpl <em>Partial Destroyed Deleted Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestroyedDeletedVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestroyedDeletedVersMarker()
     * @generated
     */
    EClass PARTIAL_DESTROYED_DELETED_VERS_MARKER = eINSTANCE.getPartialDestroyedDeletedVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingVersMarkerImpl <em>Missing Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMissingVersMarker()
     * @generated
     */
    EClass MISSING_VERS_MARKER = eINSTANCE.getMissingVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingDisputableVersMarkerImpl <em>Missing Disputable Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MissingDisputableVersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMissingDisputableVersMarker()
     * @generated
     */
    EClass MISSING_DISPUTABLE_VERS_MARKER = eINSTANCE.getMissingDisputableVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurMarkerImpl <em>Restoration Over Rasur Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasurMarker()
     * @generated
     */
    EClass RESTORATION_OVER_RASUR_MARKER = eINSTANCE.getRestorationOverRasurMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedMarkerImpl <em>Ancient Expanded Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpandedMarker()
     * @generated
     */
    EClass ANCIENT_EXPANDED_MARKER = eINSTANCE.getAncientExpandedMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurMarkerImpl <em>Rasur Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasurMarker()
     * @generated
     */
    EClass RASUR_MARKER = eINSTANCE.getRasurMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl <em>Vers Frontier Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersFrontierMarker()
     * @generated
     */
    EClass VERS_FRONTIER_MARKER = eINSTANCE.getVersFrontierMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl <em>Versbreak Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersbreakMarker()
     * @generated
     */
    EClass VERSBREAK_MARKER = eINSTANCE.getVersbreakMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl <em>Broken Versbreak Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrokenVersbreakMarker()
     * @generated
     */
    EClass BROKEN_VERSBREAK_MARKER = eINSTANCE.getBrokenVersbreakMarker();

  }

} //EgyDslPackage
