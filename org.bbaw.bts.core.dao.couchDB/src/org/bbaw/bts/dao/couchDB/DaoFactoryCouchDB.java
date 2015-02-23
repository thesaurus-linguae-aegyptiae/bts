package org.bbaw.bts.dao.couchDB;

import org.bbaw.bts.core.dao.BTSCommentDao;
import org.bbaw.bts.core.dao.BTSConfigurationDao;
import org.bbaw.bts.core.dao.BTSIDReservationObjectDao;
import org.bbaw.bts.core.dao.BTSProjectDao;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.dao.BTSUserGroupDao;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.DAOFactory;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.DBLeaseDao;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.UserActionCounterDao;
import org.bbaw.bts.dao.couchDB.impl.BTSCommentDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSConfigurationDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSIDReservationObjectDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSProjectDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSUserDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSUserGroupDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.Backend2ClientUpdateDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.DBConnectionProviderImpl;
import org.bbaw.bts.dao.couchDB.impl.DBLeaseDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.GeneralPurposeDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.UserActionCounterDaoImpl;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class DaoFactoryCouchDB implements DAOFactory
{

	@Override
	public String getFactoryName()
	{
		return "couchdb.daofactory";
	}

	@Override
	public String getFactoryDescription()
	{
		return "This (IEclipseContext context)ctory creates daos to access couchdb.";
	}

	@Override
	public <T> T createDao(Class<T> clazz, IEclipseContext context)
	{
		if (clazz == Backend2ClientUpdateDao.class)
		{
			return (T) getBackend2ClientUpdateDao(context);
		} else if (clazz == BTSCommentDao.class)
		{
			return (T) getBTSCommentDao(context);
		} else if (clazz == BTSConfigurationDao.class)
		{
			return (T) getBTSConfigurationDao(context);
		} else if (clazz == BTSProjectDao.class)
		{
			return (T) getBTSProjectDao(context);
		} else if (clazz == BTSUserDao.class)
		{
			return (T) getBTSUserDao(context);
		} else if (clazz == BTSUserGroupDao.class)
		{
			return (T) getBTSUserGroupDao(context);
		} else if (clazz == DBLeaseDao.class)
		{
			return (T) getDBLeaseDao(context);
		} else if (clazz == GeneralPurposeDao.class)
		{
			return (T) getGeneralPurposeDao(context);
		} else if (clazz == DBConnectionProvider.class)
		{
			return (T) getDBConnectionProvider(context);
		}
		else if (clazz == UserActionCounterDao.class) {
			return (T) getGraphicSelectionCounterDao(context);
		}else if (clazz == BTSIDReservationObjectDao.class) {
			return (T) getBTSIDReservationObjectDao(context);
		}
		return null;
	}

	private BTSIDReservationObjectDao getBTSIDReservationObjectDao(IEclipseContext context) {
		BTSIDReservationObjectDaoImpl dao = ContextInjectionFactory.make(
				BTSIDReservationObjectDaoImpl.class, context);
		return dao;
	}

	private UserActionCounterDao getGraphicSelectionCounterDao(
			IEclipseContext context) {
		UserActionCounterDaoImpl dao = ContextInjectionFactory.make(
				UserActionCounterDaoImpl.class, context);
		return dao;
	}

	private DBConnectionProvider getDBConnectionProvider(IEclipseContext context)
	{
		DBConnectionProvider dao = ContextInjectionFactory.make(DBConnectionProviderImpl.class, context);
		return dao;
	}

	private GeneralPurposeDao getGeneralPurposeDao(IEclipseContext context)
	{
		GeneralPurposeDao dao = ContextInjectionFactory.make(GeneralPurposeDaoImpl.class, context);
		return dao;

	}

	private DBLeaseDao getDBLeaseDao(IEclipseContext context)
	{
		DBLeaseDao dao = ContextInjectionFactory.make(DBLeaseDaoImpl.class, context);
		return dao;
	}


	private BTSProjectDao getBTSProjectDao(IEclipseContext context)
	{
		BTSProjectDao dao = ContextInjectionFactory.make(BTSProjectDaoImpl.class, context);
		return dao;
	}

	private BTSCommentDao getBTSCommentDao(IEclipseContext context)
	{
		BTSCommentDao dao = ContextInjectionFactory.make(BTSCommentDaoImpl.class, context);
		return dao;
	}

	private Backend2ClientUpdateDao getBackend2ClientUpdateDao(IEclipseContext context)
	{
		Backend2ClientUpdateDao dao = ContextInjectionFactory.make(Backend2ClientUpdateDaoImpl.class, context);
		return dao;
	}


	private BTSConfigurationDao getBTSConfigurationDao(IEclipseContext context)
	{
		BTSConfigurationDao dao = ContextInjectionFactory.make(BTSConfigurationDaoImpl.class, context);
		return dao;
	}

	private BTSUserDao getBTSUserDao(IEclipseContext context)
	{
		BTSUserDao dao = ContextInjectionFactory.make(BTSUserDaoImpl.class, context);
		return dao;
	}

	private BTSUserGroupDao getBTSUserGroupDao(IEclipseContext context)
	{
		BTSUserGroupDao dao = ContextInjectionFactory.make(BTSUserGroupDaoImpl.class, context);
		return dao;
	}
}
