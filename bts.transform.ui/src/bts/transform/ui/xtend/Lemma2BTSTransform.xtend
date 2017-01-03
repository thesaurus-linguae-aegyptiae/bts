package bts.transform.ui.xtend

import Btsaux.BwlenglType
import Btsaux.BwllinkType
import Btsaux.BwllistType
import Btsaux.DocumentRoot
import Btsaux.StupidXMLType
import bts.transform.ui.chars.CharsService
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Vector
import javax.inject.Inject
import org.bbaw.bts.btsmodel.BtsmodelFactory
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory
import org.eclipse.emf.ecore.util.FeatureMap
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.apache.commons.lang.StringUtils

class Lemma2BTSTransform {

	//	@Inject
	//	var IDService idService
	@Inject
	var BTSLemmaEntryService lemmaService

	var Map<String, BTSLemmaEntry> map = new HashMap<String, BTSLemmaEntry>
	
	boolean demotic
	
	Pattern commentGapPattern = Pattern.compile("(^[^;]*)([;\\s]*)")

	//	var Map<String, String> idmap = new HashMap<String, String>
	//	var Map<String, BTSThsEntry> rootmap = new HashMap<String, BTSThsEntry>
	//	val String[] rootNames = #["null", "2 = Aufbewahrungsorte, Museen",
	//"3 = Fundstellen",
	//"4 = Sprachen",
	//"5 = Schriftformen", "null",
	//"7 = Objekttypen", "null",
	//"9 = Datierungen",
	//"10 = Themen, Schlagwörter",
	//"11 = Textsorten"
	//
	//	]
	def transform(DocumentRoot root, boolean demotic) {
		this.demotic = demotic
		var List<BTSLemmaEntry> lemmata = new Vector<BTSLemmaEntry>
		var StupidXMLType stupid = retrieveStupid(root)

		// make roots
		//		makeRoots()
		//		for (r : rootmap.values)
		//		{
		//			if (r.name != "null")
		//			{
		//				lemmata.add(r);
		//			}
		//		}
		// make all others ths
		processBWLListEntries(stupid, lemmata)

		// process eng. translations
				for (BwlenglType bw : stupid.bwlengl)
				{
					processTranslation(bw)
				}
		// process eng. translations
		for (BwllinkType link : stupid.bwllink) {
			processLink(link)
		}

		//process references
		// owners
		//		for (t : lemmata)
		//		{
		//			if (!t.relations.empty)
		//			{
		//				for (r : t.relations)
		//				{
		//					if (r.type == "owner")
		//					{
		//						if (idmap.get(r.objectId) != null)
		//						{
		//							r.objectId = idmap.get(r.objectId)
		//							r.type = "partOf"
		//						}
		//					}
		//				}
		//			}
		//		}
		return lemmata
	}

	def processBWLListEntries(StupidXMLType stupid, List<BTSLemmaEntry> lemmata) {
				var counter = 0;
				var ls =  new Vector<BwllistType>
				for (e : stupid.group)
				{
					if (e.value instanceof BwllistType)
					{
						ls.add(e.value as BwllistType)
					}
				}
		for (BwllistType o :ls) {
			var BTSLemmaEntry t = makeLemma(o)
			map.put(o.wcn, t)
			lemmata.add(t);
			counter = counter + 1;

			if (counter == 130)
			{
				System.out.println(counter)
				
				}
		}
		System.out.println(counter)
	}

