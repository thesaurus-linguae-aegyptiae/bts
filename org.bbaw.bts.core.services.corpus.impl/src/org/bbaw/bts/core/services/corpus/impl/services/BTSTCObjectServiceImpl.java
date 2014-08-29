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
import org.bbaw.bts.core.dao.corpus.BTSTCObjectDao;
import org.bbaw.bts.core.services.corpus.BTSTCObjectService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSTCObjectServiceImpl extends GenericObjectServiceImpl<BTSTCObject, String> implements BTSTCObjectService, BTSObjectSearchService
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
	BTSTCObjectDao bTSTCObjectDao;

	public List<BTSTCObject> getRootTCObjects()
	{
		return list(BTSConstants.OBJECT_STATE_ACTIVE);

	}

	@Override
	public boolean save(BTSTCObject o)
	{
		super.addRevisionStatement(o);
		bTSTCObjectDao.add(o, o.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + o.getCorpusPrefix());
		return true;

	}

	@Override
	public BTSTCObject createNew()
	{
		BTSTCObject o = BtsCorpusModelFactory.eINSTANCE.createBTSTCObject();
		setId(o);
		setRevision(o);
		o.setCorpusPrefix(main_corpus_key);
		return o;

	}

	@Override
	public void update(BTSTCObject entity)
	{
		bTSTCObjectDao
				.update(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public void remove(BTSTCObject entity)
	{
		bTSTCObjectDao
				.remove(entity, entity.getProject() + BTSCorpusConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public BTSTCObject find(String key)
	{
		BTSTCObject tcObject = null;
		tcObject = bTSTCObjectDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + main_corpus_key);
		if (tcObject != null)
		{
			return tcObject;
		}
		for (String c : getActive_corpora())
		{
			tcObject = bTSTCObjectDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + c);
			if (tcObject != null)
			{
				return tcObject;
			}
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				tcObject = bTSTCObjectDao.find(key, p + BTSCorpusConstants.CORPUS_INTERFIX + c);
				if (tcObject != null)
				{
					return tcObject;
				}
			}
		}
		return tcObject;
	}

	@Override
	public List<BTSTCObject> list(String objectState)
	{
		List<BTSTCObject> objects = new Vector<BTSTCObject>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(bTSTCObjectDao.list(p + BTSCorpusConstants.CORPUS_INTERFIX + c, objectState));
			}
		}
		return filter(objects);
	}

	@Override
	public List<BTSTCObject> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSTCObject> objects = new Vector<BTSTCObject>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(bTSTCObjectDao.query(query, p + BTSCorpusConstants.CORPUS_INTERFIX + c, p
						+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState,
						registerQuery));
			}
		}
		return filter(objects);
	}
	@Override
	public List<BTSTCObject> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSTCObject> list(String dbPath, String queryId, String objectState)
	{
		return filter(bTSTCObjectDao.findByQueryId(queryId, dbPath, objectState));
	}

	protected String[] getActive_corpora() {
		return active_corpora.split(BTSCoreConstants.SPLIT_PATTERN);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSTCObject";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSTCObject.class;
	}
}
