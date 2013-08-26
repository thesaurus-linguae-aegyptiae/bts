package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSAnnotationDao;
import org.bbaw.bts.core.services.BTSAnnotationService;

public class BTSAnnotationServiceImpl extends GenericObjectServiceImpl<BTSAnnotation, String> implements
		BTSAnnotationService
{

	@Inject
	BTSAnnotationDao bTSTCObjectDao;

	@Override
	public BTSAnnotation createNew()
	{
		BTSAnnotation anno = BtsmodelFactory.eINSTANCE.createBTSAnnotation();
		super.setId(anno);
		super.setRevision(anno);
		return anno;
	}

	@Override
	public boolean save(BTSAnnotation entity)
	{
		bTSTCObjectDao.add(entity);
		return true;
	}

	@Override
	public void update(BTSAnnotation entity)
	{
		bTSTCObjectDao.update(entity);

	}

	@Override
	public void remove(BTSAnnotation entity)
	{
		bTSTCObjectDao.remove(entity);

	}

	@Override
	public BTSAnnotation find(String key)
	{
		return bTSTCObjectDao.find(key);
	}

	@Override
	public List<BTSAnnotation> list()
	{
		return bTSTCObjectDao.list();
	}

}
