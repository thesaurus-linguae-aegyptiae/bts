package org.bbaw.bts.commons.fsaccess.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin
{

	// The plug-in ID
	/** id of plaugin. */
	public static final String PLUGIN_ID = "org.bbaw.pdr.ae.common.fsaccess"; //$NON-NLS-1$

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault()
	{
		return plugin;
	}



	/** shared instance. */
	private static Activator plugin;

	private static int _projectID = -1;

	/**
	 * The constructor.
	 */
	public Activator()
	{
	}


	/**
	 * Start method of RCP application.
	 * 
	 * @param context
	 *            context.
	 * @throws Exception
	 *             exception.
	 */
	@Override
	public final void start(final BundleContext context) throws Exception
	{
		super.start(context);
		plugin = this;
		//			IStatus status = new Status(IStatus.ERROR,Activator.PLUGIN_ID, "AE_HOME: " + AE_HOME);
		//			ILog iLogger = org.bbaw.pdr.ae.view.Activator.getILogger();
		//			iLogger.log(status);
	}

	/**
	 * Stop method of application.
	 * 
	 * @param context
	 *            context.
	 * @throws Exception
	 *             exception.
	 * */
	@Override
	public final void stop(final BundleContext context) throws Exception
	{
		plugin = null;
		super.stop(context);
	}

	public static void setProjectID(int projectID)
	{
		_projectID = projectID;

	}

	public static int getProjectID()
	{
		return _projectID;
	}

	public static String getBTSHome()
	{
		return null;
	}

}
