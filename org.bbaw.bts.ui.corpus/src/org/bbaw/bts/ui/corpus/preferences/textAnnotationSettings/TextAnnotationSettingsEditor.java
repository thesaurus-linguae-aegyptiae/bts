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
package org.bbaw.bts.ui.corpus.preferences.textAnnotationSettings;

import java.util.regex.Matcher;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.corpus.controller.generalController.PassportConfigurationController;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.preferences.TextAnnotationSettingsPage;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ColorSelector;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.prefs.Preferences;

/**
 * @author plutte
 *
 */
public class TextAnnotationSettingsEditor extends Composite {

	@Inject
	private Preferences node;
	
	@Inject
	private ComposedAdapterFactory factory;
	
	@Inject
	private PassportConfigurationController passportConfigurationController;

	private ComboViewer typeCMB_Main_viewer;

	private ComboViewer subtypeCMB_Main_viewer;

	private Button toolbarCheckBox;

	private Text shortCutText;

	private ColorSelector colorEditor;

	private Text shortCutTipText;

	private Button deleteBTN;

	@Inject
	protected TextAnnotationSettingsPage parent;

	private Combo highlightingTypeCombo;


	/**
	 * @param node 
	 * @param parent
	 * @param style
	 */
	@Inject
	public TextAnnotationSettingsEditor(Composite parent) {
		super(parent, SWT.BORDER);
	}
	
	@PostConstruct
	public void postConstruct ()
	{
		this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		this.setLayout(new GridLayout(4, false));
		
		Label lblType = new Label(this, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblType.setText("Type");

		Combo typeCMB_Main = new Combo(this, SWT.READ_ONLY);
		typeCMB_Main.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		typeCMB_Main_viewer = new ComboViewer(typeCMB_Main);
		
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		typeCMB_Main_viewer.setContentProvider(contentProvider);
		typeCMB_Main_viewer.setLabelProvider(labelProvider);
		typeCMB_Main_viewer.setInput(passportConfigurationController
				.getObjectTypeConfigItemProcessedClones(BTSConstants.ANNOTATION, null));
		

		Label lblSubtype = new Label(this, SWT.NONE);
		lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblSubtype.setText("Subtype");

		Combo subtypeCMB_Main = new Combo(this, SWT.NONE | SWT.READ_ONLY);
		subtypeCMB_Main.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		subtypeCMB_Main_viewer = new ComboViewer(subtypeCMB_Main);

		AdapterFactoryLabelProvider labelProvider2 = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider2 = new AdapterFactoryContentProvider(
				factory);

		subtypeCMB_Main_viewer.setContentProvider(contentProvider2);
		subtypeCMB_Main_viewer.setLabelProvider(labelProvider2);
		
		Label highlightingColor = new Label(this, SWT.CHECK);
		highlightingColor.setText("Color");
		highlightingColor.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,
				1, 1));
		colorEditor = new ColorSelector(this);
		
