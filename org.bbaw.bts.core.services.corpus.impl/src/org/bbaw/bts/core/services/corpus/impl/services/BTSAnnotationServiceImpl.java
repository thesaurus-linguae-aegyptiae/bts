package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class BTSAnnotationServiceImpl 
extends AbstractCorpusObjectServiceImpl<BTSAnnotation, String> 
implements BTSAnnotationService, BTSObjectSearchService
{
	@Inject
	private BTSAnnotationDao annotationDao;
	
	

	@Override
	public BTSAnnotation createNew()
	{
		BTSAnnotation anno = BtsCorpusModelFactory.eINSTANCE.createBTSAnnotation();
		
		if (isCurrentDBCollectionContextLemma())
		{
			anno.setDBCollectionKey(main_project + BTSCorpusConstants.WLIST);
		}
		else if (isCurrentDBCollectionContextThs())
		{
			anno.setDBCollectionKey(main_project + BTSCorpusConstants.THS);
		}
		else
		{
			anno.setDBCollectionKey(main_corpus_key);
		}
		anno.setCorpusPrefix(main_corpus_key);
		super.setId(anno, anno.getDBCollectionKey());
		super.setRevision(anno);
		return anno;
	}

	@Override
	public boolean save(BTSAnnotation entity)
	{
		super.addRevisionStatement(entity);
		annotationDao.add(entity, entity.getDBCollectionKey());
		return true;
	}

	@Override
	public void update(BTSAnnotation entity)
	{
		annotationDao.update(entity, entity.getDBCollectionKey());

	}

	@Override
	public void remove(BTSAnnotation entity)
	{
		annotationDao.remove(entity, entity.getDBCollectionKey());

	}

	@Override
	public BTSAnnotation find(String key, IProgressMonitor monitor)
	{
		BTSAnnotation anno = null;
		anno = annotationDao.find(key, main_corpus_key);
		if (anno != null)
		{
			return anno;
		}
		for (String c : getActive_corpora(main_project))
		{
			try {
				anno = annotationDao.find(key, c);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (anno != null)
			{
				return anno;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				try {
					anno = annotationDao.find(key, c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (anno != null)
				{
					return anno;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSAnnotation> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSAnnotation> annos = new Vector<BTSAnnotation>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				try {
					annos.addAll(annotationDao.list(c, objectState));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return filter(annos);
	}

	@Override
	public List<BTSAnnotation> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor)
	{
		List<BTSAnnotation> objects = new Vector<BTSAnnotation>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				try {
					objects.addAll(annotationDao.query(query, c, c, objectState,
							registerQuery));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return filter(objects);

	}

	@Override
	public List<BTSAnnotation> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);

	}
	@Override
	public List<BTSAnnotation> list(String dbPath, String queryId,
			String objectState, IProgressMonitor monitor)
	{
		return filter(annotationDao.findByQueryId(queryId, dbPath, objectState));
	}
	@Override
	public List<BTSAnnotation> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSAnnotation> objects = new Vector<BTSAnnotation>();
		objects.addAll(annotationDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(objects);
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
	public List<BTSAnnotation> listRootEntries(IProgressMonitor monitor) {
		List<BTSAnnotation> objects = new Vector<BTSAnnotation>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				try {
					objects.addAll(annotationDao.list(c, 
							DaoConstants.VIEW_THS_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return filter(objects);
	}
}
