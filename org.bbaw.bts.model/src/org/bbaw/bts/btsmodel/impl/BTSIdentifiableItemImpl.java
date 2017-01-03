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

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTS Identifiable Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl#get_id <em>id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSIdentifiableItemImpl extends MinimalEObjectImpl.Container implements BTSIdentifiableItem
{
	/**
	 * The default value of the '{@link #get_id() <em>id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_id() <em>id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected String _id = _ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSIdentifiableItemImpl()
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
		return BtsmodelPackage.Literals.BTS_IDENTIFIABLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id()
	{
		return _id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id)
	{
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID:
				return get_id();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID:
				set_id((String)newValue);
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
			case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID:
				set_id(_ID_EDEFAULT);
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
			case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (_id: ");
		result.append(_id);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object object)
	{
		if (object instanceof BTSIdentifiableItem && get_id() != null)
		{
			return get_id().equals(((BTSIdentifiableItem) object).get_id());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		if (_id != null)
		{
			return _id.hashCode();
		}
		return super.hashCode();
	}

} // BTSIdentifiableItemImpl
