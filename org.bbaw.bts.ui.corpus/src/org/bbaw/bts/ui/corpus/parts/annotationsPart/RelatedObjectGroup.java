package org.bbaw.bts.ui.corpus.parts.annotationsPart;

import java.util.List;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.AnnotationPartController;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.parts.AnnotationsPart;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ExpandItem;

public abstract class RelatedObjectGroup extends Composite{

	protected static final int TITLE_LENGTH = 23;

	@Inject
	protected BTSResourceProvider resourceProvider;
	
	@Inject
	protected AnnotationsPart parentPart;
	
	@Inject
	protected PermissionsAndExpressionsEvaluationController permissionsController;

	@Inject
	protected BTSUserController userController;
	
	@Inject
	protected IEclipseContext context;
	
	private Group group;
	private ExpandItem xpndtmNewExpanditem;
	private BTSObject object;
	private Composite composite;
	private List<Listener> reziseListeners = new Vector<Listener>(2);
	private List<Listener> selectionListeners = new Vector<Listener>(2);
	private ExpandBar expandBar;
	protected boolean selfSelecting;
	private Composite contentComposite;
	private Composite buttonComposite;

	@Inject
	protected AnnotationPartController annotationsPartController;

	protected EditingDomain editingDomain;

	@Inject
	protected EditingDomainController editingDomainController;

	@Inject
	protected Logger logger;

	@Inject
	public RelatedObjectGroup(Composite parent, BTSObject object) {
		super(parent, SWT.None);
		this.object = object;
	}
	
