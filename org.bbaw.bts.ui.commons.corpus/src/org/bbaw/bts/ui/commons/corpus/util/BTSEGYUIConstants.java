package org.bbaw.bts.ui.commons.corpus.util;

public class BTSEGYUIConstants {

	
	
	/**
	 * collator rule like eg "< a < b < c < d";
	 */
//	public static final String EGY = new String("\uA722");
//	public static final String EGY_COLLATOR_RULE = (
////			"< '*' < '=' < '.' < '-' " 
//////			 + "< '.', ';', ',', '~',  
////			 + "< '~', '_' " 
////			 + "< '+' "
////			 + "< '/','\\','!' "
////			 + "< '(',')','[',']' "
////			 + "< ,{,},〈,〉 " // text critical brackets
//			  "< \u2E2E, '?'" // disputable reading invers question mark
//			 + "< \u205D " // trplColon
//			 + "< \u2261 " // InterfixSuffixPronomLexical
//			 + "< \uD80C\uDF79,\uD80C\uDF7A,\uD80C\uDE86,\uD80C\uDE87,\uD80C\uDE58,\uD80C\uDE82, " // cartouche
////			 + "< 0 < 1 "
////			 + "< 2 < 3 < 4 < 5 " 
////			 + "< 6 < 7 < 8 < 9 "
//			 + "< ʾ "
//			 + "< \uA722, \uA723 " // alef
//			 + "< A,a < I,i < i̭,i̯,ı̯͗ < \u00CF, ï < J,j < I͗,ı͗ " 
//			 + "< Y,y "
//			 + "< \uA724, \uA725 " // ajin
//			 + "< E,e < u̯ < W,w < B,b < P,p < F,f "
//			 + "< M,m < N,n < R,r < L,l < H,h < Ḥ,ḥ < Ḫ,ḫ < H̭,h̭ < H̱,ẖ < Z,z "
//			 + "< S,s < Ś,ś < Š,š < Q,q < Ḳ,ḳ < K,k < G,g < T,t < Ṱ,ṱ < Ṯ,ṯ < Č,č < D,d < Ṭ,ṭ < Ḏ,ḏ < Č̣,č̣  "
//			 + "<\u00C6, ã < Õ,\u0152, \u0153 < Þ < \u0178 ");
	public static final String EGY_COLLATOR_RULE = ("< ' ' < '*' < '=' < '.' < '-' " 
//			 + "< '?' < 0 < 1 "
//			 + " < 2 < 3 < 4 < 5" 
//			 + " < 6 < 7 < 8 < 9 "
//			 + "< \u2E2E, '?'" // disputable reading invers question mark
//			 + "< \u205D " // trplColon
//			 + "< \u2261 " // InterfixSuffixPronomLexical
//			 + "< \uD80C\uDF79,\uD80C\uDF7A,\uD80C\uDE86,\uD80C\uDE87,\uD80C\uDE58,\uD80C\uDE82, " // cartouche
			 + "< ʾ "
			 + "< \uA722, \uA723 " // alef
			 + "< A,a < I,i < i̭,i̯,ı̯͗ < \u00CF, ï < J,j < I͗,ı͗ " 
			 + "< Y,y "
			 + "< \uA724, \uA725 " // ajin
			 + "< E,e < u̯ < W,w < B,b < P,p < F,f "
			 + "< M,m < N,n < R,r < L,l < H,h < Ḥ,ḥ < Ḫ,ḫ < H̭,h̭ < H̱,ẖ < Z,z "
			 + "< S,s < Ś,ś < Š,š < Q,q < Ḳ,ḳ < K,k < G,g < T,t < Ṱ,ṱ < Ṯ,ṯ < Č,č < D,d < Ṭ,ṭ < Ḏ,ḏ < Č̣,č̣  "
			 + "<\u00C6, ã < Õ,\u0152, \u0153 < Þ < \u0178 ");
	public static final String EGYDSL_INJECTOR = "org.bbaw.bts.corpus.text.egy.EgyDsl.injector";
	public static final String SIGN_TEXT_SHOW_HIEROGLYPHS = "sign-text-editor_show_hieroglyphs";
	public static final String SIGN_TEXT_SHOW_LEMMAID = "sign-text-editor_show_lemmaid";
	public static final String SIGN_TEXT_SHOW_FLEXION = "sign-text-editor_show_flexion";
	public static final String SIGN_TEXT_SHOW_TRANSLATION_DE = "sign-text-editor_show_translation_de";
	public static final String SIGN_TEXT_SHOW_TRANSLATION_EN = "sign-text-editor_show_translation_en";
	public static final String SIGN_TEXT_SHOW_TRANSLATION_FR = "sign-text-editor_show_translation_fr";
	public static final String SIGN_TEXT_SHOW_TRANSLATION_ES = "sign-text-editor_show_translation_es";
	public static final String SIGN_TEXT_SHOW_LINE_WIDTH = "sign-text-editor_line_width";
	public static final String PREF_LEMMATIZER_FELXION_DEFAULT = "pref_lemmatizer_flexion_default";
	public static final String EVENT_CLEAR_TOKEN_DATA = "event_clear_token_data";

	private BTSEGYUIConstants(){}
}
