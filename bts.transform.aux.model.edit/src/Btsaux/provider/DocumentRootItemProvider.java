/**
 */
package Btsaux.provider;


import Btsaux.BtsauxFactory;
import Btsaux.BtsauxPackage;
import Btsaux.DocumentRoot;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Btsaux.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BtsauxPackage.Literals.DOCUMENT_ROOT__AUGROUPS);
			childrenFeatures.add(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORIZATION);
			childrenFeatures.add(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORS);
			childrenFeatures.add(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLENGL);
			childrenFeatures.add(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLINK);
			childrenFeatures.add(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLIST);
			childrenFeatures.add(BtsauxPackage.Literals.DOCUMENT_ROOT__STUPID_XML);
			childrenFeatures.add(BtsauxPackage.Literals.DOCUMENT_ROOT__THSDATA);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case BtsauxPackage.DOCUMENT_ROOT__AUGROUPS:
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORIZATION:
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORS:
			case BtsauxPackage.DOCUMENT_ROOT__BWLENGL:
			case BtsauxPackage.DOCUMENT_ROOT__BWLLINK:
			case BtsauxPackage.DOCUMENT_ROOT__BWLLIST:
			case BtsauxPackage.DOCUMENT_ROOT__STUPID_XML:
			case BtsauxPackage.DOCUMENT_ROOT__THSDATA:
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
				(BtsauxPackage.Literals.DOCUMENT_ROOT__AUGROUPS,
				 BtsauxFactory.eINSTANCE.createAugroupsType()));

		newChildDescriptors.add
			(createChildParameter
				(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORIZATION,
				 BtsauxFactory.eINSTANCE.createAuthorizationType()));

		newChildDescriptors.add
			(createChildParameter
				(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORS,
				 BtsauxFactory.eINSTANCE.createAuthorsType()));

		newChildDescriptors.add
			(createChildParameter
				(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLENGL,
				 BtsauxFactory.eINSTANCE.createBwlenglType()));

		newChildDescriptors.add
			(createChildParameter
				(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLINK,
				 BtsauxFactory.eINSTANCE.createBwllinkType()));

		newChildDescriptors.add
			(createChildParameter
				(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLIST,
				 BtsauxFactory.eINSTANCE.createBwllistType()));

		newChildDescriptors.add
			(createChildParameter
				(BtsauxPackage.Literals.DOCUMENT_ROOT__STUPID_XML,
				 BtsauxFactory.eINSTANCE.createStupidXMLType()));

		newChildDescriptors.add
			(createChildParameter
				(BtsauxPackage.Literals.DOCUMENT_ROOT__THSDATA,
				 BtsauxFactory.eINSTANCE.createThsdataType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BtsauxEditPlugin.INSTANCE;
	}

}
