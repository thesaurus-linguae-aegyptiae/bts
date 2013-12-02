package org.bbaw.bts.ui.main.parts.userMan.support;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;

public class ProjectDBCollectionTreeFactory implements IObservableFactory
{
	private IEMFListProperty project_multi = EMFProperties
			.multiList(BtsmodelPackage.Literals.BTS_PROJECT__DB_COLLECTIONS);
	private IEMFListProperty coll_multi = EMFProperties
			.multiList(BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS);
	private IEMFListProperty roleMembers_multi = EMFProperties
			.multiList(BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN);

	public IObservable createObservable(final Object target)
	{
		if (target instanceof IObservableList)
		{
			return (IObservable) target;
		} else if (target instanceof BTSProject)
		{
			return project_multi.observe(target);
		} else if (target instanceof BTSProjectDBCollection)
		{
			return coll_multi.observe(target);
		} else if (target instanceof BTSDBCollectionRoleDesc)
		{
			return roleMembers_multi.observe(target);
		}

		return null;
	}
}