package org.bbaw.bts.corpus.text.egy.ui.custom;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.bbaw.bts.corpus.text.egy.egyDsl.WordPart;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

public class BTSEObjectDocumentationProvider implements
		IEObjectDocumentationProvider {

	private XtextSourceViewer textViewer;
	private EmbeddedEditorModelAccess annotationModelAccess;
	
	BTSEObjectDocumentationProvider(){
		System.out.println("construct");
		
	}
	@Override
	public String getDocumentation(EObject o) {

		Word w = findContainingWordRecursively(o);
		if (w != null)
		{
			return getWordDocumentation(w);
		}
		return null;
	}

	private String getWordDocumentation(Word w) {
		String doc = "";
		for (WordPart p : w.getWChar())
		{
//			doc += p.;
		}
		INode node = NodeModelUtils.findActualNodeFor(w);
		int x = node.getOffset();
		if (textViewer == null) return null;
		Iterator it = textViewer.getAnnotationModel()
				.getAnnotationIterator();
		List<Annotation> annotations = new Vector<Annotation>(4);
		while (it.hasNext()) {
			Annotation a = (Annotation) it.next();
			if (a instanceof Annotation) {
				Position pos = textViewer.getAnnotationModel()
						.getPosition(a);
				if (pos.offset == x)
				{
					// FIXME machs vernünfigt!
					Method m;
					try {
						m = a.getClass().getMethod("getRelatingObject");
						Object o = m.invoke(a);
						if (o instanceof BTSLemmaEntry)
						{
							BTSLemmaEntry lemma = (BTSLemmaEntry) o;
							return "Lemma Id: " + lemma.get_id() + "\nLemma: " + lemma.getName();
						}
					} catch (NoSuchMethodException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
		return doc;
	}

	private Word findContainingWordRecursively(EObject o) {
		if (o instanceof Word) return (Word) o;
		while(o.eContainer() != null && !(o.eContainer() instanceof Word))
		{
			o = o.eContainer();
		}
		return (Word) o.eContainer();
	}
	public XtextSourceViewer getTextViewer() {
		return textViewer;
	}
	public void setTextViewer(XtextSourceViewer textViewer) {
		this.textViewer = textViewer;
	}
	public void setAnnotationModellAccess(
			EmbeddedEditorModelAccess annotationModelAccess) {
		this.annotationModelAccess = annotationModelAccess;
		
	}
	
	

}
