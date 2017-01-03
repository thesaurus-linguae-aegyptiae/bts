package bts.transform.ui.xtend

import CorpusDTDneu.DocumentRoot
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject
import java.util.List
import java.util.Vector
import org.eclipse.emf.ecore.util.FeatureMap
import CorpusDTDneu.EgyTxtCorpusType
import CorpusDTDneu.TCCaptionType
import CorpusDTDneu.TCPassportType
import javax.inject.Inject
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService
import org.bbaw.bts.core.services.corpus.BTSTCObjectService
import org.bbaw.bts.core.services.corpus.CorpusObjectService
import org.bbaw.bts.core.services.corpus.BTSTextService
import org.bbaw.bts.core.services.corpus.BTSAnnotationService
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus
import org.eclipse.emf.ecore.EObject
import CorpusDTDneu.CorpusDTDneuPackage
import org.bbaw.bts.corpus.btsCorpusModel.BTSText
import bts.transform.ui.chars.CharsService
import CorpusDTDneu.TCTextType
import CorpusDTDneu.EgySentType
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent
import CorpusDTDneu.EgyWordType
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord
import org.bbaw.bts.btsmodel.BtsmodelFactory
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem
import java.util.Map
import org.bbaw.bts.btsmodel.AdministrativDataObject
import org.bbaw.bts.btsmodel.BTSRevision
import org.bbaw.bts.commons.BTSConstants
import java.util.Calendar
import java.util.Date
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation
import org.bbaw.bts.btsmodel.BTSInterTextReference
import org.eclipse.emf.common.util.EList
import CorpusDTDneu.EgyTB1Type
import CorpusDTDneu.LineCountType
import CorpusDTDneu.NoteType
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem
import org.bbaw.bts.btsmodel.BTSComment
import CorpusDTDneu.TypeType5
import bts.transform.ui.signs.SignService
import CorpusDTDneu.EgySubTxtType
import org.apache.commons.lang.StringUtils
import java.util.regex.Pattern
import java.util.regex.Matcher
import bts.transform.ui.thsMapping.ThsMappingService
import bts.transform.ui.usersRole.UserRoleService
import CorpusDTDneu.TCObjectType
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.BasicFeatureMap
import org.eclipse.emf.ecore.change.FeatureMapEntry
import CorpusDTDneu.EgyPunctuationType
import org.bbaw.bts.btsmodel.BTSIdentifiableItem

class Corpus2BTSTransform {

	@Inject
	private BTSTextCorpusService textCorpusService;

	@Inject
	private BTSTCObjectService tcObjectService;

	@Inject
	private CorpusObjectService corpusObjectService;

	@Inject
	private BTSTextService textService;

	@Inject
	private BTSAnnotationService annotationService;

	val List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>

	var String dbCollection

	var String projectPrefix

	var String corpusPrefix

	Map<String, String> userIdMap

	var Date now = Calendar.instance.time

	Map<String, String> userNameMap

	Map<String, String> thsDateMap

	Map<String, String> thsIdMap

	val List<BTSComment> comments = new Vector<BTSComment>

	Pattern MinusPattern = Pattern.compile("([^-])(-)([^-])")

	boolean demotic

	String fileName
	
	public static final String VERS_BREAK_MARKER_SIGN = "ð"; //v
	public static final String VERS_FRONTER_MARKER_SIGN = "°"; //mv

	public static final String BROKEN_VERS_MARKER_SIGN = "\uDB80\uDC82";
	public static final String DISPUTALBE_VERS_MARKER_SIGN = "\u2E2Eð?";
	public static final String DELETED_VERS_MARKER_SIGN = "{ð}";
	public static final String DESTROYED_VERS_MARKER_SIGN = "[ð]";
	public static final String MISSING_VERS_MARKER_SIGN = "\u2329ð\u232A";
	
	public static final String DESTROYEDVERSMARKER_SIGN   = "[ð]";
	public static final String DELETEDVERSMARKER_SIGN  = "{ð}";
	public static final String DISPUTABLEVERSMARKER_SIGN  = "\u2E2Eð?";
	public static final String  RESTORATIONOVERRASURMARKER_SIGN  = "[[ð]]";
	public static final String  ANCIENTEXPANDEDMARKER_SIGN  = "((ð))";
	public static final String  RASURMARKER_SIGN  = "{{ð}}";
	public static final String  EMENDATIONVERSMARKER_SIGN  = "(ð)";
	public static final String  DESTROYEDVERSFRONTIERMARKER_SIGN  = "[°]";
	public static final String  PARTIALDESTROYEDVERSMARKER_SIGN  = "\u2E22ð\u2E23";
	public static final String  PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN = "\u2E22\u2E2Eð?\u2E23";
	public static final String  DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN  = "[\u2E2E°?]";
	public static final String  DISPUTABLEDESTROYEDVERSMARKER_SIGN  = "\u2E2E[ð]?";
	public static final String  DELETEDDISPUTABLEVERSMARKER_SIGN = "{\u2E2Eð?}";
	public static final String  MISSINGDISPUTABLEVERSMARKER_SIGN  = "\u2329\u2E2Eð?\u232A";
	
	public static final String  DISPUTABLEDELETEDVERSMARKER_SIGN   = "\u2E2E{ð}? ";
	public static final String  PARTIALDESTROYEDDELETEDVERSMARKER_SIGN  = "\u2E22{ð}\u2E23";
	public static final String  DESTROYEDDELETEDVERSMARKER_SIGN   = "[{ð}]";
	public static final String  DELETEDDESTROYEDVERSMARKER_SIGN  = "{[ð]}";

	def transform(DocumentRoot root, String dbCollection, String projectPrefix, String corpusPrefix,
		Map<String, String> userIdMap, Map<String, String> userNameMap, Map<String, String> thsDateMap,
		Map<String, String> thsIdMap, boolean demotic, String fileName) {
		this.dbCollection = dbCollection
		this.projectPrefix = projectPrefix
		this.corpusPrefix = corpusPrefix
		this.userIdMap = userIdMap
		this.userNameMap = userNameMap
		this.thsDateMap = thsDateMap
		this.thsIdMap = thsIdMap
		this.demotic = demotic
		this.fileName = fileName

		// purge
		objects.clear
		comments.clear

		val EgyTxtCorpusType txtCorpus = retrieveEgyTxtCorpus(root)
		val BTSTextCorpus btsCorpus = makeTextCorpus(txtCorpus)
		
		processContainedObjects(txtCorpus, btsCorpus)

		System.out.println("nummer of transformed objects " + objects.size)
		return objects
	}

	def makeTextCorpus(EgyTxtCorpusType type) {
		val BTSTextCorpus btsCorpus = textCorpusService.createNew
		btsCorpus.name = corpusPrefix
		if (type.TCHeader.title != null) {
			btsCorpus.name = btsCorpus.name + "_" + type.TCHeader.title
		}
		objects.add(btsCorpus)
		btsCorpus.corpusPrefix = corpusPrefix
		btsCorpus.project = projectPrefix
		btsCorpus.DBCollectionKey = projectPrefix + "_corpus"
		btsCorpus.revisionState = UserRoleService.reviewState(fileName)
		btsCorpus.visibility = UserRoleService.getVisibility(fileName)
		
		var String user =  UserRoleService.getMainUser(fileName);
		if (user != null && userIdMap.containsKey(user)) {
			var BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision
			rev.setRef(0)
			rev.setTimeStamp(now)
			rev.setUserId(userIdMap.get(user))
			btsCorpus.addRevision(rev)
		}
		
		if (user != null && userNameMap.containsKey(user)) {
			btsCorpus.updaters.add(user)
		}
		// process header
		return btsCorpus
	}

