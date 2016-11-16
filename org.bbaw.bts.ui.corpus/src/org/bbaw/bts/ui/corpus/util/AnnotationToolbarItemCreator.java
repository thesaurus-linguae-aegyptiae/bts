/**
 * This file is part of Thesaurus Linguae Aegyptiae, TLA.
 * 
 * The software TLA serves as a web interface for presenting and working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software TLA was developed at Free University Berlin, www.fu-berlin.de together with 
 * the Berlin-Brandenburg Academy of Sciences and Humanities, 
 * Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2016  Free University of Berlin and Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software TLA was developed by @author: Christoph Plutte.
 * 
 * TLA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * TLA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with TLA.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.ui.corpus.util;

import java.util.HashMap;
import java.util.Map;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.eclipse.core.internal.preferences.EclipsePreferences;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.commands.MCommandsFactory;
import org.eclipse.e4.ui.model.application.commands.MParameter;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;
import org.osgi.service.prefs.BackingStoreException;

/**
 * @author plutte
 *
 */
public class AnnotationToolbarItemCreator {
	
	private static final String ADD_ANNOTATION_COMMAND = "org.bbaw.bts.ui.corpus.command.addAnnotation";

	private AnnotationToolbarItemCreator(){
		
	}
	
	public static void processAndUpateToolbarItemsAnnotationShortcut(MPart part, EclipsePreferences annotationsPreferences)
	{
		EclipsePreferences node;
		Map<String, MHandledToolItem> toolbarCache = loadToolbarCache(part.getToolbar());
		MCommand command = findCommand(part.getToolbar());
		try {
			for (String nodeName : annotationsPreferences.childrenNames())
			{
				node = (EclipsePreferences) annotationsPreferences.node(nodeName);
				MHandledToolItem toolItem = getCachedShortcutMHandledToolItem(toolbarCache, node);
				if (toolItem != null)
				{
					if (node.getBoolean(BTSCorpusConstants.PREF_TOOLBAR_VISIBLE, false))
					{
						if (toolItem.isVisible() && toolItem.isToBeRendered()) continue;
						if (!toolItem.isVisible())
						{
							toolItem.setVisible(true);
						}
						if (!toolItem.isToBeRendered())
						{
							toolItem.setToBeRendered(true);
						}
					}
					else
					{
						if (!toolItem.isVisible() && !toolItem.isToBeRendered()) continue;
						if (toolItem.isVisible())
						{
							toolItem.setVisible(false);
						}
						if (toolItem.isToBeRendered())
						{
							toolItem.setToBeRendered(false);
						}
					}
				}
				else if (node.getBoolean(BTSCorpusConstants.PREF_TOOLBAR_VISIBLE, false))
				{
					addToolbarShortcut(part.getToolbar(), node, command);
				}
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return;
	}

	/**
	 * @param toolbar
	 * @return
	 */
	private static MCommand findCommand(MToolBar toolbar) {
		for (MToolBarElement el : toolbar.getChildren())
		{
			if (el instanceof MHandledToolItem)
			{
				if (ADD_ANNOTATION_COMMAND.equals(
						((MHandledToolItem) el).getCommand().getElementId()))
				{
					return ((MHandledToolItem) el).getCommand();
				}
			}
		}
		return null;
	}

	/**
	 * @param toolbar
	 * @param commandService 
	 * @param node
	 */
	private static void addToolbarShortcut(MToolBar toolbar, EclipsePreferences node, MCommand command) {
		MHandledToolItem toolitem = MMenuFactory.INSTANCE.createHandledToolItem();
		toolitem.setCommand(command);
		String annotationTypePath = getAnnotationTypePath(node);

		String label = node.get(BTSCorpusConstants.PREF_TOOLBAR_SHORTCUT, "??");
		if (label == null) label = "Add";
		toolitem.setLabel(label);
		String tooltip = node.get(BTSCorpusConstants.PREF_TOOLBAR_SHORTCUT_TIP, "Create and add a new annotation.");
		if (tooltip != null && !"".equals(tooltip))
		{
			tooltip += "\n\n";
		}
		tooltip += "Annotation type to add: " + annotationTypePath;
		toolitem.setTooltip(tooltip);
		
		toolitem.setElementId(ADD_ANNOTATION_COMMAND + ".toolbar." + ADD_ANNOTATION_COMMAND);
		
		MParameter param = MCommandsFactory.INSTANCE.createParameter();
		param.setElementId(toolitem.getElementId() +  ".param");
		param.setName("annotationTypePath");
		param.setValue(annotationTypePath);
		toolitem.getParameters().add(param);
		toolbar.getChildren().add(toolitem);
		
	}

	/**
	 * @param node
	 * @return
	 */
	public static String getAnnotationTypePath(EclipsePreferences node) {
		String annotationTypePath = BTSConstants.ANNOTATION;
		String type = node.get(BTSCorpusConstants.PREF_ANNOTATION_TYPE, null);
		String subtype = node.get(BTSCorpusConstants.PREF_ANNOTATION_SUBTYPE, null);
		if (type != null && !"".equals(type))
		{
			annotationTypePath += CorpusUtils.TYPE_PATH_DELIMITER + type;
			if (subtype != null && !"".equals(subtype))
			{
				annotationTypePath += CorpusUtils.TYPE_PATH_DELIMITER + subtype;
			}
		}
		return annotationTypePath;
	}

	/**
	 * @param toolbarCache
	 * @param node
	 * @return
	 */
	private static MHandledToolItem getCachedShortcutMHandledToolItem(Map<String, MHandledToolItem> toolbarCache, EclipsePreferences node) {
		String annotationTypePath = getAnnotationTypePath(node);
		return (toolbarCache.get(annotationTypePath));
	}

	/**
	 * @param toolbar
	 * @return
	 */
	private static Map<String, MHandledToolItem> loadToolbarCache(MToolBar toolbar) {
		Map<String, MHandledToolItem> cache = new HashMap<>();
		for (MToolBarElement el : toolbar.getChildren())
		{
			if (el instanceof MHandledToolItem)
			{
				MHandledToolItem toolitem = (MHandledToolItem) el;
				if (ADD_ANNOTATION_COMMAND.equals(
						toolitem.getCommand().getElementId()))
				{
					if (toolitem.getParameters().isEmpty())
					{
						cache.put(BTSConstants.ANNOTATION, toolitem);
					}
					else
					{
						for (MParameter param : toolitem.getParameters())
						{
							if (param.getName().equals("annotationTypePath") && param.getValue() != null)
							{
								
								cache.put(param.getValue(), toolitem);
								break;
							}
						}
					}
				}
			}
		}
		return cache;
	}

}
