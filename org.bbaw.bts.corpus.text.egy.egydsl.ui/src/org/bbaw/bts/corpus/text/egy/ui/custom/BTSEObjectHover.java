package org.bbaw.bts.corpus.text.egy.ui.custom;

import org.bbaw.bts.corpus.text.egy.egyDsl.Marker;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class BTSEObjectHover extends DefaultEObjectHoverProvider {

	@Override
    protected String getFirstLine(EObject o) {
		SentenceItem w = findContainingWordRecursively(o);
		if (w != null)
		{
			try {
				return getSentenceItemFirstLine(w);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return super.getFirstLine(o);
    }

	private String getSentenceItemFirstLine(SentenceItem w) {
		INode node = NodeModelUtils.findActualNodeFor(w);
		return node.getText();
//		if (w instanceof Marker) return getMarkerFirstLine(w);
//		else if (w instanceof Word) return getWordFirstLine(w);
//		return super.getFirstLine(w);
	}

	private String getWordFirstLine(SentenceItem w) {
		return super.getFirstLine(w);
	}

	private String getMarkerFirstLine(SentenceItem w) {
		return super.getFirstLine(w);
	}

	private SentenceItem findContainingWordRecursively(EObject o) {
		if (o instanceof Word || o instanceof Marker) return (SentenceItem) o;
		while(o.eContainer() != null && !(o.eContainer() instanceof Word))
		{
			o = o.eContainer();
		}
		return (SentenceItem) o.eContainer();
	}
}