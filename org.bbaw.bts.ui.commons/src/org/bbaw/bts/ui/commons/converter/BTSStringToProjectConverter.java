/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.ui.commons.converter;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.Viewer;

/**
 * The Class BTSStringToProjectConverter implements Converter and converts String-objects to Project-objects.
 * 
 *  In the constructor this converter expects a reference to the viewer which holds the BTSProjects amongst which the target BTSProject
 * should be selected.
 */
public class BTSStringToProjectConverter implements IConverter {

	/** The viewer. */
	private Viewer viewer;

	/**
	 * Instantiates a new BTS string to project converter.
	 *
	 * @param viewer the viewer
	 */
	public BTSStringToProjectConverter(Viewer viewer) {
		Assert.isNotNull(viewer);
		this.viewer = viewer;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.conversion.IConverter#getFromType()
	 */
	@Override
	public Object getFromType() {
		return String.class;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.conversion.IConverter#getToType()
	 */
	@Override
	public Object getToType() {
		return TreeNodeWrapper.class;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
	 */
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
