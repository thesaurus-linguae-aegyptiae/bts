package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSTCObjectDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.corpus.BTSTCObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class BTSTCObjectServiceImpl extends AbstractCorpusObjectServiceImpl<BTSTCObject, String> implements BTSTCObjectService, BTSObjectSearchService
{

	@Inject
	BTSTCObjectDao bTSTCObjectDao;

	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_CORPUS_DEFAULT_REVIEWSTATE, nodePath = "org.bbaw.bts.ui.corpus")
	protected String corpusReviewState;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_CORPUS_DEFAULT_VISIBILITY, nodePath = "org.bbaw.bts.ui.corpus")
	protected String corpusVisibility;
	
	public List<BTSTCObject> getRootTCObjects()
	{
		return list(BTSConstants.OBJECT_STATE_ACTIVE, null);

	}

	@Override
	public boolean save(BTSTCObject o)
	{
		super.addRevisionStatement(o);
		bTSTCObjectDao.add(o, o.getDBCollectionKey());
		return true;

	}

	@Override
	public BTSTCObject createNew()
	{
		BTSTCObject o = BtsCorpusModelFactory.eINSTANCE.createBTSTCObject();
		o.setDBCollectionKey(main_corpus_key);
		o.setVisibility(corpusVisibility);
		o.setRevisionState(corpusReviewState);
		o.setCorpusPrefix(main_corpus_key);
		setId(o, o.getDBCollectionKey());
		setRevision(o);

		return o;

	}

	@Override
	public void update(BTSTCObject entity)
	{
		bTSTCObjectDao
				.update(entity, entity.getDBCollectionKey());

	}

	@Override
	public void remove(BTSTCObject entity)
	{
		bTSTCObjectDao
				.remove(entity, entity.getDBCollectionKey());

	}

	@Override
	public BTSTCObject find(String key, IProgressMonitor monitor)
	{
		BTSTCObject tcObject = null;
		tcObject = bTSTCObjectDao.find(key, main_corpus_key);
		if (tcObject != null)
		{
			return tcObject;
		}
		for (String c : getActive_corpora(main_project))
		{
			tcObject = bTSTCObjectDao.find(key, c);
			if (tcObject != null)
			{
				return tcObject;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				tcObject = bTSTCObjectDao.find(key, c);
				if (tcObject != null)
				{
					return tcObject;
				}
			}
		}
		return tcObject;
	}

	@Override
	public List<BTSTCObject> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSTCObject> objects = new Vector<BTSTCObject>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				objects.addAll(bTSTCObjectDao.list(c, objectState));
			}
		}
		return filter(objects);
	}

	@Override
	public List<BTSTCObject> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor)
	{
		List<BTSTCObject> objects = new Vector<BTSTCObject>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				objects.addAll(bTSTCObjectDao.query(query, c, c, objectState,
						registerQuery));
			}
		}
		return filter(objects);
	}
	@Override
	public List<BTSTCObject> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);
	}

	@Override
	public List<BTSTCObject> list(String dbPath, String queryId, String objectState, IProgressMonitor monitor)
	{
		return filter(bTSTCObjectDao.findByQueryId(queryId, dbPath, objectState));
	}
	@Override
	public List<BTSTCObject> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSTCObject> objects = new Vector<BTSTCObject>();
		objects.addAll(bTSTCObjectDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(objects);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSTCObject";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSTCObject.class;
	}

	@Override
	public List<BTSTCObject> listRootEntries(IProgressMonitor monitor) {
		throw new UnsupportedOperationException();
	}
	
}
