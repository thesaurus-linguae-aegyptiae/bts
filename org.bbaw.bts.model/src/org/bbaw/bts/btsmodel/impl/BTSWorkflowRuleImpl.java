/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSWorkflowRule;
import org.bbaw.bts.btsmodel.BTSWorkflowRuleItem;
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
 * An implementation of the model object '<em><b>BTS Workflow Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl#getSubRules <em>Sub Rules</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl#getAcceptMessage <em>Accept Message</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl#getOcl <em>Ocl</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl#getOclSelfObject <em>Ocl Self Object</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl#getDenialMessage <em>Denial Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSWorkflowRuleImpl extends BTSIdentifiableItemImpl implements BTSWorkflowRule
{
	/**
	 * The cached value of the '{@link #getSubRules() <em>Sub Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRules()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSWorkflowRuleItem> subRules;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actions;

	/**
	 * The default value of the '{@link #getAcceptMessage() <em>Accept Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptMessage() <em>Accept Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptMessage()
	 * @generated
	 * @ordered
	 */
	protected String acceptMessage = ACCEPT_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcl() <em>Ocl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcl()
	 * @generated
	 * @ordered
	 */
	protected static final String OCL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcl() <em>Ocl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcl()
	 * @generated
	 * @ordered
	 */
	protected String ocl = OCL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOclSelfObject() <em>Ocl Self Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclSelfObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OCL_SELF_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOclSelfObject() <em>Ocl Self Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclSelfObject()
	 * @generated
	 * @ordered
	 */
	protected String oclSelfObject = OCL_SELF_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDenialMessage() <em>Denial Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenialMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String DENIAL_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDenialMessage() <em>Denial Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenialMessage()
	 * @generated
	 * @ordered
	 */
	protected String denialMessage = DENIAL_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSWorkflowRuleImpl()
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
		return BtsmodelPackage.Literals.BTS_WORKFLOW_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSWorkflowRuleItem> getSubRules()
	{
		if (subRules == null)
		{
			subRules = new EObjectContainmentEList<BTSWorkflowRuleItem>(BTSWorkflowRuleItem.class, this, BtsmodelPackage.BTS_WORKFLOW_RULE__SUB_RULES);
		}
		return subRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getActions()
	{
		if (actions == null)
		{
			actions = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_WORKFLOW_RULE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptMessage()
	{
		return acceptMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptMessage(String newAcceptMessage)
	{
		String oldAcceptMessage = acceptMessage;
		acceptMessage = newAcceptMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORKFLOW_RULE__ACCEPT_MESSAGE, oldAcceptMessage, acceptMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcl()
	{
		return ocl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcl(String newOcl)
	{
		String oldOcl = ocl;
		ocl = newOcl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORKFLOW_RULE__OCL, oldOcl, ocl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOclSelfObject()
	{
		return oclSelfObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclSelfObject(String newOclSelfObject)
	{
		String oldOclSelfObject = oclSelfObject;
		oclSelfObject = newOclSelfObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORKFLOW_RULE__OCL_SELF_OBJECT, oldOclSelfObject, oclSelfObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDenialMessage()
	{
		return denialMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenialMessage(String newDenialMessage)
	{
		String oldDenialMessage = denialMessage;
		denialMessage = newDenialMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_WORKFLOW_RULE__DENIAL_MESSAGE, oldDenialMessage, denialMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_WORKFLOW_RULE__SUB_RULES:
				return ((InternalEList<?>)getSubRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_WORKFLOW_RULE__SUB_RULES:
				return getSubRules();
			case BtsmodelPackage.BTS_WORKFLOW_RULE__ACTIONS:
				return getActions();
			case BtsmodelPackage.BTS_WORKFLOW_RULE__ACCEPT_MESSAGE:
				return getAcceptMessage();
			case BtsmodelPackage.BTS_WORKFLOW_RULE__OCL:
				return getOcl();
			case BtsmodelPackage.BTS_WORKFLOW_RULE__OCL_SELF_OBJECT:
				return getOclSelfObject();
			case BtsmodelPackage.BTS_WORKFLOW_RULE__DENIAL_MESSAGE:
				return getDenialMessage();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case BtsmodelPackage.BTS_WORKFLOW_RULE__SUB_RULES:
				getSubRules().clear();
				getSubRules().addAll((Collection<? extends BTSWorkflowRuleItem>)newValue);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__ACCEPT_MESSAGE:
				setAcceptMessage((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__OCL:
				setOcl((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__OCL_SELF_OBJECT:
				setOclSelfObject((String)newValue);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__DENIAL_MESSAGE:
				setDenialMessage((String)newValue);
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_WORKFLOW_RULE__SUB_RULES:
				getSubRules().clear();
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__ACTIONS:
				getActions().clear();
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__ACCEPT_MESSAGE:
				setAcceptMessage(ACCEPT_MESSAGE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__OCL:
				setOcl(OCL_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__OCL_SELF_OBJECT:
				setOclSelfObject(OCL_SELF_OBJECT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_WORKFLOW_RULE__DENIAL_MESSAGE:
				setDenialMessage(DENIAL_MESSAGE_EDEFAULT);
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_WORKFLOW_RULE__SUB_RULES:
				return subRules != null && !subRules.isEmpty();
			case BtsmodelPackage.BTS_WORKFLOW_RULE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BtsmodelPackage.BTS_WORKFLOW_RULE__ACCEPT_MESSAGE:
				return ACCEPT_MESSAGE_EDEFAULT == null ? acceptMessage != null : !ACCEPT_MESSAGE_EDEFAULT.equals(acceptMessage);
			case BtsmodelPackage.BTS_WORKFLOW_RULE__OCL:
				return OCL_EDEFAULT == null ? ocl != null : !OCL_EDEFAULT.equals(ocl);
			case BtsmodelPackage.BTS_WORKFLOW_RULE__OCL_SELF_OBJECT:
				return OCL_SELF_OBJECT_EDEFAULT == null ? oclSelfObject != null : !OCL_SELF_OBJECT_EDEFAULT.equals(oclSelfObject);
			case BtsmodelPackage.BTS_WORKFLOW_RULE__DENIAL_MESSAGE:
				return DENIAL_MESSAGE_EDEFAULT == null ? denialMessage != null : !DENIAL_MESSAGE_EDEFAULT.equals(denialMessage);
		}
		return super.eIsSet(featureID);
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
		result.append(" (actions: ");
		result.append(actions);
		result.append(", acceptMessage: ");
		result.append(acceptMessage);
		result.append(", ocl: ");
		result.append(ocl);
		result.append(", oclSelfObject: ");
		result.append(oclSelfObject);
		result.append(", denialMessage: ");
		result.append(denialMessage);
		result.append(')');
		return result.toString();
	}

} //BTSWorkflowRuleImpl
