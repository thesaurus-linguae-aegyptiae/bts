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
 * A representation of the model object '<em><b>BTS Workflow Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getSubRules <em>Sub Rules</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getActions <em>Actions</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getAcceptMessage <em>Accept Message</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOcl <em>Ocl</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOclSelfObject <em>Ocl Self Object</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getDenialMessage <em>Denial Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule()
 * @model
 * @generated
 */
public interface BTSWorkflowRule extends BTSIdentifiableItem
{
	/**
	 * Returns the value of the '<em><b>Sub Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Rules</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_SubRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSWorkflowRuleItem> getSubRules();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_Actions()
	 * @model
	 * @generated
	 */
	EList<String> getActions();

	/**
	 * Returns the value of the '<em><b>Accept Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Message</em>' attribute.
	 * @see #setAcceptMessage(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_AcceptMessage()
	 * @model
	 * @generated
	 */
	String getAcceptMessage();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getAcceptMessage <em>Accept Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Message</em>' attribute.
	 * @see #getAcceptMessage()
	 * @generated
	 */
	void setAcceptMessage(String value);

	/**
	 * Returns the value of the '<em><b>Ocl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl</em>' attribute.
	 * @see #setOcl(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_Ocl()
	 * @model
	 * @generated
	 */
	String getOcl();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOcl <em>Ocl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl</em>' attribute.
	 * @see #getOcl()
	 * @generated
	 */
	void setOcl(String value);

	/**
	 * Returns the value of the '<em><b>Ocl Self Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Self Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Self Object</em>' attribute.
	 * @see #setOclSelfObject(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_OclSelfObject()
	 * @model
	 * @generated
	 */
	String getOclSelfObject();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOclSelfObject <em>Ocl Self Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Self Object</em>' attribute.
	 * @see #getOclSelfObject()
	 * @generated
	 */
	void setOclSelfObject(String value);

	/**
	 * Returns the value of the '<em><b>Denial Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denial Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denial Message</em>' attribute.
	 * @see #setDenialMessage(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSWorkflowRule_DenialMessage()
	 * @model
	 * @generated
	 */
	String getDenialMessage();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getDenialMessage <em>Denial Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denial Message</em>' attribute.
	 * @see #getDenialMessage()
	 * @generated
	 */
	void setDenialMessage(String value);

} // BTSWorkflowRule
