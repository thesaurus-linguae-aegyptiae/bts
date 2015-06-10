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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Passport Editor Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class contains details fo passportEditor configuration that is configuration of 
 * GUI elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isRequired <em>Required</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getHorizontalWidth <em>Horizontal Width</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getPredicateList <em>Predicate List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSPassportEditorConfig()
 * @model
 * @generated
 */
public interface BTSPassportEditorConfig extends BTSIdentifiableItem {
	/**
	 * Returns the value of the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget Type</em>' attribute.
	 * @see #setWidgetType(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSPassportEditorConfig_WidgetType()
	 * @model
	 * @generated
	 */
	String getWidgetType();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getWidgetType <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget Type</em>' attribute.
	 * @see #getWidgetType()
	 * @generated
	 */
	void setWidgetType(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSPassportEditorConfig_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Multiple</em>' attribute.
	 * @see #setAllowMultiple(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSPassportEditorConfig_AllowMultiple()
	 * @model
	 * @generated
	 */
	boolean isAllowMultiple();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isAllowMultiple <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Multiple</em>' attribute.
	 * @see #isAllowMultiple()
	 * @generated
	 */
	void setAllowMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Width</em>' attribute.
	 * @see #setHorizontalWidth(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSPassportEditorConfig_HorizontalWidth()
	 * @model
	 * @generated
	 */
	int getHorizontalWidth();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getHorizontalWidth <em>Horizontal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Width</em>' attribute.
	 * @see #getHorizontalWidth()
	 * @generated
	 */
	void setHorizontalWidth(int value);

	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSPassportEditorConfig_Regex()
	 * @model
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

	/**
	 * Returns the value of the '<em><b>Predicate List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate List</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSPassportEditorConfig_PredicateList()
	 * @model
	 * @generated
	 */
	EList<String> getPredicateList();

} // BTSPassportEditorConfig
