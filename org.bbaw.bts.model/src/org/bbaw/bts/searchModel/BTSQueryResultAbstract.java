package org.bbaw.bts.searchModel;

import javax.swing.tree.TreePath;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;

public class BTSQueryResultAbstract
{

	private String queryId;

	private TreePath treePath;

	private EObject parentEObject;

	private EReference referenceName;

	private ContentViewer viewer;

	/**
	 * @return the queryId
	 */
	public String getQueryId()
	{
		return queryId;
	}

	/**
	 * @param queryId
	 *            the queryId to set
	 */
	public void setQueryId(String queryId)
	{
		this.queryId = queryId;
	}

	/**
	 * @return the treePath
	 */
	public TreePath getTreePath()
	{
		return treePath;
	}

	/**
	 * @param treePath
	 *            the treePath to set
	 */
	public void setTreePath(TreePath treePath)
	{
		this.treePath = treePath;
	}

	/**
	 * @return the parentEObject
	 */
	public EObject getParentEObject()
	{
		return parentEObject;
	}

	/**
	 * @param parentEObject
	 *            the parentEObject to set
	 */
	public void setParentEObject(EObject parentEObject)
	{
		this.parentEObject = parentEObject;
	}

	/**
	 * @return the referenceName
	 */
	public EReference getReferenceName()
	{
		return referenceName;
	}

	/**
	 * @param referenceName
	 *            the referenceName to set
	 */
	public void setReferenceName(EReference referenceName)
	{
		this.referenceName = referenceName;
	}

	public ContentViewer getViewer()
	{
		return viewer;
	}

	public void setViewer(ContentViewer viewer)
	{
		this.viewer = viewer;
	}
}
