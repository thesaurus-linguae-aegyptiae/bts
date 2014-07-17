package org.bbaw.bts.core.services.impl.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.dao.BTSProjectDao;
import org.bbaw.bts.core.remote.dao.RemoteBTSProjectDao;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class BTSProjectServiceImpl extends GenericObjectServiceImpl<BTSProject, String> implements BTSProjectService
{
	@Inject
	private BTSProjectDao projectDao;

	@Inject
	private RemoteBTSProjectDao remoteprojectDao;

	@Override
	public BTSProject createNew()
	{
		BTSProject entity = BtsmodelFactory.eINSTANCE.createBTSProject();
		super.setId(entity);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSProject entity)
	{
		super.addRevisionStatement(entity);
		for (BTSProjectDBCollection coll : entity.getDbCollections())
		{
			try {
				saveAuthorisation(entity, coll);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		projectDao.add(entity, BTSCoreConstants.ADMIN);
		return true;
	}


	private void saveAuthorisation(BTSProject entity, BTSProjectDBCollection coll)
	{

		if (!coll.getRoleDescriptions().isEmpty())
		{
			Set<String> memberUsers = new HashSet<String>();
			Set<String> memberRoles = new HashSet<String>();
			BTSDBCollectionRoleDesc memberDesc = null;

			for (BTSDBCollectionRoleDesc desc : coll.getRoleDescriptions())
			{
				if (!"admins".equals(desc.getRoleName()))
				{
					for (String s : desc.getUserNames())
					{
						memberUsers.add(s);
					}
					for (String s : desc.getUserRoles())
					{
						memberRoles.add(s);
					}
					if ("members".equals(desc.getRoleName()))
					{
						memberDesc = desc;
					}
				}


			}
			if (memberDesc == null)
			{
				memberDesc = BtsmodelFactory.eINSTANCE.createBTSDBCollectionRoleDesc();
				memberDesc.setRoleName("members");
				coll.getRoleDescriptions().add(memberDesc);
			}
			memberDesc.getUserNames().addAll(memberUsers);
			memberDesc.getUserRoles().addAll(memberRoles);
			try {
				remoteprojectDao.addAuthorisation(coll, entity.getPrefix());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			projectDao.addAuthorisation(coll, entity.getPrefix());
		} else
		{
			try {
				remoteprojectDao.addAuthorisation(coll, entity.getPrefix());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			projectDao.addAuthorisation(coll, entity.getPrefix());
		}

	}

	@Override
	public boolean saveMultiple(Set<BTSProject> entities)
	{
		for (BTSProject p : entities)
		{
			save(p);
		}
		return true;
	}

	@Override
	public void update(BTSProject entity)
	{
		projectDao.update(entity, BTSCoreConstants.ADMIN);

	}

	@Override
	public void remove(BTSProject entity)
	{
		projectDao.remove(entity, BTSCoreConstants.ADMIN);

	}

	@Override
	public BTSProject find(String key)
	{
		return projectDao.find(key, BTSCoreConstants.ADMIN);
	}

	@Override
	public List<BTSProject> list(String objectState)
	{
		return projectDao.list(BTSCoreConstants.ADMIN, objectState);
	}

	@Override
	public List<BTSProject> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSProject> objects = new Vector<BTSProject>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			objects.addAll(projectDao.query(query, BTSCoreConstants.ADMIN,
					BTSCoreConstants.ADMIN, objectState, registerQuery));
		}
		return filter(objects);
	}

	@Override
	public List<BTSProject> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSProject> listRemoteProjects()
	{
		return remoteprojectDao.list(BTSCoreConstants.ADMIN);
	}

	@Override
	public List<BTSProject> list(String dbPath, String queryId,
			String objectState)
	{
		return filter(projectDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public BTSProject findByProjectPrefix(String project) {
		if (main_project.equals(project))
		{
			return (BTSProject) context.get(BTSCoreConstants.MAIN_PROJECT);
		}
		List<BTSProject> projects = list(BTSConstants.OBJECT_STATE_ACTIVE);
		for (BTSProject pro : projects)
		{
			if (pro.getPrefix() != null && pro.getPrefix().equals(project))
			{
				return pro;
			}
		}
		return null;
	}

	@Override
	public BTSProjectDBCollection checkAndAddDBCollection(BTSProject project, String collName,
			boolean index, boolean synchronize) {
		BTSProjectDBCollection collection = null;
		for (BTSProjectDBCollection coll : project.getDbCollections())
		{
			if (project.getPrefix() != null)
			{
				if (collName.equals(coll.getCollectionName()))
				{
					collection = coll;
					break;
				}
			}
		}
		if (collection == null)
		{
			collection = BtsmodelFactory.eINSTANCE.createBTSProjectDBCollection();
			collection.setCollectionName(collName);
			project.getDbCollections().add(collection);
		}
		collection.setIndexed(index);
		collection.setSynchronized(synchronize);
		return collection;
	}

}