	def void processContainedObjects(EObject type, BTSCorpusObject parent) {

		// caption
		var List<EObject> list = getListReferenceFeatureByName(type, "tccaption")
		if (list != null) {
			for (o : list) {
				makeTCCaption(o, parent)
			}
		}

		//tCArrangement
		list = getListReferenceFeatureByName(type, "tcarrangement")
		if (list != null) {
			for (o : list) {
				makeTCArrangement(o, parent)
			}
		}

		//tCScene
		list = getListReferenceFeatureByName(type, "tcscene")
		if (list != null) {
			for (o : list) {
				makeTCScene(o, parent)
			}
		}

		//group
		list = getListReferenceFeatureByName(type, "tcgroup")
		if (list != null) {
			for (o : list) {
				makeTCGroup(o, parent)
			}
		}

		//tcobject
		list = getListReferenceFeatureByName(type, "tcobject")
		if (list != null) {
			for (o : list) {
				makeTCObject(o, parent)
			}
		}

		//tCObjPart
		list = getListReferenceFeatureByName(type, "tcobjpart")
		if (list != null) {
			for (o : list) {
				makeTCObjectPart(o, parent)
			}
		}

		//text
		list = getListReferenceFeatureByName(type, "tctext")
		if (list != null) {
			for (o : list) {
				makeTCText(o, parent)
			}
		}
		
		//text
		list = getListReferenceFeatureByName(type, "tcsupertext")
		if (list != null) {
			for (o : list) {
				makeTCSuperText(o, parent)
			}
		}
	}

	def makeTCScene(EObject type, BTSCorpusObject parent) {
		val BTSTCObject tcObject = tcObjectService.createNewRelationPartOf(parent)
		tcObject.type = "Scene"
		processPassport(type, tcObject, true)
		processContainedObjects(type, tcObject)
		addToObjects(tcObject)
		System.out.println("make Scene " + tcObject.name)
	}

	def makeTCArrangement(EObject type, BTSCorpusObject parent) {
		val BTSTCObject tcObject = tcObjectService.createNewRelationPartOf(parent)
		tcObject.type = "Arrangement"
		processPassport(type, tcObject, true)
		processContainedObjects(type, tcObject)
		addToObjects(tcObject)
		System.out.println("make Arrangement " + tcObject.name)
	}

	def makeTCCaption(EObject type, BTSCorpusObject parent) {
		val BTSTCObject tcObject = tcObjectService.createNewRelationPartOf(parent)
		tcObject.type = "Caption"
		processPassport(type, tcObject, true)
		processContainedObjects(type, tcObject)
		addToObjects(tcObject)
		System.out.println("make Caption " + tcObject.name)

	}

	def makeTCGroup(EObject type, BTSCorpusObject parent) {
		val BTSTCObject tcObject = tcObjectService.createNewRelationPartOf(parent)
		tcObject.type = "Group"
		processPassport(type, tcObject, true)
		processContainedObjects(type, tcObject)
		addToObjects(tcObject)
		System.out.println("make Group " + tcObject.name)

	}

	def makeTCObject(EObject type, BTSCorpusObject parent) {
		val BTSTCObject tcObject = tcObjectService.createNewRelationPartOf(parent)
		tcObject.type = "TCObject"
		processPassport(type, tcObject, true)
		processContainedObjects(type, tcObject)
		addToObjects(tcObject)
		System.out.println("make TCObject " + tcObject.name)

	}
	
	def makeTCSuperText(EObject type, BTSCorpusObject parent) {
		val BTSTCObject tcObject = tcObjectService.createNewRelationPartOf(parent)
		tcObject.type = "TCSuperText"
		processPassport(type, tcObject, true)
		processContainedObjects(type, tcObject)
		addToObjects(tcObject)
		System.out.println("make TCSuperText " + tcObject.name)

	}

	def makeTCObjectPart(EObject type, BTSCorpusObject parent) {
		val BTSTCObject tcObject = tcObjectService.createNewRelationPartOf(parent)
		tcObject.type = "ObjectPart"
		processPassport(type, tcObject, true)
		processContainedObjects(type, tcObject)
		addToObjects(tcObject)
		System.out.println("make ObjectPart " + tcObject.name)

	}

	def makeTCText(EObject type, BTSCorpusObject parent) {
		var TCTextType textType = type as TCTextType
		val BTSText text = textService.createNewRelationPartOf(parent)
		text.type = "Text"
		processPassport(textType, text, true)
		processContainedObjects(type, text)
		addToObjects(text)
		
		if (text.name.contains("BM EA 1163"))
		{
			System.out.println("test")
		}

		var textContent = BtsCorpusModelFactory.eINSTANCE.createBTSTextContent
		text.textContent = textContent
		val egyText = textType.egyTxt
		if (egyText != null && egyText.group != null)
		{
			for (org.eclipse.emf.ecore.util.FeatureMap.Entry e : egyText.group) {
	
				if (e.value instanceof EgyTB1Type) {
					var egyTB = e.value as EgyTB1Type
					for (org.eclipse.emf.ecore.util.FeatureMap.Entry ee : egyText.group)
					{
						if (ee.value instanceof EgySentType)
						{
							makeSentence(text, ee.value as EgySentType, textContent, egyTB.name)
						}
					}
	
				} else if (e.value instanceof EgySentType) {
					makeSentence(text, e.value as EgySentType, textContent, null)
	
				} else if (e.value instanceof EgySubTxtType) // FIXME make subtext
				{
					var egyTB = e.value as EgySubTxtType
	
					if (fileName.contains("saw_medizin") || fileName.contains("saw_lit")
						||fileName.contains("leuven") ||fileName.contains("digitalheka")
					)
					{
						var BTSSentenceItem egytbfirstWord = null
						var BTSSentenceItem egytblastWord = null
						for (org.eclipse.emf.ecore.util.FeatureMap.Entry ee : egyTB.group) {
							if (ee.value instanceof EgySentType)
							{
								makeSentence(text, ee.value as EgySentType, textContent, null)
								if (egytbfirstWord == null && !textContent.textItems.empty)
								{
									var sen = textContent.textItems.get(textContent.textItems.size -1);
									if (sen != null && sen instanceof BTSSenctence && !(sen as BTSSenctence).sentenceItems.empty)
									{
										egytbfirstWord = (sen as BTSSenctence).sentenceItems.get(0)
									}
								}
							}
							else if (ee.value instanceof EgySubTxtType) // FIXME make subtext
							{
								var sub_egyTB = ee.value as EgySubTxtType
								var BTSSentenceItem subegytbfirstWord = null
								var BTSSentenceItem subegytblastWord = null
								for (sent2 : sub_egyTB.egySent)
								{
									if (sent2 instanceof EgySentType)
									{
										makeSentence(text, sent2, textContent, null)
										System.out.println("sentence count " + textContent.textItems.size)
										if (egytbfirstWord == null && !textContent.textItems.empty)
										{
											var sen = textContent.textItems.get(textContent.textItems.size -1);
											if (sen != null && sen instanceof BTSSenctence && !(sen as BTSSenctence).sentenceItems.empty)
											{
												egytbfirstWord = (sen as BTSSenctence).sentenceItems.get(0)
											}
										}
										if (subegytbfirstWord == null && !textContent.textItems.empty)
										{
											var sen = textContent.textItems.get(textContent.textItems.size -1);
											if (sen != null && sen instanceof BTSSenctence && !(sen as BTSSenctence).sentenceItems.empty)
											{
												subegytbfirstWord = (sen as BTSSenctence).sentenceItems.get(0)
											}
										}
										
										
										if (!textContent.textItems.empty)
										{
											var sen = textContent.textItems.get(textContent.textItems.size -1);
											if (sen != null && sen instanceof BTSSenctence && !(sen as BTSSenctence).sentenceItems.empty)
											{
												var senItem = (sen as BTSSenctence).sentenceItems.get(0) 
												if (senItem instanceof BTSWord)
												{
//												System.out.println("sentence first word " + (senItem as BTSWord).WChar)
												
												}
												else if (senItem instanceof BTSMarker)
												{
//													System.out.println("sentence first marker " + (senItem as BTSMarker).type)
												}

											}
										}
									}
								}
//								for (org.eclipse.emf.ecore.util.FeatureMap.Entry eee : sub_egyTB.group)
//								{
//									if (eee.value instanceof EgySentType)
//									{
//										makeSentence(text, eee.value as EgySentType, textContent, null)
//										System.out.println("sentence count " + textContent.textItems.size)
//										if (egytbfirstWord == null && !textContent.textItems.empty)
//										{
//											var sen = textContent.textItems.get(textContent.textItems.size -1);
//											if (sen != null && sen instanceof BTSSenctence && !(sen as BTSSenctence).sentenceItems.empty)
//											{
//												egytbfirstWord = (sen as BTSSenctence).sentenceItems.get(0)
//											}
//										}
//										if (subegytbfirstWord == null && !textContent.textItems.empty)
//										{
//											var sen = textContent.textItems.get(textContent.textItems.size -1);
//											if (sen != null && sen instanceof BTSSenctence && !(sen as BTSSenctence).sentenceItems.empty)
//											{
//												subegytbfirstWord = (sen as BTSSenctence).sentenceItems.get(0)
//											}
//										}
//									}
//								}
								if (subegytblastWord == null && !textContent.textItems.empty)
								{
									var sen = textContent.textItems.get(textContent.textItems.size -1);
									if (sen != null && sen instanceof BTSSenctence && !(sen as BTSSenctence).sentenceItems.empty)
									{
										subegytblastWord = (sen as BTSSenctence).sentenceItems.get((sen as BTSSenctence).sentenceItems.size -1)
									}
								}
								if(subegytbfirstWord != null)
									{
										makeAnnotation(text, subegytbfirstWord, subegytblastWord, "subtext", sub_egyTB.name)
									}
								}
								
							}
						
						if (egytblastWord == null && !textContent.textItems.empty)
							{
								var sen = textContent.textItems.get(textContent.textItems.size -1);
								if (sen != null && sen instanceof BTSSenctence && !(sen as BTSSenctence).sentenceItems.empty)
								{
									egytblastWord = (sen as BTSSenctence).sentenceItems.get((sen as BTSSenctence).sentenceItems.size -1)
								}
							}
							if(egytbfirstWord != null)
						{
							makeAnnotation(text, egytbfirstWord, egytblastWord, "subtext", egyTB.name)
						}
					}
					else
					{
						makeSubText(text, textContent, egyTB, textType)
					}
	
				}
			}
			
		}
		System.out.println("make Text " + text.name)
	}

