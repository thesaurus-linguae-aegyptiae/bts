/**
 */
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Passport Editor Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#isShowWidget <em>Show Widget</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#getHorizontalWidth <em>Horizontal Width</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl#getRegex <em>Regex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSPassportEditorConfigImpl extends MinimalEObjectImpl.Container implements BTSPassportEditorConfig {
	/**
	 * The default value of the '{@link #isShowWidget() <em>Show Widget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowWidget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_WIDGET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowWidget() <em>Show Widget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowWidget()
	 * @generated
	 * @ordered
	 */
	protected boolean showWidget = SHOW_WIDGET_EDEFAULT;

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
	public boolean isShowWidget() {
		return showWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowWidget(boolean newShowWidget) {
		boolean oldShowWidget = showWidget;
		showWidget = newShowWidget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__SHOW_WIDGET, oldShowWidget, showWidget));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__SHOW_WIDGET:
				return isShowWidget();
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__SHOW_WIDGET:
				setShowWidget((Boolean)newValue);
				return;
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
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__SHOW_WIDGET:
				setShowWidget(SHOW_WIDGET_EDEFAULT);
				return;
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
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__SHOW_WIDGET:
				return showWidget != SHOW_WIDGET_EDEFAULT;
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
		result.append(" (showWidget: ");
		result.append(showWidget);
		result.append(", widgetType: ");
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
