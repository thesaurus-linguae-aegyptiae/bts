package org.bbaw.bts.core.dao.contextFunctions;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.BTSCommentDao;
import org.bbaw.bts.core.dao.DAOFactory;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;

public abstract class AbstractDaoFactoryContextFunction extends ContextFunction {
	
	protected DAOFactory[] loadDaoFactory(IEclipseContext context, String factoryName) throws CoreException
	{
		IConfigurationElement[] config = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()))
				.getConfigurationElementsFor(DaoConstants.DAO_FACTORY_EXTENSION_POINT_ID);
		List<DAOFactory> factories = new Vector<DAOFactory>(4);
		for (IConfigurationElement e : config)
		{
			final Object o = e.createExecutableExtension("class");
			if (o instanceof DAOFactory
					&& (factoryName == null || factoryName.equals(((DAOFactory) o).getFactoryName())))
			{
				factories.add((DAOFactory) o);
			}
		}
		Object o = context.get(DaoConstants.DAO_FACTORY_EXTENSION_POINT_ID);
		if (o != null && o instanceof Vector<?>)
		{
			for (Object os : (List<?>) o)
			{
				if (os instanceof DAOFactory)
				{
					factories.add((DAOFactory)os);
				}
			}
		}
		if (!factories.isEmpty())
		{
			return factories.toArray(new DAOFactory[factories.size()]);
		}
		throw new BTSDBException("No DaoFactory found for BTSAnnotationDao and factory name: " + factoryName);

	}

	protected <E> E loadDao(IEclipseContext context,
			String daoFactoryName, Class<E> clazz) throws CoreException {
		DAOFactory[] factories = loadDaoFactory(context, daoFactoryName);
		for (DAOFactory fac : factories)
		{
			Object o = fac.createDao(clazz, context);
			if (o != null && clazz.isAssignableFrom(clazz))
			{
				return (E)o;
			}
		}
		return null;
	}

}
