/**
 */
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.BTSObjectTypePathRoot;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Passport Editor Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#getHorizontalWidth <em>Horizontal Width</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#getReferencedTypesPath <em>Referenced Types Path</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#getPredicatePath <em>Predicate Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSPassportEditorConfigImpl extends BTSIdentifiableItemImpl implements BTSPassportEditorConfig {
	/**
	 * The default value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDGET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected String widgetType = WIDGET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowMultiple() <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowMultiple() <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean allowMultiple = ALLOW_MULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalWidth() <em>Horizontal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalWidth() <em>Horizontal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalWidth()
	 * @generated
	 * @ordered
	 */
	protected int horizontalWidth = HORIZONTAL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected String regex = REGEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedTypesPath() <em>Referenced Types Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTypesPath()
	 * @generated
	 * @ordered
	 */
	protected BTSObjectTypePathRoot referencedTypesPath;

	/**
	 * The cached value of the '{@link #getPredicatePath() <em>Predicate Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicatePath()
	 * @generated
	 * @ordered
	 */
	protected BTSObjectTypePathRoot predicatePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSPassportEditorConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidgetType() {
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetType(String newWidgetType) {
		String oldWidgetType = widgetType;
		widgetType = newWidgetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE, oldWidgetType, widgetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowMultiple() {
		return allowMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowMultiple(boolean newAllowMultiple) {
		boolean oldAllowMultiple = allowMultiple;
		allowMultiple = newAllowMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE, oldAllowMultiple, allowMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalWidth() {
		return horizontalWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalWidth(int newHorizontalWidth) {
		int oldHorizontalWidth = horizontalWidth;
		horizontalWidth = newHorizontalWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH, oldHorizontalWidth, horizontalWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegex()
	{
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegex(String newRegex)
	{
		String oldRegex = regex;
		regex = newRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REGEX, oldRegex, regex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObjectTypePathRoot getReferencedTypesPath() {
		return referencedTypesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTypesPath(BTSObjectTypePathRoot newReferencedTypesPath, NotificationChain msgs) {
		BTSObjectTypePathRoot oldReferencedTypesPath = referencedTypesPath;
		referencedTypesPath = newReferencedTypesPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH, oldReferencedTypesPath, newReferencedTypesPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTypesPath(BTSObjectTypePathRoot newReferencedTypesPath) {
		if (newReferencedTypesPath != referencedTypesPath) {
			NotificationChain msgs = null;
			if (referencedTypesPath != null)
				msgs = ((InternalEObject)referencedTypesPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH, null, msgs);
			if (newReferencedTypesPath != null)
				msgs = ((InternalEObject)newReferencedTypesPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH, null, msgs);
			msgs = basicSetReferencedTypesPath(newReferencedTypesPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH, newReferencedTypesPath, newReferencedTypesPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSObjectTypePathRoot getPredicatePath() {
		return predicatePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicatePath(BTSObjectTypePathRoot newPredicatePath, NotificationChain msgs) {
		BTSObjectTypePathRoot oldPredicatePath = predicatePath;
		predicatePath = newPredicatePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH, oldPredicatePath, newPredicatePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicatePath(BTSObjectTypePathRoot newPredicatePath) {
		if (newPredicatePath != predicatePath) {
			NotificationChain msgs = null;
			if (predicatePath != null)
				msgs = ((InternalEObject)predicatePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH, null, msgs);
			if (newPredicatePath != null)
				msgs = ((InternalEObject)newPredicatePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH, null, msgs);
			msgs = basicSetPredicatePath(newPredicatePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH, newPredicatePath, newPredicatePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH:
				return basicSetReferencedTypesPath(null, msgs);
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH:
				return basicSetPredicatePath(null, msgs);
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
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE:
				return getWidgetType();
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REQUIRED:
				return isRequired();
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE:
				return isAllowMultiple();
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH:
				return getHorizontalWidth();
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REGEX:
				return getRegex();
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH:
				return getReferencedTypesPath();
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH:
				return getPredicatePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE:
				setWidgetType((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE:
				setAllowMultiple((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH:
				setHorizontalWidth((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REGEX:
				setRegex((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH:
				setReferencedTypesPath((BTSObjectTypePathRoot)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH:
				setPredicatePath((BTSObjectTypePathRoot)newValue);
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
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE:
				setWidgetType(WIDGET_TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE:
				setAllowMultiple(ALLOW_MULTIPLE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH:
				setHorizontalWidth(HORIZONTAL_WIDTH_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REGEX:
				setRegex(REGEX_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH:
				setReferencedTypesPath((BTSObjectTypePathRoot)null);
				return;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH:
				setPredicatePath((BTSObjectTypePathRoot)null);
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
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE:
				return WIDGET_TYPE_EDEFAULT == null ? widgetType != null : !WIDGET_TYPE_EDEFAULT.equals(widgetType);
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE:
				return allowMultiple != ALLOW_MULTIPLE_EDEFAULT;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH:
				return horizontalWidth != HORIZONTAL_WIDTH_EDEFAULT;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REGEX:
				return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH:
				return referencedTypesPath != null;
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_PATH:
				return predicatePath != null;
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
		result.append(" (widgetType: ");
		result.append(widgetType);
		result.append(", required: ");
		result.append(required);
		result.append(", allowMultiple: ");
		result.append(allowMultiple);
		result.append(", horizontalWidth: ");
		result.append(horizontalWidth);
		result.append(", regex: ");
		result.append(regex);
		result.append(')');
		return result.toString();
	}

} //BTSPassportEditorConfigImpl
