/**
 */
package org.bbaw.bts.btsmodel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Observable Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObservableObject#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObservableObject()
 * @model abstract="true"
 * @generated
 */
public interface BTSObservableObject extends EObject
{
	/**
	 * Returns the value of the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Change Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Change Support</em>' attribute.
	 * @see #setPropertyChangeSupport(PropertyChangeSupport)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObservableObject_PropertyChangeSupport()
	 * @model dataType="org.bbaw.bts.btsmodel.PropertyChangeSupport" transient="true"
	 * @generated
	 */
	PropertyChangeSupport getPropertyChangeSupport();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObservableObject#getPropertyChangeSupport <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Change Support</em>' attribute.
	 * @see #getPropertyChangeSupport()
	 * @generated
	 */
	void setPropertyChangeSupport(PropertyChangeSupport value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model propertyChangeListenerDataType="org.bbaw.bts.btsmodel.PropertyChangeListener"
	 * @generated
	 */
	void addPropertyChangeListener(PropertyChangeListener propertyChangeListener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model propertyChangeListenerDataType="org.bbaw.bts.btsmodel.PropertyChangeListener"
	 * @generated
	 */
	void removePropertyChangeListener(PropertyChangeListener propertyChangeListener);

} // BTSObservableObject
