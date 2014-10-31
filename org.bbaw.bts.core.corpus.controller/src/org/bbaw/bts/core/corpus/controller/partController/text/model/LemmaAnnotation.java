//package org.bbaw.bts.core.corpus.controller.partController.text.model;
//
//import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
//import org.eclipse.swt.graphics.GC;
//import org.eclipse.swt.graphics.Rectangle;
//import org.eclipse.swt.widgets.Canvas;
//import org.eclipse.xtext.ui.editor.model.IXtextDocument;
//import org.eclipse.xtext.validation.Issue;
//
//public class LemmaAnnotation extends ModelAnnotation {
//
//	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.lemma";
//
//	public static final String TYPE_HIGHLIGHTED = TYPE + ".highlighted";
//
//	private BTSLemmaEntry lemma;;
//
//	public LemmaAnnotation(IXtextDocument document, Issue issue,
//			Object modelObject, BTSLemmaEntry lemma) {
//		super(TYPE, document, issue, modelObject);
//		this.setLemma(lemma);
//	}
//
//	@Override
//	public String getType() {
//		if (super.getType() == null)
//		{
//			return this.TYPE;
//		}
//		return super.getType();
//	}
//
//	@Override
//	public void paint(GC gc, Canvas canvas, Rectangle bounds) {
//		// // TODO Auto-generated method stub
//		// super.paint(gc, canvas, bounds);
//	}
//	@Override
//	public void setHighlighted(boolean highlighted) {
//		if (highlighted)
//		{
//			cachedType = getType();
//			setType(TYPE_HIGHLIGHTED);
//		}
//		else
//		{
//			setType(cachedType);
//		}
//		
//	}
//
//	public BTSLemmaEntry getLemma() {
//		return lemma;
//	}
//
//	public void setLemma(BTSLemmaEntry lemma) {
//		this.lemma = lemma;
//	}
//}
