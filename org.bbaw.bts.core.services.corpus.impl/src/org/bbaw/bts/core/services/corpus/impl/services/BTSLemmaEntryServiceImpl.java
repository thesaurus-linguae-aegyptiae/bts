package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSLemmaEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.core.runtime.IProgressMonitor;
import org.elasticsearch.index.query.QueryBuilders;

public class BTSLemmaEntryServiceImpl 
extends AbstractCorpusObjectServiceImpl<BTSLemmaEntry, String> 
implements BTSLemmaEntryService, BTSObjectSearchService
{

	private final static Pattern doublePointPattern = Pattern.compile(BTSCorpusConstants.LEMMATIZER_DOUBLE_POINT_PATTERN);
	
	private final static Pattern pointPattern = Pattern.compile(BTSCorpusConstants.LEMMATIZER_POINT_PATTERN);
	
	private final static Pattern deletionPattern = Pattern.compile(BTSCorpusConstants.LEMMATIZER_DELETION_PATTERN);
	
	@Inject
	private BTSLemmaEntryDao lemmaEntryDao;

	@Override
	public BTSLemmaEntry createNew()
	{
		BTSLemmaEntry entry = BtsCorpusModelFactory.eINSTANCE.createBTSLemmaEntry();
		super.setId(entry);
		super.setRevision(entry);
		entry.setDBCollectionKey(main_project + BTSCorpusConstants.WLIST);

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
	public BTSLemmaEntry find(String key, IProgressMonitor monitor)
	{
		BTSLemmaEntry entry = null;
		try {
			entry = lemmaEntryDao.find(key, main_project + BTSCorpusConstants.WLIST);
		} catch (Exception e1) {
		}
		if (entry != null)
		{
			return entry;
		}
		for (String p : getActiveProjects())
		{
			try {
				entry = lemmaEntryDao.find(key, p + BTSCorpusConstants.WLIST);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (entry != null)
			{
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSLemmaEntry> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSLemmaEntry> entries = new Vector<BTSLemmaEntry>();
		for (String p : getActiveProjects())
		{
			try {
				entries.addAll(lemmaEntryDao.list(p + BTSCorpusConstants.WLIST,
						objectState));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return filter(entries);
	}
	@Override
	public List<BTSLemmaEntry> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor)
	{
		List<BTSLemmaEntry> objects = new Vector<BTSLemmaEntry>();
		for (String p : getActiveProjects())
		{

			try {
				objects.addAll(lemmaEntryDao.query(query,
						p + BTSCorpusConstants.WLIST, p + BTSCorpusConstants.WLIST,
						objectState, registerQuery));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return filter(objects);
	}

	@Override
	public List<BTSLemmaEntry> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);
	}

	@Override
	public List<BTSLemmaEntry> list(String dbPath, String queryId,
			String objectState, IProgressMonitor monitor)
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

	@Override
	public List<BTSLemmaEntry> listRootEntries(IProgressMonitor monitor) {
		List<BTSLemmaEntry> entries = new Vector<BTSLemmaEntry>();
		for (String p : getActiveProjects()) {
			entries.addAll(lemmaEntryDao.list(p + BTSCorpusConstants.WLIST,
					DaoConstants.VIEW_LEMMA_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
		}
		return filter(entries);
//		return super.getOrphanEntries(map, btsFilters);
	}

	@Override
	public List<BTSLemmaEntry> findLemmaProposals(BTSWord word, IProgressMonitor monitor) {
		String chars = processWordChars(word);
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.matchQuery("name",
				chars));
//		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		System.out.println(query.getQueryId());
		List<BTSLemmaEntry> children = query(query, BTSConstants.OBJECT_STATE_ACTIVE, monitor); //thsService.query(query,BTSConstants.OBJECT_STATE_ACTIVE);
		children = lemmaFilterReviewState(children);
		return filter(children);
	}

	private List<BTSLemmaEntry> lemmaFilterReviewState(
			List<BTSLemmaEntry> children) {
		List<BTSLemmaEntry> filtered = new Vector<BTSLemmaEntry>(children.size());
		for (BTSLemmaEntry entry : children)
		{
			if (entry.getRevisionState() != null && !entry.getRevisionState().contains("obsolete"))
			{
				filtered.add(entry);
			}
		}
		return filtered;
	}

	private String processWordChars(BTSWord word) {
		String chars = word.getWChar();
		
		// cut left side
		Matcher m = doublePointPattern.matcher(chars);
		if (m.find())
		{
			chars = m.group(2); 
		}
		
		// cut right side
		if (chars.contains("."))
		{
			m = pointPattern.matcher(chars);
			if (m.find())
			{
				chars = m.group(1); 
			}
		}
		
		// cut right side
				if (chars.contains("{"))
				{
					m = deletionPattern.matcher(chars);
					if (m.find())
					{
						chars = m.replaceAll(""); 
					}
				}
		
		// replace
		chars = chars.replaceAll(BTSCorpusConstants.LEMMATIZER_TRIPLE_POINT, ":");
		
		chars = chars.replaceAll(",", ".");
		
		chars = chars.replaceAll(BTSCorpusConstants.LEMMATIZER_TRIPLE_EQUALS, "=");
		
		// remove brackets
		for (String b : BTSCorpusConstants.LEMMATIZER_ESCAPED_BRACKETS_ARRAY)
		{
			chars = chars.replaceAll(b, "");
		}
		return chars;
	}
}
