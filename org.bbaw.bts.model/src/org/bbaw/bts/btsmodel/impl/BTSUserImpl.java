/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#isLoggedIn <em>Logged In</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl#isDbAdmin <em>Db Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSUserImpl extends BTSObjectImpl implements BTSUser {
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
	 * The default value of the '{@link #isDbAdmin() <em>Db Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DB_ADMIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDbAdmin() <em>Db Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDbAdmin()
	 * @generated
	 * @ordered
	 */
	protected boolean dbAdmin = DB_ADMIN_EDEFAULT;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOt
	 */
	public String getName()
	{
		if (name == null || "".equals(name)) {
			return getForeName() + " " + getSureName();
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGroupIds() {
		if (groupIds == null) {
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
	public boolean isDbAdmin() {
		return dbAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbAdmin(boolean newDbAdmin) {
		boolean oldDbAdmin = dbAdmin;
		dbAdmin = newDbAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER__DB_ADMIN, oldDbAdmin, dbAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
			case BtsmodelPackage.BTS_USER__PASSWORD:
				return getPassword();
			case BtsmodelPackage.BTS_USER__LOGGED_IN:
				return isLoggedIn();
			case BtsmodelPackage.BTS_USER__STATUS:
				return getStatus();
			case BtsmodelPackage.BTS_USER__DB_ADMIN:
				return isDbAdmin();
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
		switch (featureID) {
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
			case BtsmodelPackage.BTS_USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__LOGGED_IN:
				setLoggedIn((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_USER__STATUS:
				setStatus((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER__DB_ADMIN:
				setDbAdmin((Boolean)newValue);
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
		switch (featureID) {
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
			case BtsmodelPackage.BTS_USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__LOGGED_IN:
				setLoggedIn(LOGGED_IN_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER__DB_ADMIN:
				setDbAdmin(DB_ADMIN_EDEFAULT);
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
		switch (featureID) {
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
			case BtsmodelPackage.BTS_USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case BtsmodelPackage.BTS_USER__LOGGED_IN:
				return loggedIn != LOGGED_IN_EDEFAULT;
			case BtsmodelPackage.BTS_USER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case BtsmodelPackage.BTS_USER__DB_ADMIN:
				return dbAdmin != DB_ADMIN_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (groupIds: ");
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
		result.append(", password: ");
		result.append(password);
		result.append(", loggedIn: ");
		result.append(loggedIn);
		result.append(", status: ");
		result.append(status);
		result.append(", dbAdmin: ");
		result.append(dbAdmin);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getDBCollectionKey() {
		return "admin";
	}
} //BTSUserImpl
