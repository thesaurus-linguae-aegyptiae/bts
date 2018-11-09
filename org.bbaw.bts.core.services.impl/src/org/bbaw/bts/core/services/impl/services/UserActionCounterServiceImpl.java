package org.bbaw.bts.core.services.impl.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.UserActionCounter;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.dao.UserActionCounterDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.UserActionCounterService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.elasticsearch.index.query.QueryBuilders;

public class UserActionCounterServiceImpl extends
		GenericObjectServiceImpl<UserActionCounter, String> implements
		UserActionCounterService {

	@Inject
	private UserActionCounterDao counterDao;
	@Inject
	private IEclipseContext context;
	@Override
	public UserActionCounter createNew() {
		UserActionCounter counter = BtsmodelFactory.eINSTANCE
				.createUserActionCounter();
		counter.setDBCollectionKey(BTSCoreConstants.LOCAL);
		return counter;
	}

	@Override
	public boolean save(UserActionCounter entity) {
		if (entity != null) {
			counterDao
.add(entity, BTSCoreConstants.LOCAL);
		}
		return false;
	}

	@Override
	public void update(UserActionCounter entity) {
		counterDao.update(entity, BTSCoreConstants.LOCAL);
	}

	@Override
	public void remove(UserActionCounter entity) {
		counterDao.remove(entity, BTSCoreConstants.LOCAL);

	}

	@Override
	public UserActionCounter find(String key, IProgressMonitor monitor) {
		UserActionCounter counter = null;
		try {
			counter = counterDao.find(key, BTSCoreConstants.LOCAL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (counter != null) {
			return counter;
		}
		return null;
	}
	

	@Override
	public List<UserActionCounter> list(String objectState, IProgressMonitor monitor) {
		List<UserActionCounter> counters = new Vector<UserActionCounter>();
		counters.addAll(counterDao.list(BTSCoreConstants.LOCAL, objectState));
		return counters;
	}
	@Override
	public List<UserActionCounter> listChunks(int chunkSize,  String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<UserActionCounter> counters = new Vector<UserActionCounter>();
		counters.addAll(counterDao.listChunks(chunkSize, chunkIds,BTSCoreConstants.LOCAL, objectState));
		return counters;
	}
	@Override
	public List<UserActionCounter> list(String dbPath, String queryId,
			String objectState, IProgressMonitor monitor) {
		return null;
	}


	@Override
	public List<UserActionCounter> query(BTSQueryRequest query,
			String objectState, IProgressMonitor monitor) {
		return query(query, objectState, false, monitor);
	}

	@Override
	public List<UserActionCounter> query(BTSQueryRequest query,
			String objectState, boolean registerQuery, IProgressMonitor monitor) {
		List<UserActionCounter> counters = new Vector<UserActionCounter>();
		String[] indexArray = new String[]{BTSCoreConstants.LOCAL};

		counters.addAll(counterDao.query(query, indexArray,
				indexArray, objectState, registerQuery));
		return counters;
	}

	@Override
	public List<UserActionCounter> getCountersForPrefix(String code) {
		List<UserActionCounter> counters = new Vector<UserActionCounter>();

		BTSQueryRequest query = new BTSQueryRequest();
		String[] indexArray = new String[]{BTSCoreConstants.LOCAL};

		query.setQueryBuilder(QueryBuilders.prefixQuery("_id", code));
		counters.addAll(counterDao.query(query, indexArray,
				indexArray,
						BTSConstants.OBJECT_STATE_ACTIVE, false));
		return counters;
	}

	@Override
	public void updateCounters(final List<String> counters) {
		Job j = new Job("update_counters") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// TODO Auto-generated method stub
				Set<UserActionCounter> toSave = new HashSet<UserActionCounter>(counters.size());
				for (String id : counters)
				{
					UserActionCounter counter = find(id, null);
					if (counter == null)
					{
						counter = BtsmodelFactory.eINSTANCE
								.createUserActionCounter();
						counter.set_id(id);
						counter.setProject(main_project);
					}
					counter.setCounter(counter.getCounter() + 1);
					toSave.add(counter);
				}
				saveMultiple(toSave);
				return Status.OK_STATUS;
			}

		};
		j.schedule();
				
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#findAsJsonString(java.io.Serializable, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		return counterDao.findAsJsonString(key, BTSCoreConstants.LOCAL);
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#queryAsJsonString(org.bbaw.bts.core.dao.util.BTSQueryRequest, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<String> queryAsJsonString(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		List<String> counters = new Vector<String>();
		String[] indexArray = new String[]{BTSCoreConstants.LOCAL};

		counters.addAll(counterDao.queryAsJsonString(query, indexArray,
				indexArray, objectState, false));
		return counters;
	}


	

}
