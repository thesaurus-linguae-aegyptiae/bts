package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;

public interface GenericObjectService<E extends BTSDBBaseObject, K>
{

	E createNew();

	boolean save(E entity);

	void update(E entity);

	void remove(E entity);

	E find(K key);

	List<E> list();

}