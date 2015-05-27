/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Text Sentence Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl#getState <em>State</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl#getRevisionState <em>Revision State</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl#getRevisions <em>Revisions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSTextSentenceItemImpl extends BTSIdentifiableItemImpl implements BTSTextSentenceItem {
	/**
	 * The default value of the '{@link #getPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyChangeSupport PROPERTY_CHANGE_SUPPORT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected PropertyChangeSupport propertyChangeSupport = PROPERTY_CHANGE_SUPPORT_EDEFAULT;
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
	protected BTSTextSentenceItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_TEXT_SENTENCE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyChangeSupport getPropertyChangeSupport() {
		return propertyChangeSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyChangeSupport(PropertyChangeSupport newPropertyChangeSupport) {
		PropertyChangeSupport oldPropertyChangeSupport = propertyChangeSupport;
		propertyChangeSupport = newPropertyChangeSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISION_STATE, oldRevisionState, revisionState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRevisions() {
		if (revisions == null) {
			revisions = new EDataTypeUniqueEList<String>(String.class, this, BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRevision(BTSRevision revision) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRevision(int rev, Date timestamp, String userId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSRevision getRevision(int revisionIndex) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSRevision getLastRevision() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT:
				return getPropertyChangeSupport();
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__STATE:
				return getState();
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISION_STATE:
				return getRevisionState();
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__VISIBILITY:
				return getVisibility();
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISIONS:
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
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((PropertyChangeSupport)newValue);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__STATE:
				setState((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISION_STATE:
				setRevisionState((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISIONS:
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
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__STATE:
				setState(STATE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISION_STATE:
				setRevisionState(REVISION_STATE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISIONS:
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
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT:
				return PROPERTY_CHANGE_SUPPORT_EDEFAULT == null ? propertyChangeSupport != null : !PROPERTY_CHANGE_SUPPORT_EDEFAULT.equals(propertyChangeSupport);
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISION_STATE:
				return REVISION_STATE_EDEFAULT == null ? revisionState != null : !REVISION_STATE_EDEFAULT.equals(revisionState);
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISIONS:
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
		if (baseClass == BTSObservableObject.class) {
			switch (derivedFeatureID) {
				case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (derivedFeatureID) {
				case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE;
				case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISION_STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE;
				case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__VISIBILITY: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY;
				case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISIONS: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS;
				default: return -1;
			}
		}
		if (baseClass == BTSTextItems.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == BTSObservableObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISION_STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__VISIBILITY;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM__REVISIONS;
				default: return -1;
			}
		}
		if (baseClass == BTSTextItems.class) {
			switch (baseFeatureID) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BTSObservableObject.class) {
			switch (baseOperationID) {
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (baseOperationID) {
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__BTSREVISION: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___ADD_REVISION__BTSREVISION;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__INT_DATE_STRING: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___ADD_REVISION__INT_DATE_STRING;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___GET_REVISION__INT: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___GET_REVISION__INT;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___GET_LAST_REVISION: return BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___GET_LAST_REVISION;
				default: return -1;
			}
		}
		if (baseClass == BTSTextItems.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___ADD_REVISION__BTSREVISION:
				addRevision((BTSRevision)arguments.get(0));
				return null;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___ADD_REVISION__INT_DATE_STRING:
				addRevision((Integer)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
				return null;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___GET_REVISION__INT:
				return getRevision((Integer)arguments.get(0));
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___GET_LAST_REVISION:
				return getLastRevision();
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				addPropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
			case BtsCorpusModelPackage.BTS_TEXT_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				removePropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
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
		result.append(" (propertyChangeSupport: ");
		result.append(propertyChangeSupport);
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

} //BTSTextSentenceItemImpl
