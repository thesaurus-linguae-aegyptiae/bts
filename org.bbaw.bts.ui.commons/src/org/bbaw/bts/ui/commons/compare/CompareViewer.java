package org.bbaw.bts.ui.commons.compare;

public interface CompareViewer {
	
	boolean load(Object leftObject, boolean leftEditable, Object rightObject, boolean rightEditable);
	
	boolean save();

	void dispose();

}
