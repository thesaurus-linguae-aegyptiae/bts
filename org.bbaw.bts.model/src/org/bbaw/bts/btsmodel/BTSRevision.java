/**
 */
package org.bbaw.bts.btsmodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BTSRevision-objects hold information about user revisions.
 * This includes user id, timestamp when changes were persisted,
 * revision number.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRevision#getRef <em>Ref</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRevision#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSRevision#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRevision()
 * @model
 * @generated
 */
public interface BTSRevision extends BTSIdentifiableItem {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(int)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRevision_Ref()
	 * @model
	 * @generated
	 */
	int getRef();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRevision#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(int value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRevision_UserId()
	 * @model
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRevision#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRevision_TimeStamp()
	 * @model
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRevision#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toRevisionString();

} // BTSRevision
