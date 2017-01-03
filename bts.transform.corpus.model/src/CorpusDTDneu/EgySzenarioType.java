/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Egy Szenario Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.EgySzenarioType#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.EgySzenarioType#getInterneNummer <em>Interne Nummer</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySzenarioType()
 * @model extendedMetaData="name='EgySzenario_._type' kind='elementOnly'"
 * @generated
 */
public interface EgySzenarioType extends EObject {
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySzenarioType_EgySent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EgySent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EgySentType> getEgySent();

	/**
	 * Returns the value of the '<em><b>Interne Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interne Nummer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interne Nummer</em>' attribute.
	 * @see #setInterneNummer(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgySzenarioType_InterneNummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='InterneNummer' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getInterneNummer();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.EgySzenarioType#getInterneNummer <em>Interne Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interne Nummer</em>' attribute.
	 * @see #getInterneNummer()
	 * @generated
	 */
	void setInterneNummer(Object value);

} // EgySzenarioType
