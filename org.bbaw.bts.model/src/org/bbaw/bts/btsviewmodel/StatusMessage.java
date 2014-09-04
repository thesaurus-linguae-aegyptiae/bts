/**
 */
package org.bbaw.bts.btsviewmodel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsviewmodel.StatusMessage#getMessage <em>Message</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.StatusMessage#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.StatusMessage#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.StatusMessage#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.StatusMessage#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getStatusMessage()
 * @model
 * @generated
 */
public interface StatusMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getStatusMessage_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(Date)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getStatusMessage_CreationTime()
	 * @model
	 * @generated
	 */
	Date getCreationTime();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(Date value);

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
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getStatusMessage_UserId()
	 * @model
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.bbaw.bts.btsviewmodel.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see org.bbaw.bts.btsviewmodel.MessageType
	 * @see #setMessageType(MessageType)
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getStatusMessage_MessageType()
	 * @model default=""
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.StatusMessage#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see org.bbaw.bts.btsviewmodel.MessageType
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsviewmodel.StatusMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getStatusMessage_Children()
	 * @model
	 * @generated
	 */
	EList<StatusMessage> getChildren();

} // StatusMessage
