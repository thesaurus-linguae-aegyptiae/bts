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

import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Text Corpus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextCorpusImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextCorpusImpl#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSTextCorpusImpl extends BTSCorpusObjectImpl implements BTSTextCorpus {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected BTSCorpusHeader header;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSTextCorpusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_TEXT_CORPUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSCorpusHeader getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(BTSCorpusHeader newHeader, NotificationChain msgs) {
		BTSCorpusHeader oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(BTSCorpusHeader newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT_CORPUS__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER:
				return basicSetHeader(null, msgs);
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
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER:
				return getHeader();
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__ACTIVE:
				return isActive();
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
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER:
				setHeader((BTSCorpusHeader)newValue);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__ACTIVE:
				setActive((Boolean)newValue);
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
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER:
				setHeader((BTSCorpusHeader)null);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
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
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER:
				return header != null;
			case BtsCorpusModelPackage.BTS_TEXT_CORPUS__ACTIVE:
				return active != ACTIVE_EDEFAULT;
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
		result.append(" (active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getCorpusPrefix() {
		return corpusPrefix;
	}
} //BTSTextCorpusImpl
