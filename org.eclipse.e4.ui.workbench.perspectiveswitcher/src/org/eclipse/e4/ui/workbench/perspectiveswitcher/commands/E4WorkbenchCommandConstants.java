/*******************************************************************************
 * Copyright (c) 2012 Joseph Carroll and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Joseph Carroll <jdsalingerjr@gmail.com> - initial API and implementation
 ******************************************************************************/ 
package org.eclipse.e4.ui.workbench.perspectiveswitcher.commands;

public interface E4WorkbenchCommandConstants {

    /**
     * Id for category "Perspectives"
     * (value is <code>"org.eclipse.e4.ui.perspectives"</code>).
     */
    public static final String CATEGORY_PERSPECTIVES = "org.eclipse.e4.ui.perspectives"; //$NON-NLS-1$
    
	/**
	 * Name for category "Perspectives"
	 * (value is <code>"Perspectives Category"</code>).
	 */
	public static final String CATEGORY_PERSPECTIVES$_NAME = "Perspectives"; //$NON-NLS-1$
	
	/**
	 * Description for category "Perspectives"
	 * (value is <code>"Manipulation of workbench perspectives"</code>).
	 */
	public static final String CATEGORY_PERSPECTIVES$_DESCRIPTION = "Manipulation of workbench perspectives"; //$NON-NLS-1$
	
    /**
     * Id for command "Show Perspective" in category "Perspectives"
     * (value is <code>"org.eclipse.e4.ui.perspectives.showPerspective"</code>).
     */
    public static final String PERSPECTIVES_SHOW_PERSPECTIVE = "org.eclipse.e4.ui.perspectives.showPerspective"; //$NON-NLS-1$
    
	/**
	 * Name for command "Show Perspective" in category "Perspectives"
	 * (value is <code>"Show Perspective"</code>).
	 */
	public static final String PERSPECTIVES_SHOW_PERSPECTIVE$_NAME = "Show Perspective"; //$NON-NLS-1$
	
	/**
	 * Description for command "Show Perspective" in category "Perspectives"
	 * (value is <code>"Opens a new perspective"</code>).
	 */
	public static final String PERSPECTIVES_SHOW_PERSPECTIVE$_DESCRIPTION = "Opens a new perspective"; //$NON-NLS-1$
	
    /**
     * Id for command "Save As" in category "Perspectives"
     * (value is <code>"org.eclipse.e4.ui.perspectives.saveAs"</code>).
     */
    public static final String PERSPECTIVES_SAVE_AS = "org.eclipse.e4.ui.perspectives.saveAs"; //$NON-NLS-1$
    
	/**
	 * Name for command "Save As" in category "Perspectives"
	 * (value is <code>"Save &As..."</code>).
	 */
	public static final String PERSPECTIVES_SAVE_AS$_NAME = "Save &As..."; //$NON-NLS-1$
	
	/**
	 * Description for command "Save As" in category "Perspectives"
	 * (value is <code>"Prompts the user to save the active perspective under a specified name"</code>).
	 */
	public static final String PERSPECTIVES_SAVE_AS$_DESCRIPTION = "Prompts the user to save the active perspective under a specified name"; //$NON-NLS-1$
	
    /**
     * Id for command "Reset" in category "Perspectives"
     * (value is <code>"org.eclipse.e4.ui.perspectives.reset"</code>).
     */
    public static final String PERSPECTIVES_RESET = "org.eclipse.e4.ui.perspectives.reset"; //$NON-NLS-1$
    
	/**
	 * Name for command "Reset" in category "Perspectives"
	 * (value is <code>"&Reset"</code>).
	 */
	public static final String PERSPECTIVES_RESET$_NAME = "&Reset"; //$NON-NLS-1$
	
	/**
	 * Description for command "Reset" in category "Perspectives"
	 * (value is <code>"Resets the perspective to its default state"</code>).
	 */
	public static final String PERSPECTIVES_RESET$_DESCRIPTION = "Resets the perspective to its default state"; //$NON-NLS-1$
	
    /**
     * Id for command "Close" in category "Perspectives"
     * (value is <code>"org.eclipse.e4.ui.perspectives.close"</code>).
     */
    public static final String PERSPECTIVES_CLOSE = "org.eclipse.e4.ui.perspectives.close"; //$NON-NLS-1$
    
	/**
	 * Name for command "Close" in category "Perspectives"
	 * (value is <code>"&Close"</code>).
	 */
	public static final String PERSPECTIVES_CLOSE$_NAME = "&Close"; //$NON-NLS-1$
	
	/**
	 * Description for command "Close" in category "Perspectives"
	 * (value is <code>"Closes the perspective"</code>).
	 */
	public static final String PERSPECTIVES_CLOSE$_DESCRIPTION = "Closes the perspective"; //$NON-NLS-1$
	
    /**
     * Id for command "Show Text" in category "Perspectives"
     * (value is <code>"org.eclipse.e4.ui.perspectives.showText"</code>).
     */
    public static final String PERSPECTIVES_SHOW_TEXT = "org.eclipse.e4.ui.perspectives.showText"; //$NON-NLS-1$
    
	/**
	 * Name for command "Show Text" in category "Perspectives"
	 * (value is <code>"Show &Text"</code>).
	 */
	public static final String PERSPECTIVES_SHOW_TEXT$_NAME = "Show &Text"; //$NON-NLS-1$
	
	/**
	 * Description for command "Show Text" in category "Perspectives"
	 * (value is <code>"Displays the perspective name next to its icon"</code>).
	 */
	public static final String PERSPECTIVES_SHOW_TEXT$_DESCRIPTION = "Displays the perspective name next to its icon"; //$NON-NLS-1$
	
}
