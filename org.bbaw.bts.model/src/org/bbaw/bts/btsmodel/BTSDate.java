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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDate#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDate#getYear <em>Year</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDate#getMonth <em>Month</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDate#getDay <em>Day</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDate#getRelativeRef <em>Relative Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDate()
 * @model
 * @generated
 */
public interface BTSDate extends EObject {
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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDate_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDate_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDate#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDate_Month()
	 * @model
	 * @generated
	 */
	int getMonth();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDate#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(int value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDate_Day()
	 * @model
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDate#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

	/**
	 * Returns the value of the '<em><b>Relative Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Ref</em>' attribute.
	 * @see #setRelativeRef(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDate_RelativeRef()
	 * @model
	 * @generated
	 */
	String getRelativeRef();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDate#getRelativeRef <em>Relative Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Ref</em>' attribute.
	 * @see #getRelativeRef()
	 * @generated
	 */
	void setRelativeRef(String value);

} // BTSDate
