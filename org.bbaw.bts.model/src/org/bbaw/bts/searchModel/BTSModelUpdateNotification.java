package org.bbaw.bts.searchModel;

import java.util.List;

public class BTSModelUpdateNotification
{

	private Object object;

	private List<String> queryIds;

	private boolean loaded;

	private String dbCollection;

	private boolean deleted;

	/**
	 * @return the object
	 */
	public Object getObject()
	{
		return object;
	}

	/**
	 * @param object
	 *            the object to set
	 */
	public void setObject(Object object)
	{
		this.object = object;
	}

	/**
	 * @return the queryIds
	 */
	public List<String> getQueryIds()
	{
		return queryIds;
	}

	/**
	 * @param queryIds
	 *            the queryIds to set
	 */
	public void setQueryIds(List<String> queryIds)
	{
		this.queryIds = queryIds;
	}

	public boolean isLoaded()
	{
		return loaded;
	}

	public void setLoaded(boolean loaded)
	{
		this.loaded = loaded;
	}

	public String getDbCollection()
	{
		return dbCollection;
	}

	public void setDbCollection(String dbCollection)
	{
		this.dbCollection = dbCollection;
	}

	public boolean isDeleted()
	{
		return deleted;
	}

	public void setDeleted(boolean deleted)
	{
		this.deleted = deleted;
	}

}
