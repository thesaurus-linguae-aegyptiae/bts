/**
 */
package Btsaux;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Btsaux.BtsauxPackage
 * @generated
 */
public interface BtsauxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsauxFactory eINSTANCE = Btsaux.impl.BtsauxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Augroups Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Augroups Type</em>'.
	 * @generated
	 */
	AugroupsType createAugroupsType();

	/**
	 * Returns a new object of class '<em>Authorization Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Type</em>'.
	 * @generated
	 */
	AuthorizationType createAuthorizationType();

	/**
	 * Returns a new object of class '<em>Authors Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authors Type</em>'.
	 * @generated
	 */
	AuthorsType createAuthorsType();

	/**
	 * Returns a new object of class '<em>Bwlengl Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bwlengl Type</em>'.
	 * @generated
	 */
	BwlenglType createBwlenglType();

	/**
	 * Returns a new object of class '<em>Bwllink Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bwllink Type</em>'.
	 * @generated
	 */
	BwllinkType createBwllinkType();

	/**
	 * Returns a new object of class '<em>Bwllist Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bwllist Type</em>'.
	 * @generated
	 */
	BwllistType createBwllistType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Stupid XML Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stupid XML Type</em>'.
	 * @generated
	 */
	StupidXMLType createStupidXMLType();

	/**
	 * Returns a new object of class '<em>Thsdata Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thsdata Type</em>'.
	 * @generated
	 */
	ThsdataType createThsdataType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtsauxPackage getBtsauxPackage();

} //BtsauxFactory
