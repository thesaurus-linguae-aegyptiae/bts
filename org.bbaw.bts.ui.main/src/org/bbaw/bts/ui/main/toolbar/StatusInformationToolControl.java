package org.bbaw.bts.ui.main.toolbar;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsviewmodel.MessageType;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;

public class StatusInformationToolControl {

	@Inject
	private UISynchronize sync;
	private Text label;
	private StatusMessage message;
	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			factory);
	private Composite parent;
	private Object selection;
	
	@Inject
	private BTSUserController userController;
	
	
	@PostConstruct
	public void createControls(Composite parent) {
		this.parent = parent;
		parent.setLayout(new GridLayout(3, true));
		parent.setBackground(new Color(Display.getDefault(), new RGB(155, 155, 155)));
		parent.setBounds(100, 10, 350, 20);
		label = new Text(parent, SWT.READ_ONLY);
		label.setText("Ready                                                                                                              ");
		label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		label.pack();
	}
	
	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("status_info/*") final StatusMessage object)
	{
		// make sure that object is not null and not equal with current message
		// check that message type of new message has higher priority than the current message
		if (object != null && object instanceof StatusMessage && (message == null || (!object.equals(this.message) )))
		{
			message = object;
			 sync.syncExec(new Runnable() {
			      @Override
			      public void run() {
			    	  updateStatusMessage(message);
			      }
			    });
		}
	}
	
	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final Object sel) {
		if (sel != null && sel instanceof BTSDBBaseObject
				&& !sel.equals(this.selection)) {
			this.selection = sel;
			 sync.syncExec(new Runnable() {
			      @Override
			      public void run() {
			    	  clearStatusInformation();
			      }
			    });
			
		}
	}

	private void clearStatusInformation() {
		message = null;
		label.setText("");
		label.pack();
		parent.layout();
		parent.pack();
	}

	private void updateStatusMessage(StatusMessage message) {
		if (message.getMessageType() != null && message.getMessageType() == MessageType.LOCKED)
		{
			BTSUser user = null;
			try {
				user = userController.findUser(message.getUserId());
			} catch (Exception e) {
			}
			if (user != null)
			{
				label.setText(message.getMessage() + labelProvider.getText(user));
			}
			else
			{
				label.setText(message.getMessage() + message.getUserId());
			}
		}
		else
		{
			label.setText(message.getMessage());
		}
		label.pack();
		parent.layout();
		parent.pack();
	}
}
