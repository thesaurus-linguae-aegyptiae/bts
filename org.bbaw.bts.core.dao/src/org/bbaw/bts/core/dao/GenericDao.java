package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;

public interface GenericDao<E extends BTSDBBaseObject, K>
{

	void add(E entity);

	void update(E entity);

	void remove(E entity);

	E find(K key);

	E reload(K key);

	List<E> list();

}