	def void makeSubText(BTSText superText, BTSTextContent content, EgySubTxtType subtextType, EObject supertextType) {
		val BTSText subtext = textService.createNewRelationPartOf(superText)
		subtext.type = "subtext"
		processPassport(subtextType, subtext, false)
		processAuthorSubtext(subtextType, subtext, superText)
		processUpdaterSupText(subtextType, supertextType, subtext, superText)
		processContainedObjects(subtextType, subtext)
		addToObjects(subtext)
		if (subtextType.sortKey != null && subtextType.sortKey != 0)
		{
			try{
				subtext.sortKey = new Integer(subtextType.sortKey)
				
				}
				catch(Exception e)
				{	
				}
		}

		var textContent = BtsCorpusModelFactory.eINSTANCE.createBTSTextContent
		subtext.textContent = textContent
		for (org.eclipse.emf.ecore.util.FeatureMap.Entry e : subtextType.group) {

			if (e.value instanceof EgyTB1Type) {
				var egyTB = e.value as EgyTB1Type

				for (sentence : egyTB.egySent) {
					makeSentence(subtext, sentence, textContent, egyTB.name)
				}

			} else if (e.value instanceof EgySentType) {
				makeSentence(subtext, e.value as EgySentType, textContent, null)

			} else if (e.value instanceof EgySubTxtType) // FIXME make subtext
			{
				var egyTB = e.value as EgySubTxtType

				makeSubText(subtext, textContent, egyTB, subtextType)

			}
		}
		System.out.println("make Text " + subtext.name)
	}
	
	
	def makeSentence(BTSCorpusObject text, EgySentType type, BTSTextContent textContent, String annotationType) {
		val BTSSenctence btsSentence = BtsCorpusModelFactory.eINSTANCE.createBTSSenctence
		btsSentence.translation = BtsmodelFactory.eINSTANCE.createBTSTranslations
		btsSentence.translation.setTranslation(type.translat, determineTranslationLanguage(type, text))

		var BTSIdentifiableItem firstItem = null
		var BTSIdentifiableItem lastItem = null
		for (org.eclipse.emf.ecore.util.FeatureMap.Entry e : type.group) {
			if (e.value instanceof EgyTB1Type) {

				var egyTB = e.value as EgyTB1Type
				var BTSIdentifiableItem egytbfirstWord = null
				var BTSIdentifiableItem egytblastWord = null
				for (org.eclipse.emf.ecore.util.FeatureMap.Entry ee : egyTB.group) {
					if (ee.value instanceof EgyWordType)
					{
						var w = makeWord(text, ee.value as EgyWordType, btsSentence)
						if (firstItem == null) {
							firstItem = w
	
						}
						if (egytbfirstWord == null) {
							egytbfirstWord = w
	
						}
						egytblastWord = w;
						lastItem = w;
					}
					else if (ee.value instanceof EgyPunctuationType)
					{
						lastItem = makePunctuation(ee.value as EgyPunctuationType, btsSentence)
					if (firstItem == null) {
							firstItem = lastItem
				
						}
					}
					else if (ee.value instanceof LineCountType) {
						var lc = ee.value as LineCountType
						if (lc.value != null) {
							for (lcv : lc.value) {
								var BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker
								marker.setType("lc: " + lcv)
								btsSentence.sentenceItems.add(marker)
								if (firstItem == null) {
									firstItem = marker
		
								}
								lastItem = marker;
							}
						}
					} else if (ee.value instanceof NoteType) {
						var lc = ee.value as NoteType
						if (lc.value != null) {
							var BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker
							marker.setType("para: " + lc.value)
							btsSentence.sentenceItems.add(marker)
							if (firstItem == null) {
								firstItem = marker
		
							}
							lastItem = marker;
						}
					}
					
				}
				if (egytbfirstWord != null) {
					makeAnnotation(text, egytbfirstWord, egytblastWord, "subtext", egyTB.name)
				}
			} else if (e.value instanceof LineCountType) {
				var lc = e.value as LineCountType
				if (lc.value != null) {
					for (lcv : lc.value) {
						var BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker
						marker.setType("lc: " + lcv)
						btsSentence.sentenceItems.add(marker)
						if (firstItem == null) {
							firstItem = marker

						}
						lastItem = marker;
					}
				}
			} else if (e.value instanceof NoteType) {
				var lc = e.value as NoteType
				if (lc.value != null) {
					var BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker
					marker.setType("para: " + lc.value)
					btsSentence.sentenceItems.add(marker)
					if (firstItem == null) {
						firstItem = marker

					}
					lastItem = marker;
				}
			} else if (e.value instanceof EgyWordType) {
				var word = e.value as EgyWordType
				var w = makeWord(text, word, btsSentence)
				if (firstItem == null) {
					firstItem = w

				}
				lastItem = w;
				
			}else if (e.value instanceof EgyPunctuationType)
					{
						lastItem = makePunctuation(e.value as EgyPunctuationType, btsSentence)
					if (firstItem == null) {
							firstItem = lastItem
				
						}
					}
			 else if (e.value instanceof EgySentType) {
				var subsent = e.value as EgySentType
				
					var BTSIdentifiableItem egytbfirstWord = null
					var BTSIdentifiableItem egytblastWord = null
					for (word : subsent.egyWord) {
						var w = makeWord(text, word, btsSentence)
						if (firstItem == null) {
							firstItem = w
	
						}
						if (egytbfirstWord == null) {
							egytbfirstWord = w
	
						}
						egytblastWord = w;
						lastItem = w;
					}
					if (egytbfirstWord != null) {
						var String annoType = ""
						if (subsent.type != null && subsent.type.value == TypeType5.HS) {
							annoType = "main_clause"
						} else if (subsent.type != null && subsent.type.value == TypeType5.NS) {
							annoType = "subordinate_clause"
						} else {
							annoType = "unknown"
						}
						makeAnnotation(text, egytbfirstWord, egytblastWord, annoType, null)
					
					
				}
			}
		}
		if (type.comment != null && !"".equals(type.comment)) {
			makeComment(text, firstItem, lastItem, type.comment)
		}
		if (annotationType != null && !"".equals(annotationType)) {
			makeAnnotation(text, firstItem, lastItem, annotationType, null)
		}

		// line count
		//		if (!type.lineCount.empty) {
		//			for (lc : type.lineCount)
		//			{
		//				if (lc.value != null)
		//				{
		//					for (lcv : lc.value)
		//					{
		//						var BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker
		//						marker.setType(lcv)
		//						btsSentence.sentenceItems.add(marker)
		//					}
		//				}
		//			}
		//		}
		//		
		//		if (!type.egyTB1.empty)
		//		{
		//			for (egyTB : type.egyTB1)
		//			{
		//				var BTSWord firstWord = null
		//				var BTSWord lastWord = null
		//				for (word : egyTB.egyWord) {
		//					var w = makeWord(word, btsSentence)
		//					if (firstWord == null)
		//					{
		//						firstWord = w
		//					}
		//					lastWord = w;
		//				}
		//				if (firstWord != null)
		//				{
		//					makeAnnotation(text, firstWord, lastWord, egyTB.name)
		//				}
		//			}
		//		}
		//		
		//		// words
		//		for (word : type.egyWord) {
		//			makeWord(word, btsSentence)
		//
		//		}
		textContent.textItems.add(btsSentence)
		processAuthor(type, btsSentence)

		if (type.type != null) {
			btsSentence.setType(type.type.toString)
		}

	}
	
