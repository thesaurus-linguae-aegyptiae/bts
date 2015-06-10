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
package org.bbaw.bts.btsmodel.impl;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bbaw.bts.btsmodel.*;
import org.bbaw.bts.commons.BTSConstants;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class BtsmodelFactoryImpl extends EFactoryImpl implements BtsmodelFactory
{
	
	private Pattern revisionPattern = Pattern.compile(BTSConstants.REVISION_STRING_PATTERN);

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static BtsmodelFactory init()
	{
		try {
			BtsmodelFactory theBtsmodelFactory = (BtsmodelFactory)EPackage.Registry.INSTANCE.getEFactory(BtsmodelPackage.eNS_URI);
			if (theBtsmodelFactory != null) {
				return theBtsmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtsmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public BtsmodelFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case BtsmodelPackage.BTS_USER: return createBTSUser();
			case BtsmodelPackage.BTS_COMMENT: return createBTSComment();
			case BtsmodelPackage.BTS_INTER_TEXT_REFERENCE: return createBTSInterTextReference();
			case BtsmodelPackage.BTS_TRANSLATION: return createBTSTranslation();
			case BtsmodelPackage.BTS_DATE: return createBTSDate();
			case BtsmodelPackage.BTS_RELATION: return createBTSRelation();
			case BtsmodelPackage.BTS_CONFIGURATION: return createBTSConfiguration();
			case BtsmodelPackage.BTS_REVISION: return createBTSRevision();
			case BtsmodelPackage.BTS_TIMESPAN: return createBTSTimespan();
			case BtsmodelPackage.BTS_EXTERNAL_REFERENCE: return createBTSExternalReference();
			case BtsmodelPackage.BTS_TRANSLATIONS: return createBTSTranslations();
			case BtsmodelPackage.BTS_CONFIG_ITEM: return createBTSConfigItem();
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG: return createBTSPassportEditorConfig();
			case BtsmodelPackage.BTS_USER_GROUP: return createBTSUserGroup();
			case BtsmodelPackage.BTS_PROJECT: return createBTSProject();
			case BtsmodelPackage.BTSDB_CONNECTION: return createBTSDBConnection();
			case BtsmodelPackage.BTS_WORKFLOW_RULE: return createBTSWorkflowRule();
			case BtsmodelPackage.BTS_OPERATOR: return createBTSOperator();
			case BtsmodelPackage.DB_LEASE: return createDBLease();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION: return createBTSProjectDBCollection();
			case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC: return createBTSDBCollectionRoleDesc();
			case BtsmodelPackage.USER_ACTION_COUNTER: return createUserActionCounter();
			case BtsmodelPackage.STRING_TO_STRING_LIST_MAP: return (EObject)createStringToStringListMap();
			case BtsmodelPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			case BtsmodelPackage.BTSID_RESERVATION_OBJECT: return createBTSIDReservationObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	private void setIdentifiableId(EObject eObject)
	{
		if (eObject instanceof BTSIdentifiableItem)
		{
			((BTSIdentifiableItem) eObject).set_id(BTSConstants.getSidWithCalendar());
		}
		if (eObject instanceof AdministrativDataObject)
		{
			((AdministrativDataObject) eObject)
					.setState(BTSConstants.OBJECT_STATE_ACTIVE);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	
	

	

	


	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSUser createBTSUser()
	{
		BTSUserImpl btsUser = new BTSUserImpl();
		setIdentifiableId(btsUser);
		return btsUser;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSComment createBTSComment()
	{
		BTSCommentImpl btsComment = new BTSCommentImpl();
		setIdentifiableId(btsComment);
		return btsComment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSInterTextReference createBTSInterTextReference()
	{
		BTSInterTextReferenceImpl btsInterTextReference = new BTSInterTextReferenceImpl();
		setIdentifiableId(btsInterTextReference);
		return btsInterTextReference;
	}

	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSTranslation createBTSTranslation()
	{
		BTSTranslationImpl btsTranslation = new BTSTranslationImpl();
		setIdentifiableId(btsTranslation);
		return btsTranslation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSDate createBTSDate()
	{
		BTSDateImpl btsDate = new BTSDateImpl();
		setIdentifiableId(btsDate);
		return btsDate;
	}

	



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSRelation createBTSRelation()
	{
		BTSRelationImpl btsRelation = new BTSRelationImpl();
		setIdentifiableId(btsRelation);
		return btsRelation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSConfiguration createBTSConfiguration()
	{
		BTSConfigurationImpl btsConfiguration = new BTSConfigurationImpl();
		setIdentifiableId(btsConfiguration);
		return btsConfiguration;
	}

	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSRevision createBTSRevision()
	{
		BTSRevisionImpl btsRevision = new BTSRevisionImpl();
		setIdentifiableId(btsRevision);
		return btsRevision;
	}

	

	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSTimespan createBTSTimespan()
	{
		BTSTimespanImpl btsTimespan = new BTSTimespanImpl();
		setIdentifiableId(btsTimespan);
		return btsTimespan;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSExternalReference createBTSExternalReference()
	{
		BTSExternalReferenceImpl btsExternalReference = new BTSExternalReferenceImpl();
		setIdentifiableId(btsExternalReference);
		return btsExternalReference;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSTranslations createBTSTranslations()
	{
		BTSTranslationsImpl btsTranslations = new BTSTranslationsImpl();
		setIdentifiableId(btsTranslations);
		return btsTranslations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSConfigItem createBTSConfigItem()
	{
		BTSConfigItemImpl btsConfigItem = new BTSConfigItemImpl();
		setIdentifiableId(btsConfigItem);
		return btsConfigItem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSPassportEditorConfig createBTSPassportEditorConfig()
	{
		BTSPassportEditorConfigImpl btsPassportEditorConfig = new BTSPassportEditorConfigImpl();
		setIdentifiableId(btsPassportEditorConfig);
		return btsPassportEditorConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSUserGroup createBTSUserGroup()
	{
		BTSUserGroupImpl btsUserGroup = new BTSUserGroupImpl();
		setIdentifiableId(btsUserGroup);
		return btsUserGroup;
	}




	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSProject createBTSProject()
	{
		BTSProjectImpl btsProject = new BTSProjectImpl();
		setIdentifiableId(btsProject);
		return btsProject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSDBConnection createBTSDBConnection()
	{
		BTSDBConnectionImpl btsdbConnection = new BTSDBConnectionImpl();
		setIdentifiableId(btsdbConnection);
		return btsdbConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSWorkflowRule createBTSWorkflowRule()
	{
		BTSWorkflowRuleImpl btsWorkflowRule = new BTSWorkflowRuleImpl();
		setIdentifiableId(btsWorkflowRule);
		return btsWorkflowRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSOperator createBTSOperator()
	{
		BTSOperatorImpl btsOperator = new BTSOperatorImpl();
		setIdentifiableId(btsOperator);
		return btsOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public DBLease createDBLease()
	{
		DBLeaseImpl dbLease = new DBLeaseImpl();
		setIdentifiableId(dbLease);
		return dbLease;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSProjectDBCollection createBTSProjectDBCollection()
	{
		BTSProjectDBCollectionImpl btsProjectDBCollection = new BTSProjectDBCollectionImpl();
		setIdentifiableId(btsProjectDBCollection);
		return btsProjectDBCollection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSDBCollectionRoleDesc createBTSDBCollectionRoleDesc()
	{
		BTSDBCollectionRoleDescImpl btsdbCollectionRoleDesc = new BTSDBCollectionRoleDescImpl();
		setIdentifiableId(btsdbCollectionRoleDesc);
		return btsdbCollectionRoleDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserActionCounter createUserActionCounter() {
		UserActionCounterImpl userActionCounter = new UserActionCounterImpl();
		return userActionCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EList<String>> createStringToStringListMap() {
		StringToStringListMapImpl stringToStringListMap = new StringToStringListMapImpl();
		return stringToStringListMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createStringToStringMap() {
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSIDReservationObject createBTSIDReservationObject() {
		BTSIDReservationObjectImpl btsidReservationObject = new BTSIDReservationObjectImpl();
		return btsidReservationObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BtsmodelPackage getBtsmodelPackage()
	{
		return (BtsmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generatedNOT
	 */
	@Deprecated
	public static BtsmodelPackage getPackage()
	{
		return BtsmodelPackage.eINSTANCE;
	}

	@Override
	public BTSRevision createBTSRevision(int rev, Date timestamp,
			String userId) {
		BTSRevision revision = createBTSRevision();
		revision.setRef(rev);
		revision.setTimeStamp(timestamp);
		revision.setUserId(userId);
		return revision;
	}

	@Override
	public BTSRevision createBTSRevision(String revisionString) {
		Matcher m = revisionPattern.matcher(revisionString);
		if (!m.matches())
		{
			return null;
		}
		String r = m.group(1);
		String time = m.group(2);
		String userId = m.group(3);
		int rev = 0;
		try {
			rev = Integer.parseInt(r);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		Date timeStamp = null;
		try {
			timeStamp = BTSConstants.ADMIN_DATE_FORMAT.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
			timeStamp = Calendar.getInstance().getTime();
		}
		
		return createBTSRevision(rev, timeStamp, userId);
	}

	

} // BtsmodelFactoryImpl
