/**
 */
package Btsaux.util;

import Btsaux.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Btsaux.BtsauxPackage
 * @generated
 */
public class BtsauxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtsauxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsauxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BtsauxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BtsauxSwitch<Adapter> modelSwitch =
		new BtsauxSwitch<Adapter>() {
			@Override
			public Adapter caseAugroupsType(AugroupsType object) {
				return createAugroupsTypeAdapter();
			}
			@Override
			public Adapter caseAuthorizationType(AuthorizationType object) {
				return createAuthorizationTypeAdapter();
			}
			@Override
			public Adapter caseAuthorsType(AuthorsType object) {
				return createAuthorsTypeAdapter();
			}
			@Override
			public Adapter caseBwlenglType(BwlenglType object) {
				return createBwlenglTypeAdapter();
			}
			@Override
			public Adapter caseBwllinkType(BwllinkType object) {
				return createBwllinkTypeAdapter();
			}
			@Override
			public Adapter caseBwllistType(BwllistType object) {
				return createBwllistTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseStupidXMLType(StupidXMLType object) {
				return createStupidXMLTypeAdapter();
			}
			@Override
			public Adapter caseThsdataType(ThsdataType object) {
				return createThsdataTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.AugroupsType <em>Augroups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.AugroupsType
	 * @generated
	 */
	public Adapter createAugroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.AuthorizationType <em>Authorization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.AuthorizationType
	 * @generated
	 */
	public Adapter createAuthorizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.AuthorsType <em>Authors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.AuthorsType
	 * @generated
	 */
	public Adapter createAuthorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.BwlenglType <em>Bwlengl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.BwlenglType
	 * @generated
	 */
	public Adapter createBwlenglTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.BwllinkType <em>Bwllink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.BwllinkType
	 * @generated
	 */
	public Adapter createBwllinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.BwllistType <em>Bwllist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.BwllistType
	 * @generated
	 */
	public Adapter createBwllistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.StupidXMLType <em>Stupid XML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.StupidXMLType
	 * @generated
	 */
	public Adapter createStupidXMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Btsaux.ThsdataType <em>Thsdata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Btsaux.ThsdataType
	 * @generated
	 */
	public Adapter createThsdataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BtsauxAdapterFactory
