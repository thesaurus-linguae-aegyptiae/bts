package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSImage;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSImageDao;
import org.bbaw.bts.core.services.BTSImageService;

public class BTSImageServiceImpl extends GenericObjectServiceImpl<BTSImage, String> implements BTSImageService
{

	@Inject
	BTSImageDao imageDao;

	@Override
	public BTSImage createNew()
	{
		BTSImage image = BtsmodelFactory.eINSTANCE.createBTSImage();
		super.setId(image);
		super.setRevision(image);
		return image;
	}

	@Override
	public boolean save(BTSImage entity)
	{
		imageDao.add(entity);
		return false;
	}

	@Override
	public void update(BTSImage entity)
	{
		imageDao.update(entity);

	}

	@Override
	public void remove(BTSImage entity)
	{
		imageDao.remove(entity);

	}

	@Override
	public BTSImage find(String key)
	{
		return imageDao.find(key);
	}

	@Override
	public List<BTSImage> list()
	{
		return imageDao.list();
	}

}
