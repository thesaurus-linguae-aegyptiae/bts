/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Passport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getWbSlips <em>Wb Slips</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getWbFolder <em>Wb Folder</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getPassportEntries <em>Passport Entries</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSPassportImpl extends MinimalEObjectImpl.Container implements BTSPassport {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBibliography() <em>Bibliography</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliography()
	 * @generated
	 * @ordered
	 */
	protected static final String BIBLIOGRAPHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBibliography() <em>Bibliography</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliography()
	 * @generated
	 * @ordered
	 */
	protected String bibliography = BIBLIOGRAPHY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected BTSTimespan date;

	/**
	 * The default value of the '{@link #getWbSlips() <em>Wb Slips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWbSlips()
	 * @generated
	 * @ordered
	 */
	protected static final String WB_SLIPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWbSlips() <em>Wb Slips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWbSlips()
	 * @generated
	 * @ordered
	 */
	protected String wbSlips = WB_SLIPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWbFolder() <em>Wb Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWbFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String WB_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWbFolder() <em>Wb Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWbFolder()
	 * @generated
	 * @ordered
	 */
	protected String wbFolder = WB_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvenance() <em>Provenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVENANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvenance() <em>Provenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected String provenance = PROVENANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassportEntries() <em>Passport Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSPassportEntry> passportEntries;

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
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSTranslations> descriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSPassportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.BTS_PASSPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBibliography() {
		return bibliography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliography(String newBibliography) {
		String oldBibliography = bibliography;
		bibliography = newBibliography;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT__BIBLIOGRAPHY, oldBibliography, bibliography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTimespan getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(BTSTimespan newDate, NotificationChain msgs) {
		BTSTimespan oldDate = date;
		date = newDate;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(BTSTimespan newDate) {
		if (newDate != date)
		{
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PASSPORT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsmodelPackage.BTS_PASSPORT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWbSlips() {
		return wbSlips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWbSlips(String newWbSlips) {
		String oldWbSlips = wbSlips;
		wbSlips = newWbSlips;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT__WB_SLIPS, oldWbSlips, wbSlips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWbFolder() {
		return wbFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWbFolder(String newWbFolder) {
		String oldWbFolder = wbFolder;
		wbFolder = newWbFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT__WB_FOLDER, oldWbFolder, wbFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvenance() {
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvenance(String newProvenance) {
		String oldProvenance = provenance;
		provenance = newProvenance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT__PROVENANCE, oldProvenance, provenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSPassportEntry> getPassportEntries() {
		if (passportEntries == null)
		{
			passportEntries = new EObjectContainmentEList<BTSPassportEntry>(BTSPassportEntry.class, this, BtsmodelPackage.BTS_PASSPORT__PASSPORT_ENTRIES);
		}
		return passportEntries;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_PASSPORT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSTranslations> getDescriptions() {
		if (descriptions == null)
		{
			descriptions = new EObjectContainmentEList<BTSTranslations>(BTSTranslations.class, this, BtsmodelPackage.BTS_PASSPORT__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PASSPORT__DATE:
				return basicSetDate(null, msgs);
			case BtsmodelPackage.BTS_PASSPORT__PASSPORT_ENTRIES:
				return ((InternalEList<?>)getPassportEntries()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_PASSPORT__DESCRIPTIONS:
				return ((InternalEList<?>)getDescriptions()).basicRemove(otherEnd, msgs);
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PASSPORT__PROTOCOL:
				return getProtocol();
			case BtsmodelPackage.BTS_PASSPORT__BIBLIOGRAPHY:
				return getBibliography();
			case BtsmodelPackage.BTS_PASSPORT__DATE:
				return getDate();
			case BtsmodelPackage.BTS_PASSPORT__WB_SLIPS:
				return getWbSlips();
			case BtsmodelPackage.BTS_PASSPORT__WB_FOLDER:
				return getWbFolder();
			case BtsmodelPackage.BTS_PASSPORT__PROVENANCE:
				return getProvenance();
			case BtsmodelPackage.BTS_PASSPORT__PASSPORT_ENTRIES:
				return getPassportEntries();
			case BtsmodelPackage.BTS_PASSPORT__COMMENT:
				return getComment();
			case BtsmodelPackage.BTS_PASSPORT__DESCRIPTIONS:
				return getDescriptions();
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PASSPORT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT__BIBLIOGRAPHY:
				setBibliography((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT__DATE:
				setDate((BTSTimespan)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT__WB_SLIPS:
				setWbSlips((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT__WB_FOLDER:
				setWbFolder((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT__PROVENANCE:
				setProvenance((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT__PASSPORT_ENTRIES:
				getPassportEntries().clear();
				getPassportEntries().addAll((Collection<? extends BTSPassportEntry>)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT__COMMENT:
				setComment((String)newValue);
				return;
			case BtsmodelPackage.BTS_PASSPORT__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends BTSTranslations>)newValue);
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PASSPORT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT__BIBLIOGRAPHY:
				setBibliography(BIBLIOGRAPHY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT__DATE:
				setDate((BTSTimespan)null);
				return;
			case BtsmodelPackage.BTS_PASSPORT__WB_SLIPS:
				setWbSlips(WB_SLIPS_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT__WB_FOLDER:
				setWbFolder(WB_FOLDER_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT__PROVENANCE:
				setProvenance(PROVENANCE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT__PASSPORT_ENTRIES:
				getPassportEntries().clear();
				return;
			case BtsmodelPackage.BTS_PASSPORT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_PASSPORT__DESCRIPTIONS:
				getDescriptions().clear();
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
		switch (featureID)
		{
			case BtsmodelPackage.BTS_PASSPORT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case BtsmodelPackage.BTS_PASSPORT__BIBLIOGRAPHY:
				return BIBLIOGRAPHY_EDEFAULT == null ? bibliography != null : !BIBLIOGRAPHY_EDEFAULT.equals(bibliography);
			case BtsmodelPackage.BTS_PASSPORT__DATE:
				return date != null;
			case BtsmodelPackage.BTS_PASSPORT__WB_SLIPS:
				return WB_SLIPS_EDEFAULT == null ? wbSlips != null : !WB_SLIPS_EDEFAULT.equals(wbSlips);
			case BtsmodelPackage.BTS_PASSPORT__WB_FOLDER:
				return WB_FOLDER_EDEFAULT == null ? wbFolder != null : !WB_FOLDER_EDEFAULT.equals(wbFolder);
			case BtsmodelPackage.BTS_PASSPORT__PROVENANCE:
				return PROVENANCE_EDEFAULT == null ? provenance != null : !PROVENANCE_EDEFAULT.equals(provenance);
			case BtsmodelPackage.BTS_PASSPORT__PASSPORT_ENTRIES:
				return passportEntries != null && !passportEntries.isEmpty();
			case BtsmodelPackage.BTS_PASSPORT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BtsmodelPackage.BTS_PASSPORT__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", bibliography: ");
		result.append(bibliography);
		result.append(", wbSlips: ");
		result.append(wbSlips);
		result.append(", wbFolder: ");
		result.append(wbFolder);
		result.append(", provenance: ");
		result.append(provenance);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //BTSPassportImpl