	def processLink(BwllinkType type) {
		if (map.containsKey(type.wcn)) {
			val l = map.get(type.wcn)
			{
				if (l != null) {
//					if (map.containsKey(type.lkey)) {
//						val lkey = map.get((type.lkey))
//						{
//							if (lkey != null) {

								// reference relation
								val rel = BtsmodelFactory.eINSTANCE.createBTSRelation
								switch type.ltype as String {
									case 'RFX': rel.type = "referencing"
									case 'RFY': rel.type = "referencedBy"
									case 'HIX': rel.type = "contains"
									case 'HIY': rel.type = "partOf"
									case 'COX': rel.type = "composedOf"
									case 'COY': rel.type = "composes"
									default: rel.type = "partOf"
								}
								var String objectId = null
								if (demotic) 
								{
									if (type.lkey.startsWith("-")) {
										objectId = "d" + type.lkey.replaceFirst("-", "m")
									} else {
										objectId = "d" + type.lkey
									}
								} else {
									objectId = type.lkey
								}
								rel.objectId = objectId
								l.relations.add(rel)

							// partOf hiearchical relation
							//								val rel2 = BtsmodelFactory.eINSTANCE.createBTSRelation
							//								rel2.type = "partOf"
							//								switch type.lclass as String {
							//								    case 'HI' : 
							//								    {
							//								    	rel2.objectId = l.get_id
							//										lkey.relations.add(rel2)
							//								    }
							//									case 'RF' : 
							//									{
							//								    	rel2.objectId = lkey.get_id
							//										l.relations.add(rel2)
							//								    }
							//								    default : rel2.type = "partOf"
							//								}
							}
//						}
//					}
//				}
			}
		}
	}

	def processTranslation(BwlenglType type) {

		if (type != null && type.wcn != null && map.containsKey(type.wcn)) {

			//			val key = map.get(type.wcn)
			//			if (key != null && map.containsKey(key)) {
			val l = map.get(type.wcn)

			if (l == null) {
				//					l.translations.setTranslation((type.elabel as String).replaceEntities, "en")
				//FIXME add ecomment
			} else {
				l.translations.setTranslation((type.elabel as String).replaceEntities, "en")
				var item = l.passport.getPassportEntryByPath("lemma>>main_group>>english_comment")
				if (item == null)
				{
					var group = l.passport.getPassportEntryByPath("lemma>>main_group")
					if (group == null)
					{
						var pGroup = l.passport.getPassportEntryByPath("lemma")
						val BTSPassportEntryGroup mainGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
						mainGroup.type = "main_group"
						pGroup.children.add(mainGroup)
					}
					item = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
					item.type = "english_comment"
					group.children.add(item)
				}
				item.value = type.ecomment as String

			//FIXME add ecomment
			}

		//			}
		}
	}

