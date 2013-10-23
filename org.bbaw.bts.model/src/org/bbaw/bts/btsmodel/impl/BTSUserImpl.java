/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getState <em>State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getRevisionState <em>Revision State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getGroupIds <em>Group Ids</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getSigle <em>Sigle</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getWebDescription <em>Web Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getForeName <em>Fore Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getSureName <em>Sure Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getWebURL <em>Web URL</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getExternalReferneces <em>External Referneces</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#isLoggedIn <em>Logged In</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSUserImpl extends BTSDBBaseObjectImpl implements BTSUser {
	/**
	 * The default value of the '{@link #getPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyChangeSupport PROPERTY_CHANGE_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected PropertyChangeSupport propertyChangeSupport = PROPERTY_CHANGE_SUPPORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSRevision> revisions;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionState() <em>Revision State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionState()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionState() <em>Revision State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionState()
	 * @generated
	 * @ordered
	 */
	protected String revisionState = REVISION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected int sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupIds() <em>Group Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> groupIds;

	/**
	 * The default value of the '{@link #getSigle() <em>Sigle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigle()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSigle() <em>Sigle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigle()
	 * @generated
	 * @ordered
	 */
	protected String sigle = SIGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebDescription() <em>Web Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebDescription() <em>Web Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebDescription()
	 * @generated
	 * @ordered
	 */
	protected String webDescription = WEB_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeName() <em>Fore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeName() <em>Fore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeName()
	 * @generated
	 * @ordered
	 */
	protected String foreName = FORE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSureName() <em>Sure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSureName()
	 * @generated
	 * @ordered
	 */
	protected static final String SURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSureName() <em>Sure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSureName()
	 * @generated
	 * @ordered
	 */
	protected String sureName = SURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebURL() <em>Web URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebURL()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebURL() <em>Web URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebURL()
	 * @generated
	 * @ordered
	 */
	protected String webURL = WEB_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalReferneces() <em>External Referneces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferneces()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSExternalReference> externalReferneces;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roles;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoggedIn() <em>Logged In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoggedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOGGED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoggedIn() <em>Logged In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoggedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean loggedIn = LOGGED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeSupport getPropertyChangeSupport()
	{
		return propertyChangeSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyChangeSupport(PropertyChangeSupport newPropertyChangeSupport)
	{
		PropertyChangeSupport oldPropertyChangeSupport = propertyChangeSupport;
		propertyChangeSupport = newPropertyChangeSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSRevision> getRevisions() {
		if (revisions == null)
		{
			revisions = new EObjectContainmentEList<BTSRevision>(BTSRevision.class, this, BtsmodelPackage.BTS_USER__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevisionState() {
		return revisionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionState(String newRevisionState) {
		String oldRevisionState = revisionState;
		revisionState = newRevisionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__REVISION_STATE, oldRevisionState, revisionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortKey()
	{
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(int newSortKey)
	{
		int oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType)
	{
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype()
	{
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype)
	{
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode)
	{
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGroupIds() {
		if (groupIds == null)
		{
			groupIds = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_USER__GROUP_IDS);
		}
		return groupIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSigle() {
		return sigle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigle(String newSigle) {
		String oldSigle = sigle;
		sigle = newSigle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__SIGLE, oldSigle, sigle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebDescription() {
		return webDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebDescription(String newWebDescription) {
		String oldWebDescription = webDescription;
		webDescription = newWebDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__WEB_DESCRIPTION, oldWebDescription, webDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeName() {
		return foreName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeName(String newForeName) {
		String oldForeName = foreName;
		foreName = newForeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__FORE_NAME, oldForeName, foreName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSureName() {
		return sureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSureName(String newSureName) {
		String oldSureName = sureName;
		sureName = newSureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__SURE_NAME, oldSureName, sureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebURL() {
		return webURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebURL(String newWebURL) {
		String oldWebURL = webURL;
		webURL = newWebURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__WEB_URL, oldWebURL, webURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSExternalReference> getExternalReferneces() {
		if (externalReferneces == null)
		{
			externalReferneces = new EObjectContainmentEList<BTSExternalReference>(BTSExternalReference.class, this, BtsmodelPackage.BTS_USER__EXTERNAL_REFERNECES);
		}
		return externalReferneces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoles() {
		if (roles == null)
		{
			roles = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_USER__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword)
	{
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoggedIn()
	{
		return loggedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoggedIn(boolean newLoggedIn)
	{
		boolean oldLoggedIn = loggedIn;
		loggedIn = newLoggedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__LOGGED_IN, oldLoggedIn, loggedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus()
	{
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus)
	{
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case BtsmodelPackage.BTS_USER__REVISIONS:
				return ((InternalEList<?>)getRevisions()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_USER__EXTERNAL_REFERNECES:
				return ((InternalEList<?>)getExternalReferneces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case BtsmodelPackage.BTS_USER__PROPERTY_CHANGE_SUPPORT:
				return getPropertyChangeSupport();
			case BtsmodelPackage.BTS_USER__REVISIONS:
				return getRevisions();
			case BtsmodelPackage.BTS_USER__STATE:
				return getState();
			case BtsmodelPackage.BTS_USER__REVISION_STATE:
				return getRevisionState();
			case BtsmodelPackage.BTS_USER__VISIBILITY:
				return getVisibility();
			case BtsmodelPackage.BTS_USER__SORT_KEY:
				return getSortKey();
			case BtsmodelPackage.BTS_USER__NAME:
				return getName();
			case BtsmodelPackage.BTS_USER__TYPE:
				return getType();
			case BtsmodelPackage.BTS_USER__SUBTYPE:
				return getSubtype();
			case BtsmodelPackage.BTS_USER__CODE:
				return getCode();
			case BtsmodelPackage.BTS_USER__GROUP_IDS:
				return getGroupIds();
			case BtsmodelPackage.BTS_USER__SIGLE:
				return getSigle();
			case BtsmodelPackage.BTS_USER__DESCRIPTION:
				return getDescription();
			case BtsmodelPackage.BTS_USER__WEB_DESCRIPTION:
				return getWebDescription();
			case BtsmodelPackage.BTS_USER__USER_NAME:
				return getUserName();
			case BtsmodelPackage.BTS_USER__FORE_NAME:
				return getForeName();
			case BtsmodelPackage.BTS_USER__SURE_NAME:
				return getSureName();
			case BtsmodelPackage.BTS_USER__MAIL:
				return getMail();
			case BtsmodelPackage.BTS_USER__WEB_URL:
				return getWebURL();
			case BtsmodelPackage.BTS_USER__COMMENT:
				return getComment();
			case BtsmodelPackage.BTS_USER__EXTERNAL_REFERNECES:
				return getExternalReferneces();
			case BtsmodelPackage.BTS_USER__ROLES:
				return getRoles();
			case BtsmodelPackage.BTS_USER__PASSWORD:
				return getPassword();
			case BtsmodelPackage.BTS_USER__LOGGED_IN:
				return isLoggedIn();
			case BtsmodelPackage.BTS_USER__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case BtsmodelPackage.BTS_USER__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((PropertyChangeSupport)newValue);
				return;
			case BtsmodelPackage.BTS_USER__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends BTSRevision>)newValue);
				return;
			case BtsmodelPackage.BTS_USER__STATE:
				setState((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__REVISION_STATE:
				setRevisionState((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__SORT_KEY:
				setSortKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_USER__NAME:
				setName((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__TYPE:
				setType((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__CODE:
				setCode((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__GROUP_IDS:
				getGroupIds().clear();
				getGroupIds().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_USER__SIGLE:
				setSigle((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__WEB_DESCRIPTION:
				setWebDescription((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__FORE_NAME:
				setForeName((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__SURE_NAME:
				setSureName((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__MAIL:
				setMail((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__WEB_URL:
				setWebURL((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__COMMENT:
				setComment((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__EXTERNAL_REFERNECES:
				getExternalReferneces().clear();
				getExternalReferneces().addAll((Collection<? extends BTSExternalReference>)newValue);
				return;
			case BtsmodelPackage.BTS_USER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__LOGGED_IN:
				setLoggedIn((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_USER__STATUS:
				setStatus((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case BtsmodelPackage.BTS_USER__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__REVISIONS:
				getRevisions().clear();
				return;
			case BtsmodelPackage.BTS_USER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__REVISION_STATE:
				setRevisionState(REVISION_STATE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__GROUP_IDS:
				getGroupIds().clear();
				return;
			case BtsmodelPackage.BTS_USER__SIGLE:
				setSigle(SIGLE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__WEB_DESCRIPTION:
				setWebDescription(WEB_DESCRIPTION_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__FORE_NAME:
				setForeName(FORE_NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__SURE_NAME:
				setSureName(SURE_NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__MAIL:
				setMail(MAIL_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__WEB_URL:
				setWebURL(WEB_URL_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__EXTERNAL_REFERNECES:
				getExternalReferneces().clear();
				return;
			case BtsmodelPackage.BTS_USER__ROLES:
				getRoles().clear();
				return;
			case BtsmodelPackage.BTS_USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__LOGGED_IN:
				setLoggedIn(LOGGED_IN_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case BtsmodelPackage.BTS_USER__PROPERTY_CHANGE_SUPPORT:
				return PROPERTY_CHANGE_SUPPORT_EDEFAULT == null ? propertyChangeSupport != null : !PROPERTY_CHANGE_SUPPORT_EDEFAULT.equals(propertyChangeSupport);
			case BtsmodelPackage.BTS_USER__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case BtsmodelPackage.BTS_USER__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case BtsmodelPackage.BTS_USER__REVISION_STATE:
				return REVISION_STATE_EDEFAULT == null ? revisionState != null : !REVISION_STATE_EDEFAULT.equals(revisionState);
			case BtsmodelPackage.BTS_USER__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case BtsmodelPackage.BTS_USER__SORT_KEY:
				return sortKey != SORT_KEY_EDEFAULT;
			case BtsmodelPackage.BTS_USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BtsmodelPackage.BTS_USER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsmodelPackage.BTS_USER__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case BtsmodelPackage.BTS_USER__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case BtsmodelPackage.BTS_USER__GROUP_IDS:
				return groupIds != null && !groupIds.isEmpty();
			case BtsmodelPackage.BTS_USER__SIGLE:
				return SIGLE_EDEFAULT == null ? sigle != null : !SIGLE_EDEFAULT.equals(sigle);
			case BtsmodelPackage.BTS_USER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BtsmodelPackage.BTS_USER__WEB_DESCRIPTION:
				return WEB_DESCRIPTION_EDEFAULT == null ? webDescription != null : !WEB_DESCRIPTION_EDEFAULT.equals(webDescription);
			case BtsmodelPackage.BTS_USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case BtsmodelPackage.BTS_USER__FORE_NAME:
				return FORE_NAME_EDEFAULT == null ? foreName != null : !FORE_NAME_EDEFAULT.equals(foreName);
			case BtsmodelPackage.BTS_USER__SURE_NAME:
				return SURE_NAME_EDEFAULT == null ? sureName != null : !SURE_NAME_EDEFAULT.equals(sureName);
			case BtsmodelPackage.BTS_USER__MAIL:
				return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
			case BtsmodelPackage.BTS_USER__WEB_URL:
				return WEB_URL_EDEFAULT == null ? webURL != null : !WEB_URL_EDEFAULT.equals(webURL);
			case BtsmodelPackage.BTS_USER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BtsmodelPackage.BTS_USER__EXTERNAL_REFERNECES:
				return externalReferneces != null && !externalReferneces.isEmpty();
			case BtsmodelPackage.BTS_USER__ROLES:
				return roles != null && !roles.isEmpty();
			case BtsmodelPackage.BTS_USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case BtsmodelPackage.BTS_USER__LOGGED_IN:
				return loggedIn != LOGGED_IN_EDEFAULT;
			case BtsmodelPackage.BTS_USER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BTSObservableObject.class)
		{
			switch (derivedFeatureID)
			{
				case BtsmodelPackage.BTS_USER__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class)
		{
			switch (derivedFeatureID)
			{
				case BtsmodelPackage.BTS_USER__REVISIONS: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS;
				case BtsmodelPackage.BTS_USER__STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE;
				case BtsmodelPackage.BTS_USER__REVISION_STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE;
				case BtsmodelPackage.BTS_USER__VISIBILITY: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class)
		{
			switch (derivedFeatureID)
			{
				case BtsmodelPackage.BTS_USER__SORT_KEY: return BtsmodelPackage.BTS_OBJECT__SORT_KEY;
				case BtsmodelPackage.BTS_USER__NAME: return BtsmodelPackage.BTS_OBJECT__NAME;
				case BtsmodelPackage.BTS_USER__TYPE: return BtsmodelPackage.BTS_OBJECT__TYPE;
				case BtsmodelPackage.BTS_USER__SUBTYPE: return BtsmodelPackage.BTS_OBJECT__SUBTYPE;
				case BtsmodelPackage.BTS_USER__CODE: return BtsmodelPackage.BTS_OBJECT__CODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BTSObservableObject.class)
		{
			switch (baseFeatureID)
			{
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_USER__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class)
		{
			switch (baseFeatureID)
			{
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS: return BtsmodelPackage.BTS_USER__REVISIONS;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE: return BtsmodelPackage.BTS_USER__STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE: return BtsmodelPackage.BTS_USER__REVISION_STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY: return BtsmodelPackage.BTS_USER__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class)
		{
			switch (baseFeatureID)
			{
				case BtsmodelPackage.BTS_OBJECT__SORT_KEY: return BtsmodelPackage.BTS_USER__SORT_KEY;
				case BtsmodelPackage.BTS_OBJECT__NAME: return BtsmodelPackage.BTS_USER__NAME;
				case BtsmodelPackage.BTS_OBJECT__TYPE: return BtsmodelPackage.BTS_USER__TYPE;
				case BtsmodelPackage.BTS_OBJECT__SUBTYPE: return BtsmodelPackage.BTS_USER__SUBTYPE;
				case BtsmodelPackage.BTS_OBJECT__CODE: return BtsmodelPackage.BTS_USER__CODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == BTSObservableObject.class)
		{
			switch (baseOperationID)
			{
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_USER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_USER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class)
		{
			switch (baseOperationID)
			{
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class)
		{
			switch (baseOperationID)
			{
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case BtsmodelPackage.BTS_USER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				addPropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
			case BtsmodelPackage.BTS_USER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				removePropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyChangeSupport: ");
		result.append(propertyChangeSupport);
		result.append(", state: ");
		result.append(state);
		result.append(", revisionState: ");
		result.append(revisionState);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", code: ");
		result.append(code);
		result.append(", groupIds: ");
		result.append(groupIds);
		result.append(", sigle: ");
		result.append(sigle);
		result.append(", description: ");
		result.append(description);
		result.append(", webDescription: ");
		result.append(webDescription);
		result.append(", userName: ");
		result.append(userName);
		result.append(", foreName: ");
		result.append(foreName);
		result.append(", sureName: ");
		result.append(sureName);
		result.append(", mail: ");
		result.append(mail);
		result.append(", webURL: ");
		result.append(webURL);
		result.append(", comment: ");
		result.append(comment);
		result.append(", roles: ");
		result.append(roles);
		result.append(", password: ");
		result.append(password);
		result.append(", loggedIn: ");
		result.append(loggedIn);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //BTSUserImpl
