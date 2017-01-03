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

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Inter Text Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl#getBeginId <em>Begin Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl#getEndId <em>End Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSInterTextReferenceImpl extends MinimalEObjectImpl.Container implements BTSInterTextReference {
	/**
	 * The default value of the '{@link #getBeginId() <em>Begin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginId()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginId() <em>Begin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginId()
	 * @generated
	 * @ordered
	 */
	protected String beginId = BEGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndId() <em>End Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndId()
	 * @generated
	 * @ordered
	 */
	protected static final String END_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndId() <em>End Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndId()
	 * @generated
	 * @ordered
	 */
	protected String endId = END_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSInterTextReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_INTER_TEXT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeginId() {
		return beginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginId(String newBeginId) {
		String oldBeginId = beginId;
		beginId = newBeginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__BEGIN_ID, oldBeginId, beginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndId() {
		return endId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndId(String newEndId) {
		String oldEndId = endId;
		endId = newEndId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__END_ID, oldEndId, endId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__BEGIN_ID:
				return getBeginId();
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__END_ID:
				return getEndId();
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
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__BEGIN_ID:
				setBeginId((String)newValue);
				return;
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__END_ID:
				setEndId((String)newValue);
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
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__BEGIN_ID:
				setBeginId(BEGIN_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__END_ID:
				setEndId(END_ID_EDEFAULT);
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
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__BEGIN_ID:
				return BEGIN_ID_EDEFAULT == null ? beginId != null : !BEGIN_ID_EDEFAULT.equals(beginId);
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE__END_ID:
				return END_ID_EDEFAULT == null ? endId != null : !END_ID_EDEFAULT.equals(endId);
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
		result.append(" (beginId: ");
		result.append(beginId);
		result.append(", endId: ");
		result.append(endId);
		result.append(')');
		return result.toString();
	}

} //BTSInterTextReferenceImpl