	def makePunctuation(EgyPunctuationType type, BTSSenctence btsSentence) {
		var BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker
//		if (type.type == "VP")
//		{
//			marker.setType(BTSConstants.TEXT_VERS_FRONTIER_MARKER)
//		} else if (type.type == "V")
//		{
//			marker.setType(BTSConstants.TEXT_VERS_BREAK_MARKER)
//		} else
//		{
//			marker.setType(BTSConstants.TEXT_VERS_BREAK_MARKER)
//		}
	var typeString = type.value
		if(typeString == VERS_FRONTER_MARKER_SIGN){ marker.type = BTSConstants.TEXT_VERS_FRONTIER_MARKER
			} 
				else if(typeString == VERS_BREAK_MARKER_SIGN){ marker.type =BTSConstants.TEXT_VERS_BREAK_MARKER
			} 
				else if(typeString == BROKEN_VERS_MARKER_SIGN){ marker.type =BTSConstants.BROKEN_VERS_MARKER
				
			}
				else if(typeString == DESTROYED_VERS_MARKER_SIGN){ marker.type =BTSConstants.DESTROYED_VERS_MARKER
				
			}
				else if(typeString == DELETED_VERS_MARKER_SIGN){ marker.type =BTSConstants.DELETED_VERS_MARKER
				
			}
				else if(typeString == DISPUTALBE_VERS_MARKER_SIGN){ marker.type =BTSConstants.DISPUTABLEVERSMARKER
				
			}
				else if(typeString == MISSING_VERS_MARKER_SIGN){ marker.type =BTSConstants.MISSING_VERS_MARKER
				
			}
			
			
			
				else if(typeString == DESTROYEDVERSMARKER_SIGN){ marker.type =BTSConstants.DESTROYEDVERSMARKER
				
			}
				else if(typeString == DELETEDVERSMARKER_SIGN){ marker.type =BTSConstants.DELETEDVERSMARKER
				
			}
				else if(typeString == DISPUTABLEVERSMARKER_SIGN){ marker.type =BTSConstants.DISPUTABLEVERSMARKER
				
			}
				else if(typeString == RESTORATIONOVERRASURMARKER_SIGN){ marker.type =BTSConstants.RESTORATIONOVERRASURMARKER
				
			}
				else if(typeString == ANCIENTEXPANDEDMARKER_SIGN){ marker.type =BTSConstants.ANCIENTEXPANDEDMARKER
				
			}
				else if(typeString == RASURMARKER_SIGN){ marker.type =BTSConstants.RASURMARKER
				
			}
				else if(typeString == EMENDATIONVERSMARKER_SIGN){ marker.type =BTSConstants.EMENDATIONVERSMARKER
				
			}
				else if(typeString == DESTROYEDVERSFRONTIERMARKER_SIGN){ marker.type =BTSConstants.DESTROYEDVERSFRONTIERMARKER
				
			}
				else if(typeString == PARTIALDESTROYEDVERSMARKER_SIGN){ marker.type =BTSConstants.PARTIALDESTROYEDVERSMARKER
				
			}
				else if(typeString == PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN){ marker.type =BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER
				
			}
				else if(typeString == DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN){ marker.type =BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER
				
			}
				else if(typeString == DISPUTABLEDESTROYEDVERSMARKER_SIGN){ marker.type =BTSConstants.DISPUTABLEDESTROYEDVERSMARKER
				
			}
			
			
				else if(typeString == DELETEDDISPUTABLEVERSMARKER_SIGN){ marker.type =BTSConstants.DELETEDDISPUTABLEVERSMARKER
				
			}
			
				else if(typeString == MISSINGDISPUTABLEVERSMARKER_SIGN){ marker.type =BTSConstants.MISSINGDISPUTABLEVERSMARKER
				
			}
				else if(typeString == DISPUTABLEDELETEDVERSMARKER_SIGN){ marker.type =BTSConstants.DISPUTABLEDELETEDVERSMARKER
				
			}
				else if(typeString == PARTIALDESTROYEDDELETEDVERSMARKER_SIGN){ marker.type =BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER
				
			}
				else if(typeString == DESTROYEDDELETEDVERSMARKER_SIGN){ marker.type =BTSConstants.DESTROYEDDELETEDVERSMARKER
				
			}
				else if(typeString == DELETEDDESTROYEDVERSMARKER_SIGN){ marker.type =BTSConstants.DELETEDDESTROYEDVERSMARKER
				
			}
//		marker.name = typeString
		btsSentence.sentenceItems.add(marker)
		return marker
	}

	def determineTranslationLanguage(EgySentType type, BTSCorpusObject object) {
		var o = type.author
		var author = Integer.parseInt(o as String)
		switch (author) {
			case 26: return "en"
			case 52: return "fr"
			case 60: return "en"
			case 59: return "en"
			case 64: return "fr"
			case 65: return "fr"
		}
		return "de"
	}

	def makeComment(BTSCorpusObject object, BTSIdentifiableItem item, BTSIdentifiableItem item2, String commentString) {
		val BTSComment comment = BtsmodelFactory.eINSTANCE.createBTSComment
		comment.revisionState = "published"
		comment.visibility = "public"
		comment.comment = commentString
		comment.DBCollectionKey = projectPrefix + "_admin"

		val relation = BtsmodelFactory.eINSTANCE.createBTSRelation
		relation.objectId = object.get_id
		relation.type = "partOf"
		comment.relations.add(relation)

		if (item != null && item2 != null) {
			val BTSInterTextReference ref1 = BtsmodelFactory.eINSTANCE.createBTSInterTextReference
			ref1.setBeginId(item.get_id)
			ref1.setEndId(item2.get_id)
			relation.parts.add(ref1)
		}

		addToComments(comment)
		var BTSRevision revParent = object.lastRevision
		if (revParent != null) {
			var BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision
			rev.setRef(0)
			rev.setTimeStamp(now)
			rev.setUserId(revParent.userId)
			comment.addRevision(rev)
		}
		for (String u : object.updaters) {
			comment.updaters.add(u)
		}
	}

