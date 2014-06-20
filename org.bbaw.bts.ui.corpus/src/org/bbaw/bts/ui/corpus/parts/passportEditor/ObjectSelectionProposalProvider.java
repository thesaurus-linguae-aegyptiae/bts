package org.bbaw.bts.ui.corpus.parts.passportEditor;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.core.corpus.controller.partController.PassportEditorPartController;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

public class ObjectSelectionProposalProvider implements
		IContentProposalProvider {

	private PassportEditorPartController passportController;
	private BTSConfig configItem;
	private List<BTSCorpusObject> list;
	private Comparator<IContentProposal> comparator;
	private BTSCorpusObject corpusObject;

	public ObjectSelectionProposalProvider(
			PassportEditorPartController passportEditorController,
			BTSConfig configItem,
			BTSCorpusObject corpusObject) {
		this.passportController = passportEditorController;
		this.setConfigItem(configItem);
		this.corpusObject = corpusObject;
	}

	@Override
	public IContentProposal[] getProposals(String contents, int position) {
		if (list == null || list.isEmpty()) {
			loadList();
		}
		List<ContentProposal> partialList = new Vector<ContentProposal>();
		if (list != null && !list.isEmpty()) {
			for (BTSCorpusObject o : list) {
				if (o.getName() != null && o.getName().startsWith(contents)) {
					ContentProposal p = new ContentProposal(o.getName());

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

	private void loadList() {
		Job job = new Job("loading") {


			@Override
			protected IStatus run(IProgressMonitor monitor) {
				list = passportController.getObjectProposalsFor(
						(BTSConfigItem) configItem, "", corpusObject);

				return Status.OK_STATUS;
			}
		};
		job.schedule();
		// job.g
	}

	public BTSConfig getConfigItem() {
		return configItem;
	}

	public void setConfigItem(BTSConfig configItem) {
		this.configItem = configItem;
	}

}
