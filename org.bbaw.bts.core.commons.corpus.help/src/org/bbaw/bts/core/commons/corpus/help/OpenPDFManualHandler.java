 
package org.bbaw.bts.core.commons.corpus.help;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.bbaw.bts.ui.commons.utils.OpenExternalBrowser;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.osgi.framework.Bundle;

public class OpenPDFManualHandler {
	@Execute
	public void execute() {
		
		Bundle b = Platform.getBundle("org.bbaw.bts.core.commons.corpus.help");
		URL url = b.getEntry("resources/BTS.pdf");
		File file = null;
		try {
			file = new File(FileLocator.resolve(url).toURI());
			OpenExternalBrowser.openURL(file.getAbsolutePath());
		}catch (URISyntaxException | IOException e) {
			e.printStackTrace();
			String errMsg = "Could not open document. "+(file != null ? file.getAbsolutePath() : "");
			MessageDialog md = new MessageDialog(null, "Error", null, errMsg + "\n" + e.toString(),
					MessageDialog.ERROR, new String[]{"OK"}, 0);
			md.open();
		}

	}
		
}