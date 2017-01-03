/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgyTxtCorpusType;
import CorpusDTDneu.EgyTxtType;
import CorpusDTDneu.PicturesTableType;
import CorpusDTDneu.TCArrangementType;
import CorpusDTDneu.TCCaptionType;
import CorpusDTDneu.TCGroupType;
import CorpusDTDneu.TCHeaderType;
import CorpusDTDneu.TCObjPartType;
import CorpusDTDneu.TCObjectType;
import CorpusDTDneu.TCSceneType;
import CorpusDTDneu.TCTextType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Egy Txt Corpus Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getTCHeader <em>TC Header</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getPicturesTable <em>Pictures Table</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getTCCaption <em>TC Caption</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getTCGroup <em>TC Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getTCArrangement <em>TC Arrangement</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getTCObject <em>TC Object</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getTCObjPart <em>TC Obj Part</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getTCScene <em>TC Scene</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getTCText <em>TC Text</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getEgyTxt <em>Egy Txt</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyTxtCorpusTypeImpl#getDTDVersion <em>DTD Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EgyTxtCorpusTypeImpl extends MinimalEObjectImpl.Container implements EgyTxtCorpusType {
	/**
	 * The cached value of the '{@link #getTCHeader() <em>TC Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCHeader()
	 * @generated
	 * @ordered
	 */
	protected TCHeaderType tCHeader;

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
	 * The default value of the '{@link #getDTDVersion() <em>DTD Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTDVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Object DTD_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDTDVersion() <em>DTD Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTDVersion()
	 * @generated
	 * @ordered
	 */
	protected Object dTDVersion = DTD_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EgyTxtCorpusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCHeaderType getTCHeader() {
		return tCHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCHeader(TCHeaderType newTCHeader, NotificationChain msgs) {
		TCHeaderType oldTCHeader = tCHeader;
		tCHeader = newTCHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER, oldTCHeader, newTCHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCHeader(TCHeaderType newTCHeader) {
		if (newTCHeader != tCHeader) {
			NotificationChain msgs = null;
			if (tCHeader != null)
				msgs = ((InternalEObject)tCHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER, null, msgs);
			if (newTCHeader != null)
				msgs = ((InternalEObject)newTCHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER, null, msgs);
			msgs = basicSetTCHeader(newTCHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER, newTCHeader, newTCHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PicturesTableType> getPicturesTable() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__PICTURES_TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCCaptionType> getTCCaption() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__TC_CAPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCGroupType> getTCGroup() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__TC_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCArrangementType> getTCArrangement() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCObjectType> getTCObject() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__TC_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCObjPartType> getTCObjPart() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__TC_OBJ_PART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCSceneType> getTCScene() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__TC_SCENE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCTextType> getTCText() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__TC_TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTxtType> getEgyTxt() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_TXT_CORPUS_TYPE__EGY_TXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDTDVersion() {
		return dTDVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDTDVersion(Object newDTDVersion) {
		Object oldDTDVersion = dTDVersion;
		dTDVersion = newDTDVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__DTD_VERSION, oldDTDVersion, dTDVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER:
				return basicSetTCHeader(null, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__PICTURES_TABLE:
				return ((InternalEList<?>)getPicturesTable()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_CAPTION:
				return ((InternalEList<?>)getTCCaption()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_GROUP:
				return ((InternalEList<?>)getTCGroup()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT:
				return ((InternalEList<?>)getTCArrangement()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJECT:
				return ((InternalEList<?>)getTCObject()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJ_PART:
				return ((InternalEList<?>)getTCObjPart()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_SCENE:
				return ((InternalEList<?>)getTCScene()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_TEXT:
				return ((InternalEList<?>)getTCText()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__EGY_TXT:
				return ((InternalEList<?>)getEgyTxt()).basicRemove(otherEnd, msgs);
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
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER:
				return getTCHeader();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__PICTURES_TABLE:
				return getPicturesTable();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_CAPTION:
				return getTCCaption();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_GROUP:
				return getTCGroup();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT:
				return getTCArrangement();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJECT:
				return getTCObject();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJ_PART:
				return getTCObjPart();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_SCENE:
				return getTCScene();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_TEXT:
				return getTCText();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__EGY_TXT:
				return getEgyTxt();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__DTD_VERSION:
				return getDTDVersion();
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
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER:
				setTCHeader((TCHeaderType)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__PICTURES_TABLE:
				getPicturesTable().clear();
				getPicturesTable().addAll((Collection<? extends PicturesTableType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_CAPTION:
				getTCCaption().clear();
				getTCCaption().addAll((Collection<? extends TCCaptionType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_GROUP:
				getTCGroup().clear();
				getTCGroup().addAll((Collection<? extends TCGroupType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT:
				getTCArrangement().clear();
				getTCArrangement().addAll((Collection<? extends TCArrangementType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJECT:
				getTCObject().clear();
				getTCObject().addAll((Collection<? extends TCObjectType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJ_PART:
				getTCObjPart().clear();
				getTCObjPart().addAll((Collection<? extends TCObjPartType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_SCENE:
				getTCScene().clear();
				getTCScene().addAll((Collection<? extends TCSceneType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_TEXT:
				getTCText().clear();
				getTCText().addAll((Collection<? extends TCTextType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__EGY_TXT:
				getEgyTxt().clear();
				getEgyTxt().addAll((Collection<? extends EgyTxtType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__DTD_VERSION:
				setDTDVersion(newValue);
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
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER:
				setTCHeader((TCHeaderType)null);
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__PICTURES_TABLE:
				getPicturesTable().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_CAPTION:
				getTCCaption().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_GROUP:
				getTCGroup().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT:
				getTCArrangement().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJECT:
				getTCObject().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJ_PART:
				getTCObjPart().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_SCENE:
				getTCScene().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_TEXT:
				getTCText().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__EGY_TXT:
				getEgyTxt().clear();
				return;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__DTD_VERSION:
				setDTDVersion(DTD_VERSION_EDEFAULT);
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
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_HEADER:
				return tCHeader != null;
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__PICTURES_TABLE:
				return !getPicturesTable().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_CAPTION:
				return !getTCCaption().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_GROUP:
				return !getTCGroup().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_ARRANGEMENT:
				return !getTCArrangement().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJECT:
				return !getTCObject().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_OBJ_PART:
				return !getTCObjPart().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_SCENE:
				return !getTCScene().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__TC_TEXT:
				return !getTCText().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__EGY_TXT:
				return !getEgyTxt().isEmpty();
			case CorpusDTDneuPackage.EGY_TXT_CORPUS_TYPE__DTD_VERSION:
				return DTD_VERSION_EDEFAULT == null ? dTDVersion != null : !DTD_VERSION_EDEFAULT.equals(dTDVersion);
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
		result.append(", dTDVersion: ");
		result.append(dTDVersion);
		result.append(')');
		return result.toString();
	}

} //EgyTxtCorpusTypeImpl
