/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Egy Txt Corpus Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getTCHeader <em>TC Header</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getPicturesTable <em>Pictures Table</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getTCCaption <em>TC Caption</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getTCGroup <em>TC Group</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getTCArrangement <em>TC Arrangement</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getTCObject <em>TC Object</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getTCObjPart <em>TC Obj Part</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getTCScene <em>TC Scene</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getTCText <em>TC Text</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getEgyTxt <em>Egy Txt</em>}</li>
 *   <li>{@link CorpusDTDneu.EgyTxtCorpusType#getDTDVersion <em>DTD Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType()
 * @model extendedMetaData="name='EgyTxtCorpus_._type' kind='elementOnly'"
 * @generated
 */
public interface EgyTxtCorpusType extends EObject {
	/**
	 * Returns the value of the '<em><b>TC Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Header</em>' containment reference.
	 * @see #setTCHeader(TCHeaderType)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_TCHeader()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TCHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	TCHeaderType getTCHeader();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgyTxtCorpusType#getTCHeader <em>TC Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TC Header</em>' containment reference.
	 * @see #getTCHeader()
	 * @generated
	 */
	void setTCHeader(TCHeaderType value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Pictures Table</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.PicturesTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pictures Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pictures Table</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_PicturesTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PicturesTable' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<PicturesTableType> getPicturesTable();

	/**
	 * Returns the value of the '<em><b>TC Caption</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCCaptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Caption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Caption</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_TCCaption()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCCaption' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<TCCaptionType> getTCCaption();

	/**
	 * Returns the value of the '<em><b>TC Group</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Group</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_TCGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCGroup' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<TCGroupType> getTCGroup();

	/**
	 * Returns the value of the '<em><b>TC Arrangement</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCArrangementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Arrangement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Arrangement</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_TCArrangement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCArrangement' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<TCArrangementType> getTCArrangement();

	/**
	 * Returns the value of the '<em><b>TC Object</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Object</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_TCObject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCObject' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<TCObjectType> getTCObject();

	/**
	 * Returns the value of the '<em><b>TC Obj Part</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCObjPartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Obj Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Obj Part</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_TCObjPart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCObjPart' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<TCObjPartType> getTCObjPart();

	/**
	 * Returns the value of the '<em><b>TC Scene</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCSceneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Scene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Scene</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_TCScene()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCScene' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<TCSceneType> getTCScene();

	/**
	 * Returns the value of the '<em><b>TC Text</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCTextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Text</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_TCText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCText' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<TCTextType> getTCText();

	/**
	 * Returns the value of the '<em><b>Egy Txt</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.EgyTxtType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy Txt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy Txt</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_EgyTxt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EgyTxt' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<EgyTxtType> getEgyTxt();

	/**
	 * Returns the value of the '<em><b>DTD Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTD Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTD Version</em>' attribute.
	 * @see #setDTDVersion(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyTxtCorpusType_DTDVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='DTDVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDTDVersion();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgyTxtCorpusType#getDTDVersion <em>DTD Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DTD Version</em>' attribute.
	 * @see #getDTDVersion()
	 * @generated
	 */
	void setDTDVersion(Object value);

} // EgyTxtCorpusType
