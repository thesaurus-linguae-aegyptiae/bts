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

import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextImpl#getTextContent <em>Text Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSTextImpl extends BTSCorpusObjectImpl implements BTSText {
	/**
	 * The cached value of the '{@link #getTextContent() <em>Text Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextContent()
	 * @generated
	 * @ordered
	 */
	protected BTSTextContent textContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTextContent getTextContent() {
		return textContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextContent(BTSTextContent newTextContent, NotificationChain msgs) {
		BTSTextContent oldTextContent = textContent;
		textContent = newTextContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT, oldTextContent, newTextContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextContent(BTSTextContent newTextContent) {
		if (newTextContent != textContent) {
			NotificationChain msgs = null;
			if (textContent != null)
				msgs = ((InternalEObject)textContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT, null, msgs);
			if (newTextContent != null)
				msgs = ((InternalEObject)newTextContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT, null, msgs);
			msgs = basicSetTextContent(newTextContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT, newTextContent, newTextContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT:
				return basicSetTextContent(null, msgs);
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
			case BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT:
				return getTextContent();
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
			case BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT:
				setTextContent((BTSTextContent)newValue);
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
			case BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT:
				setTextContent((BTSTextContent)null);
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
			case BtsCorpusModelPackage.BTS_TEXT__TEXT_CONTENT:
				return textContent != null;
		}
		return super.eIsSet(featureID);
	}

} //BTSTextImpl
