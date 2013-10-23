package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.DBLease;

public interface DBLeaseDao extends GenericDao<DBLease, String>
{

	boolean removeDBLease(DBLease lease, String path);

}