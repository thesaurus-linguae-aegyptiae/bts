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
package org.bbaw.bts.btsviewmodel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.bbaw.bts.btsmodel.BTSObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Tree Node Wrapper</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getParent <em>Parent</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getObject <em>Object</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#isChildrenLoaded <em>Children Loaded</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getLabel <em>Label</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getParentObject <em>Parent Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getTreeNodeWrapper()
 * @model
 * @generated
 */
public interface TreeNodeWrapper extends EObject
{

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(TreeNodeWrapper)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getTreeNodeWrapper_Parent()
	 * @model transient="true"
	 * @generated
	 */
	TreeNodeWrapper getParent();

	/**
	 * Sets the value of the '
	 * {@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getParent
	 * <em>Parent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TreeNodeWrapper value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getTreeNodeWrapper_Children()
	 * @model transient="true"
	 * @generated
	 */
	EList<TreeNodeWrapper> getChildren();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(BTSObject)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getTreeNodeWrapper_Object()
	 * @model dataType="org.bbaw.bts.btsviewmodel.BTSObject"
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

	/**
	 * Returns the value of the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Change Support</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Change Support</em>' attribute.
	 * @see #setPropertyChangeSupport(PropertyChangeSupport)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getTreeNodeWrapper_PropertyChangeSupport()
	 * @model dataType="org.bbaw.bts.btsviewmodel.PropertyChangeSupport"
	 * @generated
	 */
	PropertyChangeSupport getPropertyChangeSupport();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getPropertyChangeSupport <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Change Support</em>' attribute.
	 * @see #getPropertyChangeSupport()
	 * @generated
	 */
	void setPropertyChangeSupport(PropertyChangeSupport value);

	/**
	 * Returns the value of the '<em><b>Children Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Loaded</em>' attribute.
	 * @see #setChildrenLoaded(boolean)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getTreeNodeWrapper_ChildrenLoaded()
	 * @model
	 * @generated
	 */
	boolean isChildrenLoaded();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#isChildrenLoaded <em>Children Loaded</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Children Loaded</em>' attribute.
	 * @see #isChildrenLoaded()
	 * @generated
	 */
	void setChildrenLoaded(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getTreeNodeWrapper_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Parent Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Object</em>' attribute.
	 * @see #setParentObject(Object)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getTreeNodeWrapper_ParentObject()
	 * @model
	 * @generated
	 */
	Object getParentObject();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper#getParentObject <em>Parent Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Object</em>' attribute.
	 * @see #getParentObject()
	 * @generated
	 */
	void setParentObject(Object value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model propertyChangeListenerDataType="org.bbaw.bts.btsviewmodel.PropertyChangeListener"
	 * @generated
	 */
	void addPropertyChangeListener(PropertyChangeListener propertyChangeListener);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model propertyChangeListenerDataType="org.bbaw.bts.btsviewmodel.PropertyChangeListener"
	 * @generated
	 */
	void removePropertyChangeListener(PropertyChangeListener propertyChangeListener);

} // TreeNodeWrapper
