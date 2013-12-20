package org.bbaw.bts.corpus.text.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.bbaw.bts.corpus.text.dsl.services.BTSGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractBTSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BTSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BTSTextContent_SpaceKeyword_1_1_0_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BTSGrammarAccess) access;
		match_BTSTextContent_SpaceKeyword_1_1_0_a = new TokenAlias(true, true, grammarAccess.getBTSTextContentAccess().getSpaceKeyword_1_1_0());
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
			if(match_BTSTextContent_SpaceKeyword_1_1_0_a.equals(syntax))
				emit_BTSTextContent_SpaceKeyword_1_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_BTSTextContent_SpaceKeyword_1_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
