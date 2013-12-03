package org.bbaw.bts.corpus.text.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.bbaw.bts.btsmodel.BTSAmbivalence;
import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSLemmaCase;
import org.bbaw.bts.btsmodel.BTSMarker;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSTextContent;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.corpus.text.dsl.services.BTSGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractBTSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BTSGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BtsmodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BtsmodelPackage.BTS_AMBIVALENCE:
				if(context == grammarAccess.getBTSAmbivalenceRule() ||
				   context == grammarAccess.getBTSSentenceItemRule() ||
				   context == grammarAccess.getBTSTextItemsRule()) {
					sequence_BTSAmbivalence(context, (BTSAmbivalence) semanticObject); 
					return; 
				}
				else break;
			case BtsmodelPackage.BTS_GRAPHIC:
				if(context == grammarAccess.getBTSGraphicRule()) {
					sequence_BTSGraphic(context, (BTSGraphic) semanticObject); 
					return; 
				}
				else break;
			case BtsmodelPackage.BTS_LEMMA_CASE:
				if(context == grammarAccess.getBTSLemmaCaseRule()) {
					sequence_BTSLemmaCase(context, (BTSLemmaCase) semanticObject); 
					return; 
				}
				else break;
			case BtsmodelPackage.BTS_MARKER:
				if(context == grammarAccess.getBTSAmbivalenceItemRule() ||
				   context == grammarAccess.getBTSMarkerRule() ||
				   context == grammarAccess.getBTSSentenceItemRule() ||
				   context == grammarAccess.getBTSTextItemsRule()) {
					sequence_BTSMarker(context, (BTSMarker) semanticObject); 
					return; 
				}
				else break;
			case BtsmodelPackage.BTS_SENCTENCE:
				if(context == grammarAccess.getBTSSenctenceRule() ||
				   context == grammarAccess.getBTSTextItemsRule()) {
					sequence_BTSSenctence(context, (BTSSenctence) semanticObject); 
					return; 
				}
				else break;
			case BtsmodelPackage.BTS_TEXT_CONTENT:
				if(context == grammarAccess.getBTSTextContentRule()) {
					sequence_BTSTextContent(context, (BTSTextContent) semanticObject); 
					return; 
				}
				else break;
			case BtsmodelPackage.BTS_WORD:
				if(context == grammarAccess.getBTSAmbivalenceItemRule() ||
				   context == grammarAccess.getBTSSentenceItemRule() ||
				   context == grammarAccess.getBTSWordRule()) {
					sequence_BTSWord(context, (BTSWord) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         state=EString? 
	 *         revisionState=EString? 
	 *         visibility=EString? 
	 *         sortKey=EInt? 
	 *         type=EString? 
	 *         subtype=EString? 
	 *         code=EString? 
	 *         _id=EString? 
	 *         comment=EString? 
	 *         parentId=EString? 
	 *         (cases+=BTSLemmaCase cases+=BTSLemmaCase*)?
	 *     )
	 */
	protected void sequence_BTSAmbivalence(EObject context, BTSAmbivalence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (_id=EString? innerSentenceOrder=EInt? code=EString? reference=EString?)
	 */
	protected void sequence_BTSGraphic(EObject context, BTSGraphic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         state=EString? 
	 *         revisionState=EString? 
	 *         visibility=EString? 
	 *         sortKey=EInt? 
	 *         type=EString? 
	 *         subtype=EString? 
	 *         code=EString? 
	 *         _id=EString? 
	 *         comment=EString? 
	 *         parentId=EString? 
	 *         (scenario+=BTSAmbivalenceItem scenario+=BTSAmbivalenceItem*)?
	 *     )
	 */
	protected void sequence_BTSLemmaCase(EObject context, BTSLemmaCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         state=EString? 
	 *         revisionState=EString? 
	 *         visibility=EString? 
	 *         sortKey=EInt? 
	 *         type=EString? 
	 *         subtype=EString? 
	 *         code=EString? 
	 *         _id=EString? 
	 *         comment=EString? 
	 *         parentId=EString? 
	 *         value=EString?
	 *     )
	 */
	protected void sequence_BTSMarker(EObject context, BTSMarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         state=EString? 
	 *         revisionState=EString? 
	 *         visibility=EString? 
	 *         sortKey=EInt? 
	 *         type=EString? 
	 *         subtype=EString? 
	 *         code=EString? 
	 *         _id=EString? 
	 *         comment=EString? 
	 *         parentId=EString? 
	 *         (sentenceItems+=BTSSentenceItem sentenceItems+=BTSSentenceItem*)?
	 *     )
	 */
	protected void sequence_BTSSenctence(EObject context, BTSSenctence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((textItems+=BTSTextItems textItems+=BTSTextItems*)?)
	 */
	protected void sequence_BTSTextContent(EObject context, BTSTextContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         state=EString? 
	 *         revisionState=EString? 
	 *         visibility=EString? 
	 *         sortKey=EInt? 
	 *         type=EString? 
	 *         subtype=EString? 
	 *         code=EString? 
	 *         _id=EString? 
	 *         comment=EString? 
	 *         parentId=EString? 
	 *         wType=EString? 
	 *         lType=EString? 
	 *         lKey=EString? 
	 *         flexCode=EString? 
	 *         wChar=EString? 
	 *         value=EString? 
	 *         (graphics+=BTSGraphic graphics+=BTSGraphic*)?
	 *     )
	 */
	protected void sequence_BTSWord(EObject context, BTSWord semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
