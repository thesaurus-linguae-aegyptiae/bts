package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSImageDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSImageService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSImage;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;

public class BTSImageServiceImpl extends AbstractCorpusObjectServiceImpl<BTSImage, String> implements BTSImageService, BTSObjectSearchService
{
	@Inject
	BTSImageDao imageDao;

	@Override
	public BTSImage createNew()
	{
		BTSImage image = BtsCorpusModelFactory.eINSTANCE.createBTSImage();
		super.setId(image);
		super.setRevision(image);
		if (isCurrentDBCollectionContextLemma())
		{
			image.setDBCollectionKey(main_project + BTSCorpusConstants.WLIST);
		}
		else if (isCurrentDBCollectionContextThs())
		{
			image.setDBCollectionKey(main_project + BTSCorpusConstants.THS);
		}
		else
		{
			image.setDBCollectionKey(main_project + BTSCorpusConstants.CORPUS_INTERFIX +main_corpus_key);
		}

		image.setCorpusPrefix(main_corpus_key);
		return image;
	}

	@Override
	public boolean save(BTSImage entity)
	{
		super.addRevisionStatement(entity);
		imageDao.add(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());
		return true;
	}

	@Override
	public void update(BTSImage entity)
	{
		imageDao.update(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public void remove(BTSImage entity)
	{
		imageDao.remove(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public BTSImage find(String key)
	{
		BTSImage image = null;
		image = imageDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + main_corpus_key);
		if (image != null)
		{
			return image;
		}
		for (String c : getActive_corpora())
		{
			image = imageDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + c);
			if (image != null)
			{
				return image;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora())
			{
				image = imageDao.find(key, p + BTSCorpusConstants.CORPUS_INTERFIX + c);
				if (image != null)
				{
					return image;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSImage> list(String objectState)
	{
		List<BTSImage> images = new Vector<BTSImage>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora())
			{
				images.addAll(imageDao.list(p
						+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState));
			}
		}
		return filter(images);
	}

	@Override
	public List<BTSImage> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSImage> objects = new Vector<BTSImage>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(imageDao.query(query, p + BTSCorpusConstants.CORPUS_INTERFIX + c, p
						+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState,
						registerQuery));
			}
		}
		return filter(objects);
	}
	@Override
	public List<BTSImage> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSImage> list(String dbPath, String queryId, String objectState)
	{
		return filter(imageDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public String getNameOfServedClass() {
		return "BTSImage";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSImage.class;
	}
	

	@Override
	public List<BTSImage> listRootEntries(IProgressMonitor monitor) {
		List<BTSImage> objects = new Vector<BTSImage>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(imageDao.list(p + BTSCorpusConstants.CORPUS_INTERFIX + c, 
						DaoConstants.VIEW_IMAGE_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
			}
		}
		return filter(objects);
	}
}
