/**
 */
package org.bbaw.bts.corpus.text.egy.dsl.egyBts.impl;

import org.bbaw.bts.corpus.text.egy.dsl.egyBts.AncientExpanded;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Brackets;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Deletion;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Destruction;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.DisputableReading;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsFactory;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsPackage;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Emendation;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.ExpandedColumn;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Interfix;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixCompountWords;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixConnectionSyllabicGroup;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixFlexion;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixLexical;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixLexical;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixNonLexical;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixSuffixPronomLexical;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Lacuna;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoAncientExpanded;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDeletion;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDisputableReading;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoEmendation;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpanded;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpandedColumn;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoLacuna;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoPartialDestruction;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRasur;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRestorationOverRasur;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.PartialDestruction;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Rasur;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.RestorationOverRasur;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Sentence;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.SentenceItem;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextContent;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextItem;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Word;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.WordMiddle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EgyBtsPackageImpl extends EPackageImpl implements EgyBtsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentenceItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass markerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wordMiddleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixLexicalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixFlexionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixSuffixPronomLexicalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixPrefixNonLexicalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixPrefixLexicalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixCompountWordsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixConnectionSyllabicGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bracketsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expandedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noExpandedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emendationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noEmendationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disputableReadingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noDisputableReadingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lacunaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noLacunaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deletionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noDeletionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expandedColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noExpandedColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rasurEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noRasurEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ancientExpandedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noAncientExpandedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restorationOverRasurEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noRestorationOverRasurEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partialDestructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noPartialDestructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass destructionEClass = null;

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
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EgyBtsPackageImpl()
  {
    super(eNS_URI, EgyBtsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EgyBtsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EgyBtsPackage init()
  {
    if (isInited) return (EgyBtsPackage)EPackage.Registry.INSTANCE.getEPackage(EgyBtsPackage.eNS_URI);

    // Obtain or create and register package
    EgyBtsPackageImpl theEgyBtsPackage = (EgyBtsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EgyBtsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EgyBtsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEgyBtsPackage.createPackageContents();

    // Initialize created meta-data
    theEgyBtsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEgyBtsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EgyBtsPackage.eNS_URI, theEgyBtsPackage);
    return theEgyBtsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextContent()
  {
    return textContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextContent_Items()
  {
    return (EReference)textContentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextItem()
  {
    return textItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSentence()
  {
    return sentenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSentence_Items()
  {
    return (EReference)sentenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSentenceItem()
  {
    return sentenceItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarker()
  {
    return markerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMarker_Type()
  {
    return (EAttribute)markerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMarker_Name()
  {
    return (EAttribute)markerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWord()
  {
    return wordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWord_WChar()
  {
    return (EReference)wordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWordMiddle()
  {
    return wordMiddleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChars()
  {
    return charsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChars_Name()
  {
    return (EAttribute)charsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfix()
  {
    return interfixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixLexical()
  {
    return interfixLexicalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixFlexion()
  {
    return interfixFlexionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixSuffixPronomLexical()
  {
    return interfixSuffixPronomLexicalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixPrefixNonLexical()
  {
    return interfixPrefixNonLexicalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixPrefixLexical()
  {
    return interfixPrefixLexicalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixCompountWords()
  {
    return interfixCompountWordsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixConnectionSyllabicGroup()
  {
    return interfixConnectionSyllabicGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBrackets()
  {
    return bracketsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpanded()
  {
    return expandedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpanded_WChar()
  {
    return (EReference)expandedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoExpanded()
  {
    return noExpandedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmendation()
  {
    return emendationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmendation_WChar()
  {
    return (EReference)emendationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoEmendation()
  {
    return noEmendationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisputableReading()
  {
    return disputableReadingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisputableReading_WChar()
  {
    return (EReference)disputableReadingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoDisputableReading()
  {
    return noDisputableReadingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLacuna()
  {
    return lacunaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLacuna_WChar()
  {
    return (EReference)lacunaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoLacuna()
  {
    return noLacunaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeletion()
  {
    return deletionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeletion_WChar()
  {
    return (EReference)deletionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoDeletion()
  {
    return noDeletionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpandedColumn()
  {
    return expandedColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpandedColumn_WChar()
  {
    return (EReference)expandedColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoExpandedColumn()
  {
    return noExpandedColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRasur()
  {
    return rasurEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRasur_WChar()
  {
    return (EReference)rasurEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoRasur()
  {
    return noRasurEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAncientExpanded()
  {
    return ancientExpandedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAncientExpanded_WChar()
  {
    return (EReference)ancientExpandedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoAncientExpanded()
  {
    return noAncientExpandedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestorationOverRasur()
  {
    return restorationOverRasurEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestorationOverRasur_WChar()
  {
    return (EReference)restorationOverRasurEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoRestorationOverRasur()
  {
    return noRestorationOverRasurEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartialDestruction()
  {
    return partialDestructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartialDestruction_WChar()
  {
    return (EReference)partialDestructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoPartialDestruction()
  {
    return noPartialDestructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDestruction()
  {
    return destructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDestruction_Comment()
  {
    return (EAttribute)destructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyBtsFactory getEgyBtsFactory()
  {
    return (EgyBtsFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    textContentEClass = createEClass(TEXT_CONTENT);
    createEReference(textContentEClass, TEXT_CONTENT__ITEMS);

    textItemEClass = createEClass(TEXT_ITEM);

    sentenceEClass = createEClass(SENTENCE);
    createEReference(sentenceEClass, SENTENCE__ITEMS);

    sentenceItemEClass = createEClass(SENTENCE_ITEM);

    markerEClass = createEClass(MARKER);
    createEAttribute(markerEClass, MARKER__TYPE);
    createEAttribute(markerEClass, MARKER__NAME);

    wordEClass = createEClass(WORD);
    createEReference(wordEClass, WORD__WCHAR);

    wordMiddleEClass = createEClass(WORD_MIDDLE);

    charsEClass = createEClass(CHARS);
    createEAttribute(charsEClass, CHARS__NAME);

    interfixEClass = createEClass(INTERFIX);

    interfixLexicalEClass = createEClass(INTERFIX_LEXICAL);

    interfixFlexionEClass = createEClass(INTERFIX_FLEXION);

    interfixSuffixPronomLexicalEClass = createEClass(INTERFIX_SUFFIX_PRONOM_LEXICAL);

    interfixPrefixNonLexicalEClass = createEClass(INTERFIX_PREFIX_NON_LEXICAL);

    interfixPrefixLexicalEClass = createEClass(INTERFIX_PREFIX_LEXICAL);

    interfixCompountWordsEClass = createEClass(INTERFIX_COMPOUNT_WORDS);

    interfixConnectionSyllabicGroupEClass = createEClass(INTERFIX_CONNECTION_SYLLABIC_GROUP);

    bracketsEClass = createEClass(BRACKETS);

    expandedEClass = createEClass(EXPANDED);
    createEReference(expandedEClass, EXPANDED__WCHAR);

    noExpandedEClass = createEClass(NO_EXPANDED);

    emendationEClass = createEClass(EMENDATION);
    createEReference(emendationEClass, EMENDATION__WCHAR);

    noEmendationEClass = createEClass(NO_EMENDATION);

    disputableReadingEClass = createEClass(DISPUTABLE_READING);
    createEReference(disputableReadingEClass, DISPUTABLE_READING__WCHAR);

    noDisputableReadingEClass = createEClass(NO_DISPUTABLE_READING);

    lacunaEClass = createEClass(LACUNA);
    createEReference(lacunaEClass, LACUNA__WCHAR);

    noLacunaEClass = createEClass(NO_LACUNA);

    deletionEClass = createEClass(DELETION);
    createEReference(deletionEClass, DELETION__WCHAR);

    noDeletionEClass = createEClass(NO_DELETION);

    expandedColumnEClass = createEClass(EXPANDED_COLUMN);
    createEReference(expandedColumnEClass, EXPANDED_COLUMN__WCHAR);

    noExpandedColumnEClass = createEClass(NO_EXPANDED_COLUMN);

    rasurEClass = createEClass(RASUR);
    createEReference(rasurEClass, RASUR__WCHAR);

    noRasurEClass = createEClass(NO_RASUR);

    ancientExpandedEClass = createEClass(ANCIENT_EXPANDED);
    createEReference(ancientExpandedEClass, ANCIENT_EXPANDED__WCHAR);

    noAncientExpandedEClass = createEClass(NO_ANCIENT_EXPANDED);

    restorationOverRasurEClass = createEClass(RESTORATION_OVER_RASUR);
    createEReference(restorationOverRasurEClass, RESTORATION_OVER_RASUR__WCHAR);

    noRestorationOverRasurEClass = createEClass(NO_RESTORATION_OVER_RASUR);

    partialDestructionEClass = createEClass(PARTIAL_DESTRUCTION);
    createEReference(partialDestructionEClass, PARTIAL_DESTRUCTION__WCHAR);

    noPartialDestructionEClass = createEClass(NO_PARTIAL_DESTRUCTION);

    destructionEClass = createEClass(DESTRUCTION);
    createEAttribute(destructionEClass, DESTRUCTION__COMMENT);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sentenceEClass.getESuperTypes().add(this.getTextItem());
    markerEClass.getESuperTypes().add(this.getSentenceItem());
    wordEClass.getESuperTypes().add(this.getSentenceItem());
    charsEClass.getESuperTypes().add(this.getWordMiddle());
    charsEClass.getESuperTypes().add(this.getNoExpanded());
    charsEClass.getESuperTypes().add(this.getNoEmendation());
    charsEClass.getESuperTypes().add(this.getNoDisputableReading());
    charsEClass.getESuperTypes().add(this.getNoLacuna());
    charsEClass.getESuperTypes().add(this.getNoDeletion());
    charsEClass.getESuperTypes().add(this.getNoExpandedColumn());
    charsEClass.getESuperTypes().add(this.getNoRasur());
    charsEClass.getESuperTypes().add(this.getNoAncientExpanded());
    charsEClass.getESuperTypes().add(this.getNoRestorationOverRasur());
    charsEClass.getESuperTypes().add(this.getNoPartialDestruction());
    interfixEClass.getESuperTypes().add(this.getWordMiddle());
    interfixEClass.getESuperTypes().add(this.getNoExpanded());
    interfixEClass.getESuperTypes().add(this.getNoEmendation());
    interfixEClass.getESuperTypes().add(this.getNoDisputableReading());
    interfixEClass.getESuperTypes().add(this.getNoLacuna());
    interfixEClass.getESuperTypes().add(this.getNoDeletion());
    interfixEClass.getESuperTypes().add(this.getNoExpandedColumn());
    interfixEClass.getESuperTypes().add(this.getNoRasur());
    interfixLexicalEClass.getESuperTypes().add(this.getInterfix());
    interfixFlexionEClass.getESuperTypes().add(this.getInterfix());
    interfixSuffixPronomLexicalEClass.getESuperTypes().add(this.getInterfix());
    interfixPrefixNonLexicalEClass.getESuperTypes().add(this.getInterfix());
    interfixPrefixLexicalEClass.getESuperTypes().add(this.getInterfix());
    interfixCompountWordsEClass.getESuperTypes().add(this.getInterfix());
    interfixConnectionSyllabicGroupEClass.getESuperTypes().add(this.getInterfix());
    bracketsEClass.getESuperTypes().add(this.getWordMiddle());
    expandedEClass.getESuperTypes().add(this.getBrackets());
    expandedEClass.getESuperTypes().add(this.getNoEmendation());
    expandedEClass.getESuperTypes().add(this.getNoDisputableReading());
    expandedEClass.getESuperTypes().add(this.getNoLacuna());
    emendationEClass.getESuperTypes().add(this.getBrackets());
    disputableReadingEClass.getESuperTypes().add(this.getBrackets());
    disputableReadingEClass.getESuperTypes().add(this.getNoExpanded());
    disputableReadingEClass.getESuperTypes().add(this.getNoEmendation());
    lacunaEClass.getESuperTypes().add(this.getBrackets());
    deletionEClass.getESuperTypes().add(this.getBrackets());
    expandedColumnEClass.getESuperTypes().add(this.getBrackets());
    rasurEClass.getESuperTypes().add(this.getBrackets());
    ancientExpandedEClass.getESuperTypes().add(this.getBrackets());
    restorationOverRasurEClass.getESuperTypes().add(this.getBrackets());
    partialDestructionEClass.getESuperTypes().add(this.getBrackets());
    destructionEClass.getESuperTypes().add(this.getBrackets());

    // Initialize classes and features; add operations and parameters
    initEClass(textContentEClass, TextContent.class, "TextContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextContent_Items(), this.getTextItem(), null, "items", null, 0, -1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textItemEClass, TextItem.class, "TextItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sentenceEClass, Sentence.class, "Sentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSentence_Items(), this.getSentenceItem(), null, "items", null, 0, -1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sentenceItemEClass, SentenceItem.class, "SentenceItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(markerEClass, Marker.class, "Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMarker_Type(), ecorePackage.getEString(), "type", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMarker_Name(), ecorePackage.getEString(), "name", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordEClass, Word.class, "Word", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWord_WChar(), this.getWordMiddle(), null, "wChar", null, 0, -1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordMiddleEClass, WordMiddle.class, "WordMiddle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(charsEClass, Chars.class, "Chars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChars_Name(), ecorePackage.getEString(), "name", null, 0, 1, Chars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfixEClass, Interfix.class, "Interfix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixLexicalEClass, InterfixLexical.class, "InterfixLexical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixFlexionEClass, InterfixFlexion.class, "InterfixFlexion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixSuffixPronomLexicalEClass, InterfixSuffixPronomLexical.class, "InterfixSuffixPronomLexical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixPrefixNonLexicalEClass, InterfixPrefixNonLexical.class, "InterfixPrefixNonLexical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixPrefixLexicalEClass, InterfixPrefixLexical.class, "InterfixPrefixLexical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixCompountWordsEClass, InterfixCompountWords.class, "InterfixCompountWords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixConnectionSyllabicGroupEClass, InterfixConnectionSyllabicGroup.class, "InterfixConnectionSyllabicGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bracketsEClass, Brackets.class, "Brackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expandedEClass, Expanded.class, "Expanded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpanded_WChar(), this.getNoExpanded(), null, "wChar", null, 0, -1, Expanded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noExpandedEClass, NoExpanded.class, "NoExpanded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(emendationEClass, Emendation.class, "Emendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmendation_WChar(), this.getNoEmendation(), null, "wChar", null, 0, -1, Emendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noEmendationEClass, NoEmendation.class, "NoEmendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(disputableReadingEClass, DisputableReading.class, "DisputableReading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisputableReading_WChar(), this.getNoDisputableReading(), null, "wChar", null, 0, -1, DisputableReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noDisputableReadingEClass, NoDisputableReading.class, "NoDisputableReading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lacunaEClass, Lacuna.class, "Lacuna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLacuna_WChar(), this.getNoLacuna(), null, "wChar", null, 0, -1, Lacuna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noLacunaEClass, NoLacuna.class, "NoLacuna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deletionEClass, Deletion.class, "Deletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeletion_WChar(), this.getNoDeletion(), null, "wChar", null, 0, -1, Deletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noDeletionEClass, NoDeletion.class, "NoDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expandedColumnEClass, ExpandedColumn.class, "ExpandedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpandedColumn_WChar(), this.getNoExpandedColumn(), null, "wChar", null, 0, -1, ExpandedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noExpandedColumnEClass, NoExpandedColumn.class, "NoExpandedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rasurEClass, Rasur.class, "Rasur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRasur_WChar(), this.getNoRasur(), null, "wChar", null, 0, -1, Rasur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noRasurEClass, NoRasur.class, "NoRasur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ancientExpandedEClass, AncientExpanded.class, "AncientExpanded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAncientExpanded_WChar(), this.getNoAncientExpanded(), null, "wChar", null, 0, -1, AncientExpanded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noAncientExpandedEClass, NoAncientExpanded.class, "NoAncientExpanded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(restorationOverRasurEClass, RestorationOverRasur.class, "RestorationOverRasur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRestorationOverRasur_WChar(), this.getNoRestorationOverRasur(), null, "wChar", null, 0, -1, RestorationOverRasur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noRestorationOverRasurEClass, NoRestorationOverRasur.class, "NoRestorationOverRasur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(partialDestructionEClass, PartialDestruction.class, "PartialDestruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPartialDestruction_WChar(), this.getNoPartialDestruction(), null, "wChar", null, 0, -1, PartialDestruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noPartialDestructionEClass, NoPartialDestruction.class, "NoPartialDestruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(destructionEClass, Destruction.class, "Destruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDestruction_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Destruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EgyBtsPackageImpl
