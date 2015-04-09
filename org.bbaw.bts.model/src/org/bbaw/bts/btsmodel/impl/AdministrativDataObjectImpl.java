/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrativ Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl#get_id <em>id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl#getState <em>State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl#getRevisionState <em>Revision State</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl#getRevisions <em>Revisions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AdministrativDataObjectImpl extends BTSObservableObjectImpl implements AdministrativDataObject {
	/**
	 * The default value of the '{@link #get_id() <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_id() <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_id()
	 * @generated
	 * @ordered
	 */
	protected String _id = _ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionState() <em>Revision State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionState()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionState() <em>Revision State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionState()
	 * @generated
	 * @ordered
	 */
	protected String revisionState = REVISION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> revisions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrativDataObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_id(String new_id) {
		String old_id = _id;
		_id = new_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__ID, old_id, _id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRevisions() {
		if (revisions == null) {
			revisions = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public void addRevision(BTSRevision revision) {
		String rev = revision.toRevisionString();
		getRevisions().add(rev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public void addRevision(int rev, Date timestamp, String userId) {
		BTSRevision revision = BtsmodelFactory.eINSTANCE.createBTSRevision(rev, timestamp, userId);
		addRevision(revision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public BTSRevision getRevision(int revisionIndex) {
		if (revisionIndex >= getRevisions().size()) return null;
		String rev = getRevisions().get(revisionIndex);
		BTSRevision revision = BtsmodelFactory.eINSTANCE.createBTSRevision(rev);
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public BTSRevision getLastRevision() {
		if (getRevisions().size() == 0) return null;
		String rev = getRevisions().get(getRevisions().size() -1);
		BTSRevision revision = BtsmodelFactory.eINSTANCE.createBTSRevision(rev);
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevisionState() {
		return revisionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionState(String newRevisionState) {
		String oldRevisionState = revisionState;
		revisionState = newRevisionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE, oldRevisionState, revisionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__ID:
				return get_id();
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE:
				return getState();
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE:
				return getRevisionState();
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY:
				return getVisibility();
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS:
				return getRevisions();
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
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__ID:
				set_id((String)newValue);
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE:
				setState((String)newValue);
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE:
				setRevisionState((String)newValue);
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends String>)newValue);
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
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__ID:
				set_id(_ID_EDEFAULT);
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE:
				setRevisionState(REVISION_STATE_EDEFAULT);
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS:
				getRevisions().clear();
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
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__ID:
				return _ID_EDEFAULT == null ? _id != null : !_ID_EDEFAULT.equals(_id);
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE:
				return REVISION_STATE_EDEFAULT == null ? revisionState != null : !REVISION_STATE_EDEFAULT.equals(revisionState);
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS:
				return revisions != null && !revisions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BTSIdentifiableItem.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__ID: return BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BTSIdentifiableItem.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__BTSREVISION:
				addRevision((BTSRevision)arguments.get(0));
				return null;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__INT_DATE_STRING:
				addRevision((Integer)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
				return null;
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___GET_REVISION__INT:
				return getRevision((Integer)arguments.get(0));
			case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___GET_LAST_REVISION:
				return getLastRevision();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (_id: ");
		result.append(_id);
		result.append(", state: ");
		result.append(state);
		result.append(", revisionState: ");
		result.append(revisionState);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", revisions: ");
		result.append(revisions);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object object) {
		if (this instanceof BTSDBBaseObject
				&& object instanceof BTSDBBaseObject) {
			BTSDBBaseObject o = (BTSDBBaseObject) object;
			if (o.get_id() == null || this.get_id() == null) {
				return false;
			} else if (this.get_id().equals(o.get_id())) {
				if (((BTSDBBaseObject) this).get_rev() != null) {
					return ((BTSDBBaseObject) this).get_rev().equals(
							((BTSDBBaseObject) o).get_rev());
				}
				return (((BTSDBBaseObject) o).get_rev() == null);
			}
		} else if (object instanceof BTSIdentifiableItem && get_id() != null) {
			return get_id().equals(((BTSIdentifiableItem) object).get_id());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		if (_id != null)
		{
			return _id.hashCode();
		}
		return super.hashCode();
	}
} //AdministrativDataObjectImpl
