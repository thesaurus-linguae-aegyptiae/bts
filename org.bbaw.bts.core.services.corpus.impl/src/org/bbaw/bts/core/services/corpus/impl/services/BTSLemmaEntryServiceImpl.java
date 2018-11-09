package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSLemmaEntryDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.dao.util.BTSQueryRequest.BTSQueryType;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
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

	@Inject
	private BTSAnnotationService annotationService;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_LEMMA_DEFAULT_REVIEWSTATE, nodePath = "org.bbaw.bts.ui.corpus")
	protected String lemmaReviewState;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_LEMMA_DEFAULT_VISIBILITY, nodePath = "org.bbaw.bts.ui.corpus")
	protected String lemmaVisibility;
	
	@Override
	public BTSLemmaEntry createNew()
	{
		if (main_lemmaList_key == null || "".equals(main_lemmaList_key))
		{
			main_lemmaList_key = main_project;
		}
		BTSLemmaEntry entry = BtsCorpusModelFactory.eINSTANCE.createBTSLemmaEntry();
		entry.setDBCollectionKey(main_lemmaList_key + BTSCorpusConstants.WLIST);
		entry.setCorpusPrefix(main_lemmaList_key + BTSCorpusConstants.WLIST);
		entry.setVisibility(lemmaVisibility);
		entry.setRevisionState(lemmaReviewState);
		entry.setProject(main_lemmaList_key);
		
		// FIXME transform import
		super.setId(entry, entry.getDBCollectionKey());
		super.addRevisionStatement(entry);

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
		for (String p : getActiveLemmaLists())
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
		for (String p : getActiveLemmaLists())
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
		String[] indexArray = buildIndexArray();

		try {
			objects.addAll(lemmaEntryDao.query(query,
					indexArray, indexArray,
					objectState, registerQuery));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filter(objects);
	}

	@Override
	public String[] buildIndexArray() {
		List<String> indexNames = new ArrayList<String>();
		for (String p : getActiveLemmaLists())
		{
			indexNames.add(p + BTSCorpusConstants.WLIST);
		}
		return indexNames.toArray(new String[indexNames.size()]);
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
	public List<BTSLemmaEntry> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSLemmaEntry> objects = new Vector<BTSLemmaEntry>();
		objects.addAll(lemmaEntryDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(objects);
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
		for (String p : getActiveLemmaLists()) {
			entries.addAll(lemmaEntryDao.list(p + BTSCorpusConstants.WLIST,
					DaoConstants.VIEW_LEMMA_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
		}
		return filter(entries);
//		return super.getOrphanEntries(map, btsFilters);
	}

	@Override
	public List<BTSLemmaEntry> findLemmaProposals(String prefix, IProgressMonitor monitor) {
		BTSQueryRequest query = createLemmaSearchQuery(prefix);
//		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		System.out.println(query.getQueryId());
		List<BTSLemmaEntry> children = query(query, BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		
		children = lemmaFilterReviewStateType(children);
		
		return filter(children);
	}
	
	@Override
	public BTSQueryRequest createLemmaSearchQuery(String chars) {
		BTSQueryRequest query = new BTSQueryRequest(chars);
		query.setType(BTSQueryType.LEMMA);
		query.setQueryBuilder(QueryBuilders.boolQuery()
					.should(QueryBuilders.matchQuery("name", chars))
					.should(QueryBuilders.termQuery("name",chars))
					);
		query.setAutocompletePrefix(chars);
		return query;
	}

	private List<BTSLemmaEntry> lemmaFilterReviewStateType(
			List<BTSLemmaEntry> children) {
		List<BTSLemmaEntry> filtered = new Vector<BTSLemmaEntry>(children.size());
		for (BTSCorpusObject entry : children)
			if (entry instanceof BTSLemmaEntry 
					&& (entry.getRevisionState() == null || !entry.getRevisionState().contains("obsolete"))
					&& (entry.getType() == null || !entry.getType().equals("root")))
				filtered.add((BTSLemmaEntry) entry);
		return filtered;
	}


	public String processWordCharForLemmatizing(String chars) {
		
		if (chars == null)
			return null;
		
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
		

		// XXX
		if (chars.length() > 3 && chars.startsWith("\"") && chars.endsWith("\""))
		{
			chars = chars.substring(1, chars.length() -1);
		}
		else if (chars.length() > 1 && chars.startsWith("*"))
		{
			chars = chars.substring(1, chars.length());
		}else if (chars.length() > 1 && chars.endsWith("*"))
		{
			chars = chars.substring(0, chars.length()-1);
		}
		System.out.println("search for lemma proposals for: "  + chars);
		return chars;
	}

	@Override
	public BTSAnnotation createNewAnnotationRelationPartOf(
			BTSCorpusObject annotatedObject) {
		BTSAnnotation anno = annotationService
				.createNewRelationPartOf(annotatedObject);
		if (main_lemmaList_key == null || "".equals(main_lemmaList_key))
		{
			main_lemmaList_key = main_project;
		}
		anno.setVisibility(lemmaVisibility);
		anno.setRevisionState(lemmaReviewState);
		anno.setDBCollectionKey(main_lemmaList_key + BTSCorpusConstants.WLIST);
		anno.setCorpusPrefix(main_lemmaList_key + BTSCorpusConstants.WLIST);
		anno.setProject(main_lemmaList_key);
		return anno;
	}
	
	@Override
	public boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts)
	{
		if (!(object instanceof BTSLemmaEntry)) return super.checkAndFullyLoad(object, checkForConflicts);
		if (object.eResource() == null || object.get_rev() == null)
		{
			lemmaEntryDao.loadFully((BTSLemmaEntry) object, checkForConflicts);
		}
		return false;
		
	}


	@Override
	public List<BTSLemmaEntry> filterLemmaProposals(
			List<BTSLemmaEntry> obs) {
		List<BTSLemmaEntry> filtered;
		filtered = lemmaFilterReviewStateType(obs);
		return filtered;

	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#findAsJsonString(java.io.Serializable, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		String entry = null;
		try {
			entry = lemmaEntryDao.findAsJsonString(key, main_project + BTSCorpusConstants.WLIST);
		} catch (Exception e1) {
		}
		if (entry != null)
		{
			return entry;
		}
		for (String p : getActiveLemmaLists())
		{
			try {
				entry = lemmaEntryDao.findAsJsonString(key, p + BTSCorpusConstants.WLIST);
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

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#queryAsJsonString(org.bbaw.bts.core.dao.util.BTSQueryRequest, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<String> queryAsJsonString(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		List<String> objects = new Vector<String>();
		String[] indexArray = buildIndexArray();

		try {
			objects.addAll(lemmaEntryDao.queryAsJsonString(query,
					indexArray, indexArray,
					objectState, false));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objects;
	}
}
