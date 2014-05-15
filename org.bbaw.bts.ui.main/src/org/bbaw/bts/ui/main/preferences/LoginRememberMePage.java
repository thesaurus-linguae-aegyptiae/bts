package org.bbaw.bts.ui.main.preferences;

import java.io.IOException;

import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.osgi.framework.BundleContext;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

public class LoginRememberMePage extends FieldEditorPreferencePage {

	private Button btnCheckButton;
	private Logger logger;
	private boolean loaded;

	/**
	 * Create the preference page.
	 */
	public LoginRememberMePage() {
		super(FLAT);
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		// Create the field editors
		IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.bbaw.bts.app");
		

//		addField(new BooleanFieldEditor("remember_me", "Remember my login credentials on startup", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		Composite container = (Composite) this.getControl();
		container.setLayout(new GridLayout(1, false));
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Login Preferences");
		
		btnCheckButton = new Button(container, SWT.CHECK);
		btnCheckButton.setText("Remember my login credentials on startup");
		
		init(null);
		loaded = true;
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
//		BundleContext bundleContext = Platform.getBundle("org.bbaw.bts.ui.main").getBundleContext();
		IEclipseContext context = StaticAccessController.getContext();
		logger = context.get(Logger.class);
		if (isRemembered())
		{
			btnCheckButton.setSelection(true);
		}
		else
		{
			btnCheckButton.setSelection(false);
		}
	}

	private boolean isRemembered() {
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences rememberedMe = secPrefs.node("rememberedMe");
		
		String rememberedUsername = null;
		String rememberedPass = null;
		try {
			rememberedUsername = rememberedMe.get("rememberedUsername", null);
			rememberedPass  = rememberedMe.get("remembered", null);
		} catch (StorageException e1) {
			e1.printStackTrace();
		}
		if (rememberedUsername != null
				&& !"".equals(rememberedUsername)
				&& rememberedPass != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public boolean performOk() {
		if (!loaded)
		{
			return super.performOk();
		}
		if(btnCheckButton.getSelection())
		{
			if (!isRemembered())
			{
				setRememberUser(true);
			}
		}
		else
		{
			if (isRemembered())
			{
				setRememberUser(false);
			}
		}
		return super.performOk();
	}

	private void setRememberUser(boolean remember) {
		String rememberedUsername = null;
		String rememberedPass = null;
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences rememberedMe = secPrefs.node("rememberedMe");

		
		if (remember)
		{
			ISecurePreferences auth = secPrefs.node("auth");
			try {
				rememberedUsername = auth.get("username", null);
				rememberedPass  = auth.get("password", null);
			} catch (StorageException e1) {
				e1.printStackTrace();
			}
			try {
				rememberedMe.put("rememberedUsername", rememberedUsername, false);
				rememberedMe.put("remembered", rememberedPass, true);
				rememberedMe.flush();
//				logger.info("Remember me set.");
			} catch (StorageException e) {
				e.printStackTrace();
//				logger.error(e);
			} catch (IOException e) {
				e.printStackTrace();
//				logger.error(e);
			}
		}
		else
		{
			try {
				rememberedMe.remove("rememberedUsername");
				rememberedMe.remove("remembered");
				rememberedMe.flush();
//				logger.info("Remember me removed.");
			} catch (IOException e) {
				e.printStackTrace();
				logger.error(e);
			}
		}
	}
}
