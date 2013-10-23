package org.bbaw.bts.core.dao.contextFunctions;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.BTSProjectDao;
import org.bbaw.bts.core.dao.DAOFactory;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSProjectDaoContextFunction extends ContextFunction
{

	@Inject
	@Preference(value = "daoFactoryName", nodePath = "org.bbaw.bts.app")
	private String daoFactoryName;
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
		BTSProjectDao dao;
		try
		{
			dao = loadDaoFactory(context).createDao(BTSProjectDao.class, context);
		} catch (CoreException e)
		{
			e.printStackTrace();
			throw new BTSDBException("No DaoFactory found for BTSProjectDao and factory name: " + daoFactoryName, e);

		}
		context.set(BTSProjectDao.class, dao);

		return dao;
	}

	private DAOFactory loadDaoFactory(IEclipseContext context) throws CoreException
	{
		IConfigurationElement[] config = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()))
				.getConfigurationElementsFor(DaoConstants.DAO_FACTORY_EXTENSION_POINT_ID);
		for (IConfigurationElement e : config)
		{
			final Object o = e.createExecutableExtension("class");
			if (o instanceof DAOFactory
					&& (daoFactoryName == null || daoFactoryName.equals(((DAOFactory) o).getFactoryName())))
			{
				return (DAOFactory) o;
			}
		}
		throw new BTSDBException("No DaoFactory found for BTSProjectDao and factory name: " + daoFactoryName);

	}
}