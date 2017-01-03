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
package org.bbaw.bts.btsmodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Action Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to record user actions such as selections and provide proposals based on
 * frequency users select this action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.UserActionCounter#getDateOfLastSelection <em>Date Of Last Selection</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.UserActionCounter#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getUserActionCounter()
 * @model
 * @generated
 */
public interface UserActionCounter extends BTSDBBaseObject {
	/**
	 * Returns the value of the '<em><b>Date Of Last Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Last Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Last Selection</em>' attribute.
	 * @see #setDateOfLastSelection(Date)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getUserActionCounter_DateOfLastSelection()
	 * @model
	 * @generated
	 */
	Date getDateOfLastSelection();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.UserActionCounter#getDateOfLastSelection <em>Date Of Last Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Last Selection</em>' attribute.
	 * @see #getDateOfLastSelection()
	 * @generated
	 */
	void setDateOfLastSelection(Date value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getUserActionCounter_Counter()
	 * @model
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.UserActionCounter#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

} // UserActionCounter
