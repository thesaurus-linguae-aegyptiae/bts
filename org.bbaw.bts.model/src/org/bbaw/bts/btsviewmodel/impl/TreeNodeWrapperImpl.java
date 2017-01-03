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
package org.bbaw.bts.btsviewmodel.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Tree Node Wrapper</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl#isChildrenLoaded <em>Children Loaded</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.TreeNodeWrapperImpl#getParentObject <em>Parent Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreeNodeWrapperImpl extends MinimalEObjectImpl.Container implements TreeNodeWrapper
{
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected TreeNodeWrapper parent;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<TreeNodeWrapper> children;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected Object object = OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyChangeSupport PROPERTY_CHANGE_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected PropertyChangeSupport propertyChangeSupport = PROPERTY_CHANGE_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isChildrenLoaded() <em>Children Loaded</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isChildrenLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHILDREN_LOADED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChildrenLoaded() <em>Children Loaded</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isChildrenLoaded()
	 * @generated
	 * @ordered
	 */
	protected boolean childrenLoaded = CHILDREN_LOADED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentObject() <em>Parent Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object PARENT_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentObject() <em>Parent Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentObject()
	 * @generated
	 * @ordered
	 */
	protected Object parentObject = PARENT_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeNodeWrapperImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TreeNodeWrapper getParent()
	{
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (TreeNodeWrapper)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TreeNodeWrapper basicGetParent()
	{
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TreeNodeWrapper newParent)
	{
		TreeNodeWrapper oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreeNodeWrapper> getChildren()
	{
		if (children == null) {
			children = new EObjectResolvingEList<TreeNodeWrapper>(TreeNodeWrapper.class, this, BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object getObject()
	{
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(Object newObject) {
		Object oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.TREE_NODE_WRAPPER__OBJECT, oldObject, object));
	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 * @generatedNOT
//	 */
//	public void setObject(BTSObject newObject)
//	{
//		// if (object != null && object instanceof BTSObject)
//		// {
//		// object.getViewObjectHolder().remove(this);
//		// }
//		BTSObject oldObject = object;
//		object = newObject;
//
//		if (eNotificationRequired()) eNotify(new ENotificationImpl(this, Notification.SET,
//				BtsviewmodelPackage.TREE_NODE_WRAPPER__OBJECT, oldObject, object));
//		// if (object != null && object instanceof BTSObject)
//		// {
//		// object.getViewObjectHolder().add(this);
//		// }
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeSupport getPropertyChangeSupport()
	{
		return propertyChangeSupport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyChangeSupport(PropertyChangeSupport newPropertyChangeSupport)
	{
		PropertyChangeSupport oldPropertyChangeSupport = propertyChangeSupport;
		propertyChangeSupport = newPropertyChangeSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChildrenLoaded()
	{
		return childrenLoaded;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenLoaded(boolean newChildrenLoaded)
	{
		boolean oldChildrenLoaded = childrenLoaded;
		childrenLoaded = newChildrenLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN_LOADED, oldChildrenLoaded, childrenLoaded));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.TREE_NODE_WRAPPER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getParentObject()
	{
		return parentObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentObject(Object newParentObject)
	{
		Object oldParentObject = parentObject;
		parentObject = newParentObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT_OBJECT, oldParentObject, parentObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN:
				return getChildren();
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__OBJECT:
				return getObject();
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT:
				return getPropertyChangeSupport();
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN_LOADED:
				return isChildrenLoaded();
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__LABEL:
				return getLabel();
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT_OBJECT:
				return getParentObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT:
				setParent((TreeNodeWrapper)newValue);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends TreeNodeWrapper>)newValue);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__OBJECT:
				setObject(newValue);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((PropertyChangeSupport)newValue);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN_LOADED:
				setChildrenLoaded((Boolean)newValue);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__LABEL:
				setLabel((String)newValue);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT_OBJECT:
				setParentObject(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT:
				setParent((TreeNodeWrapper)null);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN:
				getChildren().clear();
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN_LOADED:
				setChildrenLoaded(CHILDREN_LOADED_EDEFAULT);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT_OBJECT:
				setParentObject(PARENT_OBJECT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT:
				return parent != null;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN:
				return children != null && !children.isEmpty();
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT:
				return PROPERTY_CHANGE_SUPPORT_EDEFAULT == null ? propertyChangeSupport != null : !PROPERTY_CHANGE_SUPPORT_EDEFAULT.equals(propertyChangeSupport);
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN_LOADED:
				return childrenLoaded != CHILDREN_LOADED_EDEFAULT;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT_OBJECT:
				return PARENT_OBJECT_EDEFAULT == null ? parentObject != null : !PARENT_OBJECT_EDEFAULT.equals(parentObject);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case BtsviewmodelPackage.TREE_NODE_WRAPPER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				addPropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				removePropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(", childrenLoaded: ");
		result.append(childrenLoaded);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} // TreeNodeWrapperImpl
