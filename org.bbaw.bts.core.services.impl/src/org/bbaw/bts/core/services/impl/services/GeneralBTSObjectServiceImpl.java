package org.bbaw.bts.core.services.impl.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.BTSObjectSearchServiceFactory;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.GeneralBTSObjectService;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.modelUtils.EmfModelHelper;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecore.EClass;

public class GeneralBTSObjectServiceImpl implements GeneralBTSObjectService {


	@Inject
	private IEclipseContext context;
	
	@Override
	public List<BTSObject> queryObjects(BTSQueryRequest query,
			String objectState, boolean registerQuery, String className, IProgressMonitor monitor) {
		Map<String, List<BTSObjectSearchService>> searchServices = loadServicesMap();
		if (className != null && searchServices.containsKey(className))
		{
			List<BTSObjectSearchService> list = searchServices.get(className);
			return queryObjectFromServiceList(query, objectState, className, list, monitor);
		}
		else
		{
			for (List<BTSObjectSearchService> list : searchServices.values())
			{
				List<BTSObject> obj = queryObjectFromServiceList(query, objectState, className, list, monitor);;
				if (obj != null) return obj;
			}
		}
		
		return null;
	}

	private List<BTSObject> queryObjectFromServiceList(BTSQueryRequest query,
			String objectState, String className, List<BTSObjectSearchService> list, IProgressMonitor monitor) {
		for (BTSObjectSearchService service : list)
		{
			if (service instanceof GenericObjectService<?, ?>)
			{
				GenericObjectService<?, ?> ser = (GenericObjectService<?, ?>) service;
				Object obj = ser.query(query, objectState, monitor);
				if (obj instanceof BTSObject)
				{
					return (List<BTSObject>) obj;
				}
			}
		}
		return null;
	}

