 
package org.bbaw.bts.ui.corpus.parts;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.PostConstruct;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.comparator.BTSObjectTempSortKeyComparator;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.AnnotationPartController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.parts.annotationsPart.RelatedObjectGroup;
import org.bbaw.bts.ui.corpus.parts.annotationsPart.RelatedObjectGroupAnnotation;
import org.bbaw.bts.ui.corpus.parts.annotationsPart.RelatedObjectGroupComment;
import org.bbaw.bts.ui.corpus.parts.annotationsPart.RelatedObjectGroupImpl;
import org.bbaw.bts.ui.corpus.parts.annotationsPart.RelatedObjectGroupRubrum;
import org.bbaw.bts.ui.corpus.parts.annotationsPart.RelatedObjectGroupSubtext;
import org.bbaw.bts.ui.corpus.parts.passportEditor.PassportEntryItemEditor;
import org.eclipse.swt.widgets.Composite;

import javax.annotation.PreDestroy;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Group;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class AnnotationsPart implements EventHandler {
	
	@Inject
	private AnnotationPartController annotationPartController;
	
	@Inject
	private UISynchronize sync;
	@Inject
	private EventBroker eventBroker;
	
	@Inject
	private ESelectionService selectionService;
	
	@Inject
	private IEclipseContext context;
	
	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;
	
	@Inject
	private Logger logger;
	
	private Composite composite;
	private ScrolledComposite scrollComposite;

	private Map<BTSObject, RelatedObjectGroup> objectWidgetMap;

	private List<RelatedObjectGroup> selectedGroups = new Vector<RelatedObjectGroup>(2);

	private List<RelatedObjectGroup> internalSelectedGroup = new Vector<RelatedObjectGroup>(2);

	private BTSTextSelectionEvent textSelectionEvent;

	private Listener selectionListener;

	private String queryId;

	private Map<String, List<BTSObject>> relatingObjectsQueryIDMap = new HashMap<String, List<BTSObject>>();

	private Listener resizeListener;

	protected boolean selfselection;

	@Inject
	public AnnotationsPart() {
		//TODO Your code here
	}
//	@PostConstruct
	public void postConstruct2(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Composite composite = new Composite(scrolledComposite, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Label lblDasdf = new Label(composite, SWT.NONE);
		lblDasdf.setText("dasdf");
		scrolledComposite.setContent(composite);
		scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		//TODO Your code here
	}
	@PostConstruct
	public void postConstruct(Composite parent) {
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.verticalSpacing = 0;
		gl_parent.marginWidth = 0;
		gl_parent.marginHeight = 0;
		gl_parent.horizontalSpacing = 0;
		parent.setLayout(gl_parent);
		
		
		
		scrollComposite = new ScrolledComposite(parent,
				SWT.V_SCROLL | SWT.H_SCROLL);
		scrollComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		scrollComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		scrollComposite.setMinWidth(100);
		scrollComposite.setMinHeight(400);
		composite = new Composite(scrollComposite, SWT.BORDER);
		scrollComposite.setExpandHorizontal(true);

		scrollComposite.setExpandVertical(true);
		scrollComposite.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				Rectangle r = scrollComposite.getClientArea();
				scrollComposite.setMinSize(composite.computeSize(r.width,
						SWT.DEFAULT));
			}
		});
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setLayout(new GridLayout(1, false));
		((GridLayout)composite.getLayout()).marginHeight = 0;
		((GridLayout)composite.getLayout()).marginWidth = 0;
		((GridLayout)composite.getLayout()).verticalSpacing = 0;
		

		scrollComposite.setContent(composite);
		eventBroker.subscribe("event_text_relating_objects/*", this);
	}
	
	@Inject
	@Optional
	void eventReceivedRelatingObjectsLoadedEvents(
			@EventTopic("event_text_relating_objects/*") Object event) {

		if (event != null && event instanceof List) {
			loadRelatingObjects((List<BTSObject>)event);

		}
	}

	
	private void loadRelatingObjects(List<BTSObject> list) {
		if (composite != null)
		{
			composite.dispose();
		}
		composite = null;
		composite = new Composite(scrollComposite, SWT.None);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setLayout(new GridLayout(1, false));
		((GridLayout)composite.getLayout()).marginHeight = 0;
		((GridLayout)composite.getLayout()).marginWidth = 0;
		((GridLayout)composite.getLayout()).verticalSpacing = 0;
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		scrollComposite.setContent(composite);
		objectWidgetMap = new HashMap<BTSObject, RelatedObjectGroup>(list.size()); 
		resizeListener = new Listener(){

			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event event) {
				Rectangle r = scrollComposite.getClientArea();
				composite.layout();
				scrollComposite.setMinSize(composite.computeSize(r.width,
						SWT.DEFAULT));
			}
			
		};
		
		selectionListener = new Listener(){

			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event event) {
				RelatedObjectGroup roGroup = (RelatedObjectGroup) event.widget;
				selfselection = true;
				setSelectedInternal(new RelatedObjectGroup[]{ roGroup});
				selfselection = false;
			}
			
		};
		
		Collections.sort(list, new BTSObjectTempSortKeyComparator());

		for (Object o : list)
		{
			if (o instanceof BTSObject)
			{
				RelatedObjectGroup roGroup = makeRelatedObjectGroup((BTSObject) o, composite);
				
				objectWidgetMap.put((BTSObject) o, roGroup);
			}
		}
		Rectangle r = scrollComposite.getClientArea();
		composite.layout();
		scrollComposite.setMinSize(composite.computeSize(r.width,
				SWT.DEFAULT));
	}

	private RelatedObjectGroup makeRelatedObjectGroup(BTSObject o,
			Composite composite2) {
		RelatedObjectGroup roGroup = null;
		IEclipseContext child = context.createChild("relatedObject:"
				+ ((BTSObject) o).get_id());

		child.set(Composite.class, composite);
		child.set(AnnotationsPart.class, this);
		child.set(BTSObject.class, (BTSObject) o);
		if (o instanceof BTSAnnotation)
		{
			if (BTSConstants.ANNOTATION_RUBRUM.equalsIgnoreCase(o.getType()))
			{
				roGroup = ContextInjectionFactory
						.make(RelatedObjectGroupRubrum.class, child);
			}
			else
			{
				roGroup = ContextInjectionFactory
						.make(RelatedObjectGroupAnnotation.class, child);
			}
		}
		else if (o instanceof BTSText)
		{
			roGroup = ContextInjectionFactory
					.make(RelatedObjectGroupSubtext.class, child);
		} 
		else if (o instanceof BTSComment)
		{
			roGroup = ContextInjectionFactory
					.make(RelatedObjectGroupComment.class, child);
		}
		else
		{
			roGroup = ContextInjectionFactory
					.make(RelatedObjectGroupImpl.class, child);
		}
		roGroup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		roGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
//		roGroup.postConstruct();
		roGroup.addResizeListener(resizeListener);
		roGroup.addSelectionListener(selectionListener);
		return roGroup;
	}
	protected void setSelectedInternal(RelatedObjectGroup[] selectedGroups) {
		if (internalSelectedGroup != null && internalSelectedGroup.equals(selectedGroups))
		{
			return;
		}
		for (RelatedObjectGroup roGroup : internalSelectedGroup)
		{
			if (!roGroup.isDisposed())
			{
				boolean found = false;
				if (selectedGroups != null)
				{
					for (RelatedObjectGroup g :  selectedGroups)
					{
						if (g.equals(roGroup))
						{
							found = true;
							break;
						}
					}
				}
				if (!found)
				{
					setDeselectGroup(roGroup);
				}
			}
		}
		internalSelectedGroup.clear();
		if (selectedGroups == null)
		{
			return;
		}
		for (RelatedObjectGroup g : selectedGroups)
		{
			internalSelectedGroup.add(g);
		}
		List<BTSObject> selObjects = new Vector<BTSObject>(internalSelectedGroup.size());
		
		// reveal
		if (!selfselection && !internalSelectedGroup.isEmpty())
		{
			RelatedObjectGroup first = internalSelectedGroup.get(0);
			scrollComposite.setOrigin(first.getLocation());
		}
		for (RelatedObjectGroup roGroup : internalSelectedGroup)
		{
			selObjects.add(roGroup.getObject());
			setSelectGroup(roGroup);
		}
		eventBroker.post(
				BTSUIConstants.EVENT_RELATING_OBJECTS_SELECTED,
				selObjects);
	}
	private void setSelectGroup(RelatedObjectGroup roGroup) {
//		WidgetElement.setCSSClass(roGroup.getGroup(), BTSUIConstants.CSS_SELECTED_CLASS_NAME);
//		System.out.println("select group " + roGroup.getObject().getName());
		roGroup.setSelected(true);
		
	}
	private void setDeselectGroup(RelatedObjectGroup roGroup) {
//		WidgetElement.setCSSClass(roGroup.getGroup(), BTSUIConstants.CSS_UNSELECTED_CLASS_NAME);
		roGroup.setSelected(false);

	}
	@PreDestroy
	public void preDestroy() {
		eventBroker.unsubscribe(this);
	}
	
	
	@Focus
	public void onFocus() {
		//TODO Your code here
	}

	@Override
	public void handleEvent(Event event) {
		switch(event.getTopic())
		{
		case "event_text_relating_objects/loaded" :
		{
//			eventReceivedRelatingObjectsLoadedEvents(event.getProperty("org.eclipse.e4.data"));
			break;
		}
		case "event_text_relating_objects/selected" :
		{
			eventReceivedRelatingObjectsSelectedEvents(event.getProperty("org.eclipse.e4.data"));
			break;
		}
		}
	}
	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		if ((selection instanceof BTSAnnotation || selection instanceof BTSComment)
				&& objectWidgetMap != null && objectWidgetMap.containsKey(selection))
		{
			RelatedObjectGroup g = objectWidgetMap.get(selection);
			if (g != null)
			{
				setSelectedInternal(new RelatedObjectGroup[]{g});
			}
		}
		else if (selection instanceof BTSObject)
		{
			relatingObjectsQueryIDMap.clear();
			List<BTSObject> relatingObjects = annotationPartController.findRelatingObjects((BTSObject) selection);
			queryId = "relations.objectId-" + ((BTSObject) selection).get_id();
			relatingObjectsQueryIDMap.put(queryId, relatingObjects);
			eventReceivedRelatingObjectsLoadedEvents(relatingObjects);
		}
		else if (selection instanceof BTSTextSelectionEvent)
		{
			this.textSelectionEvent = (BTSTextSelectionEvent) selection;
			eventReceivedRelatingObjectsSelectedEvents(textSelectionEvent.getRelatingObjects());
		}
	}
	
