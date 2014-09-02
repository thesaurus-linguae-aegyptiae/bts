/**
 */
package org.bbaw.bts.btsmodel.provider;

import java.util.Collection;
import java.util.List;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.widgets.Display;

/**
 * This is the item provider adapter for a
 * {@link org.bbaw.bts.btsmodel.BTSProjectDBCollection} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BTSProjectDBCollectionItemProvider extends BTSIdentifiableItemItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BTSProjectDBCollectionItemProvider(AdapterFactory adapterFactory)
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

			addCollectionNamePropertyDescriptor(object);
			addIndexedPropertyDescriptor(object);
			addSynchronizedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Collection Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCollectionNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSProjectDBCollection_collectionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSProjectDBCollection_collectionName_feature", "_UI_BTSProjectDBCollection_type"),
				 BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indexed feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIndexedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSProjectDBCollection_indexed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSProjectDBCollection_indexed_feature", "_UI_BTSProjectDBCollection_type"),
				 BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__INDEXED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Synchronized feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSynchronizedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSProjectDBCollection_synchronized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSProjectDBCollection_synchronized_feature", "_UI_BTSProjectDBCollection_type"),
				 BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS);
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
	 * This returns BTSProjectDBCollection.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, resourceProvider.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_DATABASE));
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
		String label = ((BTSProjectDBCollection) object).getCollectionName();
		return label == null || label.length() == 0 ? getString("_UI_BTSProjectDBCollection_type") : label;
	}

	/**
	 * This returns the label styled text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStyledText(Object object) {
		String label = ((BTSProjectDBCollection)object).getCollectionName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_BTSProjectDBCollection_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_BTSProjectDBCollection_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
		}
		return styledLabel;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(BTSProjectDBCollection.class)) {
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME:
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__INDEXED:
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BtsmodelPackage.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS:
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
				(BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS,
				 BtsmodelFactory.eINSTANCE.createBTSDBCollectionRoleDesc()));
	}

}