	private Map<String, List<BTSObjectSearchService>> loadSearchServices() {
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = null;
		if (application != null)
		{
			ctx = application.getContext();
		}
		if (ctx == null)
		{
			ctx = context;
		}
		IConfigurationElement[] config = ((IExtensionRegistry) ctx.get(IExtensionRegistry.class.getName()))
				.getConfigurationElementsFor(BTSCoreConstants.EXTENSION_POINT_SEARCH_SERVICE_FACTORY);
		List<BTSObjectSearchService> services = new Vector<BTSObjectSearchService>(4);
		Map<String, List<BTSObjectSearchService>> serviceMap = new HashMap<String, List<BTSObjectSearchService>>(10);
		System.out.println("loadSearchServices. config.length " + config.length);

		for (IConfigurationElement e : config)
		{
			Object o = null;
			try {
				o = e.createExecutableExtension("class");
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("loadSearchServices configuration Element " + o);
			if (o != null && o instanceof BTSObjectSearchServiceFactory)
			{
				System.out.println("extension point BTSObjectSearchServiceFactory created");
				services.addAll(((BTSObjectSearchServiceFactory) o).getSearchServices());
			}
		}
		if (!services.isEmpty())
		{
			for (BTSObjectSearchService service : services)
			{
				List<BTSObjectSearchService> ser = null;
				if (serviceMap.containsKey(service.getNameOfServedClass()))
				{
					ser = serviceMap.get(service.getNameOfServedClass());
				}
				else
				{
					ser = new Vector<BTSObjectSearchService>(4);
					serviceMap.put(service.getNameOfServedClass(), ser);
				}
				if (!ser.contains(service))
				{
					ser.add(service);
				}
			}
		}
		System.out.println("loadSearchServices serviceMap size " + serviceMap.size());

		return serviceMap;
	}

	@Override
	public String getDisplayName(String id, String className) {
		BTSObject o = findObject(id, className, null);
		
		if (o != null && o.getName() != null) {
			return o.getName();
		}
		return id;
	}

	@Override
	public String getDisplayName(String id) {
		BTSObject o = findObject(id, null, null);
		
		if (o != null && o.getName() != null) {
			return o.getName();
		}
		return id;
	}
	@Override
	public BTSObject findObject(String id, String className, IProgressMonitor monitor) {
		Map<String, List<BTSObjectSearchService>> searchServices = loadServicesMap();
		if (className != null && searchServices.containsKey(className))
		{
			List<BTSObjectSearchService> list = searchServices.get(className);
			return findObjectFromServiceList(list, id, className, monitor);
		}
		else
		{
			for (List<BTSObjectSearchService> list : searchServices.values())
			{
				BTSObject obj = findObjectFromServiceList(list, id, className, monitor);
				if (obj != null) return obj;
			}
		}
		return null;
		
	}

	private Map<String, List<BTSObjectSearchService>> loadServicesMap() {
		Object o = context.get(BTSCoreConstants.EXTENSION_SEARCH_SERVICE_MAP);
		Map<String, List<BTSObjectSearchService>> searchServices;
		if (o == null || !(o instanceof Map<?,?>))
		{
			searchServices = loadSearchServices();
			context.set(BTSCoreConstants.EXTENSION_SEARCH_SERVICE_MAP, searchServices);
		}
		else
		{
			searchServices = (Map<String, List<BTSObjectSearchService>>) o;
		}
		return searchServices;
	}

	private BTSObject findObjectFromServiceList(List<BTSObjectSearchService> list,
			String id, String className, IProgressMonitor monitor) {
		for (BTSObjectSearchService service : list)
		{
			if (service instanceof GenericObjectService<?, ?>)
			{
				GenericObjectService<?, String> ser = (GenericObjectService<?, String>) service;
				Object obj = null;
				try {
					obj = ser.find(id, monitor);
				} catch (Exception e) {
					// do nothing because here we expect to fail with services.
				}
				if (obj != null && obj instanceof BTSObject)
				{
					return (BTSObject) obj;
				}
			}
		}
		return null;
	}

	@Override
	public boolean save(BTSDBBaseObject dbBaseObject) {
		
		GenericObjectService<BTSDBBaseObject, String> service = (GenericObjectService<BTSDBBaseObject, String>) findServiceByObject(dbBaseObject);
		if (service != null)
		{
			return service.save(dbBaseObject);
		}
		return false;
		
	}

	private GenericObjectService<?, String> findServiceByObject(
			BTSDBBaseObject dbBaseObject) {
		if (dbBaseObject == null) return null;
		Map<String, List<BTSObjectSearchService>> searchServices = loadServicesMap();
		if (searchServices.containsKey(dbBaseObject.eClass().getName()))
		{
			List<BTSObjectSearchService> ser = searchServices.get(dbBaseObject.eClass().getName());
			if (!ser.isEmpty()) return (GenericObjectService<?, String>) ser.get(0);
		}
		else
		{
			List<EClass> superTypes = dbBaseObject.eClass().getEAllSuperTypes();
			for (EClass eclass : superTypes)
			{
				if (searchServices.containsKey(eclass.getName()))
				{
					List<BTSObjectSearchService> ser = searchServices.get(eclass.getName());
					if (!ser.isEmpty()) return (GenericObjectService<?, String>) ser.get(0);
				}
			}
		}
		return null;
	}

	@Override
	public BTSDBBaseObject find(String id, String dbCollectionKey,
			String rev, BTSDBBaseObject dbBaseObject, boolean fromRemote, IProgressMonitor monitor) {
//		Map<String, List<BTSObjectSearchService>> searchServices = loadServicesMap();
		GenericObjectService<BTSDBBaseObject, String> service = (GenericObjectService<BTSDBBaseObject, String>) findServiceByObject(dbBaseObject);
		if (service != null)
		{
			Object obj = service.find(id, dbCollectionKey, rev, fromRemote, monitor);
			if (obj != null && obj instanceof BTSObject)
			{
				return (BTSDBBaseObject) obj;
			}
		}
//		if (className != null && searchServices.containsKey(className))
//		{
//			List<BTSObjectSearchService> list = searchServices.get(className);
//			return findObjectFromServiceList(list, id, dbCollectionKey, rev, className, fromRemote);
//		}
//		else
//		{
//			for (List<BTSObjectSearchService> list : searchServices.values())
//			{
//				BTSDBBaseObject obj = findObjectFromServiceList(list, id, dbCollectionKey, rev, className, fromRemote);
//				if (obj != null) return obj;
//			}
//		}
		return null;
	}

	private BTSDBBaseObject findObjectFromServiceList(
			List<BTSObjectSearchService> list, String id,
			String dbCollectionKey, String rev, String className, boolean fromRemote, IProgressMonitor monitor) {
		for (BTSObjectSearchService service : list)
		{
			if (service instanceof GenericObjectService<?, ?>)
			{
				GenericObjectService<?, String> ser = (GenericObjectService<?, String>) service;
				Object obj = ser.find(id, dbCollectionKey, rev, fromRemote, monitor);
				if (obj != null && obj instanceof BTSObject)
				{
					return (BTSDBBaseObject) obj;
				}
			}
		}
		return null;
	}

	@Override
	public boolean removeRevision(BTSDBBaseObject dbBaseObject, String revision) {
		GenericObjectService<BTSDBBaseObject, String> service = (GenericObjectService<BTSDBBaseObject, String>) findServiceByObject(dbBaseObject);
		if (service != null)
		{
			return service.removeRevision(dbBaseObject, revision);
		}
		return false;
	}

	@Override
	public void reloadConflicts(BTSDBBaseObject dbBaseObject) {
		GenericObjectService<BTSDBBaseObject, String> service = (GenericObjectService<BTSDBBaseObject, String>) findServiceByObject(dbBaseObject);
		if (service != null)
		{
			service.reloadConflicts(dbBaseObject);
		}
		
	}

	@Override
	public List<DBRevision> listAvailableRevisions(BTSDBBaseObject dbBaseObject,
			boolean fetchFromRemote, IProgressMonitor monitor) {
		GenericObjectService<?, String> service = findServiceByObject(dbBaseObject);
		if (service != null)
		{
			return service.listAvailableRevisions(dbBaseObject, fetchFromRemote, monitor);
		}
		return null;
	}

	@Override
	public BTSDBBaseObject find(String id, String dbCollectionKey,
			BTSDBBaseObject dbBaseObject, String rev, IProgressMonitor monitor) {

		return find(id, dbCollectionKey, rev, dbBaseObject, false, monitor);
	}

	@Override
	public BTSDBBaseObject replaceCurrentWithRevision(BTSDBBaseObject current,
			BTSDBBaseObject revision) {
		// cach old revs
		String rev = current.get_rev();
		List<String> copyRevs = new Vector<String>();
		for(String r : ((AdministrativDataObject)current).getRevisions())
		{
			copyRevs.add(new String(r));
		}
		// merge revision into current
		BTSDBBaseObject eObject = EmfModelHelper.mergeChanges(current, revision);
		// reset db revision and user revisions
		eObject.set_rev(rev);
		((AdministrativDataObject)current).getRevisions().addAll(copyRevs);
		// save
		save(eObject);
		return eObject;
	}

		
}
