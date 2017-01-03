/**
 */
package Btsaux.impl;

import Btsaux.AugroupsType;
import Btsaux.AuthorizationType;
import Btsaux.AuthorsType;
import Btsaux.BtsauxPackage;
import Btsaux.BwlenglType;
import Btsaux.BwllinkType;
import Btsaux.BwllistType;
import Btsaux.DocumentRoot;
import Btsaux.StupidXMLType;
import Btsaux.ThsdataType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getAugroups <em>Augroups</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getBwlengl <em>Bwlengl</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getBwllink <em>Bwllink</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getBwllist <em>Bwllist</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getStupidXML <em>Stupid XML</em>}</li>
 *   <li>{@link Btsaux.impl.DocumentRootImpl#getThsdata <em>Thsdata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsauxPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BtsauxPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BtsauxPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BtsauxPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AugroupsType getAugroups() {
		return (AugroupsType)getMixed().get(BtsauxPackage.Literals.DOCUMENT_ROOT__AUGROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAugroups(AugroupsType newAugroups, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BtsauxPackage.Literals.DOCUMENT_ROOT__AUGROUPS, newAugroups, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAugroups(AugroupsType newAugroups) {
		((FeatureMap.Internal)getMixed()).set(BtsauxPackage.Literals.DOCUMENT_ROOT__AUGROUPS, newAugroups);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationType getAuthorization() {
		return (AuthorizationType)getMixed().get(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorization(AuthorizationType newAuthorization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORIZATION, newAuthorization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(AuthorizationType newAuthorization) {
		((FeatureMap.Internal)getMixed()).set(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORIZATION, newAuthorization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorsType getAuthors() {
		return (AuthorsType)getMixed().get(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthors(AuthorsType newAuthors, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORS, newAuthors, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthors(AuthorsType newAuthors) {
		((FeatureMap.Internal)getMixed()).set(BtsauxPackage.Literals.DOCUMENT_ROOT__AUTHORS, newAuthors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BwlenglType getBwlengl() {
		return (BwlenglType)getMixed().get(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLENGL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBwlengl(BwlenglType newBwlengl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLENGL, newBwlengl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBwlengl(BwlenglType newBwlengl) {
		((FeatureMap.Internal)getMixed()).set(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLENGL, newBwlengl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BwllinkType getBwllink() {
		return (BwllinkType)getMixed().get(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBwllink(BwllinkType newBwllink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLINK, newBwllink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBwllink(BwllinkType newBwllink) {
		((FeatureMap.Internal)getMixed()).set(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLINK, newBwllink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BwllistType getBwllist() {
		return (BwllistType)getMixed().get(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBwllist(BwllistType newBwllist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLIST, newBwllist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBwllist(BwllistType newBwllist) {
		((FeatureMap.Internal)getMixed()).set(BtsauxPackage.Literals.DOCUMENT_ROOT__BWLLIST, newBwllist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StupidXMLType getStupidXML() {
		return (StupidXMLType)getMixed().get(BtsauxPackage.Literals.DOCUMENT_ROOT__STUPID_XML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStupidXML(StupidXMLType newStupidXML, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BtsauxPackage.Literals.DOCUMENT_ROOT__STUPID_XML, newStupidXML, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStupidXML(StupidXMLType newStupidXML) {
		((FeatureMap.Internal)getMixed()).set(BtsauxPackage.Literals.DOCUMENT_ROOT__STUPID_XML, newStupidXML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThsdataType getThsdata() {
		return (ThsdataType)getMixed().get(BtsauxPackage.Literals.DOCUMENT_ROOT__THSDATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThsdata(ThsdataType newThsdata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BtsauxPackage.Literals.DOCUMENT_ROOT__THSDATA, newThsdata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThsdata(ThsdataType newThsdata) {
		((FeatureMap.Internal)getMixed()).set(BtsauxPackage.Literals.DOCUMENT_ROOT__THSDATA, newThsdata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsauxPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__AUGROUPS:
				return basicSetAugroups(null, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORIZATION:
				return basicSetAuthorization(null, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORS:
				return basicSetAuthors(null, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__BWLENGL:
				return basicSetBwlengl(null, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__BWLLINK:
				return basicSetBwllink(null, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__BWLLIST:
				return basicSetBwllist(null, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__STUPID_XML:
				return basicSetStupidXML(null, msgs);
			case BtsauxPackage.DOCUMENT_ROOT__THSDATA:
				return basicSetThsdata(null, msgs);
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
			case BtsauxPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BtsauxPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case BtsauxPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case BtsauxPackage.DOCUMENT_ROOT__AUGROUPS:
				return getAugroups();
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORIZATION:
				return getAuthorization();
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORS:
				return getAuthors();
			case BtsauxPackage.DOCUMENT_ROOT__BWLENGL:
				return getBwlengl();
			case BtsauxPackage.DOCUMENT_ROOT__BWLLINK:
				return getBwllink();
			case BtsauxPackage.DOCUMENT_ROOT__BWLLIST:
				return getBwllist();
			case BtsauxPackage.DOCUMENT_ROOT__STUPID_XML:
				return getStupidXML();
			case BtsauxPackage.DOCUMENT_ROOT__THSDATA:
				return getThsdata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtsauxPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__AUGROUPS:
				setAugroups((AugroupsType)newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORIZATION:
				setAuthorization((AuthorizationType)newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORS:
				setAuthors((AuthorsType)newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__BWLENGL:
				setBwlengl((BwlenglType)newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__BWLLINK:
				setBwllink((BwllinkType)newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__BWLLIST:
				setBwllist((BwllistType)newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__STUPID_XML:
				setStupidXML((StupidXMLType)newValue);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__THSDATA:
				setThsdata((ThsdataType)newValue);
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
			case BtsauxPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case BtsauxPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case BtsauxPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case BtsauxPackage.DOCUMENT_ROOT__AUGROUPS:
				setAugroups((AugroupsType)null);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORIZATION:
				setAuthorization((AuthorizationType)null);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORS:
				setAuthors((AuthorsType)null);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__BWLENGL:
				setBwlengl((BwlenglType)null);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__BWLLINK:
				setBwllink((BwllinkType)null);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__BWLLIST:
				setBwllist((BwllistType)null);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__STUPID_XML:
				setStupidXML((StupidXMLType)null);
				return;
			case BtsauxPackage.DOCUMENT_ROOT__THSDATA:
				setThsdata((ThsdataType)null);
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
			case BtsauxPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BtsauxPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case BtsauxPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case BtsauxPackage.DOCUMENT_ROOT__AUGROUPS:
				return getAugroups() != null;
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORIZATION:
				return getAuthorization() != null;
			case BtsauxPackage.DOCUMENT_ROOT__AUTHORS:
				return getAuthors() != null;
			case BtsauxPackage.DOCUMENT_ROOT__BWLENGL:
				return getBwlengl() != null;
			case BtsauxPackage.DOCUMENT_ROOT__BWLLINK:
				return getBwllink() != null;
			case BtsauxPackage.DOCUMENT_ROOT__BWLLIST:
				return getBwllist() != null;
			case BtsauxPackage.DOCUMENT_ROOT__STUPID_XML:
				return getStupidXML() != null;
			case BtsauxPackage.DOCUMENT_ROOT__THSDATA:
				return getThsdata() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
