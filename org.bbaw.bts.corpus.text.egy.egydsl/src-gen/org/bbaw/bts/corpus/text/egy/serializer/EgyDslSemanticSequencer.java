package org.bbaw.bts.corpus.text.egy.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Case;
import org.bbaw.bts.corpus.text.egy.egyDsl.Chars;
import org.bbaw.bts.corpus.text.egy.egyDsl.Deletion;
import org.bbaw.bts.corpus.text.egy.egyDsl.Destruction;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading;
import org.bbaw.bts.corpus.text.egy.egyDsl.DualEnding;
import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.Emendation;
import org.bbaw.bts.corpus.text.egy.egyDsl.Ending;
import org.bbaw.bts.corpus.text.egy.egyDsl.Expanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexicalEnding;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna;
import org.bbaw.bts.corpus.text.egy.egyDsl.Marker;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction;
import org.bbaw.bts.corpus.text.egy.egyDsl.PluralEnding;
import org.bbaw.bts.corpus.text.egy.egyDsl.Rasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.Sentence;
import org.bbaw.bts.corpus.text.egy.egyDsl.SuffixChars;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.bbaw.bts.corpus.text.egy.egyDsl.WordPart;
import org.bbaw.bts.corpus.text.egy.services.EgyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EgyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EgyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EgyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EgyDslPackage.AMBIVALENCE:
				if(context == grammarAccess.getAmbivalenceRule() ||
				   context == grammarAccess.getSentenceItemRule()) {
					sequence_Ambivalence(context, (Ambivalence) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.ANCIENT_EXPANDED:
				if(context == grammarAccess.getAncientExpandedRule() ||
				   context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_AncientExpanded(context, (AncientExpanded) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.BROKEN_VERSBREAK_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getBrokenVersbreakMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_BrokenVersbreakMarker(context, (BrokenVersbreakMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.CASE:
				if(context == grammarAccess.getCaseRule()) {
					sequence_Case(context, (Case) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.CHARS:
				if(context == grammarAccess.getCharsRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getNoRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Chars(context, (Chars) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DELETION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getDeletionRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Deletion(context, (Deletion) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DESTRUCTION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getDestructionRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Destruction(context, (Destruction) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DISPUTABLE_READING:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getDisputableReadingRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_DisputableReading(context, (DisputableReading) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DUAL_ENDING:
				if(context == grammarAccess.getDualEndingRule() ||
				   context == grammarAccess.getWordEndingRule()) {
					sequence_DualEnding(context, (DualEnding) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.EMENDATION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getEmendationRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Emendation(context, (Emendation) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.ENDING:
				if(context == grammarAccess.getEndingRule() ||
				   context == grammarAccess.getWordEndingRule()) {
					sequence_Ending(context, (Ending) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.EXPANDED:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getExpandedRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getNoRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Expanded(context, (Expanded) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.EXPANDED_COLUMN:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getExpandedColumnRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_ExpandedColumn(context, (ExpandedColumn) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_CONNECTION_SYLLABIC_GROUP:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixConnectionSyllabicGroupRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule()) {
					sequence_InterfixConnectionSyllabicGroup(context, (InterfixConnectionSyllabicGroup) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_FLEXION:
				if(context == grammarAccess.getInterfixFlexionRule()) {
					sequence_InterfixFlexion(context, (InterfixFlexion) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_FLEXION_EDING:
				if(context == grammarAccess.getInterfixFlexionEdingRule()) {
					sequence_InterfixFlexionEding(context, (InterfixFlexionEding) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_LEXICAL:
				if(context == grammarAccess.getInterfixLexicalRule()) {
					sequence_InterfixLexical(context, (InterfixLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_LEXICAL_ENDING:
				if(context == grammarAccess.getInterfixLexicalEndingRule()) {
					sequence_InterfixLexicalEnding(context, (InterfixLexicalEnding) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_PREFIX_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixPrefixLexicalRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule()) {
					sequence_InterfixPrefixLexical(context, (InterfixPrefixLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_PREFIX_NON_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixPrefixNonLexicalRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule()) {
					sequence_InterfixPrefixNonLexical(context, (InterfixPrefixNonLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_SUFFIX_PRONOM_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixSuffixPronomLexicalRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule()) {
					sequence_InterfixSuffixPronomLexical(context, (InterfixSuffixPronomLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.LACUNA:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getLacunaRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Lacuna(context, (Lacuna) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule()) {
					sequence_Marker(context, (Marker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.PARTIAL_DESTRUCTION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getPartialDestructionRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_PartialDestruction(context, (PartialDestruction) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.PLURAL_ENDING:
				if(context == grammarAccess.getPluralEndingRule() ||
				   context == grammarAccess.getWordEndingRule()) {
					sequence_PluralEnding(context, (PluralEnding) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.RASUR:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Rasur(context, (Rasur) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.RESTORATION_OVER_RASUR:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_RestorationOverRasur(context, (RestorationOverRasur) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.SENTENCE:
				if(context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getTextItemRule()) {
					sequence_Sentence(context, (Sentence) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.SUFFIX_CHARS:
				if(context == grammarAccess.getSuffixCharsRule()) {
					sequence_SuffixChars(context, (SuffixChars) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.TEXT_CONTENT:
				if(context == grammarAccess.getTextContentRule()) {
					sequence_TextContent(context, (TextContent) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.VERS_FRONTIER_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersFrontierMarkerRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_VersFrontierMarker(context, (VersFrontierMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.VERSBREAK_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule() ||
				   context == grammarAccess.getVersbreakMarkerRule()) {
					sequence_VersbreakMarker(context, (VersbreakMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.WORD:
				if(context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getWordRule()) {
					sequence_Word(context, (Word) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.WORD_PART:
				if(context == grammarAccess.getWordPartRule()) {
					sequence_WordPart(context, (WordPart) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (cases+=Case cases+=Case+)
	 */
	protected void sequence_Ambivalence(EObject context, Ambivalence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoAncientExpanded+
	 */
	protected void sequence_AncientExpanded(EObject context, AncientExpanded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BrokenVersbreakMarker}
	 */
	protected void sequence_BrokenVersbreakMarker(EObject context, BrokenVersbreakMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CASESTRING items+=SentenceItemNoAmbivalence items+=SentenceItemNoAmbivalence*)
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EGYSTRING
	 */
	protected void sequence_Chars(EObject context, Chars semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.CHARS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.CHARS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoDeletion+
	 */
	protected void sequence_Deletion(EObject context, Deletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     comment=EGYSTRING
	 */
	protected void sequence_Destruction(EObject context, Destruction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.DESTRUCTION__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.DESTRUCTION__COMMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDestructionAccess().getCommentEGYSTRINGTerminalRuleCall_2_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoDisputableReading+
	 */
	protected void sequence_DisputableReading(EObject context, DisputableReading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (chars=DUALSTRING_COMMA | chars=DUALSTRING_DOT)
	 */
	protected void sequence_DualEnding(EObject context, DualEnding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoEmendation+
	 */
	protected void sequence_Emendation(EObject context, Emendation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     chars=SuffixChars
	 */
	protected void sequence_Ending(EObject context, Ending semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.ENDING__CHARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.ENDING__CHARS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEndingAccess().getCharsSuffixCharsParserRuleCall_0(), semanticObject.getChars());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoExpandedColumn+
	 */
	protected void sequence_ExpandedColumn(EObject context, ExpandedColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoExpanded+
	 */
	protected void sequence_Expanded(EObject context, Expanded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InterfixConnectionSyllabicGroup}
	 */
	protected void sequence_InterfixConnectionSyllabicGroup(EObject context, InterfixConnectionSyllabicGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interfix=InterfixFlexion chars=SuffixChars)
	 */
	protected void sequence_InterfixFlexionEding(EObject context, InterfixFlexionEding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.INTERFIX_FLEXION_EDING__INTERFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.INTERFIX_FLEXION_EDING__INTERFIX));
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.INTERFIX_FLEXION_EDING__CHARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.INTERFIX_FLEXION_EDING__CHARS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterfixFlexionEdingAccess().getInterfixInterfixFlexionParserRuleCall_0_0(), semanticObject.getInterfix());
		feeder.accept(grammarAccess.getInterfixFlexionEdingAccess().getCharsSuffixCharsParserRuleCall_1_0(), semanticObject.getChars());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {InterfixFlexion}
	 */
	protected void sequence_InterfixFlexion(EObject context, InterfixFlexion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interfix=InterfixLexical chars=SuffixChars)
	 */
	protected void sequence_InterfixLexicalEnding(EObject context, InterfixLexicalEnding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.INTERFIX_LEXICAL_ENDING__INTERFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.INTERFIX_LEXICAL_ENDING__INTERFIX));
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.INTERFIX_LEXICAL_ENDING__CHARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.INTERFIX_LEXICAL_ENDING__CHARS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterfixLexicalEndingAccess().getInterfixInterfixLexicalParserRuleCall_0_0(), semanticObject.getInterfix());
		feeder.accept(grammarAccess.getInterfixLexicalEndingAccess().getCharsSuffixCharsParserRuleCall_1_0(), semanticObject.getChars());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {InterfixLexical}
	 */
	protected void sequence_InterfixLexical(EObject context, InterfixLexical semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InterfixPrefixLexical}
	 */
	protected void sequence_InterfixPrefixLexical(EObject context, InterfixPrefixLexical semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InterfixPrefixNonLexical}
	 */
	protected void sequence_InterfixPrefixNonLexical(EObject context, InterfixPrefixNonLexical semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InterfixSuffixPronomLexical}
	 */
	protected void sequence_InterfixSuffixPronomLexical(EObject context, InterfixSuffixPronomLexical semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoLacuna+
	 */
	protected void sequence_Lacuna(EObject context, Lacuna semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=BETWEEN_HASHES
	 */
	protected void sequence_Marker(EObject context, Marker semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.MARKER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.MARKER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarkerAccess().getTypeBETWEEN_HASHESTerminalRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoPartialDestruction+
	 */
	protected void sequence_PartialDestruction(EObject context, PartialDestruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (chars=PLURALSTRING_COMMA | chars=PLURALSTRING_DOT)
	 */
	protected void sequence_PluralEnding(EObject context, PluralEnding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoRasur+
	 */
	protected void sequence_Rasur(EObject context, Rasur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoRestorationOverRasur+
	 */
	protected void sequence_RestorationOverRasur(EObject context, RestorationOverRasur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=SentenceItem items+=SentenceItem*)
	 */
	protected void sequence_Sentence(EObject context, Sentence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SUFFIXSTRING
	 */
	protected void sequence_SuffixChars(EObject context, SuffixChars semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.SUFFIX_CHARS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.SUFFIX_CHARS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSuffixCharsAccess().getNameSUFFIXSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (items+=TextItem items+=TextItem*)
	 */
	protected void sequence_TextContent(EObject context, TextContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VersFrontierMarker}
	 */
	protected void sequence_VersFrontierMarker(EObject context, VersFrontierMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VersbreakMarker}
	 */
	protected void sequence_VersbreakMarker(EObject context, VersbreakMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (wChar+=WordMiddle wChar+=WordMiddle* wChar+=WordEnding? wChar+=WordEnding?)
	 */
	protected void sequence_WordPart(EObject context, WordPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (wChar+=WordPart wChar+=WordPart*)
	 */
	protected void sequence_Word(EObject context, Word semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
