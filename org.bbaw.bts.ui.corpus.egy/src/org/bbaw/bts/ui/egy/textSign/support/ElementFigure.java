package org.bbaw.bts.ui.egy.textSign.support;

import org.eclipse.draw2d.IFigure;

public interface ElementFigure extends IFigure {

	String SENTENCE_START = "SENTENCE_START";

	String SENTENCE_END = "SENTENCE_END";

	String MARKER = "MARKER";

	String WORD = "WORD";

	String LEMMA_CASE = "LEMMA_CASE";

	String AMBIVALENCE_START = "AMBIVALENCE_START";

	String AMBIVALENCE_END = "AMBIVALENCE_END";

	public int getLength();

	public Object getModelObject();

	public void setModelObject(Object modelObject);

	public String getType();

	void setType(String type);
}
