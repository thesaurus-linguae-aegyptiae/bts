package org.bbaw.bts.ui.main.handlers;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;
import org.osgi.service.prefs.BackingStoreException;

public class TESTER
{
	@Execute
	public void execute(@Preference(nodePath = "org.bbaw.bts.dao") IEclipsePreferences prefs)
	{
		// More stuff...
		prefs.put("activeProjects", "aaew|leipzig|test");
		try
		{
			prefs.flush();
		} catch (BackingStoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@CanExecute
	public boolean canExecute()
	{
		// TODO Your code goes here
		return true;
	}

}