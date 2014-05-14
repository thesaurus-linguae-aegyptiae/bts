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
	protected AbstractElementAlias match_Ambivalence___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q;
	protected AbstractElementAlias match_Case___Control0009Keyword_3_1_or_Control000aKeyword_3_0__q;
	protected AbstractElementAlias match_Case___Control0009Keyword_4_1_1_1_or_Control000aKeyword_4_1_1_0__q;
	protected AbstractElementAlias match_Marker___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q;
	protected AbstractElementAlias match_SentenceItem___Control0009Keyword_0_1_1_or_Control000aKeyword_0_1_0__q;
	protected AbstractElementAlias match_SentenceItem___Control0009Keyword_1_1_1_or_Control000aKeyword_1_1_0__q;
	protected AbstractElementAlias match_SentenceItem___Control0009Keyword_2_1_1_or_Control000aKeyword_2_1_0__q;
	protected AbstractElementAlias match_TextContent___Control000aKeyword_1_1_0_1_or_SpaceKeyword_1_1_0_0__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EgyDslGrammarAccess) access;
		match_Ambivalence___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getAmbivalenceAccess().getControl0009Keyword_1_1_1_1()), new TokenAlias(false, false, grammarAccess.getAmbivalenceAccess().getControl000aKeyword_1_1_1_0()));
		match_Case___Control0009Keyword_3_1_or_Control000aKeyword_3_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getCaseAccess().getControl0009Keyword_3_1()), new TokenAlias(false, false, grammarAccess.getCaseAccess().getControl000aKeyword_3_0()));
		match_Case___Control0009Keyword_4_1_1_1_or_Control000aKeyword_4_1_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getCaseAccess().getControl0009Keyword_4_1_1_1()), new TokenAlias(false, false, grammarAccess.getCaseAccess().getControl000aKeyword_4_1_1_0()));
		match_Marker___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getMarkerAccess().getControl0009Keyword_1_1_1_1()), new TokenAlias(false, false, grammarAccess.getMarkerAccess().getControl000aKeyword_1_1_1_0()));
		match_SentenceItem___Control0009Keyword_0_1_1_or_Control000aKeyword_0_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSentenceItemAccess().getControl0009Keyword_0_1_1()), new TokenAlias(false, false, grammarAccess.getSentenceItemAccess().getControl000aKeyword_0_1_0()));
		match_SentenceItem___Control0009Keyword_1_1_1_or_Control000aKeyword_1_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSentenceItemAccess().getControl0009Keyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getSentenceItemAccess().getControl000aKeyword_1_1_0()));
		match_SentenceItem___Control0009Keyword_2_1_1_or_Control000aKeyword_2_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSentenceItemAccess().getControl0009Keyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getSentenceItemAccess().getControl000aKeyword_2_1_0()));
		match_TextContent___Control000aKeyword_1_1_0_1_or_SpaceKeyword_1_1_0_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getTextContentAccess().getControl000aKeyword_1_1_0_1()), new TokenAlias(false, false, grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Ambivalence___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q.equals(syntax))
				emit_Ambivalence___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Case___Control0009Keyword_3_1_or_Control000aKeyword_3_0__q.equals(syntax))
				emit_Case___Control0009Keyword_3_1_or_Control000aKeyword_3_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Case___Control0009Keyword_4_1_1_1_or_Control000aKeyword_4_1_1_0__q.equals(syntax))
				emit_Case___Control0009Keyword_4_1_1_1_or_Control000aKeyword_4_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Marker___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q.equals(syntax))
				emit_Marker___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SentenceItem___Control0009Keyword_0_1_1_or_Control000aKeyword_0_1_0__q.equals(syntax))
				emit_SentenceItem___Control0009Keyword_0_1_1_or_Control000aKeyword_0_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SentenceItem___Control0009Keyword_1_1_1_or_Control000aKeyword_1_1_0__q.equals(syntax))
				emit_SentenceItem___Control0009Keyword_1_1_1_or_Control000aKeyword_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SentenceItem___Control0009Keyword_2_1_1_or_Control000aKeyword_2_1_0__q.equals(syntax))
				emit_SentenceItem___Control0009Keyword_2_1_1_or_Control000aKeyword_2_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TextContent___Control000aKeyword_1_1_0_1_or_SpaceKeyword_1_1_0_0__a.equals(syntax))
				emit_TextContent___Control000aKeyword_1_1_0_1_or_SpaceKeyword_1_1_0_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (
	     '	' | 
	     '
	     '
	 )?
	 */
	protected void emit_Ambivalence___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '
	     ' | 
	     '	'
	 )?
	 */
	protected void emit_Case___Control0009Keyword_3_1_or_Control000aKeyword_3_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '	' | 
	     '
	     '
	 )?
	 */
	protected void emit_Case___Control0009Keyword_4_1_1_1_or_Control000aKeyword_4_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '	' | 
	     '
	     '
	 )?
	 */
	protected void emit_Marker___Control0009Keyword_1_1_1_1_or_Control000aKeyword_1_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '
	     ' | 
	     '	'
	 )?
	 */
	protected void emit_SentenceItem___Control0009Keyword_0_1_1_or_Control000aKeyword_0_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '	' | 
	     '
	     '
	 )?
	 */
	protected void emit_SentenceItem___Control0009Keyword_1_1_1_or_Control000aKeyword_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '	' | 
	     '
	     '
	 )?
	 */
	protected void emit_SentenceItem___Control0009Keyword_2_1_1_or_Control000aKeyword_2_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '
	     ' | 
	     ' '
	 )*
	 */
	protected void emit_TextContent___Control000aKeyword_1_1_0_1_or_SpaceKeyword_1_1_0_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
