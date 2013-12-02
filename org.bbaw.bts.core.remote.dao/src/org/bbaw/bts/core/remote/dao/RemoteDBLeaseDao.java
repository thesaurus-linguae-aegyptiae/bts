package org.bbaw.bts.core.remote.dao;

import org.bbaw.bts.btsmodel.DBLease;

public interface RemoteDBLeaseDao extends RemoteGenericDao<DBLease, String>
{

	boolean removeDBLease(DBLease lease, String path);

}