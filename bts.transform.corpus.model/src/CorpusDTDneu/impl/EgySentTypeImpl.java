/**
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.BausteinPassageType;
import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.EgyPunctuationType;
import CorpusDTDneu.EgySentType;
import CorpusDTDneu.EgyTB1Type;
import CorpusDTDneu.EgyTB3EndType;
import CorpusDTDneu.EgyTB3StartType;
import CorpusDTDneu.EgyWordType;
import CorpusDTDneu.FormattingElementType;
import CorpusDTDneu.GlossePassageType;
import CorpusDTDneu.LanguagePassageType;
import CorpusDTDneu.LeipzigPassageType;
import CorpusDTDneu.LineCountType;
import CorpusDTDneu.NoteType;
import CorpusDTDneu.PunctuationType;
import CorpusDTDneu.TypeType5;

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
 * An implementation of the model object '<em><b>Egy Sent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getTranslat <em>Translat</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getBtsCodes <em>Bts Codes</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getEgyTB1 <em>Egy TB1</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getEgyTB3End <em>Egy TB3 End</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getEgyWord <em>Egy Word</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getFormattingElement <em>Formatting Element</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getLanguagePassage <em>Language Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getBausteinPassage <em>Baustein Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getLeipzigPassage <em>Leipzig Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getGlossePassage <em>Glosse Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getPunctuation <em>Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getEgyPunctuation <em>Egy Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getLeipzig3Modul <em>Leipzig3 Modul</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.EgySentTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EgySentTypeImpl extends MinimalEObjectImpl.Container implements EgySentType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Object language = LANGUAGE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType5 TYPE_EDEFAULT = TypeType5.HS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType5 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EgySentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.EGY_SENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SENT_TYPE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SENT_TYPE__TRANSLAT, oldTranslat, translat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SENT_TYPE__BTS_CODES, oldBtsCodes, btsCodes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SENT_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorpusDTDneuPackage.EGY_SENT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgySentType> getEgySent() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_SENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB1Type> getEgyTB1() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_TB1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB3StartType> getEgyTB3Start() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_TB3_START);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB3EndType> getEgyTB3End() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_TB3_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyWordType> getEgyWord() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_WORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineCountType> getLineCount() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__LINE_COUNT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteType> getNote() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__NOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormattingElementType> getFormattingElement() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__FORMATTING_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguagePassageType> getLanguagePassage() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__LANGUAGE_PASSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BausteinPassageType> getBausteinPassage() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__BAUSTEIN_PASSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeipzigPassageType> getLeipzigPassage() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__LEIPZIG_PASSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlossePassageType> getGlossePassage() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__GLOSSE_PASSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PunctuationType> getPunctuation() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__PUNCTUATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyPunctuationType> getEgyPunctuation() {
		return getGroup().list(CorpusDTDneuPackage.Literals.EGY_SENT_TYPE__EGY_PUNCTUATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SENT_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Object newLanguage) {
		Object oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG3_MODUL, oldLeipzig3Modul, leipzig3Modul));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType5 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType5 newType) {
		TypeType5 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.EGY_SENT_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType5 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.EGY_SENT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_SENT:
				return ((InternalEList<?>)getEgySent()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB1:
				return ((InternalEList<?>)getEgyTB1()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_START:
				return ((InternalEList<?>)getEgyTB3Start()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_END:
				return ((InternalEList<?>)getEgyTB3End()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_WORD:
				return ((InternalEList<?>)getEgyWord()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LINE_COUNT:
				return ((InternalEList<?>)getLineCount()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__FORMATTING_ELEMENT:
				return ((InternalEList<?>)getFormattingElement()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE_PASSAGE:
				return ((InternalEList<?>)getLanguagePassage()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BAUSTEIN_PASSAGE:
				return ((InternalEList<?>)getBausteinPassage()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG_PASSAGE:
				return ((InternalEList<?>)getLeipzigPassage()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GLOSSE_PASSAGE:
				return ((InternalEList<?>)getGlossePassage()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__PUNCTUATION:
				return ((InternalEList<?>)getPunctuation()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_PUNCTUATION:
				return ((InternalEList<?>)getEgyPunctuation()).basicRemove(otherEnd, msgs);
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
			case CorpusDTDneuPackage.EGY_SENT_TYPE__VALUE:
				return getValue();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TRANSLAT:
				return getTranslat();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BTS_CODES:
				return getBtsCodes();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__COMMENT:
				return getComment();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_SENT:
				return getEgySent();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB1:
				return getEgyTB1();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_START:
				return getEgyTB3Start();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_END:
				return getEgyTB3End();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_WORD:
				return getEgyWord();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LINE_COUNT:
				return getLineCount();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__NOTE:
				return getNote();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__FORMATTING_ELEMENT:
				return getFormattingElement();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE_PASSAGE:
				return getLanguagePassage();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BAUSTEIN_PASSAGE:
				return getBausteinPassage();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG_PASSAGE:
				return getLeipzigPassage();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GLOSSE_PASSAGE:
				return getGlossePassage();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__PUNCTUATION:
				return getPunctuation();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_PUNCTUATION:
				return getEgyPunctuation();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__AUTHOR:
				return getAuthor();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE:
				return getLanguage();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG3_MODUL:
				return getLeipzig3Modul();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TYPE:
				return getType();
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
			case CorpusDTDneuPackage.EGY_SENT_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TRANSLAT:
				setTranslat((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BTS_CODES:
				setBtsCodes((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_SENT:
				getEgySent().clear();
				getEgySent().addAll((Collection<? extends EgySentType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB1:
				getEgyTB1().clear();
				getEgyTB1().addAll((Collection<? extends EgyTB1Type>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_START:
				getEgyTB3Start().clear();
				getEgyTB3Start().addAll((Collection<? extends EgyTB3StartType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_END:
				getEgyTB3End().clear();
				getEgyTB3End().addAll((Collection<? extends EgyTB3EndType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_WORD:
				getEgyWord().clear();
				getEgyWord().addAll((Collection<? extends EgyWordType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LINE_COUNT:
				getLineCount().clear();
				getLineCount().addAll((Collection<? extends LineCountType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__FORMATTING_ELEMENT:
				getFormattingElement().clear();
				getFormattingElement().addAll((Collection<? extends FormattingElementType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE_PASSAGE:
				getLanguagePassage().clear();
				getLanguagePassage().addAll((Collection<? extends LanguagePassageType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BAUSTEIN_PASSAGE:
				getBausteinPassage().clear();
				getBausteinPassage().addAll((Collection<? extends BausteinPassageType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG_PASSAGE:
				getLeipzigPassage().clear();
				getLeipzigPassage().addAll((Collection<? extends LeipzigPassageType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GLOSSE_PASSAGE:
				getGlossePassage().clear();
				getGlossePassage().addAll((Collection<? extends GlossePassageType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__PUNCTUATION:
				getPunctuation().clear();
				getPunctuation().addAll((Collection<? extends PunctuationType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_PUNCTUATION:
				getEgyPunctuation().clear();
				getEgyPunctuation().addAll((Collection<? extends EgyPunctuationType>)newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__AUTHOR:
				setAuthor(newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE:
				setLanguage(newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG3_MODUL:
				setLeipzig3Modul(newValue);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TYPE:
				setType((TypeType5)newValue);
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
			case CorpusDTDneuPackage.EGY_SENT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TRANSLAT:
				setTranslat(TRANSLAT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BTS_CODES:
				setBtsCodes(BTS_CODES_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_SENT:
				getEgySent().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB1:
				getEgyTB1().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_START:
				getEgyTB3Start().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_END:
				getEgyTB3End().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_WORD:
				getEgyWord().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LINE_COUNT:
				getLineCount().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__NOTE:
				getNote().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__FORMATTING_ELEMENT:
				getFormattingElement().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE_PASSAGE:
				getLanguagePassage().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BAUSTEIN_PASSAGE:
				getBausteinPassage().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG_PASSAGE:
				getLeipzigPassage().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GLOSSE_PASSAGE:
				getGlossePassage().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__PUNCTUATION:
				getPunctuation().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_PUNCTUATION:
				getEgyPunctuation().clear();
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG3_MODUL:
				setLeipzig3Modul(LEIPZIG3_MODUL_EDEFAULT);
				return;
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TYPE:
				unsetType();
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
			case CorpusDTDneuPackage.EGY_SENT_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TRANSLAT:
				return TRANSLAT_EDEFAULT == null ? translat != null : !TRANSLAT_EDEFAULT.equals(translat);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BTS_CODES:
				return BTS_CODES_EDEFAULT == null ? btsCodes != null : !BTS_CODES_EDEFAULT.equals(btsCodes);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_SENT:
				return !getEgySent().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB1:
				return !getEgyTB1().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_START:
				return !getEgyTB3Start().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_TB3_END:
				return !getEgyTB3End().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_WORD:
				return !getEgyWord().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LINE_COUNT:
				return !getLineCount().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__NOTE:
				return !getNote().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__FORMATTING_ELEMENT:
				return !getFormattingElement().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE_PASSAGE:
				return !getLanguagePassage().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__BAUSTEIN_PASSAGE:
				return !getBausteinPassage().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG_PASSAGE:
				return !getLeipzigPassage().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__GLOSSE_PASSAGE:
				return !getGlossePassage().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__PUNCTUATION:
				return !getPunctuation().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__EGY_PUNCTUATION:
				return !getEgyPunctuation().isEmpty();
			case CorpusDTDneuPackage.EGY_SENT_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__LEIPZIG3_MODUL:
				return LEIPZIG3_MODUL_EDEFAULT == null ? leipzig3Modul != null : !LEIPZIG3_MODUL_EDEFAULT.equals(leipzig3Modul);
			case CorpusDTDneuPackage.EGY_SENT_TYPE__TYPE:
				return isSetType();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", translat: ");
		result.append(translat);
		result.append(", btsCodes: ");
		result.append(btsCodes);
		result.append(", comment: ");
		result.append(comment);
		result.append(", group: ");
		result.append(group);
		result.append(", author: ");
		result.append(author);
		result.append(", language: ");
		result.append(language);
		result.append(", leipzig3Modul: ");
		result.append(leipzig3Modul);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EgySentTypeImpl
