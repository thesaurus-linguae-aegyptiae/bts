/**
 */
package org.bbaw.bts.btsmodel.provider;


import java.util.Collection;
import java.util.List;
import org.bbaw.bts.btsmodel.BTSPassportEntryItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 * This is the item provider adapter for a {@link org.bbaw.bts.btsmodel.BTSPassportEntryItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTSPassportEntryItemItemProvider
	extends BTSPassportEntryItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider,
		ITableItemColorProvider,
		ITableItemFontProvider,
		IItemColorProvider,
		IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSPassportEntryItemItemProvider(AdapterFactory adapterFactory) {
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

			addSubtypePropertyDescriptor(object);
			addSubValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Subtype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubtypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSPassportEntryItem_subtype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSPassportEntryItem_subtype_feature", "_UI_BTSPassportEntryItem_type"),
				 BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__SUBTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSPassportEntryItem_subValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSPassportEntryItem_subValue_feature", "_UI_BTSPassportEntryItem_type"),
				 BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BTSPassportEntryItem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BTSPassportEntryItem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BTSPassportEntryItem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BTSPassportEntryItem_type") :
			getString("_UI_BTSPassportEntryItem_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BTSPassportEntryItem.class)) {
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_ITEM__SUBTYPE:
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES:
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN:
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION:
			case BtsmodelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
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

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES,
				 BtsmodelFactory.eINSTANCE.createBTSExternalReference()));

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN,
				 BtsmodelFactory.eINSTANCE.createBTSTimespan()));

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION,
				 BtsmodelFactory.eINSTANCE.createBTSTranslations()));

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION,
				 BtsmodelFactory.eINSTANCE.createBTSTranslations()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY__LABEL ||
			childFeature == BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION ||
			childFeature == BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
