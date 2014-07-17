package org.bbaw.bts.core.services.impl.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.UserActionCounter;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.dao.UserActionCounterDao;
import org.bbaw.bts.core.services.UserActionCounterService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.searchModel.BTSQueryRequest;
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
	public UserActionCounter find(String key) {
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
	public List<UserActionCounter> list(String objectState) {
		List<UserActionCounter> counters = new Vector<UserActionCounter>();
		counters.addAll(counterDao.list(BTSCoreConstants.LOCAL, objectState));
		return counters;
	}

	@Override
	public List<UserActionCounter> list(String dbPath, String queryId,
			String objectState) {
		return null;
	}


	@Override
	public List<UserActionCounter> query(BTSQueryRequest query,
			String objectState) {
		return query(query, objectState, false);
	}

	@Override
	public List<UserActionCounter> query(BTSQueryRequest query,
			String objectState, boolean registerQuery) {
		List<UserActionCounter> counters = new Vector<UserActionCounter>();
		counters.addAll(counterDao.query(query, BTSCoreConstants.LOCAL,
				BTSCoreConstants.LOCAL, objectState, registerQuery));
		return counters;
	}

	@Override
	public List<UserActionCounter> getCountersForPrefix(String code) {
		List<UserActionCounter> counters = new Vector<UserActionCounter>();

		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.prefixQuery("_id", code));
		counters.addAll(counterDao.query(query, BTSCoreConstants.LOCAL,
 BTSCoreConstants.LOCAL,
						BTSConstants.OBJECT_STATE_ACTIVE, false));
		return counters;
	}

	@Override
	public void updateCounters(List<String> counters) {
		Set<UserActionCounter> toSave = new HashSet<UserActionCounter>(counters.size());
		for (String id : counters)
		{
			UserActionCounter counter = find(id);
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
	}

}
