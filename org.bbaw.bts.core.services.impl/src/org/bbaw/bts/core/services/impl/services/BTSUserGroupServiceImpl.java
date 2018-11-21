package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.dao.BTSUserGroupDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.eclipse.core.runtime.IProgressMonitor;

public class BTSUserGroupServiceImpl extends GenericObjectServiceImpl<BTSUserGroup, String> implements
		BTSUserGroupService, BTSObjectSearchService
{

	@Inject
	private BTSUserGroupDao userGroupDao;

	@Override
	public BTSUserGroup createNew()
	{
		BTSUserGroup entity = BtsmodelFactory.eINSTANCE.createBTSUserGroup();
		entity.setDBCollectionKey(BTSCoreConstants.ADMIN);

		super.setId(entity, entity.getDBCollectionKey());
		super.setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSUserGroup entity)
	{
		super.addRevisionStatement(entity);
		userGroupDao.add(entity, BTSCoreConstants.ADMIN);
		return true;
	}

	@Override
	public void update(BTSUserGroup entity)
	{
		userGroupDao.update(entity, BTSCoreConstants.ADMIN);

	}

	@Override
	public void remove(BTSUserGroup entity)
	{
		userGroupDao.remove(entity, BTSCoreConstants.ADMIN);

	}

	@Override
	public BTSUserGroup find(String key, IProgressMonitor monitor)
	{
		BTSUserGroup userGroup = null;
		userGroup = userGroupDao.find(key, BTSCoreConstants.ADMIN);
		if (userGroup != null)
		{
			return userGroup;
		}
		return null;
	}

	@Override
	public List<BTSUserGroup> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSUserGroup> userGroups = userGroupDao.list(
				BTSCoreConstants.ADMIN, objectState);
		return userGroups;
	}

	@Override
	public List<BTSUserGroup> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor)
	{
		return query(query, objectState, true, monitor);
	}

	@Override
	public List<BTSUserGroup> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor) {
		String[] indexArray = new String[]{BTSCoreConstants.ADMIN};
		List<BTSUserGroup> objects = userGroupDao.query(query,
				indexArray, indexArray, objectState,
				registerQuery);
		return filter(objects);
	}
	@Override
	public List<BTSUserGroup> list(String dbPath, String queryId,
			String objectState, IProgressMonitor monitor)
	{
		return filter(userGroupDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public List<BTSUserGroup> listChunks(int chunkSize,  String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSUserGroup> userGroups = userGroupDao.listChunks(chunkSize, chunkIds,
				BTSCoreConstants.ADMIN, objectState);
		return filter(userGroups);
	}
	
	@Override
	public String getNameOfServedClass() {
		return "BTSUserGroup";
	}

	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSUserGroup.class;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#findAsJsonString(java.io.Serializable, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		return userGroupDao.findAsJsonString(key, BTSCoreConstants.ADMIN);
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#queryAsJsonString(org.bbaw.bts.core.dao.util.BTSQueryRequest, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<String> queryAsJsonString(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		String[] indexArray = new String[]{BTSCoreConstants.ADMIN};

		List<String> objects = userGroupDao.queryAsJsonString(query,
				indexArray, indexArray, objectState,
				false);
		return objects;
	}

	
}
