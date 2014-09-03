package org.bbaw.bts.ui.corpus.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class LemmaNavigator implements SearchViewer
{

	private Label label;
	private TreeViewer treeViewer;
	@Inject
	private EventBroker eventBroker;

	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;

	@PostConstruct
	public void createComposite(Composite parent)
	{
		parent.setLayout(new GridLayout());

		treeViewer = new TreeViewer(parent);

		// treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(new
		// CorpusItemProviderAdapterFactory()));
		// treeViewer.setContentProvider(new AdapterFactoryContentProvider(new
		// CorpusItemProviderAdapterFactory()));

		// treeViewer.setLabelProvider(new CorpusCollectionTreeLabelProvider());
		// treeViewer.setContentProvider(new
		// CorpusCollectionTreeContentProvider());
		treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				System.out.println(event.getSelection());
				eventBroker.send("viewcommunication/syncEvent", event.getSelection());
				// eventBroker.post("viewcommunication/asyncEvent",
				// event.getSelection());

			}
		});

		loadData();
		// treeViewer.setInput(root);
		parent.layout();
		parent.pack();
	}

	private void loadData()
	{

	}

	@Focus
	public void setFocus()
	{
		evaluationController
				.activateDBCollectionContext(BTSCoreConstants.MAIN_WORD_LIST);
		if (treeViewer != null)
		{
			treeViewer.getTree().setFocus();
		}
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(BTSQueryRequest query, String queryName) {
		// TODO Auto-generated method stub
		
	}

}