	def addToComments(BTSComment comment) {
		comments.add(comment)
		comment.DBCollectionKey = "admin"
	}

	def normalizeWS(String string) {
		if(string == null) return null;
		var String txt = string.replaceAll("\\n+", " ");
		txt = txt.replaceAll("\\s+", " ").trim();
		return txt
	}

	def makeAnnotation(BTSCorpusObject object, BTSIdentifiableItem word, BTSIdentifiableItem word2, String type, String name) {
		val BTSAnnotation anno = BtsCorpusModelFactory.eINSTANCE.createBTSAnnotation
		if (((type != null && type.equals("Rubrum"))) || (name != null && name.equals("Rubrum"))) {
			anno.type = "rubrum"
		} else if (name != null) {
			anno.name = name
		}
		anno.revisionState = "published"
		anno.visibility = "public"
		
		val relation = BtsmodelFactory.eINSTANCE.createBTSRelation
		relation.objectId = object.get_id
		relation.type = "partOf"
		anno.relations.add(relation)

		if (word != null && word2 != null) {
			val BTSInterTextReference ref1 = BtsmodelFactory.eINSTANCE.createBTSInterTextReference
			ref1.setBeginId(word.get_id)
			ref1.setEndId(word2.get_id)
			relation.parts.add(ref1)
		}

		addToObjects(anno)
		var BTSRevision revParent = object.lastRevision
		if (revParent != null) {
			var BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision
			rev.setRef(0)
			rev.setTimeStamp(now)
			rev.setUserId(revParent.userId)
			anno.addRevision(rev)
		}
		for (String u : object.updaters) {
			anno.updaters.add(u)
		}
	}

	def makeWord(BTSCorpusObject object, EgyWordType word, BTSSenctence sentence) {

		var String wchar

		// special cases
		if ((word.form != null && word.form == "-NN-") || (word.form.startsWith("--") && word.form.endsWith("--")))
		{
//			make
			var BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker
			marker.setType(BTSConstants.DESTRUCTION_MARKER)
			if (word.form == "-NN-")
			{
				marker.name = "--NN--"
			} else
			{
				var s = word.form.replaceEntities.replaceI.normalizeDestruction.replaceEmptyBrackets
				if (s.startsWith("--"))
				{
					s = s.substring(2)
				}
				if (s.endsWith("--"))
				{
					s = s.substring(0, s.length -2)
				}
				if (s.length == 0)
				{
					marker.name = "--NN--"
				}
				else
				{
					marker.name = s
				}
				
			}
			sentence.sentenceItems.add(marker)
			return marker
		} else {
			wchar = word.form.trim
		}

		//		ordinary case, make word
		val BTSWord btsWord = BtsCorpusModelFactory.eINSTANCE.createBTSWord

		wchar = wchar.replaceEntities.replaceI.normalizeDestruction.replaceEmptyBrackets

		// if CT text do special replacements
		if (object.name.startsWith("CT")) {
			wchar = wchar.doCTspecialReplacements
		}

		btsWord.WChar = wchar
		
		if ( word.LKey != "0")
		{
			if (demotic) {
				if (word.LKey.startsWith("-")) {
					btsWord.LKey = "d" + word.LKey.replaceFirst("-", "m")
				} else {
					btsWord.LKey = "d" + word.LKey
				}
			} else {
				btsWord.LKey = word.LKey
			}
			
		}
		btsWord.translation = BtsmodelFactory.eINSTANCE.createBTSTranslations

		//flexion
		btsWord.flexCode = word.FKey

		// translation
		if (word.translat != null && word.translat.trim.length > 0) {
			btsWord.translation.setTranslation(word.translat.trim.replaceEntities.normalizeWS, "de")
		}

		// graphics
		if (word.graphics != null && word.graphics.trim.length > 0) {
			var boolean first = true
			for (String s : word.graphics.split("\\s")) {
				var string = s
				if (s.length > 1 && StringUtils.isAlpha(s.substring(1,2)))
				{
					string = s.substring(0,1) + StringUtils.lowerCase(s.substring(1,2)) + string.substring(2)// to change AA to Aa to match jsesh Aa encoding
				}
				
	
	// testing
	if (object.name.contains("Prozessakten"))
	{
		System.out.println(string)
	}
				// special gardiner numbers for cartouche
				//				if ("ZW1".equals(string)) {
				//					string = "<"
				//				} else if ("ZW2".equals(string)) {
				//					string = ">"
				//				}
				string = string.replaceSigns
				var BTSGraphic g = BtsCorpusModelFactory.eINSTANCE.createBTSGraphic

				// insert default mdc
				if (first) {
					g.code = string
					first = false
				} else {
					g.code = "-" + string
				}

				btsWord.graphics.add(g)
			}
		}
		sentence.sentenceItems.add(btsWord)

//		processAuthor(word, btsWord)

		if (word.comment != null && !"".equals(word.comment)) {
			makeComment(object, btsWord, btsWord, word.comment);
		}
		return btsWord
	}

	def getReplaceEmptyBrackets(String string) {
		if(string == null) return null

		var String result = string.replaceAll("\\[\\s*\\]", "")
		result = result.replaceAll("〈 〉", "")
		result = result.replaceAll(" ", "_")
		result = result.replaceAll("#", "")
		// nach entfernen von Kartuschen, leere klammern entfernen
		result = result.replaceAll("⸢⸣", "")
		result = result.replaceAll("〈〉", "")
//		result = result.replaceAll("⸮?", "")
		result = result.replaceAll("\\{\\}", "")
		result = result.replaceAll("\\(\\)", "")
		return result

	}

	def doCTspecialReplacements(String string) {
		if(string == null) return null

		//		if(string.contains("|"))
		//		{
		////			System.out.println("TC replacements " + string)
		////			System.out.print("")
		//		}
		var String result = string
		result = result.replaceAll("\\[\\.\\.\\. x Q\\. \\.\\.\\.\\]", "--x Q.--")
		result = result.replaceAll("\\[__x_Q\\.__\\]", "--x Q.--")
		if (result.contains("&verse;|#Q|&verse;")) {
			result = result.replaceAll("&verse;\\|#Q\\|&verse;", "_")
		}
		if (result.contains("&verse;|#R|&verse;")) {
			result = result.replaceAll("&verse;\\|#R\\|&verse;", "_")
		}
		if (result.contains("&verse;|#&dUs;|&verse;")) {
			result = result.replaceAll("&verse;\\|#&dUs;\\|&verse;", "_")
		}
		if (result.contains("&verse;|#P|&verse;")) {
			result = result.replaceAll("&verse;\\|#P\\|&verse;", "_")
		}
		if (result.contains("&verse;|#I|&verse;")) {
			result = result.replaceAll("&verse;\\|#I\\|&verse;", "_")
		}
		if (result.contains("&verse;|#E|&verse;")) {
			result = result.replaceAll("&verse;\\|#E\\|&verse;", "_")
		}

		if (result.contains("$|")) {
			result = result.replaceAll("\\$\\|", "〈")
		}
		if (result.contains("|$")) {
			result = result.replaceAll("\\|\\$", "〉")
		}

		result = result.replaceAll("\\{\\+", "{")
		result = result.replaceAll("\\+\\}", "}")

		result = result.replaceAll("\\[\\|", "⸢")
		result = result.replaceAll("\\|\\]", "⸣")

		result = result.replaceAll("\\{\\|", "{{")
		result = result.replaceAll("\\|\\}", "}}")

		result = result.replaceAll(">\\|", "((")
		result = result.replaceAll("\\|<", "))")

		result = result.replaceAll("\\?\\|", "⸮")
		result = result.replaceAll("\\|\\?", "?")

		result = result.replaceAll("&\\|", "〈〈")
		result = result.replaceAll("\\|&", "〉〉")

		result = result.replaceAll("#\\|", "")
		result = result.replaceAll("\\|#", "")
		result = result.replaceAll("%\\|", "")
		result = result.replaceAll("\\|%", "")
		result = result.replaceAll("!\\|", "")
		result = result.replaceAll("\\|!", "")

		result = result.replaceAll("\\{,\\|", "--")
		result = result.replaceAll("\\|,\\}", "--")
		result = result.replaceAll(",\\|", "--")
		result = result.replaceAll("\\|,", "--")

		result = result.replaceAll("\\.\\.\\.", "_")

		result = result.replaceAll("\\|", "")

		result = result.replaceAll("\\[\\.\\.\\. x Q\\. \\.\\.\\.\\]", "--x Q.--")
		result = result.replaceAll("\\[__x_Q\\.__\\]", "--x Q.--")

		result = result.replaceAll("\\[__1_q\\.__\\]", "--1 Q.--") //[__1_q.__]
		result = result.replaceAll("\\[__2_q\\.__\\]", "--2 Q.--") //[__1_q.__]
		result = result.replaceAll("\\[__1/2_q\\.__\\]", "--1/2 Q.--") //[__1_q.__]
		result = result.replaceAll("\\[__3_q\\.__\\]", "--3 Q.--") //[__1_q.__]
		result = result.replaceAll("\\[__1_1/2_q\\.__\\]", "--1 1/2 Q.--") //[__1_q.__]

		//		System.out.println("TC replacements " + result)
		return result
	}

