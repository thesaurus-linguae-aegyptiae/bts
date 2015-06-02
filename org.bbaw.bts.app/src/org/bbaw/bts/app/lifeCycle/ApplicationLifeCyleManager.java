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
package org.bbaw.bts.app.lifeCycle;

import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.equinox.app.IApplicationContext;

public class ApplicationLifeCyleManager
{

	@PostContextCreate
	void managePostContextCreate(final IEclipseContext context, BTSProjectService projectService,
			IApplicationContext appContext, Logger logger, ApplicationStartupController applicationStartupController) 
//			@Optional MWindow window,
//			IEventBroker eventBroker)
	{
//		if (window != null)
//		{
//		try {
//			setWindowImage(window);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//		else
//		{
//			// The should be a better way to close the Splash
//			eventBroker.subscribe(UIEvents.UILifeCycle.ACTIVATE,
//					new EventHandler() {
//						@Override
//						public void handleEvent(Event event) {
//							MWindow w = context.get(MWindow.class);
//							if (w == null) return;
//							try {
//								setWindowImage(w);
//							} catch (Exception e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//						}
//			});
//		}
		logger.info("ApplicationStartupControllerImpl.applicationStartup");
		applicationStartupController.applicationStartup(context, projectService, appContext);

	}

//	private void setWindowImage(MWindow window) {
//		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
//		URL url = FileLocator.find(bundle, 
//		  new Path("icons/bts32.bmp"), null);
//		window.setIconURI(url.toString());
//		
//	}
}
