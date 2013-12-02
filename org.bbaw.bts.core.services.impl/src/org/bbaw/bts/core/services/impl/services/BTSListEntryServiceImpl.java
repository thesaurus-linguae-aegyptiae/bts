package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSListEntry;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSListEntryDao;
import org.bbaw.bts.core.services.BTSListEntryService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class BTSListEntryServiceImpl extends GenericObjectServiceImpl<BTSListEntry, String> implements
		BTSListEntryService
{

	@Inject
	BTSListEntryDao listEntryDao;

	@Override
	public BTSListEntry createNew()
	{
		BTSListEntry entry = BtsmodelFactory.eINSTANCE.createBTSListEntry();
		super.setId(entry);
		super.setRevision(entry);
		return entry;
	}

	@Override
	public boolean save(BTSListEntry entity)
	{
		listEntryDao.add(entity, entity.getProject() + ServiceConstants.WLIST);
		return false;
	}

	@Override
	public void update(BTSListEntry entity)
	{
		listEntryDao.update(entity, entity.getProject() + ServiceConstants.WLIST);

	}

	@Override
	public void remove(BTSListEntry entity)
	{
		listEntryDao.remove(entity, entity.getProject() + ServiceConstants.WLIST);

	}

	@Override
	public BTSListEntry find(String key)
	{
		BTSListEntry entry = null;
		entry = listEntryDao.find(key, main_project + ServiceConstants.WLIST);
		if (entry != null)
		{
			return entry;
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			entry = listEntryDao.find(key, p + ServiceConstants.WLIST);
			if (entry != null)
			{
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSListEntry> list()
	{
		List<BTSListEntry> entries = new Vector<BTSListEntry>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			entries.addAll(listEntryDao.list(p + ServiceConstants.WLIST));
		}
		return filter(entries);
	}

	@Override
	public List<BTSListEntry> query(BTSQueryRequest query)
	{
		List<BTSListEntry> objects = new Vector<BTSListEntry>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{

			objects.addAll(listEntryDao.query(query, p + ServiceConstants.WLIST, p + ServiceConstants.WLIST));

		}
		return filter(objects);
	}

	@Override
	public List<BTSListEntry> list(String dbPath, String queryId)
	{
		return filter(listEntryDao.findByQueryId(queryId, dbPath));
	}
}
