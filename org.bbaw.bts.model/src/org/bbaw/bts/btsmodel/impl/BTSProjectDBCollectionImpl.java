/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
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
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTS Project DB Collection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#getCollectionName <em>Collection Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#isIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSProjectDBCollectionImpl#getRoleDescriptions <em>Role Descriptions</em>}</li>
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
		}
		return super.eIsSet(featureID);
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
