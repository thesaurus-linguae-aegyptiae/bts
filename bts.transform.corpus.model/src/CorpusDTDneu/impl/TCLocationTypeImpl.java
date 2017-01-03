/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.TCLocationType;
import CorpusDTDneu.ThsEntryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TC Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.TCLocationTypeImpl#getThsEntry <em>Ths Entry</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCLocationTypeImpl#getMuseumNumber <em>Museum Number</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCLocationTypeImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCLocationTypeImpl extends MinimalEObjectImpl.Container implements TCLocationType {
	/**
	 * The cached value of the '{@link #getThsEntry() <em>Ths Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThsEntry()
	 * @generated
	 * @ordered
	 */
	protected ThsEntryType thsEntry;

	/**
	 * The default value of the '{@link #getMuseumNumber() <em>Museum Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuseumNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MUSEUM_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMuseumNumber() <em>Museum Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuseumNumber()
	 * @generated
	 * @ordered
	 */
	protected String museumNumber = MUSEUM_NUMBER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCLocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.TC_LOCATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThsEntryType getThsEntry() {
		return thsEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThsEntry(ThsEntryType newThsEntry, NotificationChain msgs) {
		ThsEntryType oldThsEntry = thsEntry;
		thsEntry = newThsEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY, oldThsEntry, newThsEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThsEntry(ThsEntryType newThsEntry) {
		if (newThsEntry != thsEntry) {
			NotificationChain msgs = null;
			if (thsEntry != null)
				msgs = ((InternalEObject)thsEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY, null, msgs);
			if (newThsEntry != null)
				msgs = ((InternalEObject)newThsEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY, null, msgs);
			msgs = basicSetThsEntry(newThsEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY, newThsEntry, newThsEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMuseumNumber() {
		return museumNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuseumNumber(String newMuseumNumber) {
		String oldMuseumNumber = museumNumber;
		museumNumber = newMuseumNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_LOCATION_TYPE__MUSEUM_NUMBER, oldMuseumNumber, museumNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_LOCATION_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY:
				return basicSetThsEntry(null, msgs);
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
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY:
				return getThsEntry();
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__MUSEUM_NUMBER:
				return getMuseumNumber();
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__COMMENT:
				return getComment();
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
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY:
				setThsEntry((ThsEntryType)newValue);
				return;
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__MUSEUM_NUMBER:
				setMuseumNumber((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__COMMENT:
				setComment((String)newValue);
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
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY:
				setThsEntry((ThsEntryType)null);
				return;
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__MUSEUM_NUMBER:
				setMuseumNumber(MUSEUM_NUMBER_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__THS_ENTRY:
				return thsEntry != null;
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__MUSEUM_NUMBER:
				return MUSEUM_NUMBER_EDEFAULT == null ? museumNumber != null : !MUSEUM_NUMBER_EDEFAULT.equals(museumNumber);
			case CorpusDTDneuPackage.TC_LOCATION_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		result.append(" (museumNumber: ");
		result.append(museumNumber);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //TCLocationTypeImpl
