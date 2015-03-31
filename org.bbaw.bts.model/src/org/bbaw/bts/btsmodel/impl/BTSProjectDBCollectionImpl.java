/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
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
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTS Project DB Collection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#getCollectionName <em>Collection Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#isIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#getRoleDescriptions <em>Role Descriptions</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#getPropertyStrings <em>Property Strings</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#isDirty <em>Dirty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSProjectDBCollectionImpl extends BTSIdentifiableItemImpl implements BTSProjectDBCollection
{
	/**
	 * The default value of the '{@link #getCollectionName() <em>Collection Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCollectionName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionName() <em>Collection Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCollectionName()
	 * @generated
	 * @ordered
	 */
	protected String collectionName = COLLECTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIndexed() <em>Indexed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIndexed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDEXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndexed() <em>Indexed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIndexed()
	 * @generated
	 * @ordered
	 */
	protected boolean indexed = INDEXED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoleDescriptions()
	 * <em>Role Descriptions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoleDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSDBCollectionRoleDesc> roleDescriptions;

	/**
	 * The cached value of the '{@link #getPropertyStrings() <em>Property Strings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> propertyStrings;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> properties;

	/**
	 * The default value of the '{@link #isDirty() <em>Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirty() <em>Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirty()
	 * @generated
	 * @ordered
	 */
	protected boolean dirty = DIRTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSProjectDBCollectionImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionName()
	{
		return collectionName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionName(String newCollectionName)
	{
		String oldCollectionName = collectionName;
		collectionName = newCollectionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME, oldCollectionName, collectionName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndexed()
	{
		return indexed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexed(boolean newIndexed)
	{
		boolean oldIndexed = indexed;
		indexed = newIndexed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__INDEXED, oldIndexed, indexed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronized()
	{
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronized(boolean newSynchronized)
	{
		boolean oldSynchronized = synchronized_;
		synchronized_ = newSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED, oldSynchronized, synchronized_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSDBCollectionRoleDesc> getRoleDescriptions()
	{
		if (roleDescriptions == null) {
			roleDescriptions = new EObjectContainmentEList<BTSDBCollectionRoleDesc>(BTSDBCollectionRoleDesc.class, this, BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS);
		}
		return roleDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPropertyStrings() {
		if (propertyStrings == null) {
			propertyStrings = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTY_STRINGS);
		}
		return propertyStrings;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public Map<String, String> getProperties() {
		if (properties == null)
		{
			properties = new HashMap<String, String>(4);
			for (String s : getPropertyStrings())
			{
				String[] prop = s.split("=");
				if (prop != null)
				{
					properties.put(prop[0], prop[1]);
				}
			}
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public void setProperties(Map<String, String> newProperties) {
		Map<String, String> oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTIES, oldProperties, properties));
		if(!properties.equals(oldProperties))
		{
			propertyStrings = new EDataTypeUniqueEList(String.class, this, BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTIES);
			for (String s : properties.keySet())
			{
				if (properties.get(s) != null)
				{
					propertyStrings.add(s + "=" + properties.get(s));
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirty() {
		return dirty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirty(boolean newDirty) {
		boolean oldDirty = dirty;
		dirty = newDirty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__DIRTY, oldDirty, dirty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public void setProperty(String key, String value) {
		properties.put(key, value);
		propertyStrings.add(key + "=" + value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public String getProperty(String key) {
		return getProperties().get(key);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS:
				return ((InternalEList<?>)getRoleDescriptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME:
				return getCollectionName();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__INDEXED:
				return isIndexed();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED:
				return isSynchronized();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS:
				return getRoleDescriptions();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTY_STRINGS:
				return getPropertyStrings();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTIES:
				return getProperties();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__DIRTY:
				return isDirty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME:
				setCollectionName((String)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__INDEXED:
				setIndexed((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS:
				getRoleDescriptions().clear();
				getRoleDescriptions().addAll((Collection<? extends BTSDBCollectionRoleDesc>)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTY_STRINGS:
				getPropertyStrings().clear();
				getPropertyStrings().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTIES:
				setProperties((Map<String, String>)newValue);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__DIRTY:
				setDirty((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME:
				setCollectionName(COLLECTION_NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__INDEXED:
				setIndexed(INDEXED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS:
				getRoleDescriptions().clear();
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTY_STRINGS:
				getPropertyStrings().clear();
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTIES:
				setProperties((Map<String, String>)null);
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__DIRTY:
				setDirty(DIRTY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME:
				return COLLECTION_NAME_EDEFAULT == null ? collectionName != null : !COLLECTION_NAME_EDEFAULT.equals(collectionName);
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__INDEXED:
				return indexed != INDEXED_EDEFAULT;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED:
				return synchronized_ != SYNCHRONIZED_EDEFAULT;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS:
				return roleDescriptions != null && !roleDescriptions.isEmpty();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTY_STRINGS:
				return propertyStrings != null && !propertyStrings.isEmpty();
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__PROPERTIES:
				return properties != null;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__DIRTY:
				return dirty != DIRTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION___SET_PROPERTY__STRING_STRING:
				setProperty((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION___GET_PROPERTY__STRING:
				return getProperty((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (collectionName: ");
		result.append(collectionName);
		//		result.append(", indexed: ");
		//		result.append(indexed);
		//		result.append(", synchronized: ");
		//		result.append(synchronized_);
		result.append(')');
		return result.toString();
	}


} //BTSProjectDBCollectionImpl
