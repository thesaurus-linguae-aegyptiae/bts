package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.dao.corpus.BTSAbstractTextDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSAbstractTextService;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSAbstractTextServiceImpl 
extends AbstractCorpusObjectServiceImpl<BTSAbstractText, String> 
implements BTSAbstractTextService, BTSObjectSearchService {
	@Inject
	private BTSAbstractTextDao atextDao;

	@Inject
	private BTSAnnotationService annotationService;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_ATEXT_DEFAULT_REVIEWSTATE, nodePath = "org.bbaw.bts.ui.corpus")
	protected String atextReviewState;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_ATEXT_DEFAULT_VISIBILITY, nodePath = "org.bbaw.bts.ui.corpus")
	protected String atextVisibility;
	
	@Override
	public List<BTSAbstractText> list(String dbPath, String queryId,
			String objectState, IProgressMonitor monitor) {
		return atextDao.list(dbPath, queryId,
				objectState);
	}
	@Override
	public List<BTSAbstractText> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSAbstractText> objects = new Vector<BTSAbstractText>();
		objects.addAll(atextDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(objects);
	}
	@Override
	public BTSAbstractText createNew() {
		BTSAbstractText entry = BtsCorpusModelFactory.eINSTANCE.createBTSAbstractText();
		entry.setDBCollectionKey(getMainATextKey() + BTSCorpusConstants.ATEXT);
		entry.setVisibility(atextVisibility);
		entry.setRevisionState(atextReviewState);
		super.setId(entry, entry.getDBCollectionKey());
		super.setRevision(entry);
		entry.setCorpusPrefix(getMainATextKey() + BTSCorpusConstants.ATEXT);
		return entry;
	}

	private String getMainATextKey() {
		if (main_atext_key == null || "".equals(main_atext_key))
		{
			main_atext_key = main_project;
		}
		return main_atext_key;
	}
	@Override
	public boolean save(BTSAbstractText entity) {
		super.addRevisionStatement(entity);
		atextDao.add(entity, entity.getProject() + BTSCorpusConstants.ATEXT);
		return true;
	}

	@Override
	public void update(BTSAbstractText entity) {
		atextDao.update(entity, entity.getProject() + BTSCorpusConstants.ATEXT);

	}

	@Override
	public void remove(BTSAbstractText entity) {
		atextDao.remove(entity, entity.getProject() + BTSCorpusConstants.ATEXT);

	}

	@Override
	public BTSAbstractText find(String key, IProgressMonitor monitor) {
		BTSAbstractText entry = null;
		try {
			entry = atextDao.find(key, main_project + BTSCorpusConstants.ATEXT);
		} catch (Exception e) {
		}
		if (entry != null) {
			return entry;
		}
		for (String p : getActiveProjects()) {
			try {
				entry = atextDao.find(key, p + BTSCorpusConstants.ATEXT);
			} catch (Exception e) {
			}
			if (entry != null) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSAbstractText> list(String objectState, IProgressMonitor monitor) {
		List<BTSAbstractText> entries = new Vector<BTSAbstractText>();
		for (String p : getActiveProjects()) {
			try {
				entries.addAll(atextDao.list(p + BTSCorpusConstants.ATEXT,
						objectState));
			} catch (Exception e) {
			}
		}
		return filter(entries);
	}

	@Override
	public List<BTSAbstractText> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor) {
		List<BTSAbstractText> objects = new Vector<BTSAbstractText>();
		String[] indexArray = buildIndexArray();

		try {
			objects.addAll(atextDao.query(query, indexArray, indexArray, objectState, registerQuery));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filter(objects);
	}
	
	@Override
	public String[] buildIndexArray() {
		List<String> indexNames = new ArrayList<String>();
		for (String p : getActiveProjects())
		{
			indexNames.add(p + BTSCorpusConstants.ATEXT);
		}
		return indexNames.toArray(new String[indexNames.size()]);
	}
	
	@Override
	public List<BTSAbstractText> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);
	}

	@Override
	public List<BTSAbstractText> listRootEntries(IProgressMonitor monitor) {
		List<BTSAbstractText> entries = new Vector<BTSAbstractText>();
		for (String p : getActiveProjects()) {
			entries.addAll(atextDao.list(p + BTSCorpusConstants.ATEXT,
					DaoConstants.VIEW_ATEXT_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
		}
		return filter(entries);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSAbstractText";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSAbstractText.class;
	}
	@Override
	public List<BTSAbstractText> getOrphanEntries(Map map,
			List<BTSFilter> btsFilters, IProgressMonitor monitor) {
		return super.getOrphanEntries(map, btsFilters, monitor);
	}
	@Override
	public BTSAnnotation createNewAnnotationRelationPartOf(
			BTSAbstractText annotatedObject) {
		BTSAnnotation anno = annotationService
				.createNewRelationPartOf(annotatedObject);
		if (main_atext_key == null || "".equals(main_atext_key))
		{
			main_atext_key = main_project;
		}
		anno.setVisibility(atextVisibility);
		anno.setRevisionState(atextReviewState);
		anno.setDBCollectionKey(main_atext_key + BTSCorpusConstants.ATEXT);
		anno.setCorpusPrefix(main_atext_key + BTSCorpusConstants.ATEXT);
		anno.setProject(main_atext_key);
		return anno;
	}
	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#findAsJsonString(java.io.Serializable, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		String entry = null;
		try {
			entry = atextDao.findAsJsonString(key, main_project + BTSCorpusConstants.ATEXT);
		} catch (Exception e) {
		}
		if (entry != null) {
			return entry;
		}
		for (String p : getActiveProjects()) {
			try {
				entry = atextDao.findAsJsonString(key, p + BTSCorpusConstants.ATEXT);
			} catch (Exception e) {
			}
			if (entry != null) {
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
			objects.addAll(atextDao.queryAsJsonString(query, indexArray, indexArray, objectState, false));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objects;
	}
	
}
