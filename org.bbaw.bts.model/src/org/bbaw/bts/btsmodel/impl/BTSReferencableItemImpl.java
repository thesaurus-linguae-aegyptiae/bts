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
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSReferencableItem;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Referencable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl#getParentId <em>Parent Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSReferencableItemImpl extends BTSObjectImpl implements BTSReferencableItem {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected BTSObject parent;

	/**
	 * The default value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected String parentId = PARENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSReferencableItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_REFERENCABLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObject getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (BTSObject)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObject basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BTSObject newParent) {
		BTSObject oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentId(String newParentId) {
		String oldParentId = parentId;
		parentId = newParentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID, oldParentId, parentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT:
				return getComment();
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID:
				return getParentId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT:
				setComment((String)newValue);
				return;
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT:
				setParent((BTSObject)newValue);
				return;
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID:
				setParentId((String)newValue);
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
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT:
				setParent((BTSObject)null);
				return;
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID:
				setParentId(PARENT_ID_EDEFAULT);
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
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT:
				return parent != null;
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID:
				return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", parentId: ");
		result.append(parentId);
		result.append(')');
		return result.toString();
	}

} //BTSReferencableItemImpl
