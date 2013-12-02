/**
 */
package org.bbaw.bts.btsmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSMarker#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSMarker()
 * @model
 * @generated
 */
public interface BTSMarker extends BTSTextSentenceItem, BTSTextItems, BTSAmbivalenceItem, BTSSentenceItem, BTSReferencableItem
{
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSMarker_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSMarker#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // BTSMarker
