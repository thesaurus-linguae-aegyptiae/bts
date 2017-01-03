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
package org.bbaw.bts.corpus.btsCorpusModel;

import org.bbaw.bts.btsmodel.BTSObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Corpus Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getPassport <em>Passport</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getCorpusPrefix <em>Corpus Prefix</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getWorkPhase <em>Work Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusObject()
 * @model abstract="true"
 * @generated
 */
public interface BTSCorpusObject extends BTSObject {
	/**
	 * Returns the value of the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport</em>' containment reference.
	 * @see #setPassport(BTSPassport)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusObject_Passport()
	 * @model containment="true"
	 * @generated
	 */
	BTSPassport getPassport();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getPassport <em>Passport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport</em>' containment reference.
	 * @see #getPassport()
	 * @generated
	 */
	void setPassport(BTSPassport value);

	/**
	 * Returns the value of the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corpus Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corpus Prefix</em>' attribute.
	 * @see #setCorpusPrefix(String)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusObject_CorpusPrefix()
	 * @model
	 * @generated
	 */
	String getCorpusPrefix();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getCorpusPrefix <em>Corpus Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corpus Prefix</em>' attribute.
	 * @see #getCorpusPrefix()
	 * @generated
	 */
	void setCorpusPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Phase</em>' attribute.
	 * @see #setWorkPhase(String)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusObject_WorkPhase()
	 * @model
	 * @generated
	 */
	String getWorkPhase();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getWorkPhase <em>Work Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Phase</em>' attribute.
	 * @see #getWorkPhase()
	 * @generated
	 */
	void setWorkPhase(String value);

} // BTSCorpusObject
