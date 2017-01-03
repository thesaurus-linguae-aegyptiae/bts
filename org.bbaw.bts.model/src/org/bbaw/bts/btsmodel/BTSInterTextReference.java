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
 * A representation of the model object '<em><b>BTS Inter Text Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class serves to describe references within a text by refering to the ID of 
 * the starting element and to the ID of the ending element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getBeginId <em>Begin Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getEndId <em>End Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSInterTextReference()
 * @model
 * @generated
 */
public interface BTSInterTextReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Id</em>' attribute.
	 * @see #setBeginId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSInterTextReference_BeginId()
	 * @model
	 * @generated
	 */
	String getBeginId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getBeginId <em>Begin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Id</em>' attribute.
	 * @see #getBeginId()
	 * @generated
	 */
	void setBeginId(String value);

	/**
	 * Returns the value of the '<em><b>End Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Id</em>' attribute.
	 * @see #setEndId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSInterTextReference_EndId()
	 * @model
	 * @generated
	 */
	String getEndId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getEndId <em>End Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Id</em>' attribute.
	 * @see #getEndId()
	 * @generated
	 */
	void setEndId(String value);

} // BTSInterTextReference
