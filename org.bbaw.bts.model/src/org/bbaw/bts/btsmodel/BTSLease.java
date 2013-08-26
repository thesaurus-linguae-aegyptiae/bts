/**
 */
package org.bbaw.bts.btsmodel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Lease</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSLease#getLeasingUserId <em>Leasing User Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSLease#getLeaseTimeStamp <em>Lease Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSLease()
 * @model
 * @generated
 */
public interface BTSLease extends EObject {
	/**
	 * Returns the value of the '<em><b>Leasing User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leasing User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leasing User Id</em>' attribute.
	 * @see #setLeasingUserId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSLease_LeasingUserId()
	 * @model
	 * @generated
	 */
	String getLeasingUserId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSLease#getLeasingUserId <em>Leasing User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leasing User Id</em>' attribute.
	 * @see #getLeasingUserId()
	 * @generated
	 */
	void setLeasingUserId(String value);

	/**
	 * Returns the value of the '<em><b>Lease Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lease Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lease Time Stamp</em>' attribute.
	 * @see #setLeaseTimeStamp(Date)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSLease_LeaseTimeStamp()
	 * @model
	 * @generated
	 */
	Date getLeaseTimeStamp();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSLease#getLeaseTimeStamp <em>Lease Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lease Time Stamp</em>' attribute.
	 * @see #getLeaseTimeStamp()
	 * @generated
	 */
	void setLeaseTimeStamp(Date value);

} // BTSLease