	def normalizeDestruction(String string) {
		if(string == null) return null
		var String result = string
		if (string.contains("---")) {
			result = string.replaceAll("---", "--")
		}
		if (result.contains("--")) // if destruction, replace single minus
		{
			var Matcher m = MinusPattern.matcher(result)
			if (m.find) {
				result = m.replaceAll("$1_$3")
			}
		}

		result = string.replaceAll("\\(\\?\\)", "(_)")
		return result
	}

	def replaceI(String string) {
		if (string != null && (string.contains("rdi") || string.contains("jri"))) {
			var replace = string.replaceAll("i", '\u0069\u032F')
			replace = replace.replaceAll("\u032F\u032F", '\u032F')
			return replace
		}
		return string
	}

	def replaceSigns(String string) {
		return SignService.replaceSigns(string)
	}

	def processAuthor(EObject type, AdministrativDataObject object) {
		var String user = getStringFeatureByName(type, "Author");
		if (user == null || user.equals("0")) {
			user = UserRoleService.getMainUser(fileName);
		}
		if (user != null && userIdMap.containsKey(user)) {
			var BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision
			rev.setRef(0)
			rev.setTimeStamp(now)
			rev.setUserId(userIdMap.get(user))
			object.addRevision(rev)
		}

	}

	def processAuthorSubtext(EgySubTxtType type, BTSText object, BTSText supertext) {
		var String user = getStringFeatureByName(type, "Author");
		if (user != null && userIdMap.containsKey(user)) {
			var BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision
			rev.setRef(0)
			rev.setTimeStamp(now)
			rev.setUserId(userIdMap.get(user))
			object.addRevision(rev)
		}
		else {
			var BTSRevision rev = supertext.getRevision(0);
			if (rev != null)
			{
				user = rev.userId
				
				rev.setRef(0)
				rev.setTimeStamp(now)
				rev.setUserId(user)
				object.addRevision(rev)
			
			}
		}
		
	}
	def processUpdater(EObject type, BTSCorpusObject object) {
		var String user = getStringFeatureByName(type, "Author");
		if (user != null && userNameMap.containsKey(user)) {
			object.updaters.add(userNameMap.get(user))
		}
	}
	def processUpdaterSupText(EObject type, EObject superTexttype, BTSCorpusObject object, BTSText supertext) {
		var String user = getStringFeatureByName(type, "Author");
		if (user == null || !userNameMap.containsKey(user)) {
			user = getStringFeatureByName(superTexttype, "Author");
		}
		if (user != null && userNameMap.containsKey(user)) {
			object.updaters.add(userNameMap.get(user))
		}
		else
		{
			object.updaters.add(supertext.updaters.get(0))
		}
	}

