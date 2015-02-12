/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.ui.internal;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.osgi.framework.Bundle;

import e4.handler.ImageAcces;

/**
 * Bundle of all images used by the Xtext UI plugin. Inspired by
 * PDEPluginImages.
 * 
 * @author Peter Friese - Initial contribution and API
 * @author Dennis H�bner
 * 
 */
public class XtextPluginImages {

	private static final String NAME_PREFIX = Activator.PLUGIN_ID + "."; //$NON-NLS-1$

	private static ImageRegistry PLUGIN_REGISTRY;

	public final static String ICONS_PATH = "icons/"; //$NON-NLS-1$
	
	private static String OS = System.getProperty("os.name").toLowerCase();

	/**
	 * Set of predefined Image Descriptors.
	 */

	private static final String PATH_OBJ = ICONS_PATH + "obj16/"; //$NON-NLS-1$
	//    private static final String PATH_VIEW = ICONS_PATH + "view16/"; //$NON-NLS-1$
	private static final String PATH_LCL = ICONS_PATH + "elcl16/"; //$NON-NLS-1$
	private static final String PATH_LCL_DISABLED = ICONS_PATH + "dlcl16/"; //$NON-NLS-1$
	//    private static final String PATH_TOOL = ICONS_PATH + "etool16/"; //$NON-NLS-1$
    private static final String PATH_OVR = ICONS_PATH + "ovr16/"; //$NON-NLS-1$
	//    private static final String PATH_WIZBAN = ICONS_PATH + "wizban/"; //$NON-NLS-1$

	/**
	 * Frequently used images
	 */
	public static final String OBJ_DESC_SERVICE_LOADED = NAME_PREFIX + "OBJ_DESC_SERVICE_LOADED"; //$NON-NLS-1$
	public static final String OBJ_DESC_SERVICE_NOT_LOADED = NAME_PREFIX + "OBJ_DESC_SERVICE_NOT_LOADED"; //$NON-NLS-1$
	public static final String OBJ_DESC_LANGUAGE = NAME_PREFIX + "OBJ_DESC_LANGUAGE"; //$NON-NLS-1$

	public static final String OBJ_CORRECTION_CHANGE = NAME_PREFIX + "CORRECTION_CHANGE"; //$NON-NLS-1$

	public static final String OBJ_FIXABLE_ERROR = NAME_PREFIX + "OBJ_FIXABLE_ERROR"; //$NON-NLS-1$
	public static final String OBJ_FIXABLE_WARNING = NAME_PREFIX + "OBJ_FIXABLE_WARNING"; //$NON-NLS-1$
	/**
	 * @since 2.3
	 */
	public static final String OBJ_FIXABLE_INFO = NAME_PREFIX + "OBJ_FIXABLE_INFO"; //$NON-NLS-1$

	/**
	 * OBJ16
	 */
	public static final ImageDescriptor DESC_SERVICE_LOADED_OBJ = create(PATH_OBJ, "service_loaded.gif"); //$NON-NLS-1$
	public static final ImageDescriptor DESC_SERVICE_NOT_LOADED_OBJ = create(PATH_OBJ, "service_not_loaded.gif"); //$NON-NLS-1$
	public static final ImageDescriptor DESC_LANGUAGE_OBJ = create(PATH_OBJ, "font.gif"); //$NON-NLS-1$
	
	public static final ImageDescriptor DESC_CORRECTION_CHANGE = create(PATH_OBJ, "correction_change.gif"); //$NON-NLS-1$

	public static final ImageDescriptor DESC_FIXABLE_ERROR = create(PATH_OBJ, "quickfix_error_obj.gif"); //$NON-NLS-1$
	public static final ImageDescriptor DESC_FIXABLE_WARNING = create(PATH_OBJ, "quickfix_warning_obj.gif"); //$NON-NLS-1$
	/**
	 * @since 2.3
	 */
	public static final ImageDescriptor DESC_FIXABLE_INFO = create(PATH_OBJ, "quickfix_info_obj.gif"); //$NON-NLS-1$

	/**
	 * OVR16
	 */
	public static final ImageDescriptor DESC_OVR_ERROR = create(PATH_OVR, "error_co.gif"); //$NON-NLS-1$
	public static final ImageDescriptor DESC_OVR_WARNING =create(PATH_OVR, "warning_co.gif"); //$NON-NLS-1$

	/**
	 * TOOL16
	 */

