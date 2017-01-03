/**
 */
package CorpusDTDneu.provider;


import CorpusDTDneu.CorpusDTDneuFactory;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.TCPassportType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link CorpusDTDneu.TCPassportType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TCPassportTypeItemProvider
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
	public TCPassportTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDefinitionPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addBibliographyPropertyDescriptor(object);
			addLangCommentPropertyDescriptor(object);
			addCodesPropertyDescriptor(object);
			addWbFolderPropertyDescriptor(object);
			addWbSlipsPropertyDescriptor(object);
			addCode1PropertyDescriptor(object);
			addCode2PropertyDescriptor(object);
			addBtsCodesPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addFullNamePropertyDescriptor(object);
			addNameSortPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_definition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_definition_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__DEFINITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_protocol_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bibliography feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBibliographyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_bibliography_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_bibliography_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__BIBLIOGRAPHY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lang Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_langComment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_langComment_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__LANG_COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Codes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_codes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_codes_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__CODES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wb Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWbFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_wbFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_wbFolder_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__WB_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wb Slips feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWbSlipsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_wbSlips_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_wbSlips_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__WB_SLIPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCode1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_code1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_code1_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__CODE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCode2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_code2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_code2_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__CODE2,
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
				 getString("_UI_TCPassportType_btsCodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_btsCodes_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__BTS_CODES,
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
				 getString("_UI_TCPassportType_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_comment_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_notes_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__NOTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Full Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_fullName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_fullName_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__FULL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Sort feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameSortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPassportType_nameSort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPassportType_nameSort_feature", "_UI_TCPassportType_type"),
				 CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__NAME_SORT,
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
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__PROVENANCE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__DATE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__OBJECT_TYPE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__DEPICTION);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__SCRIPT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__LANGUAGE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__WORK);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__TEXT_TYPE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__LINE_COUNT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__TC_LOCATION);
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
	 * This returns TCPassportType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TCPassportType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TCPassportType)object).getFullName();
		return label == null || label.length() == 0 ?
			getString("_UI_TCPassportType_type") :
			getString("_UI_TCPassportType_type") + " " + label;
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

		switch (notification.getFeatureID(TCPassportType.class)) {
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEFINITION:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROTOCOL:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BIBLIOGRAPHY:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANG_COMMENT:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODES:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_FOLDER:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_SLIPS:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE1:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE2:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BTS_CODES:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__COMMENT:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NOTES:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__FULL_NAME:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NAME_SORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT:
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TC_LOCATION:
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
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__PROVENANCE,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__DATE,
				 CorpusDTDneuFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__OBJECT_TYPE,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__DEPICTION,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__SCRIPT,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__LANGUAGE,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__WORK,
				 CorpusDTDneuFactory.eINSTANCE.createWorkType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__TEXT_TYPE,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__LINE_COUNT,
				 CorpusDTDneuFactory.eINSTANCE.createLineCountType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__TC_LOCATION,
				 CorpusDTDneuFactory.eINSTANCE.createTCLocationType()));
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
			childFeature == CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__PROVENANCE ||
			childFeature == CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__OBJECT_TYPE ||
			childFeature == CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__DEPICTION ||
			childFeature == CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__SCRIPT ||
			childFeature == CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__LANGUAGE ||
			childFeature == CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE__TEXT_TYPE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
