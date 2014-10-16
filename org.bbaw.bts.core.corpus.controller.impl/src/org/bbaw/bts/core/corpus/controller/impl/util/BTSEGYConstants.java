package org.bbaw.bts.core.corpus.controller.impl.util;

public class BTSEGYConstants {

	
	/**
	 * collator rule like eg "< a < b < c < d";
	 */
	public static final String EGY = new String("\uA722");
	public static final String EGY_COLLATOR_RULE = ("< '*' < '=' < '.' < '-' " +
			 "< '?' < 0 < 1"+
			 " < 2 < 3 < 4 < 5" +
			 " < 6 < 7 < 8 < 9 < ʾ"+
			  " < " +EGY + 
			  " < a,A < i̯ < j,J < e,E < Ꜥ < u̯ < w,W < b,B < p,P < f,F"
			+ "< m,M < n,N < r,R < l,L < h,H < ḥ < ḫ < h̭ < ẖ < z < s < š < q < k < g < t < ṱ < ṯ < d < ḏ");

	private BTSEGYConstants(){}
}
