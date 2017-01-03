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

import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Passport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDate <em>Date</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport()
 * @model
 * @generated
 */
public interface BTSPassport extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(BTSTimespan)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport_Date()
	 * @model containment="true"
	 * @generated
	 */
	BTSTimespan getDate();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(BTSTimespan value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSPassportEntry> getChildren();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSTranslations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport_Descriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSTranslations> getDescriptions();

	/**
	 * <!-- begin-user-doc -->
	 * path as passport path, beginning with category, group... item. separated by >>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BTSPassportEntry getPassportEntryByPath(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getPassportEntryStringValueByPath(String path);

} // BTSPassport
