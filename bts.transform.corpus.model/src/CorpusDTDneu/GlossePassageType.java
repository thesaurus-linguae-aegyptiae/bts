/**
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glosse Passage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.GlossePassageType#getPassageID <em>Passage ID</em>}</li>
 *   <li>{@link CorpusDTDneu.GlossePassageType#getScript <em>Script</em>}</li>
 *   <li>{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlossePassageType()
 * @model extendedMetaData="name='GlossePassage_._type' kind='empty'"
 * @generated
 */
public interface GlossePassageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Passage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passage ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passage ID</em>' attribute.
	 * @see #setPassageID(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlossePassageType_PassageID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='PassageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassageID();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.GlossePassageType#getPassageID <em>Passage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passage ID</em>' attribute.
	 * @see #getPassageID()
	 * @generated
	 */
	void setPassageID(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlossePassageType_Script()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='Script' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getScript();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.GlossePassageType#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CorpusDTDneu.TypeType3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType3
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType3)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlossePassageType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType3 getType();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType3
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType3 value);

	/**
	 * Unsets the value of the '{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType3)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType3)
	 * @generated
	 */
	boolean isSetType();

} // GlossePassageType
