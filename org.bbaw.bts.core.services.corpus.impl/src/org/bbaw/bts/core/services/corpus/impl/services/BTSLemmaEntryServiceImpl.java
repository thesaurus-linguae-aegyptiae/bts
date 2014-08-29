package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSLemmaEntryDao;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSLemmaEntryServiceImpl extends GenericObjectServiceImpl<BTSLemmaEntry, String> implements
BTSLemmaEntryService, BTSObjectSearchService
{

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_ACTIVE_CORPORA, nodePath = "org.bbaw.bts.app")
	private String active_corpora;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_MAIN_CORPUS_KEY, nodePath = "org.bbaw.bts.app")
	protected String main_corpus_key;
	@Inject
	BTSLemmaEntryDao lemmaEntryDao;

	@Override
	public BTSLemmaEntry createNew()
	{
		BTSLemmaEntry entry = BtsCorpusModelFactory.eINSTANCE.createBTSLemmaEntry();
		super.setId(entry);
		super.setRevision(entry);
		entry.setCorpusPrefix(main_corpus_key);
		return entry;
	}

	@Override
	public boolean save(BTSLemmaEntry entity)
	{
		super.addRevisionStatement(entity);
		lemmaEntryDao.add(entity, entity.getProject() + BTSCorpusConstants.WLIST);
		return true;
	}

	@Override
	public void update(BTSLemmaEntry entity)
	{
		lemmaEntryDao.update(entity, entity.getProject() + BTSCorpusConstants.WLIST);

	}

	@Override
	public void remove(BTSLemmaEntry entity)
	{
		lemmaEntryDao.remove(entity, entity.getProject() + BTSCorpusConstants.WLIST);

	}

	@Override
	public BTSLemmaEntry find(String key)
	{
		BTSLemmaEntry entry = null;
		entry = lemmaEntryDao.find(key, main_project + BTSCorpusConstants.WLIST);
		if (entry != null)
		{
			return entry;
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			entry = lemmaEntryDao.find(key, p + BTSCorpusConstants.WLIST);
			if (entry != null)
			{
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSLemmaEntry> list(String objectState)
	{
		List<BTSLemmaEntry> entries = new Vector<BTSLemmaEntry>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			entries.addAll(lemmaEntryDao.list(p + BTSCorpusConstants.WLIST,
					objectState));
		}
		return filter(entries);
	}
	@Override
	public List<BTSLemmaEntry> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSLemmaEntry> objects = new Vector<BTSLemmaEntry>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{

			objects.addAll(lemmaEntryDao.query(query,
					p + BTSCorpusConstants.WLIST, p + BTSCorpusConstants.WLIST,
					objectState, registerQuery));

		}
		return filter(objects);
	}

	@Override
	public List<BTSLemmaEntry> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSLemmaEntry> list(String dbPath, String queryId,
			String objectState)
	{
		return filter(lemmaEntryDao.findByQueryId(queryId, dbPath, objectState));
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSLemmaEntry";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSLemmaEntry.class;
	}
}
