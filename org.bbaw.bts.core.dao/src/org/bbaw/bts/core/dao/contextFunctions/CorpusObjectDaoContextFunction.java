package org.bbaw.bts.core.dao.contextFunctions;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.dao.DAOFactory;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.model.application.MApplication;

public class CorpusObjectDaoContextFunction extends ContextFunction
{
	private static final String DEFAULT_DAO_FACTORY = "couchdb.daofactory";
	@Inject
	@Preference(value = "daoFactoryName", nodePath = "org.bbaw.bts.app")
	private String daoFactoryName;

	
	@Inject
	private Logger logger;
	
	@Inject
	private IExtensionRegistry registry;
	
	@Override
	public Object compute(IEclipseContext context)
	{
		MApplication application = context.get(MApplication.class);
		if (application != null && application.getContext() != null)
		{
			context = application.getContext();
		}
		CorpusObjectDao dao;
		try
		{
			dao = loadDaoFactory(context, registry).createDao(CorpusObjectDao.class, context);
		} catch (CoreException e)
		{
			e.printStackTrace();
			throw new BTSDBException("No DaoFactory found for CorpusObjectDao and factory name: " + daoFactoryName, e);

		}
		context.set(CorpusObjectDao.class, dao);

		return dao;
	}

	private DAOFactory loadDaoFactory(IEclipseContext context, IExtensionRegistry registry) throws CoreException
	{
		if (daoFactoryName == null)
		{
			daoFactoryName = DEFAULT_DAO_FACTORY;
		}
		if (logger == null)
		{
			logger = (Logger) context.get(Logger.class.getName());
		}
		logger.debug("extension registry " + registry);

		if (registry == null)
		{
			registry = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()));
		}
		IExtensionPoint[] points = registry.getExtensionPoints();
		for (IExtensionPoint p : points)
		{
			logger.debug(p.getUniqueIdentifier());
		}
		IConfigurationElement[] config = registry
				.getConfigurationElementsFor(DaoConstants.DAO_FACTORY_EXTENSION_POINT_ID);

		logger.debug("extension registry number of elements " + config);
		logger.debug("extension registry number of elements " + config.length);

		for (IConfigurationElement e : config)
		{
			logger.debug("extension registry element " + e.getName());

			final Object o = e.createExecutableExtension("class");
			if (o instanceof DAOFactory
					&& (daoFactoryName == null || daoFactoryName.equals(((DAOFactory) o).getFactoryName())))
			{
				return (DAOFactory) o;
			}
		}
		throw new BTSDBException("No DaoFactory found for CorpusObjectDao and factory name: " + daoFactoryName);

	}
}
