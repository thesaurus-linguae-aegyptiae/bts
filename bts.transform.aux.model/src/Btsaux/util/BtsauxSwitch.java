/**
 */
package Btsaux.util;

import Btsaux.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Btsaux.BtsauxPackage
 * @generated
 */
public class BtsauxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtsauxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsauxSwitch() {
		if (modelPackage == null) {
			modelPackage = BtsauxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BtsauxPackage.AUGROUPS_TYPE: {
				AugroupsType augroupsType = (AugroupsType)theEObject;
				T result = caseAugroupsType(augroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsauxPackage.AUTHORIZATION_TYPE: {
				AuthorizationType authorizationType = (AuthorizationType)theEObject;
				T result = caseAuthorizationType(authorizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsauxPackage.AUTHORS_TYPE: {
				AuthorsType authorsType = (AuthorsType)theEObject;
				T result = caseAuthorsType(authorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsauxPackage.BWLENGL_TYPE: {
				BwlenglType bwlenglType = (BwlenglType)theEObject;
				T result = caseBwlenglType(bwlenglType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsauxPackage.BWLLINK_TYPE: {
				BwllinkType bwllinkType = (BwllinkType)theEObject;
				T result = caseBwllinkType(bwllinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsauxPackage.BWLLIST_TYPE: {
				BwllistType bwllistType = (BwllistType)theEObject;
				T result = caseBwllistType(bwllistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsauxPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsauxPackage.STUPID_XML_TYPE: {
				StupidXMLType stupidXMLType = (StupidXMLType)theEObject;
				T result = caseStupidXMLType(stupidXMLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtsauxPackage.THSDATA_TYPE: {
				ThsdataType thsdataType = (ThsdataType)theEObject;
				T result = caseThsdataType(thsdataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Augroups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Augroups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAugroupsType(AugroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationType(AuthorizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorsType(AuthorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bwlengl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bwlengl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBwlenglType(BwlenglType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bwllink Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bwllink Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBwllinkType(BwllinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bwllist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bwllist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBwllistType(BwllistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stupid XML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stupid XML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStupidXMLType(StupidXMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thsdata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thsdata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThsdataType(ThsdataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BtsauxSwitch
