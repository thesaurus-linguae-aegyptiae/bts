package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.MoveObjectAmongProjectDBCollectionsService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.corpus.comparator.BTSPassportEntryComparator;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.corpus.CorpusObjectDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.BTSImageService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.corpus.BTSTCObjectService;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.corpus.BTSTextService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSImage;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public class CorpusObjectServiceImpl 
extends AbstractCorpusObjectServiceImpl<BTSCorpusObject, String> 
implements 	CorpusObjectService, BTSObjectSearchService, MoveObjectAmongProjectDBCollectionsService
{


	// daos
	@Inject
	private BTSAnnotationService annotationService;

	@Inject
	private BTSImageService imageService;

	@Inject
	private BTSLemmaEntryService lemmaEntryService;

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
	

	protected String[] getActive_corpora() {
		List<String> arr = new ArrayList<String>(4);
		for (String s : active_corpora.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			if (s.trim().length() > 0 && !arr.contains(s))
			{
				arr.add(s);
			}
		}
		return arr.toArray(new String[arr.size()]);
	}

	protected void setActive_corpora(String active_corpora) {
		this.active_corpora = active_corpora;
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
		} else if (entity instanceof BTSLemmaEntry)
		{
			return lemmaEntryService.save((BTSLemmaEntry) entity);
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
		} else if (entity instanceof BTSLemmaEntry)
		{
			lemmaEntryService.update((BTSLemmaEntry) entity);
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
		} else if (entity instanceof BTSLemmaEntry)
		{
			lemmaEntryService.remove((BTSLemmaEntry) entity);
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
		tcObject = corpusObjectDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + main_corpus_key);
		if (tcObject != null)
		{
			return tcObject;
		}
		for (String c : getActive_corpora())
		{
			tcObject = corpusObjectDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + c);
			if (tcObject != null)
			{
				return tcObject;
			}
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				tcObject = corpusObjectDao.find(key, p + BTSCorpusConstants.CORPUS_INTERFIX + c);
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
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(corpusObjectDao.list(p
						+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState));
			}
		}
		objects.addAll(textCorpusService.list(objectState));
		return filter(objects);
	}

	public List<BTSCorpusObject> getRootBTSCorpusObjects()
	{
		List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(corpusObjectDao.getRootBTSCorpusObjects(p + BTSCorpusConstants.CORPUS_INTERFIX + c));
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
			for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
			{
				for (String c : getActive_corpora())
				{
					objects.addAll(corpusObjectDao
							.findByQueryId(searchId, p
									+ BTSCorpusConstants.CORPUS_INTERFIX + c,
									objectState));
				}
			}
		}
		return filter(objects);
	}

	private List<BTSCorpusObject> find(BTSQueryRequest query, String objectState)
	{
		List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				objects.addAll(corpusObjectDao.query(query, p + BTSCorpusConstants.CORPUS_INTERFIX + c, p
						+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState,
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
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {
			for (String c : getActive_corpora()
					) {
				result.addAll(corpusObjectDao.getPassportEntryProposals(
						query, p + BTSCorpusConstants.CORPUS_INTERFIX + c, p
								+ BTSCorpusConstants.CORPUS_INTERFIX + c));
			}
			result.addAll(corpusObjectDao.getPassportEntryProposals(
					query, p + BTSCorpusConstants.THS, p
							+ BTSCorpusConstants.THS));
			result.addAll(corpusObjectDao.getPassportEntryProposals(
					query, p + BTSCorpusConstants.WLIST, p
							+ BTSCorpusConstants.WLIST));
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
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {
			for (String c : getActive_corpora()) {
				
				try {
					objects.addAll(corpusObjectDao.query(query, p
							+ BTSCorpusConstants.CORPUS_INTERFIX + c, p
							+ BTSCorpusConstants.CORPUS_INTERFIX + c, objectState,
							registerQuery));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return filter(objects);
	}

	@Override
	public BTSCorpusObject find(String key, String path, String revision) {
		if (path != null && !"".equals(path))
		{
			return corpusObjectDao.find(key, path, revision);
		}
		BTSCorpusObject tcObject = null;
		tcObject = corpusObjectDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + main_corpus_key, revision);
		if (tcObject != null)
		{
			return tcObject;
		}
		for (String c : getActive_corpora())
		{
			tcObject = corpusObjectDao.find(key, main_project + BTSCorpusConstants.CORPUS_INTERFIX + c, revision);
			if (tcObject != null)
			{
				return tcObject;
			}
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
		{
			for (String c : getActive_corpora())
			{
				tcObject = corpusObjectDao.find(key, p + BTSCorpusConstants.CORPUS_INTERFIX + c, revision);
				if (tcObject != null)
				{
					return tcObject;
				}
			}
		}
		return tcObject;
	}


	@Override
	public String getNameOfServedClass() {
		return "BTSCorpusObject";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSCorpusObject.class;
	}

	


	@Override
	public List<BTSCorpusObject> listRootEntries(IProgressMonitor monitor) {
		List<BTSTextCorpus> corpora = textCorpusService.list(BTSConstants.OBJECT_STATE_ACTIVE);
		List<BTSCorpusObject> roots = new Vector<BTSCorpusObject>(corpora.size());
		for (BTSTextCorpus tc : corpora)
		{
			roots.add(tc);
		}
		return roots;
	}


	@Override
	public boolean move(BTSDBBaseObject entity, String targetDBCollectionPath, String sourceDBCollectionPath) {
		String oldrev = entity.get_rev();
		String corpusPrefix = null;
		if (targetDBCollectionPath.contains("_corpus_"))
		{
			corpusPrefix = targetDBCollectionPath.split("_corpus_")[1];
		}
		((BTSCorpusObject)entity).setCorpusPrefix(corpusPrefix);
		
		// check if object with this id already exists in new target collection
		BTSCorpusObject potentialPredecessor = null;
		try {
			potentialPredecessor = find(entity.get_id(), targetDBCollectionPath, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (potentialPredecessor != null)
		{
			System.out.println("potentialPredecessor " + potentialPredecessor);
		}
		
		// if yes, get it, update it with current entity, keep revision of existing object
		entity.eResource().setURI(null);
		
		// else remove revision from entity
		boolean successful = save((BTSCorpusObject) entity);
		if (successful)
		{
			remove((BTSCorpusObject) entity, sourceDBCollectionPath, oldrev);
		}

		if (entity instanceof BTSTextCorpus)
		{
			throw new UnsupportedOperationException();

		}
		return successful;
	}


	private void remove(BTSCorpusObject entity, String sourceDBCollectionPath, String revision) {
		corpusObjectDao.setDeleted(entity, sourceDBCollectionPath, true);
		
	}
	public boolean checkAndFullyLoad(BTSCorpusObject object)
	{
		if (object.eResource() == null || object.get_rev() == null)
		{
			corpusObjectDao.loadFully(object);
		}
		return false;
		
	}
}
