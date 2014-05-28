package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSAnnotationDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.CouchDbClient;

import com.google.gson.JsonObject;

@Creatable
public class BTSAnnotationDaoImpl extends CouchDBDao<BTSAnnotation, String> implements BTSAnnotationDao
{

	@Override
	public List<BTSAnnotation> list(String path, String objectState)
	{
		String view = DaoConstants.VIEW_ALL_BTSANNOTATIONS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			view = DaoConstants.VIEW_ALL_ACTIVE_BTSANNOTATIONS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			view = DaoConstants.VIEW_ALL_TERMINATED_BTSANNOTATIONS;
		}
		List<JsonObject> allDocs = connectionProvider.getDBClient(CouchDbClient.class, path)
.view(view)
				.includeDocs(true).query(JsonObject.class);
		ArrayList<BTSAnnotation> results = new ArrayList<BTSAnnotation>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(DaoConstants.ID_STRING).getAsString());
			if (!jo.get(DaoConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(getLocalDBURL() + path + jo.get(DaoConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				BTSAnnotation an =(BTSAnnotation) resource.getContents().get(0);
				checkForConflicts(an, path);
				results.add(an);
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(view, path);
		}
		return results;
	}

	@Override
	public boolean removeBTSAnnotation(BTSAnnotation annotation, String path)
	{

		// FIXME add logic and cache syncronisation
		super.remove(annotation, path);
		return true;
	}

}
