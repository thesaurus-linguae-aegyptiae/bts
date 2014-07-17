package org.bbaw.bts.core.controller.impl.dialogControllers;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.controller.dialogControllers.CompareObjectsController;
import org.bbaw.bts.core.services.GeneralBTSObjectService;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.emf.ecore.EClass;

public class CompareObjectsControllerImpl implements CompareObjectsController {

	
	@Inject
	private GeneralBTSObjectService objectService;

	@Override
	public List<BTSDBBaseObject> listConflictingVersions(BTSDBBaseObject object) {
		List<String> conflicts = object.getConflictingRevs();
		List<BTSDBBaseObject> conflictObjects = new Vector<BTSDBBaseObject>();
		for (String rev : conflicts)
		{
			BTSDBBaseObject o = null;
			try {
				String className = getSuperTypeName(object);
				o = objectService.find(object.get_id(), object.getDBCollectionKey(), className, rev);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (o != null)
			{
				conflictObjects.add(o);
			}
		}
		return conflictObjects;
	}

	private String getSuperTypeName(BTSDBBaseObject object) {
		return object.getClass().getSuperclass().getName();
	}

	@Override
	public boolean removeRevision(BTSDBBaseObject object, String revision) {
		return objectService.removeRevision(object, revision);
	}

	@Override
	public void reloadConflicts(BTSDBBaseObject object) {
		objectService.reloadConflicts(object);
		
	}

	@Override
	public List<BTSDBBaseObject> listAvailableVersions(BTSDBBaseObject object,
			boolean fetchFromRemote) {
		List<DBRevision> revisions = objectService.listAvailableRevisions(object, fetchFromRemote);
		List<BTSDBBaseObject> availableRevisions = new Vector<BTSDBBaseObject>();
		for (DBRevision rev : revisions)
		{
			BTSDBBaseObject o = null;
			switch (rev.getLocation())
			{
				case DBRevision.LOCAL:
				{
					try {
						o = objectService.find(object.get_id(), object.getDBCollectionKey(), rev.getRevision(), getSuperTypeName(object));
						if (o != null)
						{
							availableRevisions.add(o);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
				case DBRevision.REMOTE:
				{
					try {
						o = objectService.find(object.get_id(), object.getDBCollectionKey(), rev.getRevision(), getSuperTypeName(object), true);
						if (o != null)
						{
							availableRevisions.add(o);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
			
		}
		return availableRevisions;
	}

}
