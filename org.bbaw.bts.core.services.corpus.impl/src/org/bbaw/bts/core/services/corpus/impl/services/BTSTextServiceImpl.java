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
		super.setId(entity);
		super.setRevision(entity);
		entity.setCorpusPrefix(main_corpus_key);
		return entity;
	}

	@Override
	public boolean save(BTSText entity)
	{
		super.addRevisionStatement(entity);
		textDao.add(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());
		return true;
	}

	@Override
	public void update(BTSText entity)
	{
		textDao.update(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public void remove(BTSText entity)
	{
		textDao.remove(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public BTSText find(String key)
	{
		BTSText text = null;
		text = textDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + main_corpus_key);
		if (text != null)
		{
			return text;
		}
		for (String c : getActive_corpora())
		{
			text = textDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + c);
			if (text != null)
			{
				return text;
			}
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				text = textDao.find(key, p + BTSCorpusConstants.CORPUS_INTERFIX + c);
				if (text != null)
				{
					return text;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSText> list(String objectState)
	{
		List<BTSText> texts = new Vector<BTSText>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				texts.addAll(textDao.list(p + BTSCorpusConstants.CORPUS_INTERFIX
						+ c, objectState));
			}
		}
		return filter(texts);
	}

	@Override
	public List<BTSText> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSText> objects = new Vector<BTSText>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(textDao.query(query, p + BTSCorpusConstants.CORPUS_INTERFIX + c, p
						+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState,
						registerQuery));
			}
		}
		return filter(objects);
	}

	@Override
	public List<BTSText> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSText> list(String dbPath, String queryId, String objectState)
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

	protected String[] getActive_corpora() {
		return active_corpora.split(BTSCoreConstants.SPLIT_PATTERN);
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
	
	
}
