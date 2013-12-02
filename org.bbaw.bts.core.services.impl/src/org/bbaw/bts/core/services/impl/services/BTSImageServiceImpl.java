package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSImage;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSImageDao;
import org.bbaw.bts.core.services.BTSImageService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class BTSImageServiceImpl extends GenericObjectServiceImpl<BTSImage, String> implements BTSImageService
{

	@Inject
	BTSImageDao imageDao;

	@Override
	public BTSImage createNew()
	{
		BTSImage image = BtsmodelFactory.eINSTANCE.createBTSImage();
		super.setId(image);
		super.setRevision(image);
		return image;
	}

	@Override
	public boolean save(BTSImage entity)
	{
		imageDao.add(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());
		return false;
	}

	@Override
	public void update(BTSImage entity)
	{
		imageDao.update(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public void remove(BTSImage entity)
	{
		imageDao.remove(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public BTSImage find(String key)
	{
		BTSImage image = null;
		image = imageDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + main_corpus);
		if (image != null)
		{
			return image;
		}
		for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
		{
			image = imageDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + c);
			if (image != null)
			{
				return image;
			}
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				image = imageDao.find(key, p + ServiceConstants.CORPUS_INTERFIX + c);
				if (image != null)
				{
					return image;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSImage> list()
	{
		List<BTSImage> images = new Vector<BTSImage>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				images.addAll(imageDao.list(p + ServiceConstants.CORPUS_INTERFIX + c));
			}
		}
		return filter(images);
	}

	@Override
	public List<BTSImage> query(BTSQueryRequest query)
	{
		List<BTSImage> objects = new Vector<BTSImage>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				objects.addAll(imageDao.query(query, p + ServiceConstants.CORPUS_INTERFIX + c, p
						+ ServiceConstants.CORPUS_INTERFIX + c));
			}
		}
		return filter(objects);
	}

	@Override
	public List<BTSImage> list(String dbPath, String queryId)
	{
		return filter(imageDao.findByQueryId(queryId, dbPath));
	}
}
