package org.bbaw.bts.core.remote.dao.contextFunctions;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.remote.dao.RemoteBTSProjectDao;
import org.bbaw.bts.core.remote.dao.RemoteDAOFactory;
import org.bbaw.bts.core.remote.dao.util.RemoteDaoConstants;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.model.application.MApplication;

public class RemoteBTSProjectDaoContextFunction extends ContextFunction
{

	@Inject
	@Preference(value = "remotedaoFactoryName", nodePath = "org.bbaw.bts.app")
	private String remotedaoFactoryName;

	@Inject
	private Logger logger;
	
	@Override
	public Object compute(IEclipseContext context)
	{
	
		MApplication application = context.get(MApplication.class);
		if (application != null && application.getContext() != null) {
			context = application.getContext();
		}
		RemoteBTSProjectDao dao;
		try {
			dao = loadDaoFactory(context).createDao(RemoteBTSProjectDao.class,
					context);
		} catch (CoreException e) {
			e.printStackTrace();
			throw new BTSDBException(
					"No RemoteDaoFactory found for BTSProjectDao and factory name: "
							+ remotedaoFactoryName, e);

		}
		context.set(RemoteBTSProjectDao.class, dao);

		return dao;
	}

	private RemoteDAOFactory loadDaoFactory(IEclipseContext context) throws CoreException
	{
		IExtensionRegistry registry = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()));

		IConfigurationElement[] config = registry
				.getConfigurationElementsFor(RemoteDaoConstants.REMOTE_DAO_FACTORY_EXTENSION_POINT_ID);
		if (logger == null)
		{
			logger = (Logger) context.get(Logger.class.getName());
		}
		logger.debug("number of extension " + RemoteDaoConstants.REMOTE_DAO_FACTORY_EXTENSION_POINT_ID 
				+ "configuration elements : " + config.length);
		IExtensionPoint[] points = registry.getExtensionPoints();
		for (IExtensionPoint p : points)
		{
			logger.debug(p.getUniqueIdentifier());
		}
		for (IConfigurationElement e : config)
		{
			final Object o = e.createExecutableExtension("class");
			if (o instanceof RemoteDAOFactory
					&& (remotedaoFactoryName == null || remotedaoFactoryName.equals(((RemoteDAOFactory) o)
							.getFactoryName())))
			{
				return (RemoteDAOFactory) o;
			}
		}
		throw new BTSDBException("No DaoFactory found for BTSProjectDao and factory name: " + remotedaoFactoryName);

	}
}