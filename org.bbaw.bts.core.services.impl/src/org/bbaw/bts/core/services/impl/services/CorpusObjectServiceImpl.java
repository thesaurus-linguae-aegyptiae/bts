package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSImage;
import org.bbaw.bts.btsmodel.BTSListEntry;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.services.BTSAnnotationService;
import org.bbaw.bts.core.services.BTSImageService;
import org.bbaw.bts.core.services.BTSListEntryService;
import org.bbaw.bts.core.services.BTSTCObjectService;
import org.bbaw.bts.core.services.BTSTextCorpusService;
import org.bbaw.bts.core.services.BTSTextService;
import org.bbaw.bts.core.services.CorpusObjectService;
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
			imageService.save((BTSImage) entity);
		} else if (entity instanceof BTSAnnotation)
		{
			annotationService.save((BTSAnnotation) entity);
		} else if (entity instanceof BTSListEntry)
		{
			listEntryService.save((BTSListEntry) entity);
		} else if (entity instanceof BTSTCObject)
		{
			tcObjectService.save((BTSTCObject) entity);
		} else if (entity instanceof BTSTextCorpus)
		{
			textCorpusService.save((BTSTextCorpus) entity);
		} else if (entity instanceof BTSText)
		{
			textService.save((BTSText) entity);
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

	}

	@Override
	public BTSCorpusObject find(String key)
	{
		return corpusObjectDao.find(key);
	}

	@Override
	public List<BTSCorpusObject> list()
	{
		return corpusObjectDao.list();
	}

	public List<BTSCorpusObject> getRootBTSCorpusObjects()
	{
		return corpusObjectDao.getRootBTSCorpusObjects();
	}

}
