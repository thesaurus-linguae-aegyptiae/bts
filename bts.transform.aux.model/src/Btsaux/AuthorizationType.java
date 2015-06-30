/**
 */
package Btsaux;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Btsaux.AuthorizationType#getAuct <em>Auct</em>}</li>
 *   <li>{@link Btsaux.AuthorizationType#getCategory <em>Category</em>}</li>
 *   <li>{@link Btsaux.AuthorizationType#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see Btsaux.BtsauxPackage#getAuthorizationType()
 * @model extendedMetaData="name='authorization_._type' kind='empty'"
 * @generated
 */
public interface AuthorizationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Auct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auct</em>' attribute.
	 * @see #setAuct(String)
	 * @see Btsaux.BtsauxPackage#getAuthorizationType_Auct()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='auct' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuct();

	/**
	 * Sets the value of the '{@link Btsaux.AuthorizationType#getAuct <em>Auct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auct</em>' attribute.
	 * @see #getAuct()
	 * @generated
	 */
	void setAuct(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(Object)
	 * @see Btsaux.BtsauxPackage#getAuthorizationType_Category()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCategory();

	/**
	 * Sets the value of the '{@link Btsaux.AuthorizationType#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Object value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(Object)
	 * @see Btsaux.BtsauxPackage#getAuthorizationType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getComment();

	/**
	 * Sets the value of the '{@link Btsaux.AuthorizationType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Object value);

} // AuthorizationType
