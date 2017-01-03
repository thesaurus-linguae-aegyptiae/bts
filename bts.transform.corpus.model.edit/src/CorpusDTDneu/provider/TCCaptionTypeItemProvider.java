/**
 */
package CorpusDTDneu.provider;


import CorpusDTDneu.CorpusDTDneuFactory;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.TCCaptionType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CorpusDTDneu.TCCaptionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TCCaptionTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCCaptionTypeItemProvider(AdapterFactory adapterFactory) {
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

			addTCNotebookPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addSortKeyPropertyDescriptor(object);
			addTCNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the TC Notebook feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTCNotebookPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCCaptionType_tCNotebook_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCCaptionType_tCNotebook_feature", "_UI_TCCaptionType_type"),
				 CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_NOTEBOOK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCCaptionType_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCCaptionType_author_feature", "_UI_TCCaptionType_type"),
				 CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sort Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCCaptionType_sortKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCCaptionType_sortKey_feature", "_UI_TCCaptionType_type"),
				 CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__SORT_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TC Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTCNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCCaptionType_tCName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCCaptionType_tCName_feature", "_UI_TCCaptionType_type"),
				 CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_NAME,
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
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_PASSPORT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_PICTURE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__GROUP);
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
	 * This returns TCCaptionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TCCaptionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((TCCaptionType)object).getTCName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TCCaptionType_type") :
			getString("_UI_TCCaptionType_type") + " " + label;
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

		switch (notification.getFeatureID(TCCaptionType.class)) {
			case CorpusDTDneuPackage.TC_CAPTION_TYPE__TC_NOTEBOOK:
			case CorpusDTDneuPackage.TC_CAPTION_TYPE__AUTHOR:
			case CorpusDTDneuPackage.TC_CAPTION_TYPE__SORT_KEY:
			case CorpusDTDneuPackage.TC_CAPTION_TYPE__TC_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorpusDTDneuPackage.TC_CAPTION_TYPE__TC_PASSPORT:
			case CorpusDTDneuPackage.TC_CAPTION_TYPE__TC_PICTURE:
			case CorpusDTDneuPackage.TC_CAPTION_TYPE__GROUP:
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
				(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_PASSPORT,
				 CorpusDTDneuFactory.eINSTANCE.createTCPassportType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_PICTURE,
				 CorpusDTDneuFactory.eINSTANCE.createTCPictureType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_CAPTION,
					 CorpusDTDneuFactory.eINSTANCE.createTCCaptionType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_GROUP,
					 CorpusDTDneuFactory.eINSTANCE.createTCGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_ARRANGEMENT,
					 CorpusDTDneuFactory.eINSTANCE.createTCArrangementType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_OBJECT,
					 CorpusDTDneuFactory.eINSTANCE.createTCObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_OBJ_PART,
					 CorpusDTDneuFactory.eINSTANCE.createTCObjPartType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.TC_CAPTION_TYPE__TC_TEXT,
					 CorpusDTDneuFactory.eINSTANCE.createTCTextType())));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CorpusDTDneuEditPlugin.INSTANCE;
	}

}
