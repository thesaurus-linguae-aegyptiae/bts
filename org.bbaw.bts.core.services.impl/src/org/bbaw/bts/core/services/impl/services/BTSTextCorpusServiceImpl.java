package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSTextCorpusDao;
import org.bbaw.bts.core.services.BTSTextCorpusService;

public class BTSTextCorpusServiceImpl extends GenericObjectServiceImpl<BTSTextCorpus, String> implements
		BTSTextCorpusService
{

	@Inject
	BTSTextCorpusDao textCorpusDao;

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
		textCorpusDao.add(entity);
		return false;
	}

	@Override
	public void update(BTSTextCorpus entity)
	{
		textCorpusDao.update(entity);

	}

	@Override
	public void remove(BTSTextCorpus entity)
	{
		textCorpusDao.remove(entity);

	}

	@Override
	public BTSTextCorpus find(String key)
	{
		return textCorpusDao.find(key);
	}

	@Override
	public List<BTSTextCorpus> list()
	{
		List<BTSTextCorpus> list = textCorpusDao.list();
		loadChildren(list);
		return list;
	}

}