	def makeLemma(BwllistType type) {
		var t = lemmaService.createNew
		if (demotic) {
			if (type.wcn.startsWith("-")) {
				t.set_id = "d" + type.wcn.replaceFirst("-", "m")
			} else {
				t.set_id = "d" + type.wcn
			}
		} else {
			t.set_id = type.wcn
		}
		//name
		t.name = (type.lemma as String).replaceEntities

		// redaction
		switch type.redaction as String {
			case '-1': t.revisionState = "undefined"
			case '0': t.revisionState = "published-awaiting-review"
			case '1': t.revisionState = "published-awaiting-review"
			case '2': t.revisionState = "published"
			case '3': t.revisionState = "obsolete"
			case '4': t.revisionState = "published-obsolete"
			case '6': t.revisionState = "published-awaiting-review"
			case '7': t.revisionState = "published"
			case '8': t.revisionState = "new"
			case '9': t.revisionState = "published-obsolete"
			default: t.revisionState = "new"
		}

		// id ref
		val ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference
		ref.type = "aaew_wcn"
		ref.reference = type.wcn
		t.externalReferences.add(ref)
		t.updaters.add("SSchweitzer")
		t.visibility = "public"
		

		
		
		/// überprüfen
		if(t._id=="861909" || t._id=="861902")
		{
			System.out.println(t.name)
		}
		// words
		val names = new Vector<String>
		if (t.name.contains(" ")) {
			names.addAll(t.name.split("\\s"))
		} else {
			names.add(t.name)
		}
		for (s : names) {
			val w = BtsCorpusModelFactory.eINSTANCE.createBTSWord
			w.WChar = s
			t.words.add(w)
		}

		// de label		
		t.translations = BtsmodelFactory.eINSTANCE.createBTSTranslations
		t.translations.setTranslation((type.label as String).replaceEntities.normalizeWS, "de")

		// process wclasnum and set type and subtype
		processWClassnum(type, t)
		

		// passport
		val BTSPassport passport = BtsCorpusModelFactory.eINSTANCE.createBTSPassport
		val BTSPassportEntryGroup pGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
		t.passport = passport
		passport.children.add(pGroup)
		pGroup.type = "lemma"

		val BTSPassportEntryGroup mainGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
		mainGroup.type = "main_group"
		pGroup.children.add(mainGroup)

		val BTSPassportEntryItem ppEntryOldType = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		ppEntryOldType.type = "word_class"
		ppEntryOldType.value = type.wclass as String
		mainGroup.children.add(ppEntryOldType)

		val BTSPassportEntryItem ppEntryOldType2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		ppEntryOldType2.type = "wclassnum"
		ppEntryOldType2.value = type.wclassnum as String
		mainGroup.children.add(ppEntryOldType2)

		val BTSPassportEntryItem ppEntryOldId = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		ppEntryOldId.type = "woart"
		ppEntryOldId.value = type.woart
		mainGroup.children.add(ppEntryOldId)

		val BTSPassportEntryItem comment = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		comment.type = "comment"
		var String s = (type.kommentar as String).replaceEntities.replaceCommentGaps
		if (s != null)
		{
			comment.value = s
			mainGroup.children.add(comment)	
		}


		val BTSPassportEntryItem arb_vermerk = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		arb_vermerk.type = "arb_vermerk"
		var String abs = (type.arbVermerk as String).replaceEntities.replaceCommentGaps
		if (abs != null)
		{
			arb_vermerk.value = abs
			mainGroup.children.add(arb_vermerk)	
		}

		val BTSPassportEntryItem lsort = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		lsort.type = "lsort"
		lsort.value = (type.lsort as String).replaceEntities
		mainGroup.children.add(lsort)

		// date
		if (type.shortref != null) {
			val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
			passport.children.add(dGroup)
			dGroup.type = "bibliography"

			val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
			ppBegin.type = "bibliographical_text_field"
			ppBegin.value = type.shortref as String
			dGroup.children.add(ppBegin)

		}
		
		// glyphs
		if(type.glyphs != null && type.glyphs.length > 0)
		{
//			System.out.println(type.glyphs)
			var String[] hieros = type.glyphs.split("\\s");
//			System.out.println(hieros)
			var word = t.words.get(0)
			if (word == null)
			{
				word = BtsCorpusModelFactory.eINSTANCE.createBTSWord
				word.WChar = "??"
				t.words.add(word)
			}
			for (h : hieros)
			{
				var string = h
				if (string.length > 1 && StringUtils.isAlpha(string.substring(1,2)))
				{
					string = string.substring(0,1) + StringUtils.lowerCase(string.substring(1,2)) + string.substring(2)// to change AA to Aa to match jsesh Aa encoding
				}
				var g = BtsCorpusModelFactory.eINSTANCE.createBTSGraphic
				g.code = string
				word.graphics.add(g)
			}
		}
		
		// predecessor
		if (type.predecessor != null && type.predecessor.length > 0)
		{
			var String[] preds = type.predecessor.split(",")
			for (pred : preds)
			{
				var r = BtsmodelFactory.eINSTANCE.createBTSRelation
				r.type = "predecessor"
				var String objectId = null
				objectId = pred
				r.objectId = objectId.trim;
				t.relations.add(r)
			}
		}

		// successor
		if (type.successor != null && type.successor.length > 0)
		{
			var String[] sucs = type.successor.split(",")
			for (suc : sucs)
			{
				var r = BtsmodelFactory.eINSTANCE.createBTSRelation
				r.type = "successor"
				
				var String objectId = null
				if (suc.startsWith("-")) {
						objectId = "d" + suc.replaceFirst("-", "m")
					} else {
						objectId = "d" + suc
					}
				r.objectId = objectId.trim;
				t.relations.add(r)
			}
		}

		return t
	}
	
