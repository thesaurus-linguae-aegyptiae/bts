package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.dao.corpus.BTSThsEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;

public class BTSThsEntryServiceImpl 
extends AbstractCorpusObjectServiceImpl<BTSThsEntry, String> 
implements BTSThsEntryService, BTSObjectSearchService {
	@Inject
	private BTSThsEntryDao thsEntryDao;

	@Override
	public List<BTSThsEntry> list(String dbPath, String queryId,
			String objectState) {
		return thsEntryDao.list(dbPath, queryId,
				objectState);
	}
	@Override
	public BTSThsEntry createNew() {
		BTSThsEntry entry = BtsCorpusModelFactory.eINSTANCE.createBTSThsEntry();
		super.setId(entry);
		super.setRevision(entry);
		entry.setDBCollectionKey(main_project + BTSCorpusConstants.THS);
		entry.setCorpusPrefix(main_corpus_key);
		return entry;
	}

	@Override
	public boolean save(BTSThsEntry entity) {
		super.addRevisionStatement(entity);
		thsEntryDao.add(entity, entity.getProject() + BTSCorpusConstants.THS);
		return true;
	}

	@Override
	public void update(BTSThsEntry entity) {
		thsEntryDao.update(entity, entity.getProject() + BTSCorpusConstants.THS);

	}

	@Override
	public void remove(BTSThsEntry entity) {
		thsEntryDao.remove(entity, entity.getProject() + BTSCorpusConstants.THS);

	}

	@Override
	public BTSThsEntry find(String key) {
		BTSThsEntry entry = null;
		entry = thsEntryDao.find(key, main_project + BTSCorpusConstants.THS);
		if (entry != null) {
			return entry;
		}
		for (String p : getActiveProjects()) {
			entry = thsEntryDao.find(key, p + BTSCorpusConstants.THS);
			if (entry != null) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSThsEntry> list(String objectState) {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : getActiveProjects()) {
			try {
				entries.addAll(thsEntryDao.list(p + BTSCorpusConstants.THS,
						objectState));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return filter(entries);
	}

	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState,
			boolean registerQuery) {
		List<BTSThsEntry> objects = new Vector<BTSThsEntry>();
		for (String p : getActiveProjects()) {

			try {
				objects.addAll(thsEntryDao.query(query, p + BTSCorpusConstants.THS, p
						+ BTSCorpusConstants.THS, objectState, registerQuery));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return filter(objects);
	}
	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSThsEntry> listRootEntries(IProgressMonitor monitor) {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : getActiveProjects()) {
			entries.addAll(thsEntryDao.list(p + BTSCorpusConstants.THS,
					DaoConstants.VIEW_THS_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
		}
		return filter(entries);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSThsEntry";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSThsEntry.class;
	}
	@Override
	public List<BTSThsEntry> getOrphanEntries(Map map,
			List<BTSFilter> btsFilters, IProgressMonitor monitor) {
		return super.getOrphanEntries(map, btsFilters, monitor);
	}
	
}
