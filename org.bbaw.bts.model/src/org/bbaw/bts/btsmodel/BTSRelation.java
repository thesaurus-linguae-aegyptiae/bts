/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BTSRelation-objects describe relations between BTSObject-objects to objects that extend BTSIdentifiableItem.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getParts <em>Parts</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getCertainty <em>Certainty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation()
 * @model
 * @generated
 */
public interface BTSRelation extends BTSIdentifiableItem {
	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id</em>' attribute.
	 * @see #setObjectId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_ObjectId()
	 * @model
	 * @generated
	 */
	String getObjectId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' attribute.
	 * @see #getObjectId()
	 * @generated
	 */
	void setObjectId(String value);

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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getType <em>Type</em>}' attribute.
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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Subtype()
	 * @model
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSInterTextReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list parts holds references inside the related object.
	 * 
	 * E.g.: A relation references a text-object by referencing its id in objectId. Parts can 
	 * then contain references into the text-object itself, e.g. certain words.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSInterTextReference> getParts();

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certainty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty</em>' attribute.
	 * @see #setCertainty(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Certainty()
	 * @model
	 * @generated
	 */
	String getCertainty();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getCertainty <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certainty</em>' attribute.
	 * @see #getCertainty()
	 * @generated
	 */
	void setCertainty(String value);

} // BTSRelation
