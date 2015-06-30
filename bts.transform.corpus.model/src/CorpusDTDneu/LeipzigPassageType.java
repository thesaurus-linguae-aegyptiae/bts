/**
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leipzig Passage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.LeipzigPassageType#getAuszeichnung <em>Auszeichnung</em>}</li>
 *   <li>{@link CorpusDTDneu.LeipzigPassageType#getPassageID <em>Passage ID</em>}</li>
 *   <li>{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getLeipzigPassageType()
 * @model extendedMetaData="name='LeipzigPassage_._type' kind='empty'"
 * @generated
 */
public interface LeipzigPassageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Auszeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auszeichnung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auszeichnung</em>' attribute.
	 * @see #setAuszeichnung(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getLeipzigPassageType_Auszeichnung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Auszeichnung' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAuszeichnung();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.LeipzigPassageType#getAuszeichnung <em>Auszeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auszeichnung</em>' attribute.
	 * @see #getAuszeichnung()
	 * @generated
	 */
	void setAuszeichnung(Object value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getLeipzigPassageType_PassageID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='PassageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassageID();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.LeipzigPassageType#getPassageID <em>Passage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passage ID</em>' attribute.
	 * @see #getPassageID()
	 * @generated
	 */
	void setPassageID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CorpusDTDneu.TypeType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType2)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getLeipzigPassageType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType2 getType();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CorpusDTDneu.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType2 value);

	/**
	 * Unsets the value of the '{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	boolean isSetType();

} // LeipzigPassageType
