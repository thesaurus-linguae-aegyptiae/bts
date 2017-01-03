/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2015  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.searchModel;

import javax.swing.tree.TreePath;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class BTSQueryResultAbstract
{

	private String queryId;

	private TreePath treePath;

	private EObject parentEObject;

	private EReference referenceName;

	private Object viewer;

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

	public Object getViewer()
	{
		return viewer;
	}

	public void setViewer(Object viewer)
	{
		this.viewer = viewer;
	}
}
