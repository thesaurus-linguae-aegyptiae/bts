/**
 */
package org.bbaw.bts.btsmodel.provider;

 
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.widgets.Display;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsmodel.BTSDBBaseObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTSDBBaseObjectItemProvider
	extends BTSIdentifiableItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSDBBaseObjectItemProvider(AdapterFactory adapterFactory) {
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

			add_revPropertyDescriptor(object);
			addProjectPropertyDescriptor(object);
			addLockedPropertyDescriptor(object);
			addUpdatersPropertyDescriptor(object);
			addReadersPropertyDescriptor(object);
			add_deletedPropertyDescriptor(object);
			addConflictingRevsPropertyDescriptor(object);
			addDBCollectionKeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the rev feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void add_revPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject__rev_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject__rev_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__REV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_project_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_project_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_locked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_locked_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__LOCKED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Updaters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatersPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_updaters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_updaters_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__UPDATERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Readers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadersPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_readers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_readers_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__READERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the deleted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void add_deletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject__deleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject__deleted_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__DELETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conflicting Revs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConflictingRevsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_conflictingRevs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_conflictingRevs_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__CONFLICTING_REVS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DB Collection Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDBCollectionKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_dBCollectionKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_dBCollectionKey_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
		String label = ((BTSDBBaseObject)object).get_id();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_BTSDBBaseObject_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_BTSDBBaseObject_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
		}
		return styledLabel;
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

		switch (notification.getFeatureID(BTSDBBaseObject.class)) {
			case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
			case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
			case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
			case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
			case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
			case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
			case BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS:
			case BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY:
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

	@Override
	protected Object overlayImage(Object object, Object image) {
		if (object instanceof BTSDBBaseObject
				&& ((BTSDBBaseObject) object).isLocked()) {
			List<Object> images = new ArrayList<Object>(2);
			images.add(image);
			if (getEvaluationService() != null
					&& !getEvaluationService().authenticatedUserHasLock(object)) {
				images.add(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_OVR_PEN));
			} else {
				images.add(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_OVR_LOCK));
			}

			image = new ComposedImage(images);
		}
		if (object instanceof BTSDBBaseObject
				&& !((BTSDBBaseObject) object).getConflictingRevs().isEmpty()) {
			List<Object> images = new ArrayList<Object>(2);
			images.add(image);
			images.add(resourceProvider.getImage(Display.getDefault(),
					BTSResourceProvider.IMG_OVR_CONFLICTS));
			image = new ComposedImage(images);
		}
		return super.overlayImage(object, image);
	}
	
	protected BTSEvaluationService getEvaluationService() {
		if (evaluationService == null)
		{
			IEclipseContext context = StaticAccessController.getContext();
			if (context != null)
			{
				evaluationService = context.get(BTSEvaluationService.class);
			}
		}
		return evaluationService;
	}
}
