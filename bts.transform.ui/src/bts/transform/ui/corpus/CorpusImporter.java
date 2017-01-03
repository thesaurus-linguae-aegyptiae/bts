package bts.transform.ui.corpus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSReference;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.db.DBManager;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import bts.transform.ui.usersRole.UserRoleService;
import bts.transform.ui.xtend.Corpus2BTSTransform;
import Btsaux.provider.BtsauxItemProviderAdapterFactory;
import CorpusDTDneu.DocumentRoot;

public class CorpusImporter {

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	

	private AdapterFactoryEditingDomain editingDomain;
	private IEclipseContext context;
	private Corpus2BTSTransform transform;
	private CorpusObjectService corpusService;
	private BTSCommentService commentService;
	private DBManager dbManager;
	private Map<String, String> userIdMap;
	private Map<String, String> userNameMap;
	private Map<String, String> thsDateMap;
	private Map<String, String> thsIdMap;


	private BTSProject mainProject;


	private BTSProjectService projectService;
	
	public CorpusImporter()
	{
		init();
	}
	
	private void init()
	{
		context = StaticAccessController.getContext();

		transform = ContextInjectionFactory.make(Corpus2BTSTransform.class, context);
		
		corpusService = context.get(CorpusObjectService.class);
		
		commentService = context.get(BTSCommentService.class);
		
		dbManager = context.get(DBManager.class);
		
		projectService = context.get(BTSProjectService.class);
		
		// users
		userIdMap = loadUsersMap();
		userNameMap = loadUsersNameMap();
		
		thsDateMap = loadthsDateMap();
		
		thsIdMap = loadthsIDMap();
		
		mainProject = (BTSProject) context.get(BTSCoreConstants.MAIN_PROJECT);
	}
	
	public void importFromInternalList()
	{
		String[] files = new String[]{				"tla_digital_heka_juli_2014_replaced.corpusdtdneu",
"in_bearbeitung_juli_2014_replaced2.corpusdtdneu",
				"tla_bbaw_juli_2014_replaced2.corpusdtdneu",
				"tla_edfu_juli_2014_replaced2.corpusdtdneu",
				"tla_leuven_juli_2014_replaced2.corpusdtdneu",
				"tla_saw_juli_2014_replaced2.corpusdtdneu",
				"tla_tb_juli_2014_replaced3.corpusdtdneu"};
		String[] corpora = new String[]{				"heka",
"bearbeitung",
				"tla",
				"edfu",
				"leuven",
				"saw",
				"tb"};
		
		for (int i = 0; i<files.length; i++)
		{
			importCorpus("D:/AAEW/transform/corpus/" + files[i], corpora[i]);
		}
	}
	
