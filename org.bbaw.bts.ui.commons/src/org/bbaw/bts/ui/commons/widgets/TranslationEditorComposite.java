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

import java.util.List;
import java.util.Vector;

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
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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

	/** The lang. */
	private String lang;

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
			BTSTranslations translations, EditingDomain domain, boolean required) {
		super(parent, SWT.NONE);
		this.translations = translations;
		this.domain = domain;
		this.required = required;
		this.customStyle = style;
		postConstruct();
		if (translations != null) {
			load(translations, domain, required);
		}
	}

	/**
	 * Instantiates a new translation editor composite.
	 *
	 * @param parent the parent
	 * @param style the style
	 * @param required the required
	 */
	public TranslationEditorComposite(Composite parent, int style,
			boolean required) {
		super(parent, SWT.NONE);
		this.required = required;
		this.customStyle = style;
		postConstruct();
		if (translations != null) {
			load(translations, domain, required);
		}
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
		if (translations == null)
		{
			text.setText("");
			return;
		}
		
		List ls = translations.getLanguages();
		List<String> additionalInputs = new Vector<String>(ls.size());
		for (Object o : ls) {
			if (o instanceof String) {
				boolean found = false;
				for (String s : BTSCoreConstants.LANGS) {
					if (s.equals(o)) {
						found = true;
						break;
					}
				}
				if (!found) {
					additionalInputs.add((String) o);
				}
			}
		}
		if (!additionalInputs.isEmpty()) {
			for (String s : BTSCoreConstants.LANGS) {
				if (!additionalInputs.contains(s)) {
					additionalInputs.add(s);
				}
			}
			combo.setItems(additionalInputs.toArray(new String[additionalInputs
					.size()]));
		}

		if (lang != null) {
			combo.select(combo.indexOf(lang));

			loadTranslation(lang);
			return;
		}
		if (translations.getBTSTranslation(BTSCoreConstants.LANG_EN) != null) {
			combo.select(combo.indexOf(BTSCoreConstants.LANG_EN));
			loadTranslation(BTSCoreConstants.LANG_EN);
		} else if (translations.getBTSTranslation(BTSCoreConstants.LANG_DE) != null) {
			combo.select(combo.indexOf(BTSCoreConstants.LANG_DE));

			loadTranslation(BTSCoreConstants.LANG_DE);
		} else if (translations.getBTSTranslation(BTSCoreConstants.LANG_FR) != null) {
			combo.select(combo.indexOf(BTSCoreConstants.LANG_FR));

			loadTranslation(BTSCoreConstants.LANG_FR);
		} else if (translations.getBTSTranslation(BTSCoreConstants.LANG_ES) != null) {
			combo.select(combo.indexOf(BTSCoreConstants.LANG_ES));

			loadTranslation(BTSCoreConstants.LANG_ES);
		} else if (translations.getBTSTranslation(BTSCoreConstants.LANG_RU) != null) {
			combo.select(combo.indexOf(BTSCoreConstants.LANG_RU));

			loadTranslation(BTSCoreConstants.LANG_RU);
		} else {
			combo.select(0);

			loadTranslation(combo.getItem(0));
		}
		if (translations == null) {
			return;
		}

	}

	/**
	 * Post construct.
	 */
	private void postConstruct() {
		setLayout(new GridLayout(3, false));
		setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		((GridLayout) this.getLayout()).marginWidth = 0;
		((GridLayout) this.getLayout()).marginHeight = 0;
		((GridLayout) this.getLayout()).horizontalSpacing = 0;
		this.setBackground(BTSUIConstants.VIEW_BACKGROUND_DESELECTED_COLOR);
		text = new Text(this, customStyle);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
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
			}
		});

	}

	/**
	 * Load translation.
	 *
	 * @param lang the lang
	 */
	private void loadTranslation(String lang) {

		this.lang = lang;
		BTSTranslation trans = translations.getBTSTranslation(lang);
		if (trans == null) {
			trans = BtsmodelFactory.eINSTANCE.createBTSTranslation();
			trans.setLang(lang);
			translations.getTranslations().add(trans);
			// Command command = AddCommand.create(domain, translations,
			// BtsmodelPackage.BTS_TRANSLATIONS__TRANSLATIONS, trans);
			// domain.getCommandStack().execute(command);
		}
		if (bindingContext != null) {
			bindingContext.dispose();
		}
		bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy us = null;
		if (required) {
			us = new EMFUpdateValueStrategy();
			us.setBeforeSetValidator(new StringNotEmptyValidator());
		}
		Binding binding = bindingContext.bindValue(
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
		trans.setValue(text.getText());
	}
	
	public void setTranslationText(String text)
	{
		if (text != null)
		{
			this.text.setText(text);
		}
	}
}
