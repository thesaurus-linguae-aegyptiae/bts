/**
 */
package org.bbaw.bts.btsmodel.provider;


import java.util.Collection;
import java.util.List;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTSPassportEditorConfigItemProvider
	extends BTSIdentifiableItemItemProvider
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, ITableItemFontProvider, IItemColorProvider, IItemFontProvider {
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
		String label = ((BTSPassportEditorConfig)object).get_id();
		return label == null || label.length() == 0 ?
			getString("_UI_BTSPassportEditorConfig_type") :
			getString("_UI_BTSPassportEditorConfig_type") + " " + label;
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
