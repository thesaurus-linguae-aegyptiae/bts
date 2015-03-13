/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.util;

import org.bbaw.bts.corpus.text.egy.egyDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage
 * @generated
 */
public class EgyDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EgyDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EgyDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EgyDslSwitch<Adapter> modelSwitch =
    new EgyDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseTextContent(TextContent object)
      {
        return createTextContentAdapter();
      }
      @Override
      public Adapter caseTextItem(TextItem object)
      {
        return createTextItemAdapter();
      }
      @Override
      public Adapter caseSentence(Sentence object)
      {
        return createSentenceAdapter();
      }
      @Override
      public Adapter caseSentenceItem(SentenceItem object)
      {
        return createSentenceItemAdapter();
      }
      @Override
      public Adapter caseAbstractMarker(AbstractMarker object)
      {
        return createAbstractMarkerAdapter();
      }
      @Override
      public Adapter caseAmbivalence(Ambivalence object)
      {
        return createAmbivalenceAdapter();
      }
      @Override
      public Adapter caseCase(Case object)
      {
        return createCaseAdapter();
      }
      @Override
      public Adapter caseSentenceItemNoAmbivalence(SentenceItemNoAmbivalence object)
      {
        return createSentenceItemNoAmbivalenceAdapter();
      }
      @Override
      public Adapter caseVersMarker(VersMarker object)
      {
        return createVersMarkerAdapter();
      }
      @Override
      public Adapter caseDisputableVersMarker(DisputableVersMarker object)
      {
        return createDisputableVersMarkerAdapter();
      }
      @Override
      public Adapter caseDeletedVersMarker(DeletedVersMarker object)
      {
        return createDeletedVersMarkerAdapter();
      }
      @Override
      public Adapter caseDestroyedVersMarker(DestroyedVersMarker object)
      {
        return createDestroyedVersMarkerAdapter();
      }
      @Override
      public Adapter caseMissingVersMarker(MissingVersMarker object)
      {
        return createMissingVersMarkerAdapter();
      }
      @Override
      public Adapter caseRestorationOverRasurMarker(RestorationOverRasurMarker object)
      {
        return createRestorationOverRasurMarkerAdapter();
      }
      @Override
      public Adapter caseAncientExpandedMarker(AncientExpandedMarker object)
      {
        return createAncientExpandedMarkerAdapter();
      }
      @Override
      public Adapter caseRasurMarker(RasurMarker object)
      {
        return createRasurMarkerAdapter();
      }
      @Override
      public Adapter caseVersFrontierMarker(VersFrontierMarker object)
      {
        return createVersFrontierMarkerAdapter();
      }
      @Override
      public Adapter caseVersbreakMarker(VersbreakMarker object)
      {
        return createVersbreakMarkerAdapter();
      }
      @Override
      public Adapter caseBrokenVersbreakMarker(BrokenVersbreakMarker object)
      {
        return createBrokenVersbreakMarkerAdapter();
      }
      @Override
      public Adapter caseMarker(Marker object)
      {
        return createMarkerAdapter();
      }
      @Override
      public Adapter caseDestructionMarker(DestructionMarker object)
      {
        return createDestructionMarkerAdapter();
      }
      @Override
      public Adapter caseWord(Word object)
      {
        return createWordAdapter();
      }
      @Override
      public Adapter caseWordPart(WordPart object)
      {
        return createWordPartAdapter();
      }
      @Override
      public Adapter caseWordMiddle(WordMiddle object)
      {
        return createWordMiddleAdapter();
      }
      @Override
      public Adapter caseChars(Chars object)
      {
        return createCharsAdapter();
      }
      @Override
      public Adapter caseBrackets(Brackets object)
      {
        return createBracketsAdapter();
      }
      @Override
      public Adapter caseOval(Oval object)
      {
        return createOvalAdapter();
      }
      @Override
      public Adapter caseSerech(Serech object)
      {
        return createSerechAdapter();
      }
      @Override
      public Adapter caseCartouche(Cartouche object)
      {
        return createCartoucheAdapter();
      }
      @Override
      public Adapter caseNoCartouche(NoCartouche object)
      {
        return createNoCartoucheAdapter();
      }
      @Override
      public Adapter caseExpanded(Expanded object)
      {
        return createExpandedAdapter();
      }
      @Override
      public Adapter caseNoExpanded(NoExpanded object)
      {
        return createNoExpandedAdapter();
      }
      @Override
      public Adapter caseEmendation(Emendation object)
      {
        return createEmendationAdapter();
      }
      @Override
      public Adapter caseNoEmendation(NoEmendation object)
      {
        return createNoEmendationAdapter();
      }
      @Override
      public Adapter caseDisputableReading(DisputableReading object)
      {
        return createDisputableReadingAdapter();
      }
      @Override
      public Adapter caseNoDisputableReading(NoDisputableReading object)
      {
        return createNoDisputableReadingAdapter();
      }
      @Override
      public Adapter caseLacuna(Lacuna object)
      {
        return createLacunaAdapter();
      }
      @Override
      public Adapter caseNoLacuna(NoLacuna object)
      {
        return createNoLacunaAdapter();
      }
      @Override
      public Adapter caseDeletion(Deletion object)
      {
        return createDeletionAdapter();
      }
      @Override
      public Adapter caseNoDeletion(NoDeletion object)
      {
        return createNoDeletionAdapter();
      }
      @Override
      public Adapter caseExpandedColumn(ExpandedColumn object)
      {
        return createExpandedColumnAdapter();
      }
      @Override
      public Adapter caseNoExpandedColumn(NoExpandedColumn object)
      {
        return createNoExpandedColumnAdapter();
      }
      @Override
      public Adapter caseRasur(Rasur object)
      {
        return createRasurAdapter();
      }
      @Override
      public Adapter caseNoRasur(NoRasur object)
      {
        return createNoRasurAdapter();
      }
      @Override
      public Adapter caseAncientExpanded(AncientExpanded object)
      {
        return createAncientExpandedAdapter();
      }
      @Override
      public Adapter caseNoAncientExpanded(NoAncientExpanded object)
      {
        return createNoAncientExpandedAdapter();
      }
      @Override
      public Adapter caseRestorationOverRasur(RestorationOverRasur object)
      {
        return createRestorationOverRasurAdapter();
      }
      @Override
      public Adapter caseNoRestorationOverRasur(NoRestorationOverRasur object)
      {
        return createNoRestorationOverRasurAdapter();
      }
      @Override
      public Adapter casePartialDestruction(PartialDestruction object)
      {
        return createPartialDestructionAdapter();
      }
      @Override
      public Adapter caseNoPartialDestruction(NoPartialDestruction object)
      {
        return createNoPartialDestructionAdapter();
      }
      @Override
      public Adapter caseInterfix(Interfix object)
      {
        return createInterfixAdapter();
      }
      @Override
      public Adapter caseInterfixLexical(InterfixLexical object)
      {
        return createInterfixLexicalAdapter();
      }
      @Override
      public Adapter caseInterfixFlexion(InterfixFlexion object)
      {
        return createInterfixFlexionAdapter();
      }
      @Override
      public Adapter caseInterfixSuffixPronomLexical(InterfixSuffixPronomLexical object)
      {
        return createInterfixSuffixPronomLexicalAdapter();
      }
      @Override
      public Adapter caseInterfixPrefixNonLexical(InterfixPrefixNonLexical object)
      {
        return createInterfixPrefixNonLexicalAdapter();
      }
      @Override
      public Adapter caseInterfixPrefixLexical(InterfixPrefixLexical object)
      {
        return createInterfixPrefixLexicalAdapter();
      }
      @Override
      public Adapter caseInterfixConnectionSyllabicGroup(InterfixConnectionSyllabicGroup object)
      {
        return createInterfixConnectionSyllabicGroupAdapter();
      }
      @Override
      public Adapter caseInterfixCompoundWords(InterfixCompoundWords object)
      {
        return createInterfixCompoundWordsAdapter();
      }
      @Override
      public Adapter caseInterfixPhoneticalComplement(InterfixPhoneticalComplement object)
      {
        return createInterfixPhoneticalComplementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextContent <em>Text Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextContent
   * @generated
   */
  public Adapter createTextContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextItem <em>Text Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextItem
   * @generated
   */
  public Adapter createTextItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Sentence
   * @generated
   */
  public Adapter createSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem <em>Sentence Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem
   * @generated
   */
  public Adapter createSentenceItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker <em>Abstract Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker
   * @generated
   */
  public Adapter createAbstractMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence <em>Ambivalence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence
   * @generated
   */
  public Adapter createAmbivalenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence <em>Sentence Item No Ambivalence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence
   * @generated
   */
  public Adapter createSentenceItemNoAmbivalenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker <em>Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker
   * @generated
   */
  public Adapter createVersMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker <em>Disputable Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker
   * @generated
   */
  public Adapter createDisputableVersMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker <em>Deleted Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker
   * @generated
   */
  public Adapter createDeletedVersMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker <em>Destroyed Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker
   * @generated
   */
  public Adapter createDestroyedVersMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker <em>Missing Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker
   * @generated
   */
  public Adapter createMissingVersMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker <em>Restoration Over Rasur Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker
   * @generated
   */
  public Adapter createRestorationOverRasurMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker <em>Ancient Expanded Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker
   * @generated
   */
  public Adapter createAncientExpandedMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker <em>Rasur Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker
   * @generated
   */
  public Adapter createRasurMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker <em>Vers Frontier Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker
   * @generated
   */
  public Adapter createVersFrontierMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker <em>Versbreak Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker
   * @generated
   */
  public Adapter createVersbreakMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker <em>Broken Versbreak Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker
   * @generated
   */
  public Adapter createBrokenVersbreakMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Marker <em>Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Marker
   * @generated
   */
  public Adapter createMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker <em>Destruction Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker
   * @generated
   */
  public Adapter createDestructionMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Word
   * @generated
   */
  public Adapter createWordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart <em>Word Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordPart
   * @generated
   */
  public Adapter createWordPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle <em>Word Middle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle
   * @generated
   */
  public Adapter createWordMiddleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Chars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Chars
   * @generated
   */
  public Adapter createCharsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Brackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Brackets
   * @generated
   */
  public Adapter createBracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Oval <em>Oval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Oval
   * @generated
   */
  public Adapter createOvalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Serech <em>Serech</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Serech
   * @generated
   */
  public Adapter createSerechAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Cartouche <em>Cartouche</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Cartouche
   * @generated
   */
  public Adapter createCartoucheAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche <em>No Cartouche</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche
   * @generated
   */
  public Adapter createNoCartoucheAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Expanded <em>Expanded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Expanded
   * @generated
   */
  public Adapter createExpandedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded <em>No Expanded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded
   * @generated
   */
  public Adapter createNoExpandedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Emendation <em>Emendation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Emendation
   * @generated
   */
  public Adapter createEmendationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation <em>No Emendation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation
   * @generated
   */
  public Adapter createNoEmendationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading <em>Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading
   * @generated
   */
  public Adapter createDisputableReadingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading <em>No Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading
   * @generated
   */
  public Adapter createNoDisputableReadingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna <em>Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna
   * @generated
   */
  public Adapter createLacunaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna <em>No Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna
   * @generated
   */
  public Adapter createNoLacunaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Deletion <em>Deletion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Deletion
   * @generated
   */
  public Adapter createDeletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion <em>No Deletion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion
   * @generated
   */
  public Adapter createNoDeletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn <em>Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn
   * @generated
   */
  public Adapter createExpandedColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn <em>No Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn
   * @generated
   */
  public Adapter createNoExpandedColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Rasur <em>Rasur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Rasur
   * @generated
   */
  public Adapter createRasurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur <em>No Rasur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur
   * @generated
   */
  public Adapter createNoRasurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded <em>Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded
   * @generated
   */
  public Adapter createAncientExpandedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded <em>No Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded
   * @generated
   */
  public Adapter createNoAncientExpandedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur <em>Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur
   * @generated
   */
  public Adapter createRestorationOverRasurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur <em>No Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur
   * @generated
   */
  public Adapter createNoRestorationOverRasurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction <em>Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction
   * @generated
   */
  public Adapter createPartialDestructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction <em>No Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction
   * @generated
   */
  public Adapter createNoPartialDestructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Interfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Interfix
   * @generated
   */
  public Adapter createInterfixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical <em>Interfix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical
   * @generated
   */
  public Adapter createInterfixLexicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion <em>Interfix Flexion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion
   * @generated
   */
  public Adapter createInterfixFlexionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical <em>Interfix Suffix Pronom Lexical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical
   * @generated
   */
  public Adapter createInterfixSuffixPronomLexicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical <em>Interfix Prefix Non Lexical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical
   * @generated
   */
  public Adapter createInterfixPrefixNonLexicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical <em>Interfix Prefix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical
   * @generated
   */
  public Adapter createInterfixPrefixLexicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup <em>Interfix Connection Syllabic Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup
   * @generated
   */
  public Adapter createInterfixConnectionSyllabicGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixCompoundWords <em>Interfix Compound Words</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixCompoundWords
   * @generated
   */
  public Adapter createInterfixCompoundWordsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPhoneticalComplement <em>Interfix Phonetical Complement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPhoneticalComplement
   * @generated
   */
  public Adapter createInterfixPhoneticalComplementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EgyDslAdapterFactory
