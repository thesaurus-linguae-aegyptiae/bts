/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pictures Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.PicturesTableType#getPicture <em>Picture</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getPicturesTableType()
 * @model extendedMetaData="name='PicturesTable_._type' kind='elementOnly'"
 * @generated
 */
public interface PicturesTableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Picture</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.PictureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getPicturesTableType_Picture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Picture' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PictureType> getPicture();

} // PicturesTableType
