package org.bbaw.bts.ui.egy.parts;

import java.util.Iterator;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import jsesh.editor.JMDCEditor;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextContent;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.text.btsdsl.ui.internal.BTSActivator;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.BTSTextXtextEditedResourceProvider;
import org.bbaw.bts.ui.egy.textSign.SignTextComposite;
import org.bbaw.bts.ui.font.BTSFontManager;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.VerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Injector;

import e4.test.helper.StaticAccess;

public class EgyTextEditorPart
{

	@Inject
	private BTSFontManager fontManager;

	@Inject
	private BTSTextEditorController textEditorController;
	@Inject
	private ESelectionService selectionService;
	@Inject
	private UISynchronize sync;
	@Inject
	private EventBroker eventBroker;
	@Inject
	IEclipseContext context;
	@Inject
	private EContextService contextService;
	@Inject
	private ECommandService commandService;

	@Inject
	private EHandlerService handlerService;

	private static final String FONT_NAME = "FreeSans";
	private static final int SIZE = 10;

	private StyledText styledText;
	private BTSText text;
	private Widget shell;
	private CTabItem tbtmBtseditor;
	private CTabFolder tabFolder;
	private StyledText plainTextEditor;
	private Text codeBufferText;
	private JMDCEditor jseshEditor;

	protected int counter;

	protected boolean loading;

	private VerticalRuler verticalRuler;

	private ProjectionViewer textViewer;

	private Document document;

	private IAnnotationModel annotationModel;

	protected int tabSelection;


	private Map<Object, BTSSentenceItem> ramsesTextModelMap;

	private SignTextComposite signTextEditor;

	private Composite btsEditorComp;

	private EmbeddedEditorFactory embeddedEditorFactory;

	private Injector injector;

	private BTSTextXtextEditedResourceProvider resourceProvider = new BTSTextXtextEditedResourceProvider();

	private EmbeddedEditor embeddedEditor;

	private Composite embeddedEditorComp;

	private EmbeddedEditorModelAccess embeddedEditorModelAccess;

	private Composite embeddedEditorParentComp;

