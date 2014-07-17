package org.bbaw.bts.core.services.impl.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.remote.dao.RemoteGeneralPurposeDao;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.core.services.IDService;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;

public abstract class GenericObjectServiceImpl<E extends BTSDBBaseObject, K extends Serializable> implements
		GenericObjectService<E, K>
{
	@Inject
	protected IEclipseContext context;
	
	@Inject
	protected GeneralPurposeDao generalPurposeDao;

	@Inject
	protected RemoteGeneralPurposeDao remoteGeneralPurposeDao;

	@Inject
	protected IDService idService;

	@Inject
	protected DBConnectionProvider connectionProvider;

	@Inject
	@Preference(value = BTSPluginIDs.PREF_ACTIVE_PROJECTS, nodePath = "org.bbaw.bts.app")
	protected String active_projects;

	@Inject
	@Preference(value = BTSPluginIDs.PREF_MAIN_PROJECT_KEY, nodePath = "org.bbaw.bts.app")
	protected String main_project;


	@Inject
	@Optional
	@Named(BTSCoreConstants.AUTHENTICATED_USER)
	private BTSUser authenticatedUser;

	protected Class<? extends BTSDBBaseObject> daoType;

	@Inject
	private BTSEvaluationService evaluationService;

	@SuppressWarnings("unchecked")
	public GenericObjectServiceImpl()
	{
		daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		System.out.println("Construct GenericObjectServiceImpl");
	}

	@Override
	public abstract E createNew();
	
	@Override
	public E createNewRelationPartOf(BTSIdentifiableItem parentObject)
	{
		E entity = createNew();
		if (parentObject != null && entity instanceof BTSObject)
		{
			BTSRelation rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
			rel.setObjectId(parentObject.get_id());
			rel.setType(BTSCoreConstants.BASIC_RELATIONS_PARTOF);
			((BTSObject) entity).getRelations().add(rel);
		}
		return entity;
		
	}

	public void setId(E entity)
	{
		if (entity instanceof BTSDBBaseObject)
		{
			((BTSDBBaseObject) entity).set_id(idService.createId());
			entity.setProject(main_project);
			if (authenticatedUser != null)
			{
				entity.getUpdaters().add(authenticatedUser.getUserName());
			}
		}
		
	}

	public void setRevision(E entity)
	{
		if (entity instanceof BTSDBBaseObject)
		{
			// FIXME fill out!
		}
	}
	
	public void reloadConflicts(E entity)
	{
		 generalPurposeDao.reloadConflicts(entity);
	}

	@Override
	public abstract boolean save(E entity);

	@Override
	public boolean saveMultiple(Set<E> entities)
	{
		// FIXME optimize batch saving!!!
		for (E entity : entities)
		{
			save(entity);
		}
		return true;
	}

	@Override
	public abstract void update(E entity);

	@Override
	public abstract void remove(E entity);

	public boolean removeRevision(E entity, String revision) {
		return generalPurposeDao.remove(entity, entity.getDBCollectionKey(), revision);

		}
		
	@Override
	public abstract E find(K key);

	@Override
	public E find(K key, String path, String revision) {
		if (path != null && !"".equals(path))
		{
			return (E) generalPurposeDao.find((String)key, path, revision);
		}
//		BTSCorpusObject tcObject = null;
//		tcObject = corpusObjectDao.find(key, main_project + BTSCoreConstants.CORPUS_INTERFIX + main_corpus_key, revision);
//		if (tcObject != null)
//		{
//			return tcObject;
//		}
//		for (String c : getActive_corpora())
//		{
//			tcObject = corpusObjectDao.find(key, main_project + BTSCoreConstants.CORPUS_INTERFIX + c, revision);
//			if (tcObject != null)
//			{
//				return tcObject;
//			}
//		}
//		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN))
//		{
//			for (String c : getActive_corpora())
//			{
//				tcObject = corpusObjectDao.find(key, p + BTSCoreConstants.CORPUS_INTERFIX + c, revision);
//				if (tcObject != null)
//				{
//					return tcObject;
//				}
//			}
//		}
//		return tcObject;
		return null;
	}
	
	@Override
	public E find(K key, String path, String revision, boolean fromRemote) {
		if (path != null && !"".equals(path))
		{
			if (fromRemote)
			{
				return (E) remoteGeneralPurposeDao.find((String)key, path, revision);
			}
			else
			{
				return find(key, path, revision);
			}
		}
		return null;
	}

	@Override
	public abstract List<E> list(String objectState);

	@Override
	public abstract List<E> query(BTSQueryRequest query, String objectState);

	public List<E> filter(List<E> objects)
	{
		return evaluationService.filter(objects);

	}

	public SearchRequestBuilder getSearchRequestBuilder() {
		return new SearchRequestBuilder(
				connectionProvider.getSearchClient(Client.class));
	}

	@Override
	public void addRevisionStatement(E entity) {

		if (entity instanceof AdministrativDataObject) {
			Date now = Calendar.getInstance(Locale.getDefault()).getTime();

			if (!((AdministrativDataObject) entity).getRevisions().isEmpty()) {
				BTSRevision rev = ((AdministrativDataObject) entity)
						.getRevisions().get(
								((AdministrativDataObject) entity)
										.getRevisions().size() - 1);
				if (rev != null
						&& now.getTime() > (rev.getTimeStamp().getTime() + 10000)) {
					addRevisionStatementInternal(
							(AdministrativDataObject) entity, now);
				}
			}
 else {
				addRevisionStatementInternal((AdministrativDataObject) entity,
						now);
			}

		}
	}

	private void addRevisionStatementInternal(AdministrativDataObject entity,
			Date now) {
		if (entity != null && authenticatedUser != null) {
			BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision();
			rev.setRef(entity.getRevisions().size());

			rev.setTimeStamp(now);
			rev.setUserId(authenticatedUser.get_id());
			entity.getRevisions().add(rev);
		}
	}

	

	@Override
	public List<DBRevision> listAvailableRevisions(BTSDBBaseObject object,
			boolean fetchFromRemote) {
		if (!fetchFromRemote)
		{
			return generalPurposeDao.listAvailableRevisions(object.get_id(), object.getDBCollectionKey());
		}
		else
		{
			List<DBRevision> revisions = generalPurposeDao.listAvailableRevisions(object.get_id(), object.getDBCollectionKey());
			Map<String, DBRevision> localRevs = new HashMap<String, DBRevision>(revisions.size());
			for (DBRevision rev : revisions)
			{
				localRevs.put(rev.getRevision(), rev);
			}
			for (DBRevision rev : remoteGeneralPurposeDao.listAvailableRevisions(object.get_id(), object.getDBCollectionKey()))
			{
				DBRevision local = localRevs.get(rev.getRevision());
				if (local == null || local.getLocation() == DBRevision.NOT_AVAILABLE)
				{
					revisions.add(rev);
				}
			}
			return revisions;
		}
	}
	
	public String getDisplayName(String userId)
	{
		BTSObject o = null;
		try {
			o = (BTSObject) find((K) userId);
		} catch (Exception e) {
		}
		if (o != null) {
			return o.getName();
		}
		return userId;
		
	}

}
