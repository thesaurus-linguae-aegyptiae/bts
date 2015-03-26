package org.bbaw.bts.ui.egy.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.core.corpus.controller.partController.LemmaEditorController;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.ui.corpus.parts.CorpusNavigatorPart;
import org.bbaw.bts.ui.corpus.parts.LemmaNavigator;
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

public class FilterOnlyInvalidLemmataHandler {
	
	@Execute
	public void execute(final LemmaEditorController lemmaEditorController, IEclipseContext context, @Active MPart activePart, @Active Shell shell, 
			final UISynchronize sync)
	{
		
		Object o = activePart.getObject();
		final LemmaNavigator part;
		// see if part has a StructuredViewer
		if (o instanceof LemmaNavigator)
		{
			part = (LemmaNavigator) o;
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
								monitor.beginTask("Load all lemmata", IProgressMonitor.UNKNOWN);
								List<BTSLemmaEntry> lemmata = lemmaEditorController.listInAllInvalidLemmata(monitor);

								for (BTSLemmaEntry t : lemmata)
								{
									obs.add(t);
								}
								// If you want to update the UI
								sync.asyncExec(new Runnable() {
									@Override
									public void run() {
										part.setInputList(obs, "invalid Lemmata");
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
		LemmaNavigator part;
		// see if part has a StructuredViewer
		if (o instanceof LemmaNavigator)
		{
			return true;
		}
		
		return false;
		
	}
}
