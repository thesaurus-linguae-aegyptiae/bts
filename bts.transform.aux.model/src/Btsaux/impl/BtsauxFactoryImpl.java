/**
 */
package Btsaux.impl;

import Btsaux.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsauxFactoryImpl extends EFactoryImpl implements BtsauxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtsauxFactory init() {
		try {
			BtsauxFactory theBtsauxFactory = (BtsauxFactory)EPackage.Registry.INSTANCE.getEFactory(BtsauxPackage.eNS_URI);
			if (theBtsauxFactory != null) {
				return theBtsauxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtsauxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsauxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BtsauxPackage.AUGROUPS_TYPE: return createAugroupsType();
			case BtsauxPackage.AUTHORIZATION_TYPE: return createAuthorizationType();
			case BtsauxPackage.AUTHORS_TYPE: return createAuthorsType();
			case BtsauxPackage.BWLENGL_TYPE: return createBwlenglType();
			case BtsauxPackage.BWLLINK_TYPE: return createBwllinkType();
			case BtsauxPackage.BWLLIST_TYPE: return createBwllistType();
			case BtsauxPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BtsauxPackage.STUPID_XML_TYPE: return createStupidXMLType();
			case BtsauxPackage.THSDATA_TYPE: return createThsdataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AugroupsType createAugroupsType() {
		AugroupsTypeImpl augroupsType = new AugroupsTypeImpl();
		return augroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationType createAuthorizationType() {
		AuthorizationTypeImpl authorizationType = new AuthorizationTypeImpl();
		return authorizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorsType createAuthorsType() {
		AuthorsTypeImpl authorsType = new AuthorsTypeImpl();
		return authorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BwlenglType createBwlenglType() {
		BwlenglTypeImpl bwlenglType = new BwlenglTypeImpl();
		return bwlenglType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BwllinkType createBwllinkType() {
		BwllinkTypeImpl bwllinkType = new BwllinkTypeImpl();
		return bwllinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BwllistType createBwllistType() {
		BwllistTypeImpl bwllistType = new BwllistTypeImpl();
		return bwllistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StupidXMLType createStupidXMLType() {
		StupidXMLTypeImpl stupidXMLType = new StupidXMLTypeImpl();
		return stupidXMLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThsdataType createThsdataType() {
		ThsdataTypeImpl thsdataType = new ThsdataTypeImpl();
		return thsdataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsauxPackage getBtsauxPackage() {
		return (BtsauxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BtsauxPackage getPackage() {
		return BtsauxPackage.eINSTANCE;
	}

} //BtsauxFactoryImpl
