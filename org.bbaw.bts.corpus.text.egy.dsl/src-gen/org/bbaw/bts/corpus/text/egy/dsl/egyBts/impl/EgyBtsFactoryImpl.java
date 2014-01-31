/**
 */
package org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl;

import org.bbaw.bts.corpus.text.egy.dsl.egyBts.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EgyBtsFactoryImpl extends EFactoryImpl implements EgyBtsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EgyBtsFactory init()
  {
    try
    {
      EgyBtsFactory theEgyBtsFactory = (EgyBtsFactory)EPackage.Registry.INSTANCE.getEFactory(EgyBtsPackage.eNS_URI);
      if (theEgyBtsFactory != null)
      {
        return theEgyBtsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EgyBtsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyBtsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EgyBtsPackage.TEXT_CONTENT: return createTextContent();
      case EgyBtsPackage.TEXT_ITEM: return createTextItem();
      case EgyBtsPackage.SENTENCE: return createSentence();
      case EgyBtsPackage.SENTENCE_ITEM: return createSentenceItem();
      case EgyBtsPackage.ABSTRACT_MARKER: return createAbstractMarker();
      case EgyBtsPackage.AMBIVALENCE: return createAmbivalence();
      case EgyBtsPackage.CASE: return createCase();
      case EgyBtsPackage.MARKER: return createMarker();
      case EgyBtsPackage.WORD: return createWord();
      case EgyBtsPackage.WORD_MIDDLE: return createWordMiddle();
      case EgyBtsPackage.CHARS: return createChars();
      case EgyBtsPackage.INTERFIX: return createInterfix();
      case EgyBtsPackage.INTERFIX_LEXICAL: return createInterfixLexical();
      case EgyBtsPackage.INTERFIX_FLEXION: return createInterfixFlexion();
      case EgyBtsPackage.INTERFIX_SUFFIX_PRONOM_LEXICAL: return createInterfixSuffixPronomLexical();
      case EgyBtsPackage.INTERFIX_PREFIX_NON_LEXICAL: return createInterfixPrefixNonLexical();
      case EgyBtsPackage.INTERFIX_PREFIX_LEXICAL: return createInterfixPrefixLexical();
      case EgyBtsPackage.INTERFIX_COMPOUNT_WORDS: return createInterfixCompountWords();
      case EgyBtsPackage.INTERFIX_CONNECTION_SYLLABIC_GROUP: return createInterfixConnectionSyllabicGroup();
      case EgyBtsPackage.BRACKETS: return createBrackets();
      case EgyBtsPackage.EXPANDED: return createExpanded();
      case EgyBtsPackage.NO_EXPANDED: return createNoExpanded();
      case EgyBtsPackage.EMENDATION: return createEmendation();
      case EgyBtsPackage.NO_EMENDATION: return createNoEmendation();
      case EgyBtsPackage.DISPUTABLE_READING: return createDisputableReading();
      case EgyBtsPackage.NO_DISPUTABLE_READING: return createNoDisputableReading();
      case EgyBtsPackage.LACUNA: return createLacuna();
      case EgyBtsPackage.NO_LACUNA: return createNoLacuna();
      case EgyBtsPackage.DELETION: return createDeletion();
      case EgyBtsPackage.NO_DELETION: return createNoDeletion();
      case EgyBtsPackage.EXPANDED_COLUMN: return createExpandedColumn();
      case EgyBtsPackage.NO_EXPANDED_COLUMN: return createNoExpandedColumn();
      case EgyBtsPackage.RASUR: return createRasur();
      case EgyBtsPackage.NO_RASUR: return createNoRasur();
      case EgyBtsPackage.ANCIENT_EXPANDED: return createAncientExpanded();
      case EgyBtsPackage.NO_ANCIENT_EXPANDED: return createNoAncientExpanded();
      case EgyBtsPackage.RESTORATION_OVER_RASUR: return createRestorationOverRasur();
      case EgyBtsPackage.NO_RESTORATION_OVER_RASUR: return createNoRestorationOverRasur();
      case EgyBtsPackage.PARTIAL_DESTRUCTION: return createPartialDestruction();
      case EgyBtsPackage.NO_PARTIAL_DESTRUCTION: return createNoPartialDestruction();
      case EgyBtsPackage.DESTRUCTION: return createDestruction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextContent createTextContent()
  {
    TextContentImpl textContent = new TextContentImpl();
    return textContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextItem createTextItem()
  {
    TextItemImpl textItem = new TextItemImpl();
    return textItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sentence createSentence()
  {
    SentenceImpl sentence = new SentenceImpl();
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SentenceItem createSentenceItem()
  {
    SentenceItemImpl sentenceItem = new SentenceItemImpl();
    return sentenceItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractMarker createAbstractMarker()
  {
    AbstractMarkerImpl abstractMarker = new AbstractMarkerImpl();
    return abstractMarker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ambivalence createAmbivalence()
  {
    AmbivalenceImpl ambivalence = new AmbivalenceImpl();
    return ambivalence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Marker createMarker()
  {
    MarkerImpl marker = new MarkerImpl();
    return marker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Word createWord()
  {
    WordImpl word = new WordImpl();
    return word;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordMiddle createWordMiddle()
  {
    WordMiddleImpl wordMiddle = new WordMiddleImpl();
    return wordMiddle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chars createChars()
  {
    CharsImpl chars = new CharsImpl();
    return chars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interfix createInterfix()
  {
    InterfixImpl interfix = new InterfixImpl();
    return interfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixLexical createInterfixLexical()
  {
    InterfixLexicalImpl interfixLexical = new InterfixLexicalImpl();
    return interfixLexical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixFlexion createInterfixFlexion()
  {
    InterfixFlexionImpl interfixFlexion = new InterfixFlexionImpl();
    return interfixFlexion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixSuffixPronomLexical createInterfixSuffixPronomLexical()
  {
    InterfixSuffixPronomLexicalImpl interfixSuffixPronomLexical = new InterfixSuffixPronomLexicalImpl();
    return interfixSuffixPronomLexical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixPrefixNonLexical createInterfixPrefixNonLexical()
  {
    InterfixPrefixNonLexicalImpl interfixPrefixNonLexical = new InterfixPrefixNonLexicalImpl();
    return interfixPrefixNonLexical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixPrefixLexical createInterfixPrefixLexical()
  {
    InterfixPrefixLexicalImpl interfixPrefixLexical = new InterfixPrefixLexicalImpl();
    return interfixPrefixLexical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixCompountWords createInterfixCompountWords()
  {
    InterfixCompountWordsImpl interfixCompountWords = new InterfixCompountWordsImpl();
    return interfixCompountWords;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixConnectionSyllabicGroup createInterfixConnectionSyllabicGroup()
  {
    InterfixConnectionSyllabicGroupImpl interfixConnectionSyllabicGroup = new InterfixConnectionSyllabicGroupImpl();
    return interfixConnectionSyllabicGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Brackets createBrackets()
  {
    BracketsImpl brackets = new BracketsImpl();
    return brackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expanded createExpanded()
  {
    ExpandedImpl expanded = new ExpandedImpl();
    return expanded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoExpanded createNoExpanded()
  {
    NoExpandedImpl noExpanded = new NoExpandedImpl();
    return noExpanded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Emendation createEmendation()
  {
    EmendationImpl emendation = new EmendationImpl();
    return emendation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoEmendation createNoEmendation()
  {
    NoEmendationImpl noEmendation = new NoEmendationImpl();
    return noEmendation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisputableReading createDisputableReading()
  {
    DisputableReadingImpl disputableReading = new DisputableReadingImpl();
    return disputableReading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoDisputableReading createNoDisputableReading()
  {
    NoDisputableReadingImpl noDisputableReading = new NoDisputableReadingImpl();
    return noDisputableReading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lacuna createLacuna()
  {
    LacunaImpl lacuna = new LacunaImpl();
    return lacuna;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoLacuna createNoLacuna()
  {
    NoLacunaImpl noLacuna = new NoLacunaImpl();
    return noLacuna;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deletion createDeletion()
  {
    DeletionImpl deletion = new DeletionImpl();
    return deletion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoDeletion createNoDeletion()
  {
    NoDeletionImpl noDeletion = new NoDeletionImpl();
    return noDeletion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpandedColumn createExpandedColumn()
  {
    ExpandedColumnImpl expandedColumn = new ExpandedColumnImpl();
    return expandedColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoExpandedColumn createNoExpandedColumn()
  {
    NoExpandedColumnImpl noExpandedColumn = new NoExpandedColumnImpl();
    return noExpandedColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rasur createRasur()
  {
    RasurImpl rasur = new RasurImpl();
    return rasur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoRasur createNoRasur()
  {
    NoRasurImpl noRasur = new NoRasurImpl();
    return noRasur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AncientExpanded createAncientExpanded()
  {
    AncientExpandedImpl ancientExpanded = new AncientExpandedImpl();
    return ancientExpanded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoAncientExpanded createNoAncientExpanded()
  {
    NoAncientExpandedImpl noAncientExpanded = new NoAncientExpandedImpl();
    return noAncientExpanded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestorationOverRasur createRestorationOverRasur()
  {
    RestorationOverRasurImpl restorationOverRasur = new RestorationOverRasurImpl();
    return restorationOverRasur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoRestorationOverRasur createNoRestorationOverRasur()
  {
    NoRestorationOverRasurImpl noRestorationOverRasur = new NoRestorationOverRasurImpl();
    return noRestorationOverRasur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialDestruction createPartialDestruction()
  {
    PartialDestructionImpl partialDestruction = new PartialDestructionImpl();
    return partialDestruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPartialDestruction createNoPartialDestruction()
  {
    NoPartialDestructionImpl noPartialDestruction = new NoPartialDestructionImpl();
    return noPartialDestruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Destruction createDestruction()
  {
    DestructionImpl destruction = new DestructionImpl();
    return destruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyBtsPackage getEgyBtsPackage()
  {
    return (EgyBtsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EgyBtsPackage getPackage()
  {
    return EgyBtsPackage.eINSTANCE;
  }

} //EgyBtsFactoryImpl
