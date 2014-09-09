package org.bbaw.bts.core.services.impl.services;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.MoveObjectAmongProjectDBCollectionsService;
import org.bbaw.bts.core.commons.MoveObjectsAmongProjectDBCollectionsServiceFactory;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.services.GeneralMoveObjectAmongProjectsService;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class GeneralMoveObjectAmongProjectsServiceImpl implements
		GeneralMoveObjectAmongProjectsService {
	
	@Inject
	private IEclipseContext context;

	@Override
	public BTSFilter getMoveDBCollectionFilter(Object object) {
		
		MoveObjectsAmongProjectDBCollectionsServiceFactory moveServiceFactory = getMoveServiceFactoryForObject(object);
		if (moveServiceFactory != null)
		{
			return moveServiceFactory.getMoveObjectAmongProjectDBCollectionsFilter(object);
		}
		return null;
	}

	private MoveObjectsAmongProjectDBCollectionsServiceFactory getMoveServiceFactoryForObject(
			Object object) {
		IConfigurationElement[] config = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()))
				.getConfigurationElementsFor(BTSCoreConstants.EXTENSION_POINT_MOVE_OBJECT_SERVICE_FACTORY);
		for (IConfigurationElement e : config)
		{
			Object o = null;
			try {
				o = e.createExecutableExtension("class");
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (o != null && o instanceof MoveObjectsAmongProjectDBCollectionsServiceFactory)
			{
				if (((MoveObjectsAmongProjectDBCollectionsServiceFactory) o).providesServiceForObject(object))
				{
					return (MoveObjectsAmongProjectDBCollectionsServiceFactory) o;
				}
			}
		}
		return null;
	}

	@Override
	public boolean move(BTSDBBaseObject object, String targetDBCollectionPath, String sourceDBCollectionPath) {
		MoveObjectAmongProjectDBCollectionsService service = getMoveService(object);
		String projectPrefix = targetDBCollectionPath;
		if (targetDBCollectionPath.contains("_"))
		{
			projectPrefix = targetDBCollectionPath.split("_")[0];
		}
		object.setProject(projectPrefix);
		if (service != null)
		{
			return service.move(object, targetDBCollectionPath, sourceDBCollectionPath);
		}
		else
		{
			return generalMove(object, targetDBCollectionPath, sourceDBCollectionPath);
		}
	}

	private boolean generalMove(BTSDBBaseObject object,
			String targetDBCollectionPath, String sourceDBCollectionPath) {
		// TODO Auto-generated method stub
		return false;
	}

	private MoveObjectAmongProjectDBCollectionsService getMoveService(
			BTSDBBaseObject object) {
		MoveObjectsAmongProjectDBCollectionsServiceFactory moveServiceFactory = getMoveServiceFactoryForObject(object);
		if (moveServiceFactory != null)
		{
			return moveServiceFactory.getMoveObjectAmongProjectDBCollectionsService(object);
		}
		return null;
	}

	
}
