/**
 */
package org.bbaw.bts.btsviewmodel.provider;


import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DBCollectionStatusInformationItemProvider 
	extends ItemProviderAdapter
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
		IItemFontProvider,
		IItemStyledLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBCollectionStatusInformationItemProvider(AdapterFactory adapterFactory) {
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

			addDbCollectionNamePropertyDescriptor(object);
			addDbDocCountPropertyDescriptor(object);
			addSyncStatusToRemotePropertyDescriptor(object);
			addSyncStatusFromRemotePropertyDescriptor(object);
			addIndexDocCountPropertyDescriptor(object);
			addIndexStatusPropertyDescriptor(object);
			addDbDiskSizePropertyDescriptor(object);
			addDbDocDelCountPropertyDescriptor(object);
			addDbPurgeSeqPropertyDescriptor(object);
			addDbUpdateSeqPropertyDescriptor(object);
			addIndexUpdateSeqPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Db Collection Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbCollectionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_dbCollectionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_dbCollectionName_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Doc Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbDocCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_dbDocCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_dbDocCount_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sync Status To Remote feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSyncStatusToRemotePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_syncStatusToRemote_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_syncStatusToRemote_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sync Status From Remote feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSyncStatusFromRemotePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_syncStatusFromRemote_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_syncStatusFromRemote_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index Doc Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexDocCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_indexDocCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_indexDocCount_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_indexStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_indexStatus_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Disk Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbDiskSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_dbDiskSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_dbDiskSize_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Doc Del Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbDocDelCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_dbDocDelCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_dbDocDelCount_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Purge Seq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbPurgeSeqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_dbPurgeSeq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_dbPurgeSeq_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Update Seq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbUpdateSeqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_dbUpdateSeq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_dbUpdateSeq_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index Update Seq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexUpdateSeqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DBCollectionStatusInformation_indexUpdateSeq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DBCollectionStatusInformation_indexUpdateSeq_feature", "_UI_DBCollectionStatusInformation_type"),
				 BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DBCollectionStatusInformation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DBCollectionStatusInformation"));
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
	 * @generated
	 */
	@Override
	public Object getStyledText(Object object) {
		String label = ((DBCollectionStatusInformation)object).getDbCollectionName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_DBCollectionStatusInformation_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_DBCollectionStatusInformation_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
		}
		return styledLabel;
	}
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		if (object instanceof DBCollectionStatusInformation)
		{
			DBCollectionStatusInformation info = (DBCollectionStatusInformation) object;
			switch (columnIndex) {
			case 0:
				return info.getDbCollectionName();
			case 1:
				return new Long(info.getDbDocCount()).toString();
			case 2:
				return info.getSyncStatusToRemote();
			case 3:
				return info.getSyncStatusFromRemote();
			case 4:
				return new Long(info.getIndexDocCount()).toString();
			case 5:
				return info.getIndexStatus();
			case 6:
				return info.getDbUpdateSeq();
			case 7:
				return info.getIndexUpdateSeq();
			default:
				break;
			}
		}
		return super.getColumnText(object, columnIndex);
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

		switch (notification.getFeatureID(DBCollectionStatusInformation.class)) {
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ:
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ:
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
		return BTSViewModelEditPlugin.INSTANCE;
	}

}
