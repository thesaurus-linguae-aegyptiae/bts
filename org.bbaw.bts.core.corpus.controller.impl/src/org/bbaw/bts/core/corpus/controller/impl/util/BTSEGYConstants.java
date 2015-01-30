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
			  " < \uA722, \uA723 " + // ajin
			  " < \uA724, \uA725 " + // ajin
			  " < A,a < I,i < i̯,ı̯͗ < ï < < J,j < E,e < Ꜥ < \u00CF,u̯ < W,w < B,b < P,p < F,f"
			+ "< M,m < N,n < R,r < L,l < H,h < Ḥ,ḥ < Ḫ,ḫ < H̭,h̭ < H̱,ẖ < Z,z "
			+ "< S,s < Š,š < Q,q < K,k < G,g < T,t < Ṭ,ṭ < Ṱ,ṱ < Ṯ,ṯ < D,d < Ḏ,ḏ ");

	private BTSEGYConstants(){}
}
