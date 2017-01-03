/**
 */
package Btsaux.provider;


import Btsaux.BtsauxPackage;
import Btsaux.BwllistType;

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
 * This is the item provider adapter for a {@link Btsaux.BwllistType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BwllistTypeItemProvider
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
	public BwllistTypeItemProvider(AdapterFactory adapterFactory) {
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

			addArbVermerkPropertyDescriptor(object);
			addHsortPropertyDescriptor(object);
			addKommentarPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addLemmaPropertyDescriptor(object);
			addLockPropertyDescriptor(object);
			addLsortPropertyDescriptor(object);
			addRedactionPropertyDescriptor(object);
			addRstatusPropertyDescriptor(object);
			addSc00PropertyDescriptor(object);
			addSc01PropertyDescriptor(object);
			addSc02PropertyDescriptor(object);
			addSc03PropertyDescriptor(object);
			addSc04PropertyDescriptor(object);
			addSc05PropertyDescriptor(object);
			addSc06PropertyDescriptor(object);
			addSc07PropertyDescriptor(object);
			addSc08PropertyDescriptor(object);
			addSc09PropertyDescriptor(object);
			addSc10PropertyDescriptor(object);
			addShortrefPropertyDescriptor(object);
			addSimplifyPropertyDescriptor(object);
			addWclassPropertyDescriptor(object);
			addWclassnumPropertyDescriptor(object);
			addWcnPropertyDescriptor(object);
			addWoartPropertyDescriptor(object);
			addGlyphsPropertyDescriptor(object);
			addPredecessorPropertyDescriptor(object);
			addSuccessorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Arb Vermerk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArbVermerkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_arbVermerk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_arbVermerk_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__ARB_VERMERK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hsort feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHsortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_hsort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_hsort_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__HSORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kommentar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKommentarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_kommentar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_kommentar_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__KOMMENTAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_label_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lemma feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLemmaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_lemma_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_lemma_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__LEMMA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_lock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_lock_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__LOCK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lsort feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLsortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_lsort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_lsort_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__LSORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedactionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_redaction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_redaction_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__REDACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rstatus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRstatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_rstatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_rstatus_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__RSTATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc00 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc00PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc00_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc00_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC00,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc01 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc01PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc01_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc01_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC01,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc02 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc02PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc02_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc02_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC02,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc03 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc03PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc03_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc03_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC03,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc04 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc04PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc04_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc04_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC04,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc05 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc05PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc05_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc05_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC05,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc06 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc06PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc06_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc06_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC06,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc07 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc07PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc07_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc07_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC07,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc08 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc08PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc08_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc08_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC08,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc09 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc09PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc09_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc09_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC09,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sc10 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSc10PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_sc10_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_sc10_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SC10,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shortref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_shortref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_shortref_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SHORTREF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Simplify feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimplifyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_simplify_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_simplify_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SIMPLIFY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wclass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWclassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_wclass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_wclass_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__WCLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wclassnum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWclassnumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_wclassnum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_wclassnum_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__WCLASSNUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wcn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWcnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_wcn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_wcn_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__WCN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Woart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWoartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_woart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_woart_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__WOART,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glyphs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlyphsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_glyphs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_glyphs_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__GLYPHS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predecessor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredecessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_predecessor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_predecessor_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__PREDECESSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Successor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuccessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BwllistType_successor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BwllistType_successor_feature", "_UI_BwllistType_type"),
				 BtsauxPackage.Literals.BWLLIST_TYPE__SUCCESSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BwllistType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BwllistType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((BwllistType)object).getArbVermerk();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BwllistType_type") :
			getString("_UI_BwllistType_type") + " " + label;
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

		switch (notification.getFeatureID(BwllistType.class)) {
			case BtsauxPackage.BWLLIST_TYPE__ARB_VERMERK:
			case BtsauxPackage.BWLLIST_TYPE__HSORT:
			case BtsauxPackage.BWLLIST_TYPE__KOMMENTAR:
			case BtsauxPackage.BWLLIST_TYPE__LABEL:
			case BtsauxPackage.BWLLIST_TYPE__LEMMA:
			case BtsauxPackage.BWLLIST_TYPE__LOCK:
			case BtsauxPackage.BWLLIST_TYPE__LSORT:
			case BtsauxPackage.BWLLIST_TYPE__REDACTION:
			case BtsauxPackage.BWLLIST_TYPE__RSTATUS:
			case BtsauxPackage.BWLLIST_TYPE__SC00:
			case BtsauxPackage.BWLLIST_TYPE__SC01:
			case BtsauxPackage.BWLLIST_TYPE__SC02:
			case BtsauxPackage.BWLLIST_TYPE__SC03:
			case BtsauxPackage.BWLLIST_TYPE__SC04:
			case BtsauxPackage.BWLLIST_TYPE__SC05:
			case BtsauxPackage.BWLLIST_TYPE__SC06:
			case BtsauxPackage.BWLLIST_TYPE__SC07:
			case BtsauxPackage.BWLLIST_TYPE__SC08:
			case BtsauxPackage.BWLLIST_TYPE__SC09:
			case BtsauxPackage.BWLLIST_TYPE__SC10:
			case BtsauxPackage.BWLLIST_TYPE__SHORTREF:
			case BtsauxPackage.BWLLIST_TYPE__SIMPLIFY:
			case BtsauxPackage.BWLLIST_TYPE__WCLASS:
			case BtsauxPackage.BWLLIST_TYPE__WCLASSNUM:
			case BtsauxPackage.BWLLIST_TYPE__WCN:
			case BtsauxPackage.BWLLIST_TYPE__WOART:
			case BtsauxPackage.BWLLIST_TYPE__GLYPHS:
			case BtsauxPackage.BWLLIST_TYPE__PREDECESSOR:
			case BtsauxPackage.BWLLIST_TYPE__SUCCESSOR:
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
		return BtsauxEditPlugin.INSTANCE;
	}

}
