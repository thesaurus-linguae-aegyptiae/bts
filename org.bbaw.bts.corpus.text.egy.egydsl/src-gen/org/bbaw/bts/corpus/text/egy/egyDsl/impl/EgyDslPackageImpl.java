/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.impl;

import org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.Brackets;
import org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Cartouche;
import org.bbaw.bts.corpus.text.egy.egyDsl.Case;
import org.bbaw.bts.corpus.text.egy.egyDsl.Chars;
import org.bbaw.bts.corpus.text.egy.egyDsl.Deletion;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading;
import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslFactory;
import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.Emendation;
import org.bbaw.bts.corpus.text.egy.egyDsl.Expanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn;
import org.bbaw.bts.corpus.text.egy.egyDsl.Interfix;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixCompoundWords;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPhoneticalComplement;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna;
import org.bbaw.bts.corpus.text.egy.egyDsl.Marker;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.Oval;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction;
import org.bbaw.bts.corpus.text.egy.egyDsl.Rasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.Sentence;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.Serech;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle;
import org.bbaw.bts.corpus.text.egy.egyDsl.WordPart;

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
public class EgyDslPackageImpl extends EPackageImpl implements EgyDslPackage
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
  private EClass abstractMarkerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ambivalenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentenceItemNoAmbivalenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versMarkerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versFrontierMarkerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versbreakMarkerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass brokenVersbreakMarkerEClass = null;

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
  private EClass destructionMarkerEClass = null;

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
  private EClass wordPartEClass = null;

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
  private EClass bracketsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ovalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serechEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cartoucheEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noCartoucheEClass = null;

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
  private EClass interfixConnectionSyllabicGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixCompoundWordsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfixPhoneticalComplementEClass = null;

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
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EgyDslPackageImpl()
  {
    super(eNS_URI, EgyDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EgyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EgyDslPackage init()
  {
    if (isInited) return (EgyDslPackage)EPackage.Registry.INSTANCE.getEPackage(EgyDslPackage.eNS_URI);

    // Obtain or create and register package
    EgyDslPackageImpl theEgyDslPackage = (EgyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EgyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EgyDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEgyDslPackage.createPackageContents();

    // Initialize created meta-data
    theEgyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEgyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EgyDslPackage.eNS_URI, theEgyDslPackage);
    return theEgyDslPackage;
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
  public EClass getAbstractMarker()
  {
    return abstractMarkerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAmbivalence()
  {
    return ambivalenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAmbivalence_Cases()
  {
    return (EReference)ambivalenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCase_Name()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Items()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSentenceItemNoAmbivalence()
  {
    return sentenceItemNoAmbivalenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersMarker()
  {
    return versMarkerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersFrontierMarker()
  {
    return versFrontierMarkerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersbreakMarker()
  {
    return versbreakMarkerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBrokenVersbreakMarker()
  {
    return brokenVersbreakMarkerEClass;
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
  public EClass getDestructionMarker()
  {
    return destructionMarkerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDestructionMarker_Type()
  {
    return (EAttribute)destructionMarkerEClass.getEStructuralFeatures().get(0);
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
  public EClass getWordPart()
  {
    return wordPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWordPart_WChar()
  {
    return (EReference)wordPartEClass.getEStructuralFeatures().get(0);
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
  public EClass getBrackets()
  {
    return bracketsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOval()
  {
    return ovalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOval_WChar()
  {
    return (EReference)ovalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSerech()
  {
    return serechEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSerech_WChar()
  {
    return (EReference)serechEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCartouche()
  {
    return cartoucheEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoCartouche()
  {
    return noCartoucheEClass;
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
  public EClass getInterfixConnectionSyllabicGroup()
  {
    return interfixConnectionSyllabicGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixCompoundWords()
  {
    return interfixCompoundWordsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfixPhoneticalComplement()
  {
    return interfixPhoneticalComplementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyDslFactory getEgyDslFactory()
  {
    return (EgyDslFactory)getEFactoryInstance();
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

    abstractMarkerEClass = createEClass(ABSTRACT_MARKER);

    ambivalenceEClass = createEClass(AMBIVALENCE);
    createEReference(ambivalenceEClass, AMBIVALENCE__CASES);

    caseEClass = createEClass(CASE);
    createEAttribute(caseEClass, CASE__NAME);
    createEReference(caseEClass, CASE__ITEMS);

    sentenceItemNoAmbivalenceEClass = createEClass(SENTENCE_ITEM_NO_AMBIVALENCE);

    versMarkerEClass = createEClass(VERS_MARKER);

    versFrontierMarkerEClass = createEClass(VERS_FRONTIER_MARKER);

    versbreakMarkerEClass = createEClass(VERSBREAK_MARKER);

    brokenVersbreakMarkerEClass = createEClass(BROKEN_VERSBREAK_MARKER);

    markerEClass = createEClass(MARKER);
    createEAttribute(markerEClass, MARKER__TYPE);

    destructionMarkerEClass = createEClass(DESTRUCTION_MARKER);
    createEAttribute(destructionMarkerEClass, DESTRUCTION_MARKER__TYPE);

    wordEClass = createEClass(WORD);
    createEReference(wordEClass, WORD__WCHAR);

    wordPartEClass = createEClass(WORD_PART);
    createEReference(wordPartEClass, WORD_PART__WCHAR);

    wordMiddleEClass = createEClass(WORD_MIDDLE);

    charsEClass = createEClass(CHARS);
    createEAttribute(charsEClass, CHARS__NAME);

    bracketsEClass = createEClass(BRACKETS);

    ovalEClass = createEClass(OVAL);
    createEReference(ovalEClass, OVAL__WCHAR);

    serechEClass = createEClass(SERECH);
    createEReference(serechEClass, SERECH__WCHAR);

    cartoucheEClass = createEClass(CARTOUCHE);

    noCartoucheEClass = createEClass(NO_CARTOUCHE);

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

    interfixEClass = createEClass(INTERFIX);

    interfixLexicalEClass = createEClass(INTERFIX_LEXICAL);

    interfixFlexionEClass = createEClass(INTERFIX_FLEXION);

    interfixSuffixPronomLexicalEClass = createEClass(INTERFIX_SUFFIX_PRONOM_LEXICAL);

    interfixPrefixNonLexicalEClass = createEClass(INTERFIX_PREFIX_NON_LEXICAL);

    interfixPrefixLexicalEClass = createEClass(INTERFIX_PREFIX_LEXICAL);

    interfixConnectionSyllabicGroupEClass = createEClass(INTERFIX_CONNECTION_SYLLABIC_GROUP);

    interfixCompoundWordsEClass = createEClass(INTERFIX_COMPOUND_WORDS);

    interfixPhoneticalComplementEClass = createEClass(INTERFIX_PHONETICAL_COMPLEMENT);
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
    abstractMarkerEClass.getESuperTypes().add(this.getSentenceItem());
    abstractMarkerEClass.getESuperTypes().add(this.getSentenceItemNoAmbivalence());
    ambivalenceEClass.getESuperTypes().add(this.getSentenceItem());
    versMarkerEClass.getESuperTypes().add(this.getAbstractMarker());
    versFrontierMarkerEClass.getESuperTypes().add(this.getVersMarker());
    versbreakMarkerEClass.getESuperTypes().add(this.getVersMarker());
    brokenVersbreakMarkerEClass.getESuperTypes().add(this.getVersMarker());
    markerEClass.getESuperTypes().add(this.getAbstractMarker());
    destructionMarkerEClass.getESuperTypes().add(this.getAbstractMarker());
    wordEClass.getESuperTypes().add(this.getSentenceItem());
    wordEClass.getESuperTypes().add(this.getSentenceItemNoAmbivalence());
    charsEClass.getESuperTypes().add(this.getWordMiddle());
    charsEClass.getESuperTypes().add(this.getNoCartouche());
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
    bracketsEClass.getESuperTypes().add(this.getWordMiddle());
    ovalEClass.getESuperTypes().add(this.getBrackets());
    serechEClass.getESuperTypes().add(this.getBrackets());
    cartoucheEClass.getESuperTypes().add(this.getBrackets());
    expandedEClass.getESuperTypes().add(this.getBrackets());
    expandedEClass.getESuperTypes().add(this.getCartouche());
    expandedEClass.getESuperTypes().add(this.getNoCartouche());
    expandedEClass.getESuperTypes().add(this.getNoEmendation());
    expandedEClass.getESuperTypes().add(this.getNoDisputableReading());
    expandedEClass.getESuperTypes().add(this.getNoLacuna());
    expandedEClass.getESuperTypes().add(this.getNoDeletion());
    expandedEClass.getESuperTypes().add(this.getNoExpandedColumn());
    expandedEClass.getESuperTypes().add(this.getNoRasur());
    expandedEClass.getESuperTypes().add(this.getNoAncientExpanded());
    expandedEClass.getESuperTypes().add(this.getNoRestorationOverRasur());
    expandedEClass.getESuperTypes().add(this.getNoPartialDestruction());
    emendationEClass.getESuperTypes().add(this.getBrackets());
    emendationEClass.getESuperTypes().add(this.getNoCartouche());
    emendationEClass.getESuperTypes().add(this.getNoDisputableReading());
    disputableReadingEClass.getESuperTypes().add(this.getBrackets());
    disputableReadingEClass.getESuperTypes().add(this.getNoCartouche());
    disputableReadingEClass.getESuperTypes().add(this.getNoExpanded());
    disputableReadingEClass.getESuperTypes().add(this.getNoEmendation());
    disputableReadingEClass.getESuperTypes().add(this.getNoLacuna());
    disputableReadingEClass.getESuperTypes().add(this.getNoPartialDestruction());
    lacunaEClass.getESuperTypes().add(this.getBrackets());
    lacunaEClass.getESuperTypes().add(this.getNoCartouche());
    deletionEClass.getESuperTypes().add(this.getBrackets());
    deletionEClass.getESuperTypes().add(this.getNoCartouche());
    deletionEClass.getESuperTypes().add(this.getNoDisputableReading());
    deletionEClass.getESuperTypes().add(this.getNoPartialDestruction());
    expandedColumnEClass.getESuperTypes().add(this.getBrackets());
    expandedColumnEClass.getESuperTypes().add(this.getNoCartouche());
    rasurEClass.getESuperTypes().add(this.getBrackets());
    rasurEClass.getESuperTypes().add(this.getNoCartouche());
    ancientExpandedEClass.getESuperTypes().add(this.getBrackets());
    ancientExpandedEClass.getESuperTypes().add(this.getNoCartouche());
    restorationOverRasurEClass.getESuperTypes().add(this.getBrackets());
    restorationOverRasurEClass.getESuperTypes().add(this.getNoCartouche());
    partialDestructionEClass.getESuperTypes().add(this.getBrackets());
    partialDestructionEClass.getESuperTypes().add(this.getNoCartouche());
    partialDestructionEClass.getESuperTypes().add(this.getNoDeletion());
    interfixEClass.getESuperTypes().add(this.getWordMiddle());
    interfixEClass.getESuperTypes().add(this.getNoCartouche());
    interfixEClass.getESuperTypes().add(this.getNoExpanded());
    interfixEClass.getESuperTypes().add(this.getNoEmendation());
    interfixEClass.getESuperTypes().add(this.getNoDisputableReading());
    interfixEClass.getESuperTypes().add(this.getNoLacuna());
    interfixEClass.getESuperTypes().add(this.getNoDeletion());
    interfixEClass.getESuperTypes().add(this.getNoExpandedColumn());
    interfixEClass.getESuperTypes().add(this.getNoRasur());
    interfixEClass.getESuperTypes().add(this.getNoAncientExpanded());
    interfixEClass.getESuperTypes().add(this.getNoRestorationOverRasur());
    interfixEClass.getESuperTypes().add(this.getNoPartialDestruction());
    interfixLexicalEClass.getESuperTypes().add(this.getInterfix());
    interfixFlexionEClass.getESuperTypes().add(this.getInterfix());
    interfixSuffixPronomLexicalEClass.getESuperTypes().add(this.getInterfix());
    interfixPrefixNonLexicalEClass.getESuperTypes().add(this.getInterfix());
    interfixPrefixLexicalEClass.getESuperTypes().add(this.getInterfix());
    interfixConnectionSyllabicGroupEClass.getESuperTypes().add(this.getInterfix());
    interfixCompoundWordsEClass.getESuperTypes().add(this.getInterfix());
    interfixPhoneticalComplementEClass.getESuperTypes().add(this.getInterfix());

    // Initialize classes and features; add operations and parameters
    initEClass(textContentEClass, TextContent.class, "TextContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextContent_Items(), this.getTextItem(), null, "items", null, 0, -1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textItemEClass, TextItem.class, "TextItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sentenceEClass, Sentence.class, "Sentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSentence_Items(), this.getSentenceItem(), null, "items", null, 0, -1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sentenceItemEClass, SentenceItem.class, "SentenceItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractMarkerEClass, AbstractMarker.class, "AbstractMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ambivalenceEClass, Ambivalence.class, "Ambivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAmbivalence_Cases(), this.getCase(), null, "cases", null, 0, -1, Ambivalence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_Items(), this.getSentenceItemNoAmbivalence(), null, "items", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sentenceItemNoAmbivalenceEClass, SentenceItemNoAmbivalence.class, "SentenceItemNoAmbivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(versMarkerEClass, VersMarker.class, "VersMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(versFrontierMarkerEClass, VersFrontierMarker.class, "VersFrontierMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(versbreakMarkerEClass, VersbreakMarker.class, "VersbreakMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(brokenVersbreakMarkerEClass, BrokenVersbreakMarker.class, "BrokenVersbreakMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(markerEClass, Marker.class, "Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMarker_Type(), ecorePackage.getEString(), "type", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(destructionMarkerEClass, DestructionMarker.class, "DestructionMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDestructionMarker_Type(), ecorePackage.getEString(), "type", null, 0, 1, DestructionMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordEClass, Word.class, "Word", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWord_WChar(), this.getWordPart(), null, "wChar", null, 0, -1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordPartEClass, WordPart.class, "WordPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWordPart_WChar(), this.getWordMiddle(), null, "wChar", null, 0, 1, WordPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordMiddleEClass, WordMiddle.class, "WordMiddle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(charsEClass, Chars.class, "Chars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChars_Name(), ecorePackage.getEString(), "name", null, 0, 1, Chars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bracketsEClass, Brackets.class, "Brackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ovalEClass, Oval.class, "Oval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOval_WChar(), this.getNoCartouche(), null, "wChar", null, 0, -1, Oval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serechEClass, Serech.class, "Serech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSerech_WChar(), this.getNoCartouche(), null, "wChar", null, 0, -1, Serech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cartoucheEClass, Cartouche.class, "Cartouche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(noCartoucheEClass, NoCartouche.class, "NoCartouche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expandedEClass, Expanded.class, "Expanded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpanded_WChar(), ecorePackage.getEObject(), null, "wChar", null, 0, -1, Expanded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(interfixEClass, Interfix.class, "Interfix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixLexicalEClass, InterfixLexical.class, "InterfixLexical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixFlexionEClass, InterfixFlexion.class, "InterfixFlexion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixSuffixPronomLexicalEClass, InterfixSuffixPronomLexical.class, "InterfixSuffixPronomLexical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixPrefixNonLexicalEClass, InterfixPrefixNonLexical.class, "InterfixPrefixNonLexical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixPrefixLexicalEClass, InterfixPrefixLexical.class, "InterfixPrefixLexical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixConnectionSyllabicGroupEClass, InterfixConnectionSyllabicGroup.class, "InterfixConnectionSyllabicGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixCompoundWordsEClass, InterfixCompoundWords.class, "InterfixCompoundWords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfixPhoneticalComplementEClass, InterfixPhoneticalComplement.class, "InterfixPhoneticalComplement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //EgyDslPackageImpl
