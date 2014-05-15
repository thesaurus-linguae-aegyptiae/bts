package org.bbaw.bts.ui.commons.converter;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.Viewer;

public class BTSStringToProjectConverter implements IConverter {

	private Viewer viewer;

	public BTSStringToProjectConverter(Viewer viewer) {
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
							&& ((TreeNodeWrapper) i).getObject() instanceof BTSProject
							&& fromObject
									.equals(((BTSProject) ((TreeNodeWrapper) i).getObject()).getPrefix())) {
						return i;
					}
				}
				BTSProject pro = BtsmodelFactory.eINSTANCE
						.createBTSProject();

				pro.setPrefix((String) fromObject);
				pro.setName((String) fromObject);
				TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
				child.setObject(pro);
				child.setLabel(pro.getName());
				child.setParent(((TreeNodeWrapper) viewer.getInput()));
				((TreeNodeWrapper) viewer.getInput()).getChildren().add(child);
				return child;
			}

		}
		return null;
	}
}
