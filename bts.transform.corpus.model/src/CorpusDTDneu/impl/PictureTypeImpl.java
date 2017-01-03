/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.PictureType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getDpi <em>Dpi</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getPictType <em>Pict Type</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.PictureTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PictureTypeImpl extends MinimalEObjectImpl.Container implements PictureType {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

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
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

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
	 * The default value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUTHORIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected Object authorization = AUTHORIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDpi() <em>Dpi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpi()
	 * @generated
	 * @ordered
	 */
	protected static final Object DPI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDpi() <em>Dpi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpi()
	 * @generated
	 * @ordered
	 */
	protected Object dpi = DPI_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Object HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Object height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Object key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPictType() <em>Pict Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictType()
	 * @generated
	 * @ordered
	 */
	protected static final Object PICT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPictType() <em>Pict Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictType()
	 * @generated
	 * @ordered
	 */
	protected Object pictType = PICT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Object scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PictureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.PICTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__BIBLIOGRAPHY, oldBibliography, bibliography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAuthorization() {
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(Object newAuthorization) {
		Object oldAuthorization = authorization;
		authorization = newAuthorization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__AUTHORIZATION, oldAuthorization, authorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDpi() {
		return dpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDpi(Object newDpi) {
		Object oldDpi = dpi;
		dpi = newDpi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__DPI, oldDpi, dpi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Object newHeight) {
		Object oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Object newKey) {
		Object oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPictType() {
		return pictType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPictType(Object newPictType) {
		Object oldPictType = pictType;
		pictType = newPictType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__PICT_TYPE, oldPictType, pictType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Object newScale) {
		Object oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.PICTURE_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusDTDneuPackage.PICTURE_TYPE__FILE_NAME:
				return getFileName();
			case CorpusDTDneuPackage.PICTURE_TYPE__FILE_PATH:
				return getFilePath();
			case CorpusDTDneuPackage.PICTURE_TYPE__NAME:
				return getName();
			case CorpusDTDneuPackage.PICTURE_TYPE__AUTHOR:
				return getAuthor();
			case CorpusDTDneuPackage.PICTURE_TYPE__BIBLIOGRAPHY:
				return getBibliography();
			case CorpusDTDneuPackage.PICTURE_TYPE__AUTHORIZATION:
				return getAuthorization();
			case CorpusDTDneuPackage.PICTURE_TYPE__DPI:
				return getDpi();
			case CorpusDTDneuPackage.PICTURE_TYPE__HEIGHT:
				return getHeight();
			case CorpusDTDneuPackage.PICTURE_TYPE__KEY:
				return getKey();
			case CorpusDTDneuPackage.PICTURE_TYPE__PICT_TYPE:
				return getPictType();
			case CorpusDTDneuPackage.PICTURE_TYPE__SCALE:
				return getScale();
			case CorpusDTDneuPackage.PICTURE_TYPE__WIDTH:
				return getWidth();
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
			case CorpusDTDneuPackage.PICTURE_TYPE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__BIBLIOGRAPHY:
				setBibliography((String)newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__AUTHORIZATION:
				setAuthorization(newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__DPI:
				setDpi(newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__HEIGHT:
				setHeight(newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__KEY:
				setKey(newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__PICT_TYPE:
				setPictType(newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__SCALE:
				setScale(newValue);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__WIDTH:
				setWidth(newValue);
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
			case CorpusDTDneuPackage.PICTURE_TYPE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__BIBLIOGRAPHY:
				setBibliography(BIBLIOGRAPHY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__AUTHORIZATION:
				setAuthorization(AUTHORIZATION_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__DPI:
				setDpi(DPI_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__PICT_TYPE:
				setPictType(PICT_TYPE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.PICTURE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case CorpusDTDneuPackage.PICTURE_TYPE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case CorpusDTDneuPackage.PICTURE_TYPE__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case CorpusDTDneuPackage.PICTURE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorpusDTDneuPackage.PICTURE_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CorpusDTDneuPackage.PICTURE_TYPE__BIBLIOGRAPHY:
				return BIBLIOGRAPHY_EDEFAULT == null ? bibliography != null : !BIBLIOGRAPHY_EDEFAULT.equals(bibliography);
			case CorpusDTDneuPackage.PICTURE_TYPE__AUTHORIZATION:
				return AUTHORIZATION_EDEFAULT == null ? authorization != null : !AUTHORIZATION_EDEFAULT.equals(authorization);
			case CorpusDTDneuPackage.PICTURE_TYPE__DPI:
				return DPI_EDEFAULT == null ? dpi != null : !DPI_EDEFAULT.equals(dpi);
			case CorpusDTDneuPackage.PICTURE_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case CorpusDTDneuPackage.PICTURE_TYPE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case CorpusDTDneuPackage.PICTURE_TYPE__PICT_TYPE:
				return PICT_TYPE_EDEFAULT == null ? pictType != null : !PICT_TYPE_EDEFAULT.equals(pictType);
			case CorpusDTDneuPackage.PICTURE_TYPE__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case CorpusDTDneuPackage.PICTURE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", filePath: ");
		result.append(filePath);
		result.append(", name: ");
		result.append(name);
		result.append(", author: ");
		result.append(author);
		result.append(", bibliography: ");
		result.append(bibliography);
		result.append(", authorization: ");
		result.append(authorization);
		result.append(", dpi: ");
		result.append(dpi);
		result.append(", height: ");
		result.append(height);
		result.append(", key: ");
		result.append(key);
		result.append(", pictType: ");
		result.append(pictType);
		result.append(", scale: ");
		result.append(scale);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //PictureTypeImpl
