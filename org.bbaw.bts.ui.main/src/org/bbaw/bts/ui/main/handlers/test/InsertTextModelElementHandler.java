package org.bbaw.bts.ui.main.handlers.test;

import grammaticalBase.model.light.LightSpelling;
import grammaticalBase.model.text.WordOccurrence;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class InsertTextModelElementHandler
{
	@Inject
	EventBroker eventBroker;

	@Execute
	public void execute()
	{
		WordOccurrence modelElement = new WordOccurrence();
		LightSpelling ls = new LightSpelling();

		TestTextModelElementDialog dialog = new TestTextModelElementDialog(new Shell(), ls);
		if (dialog.open() == dialog.OK)
		{
			modelElement.setSpelling(ls);
			eventBroker.post("model_new/asyncEvent", modelElement);

		}

	}

	@CanExecute
	public boolean canExecute()
	{
		// TODO Your code goes here
		return true;
	}

}