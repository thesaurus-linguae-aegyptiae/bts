/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.ui.commons.widgets;

import java.util.ArrayList;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * The Class TranslationEditorComposite provides a GUI component for editing a BTSTranslation object.
 *
 * @author Christoph Plutte
 */
public class TranslationEditorComposite extends Composite {
	
	/** The text. */
	private Text text;

	/** The resource provider. */
	private BTSResourceProvider resourceProvider = StaticAccessController.getContext().get(BTSResourceProvider.class);

	/** The translations. */
	private BTSTranslations translations;

	/** The domain. */
	private EditingDomain domain;

	/** The required. */
	private boolean required;

	/** The custom style. */
	private int customStyle;

	/** The combo. */
	private Combo combo;

	/** The binding context. */
	private DataBindingContext bindingContext;

	/** Whether to propagate changes via EMF databinding */
	private boolean dataBind;

	private List<SelectionListener> languageSelectionListeners = new ArrayList<SelectionListener>(2);

	private Binding binding;

	/**
	 * Instantiates a new translation editor composite.
	 *
	 * @param parent the parent
	 * @param style the style
	 * @param translations the translations
	 * @param domain the domain
	 * @param required the required
	 */
	public TranslationEditorComposite(Composite parent, int style,
			BTSTranslations translations, EditingDomain domain, boolean required, boolean dataBind) {
		this(parent, style, required, dataBind);
		this.translations = translations;
		this.domain = domain;
	}

	/**
	 * Instantiates a new translation editor composite.
	 *
	 * @param parent the parent
	 * @param style the style
	 * @param required the required
	 */
	public TranslationEditorComposite(Composite parent, int style,
			boolean required, boolean dataBind) {
		super(parent, SWT.NONE);
		this.dataBind = dataBind;
		this.required = required;
		this.customStyle = style;
		createControls();
	}

	/**
	 * Instantiates a new {@link TranslationEditorComposite} and activates databinding.
	 * @param parent
	 * @param style
	 * @param required
	 */
	public TranslationEditorComposite(Composite parent, int style, boolean required) {
		this(parent, style, required, true);
	}
	
	/**
	 * Load.
	 *
	 * @param translations2 the translations2
	 * @param editingDomain the editing domain
	 * @param required the required
	 */
	public void load(BTSTranslations translations2,
			EditingDomain editingDomain, boolean required) {
		this.translations = translations2;
		this.domain = editingDomain;
		this.required = required;
		if (bindingContext == null) {
			bindingContext = new DataBindingContext();
		}
		if (translations == null)
		{
			text.setText("");
			combo.select(0);
			return;
		}
		text.setText("");
		combo.setText("");
		
		// load built-in languages
		for (int i = 0; i < BTSCoreConstants.LANGS.length; i++) {
			String l = BTSCoreConstants.LANGS[i];
			String ltrans = translations.getTranslationStrict(l);
			if (ltrans != null) {
				combo.select(combo.indexOf(l));
				loadTranslation(l);
				return;
			}
		}
		combo.select(0);
		loadTranslation(combo.getItems()[0]);

	}

	/**
	 * Post construct.
	 */
	private void createControls() {
		setLayout(new GridLayout(3, false));
		setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		((GridLayout) this.getLayout()).marginWidth = 0;
		((GridLayout) this.getLayout()).marginHeight = 0;
		((GridLayout) this.getLayout()).horizontalSpacing = 0;
		this.setBackground(BTSUIConstants.VIEW_BACKGROUND_DESELECTED_COLOR);
		text = new Text(this, customStyle);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		text.setText("");
		
		Label l = new Label(this, SWT.NONE);
		l.setToolTipText("Set Language of Translation");
		l.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_LOCALE));
		l.setLayoutData(new GridData(SWT.RIGHT, SWT.BEGINNING, false, false, 1,
				1));
		((GridData) l.getLayoutData()).verticalIndent = 2;
		((GridData) l.getLayoutData()).horizontalIndent = 5;

		combo = new Combo(this, SWT.READ_ONLY);
		combo.setItems(BTSCoreConstants.LANGS);
		combo.setLayoutData(new GridData(SWT.RIGHT, SWT.BEGINNING, false,
				false, 1, 1));
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String lang = combo.getItem(combo.getSelectionIndex());
				loadTranslation(lang);
				for (SelectionListener l : languageSelectionListeners)
				{
					l.widgetSelected(e);
				}
			}
		});

		if (translations != null) {
			load(translations, domain, required);
		}
	}

	/**
	 * Load translation.
	 *
	 * @param lang the lang
	 */
	private void loadTranslation(String lang) {
		if(translations == null) return;
		BTSTranslation trans = translations.getBTSTranslation(lang);
		if (trans == null) {
			trans = BtsmodelFactory.eINSTANCE.createBTSTranslation();
			trans.setLang(lang);
			translations.getTranslations().add(trans);
			// Command command = AddCommand.create(domain, translations,
			// BtsmodelPackage.BTS_TRANSLATIONS__TRANSLATIONS, trans);
			// domain.getCommandStack().execute(command);
		}
		if (trans.getValue() == null) {
			trans.setValue("");
		}
		if (dataBind) {
			databindTranslation(trans);
		} else {
			text.setText(trans.getValue());
		}
	}

	private void databindTranslation(BTSTranslation trans) {
		EMFUpdateValueStrategy us = null;
		if (required) {
			us = new EMFUpdateValueStrategy();
			us.setBeforeSetValidator(new StringNotEmptyValidator());
		}
		if (binding != null && !binding.isDisposed()) {
			bindingContext.removeBinding(binding);
			binding.dispose();
		}
		if (binding == null || binding.isDisposed()) {
			binding = bindingContext.bindValue(
					WidgetProperties.text(SWT.Modify).observeDelayed(
							BTSUIConstants.DELAY, text),
					EMFEditProperties.value(domain,
							BtsmodelPackage.Literals.BTS_TRANSLATION__VALUE)
							.observe(trans), us, null);
	
			if (required) {
				bindingContext.addValidationStatusProvider(binding);
				BackgroundControlDecorationSupport.create(binding, SWT.TOP
						| SWT.LEFT);
			}
		}
		
	}
	
	@Override
	public void addFocusListener(FocusListener listener) {
		super.addFocusListener(listener);
		text.addFocusListener(listener);
		combo.addFocusListener(listener);
	}

	@Override
	public void removeFocusListener(FocusListener listener) {
		super.removeFocusListener(listener);
		text.removeFocusListener(listener);
		combo.removeFocusListener(listener);
	}

	public void save() {
		if (translations == null)
		{
			return;
		}
		BTSTranslation trans = translations.getBTSTranslation(combo.getItem(combo.getSelectionIndex()));
		if ((trans.getValue() == null && !"".equals(text.getText().trim()))
				|| !text.getText().equals(trans.getValue()))
		{
			org.eclipse.emf.common.command.Command command = SetCommand
					.create(domain, trans, BtsmodelPackage.Literals.BTS_TRANSLATION__VALUE, text.getText());
			domain.getCommandStack().execute(command);
		}
	}
	
	public void setTranslationText(String text)
	{
		this.text.setText(text != null ? text : "");
	}

	public String getLanguage()
	{
		return combo.getText();
	}
	
	public void addLanguageSelectionListener(SelectionListener listener)
	{
		if (listener != null && !languageSelectionListeners.contains(listener))
		{
			languageSelectionListeners.add(listener);
		}
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		if (!combo.isDisposed())
		{
			combo.setEnabled(enabled);
			text.setEnabled(enabled);
		}
		super.setEnabled(enabled);
	}
}
