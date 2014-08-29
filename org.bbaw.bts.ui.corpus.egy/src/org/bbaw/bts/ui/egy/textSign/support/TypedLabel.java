package org.bbaw.bts.ui.egy.textSign.support;

import org.eclipse.draw2d.Label;

public class TypedLabel extends Label{
	
	public static final int LEMMA = 0;
	
	public static final int FLEXION = 1;
	
	public static final int TRANSLITATION = 2;
	
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
