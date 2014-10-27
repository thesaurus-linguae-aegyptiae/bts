/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.impl;

import org.bbaw.bts.corpus.text.egy.egyDsl.*;

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
public class EgyDslFactoryImpl extends EFactoryImpl implements EgyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EgyDslFactory init()
  {
    try
    {
      EgyDslFactory theEgyDslFactory = (EgyDslFactory)EPackage.Registry.INSTANCE.getEFactory(EgyDslPackage.eNS_URI);
      if (theEgyDslFactory != null)
      {
        return theEgyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EgyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyDslFactoryImpl()
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
      case EgyDslPackage.TEXT_CONTENT: return createTextContent();
      case EgyDslPackage.TEXT_ITEM: return createTextItem();
      case EgyDslPackage.SENTENCE: return createSentence();
      case EgyDslPackage.SENTENCE_ITEM: return createSentenceItem();
      case EgyDslPackage.ABSTRACT_MARKER: return createAbstractMarker();
      case EgyDslPackage.AMBIVALENCE: return createAmbivalence();
      case EgyDslPackage.CASE: return createCase();
      case EgyDslPackage.SENTENCE_ITEM_NO_AMBIVALENCE: return createSentenceItemNoAmbivalence();
      case EgyDslPackage.VERS_MARKER: return createVersMarker();
      case EgyDslPackage.VERS_FRONTIER_MARKER: return createVersFrontierMarker();
      case EgyDslPackage.VERSBREAK_MARKER: return createVersbreakMarker();
      case EgyDslPackage.BROKEN_VERSBREAK_MARKER: return createBrokenVersbreakMarker();
      case EgyDslPackage.MARKER: return createMarker();
      case EgyDslPackage.DESTRUCTION_MARKER: return createDestructionMarker();
      case EgyDslPackage.WORD: return createWord();
      case EgyDslPackage.WORD_PART: return createWordPart();
      case EgyDslPackage.WORD_MIDDLE: return createWordMiddle();
      case EgyDslPackage.CHARS: return createChars();
      case EgyDslPackage.BRACKETS: return createBrackets();
      case EgyDslPackage.CARTOUCHE2: return createCartouche2();
      case EgyDslPackage.SERECH: return createSerech();
      case EgyDslPackage.CARTOUCHE: return createCartouche();
      case EgyDslPackage.OVAL: return createOval();
      case EgyDslPackage.NO_CARTOUCHE: return createNoCartouche();
      case EgyDslPackage.EXPANDED: return createExpanded();
      case EgyDslPackage.NO_EXPANDED: return createNoExpanded();
      case EgyDslPackage.EMENDATION: return createEmendation();
      case EgyDslPackage.NO_EMENDATION: return createNoEmendation();
      case EgyDslPackage.DISPUTABLE_READING: return createDisputableReading();
      case EgyDslPackage.NO_DISPUTABLE_READING: return createNoDisputableReading();
      case EgyDslPackage.LACUNA: return createLacuna();
      case EgyDslPackage.NO_LACUNA: return createNoLacuna();
      case EgyDslPackage.DELETION: return createDeletion();
      case EgyDslPackage.NO_DELETION: return createNoDeletion();
      case EgyDslPackage.EXPANDED_COLUMN: return createExpandedColumn();
      case EgyDslPackage.NO_EXPANDED_COLUMN: return createNoExpandedColumn();
      case EgyDslPackage.RASUR: return createRasur();
      case EgyDslPackage.NO_RASUR: return createNoRasur();
      case EgyDslPackage.ANCIENT_EXPANDED: return createAncientExpanded();
      case EgyDslPackage.NO_ANCIENT_EXPANDED: return createNoAncientExpanded();
      case EgyDslPackage.RESTORATION_OVER_RASUR: return createRestorationOverRasur();
      case EgyDslPackage.NO_RESTORATION_OVER_RASUR: return createNoRestorationOverRasur();
      case EgyDslPackage.PARTIAL_DESTRUCTION: return createPartialDestruction();
      case EgyDslPackage.NO_PARTIAL_DESTRUCTION: return createNoPartialDestruction();
      case EgyDslPackage.INTERFIX: return createInterfix();
      case EgyDslPackage.INTERFIX_LEXICAL: return createInterfixLexical();
      case EgyDslPackage.INTERFIX_FLEXION: return createInterfixFlexion();
      case EgyDslPackage.INTERFIX_SUFFIX_PRONOM_LEXICAL: return createInterfixSuffixPronomLexical();
      case EgyDslPackage.INTERFIX_PREFIX_NON_LEXICAL: return createInterfixPrefixNonLexical();
      case EgyDslPackage.INTERFIX_PREFIX_LEXICAL: return createInterfixPrefixLexical();
      case EgyDslPackage.INTERFIX_CONNECTION_SYLLABIC_GROUP: return createInterfixConnectionSyllabicGroup();
      case EgyDslPackage.INTERFIX_COMPOUND_WORDS: return createInterfixCompoundWords();
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
  public SentenceItemNoAmbivalence createSentenceItemNoAmbivalence()
  {
    SentenceItemNoAmbivalenceImpl sentenceItemNoAmbivalence = new SentenceItemNoAmbivalenceImpl();
    return sentenceItemNoAmbivalence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersMarker createVersMarker()
  {
    VersMarkerImpl versMarker = new VersMarkerImpl();
    return versMarker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersFrontierMarker createVersFrontierMarker()
  {
    VersFrontierMarkerImpl versFrontierMarker = new VersFrontierMarkerImpl();
    return versFrontierMarker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersbreakMarker createVersbreakMarker()
  {
    VersbreakMarkerImpl versbreakMarker = new VersbreakMarkerImpl();
    return versbreakMarker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrokenVersbreakMarker createBrokenVersbreakMarker()
  {
    BrokenVersbreakMarkerImpl brokenVersbreakMarker = new BrokenVersbreakMarkerImpl();
    return brokenVersbreakMarker;
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
  public DestructionMarker createDestructionMarker()
  {
    DestructionMarkerImpl destructionMarker = new DestructionMarkerImpl();
    return destructionMarker;
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
  public WordPart createWordPart()
  {
    WordPartImpl wordPart = new WordPartImpl();
    return wordPart;
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
  public Cartouche2 createCartouche2()
  {
    Cartouche2Impl cartouche2 = new Cartouche2Impl();
    return cartouche2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Serech createSerech()
  {
    SerechImpl serech = new SerechImpl();
    return serech;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cartouche createCartouche()
  {
    CartoucheImpl cartouche = new CartoucheImpl();
    return cartouche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Oval createOval()
  {
    OvalImpl oval = new OvalImpl();
    return oval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoCartouche createNoCartouche()
  {
    NoCartoucheImpl noCartouche = new NoCartoucheImpl();
    return noCartouche;
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
  public InterfixCompoundWords createInterfixCompoundWords()
  {
    InterfixCompoundWordsImpl interfixCompoundWords = new InterfixCompoundWordsImpl();
    return interfixCompoundWords;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyDslPackage getEgyDslPackage()
  {
    return (EgyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EgyDslPackage getPackage()
  {
    return EgyDslPackage.eINSTANCE;
  }

} //EgyDslFactoryImpl
