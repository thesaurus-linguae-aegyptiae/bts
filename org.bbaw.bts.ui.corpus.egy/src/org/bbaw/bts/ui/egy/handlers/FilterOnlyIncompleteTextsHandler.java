package org.bbaw.bts.ui.egy.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.ui.corpus.parts.CorpusNavigatorPart;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;

public class FilterOnlyIncompleteTextsHandler {
	
	@Execute
	public void execute(final BTSTextEditorController textController, IEclipseContext context, 
			@Active MPart activePart, @Active Shell shell, 
			final UISynchronize sync)
	{
		
		Object o = activePart.getObject();
		final CorpusNavigatorPart part;
		// see if part has a StructuredViewer
		if (o instanceof CorpusNavigatorPart)
		{
			part = (CorpusNavigatorPart) o;
		}
		else
		{
			return;
		}
		// // in new job, search
				try {
					 IRunnableWithProgress op = new IRunnableWithProgress() {

							@Override
							public void run(IProgressMonitor monitor)
									throws InvocationTargetException, InterruptedException 
							{
								final List<BTSCorpusObject> obs = new Vector<BTSCorpusObject>();
								monitor.beginTask("Load all texts", IProgressMonitor.UNKNOWN);
								List<BTSText> texts = textController.listInAllInCompleteTexts(monitor);

								for (BTSText t : texts)
								{
									obs.add(t);
								}
								// If you want to update the UI
								sync.asyncExec(new Runnable() {
									@Override
									public void run() {
										part.setInputList(obs, "Incomplete Texts");
									}
								});
							}};
				       new ProgressMonitorDialog(shell).run(true, true, op);
				    } catch (InvocationTargetException e) {
				       // handle exception
				    } catch (InterruptedException e) {
				       // handle cancelation
				    }
		
		
	}

	

	@CanExecute
	public boolean canExecute(@Active MPart activePart) {
		
		// have active part injected via param
		
		// true if active part has a StructuredViewer
		Object o = activePart.getObject();
		CorpusNavigatorPart part;
		// see if part has a StructuredViewer
		if (o instanceof CorpusNavigatorPart)
		{
			return true;
		}
		
		return false;
		
	}
}
