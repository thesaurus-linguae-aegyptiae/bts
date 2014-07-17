package org.bbaw.bts.core.dao.contextFunctions;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.MApplication;

public class GeneralPurposeDaoContextFunction extends AbstractDaoFactoryContextFunction
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
		GeneralPurposeDao dao;
		try
		{
			dao = loadDao(context, daoFactoryName,GeneralPurposeDao.class);
		} catch (CoreException e)
		{
			e.printStackTrace();
			throw new BTSDBException("No DaoFactory found for GeneralPurposeDao and factory name: " + daoFactoryName, e);

		}
		context.set(GeneralPurposeDao.class, dao);

		return dao;
	}

}
