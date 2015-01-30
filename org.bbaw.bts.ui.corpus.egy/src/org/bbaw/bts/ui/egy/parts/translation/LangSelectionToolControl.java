package org.bbaw.bts.ui.egy.parts.translation;

import java.util.List;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.egy.parts.EgyTextEditorPart;
import org.bbaw.bts.ui.egy.parts.EgyTextTranslationPart;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class LangSelectionToolControl {
	
	/** The resource provider. */
	@Inject
	private BTSResourceProvider resourceProvider;
	
	@Inject
	private EPartService partService;
	private Combo combo;
	private Composite parent;

	@Inject
	public LangSelectionToolControl() {
		
	}
	
	@PostConstruct
	public void createGui(Composite parent) {
		this.parent = parent;
		this.parent.setLayout(new GridLayout(2, false));
		Label l = new Label(parent, SWT.NONE);
		l.setToolTipText("Set Language of Translation");
		l.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_LOCALE));
		l.setLayoutData(new GridData(SWT.RIGHT, SWT.BEGINNING, false, false, 1,
				1));
		((GridData) l.getLayoutData()).verticalIndent = 2;
		((GridData) l.getLayoutData()).horizontalIndent = 5;

		combo = new Combo(parent, SWT.READ_ONLY);
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
		combo.select(0);
	}
	
	protected void loadTranslation(String lang) {
		MPart part = partService.getActivePart();
		if (part.getObject() instanceof EgyTextTranslationPart)
		{
			EgyTextTranslationPart translationPart = (EgyTextTranslationPart) part.getObject();
			translationPart.setLanguage(lang);
		}
		
	}

//	/**
//	 * Load.
//	 *
//	 * @param translations2 the translations2
//	 * @param editingDomain the editing domain
//	 * @param required the required
//	 */
//	public void load(BTSTranslations translations2,
//			EditingDomain editingDomain, boolean required) {
//		
//		List ls = translations.getLanguages();
//		List<String> additionalInputs = new Vector<String>(ls.size());
//		for (Object o : ls) {
//			if (o instanceof String) {
//				boolean found = false;
//				for (String s : BTSCoreConstants.LANGS) {
//					if (s.equals(o)) {
//						found = true;
//						break;
//					}
//				}
//				if (!found) {
//					additionalInputs.add((String) o);
//				}
//			}
//		}
//		if (!additionalInputs.isEmpty()) {
//			for (String s : BTSCoreConstants.LANGS) {
//				if (!additionalInputs.contains(s)) {
//					additionalInputs.add(s);
//				}
//			}
//			combo.setItems(additionalInputs.toArray(new String[additionalInputs
//					.size()]));
//		}
//
//		if (lang != null) {
//			combo.select(combo.indexOf(lang));
//
//			loadTranslation(lang);
//			return;
//		}
//		if (translations.getBTSTranslation(BTSCoreConstants.LANG_EN) != null) {
//			combo.select(combo.indexOf(BTSCoreConstants.LANG_EN));
//			loadTranslation(BTSCoreConstants.LANG_EN);
//		} else if (translations.getBTSTranslation(BTSCoreConstants.LANG_DE) != null) {
//			combo.select(combo.indexOf(BTSCoreConstants.LANG_DE));
//
//			loadTranslation(BTSCoreConstants.LANG_DE);
//		} else if (translations.getBTSTranslation(BTSCoreConstants.LANG_FR) != null) {
//			combo.select(combo.indexOf(BTSCoreConstants.LANG_FR));
//
//			loadTranslation(BTSCoreConstants.LANG_FR);
//		} else if (translations.getBTSTranslation(BTSCoreConstants.LANG_ES) != null) {
//			combo.select(combo.indexOf(BTSCoreConstants.LANG_ES));
//
//			loadTranslation(BTSCoreConstants.LANG_ES);
//		} else if (translations.getBTSTranslation(BTSCoreConstants.LANG_RU) != null) {
//			combo.select(combo.indexOf(BTSCoreConstants.LANG_RU));
//
//			loadTranslation(BTSCoreConstants.LANG_RU);
//		} else {
//			combo.select(0);
//
//			loadTranslation(combo.getItem(0));
//		}
//		if (translations == null) {
//			return;
//		}
//
//	}
}