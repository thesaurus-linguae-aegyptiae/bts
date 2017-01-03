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

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSRelation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Abstract Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph#getWitnesses <em>Witnesses</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractParagraph()
 * @model
 * @generated
 */
public interface BTSAbstractParagraph extends BTSIdentifiableItem {
	/**
	 * Returns the value of the '<em><b>Witnesses</b></em>' reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Witnesses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Witnesses</em>' reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractParagraph_Witnesses()
	 * @model
	 * @generated
	 */
	EList<BTSRelation> getWitnesses();

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(int)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractParagraph_SortKey()
	 * @model
	 * @generated
	 */
	int getSortKey();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractParagraph_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractParagraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BTSAbstractParagraph
