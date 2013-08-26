package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSListEntry;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSListEntryDao;
import org.bbaw.bts.core.services.BTSListEntryService;

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
		listEntryDao.add(entity);
		return false;
	}

	@Override
	public void update(BTSListEntry entity)
	{
		listEntryDao.update(entity);

	}

	@Override
	public void remove(BTSListEntry entity)
	{
		listEntryDao.remove(entity);

	}

	@Override
	public BTSListEntry find(String key)
	{
		return listEntryDao.find(key);
	}

	@Override
	public List<BTSListEntry> list()
	{
		return listEntryDao.list();
	}

}
