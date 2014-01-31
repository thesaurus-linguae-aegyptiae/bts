/**
 */
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSWorkflowRuleItem;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Workflow Rule Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl#isIgnore <em>Ignore</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSWorkflowRuleItemImpl extends BTSObservableObjectImpl implements BTSWorkflowRuleItem
{
	/**
	 * The default value of the '{@link #get_id() <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_id() <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected String _id = _ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected boolean ignore = IGNORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSWorkflowRuleItemImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BtsmodelPackage.Literals.BTS_WORKFLOW_RULE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id()
	{
		return _id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id)
	{
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority()
	{
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority)
	{
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnore()
	{
		return ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnore(boolean newIgnore)
	{
		boolean oldIgnore = ignore;
		ignore = newIgnore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__IGNORE, oldIgnore, ignore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__ID:
				return get_id();
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__PRIORITY:
				return getPriority();
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__IGNORE:
				return isIgnore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__ID:
				set_id((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__IGNORE:
				setIgnore((Boolean)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__ID:
				set_id(_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__IGNORE:
				setIgnore(IGNORE_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__IGNORE:
				return ignore != IGNORE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == BTSIdentifiableItem.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__ID: return BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == BTSIdentifiableItem.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID: return BtsmodelPackage.BTS_WORKFLOW_RULE_ITEM__ID;
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
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (_id: ");
		result.append(_id);
		result.append(", priority: ");
		result.append(priority);
		result.append(", ignore: ");
		result.append(ignore);
		result.append(')');
		return result.toString();
	}

} //BTSWorkflowRuleItemImpl
