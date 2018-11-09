package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSImageDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSImageService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSImage;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSImageServiceImpl extends AbstractCorpusObjectServiceImpl<BTSImage, String> implements BTSImageService, BTSObjectSearchService
{
	@Inject
	BTSImageDao imageDao;

	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_CORPUS_DEFAULT_REVIEWSTATE, nodePath = "org.bbaw.bts.ui.corpus")
	protected String corpusReviewState;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_CORPUS_DEFAULT_VISIBILITY, nodePath = "org.bbaw.bts.ui.corpus")
	protected String corpusVisibility;
	
	@Override
	public BTSImage createNew()
	{
		BTSImage image = BtsCorpusModelFactory.eINSTANCE.createBTSImage();

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
			image.setDBCollectionKey(main_corpus_key);
		}

		image.setCorpusPrefix(main_corpus_key);
		super.setId(image, image.getDBCollectionKey());
		super.setRevision(image);
		return image;
	}

	@Override
	public boolean save(BTSImage entity)
	{
		super.addRevisionStatement(entity);
		imageDao.add(entity, entity.getDBCollectionKey());
		return true;
	}

	@Override
	public void update(BTSImage entity)
	{
		imageDao.update(entity, entity.getDBCollectionKey());

	}

	@Override
	public void remove(BTSImage entity)
	{
		imageDao.remove(entity, entity.getDBCollectionKey());

	}

	@Override
	public BTSImage find(String key, IProgressMonitor monitor)
	{
		BTSImage image = null;
		image = imageDao.find(key, main_corpus_key);
		if (image != null)
		{
			return image;
		}
		for (String c : getActive_corpora(main_project))
		{
			image = imageDao.find(key, c);
			if (image != null)
			{
				return image;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				image = imageDao.find(key, c);
				if (image != null)
				{
					return image;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSImage> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSImage> images = new Vector<BTSImage>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				images.addAll(imageDao.list(c, objectState));
			}
		}
		return filter(images);
	}

	@Override
	public List<BTSImage> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor)
	{
		List<BTSImage> objects = new Vector<BTSImage>();
		String[] indexArray = buildIndexArray();

		objects.addAll(imageDao.query(query, indexArray, indexArray, objectState,
				registerQuery));
		return filter(objects);
	}
	@Override
	public List<BTSImage> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);
	}

	@Override
	public List<BTSImage> list(String dbPath, String queryId, String objectState, IProgressMonitor monitor)
	{
		return filter(imageDao.findByQueryId(queryId, dbPath, objectState));
	}
	@Override
	public List<BTSImage> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSImage> objects = new Vector<BTSImage>();
		objects.addAll(imageDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(objects);
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
			for (String c : getActive_corpora(p))
			{
				objects.addAll(imageDao.list(c, 
						DaoConstants.VIEW_IMAGE_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
			}
		}
		return filter(objects);
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#findAsJsonString(java.io.Serializable, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		String image = null;
		image = imageDao.findAsJsonString(key, main_corpus_key);
		if (image != null)
		{
			return image;
		}
		for (String c : getActive_corpora(main_project))
		{
			image = imageDao.findAsJsonString(key, c);
			if (image != null)
			{
				return image;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				image = imageDao.findAsJsonString(key, c);
				if (image != null)
				{
					return image;
				}
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
		objects.addAll(imageDao.queryAsJsonString(query, indexArray, indexArray, objectState,
				false));
		return objects;
	}
}
