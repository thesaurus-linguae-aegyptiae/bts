/**
 */
package org.bbaw.bts.btsviewmodel.provider;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsviewmodel.TreeNodeWrapper} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class TreeNodeWrapperItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider
{

	// EcoreItemProviderAdapterFactory factory = new
	// EcoreItemProviderAdapterFactory();
	private Map<BTSObject, Set<TreeNodeWrapper>> realItemMap = new HashMap<BTSObject, Set<TreeNodeWrapper>>();

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TreeNodeWrapperItemProvider(AdapterFactory adapterFactory)
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
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addParentPropertyDescriptor(object);
			addChildrenPropertyDescriptor(object);
			addObjectPropertyDescriptor(object);
			addPropertyChangeSupportPropertyDescriptor(object);
			addChildrenLoadedPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addParentObjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TreeNodeWrapper_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TreeNodeWrapper_parent_feature", "_UI_TreeNodeWrapper_type"),
				 BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Children feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChildrenPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TreeNodeWrapper_children_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TreeNodeWrapper_children_feature", "_UI_TreeNodeWrapper_type"),
				 BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addObjectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TreeNodeWrapper_object_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TreeNodeWrapper_object_feature", "_UI_TreeNodeWrapper_type"),
				 BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__OBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Change Support feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyChangeSupportPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TreeNodeWrapper_propertyChangeSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TreeNodeWrapper_propertyChangeSupport_feature", "_UI_TreeNodeWrapper_type"),
				 BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Children Loaded feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChildrenLoadedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TreeNodeWrapper_childrenLoaded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TreeNodeWrapper_childrenLoaded_feature", "_UI_TreeNodeWrapper_type"),
				 BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN_LOADED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TreeNodeWrapper_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TreeNodeWrapper_label_feature", "_UI_TreeNodeWrapper_type"),
				 BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentObjectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TreeNodeWrapper_parentObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TreeNodeWrapper_parentObject_feature", "_UI_TreeNodeWrapper_type"),
				 BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__PARENT_OBJECT,
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
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN);
		}
		return childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(Object object)
	{
		if (object != null && object instanceof TreeNodeWrapper)
		{
			TreeNodeWrapper treeNodeWrapper = (TreeNodeWrapper) object;
			if (treeNodeWrapper.getObject() != null && treeNodeWrapper.getObject() instanceof BTSConfig)
			{
				BTSObject realItem = ((TreeNodeWrapper) object).getObject();
				IItemLabelProvider realItemItemprovider = getRealItemItemProvider(treeNodeWrapper, realItem);
				return ((IStructuredItemContentProvider) realItemItemprovider).getElements(realItem);
			}

		}
		return super.getChildren(object);
	}

	@Override
	public boolean hasChildren(Object object)
	{
		if (object != null && object instanceof TreeNodeWrapper)
		{
			TreeNodeWrapper treeNodeWrapper = (TreeNodeWrapper) object;
			if (treeNodeWrapper.getObject() != null && treeNodeWrapper.getObject() instanceof BTSConfig)
			{
				BTSObject realItem = ((TreeNodeWrapper) object).getObject();
				IItemLabelProvider realItemItemprovider = getRealItemItemProvider(treeNodeWrapper, realItem);
				return ((ItemProviderAdapter) realItemItemprovider).hasChildren(realItem);
			}

		}
		return super.hasChildren(object);
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
	 * This returns TreeNodeWrapper.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generatedNot
	 */
	@Override
	public Object getImage(Object object)
	{
		TreeNodeWrapper treeNodeWrapper = (TreeNodeWrapper) object;
		BTSObject realItem = ((TreeNodeWrapper) object).getObject();
		if (realItem == null) {
			return overlayImage(object,
					getResourceLocator().getImage("full/obj16/TreeNodeWrapper"));
		}

		IItemLabelProvider realItemItemprovider = getRealItemItemProvider(
				treeNodeWrapper, realItem);
		return realItemItemprovider.getImage(realItem);

	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public String getText(Object object)
	{
		TreeNodeWrapper treeNodeWrapper = (TreeNodeWrapper) object;
		BTSObject realItem = ((TreeNodeWrapper) object).getObject();
		if (realItem == null)
		{
			return treeNodeWrapper.getLabel();
		}

		IItemLabelProvider realItemItemprovider = getRealItemItemProvider(treeNodeWrapper, realItem);
		String suffix = treeNodeWrapper.isChildrenLoaded() ? " (" + getChildren(object).size() + ")" : " (?)";
		String label = realItemItemprovider.getText(realItem) + suffix;
		return label;
	}

	private IItemLabelProvider getRealItemItemProvider(final TreeNodeWrapper treeNodeWrapper, final BTSObject realItem)
	{
		IStructuredItemContentProvider realItemItemprovider = null;
		if (adapterFactory.isFactoryForType(IStructuredItemContentProvider.class))
		{
			realItemItemprovider = (IStructuredItemContentProvider) ((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory().adapt(realItem, IStructuredItemContentProvider.class);
		}
		if (!realItemMap.containsKey(realItem))
		{
			realItemMap.put(realItem, new HashSet<TreeNodeWrapper>());
		}
		if (!realItemMap.get(realItem).contains(treeNodeWrapper))
		{
			if (realItem instanceof BTSConfig)
			{
				((ItemProviderAdapter) realItemItemprovider).addListener(new INotifyChangedListener()
				{
					@Override
					public void notifyChanged(Notification notification)
					{
						if (notification.getNotifier() == realItem)
						{
							fireNotifyChanged(new ViewerNotification(notification, treeNodeWrapper, false, true));
						}
					}
				});
			} else
			{
				((ItemProviderAdapter) realItemItemprovider).addListener(new INotifyChangedListener()
				{
					@Override
					public void notifyChanged(Notification notification)
					{
						if (notification.getNotifier() == realItem)
						{
							fireNotifyChanged(new ViewerNotification(notification, treeNodeWrapper, false, true));
						}
								switch (notification
										.getFeatureID(AdministrativDataObject.class)) {
								case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE:
									TreeNodeWrapper parent = treeNodeWrapper
											.getParent();
									if (parent != null) {
										fireNotifyChanged(new ViewerNotification(
												notification, parent, true,
												true));
										return;
									}
								}
					}
				});

			}
			realItemMap.get(realItem).add(treeNodeWrapper);
		}
		return (IItemLabelProvider) realItemItemprovider;

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

		switch (notification.getFeatureID(TreeNodeWrapper.class))
		{
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__OBJECT:
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT:
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN_LOADED:
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__LABEL:
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__PARENT_OBJECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN:
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
				(BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
				 BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return BTSViewModelEditPlugin.INSTANCE;
	}

	// /**
	// *
	// * @generatedNOT
	// */
	// @Override
	// public Collection<?> getChildren(Object object)
	// {
	// if (object instanceof TreeNodeWrapper)
	// {
	// TreeNodeWrapper o = (TreeNodeWrapper) object;
	// return o.getChildren();
	// }
	// return childrenFeatures;
	// }
	//
	// @Override
	// public boolean hasChildren(Object object)
	// {
	// boolean hasChildren = true;
	// if (object instanceof TreeNodeWrapper)
	// {
	// TreeNodeWrapper o = (TreeNodeWrapper) object;
	// hasChildren = o.getChildren().size() > 0 ? true : !o.isChildrenLoaded();
	// }
	// return hasChildren;
	// }

	@Override
	public Object getParent(Object object)
	{
		if (object instanceof TreeNodeWrapper)
		{
			TreeNodeWrapper o = (TreeNodeWrapper) object;
			return o.getParent();
		}
		return null;
	}

}
