package org.bbaw.bts.core.controller.impl.generalController;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.bbaw.bts.core.controller.generalController.ISplashScreenController;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.Assert;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Version;

public class SplashScreenControllerImpl implements ISplashScreenController
{
	private String pluginId = null;
	private String splashPath = "splash.bmp";
	private Shell splashShell = null;
	private Label msgTextLabel = null;
	private String nextMessage = "Application Starting... ";

	@Override
	public void setSplashPluginId(String pluginId)
	{
		Assert.isLegal(pluginId != null && !pluginId.equals(""));
		this.pluginId = pluginId;
	}

	@Override
	public void setSplashImagePath(String splashPath)
	{
		Assert.isLegal(splashPath != null && !splashPath.equals(""));
		this.splashPath = splashPath;
	}

	@Override
	public void open()
	{
		if (pluginId == null) throw new IllegalStateException("The SplashPluginId has not been set.");
		if (splashPath == null) throw new IllegalStateException("The SplashImagePath has not been set.");

		// logger.info("Showing Splash Screen ...");
		splashShell = createSplashShell();
		splashShell.open();
	}

	private Shell createSplashShell()
	{
		final Shell shell = new Shell( SWT.NO_TRIM); //SWT.ON_TOP |
		Image image = createBackgroundImage(shell);
		shell.setBackgroundImage(image);
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);

		final GridLayout layout = new GridLayout();
		layout.marginWidth = 10;
		layout.numColumns = 1;
		layout.verticalSpacing = 6;
		layout.horizontalSpacing = 6;
		shell.setLayout(layout);

		// TODO Set the postion and stlye of the text from outside to make the
		// service reusable
		Label versionTextLabel = createVersionLabel(shell);
		msgTextLabel = createMessageLabel(shell);

		Rectangle imageBounds = image.getBounds();
		shell.setSize(imageBounds.width, imageBounds.height);
		shell.setLocation(getMonitorCenter(shell));
		return shell;
	}

	private Image createBackgroundImage(Shell parent)
	{
		final Image splashImage = getImageDescriptor(pluginId, splashPath).createImage();
		parent.addDisposeListener(new DisposeListener()
		{
			@Override
			public void widgetDisposed(DisposeEvent e)
			{
				splashImage.dispose();
			}
		});
		return splashImage;
	}

	private ImageDescriptor getImageDescriptor(String pluginId, String path)
	{
		try
		{
			if (!path.startsWith("/"))
			{
				path = "/" + path;
			}
			URL url = new URL("platform:/plugin/" + pluginId + path);
			url = FileLocator.resolve(url);
			return ImageDescriptor.createFromURL(url);
		} catch (MalformedURLException e)
		{
			String msg = NLS.bind("The image path {0} in not a valid location the bundle {1}.", path, pluginId);
			throw new RuntimeException(msg, e);
		} catch (IOException e)
		{
			String msg = NLS.bind("The image {0} was not found in the bundle {1}.", path, pluginId);
			throw new RuntimeException(msg, e);
		}
	}

	private Label createMessageLabel(Composite parent)
	{
		Label label = new Label(parent, SWT.WRAP);
		GridData gd = new GridData();
		gd.horizontalAlignment = SWT.FILL;
		gd.verticalAlignment = SWT.BOTTOM;
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;
		label.setLayoutData(gd);

		label.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_GRAY));
		label.setFont(parent.getDisplay().getSystemFont());

		if (nextMessage != null)
		{
			label.setText(nextMessage);
		}
		return label;
	}

	private Label createVersionLabel(Composite parent) {
		Label lbl = new Label(parent, SWT.NONE);
		GridData gd = new GridData(SWT.RIGHT, SWT.TOP, false, true);
		lbl.setLayoutData(gd);
		lbl.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
		lbl.setFont(parent.getDisplay().getSystemFont());
		try {
			Version v = Platform.getBundle(pluginId).getVersion();
			lbl.setText("v"+v.getMajor()+"."+v.getMinor()+"."+v.getMicro());
		} catch (Exception e) {
			//
		}
		return lbl;
	}

	private Point getMonitorCenter(Shell shell)
	{
		Monitor primary = shell.getDisplay().getPrimaryMonitor();
		Rectangle bounds = primary.getBounds();
		Rectangle rect = shell.getBounds();
		int x = bounds.x + (bounds.width - rect.width) / 2;
		int y = bounds.y + (bounds.height - rect.height) / 2;
		return new Point(x, y);
	}

	@Override
	public void close()
	{
		if (splashShell != null && !splashShell.isDisposed())
		{
			splashShell.close();
			splashShell = null;
		}
	}

	@Override
	public void setMessage(final String message)
	{
		if (msgTextLabel != null && !msgTextLabel.isDisposed())
		{
			splashShell.getDisplay().syncExec(new Runnable()
			{
				@Override
				public void run()
				{
					msgTextLabel.setText(message);
					splashShell.layout();
					splashShell.update();
				}
			});
		} else
		{
			nextMessage = message;
		}
	}
}