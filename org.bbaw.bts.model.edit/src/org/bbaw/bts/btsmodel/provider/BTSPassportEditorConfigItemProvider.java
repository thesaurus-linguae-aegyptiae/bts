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
package org.bbaw.bts.btsmodel.provider;


import java.util.Collection;
import java.util.List;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTSPassportEditorConfigItemProvider
	extends BTSIdentifiableItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassportEditorConfigItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addWidgetTypePropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addAllowMultiplePropertyDescriptor(object);
			addHorizontalWidthPropertyDescriptor(object);
			addRegexPropertyDescriptor(object);
			addPredicateListPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Widget Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidgetTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSPassportEditorConfig_widgetType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSPassportEditorConfig_widgetType_feature", "_UI_BTSPassportEditorConfig_type"),
				 BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSPassportEditorConfig_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSPassportEditorConfig_required_feature", "_UI_BTSPassportEditorConfig_type"),
				 BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Multiple feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowMultiplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSPassportEditorConfig_allowMultiple_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSPassportEditorConfig_allowMultiple_feature", "_UI_BTSPassportEditorConfig_type"),
				 BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSPassportEditorConfig_horizontalWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSPassportEditorConfig_horizontalWidth_feature", "_UI_BTSPassportEditorConfig_type"),
				 BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegexPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSPassportEditorConfig_regex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSPassportEditorConfig_regex_feature", "_UI_BTSPassportEditorConfig_type"),
				 BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__REGEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predicate List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredicateListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSPassportEditorConfig_predicateList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSPassportEditorConfig_predicateList_feature", "_UI_BTSPassportEditorConfig_type"),
				 BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__PREDICATE_LIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BTSPassportEditorConfig.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BTSPassportEditorConfig"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return ((StyledString)getStyledText(object)).getString();
	}

	/**
	 * This returns the label styled text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	@Override
	public Object getStyledText(Object object) {
		String label = ((BTSPassportEditorConfig)object).get_id();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_BTSPassportEditorConfig_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(label, StyledString.Style.QUALIFIER_STYLER);
		}
		return styledLabel;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BTSPassportEditorConfig.class)) {
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
//			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__REFERENCED_TYPES_PATH:
//				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
//				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
