 
package org.bbaw.bts.ui.egy.handlers;

import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class LoadLemmatEgyTextEditorHandler {
	@Execute
	public void execute(EventBroker eventBroker) {
		try {
			IEclipsePreferences node = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus.egy");
			boolean showHover = node.getBoolean("pref_transliteration_editor_active_hover_info", false);
		} catch (Exception e) {
		}
//		eventBroker.post(BTSUIConstants.EVENT_EGY_TEXT_EDITOR_LOAD_LEMMATA,
//				BTSUIConstants.EVENT_EGY_TEXT_EDITOR_LOAD_LEMMATA);
	}
}