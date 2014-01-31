/**
 */
package org.bbaw.bts.corpus.text.egy.dsl.egyBts.util;

import org.bbaw.bts.corpus.text.egy.dsl.egyBts.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsPackage
 * @generated
 */
public class EgyBtsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EgyBtsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyBtsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EgyBtsPackage.eINSTANCE;
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
  protected EgyBtsSwitch<Adapter> modelSwitch =
    new EgyBtsSwitch<Adapter>()
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
      public Adapter caseMarker(Marker object)
      {
        return createMarkerAdapter();
      }
      @Override
      public Adapter caseWord(Word object)
      {
        return createWordAdapter();
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
      public Adapter caseInterfixCompountWords(InterfixCompountWords object)
      {
        return createInterfixCompountWordsAdapter();
      }
      @Override
      public Adapter caseInterfixConnectionSyllabicGroup(InterfixConnectionSyllabicGroup object)
      {
        return createInterfixConnectionSyllabicGroupAdapter();
      }
      @Override
      public Adapter caseBrackets(Brackets object)
      {
        return createBracketsAdapter();
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
      public Adapter caseDestruction(Destruction object)
      {
        return createDestructionAdapter();
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
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextContent <em>Text Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextContent
   * @generated
   */
  public Adapter createTextContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextItem <em>Text Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextItem
   * @generated
   */
  public Adapter createTextItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Sentence
   * @generated
   */
  public Adapter createSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.SentenceItem <em>Sentence Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.SentenceItem
   * @generated
   */
  public Adapter createSentenceItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.AbstractMarker <em>Abstract Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.AbstractMarker
   * @generated
   */
  public Adapter createAbstractMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Ambivalence <em>Ambivalence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Ambivalence
   * @generated
   */
  public Adapter createAmbivalenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker <em>Marker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker
   * @generated
   */
  public Adapter createMarkerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Word
   * @generated
   */
  public Adapter createWordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.WordMiddle <em>Word Middle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.WordMiddle
   * @generated
   */
  public Adapter createWordMiddleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars
   * @generated
   */
  public Adapter createCharsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Interfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Interfix
   * @generated
   */
  public Adapter createInterfixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixLexical <em>Interfix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixLexical
   * @generated
   */
  public Adapter createInterfixLexicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixFlexion <em>Interfix Flexion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixFlexion
   * @generated
   */
  public Adapter createInterfixFlexionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixSuffixPronomLexical <em>Interfix Suffix Pronom Lexical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixSuffixPronomLexical
   * @generated
   */
  public Adapter createInterfixSuffixPronomLexicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixNonLexical <em>Interfix Prefix Non Lexical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixNonLexical
   * @generated
   */
  public Adapter createInterfixPrefixNonLexicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixLexical <em>Interfix Prefix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixLexical
   * @generated
   */
  public Adapter createInterfixPrefixLexicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixCompountWords <em>Interfix Compount Words</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixCompountWords
   * @generated
   */
  public Adapter createInterfixCompountWordsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixConnectionSyllabicGroup <em>Interfix Connection Syllabic Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixConnectionSyllabicGroup
   * @generated
   */
  public Adapter createInterfixConnectionSyllabicGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Brackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Brackets
   * @generated
   */
  public Adapter createBracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded <em>Expanded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded
   * @generated
   */
  public Adapter createExpandedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpanded <em>No Expanded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpanded
   * @generated
   */
  public Adapter createNoExpandedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Emendation <em>Emendation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Emendation
   * @generated
   */
  public Adapter createEmendationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoEmendation <em>No Emendation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoEmendation
   * @generated
   */
  public Adapter createNoEmendationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.DisputableReading <em>Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.DisputableReading
   * @generated
   */
  public Adapter createDisputableReadingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDisputableReading <em>No Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDisputableReading
   * @generated
   */
  public Adapter createNoDisputableReadingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Lacuna <em>Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Lacuna
   * @generated
   */
  public Adapter createLacunaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoLacuna <em>No Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoLacuna
   * @generated
   */
  public Adapter createNoLacunaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Deletion <em>Deletion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Deletion
   * @generated
   */
  public Adapter createDeletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDeletion <em>No Deletion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoDeletion
   * @generated
   */
  public Adapter createNoDeletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.ExpandedColumn <em>Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.ExpandedColumn
   * @generated
   */
  public Adapter createExpandedColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpandedColumn <em>No Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoExpandedColumn
   * @generated
   */
  public Adapter createNoExpandedColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Rasur <em>Rasur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Rasur
   * @generated
   */
  public Adapter createRasurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRasur <em>No Rasur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRasur
   * @generated
   */
  public Adapter createNoRasurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.AncientExpanded <em>Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.AncientExpanded
   * @generated
   */
  public Adapter createAncientExpandedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoAncientExpanded <em>No Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoAncientExpanded
   * @generated
   */
  public Adapter createNoAncientExpandedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.RestorationOverRasur <em>Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.RestorationOverRasur
   * @generated
   */
  public Adapter createRestorationOverRasurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRestorationOverRasur <em>No Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoRestorationOverRasur
   * @generated
   */
  public Adapter createNoRestorationOverRasurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.PartialDestruction <em>Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.PartialDestruction
   * @generated
   */
  public Adapter createPartialDestructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoPartialDestruction <em>No Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.NoPartialDestruction
   * @generated
   */
  public Adapter createNoPartialDestructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.text.egy.dsl.egyBts.Destruction <em>Destruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.bbaw.bts.corpus.text.egy.dsl.egyBts.Destruction
   * @generated
   */
  public Adapter createDestructionAdapter()
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

} //EgyBtsAdapterFactory
