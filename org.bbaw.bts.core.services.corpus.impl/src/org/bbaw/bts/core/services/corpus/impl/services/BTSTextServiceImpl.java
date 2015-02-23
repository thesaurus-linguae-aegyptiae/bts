package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSTextDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSTextService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSTextServiceImpl extends AbstractCorpusObjectServiceImpl<BTSText, String> implements BTSTextService, BTSObjectSearchService
{
	@Inject
	private BTSTextDao textDao;

	@Override
	public BTSText createNew()
	{
		BTSText entity = BtsCorpusModelFactory.eINSTANCE.createBTSText();
		entity.setDBCollectionKey(main_corpus_key);
		entity.setCorpusPrefix(main_corpus_key);
		super.setId(entity, entity.getDBCollectionKey());
		super.setRevision(entity);

		return entity;
	}

	@Override
	public boolean save(BTSText entity)
	{
		super.addRevisionStatement(entity);
		textDao.add(entity, entity.getDBCollectionKey());
		return true;
	}

	@Override
	public void update(BTSText entity)
	{
		textDao.update(entity, entity.getDBCollectionKey());

	}

	@Override
	public void remove(BTSText entity)
	{
		textDao.remove(entity, entity.getDBCollectionKey());

	}

	@Override
	public BTSText find(String key, IProgressMonitor monitor)
	{
		BTSText text = null;
		text = textDao.find(key, main_corpus_key);
		if (text != null)
		{
			return text;
		}
		for (String c : getActive_corpora(main_project))
		{
			text = textDao.find(key, c);
			if (text != null)
			{
				return text;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				text = textDao.find(key, c);
				if (text != null)
				{
					return text;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSText> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSText> texts = new Vector<BTSText>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				texts.addAll(textDao.list(c, objectState));
			}
		}
		return filter(texts);
	}

	
	@Override
	public List<BTSText> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor)
	{
		List<BTSText> objects = new Vector<BTSText>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				objects.addAll(textDao.query(query, c, c, objectState,
						registerQuery));
			}
		}
		return filter(objects);
	}

	@Override
	public List<BTSText> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return filter(query(query, objectState, true, monitor));
	}

	@Override
	public List<BTSText> list(String dbPath, String queryId, String objectState, IProgressMonitor monitor)
	{
		return filter(textDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public BTSSenctence createNewSentence()
	{
		return BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();
	}

	@Override
	public BTSWord createNewWord()
	{
		return BtsCorpusModelFactory.eINSTANCE.createBTSWord();
	}

	@Override
	public BTSGraphic createNewGraphic()
	{
		return BtsCorpusModelFactory.eINSTANCE.createBTSGraphic();
	}

	
	@Override
	public String getNameOfServedClass() {
		return "BTSText";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSText.class;
	}

	@Override
	public List<BTSText> listRootEntries(IProgressMonitor monitor) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<BTSText> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSText> objects = new Vector<BTSText>();
		objects.addAll(textDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(objects);
	}

	
	
	
}
