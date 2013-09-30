package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSTextCorpusDao;
import org.bbaw.bts.core.services.BTSTextCorpusService;
import org.bbaw.bts.core.services.CorpusObjectService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;

public class BTSTextCorpusServiceImpl extends GenericObjectServiceImpl<BTSTextCorpus, String> implements
		BTSTextCorpusService
{

	@Inject
	BTSTextCorpusDao textCorpusDao;

	@Inject
	private CorpusObjectService corpusObjectService;

	@Override
	public BTSTextCorpus createNew()
	{
		BTSTextCorpus entity = BtsmodelFactory.eINSTANCE.createBTSTextCorpus();
		setId(entity);
		setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSTextCorpus entity)
	{
		textCorpusDao.add(entity, entity.getProject() + ServiceConstants.CORPUS);
		return false;
	}

	@Override
	public void update(BTSTextCorpus entity)
	{
		textCorpusDao.update(entity, entity.getProject() + ServiceConstants.CORPUS);

	}

	@Override
	public void remove(BTSTextCorpus entity)
	{
		textCorpusDao.remove(entity, entity.getProject() + ServiceConstants.CORPUS);

	}

	@Override
	public BTSTextCorpus find(String key)
	{
		BTSTextCorpus corpus = null;
		corpus = textCorpusDao.find(key, main_project + ServiceConstants.CORPUS);
		if (corpus != null)
		{
			return corpus;
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			corpus = textCorpusDao.find(key, p + ServiceConstants.CORPUS);
			if (corpus != null)
			{
				return corpus;
			}
		}
		return null;
	}

	@Override
	public List<BTSTextCorpus> list()
	{
		List<BTSTextCorpus> list = new Vector<BTSTextCorpus>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			list.addAll(textCorpusDao.list(p + ServiceConstants.CORPUS));
		}
		loadChildren(list);
		return list;
	}

	private void loadChildren(List<BTSTextCorpus> list)
	{
		for (BTSTextCorpus tc : list)
		{
//			corpusObjectService.loadChildren(tc);
		}

	}

}
