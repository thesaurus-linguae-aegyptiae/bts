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
package org.bbaw.bts.btsmodel.util;

import java.util.Map;
import org.bbaw.bts.btsmodel.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage
 * @generated
 */
public class BtsmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtsmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = BtsmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT: {
				AdministrativDataObject administrativDataObject = (AdministrativDataObject)theEObject;
				T result = caseAdministrativDataObject(administrativDataObject);
				if (result == null) result = caseBTSObservableObject(administrativDataObject);
				if (result == null) result = caseBTSIdentifiableItem(administrativDataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_OBJECT: {
				BTSObject btsObject = (BTSObject)theEObject;
				T result = caseBTSObject(btsObject);
				if (result == null) result = caseAdministrativDataObject(btsObject);
				if (result == null) result = caseBTSDBBaseObject(btsObject);
				if (result == null) result = caseBTSNamedTypedObject(btsObject);
				if (result == null) result = caseBTSObservableObject(btsObject);
				if (result == null) result = caseBTSIdentifiableItem(btsObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_USER: {
				BTSUser btsUser = (BTSUser)theEObject;
				T result = caseBTSUser(btsUser);
				if (result == null) result = caseBTSObject(btsUser);
				if (result == null) result = caseAdministrativDataObject(btsUser);
				if (result == null) result = caseBTSDBBaseObject(btsUser);
				if (result == null) result = caseBTSNamedTypedObject(btsUser);
				if (result == null) result = caseBTSObservableObject(btsUser);
				if (result == null) result = caseBTSIdentifiableItem(btsUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_COMMENT: {
				BTSComment btsComment = (BTSComment)theEObject;
				T result = caseBTSComment(btsComment);
				if (result == null) result = caseBTSObject(btsComment);
				if (result == null) result = caseAdministrativDataObject(btsComment);
				if (result == null) result = caseBTSDBBaseObject(btsComment);
				if (result == null) result = caseBTSNamedTypedObject(btsComment);
				if (result == null) result = caseBTSObservableObject(btsComment);
				if (result == null) result = caseBTSIdentifiableItem(btsComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE: {
				BTSInterTextReference btsInterTextReference = (BTSInterTextReference)theEObject;
				T result = caseBTSInterTextReference(btsInterTextReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TRANSLATION: {
				BTSTranslation btsTranslation = (BTSTranslation)theEObject;
				T result = caseBTSTranslation(btsTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_DATE: {
				BTSDate btsDate = (BTSDate)theEObject;
				T result = caseBTSDate(btsDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_RELATION: {
				BTSRelation btsRelation = (BTSRelation)theEObject;
				T result = caseBTSRelation(btsRelation);
				if (result == null) result = caseBTSIdentifiableItem(btsRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_CONFIGURATION: {
				BTSConfiguration btsConfiguration = (BTSConfiguration)theEObject;
				T result = caseBTSConfiguration(btsConfiguration);
				if (result == null) result = caseBTSConfig(btsConfiguration);
				if (result == null) result = caseBTSObject(btsConfiguration);
				if (result == null) result = caseAdministrativDataObject(btsConfiguration);
				if (result == null) result = caseBTSDBBaseObject(btsConfiguration);
				if (result == null) result = caseBTSNamedTypedObject(btsConfiguration);
				if (result == null) result = caseBTSObservableObject(btsConfiguration);
				if (result == null) result = caseBTSIdentifiableItem(btsConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTSDB_BASE_OBJECT: {
				BTSDBBaseObject btsdbBaseObject = (BTSDBBaseObject)theEObject;
				T result = caseBTSDBBaseObject(btsdbBaseObject);
				if (result == null) result = caseBTSIdentifiableItem(btsdbBaseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_REVISION: {
				BTSRevision btsRevision = (BTSRevision)theEObject;
				T result = caseBTSRevision(btsRevision);
				if (result == null) result = caseBTSIdentifiableItem(btsRevision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TIMESPAN: {
				BTSTimespan btsTimespan = (BTSTimespan)theEObject;
				T result = caseBTSTimespan(btsTimespan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_EXTERNAL_REFERENCE: {
				BTSExternalReference btsExternalReference = (BTSExternalReference)theEObject;
				T result = caseBTSExternalReference(btsExternalReference);
				if (result == null) result = caseBTSIdentifiableItem(btsExternalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_REFERENCABLE_ITEM: {
				BTSReferencableItem btsReferencableItem = (BTSReferencableItem)theEObject;
				T result = caseBTSReferencableItem(btsReferencableItem);
				if (result == null) result = caseBTSObject(btsReferencableItem);
				if (result == null) result = caseAdministrativDataObject(btsReferencableItem);
				if (result == null) result = caseBTSDBBaseObject(btsReferencableItem);
				if (result == null) result = caseBTSNamedTypedObject(btsReferencableItem);
				if (result == null) result = caseBTSObservableObject(btsReferencableItem);
				if (result == null) result = caseBTSIdentifiableItem(btsReferencableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_TRANSLATIONS: {
				BTSTranslations btsTranslations = (BTSTranslations)theEObject;
				T result = caseBTSTranslations(btsTranslations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_CONFIG_ITEM: {
				BTSConfigItem btsConfigItem = (BTSConfigItem)theEObject;
				T result = caseBTSConfigItem(btsConfigItem);
				if (result == null) result = caseBTSConfig(btsConfigItem);
				if (result == null) result = caseBTSObservableObject(btsConfigItem);
				if (result == null) result = caseBTSIdentifiableItem(btsConfigItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG: {
				BTSPassportEditorConfig btsPassportEditorConfig = (BTSPassportEditorConfig)theEObject;
				T result = caseBTSPassportEditorConfig(btsPassportEditorConfig);
				if (result == null) result = caseBTSIdentifiableItem(btsPassportEditorConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_USER_GROUP: {
				BTSUserGroup btsUserGroup = (BTSUserGroup)theEObject;
				T result = caseBTSUserGroup(btsUserGroup);
				if (result == null) result = caseBTSObject(btsUserGroup);
				if (result == null) result = caseAdministrativDataObject(btsUserGroup);
				if (result == null) result = caseBTSDBBaseObject(btsUserGroup);
				if (result == null) result = caseBTSNamedTypedObject(btsUserGroup);
				if (result == null) result = caseBTSObservableObject(btsUserGroup);
				if (result == null) result = caseBTSIdentifiableItem(btsUserGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_CONFIG: {
				BTSConfig btsConfig = (BTSConfig)theEObject;
				T result = caseBTSConfig(btsConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_OBSERVABLE_OBJECT: {
				BTSObservableObject btsObservableObject = (BTSObservableObject)theEObject;
				T result = caseBTSObservableObject(btsObservableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PROJECT: {
				BTSProject btsProject = (BTSProject)theEObject;
				T result = caseBTSProject(btsProject);
				if (result == null) result = caseBTSObject(btsProject);
				if (result == null) result = caseAdministrativDataObject(btsProject);
				if (result == null) result = caseBTSDBBaseObject(btsProject);
				if (result == null) result = caseBTSNamedTypedObject(btsProject);
				if (result == null) result = caseBTSObservableObject(btsProject);
				if (result == null) result = caseBTSIdentifiableItem(btsProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTSDB_CONNECTION: {
				BTSDBConnection btsdbConnection = (BTSDBConnection)theEObject;
				T result = caseBTSDBConnection(btsdbConnection);
				if (result == null) result = caseBTSIdentifiableItem(btsdbConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_WORKFLOW_RULE: {
				BTSWorkflowRule btsWorkflowRule = (BTSWorkflowRule)theEObject;
				T result = caseBTSWorkflowRule(btsWorkflowRule);
				if (result == null) result = caseBTSIdentifiableItem(btsWorkflowRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_OPERATOR: {
				BTSOperator btsOperator = (BTSOperator)theEObject;
				T result = caseBTSOperator(btsOperator);
				if (result == null) result = caseBTSWorkflowRuleItem(btsOperator);
				if (result == null) result = caseBTSObservableObject(btsOperator);
				if (result == null) result = caseBTSIdentifiableItem(btsOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM: {
				BTSWorkflowRuleItem btsWorkflowRuleItem = (BTSWorkflowRuleItem)theEObject;
				T result = caseBTSWorkflowRuleItem(btsWorkflowRuleItem);
				if (result == null) result = caseBTSObservableObject(btsWorkflowRuleItem);
				if (result == null) result = caseBTSIdentifiableItem(btsWorkflowRuleItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.DB_LEASE: {
				DBLease dbLease = (DBLease)theEObject;
				T result = caseDBLease(dbLease);
				if (result == null) result = caseBTSDBBaseObject(dbLease);
				if (result == null) result = caseBTSIdentifiableItem(dbLease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION: {
				BTSProjectDBCollection btsProjectDBCollection = (BTSProjectDBCollection)theEObject;
				T result = caseBTSProjectDBCollection(btsProjectDBCollection);
				if (result == null) result = caseBTSIdentifiableItem(btsProjectDBCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM: {
				BTSIdentifiableItem btsIdentifiableItem = (BTSIdentifiableItem)theEObject;
				T result = caseBTSIdentifiableItem(btsIdentifiableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC: {
				BTSDBCollectionRoleDesc btsdbCollectionRoleDesc = (BTSDBCollectionRoleDesc)theEObject;
				T result = caseBTSDBCollectionRoleDesc(btsdbCollectionRoleDesc);
				if (result == null) result = caseBTSIdentifiableItem(btsdbCollectionRoleDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.USER_ACTION_COUNTER: {
				UserActionCounter userActionCounter = (UserActionCounter)theEObject;
				T result = caseUserActionCounter(userActionCounter);
				if (result == null) result = caseBTSDBBaseObject(userActionCounter);
				if (result == null) result = caseBTSIdentifiableItem(userActionCounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.STRING_TO_STRING_LIST_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EList<String>> stringToStringListMap = (Map.Entry<String, EList<String>>)theEObject;
				T result = caseStringToStringListMap(stringToStringListMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.STRING_TO_STRING_MAP: {
				Map stringToStringMap = (Map)theEObject;
				T result = caseStringToStringMap(stringToStringMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTSID_RESERVATION_OBJECT: {
				BTSIDReservationObject btsidReservationObject = (BTSIDReservationObject)theEObject;
				T result = caseBTSIDReservationObject(btsidReservationObject);
				if (result == null) result = caseBTSDBBaseObject(btsidReservationObject);
				if (result == null) result = caseBTSIdentifiableItem(btsidReservationObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT: {
				BTSNamedTypedObject btsNamedTypedObject = (BTSNamedTypedObject)theEObject;
				T result = caseBTSNamedTypedObject(btsNamedTypedObject);
				if (result == null) result = caseBTSIdentifiableItem(btsNamedTypedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrativ Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrativ Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativDataObject(AdministrativDataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSObject(BTSObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSUser(BTSUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSComment(BTSComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Inter Text Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Inter Text Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSInterTextReference(BTSInterTextReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTranslation(BTSTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSDate(BTSDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSRelation(BTSRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSConfiguration(BTSConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTSDB Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTSDB Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSDBBaseObject(BTSDBBaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSRevision(BTSRevision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Timespan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Timespan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTimespan(BTSTimespan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS External Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSExternalReference(BTSExternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Referencable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Referencable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSReferencableItem(BTSReferencableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Translations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Translations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSTranslations(BTSTranslations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Config Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Config Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSConfigItem(BTSConfigItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Passport Editor Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Passport Editor Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSPassportEditorConfig(BTSPassportEditorConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS User Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS User Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSUserGroup(BTSUserGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSConfig(BTSConfig object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Observable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Observable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSObservableObject(BTSObservableObject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSProject(BTSProject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTSDB Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTSDB Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSDBConnection(BTSDBConnection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Workflow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Workflow Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSWorkflowRule(BTSWorkflowRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSOperator(BTSOperator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Workflow Rule Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Workflow Rule Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSWorkflowRuleItem(BTSWorkflowRuleItem object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Lease</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Lease</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBLease(DBLease object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Project DB Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Project DB Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSProjectDBCollection(BTSProjectDBCollection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Identifiable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Identifiable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSIdentifiableItem(BTSIdentifiableItem object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTSDB Collection Role Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTSDB Collection Role Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSDBCollectionRoleDesc(BTSDBCollectionRoleDesc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Action Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Action Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserActionCounter(UserActionCounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String List Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String List Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringListMap(Map.Entry<String, EList<String>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTSID Reservation Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTSID Reservation Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSIDReservationObject(BTSIDReservationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTS Named Typed Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTS Named Typed Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTSNamedTypedObject(BTSNamedTypedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BtsmodelSwitch
