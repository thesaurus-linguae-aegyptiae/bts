/**
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baustein Passage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.BausteinPassageType#getBaustein <em>Baustein</em>}</li>
 *   <li>{@link CorpusDTDneu.BausteinPassageType#getPassageID <em>Passage ID</em>}</li>
 *   <li>{@link CorpusDTDneu.BausteinPassageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getBausteinPassageType()
 * @model extendedMetaData="name='BausteinPassage_._type' kind='empty'"
 * @generated
 */
public interface BausteinPassageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Baustein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baustein</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baustein</em>' attribute.
	 * @see #setBaustein(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getBausteinPassageType_Baustein()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='Baustein' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getBaustein();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.BausteinPassageType#getBaustein <em>Baustein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baustein</em>' attribute.
	 * @see #getBaustein()
	 * @generated
	 */
	void setBaustein(Object value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getBausteinPassageType_PassageID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='PassageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassageID();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.BausteinPassageType#getPassageID <em>Passage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passage ID</em>' attribute.
	 * @see #getPassageID()
	 * @generated
	 */
	void setPassageID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CorpusDTDneu.TypeType8}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType8
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType8)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getBausteinPassageType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType8 getType();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.BausteinPassageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType8
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType8 value);

	/**
	 * Unsets the value of the '{@link CorpusDTDneu.BausteinPassageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType8)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.BausteinPassageType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType8)
	 * @generated
	 */
	boolean isSetType();

} // BausteinPassageType
