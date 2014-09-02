/**
 */
package org.bbaw.bts.btsmodel.provider;

import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsmodel.BTSConfigItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTSConfigItemItemProvider extends BTSConfigItemProvider
{
	@Inject
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BTSConfigItemItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPropertyChangeSupportPropertyDescriptor(object);
			add_idPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addSortKeyPropertyDescriptor(object);
			addIgnorePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addSubtypePropertyDescriptor(object);
			addShowWidgetPropertyDescriptor(object);
			addOwnerReferencedTypesStringListPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Change Support feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyChangeSupportPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSObservableObject_propertyChangeSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSObservableObject_propertyChangeSupport_feature", "_UI_BTSObservableObject_type"),
				 BtsmodelPackage.Literals.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the id feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void add_idPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSIdentifiableItem__id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSIdentifiableItem__id_feature", "_UI_BTSIdentifiableItem_type"),
				 BtsmodelPackage.Literals.BTS_IDENTIFIABLE_ITEM__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSConfigItem_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSConfigItem_value_feature", "_UI_BTSConfigItem_type"),
				 BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sort Key feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSortKeyPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSConfigItem_sortKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSConfigItem_sortKey_feature", "_UI_BTSConfigItem_type"),
				 BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SORT_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ignore feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIgnorePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSConfigItem_ignore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSConfigItem_ignore_feature", "_UI_BTSConfigItem_type"),
				 BtsmodelPackage.Literals.BTS_CONFIG_ITEM__IGNORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSConfigItem_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSConfigItem_type_feature", "_UI_BTSConfigItem_type"),
				 BtsmodelPackage.Literals.BTS_CONFIG_ITEM__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subtype feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSubtypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSConfigItem_subtype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSConfigItem_subtype_feature", "_UI_BTSConfigItem_type"),
				 BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SUBTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Widget feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addShowWidgetPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSConfigItem_showWidget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSConfigItem_showWidget_feature", "_UI_BTSConfigItem_type"),
				 BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SHOW_WIDGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owner Referenced Types String List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerReferencedTypesStringListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSConfigItem_ownerReferencedTypesStringList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSConfigItem_ownerReferencedTypesStringList_feature", "_UI_BTSConfigItem_type"),
				 BtsmodelPackage.Literals.BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__RULES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BTSConfigItem.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public Object getImage(Object object)
	{
		Image image = null;
		if (object instanceof BTSConfigItem) {

			BTSConfigItem configItem = (BTSConfigItem) object;
			if (BTSCoreConstants.PASSPORT.equals(configItem.getType())) {
				image = resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_PASSPORT);
			} else if (BTSCoreConstants.CATEGORIES.equals(configItem.getType())) {
				image = resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_CATEGORIES);
			} else if (BTSCoreConstants.PASSPORT_CATEGORY.equals(configItem
					.getType())) {
				image = resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_CATEGORY);
			} else if (BTSCoreConstants.PASSPORT_ENTRY_GROUP.equals(configItem
					.getType())) {
				image = resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_GROUP);
			} else if (BTSCoreConstants.OBJECT_TYPE
					.equals(configItem.getType())
					&& configItem.getSubtype() != null) {
				image = resourceProvider.getImage(Display.getDefault(),
						configItem.getSubtype());
			} else if (BTSCoreConstants.PASSPORT_ENTRY_ITEM.equals(configItem
					.getType())) {
				if (configItem.getPassportEditorConfig() != null) {

					// first check and load standard widget types
					if (BTSCoreConstants.WIDGET_TYPE_TEXT.equals(configItem
							.getPassportEditorConfig().getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_TEXT);
					} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_SUGGEST
							.equals(configItem.getPassportEditorConfig()
									.getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_TEXT);
					} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_FIELD
							.equals(configItem.getPassportEditorConfig()
									.getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_TEXT_AREA);
					} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_CONFIG
							.equals(configItem.getPassportEditorConfig()
									.getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_COMBO);
					} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_INTEGER
							.equals(configItem.getPassportEditorConfig()
									.getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_SPIN);
					} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_THS
							.equals(configItem.getPassportEditorConfig()
									.getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_REFERENCE);
					} else if (BTSCoreConstants.WIDGET_TYPE_BOOLEAN
							.equals(configItem.getPassportEditorConfig()
									.getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_CHECK_BOX);
					} else if (BTSCoreConstants.WIDGET_TYPE_DATE
							.equals(configItem.getPassportEditorConfig()
									.getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_DATE);
					} else if (BTSCoreConstants.WIDGET_TYPE_REFERENCE_EXTERNAL
							.equals(configItem.getPassportEditorConfig()
									.getWidgetType())) {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_WIDGET_REFERENCE);
					}

					else {
						image = resourceProvider.getImage(Display.getDefault(),
								BTSResourceProvider.IMG_CONFIG_ITEM);
					}
				} else {
					image = resourceProvider.getImage(Display.getDefault(),
							BTSResourceProvider.IMG_CONFIG_ITEM);
				}

			} else {
				image = resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_CONFIG_ITEM);
			}
		}
		return overlayImage(object, image);
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public String getText(Object object)
	{
		BTSTranslations label = ((BTSConfigItem) object).getLabel();
		if (label != null)
		{
			return label.getTranslation(lang);
		}
		return ((BTSConfigItem) object).getValue();
	}

	/**
	 * This returns the label styled text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStyledText(Object object) {
		String label = ((BTSConfigItem)object).getValue();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_BTSConfigItem_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_BTSConfigItem_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
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
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		if (notification.getNotifier() instanceof BTSTranslation)
		{
			switch (notification.getFeatureID(BTSConfigItem.class))
			{
				case BtsmodelPackage.BTS_TRANSLATION__VALUE:
					EObject container = ((EObject) notification.getNotifier()).eContainer();
					if (container != null)
					{
						container = container.eContainer();
					}
					if (container != null)
					{
						fireNotifyChanged(new ViewerNotification(new ENotificationImpl((InternalEObject) container,
								Notification.SET, BtsmodelPackage.BTS_CONFIG_ITEM__LABEL, null, null), container,
								false, true));
					}
					return;
			}
		}
		// update label that is image if widget type was changed
		else if (notification.getNotifier() instanceof BTSPassportEditorConfig) {
			switch (notification.getFeatureID(BTSConfigItem.class)) {
			case BtsmodelPackage.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE:
				EObject container = ((EObject) notification.getNotifier())
						.eContainer();
				if (container != null) {
					fireNotifyChanged(new ViewerNotification(notification,
							container, false, true));
					return;
				}
				return;
			}
		}
		switch (notification.getFeatureID(BTSConfigItem.class))
		{
			case BtsmodelPackage.BTS_CONFIG_ITEM__VALUE:
				// case BtsmodelPackage.BTS_CONFIG_ITEM__SORT_KEY:
				// case BtsmodelPackage.BTS_CONFIG_ITEM__IGNORE:
				// case BtsmodelPackage.BTS_CONFIG_ITEM__TYPE:
				// case BtsmodelPackage.BTS_CONFIG_ITEM__SUBTYPE:
				// case BtsmodelPackage.BTS_CONFIG_ITEM__OWNER_TYPE:
				// case BtsmodelPackage.BTS_CONFIG_ITEM__REFERENCED_TYPE:
				// case BtsmodelPackage.BTS_CONFIG_ITEM__SHOW_WIDGET:
			case BtsmodelPackage.BTS_CONFIG_ITEM__LABEL:
			case BtsmodelPackage.BTS_CONFIG_ITEM__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;

			case BtsmodelPackage.BTS_CONFIG_ITEM__RULES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__LABEL,
				 BtsmodelFactory.eINSTANCE.createBTSTranslations()));

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__DESCRIPTION,
				 BtsmodelFactory.eINSTANCE.createBTSTranslations()));

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
				 BtsmodelFactory.eINSTANCE.createBTSPassportEditorConfig()));

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__RULES,
				 BtsmodelFactory.eINSTANCE.createBTSOperator()));
	}

	/**
	 * This returns the label text for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BtsmodelPackage.Literals.BTS_CONFIG_ITEM__LABEL ||
			childFeature == BtsmodelPackage.Literals.BTS_CONFIG_ITEM__DESCRIPTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
