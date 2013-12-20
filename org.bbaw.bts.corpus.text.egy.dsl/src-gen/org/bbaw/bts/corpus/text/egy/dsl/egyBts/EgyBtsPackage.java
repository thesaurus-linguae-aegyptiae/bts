/**
 */
package org.bbaw.bts.corpus.text.egy.dsl.egyBts;

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
 * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsFactory
 * @model kind="package"
 * @generated
 */
public interface EgyBtsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "egyBts";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bbaw.org/bts/corpus/text/egy/dsl/EgyBts";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "egyBts";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EgyBtsPackage eINSTANCE = org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.TextContentImpl <em>Text Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.TextContentImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getTextContent()
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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.TextItemImpl <em>Text Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.TextItemImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getTextItem()
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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.SentenceImpl <em>Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.SentenceImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getSentence()
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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.SentenceItemImpl <em>Sentence Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.SentenceItemImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getSentenceItem()
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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.MarkerImpl <em>Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.MarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getMarker()
   * @generated
   */
  int MARKER = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER__TYPE = SENTENCE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER__NAME = SENTENCE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.WordImpl <em>Word</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.WordImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getWord()
   * @generated
   */
  int WORD = 5;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.WordMiddleImpl <em>Word Middle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.WordMiddleImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getWordMiddle()
   * @generated
   */
  int WORD_MIDDLE = 6;

  /**
   * The number of structural features of the '<em>Word Middle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_MIDDLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.CharsImpl <em>Chars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.CharsImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getChars()
   * @generated
   */
  int CHARS = 7;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixImpl <em>Interfix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfix()
   * @generated
   */
  int INTERFIX = 8;

  /**
   * The number of structural features of the '<em>Interfix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixLexicalImpl <em>Interfix Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixLexical()
   * @generated
   */
  int INTERFIX_LEXICAL = 9;

  /**
   * The number of structural features of the '<em>Interfix Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixFlexionImpl <em>Interfix Flexion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixFlexionImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixFlexion()
   * @generated
   */
  int INTERFIX_FLEXION = 10;

  /**
   * The number of structural features of the '<em>Interfix Flexion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FLEXION_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixSuffixPronomLexicalImpl <em>Interfix Suffix Pronom Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixSuffixPronomLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixSuffixPronomLexical()
   * @generated
   */
  int INTERFIX_SUFFIX_PRONOM_LEXICAL = 11;

  /**
   * The number of structural features of the '<em>Interfix Suffix Pronom Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_SUFFIX_PRONOM_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixPrefixNonLexicalImpl <em>Interfix Prefix Non Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixPrefixNonLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixPrefixNonLexical()
   * @generated
   */
  int INTERFIX_PREFIX_NON_LEXICAL = 12;

  /**
   * The number of structural features of the '<em>Interfix Prefix Non Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_PREFIX_NON_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixPrefixLexicalImpl <em>Interfix Prefix Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixPrefixLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixPrefixLexical()
   * @generated
   */
  int INTERFIX_PREFIX_LEXICAL = 13;

  /**
   * The number of structural features of the '<em>Interfix Prefix Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_PREFIX_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixCompountWordsImpl <em>Interfix Compount Words</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixCompountWordsImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixCompountWords()
   * @generated
   */
  int INTERFIX_COMPOUNT_WORDS = 14;

  /**
   * The number of structural features of the '<em>Interfix Compount Words</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_COMPOUNT_WORDS_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixConnectionSyllabicGroupImpl <em>Interfix Connection Syllabic Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixConnectionSyllabicGroupImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixConnectionSyllabicGroup()
   * @generated
   */
  int INTERFIX_CONNECTION_SYLLABIC_GROUP = 15;

  /**
   * The number of structural features of the '<em>Interfix Connection Syllabic Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_CONNECTION_SYLLABIC_GROUP_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.BracketsImpl <em>Brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.BracketsImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getBrackets()
   * @generated
   */
  int BRACKETS = 16;

  /**
   * The number of structural features of the '<em>Brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETS_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.ExpandedImpl <em>Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.ExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getExpanded()
   * @generated
   */
  int EXPANDED = 17;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoExpandedImpl <em>No Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoExpanded()
   * @generated
   */
  int NO_EXPANDED = 18;

  /**
   * The number of structural features of the '<em>No Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EXPANDED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EmendationImpl <em>Emendation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EmendationImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getEmendation()
   * @generated
   */
  int EMENDATION = 19;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoEmendationImpl <em>No Emendation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoEmendationImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoEmendation()
   * @generated
   */
  int NO_EMENDATION = 20;

  /**
   * The number of structural features of the '<em>No Emendation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EMENDATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DisputableReadingImpl <em>Disputable Reading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DisputableReadingImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getDisputableReading()
   * @generated
   */
  int DISPUTABLE_READING = 21;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoDisputableReadingImpl <em>No Disputable Reading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoDisputableReadingImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoDisputableReading()
   * @generated
   */
  int NO_DISPUTABLE_READING = 22;

  /**
   * The number of structural features of the '<em>No Disputable Reading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_DISPUTABLE_READING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.LacunaImpl <em>Lacuna</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.LacunaImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getLacuna()
   * @generated
   */
  int LACUNA = 23;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoLacunaImpl <em>No Lacuna</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoLacunaImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoLacuna()
   * @generated
   */
  int NO_LACUNA = 24;

  /**
   * The number of structural features of the '<em>No Lacuna</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_LACUNA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DeletionImpl <em>Deletion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DeletionImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getDeletion()
   * @generated
   */
  int DELETION = 25;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoDeletionImpl <em>No Deletion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoDeletionImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoDeletion()
   * @generated
   */
  int NO_DELETION = 26;

  /**
   * The number of structural features of the '<em>No Deletion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_DELETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.ExpandedColumnImpl <em>Expanded Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.ExpandedColumnImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getExpandedColumn()
   * @generated
   */
  int EXPANDED_COLUMN = 27;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoExpandedColumnImpl <em>No Expanded Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoExpandedColumnImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoExpandedColumn()
   * @generated
   */
  int NO_EXPANDED_COLUMN = 28;

  /**
   * The number of structural features of the '<em>No Expanded Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EXPANDED_COLUMN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.RasurImpl <em>Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.RasurImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getRasur()
   * @generated
   */
  int RASUR = 29;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoRasurImpl <em>No Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoRasur()
   * @generated
   */
  int NO_RASUR = 30;

  /**
   * The number of structural features of the '<em>No Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RASUR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.AncientExpandedImpl <em>Ancient Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.AncientExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getAncientExpanded()
   * @generated
   */
  int ANCIENT_EXPANDED = 31;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoAncientExpandedImpl <em>No Ancient Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoAncientExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoAncientExpanded()
   * @generated
   */
  int NO_ANCIENT_EXPANDED = 32;

  /**
   * The number of structural features of the '<em>No Ancient Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_ANCIENT_EXPANDED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.RestorationOverRasurImpl <em>Restoration Over Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.RestorationOverRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getRestorationOverRasur()
   * @generated
   */
  int RESTORATION_OVER_RASUR = 33;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoRestorationOverRasurImpl <em>No Restoration Over Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoRestorationOverRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoRestorationOverRasur()
   * @generated
   */
  int NO_RESTORATION_OVER_RASUR = 34;

  /**
   * The number of structural features of the '<em>No Restoration Over Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RESTORATION_OVER_RASUR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.PartialDestructionImpl <em>Partial Destruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.PartialDestructionImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getPartialDestruction()
   * @generated
   */
  int PARTIAL_DESTRUCTION = 35;

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
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoPartialDestructionImpl <em>No Partial Destruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoPartialDestructionImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoPartialDestruction()
   * @generated
   */
  int NO_PARTIAL_DESTRUCTION = 36;

  /**
   * The number of structural features of the '<em>No Partial Destruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PARTIAL_DESTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DestructionImpl <em>Destruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DestructionImpl
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getDestruction()
   * @generated
   */
  int DESTRUCTION = 37;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTION__COMMENT = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Destruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextContent <em>Text Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Content</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextContent
   * @generated
   */
  EClass getTextContent();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextContent#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextContent#getItems()
   * @see #getTextContent()
   * @generated
   */
  EReference getTextContent_Items();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextItem <em>Text Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Item</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextItem
   * @generated
   */
  EClass getTextItem();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Sentence
   * @generated
   */
  EClass getSentence();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Sentence#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Sentence#getItems()
   * @see #getSentence()
   * @generated
   */
  EReference getSentence_Items();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.SentenceItem <em>Sentence Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence Item</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.SentenceItem
   * @generated
   */
  EClass getSentenceItem();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker <em>Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker
   * @generated
   */
  EClass getMarker();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker#getType()
   * @see #getMarker()
   * @generated
   */
  EAttribute getMarker_Type();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker#getName()
   * @see #getMarker()
   * @generated
   */
  EAttribute getMarker_Name();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Word
   * @generated
   */
  EClass getWord();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Word#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Word#getWChar()
   * @see #getWord()
   * @generated
   */
  EReference getWord_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.WordMiddle <em>Word Middle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word Middle</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.WordMiddle
   * @generated
   */
  EClass getWordMiddle();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars
   * @generated
   */
  EClass getChars();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars#getName()
   * @see #getChars()
   * @generated
   */
  EAttribute getChars_Name();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Interfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Interfix
   * @generated
   */
  EClass getInterfix();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixLexical <em>Interfix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixLexical
   * @generated
   */
  EClass getInterfixLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixFlexion <em>Interfix Flexion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Flexion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixFlexion
   * @generated
   */
  EClass getInterfixFlexion();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixSuffixPronomLexical <em>Interfix Suffix Pronom Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Suffix Pronom Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixSuffixPronomLexical
   * @generated
   */
  EClass getInterfixSuffixPronomLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixNonLexical <em>Interfix Prefix Non Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Prefix Non Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixNonLexical
   * @generated
   */
  EClass getInterfixPrefixNonLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixLexical <em>Interfix Prefix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Prefix Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixLexical
   * @generated
   */
  EClass getInterfixPrefixLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixCompountWords <em>Interfix Compount Words</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Compount Words</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixCompountWords
   * @generated
   */
  EClass getInterfixCompountWords();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixConnectionSyllabicGroup <em>Interfix Connection Syllabic Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Connection Syllabic Group</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixConnectionSyllabicGroup
   * @generated
   */
  EClass getInterfixConnectionSyllabicGroup();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Brackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Brackets</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Brackets
   * @generated
   */
  EClass getBrackets();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded <em>Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded
   * @generated
   */
  EClass getExpanded();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded#getWChar()
   * @see #getExpanded()
   * @generated
   */
  EReference getExpanded_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpanded <em>No Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpanded
   * @generated
   */
  EClass getNoExpanded();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Emendation <em>Emendation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emendation</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Emendation
   * @generated
   */
  EClass getEmendation();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Emendation#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Emendation#getWChar()
   * @see #getEmendation()
   * @generated
   */
  EReference getEmendation_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoEmendation <em>No Emendation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Emendation</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoEmendation
   * @generated
   */
  EClass getNoEmendation();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.DisputableReading <em>Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disputable Reading</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.DisputableReading
   * @generated
   */
  EClass getDisputableReading();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.DisputableReading#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.DisputableReading#getWChar()
   * @see #getDisputableReading()
   * @generated
   */
  EReference getDisputableReading_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDisputableReading <em>No Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Disputable Reading</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDisputableReading
   * @generated
   */
  EClass getNoDisputableReading();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Lacuna <em>Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lacuna</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Lacuna
   * @generated
   */
  EClass getLacuna();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Lacuna#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Lacuna#getWChar()
   * @see #getLacuna()
   * @generated
   */
  EReference getLacuna_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoLacuna <em>No Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Lacuna</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoLacuna
   * @generated
   */
  EClass getNoLacuna();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Deletion <em>Deletion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deletion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Deletion
   * @generated
   */
  EClass getDeletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Deletion#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Deletion#getWChar()
   * @see #getDeletion()
   * @generated
   */
  EReference getDeletion_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDeletion <em>No Deletion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Deletion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDeletion
   * @generated
   */
  EClass getNoDeletion();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.ExpandedColumn <em>Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expanded Column</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.ExpandedColumn
   * @generated
   */
  EClass getExpandedColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.ExpandedColumn#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.ExpandedColumn#getWChar()
   * @see #getExpandedColumn()
   * @generated
   */
  EReference getExpandedColumn_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpandedColumn <em>No Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Expanded Column</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpandedColumn
   * @generated
   */
  EClass getNoExpandedColumn();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Rasur <em>Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Rasur
   * @generated
   */
  EClass getRasur();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Rasur#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Rasur#getWChar()
   * @see #getRasur()
   * @generated
   */
  EReference getRasur_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRasur <em>No Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRasur
   * @generated
   */
  EClass getNoRasur();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.AncientExpanded <em>Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancient Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.AncientExpanded
   * @generated
   */
  EClass getAncientExpanded();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.AncientExpanded#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.AncientExpanded#getWChar()
   * @see #getAncientExpanded()
   * @generated
   */
  EReference getAncientExpanded_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoAncientExpanded <em>No Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ancient Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoAncientExpanded
   * @generated
   */
  EClass getNoAncientExpanded();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.RestorationOverRasur <em>Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restoration Over Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.RestorationOverRasur
   * @generated
   */
  EClass getRestorationOverRasur();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.RestorationOverRasur#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.RestorationOverRasur#getWChar()
   * @see #getRestorationOverRasur()
   * @generated
   */
  EReference getRestorationOverRasur_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRestorationOverRasur <em>No Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Restoration Over Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRestorationOverRasur
   * @generated
   */
  EClass getNoRestorationOverRasur();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.PartialDestruction <em>Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Destruction</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.PartialDestruction
   * @generated
   */
  EClass getPartialDestruction();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.PartialDestruction#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.PartialDestruction#getWChar()
   * @see #getPartialDestruction()
   * @generated
   */
  EReference getPartialDestruction_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoPartialDestruction <em>No Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Partial Destruction</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoPartialDestruction
   * @generated
   */
  EClass getNoPartialDestruction();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Destruction <em>Destruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destruction</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Destruction
   * @generated
   */
  EClass getDestruction();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Destruction#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Destruction#getComment()
   * @see #getDestruction()
   * @generated
   */
  EAttribute getDestruction_Comment();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EgyBtsFactory getEgyBtsFactory();

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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.TextContentImpl <em>Text Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.TextContentImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getTextContent()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.TextItemImpl <em>Text Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.TextItemImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getTextItem()
     * @generated
     */
    EClass TEXT_ITEM = eINSTANCE.getTextItem();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.SentenceImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getSentence()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.SentenceItemImpl <em>Sentence Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.SentenceItemImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getSentenceItem()
     * @generated
     */
    EClass SENTENCE_ITEM = eINSTANCE.getSentenceItem();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.MarkerImpl <em>Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.MarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getMarker()
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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MARKER__NAME = eINSTANCE.getMarker_Name();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.WordImpl <em>Word</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.WordImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getWord()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.WordMiddleImpl <em>Word Middle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.WordMiddleImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getWordMiddle()
     * @generated
     */
    EClass WORD_MIDDLE = eINSTANCE.getWordMiddle();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.CharsImpl <em>Chars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.CharsImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getChars()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixImpl <em>Interfix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfix()
     * @generated
     */
    EClass INTERFIX = eINSTANCE.getInterfix();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixLexicalImpl <em>Interfix Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixLexical()
     * @generated
     */
    EClass INTERFIX_LEXICAL = eINSTANCE.getInterfixLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixFlexionImpl <em>Interfix Flexion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixFlexionImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixFlexion()
     * @generated
     */
    EClass INTERFIX_FLEXION = eINSTANCE.getInterfixFlexion();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixSuffixPronomLexicalImpl <em>Interfix Suffix Pronom Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixSuffixPronomLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixSuffixPronomLexical()
     * @generated
     */
    EClass INTERFIX_SUFFIX_PRONOM_LEXICAL = eINSTANCE.getInterfixSuffixPronomLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixPrefixNonLexicalImpl <em>Interfix Prefix Non Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixPrefixNonLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixPrefixNonLexical()
     * @generated
     */
    EClass INTERFIX_PREFIX_NON_LEXICAL = eINSTANCE.getInterfixPrefixNonLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixPrefixLexicalImpl <em>Interfix Prefix Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixPrefixLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixPrefixLexical()
     * @generated
     */
    EClass INTERFIX_PREFIX_LEXICAL = eINSTANCE.getInterfixPrefixLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixCompountWordsImpl <em>Interfix Compount Words</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixCompountWordsImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixCompountWords()
     * @generated
     */
    EClass INTERFIX_COMPOUNT_WORDS = eINSTANCE.getInterfixCompountWords();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixConnectionSyllabicGroupImpl <em>Interfix Connection Syllabic Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.InterfixConnectionSyllabicGroupImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getInterfixConnectionSyllabicGroup()
     * @generated
     */
    EClass INTERFIX_CONNECTION_SYLLABIC_GROUP = eINSTANCE.getInterfixConnectionSyllabicGroup();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.BracketsImpl <em>Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.BracketsImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getBrackets()
     * @generated
     */
    EClass BRACKETS = eINSTANCE.getBrackets();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.ExpandedImpl <em>Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.ExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getExpanded()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoExpandedImpl <em>No Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoExpanded()
     * @generated
     */
    EClass NO_EXPANDED = eINSTANCE.getNoExpanded();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EmendationImpl <em>Emendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EmendationImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getEmendation()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoEmendationImpl <em>No Emendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoEmendationImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoEmendation()
     * @generated
     */
    EClass NO_EMENDATION = eINSTANCE.getNoEmendation();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DisputableReadingImpl <em>Disputable Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DisputableReadingImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getDisputableReading()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoDisputableReadingImpl <em>No Disputable Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoDisputableReadingImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoDisputableReading()
     * @generated
     */
    EClass NO_DISPUTABLE_READING = eINSTANCE.getNoDisputableReading();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.LacunaImpl <em>Lacuna</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.LacunaImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getLacuna()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoLacunaImpl <em>No Lacuna</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoLacunaImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoLacuna()
     * @generated
     */
    EClass NO_LACUNA = eINSTANCE.getNoLacuna();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DeletionImpl <em>Deletion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DeletionImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getDeletion()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoDeletionImpl <em>No Deletion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoDeletionImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoDeletion()
     * @generated
     */
    EClass NO_DELETION = eINSTANCE.getNoDeletion();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.ExpandedColumnImpl <em>Expanded Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.ExpandedColumnImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getExpandedColumn()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoExpandedColumnImpl <em>No Expanded Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoExpandedColumnImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoExpandedColumn()
     * @generated
     */
    EClass NO_EXPANDED_COLUMN = eINSTANCE.getNoExpandedColumn();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.RasurImpl <em>Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.RasurImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getRasur()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoRasurImpl <em>No Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoRasur()
     * @generated
     */
    EClass NO_RASUR = eINSTANCE.getNoRasur();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.AncientExpandedImpl <em>Ancient Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.AncientExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getAncientExpanded()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoAncientExpandedImpl <em>No Ancient Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoAncientExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoAncientExpanded()
     * @generated
     */
    EClass NO_ANCIENT_EXPANDED = eINSTANCE.getNoAncientExpanded();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.RestorationOverRasurImpl <em>Restoration Over Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.RestorationOverRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getRestorationOverRasur()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoRestorationOverRasurImpl <em>No Restoration Over Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoRestorationOverRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoRestorationOverRasur()
     * @generated
     */
    EClass NO_RESTORATION_OVER_RASUR = eINSTANCE.getNoRestorationOverRasur();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.PartialDestructionImpl <em>Partial Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.PartialDestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getPartialDestruction()
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
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoPartialDestructionImpl <em>No Partial Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.NoPartialDestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getNoPartialDestruction()
     * @generated
     */
    EClass NO_PARTIAL_DESTRUCTION = eINSTANCE.getNoPartialDestruction();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DestructionImpl <em>Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.DestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl.EgyBtsPackageImpl#getDestruction()
     * @generated
     */
    EClass DESTRUCTION = eINSTANCE.getDestruction();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESTRUCTION__COMMENT = eINSTANCE.getDestruction_Comment();

  }

} //EgyBtsPackage
