package org.bbaw.bts.db.couchdb;

import org.bbaw.bts.db.DBManager;
import org.bbaw.bts.db.couchdb.impl.CouchDBManager;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class CouchDBManagerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize CouchDBManager");
		// Add the new object to the application context
		// MApplication application = context.get(MApplication.class);
		// IEclipseContext ctx = application.getContext();

		DBManager controller = ContextInjectionFactory.make(CouchDBManager.class, context);
		context.set(DBManager.class, controller);

		return controller;
	}
}