	def replaceCommentGaps(String string) {
		if (string == null) return null;
		var Matcher m = commentGapPattern.matcher(string)
		var String txt
		if (m.find)
		{
			txt = m.group(1)
		}
		txt = txt.trim();
		if (txt.length == 0) return null;
		return txt
	}
	
	def processWClassnum(BwllistType type, BTSLemmaEntry t) {
		//wclassnum
		switch type.wclassnum {
			case '0': {

				//unbestimmte Wortart
				t.type = "undefined"
			}
			case '1000': {

				//Substantiv (ohne Bestimmung des Geschlechts)
				t.type = "substantive"
			}
			case '1010': {

				//Substantiv, mask.
				t.type = "substantive"
				t.subtype = "substantive_masc"
			}
			case '1020': {

				//Substantiv, fem.
				t.type = "substantive"
				t.subtype = "substantive_fem"
			}
			case '2000': {

				//Adjektiv
				t.type = "adjective"
			}
			case '2010': {

				//Nisbeadjektiv, von einer Präposition abgeleitet
				t.type = "adjective"
				t.subtype = "nisbe_adjective_preposition"
			}
			case '2020': {

				//Nisbeadjektiv, von einem Substantiv abgeleitet
				t.type = "adjective"
				t.subtype = "nisbe_adjective_substantive"
			}
			case '3000': {

				//Adverb
				t.type = "adverb"
			}
			case '3010': {

				//Präpositionaladverb
				t.type = "adverb"
				t.subtype = "prepositional_adverb"
			}
			case '4000': {

				//Verb
				t.type = "verb"
			}
			case '4010': {

				//Verb, 2rad.
				t.type = "verb"
				t.subtype = "verb_2-lit"
			}
			case '4020': {

				//Verb, kaus. 2rad.
				t.type = "verb"
				t.subtype = "verb_caus_2-lit"
			}
			case '4030': {

				//Verb, 2gem.
				t.type = "verb"
				t.subtype = "verb_2-gem"
			}
			case '4040': {

				//Verb, kaus. 2gem.
				t.type = "verb"
				t.subtype = "verb_caus_2-gem"
			}
			case '4050': {

				//Verb, 3rad.
				t.type = "verb"
				t.subtype = "verb_3-lit"
			}
			case '4060': {

				//Verb, kaus. 3rad.
				t.type = "verb"
				t.subtype = "verb_caus_3-lit"
			}
			case '4070': {

				//Verb, 3inf.
				t.type = "verb"
				t.subtype = "verb_3-inf"
			}
			case '4080': {

				//Verb, kaus. 3inf.
				t.type = "verb"
				t.subtype = "verb_caus_3-inf"
			}
			case '4090': {

				//Verb, unregelmäßig
				t.type = "verb"
				t.subtype = "verb_irr"
			}
			case '4100': {

				//Verb, 3gem.
				t.type = "verb"
				t.subtype = "verb_3-gem"
			}
			case '4110': {

				//Verb, kaus. 3gem.
				t.type = "verb"
				t.subtype = "verb_caus_3-gem"
			}
			case '4120': {

				//Verb, 4inf.
				t.type = "verb"
				t.subtype = "verb_4-inf"
			}
			case '4130': {

				//Verb, kaus. 4inf.
				t.type = "verb"
				t.subtype = "verb_caus_4-inf"
			}
			case '4140': {

				//Verb, 4rad.
				t.type = "verb"
				t.subtype = "verb_4-lit"
			}
			case '4150': {

				//Verb, kaus. 4rad.
				t.type = "verb"
				t.subtype = "verb_caus_4-lit"
			}
			case '4160': {

				//Verb, 5inf.
				t.type = "verb"
				t.subtype = "verb_5-inf"
			}
			case '4170': {

				//Verb, 5rad.
				t.type = "verb"
				t.subtype = "verb_5-lit"
			}
			case '4180': {

				//Verb, kaus. 5rad.
				t.type = "verb"
				t.subtype = "verb_caus_5-lit"
			}
			case '4190': {

				//Verb, 6rad.
				t.type = "verb"
				t.subtype = "verb_6-lit"
			}
			case '5000': {

				//Präposition
				t.type = "preposition"
			}
			case '6000': {

				//Pronomen
				t.type = "pronoun"
			}
			case '6010': {

				//Demonstrativpronomen
				t.type = "pronoun"
				t.subtype = "demonstrative_pronoun"
			}
			case '6020': {

				//Personalpronomen
				t.type = "pronoun"
				t.subtype = "personal_pronoun"
			}
			case '6030': {

				//Relativpronomen
				t.type = "pronoun"
				t.subtype = "relative_pronoun"
			}
			case '6040': {

				//Fragepronomen
				t.type = "pronoun"
				t.subtype = "interrogative_pronoun"
			}
			case '7000': {

				//Partikel
				t.type = "particle"
			}
			case '7100': {

				//Partikel, nichtenkl.
				t.type = "particle"
				t.subtype = "particle_nonenclitic"
			}
			case '7200': {

				//Partikel, enkl.
				t.type = "particle"
				t.subtype = "particle_enclitic"
			}
			case '8000': {

				//Zahlwort
				t.type = "numeral"
			}
			case '8010': {

				//Kardinalzahl
				t.type = "numeral"
				t.subtype = "cardinal"
			}
			case '8020': {

				//Ordinalzahl
				t.type = "numeral"
				t.subtype = "ordinal"
			}
			case '9000': {

				//Interjektion
				t.type = "interjection"
			}
			case '10000': {

				//Personenname
				t.type = "entity_name"
				t.subtype = "person_name"
			}
			case '10010': {

				//Königsname
				t.type = "entity_name"
				t.subtype = "kings_name"
			}
			case '10020': {

				//Göttername
				t.type = "entity_name"
				t.subtype = "gods_name"
			}
			case '10030': {

				//Name eines Tieres
				t.type = "entity_name"
				t.subtype = "animal_name"
			}
			case '10040': {

				//Name einer Sache
				t.type = "entity_name"
				t.subtype = "artifact_name"
			}
			case '10045': {

				//Name einer Institution
				t.type = "entity_name"
				t.subtype = "org_name"
			}
			case '10050': {

				//Ortsname
				t.type = "entity_name"
				t.subtype = "place_name"
			}
			case '10060': {

				//Epitheton einer Gottheit
				t.type = "epitheton_title"
				t.subtype = "epith_god"
			}
			case '10070': {

				//Epitheton des Königs
				t.type = "epitheton_title"
				t.subtype = "epith_king"
			}
			case '10080': {

				//Titel
				t.type = "epitheton_title"
				t.subtype = "title"
			}
			default:
				t.revisionState = "undefined"
		}
	}

	def replaceEntities(String string) {
		return CharsService.replaceEntities(string, true)
	}

	//	def makeRoots() {
	//		for (var i = 0 ; i < rootNames.length ; i++)
	//		{
	//			val BTSThsEntry root = lemmaService.createNew;
	//			
	//		 	root.name = rootNames.get(i)
	//		 	rootmap.put(new Integer(i + 1).toString, root)
	//		 	// ref
	//		 	val ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference
	//		 	
	//			ref.type = "aaew_1"
	//			ref.reference = new Integer(i + 1).toString
	//			root.externalReferences.add(ref)
	//		 }
	//		 
	//	}
	def retrieveStupid(DocumentRoot root) {
		for (Object o : root.mixed) {

			//			System.out.println((o as EStructuralFeatureImpl.SimpleFeatureMapEntry).value)
			if (o instanceof FeatureMap.Entry && (o as FeatureMap.Entry).value instanceof StupidXMLType) {
				return (o as FeatureMap.Entry).value as StupidXMLType;
			}
		}
	}
	
	def normalizeWS(String string) {
		if (string == null) return null;
		var String txt = string.replaceAll("\\n+", " ");
		txt = txt.replaceAll("\\s+", " ").trim();
		return txt
	}
}
