package org.bbaw.bts.dao.couchDB;

import org.bbaw.bts.core.dao.BTSAnnotationDao;
import org.bbaw.bts.core.dao.BTSConfigurationDao;
import org.bbaw.bts.core.dao.BTSImageDao;
import org.bbaw.bts.core.dao.BTSListEntryDao;
import org.bbaw.bts.core.dao.BTSTCObjectDao;
import org.bbaw.bts.core.dao.BTSTextCorpusDao;
import org.bbaw.bts.core.dao.BTSTextDao;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.dao.BTSUserGroupDao;
import org.bbaw.bts.core.dao.DAOFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;

public class CouchDBDaoFactory extends DAOFactory {

	protected ResourceSet resourceSet;

	protected CouchDbClient dbClient;
	
	public CouchDBDaoFactory()
	{
		resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		initDB();
	}
	
	public void initDB()
	{
		CouchDbProperties properties = new CouchDbProperties()
		  .setDbName("aew")
		  .setCreateDbIfNotExist(true)
		  .setProtocol("http")
		  .setHost("127.0.0.1")
		  .setPort(5985)
		  
		  .setMaxConnections(100)
		  .setConnectionTimeout(0);

		dbClient = new CouchDbClient(properties);
	
	}
	
	private CouchDBDao<?, ?> instantiateDAO(Class<?> daoClass) {
		try {
			CouchDBDao<?, ?> dao = (CouchDBDao<?, ?>)daoClass.newInstance();
			dao.setDbClient(dbClient);
			dao.setResourceSet(resourceSet);
			return dao;
		} catch (Exception e) {
			throw new RuntimeException("Cannot instantiate DAO: " + daoClass, e);
		}
	}
	
	@Override
	public BTSAnnotationDao getBTSAnnotationDao() {
		return (BTSAnnotationDao) instantiateDAO(BTSAnnotationDaoImpl.class);
	}

	@Override
	public BTSConfigurationDao getBTSConfigurationDao() {
		return (BTSConfigurationDao) instantiateDAO(BTSConfigurationDaoImpl.class);
	}

	@Override
	public BTSImageDao getBTSImageDao() {
		return (BTSImageDao) instantiateDAO(BTSImageDaoImpl.class);
	}

	@Override
	public BTSListEntryDao getBTSListEntryDao() {
		return (BTSListEntryDao) instantiateDAO(BTSListEntryDaoImpl.class);
	}

	@Override
	public BTSTCObjectDao getBTSTCObjectDao() {
		return (BTSTCObjectDao) instantiateDAO(BTSTCObjectDaoImpl.class);
	}

	@Override
	public BTSTextCorpusDao getBTSTextCorpusDao() {
		return (BTSTextCorpusDao) instantiateDAO(BTSTextCorpusDaoImpl.class);
	}

	@Override
	public BTSTextDao getBTSTextDao() {
		return (BTSTextDao) instantiateDAO(BTSTextDaoImpl.class);
	}

	@Override
	public BTSUserDao getBTSUserDao() {
		return (BTSUserDao) instantiateDAO(BTSUserDaoImpl.class);
	}

	@Override
	public BTSUserGroupDao getBTSUserGroupDao() {
		return (BTSUserGroupDao) instantiateDAO(BTSUserGroupDaoImpl.class);
	}

}
