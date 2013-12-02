/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Lemma Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSLemmaCase#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSLemmaCase()
 * @model
 * @generated
 */
public interface BTSLemmaCase extends BTSReferencableItem {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSAmbivalenceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSLemmaCase_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSAmbivalenceItem> getScenario();

} // BTSLemmaCase
