package org.bbaw.bts.core.dao.corpus.contextFunctions;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.contextFunctions.AbstractDaoFactoryContextFunction;
import org.bbaw.bts.core.dao.corpus.BTSLemmaEntryDao;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.MApplication;

@SuppressWarnings("restriction")
public class BTSLemmaEntryDaoContextFunction extends AbstractDaoFactoryContextFunction
{
	@Inject
	@Preference(value = "daoFactoryName", nodePath = "org.bbaw.bts.app")
	private String daoFactoryName;

	@Override
	public Object compute(IEclipseContext context)
	{
		MApplication application = context.get(MApplication.class);
		if (application != null && application.getContext() != null)
		{
			context = application.getContext();
		}
		BTSLemmaEntryDao dao;
		try
		{
			dao = loadDao(context, daoFactoryName, BTSLemmaEntryDao.class);
		} catch (CoreException e)
		{
			e.printStackTrace();
			throw new BTSDBException("No DaoFactory found for BTSListEntryDao and factory name: " + daoFactoryName, e);

		}
		context.set(BTSLemmaEntryDao.class, dao);

		return dao;
	}

}