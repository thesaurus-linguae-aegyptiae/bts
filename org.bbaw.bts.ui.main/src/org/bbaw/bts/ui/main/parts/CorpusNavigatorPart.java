package org.bbaw.bts.ui.main.parts;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.core.services.IDService;
import org.bbaw.bts.ui.main.parts.corpusNavigator.provider.CorpusNavigatorTreeLabelProvider;
import org.bbaw.bts.ui.main.parts.corpusNavigator.provider.TreeFactoryImpl2;
import org.bbaw.bts.ui.main.parts.corpusNavigator.provider.TreeStructureAdvisorImpl;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class CorpusNavigatorPart
{

	private Label label;
	private TreeViewer treeViewer;
	private BTSCorpusObject root;
	private WritableList input;
	private StructuredSelection selection;
	@Inject
	private IDService idService;
	@Inject
	private EventBroker eventBroker;
	@Inject
	private CorpusNavigatorController corpusNavigatorController;
	private EditingDomain editingDomain;
	private List<BTSCorpusObject> obs;
	private String since;

	@Inject
	public CorpusNavigatorPart()
	{
		// TODO Your code here
	}

	@PostConstruct
	public void postConstruct(Composite parent)
	{
		parent.setLayout(new GridLayout());
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		label = new Label(composite, SWT.NONE);
		label.setText("Corpus-Navigator");

		// Button b = new Button(composite, SWT.PUSH);
		// b.setText("ADD");
		// b.addSelectionListener(new SelectionListener(){
		//
		// @Override
		// public void widgetSelected(SelectionEvent e) {
		// BTSCorpusObject o = createTextObject(1);
		// input.add(o);
		//
		// }
		//
		// @Override
		// public void widgetDefaultSelected(SelectionEvent e) {
		// // TODO Auto-generated method stub
		//
		// }});

		Button b2 = new Button(composite, SWT.PUSH);
		b2.setText("SAVE");
		b2.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (selection != null)
				{
					Object o = selection.getFirstElement();
					if (o instanceof BTSCorpusObject)
					{
						corpusNavigatorController.save((BTSCorpusObject) o);
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});

		Button b3 = new Button(composite, SWT.PUSH);
		b3.setText("Change");
		b3.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (selection != null)
				{
					Object o = selection.getFirstElement();
					if (o instanceof BTSCorpusObject)
					{
						// ((BTSCorpusObject) o).setName(((BTSCorpusObject)
						// o).getName() + "#!");
						// has to be accessed through emf
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});

		treeViewer = new TreeViewer(composite);
		// GridData gridData = new GridData();
		// gridData.grabExcessHorizontalSpace = true;
		// gridData.grabExcessVerticalSpace = true;
		// gridData.horizontalSpan = SWT.FILL;
		// gridData.verticalSpan = SWT.FILL;
		treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.getTree().setLayout(new GridLayout());
		// treeViewer.getTree().setLayoutData(gridData);

		// ObservablesManager mgr = new ObservablesManager();
		// mgr.runAndCollect(new Runnable()
		// {
		// public void run()
		// {
		// // configureAndLoad();
		// loadVogella();
		// }
		//
		//
		// });

		loadTree();

		parent.layout();
		// parent.pack();
		// tryRunnable();
	}

	private void loadTree()
	{
		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(
				(IObservableFactory) new TreeFactoryImpl2(), new TreeStructureAdvisorImpl());
		treeViewer.setContentProvider(contentProvider);
		IObservableSet knownElements = contentProvider.getKnownElements();

		IObservableMap[] attributeMaps = new IObservableMap[1];
		attributeMaps[0] = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_OBJECT__NAME)
				.observeDetail(knownElements);

		treeViewer.setLabelProvider(new CorpusNavigatorTreeLabelProvider(attributeMaps));

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				selection = (StructuredSelection) event.getSelection();
				System.out.println(event.getSelection());
				eventBroker.send("viewcommunication/syncEvent", event.getSelection());
				// eventBroker.post("viewcommunication/asyncEvent",
				// event.getSelection());

			}
		});
		treeViewer.setSorter(new ViewerSorter()
		{
		});
		// Create sample data
		obs = new ArrayList<BTSCorpusObject>();

		for (BTSCorpusObject o : corpusNavigatorController.getRootBTSCorpusObjects())
		{
			obs.add(o);
		}
		input = new WritableList(obs, BTSCorpusObject.class);
		// Set the writeableList as input for the viewer
		treeViewer.setInput(input);

	}

	@PreDestroy
	public void preDestroy()
	{
		// TODO Your code here
	}

	@Focus
	public void onFocus()
	{
		// TODO Your code here
	}

	public WritableList getInput()
	{
		return input;
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/*") BTSObject object)
	{
		if (object instanceof BTSTextCorpus)
		{
			addObjectToInput(object);
		} else if (object instanceof BTSTCObject && selection != null
				&& selection.getFirstElement() instanceof BTSCorpusObject)
		{
			corpusNavigatorController.addChild((BTSCorpusObject) object, input,
					(BTSCorpusObject) selection.getFirstElement());

			refreshTreeViewer((BTSTCObject) object);
		}
	}

	@Inject
	@Optional
	void eventReceivedUpdates(@EventTopic("model_update/*") final BTSObject object)
	{
		if (object instanceof BTSTextCorpus)
		{
			input.getRealm().asyncExec(new Runnable()
			{
				public void run()
				{
					if (input.contains(object))
					{
						input.remove(object);
						input.add(object);

					} else
					{
						input.add(object);
					}
				}
			});
		} else if (object instanceof BTSTCObject && selection != null
				&& selection.getFirstElement() instanceof BTSCorpusObject)
		{
			corpusNavigatorController.addChild((BTSCorpusObject) object, input,
					(BTSCorpusObject) selection.getFirstElement());

			refreshTreeViewer((BTSTCObject) object);
		}
	}

	private void replaceObjectInInput(final BTSObject object)
	{
		input.getRealm().asyncExec(new Runnable()
		{
			public void run()
			{
				input.remove(object);
				input.add(object);
			}
		});

	}

	private void refreshTreeViewer(final BTSTCObject object)
	{
		input.getRealm().asyncExec(new Runnable()
		{
			public void run()
			{
				// treeViewer.refresh();
			}
		});

	}

	private void addObjectToInput(final BTSObject object)
	{
		input.getRealm().asyncExec(new Runnable()
		{
			public void run()
			{
				input.add(object);
			}
		});

	}

}