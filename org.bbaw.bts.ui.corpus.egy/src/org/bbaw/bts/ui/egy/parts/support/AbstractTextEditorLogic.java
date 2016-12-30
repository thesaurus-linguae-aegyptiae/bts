package org.bbaw.bts.ui.egy.parts.support;

import java.util.HashSet;
import java.util.Set;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.ui.commons.corpus.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSentenceAnnotation;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.RubrumDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextdrawingStrategy;
import org.eclipse.core.internal.preferences.EclipsePreferences;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.AnnotationPainter.IDrawingStrategy;
import org.eclipse.jface.text.source.AnnotationPainter.ITextStyleStrategy;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.swt.graphics.Color;
import org.osgi.service.prefs.BackingStoreException;

public abstract class AbstractTextEditorLogic {
	
	protected static final String[] ANNO_TYPES_SUFFIXES = new String[]{"", ".highlighted"};

	protected AnnotationPainter painter;
	private Set<String> annotationStrategySet = null;

	protected Set<String> configureEditorDrawingStrategies(AnnotationPainter painter, OverviewRuler oruler, EclipsePreferences preferences) {

		Set <String> annotationStrategySet = new HashSet<String>();
		// set basic rulers
		if (oruler != null)
		{
			oruler.addAnnotationType(BTSConstants.ANNOTATION_SUBTEXT);
			oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION_SUBTEXT, 12);
			oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION_SUBTEXT, BTSUIConstants.COLOR_SUBTEXT);
	
