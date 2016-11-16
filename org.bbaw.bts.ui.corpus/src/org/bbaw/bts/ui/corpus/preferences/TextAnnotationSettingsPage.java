package org.bbaw.bts.ui.corpus.preferences;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.corpus.controller.generalController.PassportConfigurationController;
import org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsFilterEvent;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.internal.Activator;
import org.bbaw.bts.ui.corpus.parts.passportEditor.PassportEntryItemEditor;
import org.bbaw.bts.ui.corpus.preferences.textAnnotationSettings.TextAnnotationSettingsEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.eclipse.core.internal.preferences.EclipsePreferences;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class TextAnnotationSettingsPage extends FieldEditorPreferencePage {

	private List<EclipsePreferences> annotationsNodes;

	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private EclipsePreferences annotationsNode;

	private ScrolledComposite scrComposite;

	private Composite container;

	private IEclipseContext context;

	private List<TextAnnotationSettingsEditor> settingsEditors;

	private Button newBTN;

	private ScrolledComposite sc;

	private Composite child;

	private int variant = 1;

	private EventBroker eventBroker;
	/**
	 * Create the preference page.
	 */
	public TextAnnotationSettingsPage() {
		super(FLAT);
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		eventBroker = StaticAccessController.getContext().get(EventBroker.class);

		container = (Composite) this.getControl();
//		// Create the field editors
//		addField(new ColorFieldEditor(BTSCorpusConstants.PREF_COMMENT_COLOR, "Comment Color", getFieldEditorParent()));
//		addField(new ColorFieldEditor(BTSCorpusConstants.PREF_SUBTEXT_COLOR, "Subtext Color", getFieldEditorParent()));
//		
		
		context = StaticAccessController.getContext();
		annotationsNodes = loadAnnotationPreferenceNodes();
		// add button plus
		newBTN = new Button(container, SWT.PUSH);
		newBTN.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
				false, 1, 1));
		newBTN.setText("Add Annotation Styling");
		newBTN.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Preferences newNode = annotationsNode.create(annotationsNode, "node" + (annotationsNodes.size() - 1));
				annotationsNodes.add((EclipsePreferences) newNode);
				addEditor(newNode, annotationsNodes.size() - 1);
				Point p = sc.getSize();
				sc.setSize(p.x + variant, p.y);
				variant  = -variant;
			}
		});
	    
	    sc = new ScrolledComposite(container, SWT.H_SCROLL
	            | SWT.V_SCROLL | SWT.BORDER);
	    sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
	    sc.setLayout(new FillLayout(SWT.VERTICAL));
	    
	
	    // Create a child composite to hold the controls
	    child = new Composite(sc, SWT.NONE);
	    child.setLayout(new GridLayout(1, true));
	    child.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		loadContents();
	
	    // Set the child as the scrolled content of the ScrolledComposite
	    sc.setContent(child);
	
	    // Set the minimum size
	    sc.setMinSize(200, 250);
	
	    // Expand both horizontally and vertically
	    sc.setExpandHorizontal(true);
	    sc.setExpandVertical(true);
	    sc.addControlListener(new ControlAdapter() {
		@Override
		public void controlResized(ControlEvent e) {
			Rectangle r = sc.getClientArea();
			sc.setMinSize(child.computeSize(r.width,
					SWT.DEFAULT));
			}
		});
        sc.layout();
        container.layout();
	}

	/**
	 * @param scrComposite
	 */
	private void loadContents() {
		settingsEditors = new Vector<TextAnnotationSettingsEditor>(annotationsNodes.size());

		int index = 0;
		for (Preferences node : annotationsNodes)
		{
			addEditor(node, index);
			
			index++;
		}
	}

	/**
	 * @param node
	 * @param index
	 */
	private void addEditor(Preferences node, int index) {
		String nodePath = "node:" + index + ":" 
				+ node.absolutePath();
		Composite composite = new Composite(child, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		composite.setLayout(new GridLayout(1, true));
		((GridLayout) composite.getLayout()).marginWidth = 0;
		((GridLayout) composite.getLayout()).marginHeight = 0;
		IEclipseContext child = context.createChild(nodePath);

		child.set(Composite.class, composite);
		child.set(Preferences.class, node);
		child.set(ComposedAdapterFactory.class, factory);

		child.set(TextAnnotationSettingsPage.class,
				this);
		TextAnnotationSettingsEditor settingsEditor = ContextInjectionFactory
				.make(TextAnnotationSettingsEditor.class, child);
		settingsEditors.add(settingsEditor);
	}

	/**
	 * @return
	 */
	private List<EclipsePreferences> loadAnnotationPreferenceNodes() {
		Preferences rootNode = ConfigurationScope.INSTANCE.getNode(Activator.BUNDLE_ID);
		
		annotationsNode = (EclipsePreferences) rootNode.node(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS);
		List<EclipsePreferences> nodes = new Vector<EclipsePreferences>();
		if (annotationsNode != null)
		{
			try {
				for (String n : annotationsNode.childrenNames())
				{
					if (annotationsNode.nodeExists(n))
					{
						nodes.add((EclipsePreferences) annotationsNode.node(n));
					}
				}
			} catch (BackingStoreException e) {
				e.printStackTrace();
			}
		}
				
		return nodes;
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		eventBroker = StaticAccessController.getContext().get(EventBroker.class);

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		for (TextAnnotationSettingsEditor editor : settingsEditors)
		{
			editor.save();
		}
		eventBroker.post("event_preferences_changed/"+BTSCorpusConstants.PREF_ANNOTATION_SETTINGS, 
				annotationsNode.absolutePath());
		try {
			annotationsNode.flush();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.performOk();
	}
	
	
	/**
	 * @param selectionAdapter
	 * @param node
	 */
	public void delete(TextAnnotationSettingsEditor editor, Preferences node) {
		annotationsNodes.remove(node);
		annotationsNode.remove(node.name());
		settingsEditors.remove(editor);
		editor.getParent().dispose();
		Point p = sc.getSize();
		sc.setSize(p.x + variant, p.y);
		variant  = -variant;
	}
}
