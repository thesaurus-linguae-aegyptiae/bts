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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TranslationEditorComposite extends Composite {
	private Text text;

	private BTSResourceProvider resourceProvider = StaticAccessController
			.getResourceProvider();

	private BTSTranslations translations;

	private EditingDomain domain;

	private boolean required;

	private int customStyle;

	private Combo combo;

	private DataBindingContext bindingContext;

	private String lang;

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
	public void load(BTSTranslations translations2,
			EditingDomain editingDomain, boolean required) {
		Assert.isNotNull(translations2);
		Assert.isNotNull(editingDomain);
		this.translations = translations2;
		this.domain = editingDomain;
		this.required = required;
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

}
