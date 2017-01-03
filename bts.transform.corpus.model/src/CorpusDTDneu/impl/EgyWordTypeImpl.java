/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgyWordType;
import CorpusDTDneu.LTypeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Egy Word Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getTranslat <em>Translat</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getFKey <em>FKey</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getLeipzig3Modul <em>Leipzig3 Modul</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getLKey <em>LKey</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getLType <em>LType</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getReihenfolge <em>Reihenfolge</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getReihenfolgeID <em>Reihenfolge ID</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getWChr <em>WChr</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgyWordTypeImpl#getWType <em>WType</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EgyWordTypeImpl extends MinimalEObjectImpl.Container implements EgyWordType {
	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected String form = FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranslat() <em>Translat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslat()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTranslat() <em>Translat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslat()
	 * @generated
	 * @ordered
	 */
	protected String translat = TRANSLAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraphics() <em>Graphics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphics()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPHICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphics() <em>Graphics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphics()
	 * @generated
	 * @ordered
	 */
	protected String graphics = GRAPHICS_EDEFAULT;

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
	 * The default value of the '{@link #getConnect() <em>Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected String connect = CONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFKey() <em>FKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFKey()
	 * @generated
	 * @ordered
	 */
	protected static final String FKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFKey() <em>FKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFKey()
	 * @generated
	 * @ordered
	 */
	protected String fKey = FKEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeipzig3Modul() <em>Leipzig3 Modul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeipzig3Modul()
	 * @generated
	 * @ordered
	 */
	protected static final Object LEIPZIG3_MODUL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeipzig3Modul() <em>Leipzig3 Modul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeipzig3Modul()
	 * @generated
	 * @ordered
	 */
	protected Object leipzig3Modul = LEIPZIG3_MODUL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLKey() <em>LKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLKey()
	 * @generated
	 * @ordered
	 */
	protected static final String LKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLKey() <em>LKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLKey()
	 * @generated
	 * @ordered
	 */
	protected String lKey = LKEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLType() <em>LType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLType()
	 * @generated
	 * @ordered
	 */
	protected static final LTypeType LTYPE_EDEFAULT = LTypeType.B;

	/**
	 * The cached value of the '{@link #getLType() <em>LType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLType()
	 * @generated
	 * @ordered
	 */
	protected LTypeType lType = LTYPE_EDEFAULT;

	/**
	 * This is true if the LType attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lTypeESet;

	/**
	 * The default value of the '{@link #getReihenfolge() <em>Reihenfolge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReihenfolge()
	 * @generated
	 * @ordered
	 */
	protected static final String REIHENFOLGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReihenfolge() <em>Reihenfolge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReihenfolge()
	 * @generated
	 * @ordered
	 */
	protected String reihenfolge = REIHENFOLGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReihenfolgeID() <em>Reihenfolge ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReihenfolgeID()
	 * @generated
	 * @ordered
	 */
	protected static final String REIHENFOLGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReihenfolgeID() <em>Reihenfolge ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReihenfolgeID()
	 * @generated
	 * @ordered
	 */
	protected String reihenfolgeID = REIHENFOLGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Object script = SCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Object status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWChr() <em>WChr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWChr()
	 * @generated
	 * @ordered
	 */
	protected static final String WCHR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWChr() <em>WChr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWChr()
	 * @generated
	 * @ordered
	 */
	protected String wChr = WCHR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWType() <em>WType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWType()
	 * @generated
	 * @ordered
	 */
	protected static final String WTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWType() <em>WType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWType()
	 * @generated
	 * @ordered
	 */
	protected String wType = WTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EgyWordTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.EGY_WORD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(String newForm) {
		String oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTranslat() {
		return translat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslat(String newTranslat) {
		String oldTranslat = translat;
		translat = newTranslat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__TRANSLAT, oldTranslat, translat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphics() {
		return graphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphics(String newGraphics) {
		String oldGraphics = graphics;
		graphics = newGraphics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__GRAPHICS, oldGraphics, graphics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__BTS_CODES, oldBtsCodes, btsCodes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnect() {
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnect(String newConnect) {
		String oldConnect = connect;
		connect = newConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__CONNECT, oldConnect, connect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFKey() {
		return fKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFKey(String newFKey) {
		String oldFKey = fKey;
		fKey = newFKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__FKEY, oldFKey, fKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLeipzig3Modul() {
		return leipzig3Modul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeipzig3Modul(Object newLeipzig3Modul) {
		Object oldLeipzig3Modul = leipzig3Modul;
		leipzig3Modul = newLeipzig3Modul;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__LEIPZIG3_MODUL, oldLeipzig3Modul, leipzig3Modul));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLKey() {
		return lKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLKey(String newLKey) {
		String oldLKey = lKey;
		lKey = newLKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__LKEY, oldLKey, lKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTypeType getLType() {
		return lType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLType(LTypeType newLType) {
		LTypeType oldLType = lType;
		lType = newLType == null ? LTYPE_EDEFAULT : newLType;
		boolean oldLTypeESet = lTypeESet;
		lTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__LTYPE, oldLType, lType, !oldLTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLType() {
		LTypeType oldLType = lType;
		boolean oldLTypeESet = lTypeESet;
		lType = LTYPE_EDEFAULT;
		lTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.EGY_WORD_TYPE__LTYPE, oldLType, LTYPE_EDEFAULT, oldLTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLType() {
		return lTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReihenfolge() {
		return reihenfolge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReihenfolge(String newReihenfolge) {
		String oldReihenfolge = reihenfolge;
		reihenfolge = newReihenfolge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE, oldReihenfolge, reihenfolge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReihenfolgeID() {
		return reihenfolgeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReihenfolgeID(String newReihenfolgeID) {
		String oldReihenfolgeID = reihenfolgeID;
		reihenfolgeID = newReihenfolgeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE_ID, oldReihenfolgeID, reihenfolgeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Object newScript) {
		Object oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Object newStatus) {
		Object oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWChr() {
		return wChr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWChr(String newWChr) {
		String oldWChr = wChr;
		wChr = newWChr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__WCHR, oldWChr, wChr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWType() {
		return wType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWType(String newWType) {
		String oldWType = wType;
		wType = newWType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_WORD_TYPE__WTYPE, oldWType, wType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FORM:
				return getForm();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__TRANSLAT:
				return getTranslat();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__GRAPHICS:
				return getGraphics();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__BTS_CODES:
				return getBtsCodes();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__AUTHOR:
				return getAuthor();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__CONNECT:
				return getConnect();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FKEY:
				return getFKey();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LEIPZIG3_MODUL:
				return getLeipzig3Modul();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LKEY:
				return getLKey();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LTYPE:
				return getLType();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE:
				return getReihenfolge();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE_ID:
				return getReihenfolgeID();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__SCRIPT:
				return getScript();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__STATUS:
				return getStatus();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WCHR:
				return getWChr();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WTYPE:
				return getWType();
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
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FORM:
				setForm((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__TRANSLAT:
				setTranslat((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__GRAPHICS:
				setGraphics((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__BTS_CODES:
				setBtsCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__AUTHOR:
				setAuthor(newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__CONNECT:
				setConnect((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FKEY:
				setFKey((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LEIPZIG3_MODUL:
				setLeipzig3Modul(newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LKEY:
				setLKey((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LTYPE:
				setLType((LTypeType)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE:
				setReihenfolge((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE_ID:
				setReihenfolgeID((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__SCRIPT:
				setScript(newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__STATUS:
				setStatus(newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WCHR:
				setWChr((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WTYPE:
				setWType((String)newValue);
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
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FORM:
				setForm(FORM_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__TRANSLAT:
				setTranslat(TRANSLAT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__GRAPHICS:
				setGraphics(GRAPHICS_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__BTS_CODES:
				setBtsCodes(BTS_CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__CONNECT:
				setConnect(CONNECT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FKEY:
				setFKey(FKEY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LEIPZIG3_MODUL:
				setLeipzig3Modul(LEIPZIG3_MODUL_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LKEY:
				setLKey(LKEY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LTYPE:
				unsetLType();
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE:
				setReihenfolge(REIHENFOLGE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE_ID:
				setReihenfolgeID(REIHENFOLGE_ID_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WCHR:
				setWChr(WCHR_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WTYPE:
				setWType(WTYPE_EDEFAULT);
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
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FORM:
				return FORM_EDEFAULT == null ? form != null : !FORM_EDEFAULT.equals(form);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__TRANSLAT:
				return TRANSLAT_EDEFAULT == null ? translat != null : !TRANSLAT_EDEFAULT.equals(translat);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__GRAPHICS:
				return GRAPHICS_EDEFAULT == null ? graphics != null : !GRAPHICS_EDEFAULT.equals(graphics);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__BTS_CODES:
				return BTS_CODES_EDEFAULT == null ? btsCodes != null : !BTS_CODES_EDEFAULT.equals(btsCodes);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__CONNECT:
				return CONNECT_EDEFAULT == null ? connect != null : !CONNECT_EDEFAULT.equals(connect);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__FKEY:
				return FKEY_EDEFAULT == null ? fKey != null : !FKEY_EDEFAULT.equals(fKey);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LEIPZIG3_MODUL:
				return LEIPZIG3_MODUL_EDEFAULT == null ? leipzig3Modul != null : !LEIPZIG3_MODUL_EDEFAULT.equals(leipzig3Modul);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LKEY:
				return LKEY_EDEFAULT == null ? lKey != null : !LKEY_EDEFAULT.equals(lKey);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__LTYPE:
				return isSetLType();
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE:
				return REIHENFOLGE_EDEFAULT == null ? reihenfolge != null : !REIHENFOLGE_EDEFAULT.equals(reihenfolge);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__REIHENFOLGE_ID:
				return REIHENFOLGE_ID_EDEFAULT == null ? reihenfolgeID != null : !REIHENFOLGE_ID_EDEFAULT.equals(reihenfolgeID);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WCHR:
				return WCHR_EDEFAULT == null ? wChr != null : !WCHR_EDEFAULT.equals(wChr);
			case CorpusDTDneuPackage.EGY_WORD_TYPE__WTYPE:
				return WTYPE_EDEFAULT == null ? wType != null : !WTYPE_EDEFAULT.equals(wType);
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
		result.append(" (form: ");
		result.append(form);
		result.append(", translat: ");
		result.append(translat);
		result.append(", graphics: ");
		result.append(graphics);
		result.append(", btsCodes: ");
		result.append(btsCodes);
		result.append(", comment: ");
		result.append(comment);
		result.append(", author: ");
		result.append(author);
		result.append(", connect: ");
		result.append(connect);
		result.append(", fKey: ");
		result.append(fKey);
		result.append(", leipzig3Modul: ");
		result.append(leipzig3Modul);
		result.append(", lKey: ");
		result.append(lKey);
		result.append(", lType: ");
		if (lTypeESet) result.append(lType); else result.append("<unset>");
		result.append(", reihenfolge: ");
		result.append(reihenfolge);
		result.append(", reihenfolgeID: ");
		result.append(reihenfolgeID);
		result.append(", script: ");
		result.append(script);
		result.append(", status: ");
		result.append(status);
		result.append(", wChr: ");
		result.append(wChr);
		result.append(", wType: ");
		result.append(wType);
		result.append(')');
		return result.toString();
	}

} //EgyWordTypeImpl
