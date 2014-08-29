package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSImageDao;
import org.bbaw.bts.core.services.corpus.BTSImageService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSImage;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSImageServiceImpl extends GenericObjectServiceImpl<BTSImage, String> implements BTSImageService, BTSObjectSearchService
{

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_ACTIVE_CORPORA, nodePath = "org.bbaw.bts.app")
	private String active_corpora;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_MAIN_CORPUS_KEY, nodePath = "org.bbaw.bts.app")
	protected String main_corpus_key;
	@Inject
	BTSImageDao imageDao;

	@Override
	public BTSImage createNew()
	{
		BTSImage image = BtsCorpusModelFactory.eINSTANCE.createBTSImage();
		super.setId(image);
		super.setRevision(image);
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
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
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
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
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
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
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

	protected String[] getActive_corpora() {
		return active_corpora.split(BTSCoreConstants.SPLIT_PATTERN);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSImage";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSImage.class;
	}
}
