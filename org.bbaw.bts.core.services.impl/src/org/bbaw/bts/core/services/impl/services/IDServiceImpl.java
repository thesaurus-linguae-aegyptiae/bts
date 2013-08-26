package org.bbaw.bts.core.services.impl.services;

import java.util.Calendar;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.core.services.IDService;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class IDServiceImpl implements IDService
{

	private IEclipseContext eclipseCtx;
	private static Calendar now;

	@Inject
	public IDServiceImpl(IEclipseContext eclipseCtx)
	{
		this.eclipseCtx = eclipseCtx;
		eclipseCtx.set(IDServiceImpl.class, this);
	}

	public String createId()
	{
		now = Calendar.getInstance();
		String id = new Long(now.getTimeInMillis()).toString();
		BTSUser user = (BTSUser) eclipseCtx.get("currentUser");
		if (user != null)
		{
			id += user.get_id().substring(5, 15);
		}
		return id;
	}
}
