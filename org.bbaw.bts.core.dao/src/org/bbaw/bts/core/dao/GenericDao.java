package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;

public interface GenericDao<E extends BTSDBBaseObject, K>
{

	void add(E entity, String path);

	void update(E entity, String path);

	void remove(E entity, String path);

	E find(K key, String path);

	E reload(K key, String path);

	List<E> list(String path);

}