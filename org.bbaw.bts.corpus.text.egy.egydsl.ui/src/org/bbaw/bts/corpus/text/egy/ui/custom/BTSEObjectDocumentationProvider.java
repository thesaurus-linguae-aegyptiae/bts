package org.bbaw.bts.corpus.text.egy.ui.custom;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.bbaw.bts.corpus.text.egy.egyDsl.WordPart;
import org.bbaw.bts.ui.commons.corpus.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import com.google.inject.Inject;

public class BTSEObjectDocumentationProvider implements
		IEObjectDocumentationProvider {

	@Inject
	private XtextSourceViewer textViewer;
	
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
			if (a instanceof BTSModelAnnotation) {
				Position pos = textViewer.getAnnotationModel()
						.getPosition(a);
				if (pos.offset == x)
				{
					if (a instanceof BTSLemmaAnnotation)
					{
						BTSLemmaEntry lemma = (BTSLemmaEntry) ((BTSLemmaAnnotation) a).getRelatingObject();
						if (lemma != null)
						{
							return "Lemma Id: " + lemma.get_id() + "\nLemma: " + lemma.getName();
						}
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


}
