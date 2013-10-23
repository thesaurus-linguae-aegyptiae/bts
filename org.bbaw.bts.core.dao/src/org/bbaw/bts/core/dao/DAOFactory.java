package org.bbaw.bts.core.dao;

import org.eclipse.e4.core.contexts.IEclipseContext;

public interface DAOFactory
{

	String getFactoryName();

	String getFactoryDescription();

	<T> T createDao(Class<T> clazz, IEclipseContext context);
}