	/**
	 * LCL
	 */
	public static final ImageDescriptor DESC_LINK_WITH_EDITOR = create(PATH_LCL, "synced.gif"); //$NON-NLS-1$
	public static final ImageDescriptor DESC_ALPHAB_SORT_CO = create(PATH_LCL, "alphab_sort_co.gif"); //$NON-NLS-1$

	public static final ImageDescriptor DESC_LINK_WITH_EDITOR_DISABLED = create(PATH_LCL_DISABLED, "synced.gif"); //$NON-NLS-1$
	public static final ImageDescriptor DESC_ALPHAB_SORT_CO_DISABLED = create(PATH_LCL_DISABLED, "alphab_sort_co.gif"); //$NON-NLS-1$

	public static final ImageDescriptor DESC_SEARCH_PREVIOUS = create(PATH_LCL, "prev_nav.gif");
	public static final ImageDescriptor DESC_SEARCH_NEXT = create(PATH_LCL, "next_nav.gif");
	
	public static final ImageDescriptor DESC_EXPAND_ALL = create(PATH_LCL, "expandall.gif");
	public static final ImageDescriptor DESC_COLLAPSE_ALL = create(PATH_LCL, "collapseall.gif");
	
	public static final ImageDescriptor DESC_OPEN_DECLARATION = create(PATH_LCL, "goto_input.gif");
	public static final ImageDescriptor DESC_OPEN_DECLARATION_DISABLED = create(PATH_LCL_DISABLED, "goto_input.gif");
	
	public static final ImageDescriptor DESC_MARK_OCCURRENCES = create(PATH_LCL, "mark_occurrences.gif");
	public static final ImageDescriptor DESC_MARK_OCCURRENCES_DISABLED = create(PATH_LCL_DISABLED, "mark_occurrences.gif");
	
	//cp 
	public static final ImageDescriptor DESC_ERROR = create(PATH_OBJ, "cross-circle.png");
	
	public static final ImageDescriptor DESC_EXCLAMATION = create(PATH_OBJ, "exclamation.png");
	public static final ImageDescriptor DESC_INFORMATION = create(PATH_OBJ, "information-white.png");
	
public static final String OBJ_DESC_ERROR = NAME_PREFIX + "ERROR";
	
	public static final String OBJ_DESC_EXCLAMATION = NAME_PREFIX + "EXCLAMATION";
	public static final String OBJ_DESC_INFORMATION = NAME_PREFIX + "INFORMATION";
	/**
	 * WIZ
	 */

	/**
	 * View
	 */

	private static ImageDescriptor create(String prefix, String name) {
		return ImageDescriptor.createFromURL(makeImageURL(prefix, name));
	}

	public static Image get(String key) {
		ensureInitialized();
		return PLUGIN_REGISTRY.get(key);
	}

	private static void ensureInitialized() {
		if (PLUGIN_REGISTRY == null)
			initialize();
	}
	
	private static boolean imagesInitialized;

	private static final Map<String, Image> annotationImagesFixable = new HashMap<String, Image>();
	private static final Map<String, Image> annotationImagesNonFixable = new HashMap<String, Image>();
	private static final Map<String, Image> annotationImagesDeleted = new HashMap<String, Image>();

	private static final void initializeImageMaps() {
		if(imagesInitialized)
			return;
		
		annotationImagesFixable.put(XtextEditor.ERROR_ANNOTATION_TYPE, get(OBJ_FIXABLE_ERROR));
		annotationImagesFixable.put(XtextEditor.WARNING_ANNOTATION_TYPE, get(OBJ_FIXABLE_WARNING));
		annotationImagesFixable.put(XtextEditor.INFO_ANNOTATION_TYPE, get(OBJ_FIXABLE_INFO));

		//XXX cp uncommented
//		ISharedImages sharedImages= PlatformUI.getWorkbench().getSharedImages();
//		Image error = sharedImages.getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
//		Image warning = sharedImages.getImage(ISharedImages.IMG_OBJS_WARN_TSK);
//		Image info = sharedImages.getImage(ISharedImages.IMG_OBJS_INFO_TSK);
		annotationImagesNonFixable.put(XtextEditor.ERROR_ANNOTATION_TYPE, get(OBJ_DESC_ERROR));
		annotationImagesNonFixable.put(XtextEditor.WARNING_ANNOTATION_TYPE, get(OBJ_DESC_EXCLAMATION));
		annotationImagesNonFixable.put(XtextEditor.INFO_ANNOTATION_TYPE, get(OBJ_DESC_INFORMATION));
		
		Display display = Display.getCurrent();
		annotationImagesDeleted.put(XtextEditor.ERROR_ANNOTATION_TYPE, new Image(display, get(OBJ_DESC_ERROR), SWT.IMAGE_GRAY));
		annotationImagesDeleted.put(XtextEditor.WARNING_ANNOTATION_TYPE, new Image(display, get(OBJ_DESC_EXCLAMATION), SWT.IMAGE_GRAY));
		annotationImagesDeleted.put(XtextEditor.INFO_ANNOTATION_TYPE, new Image(display, get(OBJ_DESC_INFORMATION), SWT.IMAGE_GRAY));
		
		imagesInitialized = true;
	}	


