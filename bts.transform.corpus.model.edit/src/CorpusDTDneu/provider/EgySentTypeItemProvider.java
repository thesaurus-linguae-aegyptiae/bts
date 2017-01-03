/**
 */
package CorpusDTDneu.provider;


import CorpusDTDneu.CorpusDTDneuFactory;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgySentType;

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
 * This is the item provider adapter for a {@link CorpusDTDneu.EgySentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EgySentTypeItemProvider
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
	public EgySentTypeItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
			addTranslatPropertyDescriptor(object);
			addBtsCodesPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addLanguagePropertyDescriptor(object);
			addLeipzig3ModulPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgySentType_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgySentType_value_feature", "_UI_EgySentType_type"),
				 CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Translat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranslatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgySentType_translat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgySentType_translat_feature", "_UI_EgySentType_type"),
				 CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__TRANSLAT,
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
				 getString("_UI_EgySentType_btsCodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgySentType_btsCodes_feature", "_UI_EgySentType_type"),
				 CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__BTS_CODES,
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
				 getString("_UI_EgySentType_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgySentType_comment_feature", "_UI_EgySentType_type"),
				 CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__COMMENT,
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
				 getString("_UI_EgySentType_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgySentType_author_feature", "_UI_EgySentType_type"),
				 CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgySentType_language_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgySentType_language_feature", "_UI_EgySentType_type"),
				 CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leipzig3 Modul feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeipzig3ModulPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgySentType_leipzig3Modul_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgySentType_leipzig3Modul_feature", "_UI_EgySentType_type"),
				 CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__LEIPZIG3_MODUL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgySentType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgySentType_type_feature", "_UI_EgySentType_type"),
				 CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__TYPE,
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
			childrenFeatures.add(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP);
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
	 * This returns EgySentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EgySentType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EgySentType)object).getValue();
		return label == null || label.length() == 0 ?
			getString("_UI_EgySentType_type") :
			getString("_UI_EgySentType_type") + " " + label;
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

		switch (notification.getFeatureID(EgySentType.class)) {
			case CorpusDTDneuPackage.EGY_SENT_TYPE__VALUE:
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TRANSLAT:
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BTS_CODES:
			case CorpusDTDneuPackage.EGY_SENT_TYPE__COMMENT:
			case CorpusDTDneuPackage.EGY_SENT_TYPE__AUTHOR:
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE:
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG3_MODUL:
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GROUP:
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
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_SENT,
					 CorpusDTDneuFactory.eINSTANCE.createEgySentType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_TB1,
					 CorpusDTDneuFactory.eINSTANCE.createEgyTB1Type())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_TB3_START,
					 CorpusDTDneuFactory.eINSTANCE.createEgyTB3StartType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_TB3_END,
					 CorpusDTDneuFactory.eINSTANCE.createEgyTB3EndType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_WORD,
					 CorpusDTDneuFactory.eINSTANCE.createEgyWordType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__LINE_COUNT,
					 CorpusDTDneuFactory.eINSTANCE.createLineCountType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__NOTE,
					 CorpusDTDneuFactory.eINSTANCE.createNoteType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__FORMATTING_ELEMENT,
					 CorpusDTDneuFactory.eINSTANCE.createFormattingElementType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__LANGUAGE_PASSAGE,
					 CorpusDTDneuFactory.eINSTANCE.createLanguagePassageType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__BAUSTEIN_PASSAGE,
					 CorpusDTDneuFactory.eINSTANCE.createBausteinPassageType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__LEIPZIG_PASSAGE,
					 CorpusDTDneuFactory.eINSTANCE.createLeipzigPassageType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GLOSSE_PASSAGE,
					 CorpusDTDneuFactory.eINSTANCE.createGlossePassageType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__PUNCTUATION,
					 CorpusDTDneuFactory.eINSTANCE.createPunctuationType())));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_PUNCTUATION,
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
