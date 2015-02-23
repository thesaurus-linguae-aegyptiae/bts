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
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
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
			String objectState, IProgressMonitor monitor) {
		return thsEntryDao.list(dbPath, queryId,
				objectState);
	}
	@Override
	public List<BTSThsEntry> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSThsEntry> objects = new Vector<BTSThsEntry>();
		objects.addAll(thsEntryDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(objects);
	}
	@Override
	public BTSThsEntry createNew() {
		BTSThsEntry entry = BtsCorpusModelFactory.eINSTANCE.createBTSThsEntry();
		entry.setDBCollectionKey(main_project + BTSCorpusConstants.THS);

		super.setId(entry, entry.getDBCollectionKey());
		super.setRevision(entry);
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
	public BTSThsEntry find(String key, IProgressMonitor monitor) {
		BTSThsEntry entry = null;
		try {
			entry = thsEntryDao.find(key, main_project + BTSCorpusConstants.THS);
		} catch (Exception e) {
		}
		if (entry != null) {
			return entry;
		}
		for (String p : getActiveProjects()) {
			try {
				entry = thsEntryDao.find(key, p + BTSCorpusConstants.THS);
			} catch (Exception e) {
			}
			if (entry != null) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSThsEntry> list(String objectState, IProgressMonitor monitor) {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : getActiveProjects()) {
			try {
				entries.addAll(thsEntryDao.list(p + BTSCorpusConstants.THS,
						objectState));
			} catch (Exception e) {
			}
		}
		return filter(entries);
	}

	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor) {
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
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);
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
