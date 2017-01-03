package bts.transform.ui.users;

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

import Btsaux.DocumentRoot;
import Btsaux.provider.BtsauxItemProviderAdapterFactory;
import bts.transform.ui.xtend.Authors2BTSTransform;

public class UsersImporter {

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
	public static void main(String[] args) {
		String fileName = "D:/AAEW/transform/authors/authors_2.btsaux";
		UsersImporter ui = new UsersImporter();
		ui.importUsers(fileName);
	}

	private AdapterFactoryEditingDomain editingDomain;
	
	public void importUsers(String fileName) {
		File f = new File(fileName);
		if (f.exists())
		{
			DocumentRoot root = createModel(fileName);
			IEclipseContext context = StaticAccessController.getContext();

			Authors2BTSTransform transform = ContextInjectionFactory.make(Authors2BTSTransform.class, context);
			
			BTSUserService userService = context.get(BTSUserService.class);
			BTSUserGroupService userGroupService = context.get(BTSUserGroupService.class);
			List<BTSUser> users = transform.transform(root);
			List<BTSUserGroup> groups = transform.getGroups();
			
			for (BTSUser u : users)
			{
				userService.save(u);
			}
			
			for (BTSUserGroup ug : groups)
			{
				userGroupService.save(ug);
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
//	protected void setupOptions(XMLResource result)
//    {
//        result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, new BasicExtendedMetaData()
//        {
//            private static final String NAMESPACE_GOOGLE_EXT_2_2 = "http://www.google.com/kml/ext/2.2";
//            private static final String NAMESPACE_OPENGIS_2_2 = "http://www.opengis.net/kml/2.2";
//            private static final String NAMESPACE_DEFAULT = NAMESPACE_OPENGIS_2_2;
//
//            @Override
//            public EPackage getPackage(String namespace) {
//                if(namespace==null){
//                    namespace = NAMESPACE_DEFAULT;
//                }
//                return super.getPackage(namespace);
//            }
//
//            @Override
//            public EStructuralFeature getElement(String namespace, String name)
//            {
//                if (feature == null)
//                    feature = super.getElement(NAMESPACE_OPENGIS_2_2, name);
//                if (feature == null)
//                    feature = super.getElement(NAMESPACE_GOOGLE_EXT_2_2, name);
//                return feature;
//            }
//    });

}
