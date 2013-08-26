/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSLease;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTS Corpus Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getLease <em>Lease</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#get_rev <em>rev</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getPassport <em>Passport</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSCorpusObjectImpl extends BTSObjectImpl implements BTSCorpusObject
{

	private List<PropertyChangeListener> propertyChangeListeners = new ArrayList<PropertyChangeListener>();
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
	 * The cached value of the '{@link #getLease() <em>Lease</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLease()
	 * @generated
	 * @ordered
	 */
	protected BTSLease lease;
	/**
	 * The default value of the '{@link #get_id() <em>id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #get_id() <em>id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected String _id = _ID_EDEFAULT;
	/**
	 * The default value of the '{@link #get_rev() <em>rev</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected static final String _REV_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #get_rev() <em>rev</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected String _rev = _REV_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSRelation> relations;

	/**
	 * The cached value of the '{@link #getPassport() <em>Passport</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassport()
	 * @generated
	 * @ordered
	 */
	protected BTSPassport passport;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected BTSCorpusObject parent;

	/**
	 * The default value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected String parentId = PARENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSCorpusObject> children;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSCorpusObjectImpl()
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
		return BtsmodelPackage.Literals.BTS_CORPUS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSLease getLease()
	{
		return lease;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLease(BTSLease newLease, NotificationChain msgs)
	{
		BTSLease oldLease = lease;
		lease = newLease;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE, oldLease, newLease);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLease(BTSLease newLease)
	{
		if (newLease != lease)
		{
			NotificationChain msgs = null;
			if (lease != null)
				msgs = ((InternalEObject)lease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE, null, msgs);
			if (newLease != null)
				msgs = ((InternalEObject)newLease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE, null, msgs);
			msgs = basicSetLease(newLease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE, newLease, newLease));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id()
	{
		return _id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id)
	{
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String get_rev()
	{
		return _rev;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void set_rev(String new_rev)
	{
		String old_rev = _rev;
		_rev = new_rev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__REV, old_rev, _rev));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeSupport getPropertyChangeSupport()
	{
		return propertyChangeSupport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyChangeSupport(PropertyChangeSupport newPropertyChangeSupport)
	{
		PropertyChangeSupport oldPropertyChangeSupport = propertyChangeSupport;
		propertyChangeSupport = newPropertyChangeSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSRelation> getRelations()
	{
		if (relations == null)
		{
			relations = new EObjectContainmentEList<BTSRelation>(BTSRelation.class, this, BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassport getPassport()
	{
		return passport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassport(BTSPassport newPassport, NotificationChain msgs)
	{
		BTSPassport oldPassport = passport;
		passport = newPassport;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT, oldPassport, newPassport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassport(BTSPassport newPassport)
	{
		if (newPassport != passport)
		{
			NotificationChain msgs = null;
			if (passport != null)
				msgs = ((InternalEObject)passport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT, null, msgs);
			if (newPassport != null)
				msgs = ((InternalEObject)newPassport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT, null, msgs);
			msgs = basicSetPassport(newPassport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT, newPassport, newPassport));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSCorpusObject getParent()
	{
		if (parent != null && parent.eIsProxy())
		{
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (BTSCorpusObject)eResolveProxy(oldParent);
			if (parent != oldParent)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSCorpusObject basicGetParent()
	{
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BTSCorpusObject newParent)
	{
		BTSCorpusObject oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentId()
	{
		return parentId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentId(String newParentId)
	{
		String oldParentId = parentId;
		parentId = newParentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT_ID, oldParentId, parentId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSCorpusObject> getChildren()
	{
		if (children == null)
		{
			children = new EObjectResolvingEList<BTSCorpusObject>(BTSCorpusObject.class, this, BtsmodelPackage.BTS_CORPUS_OBJECT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectType()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		if (propertyChangeListener != null)
		{
			if (!propertyChangeListeners.contains(propertyChangeListener))
			{
				propertyChangeListeners.add(propertyChangeListener);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener)
	{
		propertyChangeListeners.remove(propertyChangeListener);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE:
				return basicSetLease(null, msgs);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return basicSetPassport(null, msgs);
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT:
				return getPropertyChangeSupport();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE:
				return getLease();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__ID:
				return get_id();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__REV:
				return get_rev();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				return getRelations();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return getPassport();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT_ID:
				return getParentId();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__CHILDREN:
				return getChildren();
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((PropertyChangeSupport)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE:
				setLease((BTSLease)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__ID:
				set_id((String)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__REV:
				set_rev((String)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends BTSRelation>)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				setPassport((BTSPassport)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT:
				setParent((BTSCorpusObject)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT_ID:
				setParentId((String)newValue);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends BTSCorpusObject>)newValue);
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE:
				setLease((BTSLease)null);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__ID:
				set_id(_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__REV:
				set_rev(_REV_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				getRelations().clear();
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				setPassport((BTSPassport)null);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT:
				setParent((BTSCorpusObject)null);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT_ID:
				setParentId(PARENT_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__CHILDREN:
				getChildren().clear();
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT:
				return PROPERTY_CHANGE_SUPPORT_EDEFAULT == null ? propertyChangeSupport != null : !PROPERTY_CHANGE_SUPPORT_EDEFAULT.equals(propertyChangeSupport);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE:
				return lease != null;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__REV:
				return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__RELATIONS:
				return relations != null && !relations.isEmpty();
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PASSPORT:
				return passport != null;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT:
				return parent != null;
			case BtsmodelPackage.BTS_CORPUS_OBJECT__PARENT_ID:
				return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
			case BtsmodelPackage.BTS_CORPUS_OBJECT__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == BTSObservableObject.class)
		{
			switch (derivedFeatureID)
			{
				case BtsmodelPackage.BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class)
		{
			switch (derivedFeatureID)
			{
				case BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE: return BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE;
				case BtsmodelPackage.BTS_CORPUS_OBJECT__ID: return BtsmodelPackage.BTSDB_BASE_OBJECT__ID;
				case BtsmodelPackage.BTS_CORPUS_OBJECT__REV: return BtsmodelPackage.BTSDB_BASE_OBJECT__REV;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == BTSObservableObject.class)
		{
			switch (baseFeatureID)
			{
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class)
		{
			switch (baseFeatureID)
			{
				case BtsmodelPackage.BTSDB_BASE_OBJECT__LEASE: return BtsmodelPackage.BTS_CORPUS_OBJECT__LEASE;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__ID: return BtsmodelPackage.BTS_CORPUS_OBJECT__ID;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__REV: return BtsmodelPackage.BTS_CORPUS_OBJECT__REV;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == BTSObservableObject.class)
		{
			switch (baseOperationID)
			{
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				default: return -1;
			}
		}
		if (baseClass == BTSDBBaseObject.class)
		{
			switch (baseOperationID)
			{
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case BtsmodelPackage.BTS_CORPUS_OBJECT___GET_OBJECT_TYPE:
				return getObjectType();
			case BtsmodelPackage.BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				addPropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
			case BtsmodelPackage.BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				removePropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyChangeSupport: ");
		result.append(propertyChangeSupport);
		result.append(", _id: ");
		result.append(_id);
		result.append(", _rev: ");
		result.append(_rev);
		result.append(", parentId: ");
		result.append(parentId);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof BTSDBBaseObject)
		{
			BTSDBBaseObject o = (BTSDBBaseObject) obj;
			if (o.get_id() == null || this.get_id() == null)
			{
				return false;
			}
			return this.get_id().equals(o.get_id());
		}
		return false;
	}
} // BTSCorpusObjectImpl
