package org.bbaw.bts.corpus.text.egy.ui.custom;

import java.util.Iterator;

import org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.Case;
import org.bbaw.bts.corpus.text.egy.egyDsl.Deletion;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading;
import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.Emendation;
import org.bbaw.bts.corpus.text.egy.egyDsl.Expanded;
import org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn;
import org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna;
import org.bbaw.bts.corpus.text.egy.egyDsl.Marker;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction;
import org.bbaw.bts.corpus.text.egy.egyDsl.Rasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur;
import org.bbaw.bts.corpus.text.egy.egyDsl.Sentence;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class BTSSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		for (Iterator<EObject> contents = resource.getAllContents(); contents
				.hasNext();) {
			EObject element = contents.next();
			if (element instanceof Word) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.WORD__WCHAR, acceptor);
			} else if (element instanceof Sentence) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.SENTENCE__ITEMS, acceptor);
//			} else if (element instanceof Marker) {
//				highlightAsDataType(element,
//						EgyDslPackage.Literals.MARKER__NAME, acceptor);
			} else if (element instanceof Case) {
				highlightAsDataType(element, EgyDslPackage.Literals.CASE__NAME,
						acceptor);
			} else if (element instanceof Ambivalence) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.AMBIVALENCE__CASES, acceptor);
			}
			//
			else if (element instanceof Expanded) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.EXPANDED__WCHAR, acceptor);
			} else if (element instanceof Emendation) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.EMENDATION__WCHAR, acceptor);
			} else if (element instanceof DisputableReading) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.DISPUTABLE_READING__WCHAR,
						acceptor);
			} else if (element instanceof Lacuna) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.LACUNA__WCHAR, acceptor);
			} else if (element instanceof Deletion) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.DELETION__WCHAR, acceptor);
			} else if (element instanceof ExpandedColumn) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.EXPANDED_COLUMN__WCHAR, acceptor);
			} else if (element instanceof Rasur) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.RASUR__WCHAR, acceptor);
			} else if (element instanceof AncientExpanded) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.ANCIENT_EXPANDED__WCHAR,
						acceptor);
			} else if (element instanceof RestorationOverRasur) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.RESTORATION_OVER_RASUR__WCHAR,
						acceptor);
			} else if (element instanceof PartialDestruction) {
				highlightAsDataType(element,
						EgyDslPackage.Literals.PARTIAL_DESTRUCTION__WCHAR,
						acceptor);
			} 
//			else if (element instanceof Destruction) {
//				highlightAsDataType(element,
//						EgyDslPackage.Literals.DESTRUCTION__COMMENT, acceptor);
//			}
		}
	}

	protected void highlightAsDataType(EObject element,
			EStructuralFeature feature, IHighlightedPositionAcceptor acceptor) {
		if (element instanceof Word) {
			for (INode node : NodeModelUtils.findNodesForFeature(element,
					feature)) {
				acceptor.addPosition(node.getOffset(), node.getLength(),
						BTSHighlightingConfiguration.WORD);
			}
		} else if (element instanceof Sentence) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.SENTENCE);
		} else if (element instanceof Marker) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.MARKER);
		} else if (element instanceof Case) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.LEMMA_CASE);
		} else if (element instanceof Ambivalence) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.AMBIVALENCE);
		}

		//
		else if (element instanceof Expanded) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.EXPANDED);
		} else if (element instanceof Emendation) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.EMANDATION);
		} else if (element instanceof DisputableReading) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.DISPUTABLE_READING);
		} else if (element instanceof Lacuna) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.LACUNA);
		} else if (element instanceof Deletion) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.DELETION);
		} else if (element instanceof ExpandedColumn) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.EXPANDED_COLUMN);
		} else if (element instanceof Rasur) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.RASUR);
		}
 else if (element instanceof AncientExpanded) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.ANCIENT_EXPANDED);
		}
 else if (element instanceof RestorationOverRasur) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.RESTORATION_OVER_RASUR);
		}
 else if (element instanceof PartialDestruction) {
			INode node = NodeModelUtils.findActualNodeFor(element);
			acceptor.addPosition(node.getOffset(), node.getLength(),
					BTSHighlightingConfiguration.PARTIAL_DESTRUCTION);
		}
// else if (element instanceof Destruction) {
//			INode node = NodeModelUtils.findActualNodeFor(element);
//			acceptor.addPosition(node.getOffset(), node.getLength(),
//					BTSHighlightingConfiguration.DESTRUCTION);
//		}
	}
}