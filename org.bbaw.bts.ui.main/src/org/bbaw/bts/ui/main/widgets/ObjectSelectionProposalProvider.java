package org.bbaw.bts.ui.main.widgets;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

public class ObjectSelectionProposalProvider implements
		IContentProposalProvider {

	private GeneralBTSObjectController gernalObjectController;
	private BTSConfig configItem;
	private List<BTSObject> list;
	private Comparator<IContentProposal> comparator;
	private BTSObject object;

	public ObjectSelectionProposalProvider(
			GeneralBTSObjectController passportEditorController,
			BTSConfig configItem,
			BTSObject object) {
		this.gernalObjectController = passportEditorController;
		this.setConfigItem(configItem);
		this.object = object;
	}

	@Override
	public IContentProposal[] getProposals(String contents, int position) {
		if (contents.length() > 1) {
			list = loadList(contents);
		}

		List<ContentProposal> partialList = new Vector<ContentProposal>();
		if (list != null && !list.isEmpty()) {
			for (BTSObject o : list) {
				if (o.getName() != null && o.getName().startsWith(contents)
						|| o.get_id().equals(contents)) {
					String desc = o.getName() + "\n" + o.get_id() + "\n" + o.getDBCollectionKey();
					ContentProposal p = new ContentProposal(o.get_id(), o.getName(), desc);
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

		return gernalObjectController.getObjectProposalsFor(
				(BTSConfigItem) configItem, contents, object, null);

	}

	public BTSConfig getConfigItem() {
		return configItem;
	}

	public void setConfigItem(BTSConfig configItem) {
		this.configItem = configItem;
	}

}
