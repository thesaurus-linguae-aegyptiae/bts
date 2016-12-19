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
import org.bbaw.bts.core.dao.corpus.BTSThsEntryDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSThsEntryServiceImpl 
extends AbstractCorpusObjectServiceImpl<BTSThsEntry, String> 
implements BTSThsEntryService, BTSObjectSearchService {
	@Inject
	private BTSThsEntryDao thsEntryDao;

	@Inject
	private BTSAnnotationService annotationService;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_THS_DEFAULT_REVIEWSTATE, nodePath = "org.bbaw.bts.ui.corpus")
	protected String thsReviewState;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_THS_DEFAULT_VISIBILITY, nodePath = "org.bbaw.bts.ui.corpus")
	protected String thsVisibility;
	
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
		entry.setDBCollectionKey(getMainThsKey() +  BTSCorpusConstants.THS);
		entry.setVisibility(thsVisibility);
		entry.setRevisionState(thsReviewState);
		super.setId(entry, entry.getDBCollectionKey());
		super.setRevision(entry);
		entry.setCorpusPrefix(main_ths_key +  BTSCorpusConstants.THS);
		return entry;
	}

	private String getMainThsKey() {
		if (main_ths_key == null || "".equals(main_ths_key))
		{
			main_ths_key = main_project;
		}
		return main_ths_key;
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
		for (String p : getActiveThss()) {
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
		for (String p : getActiveThss()) {
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
		String[] indexArray = buildIndexArray();

		try {
			objects.addAll(thsEntryDao.query(query, indexArray, indexArray, objectState, registerQuery));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filter(objects);
	}
	
	@Override
	public String[] buildIndexArray() {
		List<String> indexNames = new ArrayList<String>();
		for (String p : getActiveThss())
		{
			indexNames.add(p + BTSCorpusConstants.THS);
		}
		return indexNames.toArray(new String[indexNames.size()]);
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
	@Override
	public BTSAnnotation createNewAnnotationRelationPartOf(
			BTSThsEntry annotatedObject) {
		BTSAnnotation anno = annotationService
				.createNewRelationPartOf(annotatedObject);
		if (main_ths_key == null || "".equals(main_ths_key))
		{
			main_ths_key = main_project;
		}
		anno.setVisibility(thsVisibility);
		anno.setRevisionState(thsReviewState);
		anno.setDBCollectionKey(main_ths_key + BTSCorpusConstants.THS);
		anno.setCorpusPrefix(main_ths_key + BTSCorpusConstants.THS);
		anno.setProject(main_ths_key);
		return anno;
	}
	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#findAsJsonString(java.io.Serializable, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		String entry = null;
		try {
			entry = thsEntryDao.findAsJsonString(key, main_project + BTSCorpusConstants.THS);
		} catch (Exception e) {
		}
		if (entry != null) {
			return entry;
		}
		for (String p : getActiveThss()) {
			try {
				entry = thsEntryDao.findAsJsonString(key, p + BTSCorpusConstants.THS);
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
			objects.addAll(thsEntryDao.queryAsJsonString(query, indexArray, indexArray, objectState, false));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objects;
	}
	
}
