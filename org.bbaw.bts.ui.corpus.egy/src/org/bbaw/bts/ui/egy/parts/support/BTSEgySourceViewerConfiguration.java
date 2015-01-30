//package org.bbaw.bts.ui.egy.parts.support;
//
//import org.eclipse.jface.text.IDocument;
//import org.eclipse.jface.text.TextAttribute;
//import org.eclipse.jface.text.presentation.IPresentationReconciler;
//import org.eclipse.jface.text.presentation.PresentationReconciler;
//import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
//import org.eclipse.jface.text.rules.IRule;
//import org.eclipse.jface.text.rules.IToken;
//import org.eclipse.jface.text.rules.ITokenScanner;
//import org.eclipse.jface.text.rules.IWhitespaceDetector;
//import org.eclipse.jface.text.rules.IWordDetector;
//import org.eclipse.jface.text.rules.RuleBasedScanner;
//import org.eclipse.jface.text.rules.Token;
//import org.eclipse.jface.text.rules.WhitespaceRule;
//import org.eclipse.jface.text.rules.WordPatternRule;
//import org.eclipse.jface.text.rules.WordRule;
//import org.eclipse.jface.text.source.IAnnotationHover;
//import org.eclipse.jface.text.source.ISourceViewer;
//import org.eclipse.jface.text.source.SourceViewerConfiguration;
//import org.eclipse.swt.graphics.Color;
//import org.eclipse.swt.widgets.Display;
//
//public class BTSEgySourceViewerConfiguration extends SourceViewerConfiguration
//{
//
//	private RuleBasedScanner scanner;
//
//	public IPresentationReconciler getPresentationReconciler(ISourceViewer viewer)
//	{
//		PresentationReconciler reconciler = new PresentationReconciler();
//		DefaultDamagerRepairer dflt = new DefaultDamagerRepairer(createTokenScanner());
//		reconciler.setDamager(dflt, IDocument.DEFAULT_CONTENT_TYPE);
//		reconciler.setRepairer(dflt, IDocument.DEFAULT_CONTENT_TYPE);
//		return reconciler;
//	}
//
//	@Override
//	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer)
//	{
//		BTSAnnotationHover hover = new BTSAnnotationHover(sourceViewer);
//		return hover;
//	}
//
//	private ITokenScanner createTokenScanner()
//	{
//		RuleBasedScanner scanner = new RuleBasedScanner();
//		scanner.setRules(createRules());
//
//		this.setScanner(scanner);
//		return scanner;
//	}
//
//	private IRule[] createRules()
//	{
//		IToken word = new Token(new TextAttribute(new Color(Display.getCurrent(), 32, 178, 170)));
//
//		IToken startSentence = new Token(new TextAttribute(new Color(Display.getCurrent(), 220, 80, 100)));
//
//		IWordDetector startSentenceDetector = new IWordDetector()
//		{
//
//			@Override
//			public boolean isWordStart(char c)
//			{
//				if (c == '>')
//				{
//					return true;
//				}
//				return false;
//			}
//
//			@Override
//			public boolean isWordPart(char c)
//			{
//				if (c == '>')
//				{
//					return true;
//				}
//				return false;
//			}
//		};
//
//		IWordDetector endSentenceDetector = new IWordDetector()
//		{
//
//			@Override
//			public boolean isWordStart(char c)
//			{
//				if (c == '<')
//				{
//					return true;
//				}
//				return false;
//			}
//
//			@Override
//			public boolean isWordPart(char c)
//			{
//				if (c == '<')
//				{
//					return true;
//				}
//				return false;
//			}
//		};
//
//		IWordDetector nameDetector = new IWordDetector()
//		{
//			public boolean isWordStart(char c)
//			{
//				return Character.isLetter(c) || c == '_' || c == ':';
//			}
//
//			public boolean isWordPart(char c)
//			{
//				return isWordStart(c) || Character.isDigit(c) || c == '.' || c == '-';
//			}
//		};
//		WordRule wordRule = new WordRule(nameDetector, word);
//
//		IWhitespaceDetector wd = new IWhitespaceDetector()
//		{
//
//			@Override
//			public boolean isWhitespace(char c)
//			{
//				return c == ' ';
//			}
//		};
//		return new IRule[] { new WordPatternRule(startSentenceDetector, ">", ">", startSentence, '\\'),
//				new WordPatternRule(endSentenceDetector, "<", "<", startSentence, '\\'), new WhitespaceRule(wd),
//				wordRule };
//	}
//
//	public RuleBasedScanner getScanner()
//	{
//		if (scanner == null)
//		{
//			createTokenScanner();
//		}
//		return scanner;
//	}
//
//	public void setScanner(RuleBasedScanner scanner)
//	{
//		this.scanner = scanner;
//	}
//
//}
