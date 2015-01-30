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
package org.eclipse.e4.ui.workbench.perspectiveswitcher.tools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

public class E4Util {
	
	@SuppressWarnings("unchecked")
	public static <T extends MUIElement> List<T> getMatchingChildren(MElementContainer<?> container, Class<T> type) {
		List<T> matchingChildren = new ArrayList<T>();
		
		for (Object child : container.getChildren()) {
			if (type.isInstance(child))
				matchingChildren.add((T) child);
		}		
		
		return matchingChildren;
	}
	
	/**
	 * Recursively sets the active selection to the element until it reaches the 
	 * containing window.
	 * 
	 * @param element the new selected element
	 */
	public static void setWindowSelectedElement(MUIElement element) {
		MElementContainer<MUIElement> parent = element.getParent();
		parent.setSelectedElement(element);
		if (!((MUIElement) parent instanceof MWindow))
			setWindowSelectedElement(parent);
	}
	
	/**
	 * Recursively checks if the active selection of the parent is the <tt>element</tt>, 
	 * until the containing window element is reached. Returns true if the selected
	 * element is the parameter in the window and false otherwise.
	 *  
	 * @param element the model element to check
	 * @return true if the model element is the selected element 
	 * 			false otherwise
	 */
	public static boolean isSelectedElement(MUIElement element) {
		MElementContainer<MUIElement> parent = element.getParent();
		if (parent.getSelectedElement() == element) {
			if (!((MUIElement) parent instanceof MWindow))
				return isSelectedElement(parent);
			else
				return true;
		}	
		
		return false;
	}

}
