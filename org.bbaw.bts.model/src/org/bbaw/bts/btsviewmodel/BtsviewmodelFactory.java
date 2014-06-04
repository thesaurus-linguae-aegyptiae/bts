/**
 */
package org.bbaw.bts.btsviewmodel;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.DBLease;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage
 * @generated
 */
public interface BtsviewmodelFactory extends EFactory
{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	BtsviewmodelFactory eINSTANCE = org.bbaw.bts.btsviewmodel.impl.BtsviewmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tree Node Wrapper</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Tree Node Wrapper</em>'.
	 * @generated
	 */
	TreeNodeWrapper createTreeNodeWrapper();

	/**
	 * Returns a new object of class '<em>Status Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Message</em>'.
	 * @generated
	 */
	StatusMessage createStatusMessage();

	StatusMessage createFilteredMessage(int suppressed);
	
	StatusMessage createNotEditingRightsMessage();
	
	StatusMessage createLockedMessage(DBLease lease, String userId);
	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtsviewmodelPackage getBtsviewmodelPackage();

	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	TreeNodeWrapper wrappObject(BTSObject object);
} //BtsviewmodelFactory
