package org.bbaw.bts.ui.main.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;

import com.opcoach.e4.preferences.IPreferenceStoreProvider;
import com.opcoach.e4.preferences.ScopedPreferenceStore;

public class BTSPStoreProvider implements IPreferenceStoreProvider
{

	public BTSPStoreProvider()
	{
	}

	@Override
	public IPreferenceStore getPreferenceStore()
	{
		System.out.println("Use my preference Store for this plugin");
		return new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.bbaw.bts.app");
	}

}
