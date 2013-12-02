package org.bbaw.bts.core.remote.dao;

import org.eclipse.e4.core.contexts.IEclipseContext;

public interface RemoteDAOFactory
{

	String getFactoryName();

	String getFactoryDescription();

	<T> T createDao(Class<T> clazz, IEclipseContext context);
}
