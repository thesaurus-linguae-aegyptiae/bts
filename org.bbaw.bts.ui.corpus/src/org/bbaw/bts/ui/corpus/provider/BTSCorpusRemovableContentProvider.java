package org.bbaw.bts.ui.corpus.provider;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.eclipse.jface.viewers.Viewer;

import com.richclientgui.toolbox.duallists.IRemovableContentProvider;

public class BTSCorpusRemovableContentProvider implements IRemovableContentProvider<BTSCorpusObject>
{
	private List<BTSCorpusObject> corpusObjects;

	public BTSCorpusRemovableContentProvider(List<BTSCorpusObject> corpusObjects)
	{
		this.corpusObjects = corpusObjects;

	}

	@Override
	public Object[] getElements(Object inputElement)
	{
		if (getCorpusObjects() != null)
		{
			if (inputElement instanceof List<?>)
			{
				return ((List) inputElement).toArray();
			}
			return getCorpusObjects().toArray();
		}
		return new Object[] {};
	}

	private List<BTSCorpusObject> getCorpusObjects()
	{
		if (corpusObjects == null)
		{
			corpusObjects = new Vector<BTSCorpusObject>(3);
		}
		return corpusObjects;
	}

	@Override
	public void dispose()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void addElement(BTSCorpusObject arg0)
	{
		getCorpusObjects().add(arg0);

	}

	@Override
	public void addElements(List<BTSCorpusObject> arg0)
	{
		getCorpusObjects().addAll(arg0);
	}

	@Override
	public int getNumberOfElements()
	{
		// TODO Auto-generated method stub
		return getCorpusObjects().size();
	}

	@Override
	public void removeElement(BTSCorpusObject arg0)
	{
		getCorpusObjects().remove(arg0);
	}

	@Override
	public void removeElements(List<BTSCorpusObject> arg0)
	{
		getCorpusObjects().removeAll(arg0);

	}

	public List<BTSCorpusObject> getInputElements()
	{
		return corpusObjects;
	}

}
