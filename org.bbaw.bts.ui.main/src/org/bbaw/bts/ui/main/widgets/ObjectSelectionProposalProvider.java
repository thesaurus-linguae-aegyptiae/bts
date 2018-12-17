package org.bbaw.bts.ui.main.widgets;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

public class ObjectSelectionProposalProvider implements
		IContentProposalProvider {

	private GeneralBTSObjectController generalObjectController;
	private BTSConfig configItem;
	private List<BTSObject> list;
	private Comparator<IContentProposal> comparator;
	private BTSObject object;

	public ObjectSelectionProposalProvider(
			GeneralBTSObjectController passportEditorController,
			BTSConfig configItem,
			BTSObject object) {
		this.generalObjectController = passportEditorController;
		this.setConfigItem(configItem);
		this.object = object;
	}


	@Override
	public IContentProposal[] getProposals(String contents, int position) {
		if (contents.length() > 1) {
			list = loadList(contents);
		}

		List<ContentProposal> partialList = new Vector<ContentProposal>();
		// produce content assist proposal labels
		if (list != null && !list.isEmpty()) {
			for (BTSObject o : list) {
				if (o.getName() != null) {
					String label = o.getName();
					String description = o.getName();
					description += "\n\n" + o.get_id();
					description += "\nLocation: " + o.getDBCollectionKey();
					if (o.getType() != null) {
						label += " (" + o.getType() + ")";
						description += "\nType: " + o.getType();
					}
					if (!o.getRevisionState().equals(BTSConstants.OBJECT_REVISION_STATE_PUBLISHED)) {
						label += " (‼)";
						description += "\n\n(‼) - revision state is " + o.getRevisionState();
					}
					//⚠
					
					ContentProposal p = new ContentProposal(o.get_id(), label, description);
					partialList.add(p);
				}
			}

			Collections.sort(partialList, getComparator());
		}
		return partialList.toArray(new IContentProposal[partialList.size()]);
	}

	private Comparator<IContentProposal> getComparator() {
		if (comparator == null) {
			comparator = new Comparator<IContentProposal>() {

				@Override
				public int compare(IContentProposal p1, IContentProposal p2) {
					if (p1 != null && p2 != null) {
						if (p1.getLabel() != null) {
							return p1.getLabel().compareTo(p2.getLabel());
						}
					}
					return 0;
				}

			};
		}
		return comparator;
	}

	private List<BTSObject> loadList(final String contents) {
		return generalObjectController.getObjectProposalsFor(
				(BTSConfigItem) configItem,
				contents,
				object,
				null);
	}

	public BTSConfig getConfigItem() {
		return configItem;
	}

	public void setConfigItem(BTSConfig configItem) {
		this.configItem = configItem;
	}

}
