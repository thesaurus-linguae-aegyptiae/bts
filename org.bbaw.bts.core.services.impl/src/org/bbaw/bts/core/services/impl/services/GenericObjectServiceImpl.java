package org.bbaw.bts.core.services.impl.services;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.core.services.IDService;

public abstract class GenericObjectServiceImpl<E extends BTSDBBaseObject, K extends Serializable> implements
		GenericObjectService<E, K>
{
	@Inject
	protected CorpusObjectDao corpusObjectDao;

	@Inject
	protected IDService idService;

	protected Class<? extends BTSDBBaseObject> daoType;

	@SuppressWarnings("unchecked")
	public GenericObjectServiceImpl()
	{
		daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		System.out.println("Construct GenericObjectServiceImpl");
	}

	@Override
	public abstract E createNew();

	public void setId(E entity)
	{
		if (entity instanceof BTSDBBaseObject)
		{
			((BTSDBBaseObject) entity).set_id(idService.createId());
		}
	}

	public void setRevision(E entity)
	{
		if (entity instanceof BTSDBBaseObject)
		{
			// FIXME fill out!
		}
	}

	@Override
	public abstract boolean save(E entity);

	@Override
	public abstract void update(E entity);

	@Override
	public abstract void remove(E entity);

	@Override
	public abstract E find(K key);

	@Override
	public abstract List<E> list();

	protected void loadChildren(List<E> list)
	{
		for (E parent : list)
		{
			loadChildren(parent);
		}

	}

	protected void loadChildren(E parent)
	{
		if (parent != null && parent instanceof BTSCorpusObject && !((BTSCorpusObject) parent).getRelations().isEmpty())
		{
			for (BTSRelation rel : ((BTSCorpusObject) parent).getRelations())
			{
				loadChild(((BTSCorpusObject) parent), rel);
			}
		}

	}

	private void loadChild(BTSCorpusObject parent, BTSRelation rel)
	{
		BTSCorpusObject child = corpusObjectDao.find(rel.getObjectId());
		parent.getChildren().add(child);

	}

}
