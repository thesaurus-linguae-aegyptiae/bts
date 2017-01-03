/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.TCArrangementType;
import CorpusDTDneu.TCCaptionType;
import CorpusDTDneu.TCGroupType;
import CorpusDTDneu.TCObjectType;
import CorpusDTDneu.TCPassportType;
import CorpusDTDneu.TCPictureType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TC Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getTCPassport <em>TC Passport</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getTCPicture <em>TC Picture</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getTCNotebook <em>TC Notebook</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getTCCaption <em>TC Caption</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getTCGroup <em>TC Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getTCArrangement <em>TC Arrangement</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getTCObject <em>TC Object</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCGroupTypeImpl#getTCName <em>TC Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCGroupTypeImpl extends MinimalEObjectImpl.Container implements TCGroupType {
	/**
	 * The cached value of the '{@link #getTCPassport() <em>TC Passport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCPassport()
	 * @generated
	 * @ordered
	 */
	protected TCPassportType tCPassport;

	/**
	 * The cached value of the '{@link #getTCPicture() <em>TC Picture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCPicture()
	 * @generated
	 * @ordered
	 */
	protected EList<TCPictureType> tCPicture;

	/**
	 * The cached value of the '{@link #getTCNotebook() <em>TC Notebook</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCNotebook()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tCNotebook;

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
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Object author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object SORT_KEY_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected Object sortKey = SORT_KEY_EDEFAULT;

	/**
	 * This is true if the Sort Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortKeyESet;

	/**
	 * The default value of the '{@link #getTCName() <em>TC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCName()
	 * @generated
	 * @ordered
	 */
	protected static final Object TC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTCName() <em>TC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCName()
	 * @generated
	 * @ordered
	 */
	protected Object tCName = TC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.TC_GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCPassportType getTCPassport() {
		return tCPassport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCPassport(TCPassportType newTCPassport, NotificationChain msgs) {
		TCPassportType oldTCPassport = tCPassport;
		tCPassport = newTCPassport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT, oldTCPassport, newTCPassport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCPassport(TCPassportType newTCPassport) {
		if (newTCPassport != tCPassport) {
			NotificationChain msgs = null;
			if (tCPassport != null)
				msgs = ((InternalEObject)tCPassport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT, null, msgs);
			if (newTCPassport != null)
				msgs = ((InternalEObject)newTCPassport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT, null, msgs);
			msgs = basicSetTCPassport(newTCPassport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT, newTCPassport, newTCPassport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCPictureType> getTCPicture() {
		if (tCPicture == null) {
			tCPicture = new EObjectContainmentEList<TCPictureType>(TCPictureType.class, this, CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PICTURE);
		}
		return tCPicture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTCNotebook() {
		if (tCNotebook == null) {
			tCNotebook = new EDataTypeEList<String>(String.class, this, CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NOTEBOOK);
		}
		return tCNotebook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorpusDTDneuPackage.TC_GROUP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCCaptionType> getTCCaption() {
		return getGroup().list(CorpusDTDneuPackage.Literals.TC_GROUP_TYPE__TC_CAPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCGroupType> getTCGroup() {
		return getGroup().list(CorpusDTDneuPackage.Literals.TC_GROUP_TYPE__TC_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCArrangementType> getTCArrangement() {
		return getGroup().list(CorpusDTDneuPackage.Literals.TC_GROUP_TYPE__TC_ARRANGEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCObjectType> getTCObject() {
		return getGroup().list(CorpusDTDneuPackage.Literals.TC_GROUP_TYPE__TC_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Object newAuthor) {
		Object oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_GROUP_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(Object newSortKey) {
		Object oldSortKey = sortKey;
		sortKey = newSortKey;
		boolean oldSortKeyESet = sortKeyESet;
		sortKeyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_GROUP_TYPE__SORT_KEY, oldSortKey, sortKey, !oldSortKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSortKey() {
		Object oldSortKey = sortKey;
		boolean oldSortKeyESet = sortKeyESet;
		sortKey = SORT_KEY_EDEFAULT;
		sortKeyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.TC_GROUP_TYPE__SORT_KEY, oldSortKey, SORT_KEY_EDEFAULT, oldSortKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSortKey() {
		return sortKeyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTCName() {
		return tCName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCName(Object newTCName) {
		Object oldTCName = tCName;
		tCName = newTCName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NAME, oldTCName, tCName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT:
				return basicSetTCPassport(null, msgs);
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PICTURE:
				return ((InternalEList<?>)getTCPicture()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.TC_GROUP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_CAPTION:
				return ((InternalEList<?>)getTCCaption()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_GROUP:
				return ((InternalEList<?>)getTCGroup()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_ARRANGEMENT:
				return ((InternalEList<?>)getTCArrangement()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_OBJECT:
				return ((InternalEList<?>)getTCObject()).basicRemove(otherEnd, msgs);
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
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT:
				return getTCPassport();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PICTURE:
				return getTCPicture();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NOTEBOOK:
				return getTCNotebook();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_CAPTION:
				return getTCCaption();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_GROUP:
				return getTCGroup();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_ARRANGEMENT:
				return getTCArrangement();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_OBJECT:
				return getTCObject();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__AUTHOR:
				return getAuthor();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__SORT_KEY:
				return getSortKey();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NAME:
				return getTCName();
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
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT:
				setTCPassport((TCPassportType)newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PICTURE:
				getTCPicture().clear();
				getTCPicture().addAll((Collection<? extends TCPictureType>)newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NOTEBOOK:
				getTCNotebook().clear();
				getTCNotebook().addAll((Collection<? extends String>)newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_CAPTION:
				getTCCaption().clear();
				getTCCaption().addAll((Collection<? extends TCCaptionType>)newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_GROUP:
				getTCGroup().clear();
				getTCGroup().addAll((Collection<? extends TCGroupType>)newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_ARRANGEMENT:
				getTCArrangement().clear();
				getTCArrangement().addAll((Collection<? extends TCArrangementType>)newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_OBJECT:
				getTCObject().clear();
				getTCObject().addAll((Collection<? extends TCObjectType>)newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__AUTHOR:
				setAuthor(newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__SORT_KEY:
				setSortKey(newValue);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NAME:
				setTCName(newValue);
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
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT:
				setTCPassport((TCPassportType)null);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PICTURE:
				getTCPicture().clear();
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NOTEBOOK:
				getTCNotebook().clear();
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_CAPTION:
				getTCCaption().clear();
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_GROUP:
				getTCGroup().clear();
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_ARRANGEMENT:
				getTCArrangement().clear();
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_OBJECT:
				getTCObject().clear();
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__SORT_KEY:
				unsetSortKey();
				return;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NAME:
				setTCName(TC_NAME_EDEFAULT);
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
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PASSPORT:
				return tCPassport != null;
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_PICTURE:
				return tCPicture != null && !tCPicture.isEmpty();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NOTEBOOK:
				return tCNotebook != null && !tCNotebook.isEmpty();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_CAPTION:
				return !getTCCaption().isEmpty();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_GROUP:
				return !getTCGroup().isEmpty();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_ARRANGEMENT:
				return !getTCArrangement().isEmpty();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_OBJECT:
				return !getTCObject().isEmpty();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CorpusDTDneuPackage.TC_GROUP_TYPE__SORT_KEY:
				return isSetSortKey();
			case CorpusDTDneuPackage.TC_GROUP_TYPE__TC_NAME:
				return TC_NAME_EDEFAULT == null ? tCName != null : !TC_NAME_EDEFAULT.equals(tCName);
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
		result.append(" (tCNotebook: ");
		result.append(tCNotebook);
		result.append(", group: ");
		result.append(group);
		result.append(", author: ");
		result.append(author);
		result.append(", sortKey: ");
		if (sortKeyESet) result.append(sortKey); else result.append("<unset>");
		result.append(", tCName: ");
		result.append(tCName);
		result.append(')');
		return result.toString();
	}

} //TCGroupTypeImpl
