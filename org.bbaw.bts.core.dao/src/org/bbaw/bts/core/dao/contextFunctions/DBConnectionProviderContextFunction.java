package org.bbaw.bts.core.dao.contextFunctions;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.MApplication;

public class DBConnectionProviderContextFunction extends AbstractDaoFactoryContextFunction
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
		DBConnectionProvider dao;
		try
		{
			dao = loadDao(context, daoFactoryName,DBConnectionProvider.class);
		} catch (CoreException e)
		{
			e.printStackTrace();
			throw new BTSDBException(
					"No DaoFactory found for DBConnectionProvider and factory name: " + daoFactoryName, e);

		}
		context.set(DBConnectionProvider.class, dao);

		return dao;
	}

}
