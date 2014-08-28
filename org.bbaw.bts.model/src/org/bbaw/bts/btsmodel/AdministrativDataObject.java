/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrativ Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This object is the basic object with administrativ data allowing to track revisions,
 * status, revisionState and visibility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getState <em>State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisionState <em>Revision State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getAdministrativDataObject()
 * @model abstract="true"
 * @generated
 */
public interface AdministrativDataObject extends BTSObservableObject, BTSIdentifiableItem {
	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSRevision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getAdministrativDataObject_Revisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSRevision> getRevisions();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getAdministrativDataObject_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision State</em>' attribute.
	 * @see #setRevisionState(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getAdministrativDataObject_RevisionState()
	 * @model
	 * @generated
	 */
	String getRevisionState();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisionState <em>Revision State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision State</em>' attribute.
	 * @see #getRevisionState()
	 * @generated
	 */
	void setRevisionState(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getAdministrativDataObject_Visibility()
	 * @model
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

} // AdministrativDataObject
