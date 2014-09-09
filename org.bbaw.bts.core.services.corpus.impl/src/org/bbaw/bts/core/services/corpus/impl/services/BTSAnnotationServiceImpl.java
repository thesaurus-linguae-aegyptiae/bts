package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSAnnotationDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class BTSAnnotationServiceImpl 
extends AbstractCorpusObjectServiceImpl<BTSAnnotation, String> 
implements BTSAnnotationService, BTSObjectSearchService
{
	@Inject
	BTSAnnotationDao annotationDao;

	@Override
	public BTSAnnotation createNew()
	{
		BTSAnnotation anno = BtsCorpusModelFactory.eINSTANCE.createBTSAnnotation();
		super.setId(anno);
		super.setRevision(anno);
		anno.setCorpusPrefix(main_corpus_key);
		return anno;
	}

	@Override
	public boolean save(BTSAnnotation entity)
	{
		super.addRevisionStatement(entity);
		annotationDao.add(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());
		return true;
	}

	@Override
	public void update(BTSAnnotation entity)
	{
		annotationDao.update(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public void remove(BTSAnnotation entity)
	{
		annotationDao.remove(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public BTSAnnotation find(String key)
	{
		BTSAnnotation anno = null;
		anno = annotationDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + main_corpus_key);
		if (anno != null)
		{
			return anno;
		}
		for (String c : getActive_corpora())
		{
			anno = annotationDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + c);
			if (anno != null)
			{
				return anno;
			}
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				anno = annotationDao.find(key, p + BTSCorpusConstants.CORPUS_INTERFIX + c);
				if (anno != null)
				{
					return anno;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSAnnotation> list(String objectState)
	{
		List<BTSAnnotation> annos = new Vector<BTSAnnotation>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				annos.addAll(annotationDao.list(p
						+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState));
			}
		}
		return filter(annos);
	}

	@Override
	public List<BTSAnnotation> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSAnnotation> objects = new Vector<BTSAnnotation>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(annotationDao.query(query, p + BTSCorpusConstants.CORPUS_INTERFIX + c, p
						+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState,
						registerQuery));
			}
		}
		return filter(objects);

	}

	@Override
	public List<BTSAnnotation> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);

	}
	@Override
	public List<BTSAnnotation> list(String dbPath, String queryId,
			String objectState)
	{
		return filter(annotationDao.findByQueryId(queryId, dbPath, objectState));
	}

	protected String[] getActive_corpora() {
		return active_corpora.split(BTSCoreConstants.SPLIT_PATTERN);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSAnnotation";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSAnnotation.class;
	}

	@Override
	public List<BTSAnnotation> listRootEntries() {
		List<BTSAnnotation> objects = new Vector<BTSAnnotation>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(annotationDao.list(p + BTSCorpusConstants.CORPUS_INTERFIX + c, 
						DaoConstants.VIEW_THS_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
			}
		}
		return filter(objects);
	}
}