package org.bbaw.bts.ui.corpus.parts.passportEditor;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

public class PassportEntryContentProposalProvider implements
		IContentProposalProvider {

	private List<BTSPassportEntry> list;
	private Comparator<? super IContentProposal> comparator;

	public PassportEntryContentProposalProvider(List<BTSPassportEntry> list) {
		this.list = list;
	}

	@Override
	public IContentProposal[] getProposals(String contents, int position) {
		List<IContentProposal> partialList = new Vector<IContentProposal>();

		if (list != null && !list.isEmpty()) {
			for (BTSPassportEntry e : list) {
				if (e.getValue() != null && e.getValue().startsWith(contents)) {
					ContentProposal p = new ContentProposal(e.getValue());
					partialList.add(p);
				}
			}

			Collections.sort(partialList, getComparator());
		}
		return partialList.toArray(new IContentProposal[partialList.size()]);
	}

	private Comparator<? super IContentProposal> getComparator() {
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

}
