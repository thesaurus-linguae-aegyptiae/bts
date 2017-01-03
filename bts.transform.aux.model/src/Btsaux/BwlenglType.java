/**
 */
package Btsaux;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bwlengl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Btsaux.BwlenglType#getEcomment <em>Ecomment</em>}</li>
 *   <li>{@link Btsaux.BwlenglType#getElabel <em>Elabel</em>}</li>
 *   <li>{@link Btsaux.BwlenglType#getWcn <em>Wcn</em>}</li>
 * </ul>
 * </p>
 *
 * @see Btsaux.BtsauxPackage#getBwlenglType()
 * @model extendedMetaData="name='bwlengl_._type' kind='empty'"
 * @generated
 */
public interface BwlenglType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ecomment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecomment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecomment</em>' attribute.
	 * @see #setEcomment(Object)
	 * @see Btsaux.BtsauxPackage#getBwlenglType_Ecomment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='ecomment' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getEcomment();

	/**
	 * Sets the value of the '{@link Btsaux.BwlenglType#getEcomment <em>Ecomment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecomment</em>' attribute.
	 * @see #getEcomment()
	 * @generated
	 */
	void setEcomment(Object value);

	/**
	 * Returns the value of the '<em><b>Elabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elabel</em>' attribute.
	 * @see #setElabel(Object)
	 * @see Btsaux.BtsauxPackage#getBwlenglType_Elabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='elabel' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getElabel();

	/**
	 * Sets the value of the '{@link Btsaux.BwlenglType#getElabel <em>Elabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elabel</em>' attribute.
	 * @see #getElabel()
	 * @generated
	 */
	void setElabel(Object value);

	/**
	 * Returns the value of the '<em><b>Wcn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wcn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcn</em>' attribute.
	 * @see #setWcn(String)
	 * @see Btsaux.BtsauxPackage#getBwlenglType_Wcn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='wcn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWcn();

	/**
	 * Sets the value of the '{@link Btsaux.BwlenglType#getWcn <em>Wcn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcn</em>' attribute.
	 * @see #getWcn()
	 * @generated
	 */
	void setWcn(String value);

} // BwlenglType
