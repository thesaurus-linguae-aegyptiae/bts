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
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Senctence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl#getState <em>State</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl#getRevisionState <em>Revision State</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl#getSentenceItems <em>Sentence Items</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl#getTranslation <em>Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSSenctenceImpl extends BTSIdentifiableItemImpl implements BTSSenctence {
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
	 * The cached value of the '{@link #getSentenceItems() <em>Sentence Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentenceItems()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSSentenceItem> sentenceItems;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected BTSTranslations translation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSSenctenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_SENCTENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_SENCTENCE__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_SENCTENCE__REVISION_STATE, oldRevisionState, revisionState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_SENCTENCE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRevisions() {
		if (revisions == null) {
			revisions = new EDataTypeUniqueEList<String>(String.class, this, BtsCorpusModelPackage.BTS_SENCTENCE__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSSentenceItem> getSentenceItems() {
		if (sentenceItems == null) {
			sentenceItems = new EObjectContainmentEList<BTSSentenceItem>(BTSSentenceItem.class, this, BtsCorpusModelPackage.BTS_SENCTENCE__SENTENCE_ITEMS);
		}
		return sentenceItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTranslations getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(BTSTranslations newTranslation, NotificationChain msgs) {
		BTSTranslations oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION, oldTranslation, newTranslation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(BTSTranslations newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION, newTranslation, newTranslation));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_SENCTENCE__SENTENCE_ITEMS:
				return ((InternalEList<?>)getSentenceItems()).basicRemove(otherEnd, msgs);
			case BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION:
				return basicSetTranslation(null, msgs);
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
			case BtsCorpusModelPackage.BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT:
				return getPropertyChangeSupport();
			case BtsCorpusModelPackage.BTS_SENCTENCE__STATE:
				return getState();
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISION_STATE:
				return getRevisionState();
			case BtsCorpusModelPackage.BTS_SENCTENCE__VISIBILITY:
				return getVisibility();
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISIONS:
				return getRevisions();
			case BtsCorpusModelPackage.BTS_SENCTENCE__SENTENCE_ITEMS:
				return getSentenceItems();
			case BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION:
				return getTranslation();
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
			case BtsCorpusModelPackage.BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((PropertyChangeSupport)newValue);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__STATE:
				setState((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISION_STATE:
				setRevisionState((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends String>)newValue);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__SENTENCE_ITEMS:
				getSentenceItems().clear();
				getSentenceItems().addAll((Collection<? extends BTSSentenceItem>)newValue);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION:
				setTranslation((BTSTranslations)newValue);
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
			case BtsCorpusModelPackage.BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISION_STATE:
				setRevisionState(REVISION_STATE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISIONS:
				getRevisions().clear();
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__SENTENCE_ITEMS:
				getSentenceItems().clear();
				return;
			case BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION:
				setTranslation((BTSTranslations)null);
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
			case BtsCorpusModelPackage.BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT:
				return PROPERTY_CHANGE_SUPPORT_EDEFAULT == null ? propertyChangeSupport != null : !PROPERTY_CHANGE_SUPPORT_EDEFAULT.equals(propertyChangeSupport);
			case BtsCorpusModelPackage.BTS_SENCTENCE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISION_STATE:
				return REVISION_STATE_EDEFAULT == null ? revisionState != null : !REVISION_STATE_EDEFAULT.equals(revisionState);
			case BtsCorpusModelPackage.BTS_SENCTENCE__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case BtsCorpusModelPackage.BTS_SENCTENCE__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case BtsCorpusModelPackage.BTS_SENCTENCE__SENTENCE_ITEMS:
				return sentenceItems != null && !sentenceItems.isEmpty();
			case BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION:
				return translation != null;
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
				case BtsCorpusModelPackage.BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT: return BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (derivedFeatureID) {
				case BtsCorpusModelPackage.BTS_SENCTENCE__STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE;
				case BtsCorpusModelPackage.BTS_SENCTENCE__REVISION_STATE: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE;
				case BtsCorpusModelPackage.BTS_SENCTENCE__VISIBILITY: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY;
				case BtsCorpusModelPackage.BTS_SENCTENCE__REVISIONS: return BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS;
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
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT: return BtsCorpusModelPackage.BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE: return BtsCorpusModelPackage.BTS_SENCTENCE__STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE: return BtsCorpusModelPackage.BTS_SENCTENCE__REVISION_STATE;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__VISIBILITY: return BtsCorpusModelPackage.BTS_SENCTENCE__VISIBILITY;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__REVISIONS: return BtsCorpusModelPackage.BTS_SENCTENCE__REVISIONS;
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
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsCorpusModelPackage.BTS_SENCTENCE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				case BtsmodelPackage.BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER: return BtsCorpusModelPackage.BTS_SENCTENCE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;
				default: return -1;
			}
		}
		if (baseClass == AdministrativDataObject.class) {
			switch (baseOperationID) {
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__BTSREVISION: return BtsCorpusModelPackage.BTS_SENCTENCE___ADD_REVISION__BTSREVISION;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___ADD_REVISION__INT_DATE_STRING: return BtsCorpusModelPackage.BTS_SENCTENCE___ADD_REVISION__INT_DATE_STRING;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___GET_REVISION__INT: return BtsCorpusModelPackage.BTS_SENCTENCE___GET_REVISION__INT;
				case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT___GET_LAST_REVISION: return BtsCorpusModelPackage.BTS_SENCTENCE___GET_LAST_REVISION;
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
			case BtsCorpusModelPackage.BTS_SENCTENCE___ADD_REVISION__BTSREVISION:
				addRevision((BTSRevision)arguments.get(0));
				return null;
			case BtsCorpusModelPackage.BTS_SENCTENCE___ADD_REVISION__INT_DATE_STRING:
				addRevision((Integer)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
				return null;
			case BtsCorpusModelPackage.BTS_SENCTENCE___GET_REVISION__INT:
				return getRevision((Integer)arguments.get(0));
			case BtsCorpusModelPackage.BTS_SENCTENCE___GET_LAST_REVISION:
				return getLastRevision();
			case BtsCorpusModelPackage.BTS_SENCTENCE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
				addPropertyChangeListener((PropertyChangeListener)arguments.get(0));
				return null;
			case BtsCorpusModelPackage.BTS_SENCTENCE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER:
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

} //BTSSenctenceImpl
