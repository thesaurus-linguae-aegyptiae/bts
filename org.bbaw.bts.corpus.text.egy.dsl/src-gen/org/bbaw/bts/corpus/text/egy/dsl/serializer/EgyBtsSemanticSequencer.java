package org.bbaw.bts.corpus.text.egy.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.AncientExpanded;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Chars;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Deletion;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Destruction;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.DisputableReading;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.EgyBtsPackage;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Emendation;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Expanded;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.ExpandedColumn;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixCompountWords;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixConnectionSyllabicGroup;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixFlexion;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixLexical;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixLexical;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixPrefixNonLexical;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.InterfixSuffixPronomLexical;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Lacuna;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Marker;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.PartialDestruction;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Rasur;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.RestorationOverRasur;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Sentence;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.TextContent;
import org.bbaw.bts.corpus.text.egy.dsl.egyBts.Word;
import org.bbaw.bts.corpus.text.egy.dsl.services.EgyBtsGrammarAccess;
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
public class EgyBtsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EgyBtsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EgyBtsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EgyBtsPackage.ANCIENT_EXPANDED:
				if(context == grammarAccess.getAncientExpandedRule() ||
				   context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_AncientExpanded(context, (AncientExpanded) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.CHARS:
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
			case EgyBtsPackage.DELETION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getDeletionRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Deletion(context, (Deletion) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.DESTRUCTION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getDestructionRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Destruction(context, (Destruction) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.DISPUTABLE_READING:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_DisputableReading(context, (DisputableReading) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.EMENDATION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getEmendationRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Emendation(context, (Emendation) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.EXPANDED:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getExpandedRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Expanded(context, (Expanded) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.EXPANDED_COLUMN:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getExpandedColumnRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_ExpandedColumn(context, (ExpandedColumn) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.INTERFIX_COMPOUNT_WORDS:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixCompountWordsRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_InterfixCompountWords(context, (InterfixCompountWords) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.INTERFIX_CONNECTION_SYLLABIC_GROUP:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixConnectionSyllabicGroupRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_InterfixConnectionSyllabicGroup(context, (InterfixConnectionSyllabicGroup) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.INTERFIX_FLEXION:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixFlexionRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_InterfixFlexion(context, (InterfixFlexion) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.INTERFIX_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixLexicalRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_InterfixLexical(context, (InterfixLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.INTERFIX_PREFIX_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixPrefixLexicalRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_InterfixPrefixLexical(context, (InterfixPrefixLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.INTERFIX_PREFIX_NON_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixPrefixNonLexicalRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_InterfixPrefixNonLexical(context, (InterfixPrefixNonLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.INTERFIX_SUFFIX_PRONOM_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixSuffixPronomLexicalRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_InterfixSuffixPronomLexical(context, (InterfixSuffixPronomLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.LACUNA:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getLacunaRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Lacuna(context, (Lacuna) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.MARKER:
				if(context == grammarAccess.getMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule()) {
					sequence_Marker(context, (Marker) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.PARTIAL_DESTRUCTION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getPartialDestructionRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_PartialDestruction(context, (PartialDestruction) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.RASUR:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Rasur(context, (Rasur) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.RESTORATION_OVER_RASUR:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_RestorationOverRasur(context, (RestorationOverRasur) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.SENTENCE:
				if(context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getTextItemRule()) {
					sequence_Sentence(context, (Sentence) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.TEXT_CONTENT:
				if(context == grammarAccess.getTextContentRule()) {
					sequence_TextContent(context, (TextContent) semanticObject); 
					return; 
				}
				else break;
			case EgyBtsPackage.WORD:
				if(context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getWordRule()) {
					sequence_Word(context, (Word) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     wChar+=NoAncientExpanded
	 */
	protected void sequence_AncientExpanded(EObject context, AncientExpanded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EGYSTRING
	 */
	protected void sequence_Chars(EObject context, Chars semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyBtsPackage.Literals.CHARS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyBtsPackage.Literals.CHARS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoDeletion
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
			if(transientValues.isValueTransient(semanticObject, EgyBtsPackage.Literals.DESTRUCTION__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyBtsPackage.Literals.DESTRUCTION__COMMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDestructionAccess().getCommentEGYSTRINGTerminalRuleCall_2_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (wChar+=NoDisputableReading*)
	 */
	protected void sequence_DisputableReading(EObject context, DisputableReading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (wChar+=NoEmendation*)
	 */
	protected void sequence_Emendation(EObject context, Emendation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoExpandedColumn
	 */
	protected void sequence_ExpandedColumn(EObject context, ExpandedColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (wChar+=NoExpanded*)
	 */
	protected void sequence_Expanded(EObject context, Expanded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InterfixCompountWords}
	 */
	protected void sequence_InterfixCompountWords(EObject context, InterfixCompountWords semanticObject) {
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
	 *     {InterfixFlexion}
	 */
	protected void sequence_InterfixFlexion(EObject context, InterfixFlexion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (wChar+=NoLacuna*)
	 */
	protected void sequence_Lacuna(EObject context, Lacuna semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID name=EGYSTRING)
	 */
	protected void sequence_Marker(EObject context, Marker semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyBtsPackage.Literals.MARKER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyBtsPackage.Literals.MARKER__TYPE));
			if(transientValues.isValueTransient(semanticObject, EgyBtsPackage.Literals.MARKER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyBtsPackage.Literals.MARKER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarkerAccess().getTypeIDTerminalRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getMarkerAccess().getNameEGYSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoPartialDestruction
	 */
	protected void sequence_PartialDestruction(EObject context, PartialDestruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoRasur
	 */
	protected void sequence_Rasur(EObject context, Rasur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoRestorationOverRasur
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
	 *     (items+=TextItem items+=TextItem*)
	 */
	protected void sequence_TextContent(EObject context, TextContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (wChar+=WordMiddle*)
	 */
	protected void sequence_Word(EObject context, Word semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
