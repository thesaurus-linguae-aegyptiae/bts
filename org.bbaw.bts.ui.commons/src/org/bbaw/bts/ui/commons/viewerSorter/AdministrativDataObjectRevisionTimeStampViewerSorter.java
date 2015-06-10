package org.bbaw.bts.ui.commons.viewerSorter;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class AdministrativDataObjectRevisionTimeStampViewerSorter extends ViewerSorter {
	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2)
	{
		if (e1 != null && e1 instanceof AdministrativDataObject && e2 != null && e2 instanceof AdministrativDataObject)
		{
			AdministrativDataObject b1 = (AdministrativDataObject) e1;
			AdministrativDataObject b2 = (AdministrativDataObject) e2;
			BTSRevision r1 = b1.getLastRevision();
			BTSRevision r2 = b2.getLastRevision();
			if (r1 != null && r2 != null)
			{
				return r1.getRef() - r2.getRef();
			}
		}
		return 0;
		
	}

}
