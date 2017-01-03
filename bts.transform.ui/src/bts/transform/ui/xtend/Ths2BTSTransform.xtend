package bts.transform.ui.xtend

import Btsaux.DocumentRoot
import Btsaux.StupidXMLType
import java.util.List
import java.util.Vector
import javax.inject.Inject
import org.bbaw.bts.core.services.IDService
import org.bbaw.bts.core.services.corpus.BTSThsEntryService
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry
import org.eclipse.emf.ecore.util.FeatureMap
import Btsaux.ThsdataType
import java.util.HashMap
import java.util.Map
import org.bbaw.bts.btsmodel.BtsmodelFactory
import bts.transform.ui.chars.CharsService
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem

class Ths2BTSTransform {
	
	@Inject
	var IDService idService
	
	@Inject
	var BTSThsEntryService thsService
	
	var Map<String, BTSThsEntry> map = new HashMap<String, BTSThsEntry>
	var Map<String, String> idmap = new HashMap<String, String>
	
	var Map<String, BTSThsEntry> rootmap = new HashMap<String, BTSThsEntry>
	
	val String[] rootNames = #["null", "2 = Aufbewahrungsorte, Museen",
"3 = Fundstellen",
"4 = Sprachen",
"5 = Schriftformen", "null",
"null","null",
"9 = Datierungen",
"10 = Themen, Schlagwörter",
"11 = Textsorten",
"null","null","null","null","null","null","null","null","null",
"21 = Objekttyp",
"22 = Komponente",
"23 = Akteur",
"24 = Material",
"25 = Kontext",
"26 = Modell",
"27 = Imitation",
"28 = Miniatur",
"29 = Skeuomorph",
"30 = Abschrift"
	]
	
	def transform(DocumentRoot root)
	{
		var List<BTSThsEntry> thss = new Vector<BTSThsEntry>
		var StupidXMLType stupid = retrieveStupid(root)
		
		// make roots
		makeRoots()
		for (r : rootmap.values)
		{
			if (r.name != "null")
			{
				thss.add(r);
			}
		}
		
		// make all others ths
		for (ThsdataType o : stupid.thsdata)
		{
			var BTSThsEntry t = makeThs(o, thsService)
			map.put(t.get_id, t)
			thss.add(t);
		}
		
		
		//process references
		// owners
		for (t : thss)
		{
			if (!t.relations.empty)
			{
				for (r : t.relations)
				{
					if (r.type == "owner")
					{
						if (idmap.get(r.objectId) != null)
						{
							r.objectId = idmap.get(r.objectId)
							r.type = "partOf"
						}
					}
				}
			}
		}
		
		
		
		
		return thss
	}
	
	def makeThs(ThsdataType type, BTSThsEntryService service) {
		var t = service.createNew
		
		//name
		t.name = (type.term as String).replaceEntities
		t.revisionState = "published"
		t.visibility = "public"
		var thstype = type.thstype as String
		if (thstype == "2")
		{
			System.out.println("thstype " + thstype)
			t.type = "location"
		}
		else if (thstype == "3")
		{
			System.out.println("thstype " + thstype)
			t.type = "findSpot"
		}
		else if (thstype == "4")
		{
			System.out.println("thstype " + thstype)
			t.type = "language"
		}
		else if (thstype == "5")
		{
			System.out.println("thstype " + thstype)
			t.type = "script"
		}
		else if (thstype == "7")
		{
			System.out.println("thstype " + thstype)
			t.type = "objectType"
		}
		else if (thstype == "9")
		{
			System.out.println("thstype " + thstype)
			t.type = "date"
		}
		else if (thstype == "10")
		{
			System.out.println("thstype " + thstype)
			t.type = "subjects"
		}
		else if (thstype == "11")
		{
			System.out.println("thstype " + thstype)
			t.type = "textType"
		}
		else if (thstype == "21")
		{
			System.out.println("thstype " + thstype)
			t.type = "objecttype"
		}
		else if (thstype == "22")
		{
			System.out.println("thstype " + thstype)
			t.type = "component"
		}
		else if (thstype == "23")
		{
			System.out.println("thstype " + thstype)
			t.type = "actor"
		}
		else if (thstype == "24")
		{
			System.out.println("thstype " + thstype)
			t.type = "material"
		}
		else if (thstype == "25")
		{
			System.out.println("thstype " + thstype)
			t.type = "context"
		}
		else if (thstype == "26")
		{
			System.out.println("thstype " + thstype)
			t.type = "model"
		}
		else if (thstype == "27")
		{
			System.out.println("thstype " + thstype)
			t.type = "imitation"
		}
		else if (thstype == "28")
		{
			System.out.println("thstype " + thstype)
			t.type = "miniature"
		}
		else if (thstype == "29")
		{
			System.out.println("thstype " + thstype)
			t.type = "skeuomorph"
		}
		else if (thstype == "30")
		{
			System.out.println("thstype " + thstype)
			t.type = "copy"
		}
		// id ref
		val ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference
		ref.type = "aaew_1"
		ref.reference = thstype + "/" + type.thsct
		t.externalReferences.add(ref)
		idmap.put(ref.reference, t.get_id)
		
		// passport
		val BTSPassport passport = BtsCorpusModelFactory.eINSTANCE.createBTSPassport
		val BTSPassportEntryGroup pGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
		t.passport = passport
		passport.children.add(pGroup)
		pGroup.type = "thesaurus"
		
		val BTSPassportEntryGroup mainGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
		mainGroup.type = "main_group"
		pGroup.children.add(mainGroup)
		
		val BTSPassportEntryItem ppEntryOldType = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		ppEntryOldType.type = "old_thesaurus_number"
		ppEntryOldType.value = thstype
		mainGroup.children.add(ppEntryOldType)
		
		val BTSPassportEntryItem ppEntryOldId = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		ppEntryOldId.type = "old_id"
		ppEntryOldId.value = type.thsct
		mainGroup.children.add(ppEntryOldId)
		
		val BTSPassportEntryItem ppTermSort = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
		ppTermSort.type = "termsort"
		ppTermSort.value = (type.termsort as String).replaceEntities
		mainGroup.children.add(ppTermSort)
		
		// date
		if (type.yearfrom != 0) {
			val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
			passport.children.add(dGroup)
			dGroup.type = "thesaurus_date"

			val BTSPassportEntryGroup mainGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
			mainGroup2.type = "main_group"
			dGroup.children.add(mainGroup2)

			val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
			ppBegin.type = "beginning"
			ppBegin.value = type.yearfrom
			mainGroup2.children.add(ppBegin)

			val BTSPassportEntryItem ppEnd = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
			ppEnd.type = "end"
			ppEnd.value = type.yearto
			mainGroup2.children.add(ppEnd)
		}
		
		// add to root
		
		
		

		// owner
		if (type.thsowner != null && type.thsowner != "0")
		{
			val rel = BtsmodelFactory.eINSTANCE.createBTSRelation
			rel.type ="owner"
			rel.objectId = thstype + "/" + type.thsowner
			t.relations.add(rel)
		}
		else if (rootmap.containsKey(thstype))
		{
			var parent = rootmap.get(thstype)
			
			val rel = BtsmodelFactory.eINSTANCE.createBTSRelation
			rel.type ="partOf"
			rel.objectId = parent.get_id
			t.relations.add(rel)
		}
		// comment ist immer null
		
		return t
	}
	
	def replaceEntities(String string) {
		return CharsService.replaceEntities(string, true)
	}
	
	def makeRoots() {
		var i = 0
		for (rName : rootNames)
		{
			val BTSThsEntry root = thsService.createNew;
			root.revisionState = "published"
			
		 	root.name = rName
		 	root.type = getRootType(rName)
		 	rootmap.put(new Integer(i + 1).toString, root)
		 	// ref
		 	val ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference
		 	
			ref.type = "aaew_1"
			ref.reference = new Integer(i + 1).toString + "/0"
			root.externalReferences.add(ref)
			i = i+1
		 }
		 
	}
	
	def getRootType(String rootName) {
		var String type 
		if (rootName.startsWith("2"))
		{
			type = "location"
		}
		else if (rootName.startsWith("3"))
		{
			type = "findSpot"
		}
		else if (rootName.startsWith("4"))
		{
			type = "language"
		}
		else if (rootName.startsWith("5"))
		{
			type = "script"
		}
		else if (rootName.startsWith("7"))
		{
			type = "objectType"
		}
		else if (rootName.startsWith("9"))
		{
			type = "date"
		}
		else if (rootName.startsWith("10"))
		{
			type = "subjects"
		}
		else if (rootName.startsWith("11"))
		{
			type = "textType"
		}
		else if (rootName.startsWith("21"))
		{
			type = "objecttype"
		}
		else if (rootName.startsWith("22"))
		{
			type = "component"
		}
		else if (rootName.startsWith("23"))
		{
			type = "actor"
		}
		else if (rootName.startsWith("24"))
		{
			type = "material"
		}
		else if (rootName.startsWith("25"))
		{
			type = "context"
		}
		else if (rootName.startsWith("26"))
		{
			type = "model"
		}
		else if (rootName.startsWith("27"))
		{
			type = "imitation"
		}
		else if (rootName.startsWith("28"))
		{
			type = "miniature"
		}
		else if (rootName.startsWith("29"))
		{
			type = "skeuomorph"
		}
		else if (rootName.startsWith("30"))
		{
			type = "copy"
		}
	}
	
	def retrieveStupid(DocumentRoot root) {
		for (Object o : root.mixed) {
//			System.out.println((o as EStructuralFeatureImpl.SimpleFeatureMapEntry).value)
			if (o instanceof FeatureMap.Entry && (o as FeatureMap.Entry).value instanceof StupidXMLType)
			{
				return (o as FeatureMap.Entry).value as StupidXMLType ;
			}
		}
	}
}