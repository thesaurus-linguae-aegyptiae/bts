 
package org.bbaw.bts.ui.egy.parts;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.PostConstruct;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.corpus.controller.partController.EgyTextTranslationPartController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.SourceViewer;

public class EgyTextTranslationPart {
	private BTSIdentifiableItem selectedTextItem;
	private BTSText text;
	private MPart part;
	private SourceViewer textViewer;
	
	@Inject
	private EgyTextTranslationPartController translationController;
	private IAnnotationModel annotationModel;
	// boolean if object is loaded into gui
	private boolean loaded;

	// boolean if gui is constructed
	private boolean constructed;

	// boolean if selection is cached and can be loaded when gui becomes visible or constructed
	private boolean selectionCached;
	// FIXME integrate perferences!!!
	private String language = "de";

	@Inject
	public EgyTextTranslationPart(EPartService partService) {
		part = partService.findPart(BTSPluginIDs.PART_ID_EGY_TEXTTRANSLATION);
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		Composite composite_1 = new Composite(parent, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		((GridLayout) composite_1.getLayout()).marginHeight = 0;
		((GridLayout) composite_1.getLayout()).marginWidth = 0;
		textViewer = new SourceViewer(composite_1, null, SWT.BORDER | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
		StyledText styledText = textViewer.getTextWidget();
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		textViewer.setDocument(new Document());
		annotationModel = 		textViewer.getAnnotationModel();

		constructed = true;
		if (selectionCached)
		{
			loadInput(text);
		}
	}
	
	/**
	 * Sets the selection.
	 *
	 * @param selection the new selection
	 */
	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection) {
		if (selection == null) {
			// do nothing
			return;
		} else if (selection != null && !selection.equals(selectedTextItem)) {

			if (selection instanceof BTSCorpusObject) {
				
				if (constructed)
				{
					if (selection instanceof BTSText) {
						purgeCache();
						part.setLabel(selection.getName());
						makePartActive(true);
						loadInput((BTSText) selection);
						this.text = (BTSText) selection;
	
					} else if (loaded){
						purgeCache();
						loadInput(null);
						if (part != null) {
							part.setLabel("TextTranslation");
						}
						text = null;
						loaded = false;
						makePartActive(false);
					}
				}
				else if (selection instanceof BTSText) {
					this.text = (BTSText) selection;
					selectionCached = true;
				}
			}
			selectedTextItem = selection;
		}
	}

	/**
	 * Sets the focus.
	 */
	@Focus
	public void setFocus() {
		if (!loaded && selectionCached) // not yet loaded but has cached selection
		{
			loadInput(text);
		}
	}
	
	private void loadInput(BTSText text) {
		if (text == null)
		{
			textViewer.getDocument().set("");
			loaded = false;
		}
		else
		{
			String stringText = translationController.loadTranslation(text, language, annotationModel);
			textViewer.getDocument().set(stringText);
			loaded = true;
		}
	}

	private void purgeCache() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Make part active.
	 *
	 * @param activate the activate
	 */
	@SuppressWarnings("restriction")
	private void makePartActive(boolean activate) {
		if (activate)
		{
			textViewer.getTextWidget().setBackground(BTSUIConstants.COLOR_WIHTE);
		}
		else
		{
			textViewer.getTextWidget().setBackground(BTSUIConstants.COLOR_BACKGROUND_DISABLED);
		}
		
	}
	
	public String getLanguage()
	{
		return this.language;
	}
	
	public void setLanguage(String language)
	{
		if (this.language == null || !this.language.equals(language))
		{
			this.language = language;
			purgeCache();
			loadInput(text);
		}
	}
}