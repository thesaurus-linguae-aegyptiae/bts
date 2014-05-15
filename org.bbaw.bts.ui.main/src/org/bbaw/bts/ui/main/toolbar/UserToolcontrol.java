package org.bbaw.bts.ui.main.toolbar;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.di.annotations.Optional;
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

	// @Inject
	// @Optional
	// @Named(BTSCoreConstants.AUTHENTICATED_USER)
	private BTSUser authenticatedUser;

	// @Inject
	// @Optional
	// @Named(BTSCoreConstants.CORE_EXPRESSION_USER_CONTEXT_ROLE)
	private String userContextRole;

	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			factory);
	private Label userLabel;

	private Composite composite;

	private Label mayEditLabel;

	private Label roleLabel;

	// @Inject
	// @Optional
	// @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	private Boolean userMayEdit;

	// @Inject
	// @Optional
	// @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_TRANSCRIBE)
	private Boolean userMayTranscribe;

	@PostConstruct
	public void postConstruct(Composite composite) {
		this.composite = composite;
		composite.setLayout(new GridLayout(6, false));
		Label l = new Label(composite, SWT.None);
		l.setImage(labelProvider.getImage(authenticatedUser));
		l.setLayoutData(new GridData());
		l.pack();
		// Label l2 = new Label(composite, SWT.None);
		// l2.setText("Current User");
		// l2.setLayoutData(new GridData());
		// l2.pack();

		userLabel = new Label(composite, SWT.None);
		userLabel.setLayoutData(new GridData());
		((GridData) userLabel.getLayoutData()).horizontalSpan = 2;
		if (authenticatedUser != null) {
			userLabel.setText(labelProvider.getText(authenticatedUser));

		}
 else {
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
			roleLabel.setText(userContextRole);
		} else {
			roleLabel.setText("No Role");
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
			@Named(BTSCoreConstants.CORE_EXPRESSION_USER_CONTEXT_ROLE) String userContextRole) {
		if (userContextRole != null
				&& !userContextRole.equals(this.userContextRole)) {
			this.userContextRole = userContextRole;
			if (roleLabel != null) {
				if (userContextRole != null) {
					roleLabel.setText(userContextRole);
				}

				roleLabel.pack();
				composite.layout();
				composite.pack();
			}
		}
	}

	/**
	 * @param userMayEdit
	 *            the userMayEdit to set
	 */
	@Inject
	@Optional
	public void setUserMayEdit(
			@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) Boolean userMayEdit) {
		if (userMayEdit != null && userMayEdit != this.userMayEdit) {
			this.userMayEdit = userMayEdit;
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
				mayEditLabel
						.setImage(resourceProvider.getImage(
								Display.getDefault(),
						BTSResourceProvider.IMG_EDIT_DISABLED));
			}
			mayEditLabel.pack();
			composite.layout();
			composite.pack();
			}
		}
	}

	/**
	 * @param userMayTranscribe
	 *            the userMayTranscribe to set
	 */
	@Inject
	@Optional
	public void setUserMayTranscribe(
			@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_TRANSCRIBE) Boolean userMayTranscribe) {
		if (userMayTranscribe != null
				&& userMayTranscribe != this.userMayTranscribe) {
			this.userMayTranscribe = userMayTranscribe;
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
				mayEditLabel
						.setImage(resourceProvider.getImage(
								Display.getDefault(),
						BTSResourceProvider.IMG_EDIT_DISABLED));
			}
			mayEditLabel.pack();
			composite.layout();
			composite.pack();
			}
		}
	}
}