//	@Inject
//	public void setSelection(
//		@Optional	@Named(IServiceConstants.ACTIVE_SELECTION) BTSTextSelectionEvent selection) {
//		if (selection != null)
//		{
//			this.textSelectionEvent = selection;
//			eventReceivedRelatingObjectsSelectedEvents(selection.getRelatingObjects());
//		}
//	}
	private void eventReceivedRelatingObjectsSelectedEvents(Object objects) {
		if (objects == null)
		{
			setSelectedInternal(null);
		}
		if (objects instanceof List<?>)
		{
			List<BTSObject> os = (List<BTSObject>) objects;
			List<RelatedObjectGroup> groups = new Vector<RelatedObjectGroup>(os.size());
			for (BTSObject o : os)
			{
				RelatedObjectGroup g = objectWidgetMap.get(o);
				if (g != null)
				{
					groups.add(g);
				}
			}
			setSelectedInternal(groups.toArray(new RelatedObjectGroup[groups.size()]));
		}
		
	}
	public BTSTextSelectionEvent getTestSelectionEvent() {
		return textSelectionEvent;
	}
	
	@Inject
	@Optional
	void eventReceivedUpdates(@EventTopic("model_update/*") BTSModelUpdateNotification notification)
	{
		logger.info("AnnotationsPart eventReceivedUpdates. object: " + notification);
		if (notification.getQueryIds() != null){
			for (String id : notification.getQueryIds())
			{
				if (id.equals(queryId))
				{
					processModelUpdate(notification, id);
				}
			}
		}
	}
	private void processModelUpdate(final BTSModelUpdateNotification notification, String id) {
		List<BTSObject> relatingObjects = relatingObjectsQueryIDMap.get(id);
		if (!relatingObjects.contains(notification.getObject()))
		{
			relatingObjects.add((BTSObject) notification.getObject());
			sync.asyncExec(new Runnable() {
				public void run() {
					addObjectToViewerList((BTSObject) notification.getObject());
				}
			});
			
		}
		else
		{
			final RelatedObjectGroup group = objectWidgetMap.get(notification.getObject());
			if (group != null){
				sync.asyncExec(new Runnable() {
					public void run() {
						updateUIGroup(group, (BTSObject) notification.getObject());
					}
				});
				
			}
		}
		
	}
	private void updateUIGroup(RelatedObjectGroup group, BTSObject object) {
		// TODO Auto-generated method stub
		
	}
	private void addObjectToViewerList(BTSObject object) {
		RelatedObjectGroup roGroup = makeRelatedObjectGroup(object, composite);
		objectWidgetMap.put(object, roGroup);
		Rectangle r = scrollComposite.getClientArea();
		composite.layout();
		scrollComposite.setMinSize(composite.computeSize(r.width,
				SWT.DEFAULT));
	}
	@Persist
	public void save()
	{
		
	}
}