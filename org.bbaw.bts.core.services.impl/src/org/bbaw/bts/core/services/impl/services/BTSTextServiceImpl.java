package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.BTSTextService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
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
		textDao.add(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());
		return false;
	}

	@Override
	public void update(BTSText entity)
	{
		textDao.update(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public void remove(BTSText entity)
	{
		textDao.remove(entity, entity.getProject() + ServiceConstants.CORPUS_INTERFIX + entity.getCorpusPrefix());

	}

	@Override
	public BTSText find(String key)
	{
		BTSText text = null;
		text = textDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + main_corpus);
		if (text != null)
		{
			return text;
		}
		for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
		{
			text = textDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + c);
			if (text != null)
			{
				return text;
			}
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				text = textDao.find(key, p + ServiceConstants.CORPUS_INTERFIX + c);
				if (text != null)
				{
					return text;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSText> list()
	{
		List<BTSText> texts = new Vector<BTSText>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : active_corpora.split(ServiceConstants.SPLIT_PATTERN))
			{
				texts.addAll(textDao.list(p + ServiceConstants.CORPUS_INTERFIX + c));
			}
		}
		return texts;
	}

}
