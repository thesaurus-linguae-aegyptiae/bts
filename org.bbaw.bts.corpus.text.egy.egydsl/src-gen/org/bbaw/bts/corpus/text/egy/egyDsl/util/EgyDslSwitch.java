/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.util;

import org.bbaw.bts.corpus.text.egy.egyDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage
 * @generated
 */
public class EgyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EgyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EgyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EgyDslPackage.TEXT_CONTENT:
      {
        TextContent textContent = (TextContent)theEObject;
        T result = caseTextContent(textContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.TEXT_ITEM:
      {
        TextItem textItem = (TextItem)theEObject;
        T result = caseTextItem(textItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.SENTENCE:
      {
        Sentence sentence = (Sentence)theEObject;
        T result = caseSentence(sentence);
        if (result == null) result = caseTextItem(sentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.SENTENCE_ITEM:
      {
        SentenceItem sentenceItem = (SentenceItem)theEObject;
        T result = caseSentenceItem(sentenceItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.ABSTRACT_MARKER:
      {
        AbstractMarker abstractMarker = (AbstractMarker)theEObject;
        T result = caseAbstractMarker(abstractMarker);
        if (result == null) result = caseSentenceItem(abstractMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(abstractMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.AMBIVALENCE:
      {
        Ambivalence ambivalence = (Ambivalence)theEObject;
        T result = caseAmbivalence(ambivalence);
        if (result == null) result = caseSentenceItem(ambivalence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.SENTENCE_ITEM_NO_AMBIVALENCE:
      {
        SentenceItemNoAmbivalence sentenceItemNoAmbivalence = (SentenceItemNoAmbivalence)theEObject;
        T result = caseSentenceItemNoAmbivalence(sentenceItemNoAmbivalence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.MARKER:
      {
        Marker marker = (Marker)theEObject;
        T result = caseMarker(marker);
        if (result == null) result = caseAbstractMarker(marker);
        if (result == null) result = caseSentenceItem(marker);
        if (result == null) result = caseSentenceItemNoAmbivalence(marker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DESTRUCTION_MARKER:
      {
        DestructionMarker destructionMarker = (DestructionMarker)theEObject;
        T result = caseDestructionMarker(destructionMarker);
        if (result == null) result = caseAbstractMarker(destructionMarker);
        if (result == null) result = caseSentenceItem(destructionMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(destructionMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.WORD:
      {
        Word word = (Word)theEObject;
        T result = caseWord(word);
        if (result == null) result = caseSentenceItem(word);
        if (result == null) result = caseSentenceItemNoAmbivalence(word);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.WORD_PART:
      {
        WordPart wordPart = (WordPart)theEObject;
        T result = caseWordPart(wordPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.WORD_MIDDLE:
      {
        WordMiddle wordMiddle = (WordMiddle)theEObject;
        T result = caseWordMiddle(wordMiddle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.CHARS:
      {
        Chars chars = (Chars)theEObject;
        T result = caseChars(chars);
        if (result == null) result = caseWordMiddle(chars);
        if (result == null) result = caseNoCartouche(chars);
        if (result == null) result = caseNoExpanded(chars);
        if (result == null) result = caseNoEmendation(chars);
        if (result == null) result = caseNoDisputableReading(chars);
        if (result == null) result = caseNoLacuna(chars);
        if (result == null) result = caseNoDeletion(chars);
        if (result == null) result = caseNoExpandedColumn(chars);
        if (result == null) result = caseNoRasur(chars);
        if (result == null) result = caseNoAncientExpanded(chars);
        if (result == null) result = caseNoRestorationOverRasur(chars);
        if (result == null) result = caseNoPartialDestruction(chars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.BRACKETS:
      {
        Brackets brackets = (Brackets)theEObject;
        T result = caseBrackets(brackets);
        if (result == null) result = caseWordMiddle(brackets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.OVAL:
      {
        Oval oval = (Oval)theEObject;
        T result = caseOval(oval);
        if (result == null) result = caseBrackets(oval);
        if (result == null) result = caseNoLacuna(oval);
        if (result == null) result = caseNoPartialDestruction(oval);
        if (result == null) result = caseWordMiddle(oval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.SERECH:
      {
        Serech serech = (Serech)theEObject;
        T result = caseSerech(serech);
        if (result == null) result = caseBrackets(serech);
        if (result == null) result = caseNoLacuna(serech);
        if (result == null) result = caseNoPartialDestruction(serech);
        if (result == null) result = caseWordMiddle(serech);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.CARTOUCHE:
      {
        Cartouche cartouche = (Cartouche)theEObject;
        T result = caseCartouche(cartouche);
        if (result == null) result = caseBrackets(cartouche);
        if (result == null) result = caseNoLacuna(cartouche);
        if (result == null) result = caseNoRestorationOverRasur(cartouche);
        if (result == null) result = caseNoPartialDestruction(cartouche);
        if (result == null) result = caseWordMiddle(cartouche);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_CARTOUCHE:
      {
        NoCartouche noCartouche = (NoCartouche)theEObject;
        T result = caseNoCartouche(noCartouche);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.EXPANDED:
      {
        Expanded expanded = (Expanded)theEObject;
        T result = caseExpanded(expanded);
        if (result == null) result = caseCartouche(expanded);
        if (result == null) result = caseNoCartouche(expanded);
        if (result == null) result = caseNoEmendation(expanded);
        if (result == null) result = caseNoDisputableReading(expanded);
        if (result == null) result = caseNoDeletion(expanded);
        if (result == null) result = caseNoExpandedColumn(expanded);
        if (result == null) result = caseNoRasur(expanded);
        if (result == null) result = caseNoAncientExpanded(expanded);
        if (result == null) result = caseBrackets(expanded);
        if (result == null) result = caseWordMiddle(expanded);
        if (result == null) result = caseNoLacuna(expanded);
        if (result == null) result = caseNoRestorationOverRasur(expanded);
        if (result == null) result = caseNoPartialDestruction(expanded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.ANCIENT_EXPANDED:
      {
        AncientExpanded ancientExpanded = (AncientExpanded)theEObject;
        T result = caseAncientExpanded(ancientExpanded);
        if (result == null) result = caseBrackets(ancientExpanded);
        if (result == null) result = caseNoCartouche(ancientExpanded);
        if (result == null) result = caseNoDisputableReading(ancientExpanded);
        if (result == null) result = caseNoDeletion(ancientExpanded);
        if (result == null) result = caseWordMiddle(ancientExpanded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_EXPANDED:
      {
        NoExpanded noExpanded = (NoExpanded)theEObject;
        T result = caseNoExpanded(noExpanded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.EMENDATION:
      {
        Emendation emendation = (Emendation)theEObject;
        T result = caseEmendation(emendation);
        if (result == null) result = caseBrackets(emendation);
        if (result == null) result = caseNoCartouche(emendation);
        if (result == null) result = caseNoDisputableReading(emendation);
        if (result == null) result = caseNoLacuna(emendation);
        if (result == null) result = caseNoExpandedColumn(emendation);
        if (result == null) result = caseNoRasur(emendation);
        if (result == null) result = caseNoAncientExpanded(emendation);
        if (result == null) result = caseNoRestorationOverRasur(emendation);
        if (result == null) result = caseNoPartialDestruction(emendation);
        if (result == null) result = caseWordMiddle(emendation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_EMENDATION:
      {
        NoEmendation noEmendation = (NoEmendation)theEObject;
        T result = caseNoEmendation(noEmendation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DISPUTABLE_READING:
      {
        DisputableReading disputableReading = (DisputableReading)theEObject;
        T result = caseDisputableReading(disputableReading);
        if (result == null) result = caseBrackets(disputableReading);
        if (result == null) result = caseNoCartouche(disputableReading);
        if (result == null) result = caseNoExpanded(disputableReading);
        if (result == null) result = caseNoEmendation(disputableReading);
        if (result == null) result = caseNoLacuna(disputableReading);
        if (result == null) result = caseNoDeletion(disputableReading);
        if (result == null) result = caseNoExpandedColumn(disputableReading);
        if (result == null) result = caseNoRasur(disputableReading);
        if (result == null) result = caseNoAncientExpanded(disputableReading);
        if (result == null) result = caseNoRestorationOverRasur(disputableReading);
        if (result == null) result = caseNoPartialDestruction(disputableReading);
        if (result == null) result = caseWordMiddle(disputableReading);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_DISPUTABLE_READING:
      {
        NoDisputableReading noDisputableReading = (NoDisputableReading)theEObject;
        T result = caseNoDisputableReading(noDisputableReading);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.LACUNA:
      {
        Lacuna lacuna = (Lacuna)theEObject;
        T result = caseLacuna(lacuna);
        if (result == null) result = caseBrackets(lacuna);
        if (result == null) result = caseNoCartouche(lacuna);
        if (result == null) result = caseNoDisputableReading(lacuna);
        if (result == null) result = caseNoDeletion(lacuna);
        if (result == null) result = caseNoExpandedColumn(lacuna);
        if (result == null) result = caseNoRasur(lacuna);
        if (result == null) result = caseNoAncientExpanded(lacuna);
        if (result == null) result = caseNoRestorationOverRasur(lacuna);
        if (result == null) result = caseWordMiddle(lacuna);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_LACUNA:
      {
        NoLacuna noLacuna = (NoLacuna)theEObject;
        T result = caseNoLacuna(noLacuna);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DELETION:
      {
        Deletion deletion = (Deletion)theEObject;
        T result = caseDeletion(deletion);
        if (result == null) result = caseBrackets(deletion);
        if (result == null) result = caseNoCartouche(deletion);
        if (result == null) result = caseNoDisputableReading(deletion);
        if (result == null) result = caseNoLacuna(deletion);
        if (result == null) result = caseNoExpandedColumn(deletion);
        if (result == null) result = caseNoRasur(deletion);
        if (result == null) result = caseNoAncientExpanded(deletion);
        if (result == null) result = caseNoRestorationOverRasur(deletion);
        if (result == null) result = caseNoPartialDestruction(deletion);
        if (result == null) result = caseWordMiddle(deletion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_DELETION:
      {
        NoDeletion noDeletion = (NoDeletion)theEObject;
        T result = caseNoDeletion(noDeletion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.EXPANDED_COLUMN:
      {
        ExpandedColumn expandedColumn = (ExpandedColumn)theEObject;
        T result = caseExpandedColumn(expandedColumn);
        if (result == null) result = caseBrackets(expandedColumn);
        if (result == null) result = caseNoCartouche(expandedColumn);
        if (result == null) result = caseNoDisputableReading(expandedColumn);
        if (result == null) result = caseWordMiddle(expandedColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_EXPANDED_COLUMN:
      {
        NoExpandedColumn noExpandedColumn = (NoExpandedColumn)theEObject;
        T result = caseNoExpandedColumn(noExpandedColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.RASUR:
      {
        Rasur rasur = (Rasur)theEObject;
        T result = caseRasur(rasur);
        if (result == null) result = caseBrackets(rasur);
        if (result == null) result = caseNoCartouche(rasur);
        if (result == null) result = caseNoDisputableReading(rasur);
        if (result == null) result = caseWordMiddle(rasur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_RASUR:
      {
        NoRasur noRasur = (NoRasur)theEObject;
        T result = caseNoRasur(noRasur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_ANCIENT_EXPANDED:
      {
        NoAncientExpanded noAncientExpanded = (NoAncientExpanded)theEObject;
        T result = caseNoAncientExpanded(noAncientExpanded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.RESTORATION_OVER_RASUR:
      {
        RestorationOverRasur restorationOverRasur = (RestorationOverRasur)theEObject;
        T result = caseRestorationOverRasur(restorationOverRasur);
        if (result == null) result = caseBrackets(restorationOverRasur);
        if (result == null) result = caseNoCartouche(restorationOverRasur);
        if (result == null) result = caseNoDisputableReading(restorationOverRasur);
        if (result == null) result = caseNoDeletion(restorationOverRasur);
        if (result == null) result = caseWordMiddle(restorationOverRasur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_RESTORATION_OVER_RASUR:
      {
        NoRestorationOverRasur noRestorationOverRasur = (NoRestorationOverRasur)theEObject;
        T result = caseNoRestorationOverRasur(noRestorationOverRasur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.PARTIAL_DESTRUCTION:
      {
        PartialDestruction partialDestruction = (PartialDestruction)theEObject;
        T result = casePartialDestruction(partialDestruction);
        if (result == null) result = caseBrackets(partialDestruction);
        if (result == null) result = caseNoCartouche(partialDestruction);
        if (result == null) result = caseNoDisputableReading(partialDestruction);
        if (result == null) result = caseNoDeletion(partialDestruction);
        if (result == null) result = caseNoExpandedColumn(partialDestruction);
        if (result == null) result = caseNoRasur(partialDestruction);
        if (result == null) result = caseNoAncientExpanded(partialDestruction);
        if (result == null) result = caseNoRestorationOverRasur(partialDestruction);
        if (result == null) result = caseWordMiddle(partialDestruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.NO_PARTIAL_DESTRUCTION:
      {
        NoPartialDestruction noPartialDestruction = (NoPartialDestruction)theEObject;
        T result = caseNoPartialDestruction(noPartialDestruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX:
      {
        Interfix interfix = (Interfix)theEObject;
        T result = caseInterfix(interfix);
        if (result == null) result = caseWordMiddle(interfix);
        if (result == null) result = caseNoCartouche(interfix);
        if (result == null) result = caseNoExpanded(interfix);
        if (result == null) result = caseNoEmendation(interfix);
        if (result == null) result = caseNoDisputableReading(interfix);
        if (result == null) result = caseNoLacuna(interfix);
        if (result == null) result = caseNoDeletion(interfix);
        if (result == null) result = caseNoExpandedColumn(interfix);
        if (result == null) result = caseNoRasur(interfix);
        if (result == null) result = caseNoAncientExpanded(interfix);
        if (result == null) result = caseNoRestorationOverRasur(interfix);
        if (result == null) result = caseNoPartialDestruction(interfix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX_LEXICAL:
      {
        InterfixLexical interfixLexical = (InterfixLexical)theEObject;
        T result = caseInterfixLexical(interfixLexical);
        if (result == null) result = caseInterfix(interfixLexical);
        if (result == null) result = caseWordMiddle(interfixLexical);
        if (result == null) result = caseNoCartouche(interfixLexical);
        if (result == null) result = caseNoExpanded(interfixLexical);
        if (result == null) result = caseNoEmendation(interfixLexical);
        if (result == null) result = caseNoDisputableReading(interfixLexical);
        if (result == null) result = caseNoLacuna(interfixLexical);
        if (result == null) result = caseNoDeletion(interfixLexical);
        if (result == null) result = caseNoExpandedColumn(interfixLexical);
        if (result == null) result = caseNoRasur(interfixLexical);
        if (result == null) result = caseNoAncientExpanded(interfixLexical);
        if (result == null) result = caseNoRestorationOverRasur(interfixLexical);
        if (result == null) result = caseNoPartialDestruction(interfixLexical);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX_FLEXION:
      {
        InterfixFlexion interfixFlexion = (InterfixFlexion)theEObject;
        T result = caseInterfixFlexion(interfixFlexion);
        if (result == null) result = caseInterfix(interfixFlexion);
        if (result == null) result = caseWordMiddle(interfixFlexion);
        if (result == null) result = caseNoCartouche(interfixFlexion);
        if (result == null) result = caseNoExpanded(interfixFlexion);
        if (result == null) result = caseNoEmendation(interfixFlexion);
        if (result == null) result = caseNoDisputableReading(interfixFlexion);
        if (result == null) result = caseNoLacuna(interfixFlexion);
        if (result == null) result = caseNoDeletion(interfixFlexion);
        if (result == null) result = caseNoExpandedColumn(interfixFlexion);
        if (result == null) result = caseNoRasur(interfixFlexion);
        if (result == null) result = caseNoAncientExpanded(interfixFlexion);
        if (result == null) result = caseNoRestorationOverRasur(interfixFlexion);
        if (result == null) result = caseNoPartialDestruction(interfixFlexion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX_SUFFIX_PRONOM_LEXICAL:
      {
        InterfixSuffixPronomLexical interfixSuffixPronomLexical = (InterfixSuffixPronomLexical)theEObject;
        T result = caseInterfixSuffixPronomLexical(interfixSuffixPronomLexical);
        if (result == null) result = caseInterfix(interfixSuffixPronomLexical);
        if (result == null) result = caseWordMiddle(interfixSuffixPronomLexical);
        if (result == null) result = caseNoCartouche(interfixSuffixPronomLexical);
        if (result == null) result = caseNoExpanded(interfixSuffixPronomLexical);
        if (result == null) result = caseNoEmendation(interfixSuffixPronomLexical);
        if (result == null) result = caseNoDisputableReading(interfixSuffixPronomLexical);
        if (result == null) result = caseNoLacuna(interfixSuffixPronomLexical);
        if (result == null) result = caseNoDeletion(interfixSuffixPronomLexical);
        if (result == null) result = caseNoExpandedColumn(interfixSuffixPronomLexical);
        if (result == null) result = caseNoRasur(interfixSuffixPronomLexical);
        if (result == null) result = caseNoAncientExpanded(interfixSuffixPronomLexical);
        if (result == null) result = caseNoRestorationOverRasur(interfixSuffixPronomLexical);
        if (result == null) result = caseNoPartialDestruction(interfixSuffixPronomLexical);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX_PREFIX_NON_LEXICAL:
      {
        InterfixPrefixNonLexical interfixPrefixNonLexical = (InterfixPrefixNonLexical)theEObject;
        T result = caseInterfixPrefixNonLexical(interfixPrefixNonLexical);
        if (result == null) result = caseInterfix(interfixPrefixNonLexical);
        if (result == null) result = caseWordMiddle(interfixPrefixNonLexical);
        if (result == null) result = caseNoCartouche(interfixPrefixNonLexical);
        if (result == null) result = caseNoExpanded(interfixPrefixNonLexical);
        if (result == null) result = caseNoEmendation(interfixPrefixNonLexical);
        if (result == null) result = caseNoDisputableReading(interfixPrefixNonLexical);
        if (result == null) result = caseNoLacuna(interfixPrefixNonLexical);
        if (result == null) result = caseNoDeletion(interfixPrefixNonLexical);
        if (result == null) result = caseNoExpandedColumn(interfixPrefixNonLexical);
        if (result == null) result = caseNoRasur(interfixPrefixNonLexical);
        if (result == null) result = caseNoAncientExpanded(interfixPrefixNonLexical);
        if (result == null) result = caseNoRestorationOverRasur(interfixPrefixNonLexical);
        if (result == null) result = caseNoPartialDestruction(interfixPrefixNonLexical);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX_PREFIX_LEXICAL:
      {
        InterfixPrefixLexical interfixPrefixLexical = (InterfixPrefixLexical)theEObject;
        T result = caseInterfixPrefixLexical(interfixPrefixLexical);
        if (result == null) result = caseInterfix(interfixPrefixLexical);
        if (result == null) result = caseWordMiddle(interfixPrefixLexical);
        if (result == null) result = caseNoCartouche(interfixPrefixLexical);
        if (result == null) result = caseNoExpanded(interfixPrefixLexical);
        if (result == null) result = caseNoEmendation(interfixPrefixLexical);
        if (result == null) result = caseNoDisputableReading(interfixPrefixLexical);
        if (result == null) result = caseNoLacuna(interfixPrefixLexical);
        if (result == null) result = caseNoDeletion(interfixPrefixLexical);
        if (result == null) result = caseNoExpandedColumn(interfixPrefixLexical);
        if (result == null) result = caseNoRasur(interfixPrefixLexical);
        if (result == null) result = caseNoAncientExpanded(interfixPrefixLexical);
        if (result == null) result = caseNoRestorationOverRasur(interfixPrefixLexical);
        if (result == null) result = caseNoPartialDestruction(interfixPrefixLexical);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX_CONNECTION_SYLLABIC_GROUP:
      {
        InterfixConnectionSyllabicGroup interfixConnectionSyllabicGroup = (InterfixConnectionSyllabicGroup)theEObject;
        T result = caseInterfixConnectionSyllabicGroup(interfixConnectionSyllabicGroup);
        if (result == null) result = caseInterfix(interfixConnectionSyllabicGroup);
        if (result == null) result = caseWordMiddle(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoCartouche(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoExpanded(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoEmendation(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoDisputableReading(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoLacuna(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoDeletion(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoExpandedColumn(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoRasur(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoAncientExpanded(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoRestorationOverRasur(interfixConnectionSyllabicGroup);
        if (result == null) result = caseNoPartialDestruction(interfixConnectionSyllabicGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX_COMPOUND_WORDS:
      {
        InterfixCompoundWords interfixCompoundWords = (InterfixCompoundWords)theEObject;
        T result = caseInterfixCompoundWords(interfixCompoundWords);
        if (result == null) result = caseInterfix(interfixCompoundWords);
        if (result == null) result = caseWordMiddle(interfixCompoundWords);
        if (result == null) result = caseNoCartouche(interfixCompoundWords);
        if (result == null) result = caseNoExpanded(interfixCompoundWords);
        if (result == null) result = caseNoEmendation(interfixCompoundWords);
        if (result == null) result = caseNoDisputableReading(interfixCompoundWords);
        if (result == null) result = caseNoLacuna(interfixCompoundWords);
        if (result == null) result = caseNoDeletion(interfixCompoundWords);
        if (result == null) result = caseNoExpandedColumn(interfixCompoundWords);
        if (result == null) result = caseNoRasur(interfixCompoundWords);
        if (result == null) result = caseNoAncientExpanded(interfixCompoundWords);
        if (result == null) result = caseNoRestorationOverRasur(interfixCompoundWords);
        if (result == null) result = caseNoPartialDestruction(interfixCompoundWords);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.INTERFIX_PHONETICAL_COMPLEMENT:
      {
        InterfixPhoneticalComplement interfixPhoneticalComplement = (InterfixPhoneticalComplement)theEObject;
        T result = caseInterfixPhoneticalComplement(interfixPhoneticalComplement);
        if (result == null) result = caseInterfix(interfixPhoneticalComplement);
        if (result == null) result = caseWordMiddle(interfixPhoneticalComplement);
        if (result == null) result = caseNoCartouche(interfixPhoneticalComplement);
        if (result == null) result = caseNoExpanded(interfixPhoneticalComplement);
        if (result == null) result = caseNoEmendation(interfixPhoneticalComplement);
        if (result == null) result = caseNoDisputableReading(interfixPhoneticalComplement);
        if (result == null) result = caseNoLacuna(interfixPhoneticalComplement);
        if (result == null) result = caseNoDeletion(interfixPhoneticalComplement);
        if (result == null) result = caseNoExpandedColumn(interfixPhoneticalComplement);
        if (result == null) result = caseNoRasur(interfixPhoneticalComplement);
        if (result == null) result = caseNoAncientExpanded(interfixPhoneticalComplement);
        if (result == null) result = caseNoRestorationOverRasur(interfixPhoneticalComplement);
        if (result == null) result = caseNoPartialDestruction(interfixPhoneticalComplement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.VERS_MARKER:
      {
        VersMarker versMarker = (VersMarker)theEObject;
        T result = caseVersMarker(versMarker);
        if (result == null) result = caseAbstractMarker(versMarker);
        if (result == null) result = caseSentenceItem(versMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(versMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.EMENDATION_VERS_MARKER:
      {
        EmendationVersMarker emendationVersMarker = (EmendationVersMarker)theEObject;
        T result = caseEmendationVersMarker(emendationVersMarker);
        if (result == null) result = caseVersMarker(emendationVersMarker);
        if (result == null) result = caseAbstractMarker(emendationVersMarker);
        if (result == null) result = caseSentenceItem(emendationVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(emendationVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DISPUTABLE_VERS_MARKER:
      {
        DisputableVersMarker disputableVersMarker = (DisputableVersMarker)theEObject;
        T result = caseDisputableVersMarker(disputableVersMarker);
        if (result == null) result = caseVersMarker(disputableVersMarker);
        if (result == null) result = caseAbstractMarker(disputableVersMarker);
        if (result == null) result = caseSentenceItem(disputableVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(disputableVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DISPUTABLE_DESTROYED_VERS_MARKER:
      {
        DisputableDestroyedVersMarker disputableDestroyedVersMarker = (DisputableDestroyedVersMarker)theEObject;
        T result = caseDisputableDestroyedVersMarker(disputableDestroyedVersMarker);
        if (result == null) result = caseVersMarker(disputableDestroyedVersMarker);
        if (result == null) result = caseAbstractMarker(disputableDestroyedVersMarker);
        if (result == null) result = caseSentenceItem(disputableDestroyedVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(disputableDestroyedVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DISPUTABLE_DELETED_VERS_MARKER:
      {
        DisputableDeletedVersMarker disputableDeletedVersMarker = (DisputableDeletedVersMarker)theEObject;
        T result = caseDisputableDeletedVersMarker(disputableDeletedVersMarker);
        if (result == null) result = caseVersMarker(disputableDeletedVersMarker);
        if (result == null) result = caseAbstractMarker(disputableDeletedVersMarker);
        if (result == null) result = caseSentenceItem(disputableDeletedVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(disputableDeletedVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DELETED_VERS_MARKER:
      {
        DeletedVersMarker deletedVersMarker = (DeletedVersMarker)theEObject;
        T result = caseDeletedVersMarker(deletedVersMarker);
        if (result == null) result = caseVersMarker(deletedVersMarker);
        if (result == null) result = caseAbstractMarker(deletedVersMarker);
        if (result == null) result = caseSentenceItem(deletedVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(deletedVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DELETED_DISPUTABLE_VERS_MARKER:
      {
        DeletedDisputableVersMarker deletedDisputableVersMarker = (DeletedDisputableVersMarker)theEObject;
        T result = caseDeletedDisputableVersMarker(deletedDisputableVersMarker);
        if (result == null) result = caseVersMarker(deletedDisputableVersMarker);
        if (result == null) result = caseAbstractMarker(deletedDisputableVersMarker);
        if (result == null) result = caseSentenceItem(deletedDisputableVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(deletedDisputableVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DELETED_DESTROYED_VERS_MARKER:
      {
        DeletedDestroyedVersMarker deletedDestroyedVersMarker = (DeletedDestroyedVersMarker)theEObject;
        T result = caseDeletedDestroyedVersMarker(deletedDestroyedVersMarker);
        if (result == null) result = caseVersMarker(deletedDestroyedVersMarker);
        if (result == null) result = caseAbstractMarker(deletedDestroyedVersMarker);
        if (result == null) result = caseSentenceItem(deletedDestroyedVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(deletedDestroyedVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DESTROYED_VERS_MARKER:
      {
        DestroyedVersMarker destroyedVersMarker = (DestroyedVersMarker)theEObject;
        T result = caseDestroyedVersMarker(destroyedVersMarker);
        if (result == null) result = caseVersMarker(destroyedVersMarker);
        if (result == null) result = caseAbstractMarker(destroyedVersMarker);
        if (result == null) result = caseSentenceItem(destroyedVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(destroyedVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DESTROYED_VERS_FRONTIER_MARKER:
      {
        DestroyedVersFrontierMarker destroyedVersFrontierMarker = (DestroyedVersFrontierMarker)theEObject;
        T result = caseDestroyedVersFrontierMarker(destroyedVersFrontierMarker);
        if (result == null) result = caseVersMarker(destroyedVersFrontierMarker);
        if (result == null) result = caseAbstractMarker(destroyedVersFrontierMarker);
        if (result == null) result = caseSentenceItem(destroyedVersFrontierMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(destroyedVersFrontierMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DESTROYED_DISPUTABLE_VERS_FRONTIER_MARKER:
      {
        DestroyedDisputableVersFrontierMarker destroyedDisputableVersFrontierMarker = (DestroyedDisputableVersFrontierMarker)theEObject;
        T result = caseDestroyedDisputableVersFrontierMarker(destroyedDisputableVersFrontierMarker);
        if (result == null) result = caseVersMarker(destroyedDisputableVersFrontierMarker);
        if (result == null) result = caseAbstractMarker(destroyedDisputableVersFrontierMarker);
        if (result == null) result = caseSentenceItem(destroyedDisputableVersFrontierMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(destroyedDisputableVersFrontierMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.DESTROYED_DELETED_VERS_MARKER:
      {
        DestroyedDeletedVersMarker destroyedDeletedVersMarker = (DestroyedDeletedVersMarker)theEObject;
        T result = caseDestroyedDeletedVersMarker(destroyedDeletedVersMarker);
        if (result == null) result = caseVersMarker(destroyedDeletedVersMarker);
        if (result == null) result = caseAbstractMarker(destroyedDeletedVersMarker);
        if (result == null) result = caseSentenceItem(destroyedDeletedVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(destroyedDeletedVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.PARTIAL_DESTROYED_VERS_MARKER:
      {
        PartialDestroyedVersMarker partialDestroyedVersMarker = (PartialDestroyedVersMarker)theEObject;
        T result = casePartialDestroyedVersMarker(partialDestroyedVersMarker);
        if (result == null) result = caseVersMarker(partialDestroyedVersMarker);
        if (result == null) result = caseAbstractMarker(partialDestroyedVersMarker);
        if (result == null) result = caseSentenceItem(partialDestroyedVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(partialDestroyedVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.PARTIAL_DESTROYED_DISPUTABLE_VERS_MARKER:
      {
        PartialDestroyedDisputableVersMarker partialDestroyedDisputableVersMarker = (PartialDestroyedDisputableVersMarker)theEObject;
        T result = casePartialDestroyedDisputableVersMarker(partialDestroyedDisputableVersMarker);
        if (result == null) result = caseVersMarker(partialDestroyedDisputableVersMarker);
        if (result == null) result = caseAbstractMarker(partialDestroyedDisputableVersMarker);
        if (result == null) result = caseSentenceItem(partialDestroyedDisputableVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(partialDestroyedDisputableVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.PARTIAL_DESTROYED_DELETED_VERS_MARKER:
      {
        PartialDestroyedDeletedVersMarker partialDestroyedDeletedVersMarker = (PartialDestroyedDeletedVersMarker)theEObject;
        T result = casePartialDestroyedDeletedVersMarker(partialDestroyedDeletedVersMarker);
        if (result == null) result = caseVersMarker(partialDestroyedDeletedVersMarker);
        if (result == null) result = caseAbstractMarker(partialDestroyedDeletedVersMarker);
        if (result == null) result = caseSentenceItem(partialDestroyedDeletedVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(partialDestroyedDeletedVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.MISSING_VERS_MARKER:
      {
        MissingVersMarker missingVersMarker = (MissingVersMarker)theEObject;
        T result = caseMissingVersMarker(missingVersMarker);
        if (result == null) result = caseVersMarker(missingVersMarker);
        if (result == null) result = caseAbstractMarker(missingVersMarker);
        if (result == null) result = caseSentenceItem(missingVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(missingVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.MISSING_DISPUTABLE_VERS_MARKER:
      {
        MissingDisputableVersMarker missingDisputableVersMarker = (MissingDisputableVersMarker)theEObject;
        T result = caseMissingDisputableVersMarker(missingDisputableVersMarker);
        if (result == null) result = caseVersMarker(missingDisputableVersMarker);
        if (result == null) result = caseAbstractMarker(missingDisputableVersMarker);
        if (result == null) result = caseSentenceItem(missingDisputableVersMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(missingDisputableVersMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.RESTORATION_OVER_RASUR_MARKER:
      {
        RestorationOverRasurMarker restorationOverRasurMarker = (RestorationOverRasurMarker)theEObject;
        T result = caseRestorationOverRasurMarker(restorationOverRasurMarker);
        if (result == null) result = caseVersMarker(restorationOverRasurMarker);
        if (result == null) result = caseAbstractMarker(restorationOverRasurMarker);
        if (result == null) result = caseSentenceItem(restorationOverRasurMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(restorationOverRasurMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.ANCIENT_EXPANDED_MARKER:
      {
        AncientExpandedMarker ancientExpandedMarker = (AncientExpandedMarker)theEObject;
        T result = caseAncientExpandedMarker(ancientExpandedMarker);
        if (result == null) result = caseRasurMarker(ancientExpandedMarker);
        if (result == null) result = caseVersMarker(ancientExpandedMarker);
        if (result == null) result = caseAbstractMarker(ancientExpandedMarker);
        if (result == null) result = caseSentenceItem(ancientExpandedMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(ancientExpandedMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.RASUR_MARKER:
      {
        RasurMarker rasurMarker = (RasurMarker)theEObject;
        T result = caseRasurMarker(rasurMarker);
        if (result == null) result = caseVersMarker(rasurMarker);
        if (result == null) result = caseAbstractMarker(rasurMarker);
        if (result == null) result = caseSentenceItem(rasurMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(rasurMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.VERS_FRONTIER_MARKER:
      {
        VersFrontierMarker versFrontierMarker = (VersFrontierMarker)theEObject;
        T result = caseVersFrontierMarker(versFrontierMarker);
        if (result == null) result = caseVersMarker(versFrontierMarker);
        if (result == null) result = caseAbstractMarker(versFrontierMarker);
        if (result == null) result = caseSentenceItem(versFrontierMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(versFrontierMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.VERSBREAK_MARKER:
      {
        VersbreakMarker versbreakMarker = (VersbreakMarker)theEObject;
        T result = caseVersbreakMarker(versbreakMarker);
        if (result == null) result = caseVersMarker(versbreakMarker);
        if (result == null) result = caseAbstractMarker(versbreakMarker);
        if (result == null) result = caseSentenceItem(versbreakMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(versbreakMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EgyDslPackage.BROKEN_VERSBREAK_MARKER:
      {
        BrokenVersbreakMarker brokenVersbreakMarker = (BrokenVersbreakMarker)theEObject;
        T result = caseBrokenVersbreakMarker(brokenVersbreakMarker);
        if (result == null) result = caseVersMarker(brokenVersbreakMarker);
        if (result == null) result = caseAbstractMarker(brokenVersbreakMarker);
        if (result == null) result = caseSentenceItem(brokenVersbreakMarker);
        if (result == null) result = caseSentenceItemNoAmbivalence(brokenVersbreakMarker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextContent(TextContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextItem(TextItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentence(Sentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentenceItem(SentenceItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMarker(AbstractMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ambivalence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ambivalence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAmbivalence(Ambivalence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence Item No Ambivalence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence Item No Ambivalence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentenceItemNoAmbivalence(SentenceItemNoAmbivalence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarker(Marker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destruction Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destruction Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestructionMarker(DestructionMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Word</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Word</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWord(Word object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Word Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Word Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWordPart(WordPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Word Middle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Word Middle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWordMiddle(WordMiddle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chars</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chars</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChars(Chars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Brackets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Brackets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBrackets(Brackets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Oval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Oval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOval(Oval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Serech</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Serech</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSerech(Serech object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cartouche</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cartouche</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCartouche(Cartouche object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Cartouche</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Cartouche</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoCartouche(NoCartouche object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expanded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expanded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpanded(Expanded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ancient Expanded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ancient Expanded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAncientExpanded(AncientExpanded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Expanded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Expanded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoExpanded(NoExpanded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Emendation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Emendation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmendation(Emendation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Emendation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Emendation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoEmendation(NoEmendation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disputable Reading</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disputable Reading</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisputableReading(DisputableReading object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Disputable Reading</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Disputable Reading</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoDisputableReading(NoDisputableReading object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lacuna</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lacuna</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLacuna(Lacuna object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Lacuna</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Lacuna</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoLacuna(NoLacuna object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deletion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deletion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeletion(Deletion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Deletion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Deletion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoDeletion(NoDeletion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expanded Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expanded Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpandedColumn(ExpandedColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Expanded Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Expanded Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoExpandedColumn(NoExpandedColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rasur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rasur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRasur(Rasur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Rasur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Rasur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoRasur(NoRasur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Ancient Expanded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Ancient Expanded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoAncientExpanded(NoAncientExpanded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restoration Over Rasur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restoration Over Rasur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestorationOverRasur(RestorationOverRasur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Restoration Over Rasur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Restoration Over Rasur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoRestorationOverRasur(NoRestorationOverRasur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partial Destruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partial Destruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartialDestruction(PartialDestruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Partial Destruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Partial Destruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoPartialDestruction(NoPartialDestruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfix(Interfix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix Lexical</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix Lexical</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfixLexical(InterfixLexical object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix Flexion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix Flexion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfixFlexion(InterfixFlexion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix Suffix Pronom Lexical</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix Suffix Pronom Lexical</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfixSuffixPronomLexical(InterfixSuffixPronomLexical object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix Prefix Non Lexical</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix Prefix Non Lexical</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfixPrefixNonLexical(InterfixPrefixNonLexical object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix Prefix Lexical</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix Prefix Lexical</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfixPrefixLexical(InterfixPrefixLexical object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix Connection Syllabic Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix Connection Syllabic Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfixConnectionSyllabicGroup(InterfixConnectionSyllabicGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix Compound Words</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix Compound Words</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfixCompoundWords(InterfixCompoundWords object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interfix Phonetical Complement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interfix Phonetical Complement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfixPhoneticalComplement(InterfixPhoneticalComplement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersMarker(VersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Emendation Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Emendation Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmendationVersMarker(EmendationVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disputable Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disputable Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisputableVersMarker(DisputableVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disputable Destroyed Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disputable Destroyed Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisputableDestroyedVersMarker(DisputableDestroyedVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disputable Deleted Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disputable Deleted Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisputableDeletedVersMarker(DisputableDeletedVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deleted Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deleted Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeletedVersMarker(DeletedVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deleted Disputable Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deleted Disputable Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeletedDisputableVersMarker(DeletedDisputableVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deleted Destroyed Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deleted Destroyed Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeletedDestroyedVersMarker(DeletedDestroyedVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destroyed Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destroyed Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestroyedVersMarker(DestroyedVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destroyed Vers Frontier Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destroyed Vers Frontier Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestroyedVersFrontierMarker(DestroyedVersFrontierMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destroyed Disputable Vers Frontier Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destroyed Disputable Vers Frontier Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestroyedDisputableVersFrontierMarker(DestroyedDisputableVersFrontierMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destroyed Deleted Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destroyed Deleted Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestroyedDeletedVersMarker(DestroyedDeletedVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partial Destroyed Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partial Destroyed Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartialDestroyedVersMarker(PartialDestroyedVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partial Destroyed Disputable Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partial Destroyed Disputable Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartialDestroyedDisputableVersMarker(PartialDestroyedDisputableVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partial Destroyed Deleted Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partial Destroyed Deleted Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartialDestroyedDeletedVersMarker(PartialDestroyedDeletedVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Missing Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Missing Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMissingVersMarker(MissingVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Missing Disputable Vers Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Missing Disputable Vers Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMissingDisputableVersMarker(MissingDisputableVersMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restoration Over Rasur Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restoration Over Rasur Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestorationOverRasurMarker(RestorationOverRasurMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ancient Expanded Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ancient Expanded Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAncientExpandedMarker(AncientExpandedMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rasur Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rasur Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRasurMarker(RasurMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vers Frontier Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vers Frontier Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersFrontierMarker(VersFrontierMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Versbreak Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Versbreak Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersbreakMarker(VersbreakMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Broken Versbreak Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Broken Versbreak Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBrokenVersbreakMarker(BrokenVersbreakMarker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EgyDslSwitch
