 
package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.ui.commons.utils.OpenExternalBrowser;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;

public class OpenWebHelpHandler {
	
	
	@Execute
	public void execute() {
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE
				  .getNode("org.bbaw.bts.app");
		String url = preferences.get("webhelp_url", "http://aaew64.bbaw.de/bts/help");
		if (url != null)
		{
			OpenExternalBrowser.openURL(url);
		}
	}
		
}