	@PostConstruct
	public void postConstruct(){
		
		editingDomain = editingDomainController.getEditingDomain(object);
		setLayout(new GridLayout(1, false));
		((GridLayout)this.getLayout()).marginHeight = 0;
		((GridLayout)this.getLayout()).marginWidth = 0;
		((GridLayout)this.getLayout()).verticalSpacing = 0;
		this.addControlListener(new ControlListener() {
			
			@Override
			public void controlResized(ControlEvent e) {
				RelatedObjectGroup.this.layout();
				Event ev = new Event();
				ev.data = e;
				ev.widget = RelatedObjectGroup.this;
				for (Listener l : reziseListeners)
				{
					l.handleEvent(ev);
				}
				
			}
			
			@Override
			public void controlMoved(ControlEvent e) {
				
			}
		});
		MouseAdapter mouseListener = new MouseAdapter() {
			
			@Override
			public void mouseDown(MouseEvent e) {
				selfSelecting = true;
				Event ev = new Event();
				ev.data = e;
				ev.widget = RelatedObjectGroup.this;
				for (Listener l : selectionListeners)
				{
					l.handleEvent(ev);
				}
				selfSelecting = false;
			}
			
		};
		this.addMouseListener(mouseListener);
		
		group = new Group(this, SWT.NONE);
		group.setLayout(new GridLayout(1, false));
		((GridLayout)group.getLayout()).marginHeight = 0;
		((GridLayout)group.getLayout()).marginWidth = 0;
		((GridLayout)group.getLayout()).verticalSpacing = 0;
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		group.addMouseListener(mouseListener);
		expandBar = new ExpandBar(group, SWT.NONE);
		expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		expandBar.addPaintListener(new PaintListener() {
			
			@Override
			public void paintControl(PaintEvent e) {
				RelatedObjectGroup.this.layout();
				Event ev = new Event();
				ev.data = e;
				ev.widget = RelatedObjectGroup.this;
				for (Listener l : reziseListeners)
				{
					l.handleEvent(ev);
				}
			}
		});
		expandBar.addMouseListener(mouseListener);
		

		
		xpndtmNewExpanditem = new ExpandItem(expandBar, SWT.NONE);
		xpndtmNewExpanditem.setExpanded(false);
		if (object.getName() != null)
		{
			xpndtmNewExpanditem.setText(object.getName());
		}
		composite = new Composite(expandBar, SWT.NONE);
		xpndtmNewExpanditem.setControl(composite);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));


		
		composite.setLayout(new GridLayout(1, false));
		((GridLayout)composite.getLayout()).marginHeight = 0;
		((GridLayout)composite.getLayout()).marginWidth = 0;
		((GridLayout)composite.getLayout()).verticalSpacing = 0;

		composite.addMouseListener(mouseListener);
		
		
		// micro buttons
		buttonComposite = new Composite(composite, SWT.NONE);
		buttonComposite.setLayout(new RowLayout());
		buttonComposite.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		buttonComposite.addMouseListener(mouseListener);
		
		contentComposite = new Composite(composite, SWT.NONE);
		contentComposite.setLayout(new GridLayout(1, false));
		((GridLayout)contentComposite.getLayout()).marginHeight = 0;
		((GridLayout)contentComposite.getLayout()).marginWidth = 0;
		contentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		contentComposite.addMouseListener(mouseListener);
		

		
		fillContentComposite(contentComposite);

		makeReferenceButtons(buttonComposite);
		addButtons(buttonComposite);
		xpndtmNewExpanditem.setHeight(xpndtmNewExpanditem.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);

		this.layout();
	}

	protected abstract void addButtons(Composite composite);

	protected abstract void fillContentComposite(Composite composite);

	protected void makeReferenceButtons(Composite composite) {
		
		Label addButton = new Label(composite, SWT.PUSH);
		addButton.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_RELATION_ADD));
		addButton.setToolTipText("Add Current Text Selection as Reference");
		addButton.setLayoutData(new RowData());
		addButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				if (mayEdit())
				{
					Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
				}
			}

			@Override
			public void mouseUp(MouseEvent e) {
				if (mayEdit())
				{
					Label l = (Label) e.getSource();
					l.setBackground(l.getParent().getBackground());
					addReference();
				}
			}
		});
		
		
		Label editButton = new Label(composite, SWT.PUSH);
		editButton.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_RELATION_EDIT));
		editButton.setToolTipText("Update Current Reference");
		editButton.setLayoutData(new RowData());
		editButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				if (mayEdit())
				{
					Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
				}
			}

			@Override
			public void mouseUp(MouseEvent e) {
				if (mayEdit())
				{
					Label l = (Label) e.getSource();
					l.setBackground(l.getParent().getBackground());
					editReference();
				}
			}
		});
		Label delButton = new Label(composite, SWT.PUSH);
		delButton.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_RELATION_DELETE));
		delButton.setToolTipText("Remove Current Reference");
		delButton.setLayoutData(new RowData());
		delButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				if (mayEdit())
				{
					Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
				}
			}

			@Override
			public void mouseUp(MouseEvent e) {
				if (mayEdit())
				{
					Label l = (Label) e.getSource();
					l.setBackground(l.getParent().getBackground());
					removeReference();
				}
			}
		});

		
	}

	protected boolean mayEdit() {
		return permissionsController.authenticatedUserMayEditObeject(object);
	}

	protected void editReference() {
		BTSTextSelectionEvent selectionEvent = parentPart.getTestSelectionEvent();
		if (selectionEvent == null) return;
		
		// in object suchen, ob relation auf Text besteht
		BTSRelation relation = null;
		for (BTSRelation rel : object.getRelations())
		{
			if (selectionEvent.data != null && ((BTSIdentifiableItem) selectionEvent.data).get_id().equals(rel.getObjectId()))
			{
				relation = rel;
				break;
			}
		}
		
		// wenn nein, neue anlegen, 
		if (relation == null)
		{
			relation = BtsmodelFactory.eINSTANCE.createBTSRelation();
			relation.setObjectId(((BTSIdentifiableItem) selectionEvent.data).get_id());
			relation.setType(BTSCoreConstants.BASIC_RELATIONS_PARTOF);
			object.getRelations().add(relation);
		}
		
		BTSInterTextReference reference = null;
		for (BTSInterTextReference ref : selectionEvent.getInterTextReferences())
		{
			if (ref.eContainer() != null && ref.eContainer().equals(relation))
			{
				reference = ref;
			}
		}
		CompoundCommand compoundCommand = new CompoundCommand();
		if (reference == null)
		{
			// neue reference anlegen, start ziel entsprechend selection
			reference = BtsmodelFactory.eINSTANCE.createBTSInterTextReference();
			reference.setBeginId(selectionEvent.getStartId());
			reference.setEndId(selectionEvent.getEndId());
			Command c = AddCommand
					.create(editingDomain, relation, BtsmodelPackage.BTS_RELATION__PARTS, reference);
			compoundCommand.append(c);
		}
		else
		{
			Command c = SetCommand
					.create(editingDomain, reference, BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__BEGIN_ID, selectionEvent.getStartId());
			compoundCommand.append(c);
			Command cc = SetCommand
					.create(editingDomain, reference, BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__END_ID, selectionEvent.getEndId());
			compoundCommand.append(cc);
		}
		
		editingDomain.getCommandStack().execute(
				compoundCommand);
		
		save();
		
		postUIEvent(reference);	
	}

	protected void addReference() {
		BTSTextSelectionEvent selectionEvent = parentPart.getTestSelectionEvent();
		if (selectionEvent == null) return;
		
		// in object suchen, ob relation auf Text besteht
		BTSRelation relation = null;
		for (BTSRelation rel : object.getRelations())
		{
			if (selectionEvent.data != null && ((BTSIdentifiableItem) selectionEvent.data).get_id().equals(rel.getObjectId()))
			{
				relation = rel;
				break;
			}
		}
		
		// wenn nein, neue anlegen, 
		if (relation == null)
		{
			relation = BtsmodelFactory.eINSTANCE.createBTSRelation();
			relation.setObjectId(((BTSIdentifiableItem) selectionEvent.data).get_id());
			relation.setType(BTSCoreConstants.BASIC_RELATIONS_PARTOF);
			object.getRelations().add(relation);
		}
		
		// neue reference anlegen, start ziel entsprechend selection
		BTSInterTextReference reference = BtsmodelFactory.eINSTANCE.createBTSInterTextReference();
		reference.setBeginId(selectionEvent.getStartId());
		reference.setEndId(selectionEvent.getEndId());
		
		Command compoundCommand = AddCommand
				.create(editingDomain, relation, BtsmodelPackage.BTS_RELATION__PARTS, reference);
		editingDomain.getCommandStack().execute(
				compoundCommand);
		
		//FIXME update Textviewer!!!!!!!!!
		
		save();
		postUIEvent(reference);		
		
	}

	private void postUIEvent(BTSInterTextReference reference) {
		// TODO Auto-generated method stub
		
	}

	protected void save() {
		annotationsPartController.save(object);
		
	}

	protected void removeReference() {
		BTSTextSelectionEvent selectionEvent = parentPart.getTestSelectionEvent();
		if (selectionEvent == null) return;
		
		// in object suchen, ob relation auf Text besteht
		BTSRelation relation = null;
		BTSInterTextReference reference = null;
		for (BTSRelation rel : object.getRelations())
		{
			if (selectionEvent.data != null && ((BTSIdentifiableItem) selectionEvent.data).get_id().equals(rel.getObjectId()) && !rel.getParts().isEmpty())
			{
				relation = rel;
				for (BTSInterTextReference ref : selectionEvent.getInterTextReferences())
				{
					if (ref != null && ref.eContainer() != null && ref.eContainer().equals(relation))
					{
						reference = ref;
						break;
					}
				}
				
				if (reference != null)
				{
					break;
				}
			}
		}
		
		// wenn nein, nichts zu löschen 
		if (relation == null)
		{
			return;
		}
		
		
		if (reference == null) return;
		Command compoundCommand = RemoveCommand
				.create(editingDomain, relation, BtsmodelPackage.BTS_RELATION__PARTS, reference);
		editingDomain.getCommandStack().execute(
				compoundCommand);
		save();
		
		postUIEvent(reference);		
	}

	public void addResizeListener(Listener resizeListener) {
		if (resizeListener != null && !reziseListeners .contains(resizeListener))
		{
			reziseListeners.add(resizeListener);
		}
	}

	public void addSelectionListener(Listener selectionListener) {
		if (selectionListener != null && !selectionListeners.contains(selectionListener))
		{
			selectionListeners.add(selectionListener);
		}
	}
	
	public BTSObject getObject()
	{
		return object;
	}
	public Group getGroup()
	{
		return group;
	}

	public void setSelected(boolean selected) {
		if (selected)
		{
			setBackground(BTSUIConstants.VIEW_BACKGROUND_SELECTED_COLOR);
		}
		else
		{
			setBackground(BTSUIConstants.VIEW_BACKGROUND_DESELECTED_COLOR);
		}
		if((!selected || !selfSelecting) && xpndtmNewExpanditem != null && xpndtmNewExpanditem.getExpanded() != selected)
		{
			xpndtmNewExpanditem.setExpanded(selected);

		}
	}
	
	@Override
	public void setBackground(Color color) {
		super.setBackground(color);
		if (group != null)
		{
			group.setBackground(color);
			composite.setBackground(color);
			expandBar.setBackground(color);
			contentComposite.setBackground(color);
			buttonComposite.setBackground(color);
		}

	}
	
	public void setExpandBarBackground(Color color)
	{
		expandBar.setBackground(color);
	}
	
	public void setExpandBarIcon(Image image)
	{
		xpndtmNewExpanditem.setImage(image);
	}
	
	public void setGroupTitle(String title)
	{
		if (title != null && group != null && !group.isDisposed())
		{
			group.setText(title);
		}
	}
	
	public void setExpandItemTitle(String title)
	{
		if (title != null && xpndtmNewExpanditem != null && !xpndtmNewExpanditem.isDisposed())
		{
			xpndtmNewExpanditem.setText(title);
		}
	}
}
