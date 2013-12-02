package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSTCObjectDao;
import org.bbaw.bts.core.services.BTSTCObjectService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class BTSTCObjectServiceImpl extends GenericObjectServiceImpl<BTSTCObject, String> implements BTSTCObjectService
{

	@Inject
	BTSTCObjectDao bTSTCObjectDao;

	public List<BTSTCObject> getRootTCObjects()
	{
		return list();

	}

	@Override
	public boolean save(BTSTCObject o)
	{

		bTSTCObjectDao.add(o, o.getProject() + ServiceConstants.CORPUS_INTERFIX + o.getCorpusPrefix());
		return true;

	}

	@Override
	public BTSTCObject createNew()
	{
		BTSTCObject o = BtsmodelFactory.eINSTANCE.createBTSTCObject();
		setId(o);
		setRevision(o);
		return o;

	}

	@Override
	public void update(BTSTCObject entity)
	{
		bTSTCObjectDao
				.update(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public void remove(BTSTCObject entity)
	{
		bTSTCObjectDao
				.remove(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public BTSTCObject find(String key)
	{
		BTSTCObject tcObject = null;
		tcObject = bTSTCObjectDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + main_corpus);
		if (tcObject != null)
		{
			return tcObject;
		}
		for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
		{
			tcObject = bTSTCObjectDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + c);
			if (tcObject != null)
			{
				return tcObject;
			}
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				tcObject = bTSTCObjectDao.find(key, p + ServiceConstants.CORPUS_INTERFIX + c);
				if (tcObject != null)
				{
					return tcObject;
				}
			}
		}
		return tcObject;
	}

	@Override
	public List<BTSTCObject> list()
	{
		List<BTSTCObject> objects = new Vector<BTSTCObject>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				objects.addAll(bTSTCObjectDao.list(p + ServiceConstants.CORPUS_INTERFIX + c));
			}
		}
		return filter(objects);
	}

	@Override
	public List<BTSTCObject> query(BTSQueryRequest query)
	{
		List<BTSTCObject> objects = new Vector<BTSTCObject>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				objects.addAll(bTSTCObjectDao.query(query, p + ServiceConstants.CORPUS_INTERFIX + c, p
						+ ServiceConstants.CORPUS_INTERFIX + c));
			}
		}
		return filter(objects);
	}

	@Override
	public List<BTSTCObject> list(String dbPath, String queryId)
	{
		return filter(bTSTCObjectDao.findByQueryId(queryId, dbPath));
	}
}
