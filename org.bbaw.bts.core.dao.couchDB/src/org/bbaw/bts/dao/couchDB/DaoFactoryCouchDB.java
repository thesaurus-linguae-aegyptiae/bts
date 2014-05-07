package org.bbaw.bts.dao.couchDB;

import org.bbaw.bts.core.dao.BTSAnnotationDao;
import org.bbaw.bts.core.dao.BTSCommentDao;
import org.bbaw.bts.core.dao.BTSConfigurationDao;
import org.bbaw.bts.core.dao.BTSImageDao;
import org.bbaw.bts.core.dao.BTSListEntryDao;
import org.bbaw.bts.core.dao.BTSProjectDao;
import org.bbaw.bts.core.dao.BTSTCObjectDao;
import org.bbaw.bts.core.dao.BTSTextCorpusDao;
import org.bbaw.bts.core.dao.BTSTextDao;
import org.bbaw.bts.core.dao.BTSThsEntryDao;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.dao.BTSUserGroupDao;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.dao.DAOFactory;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.DBLeaseDao;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.GraphicSelectionCounterDao;
import org.bbaw.bts.dao.couchDB.impl.BTSAnnotationDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSCommentDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSConfigurationDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSImageDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSListEntryDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSProjectDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSTCObjectDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSTextCorpusDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSTextDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSThsEntryDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSUserDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.BTSUserGroupDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.Backend2ClientUpdateDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.CorpusObjectDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.DBConnectionProviderImpl;
import org.bbaw.bts.dao.couchDB.impl.DBLeaseDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.GeneralPurposeDaoImpl;
import org.bbaw.bts.dao.couchDB.impl.GraphicSelectionCounterDaoImpl;
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
		} else if (clazz == BTSAnnotationDao.class)
		{
			return (T) getBTSAnnotationDao(context);
		} else if (clazz == BTSCommentDao.class)
		{
			return (T) getBTSCommentDao(context);
		} else if (clazz == BTSConfigurationDao.class)
		{
			return (T) getBTSConfigurationDao(context);
		} else if (clazz == BTSImageDao.class)
		{
			return (T) getBTSImageDao(context);
		} else if (clazz == BTSListEntryDao.class)
		{
			return (T) getBTSListEntryDao(context);
		} else if (clazz == BTSProjectDao.class)
		{
			return (T) getBTSProjectDao(context);
		} else if (clazz == BTSTCObjectDao.class)
		{
			return (T) getBTSTCObjectDao(context);
		} else if (clazz == BTSTextCorpusDao.class)
		{
			return (T) getBTSTextCorpusDao(context);
		} else if (clazz == BTSTextDao.class)
		{
			return (T) getBTSTextDao(context);
		} else if (clazz == BTSThsEntryDao.class)
		{
			return (T) getBTSThsEntryDao(context);
		} else if (clazz == BTSUserDao.class)
		{
			return (T) getBTSUserDao(context);
		} else if (clazz == BTSUserGroupDao.class)
		{
			return (T) getBTSUserGroupDao(context);
		} else if (clazz == CorpusObjectDao.class)
		{
			return (T) getCorpusObjectDao(context);
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
 else if (clazz == GraphicSelectionCounterDao.class) {
			return (T) getGraphicSelectionCounterDao(context);
		}
		return null;
	}

	private GraphicSelectionCounterDao getGraphicSelectionCounterDao(
			IEclipseContext context) {
		GraphicSelectionCounterDao dao = ContextInjectionFactory.make(
				GraphicSelectionCounterDaoImpl.class, context);
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

	private CorpusObjectDao getCorpusObjectDao(IEclipseContext context)
	{
		CorpusObjectDao dao = ContextInjectionFactory.make(CorpusObjectDaoImpl.class, context);
		return dao;
	}

	private BTSThsEntryDao getBTSThsEntryDao(IEclipseContext context)
	{
		BTSThsEntryDao dao = ContextInjectionFactory.make(BTSThsEntryDaoImpl.class, context);
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

	private BTSAnnotationDao getBTSAnnotationDao(IEclipseContext context)
	{
		BTSAnnotationDao dao = ContextInjectionFactory.make(BTSAnnotationDaoImpl.class, context);
		return dao;
	}

	private BTSConfigurationDao getBTSConfigurationDao(IEclipseContext context)
	{
		BTSConfigurationDao dao = ContextInjectionFactory.make(BTSConfigurationDaoImpl.class, context);
		return dao;
	}

	private BTSImageDao getBTSImageDao(IEclipseContext context)
	{
		BTSImageDao dao = ContextInjectionFactory.make(BTSImageDaoImpl.class, context);
		return dao;
	}

	private BTSListEntryDao getBTSListEntryDao(IEclipseContext context)
	{
		BTSListEntryDao dao = ContextInjectionFactory.make(BTSListEntryDaoImpl.class, context);
		return dao;
	}

	private BTSTCObjectDao getBTSTCObjectDao(IEclipseContext context)
	{
		BTSTCObjectDao dao = ContextInjectionFactory.make(BTSTCObjectDaoImpl.class, context);
		return dao;
	}

	private BTSTextCorpusDao getBTSTextCorpusDao(IEclipseContext context)
	{
		BTSTextCorpusDao dao = ContextInjectionFactory.make(BTSTextCorpusDaoImpl.class, context);
		return dao;
	}

	private BTSTextDao getBTSTextDao(IEclipseContext context)
	{
		BTSTextDao dao = ContextInjectionFactory.make(BTSTextDaoImpl.class, context);
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
