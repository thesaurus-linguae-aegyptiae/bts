package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSTextCorpusDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.db.DBManager;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSTextCorpusServiceImpl extends AbstractCorpusObjectServiceImpl<BTSTextCorpus, String> implements
		BTSTextCorpusService, BTSObjectSearchService
{

	@Inject
	private BTSTextCorpusDao textCorpusDao;
	
	@Inject
	private DBManager dbManager;

	@Inject
	private BTSProjectService projectService;

	@Override
	public BTSTextCorpus createNew()
	{
		BTSTextCorpus entity = BtsCorpusModelFactory.eINSTANCE.createBTSTextCorpus();
		setId(entity);
		setRevision(entity);
		entity.setCorpusPrefix(main_corpus_key);
		return entity;
	}

	@Override
	public boolean save(BTSTextCorpus entity)
	{
		
		super.addRevisionStatement(entity);
		textCorpusDao.add(entity, entity.getProject() + BTSCorpusConstants.CORPUS);
		return true;
	}

	@Override
	public void update(BTSTextCorpus entity)
	{
		textCorpusDao.update(entity, entity.getProject() + BTSCorpusConstants.CORPUS);

	}

	@Override
	public void remove(BTSTextCorpus entity)
	{
		textCorpusDao.remove(entity, entity.getProject() + BTSCorpusConstants.CORPUS);

	}

	@Override
	public BTSTextCorpus find(String key)
	{
		BTSTextCorpus corpus = null;
		corpus = textCorpusDao.find(key, main_project + BTSCorpusConstants.CORPUS);
		if (corpus != null)
		{
			return corpus;
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			corpus = textCorpusDao.find(key, p + BTSCorpusConstants.CORPUS);
			if (corpus != null)
			{
				return corpus;
			}
		}
		return null;
	}

	@Override
	public List<BTSTextCorpus> list(String objectState)
	{
		List<BTSTextCorpus> list = new Vector<BTSTextCorpus>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			list.addAll(textCorpusDao.list(p + BTSCorpusConstants.CORPUS,
					objectState));
		}
		return filter(list);
	}

	@Override
	public List<BTSTextCorpus> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSTextCorpus> objects = new Vector<BTSTextCorpus>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{

			objects.addAll(textCorpusDao.query(query, p
					+ BTSCorpusConstants.CORPUS, p + BTSCorpusConstants.CORPUS,
					objectState, registerQuery));

		}
		return filter(objects);
	}
	@Override
	public List<BTSTextCorpus> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSTextCorpus> list(String dbPath, String queryId,
			String objectState)
	{
		return filter(textCorpusDao.findByQueryId(queryId, dbPath, objectState));
	}



	@Override
	public boolean makeAndSaveNewTextCorpus(BTSTextCorpus corpus,
			boolean synchronizeCorpus) {
		if (corpus != null && corpus.eResource() == null)
		{
			BTSProject project = projectService.findByProjectPrefix(corpus.getProject());
			BTSProjectDBCollection coll = projectService.checkAndAddDBCollection(project, project.getPrefix() + BTSCorpusConstants.CORPUS_INTERFIX + corpus.getCorpusPrefix(), true, synchronizeCorpus);

			dbManager.checkAndCreateDBCollection(project, coll, corpus.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + corpus.getCorpusPrefix(), true, synchronizeCorpus);
		}
		return save(corpus);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSTextCorpus";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSTextCorpus.class;
	}

	@Override
	public List<BTSTextCorpus> listRootEntries() {
		throw new UnsupportedOperationException();
	}

	@Override
	public BTSTextCorpus findTextCorpusByPrefix(String corpusPrefix) {
		if (main_corpus_key.equals(corpusPrefix))
		{
			return (BTSTextCorpus) context.get("main_corpus");
		}
		List<BTSTextCorpus> corpora = list(BTSConstants.OBJECT_STATE_ACTIVE);
		for (BTSTextCorpus corpus : corpora)
		{
			if (corpus.getCorpusPrefix() != null && corpus.getCorpusPrefix().equals(corpusPrefix))
			{
				return corpus;
			}
		}
		return null;
	}
	
}
