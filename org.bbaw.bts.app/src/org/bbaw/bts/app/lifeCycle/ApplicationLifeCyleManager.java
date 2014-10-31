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
