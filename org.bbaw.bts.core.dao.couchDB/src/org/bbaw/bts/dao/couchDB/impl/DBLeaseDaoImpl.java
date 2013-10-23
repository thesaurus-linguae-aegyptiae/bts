package org.bbaw.bts.dao.couchDB.impl;

import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.core.dao.DBLeaseDao;

public class DBLeaseDaoImpl extends CouchDBDao<DBLease, String> implements DBLeaseDao
{

	@Override
	public boolean removeDBLease(DBLease lease, String path)
	{
		super.remove(lease, path);
		return true;
	}

}
