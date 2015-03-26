package org.bbaw.bts.ui.commons.filter;

import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class THSViewerFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof BTSObjectTypeTreeNode)
		{
			BTSObjectTypeTreeNode tn = (BTSObjectTypeTreeNode) element;
			if (tn.getValue().equals(BTSCoreConstants.OBJECT_TYPES)
					|| tn.getValue().equals(BTSConstants.THS_ENTRY))
			{
				return true;
			}
			if (parentElement != null && parentElement instanceof BTSObjectTypeTreeNode)
			{
				tn = (BTSObjectTypeTreeNode) parentElement;
				if (tn.getValue().equals(BTSConstants.THS_ENTRY))
				{
					return true;
				}
				if (tn.eContainer() != null && tn.eContainer() instanceof BTSObjectTypeTreeNode)
				{
					tn = (BTSObjectTypeTreeNode) tn.eContainer();
					if (tn.getValue().equals(BTSConstants.THS_ENTRY))
					{
						return true;
					}
					if (tn.eContainer() != null && tn.eContainer() instanceof BTSObjectTypeTreeNode)
					{
						tn = (BTSObjectTypeTreeNode) tn.eContainer();
						if (tn.getValue().equals(BTSConstants.THS_ENTRY))
						{
							return true;
						}
					}
				}
			}

		}
		return false;
	}

}
