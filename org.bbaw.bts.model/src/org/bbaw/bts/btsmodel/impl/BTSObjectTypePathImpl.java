/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSObjectTypePath;
import org.bbaw.bts.btsmodel.BTSObjectTypePathRoot;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.ObjectTypePathEntry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Object Type Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectTypePathImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectTypePathImpl#getReferencedTypesPath <em>Referenced Types Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSObjectTypePathImpl extends MinimalEObjectImpl.Container implements BTSObjectTypePath {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTypePathEntry> children;

	/**
	 * The cached value of the '{@link #getReferencedTypesPath() <em>Referenced Types Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTypesPath()
	 * @generated
	 * @ordered
	 */
	protected BTSObjectTypePathRoot referencedTypesPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSObjectTypePathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_OBJECT_TYPE_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypePathEntry> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ObjectTypePathEntry>(ObjectTypePathEntry.class, this, BtsmodelPackage.BTS_OBJECT_TYPE_PATH__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObjectTypePathRoot getReferencedTypesPath() {
		if (referencedTypesPath != null && referencedTypesPath.eIsProxy()) {
			InternalEObject oldReferencedTypesPath = (InternalEObject)referencedTypesPath;
			referencedTypesPath = (BTSObjectTypePathRoot)eResolveProxy(oldReferencedTypesPath);
			if (referencedTypesPath != oldReferencedTypesPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BtsmodelPackage.BTS_OBJECT_TYPE_PATH__REFERENCED_TYPES_PATH, oldReferencedTypesPath, referencedTypesPath));
			}
		}
		return referencedTypesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObjectTypePathRoot basicGetReferencedTypesPath() {
		return referencedTypesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTypesPath(BTSObjectTypePathRoot newReferencedTypesPath) {
		BTSObjectTypePathRoot oldReferencedTypesPath = referencedTypesPath;
		referencedTypesPath = newReferencedTypesPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT_TYPE_PATH__REFERENCED_TYPES_PATH, oldReferencedTypesPath, referencedTypesPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__CHILDREN:
				return getChildren();
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__REFERENCED_TYPES_PATH:
				if (resolve) return getReferencedTypesPath();
				return basicGetReferencedTypesPath();
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
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ObjectTypePathEntry>)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__REFERENCED_TYPES_PATH:
				setReferencedTypesPath((BTSObjectTypePathRoot)newValue);
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
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__CHILDREN:
				getChildren().clear();
				return;
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__REFERENCED_TYPES_PATH:
				setReferencedTypesPath((BTSObjectTypePathRoot)null);
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
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__CHILDREN:
				return children != null && !children.isEmpty();
			case BtsmodelPackage.BTS_OBJECT_TYPE_PATH__REFERENCED_TYPES_PATH:
				return referencedTypesPath != null;
		}
		return super.eIsSet(featureID);
	}

} //BTSObjectTypePathImpl
