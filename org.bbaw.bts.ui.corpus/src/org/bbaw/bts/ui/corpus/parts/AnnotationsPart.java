 
package org.bbaw.bts.ui.corpus.parts;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsLoadingEvent;
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

import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class AnnotationsPart implements EventHandler {
	
	private static final int MAX_RELATED_OBJECTS = 40;

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
	
	/** The part service. */
	@Inject
	private EPartService partService;
	
	private Composite composite;
	private ScrolledComposite scrollComposite;

	private Map<BTSObject, RelatedObjectGroup> objectWidgetMap = new HashMap<BTSObject, RelatedObjectGroup>();

	private List<RelatedObjectGroup> selectedGroups = new Vector<RelatedObjectGroup>(2);

	private List<RelatedObjectGroup> internalSelectedGroup = new Vector<RelatedObjectGroup>(2);

	private BTSTextSelectionEvent textSelectionEvent;

	private Listener selectionListener;

	private String queryId;

	private Map<String, List<BTSObject>> relatingObjectsQueryIDMap = new HashMap<String, List<BTSObject>>();

	private Listener resizeListener;

	protected boolean selfselection;

	private BTSObject parentObject;

	private boolean allRelatedObjectsShowed;

	// boolean if object is loaded into gui
	private boolean loaded;

	// boolean if gui is constructed
	private boolean constructed;

	// boolean if selection is cached and can be loaded when gui becomes visible or constructed
	private boolean selectionCached;	
	/** The part. */
	private MPart part;

	@Inject
	public AnnotationsPart() {
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
		
		part = partService
				.findPart("org.bbaw.bts.ui.corpus.part.AnnotationsPart");
		resizeListener = new Listener() {

			@Override
			public void handleEvent(
					org.eclipse.swt.widgets.Event event) {
				Rectangle r = scrollComposite
						.getClientArea();
				composite.layout();
				scrollComposite.setMinSize(composite
						.computeSize(r.width, SWT.DEFAULT));
			}

		};

		selectionListener = new Listener() {

			@Override
			public void handleEvent(
					org.eclipse.swt.widgets.Event event) {
				RelatedObjectGroup roGroup = (RelatedObjectGroup) event.widget;
				selfselection = true;
				setSelectedInternal(new RelatedObjectGroup[] { roGroup }, true);
				selfselection = false;
			}

		};
		
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
		constructed = true;
	}
	
	@Inject
	@Optional
	void eventReceivedRelatingObjectsLoadedEvents(
			@EventTopic("event_text_relating_objects/*") final BTSRelatingObjectsLoadingEvent event) {
		parentObject = event.getObject();
		queryId = "relations.objectId-" + parentObject.get_id();
		if (event != null && !event.getRelatingObjects().isEmpty()) {
			sync.syncExec(new Runnable() {
				public void run() {
					loadRelatingObjects(event);
				}
			});

		}
	}
	
	private void clearRelatingObjects(BTSCorpusObject selection) {
		if(selection.equals(parentObject) || parentObject == null) return;
//		System.out.println("clearRelatingObjects selection: " + ((BTSCorpusObject)selection).get_id() + " parentObject " + parentObject.get_id());
		part.setLabel("AnnotationsPart");
		part.setTooltip("AnnotationsPart");
		relatingObjectsQueryIDMap.clear();
		objectWidgetMap.clear();
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

		Rectangle r = scrollComposite.getClientArea();
		composite.layout();
		scrollComposite.setMinSize(composite.computeSize(r.width,
				SWT.DEFAULT));
		parentObject = (BTSCorpusObject)selection;

	}

	
	private void loadRelatingObjects(final BTSRelatingObjectsLoadingEvent event) {

		try {
			IRunnableWithProgress op = new IRunnableWithProgress() {

				@Override
				public void run(final IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					monitor.setTaskName("Load annotations, comments and glosses.");
					relatingObjectsQueryIDMap.put(queryId, event.getRelatingObjects());
					final List<BTSObject> list = filterAndCutRelatingObjects(event
							.getRelatingObjects(), monitor);
					sync.asyncExec(new Runnable() {
						public void run() {
							if (composite != null) {
								composite.dispose();
							}
							composite = null;
							objectWidgetMap.clear();
							
							try {
								part.setLabel(event.getObject().getName());
							} catch (Exception e) {
							}							
							composite = new Composite(scrollComposite, SWT.None);
							composite.setBackground(SWTResourceManager
									.getColor(SWT.COLOR_WHITE));
							composite.setLayout(new GridLayout(1, false));
							((GridLayout) composite.getLayout()).marginHeight = 0;
							((GridLayout) composite.getLayout()).marginWidth = 0;
							((GridLayout) composite.getLayout()).verticalSpacing = 0;
							composite.setLayoutData(new GridData(SWT.FILL,
									SWT.FILL, true, true, 1, 1));
							scrollComposite.setContent(composite);
							objectWidgetMap = new HashMap<BTSObject, RelatedObjectGroup>(
									list.size());
							

							Collections.sort(list,
									new BTSObjectTempSortKeyComparator());
							if (monitor != null) monitor.beginTask("Load related objects list", list.size());
							for (Object o : list) {
								if (o instanceof BTSObject) {
									RelatedObjectGroup roGroup = makeRelatedObjectGroup(
											(BTSObject) o, composite);

									objectWidgetMap.put((BTSObject) o, roGroup);
								}
								if (monitor != null) monitor.worked(1);
							}
							if (!allRelatedObjectsShowed)
							{
								try {
									part.setLabel(part.getLabel() + "(" + event.getRelatingObjects().size() + ")? ");
									part.setTooltip("Not all related objects (annotations, comments etc) were loaded\n"
											+ " because there are "+  event.getRelatingObjects().size() + " which is to many for this view.");
								} catch (Exception e) {
								}	
							}
							Rectangle r = scrollComposite.getClientArea();
							composite.layout();
							scrollComposite.setMinSize(composite.computeSize(
									r.width, SWT.DEFAULT));
						}
					});
				}
			};
			new ProgressMonitorDialog(new Shell()).run(true, true, op);
		} catch (InvocationTargetException e) {
			// handle exception
		} catch (InterruptedException e) {
			// handle cancelation
		}
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
	protected void setSelectedInternal(RelatedObjectGroup[] selectedGroups, boolean postSelection) {
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
		if (!selfselection && !internalSelectedGroup.isEmpty() && !scrollComposite.isDisposed())
		{
			RelatedObjectGroup first = internalSelectedGroup.get(0);
			scrollComposite.setOrigin(first.getLocation());
		}
		for (RelatedObjectGroup roGroup : internalSelectedGroup)
		{
			selObjects.add(roGroup.getObject());
			setSelectGroup(roGroup);
		}
		if (postSelection)
		{
		eventBroker.post(
				BTSUIConstants.EVENT_RELATING_OBJECTS_SELECTED,
				selObjects);
		}
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
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final Object selection) {
		if (constructed) {
		if ((selection instanceof BTSAnnotation || selection instanceof BTSComment)
				&& objectWidgetMap != null && objectWidgetMap.containsKey(selection))
		{
			RelatedObjectGroup g = objectWidgetMap.get(selection);
			if (g != null)
			{
				setSelectedInternal(new RelatedObjectGroup[]{g}, false);
			}
		}
		else if (selection instanceof BTSCorpusObject && !selection.equals(parentObject))
		{
			// empty the panel
			sync.syncExec(new Runnable() {
				public void run() {
					clearRelatingObjects((BTSCorpusObject)selection);
				}
			});
			relatingObjectsQueryIDMap.clear();
			List<BTSObject> relatingObjects = null;
			List<BTSObject> filteredRelatingObjects = null;
			queryId = "relations.objectId-" + ((BTSCorpusObject)selection).get_id();
			parentObject = (BTSCorpusObject)selection;
			// if BTSText wait to receive relationObjectLoadedEvent through eventBroker!
			if (!(selection instanceof BTSText))
			{
				try {
					relatingObjects = annotationPartController.findRelatingObjects((BTSObject) selection, null);
					filteredRelatingObjects = filterAndCutRelatingObjects(relatingObjects, null);
					for (BTSObject o : filteredRelatingObjects)
					{
						if (o instanceof BTSCorpusObject)
						{
							annotationPartController.checkAndFullyLoad((BTSCorpusObject) o, false);
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (filteredRelatingObjects != null && !filteredRelatingObjects.isEmpty())
				{
					relatingObjectsQueryIDMap.put(queryId, filteredRelatingObjects);
					eventReceivedRelatingObjectsSelectedEvents(filteredRelatingObjects);
				}
			}
		}
		else if (selection instanceof BTSTextSelectionEvent)
		{
			this.textSelectionEvent = (BTSTextSelectionEvent) selection;
			eventReceivedRelatingObjectsSelectedEvents(textSelectionEvent.getRelatingObjects());
		}
		}
		else
		{
			if (selection instanceof BTSTextSelectionEvent)
			{
				this.textSelectionEvent = (BTSTextSelectionEvent) selection;
			}
			else if (selection instanceof BTSCorpusObject && !selection.equals(parentObject))
			{
				parentObject = (BTSCorpusObject)selection;

			}
		}
	}
	
	private List<BTSObject> filterAndCutRelatingObjects(
			List<BTSObject> relatingObjects, IProgressMonitor monitor) {
		List<BTSObject> filteredRelatingObjects = new Vector<BTSObject>(relatingObjects.size() / 2);
		if (monitor != null) monitor.beginTask("Filter related objects", relatingObjects.size());
		allRelatedObjectsShowed = true;
		for (BTSObject o : relatingObjects)
		{
			if (o instanceof BTSCorpusObject)
			{
				if (o instanceof BTSText)
				{
					// TODO hardcoded. make configurable which types are to be filtered in
					if (o.getType() != null && (o.getType().equalsIgnoreCase("glosse")
							|| o.getType().equalsIgnoreCase("subtext")))
					{
						filteredRelatingObjects.add(o);
					}
				}
				else if (o instanceof BTSAnnotation)
				{
					filteredRelatingObjects.add(o);
				}
			}
			else
			{
				filteredRelatingObjects.add(o);
			}
			if (monitor != null) monitor.worked(1);
			
		}
		if (filteredRelatingObjects.size() > MAX_RELATED_OBJECTS)
		{
			allRelatedObjectsShowed = false;
			return filteredRelatingObjects.subList(0 , MAX_RELATED_OBJECTS);
		}
		return filteredRelatingObjects;
	}
 
	private void eventReceivedRelatingObjectsSelectedEvents(Object objects) {
		if (objects == null)
		{
			setSelectedInternal(null, false);
		}
		if (objects instanceof List<?> && !((List) objects).isEmpty())
		{
			List<BTSObject> os = (List<BTSObject>) objects;
			os = filterAndCutRelatingObjects(os, null);
			List<RelatedObjectGroup> groups = new Vector<RelatedObjectGroup>(os.size());
			boolean resizeRequired = false;
			for (BTSObject o : os)
			{
				RelatedObjectGroup g = objectWidgetMap.get(o);
				if (g != null)
				{
					groups.add(g);
				}
				else // group not found because was not loaded earlier
				{
					RelatedObjectGroup roGroup = makeRelatedObjectGroup(
							(BTSObject) o, composite);

					objectWidgetMap.put((BTSObject) o, roGroup);
					groups.add(roGroup);
					resizeRequired = true;
				}
			}
			if (resizeRequired)
			{
				Rectangle r = scrollComposite.getClientArea();
				composite.layout();
				scrollComposite.setMinSize(composite.computeSize(
						r.width, SWT.DEFAULT));
			}
			setSelectedInternal(groups.toArray(new RelatedObjectGroup[groups.size()]), false);
			
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
		if (relatingObjects == null)
		{
			relatingObjects = new Vector<BTSObject>(1);
			relatingObjectsQueryIDMap.put(id, relatingObjects);
		}
		final RelatedObjectGroup group = objectWidgetMap.get(notification
				.getObject());
		if (group == null) {
			if (!relatingObjects.contains(notification.getObject())) {
				relatingObjects.add((BTSObject) notification.getObject());
			}
			sync.asyncExec(new Runnable() {
				public void run() {
					addObjectToViewerList((BTSObject) notification.getObject());
				}
			});

		} else {

			sync.asyncExec(new Runnable() {
				public void run() {
					updateUIGroup(group, (BTSObject) notification.getObject(),
							notification);
				}
			});
		}
	}
	
	private void updateUIGroup(RelatedObjectGroup group, BTSObject object, BTSModelUpdateNotification notification) {
		// remove
		if (BTSConstants.OBJECT_STATE_TERMINATED.equals(object.getState()))
		{
			group.dispose();
			objectWidgetMap.remove(object);
			Rectangle r = scrollComposite.getClientArea();
			composite.layout();
			scrollComposite.setMinSize(composite.computeSize(r.width,
					SWT.DEFAULT));
		}
		else // update
		{
			
		}
		
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
	
	public BTSObject[] getSelectedObjects()
	{
		List<BTSObject> objects = new ArrayList<BTSObject>(internalSelectedGroup.size());
		for (RelatedObjectGroup rog : internalSelectedGroup)
		{
			objects.add(rog.getObject());
		}
		return objects.toArray(new BTSObject[objects.size()]);
	}
}