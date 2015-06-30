/**
 */
package Btsaux.impl;

import Btsaux.AuthorsType;
import Btsaux.BtsauxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getAuct <em>Auct</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getAugp <em>Augp</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getPage <em>Page</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getSigle <em>Sigle</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getWeblink <em>Weblink</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getLoginname <em>Loginname</em>}</li>
 *   <li>{@link Btsaux.impl.AuthorsTypeImpl#getPword <em>Pword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorsTypeImpl extends MinimalEObjectImpl.Container implements AuthorsType {
	/**
	 * The default value of the '{@link #getAuct() <em>Auct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuct()
	 * @generated
	 * @ordered
	 */
	protected static final String AUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuct() <em>Auct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuct()
	 * @generated
	 * @ordered
	 */
	protected String auct = AUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAugp() <em>Augp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAugp()
	 * @generated
	 * @ordered
	 */
	protected static final String AUGP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAugp() <em>Augp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAugp()
	 * @generated
	 * @ordered
	 */
	protected String augp = AUGP_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Object comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected Object line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected static final Object PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected Object page = PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSigle() <em>Sigle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigle()
	 * @generated
	 * @ordered
	 */
	protected static final Object SIGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSigle() <em>Sigle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigle()
	 * @generated
	 * @ordered
	 */
	protected Object sigle = SIGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeblink() <em>Weblink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeblink()
	 * @generated
	 * @ordered
	 */
	protected static final Object WEBLINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeblink() <em>Weblink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeblink()
	 * @generated
	 * @ordered
	 */
	protected Object weblink = WEBLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoginname() <em>Loginname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginname()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGINNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoginname() <em>Loginname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginname()
	 * @generated
	 * @ordered
	 */
	protected String loginname = LOGINNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPword() <em>Pword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPword()
	 * @generated
	 * @ordered
	 */
	protected static final String PWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPword() <em>Pword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPword()
	 * @generated
	 * @ordered
	 */
	protected String pword = PWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsauxPackage.Literals.AUTHORS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuct() {
		return auct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuct(String newAuct) {
		String oldAuct = auct;
		auct = newAuct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__AUCT, oldAuct, auct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAugp() {
		return augp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAugp(String newAugp) {
		String oldAugp = augp;
		augp = newAugp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__AUGP, oldAugp, augp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Object newComment) {
		Object oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(Object newLine) {
		Object oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Object newPage) {
		Object oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSigle() {
		return sigle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigle(Object newSigle) {
		Object oldSigle = sigle;
		sigle = newSigle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__SIGLE, oldSigle, sigle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWeblink() {
		return weblink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeblink(Object newWeblink) {
		Object oldWeblink = weblink;
		weblink = newWeblink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__WEBLINK, oldWeblink, weblink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginname(String newLoginname) {
		String oldLoginname = loginname;
		loginname = newLoginname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__LOGINNAME, oldLoginname, loginname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPword() {
		return pword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPword(String newPword) {
		String oldPword = pword;
		pword = newPword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsauxPackage.AUTHORS_TYPE__PWORD, oldPword, pword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsauxPackage.AUTHORS_TYPE__AUCT:
				return getAuct();
			case BtsauxPackage.AUTHORS_TYPE__AUGP:
				return getAugp();
			case BtsauxPackage.AUTHORS_TYPE__COMMENT:
				return getComment();
			case BtsauxPackage.AUTHORS_TYPE__LINE:
				return getLine();
			case BtsauxPackage.AUTHORS_TYPE__PAGE:
				return getPage();
			case BtsauxPackage.AUTHORS_TYPE__SIGLE:
				return getSigle();
			case BtsauxPackage.AUTHORS_TYPE__WEBLINK:
				return getWeblink();
			case BtsauxPackage.AUTHORS_TYPE__LOGINNAME:
				return getLoginname();
			case BtsauxPackage.AUTHORS_TYPE__PWORD:
				return getPword();
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
			case BtsauxPackage.AUTHORS_TYPE__AUCT:
				setAuct((String)newValue);
				return;
			case BtsauxPackage.AUTHORS_TYPE__AUGP:
				setAugp((String)newValue);
				return;
			case BtsauxPackage.AUTHORS_TYPE__COMMENT:
				setComment(newValue);
				return;
			case BtsauxPackage.AUTHORS_TYPE__LINE:
				setLine(newValue);
				return;
			case BtsauxPackage.AUTHORS_TYPE__PAGE:
				setPage(newValue);
				return;
			case BtsauxPackage.AUTHORS_TYPE__SIGLE:
				setSigle(newValue);
				return;
			case BtsauxPackage.AUTHORS_TYPE__WEBLINK:
				setWeblink(newValue);
				return;
			case BtsauxPackage.AUTHORS_TYPE__LOGINNAME:
				setLoginname((String)newValue);
				return;
			case BtsauxPackage.AUTHORS_TYPE__PWORD:
				setPword((String)newValue);
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
			case BtsauxPackage.AUTHORS_TYPE__AUCT:
				setAuct(AUCT_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORS_TYPE__AUGP:
				setAugp(AUGP_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORS_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORS_TYPE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORS_TYPE__PAGE:
				setPage(PAGE_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORS_TYPE__SIGLE:
				setSigle(SIGLE_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORS_TYPE__WEBLINK:
				setWeblink(WEBLINK_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORS_TYPE__LOGINNAME:
				setLoginname(LOGINNAME_EDEFAULT);
				return;
			case BtsauxPackage.AUTHORS_TYPE__PWORD:
				setPword(PWORD_EDEFAULT);
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
			case BtsauxPackage.AUTHORS_TYPE__AUCT:
				return AUCT_EDEFAULT == null ? auct != null : !AUCT_EDEFAULT.equals(auct);
			case BtsauxPackage.AUTHORS_TYPE__AUGP:
				return AUGP_EDEFAULT == null ? augp != null : !AUGP_EDEFAULT.equals(augp);
			case BtsauxPackage.AUTHORS_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BtsauxPackage.AUTHORS_TYPE__LINE:
				return LINE_EDEFAULT == null ? line != null : !LINE_EDEFAULT.equals(line);
			case BtsauxPackage.AUTHORS_TYPE__PAGE:
				return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
			case BtsauxPackage.AUTHORS_TYPE__SIGLE:
				return SIGLE_EDEFAULT == null ? sigle != null : !SIGLE_EDEFAULT.equals(sigle);
			case BtsauxPackage.AUTHORS_TYPE__WEBLINK:
				return WEBLINK_EDEFAULT == null ? weblink != null : !WEBLINK_EDEFAULT.equals(weblink);
			case BtsauxPackage.AUTHORS_TYPE__LOGINNAME:
				return LOGINNAME_EDEFAULT == null ? loginname != null : !LOGINNAME_EDEFAULT.equals(loginname);
			case BtsauxPackage.AUTHORS_TYPE__PWORD:
				return PWORD_EDEFAULT == null ? pword != null : !PWORD_EDEFAULT.equals(pword);
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
		result.append(" (auct: ");
		result.append(auct);
		result.append(", augp: ");
		result.append(augp);
		result.append(", comment: ");
		result.append(comment);
		result.append(", line: ");
		result.append(line);
		result.append(", page: ");
		result.append(page);
		result.append(", sigle: ");
		result.append(sigle);
		result.append(", weblink: ");
		result.append(weblink);
		result.append(", loginname: ");
		result.append(loginname);
		result.append(", pword: ");
		result.append(pword);
		result.append(')');
		return result.toString();
	}

} //AuthorsTypeImpl
