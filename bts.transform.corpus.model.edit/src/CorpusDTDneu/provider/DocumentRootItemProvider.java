/**
 */
package CorpusDTDneu.provider;


import CorpusDTDneu.CorpusDTDneuFactory;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.DocumentRoot;

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
 * This is the item provider adapter for a {@link CorpusDTDneu.DocumentRoot} object.
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

			addAuthorPropertyDescriptor(object);
			addBibliographyPropertyDescriptor(object);
			addBtsCodesPropertyDescriptor(object);
			addCodePropertyDescriptor(object);
			addCode1PropertyDescriptor(object);
			addCode2PropertyDescriptor(object);
			addCodesPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addDefinitionPropertyDescriptor(object);
			addFileNamePropertyDescriptor(object);
			addFilePathPropertyDescriptor(object);
			addFormPropertyDescriptor(object);
			addFullNamePropertyDescriptor(object);
			addGraphicsPropertyDescriptor(object);
			addHierarchyPropertyDescriptor(object);
			addLangCommentPropertyDescriptor(object);
			addLowerTermPropertyDescriptor(object);
			addMuseumNumberPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNameSortPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addProjectPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addTCNotebookPropertyDescriptor(object);
			addTermPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTranslatPropertyDescriptor(object);
			addTranslationPropertyDescriptor(object);
			addUpperTermPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addWbFolderPropertyDescriptor(object);
			addWbSlipsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_DocumentRoot_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_author_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__AUTHOR,
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
				 getString("_UI_DocumentRoot_bibliography_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_bibliography_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHY,
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
				 getString("_UI_DocumentRoot_btsCodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_btsCodes_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BTS_CODES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_code_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE,
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
				 getString("_UI_DocumentRoot_code1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_code1_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE1,
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
				 getString("_UI_DocumentRoot_code2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_code2_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODE2,
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
				 getString("_UI_DocumentRoot_codes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_codes_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__CODES,
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
				 getString("_UI_DocumentRoot_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_comment_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_DocumentRoot_definition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_definition_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEFINITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_fileName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_fileName_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FILE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_filePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_filePath_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FILE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_DocumentRoot_form_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_form_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FORM,
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
				 getString("_UI_DocumentRoot_fullName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_fullName_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FULL_NAME,
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
				 getString("_UI_DocumentRoot_graphics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_graphics_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GRAPHICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hierarchy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHierarchyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_hierarchy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_hierarchy_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__HIERARCHY,
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
				 getString("_UI_DocumentRoot_langComment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_langComment_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANG_COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Term feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerTermPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_lowerTerm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_lowerTerm_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LOWER_TERM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Museum Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMuseumNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_museumNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_museumNumber_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__MUSEUM_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_name_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NAME,
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
				 getString("_UI_DocumentRoot_nameSort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_nameSort_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NAME_SORT,
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
				 getString("_UI_DocumentRoot_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_notes_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NOTES,
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
	protected void addProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_project_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_project_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROJECT,
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
				 getString("_UI_DocumentRoot_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_protocol_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TC Notebook feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTCNotebookPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_tCNotebook_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_tCNotebook_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_NOTEBOOK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Term feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTermPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_term_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_term_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TERM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_title_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TITLE,
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
				 getString("_UI_DocumentRoot_translat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_translat_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TRANSLAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Translation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranslationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_translation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_translation_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TRANSLATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Term feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperTermPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_upperTerm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_upperTerm_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__UPPER_TERM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_DocumentRoot_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_value_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__VALUE,
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
				 getString("_UI_DocumentRoot_wbFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_wbFolder_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WB_FOLDER,
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
				 getString("_UI_DocumentRoot_wbSlips_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_wbSlips_feature", "_UI_DocumentRoot_type"),
				 CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WB_SLIPS,
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
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BAUSTEIN_PASSAGE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE_THS);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEPICTION);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_PUNCTUATION);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SENT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SUB_TXT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SZENARIO);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB1);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_END);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_START);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT_CORPUS);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_WORD);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FORMATTING_ELEMENT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE_PASSAGE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE_PASSAGE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LEIPZIG_PASSAGE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LINE_COUNT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NOTE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__OBJECT_TYPE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PASSPORT_DATA_ITEM);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURES_TABLE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROVENANCE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PUNCTUATION);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__SCRIPT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_ARRANGEMENT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_CAPTION);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_GROUP);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_HEADER);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_LOCATION);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJECT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJ_PART);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PASSPORT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PICTURE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SCENE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SUPER_TEXT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_TEXT);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TEXT_TYPE);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__THS_ENTRY);
			childrenFeatures.add(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WORK);
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
		String label = ((DocumentRoot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
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
			case CorpusDTDneuPackage.DOCUMENT_ROOT__AUTHOR:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BTS_CODES:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE1:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODE2:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__CODES:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__COMMENT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEFINITION:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_NAME:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FILE_PATH:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORM:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FULL_NAME:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GRAPHICS:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__HIERARCHY:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANG_COMMENT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LOWER_TERM:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__MUSEUM_NUMBER:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NAME_SORT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTES:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROJECT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROTOCOL:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_NOTEBOOK:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TERM:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TITLE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLAT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TRANSLATION:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__UPPER_TERM:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__VALUE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_FOLDER:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WB_SLIPS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorpusDTDneuPackage.DOCUMENT_ROOT__BAUSTEIN_PASSAGE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DATE_THS:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__DEPICTION:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_PUNCTUATION:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SENT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SUB_TXT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_SZENARIO:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB1:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_END:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TB3_START:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_TXT_CORPUS:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__EGY_WORD:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__FORMATTING_ELEMENT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__GLOSSE_PASSAGE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LANGUAGE_PASSAGE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LEIPZIG_PASSAGE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__LINE_COUNT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__NOTE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__OBJECT_TYPE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PASSPORT_DATA_ITEM:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PICTURES_TABLE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PROVENANCE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__PUNCTUATION:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__SCRIPT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_ARRANGEMENT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_CAPTION:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_GROUP:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_HEADER:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_LOCATION:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJECT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_OBJ_PART:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PASSPORT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_PICTURE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SCENE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_SUPER_TEXT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TC_TEXT:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__TEXT_TYPE:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__THS_ENTRY:
			case CorpusDTDneuPackage.DOCUMENT_ROOT__WORK:
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
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__BAUSTEIN_PASSAGE,
				 CorpusDTDneuFactory.eINSTANCE.createBausteinPassageType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE,
				 CorpusDTDneuFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DATE_THS,
				 CorpusDTDneuFactory.eINSTANCE.createDateThsType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEPICTION,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_PUNCTUATION,
				 CorpusDTDneuFactory.eINSTANCE.createEgyPunctuationType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SENT,
				 CorpusDTDneuFactory.eINSTANCE.createEgySentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SUB_TXT,
				 CorpusDTDneuFactory.eINSTANCE.createEgySubTxtType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_SZENARIO,
				 CorpusDTDneuFactory.eINSTANCE.createEgySzenarioType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB1,
				 CorpusDTDneuFactory.eINSTANCE.createEgyTB1Type()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_END,
				 CorpusDTDneuFactory.eINSTANCE.createEgyTB3EndType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TB3_START,
				 CorpusDTDneuFactory.eINSTANCE.createEgyTB3StartType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT,
				 CorpusDTDneuFactory.eINSTANCE.createEgyTxtType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_TXT_CORPUS,
				 CorpusDTDneuFactory.eINSTANCE.createEgyTxtCorpusType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__EGY_WORD,
				 CorpusDTDneuFactory.eINSTANCE.createEgyWordType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__FORMATTING_ELEMENT,
				 CorpusDTDneuFactory.eINSTANCE.createFormattingElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE,
				 CorpusDTDneuFactory.eINSTANCE.createGlosseType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__GLOSSE_PASSAGE,
				 CorpusDTDneuFactory.eINSTANCE.createGlossePassageType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE_PASSAGE,
				 CorpusDTDneuFactory.eINSTANCE.createLanguagePassageType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LEIPZIG_PASSAGE,
				 CorpusDTDneuFactory.eINSTANCE.createLeipzigPassageType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LINE_COUNT,
				 CorpusDTDneuFactory.eINSTANCE.createLineCountType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__NOTE,
				 CorpusDTDneuFactory.eINSTANCE.createNoteType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__OBJECT_TYPE,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PASSPORT_DATA_ITEM,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItemType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURE,
				 CorpusDTDneuFactory.eINSTANCE.createPictureType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PICTURES_TABLE,
				 CorpusDTDneuFactory.eINSTANCE.createPicturesTableType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROVENANCE,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PUNCTUATION,
				 CorpusDTDneuFactory.eINSTANCE.createPunctuationType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__SCRIPT,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_ARRANGEMENT,
				 CorpusDTDneuFactory.eINSTANCE.createTCArrangementType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_CAPTION,
				 CorpusDTDneuFactory.eINSTANCE.createTCCaptionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_GROUP,
				 CorpusDTDneuFactory.eINSTANCE.createTCGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_HEADER,
				 CorpusDTDneuFactory.eINSTANCE.createTCHeaderType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_LOCATION,
				 CorpusDTDneuFactory.eINSTANCE.createTCLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJECT,
				 CorpusDTDneuFactory.eINSTANCE.createTCObjectType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_OBJ_PART,
				 CorpusDTDneuFactory.eINSTANCE.createTCObjPartType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PASSPORT,
				 CorpusDTDneuFactory.eINSTANCE.createTCPassportType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_PICTURE,
				 CorpusDTDneuFactory.eINSTANCE.createTCPictureType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SCENE,
				 CorpusDTDneuFactory.eINSTANCE.createTCSceneType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_SUPER_TEXT,
				 CorpusDTDneuFactory.eINSTANCE.createTCSuperTextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TC_TEXT,
				 CorpusDTDneuFactory.eINSTANCE.createTCTextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TEXT_TYPE,
				 CorpusDTDneuFactory.eINSTANCE.createPassportDataItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__THS_ENTRY,
				 CorpusDTDneuFactory.eINSTANCE.createThsEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__WORK,
				 CorpusDTDneuFactory.eINSTANCE.createWorkType()));
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
			childFeature == CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__DEPICTION ||
			childFeature == CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__LANGUAGE ||
			childFeature == CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__OBJECT_TYPE ||
			childFeature == CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__PROVENANCE ||
			childFeature == CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__SCRIPT ||
			childFeature == CorpusDTDneuPackage.Literals.DOCUMENT_ROOT__TEXT_TYPE;

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
