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

import java.util.Collection;

import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Object Type Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.BTSObjectTypeTreeNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.BTSObjectTypeTreeNodeImpl#getReferencedTypesPath <em>Referenced Types Path</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.BTSObjectTypeTreeNodeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.BTSObjectTypeTreeNodeImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSObjectTypeTreeNodeImpl extends MinimalEObjectImpl.Container implements BTSObjectTypeTreeNode {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSObjectTypeTreeNode> children;

	/**
	 * The cached value of the '{@link #getReferencedTypesPath() <em>Referenced Types Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTypesPath()
	 * @generated
	 * @ordered
	 */
	protected BTSObjectTypeTreeNode referencedTypesPath;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSObjectTypeTreeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsviewmodelPackage.Literals.BTS_OBJECT_TYPE_TREE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSObjectTypeTreeNode> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<BTSObjectTypeTreeNode>(BTSObjectTypeTreeNode.class, this, BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObjectTypeTreeNode getReferencedTypesPath() {
		if (referencedTypesPath != null && referencedTypesPath.eIsProxy()) {
			InternalEObject oldReferencedTypesPath = (InternalEObject)referencedTypesPath;
			referencedTypesPath = (BTSObjectTypeTreeNode)eResolveProxy(oldReferencedTypesPath);
			if (referencedTypesPath != oldReferencedTypesPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH, oldReferencedTypesPath, referencedTypesPath));
			}
		}
		return referencedTypesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObjectTypeTreeNode basicGetReferencedTypesPath() {
		return referencedTypesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTypesPath(BTSObjectTypeTreeNode newReferencedTypesPath) {
		BTSObjectTypeTreeNode oldReferencedTypesPath = referencedTypesPath;
		referencedTypesPath = newReferencedTypesPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH, oldReferencedTypesPath, referencedTypesPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__CHILDREN:
				return getChildren();
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH:
				if (resolve) return getReferencedTypesPath();
				return basicGetReferencedTypesPath();
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__VALUE:
				return getValue();
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__SELECTED:
				return isSelected();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends BTSObjectTypeTreeNode>)newValue);
				return;
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH:
				setReferencedTypesPath((BTSObjectTypeTreeNode)newValue);
				return;
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__VALUE:
				setValue((String)newValue);
				return;
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__SELECTED:
				setSelected((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__CHILDREN:
				getChildren().clear();
				return;
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH:
				setReferencedTypesPath((BTSObjectTypeTreeNode)null);
				return;
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__CHILDREN:
				return children != null && !children.isEmpty();
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH:
				return referencedTypesPath != null;
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BtsviewmodelPackage.BTS_OBJECT_TYPE_TREE_NODE__SELECTED:
				return selected != SELECTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //BTSObjectTypeTreeNodeImpl
