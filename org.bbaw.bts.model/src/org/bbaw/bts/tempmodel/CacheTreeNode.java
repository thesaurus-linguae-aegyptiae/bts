package org.bbaw.bts.tempmodel;

import java.util.List;
import java.util.Vector;


public class CacheTreeNode {

	private String id;
	
	private List<CacheTreeNode> children;

	private Object object;

	public CacheTreeNode(String id, Object object)
	{
		this.id = id;
		this.object = object;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<CacheTreeNode> getChildren() {
		if (children == null)
		{
			children = new Vector<CacheTreeNode>(4);
		}
		return children;
	}

	public void setChildren(List<CacheTreeNode> children) {
		this.children = children;
	}

	public Object getObject() {
		return object;
	}

}
