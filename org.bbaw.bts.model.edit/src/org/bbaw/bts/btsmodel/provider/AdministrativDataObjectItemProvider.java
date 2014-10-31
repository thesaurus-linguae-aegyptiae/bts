/**
 */
package org.bbaw.bts.btsmodel.provider;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * This is the item provider adapter for a
 * {@link org.bbaw.bts.btsmodel.AdministrativDataObject} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AdministrativDataObjectItemProvider extends BTSObservableObjectItemProvider
{
	private BTSEvaluationService evaluationService;
	private BTSConfigurationController configurationController;

	protected BTSConfigurationController getConfigurationController()
	{
		if (configurationController == null)
		{
			configurationController = StaticAccessController
					.getContext().get(BTSConfigurationController.class);
		}
		return configurationController;
	}
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdministrativDataObjectItemProvider(AdapterFactory adapterFactory)
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

			add_idPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addRevisionStatePropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void add_idPropertyDescriptor(Object object) {
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
	 * This adds a property descriptor for the State feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativDataObject_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativDataObject_state_feature", "_UI_AdministrativDataObject_type"),
				 BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revision State feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRevisionStatePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativDataObject_revisionState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativDataObject_revisionState_feature", "_UI_AdministrativDataObject_type"),
				 BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativDataObject_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativDataObject_visibility_feature", "_UI_AdministrativDataObject_type"),
				 BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__VISIBILITY,
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISIONS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
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
		PropertyChangeSupport labelValue = ((AdministrativDataObject)object).getPropertyChangeSupport();
		String label = labelValue == null ? null : labelValue.toString();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_AdministrativDataObject_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_AdministrativDataObject_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
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

		switch (notification.getFeatureID(AdministrativDataObject.class)) {
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__ID:
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE:
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE:
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS:
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
				(BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISIONS,
				 ""));
	}
	@Override
	protected Object overlayImage(Object object, Object image) {
		if (object instanceof BTSDBBaseObject && ((BTSDBBaseObject) object).isLocked())
	    {
			 List<Object> images = new ArrayList<Object>(2);
		      images.add(image);
			if(getEvaluationService() != null && !getEvaluationService().authenticatedUserHasLock(object))
			{
				Image i = resourceProvider.getImage(Display.getDefault(), BTSResourceProvider.IMG_OVR_LOCK);
				if (i != null)
			    {
					images.add(i); 
			    }
			}
			else
			{
			      images.add(resourceProvider.getImage(Display.getDefault(), BTSResourceProvider.IMG_OVR_PEN)); 
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
		if (object instanceof BTSObject
				&& ((BTSObject) object).getRevisionState() != null) {
			Object o = getConfigurationController()
					.getIconStringOfRevisionsState((BTSObject) object);
			if (o != null)
			{
				o = resourceProvider.getImage(Display.getDefault(),
					(String) o);
			}
			if (o != null)
			{
				List<Object> images = new ArrayList<Object>(2);
				images.add(image);
				images.add(o);
				image = new ComposedImage(images);
			}
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