	/**
	 * @param parent
	 */
	@PostConstruct
	public void createComposite(Composite parent)
	{
		resourceProvider.setController(textEditorController);
		parent.setLayout(new GridLayout());
		shell = new Shell();
		contextService
				.activateContext("org.eclipse.ui.contexts.dialogAndWindow");
		System.out.println("EgyEditor postconstruct");
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		{
			tabFolder = new CTabFolder(composite, SWT.BORDER | SWT.BOTTOM);
			tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
			tabFolder.setLayout(new GridLayout());
			tabFolder.addSelectionListener(new SelectionAdapter()
			{


				@Override
				public void widgetSelected(SelectionEvent e)
				{
					int oldSelection = tabSelection;
					tabSelection = tabFolder.getSelectionIndex();
					if (tabSelection == oldSelection)
					{
						return;
					} else
					{
						//update model from old selection editor
						switch (oldSelection)
						{
							case 0:
							{
								updateModelFromTranscription();
								break;
							}
							case 1:
							{
								updateModelFromSignText();
								break;
							}
							case 2:
							{
								updateModelFromJSesh();
								break;
							}
						}

						// load updated model into selected editor
						switch (tabSelection)
						{
							case 0:
							{
								contextService
								.activateContext("org.eclipse.xtext.ui.embeddedTextEditorScope");
								loadInputTranscription(text);
								break;
							}
							case 1:
							{
							
								loadInputSignText(text);
								break;
							}
							case 2:
							{
								loadInputJSesh(text);
								break;
							}
						}
					}

				}
			});

			tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
					SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
			{
//
//				CTabItem edTab = new CTabItem(tabFolder, SWT.NONE);
//				edTab.setText("Transliteration");
//
//				{
//					btsEditorComp = new Composite(tabFolder, SWT.BORDER);
//					btsEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
//					Label l = new Label(btsEditorComp, SWT.NONE);
//					l.setText("Hallo");
//					// btsEditorComp.setLayout(new FillLayout());
//					//					((FillLayout) btsEditorComp.getLayout()).
//					edTab.setControl(btsEditorComp);
//					// StaticAccess sa = context.get(StaticAccess.class);
//					// BTSActivator activator = BTSActivator.getInstance();
//					// injector =
//					// activator.getInjector(BTSActivator.ORG_BBAW_BTS_CORPUS_TEXT_BTSDSL_BTS);
//					// // PlatformUI.createAndRunWorkbench(Display.getCurrent(),
//					// // new ApplicationWorkbenchAdvisor());
//					// EmbeddedEditorFactory embeddedEditorFactory = injector
//					// .getInstance(EmbeddedEditorFactory.class);
//					// IEditedResourceProvider resourceProvider = new
//					// IEditedResourceProvider() {
//					//
//					// @Override
//					// public XtextResource createResource() {
//					// try {
//					// BTSStandaloneSetup.doSetup();
//					// ResourceSet resourceSet = new ResourceSetImpl();
//					// String fname =
//					// "E:/AAEW/test/runtime-EclipseXtext/tt/btstest.bts";
//					// File f = new File(fname);
//					// if (f.exists())
//					// System.out.println("TOLL");
//					// Resource resource = resourceSet
//					// .createResource(URI.createURI(fname));
//					//
//					// return (XtextResource) resource;
//					// } catch (Exception e) {
//					// return null;
//					// }
//					// }
//					// };
//					// embeddedEditor = embeddedEditorFactory.newEditor(
//					// resourceProvider).withParent(btsEditorComp);
//					//
//					// // keep the partialEditor as instance var to read / write
//					// the edited text
//					// embeddedEditorModelAccess =
//					// embeddedEditor.createPartialEditor(true);
//
//					// BTSActivator activator = BTSActivator.getInstance();
//					// injector =
//					// activator.getInjector(BTSActivator.ORG_BBAW_BTS_CORPUS_TEXT_BTSDSL_BTS);
//					//
//					// embeddedEditorFactory =
//					// injector.getInstance(EmbeddedEditorFactory.class);
//					// resourceProvider.setText(text);
//					// embeddedEditorComp = new Composite(btsEditorComp,
//					// SWT.None);
//					// embeddedEditor =
//					// embeddedEditorFactory.newEditor(resourceProvider).withParent(embeddedEditorComp);
//					//
//					// // keep the partialEditor as instance var to read / write
//					// the edited text
//					// embeddedEditorModelAccess =
//					// embeddedEditor.createPartialEditor(true);
//
//					btsEditorComp.layout();
//				}
				CTabItem tbtmPlaintext2 = new CTabItem(tabFolder, SWT.NONE);
				tbtmPlaintext2.setText("Transliteration");
				{
					embeddedEditorParentComp = new Composite(tabFolder,
							SWT.NONE | SWT.BORDER);
					embeddedEditorParentComp.setLayout(new GridLayout());
					embeddedEditorComp = new Composite(
							embeddedEditorParentComp, SWT.NONE
							| SWT.BORDER);
					embeddedEditorComp.setLayout(new GridLayout());
					embeddedEditorComp.setLayoutData(new GridData(SWT.FILL,
							SWT.FILL, true, true));
					tbtmPlaintext2.setControl(embeddedEditorParentComp);
					// Label l = new Label(plainTextComp, SWT.NONE);
					// l.setText("Hallo");
					Button b = new Button(embeddedEditorComp, SWT.NONE);
					b.setText("Save");
					b.addSelectionListener(new SelectionListener() {

						@Override
						public void widgetSelected(SelectionEvent e) {
							System.out.println("Save");
							IAnnotationModel am = embeddedEditor.getViewer()
									.getAnnotationModel();
							IXtextDocument document = embeddedEditor
									.getDocument();
							EList<EObject> objects = document
									.readOnly(new IUnitOfWork<EList<EObject>, XtextResource>() {
										@Override
										public EList<EObject> exec(
												XtextResource state)
												throws Exception {
											return state.getContents();
										}
									});
							EObject eo = objects.get(0);
							if (eo instanceof BTSTextContent) {
								text.setTextContent((BTSTextContent) eo);
								textEditorController.save(text);
							}
							System.out.println(eo);
							System.out.println(am);
							Iterator i = am.getAnnotationIterator();
							while (i.hasNext()) {
								Object a = i.next();
								System.out.println(a);
								Position p = am.getPosition((Annotation) a);
								System.out.println(p.offset + " " + p.length);
							}
							// am.addAnnotation(new BulletAnnotation(0),
							// new Position(0, 5));

						}

						@Override
						public void widgetDefaultSelected(SelectionEvent e) {
							// TODO Auto-generated method stub

						}
					});
					StaticAccess sa = context.get(StaticAccess.class);
					BTSActivator activator = BTSActivator.getInstance();
					injector = activator
							.getInjector(BTSActivator.ORG_BBAW_BTS_CORPUS_TEXT_BTSDSL_BTS);
					// PlatformUI.createAndRunWorkbench(Display.getCurrent(),
					// new ApplicationWorkbenchAdvisor());
					embeddedEditorFactory = injector
							.getInstance(EmbeddedEditorFactory.class);
					// IEditedResourceProvider resourceProvider = new
					// IEditedResourceProvider() {
					//
					// @Override
					// public XtextResource createResource() {
					// try {
					// BTSStandaloneSetup.doSetup();
					// ResourceSet resourceSet = new ResourceSetImpl();
					// String fname =
					// "E:/AAEW/test/runtime-EclipseXtext/tt/btstest.bts";
					// File f = new File(fname);
					// if (f.exists())
					// System.out.println("TOLL");
					// Resource resource = resourceSet
					// .createResource(URI.createURI(fname));
					//
					// return (XtextResource) resource;
					// } catch (Exception e) {
					// return null;
					// }
					// }
					// };
					embeddedEditor = embeddedEditorFactory.newEditor(
							resourceProvider).withParent(embeddedEditorComp);

					 // keep the partialEditor as instance var to read / write
					// the edited text
					 embeddedEditorModelAccess =
					 embeddedEditor.createPartialEditor(true);

					embeddedEditorComp.layout();
					embeddedEditorComp.pack();
				}
				CTabItem signTextTab = new CTabItem(tabFolder, SWT.NONE);
				signTextTab.setText("Sign-Text-Editor");
				{
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE
							| SWT.BORDER);
					plainTextComp.setLayout(new GridLayout());
					signTextTab.setControl(plainTextComp);
					signTextEditor = new SignTextComposite(plainTextComp,
							SWT.None);
					signTextEditor.setEventBroker(eventBroker);
					plainTextComp.layout();
					plainTextComp.pack();
				}

			}

		}
		tabFolder.setSelection(0);
		composite.layout();
		composite.pack();
		parent.layout();
	}

	protected void updateModelFromSignText()
	{
		// TODO Auto-generated method stub

	}

	protected void updateModelFromJSesh()
	{
		// TODO Auto-generated method stub

	}


	protected void updateModelFromTranscription()
	{
		// this.text = textEditorController.updateTextFromDocument(text,
		// document, annotationModel, textViewer);

	}

	protected void loadInputJSesh(BTSText text2)
	{
		// TODO Auto-generated method stub

	}

	protected void loadInputTranscription(BTSText localtext)
	{
		if (embeddedEditorComp != null)
		{
			embeddedEditorComp.dispose();
			embeddedEditorComp = null;
		}
		embeddedEditorComp = new Composite(embeddedEditorParentComp, SWT.None);
		embeddedEditorComp.setLayout(new GridLayout());
		embeddedEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		Button b = new Button(embeddedEditorComp, SWT.NONE);
		b.setText("Save");
		b.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("hallo");
				IAnnotationModel am = embeddedEditor.getViewer()
						.getAnnotationModel();
				IXtextDocument document = embeddedEditor.getDocument();
				EList<EObject> objects = document
						.readOnly(new IUnitOfWork<EList<EObject>, XtextResource>() {
							@Override
							public EList<EObject> exec(XtextResource state)
									throws Exception {
								return state.getContents();
							}
						});
				EObject eo = objects.get(0);
				if (eo instanceof BTSTextContent) {
					text.setTextContent((BTSTextContent) eo);
					textEditorController.save(text);
				}
				System.out.println(eo);
				System.out.println(eo);
				System.out.println(am);
				Iterator i = am.getAnnotationIterator();
				while (i.hasNext()) {
					Object a = i.next();
					System.out.println(a);
					Position p = am.getPosition((Annotation) a);
					System.out.println(p.offset + " " + p.length);
				}
				// am.addAnnotation(new BulletAnnotation(0),
				// new Position(0, 5));

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		Document doc = new Document();
		this.document = doc;

		IAnnotationModel model = new AnnotationModel();
		this.annotationModel = model;
		textEditorController.transformToDocument(text, doc, model);

		resourceProvider.setDocument(doc);
		resourceProvider.setText(text);
		embeddedEditor = embeddedEditorFactory.newEditor(resourceProvider)
				.withParent(embeddedEditorComp);

		// keep the partialEditor as instance var to read / write the edited
		// text
		embeddedEditorModelAccess = embeddedEditor.createPartialEditor(true);
		IAnnotationModel am = embeddedEditor.getViewer().getAnnotationModel();
		Iterator i = model.getAnnotationIterator();
		while (i.hasNext()) {
			Object a = i.next();
			if (a instanceof Annotation) {
				am.addAnnotation((Annotation) a,
						model.getPosition((Annotation) a));
			}
		}
		embeddedEditorParentComp.layout();
		embeddedEditor.getViewer().getControl().setFocus();
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/BTSWord*") Object object)
	{
	}

	@Inject
	void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection)
	{
		if (selection == null)
		{
			/* implementation not shown */
		} else
		{
			if (selection instanceof BTSText)
			{
				loadInput((BTSCorpusObject) selection);
			}
		}
	}

	private void loadInput(BTSCorpusObject o)
	{
		if (tabFolder != null && o instanceof BTSText)
		{
			if (!o.equals(text))
			{
				purgeCache();
			}
			this.text = (BTSText) o;

			switch (tabFolder.getSelectionIndex())
			{
				case 0:
				{
					loadInputTranscription(text);
					break;
				}
				case 1:
				{
					loadInputSignText(text);
					break;
				}
				case 2:
				{
					loadInputJSesh(text);
					break;
				}
			}

			//			plainTextEditor.setText(((BTSText) o).getCode());
		} else
		{
			// plainTextEditor.setText("");
		}

	}

	private void loadInputSignText(BTSText text2)
	{
		if (text2 == null || text2.getTextContent() == null
				|| text2.getTextContent().getTextItems().isEmpty())
			text2 = createMockUp(text2);
		signTextEditor.setInput(text2);

	}

	private BTSText createMockUp(BTSText text2) {
		if (text2 == null) {
			text2 = BtsmodelFactory.eINSTANCE.createBTSText();
		}
		if (text2.getTextContent() == null) {
			text2.setTextContent(BtsmodelFactory.eINSTANCE
					.createBTSTextContent());
		}
		BTSSenctence sentence = BtsmodelFactory.eINSTANCE.createBTSSenctence();

		for (int i = 0; i < 20; i++) {
			BTSWord w = BtsmodelFactory.eINSTANCE.createBTSWord();
			w.setWChar(i + "hh");
			BTSGraphic g = BtsmodelFactory.eINSTANCE.createBTSGraphic();
			g.setCode("n-s-t");
			w.getGraphics().add(g);
			sentence.getSentenceItems().add(w);
		}
		text2.getTextContent().getTextItems().add(sentence);

		return text2;
	}

	private void purgeCache()
	{

	}

	@Focus
	public void setFocus()
	{
		// embeddedEditor.getViewer().getControl().setFocus();
	}

	public boolean save()
	{
		switch (tabFolder.getSelectionIndex())
		{
			case 0:
			{
				updateModelFromTranscription();
				break;
			}
			case 1:
			{
				updateModelFromSignText();
				break;
			}
			case 2:
			{
				updateModelFromJSesh();
				break;
			}
		}
		return textEditorController.save(this.text);
	}

}
