package org.bbaw.bts.core.corpus.controller.impl.partController;

//import grammaticalBase.model.light.LightInflexion;
//import grammaticalBase.model.light.LightLemma;
//import grammaticalBase.model.light.LightSpelling;
//import grammaticalBase.model.text.TextModel;
//import grammaticalBase.model.text.WordAnalysis;
//import grammaticalBase.model.text.WordOccurrence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSAmbivalence;
import org.bbaw.bts.btsmodel.BTSAmbivalenceItem;
import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSLemmaCase;
import org.bbaw.bts.btsmodel.BTSMarker;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextItems;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.core.services.BTSTextService;
import org.bbaw.bts.ui.commons.text.BTSAnnotationAnnotation;
import org.bbaw.bts.ui.commons.text.BTSCommentAnnotation;
import org.bbaw.bts.ui.commons.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.egy.parts.support.BTSEgySourceViewerConfiguration;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.SourceViewer;

public class BTSTextEditorControllerImpl implements BTSTextEditorController
{

	private static final String MDC_DELIMETERS = ":-<>*";
	private static final String SENTENCE_SIGN = "§";
	private static final String AMBIVALENCE_START_SIGN = "%";
	private static final String AMBIVALENCE_END_SIGN = "%";
	private static final String LEMMA_CASE_TERMIAL = "case";
	private static final String LEMMA_CASE_SEPARATOR = "; ";
	private static final String WS = " ";
	private static final String LEMMA_CASE_INTERFIX = ": ";
	private static final String MARKER_START_SIGN = "#";
	private static final String MARKER_END_SIGN = "#";
	private static final String VERS_FRONTER_MARKER = "mv";
	private static final String VERS_BREAK_MARKER = "v";

	private static final String MARKER_VERS_SIGN = "@";
	private static final String MARKER_INTERFIX = ": ";
	private static final String MDC_IGNORE = "\\i";
	private static final String MDC_SELECTION = "\\red";
	@Inject
	private BTSTextService textService;
	private int idcounter = 0;
	private Comparator<? super Object> glyphsStringComparator;

