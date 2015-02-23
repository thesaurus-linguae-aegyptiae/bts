package org.bbaw.bts.core.remote.dao.contextFunctions;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.remote.dao.RemoteBTSIDReservationObjectDao;
import org.bbaw.bts.core.remote.dao.RemoteDAOFactory;
import org.bbaw.bts.core.remote.dao.util.RemoteDaoConstants;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.MApplication;

public class RemoteBTSIDReservationObjectDaoContextFunction extends ContextFunction
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
		RemoteBTSIDReservationObjectDao dao;
		try
		{
			dao = loadDaoFactory(context).createDao(RemoteBTSIDReservationObjectDao.class, context);
		} catch (CoreException e)
		{
			e.printStackTrace();
			throw new BTSDBException("No DaoFactory found for BTSUserDao and factory name: " + daoFactoryName, e);

		}
		context.set(RemoteBTSIDReservationObjectDao.class, dao);

		return dao;
	}

	private RemoteDAOFactory loadDaoFactory(IEclipseContext context) throws CoreException
	{
		IConfigurationElement[] config = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()))
				.getConfigurationElementsFor(RemoteDaoConstants.REMOTE_DAO_FACTORY_EXTENSION_POINT_ID);
		for (IConfigurationElement e : config)
		{
			final Object o = e.createExecutableExtension("class");
			if (o instanceof RemoteDAOFactory
					&& (daoFactoryName == null || daoFactoryName.equals(((RemoteDAOFactory) o).getFactoryName())))
			{
				return (RemoteDAOFactory) o;
			}
		}
		throw new BTSDBException("No DaoFactory found for BTSUserDao and factory name: " + daoFactoryName);

	}
}
