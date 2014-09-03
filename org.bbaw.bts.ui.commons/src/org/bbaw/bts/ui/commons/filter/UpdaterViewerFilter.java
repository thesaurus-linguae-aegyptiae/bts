package org.bbaw.bts.ui.commons.filter;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;

public class UpdaterViewerFilter extends AbstractObjectByListEntryFilter{
	
	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;

	@Override
	public boolean select(Object object) {
		if (object instanceof TreeNodeWrapper)
		{
			if (((TreeNodeWrapper) object).getObject() != null)
			{
				object = ((TreeNodeWrapper) object).getObject();
			}
			else
			{
				return true;
			}
		}
		if (object instanceof AdministrativDataObject)
		{
			AdministrativDataObject adminObject = (AdministrativDataObject) object;
			for (Object o : getObjects())
			{
				if (o instanceof BTSUser)
				{
					BTSUser user = (BTSUser) o;
					return evaluationController.userMayEditObject(user, adminObject);
				}
			}
		}
		return false;
	}

}
