package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSTCObjectDao;
import org.bbaw.bts.core.services.BTSTCObjectService;
import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class BTSTCObjectServiceImpl extends GenericObjectServiceImpl<BTSTCObject, String> implements BTSTCObjectService
{

	@Inject
	BTSTCObjectDao bTSTCObjectDao;

	public List<BTSTCObject> getRootTCObjects()
	{
		return bTSTCObjectDao.list();

	}

	@Override
	public boolean save(BTSTCObject o)
	{
		if (o instanceof BTSTCObject)
		{
			bTSTCObjectDao.add((BTSTCObject) o);
			return true;
		}
		return false;
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
		bTSTCObjectDao.update(entity);

	}

	@Override
	public void remove(BTSTCObject entity)
	{
		bTSTCObjectDao.remove(entity);

	}

	@Override
	public BTSTCObject find(String key)
	{
		return bTSTCObjectDao.find(key);
	}

	@Override
	public List<BTSTCObject> list()
	{
		return bTSTCObjectDao.list();
	}

}
