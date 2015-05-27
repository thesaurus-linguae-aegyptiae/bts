/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.provider;

import java.util.Collection;
import java.util.List;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.swt.widgets.Display;

/**
 * This is the item provider adapter for a
 * {@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BTSAbstractTextItemProvider extends BTSCorpusObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BTSAbstractTextItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParagraphsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Paragraphs feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParagraphsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSAbstractText_paragraphs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSAbstractText_paragraphs_feature", "_UI_BTSAbstractText_type"),
				 BtsCorpusModelPackage.Literals.BTS_ABSTRACT_TEXT__PARAGRAPHS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns BTSTextCorpus.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getBTSResourceProvider().getImage(
						Display.getDefault(),
						getConfigurationController().getIconStringOfObjectType(
								(BTSCorpusObject) object)));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((BTSAbstractText) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BTSAbstractText_type")
				: label;
	}

	/**
	 * This returns the label styled text for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public Object getStyledText(Object object) {
		String label = ((BTSAbstractText) object).getName();
		StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_BTSAbstractText_type"),
					StyledString.Style.QUALIFIER_STYLER);
		} else {
			styledLabel.append(label, StyledString.Style.QUALIFIER_STYLER);
		}
		styledLabel.append(" [" + ((BTSCorpusObject) object).getProject()
				+ "\\" + ((BTSCorpusObject) object).getCorpusPrefix() + "]",
				GREY);

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
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
