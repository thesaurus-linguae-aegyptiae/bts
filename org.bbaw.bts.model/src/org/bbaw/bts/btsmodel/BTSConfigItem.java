/**
 */
package org.bbaw.bts.btsmodel;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Config Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getValue <em>Value</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getLabel <em>Label</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getPassportEditorConfig <em>Passport Editor Config</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getRules <em>Rules</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#isShowWidget <em>Show Widget</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSConfigItem#getOwnerReferencedTypesStringList <em>Owner Referenced Types String List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem()
 * @model
 * @generated
 */
public interface BTSConfigItem extends BTSConfig, BTSObservableObject, BTSIdentifiableItem {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(BTSTranslations)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_Label()
	 * @model containment="true"
	 * @generated
	 */
	BTSTranslations getLabel();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(BTSTranslations value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(BTSTranslations)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_Description()
	 * @model containment="true"
	 * @generated
	 */
	BTSTranslations getDescription();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(BTSTranslations value);

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_SortKey()
	 * @model
	 * @generated
	 */
	int getSortKey();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(int value);

	/**
	 * Returns the value of the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore</em>' attribute.
	 * @see #setIgnore(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_Ignore()
	 * @model
	 * @generated
	 */
	boolean isIgnore();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#isIgnore <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore</em>' attribute.
	 * @see #isIgnore()
	 * @generated
	 */
	void setIgnore(boolean value);

	/**
	 * Returns the value of the '<em><b>Passport Editor Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passport Editor Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport Editor Config</em>' containment reference.
	 * @see #setPassportEditorConfig(BTSPassportEditorConfig)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_PassportEditorConfig()
	 * @model containment="true"
	 * @generated
	 */
	BTSPassportEditorConfig getPassportEditorConfig();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getPassportEditorConfig <em>Passport Editor Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport Editor Config</em>' containment reference.
	 * @see #getPassportEditorConfig()
	 * @generated
	 */
	void setPassportEditorConfig(BTSPassportEditorConfig value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_Subtype()
	 * @model
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_Rules()
	 * @model containment="true"
	 * @generated
	 */
	List<BTSWorkflowRuleItem> getRules();

	/**
	 * Returns the value of the '<em><b>Show Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Widget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Widget</em>' attribute.
	 * @see #setShowWidget(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_ShowWidget()
	 * @model
	 * @generated
	 */
	boolean isShowWidget();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSConfigItem#isShowWidget <em>Show Widget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Widget</em>' attribute.
	 * @see #isShowWidget()
	 * @generated
	 */
	void setShowWidget(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner Referenced Types String List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Referenced Types String List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Referenced Types String List</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfigItem_OwnerReferencedTypesStringList()
	 * @model
	 * @generated
	 */
	EList<String> getOwnerReferencedTypesStringList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" mapType="org.bbaw.bts.btsmodel.StringToStringListMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EEList<org.eclipse.emf.ecore.EString>>"
	 * @generatedNOT
	 */
	Map<String, List<String>> getOwnerTypesMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearOwnerTypesMap();

} // BTSConfigItem
