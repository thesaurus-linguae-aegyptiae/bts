package org.bbaw.bts.core.dao.corpus.couchdb;

import org.bbaw.bts.core.dao.DAOFactory;
import org.bbaw.bts.core.dao.corpus.BTSAnnotationDao;
import org.bbaw.bts.core.dao.corpus.BTSImageDao;
import org.bbaw.bts.core.dao.corpus.BTSLemmaEntryDao;
import org.bbaw.bts.core.dao.corpus.BTSTCObjectDao;
import org.bbaw.bts.core.dao.corpus.BTSTextCorpusDao;
import org.bbaw.bts.core.dao.corpus.BTSTextDao;
import org.bbaw.bts.core.dao.corpus.BTSThsEntryDao;
import org.bbaw.bts.core.dao.corpus.CorpusObjectDao;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSAnnotationDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSImageDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSLemmaEntryDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSTCObjectDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSTextCorpusDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSTextDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSThsEntryDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.CorpusObjectDaoImpl;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class CorpusDaoFactoryCouchDB implements DAOFactory
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
		if (clazz == BTSAnnotationDao.class)
		{
			return (T) getBTSAnnotationDao(context);
		} else if (clazz == BTSImageDao.class)
		{
			return (T) getBTSImageDao(context);
		} else if (clazz == BTSLemmaEntryDao.class)
		{
			return (T) getBTSLemmaEntryDao(context);
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
		} else if (clazz == CorpusObjectDao.class)
		{
			return (T) getCorpusObjectDao(context);
		}
		return null;
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



	private BTSAnnotationDao getBTSAnnotationDao(IEclipseContext context)
	{
		BTSAnnotationDao dao = ContextInjectionFactory.make(BTSAnnotationDaoImpl.class, context);
		return dao;
	}


	private BTSImageDao getBTSImageDao(IEclipseContext context)
	{
		BTSImageDao dao = ContextInjectionFactory.make(BTSImageDaoImpl.class, context);
		return dao;
	}

	private BTSLemmaEntryDao getBTSLemmaEntryDao(IEclipseContext context)
	{
		BTSLemmaEntryDao dao = ContextInjectionFactory.make(BTSLemmaEntryDaoImpl.class, context);
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

}
