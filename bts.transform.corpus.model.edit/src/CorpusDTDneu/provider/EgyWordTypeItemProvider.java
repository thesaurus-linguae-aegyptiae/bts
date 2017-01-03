/**
 */
package CorpusDTDneu.provider;


import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgyWordType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link CorpusDTDneu.EgyWordType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EgyWordTypeItemProvider
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
	public EgyWordTypeItemProvider(AdapterFactory adapterFactory) {
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

			addFormPropertyDescriptor(object);
			addTranslatPropertyDescriptor(object);
			addGraphicsPropertyDescriptor(object);
			addBtsCodesPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addConnectPropertyDescriptor(object);
			addFKeyPropertyDescriptor(object);
			addLeipzig3ModulPropertyDescriptor(object);
			addLKeyPropertyDescriptor(object);
			addLTypePropertyDescriptor(object);
			addReihenfolgePropertyDescriptor(object);
			addReihenfolgeIDPropertyDescriptor(object);
			addScriptPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addWChrPropertyDescriptor(object);
			addWTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Form feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_form_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_form_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__FORM,
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
				 getString("_UI_EgyWordType_translat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_translat_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__TRANSLAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Graphics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGraphicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_graphics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_graphics_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__GRAPHICS,
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
				 getString("_UI_EgyWordType_btsCodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_btsCodes_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__BTS_CODES,
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
				 getString("_UI_EgyWordType_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_comment_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__COMMENT,
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
				 getString("_UI_EgyWordType_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_author_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_connect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_connect_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__CONNECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the FKey feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_fKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_fKey_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__FKEY,
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
				 getString("_UI_EgyWordType_leipzig3Modul_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_leipzig3Modul_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__LEIPZIG3_MODUL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the LKey feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_lKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_lKey_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__LKEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the LType feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_lType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_lType_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__LTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reihenfolge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReihenfolgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_reihenfolge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_reihenfolge_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__REIHENFOLGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reihenfolge ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReihenfolgeIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_reihenfolgeID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_reihenfolgeID_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__REIHENFOLGE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Script feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_script_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_script_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__SCRIPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_status_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the WChr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWChrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_wChr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_wChr_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__WCHR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the WType feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EgyWordType_wType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EgyWordType_wType_feature", "_UI_EgyWordType_type"),
				 CorpusDTDneuPackage.Literals.EGY_WORD_TYPE__WTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EgyWordType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EgyWordType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EgyWordType)object).getForm();
		return label == null || label.length() == 0 ?
			getString("_UI_EgyWordType_type") :
			getString("_UI_EgyWordType_type") + " " + label;
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

		switch (notification.getFeatureID(EgyWordType.class)) {
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FORM:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__TRANSLAT:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__GRAPHICS:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__BTS_CODES:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__COMMENT:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__AUTHOR:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__CONNECT:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FKEY:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LEIPZIG3_MODUL:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LKEY:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LTYPE:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE_ID:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__SCRIPT:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__STATUS:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WCHR:
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WTYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
