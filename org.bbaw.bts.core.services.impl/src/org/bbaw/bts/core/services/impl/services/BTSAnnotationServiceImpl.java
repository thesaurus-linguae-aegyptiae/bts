package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSAnnotationDao;
import org.bbaw.bts.core.services.BTSAnnotationService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class BTSAnnotationServiceImpl extends GenericObjectServiceImpl<BTSAnnotation, String> implements
		BTSAnnotationService
{

	@Inject
	BTSAnnotationDao annotationDao;

	@Override
	public BTSAnnotation createNew()
	{
		BTSAnnotation anno = BtsmodelFactory.eINSTANCE.createBTSAnnotation();
		super.setId(anno);
		super.setRevision(anno);
		return anno;
	}

	@Override
	public boolean save(BTSAnnotation entity)
	{
		annotationDao.add(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());
		return true;
	}

	@Override
	public void update(BTSAnnotation entity)
	{
		annotationDao.update(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public void remove(BTSAnnotation entity)
	{
		annotationDao.remove(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public BTSAnnotation find(String key)
	{
		BTSAnnotation anno = null;
		anno = annotationDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + main_corpus);
		if (anno != null)
		{
			return anno;
		}
		for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
		{
			anno = annotationDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + c);
			if (anno != null)
			{
				return anno;
			}
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				anno = annotationDao.find(key, p + ServiceConstants.CORPUS_INTERFIX + c);
				if (anno != null)
				{
					return anno;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSAnnotation> list()
	{
		List<BTSAnnotation> annos = new Vector<BTSAnnotation>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				annos.addAll(annotationDao.list(p + ServiceConstants.CORPUS_INTERFIX + c));
			}
		}
		return filter(annos);
	}

	@Override
	public List<BTSAnnotation> query(BTSQueryRequest query)
	{
		List<BTSAnnotation> objects = new Vector<BTSAnnotation>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				objects.addAll(annotationDao.query(query, p + ServiceConstants.CORPUS_INTERFIX + c, p
						+ ServiceConstants.CORPUS_INTERFIX + c));
			}
		}
		return filter(objects);

	}

}
