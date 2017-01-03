/**
 */
package CorpusDTDneu.provider;


import CorpusDTDneu.CorpusDTDneuFactory;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgyTB1Type;

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
 * This is the item provider adapter for a {@link CorpusDTDneu.EgyTB1Type} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EgyTB1TypeItemProvider
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
	public EgyTB1TypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addBtsCodesPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyTB1Type_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyTB1Type_name_feature", "_UI_EgyTB1Type_type"),
				 CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bts Codes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBtsCodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyTB1Type_btsCodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyTB1Type_btsCodes_feature", "_UI_EgyTB1Type_type"),
				 CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__BTS_CODES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyTB1Type_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyTB1Type_comment_feature", "_UI_EgyTB1Type_type"),
				 CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__COMMENT,
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
			childrenFeatures.add(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP);
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
	 * This returns EgyTB1Type.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EgyTB1Type"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EgyTB1Type)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EgyTB1Type_type") :
			getString("_UI_EgyTB1Type_type") + " " + label;
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

		switch (notification.getFeatureID(EgyTB1Type.class)) {
			case CorpusDTDneuPackage.EGY_TB1_TYPE__NAME:
			case CorpusDTDneuPackage.EGY_TB1_TYPE__BTS_CODES:
			case CorpusDTDneuPackage.EGY_TB1_TYPE__COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorpusDTDneuPackage.EGY_TB1_TYPE__GROUP:
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
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_SENT,
					 CorpusDTDneuFactory.eINSTANCE.createEgySentType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_TB1,
					 CorpusDTDneuFactory.eINSTANCE.createEgyTB1Type())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_TB3_START,
					 CorpusDTDneuFactory.eINSTANCE.createEgyTB3StartType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_TB3_END,
					 CorpusDTDneuFactory.eINSTANCE.createEgyTB3EndType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_WORD,
					 CorpusDTDneuFactory.eINSTANCE.createEgyWordType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__LINE_COUNT,
					 CorpusDTDneuFactory.eINSTANCE.createLineCountType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__NOTE,
					 CorpusDTDneuFactory.eINSTANCE.createNoteType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__FORMATTING_ELEMENT,
					 CorpusDTDneuFactory.eINSTANCE.createFormattingElementType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__PUNCTUATION,
					 CorpusDTDneuFactory.eINSTANCE.createPunctuationType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_TB1_TYPE__EGY_PUNCTUATION,
					 CorpusDTDneuFactory.eINSTANCE.createEgyPunctuationType())));
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