		Label highlightingType = new Label(this, SWT.CHECK);
		highlightingType.setText("Hightlighting type");
		highlightingType.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,
				1, 1));
		
		highlightingTypeCombo = new Combo(this, SWT.CHECK | SWT.READ_ONLY);
		highlightingType.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,
				1, 1));
		highlightingTypeCombo.setItems(BTSCorpusConstants.ANNOTATION_HIGHLIGHTING_TYPES);
		
		toolbarCheckBox = new Button(this, SWT.CHECK);
		toolbarCheckBox.setText("Use Shortcut");
		toolbarCheckBox.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,
				2, 1));
		toolbarCheckBox.setToolTipText("Active this checkbox and enter a shortcut abbreviation \n"
				+ "to create a toolbar entry with a command to directly create\n"
				+ "an annotation of this type");
		
		Label shortCut = new Label(this, SWT.NONE);
		shortCut.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		shortCut.setText("Shortcut");
		
		shortCutText = new Text(this, SWT.BORDER);
		shortCutText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		shortCutText.setToolTipText("Enter a shortcut abbreviation "
				+ "to create a toolbar entry \nwith a command to directly create"
				+ "an annotation\n of this type");
		
		Label shortCutTip = new Label(this, SWT.NONE);
		shortCutTip.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		shortCutTip.setText("Tooltip");
		
		shortCutTipText = new Text(this, SWT.BORDER);
		shortCutTipText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));
		
		
		// add minus button per group
		deleteBTN = new Button(this, SWT.PUSH);
		deleteBTN.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
				false, 1, 1));
		deleteBTN.setText("Remove");
		deleteBTN.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				parent.delete(TextAnnotationSettingsEditor.this, node);
			}
		});
		loadInput();
		
		typeCMB_Main_viewer
		.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				event.getSource();
				StructuredSelection sel = (StructuredSelection) typeCMB_Main_viewer.getSelection();
				BTSConfigItem item = (BTSConfigItem) sel.getFirstElement();
				
				subtypeCMB_Main_viewer
				.setInput(passportConfigurationController
						.getObjectTypeConfigItemProcessedClones(BTSConstants.ANNOTATION, item.getValue()));
				subtypeCMB_Main_viewer.refresh();

			}
		});
		this.layout();
	}

	/**
	 * 
	 */
	private void loadInput() {
		if (node.get(BTSCorpusConstants.PREF_ANNOTATION_TYPE, null) != null)
		{
			setConfigComboViewer(typeCMB_Main_viewer, node.get(BTSCorpusConstants.PREF_ANNOTATION_TYPE, ""));

			subtypeCMB_Main_viewer.setInput(passportConfigurationController
				.getObjectTypeConfigItemProcessedClones(BTSConstants.ANNOTATION, node.get(BTSCorpusConstants.PREF_ANNOTATION_TYPE, null)));
		}
		
		if (node.get(BTSCorpusConstants.PREF_ANNOTATION_SUBTYPE, null) != null)
		{
			setConfigComboViewer(subtypeCMB_Main_viewer, node.get(BTSCorpusConstants.PREF_ANNOTATION_SUBTYPE, ""));
		}
		if (node.get(BTSCorpusConstants.PREF_COLOR, null) != null)
		{
		    Matcher m = BTSUIConstants.RGB_PATTERN.matcher(node.get(BTSCorpusConstants.PREF_COLOR, ""));
		    if (m.matches()) 
		    {
			colorEditor.setColorValue(new RGB(Integer.valueOf(m.group(1)),  // r
                    Integer.valueOf(m.group(2)),  // g
                    Integer.valueOf(m.group(3))));
		    }
		}
		
		toolbarCheckBox.setSelection(node.getBoolean(BTSCorpusConstants.PREF_TOOLBAR_VISIBLE, false));
		
		highlightingTypeCombo.select(highlightingTypeCombo.indexOf(node.get(BTSCorpusConstants.PREF_HIGHLIGHTING_TYPE, BTSCorpusConstants.PREF_DEFAULT_HIGHLIGHTING_TYPE)));


		shortCutText.setText(node.get(BTSCorpusConstants.PREF_TOOLBAR_SHORTCUT,  ""));
		shortCutTipText.setText(node.get(BTSCorpusConstants.PREF_TOOLBAR_SHORTCUT_TIP,  ""));
	}

	/**
	 * @param subtypeCMB_Main_viewer2
	 * @param string
	 */
	private void setConfigComboViewer(ComboViewer viewer, String inputString) {
		Object input = viewer.getInput();
		if (input instanceof BTSConfigItem) {
			for (BTSConfig i : ((BTSConfig) input).getChildren()) {
				if (i instanceof BTSConfigItem
						&& inputString
								.equals(((BTSConfigItem) i).getValue())) {
					viewer.setSelection(new StructuredSelection(i));
					return;
				}
			}
			BTSConfigItem cci = BtsmodelFactory.eINSTANCE
					.createBTSConfigItem();
			cci.setLabel(BtsmodelFactory.eINSTANCE.createBTSTranslations());

			cci.getLabel().setTranslation(inputString, "en");
			cci.setValue(inputString);
			((BTSConfig) input).getChildren().add(cci);
			viewer.setSelection(new StructuredSelection( cci));
			return;
		}
		
	}

	/**
	 * @return 
	 * 
	 */
	public Preferences save() {
		if (typeCMB_Main_viewer.getSelection() != null)
		{
			StructuredSelection sel = (StructuredSelection) typeCMB_Main_viewer.getSelection();
			BTSConfigItem item = (BTSConfigItem) sel.getFirstElement();
			if (!"".equals(item.getValue()))
			{
				node.put(BTSCorpusConstants.PREF_ANNOTATION_TYPE, item.getValue());
			}
			else
			{
				node.put(BTSCorpusConstants.PREF_ANNOTATION_TYPE, "");
			}
		}
		if (subtypeCMB_Main_viewer.getSelection() != null)
		{
			StructuredSelection sel = (StructuredSelection) subtypeCMB_Main_viewer.getSelection();
			BTSConfigItem item = (BTSConfigItem) sel.getFirstElement();
			if (item != null && item.getValue() != null && !"".equals(item.getValue()))
			{
				node.put(BTSCorpusConstants.PREF_ANNOTATION_SUBTYPE, item.getValue());
			}
			else
			{
				node.put(BTSCorpusConstants.PREF_ANNOTATION_SUBTYPE, "");
			}
		}
		node.put(BTSCorpusConstants.PREF_COLOR, colorEditor.getColorValue().toString());
		
		node.putBoolean(BTSCorpusConstants.PREF_TOOLBAR_VISIBLE, toolbarCheckBox.getSelection());
		
		node.put(BTSCorpusConstants.PREF_HIGHLIGHTING_TYPE, highlightingTypeCombo.getText());

		node.put(BTSCorpusConstants.PREF_TOOLBAR_SHORTCUT,  shortCutText.getText().trim());
		node.put(BTSCorpusConstants.PREF_TOOLBAR_SHORTCUT_TIP,  shortCutTipText.getText().trim());
		return node;

	}
	
	

}
