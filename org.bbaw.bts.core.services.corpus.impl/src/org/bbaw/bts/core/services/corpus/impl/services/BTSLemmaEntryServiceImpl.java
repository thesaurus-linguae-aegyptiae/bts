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
import org.elasticsearch.common.lang3.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
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
		BTSQueryRequest query = createLemmaSearchQuery(prefix, true);
//		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		System.out.println(query.getQueryId());
		List<BTSLemmaEntry> children = query(query, BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		
		children = lemmaFilterReviewStateType(children);
		
		return filter(children);
	}

	@Override
	public BTSQueryRequest createLemmaSearchQuery(String term) {
		return createLemmaSearchQuery(term, true);
	}

	@Override
	public BTSQueryRequest createLemmaSearchQuery(String term, boolean includePersonNames) {
		BTSQueryRequest query = new BTSQueryRequest(term);
		query.setType(BTSQueryType.LEMMA);
		BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
		queryBuilder.mustNot(
				QueryBuilders.termQuery("type", "root")
			);
		if (!includePersonNames) {
			queryBuilder.mustNot(
					QueryBuilders.termQuery("subtype", "person_name")
				);
		}
		queryBuilder.must(
				QueryBuilders.boolQuery()
				.should(
						QueryBuilders.termQuery("revisionState", "published-awaiting-review")
				)
				.should(
						QueryBuilders.termQuery("revisionState", "published")
				)
			);
		BoolQueryBuilder shouldClause = QueryBuilders.boolQuery()
				.should(
						QueryBuilders.matchQuery("passport.children.children.children.value", term)
				)
				.should(
						QueryBuilders.matchQuery("translations.translations.value", term)
				)
				.should(
						QueryBuilders.matchQuery("words.wChar", term)
				);
		if (term.trim().length() < 2) {
			shouldClause.should(
					QueryBuilders.termQuery("name", term).boost(2)
				);
		} else {
			shouldClause.should(
					QueryBuilders.matchPhrasePrefixQuery("name", term).boost(2)
				);
		}
		queryBuilder.must(shouldClause);
		query.setQueryBuilder(queryBuilder);
		query.setAutocompletePrefix(term);
		return query;
	}


	private List<BTSLemmaEntry> lemmaFilterReviewStateType(
			List<BTSLemmaEntry> children) {
		List<BTSLemmaEntry> filtered = new Vector<BTSLemmaEntry>(children.size());
		for (BTSCorpusObject entry : children) {
			if (entry instanceof BTSLemmaEntry 
					&& (entry.getRevisionState() == null || !entry.getRevisionState().contains("obsolete"))
					&& (entry.getType() == null || !entry.getType().equals("root")))
				filtered.add((BTSLemmaEntry) entry);
		}
		return filtered;
	}


	/**
	* Der Suchterm unterliegt bestimmten Transformationsregeln:
	* <ul>
	* <li>Geschweifte Klammern werden mitsamt ihrem Inhalt unberücksichtigt gelassen.</li>
	* <li>Andere Klammern werden als nicht vorhanden angesehen.</li>
	* <li>Wandle für die Suche ein ,t,pl in ein ,wt um.</li>
	* <li>Wandle für die Suche ein ,tpl in ein ,wt um.</li>
	* <li>Wandle für die Suche ein ,t,du in ein ,tj um.</li>
	* <li>Wandle für die Suche ein ,tdu in ein ,tj um.</li>
	* <li>Wandle für die Suche ein pl in ein w um</li>
	* <li>Wandle für die Suche ein du in ein wj um.</li>
	* <li>Wandle für die Suche ein , in ein . um.</li>
	* <li>Wandle für die Suche ein ≡ in ein = um.</li>
	* <li>Wandle für die Suche ein ⁝ in ein : um.</li>
	* <li>Wandle das Zeichen vor einem ! in ein i̯ um und verwirf alles ab dem ! einschließlich.</li>
	* <li>Verwirf alles ab dem . einschließlich.</li>
	* </ul>
	* Die Transformationsregeln gelten pro Token, d.h. ein ḥm.w-nṯr wird in die Token ḥm und nṯr transformiert.
	 * 
	 */
	public String processWordCharForLemmatizing(String chars) {
		if (chars == null)
			return null;

		String searchString = chars
			.replaceAll("\\{[^\\{]*\\}", "")
			.replaceAll("[\\(\\[\\)\\]]", "")
			.replaceAll(
					"["
					+ StringUtils.join(BTSCorpusConstants.LEMMATIZER_ESCAPED_BRACKETS_ARRAY, "")
					+ "]",
					"")
			.replaceAll(",t,?pl", ",wt")
			.replaceAll(",t,?du", ",tj")
			.replaceAll("pl", "w")
			.replaceAll("du", "wj")
			.replaceAll("(.*)\\.[^- ]*", "$1")
			.replaceAll(",", ".")
			.replaceAll("≡", "=")
			.replaceAll("\u205D", ":")
			.replaceAll("(.*).!.*", "$1i̯");

		// TODO: alles rechts von doppelpunkt weg? (siehe doublePointPattern)

		System.out.println("search for lemma proposals for: "  + searchString);
		return searchString;
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
