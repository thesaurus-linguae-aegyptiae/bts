package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.BTSTextService;
import org.bbaw.bts.dao.couchDB.BTSTextDaoImpl;

public class BTSTextServiceImpl extends GenericObjectServiceImpl<BTSText, String> implements BTSTextService
{

	@Inject
	BTSTextDaoImpl textDao;

	@Override
	public BTSText createNew()
	{
		BTSText entity = BtsmodelFactory.eINSTANCE.createBTSText();
		super.setId(entity);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSText entity)
	{
		textDao.add(entity);
		return false;
	}

	@Override
	public void update(BTSText entity)
	{
		textDao.update(entity);

	}

	@Override
	public void remove(BTSText entity)
	{
		textDao.remove(entity);

	}

	@Override
	public BTSText find(String key)
	{
		return textDao.find(key);
	}

	@Override
	public List<BTSText> list()
	{
		return textDao.list();
	}

}
