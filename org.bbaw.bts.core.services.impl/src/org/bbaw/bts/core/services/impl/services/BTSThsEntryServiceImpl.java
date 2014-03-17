package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSThsEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.BTSThsEntryService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class BTSThsEntryServiceImpl extends
		GenericObjectServiceImpl<BTSThsEntry, String> implements
		BTSThsEntryService {

	@Inject
	private BTSThsEntryDao thsEntryDao;

	@Override
	public List<BTSThsEntry> list(String dbPath, String queryId,
			String objectState) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BTSThsEntry createNew() {
		BTSThsEntry entry = BtsmodelFactory.eINSTANCE.createBTSThsEntry();
		super.setId(entry);
		super.setRevision(entry);
		return entry;
	}

	@Override
	public boolean save(BTSThsEntry entity) {
		super.addRevisionStatement(entity);
		thsEntryDao.add(entity, entity.getProject() + ServiceConstants.THS);
		return true;
	}

	@Override
	public void update(BTSThsEntry entity) {
		thsEntryDao.update(entity, entity.getProject() + ServiceConstants.THS);

	}

	@Override
	public void remove(BTSThsEntry entity) {
		thsEntryDao.remove(entity, entity.getProject() + ServiceConstants.THS);

	}

	@Override
	public BTSThsEntry find(String key) {
		BTSThsEntry entry = null;
		entry = thsEntryDao.find(key, main_project + ServiceConstants.THS);
		if (entry != null) {
			return entry;
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN)) {
			entry = thsEntryDao.find(key, p + ServiceConstants.THS);
			if (entry != null) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSThsEntry> list(String objectState) {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN)) {
			entries.addAll(thsEntryDao.list(p + ServiceConstants.THS,
					objectState));
		}
		return filter(entries);
	}

	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState,
			boolean registerQuery) {
		List<BTSThsEntry> objects = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN)) {

			objects.addAll(thsEntryDao.query(query, p + ServiceConstants.THS, p
					+ ServiceConstants.THS, objectState, registerQuery));

		}
		return filter(objects);
	}
	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSThsEntry> listRootEntries() {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN)) {
			entries.addAll(thsEntryDao.list(p + ServiceConstants.THS,
					DaoConstants.VIEW_THS_ROOT_ENTRIES));
		}
		return filter(entries);
	}

}
