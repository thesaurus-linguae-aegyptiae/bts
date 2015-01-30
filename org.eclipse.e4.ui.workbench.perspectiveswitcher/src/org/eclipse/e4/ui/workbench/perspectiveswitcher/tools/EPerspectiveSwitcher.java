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

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

@Creatable
public class EPerspectiveSwitcher {
	
	@Inject
	EModelService modelService;
	
	@Inject
	IEventBroker eventBroker;
	
	@Inject 
	MWindow window;
	
	IPerspectiveSwitcherControl control;
	
	private EventHandler labelHandler = new EventHandler() {
		
		@Override
		public void handleEvent(Event event) {
			if (window == null)
				return;

			MUIElement changedElement = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
			if (!(changedElement instanceof MPerspective))
				return;

			MPerspective perspective = (MPerspective) changedElement;
			if (!perspective.isToBeRendered())
				return;
			
			MWindow perspectiveWindow = perspective.getContext().get(MWindow.class); 
			if (window != perspectiveWindow)
				return;
						
			String attName = (String) event.getProperty(UIEvents.EventTags.ATTNAME);
			Object newValue = event.getProperty(UIEvents.EventTags.NEW_VALUE);
			
			control.updateAttributeFor(perspective, attName, newValue);
		}
	};
	
	private EventHandler toBeRenderedHandler = new EventHandler() {
		
		@Override
		public void handleEvent(Event event) {
			if (window == null)
				return;
			
			MUIElement changedElement = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
			if (!(changedElement instanceof MPerspective))
				return;

			MPerspective perspective = (MPerspective) changedElement;
			if (!perspective.getParent().isToBeRendered())
				return;
			 
			MWindow perspectiveWindow = perspective.getContext().get(MWindow.class);
			if (window != perspectiveWindow)
				return;

			if (perspective.isToBeRendered())
				control.addPerspectiveShortcut(perspective);
			else
				control.removePerspectiveShortcut(perspective);
		}
	};
	
	private EventHandler selectionHandler = new EventHandler() {
		
		@Override
		public void handleEvent(Event event) {
			if (window == null)
				return;

			MUIElement changedElement = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
			if (!(changedElement instanceof MPerspectiveStack))
				return;

			MPerspectiveStack perspectiveStack = (MPerspectiveStack) changedElement;
			if (!perspectiveStack.isToBeRendered())
				return;
				
			MWindow stackWindow = modelService.getContainingContext(perspectiveStack)
					.get(MWindow.class);
			if (window != stackWindow)
				return;

			MPerspective selectedElement = perspectiveStack.getSelectedElement();
			control.setSelectedElement(selectedElement);
		}
	};
	
	private EventHandler childrenHandler = new EventHandler() {
		
		@Override
		public void handleEvent(Event event) {
			if (window == null)
				return;

			MUIElement changedElement = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
			if (!(changedElement instanceof MPerspectiveStack))
				return;			  
			
			MPerspectiveStack perspectiveStack = (MPerspectiveStack) changedElement;
			if (!perspectiveStack.isToBeRendered())
				return;
			
			MWindow stackWindow = modelService.getContainingContext(perspectiveStack)
					.get(MWindow.class);
			if (window != stackWindow)
				return;
			
			if (UIEvents.isADD(event)) {
				for (Object o : UIEvents.asIterable(event, UIEvents.EventTags.NEW_VALUE)) {
					MPerspective added = (MPerspective) o;
					// Adding invisible elements is a NO-OP
					if (!added.isToBeRendered())
						continue;

					control.addPerspectiveShortcut(added);
				}
			} else if (UIEvents.isREMOVE(event)) {
				for (Object o : UIEvents.asIterable(event, UIEvents.EventTags.OLD_VALUE)) {
					MPerspective removed = (MPerspective) o;
					// Removing invisible elements is a NO-OP
					if (!removed.isToBeRendered())
						continue;
					
					control.removePerspectiveShortcut(removed);
				}
			}
		}
	};

	void init() {
		// Handles the UI element changes (label, tooltip, icon)
		eventBroker.subscribe(UIEvents.UILabel.TOPIC_ALL, labelHandler);
		
		// Handles the model's list of renderable elements
		eventBroker.subscribe(UIEvents.UIElement.TOPIC_TOBERENDERED, toBeRenderedHandler);
		
		// Handles the changes in the selected element 
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_SELECTEDELEMENT, selectionHandler);
		
		// Handles when whole perspective stacks are added and removed
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_CHILDREN, childrenHandler);
	}
	
	@PreDestroy
	void cleanUp() {
		eventBroker.unsubscribe(labelHandler);
		eventBroker.unsubscribe(toBeRenderedHandler);
		eventBroker.unsubscribe(selectionHandler);
		eventBroker.unsubscribe(childrenHandler);
	}
	
	/**
	 * Sets the UI control associated with the perspective switcher.  The perspective switcher 
	 * subscribes to topics only once a non-null ui control is passed and unsubscribes from all
	 * topics if a null value is received.
	 * 
	 * @param uiControl the visual representation of the perspective switcher
	 */
	public void setControlProvider(IPerspectiveSwitcherControl uiControl) {
		if (uiControl == null) {
			control = null;
			cleanUp();
		} else {
			if (control == null)
				init();
			control = uiControl;
		}
	}
	
}
