package org.bbaw.bts.ui.main.preferences;

import org.bbaw.bts.commons.BTSPluginIDs;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

public class DefaultValuesInitializer extends AbstractPreferenceInitializer
{

	public DefaultValuesInitializer()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences()
	{
		IPreferenceStore store = new ScopedPreferenceStore(ConfigurationScope.INSTANCE, "org.bbaw.bts.app");	
		
		System.out.println("Enter in default Preference Initializer");
		IEclipsePreferences defaultPrefs = DefaultScope.INSTANCE.getNode("org.bbaw.bts.app");
		IEclipsePreferences prefs = DefaultScope.INSTANCE.getNode("org.bbaw.bts.app");
	
		store.setDefault(BTSPluginIDs.PREF_ACTIVE_CORPORA, defaultPrefs.get(BTSPluginIDs.PREF_ACTIVE_CORPORA, null));
		prefs.put(BTSPluginIDs.PREF_ACTIVE_CORPORA, defaultPrefs.get(BTSPluginIDs.PREF_ACTIVE_CORPORA, null));
	
		store.setDefault(BTSPluginIDs.PREF_MAIN_CORPUS, defaultPrefs.get(BTSPluginIDs.PREF_MAIN_CORPUS, null));
		prefs.put(BTSPluginIDs.PREF_ACTIVE_CORPORA, defaultPrefs.get(BTSPluginIDs.PREF_ACTIVE_CORPORA, null));


		
		
	}

}
