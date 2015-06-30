package org.bbaw.bts.corpus.text.egy.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Case;
import org.bbaw.bts.corpus.text.egy.egyDsl.Chars;
import org.bbaw.bts.corpus.text.egy.egyDsl.DeletedDestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DeletedDisputableVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Deletion;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedDeletedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedDisputableVersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableDeletedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableDestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.Emendation;
import org.bbaw.bts.corpus.text.egy.egyDsl.EmendationVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Expanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn;
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
import org.bbaw.bts.corpus.text.egy.egyDsl.MissingDisputableVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Oval;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedDeletedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedDisputableVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction;
import org.bbaw.bts.corpus.text.egy.egyDsl.Rasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Sentence;
import org.bbaw.bts.corpus.text.egy.egyDsl.Serech;
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
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_AncientExpanded(context, (AncientExpanded) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.ANCIENT_EXPANDED_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getAncientExpandedMarkerRule() ||
				   context == grammarAccess.getRasurMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_AncientExpandedMarker_RasurMarker(context, (AncientExpandedMarker) semanticObject); 
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
				   context == grammarAccess.getNoCartoucheRule() ||
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
			case EgyDslPackage.DELETED_DESTROYED_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDeletedDestroyedVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DeletedDestroyedVersMarker(context, (DeletedDestroyedVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DELETED_DISPUTABLE_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDeletedDisputableVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DeletedDisputableVersMarker(context, (DeletedDisputableVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DELETED_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDeletedVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DeletedVersMarker(context, (DeletedVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DELETION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getDeletionRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getNoRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Deletion(context, (Deletion) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DESTROYED_DELETED_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDestroyedDeletedVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DestroyedDeletedVersMarker(context, (DestroyedDeletedVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DESTROYED_DISPUTABLE_VERS_FRONTIER_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDestroyedDisputableVersFrontierMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DestroyedDisputableVersFrontierMarker(context, (DestroyedDisputableVersFrontierMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DESTROYED_VERS_FRONTIER_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDestroyedVersFrontierMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DestroyedVersFrontierMarker(context, (DestroyedVersFrontierMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DESTROYED_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDestroyedVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DestroyedVersMarker(context, (DestroyedVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DESTRUCTION_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDestructionMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule()) {
					sequence_DestructionMarker(context, (DestructionMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DISPUTABLE_DELETED_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDisputableDeletedVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DisputableDeletedVersMarker(context, (DisputableDeletedVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DISPUTABLE_DESTROYED_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDisputableDestroyedVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DisputableDestroyedVersMarker(context, (DisputableDestroyedVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DISPUTABLE_READING:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getDisputableReadingRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getNoRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_DisputableReading(context, (DisputableReading) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.DISPUTABLE_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getDisputableVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_DisputableVersMarker(context, (DisputableVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.EMENDATION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getEmendationRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getNoRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Emendation(context, (Emendation) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.EMENDATION_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getEmendationVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_EmendationVersMarker(context, (EmendationVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.EXPANDED:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getNoRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Brackets_Cartouche_Expanded(context, (Expanded) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCartoucheRule()) {
					sequence_Cartouche(context, (Expanded) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpandedRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoEmendationRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoRasurRule()) {
					sequence_Expanded(context, (Expanded) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.EXPANDED_COLUMN:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getExpandedColumnRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_ExpandedColumn(context, (ExpandedColumn) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_COMPOUND_WORDS:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixCompoundWordsRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
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
					sequence_InterfixCompoundWords(context, (InterfixCompoundWords) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_CONNECTION_SYLLABIC_GROUP:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixConnectionSyllabicGroupRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
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
					sequence_InterfixConnectionSyllabicGroup(context, (InterfixConnectionSyllabicGroup) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_FLEXION:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixFlexionRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
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
					sequence_InterfixFlexion(context, (InterfixFlexion) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixLexicalRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
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
					sequence_InterfixLexical(context, (InterfixLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_PHONETICAL_COMPLEMENT:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixPhoneticalComplementRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
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
					sequence_InterfixPhoneticalComplement(context, (InterfixPhoneticalComplement) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_PREFIX_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixPrefixLexicalRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
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
					sequence_InterfixPrefixLexical(context, (InterfixPrefixLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_PREFIX_NON_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixPrefixNonLexicalRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
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
					sequence_InterfixPrefixNonLexical(context, (InterfixPrefixNonLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.INTERFIX_SUFFIX_PRONOM_LEXICAL:
				if(context == grammarAccess.getInterfixRule() ||
				   context == grammarAccess.getInterfixSuffixPronomLexicalRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
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
					sequence_InterfixSuffixPronomLexical(context, (InterfixSuffixPronomLexical) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.LACUNA:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getLacunaRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getNoRestorationOverRasurRule() ||
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
			case EgyDslPackage.MISSING_DISPUTABLE_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getMissingDisputableVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_MissingDisputableVersMarker(context, (MissingDisputableVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.MISSING_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getMissingVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_MissingVersMarker(context, (MissingVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.OVAL:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getOvalRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Oval(context, (Oval) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.PARTIAL_DESTROYED_DELETED_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getPartialDestroyedDeletedVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_PartialDestroyedDeletedVersMarker(context, (PartialDestroyedDeletedVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.PARTIAL_DESTROYED_DISPUTABLE_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getPartialDestroyedDisputableVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_PartialDestroyedDisputableVersMarker(context, (PartialDestroyedDisputableVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.PARTIAL_DESTROYED_VERS_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getPartialDestroyedVersMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_PartialDestroyedVersMarker(context, (PartialDestroyedVersMarker) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.PARTIAL_DESTRUCTION:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getNoAncientExpandedRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getNoExpandedColumnRule() ||
				   context == grammarAccess.getNoRasurRule() ||
				   context == grammarAccess.getNoRestorationOverRasurRule() ||
				   context == grammarAccess.getPartialDestructionRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_PartialDestruction(context, (PartialDestruction) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.RASUR:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Rasur(context, (Rasur) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.RESTORATION_OVER_RASUR:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getNoCartoucheRule() ||
				   context == grammarAccess.getNoDeletionRule() ||
				   context == grammarAccess.getNoDisputableReadingRule() ||
				   context == grammarAccess.getRestorationOverRasurRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_RestorationOverRasur(context, (RestorationOverRasur) semanticObject); 
					return; 
				}
				else break;
			case EgyDslPackage.RESTORATION_OVER_RASUR_MARKER:
				if(context == grammarAccess.getAbstractMarkerRule() ||
				   context == grammarAccess.getRestorationOverRasurMarkerRule() ||
				   context == grammarAccess.getSentenceItemRule() ||
				   context == grammarAccess.getSentenceItemNoAmbivalenceRule() ||
				   context == grammarAccess.getVersMarkerRule()) {
					sequence_RestorationOverRasurMarker(context, (RestorationOverRasurMarker) semanticObject); 
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
			case EgyDslPackage.SERECH:
				if(context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getNoLacunaRule() ||
				   context == grammarAccess.getNoPartialDestructionRule() ||
				   context == grammarAccess.getSerechRule() ||
				   context == grammarAccess.getWordMiddleRule()) {
					sequence_Serech(context, (Serech) semanticObject); 
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
	 *     {AncientExpandedMarker}
	 */
	protected void sequence_AncientExpandedMarker_RasurMarker(EObject context, AncientExpandedMarker semanticObject) {
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
	 *     (wChar+=NoExpanded+ | wChar+=NoCartouche+)
	 */
	protected void sequence_Brackets_Cartouche_Expanded(EObject context, Expanded semanticObject) {
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
	 *     wChar+=NoCartouche+
	 */
	protected void sequence_Cartouche(EObject context, Expanded semanticObject) {
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
	 *     {DeletedDestroyedVersMarker}
	 */
	protected void sequence_DeletedDestroyedVersMarker(EObject context, DeletedDestroyedVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DeletedDisputableVersMarker}
	 */
	protected void sequence_DeletedDisputableVersMarker(EObject context, DeletedDisputableVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DeletedVersMarker}
	 */
	protected void sequence_DeletedVersMarker(EObject context, DeletedVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     {DestroyedDeletedVersMarker}
	 */
	protected void sequence_DestroyedDeletedVersMarker(EObject context, DestroyedDeletedVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DestroyedDisputableVersFrontierMarker}
	 */
	protected void sequence_DestroyedDisputableVersFrontierMarker(EObject context, DestroyedDisputableVersFrontierMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DestroyedVersFrontierMarker}
	 */
	protected void sequence_DestroyedVersFrontierMarker(EObject context, DestroyedVersFrontierMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DestroyedVersMarker}
	 */
	protected void sequence_DestroyedVersMarker(EObject context, DestroyedVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=BETWEEN_MINUS
	 */
	protected void sequence_DestructionMarker(EObject context, DestructionMarker semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.DESTRUCTION_MARKER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.DESTRUCTION_MARKER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDestructionMarkerAccess().getTypeBETWEEN_MINUSTerminalRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {DisputableDeletedVersMarker}
	 */
	protected void sequence_DisputableDeletedVersMarker(EObject context, DisputableDeletedVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DisputableDestroyedVersMarker}
	 */
	protected void sequence_DisputableDestroyedVersMarker(EObject context, DisputableDestroyedVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     {DisputableVersMarker}
	 */
	protected void sequence_DisputableVersMarker(EObject context, DisputableVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EmendationVersMarker}
	 */
	protected void sequence_EmendationVersMarker(EObject context, EmendationVersMarker semanticObject) {
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
	 *     {InterfixCompoundWords}
	 */
	protected void sequence_InterfixCompoundWords(EObject context, InterfixCompoundWords semanticObject) {
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
	 *     {InterfixPhoneticalComplement}
	 */
	protected void sequence_InterfixPhoneticalComplement(EObject context, InterfixPhoneticalComplement semanticObject) {
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
	 *     {MissingDisputableVersMarker}
	 */
	protected void sequence_MissingDisputableVersMarker(EObject context, MissingDisputableVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MissingVersMarker}
	 */
	protected void sequence_MissingVersMarker(EObject context, MissingVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoCartouche+
	 */
	protected void sequence_Oval(EObject context, Oval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PartialDestroyedDeletedVersMarker}
	 */
	protected void sequence_PartialDestroyedDeletedVersMarker(EObject context, PartialDestroyedDeletedVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PartialDestroyedDisputableVersMarker}
	 */
	protected void sequence_PartialDestroyedDisputableVersMarker(EObject context, PartialDestroyedDisputableVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PartialDestroyedVersMarker}
	 */
	protected void sequence_PartialDestroyedVersMarker(EObject context, PartialDestroyedVersMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     wChar+=NoRasur+
	 */
	protected void sequence_Rasur(EObject context, Rasur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RestorationOverRasurMarker}
	 */
	protected void sequence_RestorationOverRasurMarker(EObject context, RestorationOverRasurMarker semanticObject) {
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
	 *     ((items+=SentenceItem items+=SentenceItem*)?)
	 */
	protected void sequence_Sentence(EObject context, Sentence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=NoCartouche+
	 */
	protected void sequence_Serech(EObject context, Serech semanticObject) {
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
	 *     wChar=WordMiddle
	 */
	protected void sequence_WordPart(EObject context, WordPart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EgyDslPackage.Literals.WORD_PART__WCHAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EgyDslPackage.Literals.WORD_PART__WCHAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_0(), semanticObject.getWChar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     wChar+=WordPart+
	 */
	protected void sequence_Word(EObject context, Word semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