	public void importCorpus(String fileName, String cor) {
		if (cor == null)
		{
			cor = determineCorepusPrefixFromFileName(fileName);
		}
		cor = cor.toLowerCase();
		File f = new File(fileName);
		if (f.exists())
		{
			DocumentRoot root = createModel(fileName);
			
			String corpus = null;
			String project = mainProject.getPrefix();
			if (cor != null)
			corpus = cor;
			else corpus = "tlademotic";
			boolean demotic = project.contains("dem");
			BTSProjectDBCollection coll = BtsmodelFactory.eINSTANCE.createBTSProjectDBCollection();
			coll.setCollectionName(project + "_corpus_" + corpus);
			coll.setIndexed(true);
			mainProject.getDbCollections().add(coll);
			List<BTSCorpusObject> copusObjects = transform.transform(root, project + "_corpus_" + corpus, project, corpus, 
					userIdMap, userNameMap, thsDateMap, thsIdMap, demotic, fileName);
			
			dbManager.checkAndCreateDBCollection(mainProject, coll, project + "_corpus_" + corpus, true, false);

			String[] oldUserIds = UserRoleService.findUsers(f.getName());
			BTSDBCollectionRoleDesc roleDesc = BtsmodelFactory.eINSTANCE.createBTSDBCollectionRoleDesc();
			roleDesc.setRoleName("researchers");
			boolean add = false;
			for (String id : oldUserIds)
			{
				if (userNameMap.containsKey(id))
				{
					roleDesc.getUserNames().add(userNameMap.get(id));
					add = true;
				}
			}
			if (add) coll.getRoleDescriptions().add(roleDesc);
			
			roleDesc = BtsmodelFactory.eINSTANCE.createBTSDBCollectionRoleDesc();
			roleDesc.setRoleName("editors");
			roleDesc.getUserNames().add("Schweitzer");
			coll.getRoleDescriptions().add(roleDesc);
			
			
			roleDesc = BtsmodelFactory.eINSTANCE.createBTSDBCollectionRoleDesc();
			roleDesc.setRoleName("admins");
			roleDesc.getUserNames().add("altaegyptwb");
			coll.getRoleDescriptions().add(roleDesc);
			
			// bei sargtexten, gäste nicht einfügen
			if (UserRoleService.isGuests(fileName))
			{
				roleDesc = BtsmodelFactory.eINSTANCE.createBTSDBCollectionRoleDesc();
				roleDesc.setRoleName("guests");
				for (String s : userNameMap.values())
				{
					boolean found = false;
					for (String id : oldUserIds)
					{
						if (s.equals(userNameMap.get(id))) found = true;
					}
					if (!found && !"Schweitzer".equals(s))
					{
						roleDesc.getUserNames().add(s);
					}
				}
				coll.getRoleDescriptions().add(roleDesc);
			}
			
			String[] oldTranscriberUserIds = UserRoleService.findTranscribers(f.getName());
			roleDesc = BtsmodelFactory.eINSTANCE.createBTSDBCollectionRoleDesc();
			roleDesc.setRoleName("transcribers");
			add = false;
			for (String id : oldTranscriberUserIds)
			{
				if (userNameMap.containsKey(id))
				{
					roleDesc.getUserNames().add(userNameMap.get(id));
					add = true;
				}
			}
			if (add) coll.getRoleDescriptions().add(roleDesc);
			
			
			EObject pro = coll.eContainer();
			if (pro instanceof BTSProject) projectService.save((BTSProject) pro);
			
			//TODO counter
			for (BTSCorpusObject th : copusObjects)
			{
				if (th instanceof BTSTextCorpus)
				{
					th.setDBCollectionKey( project + "_corpus");
				}
				else
				{
					th.setDBCollectionKey( project + "_corpus_" + corpus);
				}
				try {
					corpusService.save(th);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			// For TEsTING of Transformation: dont save commenst
			List<BTSComment> comments = transform.getComments();
			for (BTSComment comment : comments)
			{
				comment.setDBCollectionKey(project + "_admin");
				try {
					commentService.save(comment);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finisched!");
		}
		
	}
	private String determineCorepusPrefixFromFileName(String fileName) {
		if (fileName.startsWith("D:"))
		{
			File f = new File(fileName);
			fileName = f.getName();
		}
		String corpusPrefix = fileName.replace(".corpusdtdneu", "");
		if (fileName.contains("_inBearbeitung"))
		{
			corpusPrefix = corpusPrefix.replace("_inBearbeitung", "inProgress");
		}
		corpusPrefix = corpusPrefix.replaceAll("_", "");
		return corpusPrefix.toLowerCase();
	}

	private Map<String, String> loadthsIDMap() {
		Map<String, String> userMap = new HashMap<String, String>();
		 BTSThsEntryService us = context.get(BTSThsEntryService.class);
		 ThsNavigatorController thsController  = context.get(ThsNavigatorController.class);

		 List<BTSThsEntry> thss = us.list(BTSConstants.OBJECT_STATE_ACTIVE, null);
		 String pathBegin = "thesaurus_date>>main_group>>beginning";
		 String pathEnd = "thesaurus_date>>main_group>>end";

		 for (BTSThsEntry t : thss)
		 {
//			 thsController.checkAndFullyLoad(t, false);
			 
			 // manipulate couchdb view to load ths entries fully!
			 if (!t.getExternalReferences().isEmpty())
			 {
				 for (BTSExternalReference r : t.getExternalReferences())
				 {
					 if ("aaew_1".equals(r.getType()))
					 {
						 if (r.getReference().contains("/"))
						 {
							 userMap.put(r.getReference(), t.get_id());
						 }
						 else
						 {// add root entries 
							 userMap.put(r.getReference()+"/0", t.get_id());
							 userMap.put(r.getReference(), t.get_id());
						 }
					 }
				 }
			 }
		 }
		return userMap;
	}
	private Map<String, String> loadthsDateMap() {
		 Map<String, String> userMap = new HashMap<String, String>();
		 BTSThsEntryService us = context.get(BTSThsEntryService.class);
		 ThsNavigatorController thsController  = context.get(ThsNavigatorController.class);
		 List<BTSThsEntry> thss = us.list(BTSConstants.OBJECT_STATE_ACTIVE, null);
		 String pathBegin = "thesaurus_date>>main_group>>beginning";
		 String pathEnd = "thesaurus_date>>main_group>>end";

		 for (BTSThsEntry t : thss)
		 {
//			 thsController.checkAndFullyLoad(t, false);
			 if (t.getPassport() == null) continue;
			 String begin = t.getPassport().getPassportEntryStringValueByPath(pathBegin);
			 String end = t.getPassport().getPassportEntryStringValueByPath(pathEnd); 

			 // combined
			 if (begin != null &&  end != null && (!"0".equals(begin) || !"0".equals(end)))
			 {
				userMap.put(begin + ":" + end, t.get_id());
			 }
			 
			 // begin
			 if (begin != null && !"0".equals(begin) )
			 {
				userMap.put("B" + begin, t.get_id());
			 }
			// end
			 if (end != null && !"0".equals(end) )
			 {
				userMap.put("E" + end, t.get_id());
			 }
		 }
		return userMap;
	}
	private Map<String, String> loadUsersNameMap() {
		 Map<String, String> userMap = new HashMap<String, String>();
		 BTSUserService us = context.get(BTSUserService.class);
		 List<BTSUser> users = us.list(BTSConstants.OBJECT_STATE_ACTIVE, null);
		 
		 for (BTSUser u : users)
		 {
			 if (!u.getExternalReferences().isEmpty())
			 {
				 for (BTSExternalReference r : u.getExternalReferences())
				 {
					 if ("aaew_1".equals(r.getType()))
					 {
						 userMap.put(r.getReference(), u.getUserName());
					 }
				 }
			 }
		 }
		return userMap;
	}
	private Map<String, String> loadUsersMap() {
		 Map<String, String> userMap = new HashMap<String, String>();
		 BTSUserService us = context.get(BTSUserService.class);
		 List<BTSUser> users = us.list(BTSConstants.OBJECT_STATE_ACTIVE, null);
		 
		 for (BTSUser u : users)
		 {
			 if (!u.getExternalReferences().isEmpty())
			 {
				 for (BTSExternalReference r : u.getExternalReferences())
				 {
					 if ("aaew_1".equals(r.getType()))
					 {
						 userMap.put(r.getReference(), u.get_id());
					 }
				 }
			 }
		 }
		return userMap;
	}
	public DocumentRoot createModel(String fileName) {
		URI resourceURI = URI.createFileURI( fileName);
		System.out.println(resourceURI);
		Exception exception = null;
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new BtsauxItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				new BasicCommandStack());
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		}
		catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}

//		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
//		if (diagnostic.getSeverity() != Diagnostic.OK) {
//			resourceToDiagnosticMap.put(resource,  analyzeResourceProblems(resource, exception));
//		}
//		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
		DocumentRoot data = (DocumentRoot)resource.getContents().get(0);  
		  return data;
	}

	public DocumentRoot loadData(String fileName) throws FileNotFoundException, IOException {
		
		  XMIResourceImpl resource = new XMIResourceImpl();
		  File source = new File(fileName);
		  resource.load( new FileInputStream(source), new HashMap<Object,Object>());
		  DocumentRoot data = (DocumentRoot)resource.getContents().get(0);  
		  return data;
		}


}
