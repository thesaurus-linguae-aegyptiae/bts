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

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;

public interface IPerspectiveSwitcherControl {
	
	/**
	 * Adds a shortcut for the referenced perspective to the visual perspective container.
	 * 
	 * @param perspective the perspective to add
	 */
	void addPerspectiveShortcut(MPerspective perspective);
	
	/**
	 * Removes the shortcut for the referenced perspective from the visual perspective container.
	 *  
	 * @param perspective the perspective to remove
	 */
	void removePerspectiveShortcut(MPerspective perspective);
	
	/**
	 * Updates the active selection in the visual perspective container.
	 * 
	 * @param perspective the active perspective
	 */
	void setSelectedElement(MPerspective perspective);
	
	/**
	 * Updates the given attribute for the perspective in the visual perspective container.
	 * Not all containers will support the same attributes.
	 *  
	 * @param perspective the perspective to update
	 * @param attributeName the attribute of the perspective to update
	 * @param newValue the updated value
	 */
	void updateAttributeFor(MPerspective perspective, String attributeName, Object newValue);
	
}
