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
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSRelation;

import org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl;

import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Abstract Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAbstractParagraphImpl#getWitnesses <em>Witnesses</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAbstractParagraphImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAbstractParagraphImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAbstractParagraphImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSAbstractParagraphImpl extends BTSIdentifiableItemImpl implements BTSAbstractParagraph {
	/**
	 * The cached value of the '{@link #getWitnesses() <em>Witnesses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWitnesses()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSRelation> witnesses;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected int sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSAbstractParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_ABSTRACT_PARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSRelation> getWitnesses() {
		if (witnesses == null) {
			witnesses = new EObjectResolvingEList<BTSRelation>(BTSRelation.class, this, BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__WITNESSES);
		}
		return witnesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(int newSortKey) {
		int oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__WITNESSES:
				return getWitnesses();
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__SORT_KEY:
				return getSortKey();
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__TYPE:
				return getType();
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__NAME:
				return getName();
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
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__WITNESSES:
				getWitnesses().clear();
				getWitnesses().addAll((Collection<? extends BTSRelation>)newValue);
				return;
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__SORT_KEY:
				setSortKey((Integer)newValue);
				return;
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__TYPE:
				setType((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__NAME:
				setName((String)newValue);
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
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__WITNESSES:
				getWitnesses().clear();
				return;
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__NAME:
				setName(NAME_EDEFAULT);
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
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__WITNESSES:
				return witnesses != null && !witnesses.isEmpty();
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__SORT_KEY:
				return sortKey != SORT_KEY_EDEFAULT;
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsCorpusModelPackage.BTS_ABSTRACT_PARAGRAPH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (sortKey: ");
		result.append(sortKey);
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BTSAbstractParagraphImpl
