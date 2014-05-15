package org.bbaw.bts.ui.main.provider;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSProject;
import org.eclipse.jface.viewers.Viewer;

import com.richclientgui.toolbox.duallists.IRemovableContentProvider;

public class BTSProjectRemovableContentProvider implements IRemovableContentProvider<BTSProject>
{
	private List<BTSProject> projects;

	public BTSProjectRemovableContentProvider(List<BTSProject> projects)
	{
		this.projects = projects;

	}

	@Override
	public Object[] getElements(Object inputElement)
	{
		if (getProjects() != null)
		{
			if (inputElement instanceof List<?>)
			{
				return ((List) inputElement).toArray();
			}
			return getProjects().toArray();
		}
		return new Object[] {};
	}

	private List<BTSProject> getProjects()
	{
		if (projects == null)
		{
			projects = new Vector<BTSProject>(3);
		}
		return projects;
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
	public void addElement(BTSProject arg0)
	{
		getProjects().add(arg0);

	}

	@Override
	public void addElements(List<BTSProject> arg0)
	{
		getProjects().addAll(arg0);
	}

	@Override
	public int getNumberOfElements()
	{
		// TODO Auto-generated method stub
		return getProjects().size();
	}

	@Override
	public void removeElement(BTSProject arg0)
	{
		getProjects().remove(arg0);
	}

	@Override
	public void removeElements(List<BTSProject> arg0)
	{
		getProjects().removeAll(arg0);

	}

	public List<BTSProject> getInputElements()
	{
		return projects;
	}

}
