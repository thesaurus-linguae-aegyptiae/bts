/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.provider;


import java.util.Collection;
import java.util.List;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.provider.BTSIdentifiableItemItemProvider;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTSSenctenceItemProvider
	extends BTSIdentifiableItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSSenctenceItemProvider(AdapterFactory adapterFactory) {
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

			addPropertyChangeSupportPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addRevisionStatePropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Change Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyChangeSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSObservableObject_propertyChangeSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSObservableObject_propertyChangeSupport_feature", "_UI_BTSObservableObject_type"),
				 BtsmodelPackage.Literals.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
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
	 * This adds a property descriptor for the Revision State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevisionStatePropertyDescriptor(Object object) {
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
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISIONS);
			childrenFeatures.add(BtsCorpusModelPackage.Literals.BTS_SENCTENCE__SENTENCE_ITEMS);
			childrenFeatures.add(BtsCorpusModelPackage.Literals.BTS_SENCTENCE__TRANSLATION);
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
	 * This returns BTSSenctence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BTSSenctence"));
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
		String label = ((BTSSenctence)object).get_id();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_BTSSenctence_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(getString("_UI_BTSSenctence_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
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

		switch (notification.getFeatureID(BTSSenctence.class)) {
			case BtsCorpusModelPackage.BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT:
			case BtsCorpusModelPackage.BTS_SENCTENCE__STATE:
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISION_STATE:
			case BtsCorpusModelPackage.BTS_SENCTENCE__VISIBILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISIONS:
			case BtsCorpusModelPackage.BTS_SENCTENCE__SENTENCE_ITEMS:
			case BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION:
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
				(BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISIONS,
				 ""));

		newChildDescriptors.add
			(createChildParameter
				(BtsCorpusModelPackage.Literals.BTS_SENCTENCE__SENTENCE_ITEMS,
				 BtsCorpusModelFactory.eINSTANCE.createBTSWord()));

		newChildDescriptors.add
			(createChildParameter
				(BtsCorpusModelPackage.Literals.BTS_SENCTENCE__SENTENCE_ITEMS,
				 BtsCorpusModelFactory.eINSTANCE.createBTSMarker()));

		newChildDescriptors.add
			(createChildParameter
				(BtsCorpusModelPackage.Literals.BTS_SENCTENCE__SENTENCE_ITEMS,
				 BtsCorpusModelFactory.eINSTANCE.createBTSAmbivalence()));

		newChildDescriptors.add
			(createChildParameter
				(BtsCorpusModelPackage.Literals.BTS_SENCTENCE__TRANSLATION,
				 BtsmodelFactory.eINSTANCE.createBTSTranslations()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BTSCorpusModelEditPlugin.INSTANCE;
	}

}
