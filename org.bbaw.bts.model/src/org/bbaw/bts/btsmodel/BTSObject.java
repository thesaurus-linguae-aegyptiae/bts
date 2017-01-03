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

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>BTS Object</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the basic managed object in BTS.
 * It has basic properties such as name, type etc.
 * It also has typed relations.
 * 
 * All primary objects should extend BTSObject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getCode <em>Code</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getTempSortKey <em>Temp Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObject#getExternalReferences <em>External References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject()
 * @model abstract="true"
 * @generated
 */
public interface BTSObject extends AdministrativDataObject, BTSDBBaseObject, BTSNamedTypedObject
{
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObject#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSRelation> getRelations();

	/**
	 * Returns the value of the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Sort Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Sort Key</em>' attribute.
	 * @see #setTempSortKey(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_TempSortKey()
	 * @model transient="true"
	 * @generated
	 */
	int getTempSortKey();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObject#getTempSortKey <em>Temp Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Sort Key</em>' attribute.
	 * @see #getTempSortKey()
	 * @generated
	 */
	void setTempSortKey(int value);

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSExternalReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External References</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObject_ExternalReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSExternalReference> getExternalReferences();

} // BTSObject
