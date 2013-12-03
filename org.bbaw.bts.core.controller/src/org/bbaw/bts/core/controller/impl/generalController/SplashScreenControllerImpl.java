package org.bbaw.bts.core.controller.impl.generalController;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.bbaw.bts.core.controller.generalController.ISplashScreenController;
import org.eclipse.core.runtime.FileLocator;
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

public class SplashScreenControllerImpl implements ISplashScreenController
{
	private String pluginId = null;
	private String splashPath = "splash.bmp";
	private Shell splashShell = null;
	private Label textLabel = null;
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
		final Shell shell = new Shell(SWT.TOOL | SWT.NO_TRIM);
		Image image = createBackgroundImage(shell);
		shell.setBackgroundImage(image);
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);

		final GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginHeight = 40;
		layout.marginWidth = 20;
		layout.verticalSpacing = 6;
		layout.horizontalSpacing = 6;
		shell.setLayout(layout);

		// TODO Set the postion and stlye of the text from outside to make the
		// service reusable
		textLabel = createTextLabel(shell);

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

	private Label createTextLabel(Composite parent)
	{
		Label label = new Label(parent, SWT.WRAP);
		GridData gd = new GridData();
		gd.horizontalAlignment = SWT.FILL;
		gd.verticalAlignment = SWT.BOTTOM;
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;
		label.setLayoutData(gd);

		label.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		label.setFont(parent.getDisplay().getSystemFont());

		if (nextMessage != null)
		{
			label.setText(nextMessage);
		}
		return label;
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
		if (textLabel != null && !textLabel.isDisposed())
		{
			splashShell.getDisplay().syncExec(new Runnable()
			{
				@Override
				public void run()
				{
					textLabel.setText(message);
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