	def processPassport(EObject type, BTSCorpusObject object, boolean processAuthors) {

		//name
		var String title = getStringFeatureByName(type, "title")
		if (title == null) {
			title = getStringFeatureByName(type, "tcname")
		}
		if (title == null) {
			title = getStringFeatureByName(type, "name")
		}
		if (title == null || title.trim == "") {
			title = "test" + object.get_id
		}
		
		
		if (title.contains("pLeiden I 348"))
		{
			System.out.println("test")
		}
		object.name = title.replaceEntities
		object.revisionState = UserRoleService.reviewState(fileName)
		object.visibility = UserRoleService.getVisibility(fileName)
		
		var Object sKey = getStringFeatureByName(type, "sortKey")
		if (sKey != null && sKey instanceof String)
		{
			var sortKey = sKey as String
			if (!sortKey.equals("0"))
			{
				var i = new Integer(sortKey)
				object.sortKey = i;
			}
		}


		// passport
		var Object o = getSingleRefernceFeatureByName(type, "TCPassport")
		if (o instanceof TCPassportType) {
			var TCPassportType xmlPassport = o as TCPassportType

			// definition
			val BTSPassport passport = BtsCorpusModelFactory.eINSTANCE.createBTSPassport
			val BTSPassportEntryGroup pGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
			object.passport = passport
			passport.children.add(pGroup)
			pGroup.type = "definition"

			val BTSPassportEntryGroup mainGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
			mainGroup.type = "main_group"
			pGroup.children.add(mainGroup)

			var definition = xmlPassport.definition.replaceEntities
			if (definition != null) {
				val BTSPassportEntryItem ppEntryOldType = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
				ppEntryOldType.type = "definition"
				ppEntryOldType.value = definition
				mainGroup.children.add(ppEntryOldType)
			}

			var comment = xmlPassport.comment.replaceEntities
			if (definition != null) {
				val BTSPassportEntryItem ppEntryOldType2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
				ppEntryOldType2.type = "comment"
				ppEntryOldType2.value = comment
				mainGroup.children.add(ppEntryOldType2)
			}

			var folder = xmlPassport.wbFolder
			if (definition != null) {
				val BTSPassportEntryItem ppEntryOldId = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
				ppEntryOldId.type = "folder"
				ppEntryOldId.value = folder.replaceEntities
				mainGroup.children.add(ppEntryOldId)
			}

			// testing
			if (object.name.contains("652"))
			{
				System.out.println(xmlPassport.lineCount)
			}
			
			
			var line_count = xmlPassport.lineCount
			if (line_count != null) {
				var line_count_value = getLineCountSTring(line_count)
			
				if (line_count_value != null) {
					val BTSPassportEntryItem line_countt = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
					line_countt.type = "line_count"
					line_countt.value = line_count_value
					mainGroup.children.add(line_countt)
				}
			}
			var protocol = xmlPassport.protocol
			if (protocol != null) {
				val BTSPassportEntryItem protocolt = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
				protocolt.type = "protocol"
				protocolt.value = protocol.replaceEntitiesNOLB
				mainGroup.children.add(protocolt)
			}
			var slips = xmlPassport.wbSlips
			if (slips != null) {
				val BTSPassportEntryItem slipst = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
				slipst.type = "slips"
				slipst.value = slips.replaceEntities
				mainGroup.children.add(slipst)
			}

			// bib
			var bib = xmlPassport.bibliography.replaceEntitiesNOLB
			if (bib != null) {
				val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				passport.children.add(dGroup)
				dGroup.type = "bibliography"

				val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
				ppBegin.type = "bibliographical_text_field"
				ppBegin.value = bib
				dGroup.children.add(ppBegin)

			}

			//objectType
			if (xmlPassport.objectType != null
				&& xmlPassport.objectType.passportDataItem != null
				&& xmlPassport.objectType.passportDataItem.thsEntry != null 
			) {
				val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				passport.children.add(dGroup)
				dGroup.type = "object"

				val BTSPassportEntryGroup dGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				dGroup.children.add(dGroup2)
				dGroup2.type = "description_of_object"
				
				// comment
				var commentString = xmlPassport.objectType.passportDataItem.thsEntry.comment as String
				if (commentString == null || commentString.length == 0) {
					commentString = xmlPassport.objectType.passportDataItem.comment as String
				}
				if (commentString != null && commentString.length > 0) {
					val BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
					commentEntry.type = "comment"
					commentEntry.value = commentString
					dGroup2.children.add(commentEntry)
				}

				if (xmlPassport.objectType.passportDataItem.thsEntry.key != null)
				{
				var typeString = "7/" + xmlPassport.objectType.passportDataItem.thsEntry.key as String
				var List<String> mappedTypes = processTypeMapping(typeString)
				if (mappedTypes != null && !mappedTypes.empty) {
					for (String s : mappedTypes) {
						if (!s.startsWith("review")) {
							var String value = s
							if (thsIdMap.containsKey(s)) {
								value = thsIdMap.get(s)
							}
							val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.
								createBTSPassportEntryItem
							ppBegin.value = value
							if (s.startsWith("21"))
							{
								ppBegin.type = "type"
							}
							else if (s.startsWith("22"))
							{
								ppBegin.type = "component"
							}
							else if (s.startsWith("23"))
							{
								ppBegin.type = "agent"
							}
							else if (s.startsWith("24"))
							{
								val BTSPassportEntryGroup dGroupMaterial = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
								dGroup.children.add(dGroupMaterial)
								dGroupMaterial.type = "technical_details"
								val BTSPassportEntryItem itemMaterial = BtsCorpusModelFactory.eINSTANCE.
								createBTSPassportEntryItem
								itemMaterial.value = value
								itemMaterial.type = "material"
								dGroupMaterial.children.add(itemMaterial)
							}
							else if (s.startsWith("25"))
							{
								val BTSPassportEntryGroup dGroupContext = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
								dGroup.children.add(dGroupContext)
								dGroupContext.type = "archaeological_cultural_context_of_object"
								val BTSPassportEntryItem itemContext = BtsCorpusModelFactory.eINSTANCE.
								createBTSPassportEntryItem
								itemContext.value = value
								itemContext.type = "cultural_context"
								dGroupContext.children.add(itemContext)
							}
							else if (s.startsWith("26"))
							{
								ppBegin.type = "model"
								ppBegin.value = "true"
							}
							else if (s.startsWith("27"))
							{
								ppBegin.type = "imitation"
								ppBegin.value = "true"
							}
							else if (s.startsWith("28"))
							{
								ppBegin.type = "miniature"
								ppBegin.value = "true"
							}
							else if (s.startsWith("29"))
							{
								ppBegin.type = "skeuomorph"
								ppBegin.value = "true"
							}
							else if (s.startsWith("30"))
							{
								ppBegin.type = "copy"
								ppBegin.value = "true"
							}
							else
							{
								ppBegin.type = "type"
							}
							dGroup2.children.add(ppBegin)
						} else {
							object.revisionState = s.substring(7, s.length)
						}
					}
				} else {
					val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
					ppBegin.type = "type_of_object"
					ppBegin.value = typeString
					dGroup2.children.add(ppBegin)
				}

			}
	}
			//provenance
			if (xmlPassport.provenance != null
				&& xmlPassport.provenance.passportDataItem != null
				&& xmlPassport.provenance.passportDataItem.thsEntry != null) {
				val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				passport.children.add(dGroup)
				dGroup.type = "find_spot"

				val BTSPassportEntryGroup dGroup1 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				dGroup.children.add(dGroup1)
				dGroup1.type = "find_spot"
				
				val BTSPassportEntryGroup dGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				dGroup1.children.add(dGroup2)
				dGroup2.type = "place"

			if (xmlPassport.provenance.passportDataItem.thsEntry.key != null)
			{
				var typeString = "3/" + xmlPassport.provenance.passportDataItem.thsEntry.key as String
				if (thsIdMap.containsKey(typeString)) {
					typeString = thsIdMap.get(typeString)
				}
				val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
				ppBegin.type = "place"
				ppBegin.value = typeString
				dGroup2.children.add(ppBegin)
				}
				// comment_on_find_spot
				var commentString = xmlPassport.provenance.passportDataItem.thsEntry.comment as String
				if (commentString == null || commentString.length == 0)
				{
					commentString = xmlPassport.provenance.passportDataItem.comment as String
				}
				if (commentString != null && commentString.length > 0) {
					val BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
					commentEntry.type = "comment"
					commentEntry.value = commentString
					dGroup2.children.add(commentEntry)
				}
				
			}

			//script
			{
				val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				passport.children.add(dGroup)
				dGroup.type = "text"

				val BTSPassportEntryGroup dGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				dGroup.children.add(dGroup2)
				dGroup2.type = "textual_metadata"
				
				if (type instanceof TCTextType && (type as TCTextType).egyTxt != null && (type as TCTextType).egyTxt.name != null) {
				var egyTextName = (type as TCTextType).egyTxt.name.replaceEntities
					if (egyTextName != null) {
						val BTSPassportEntryItem pptextName = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
						pptextName.type = "egyTextName"
						pptextName.value = egyTextName
						dGroup2.children.add(pptextName)
					
					}
				}
				
				// script
				if (xmlPassport.script != null
					&& xmlPassport.script.passportDataItem != null
					&& xmlPassport.script.passportDataItem.thsEntry != null
					&& xmlPassport.script.passportDataItem.thsEntry.key != null)
				{
					var typeString = "5/" + xmlPassport.script.passportDataItem.thsEntry.key as String
					if (thsIdMap.containsKey(typeString)) {
						typeString = thsIdMap.get(typeString)
					}
					val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
					ppBegin.type = "script"
					ppBegin.value = typeString
					dGroup2.children.add(ppBegin)

				}

				// comment_on_script
				if(xmlPassport.script  != null
					&& xmlPassport.script.passportDataItem  != null
					&& xmlPassport.script.passportDataItem.thsEntry  != null
					&& xmlPassport.script.passportDataItem.thsEntry.comment  != null)
				{
					var commentString = xmlPassport.script.passportDataItem.thsEntry.comment as String
					if (commentString == null || commentString.length == 0) {
					commentString = xmlPassport.script.passportDataItem.comment as String
				}
					if (commentString != null && commentString.length > 0) {
						val BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
						commentEntry.type = "comment_on_script"
						commentEntry.value = commentString
						dGroup2.children.add(commentEntry)
					
					}
				}
				
				// lang
				if (xmlPassport.language != null && xmlPassport.language.passportDataItem  != null
					&& xmlPassport.language.passportDataItem.thsEntry != null
				)
				{
					if(xmlPassport.language.passportDataItem.thsEntry.key != null)
					{
						var typeString = "4/" + xmlPassport.language.passportDataItem.thsEntry.key as String
						if (thsIdMap.containsKey(typeString)) {
							typeString = thsIdMap.get(typeString)
						}
						val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
						ppBegin.type = "language"
						ppBegin.value = typeString
						dGroup2.children.add(ppBegin)
					}
					// comment_on_language
					var commentString = xmlPassport.language.passportDataItem.thsEntry.comment as String
					if (commentString == null || commentString.length == 0) {
					commentString = xmlPassport.language.passportDataItem.comment as String
				}
					if (commentString != null && commentString.length > 0) {
						val BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
						commentEntry.type = "comment_on_language"
						commentEntry.value = commentString
						dGroup2.children.add(commentEntry)
					}
				}
				
				
				// texttype
				if (xmlPassport.textType != null && xmlPassport.textType.passportDataItem != null) {
					if (xmlPassport.textType.passportDataItem.thsEntry.key != null) {
						var typeString = "11/" + xmlPassport.textType.passportDataItem.thsEntry.key as String
						if (thsIdMap.containsKey(typeString)) {
							typeString = thsIdMap.get(typeString)
						}
						val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
						ppBegin.type = "texttype"
						ppBegin.value = typeString
						dGroup2.children.add(ppBegin)
	
					}
					// comment_on_texttype
					var commentString = xmlPassport.textType.passportDataItem.thsEntry.comment as String
					if (commentString == null || commentString.length == 0)
					{
						commentString = xmlPassport.textType.passportDataItem.comment as String
					}
					if (commentString != null && commentString.length > 0) {
						val BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
						commentEntry.type = "comment_on_texttype"
						commentEntry.value = commentString
						dGroup2.children.add(commentEntry)
					}
					
				}
			}

			// date
			var date = xmlPassport.date
			if (date != null && !date.dateThs.empty) {
				val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				passport.children.add(dGroup)
				dGroup.type = "date"

				val BTSPassportEntryGroup dGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				dGroup.children.add(dGroup2)
				dGroup2.type = "date"

				var String dateString1 = date.dateThs.get(0).yearFrom as String
				var String dateString2 = date.dateThs.get(0).yearTo as String
				if(dateString1 != "-1" && dateString2 != "-1" && dateString1 != "1" && dateString2 != "1")
				{
					var String dateString = dateString1 + ":" + dateString2
					val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
					ppBegin.type = "date"
					if (thsDateMap.containsKey(dateString)) {
						ppBegin.value = thsDateMap.get(dateString)
						dGroup2.children.add(ppBegin)
						
					} else {
						if (thsDateMap.containsKey("B" + dateString1)) {
							ppBegin.value = thsDateMap.get("B" +dateString1)
							dGroup2.children.add(ppBegin)
						}
						else
						{
							ppBegin.value = dateString1
							dGroup2.children.add(ppBegin)
						}
						if (thsDateMap.containsKey("E" +dateString2)) {
							val BTSPassportEntryItem d = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
							d.type = "date"
							d.value = thsDateMap.get("E" +dateString2)
							dGroup2.children.add(d)
						}
						else
						{
							val BTSPassportEntryItem d = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
							d.type = "date"
							d.value = dateString2
							dGroup2.children.add(d)
						}
						
					}
				}

				val BTSPassportEntryItem ppcomment = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
				ppcomment.type = "comment"
				ppcomment.value = date.comment.toAppendedString
				dGroup2.children.add(ppcomment)

			}
			
//			//definition
//			if (!xmlPassport.lineCount.value.empty && xmlPassport.lineCount.value.get(0) != null) {
//				val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
//				passport.children.add(dGroup)
//				dGroup.type = "definition"
//
//				val BTSPassportEntryGroup dGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
//				dGroup.children.add(dGroup2)
//				dGroup2.type = "main_group"
//
//				val BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
//				ppBegin.type = "line_count"
//				ppBegin.value = xmlPassport.lineCount.value.get(0)
//				dGroup2.children.add(ppBegin)
//				
//				// comment_on_find_spot
//				var commentString = xmlPassport.lineCount.comment.get(0) as String
//				if (commentString != null && commentString.length > 0) {
//					val BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
//					commentEntry.type = "comment"
//					commentEntry.value = commentString
//					dGroup2.children.add(commentEntry)
//				}
//				
//			}
			
			//present_location
			if (xmlPassport.TCLocation != null 	&& !xmlPassport.TCLocation.empty ) {
				val BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
				passport.children.add(dGroup)
				dGroup.type = "present_location"
				
				for (loc : xmlPassport.TCLocation)
				{
					val BTSPassportEntryGroup dGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup
					dGroup.children.add(dGroup2)
					dGroup2.type = "location"
	
					var typeString = "2/" + loc.thsEntry.key as String
					if (thsIdMap.containsKey(typeString)) {
						typeString = thsIdMap.get(typeString)
					}
					val BTSPassportEntryItem location = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
					location.type = "location"
					location.value = typeString
					dGroup2.children.add(location)
					
					// inventoryString
					var inventoryString = loc.museumNumber as String
					if (inventoryString != null && inventoryString.length > 0) {
						val BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
						commentEntry.type = "inventory_number"
						commentEntry.value = inventoryString
						dGroup2.children.add(commentEntry)
					}
					
					// comment
					var commentString = loc.comment as String
					if (commentString != null && commentString.length > 0) {
						val BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem
						commentEntry.type = "comment"
						commentEntry.value = commentString
						dGroup2.children.add(commentEntry)
					}
				}
				
			}

		}
		if (processAuthors)
		{
			processAuthor(type, object)
			processUpdater(type, object)
		
		}
	}
	
