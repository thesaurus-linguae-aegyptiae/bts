package org.bbaw.bts.core.controller.generalController;

public interface ISplashScreenController
{
	/**
	 * Tell the Service where to find the Splash-Image
	 * 
	 * @param pluginId
	 *            ID of teh Plugin where the Image resides
	 */
	public void setSplashPluginId(String pluginId);

	/**
	 * Tell the service the path and name of the Splash-Image
	 * 
	 * @param path
	 *            Path and filename of the Spalsh-Image
	 */
	public void setSplashImagePath(String path);

	/**
	 * Open the Splash-Screen
	 */
	public void open();

	/**
	 * Colse the Splash Screen
	 */
	public void close();

	/**
	 * Set the displayed message on the Splash-Screen
	 * 
	 * @param message
	 *            Text-Message to be displayed.
	 */
	public void setMessage(String message);
}