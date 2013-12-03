package org.bbaw.bts.core.corpus.controller.impl.partController;

import grammaticalBase.model.light.LightInflexion;
import grammaticalBase.model.light.LightLemma;
import grammaticalBase.model.light.LightSpelling;
import grammaticalBase.model.text.ElementOccurrence;
import grammaticalBase.model.text.TextModel;
import grammaticalBase.model.text.WordAnalysis;
import grammaticalBase.model.text.WordOccurrence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSMarker;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextItems;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.core.services.BTSTextService;
import org.bbaw.bts.ui.commons.text.LemmaAnnotation;
import org.bbaw.bts.ui.egy.parts.support.BTSEgySourceViewerConfiguration;
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

	private static final String MDC_DELIMETERS = ":-<> ";
	@Inject
	private BTSTextService textService;
	private int idcounter = 0;

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
				for (BTSSentenceItem sentenceItems : sentence.getSentenceItems())
				{
					appendToDoc(sentenceItems, doc, model, stringBuilder);
				}
			} else
			{
				appendToDoc(textItems, doc, model, stringBuilder);
			}
		}
		System.out.println(stringBuilder.toString());
		doc.set(stringBuilder.toString());

	}

	private void appendToDoc(BTSIdentifiableItem item, Document doc, IAnnotationModel model, StringBuilder stringBuilder)
	{
		if (item instanceof BTSWord)
		{
			BTSWord word = (BTSWord) item;
			Position pos = appendWordToDoc(word, doc, stringBuilder);
			appendWordToModel(word, model, pos);
		} else if (item instanceof BTSMarker)
		{
			BTSMarker del = (BTSMarker) item;
			Position pos = appendDelimiterToDoc(del, doc, stringBuilder);
			appendDelimiterToModel(del, model, pos);
		}
	}

	private void appendDelimiterToModel(BTSMarker del, IAnnotationModel model, Position pos)
	{
		// TODO Auto-generated method stub

	}

	private Position appendDelimiterToDoc(BTSMarker del, Document doc, StringBuilder stringBuilder)
	{
		return null;
		// TODO Auto-generated method stub

	}

	private void appendWordToModel(BTSWord word, IAnnotationModel model, Position position)
	{
		LemmaAnnotation annotation = new LemmaAnnotation((BTSIdentifiableItem) word);

		model.addAnnotation(annotation, position);

	}

	private Position appendWordToDoc(BTSWord word, Document doc, StringBuilder stringBuilder)
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
		LemmaAnnotation annotation = null;
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
						word = (BTSWord) annotation.getItem();
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

	private LemmaAnnotation getAnnotation(Annotation annotation, Iterator annotationIterator,
			IAnnotationModel annotationModel, String content, int pos, int len)
	{
		if (annotation != null)
		{
			Position position = annotationModel.getPosition(annotation);
			if (position != null)
			{
				if (position.getOffset() > pos)
				{
					return (LemmaAnnotation) annotation;
				}
			}
		}

		boolean forward = annotationIterator.hasNext();
		while (forward)
		{
			Object o = annotationIterator.next();
			annotation = (Annotation) o;
			if (!(annotation instanceof LemmaAnnotation))
			{
				continue;
			}
			Position position = annotationModel.getPosition(annotation);
			if (position != null)
			{
				if (position.getOffset() >= pos)
				{
					return (LemmaAnnotation) annotation;
				}

			}
			forward = annotationIterator.hasNext();
		}
		if (annotation instanceof LemmaAnnotation)
		{
			return (LemmaAnnotation) annotation;
		}
		return null;
	}

	@Override
	public boolean save(BTSText text)
	{
		return textService.save(text);
	}

	@Override
	public TextModel transformToRamsesTextModel(BTSText text, TextModel textModel,
			Map<Object, BTSSentenceItem> ramsesTextModelMap)
	{
		ramsesTextModelMap.clear();
		textModel.clear();
		if (text != null && !text.getTextContent().getTextItems().isEmpty())
		{
			return transformToRamsesTextModelInteral(text, textModel, ramsesTextModelMap);
		}
		return textModel;

	}

	private TextModel transformToRamsesTextModelInteral(BTSText text, TextModel textModel,
			Map<Object, BTSSentenceItem> ramsesTextModelMap)
	{
		for (BTSTextItems item : text.getTextContent().getTextItems())
		{
			if (item instanceof BTSSenctence && !((BTSSenctence) item).getSentenceItems().isEmpty())
			{
				for (BTSSentenceItem sentenceItem : ((BTSSenctence) item).getSentenceItems())
				{
					addSentenceItemToTextModel(sentenceItem, textModel, ramsesTextModelMap);
				}
			}
		}
		return textModel;
	}

	private void addSentenceItemToTextModel(BTSSentenceItem sentenceItem, TextModel textModel,
			Map<Object, BTSSentenceItem> ramsesTextModelMap)
	{
		if (sentenceItem instanceof BTSWord)
		{
			BTSWord word = (BTSWord) sentenceItem;
			WordOccurrence modelElement = new WordOccurrence();
			LightSpelling ls = new LightSpelling(idcounter++, word.getWChar(), transformWordToMdCString(word));
			//						ls.setEncodedOrder<ingTranslitteration(word.getWChar());

			ls.setLabel(word.getWChar() + " " + idcounter);
			ls.setTranslitteration(word.getWChar());
			modelElement.setSpelling(ls);
			modelElement.setFreeTranslitteration(word.getWChar());
			WordAnalysis wordAnalysis = new WordAnalysis();
			wordAnalysis.setSpelling(ls);
			LightLemma lightLemma = new LightLemma();
			lightLemma.setTranslitteration("hhhh");
			LightInflexion lightInflexion = new LightInflexion();
			lightInflexion.setInflexionName("hihihi");
			wordAnalysis.addInflexion(lightLemma, lightInflexion);
			modelElement.setWordAnalysis(wordAnalysis);
			textModel.add(modelElement);

			ramsesTextModelMap.put(modelElement, word);
		}

	}

	public String transformWordToMdCString(BTSWord word)
	{
		String mdc = "";
		if (!word.getGraphics().isEmpty())
		{
			for (BTSGraphic graphic : word.getGraphics())
			{
				mdc += graphic.getCode();
			}
		}
		return mdc;
	}

	@Override
	public BTSText updateTextFromRamsesModel(BTSText text, TextModel textModel,
			Map<Object, BTSSentenceItem> ramsesTextModelMap)
	{
		for (ElementOccurrence model : textModel.getText())
		{
			BTSSentenceItem item = ramsesTextModelMap.get(model.getElement());
			if (item != null)
			{
				if (item instanceof BTSWord)
				{
					BTSWord word = (BTSWord) item;
					updateBTSWordFromElementOccurence(word, model);
				}
			}
		}
		return text;
	}

	private void updateBTSWordFromElementOccurence(BTSWord word, ElementOccurrence model)
	{
		if (model.getElement() != null && model.getElement() instanceof WordOccurrence)
		{
			WordOccurrence occ = (WordOccurrence) model.getElement();
			LightSpelling spelling = occ.getSpelling();
			String mdc = spelling.getMdC();
			updateBTSWordFromMdCString(word, mdc);

		}

	}

	public void updateBTSWordFromMdCString(BTSWord word, String mdc)
	{
		StringTokenizer tokenizer = new StringTokenizer(mdc, MDC_DELIMETERS, true);
		List<BTSGraphic> toDelete = new ArrayList<BTSGraphic>(1);
		for (BTSGraphic graphic : word.getGraphics())
		{
			if (tokenizer.hasMoreTokens())
			{
				graphic.setCode(tokenizer.nextToken());
			} else
			{
				toDelete.add(graphic);
			}
		}
		if (tokenizer.hasMoreTokens())
		{
			while (tokenizer.hasMoreTokens())
			{
				BTSGraphic graphic = textService.createNewGraphic();
				graphic.setCode(tokenizer.nextToken());
				word.getGraphics().add(graphic);
			}
		} else if (!toDelete.isEmpty())
		{
			word.getGraphics().removeAll(toDelete);
		}

	}
}
