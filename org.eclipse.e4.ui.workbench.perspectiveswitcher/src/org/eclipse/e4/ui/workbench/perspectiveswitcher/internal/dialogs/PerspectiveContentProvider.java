/*******************************************************************************
 * Copyright (c) 2012 Joseph Carroll and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Joseph Carroll <jdsalingerjr@gmail.com> - initial API and implementation
 ******************************************************************************/ 
package org.eclipse.e4.ui.workbench.perspectiveswitcher.internal.dialogs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

@Creatable
public class PerspectiveContentProvider implements IStructuredContentProvider {
	@Override
    public void dispose() {
        //no-op
    }

	@Override
    public Object[] getElements(Object element) {
		List<MPerspective> perspectives = new ArrayList<MPerspective>(5);
		
		if (element instanceof MWindow)
			addElementsFrom((MWindow) element, perspectives);				
		
        return perspectives.toArray();
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        //no-op
    }
    
    private void addElementsFrom(MWindow window, List<MPerspective> perspectives) {
		List<MWindowElement> windowElements = window.getChildren();
		for (Iterator<MWindowElement> i = windowElements.iterator(); i.hasNext();) {
			MWindowElement _elm = i.next();

			if (_elm instanceof MPerspectiveStack)
				perspectives.addAll(((MPerspectiveStack) _elm).getChildren());
			else if (_elm instanceof MPartSashContainer)
				addChildPerspectives((MPartSashContainer) _elm, perspectives);
		}
    }
    
    private void addChildPerspectives(MPartSashContainer partContainer, List<MPerspective> perspectives) {
		List<MPartSashContainerElement> containerElements = partContainer.getChildren();
		for (Iterator<MPartSashContainerElement> i = containerElements.iterator(); i.hasNext();) {
			MPartSashContainerElement _elm = i.next();
			
			if (_elm instanceof MPartSashContainer)
				addChildPerspectives((MPartSashContainer) _elm, perspectives);
			if (_elm instanceof MPerspectiveStack)
				perspectives.addAll(((MPerspectiveStack) _elm).getChildren());
		}   	
    }
}