	@Override
	public void transformToDocument(BTSText text, Document doc, IAnnotationModel model)
	{
		if (text == null || text.getTextContent() == null)
		{
			return;
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (BTSTextItems textItems : text.getTextContent().getTextItems())
		{
			if (textItems instanceof BTSSenctence)
			{
				BTSSenctence sentence = (BTSSenctence) textItems;
				int start = stringBuilder.length();
				stringBuilder.append(SENTENCE_SIGN);
				BTSModelAnnotation ma = new BTSModelAnnotation(sentence);
				
				for (BTSSentenceItem sentenceItem : sentence.getSentenceItems())
				{
					appendToStringBuilder(sentenceItem, model, stringBuilder);
					stringBuilder.append(WS);
				}
				stringBuilder.replace(stringBuilder.length() - 1,
						stringBuilder.length(), SENTENCE_SIGN);
				stringBuilder.append("\n");
				int length = stringBuilder.length() - start;
				Position pos = new Position(start, length);
				model.addAnnotation(ma, pos);
			} else
			{
				appendToStringBuilder(textItems, model, stringBuilder);
			}
		}
		System.out.println(stringBuilder.toString());
		doc.set(stringBuilder.toString());

	}

	private void appendToStringBuilder(BTSIdentifiableItem item, IAnnotationModel model, StringBuilder stringBuilder)
	{
		Position pos;
		if (item instanceof BTSWord)
		{
			BTSWord word = (BTSWord) item;
			pos = appendWordToStringBuilder(word, stringBuilder);
			appendWordToModel(word, model, pos);

			// mock annotation
			BTSAnnotationAnnotation aa = new BTSAnnotationAnnotation(item, null);
			model.addAnnotation(aa, pos);

			// mock comment
			BTSCommentAnnotation ca = new BTSCommentAnnotation(item, null);
			model.addAnnotation(ca, pos);

			// mock subtext
			BTSSubtextAnnotation sa = new BTSSubtextAnnotation(item, null);
			model.addAnnotation(sa, pos);
		} else if (item instanceof BTSMarker)
		{
			BTSMarker marker = (BTSMarker) item;
			pos = appendMarkerToStringBuilder(marker, stringBuilder);
			appendMarkerToModel(marker, model, pos);
		} else if (item instanceof BTSAmbivalence) {
			BTSAmbivalence ambivalence = (BTSAmbivalence) item;
			pos = appendAmbivalenceToStringBuilder(ambivalence, stringBuilder,
					model);
			appendAmbivalenceToModel(ambivalence, model, pos);
		}
		// check if there are comments, annotations or subtext pointing to this
		// item
		// pointer can either be start or end positions!

	}

	private void appendAmbivalenceToModel(BTSAmbivalence ambivalence,
			IAnnotationModel model, Position pos) {
		BTSModelAnnotation annotation = new BTSModelAnnotation(
				(BTSIdentifiableItem) ambivalence);

		model.addAnnotation(annotation, pos);

	}

	private Position appendAmbivalenceToStringBuilder(
			BTSAmbivalence ambivalence, StringBuilder stringBuilder,
			IAnnotationModel model) {
		Position pos = new Position(stringBuilder.length());
		stringBuilder.append(AMBIVALENCE_START_SIGN);
		if (ambivalence.getCases() != null) {
			for (BTSLemmaCase amCase : ambivalence.getCases()) {
				appendLemmaCase(amCase, ambivalence, stringBuilder, model);
				stringBuilder.append(LEMMA_CASE_SEPARATOR);
			}
		}
		stringBuilder.replace(
				stringBuilder.length() - LEMMA_CASE_SEPARATOR.length(),
				stringBuilder.length(), AMBIVALENCE_END_SIGN);
		pos.setLength(stringBuilder.length() - pos.getOffset());

		return pos;
	}

	private void appendLemmaCase(BTSLemmaCase amCase,
			BTSAmbivalence ambivalence, StringBuilder stringBuilder,
			IAnnotationModel model) {
		Position pos = new Position(stringBuilder.length());
		stringBuilder.append(LEMMA_CASE_TERMIAL + WS);
		if (amCase.getName() != null) {
			stringBuilder.append(amCase.getName());
		}
		stringBuilder.append(LEMMA_CASE_INTERFIX);

		if (amCase.getScenario() != null) {
			for (BTSAmbivalenceItem item : amCase.getScenario()) {
				appendAmbivalenceItem(item, amCase, ambivalence, stringBuilder,
						model);
				stringBuilder.append(WS);
			}
		}
		stringBuilder.replace(stringBuilder.length() - 1,
				stringBuilder.length(), "");
		pos.setLength(stringBuilder.length() - pos.getOffset());

		// append to model
		BTSModelAnnotation annotation = new BTSModelAnnotation(
				(BTSIdentifiableItem) amCase);

		model.addAnnotation(annotation, pos);
		return;

	}

	private void appendAmbivalenceItem(BTSAmbivalenceItem item,
			BTSLemmaCase amCase, BTSAmbivalence ambivalence,
			StringBuilder stringBuilder, IAnnotationModel model) {
		Position pos;
		if (item instanceof BTSWord) {
			BTSWord word = (BTSWord) item;
			pos = appendWordToStringBuilder(word, stringBuilder);
			appendWordToModel(word, model, pos);
		} else if (item instanceof BTSMarker) {
			BTSMarker marker = (BTSMarker) item;
			pos = appendMarkerToStringBuilder(marker, stringBuilder);
			appendMarkerToModel(marker, model, pos);
		}

	}

	private void appendMarkerToModel(BTSMarker marker, IAnnotationModel model,
			Position pos)
	{
		BTSModelAnnotation annotation = new BTSModelAnnotation(
				(BTSIdentifiableItem) marker);

		model.addAnnotation(annotation, pos);

	}

	private Position appendMarkerToStringBuilder(BTSMarker marker,
			StringBuilder stringBuilder)
	{
		Position pos = new Position(stringBuilder.length());
		if (marker.getType() != null) {
			if (marker.getType().equals(BTSConstants.TEXT_VERS_FRONTIER_MARKER)) {
				stringBuilder.append(MARKER_VERS_SIGN);
				stringBuilder.append(VERS_FRONTER_MARKER);
			} else if (marker.getType().equals(
					BTSConstants.TEXT_VERS_BREAK_MARKER)) {
				stringBuilder.append(MARKER_VERS_SIGN);
				stringBuilder.append(VERS_BREAK_MARKER);
			} else {
				stringBuilder.append(MARKER_START_SIGN);
				stringBuilder.append(marker.getType());
				if (marker.getName() != null && !"".equals(marker.getName())) {
					stringBuilder.append(MARKER_INTERFIX);
					stringBuilder.append(marker.getName());
				}
				stringBuilder.append(MARKER_END_SIGN);
			}
		}

		pos.setLength(stringBuilder.length() - pos.getOffset());
		return pos;

	}

	private void appendWordToModel(BTSWord word, IAnnotationModel model, Position position)
	{
		BTSModelAnnotation annotation;
		if (true || (word.getLKey() != null && "".equals(word.getLKey()))) {

			annotation = new BTSLemmaAnnotation(word);
		} else {
			annotation = new BTSModelAnnotation(
(BTSIdentifiableItem) word);
		}
		model.addAnnotation(annotation, position);

	}

	private Position appendWordToStringBuilder(BTSWord word, StringBuilder stringBuilder)
	{
		Position pos = new Position(stringBuilder.length());
		if (word.getWChar() != null)
		{
			stringBuilder.append(word.getWChar());
			pos.setLength(word.getWChar().length());
		}
		return pos;
	}

	@Override
	public BTSText updateTextFromDocument(BTSText text, Document document, IAnnotationModel annotationModel,
			SourceViewer textViewer)
	{
		BTSEgySourceViewerConfiguration configuration = new BTSEgySourceViewerConfiguration();
		RuleBasedScanner scanner = configuration.getScanner();
		scanner.setRange(document, 0, document.getLength());
		IToken token = scanner.nextToken();
		int length = document.getLength();
		Iterator annotationIterator = annotationModel.getAnnotationIterator();
		StringBuffer buffer = new StringBuffer(length);
		//		StringTokenizer tokenizer= new StringTokenizer(document.get(), "\n\r><", true); //$NON-NLS-1$
		//		while (tokenizer.hasMoreTokens()){
		//
		//			String token = tokenizer.nextToken();
		//		}

		int pos;
		int len;
		int annotationOffset = 0;
		String content = null;
		boolean hasToken = token != null;
		BTSModelAnnotation annotation = null;
		BTSSenctence sentence;

		if (!text.getTextContent().getTextItems().isEmpty())
		{
			sentence = (BTSSenctence) text.getTextContent().getTextItems().get(0);
			sentence.getSentenceItems().clear();
		} else
		{
			sentence = textService.createNewSentence();
			text.getTextContent().getTextItems().add(sentence);
		}
		BTSWord word = null;
		int innerSentencePosition = 0;
		while (hasToken)
		{

			pos = scanner.getTokenOffset();
			len = scanner.getTokenLength();
			System.out.println(token);
			Object o = token.getData();
			//			annotationModel.
			System.out.println(o);
			System.out.println("token offset: " + pos + " token length: " + len);
			try
			{
				content = document.get(pos, len);
			} catch (BadLocationException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (content != null)
			{

				boolean wordFound = false;
				if (annotationOffset <= pos)
				{
					annotation = getAnnotation(annotation, annotationIterator, annotationModel, content, pos, len);
					Position position = annotationModel.getPosition(annotation);
					if (position != null)
					{
						annotationOffset = position.getOffset();
					}
					if (annotation != null && annotationOffset == pos && position.getLength() == len)
					{
						word = (BTSWord) annotation.getModel();
						word.setWChar(content);
						sentence.getSentenceItems().add(innerSentencePosition, word);
						wordFound = true;
						innerSentencePosition++;
					}
				}
				if (!wordFound)
				{
					word = createNewWord(content);
					sentence.getSentenceItems().add(innerSentencePosition, word);
					innerSentencePosition++;
				}

				content = null;
			}

			token = scanner.nextToken();
			hasToken = token != null && scanner.getTokenLength() > 0;
		}
		return text;
	}

	private BTSWord createNewWord(String content)
	{
		BTSWord word = textService.createNewWord();
		word.setWChar(content);
		return word;
	}

	private BTSModelAnnotation getAnnotation(Annotation annotation,
			Iterator annotationIterator,
			IAnnotationModel annotationModel, String content, int pos, int len)
	{
		if (annotation != null)
		{
			Position position = annotationModel.getPosition(annotation);
			if (position != null)
			{
				if (position.getOffset() > pos)
				{
					return (BTSModelAnnotation) annotation;
				}
			}
		}

		boolean forward = annotationIterator.hasNext();
		while (forward)
		{
			Object o = annotationIterator.next();
			annotation = (Annotation) o;
			if (!(annotation instanceof BTSModelAnnotation))
			{
				continue;
			}
			Position position = annotationModel.getPosition(annotation);
			if (position != null)
			{
				if (position.getOffset() >= pos)
				{
					return (BTSModelAnnotation) annotation;
				}

			}
			forward = annotationIterator.hasNext();
		}
		if (annotation instanceof BTSModelAnnotation)
		{
			return (BTSModelAnnotation) annotation;
		}
		return null;
	}

	@Override
	public boolean save(BTSText text)
	{
		return textService.save(text);
	}

	// @Override
	// public TextModel transformToRamsesTextModel(BTSText text, TextModel
	// textModel,
	// Map<Object, BTSSentenceItem> ramsesTextModelMap)
	// {
	// ramsesTextModelMap.clear();
	// textModel.clear();
	// if (text != null && !text.getTextContent().getTextItems().isEmpty())
	// {
	// return transformToRamsesTextModelInteral(text, textModel,
	// ramsesTextModelMap);
	// }
	// return textModel;
	//
	// }
	//
	// private TextModel transformToRamsesTextModelInteral(BTSText text,
	// TextModel textModel,
	// Map<Object, BTSSentenceItem> ramsesTextModelMap)
	// {
	// for (BTSTextItems item : text.getTextContent().getTextItems())
	// {
	// if (item instanceof BTSSenctence && !((BTSSenctence)
	// item).getSentenceItems().isEmpty())
	// {
	// for (BTSSentenceItem sentenceItem : ((BTSSenctence)
	// item).getSentenceItems())
	// {
	// addSentenceItemToTextModel(sentenceItem, textModel, ramsesTextModelMap);
	// }
	// }
	// }
	// return textModel;
	// }

	// private void addSentenceItemToTextModel(BTSSentenceItem sentenceItem,
	// TextModel textModel,
	// Map<Object, BTSSentenceItem> ramsesTextModelMap)
	// {
	// if (sentenceItem instanceof BTSWord)
	// {
	// BTSWord word = (BTSWord) sentenceItem;
	// WordOccurrence modelElement = new WordOccurrence();
	// LightSpelling ls = new LightSpelling(idcounter++, word.getWChar(),
	// transformWordToMdCString(word));
	// // ls.setEncodedOrder<ingTranslitteration(word.getWChar());
	//
	// ls.setLabel(word.getWChar() + " " + idcounter);
	// ls.setTranslitteration(word.getWChar());
	// modelElement.setSpelling(ls);
	// modelElement.setFreeTranslitteration(word.getWChar());
	// WordAnalysis wordAnalysis = new WordAnalysis();
	// wordAnalysis.setSpelling(ls);
	// LightLemma lightLemma = new LightLemma();
	// lightLemma.setTranslitteration("hhhh");
	// LightInflexion lightInflexion = new LightInflexion();
	// lightInflexion.setInflexionName("hihihi");
	// wordAnalysis.addInflexion(lightLemma, lightInflexion);
	// modelElement.setWordAnalysis(wordAnalysis);
	// textModel.add(modelElement);
	//
	// ramsesTextModelMap.put(modelElement, word);
	// }
	//
	// }

	public String transformWordToMdCString(BTSWord word, int selectedGlypheIndex)
	{
		String mdc = "";
		if (!word.getGraphics().isEmpty())
		{
			int i = 0;
			for (BTSGraphic graphic : word.getGraphics())
			{

				mdc += graphic.getCode();
				if (i == selectedGlypheIndex) {
					mdc = insertMarkerBehindSingleCode(mdc, MDC_SELECTION);
				} else if (graphic.isIgnored()) {
					mdc = insertMarkerBehindSingleCode(mdc, MDC_IGNORE);
				}
				i++;
			}
		}

		// XXX mockup
		// mdc = "s-t-n";
		return mdc;
	}

	public String insertMarkerBehindSingleCode(String mdcString, String marker) {
		String resultString = "";
		if (!(mdcString.endsWith("-") || mdcString.endsWith(":")
				|| mdcString.endsWith("<") || mdcString.endsWith("*") || mdcString
					.endsWith(">")|| mdcString
					.endsWith("<S"))) {
			mdcString += marker;
			return mdcString;
		} else {

			ArrayList<String> res = new ArrayList<String>();
			Pattern p = Pattern.compile("[-:<>*]");
			Matcher m = p.matcher(mdcString);
			int pos = 0;
			String last = null;
			int offset = 1;
			int index = 0;
			while (m.find()) {
				String next = mdcString.substring(pos, m.end() - offset);
				if (next.endsWith("-") || next.endsWith(":")
						|| next.endsWith("<") || next.endsWith("*")
						|| next.endsWith("<S")) {
					continue;
				} else if (next.endsWith(">")) {
					last = last + next;
					res.remove(index - 1);
					res.add(index, last);
				} else {
					res.add(next);
					index++;
				}
				System.out.println(next);
				pos = m.end() - offset;
				last = next;
			}

			if (pos < mdcString.length()) {
				String next = mdcString.substring(pos);
				if (next.endsWith("-") || next.endsWith(":")
						|| next.endsWith("<") || next.endsWith("*")
						|| next.endsWith(">") || next.endsWith("<S")) {
					last = last + marker + next;
					res.remove(index - 1);
					res.add(index - 1, last);
				} else if (index < res.size()) {
					last = res.get(index - 1);
					last += marker;
					res.set(index - 1, last);
					res.add(next);
				}

			} else {
				last = res.get(index - 1);
				last += marker;
				res.set(index - 1, last);
			}
			for (String s : res) {
				resultString += s;
			}
			return resultString;
		}
	}

	public void updateBTSWordFromMdCString(BTSWord word, String mdc,
			EditingDomain editingDomain)
	{
		List<BTSGraphic> toDelete = new ArrayList<BTSGraphic>(1);
		String[] tokens = splitSignsKeepDelimeters(mdc);
		int i = 0;
		int innerSentenceOrder = -1;
		for (i = 0; i < word.getGraphics().size(); i++)
		{
			BTSGraphic graphic = word.getGraphics().get(i);
			if (i < tokens.length)
			{
				Command command = SetCommand.create(editingDomain, graphic,
						BtsmodelPackage.Literals.BTS_GRAPHIC__CODE,
						tokens[i].toUpperCase());
				editingDomain.getCommandStack().execute(command);
				innerSentenceOrder = graphic.getInnerSentenceOrder();
			} else
			{
				toDelete.add(graphic);
			}
		}
		int createdIndex = 0;
		if (innerSentenceOrder == -1) {
			innerSentenceOrder = calculateSentenceOrder(word);
		}
		if (i < tokens.length + 1)
		{
			while (i < tokens.length)
			{
				BTSGraphic graphic = textService.createNewGraphic();
				createdIndex++;
				graphic.setCode(tokens[i].toUpperCase());
				graphic.setInnerSentenceOrder(innerSentenceOrder + createdIndex);
				Command command = AddCommand.create(editingDomain, word,
						BtsmodelPackage.Literals.BTS_WORD__GRAPHICS, graphic);
				editingDomain.getCommandStack().execute(command);
				i++;
			}
		} else if (!toDelete.isEmpty())
		{
			Command command = RemoveCommand.create(editingDomain, word,
					BtsmodelPackage.Literals.BTS_WORD__GRAPHICS, toDelete);
			editingDomain.getCommandStack().execute(command);
		}

	}

	private int calculateSentenceOrder(BTSWord word) {
		if (word.eContainer() instanceof BTSSenctence) {
			BTSSenctence sentence = (BTSSenctence) word.eContainer();
			int i = sentence.getSentenceItems().indexOf(word);
			if (i <= 0) {
				return 0; // no sibbling, first word
			} else {
				BTSSentenceItem leftSibbling = null;
				boolean found = false;
				while (!found) {
					leftSibbling = sentence.getSentenceItems().get(i - 1);
					if (leftSibbling instanceof BTSWord)
					{
						if (!((BTSWord) leftSibbling).getGraphics().isEmpty())
						{
							BTSGraphic last = ((BTSWord) leftSibbling).getGraphics().get(((BTSWord) leftSibbling).getGraphics().size()- 1);
							if (last != null)
							{
								return last.getInnerSentenceOrder();
							}
						}
					}
					else if (leftSibbling instanceof BTSAmbivalence) {
						if (!((BTSAmbivalence) leftSibbling).getCases().isEmpty())
						{
							int biggest = 0;
							for (BTSLemmaCase c : ((BTSAmbivalence) leftSibbling).getCases())
							{
								if (!c.getScenario().isEmpty())
								{
									for (BTSAmbivalenceItem item : c.getScenario())
									{
										if (item instanceof BTSWord)
										{
											if (!((BTSWord) leftSibbling).getGraphics().isEmpty())
											{
												BTSGraphic last = ((BTSWord) leftSibbling).getGraphics().get(((BTSWord) leftSibbling).getGraphics().size()- 1);
												if (last != null)
												{
													biggest = last.getInnerSentenceOrder() > biggest ? last.getInnerSentenceOrder() : biggest;
												}
											}
										}
									}
								}
							}
							if (biggest > 0) {
								return biggest;
							}
						}
					}
					i--;
					if (i <= 0) {
						return 0; // no sibbling, first word
					}
				}
				return 0; // no valid sibbling found
			}
		}
		return 0;
	}

	@Override
	public String transformTextToJSeshMdCString(BTSText text) {
		String result = "";
		if (text == null || text.getTextContent() == null
				|| text.getTextContent().getTextItems().isEmpty()) {
			return result;
		}
		for (BTSTextItems s : text.getTextContent().getTextItems()) {
			if (s instanceof BTSSenctence) {
				BTSSenctence sentence = (BTSSenctence) s;
				for (BTSSentenceItem item : sentence.getSentenceItems()) {
					List<Object> glyphs = new Vector<Object>();
					if (item instanceof BTSWord) {
						for (BTSGraphic g : ((BTSWord) item).getGraphics()) {
							if (!g.isIgnored()) {
								glyphs.add(g);
							}
						}

					} else if (item instanceof BTSMarker) {
						glyphs.add(new String("\"" + item.getType() + "\""));
					}
					Collections.sort(glyphs, getGlyphsStringComparator());
					for (int i = 0; i < glyphs.size(); i++) {
						Object o = glyphs.get(i);
						String mdc = "";
						if (o instanceof BTSGraphic) {
							mdc = ((BTSGraphic) o).getCode();
						} else {
							mdc = (String) o;
						}
						result += mdc;
						// if (!"".equals(mdc) && !mdc.endsWith(":")
						// && !mdc.endsWith("*") && !mdc.endsWith("<")
						// && !mdc.endsWith("[")) {
						// result += "-";
						// }
					}

				}
				result += "O-";
			}
		}
		return result;
	}

	private Comparator<? super Object> getGlyphsStringComparator() {
		if (glyphsStringComparator != null) {
			return glyphsStringComparator;
		} else {
			glyphsStringComparator = new Comparator<Object>() {

				@Override
				public int compare(Object o1, Object o2) {
					if (o1 != null && o2 != null) {
						if (o1 instanceof BTSGraphic
								&& o2 instanceof BTSGraphic) {
							return ((BTSGraphic) o1).getInnerSentenceOrder()
									- ((BTSGraphic) o2).getInnerSentenceOrder();
						}
					}
					return 0;
				}
			};
		}
		return glyphsStringComparator;
	}

	private String[] splitAndKeep(String input, int offset) {
		ArrayList<String> res = new ArrayList<String>();
		Pattern p = Pattern.compile("[-:<>*]");
		Matcher m = p.matcher(input);
		int pos = 0;
		String last = null;
		int index = 0;
		while (m.find()) {
			String next = input.substring(pos, m.end() - offset);
			if (next.endsWith("-") || next.endsWith(":") || next.endsWith("<")
					|| next.endsWith("*") || next.endsWith("<S")) {
				continue;
			} else if (next.endsWith(">")) {
				last = last + next;
				res.remove(index - 1);
				res.add(index - 1, last);
			} else {
				res.add(next);
				index++;
			}
			System.out.println(next);
			pos = m.end() - offset;
			last = next;
		}
		if (pos < input.length()) {
			String next = input.substring(pos);
			if (next.endsWith("-") || next.endsWith(":") || next.endsWith("<")
					|| next.endsWith("*") || next.endsWith(">")
					|| next.endsWith("<S")) {
				last = last + next;
				res.remove(index - 1);
				res.add(index - 1, last);
			} else {
				res.add(next);
			}
		}
		return res.toArray(new String[res.size()]);
	}

	public String[] splitSignsKeepDelimeters(String mdCString) {
		return splitAndKeep(mdCString, 1);
	}
}
