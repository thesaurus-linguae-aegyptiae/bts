package org.bbaw.bts.corpus.text.egy.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.bbaw.bts.corpus.text.egy.services.EgyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EgyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EgyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Ambivalence_NEWLINETerminalRuleCall_1_1_1_q;
	protected AbstractElementAlias match_Case_NEWLINETerminalRuleCall_1_q;
	protected AbstractElementAlias match_Case_NEWLINETerminalRuleCall_2_1_1_q;
	protected AbstractElementAlias match_Sentence_NEWLINETerminalRuleCall_2_1_1_q;
	protected AbstractElementAlias match_TextContent___NEWLINETerminalRuleCall_1_1_0_1_or_SpaceKeyword_1_1_0_0__q;
	protected AbstractElementAlias match_WordPart_EqualsSignKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EgyDslGrammarAccess) access;
		match_Ambivalence_NEWLINETerminalRuleCall_1_1_1_q = new TokenAlias(false, true, grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1());
		match_Case_NEWLINETerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_1());
		match_Case_NEWLINETerminalRuleCall_2_1_1_q = new TokenAlias(false, true, grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_2_1_1());
		match_Sentence_NEWLINETerminalRuleCall_2_1_1_q = new TokenAlias(false, true, grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_2_1_1());
		match_TextContent___NEWLINETerminalRuleCall_1_1_0_1_or_SpaceKeyword_1_1_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()), new TokenAlias(false, false, grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()));
		match_WordPart_EqualsSignKeyword_0_q = new TokenAlias(false, true, grammarAccess.getWordPartAccess().getEqualsSignKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NEWLINE returns ecore::EString :
	 *     ('\r'|'\n'|'\t')+;
	 */
	protected String getNEWLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Ambivalence_NEWLINETerminalRuleCall_1_1_1_q.equals(syntax))
				emit_Ambivalence_NEWLINETerminalRuleCall_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Case_NEWLINETerminalRuleCall_1_q.equals(syntax))
				emit_Case_NEWLINETerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Case_NEWLINETerminalRuleCall_2_1_1_q.equals(syntax))
				emit_Case_NEWLINETerminalRuleCall_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Sentence_NEWLINETerminalRuleCall_2_1_1_q.equals(syntax))
				emit_Sentence_NEWLINETerminalRuleCall_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TextContent___NEWLINETerminalRuleCall_1_1_0_1_or_SpaceKeyword_1_1_0_0__q.equals(syntax))
				emit_TextContent___NEWLINETerminalRuleCall_1_1_0_1_or_SpaceKeyword_1_1_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WordPart_EqualsSignKeyword_0_q.equals(syntax))
				emit_WordPart_EqualsSignKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     NEWLINE?
	 */
	protected void emit_Ambivalence_NEWLINETerminalRuleCall_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NEWLINE?
	 */
	protected void emit_Case_NEWLINETerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NEWLINE?
	 */
	protected void emit_Case_NEWLINETerminalRuleCall_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NEWLINE?
	 */
	protected void emit_Sentence_NEWLINETerminalRuleCall_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (NEWLINE | ' ')?
	 */
	protected void emit_TextContent___NEWLINETerminalRuleCall_1_1_0_1_or_SpaceKeyword_1_1_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='?
	 */
	protected void emit_WordPart_EqualsSignKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
