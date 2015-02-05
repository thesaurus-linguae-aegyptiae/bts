package org.bbaw.bts.ui.main.toolbar;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class UserToolcontrol {

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private UISynchronize sync;
	
	@Inject 
	private IStylingEngine engine;
	
	@Inject
	private IEclipseContext context;

	private BTSUser authenticatedUser;

	private String userContextRole;

	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			factory);
	private Label userLabel;

	private Composite composite;

	private Label mayEditLabel;

	private Label roleLabel;

	private Boolean userMayEdit;

	private Boolean userMayTranscribe;

	@PostConstruct
	public void postConstruct(Composite composite) {
		this.composite = composite;
		composite.setLayout(new GridLayout(6, false));
		engine.setClassname(composite, "MToolBar");
		Label l = new Label(composite, SWT.None);
		l.setImage(labelProvider.getImage(authenticatedUser));
		l.setLayoutData(new GridData());
		l.pack();

		userLabel = new Label(composite, SWT.None);
		userLabel.setLayoutData(new GridData());
		((GridData) userLabel.getLayoutData()).horizontalSpan = 2;
		if(authenticatedUser == null)
		{
			Object o =  context.get(BTSCoreConstants.AUTHENTICATED_USER);
			if (o != null && o instanceof BTSUser)
			{
				authenticatedUser = (BTSUser) o;
			}
		}
		if (authenticatedUser != null) {
			userLabel.setText(labelProvider.getText(authenticatedUser));

		} else {
			userLabel.setText("No User logged in");
		}
		userLabel.pack();

		mayEditLabel = new Label(composite, SWT.None);
		mayEditLabel.setLayoutData(new GridData());
		((GridData) mayEditLabel.getLayoutData()).horizontalSpan = 1;
		if (userMayEdit != null && userMayEdit.booleanValue()) {
			mayEditLabel.setImage(resourceProvider.getImage(
					Display.getDefault(), BTSResourceProvider.IMG_EDIT));
		} else if (userMayTranscribe != null
				&& userMayTranscribe.booleanValue()) {
			mayEditLabel
					.setImage(resourceProvider.getImage(Display.getDefault(),
							BTSResourceProvider.IMG_HIEROGLYPHETW));
		} else {
			mayEditLabel
					.setImage(resourceProvider.getImage(Display.getDefault(),
							BTSResourceProvider.IMG_EDIT_DISABLED));
		}
		mayEditLabel.pack();

		Label l2 = new Label(composite, SWT.None);
		l2.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_USERROLE));
		l2.setLayoutData(new GridData());
		l2.pack();

		roleLabel = new Label(composite, SWT.None);
		roleLabel.setLayoutData(new GridData());
		((GridData) roleLabel.getLayoutData()).horizontalSpan = 1;
		if (userContextRole != null) {
			roleLabel.setText(userContextRole + "      ");
		} else {
			roleLabel.setText("No Role"  + "      ");
		}
		roleLabel.pack();

		composite.layout();
		composite.pack();
	}

	/**
	 * @param authenticatedUser
	 *            the authenticatedUser to set
	 */
	@Inject
	@Optional
	public void setAuthenticatedUser(
			@Named(BTSCoreConstants.AUTHENTICATED_USER) BTSUser authenticatedUser) {
		if (authenticatedUser != null
				&& !authenticatedUser.equals(this.authenticatedUser)) {
			this.authenticatedUser = authenticatedUser;
			if (userLabel != null) {
				if (authenticatedUser != null) {
					userLabel.setText(labelProvider.getText(authenticatedUser));
				}
				userLabel.pack();
				composite.layout();
				composite.pack();
			}
		}
	}

	/**
	 * @param userContextRole
	 *            the userContextRole to set
	 */
	@Inject
	@Optional
	public void setUserContextRole(
			@Named(BTSCoreConstants.CORE_EXPRESSION_USER_CONTEXT_ROLE) final String userContextRole) {
		if (userContextRole != null
				&& !userContextRole.equals(this.userContextRole)) {
			this.userContextRole = userContextRole;
			sync.asyncExec(new Runnable() {

				@Override
				public void run() {
					if (roleLabel != null) {
						if (userContextRole != null) {
							roleLabel.setText(userContextRole);
						}

						roleLabel.pack();
						composite.layout();
						composite.pack();
					}
				}
			});
		}
	}

	/**
	 * @param userMayEdit
	 *            the userMayEdit to set
	 */
	@Inject
	@Optional
	public void setUserMayEdit(
			@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) final Boolean userMayEdit) {
		if (userMayEdit != null && userMayEdit != this.userMayEdit) {
			this.userMayEdit = userMayEdit;
			sync.asyncExec(new Runnable() {

				@Override
				public void run() {
					if (mayEditLabel != null) {
						if (userMayEdit != null && userMayEdit.booleanValue()) {
							mayEditLabel.setImage(resourceProvider.getImage(
									Display.getDefault(),
									BTSResourceProvider.IMG_EDIT));
						} else if (userMayTranscribe != null
								&& userMayTranscribe.booleanValue()) {
							mayEditLabel.setImage(resourceProvider.getImage(
									Display.getDefault(),
									BTSResourceProvider.IMG_HIEROGLYPHETW));
						} else {
							mayEditLabel.setImage(resourceProvider.getImage(
									Display.getDefault(),
									BTSResourceProvider.IMG_EDIT_DISABLED));
						}
						mayEditLabel.pack();
						composite.layout();
						composite.pack();
					}
				}

			});

		}
	}

	/**
	 * @param userMayTranscribe
	 *            the userMayTranscribe to set
	 */
	@Inject
	@Optional
	public void setUserMayTranscribe(
			@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_TRANSCRIBE) final Boolean userMayTranscribe) {
		if (userMayTranscribe != null
				&& userMayTranscribe != this.userMayTranscribe) {
			this.userMayTranscribe = userMayTranscribe;
			sync.asyncExec(new Runnable() {

				@Override
				public void run() {
					if (mayEditLabel != null) {
						if (userMayEdit != null && userMayEdit.booleanValue()) {
							mayEditLabel.setImage(resourceProvider.getImage(
									Display.getDefault(),
									BTSResourceProvider.IMG_EDIT));
						} else if (userMayTranscribe != null
								&& userMayTranscribe.booleanValue()) {
							mayEditLabel.setImage(resourceProvider.getImage(
									Display.getDefault(),
									BTSResourceProvider.IMG_HIEROGLYPHETW));
						} else {
							mayEditLabel.setImage(resourceProvider.getImage(
									Display.getDefault(),
									BTSResourceProvider.IMG_EDIT_DISABLED));
						}
						mayEditLabel.pack();
						composite.layout();
						composite.pack();
					}
				}

			});
		}
	}
}
