package org.bbaw.bts.core.commons.corpus;

public class BTSCorpusConstants {
	
	public static final String CORPUS = "_corpus";

	public static final String CORPUS_INTERFIX = "_corpus_";

	public static final String WLIST = "_wlist";

	public static final String THS = "_ths";
	
	public static final String ATEXT = "_atext";


	/** The Constant VIEW_THS_ROOT_ENTRIES. */
	public static final String VIEW_THS_ROOT_ENTRIES = "ths/root_entries";

	/** The Constant VIEW_ALL_ACTIVE_BTSANNOTATIONS. */
	public static final String VIEW_ALL_ACTIVE_BTSANNOTATIONS = "objects/all_active_btsannotations";

	/** The Constant VIEW_ALL_ACTIVE_BTSIMAGESS. */
	public static final String VIEW_ALL_ACTIVE_BTSIMAGESS = "objects/all_active_btsimages";

	/** The Constant VIEW_ALL_ACTIVE_BTSLISTENTRIES. */
	public static final String VIEW_ALL_ACTIVE_BTSLISTENTRIES =  "lemma/all_active_lemmaentry_objects";

	/** The Constant VIEW_ALL_ACTIVE_BTSTCOBJECTS. */
	public static final String VIEW_ALL_ACTIVE_BTSTCOBJECTS = "objects/all_active_btstcobjects";

	/** The Constant VIEW_ALL_ACTIVE_BTSTEXTCORPUS. */
	public static final String VIEW_ALL_ACTIVE_BTSTEXTCORPUS = "corpus/all_active_btstextcorpus";

	/** The Constant VIEW_ALL_ACTIVE_BTSTEXTS. */
	public static final String VIEW_ALL_ACTIVE_BTSTEXTS = "objects/all_active_btstexts";

	/** The Constant VIEW_ALL_ACTIVE_BTSTHSENTRIES. */
	public static final String VIEW_ALL_ACTIVE_BTSTHSENTRIES = "ths/all_active_thsentry_objects";

	/** The Constant VIEW_ALL_ACTIVE_CORPUS_OBJECTS. */
	public static final String VIEW_ALL_ACTIVE_CORPUS_OBJECTS = "objects/all_active_corpus_objects";

	/** The Constant VIEW_ALL_BTSANNOTATIONS. */
	public static final String VIEW_ALL_BTSANNOTATIONS = "objects/all_btsannotations";

	/** The Constant VIEW_ALL_BTSIMAGESS. */
	public static final String VIEW_ALL_BTSIMAGESS = "objects/all_btsimages";

	/** The Constant VIEW_ALL_BTSLISTENTRIES. */
	public static final String VIEW_ALL_BTSLISTENTRIES = "lemma/all_lemmaentry_objects";

	/** The Constant VIEW_ALL_BTSTEXTCORPUS. */
	public static final String VIEW_ALL_BTSTEXTCORPUS = "corpus/all_btstextcorpus";

	/** The Constant VIEW_ALL_BTSTEXTS. */
	public static final String VIEW_ALL_BTSTEXTS = "objects/all_btstexts";

	/** The Constant VIEW_ALL_BTSTHSENTRIES. */
	public static final String VIEW_ALL_BTSTHSENTRIES = "ths/all_thsentry_objects";

	/** The Constant VIEW_ALL_CORPUS_OBJECTS. */
	public static final String VIEW_ALL_CORPUS_OBJECTS = "objects/all_corpus_objects";

	/** The Constant VIEW_ALL_DBLEASES. */
	public static final String VIEW_ALL_DBLEASES = "notification/all_dbleases";

	/** The Constant VIEW_ALL_TERMINATED_BTSANNOTATIONS. */
	public static final String VIEW_ALL_TERMINATED_BTSANNOTATIONS = "objects/all_terminated_btsannotations";

	/** The Constant VIEW_ALL_TERMINATED_BTSIMAGESS. */
	public static final String VIEW_ALL_TERMINATED_BTSIMAGESS = "objects/all_terminated_btsimages";

	/** The Constant VIEW_ALL_TERMINATED_BTSLISTENTRIES. */
	public static final String VIEW_ALL_TERMINATED_BTSLISTENTRIES = "lemma/all_terminated_lemmaentry_objects";

	/** The Constant VIEW_ALL_TERMINATED_BTSTCOBJECTS. */
	public static final String VIEW_ALL_TERMINATED_BTSTCOBJECTS = "objects/all_terminated_btstcobjects";

	/** The Constant VIEW_ALL_TERMINATED_BTSTEXTCORPUS. */
	public static final String VIEW_ALL_TERMINATED_BTSTEXTCORPUS = "corpus/all_terminated_btstextcorpus";

	/** The Constant VIEW_ALL_TERMINATED_BTSTEXTS. */
	public static final String VIEW_ALL_TERMINATED_BTSTEXTS = "objects/all_terminated_btstexts";

