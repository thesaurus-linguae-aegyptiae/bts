package org.bbaw.bts.ui.commons.corpus.converter;

import java.util.List;

import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.Viewer;

public class BTSStringToTextCorpusConverter implements IConverter {

	private Viewer viewer;

	public BTSStringToTextCorpusConverter(Viewer viewer) {
		Assert.isNotNull(viewer);
		this.viewer = viewer;
	}

	@Override
	public Object getFromType() {
		return String.class;
	}

	@Override
	public Object getToType() {
		return TreeNodeWrapper.class;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof String) {
			Object input = viewer.getInput();
			if (input instanceof TreeNodeWrapper) {
				for (Object i : ((TreeNodeWrapper) input).getChildren()) {
					if (i instanceof TreeNodeWrapper
							&& ((TreeNodeWrapper) i).getObject() instanceof BTSTextCorpus
							&& fromObject
									.equals(((BTSTextCorpus) ((TreeNodeWrapper) i).getObject()).getCorpusPrefix())) {
						return i;
					}
				}
				BTSTextCorpus corpus = BtsCorpusModelFactory.eINSTANCE
						.createBTSTextCorpus();

				corpus.setCorpusPrefix((String) fromObject);
				corpus.setName((String) fromObject);
				TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
				child.setObject(corpus);
				child.setLabel(corpus.getName());
				child.setParent(((TreeNodeWrapper) viewer.getInput()));
				((TreeNodeWrapper) viewer.getInput()).getChildren().add(child);
				return child;
			}

		}
		return null;
	}
}
