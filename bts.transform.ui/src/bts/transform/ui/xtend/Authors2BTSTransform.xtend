package bts.transform.ui.xtend

import Btsaux.DocumentRoot
import java.util.List
import org.bbaw.bts.btsmodel.BTSUser
import Btsaux.StupidXMLType
import java.util.Vector
import Btsaux.AuthorsType
import org.bbaw.bts.btsmodel.BtsmodelFactory
import org.bbaw.bts.core.services.IDService
import org.bbaw.bts.btsmodel.BTSUserGroup
import java.util.Map
import java.util.HashMap
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl
import org.eclipse.emf.ecore.util.FeatureMap
import org.bbaw.bts.core.services.BTSUserService
import org.bbaw.bts.core.services.BTSUserGroupService
import javax.inject.Inject
import bts.transform.ui.chars.CharsService

class Authors2BTSTransform {
	
	
	@Inject
	var IDService idService;
	
	@Inject
	var BTSUserService userService;
	
	@Inject
	var BTSUserGroupService userGroupService;
	
	 
	val String[] groupNames = #[
		"Berlin-Brandenburgische Akademie der Wissenschaften", // 1
		"Sächsische Akademie der Wissenschaften", //2
		"Demotische Textdatenbank, Akademie der Wissenschaften Mainz", //3
		"Totenbuch-Projekt, Ägyptologisches Seminar der Universität Bonn", //4
		"Projekt Digital Heka, Univ. Leipzig", //5
		"Coffin Texts Textcorpus, Univ. Tübingen", //6
		"DAI Abt. Kairo", // 7
		"Material aus privaten Forschungsprojekten", //8
		"Leuven Online Index of Ptolemaic and Roman Hieroglyphic Texts", //9
		"Edfu-Projekt / Akademie der Wissenschaften zu Göttingen", //10
		"Leibniz Projekt \"Späthieratische Ritualpapyri aus Tebtynis\"" //11

	]
	
	val  Map<String, BTSUserGroup> map = new HashMap<String, BTSUserGroup>
		
	def public getGroups(){
		val List<BTSUserGroup> gs = new Vector
		for (g : map.values)
		{
			gs.add(g)
		}
		return gs
	}
	def public transform(DocumentRoot root)
	{
		var List<BTSUser> users = new Vector<BTSUser>()
		var StupidXMLType stupid = retrieveStupid(root)
		
		makeUserGroups(userGroupService)
		for (a : stupid.authors)
		{
			var BTSUser u = makeUser(a, userService)
			users.add(u);
		}
		
		
		
		
		
		return users;
	}
	
	def makeUserGroups( BTSUserGroupService userGroupService) {
		var i = 0
		for (gName : groupNames)
		{
			val BTSUserGroup ug = userGroupService.createNew; //BtsmodelFactory.eINSTANCE.createBTSUserGroup
//		 	ug.set_id(idService.createId)
		 	ug.name = gName
		 	map.put(new Integer(i + 1).toString, ug)
		 	// ref
		 	val ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference
		 	
			ref.type = "aaew_1"
			ref.reference = new Integer(i + 1).toString
			ug.externalReferences.add(ref)
			i = i + 1
		 }
		 
	}
	def makeUser(AuthorsType a, BTSUserService userService) {
		val ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference
		var BTSUser u = userService.createNew; //BtsmodelFactory.eINSTANCE.createBTSUser
		
//		u.set_id(idService.createId)
		
		// ref
		ref.type = "aaew_1"
		ref.reference = a.auct
		u.externalReferences.add(ref)
		
		// sigle
		u.sigle = a.sigle as String
		
		u.webURL = a.weblink as String
		
		u.webDescription = (a.page as String).replaceEntities
		
		u.comment = (a.comment as String).replaceEntities
		
		var String name = a.line as String
		name = name.split(",").get(0)
		u.name = name
		
		if (name.contains(" "))
		{
			var String sn = name.split(" ").get(1)
			System.out.println("sn " + sn)

			u.sureName = sn
			
			var String fn = name.split(" ").get(0)
			fn = fn.replace(".", "")
			u.foreName = fn
		}
		
		//email
		
		if (u.webDescription.contains("Kontakt:"))
		{
			var email = u.webDescription.split("Kontakt:").get(1)
			System.out.println("email: " + email)
			u.mail = email.trim
		}
		
		var String userName = a.loginname
//		userName = userName.replace(".", "")
//		userName = userName.replace(".", "")
//		if (userName.contains("Seidlmayer"))
//		{
//			userName = userName + u.sigle.split("/").get(u.sigle.split("/").length - 1)
//			if (userName == "SSeidlmayerpriv.")
//			{
//				userName = "SSeidlmayerPrivat"
//			}
//		}
//		else if (userName == "AltägyptischesWörterbuch")
//		{
//			userName = "altaegyptwb"
//		}
//		else if (userName == "Edfu-Projekt/AkademiederWissenschaftenzuGöttingen")
//		{
//			userName = "Edfu"
//		}
		
		System.out.println("userName: " + userName)
		u.userName = userName
		u.password = a.pword
		
		val BTSUserGroup ug = map.get(a.augp)
		System.out.println(ug)
		if (ug != null)
		{
			u.groupIds.add(ug.get_id)
		}
		
		return u 
	}
	
	def replaceEntities(String string) {
		return CharsService.replaceEntities(string, true)
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