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
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS User Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getState <em>State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getRevisionState <em>Revision State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getTempSortKey <em>Temp Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSUserGroupImpl extends BTSDBBaseObjectImpl implements BTSUserGroup {
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
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSRelation> relations;

	/**
	 * The default value of the '{@link #getTempSortKey() <em>Temp Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMP_SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempSortKey() <em>Temp Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempSortKey()
	 * @generated
	 * @ordered
	 */
	protected int tempSortKey = TEMP_SORT_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSExternalReference> externalReferences;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSUserGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_USER_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSRevision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<BTSRevision>(BTSRevision.class, this, BtsmodelPackage.BTS_USER_GROUP__REVISIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__REVISION_STATE, oldRevisionState, revisionState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__VISIBILITY, oldVisibility, visibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__SORT_KEY, oldSortKey, sortKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__SUBTYPE, oldSubtype, subtype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<BTSRelation>(BTSRelation.class, this, BtsmodelPackage.BTS_USER_GROUP__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTempSortKey() {
		return tempSortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempSortKey(int newTempSortKey) {
		int oldTempSortKey = tempSortKey;
		tempSortKey = newTempSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__TEMP_SORT_KEY, oldTempSortKey, tempSortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSExternalReference> getExternalReferences() {
		if (externalReferences == null) {
			externalReferences = new EObjectContainmentEList<BTSExternalReference>(BTSExternalReference.class, this, BtsmodelPackage.BTS_USER_GROUP__EXTERNAL_REFERENCES);
		}
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_USER_GROUP__COMMENT, oldComment, comment));
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
		switch (featureID) {
			case BtsmodelPackage.BTS_USER_GROUP__REVISIONS:
				return ((InternalEList<?>)getRevisions()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_USER_GROUP__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_USER_GROUP__EXTERNAL_REFERENCES:
				return ((InternalEList<?>)getExternalReferences()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case BtsmodelPackage.BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT:
				return getPropertyChangeSupport();
			case BtsmodelPackage.BTS_USER_GROUP__REVISIONS:
				return getRevisions();
			case BtsmodelPackage.BTS_USER_GROUP__STATE:
				return getState();
			case BtsmodelPackage.BTS_USER_GROUP__REVISION_STATE:
				return getRevisionState();
			case BtsmodelPackage.BTS_USER_GROUP__VISIBILITY:
				return getVisibility();
			case BtsmodelPackage.BTS_USER_GROUP__SORT_KEY:
				return getSortKey();
			case BtsmodelPackage.BTS_USER_GROUP__NAME:
				return getName();
			case BtsmodelPackage.BTS_USER_GROUP__TYPE:
				return getType();
			case BtsmodelPackage.BTS_USER_GROUP__SUBTYPE:
				return getSubtype();
			case BtsmodelPackage.BTS_USER_GROUP__CODE:
				return getCode();
			case BtsmodelPackage.BTS_USER_GROUP__RELATIONS:
				return getRelations();
			case BtsmodelPackage.BTS_USER_GROUP__TEMP_SORT_KEY:
				return getTempSortKey();
			case BtsmodelPackage.BTS_USER_GROUP__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BtsmodelPackage.BTS_USER_GROUP__CATEGORY:
				return getCategory();
			case BtsmodelPackage.BTS_USER_GROUP__COMMENT:
				return getComment();
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
			case BtsmodelPackage.BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((PropertyChangeSupport)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends BTSRevision>)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__STATE:
				setState((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__REVISION_STATE:
				setRevisionState((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__SORT_KEY:
				setSortKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__NAME:
				setName((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__TYPE:
				setType((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__CODE:
				setCode((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends BTSRelation>)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__TEMP_SORT_KEY:
				setTempSortKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				getExternalReferences().addAll((Collection<? extends BTSExternalReference>)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__CATEGORY:
				setCategory((String)newValue);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__COMMENT:
				setComment((String)newValue);
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
			case BtsmodelPackage.BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__REVISIONS:
				getRevisions().clear();
				return;
			case BtsmodelPackage.BTS_USER_GROUP__STATE:
				setState(STATE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__REVISION_STATE:
				setRevisionState(REVISION_STATE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__RELATIONS:
				getRelations().clear();
				return;
			case BtsmodelPackage.BTS_USER_GROUP__TEMP_SORT_KEY:
				setTempSortKey(TEMP_SORT_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				return;
			case BtsmodelPackage.BTS_USER_GROUP__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_USER_GROUP__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case BtsmodelPackage.BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT:
				return PROPERTY_CHANGE_SUPPORT_EDEFAULT == null ? propertyChangeSupport != null : !PROPERTY_CHANGE_SUPPORT_EDEFAULT.equals(propertyChangeSupport);
			case BtsmodelPackage.BTS_USER_GROUP__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case BtsmodelPackage.BTS_USER_GROUP__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case BtsmodelPackage.BTS_USER_GROUP__REVISION_STATE:
				return REVISION_STATE_EDEFAULT == null ? revisionState != null : !REVISION_STATE_EDEFAULT.equals(revisionState);
			case BtsmodelPackage.BTS_USER_GROUP__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case BtsmodelPackage.BTS_USER_GROUP__SORT_KEY:
				return sortKey != SORT_KEY_EDEFAULT;
			case BtsmodelPackage.BTS_USER_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BtsmodelPackage.BTS_USER_GROUP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsmodelPackage.BTS_USER_GROUP__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case BtsmodelPackage.BTS_USER_GROUP__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case BtsmodelPackage.BTS_USER_GROUP__RELATIONS:
				return relations != null && !relations.isEmpty();
			case BtsmodelPackage.BTS_USER_GROUP__TEMP_SORT_KEY:
				return tempSortKey != TEMP_SORT_KEY_EDEFAULT;
			case BtsmodelPackage.BTS_USER_GROUP__EXTERNAL_REFERENCES:
				return externalReferences != null && !externalReferences.isEmpty();
			case BtsmodelPackage.BTS_USER_GROUP__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case BtsmodelPackage.BTS_USER_GROUP__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		if (baseClass == BTSObservableObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_USER_GROUP__REVISIONS: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS;
				case BtsmodelPackage.BTS_USER_GROUP__STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE;
				case BtsmodelPackage.BTS_USER_GROUP__REVISION_STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE;
				case BtsmodelPackage.BTS_USER_GROUP__VISIBILITY: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_USER_GROUP__SORT_KEY: return BtsmodelPackage.BTS_OBJECT__SORT_KEY;
				case BtsmodelPackage.BTS_USER_GROUP__NAME: return BtsmodelPackage.BTS_OBJECT__NAME;
				case BtsmodelPackage.BTS_USER_GROUP__TYPE: return BtsmodelPackage.BTS_OBJECT__TYPE;
				case BtsmodelPackage.BTS_USER_GROUP__SUBTYPE: return BtsmodelPackage.BTS_OBJECT__SUBTYPE;
				case BtsmodelPackage.BTS_USER_GROUP__CODE: return BtsmodelPackage.BTS_OBJECT__CODE;
				case BtsmodelPackage.BTS_USER_GROUP__RELATIONS: return BtsmodelPackage.BTS_OBJECT__RELATIONS;
				case BtsmodelPackage.BTS_USER_GROUP__TEMP_SORT_KEY: return BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY;
				case BtsmodelPackage.BTS_USER_GROUP__EXTERNAL_REFERENCES: return BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES;
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
		if (baseClass == BTSObservableObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS: return BtsmodelPackage.BTS_USER_GROUP__REVISIONS;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE: return BtsmodelPackage.BTS_USER_GROUP__STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE: return BtsmodelPackage.BTS_USER_GROUP__REVISION_STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY: return BtsmodelPackage.BTS_USER_GROUP__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_OBJECT__SORT_KEY: return BtsmodelPackage.BTS_USER_GROUP__SORT_KEY;
				case BtsmodelPackage.BTS_OBJECT__NAME: return BtsmodelPackage.BTS_USER_GROUP__NAME;
				case BtsmodelPackage.BTS_OBJECT__TYPE: return BtsmodelPackage.BTS_USER_GROUP__TYPE;
				case BtsmodelPackage.BTS_OBJECT__SUBTYPE: return BtsmodelPackage.BTS_USER_GROUP__SUBTYPE;
				case BtsmodelPackage.BTS_OBJECT__CODE: return BtsmodelPackage.BTS_USER_GROUP__CODE;
				case BtsmodelPackage.BTS_OBJECT__RELATIONS: return BtsmodelPackage.BTS_USER_GROUP__RELATIONS;
				case BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY: return BtsmodelPackage.BTS_USER_GROUP__TEMP_SORT_KEY;
				case BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES: return BtsmodelPackage.BTS_USER_GROUP__EXTERNAL_REFERENCES;
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
		if (baseClass == BTSObservableObject.class) {
			switch (baseOperationID) {
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_USER_GROUP___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_USER_GROUP___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == BTSObject.class) {
			switch (baseOperationID) {
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
		switch (operationID) {
			case BtsmodelPackage.BTS_USER_GROUP___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				addPropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
			case BtsmodelPackage.BTS_USER_GROUP___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
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
		result.append(", tempSortKey: ");
		result.append(tempSortKey);
		result.append(", category: ");
		result.append(category);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getDBCollectionKey() {
		return "admin";
	}
} //BTSUserGroupImpl
