package org.bbaw.bts.core.services.impl.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.GraphicSelectionCounter;
import org.bbaw.bts.core.dao.GraphicSelectionCounterDao;
import org.bbaw.bts.core.services.GraphicSelectionCounterService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.elasticsearch.index.query.QueryBuilders;

public class GraphicSelectionCounterServiceImpl extends
		GenericObjectServiceImpl<GraphicSelectionCounter, String> implements
		GraphicSelectionCounterService {

	@Inject
	private GraphicSelectionCounterDao counterDao;
	@Inject
	private IEclipseContext context;
	@Override
	public GraphicSelectionCounter createNew() {
		GraphicSelectionCounter counter = BtsmodelFactory.eINSTANCE
				.createGraphicSelectionCounter();
		return counter;
	}

	@Override
	public boolean save(GraphicSelectionCounter entity) {
		if (entity != null) {
			entity.setSuggest(entity.get_id()); // XXX ordentlich machen, beim
												// setzen der id
			counterDao
.add(entity, ServiceConstants.LOCAL);
		}
		return false;
	}

	@Override
	public void update(GraphicSelectionCounter entity) {
		counterDao.update(entity, ServiceConstants.LOCAL);
	}

	@Override
	public void remove(GraphicSelectionCounter entity) {
		counterDao.remove(entity, ServiceConstants.LOCAL);

	}

	@Override
	public GraphicSelectionCounter find(String key) {
		GraphicSelectionCounter counter = null;
		try {
			counter = counterDao.find(key, ServiceConstants.LOCAL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (counter != null) {
			return counter;
		}
		return null;
	}

	@Override
	public List<GraphicSelectionCounter> list() {
		List<GraphicSelectionCounter> counters = new Vector<GraphicSelectionCounter>();
		counters.addAll(counterDao.list(ServiceConstants.LOCAL));
		return counters;
	}

	@Override
	public List<GraphicSelectionCounter> list(String dbPath, String queryId) {
		return null;
	}


	@Override
	public List<GraphicSelectionCounter> query(BTSQueryRequest query) {
		List<GraphicSelectionCounter> counters = new Vector<GraphicSelectionCounter>();
		counters.addAll(counterDao.query(query, ServiceConstants.LOCAL,
				ServiceConstants.LOCAL));
		return counters;
	}

	@Override
	public List<GraphicSelectionCounter> getCountersForPrefix(String code) {
		List<GraphicSelectionCounter> counters = new Vector<GraphicSelectionCounter>();

		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.prefixQuery("_id", code));
		counters.addAll(counterDao.query(query, ServiceConstants.LOCAL,
				ServiceConstants.LOCAL));
		return counters;
	}

	@Override
	public void updateCounters(List<String> counters) {
		Set<GraphicSelectionCounter> toSave = new HashSet<GraphicSelectionCounter>(counters.size());
		for (String id : counters)
		{
			GraphicSelectionCounter counter = find(id);
			if (counter == null)
			{
				counter = BtsmodelFactory.eINSTANCE
						.createGraphicSelectionCounter();
				counter.set_id(id);
				counter.setProject(main_project);
			}
			counter.setCounter(counter.getCounter() + 1);
			toSave.add(counter);
		}
		saveMultiple(toSave);
	}

}