	def String getLineCountSTring(LineCountType type) {
		var String value = null
		if (type != null)
		{
			var BasicFeatureMap mixed = type.mixed as BasicFeatureMap
			if (!mixed.empty)
			{
				var org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.SimpleFeatureMapEntry o = mixed.get(0) as org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.SimpleFeatureMapEntry
				value = o.toString.substring(20)
//				value = o.
				System.out.println(value)
			}
			
			
		}
		return value
	}
	
	
	def processTypeMapping(String string) {

		var String[] results = ThsMappingService.replaceSigns(string)
		var List<String> l = new Vector<String>(results.size)
		for (String s : results) {
			
			l.add(s)
		}
		return l
	}

	def String toAppendedString(EList<String> list) {
		var String all
		var boolean sep = false
		for (String s : list) {
			if (s.trim.length > 0) {
				if (sep) {
					all = all + ", " + s
				} else {
					all = s
					sep = true
				}
			}
		}
		return all
	}

	

	def getStringFeatureByName(EObject object, String string) {
		for (o : object.eClass.EAllAttributes) {
			if (o.name.toLowerCase.endsWith(string.toLowerCase)) {
				return object.eGet(o) as String
			}
		}
		return null
	}

	def getListReferenceFeatureByName(EObject object, String string) {
		for (o : object.eClass.EAllReferences) {
			if (o.name.toLowerCase.equals(string)) {
				return object.eGet(o) as List
			}
		}
		return null
	}

	def getSingleRefernceFeatureByName(EObject object, String string) {
		for (o : object.eClass.EAllReferences) {
			if (o.name.toLowerCase.equals(string.toLowerCase)) {
				return object.eGet(o)
			}
		}
		return null
	}

	def addToObjects(BTSCorpusObject object) {
		objects.add(object)
		object.DBCollectionKey = dbCollection
	}

	def retrieveEgyTxtCorpus(DocumentRoot root) {
		for (Object o : root.mixed) {

			//			System.out.println((o as EStructuralFeatureImpl.SimpleFeatureMapEntry).value)
			if (o instanceof FeatureMap.Entry && (o as FeatureMap.Entry).value instanceof EgyTxtCorpusType) {
				return (o as FeatureMap.Entry).value as EgyTxtCorpusType;
			}
		}
	}

	def replaceEntities(String string) {
		var String str = CharsService.replaceEntities(string, true)
		if(str == null) return null
		if("".equals(str.trim)) return null
		return str.normalizeWS
	}
	
	def getReplaceEntitiesNOLB(String string) {
		var String str = CharsService.replaceEntities(string, true)
		if(str == null) return null
		if("".equals(str.trim)) return null
		return str
	}
	

	def getComments() {
		return comments
	}

}
