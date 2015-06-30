/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Egy Sub Txt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getName <em>Name</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getEgySubTxt <em>Egy Sub Txt</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getEgyTB1 <em>Egy TB1</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getEgySzenario <em>Egy Szenario</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getGlosse <em>Glosse</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getEgyTB3End <em>Egy TB3 End</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySubTxtType#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType()
 * @model extendedMetaData="name='EgySubTxt_._type' kind='elementOnly'"
 * @generated
 */
public interface EgySubTxtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySubTxtType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bts Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bts Codes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bts Codes</em>' attribute.
	 * @see #setBtsCodes(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_BtsCodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BtsCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBtsCodes();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySubTxtType#getBtsCodes <em>Bts Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bts Codes</em>' attribute.
	 * @see #getBtsCodes()
	 * @generated
	 */
	void setBtsCodes(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySubTxtType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Egy Sub Txt</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgySubTxtType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy Sub Txt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy Sub Txt</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_EgySubTxt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgySubTxt' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgySubTxtType> getEgySubTxt();

	/**
	 * Returns the value of the '<em><b>Egy Sent</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgySentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy Sent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy Sent</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_EgySent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgySent' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgySentType> getEgySent();

	/**
	 * Returns the value of the '<em><b>Egy TB1</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyTB1Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy TB1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy TB1</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_EgyTB1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB1' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgyTB1Type> getEgyTB1();

	/**
	 * Returns the value of the '<em><b>Egy Szenario</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgySzenarioType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy Szenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy Szenario</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_EgySzenario()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgySzenario' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgySzenarioType> getEgySzenario();

	/**
	 * Returns the value of the '<em><b>Glosse</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.GlosseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glosse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosse</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_Glosse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Glosse' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<GlosseType> getGlosse();

	/**
	 * Returns the value of the '<em><b>Egy TB3 Start</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyTB3StartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy TB3 Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy TB3 Start</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_EgyTB3Start()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB3Start' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgyTB3StartType> getEgyTB3Start();

	/**
	 * Returns the value of the '<em><b>Egy TB3 End</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyTB3EndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy TB3 End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy TB3 End</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_EgyTB3End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTB3End' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<EgyTB3EndType> getEgyTB3End();

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySubTxtType_SortKey()
	 * @model
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySubTxtType#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

} // EgySubTxtType
