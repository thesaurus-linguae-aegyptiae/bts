package org.bbaw.bts.core.services.impl.services;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSImage;
import org.bbaw.bts.btsmodel.BTSListEntry;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.core.commons.comparator.BTSPassportEntryComparator;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.services.BTSAnnotationService;
import org.bbaw.bts.core.services.BTSImageService;
import org.bbaw.bts.core.services.BTSListEntryService;
import org.bbaw.bts.core.services.BTSTCObjectService;
import org.bbaw.bts.core.services.BTSTextCorpusService;
import org.bbaw.bts.core.services.BTSTextService;
import org.bbaw.bts.core.services.BTSThsEntryService;
import org.bbaw.bts.core.services.CorpusObjectService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class CorpusObjectServiceImpl extends GenericObjectServiceImpl<BTSCorpusObject, String> implements
		CorpusObjectService
{

	// daos
	@Inject
	private BTSAnnotationService annotationService;

	@Inject
	private BTSImageService imageService;

	@Inject
	private BTSListEntryService listEntryService;

	@Inject
	private BTSTCObjectService tcObjectService;

	@Inject
	private BTSTextCorpusService textCorpusService;

	@Inject
	private BTSTextService textService;

	@Inject
	private CorpusObjectDao corpusObjectDao;

	@Inject
	private BTSThsEntryService thsService;

	@Inject
	private GeneralPurposeDao generalPurposeDao;
	// services

	private IEclipseContext eclipseCtx;

	@Override
	public BTSCorpusObject createNew()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(BTSCorpusObject entity)
	{
		if (entity instanceof BTSImage)
		{
			return imageService.save((BTSImage) entity);
		} else if (entity instanceof BTSAnnotation)
		{
			return annotationService.save((BTSAnnotation) entity);
		} else if (entity instanceof BTSListEntry)
		{
			return listEntryService.save((BTSListEntry) entity);
		} else if (entity instanceof BTSTCObject)
		{
			return tcObjectService.save((BTSTCObject) entity);
		} else if (entity instanceof BTSTextCorpus)
		{
			return textCorpusService.save((BTSTextCorpus) entity);
		} else if (entity instanceof BTSText)
		{
			return textService.save((BTSText) entity);
		}
 else if (entity instanceof BTSThsEntry) {
			return thsService.save((BTSThsEntry) entity);
		}
		return false;
	}

	@Override
	public void update(BTSCorpusObject entity)
	{
		if (entity instanceof BTSImage)
		{
			imageService.update((BTSImage) entity);
		} else if (entity instanceof BTSAnnotation)
		{
			annotationService.update((BTSAnnotation) entity);
		} else if (entity instanceof BTSListEntry)
		{
			listEntryService.update((BTSListEntry) entity);
		} else if (entity instanceof BTSTCObject)
		{
			tcObjectService.update((BTSTCObject) entity);
		} else if (entity instanceof BTSTextCorpus)
		{
			textCorpusService.update((BTSTextCorpus) entity);
		} else if (entity instanceof BTSText)
		{
			textService.update((BTSText) entity);
		}
 else if (entity instanceof BTSThsEntry) {
			thsService.update((BTSThsEntry) entity);
		}

	}

	@Override
	public void remove(BTSCorpusObject entity)
	{
		if (entity instanceof BTSImage)
		{
			imageService.remove((BTSImage) entity);
		} else if (entity instanceof BTSAnnotation)
		{
			annotationService.remove((BTSAnnotation) entity);
		} else if (entity instanceof BTSListEntry)
		{
			listEntryService.remove((BTSListEntry) entity);
		} else if (entity instanceof BTSTCObject)
		{
			tcObjectService.remove((BTSTCObject) entity);
		} else if (entity instanceof BTSTextCorpus)
		{
			textCorpusService.remove((BTSTextCorpus) entity);
		} else if (entity instanceof BTSText)
		{
			textService.remove((BTSText) entity);
		}
 else if (entity instanceof BTSThsEntry) {
			thsService.remove((BTSThsEntry) entity);
		}

	}

	@Override
	public BTSCorpusObject find(String key)
	{
		BTSCorpusObject tcObject = null;
		tcObject = corpusObjectDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + main_corpus);
		if (tcObject != null)
		{
			return tcObject;
		}
		for (String c : getActive_corpora())
		{
			tcObject = corpusObjectDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + c);
			if (tcObject != null)
			{
				return tcObject;
			}
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				tcObject = corpusObjectDao.find(key, p + ServiceConstants.CORPUS_INTERFIX + c);
				if (tcObject != null)
				{
					return tcObject;
				}
			}
		}
		return tcObject;
	}

	@Override
	public List<BTSCorpusObject> list(String objectState)
	{
		List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(corpusObjectDao.list(p
						+ ServiceConstants.CORPUS_INTERFIX + c, objectState));
			}
		}
		return filter(objects);
	}

	public List<BTSCorpusObject> getRootBTSCorpusObjects()
	{
		List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(corpusObjectDao.getRootBTSCorpusObjects(p + ServiceConstants.CORPUS_INTERFIX + c));
			}
		}
		return filter(objects);
	}

	public List<BTSCorpusObject> findByQueryId(String searchId, String dbPath,
			String objectState)
	{
		List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>();

		if (dbPath != null)
		{
			objects.addAll(corpusObjectDao.findByQueryId(searchId, dbPath,
					objectState));
		} else
		{
			for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
			{
				for (String c : getActive_corpora())
				{
					objects.addAll(corpusObjectDao
							.findByQueryId(searchId, p
									+ ServiceConstants.CORPUS_INTERFIX + c,
									objectState));
				}
			}
		}
		return filter(objects);
	}

	private List<BTSCorpusObject> find(BTSQueryRequest query, String objectState)
	{
		List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(corpusObjectDao.query(query, p + ServiceConstants.CORPUS_INTERFIX + c, p
						+ ServiceConstants.CORPUS_INTERFIX + c, objectState,
						false));
			}
		}
		return filter(objects);
	}

	@Override
	public List<BTSCorpusObject> query(BTSQueryRequest query, String objectState)
	{
		return query(query, objectState, true);

	}

	@Override
	public boolean saveMultiple(Set<BTSCorpusObject> entitys)
	{
		throw new UnsupportedOperationException("You have to implement saveMultiple Set... method!!!");
	}

	@Override
	public List<BTSCorpusObject> list(String dbPath, String queryId,
			String objectState)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public List<BTSPassportEntry> getPassportEntryProposals(
			BTSQueryRequest query) {
		List<BTSPassportEntry> result = new Vector<BTSPassportEntry>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN)) {
			for (String c : getActive_corpora()
					) {
				result.addAll(corpusObjectDao.getPassportEntryProposals(
						query, p + ServiceConstants.CORPUS_INTERFIX + c, p
								+ ServiceConstants.CORPUS_INTERFIX + c));
			}
			result.addAll(corpusObjectDao.getPassportEntryProposals(
					query, p + ServiceConstants.THS, p
							+ ServiceConstants.THS));
			result.addAll(corpusObjectDao.getPassportEntryProposals(
					query, p + ServiceConstants.WLIST, p
							+ ServiceConstants.WLIST));
		}
		return selectDistinctValues(result);
	}

	private List<BTSPassportEntry> selectDistinctValues(
			List<BTSPassportEntry> result) {
		Set<String> selected = new HashSet<String>(result.size());
		List<BTSPassportEntry> distinctResult = new Vector<BTSPassportEntry>();

		for (BTSPassportEntry entry : result)
		{
			if(!selected.contains(entry.getValue()))
			{
				distinctResult.add(entry);
				selected.add(entry.getValue());
			}
		}
		Collections.sort(distinctResult, new BTSPassportEntryComparator());
		return distinctResult;
	}

	@Override
	public List<BTSCorpusObject> query(BTSQueryRequest query,
			String objectState,
			boolean registerQuery) {
		List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN)) {
			for (String c : getActive_corpora()) {
				objects.addAll(corpusObjectDao.query(query, p
						+ ServiceConstants.CORPUS_INTERFIX + c, p
						+ ServiceConstants.CORPUS_INTERFIX + c, objectState,
						registerQuery));
			}
		}
		return filter(objects);
	}


}