	/** The Constant VIEW_ALL_TERMINATED_BTSTHSENTRIES. */
	public static final String VIEW_ALL_TERMINATED_BTSTHSENTRIES = "ths/terminated_entries";

	/** The Constant VIEW_ALL_TERMINATED_CORPUS_OBJECTS. */
	public static final String VIEW_ALL_TERMINATED_CORPUS_OBJECTS = "objects/all_terminated_corpus_objects";

	/** The Constant VIEW_CORPUS_ROOT_OBJECTS. */
	public static final String VIEW_CORPUS_ROOT_OBJECTS = "objects/all_corpus_root_objects";

	public static final String VIEW_IMAGE_ROOT_ENTRIES = "image/root_entries";

	public static final String VIEW_LEMMA_ROOT_ENTRIES = "lemma/root_entries";

	public static final String LEMMATIZER_DOUBLE_POINT_PATTERN = "(.+:)(.+)";
	
	public static final String LEMMATIZER_POINT_PATTERN = "([^\\.]+)(.+)";
	
	public static final String LEMMATIZER_TRIPLE_POINT = new String(new char[]{'\u22ee'});

	public static final String LEMMATIZER_TRIPLE_EQUALS = new String(new char[]{'\u2261'});

	public static final String[] LEMMATIZER_ESCAPED_BRACKETS_ARRAY = new String[]{"\\(", "\\)", "\\{", "\\}", "\\[", "\\]", "〈", "〉",
		"⸮", "\\?",
		"⸢", "⸣",
		"𓉘", "𓊂",
		"𓊆", "𓊇",
		"𓍹", "𓍺"};

	public static final String LEMMATIZER_DELETION_PATTERN = "(\\{[^\\}]*\\}{1,2})";

	public static final String PREF_CORPUS_NAVIGATOR_SORTBYKEY = "pref_corpus_navigator_sortbysortkey";
	public static final String PREF_LEMMA_NAVIGATOR_SORTBYKEY = "pref_lemma_navigator_sortbysortkey";
	public static final String PREF_THS_NAVIGATOR_SORTBYKEY = "pref_ths_navigator_sortbysortkey";

	public static final String PREF_CORPUS_DEFAULT_VISIBILITY = "pref_corpus_default_visibility";
	public static final String PREF_CORPUS_DEFAULT_REVIEWSTATE = "pref_corpus_default_reviewState";

	public static final String PREF_LEMMA_DEFAULT_VISIBILITY = "pref_lemma_default_visibility";
	public static final String PREF_LEMMA_DEFAULT_REVIEWSTATE = "pref_lemma_default_reviewState";

	public static final String PREF_THS_DEFAULT_VISIBILITY = "pref_ths_default_visibility";
	public static final String PREF_THS_DEFAULT_REVIEWSTATE = "pref_ths_default_reviewState";

	public static final String PREF_ATEXT_DEFAULT_REVIEWSTATE = "pref_atext_default_reviewState";

	public static final String PREF_ATEXT_DEFAULT_VISIBILITY = "pref_atext_default_visibility";

	public static final String PREF_ATEXT_NAVIGATOR_SORTBYKEY = "pref_atext_navigator_sortbysortkey";

	public static final String PREF_COMMENT_COLOR = "pref_comment_color";

	public static final String PREF_SUBTEXT_COLOR = "pref_subtext_color";

	public static final String PREF_ANNOTATION_SETTINGS = "pref_annotation_settings";
	
	public static final String PREF_ANNOTATION_TYPE = "pref_annotation_type";

	public static final String PREF_ANNOTATION_SUBTYPE = "pref_annotation_subtype";
	
	public static final String PREF_COLOR = "pref_color";

	public static final String PREF_TOOLBAR_SHORTCUT = "pref_toolbar_shortcut";
	
	public static final String PREF_TOOLBAR_VISIBLE = "pref_toolbar_visible";

	public static final String PREF_HIGHLIGHTING_TYPE = "pref_highlighting_type";

	public static final String PREF_TOOLBAR_SHORTCUT_TIP = "pref_toolbar_shortcut_tip";
	
	public static final String ANNOTATION_HIGHLIGHTING_TYPE_UNDERLINE = "underline";

	public static final String ANNOTATION_HIGHLIGHTING_TYPE_TEXTCOLOR = "text color";
	
	public static final String ANNOTATION_HIGHLIGHTING_TYPE_BACKGROUND_COLOR ="background color";


	public static final String[] ANNOTATION_HIGHLIGHTING_TYPES = new String[]{ANNOTATION_HIGHLIGHTING_TYPE_UNDERLINE,
			ANNOTATION_HIGHLIGHTING_TYPE_TEXTCOLOR, ANNOTATION_HIGHLIGHTING_TYPE_BACKGROUND_COLOR};

	public static final String PREF_DEFAULT_HIGHLIGHTING_TYPE = ANNOTATION_HIGHLIGHTING_TYPE_UNDERLINE;


	private BTSCorpusConstants(){}

}
