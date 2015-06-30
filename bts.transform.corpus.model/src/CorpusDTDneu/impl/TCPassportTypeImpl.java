/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.DateType;
import CorpusDTDneu.LineCountType;
import CorpusDTDneu.PassportDataItem;
import CorpusDTDneu.TCLocationType;
import CorpusDTDneu.TCPassportType;
import CorpusDTDneu.WorkType;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>TC Passport Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getDepiction <em>Depiction</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getLangComment <em>Lang Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getWork <em>Work</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getTextType <em>Text Type</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getCodes <em>Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getWbFolder <em>Wb Folder</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getWbSlips <em>Wb Slips</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getCode1 <em>Code1</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getCode2 <em>Code2</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getNameSort <em>Name Sort</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.TCPassportTypeImpl#getTCLocation <em>TC Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCPassportTypeImpl extends MinimalEObjectImpl.Container implements TCPassportType {
	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

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
	 * The cached value of the '{@link #getProvenance() <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected PassportDataItem provenance;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateType date;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected PassportDataItem objectType;

	/**
	 * The cached value of the '{@link #getDepiction() <em>Depiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepiction()
	 * @generated
	 * @ordered
	 */
	protected PassportDataItem depiction;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected PassportDataItem script;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected PassportDataItem language;

	/**
	 * The default value of the '{@link #getLangComment() <em>Lang Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangComment()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangComment() <em>Lang Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangComment()
	 * @generated
	 * @ordered
	 */
	protected String langComment = LANG_COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected WorkType work;

	/**
	 * The cached value of the '{@link #getTextType() <em>Text Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextType()
	 * @generated
	 * @ordered
	 */
	protected PassportDataItem textType;

	/**
	 * The cached value of the '{@link #getLineCount() <em>Line Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCount()
	 * @generated
	 * @ordered
	 */
	protected LineCountType lineCount;

	/**
	 * The default value of the '{@link #getCodes() <em>Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected static final String CODES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodes() <em>Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected String codes = CODES_EDEFAULT;

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
	 * The default value of the '{@link #getCode1() <em>Code1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode1()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode1() <em>Code1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode1()
	 * @generated
	 * @ordered
	 */
	protected String code1 = CODE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode2() <em>Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode2()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode2() <em>Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode2()
	 * @generated
	 * @ordered
	 */
	protected String code2 = CODE2_EDEFAULT;

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
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameSort() <em>Name Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSort()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSort() <em>Name Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSort()
	 * @generated
	 * @ordered
	 */
	protected String nameSort = NAME_SORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTCLocation() <em>TC Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<TCLocationType> tCLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPassportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.TC_PASSPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__BIBLIOGRAPHY, oldBibliography, bibliography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getProvenance() {
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvenance(PassportDataItem newProvenance, NotificationChain msgs) {
		PassportDataItem oldProvenance = provenance;
		provenance = newProvenance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE, oldProvenance, newProvenance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvenance(PassportDataItem newProvenance) {
		if (newProvenance != provenance) {
			NotificationChain msgs = null;
			if (provenance != null)
				msgs = ((InternalEObject)provenance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE, null, msgs);
			if (newProvenance != null)
				msgs = ((InternalEObject)newProvenance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE, null, msgs);
			msgs = basicSetProvenance(newProvenance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE, newProvenance, newProvenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		DateType oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateType newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectType(PassportDataItem newObjectType, NotificationChain msgs) {
		PassportDataItem oldObjectType = objectType;
		objectType = newObjectType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE, oldObjectType, newObjectType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(PassportDataItem newObjectType) {
		if (newObjectType != objectType) {
			NotificationChain msgs = null;
			if (objectType != null)
				msgs = ((InternalEObject)objectType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE, null, msgs);
			if (newObjectType != null)
				msgs = ((InternalEObject)newObjectType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE, null, msgs);
			msgs = basicSetObjectType(newObjectType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE, newObjectType, newObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getDepiction() {
		return depiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepiction(PassportDataItem newDepiction, NotificationChain msgs) {
		PassportDataItem oldDepiction = depiction;
		depiction = newDepiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION, oldDepiction, newDepiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepiction(PassportDataItem newDepiction) {
		if (newDepiction != depiction) {
			NotificationChain msgs = null;
			if (depiction != null)
				msgs = ((InternalEObject)depiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION, null, msgs);
			if (newDepiction != null)
				msgs = ((InternalEObject)newDepiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION, null, msgs);
			msgs = basicSetDepiction(newDepiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION, newDepiction, newDepiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(PassportDataItem newScript, NotificationChain msgs) {
		PassportDataItem oldScript = script;
		script = newScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT, oldScript, newScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(PassportDataItem newScript) {
		if (newScript != script) {
			NotificationChain msgs = null;
			if (script != null)
				msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT, newScript, newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(PassportDataItem newLanguage, NotificationChain msgs) {
		PassportDataItem oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(PassportDataItem newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangComment() {
		return langComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangComment(String newLangComment) {
		String oldLangComment = langComment;
		langComment = newLangComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANG_COMMENT, oldLangComment, langComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkType getWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(WorkType newWork, NotificationChain msgs) {
		WorkType oldWork = work;
		work = newWork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK, oldWork, newWork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(WorkType newWork) {
		if (newWork != work) {
			NotificationChain msgs = null;
			if (work != null)
				msgs = ((InternalEObject)work).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK, null, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK, null, msgs);
			msgs = basicSetWork(newWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK, newWork, newWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportDataItem getTextType() {
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextType(PassportDataItem newTextType, NotificationChain msgs) {
		PassportDataItem oldTextType = textType;
		textType = newTextType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE, oldTextType, newTextType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextType(PassportDataItem newTextType) {
		if (newTextType != textType) {
			NotificationChain msgs = null;
			if (textType != null)
				msgs = ((InternalEObject)textType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE, null, msgs);
			if (newTextType != null)
				msgs = ((InternalEObject)newTextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE, null, msgs);
			msgs = basicSetTextType(newTextType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE, newTextType, newTextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineCountType getLineCount() {
		return lineCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineCount(LineCountType newLineCount, NotificationChain msgs) {
		LineCountType oldLineCount = lineCount;
		lineCount = newLineCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT, oldLineCount, newLineCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineCount(LineCountType newLineCount) {
		if (newLineCount != lineCount) {
			NotificationChain msgs = null;
			if (lineCount != null)
				msgs = ((InternalEObject)lineCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT, null, msgs);
			if (newLineCount != null)
				msgs = ((InternalEObject)newLineCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT, null, msgs);
			msgs = basicSetLineCount(newLineCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT, newLineCount, newLineCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodes() {
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodes(String newCodes) {
		String oldCodes = codes;
		codes = newCodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODES, oldCodes, codes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_FOLDER, oldWbFolder, wbFolder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_SLIPS, oldWbSlips, wbSlips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode1() {
		return code1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode1(String newCode1) {
		String oldCode1 = code1;
		code1 = newCode1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE1, oldCode1, code1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode2() {
		return code2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode2(String newCode2) {
		String oldCode2 = code2;
		code2 = newCode2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE2, oldCode2, code2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__BTS_CODES, oldBtsCodes, btsCodes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSort() {
		return nameSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSort(String newNameSort) {
		String oldNameSort = nameSort;
		nameSort = newNameSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_PASSPORT_TYPE__NAME_SORT, oldNameSort, nameSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCLocationType> getTCLocation() {
		if (tCLocation == null) {
			tCLocation = new EObjectContainmentEList<TCLocationType>(TCLocationType.class, this, CorpusDTDneuPackage.TC_PASSPORT_TYPE__TC_LOCATION);
		}
		return tCLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE:
				return basicSetProvenance(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE:
				return basicSetDate(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE:
				return basicSetObjectType(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION:
				return basicSetDepiction(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT:
				return basicSetScript(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK:
				return basicSetWork(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE:
				return basicSetTextType(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT:
				return basicSetLineCount(null, msgs);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TC_LOCATION:
				return ((InternalEList<?>)getTCLocation()).basicRemove(otherEnd, msgs);
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
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEFINITION:
				return getDefinition();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROTOCOL:
				return getProtocol();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BIBLIOGRAPHY:
				return getBibliography();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE:
				return getProvenance();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE:
				return getDate();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE:
				return getObjectType();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION:
				return getDepiction();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT:
				return getScript();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE:
				return getLanguage();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANG_COMMENT:
				return getLangComment();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK:
				return getWork();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE:
				return getTextType();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT:
				return getLineCount();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODES:
				return getCodes();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_FOLDER:
				return getWbFolder();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_SLIPS:
				return getWbSlips();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE1:
				return getCode1();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE2:
				return getCode2();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BTS_CODES:
				return getBtsCodes();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NOTES:
				return getNotes();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__FULL_NAME:
				return getFullName();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NAME_SORT:
				return getNameSort();
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TC_LOCATION:
				return getTCLocation();
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
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEFINITION:
				setDefinition((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BIBLIOGRAPHY:
				setBibliography((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE:
				setProvenance((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE:
				setDate((DateType)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE:
				setObjectType((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION:
				setDepiction((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT:
				setScript((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE:
				setLanguage((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANG_COMMENT:
				setLangComment((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK:
				setWork((WorkType)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE:
				setTextType((PassportDataItem)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT:
				setLineCount((LineCountType)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODES:
				setCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_FOLDER:
				setWbFolder((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_SLIPS:
				setWbSlips((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE1:
				setCode1((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE2:
				setCode2((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BTS_CODES:
				setBtsCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NOTES:
				setNotes((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__FULL_NAME:
				setFullName((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NAME_SORT:
				setNameSort((String)newValue);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TC_LOCATION:
				getTCLocation().clear();
				getTCLocation().addAll((Collection<? extends TCLocationType>)newValue);
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
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BIBLIOGRAPHY:
				setBibliography(BIBLIOGRAPHY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE:
				setProvenance((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE:
				setDate((DateType)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE:
				setObjectType((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION:
				setDepiction((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT:
				setScript((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE:
				setLanguage((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANG_COMMENT:
				setLangComment(LANG_COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK:
				setWork((WorkType)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE:
				setTextType((PassportDataItem)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT:
				setLineCount((LineCountType)null);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODES:
				setCodes(CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_FOLDER:
				setWbFolder(WB_FOLDER_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_SLIPS:
				setWbSlips(WB_SLIPS_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE1:
				setCode1(CODE1_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE2:
				setCode2(CODE2_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BTS_CODES:
				setBtsCodes(BTS_CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NAME_SORT:
				setNameSort(NAME_SORT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TC_LOCATION:
				getTCLocation().clear();
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
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BIBLIOGRAPHY:
				return BIBLIOGRAPHY_EDEFAULT == null ? bibliography != null : !BIBLIOGRAPHY_EDEFAULT.equals(bibliography);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__PROVENANCE:
				return provenance != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DATE:
				return date != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__OBJECT_TYPE:
				return objectType != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__DEPICTION:
				return depiction != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__SCRIPT:
				return script != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANGUAGE:
				return language != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LANG_COMMENT:
				return LANG_COMMENT_EDEFAULT == null ? langComment != null : !LANG_COMMENT_EDEFAULT.equals(langComment);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WORK:
				return work != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TEXT_TYPE:
				return textType != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__LINE_COUNT:
				return lineCount != null;
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODES:
				return CODES_EDEFAULT == null ? codes != null : !CODES_EDEFAULT.equals(codes);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_FOLDER:
				return WB_FOLDER_EDEFAULT == null ? wbFolder != null : !WB_FOLDER_EDEFAULT.equals(wbFolder);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__WB_SLIPS:
				return WB_SLIPS_EDEFAULT == null ? wbSlips != null : !WB_SLIPS_EDEFAULT.equals(wbSlips);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE1:
				return CODE1_EDEFAULT == null ? code1 != null : !CODE1_EDEFAULT.equals(code1);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__CODE2:
				return CODE2_EDEFAULT == null ? code2 != null : !CODE2_EDEFAULT.equals(code2);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__BTS_CODES:
				return BTS_CODES_EDEFAULT == null ? btsCodes != null : !BTS_CODES_EDEFAULT.equals(btsCodes);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__NAME_SORT:
				return NAME_SORT_EDEFAULT == null ? nameSort != null : !NAME_SORT_EDEFAULT.equals(nameSort);
			case CorpusDTDneuPackage.TC_PASSPORT_TYPE__TC_LOCATION:
				return tCLocation != null && !tCLocation.isEmpty();
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
		result.append(" (definition: ");
		result.append(definition);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", bibliography: ");
		result.append(bibliography);
		result.append(", langComment: ");
		result.append(langComment);
		result.append(", codes: ");
		result.append(codes);
		result.append(", wbFolder: ");
		result.append(wbFolder);
		result.append(", wbSlips: ");
		result.append(wbSlips);
		result.append(", code1: ");
		result.append(code1);
		result.append(", code2: ");
		result.append(code2);
		result.append(", btsCodes: ");
		result.append(btsCodes);
		result.append(", comment: ");
		result.append(comment);
		result.append(", notes: ");
		result.append(notes);
		result.append(", fullName: ");
		result.append(fullName);
		result.append(", nameSort: ");
		result.append(nameSort);
		result.append(')');
		return result.toString();
	}

} //TCPassportTypeImpl
