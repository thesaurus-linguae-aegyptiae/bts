package org.bbaw.bts.core.services.impl.services;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.core.services.IDService;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public abstract class GenericObjectServiceImpl<E extends BTSDBBaseObject, K extends Serializable> implements
		GenericObjectService<E, K>
{
	@Inject
	protected CorpusObjectDao corpusObjectDao;

	@Inject
	protected IDService idService;

	@Inject
	@Preference(value = "active_projects", nodePath = "org.bbaw.bts.app")
	protected String active_projects;

	@Inject
	@Preference(value = "main_project", nodePath = "org.bbaw.bts.app")
	protected String main_project;

	@Inject
	@Optional
	@Preference(value = "active_corpora", nodePath = "org.bbaw.bts.app")
	protected String active_corpora;

	@Inject
	@Optional
	@Preference(value = "main_corpus", nodePath = "org.bbaw.bts.app")
	protected String main_corpus;

	protected Class<? extends BTSDBBaseObject> daoType;

	@SuppressWarnings("unchecked")
	public GenericObjectServiceImpl()
	{
		daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		System.out.println("Construct GenericObjectServiceImpl");
	}

	@Override
	public abstract E createNew();

	public void setId(E entity)
	{
		if (entity instanceof BTSDBBaseObject)
		{
			((BTSDBBaseObject) entity).set_id(idService.createId());
			entity.setProject(main_project);
		}
		if (entity instanceof BTSCorpusObject)
		{
			((BTSCorpusObject) entity).setCorpusPrefix(main_corpus);
		}
	}

	public void setRevision(E entity)
	{
		if (entity instanceof BTSDBBaseObject)
		{
			// FIXME fill out!
		}
	}

	@Override
	public abstract boolean save(E entity);

	@Override
	public abstract void update(E entity);

	@Override
	public abstract void remove(E entity);

	@Override
	public abstract E find(K key);

	@Override
	public abstract List<E> list();

	private void loadChild(BTSCorpusObject parent, BTSRelation rel)
	{
		// BTSCorpusObject child = corpusObjectDao.find(rel.getObjectId());
		// parent.getChildren().add(child);

		// FIXME umbauen auf view und suche nach related objects

	}

	// @Inject
	// public void trackMainProject(@Preference(nodePath = "org.bbaw.bts.dao",
	// value = "main_project") String main_project)
	// {
	// this.main_project = main_project;
	// System.out.println("main_project changed " + main_project);
	// Preferences preferences =
	// ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.dao");
	// this.main_project = preferences.get("main_project", "aaew");
	// System.out.println(this.main_project);
	// }
	//
	// @Inject
	// public void trackActiveProjects(
	// @Preference(nodePath = "org.bbaw.bts.dao", value = "active_projects")
	// String active_projects)
	// {
	// this.active_projects = active_projects;
	//
	// }
	//
	// @Inject
	// @Optional
	// public void trackActiveCorpora(
	// @Preference(nodePath = "org.bbaw.bts.dao", value = "active_corpora")
	// String active_corpora)
	// {
	// this.active_corpora = active_corpora;
	//
	// }
	//
	// @Inject
	// @Optional
	// public void trackMainCorpus(@Preference(nodePath = "org.bbaw.bts.dao",
	// value = "main_corpus") String main_corpus)
	// {
	// this.main_corpus = main_corpus;
	//
	// }
}
