/**
 */
package Btsaux.impl;

import Btsaux.AuthorsType;
import Btsaux.BtsauxPackage;
import Btsaux.BwlenglType;
import Btsaux.BwllinkType;
import Btsaux.BwllistType;
import Btsaux.StupidXMLType;
import Btsaux.ThsdataType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stupid XML Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Btsaux.impl.StupidXMLTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Btsaux.impl.StupidXMLTypeImpl#getThsdata <em>Thsdata</em>}</li>
 *   <li>{@link Btsaux.impl.StupidXMLTypeImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link Btsaux.impl.StupidXMLTypeImpl#getBwlengl <em>Bwlengl</em>}</li>
 *   <li>{@link Btsaux.impl.StupidXMLTypeImpl#getBwllink <em>Bwllink</em>}</li>
 *   <li>{@link Btsaux.impl.StupidXMLTypeImpl#getBwllist <em>Bwllist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StupidXMLTypeImpl extends MinimalEObjectImpl.Container implements StupidXMLType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StupidXMLTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsauxPackage.Literals.STUPID_XML_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BtsauxPackage.STUPID_XML_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThsdataType> getThsdata() {
		return getGroup().list(BtsauxPackage.Literals.STUPID_XML_TYPE__THSDATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorsType> getAuthors() {
		return getGroup().list(BtsauxPackage.Literals.STUPID_XML_TYPE__AUTHORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BwlenglType> getBwlengl() {
		return getGroup().list(BtsauxPackage.Literals.STUPID_XML_TYPE__BWLENGL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BwllinkType> getBwllink() {
		return getGroup().list(BtsauxPackage.Literals.STUPID_XML_TYPE__BWLLINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BwllistType> getBwllist() {
		return getGroup().list(BtsauxPackage.Literals.STUPID_XML_TYPE__BWLLIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsauxPackage.STUPID_XML_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BtsauxPackage.STUPID_XML_TYPE__THSDATA:
				return ((InternalEList<?>)getThsdata()).basicRemove(otherEnd, msgs);
			case BtsauxPackage.STUPID_XML_TYPE__AUTHORS:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case BtsauxPackage.STUPID_XML_TYPE__BWLENGL:
				return ((InternalEList<?>)getBwlengl()).basicRemove(otherEnd, msgs);
			case BtsauxPackage.STUPID_XML_TYPE__BWLLINK:
				return ((InternalEList<?>)getBwllink()).basicRemove(otherEnd, msgs);
			case BtsauxPackage.STUPID_XML_TYPE__BWLLIST:
				return ((InternalEList<?>)getBwllist()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsauxPackage.STUPID_XML_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BtsauxPackage.STUPID_XML_TYPE__THSDATA:
				return getThsdata();
			case BtsauxPackage.STUPID_XML_TYPE__AUTHORS:
				return getAuthors();
			case BtsauxPackage.STUPID_XML_TYPE__BWLENGL:
				return getBwlengl();
			case BtsauxPackage.STUPID_XML_TYPE__BWLLINK:
				return getBwllink();
			case BtsauxPackage.STUPID_XML_TYPE__BWLLIST:
				return getBwllist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtsauxPackage.STUPID_XML_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BtsauxPackage.STUPID_XML_TYPE__THSDATA:
				getThsdata().clear();
				getThsdata().addAll((Collection<? extends ThsdataType>)newValue);
				return;
			case BtsauxPackage.STUPID_XML_TYPE__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends AuthorsType>)newValue);
				return;
			case BtsauxPackage.STUPID_XML_TYPE__BWLENGL:
				getBwlengl().clear();
				getBwlengl().addAll((Collection<? extends BwlenglType>)newValue);
				return;
			case BtsauxPackage.STUPID_XML_TYPE__BWLLINK:
				getBwllink().clear();
				getBwllink().addAll((Collection<? extends BwllinkType>)newValue);
				return;
			case BtsauxPackage.STUPID_XML_TYPE__BWLLIST:
				getBwllist().clear();
				getBwllist().addAll((Collection<? extends BwllistType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BtsauxPackage.STUPID_XML_TYPE__GROUP:
				getGroup().clear();
				return;
			case BtsauxPackage.STUPID_XML_TYPE__THSDATA:
				getThsdata().clear();
				return;
			case BtsauxPackage.STUPID_XML_TYPE__AUTHORS:
				getAuthors().clear();
				return;
			case BtsauxPackage.STUPID_XML_TYPE__BWLENGL:
				getBwlengl().clear();
				return;
			case BtsauxPackage.STUPID_XML_TYPE__BWLLINK:
				getBwllink().clear();
				return;
			case BtsauxPackage.STUPID_XML_TYPE__BWLLIST:
				getBwllist().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BtsauxPackage.STUPID_XML_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case BtsauxPackage.STUPID_XML_TYPE__THSDATA:
				return !getThsdata().isEmpty();
			case BtsauxPackage.STUPID_XML_TYPE__AUTHORS:
				return !getAuthors().isEmpty();
			case BtsauxPackage.STUPID_XML_TYPE__BWLENGL:
				return !getBwlengl().isEmpty();
			case BtsauxPackage.STUPID_XML_TYPE__BWLLINK:
				return !getBwllink().isEmpty();
			case BtsauxPackage.STUPID_XML_TYPE__BWLLIST:
				return !getBwllist().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //StupidXMLTypeImpl
