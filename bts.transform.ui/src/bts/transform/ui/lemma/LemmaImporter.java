package bts.transform.ui.lemma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import bts.transform.ui.xtend.Authors2BTSTransform;
import bts.transform.ui.xtend.Lemma2BTSTransform;
import bts.transform.ui.xtend.Ths2BTSTransform;
import Btsaux.DocumentRoot;
import Btsaux.provider.BtsauxItemProviderAdapterFactory;

public class LemmaImporter {

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
//	public static void main(String[] args) {
//		String fileName = "D:/AAEW/transform/authors/authors_2.btsaux";
//		LemmaImporter ui = new LemmaImporter();
//		ui.importLemmata(fileName);
//	}

	private AdapterFactoryEditingDomain editingDomain;
	
	public void importLemmata(String fileName) {
		File f = new File(fileName);
		if (f.exists())
		{
			DocumentRoot root = createModel(fileName);
			IEclipseContext context = StaticAccessController.getContext();

			Lemma2BTSTransform transform = ContextInjectionFactory.make(Lemma2BTSTransform.class, context);
			
			BTSLemmaEntryService LemmaService = context.get(BTSLemmaEntryService.class);
			List<BTSLemmaEntry> Lemmas = transform.transform(root, fileName.contains("demo"));
			//TODO counter
			for (BTSLemmaEntry th : Lemmas)
			{
				try {
					LemmaService.save(th);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			System.out.println(root);
		}
		
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