			oruler.addAnnotationType(BTSConstants.ANNOTATION_SUBTEXT + BTSModelAnnotation.HIGHLIGHTED);
			oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION_SUBTEXT + BTSModelAnnotation.HIGHLIGHTED, 2);
			oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION_SUBTEXT + BTSModelAnnotation.HIGHLIGHTED, BTSUIConstants.COLOR_SUBTEXT);
	
			oruler.addAnnotationType(BTSConstants.COMMENT);
			oruler.setAnnotationTypeLayer(BTSConstants.COMMENT, 11);
			oruler.setAnnotationTypeColor(BTSConstants.COMMENT,
					BTSUIConstants.COLOR_COMMENT);
			
			oruler.addAnnotationType(BTSConstants.COMMENT  + BTSModelAnnotation.HIGHLIGHTED);
			oruler.setAnnotationTypeLayer(BTSConstants.COMMENT  + BTSModelAnnotation.HIGHLIGHTED, 14);
			oruler.setAnnotationTypeColor(BTSConstants.COMMENT  + BTSModelAnnotation.HIGHLIGHTED,
					BTSUIConstants.COLOR_COMMENT);
	
			oruler.addAnnotationType("org.eclipse.xtext.ui.editor.error");
			oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.error", 30);
			oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.error", BTSUIConstants.COLOR_ERROR);
	
			oruler.addAnnotationType("org.eclipse.xtext.ui.editor.warning");
			oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.warning", 18);
			oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.warning",BTSUIConstants.COLOR_WARNING);
			
			oruler.addAnnotationType(BTSSentenceAnnotation.TYPE_HIGHLIGHTED);
			oruler.setAnnotationTypeLayer(BTSSentenceAnnotation.TYPE_HIGHLIGHTED, 8);
			oruler.setAnnotationTypeColor(BTSSentenceAnnotation.TYPE_HIGHLIGHTED,
					BTSUIConstants.COLOR_SENTENCE);
		}
		
		AnnotationDrawingStrategy sentenceStrategy2 = new AnnotationDrawingStrategy();
		painter.addDrawingStrategy(BTSSentenceAnnotation.TYPE_HIGHLIGHTED, sentenceStrategy2);
		painter.setAnnotationTypeColor(BTSSentenceAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_SENTENCE);
		painter.addAnnotationType(BTSSentenceAnnotation.TYPE_HIGHLIGHTED, BTSSentenceAnnotation.TYPE_HIGHLIGHTED);
		annotationStrategySet.add(BTSSentenceAnnotation.TYPE_HIGHLIGHTED);
		
		// Lemma
		ITextStyleStrategy strategy = new org.eclipse.jface.text.source.AnnotationPainter.HighlightingStrategy();
		painter.addTextStyleStrategy(BTSLemmaAnnotation.TYPE, strategy);
		painter.setAnnotationTypeColor(BTSLemmaAnnotation.TYPE,
				BTSUIConstants.COLOR_LEMMA);
		// this is done in filter
		painter.addAnnotationType(BTSLemmaAnnotation.TYPE, BTSLemmaAnnotation.TYPE);
		annotationStrategySet.add(BTSLemmaAnnotation.TYPE);

		
		// comment
		CommentDrawingStrategy commentStrategy = new CommentDrawingStrategy();
		painter.addDrawingStrategy(BTSConstants.COMMENT, commentStrategy);
		painter.setAnnotationTypeColor(BTSConstants.COMMENT,
				BTSUIConstants.COLOR_COMMENT);
		
		// this is done in filter
		painter.addAnnotationType(BTSConstants.COMMENT,
				BTSConstants.COMMENT);
		annotationStrategySet.add(BTSConstants.COMMENT);

		
		// comment highlighted
		CommentHighlightedDrawingStrategy commenthighStrategy = new CommentHighlightedDrawingStrategy();
		painter.addDrawingStrategy(BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED,
				commenthighStrategy);
		painter.setAnnotationTypeColor(BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED,
				BTSUIConstants.COLOR_COMMENT);
		
		// this is done in filter
		painter.addAnnotationType(BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED,
				BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED);
		annotationStrategySet.add(BTSConstants.COMMENT + BTSModelAnnotation.HIGHLIGHTED);

		
		// subtext
		SubtextdrawingStrategy subtextStrategy = new SubtextdrawingStrategy();
		painter.addDrawingStrategy(BTSConstants.ANNOTATION_SUBTEXT, subtextStrategy);
		painter.setAnnotationTypeColor(BTSConstants.ANNOTATION_SUBTEXT,
				BTSUIConstants.COLOR_SUBTEXT);
		
		// this is done in filter
		painter.addAnnotationType(BTSConstants.ANNOTATION_SUBTEXT,
				BTSConstants.ANNOTATION_SUBTEXT);
		annotationStrategySet.add(BTSConstants.ANNOTATION_SUBTEXT);

		// subtext
		SubtextHighlightedDrawingStrategy subtexthighStrategy = new SubtextHighlightedDrawingStrategy();
		painter.addDrawingStrategy(BTSConstants.ANNOTATION_SUBTEXT  + BTSModelAnnotation.HIGHLIGHTED,
				subtexthighStrategy);
		painter.setAnnotationTypeColor(BTSConstants.ANNOTATION_SUBTEXT  + BTSModelAnnotation.HIGHLIGHTED,
				BTSUIConstants.COLOR_SUBTEXT);
		
		// this is done in filter
		painter.addAnnotationType(BTSConstants.ANNOTATION_SUBTEXT  + BTSModelAnnotation.HIGHLIGHTED,
				BTSConstants.ANNOTATION_SUBTEXT  + BTSModelAnnotation.HIGHLIGHTED);
		annotationStrategySet.add(BTSConstants.ANNOTATION_SUBTEXT  + BTSModelAnnotation.HIGHLIGHTED);

		
		// annotations
		boolean annotationBaseStrategyExists = false;
		boolean annotationRubrumStrategyExists = false;
		
		try {
			for (String childNode : preferences.childrenNames())
			{
				EclipsePreferences node = (EclipsePreferences) preferences.node(childNode);
				String strategyType = BTSConstants.ANNOTATION;
				String type = node.get(BTSCorpusConstants.PREF_ANNOTATION_TYPE, null);
				String subtype = node.get(BTSCorpusConstants.PREF_ANNOTATION_SUBTYPE, null);
				if (type != null && !"".equals(type))
				{
					strategyType += CorpusUtils.TYPE_PATH_DELIMITER + type;
					if (subtype != null  && !"".equals(subtype))
					{
						strategyType += CorpusUtils.TYPE_PATH_DELIMITER + subtype;
					}
					else if (CorpusUtils.ANNOTATION_RUBRUM_TYPE.equalsIgnoreCase(type))
					{
						// general rubrum strategy extits
						annotationRubrumStrategyExists = true;
					}
				}
				else
				{
					annotationBaseStrategyExists = true;
				}
				
				// Annotation
				String highlightingType = node.get(BTSCorpusConstants.PREF_HIGHLIGHTING_TYPE, BTSCorpusConstants.PREF_DEFAULT_HIGHLIGHTING_TYPE);
				IDrawingStrategy annotationStrategy = null;
				ITextStyleStrategy annotationTextStyleStrategy = null;
				if (BTSCorpusConstants.ANNOTATION_HIGHLIGHTING_TYPE_UNDERLINE.equals(highlightingType))
				{
					annotationStrategy = new AnnotationDrawingStrategy();
				}
				else if (BTSCorpusConstants.ANNOTATION_HIGHLIGHTING_TYPE_TEXTCOLOR.equals(highlightingType))
				{
					annotationTextStyleStrategy = new RubrumDrawingStrategy();
				}
				else if (BTSCorpusConstants.ANNOTATION_HIGHLIGHTING_TYPE_BACKGROUND_COLOR.equals(highlightingType))
				{
					annotationTextStyleStrategy = new org.eclipse.jface.text.source.AnnotationPainter.HighlightingStrategy();
				}
				else
				{
					annotationStrategy = new AnnotationDrawingStrategy();
				}
				
				if (annotationStrategy != null)
				{
					painter.addDrawingStrategy(strategyType,
							annotationStrategy);
				}
				else
				{
					painter.addTextStyleStrategy(strategyType,
							annotationTextStyleStrategy);
				}
				
				String colorString = node.get(BTSCorpusConstants.PREF_COLOR, null);
				Color color;
				if (colorString != null)
				{
					color = BTSUIConstants.getColor(colorString);
				}
				else
				{
					color = BTSUIConstants.COLOR_ANNOTATTION;
				}
				painter.setAnnotationTypeColor(strategyType,color);
				
				painter.addAnnotationType(strategyType,
						strategyType);
				annotationStrategySet.add(strategyType);

				// Annotation highlighted
				AnnotationHighlightedDrawingStrategy annotationHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
				painter.addDrawingStrategy(strategyType + BTSModelAnnotation.HIGHLIGHTED,
						annotationHighlightedStrategy);
				painter.setAnnotationTypeColor(strategyType + BTSModelAnnotation.HIGHLIGHTED,
						color);
				
				painter.addAnnotationType(strategyType + BTSModelAnnotation.HIGHLIGHTED,
						strategyType + BTSModelAnnotation.HIGHLIGHTED);
				annotationStrategySet.add(strategyType  + BTSModelAnnotation.HIGHLIGHTED);

				// configure ruler
				if (oruler != null)
				{
					oruler.addAnnotationType(strategyType);
					oruler.setAnnotationTypeLayer(strategyType, 3);
					oruler.setAnnotationTypeColor(strategyType,
							color);
					oruler.addAnnotationType(strategyType + BTSModelAnnotation.HIGHLIGHTED);
					oruler.setAnnotationTypeLayer(strategyType + BTSModelAnnotation.HIGHLIGHTED, 5);
					oruler.setAnnotationTypeColor(strategyType + BTSModelAnnotation.HIGHLIGHTED,
							color);
				}
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		// default strategies
		if(!annotationBaseStrategyExists)
		{
			// Annotation
			AnnotationDrawingStrategy annotationStrategy = new AnnotationDrawingStrategy();
			painter.addDrawingStrategy(BTSConstants.ANNOTATION,
					annotationStrategy);
			painter.setAnnotationTypeColor(BTSConstants.ANNOTATION,
					BTSUIConstants.COLOR_ANNOTATTION);
			painter.addAnnotationType(BTSConstants.ANNOTATION,
					BTSConstants.ANNOTATION);
			annotationStrategySet.add(BTSConstants.ANNOTATION);

			// Annotation highlighted
			AnnotationHighlightedDrawingStrategy annotationHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
			painter.addDrawingStrategy(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED,
					annotationHighlightedStrategy);
			painter.setAnnotationTypeColor(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED,
					BTSUIConstants.COLOR_ANNOTATTION);
			painter.addAnnotationType(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED,
					BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED);
			annotationStrategySet.add(BTSConstants.ANNOTATION  + BTSModelAnnotation.HIGHLIGHTED);

			if (oruler != null)
			{
				oruler.addAnnotationType(BTSConstants.ANNOTATION);
				oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION, 3);
				oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION,
						BTSUIConstants.COLOR_ANNOTATTION);
				oruler.addAnnotationType(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED);
				oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED, 5);
				oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION + BTSModelAnnotation.HIGHLIGHTED,
						BTSUIConstants.COLOR_ANNOTATTION);
			}
		}
		
		if (!annotationRubrumStrategyExists)
		{
			// Annotation rumbrum
			RubrumDrawingStrategy rubrumStrategy = new RubrumDrawingStrategy();
			painter.addTextStyleStrategy(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE,
					rubrumStrategy);
			painter.setAnnotationTypeColor(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE,
					BTSUIConstants.COLOR_RUBRUM);
			painter.addAnnotationType(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE,
					BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE);
			annotationStrategySet.add(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE);

			// Annotation rumbrum highlighted
			AnnotationHighlightedDrawingStrategy rubrumHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
			painter.addDrawingStrategy(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED,
					rubrumHighlightedStrategy);
			painter.setAnnotationTypeColor(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED,
					BTSUIConstants.COLOR_RUBRUM);
			painter.addAnnotationType(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED,
					BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED);
			annotationStrategySet.add(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE + BTSModelAnnotation.HIGHLIGHTED);

			if (oruler != null)
			{
				oruler.addAnnotationType(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE);
				oruler.setAnnotationTypeLayer(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE, 3);
				oruler.setAnnotationTypeColor(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE,
						BTSUIConstants.COLOR_RUBRUM);
			}
		}
		return annotationStrategySet;
	}
	

}
