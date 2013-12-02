package org.bbaw.bts.core.remote.dao.couchDB.impl;

import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.core.remote.dao.RemoteDBLeaseDao;

public class RemoteDBLeaseDaoImpl extends RemoteCouchDBDao<DBLease, String> implements RemoteDBLeaseDao
{

	@Override
	public boolean removeDBLease(DBLease lease, String path)
	{
		super.remove(lease, path);
		return true;
	}

}