	/* package */
	private static final void initialize() {
		PLUGIN_REGISTRY = new ImageRegistry();
		manage(OBJ_DESC_SERVICE_LOADED, DESC_SERVICE_LOADED_OBJ);
		manage(OBJ_DESC_SERVICE_NOT_LOADED, DESC_SERVICE_NOT_LOADED_OBJ);
		manage(OBJ_DESC_LANGUAGE, DESC_LANGUAGE_OBJ);
		manage(OBJ_CORRECTION_CHANGE, DESC_CORRECTION_CHANGE);
		manage(OBJ_FIXABLE_ERROR, DESC_FIXABLE_ERROR);
		manage(OBJ_FIXABLE_WARNING, DESC_FIXABLE_WARNING);
		manage(OBJ_FIXABLE_INFO, DESC_FIXABLE_INFO);
		
		//cp
		manage(OBJ_DESC_ERROR, DESC_ERROR);
		manage(OBJ_DESC_EXCLAMATION, DESC_EXCLAMATION);
		manage(OBJ_DESC_INFORMATION, DESC_INFORMATION);
		
		initializeImageMaps();
	}

	private static URL makeImageURL(String prefix, String name) {
		//FIXME make dynamic!!!!!!!!!!!!!!
		URL entry = Platform.getBundle("org.eclipse.xtext.ui").getEntry(prefix+ name);
		File file = null;
		String path = null;
		if (entry == null)
		{
			return null;
		}
		else
		{
			try {
				path = FileLocator.toFileURL(entry).getPath();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// remove leading slash from absolute path when on windows
			if (isWindows())
				path = path.substring(1, path.length());
			file = new File(path);
			try {
				URL url = file.toPath().toUri().toURL();
				return url;
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		String path =  "file://C:/Dokumente und Einstellungen/plutte/git/xtext_2.4.x/org.eclipse.xtext/plugins/org.eclipse.xtext.ui/" + prefix + name; //$NON-NLS-1$
		System.out.println("path  " + path);

		URL result = null;
		try {
			result = new URL(path);
			return result;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class<ImageAcces> clazz = ImageAcces.class;
		URL dirURL = clazz.getClassLoader().getResource(path);
		System.out.println("dirURL1 " + dirURL);

		Bundle bundle = Platform.getBundle("org.eclipse.xtext.ui");
		System.out.println("bundle " + bundle);

//		return FileLocator.find(bundle, new Path(path), null);
		URL fileURL = bundle.getEntry(path);
		System.out.println("fileURL " + fileURL);
		
		System.out.println("fileURL2 " + bundle.getResource(path));
		try {
			System.out.println("path2: "
					+ FileLocator.resolve(fileURL).getPath());
			result = new URL("file:/"
					+ FileLocator.resolve(fileURL).getPath());
			System.out.println("path2: "
					+ result);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return result;
//		File file = null;
//		try
//		{
//			file = new File(FileLocator.resolve(fileURL).toURI());
//			dirURL = file.toPath().toUri().toURL();
//
//		} catch (URISyntaxException e1)
//		{
//			e1.printStackTrace();
//		} catch (IOException e1)
//		{
//			e1.printStackTrace();
//		}
//		System.out.println("################" + dirURL.toString());
//		return dirURL;
		//old
//		return FileLocator.find(Activator.getDefault().getBundle(), new Path(path), null);
	}

	private static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	public static Image manage(String key, ImageDescriptor desc) {
		Image image = desc.createImage();
		PLUGIN_REGISTRY.put(key, image);
		return image;
	}

	public static Map<String, Image> getAnnotationImagesNonfixable() {
		ensureInitialized();
		return annotationImagesNonFixable;
	}

	public static Map<String, Image> getAnnotationImagesFixable() {
		ensureInitialized();
		return annotationImagesFixable;
	}

	public static Map<String, Image> getAnnotationImagesDeleted() {
		ensureInitialized();
		return annotationImagesDeleted;
	}
}
