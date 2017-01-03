/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgySentType;
import CorpusDTDneu.EgySubTxtType;
import CorpusDTDneu.EgySzenarioType;
import CorpusDTDneu.EgyTB1Type;
import CorpusDTDneu.EgyTB3EndType;
import CorpusDTDneu.EgyTB3StartType;
import CorpusDTDneu.GlosseType;

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
 * An implementation of the model object '<em><b>Egy Sub Txt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getEgySubTxt <em>Egy Sub Txt</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getEgyTB1 <em>Egy TB1</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getEgySzenario <em>Egy Szenario</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getGlosse <em>Glosse</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getEgyTB3End <em>Egy TB3 End</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySubTxtTypeImpl#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EgySubTxtTypeImpl extends MinimalEObjectImpl.Container implements EgySubTxtType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBtsCodes() <em>Bts Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtsCodes()
	 * @generated
	 * @ordered
	 */
	protected static final String BTS_CODES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtsCodes() <em>Bts Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtsCodes()
	 * @generated
	 * @ordered
	 */
	protected String btsCodes = BTS_CODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

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
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected String sortKey = SORT_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EgySubTxtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.EGY_SUB_TXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtsCodes() {
		return btsCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtsCodes(String newBtsCodes) {
		String oldBtsCodes = btsCodes;
		btsCodes = newBtsCodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__BTS_CODES, oldBtsCodes, btsCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgySubTxtType> getEgySubTxt() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SUB_TXT_TYPE__EGY_SUB_TXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgySentType> getEgySent() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SUB_TXT_TYPE__EGY_SENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB1Type> getEgyTB1() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SUB_TXT_TYPE__EGY_TB1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgySzenarioType> getEgySzenario() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SUB_TXT_TYPE__EGY_SZENARIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlosseType> getGlosse() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SUB_TXT_TYPE__GLOSSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB3StartType> getEgyTB3Start() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SUB_TXT_TYPE__EGY_TB3_START);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB3EndType> getEgyTB3End() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SUB_TXT_TYPE__EGY_TB3_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(String newSortKey) {
		String oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SUB_TXT:
				return ((InternalEList<?>)getEgySubTxt()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SENT:
				return ((InternalEList<?>)getEgySent()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB1:
				return ((InternalEList<?>)getEgyTB1()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SZENARIO:
				return ((InternalEList<?>)getEgySzenario()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GLOSSE:
				return ((InternalEList<?>)getGlosse()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_START:
				return ((InternalEList<?>)getEgyTB3Start()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_END:
				return ((InternalEList<?>)getEgyTB3End()).basicRemove(otherEnd, msgs);
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
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__NAME:
				return getName();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__BTS_CODES:
				return getBtsCodes();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SUB_TXT:
				return getEgySubTxt();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SENT:
				return getEgySent();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB1:
				return getEgyTB1();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SZENARIO:
				return getEgySzenario();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GLOSSE:
				return getGlosse();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_START:
				return getEgyTB3Start();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_END:
				return getEgyTB3End();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__SORT_KEY:
				return getSortKey();
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
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__BTS_CODES:
				setBtsCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SUB_TXT:
				getEgySubTxt().clear();
				getEgySubTxt().addAll((Collection<? extends EgySubTxtType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SENT:
				getEgySent().clear();
				getEgySent().addAll((Collection<? extends EgySentType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB1:
				getEgyTB1().clear();
				getEgyTB1().addAll((Collection<? extends EgyTB1Type>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SZENARIO:
				getEgySzenario().clear();
				getEgySzenario().addAll((Collection<? extends EgySzenarioType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GLOSSE:
				getGlosse().clear();
				getGlosse().addAll((Collection<? extends GlosseType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_START:
				getEgyTB3Start().clear();
				getEgyTB3Start().addAll((Collection<? extends EgyTB3StartType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_END:
				getEgyTB3End().clear();
				getEgyTB3End().addAll((Collection<? extends EgyTB3EndType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__SORT_KEY:
				setSortKey((String)newValue);
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
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__BTS_CODES:
				setBtsCodes(BTS_CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SUB_TXT:
				getEgySubTxt().clear();
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SENT:
				getEgySent().clear();
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB1:
				getEgyTB1().clear();
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SZENARIO:
				getEgySzenario().clear();
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GLOSSE:
				getGlosse().clear();
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_START:
				getEgyTB3Start().clear();
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_END:
				getEgyTB3End().clear();
				return;
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
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
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__BTS_CODES:
				return BTS_CODES_EDEFAULT == null ? btsCodes != null : !BTS_CODES_EDEFAULT.equals(btsCodes);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SUB_TXT:
				return !getEgySubTxt().isEmpty();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SENT:
				return !getEgySent().isEmpty();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB1:
				return !getEgyTB1().isEmpty();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_SZENARIO:
				return !getEgySzenario().isEmpty();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__GLOSSE:
				return !getGlosse().isEmpty();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_START:
				return !getEgyTB3Start().isEmpty();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__EGY_TB3_END:
				return !getEgyTB3End().isEmpty();
			case CorpusDTDneuPackage.EGY_SUB_TXT_TYPE__SORT_KEY:
				return SORT_KEY_EDEFAULT == null ? sortKey != null : !SORT_KEY_EDEFAULT.equals(sortKey);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", btsCodes: ");
		result.append(btsCodes);
		result.append(", comment: ");
		result.append(comment);
		result.append(", group: ");
		result.append(group);
		result.append(", SortKey: ");
		result.append(sortKey);
		result.append(')');
		return result.toString();
	}

} //EgySubTxtTypeImpl
