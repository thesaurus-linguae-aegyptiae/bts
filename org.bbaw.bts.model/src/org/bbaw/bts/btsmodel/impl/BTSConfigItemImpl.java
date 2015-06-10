/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2015  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.btsmodel.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BTSWorkflowRuleItem;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.commons.BTSConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTS Config Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getPassportEditorConfig <em>Passport Editor Config</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#isShowWidget <em>Show Widget</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getOwnerReferencedTypesStringList <em>Owner Referenced Types String List</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSConfigItemImpl extends BTSConfigImpl implements BTSConfigItem {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected BTSTranslations label;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected BTSTranslations description;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected int sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected boolean ignore = IGNORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassportEditorConfig()
	 * <em>Passport Editor Config</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPassportEditorConfig()
	 * @generated
	 * @ordered
	 */
	protected BTSPassportEditorConfig passportEditorConfig;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSWorkflowRuleItem> rules;

	/**
	 * The default value of the '{@link #isShowWidget() <em>Show Widget</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isShowWidget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_WIDGET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowWidget() <em>Show Widget</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isShowWidget()
	 * @generated
	 * @ordered
	 */
	protected boolean showWidget = SHOW_WIDGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnerReferencedTypesStringList()
	 * <em>Owner Referenced Types String List</em>}' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOwnerReferencedTypesStringList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ownerReferencedTypesStringList;

	/**
	 * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String abbreviation = ABBREVIATION_EDEFAULT;

	private List<PropertyChangeListener> propertyChangeListeners = new ArrayList<PropertyChangeListener>();

	private Map<String, List<String>> ownerTypesMap;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSConfigItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_CONFIG_ITEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeSupport getPropertyChangeSupport() {
		return propertyChangeSupport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyChangeSupport(
			PropertyChangeSupport newPropertyChangeSupport) {
		PropertyChangeSupport oldPropertyChangeSupport = propertyChangeSupport;
		propertyChangeSupport = newPropertyChangeSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id) {
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTranslations getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(BTSTranslations newLabel,
			NotificationChain msgs) {
		BTSTranslations oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(BTSTranslations newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CONFIG_ITEM__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CONFIG_ITEM__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTranslations getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(
			BTSTranslations newDescription, NotificationChain msgs) {
		BTSTranslations oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(BTSTranslations newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(int newSortKey) {
		int oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnore() {
		return ignore;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnore(boolean newIgnore) {
		boolean oldIgnore = ignore;
		ignore = newIgnore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__IGNORE, oldIgnore, ignore));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassportEditorConfig getPassportEditorConfig() {
		return passportEditorConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassportEditorConfig(
			BTSPassportEditorConfig newPassportEditorConfig,
			NotificationChain msgs) {
		BTSPassportEditorConfig oldPassportEditorConfig = passportEditorConfig;
		passportEditorConfig = newPassportEditorConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG, oldPassportEditorConfig, newPassportEditorConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassportEditorConfig(
			BTSPassportEditorConfig newPassportEditorConfig) {
		if (newPassportEditorConfig != passportEditorConfig) {
			NotificationChain msgs = null;
			if (passportEditorConfig != null)
				msgs = ((InternalEObject)passportEditorConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG, null, msgs);
			if (newPassportEditorConfig != null)
				msgs = ((InternalEObject)newPassportEditorConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG, null, msgs);
			msgs = basicSetPassportEditorConfig(newPassportEditorConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG, newPassportEditorConfig, newPassportEditorConfig));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSWorkflowRuleItem> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<BTSWorkflowRuleItem>(BTSWorkflowRuleItem.class, this, BtsmodelPackage.BTS_CONFIG_ITEM__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowWidget() {
		return showWidget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowWidget(boolean newShowWidget) {
		boolean oldShowWidget = showWidget;
		showWidget = newShowWidget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__SHOW_WIDGET, oldShowWidget, showWidget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOwnerReferencedTypesStringList() {
		if (ownerReferencedTypesStringList == null) {
			ownerReferencedTypesStringList = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST);
		}
		return ownerReferencedTypesStringList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviation(String newAbbreviation) {
		String oldAbbreviation = abbreviation;
		abbreviation = newAbbreviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__ABBREVIATION, oldAbbreviation, abbreviation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public Map<String, List<String>> getOwnerTypesMap() {
		if (ownerTypesMap == null || ownerTypesMap.isEmpty() || ownerTypesMap.size() != ownerReferencedTypesStringList.size()) {
			ownerTypesMap = new HashMap<String, List<String>>();
			fillOwnerTypesMap();
		}
		return ownerTypesMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public void clearOwnerTypesMap() {
		if (ownerTypesMap == null) ownerTypesMap = null;
		getOwnerReferencedTypesStringList().clear();
	}

	private void fillOwnerTypesMap() {
		for (String owner : getOwnerReferencedTypesStringList())
		{
			if (owner.contains(BTSConstants.OWNER_REFERENCED_TYPES_SEPERATOR))
			{
				EList refList = new BasicEList<String>();
				String own = owner.split(BTSConstants.OWNER_REFERENCED_TYPES_SEPERATOR)[0];
				String refs = owner.split(BTSConstants.OWNER_REFERENCED_TYPES_SEPERATOR)[1];
				if(refs.contains(BTSConstants.OWNER_REFERENCED_TYPES_LIST_SEPERATOR))
				{
					String [] references = refs.split(BTSConstants.OWNER_REFERENCED_TYPES_LIST_SEPERATOR);
					for (String r : references)
					{
						refList.add(r);
					}
				}
				else
				{
					refList.add(refs);
				}
				ownerTypesMap.put(own, refList);
			}
			else
			{
				ownerTypesMap.put(owner, null);
			}
		}
		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void addPropertyChangeListener(
			PropertyChangeListener propertyChangeListener) {
		if (propertyChangeListener != null) {
			if (!propertyChangeListeners.contains(propertyChangeListener)) {
				propertyChangeListeners.add(propertyChangeListener);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public void removePropertyChangeListener(
			PropertyChangeListener propertyChangeListener) {
		propertyChangeListeners.remove(propertyChangeListener);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_CONFIG_ITEM__LABEL:
				return basicSetLabel(null, msgs);
			case BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG:
				return basicSetPassportEditorConfig(null, msgs);
			case BtsmodelPackage.BTS_CONFIG_ITEM__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsmodelPackage.BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT:
				return getPropertyChangeSupport();
			case BtsmodelPackage.BTS_CONFIG_ITEM__ID:
				return get_id();
			case BtsmodelPackage.BTS_CONFIG_ITEM__VALUE:
				return getValue();
			case BtsmodelPackage.BTS_CONFIG_ITEM__LABEL:
				return getLabel();
			case BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION:
				return getDescription();
			case BtsmodelPackage.BTS_CONFIG_ITEM__SORT_KEY:
				return getSortKey();
			case BtsmodelPackage.BTS_CONFIG_ITEM__IGNORE:
				return isIgnore();
			case BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG:
				return getPassportEditorConfig();
			case BtsmodelPackage.BTS_CONFIG_ITEM__TYPE:
				return getType();
			case BtsmodelPackage.BTS_CONFIG_ITEM__SUBTYPE:
				return getSubtype();
			case BtsmodelPackage.BTS_CONFIG_ITEM__RULES:
				return getRules();
			case BtsmodelPackage.BTS_CONFIG_ITEM__SHOW_WIDGET:
				return isShowWidget();
			case BtsmodelPackage.BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST:
				return getOwnerReferencedTypesStringList();
			case BtsmodelPackage.BTS_CONFIG_ITEM__ABBREVIATION:
				return getAbbreviation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtsmodelPackage.BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((PropertyChangeSupport)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__ID:
				set_id((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__VALUE:
				setValue((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__LABEL:
				setLabel((BTSTranslations)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION:
				setDescription((BTSTranslations)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__SORT_KEY:
				setSortKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__IGNORE:
				setIgnore((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG:
				setPassportEditorConfig((BTSPassportEditorConfig)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__TYPE:
				setType((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends BTSWorkflowRuleItem>)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__SHOW_WIDGET:
				setShowWidget((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST:
				getOwnerReferencedTypesStringList().clear();
				getOwnerReferencedTypesStringList().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__ABBREVIATION:
				setAbbreviation((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BtsmodelPackage.BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__ID:
				set_id(_ID_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__LABEL:
				setLabel((BTSTranslations)null);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION:
				setDescription((BTSTranslations)null);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__IGNORE:
				setIgnore(IGNORE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG:
				setPassportEditorConfig((BTSPassportEditorConfig)null);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__RULES:
				getRules().clear();
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__SHOW_WIDGET:
				setShowWidget(SHOW_WIDGET_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST:
				getOwnerReferencedTypesStringList().clear();
				return;
			case BtsmodelPackage.BTS_CONFIG_ITEM__ABBREVIATION:
				setAbbreviation(ABBREVIATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BtsmodelPackage.BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT:
				return PROPERTY_CHANGE_SUPPORT_EDEFAULT == null ? propertyChangeSupport != null : !PROPERTY_CHANGE_SUPPORT_EDEFAULT.equals(propertyChangeSupport);
			case BtsmodelPackage.BTS_CONFIG_ITEM__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case BtsmodelPackage.BTS_CONFIG_ITEM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BtsmodelPackage.BTS_CONFIG_ITEM__LABEL:
				return label != null;
			case BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION:
				return description != null;
			case BtsmodelPackage.BTS_CONFIG_ITEM__SORT_KEY:
				return sortKey != SORT_KEY_EDEFAULT;
			case BtsmodelPackage.BTS_CONFIG_ITEM__IGNORE:
				return ignore != IGNORE_EDEFAULT;
			case BtsmodelPackage.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG:
				return passportEditorConfig != null;
			case BtsmodelPackage.BTS_CONFIG_ITEM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsmodelPackage.BTS_CONFIG_ITEM__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case BtsmodelPackage.BTS_CONFIG_ITEM__RULES:
				return rules != null && !rules.isEmpty();
			case BtsmodelPackage.BTS_CONFIG_ITEM__SHOW_WIDGET:
				return showWidget != SHOW_WIDGET_EDEFAULT;
			case BtsmodelPackage.BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST:
				return ownerReferencedTypesStringList != null && !ownerReferencedTypesStringList.isEmpty();
			case BtsmodelPackage.BTS_CONFIG_ITEM__ABBREVIATION:
				return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BTSObservableObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == BTSIdentifiableItem.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_CONFIG_ITEM__ID: return BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BTSObservableObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == BTSIdentifiableItem.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID: return BtsmodelPackage.BTS_CONFIG_ITEM__ID;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BTSObservableObject.class) {
			switch (baseOperationID) {
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_CONFIG_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsmodelPackage.BTS_CONFIG_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				default: return -1;
			}
		}
		if (baseClass == BTSIdentifiableItem.class) {
			switch (baseOperationID) {
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
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case BtsmodelPackage.BTS_CONFIG_ITEM___GET_OWNER_TYPES_MAP:
				return getOwnerTypesMap();
			case BtsmodelPackage.BTS_CONFIG_ITEM___CLEAR_OWNER_TYPES_MAP:
				clearOwnerTypesMap();
				return null;
			case BtsmodelPackage.BTS_CONFIG_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				addPropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
			case BtsmodelPackage.BTS_CONFIG_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyChangeSupport: ");
		result.append(propertyChangeSupport);
		result.append(", _id: ");
		result.append(_id);
		result.append(", value: ");
		result.append(value);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", ignore: ");
		result.append(ignore);
		result.append(", type: ");
		result.append(type);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", showWidget: ");
		result.append(showWidget);
		result.append(", ownerReferencedTypesStringList: ");
		result.append(ownerReferencedTypesStringList);
		result.append(", abbreviation: ");
		result.append(abbreviation);
		result.append(')');
		return result.toString();
	}

} // BTSConfigItemImpl
