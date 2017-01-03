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
import CorpusDTDneu.GlosseType;
import CorpusDTDneu.LanguagePassageType;
import CorpusDTDneu.LeipzigPassageType;
import CorpusDTDneu.LineCountType;
import CorpusDTDneu.NoteType;
import CorpusDTDneu.PunctuationType;

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
 * An implementation of the model object '<em><b>Glosse Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getEgySent <em>Egy Sent</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getEgyTB1 <em>Egy TB1</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getEgyTB3Start <em>Egy TB3 Start</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getEgyTB3End <em>Egy TB3 End</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getEgyWord <em>Egy Word</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getFormattingElement <em>Formatting Element</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getLanguagePassage <em>Language Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getBausteinPassage <em>Baustein Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getLeipzigPassage <em>Leipzig Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getGlossePassage <em>Glosse Passage</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getPunctuation <em>Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getEgyPunctuation <em>Egy Punctuation</em>}</li>
 *   <li>{@link CorpusDTDneu.impl.GlosseTypeImpl#getPassageID <em>Passage ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlosseTypeImpl extends MinimalEObjectImpl.Container implements GlosseType {
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
	 * The default value of the '{@link #getPassageID() <em>Passage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassageID()
	 * @generated
	 * @ordered
	 */
	protected static final Object PASSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassageID() <em>Passage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassageID()
	 * @generated
	 * @ordered
	 */
	protected Object passageID = PASSAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlosseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusDTDneuPackage.Literals.GLOSSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorpusDTDneuPackage.GLOSSE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgySentType> getEgySent() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__EGY_SENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB1Type> getEgyTB1() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__EGY_TB1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB3StartType> getEgyTB3Start() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__EGY_TB3_START);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyTB3EndType> getEgyTB3End() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__EGY_TB3_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyWordType> getEgyWord() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__EGY_WORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineCountType> getLineCount() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__LINE_COUNT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteType> getNote() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__NOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormattingElementType> getFormattingElement() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__FORMATTING_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguagePassageType> getLanguagePassage() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__LANGUAGE_PASSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BausteinPassageType> getBausteinPassage() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__BAUSTEIN_PASSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeipzigPassageType> getLeipzigPassage() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__LEIPZIG_PASSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlossePassageType> getGlossePassage() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__GLOSSE_PASSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PunctuationType> getPunctuation() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__PUNCTUATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EgyPunctuationType> getEgyPunctuation() {
		return getGroup().list(CorpusDTDneuPackage.Literals.GLOSSE_TYPE__EGY_PUNCTUATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPassageID() {
		return passageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassageID(Object newPassageID) {
		Object oldPassageID = passageID;
		passageID = newPassageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.GLOSSE_TYPE__PASSAGE_ID, oldPassageID, passageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusDTDneuPackage.GLOSSE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_SENT:
				return ((InternalEList<?>)getEgySent()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB1:
				return ((InternalEList<?>)getEgyTB1()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_START:
				return ((InternalEList<?>)getEgyTB3Start()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_END:
				return ((InternalEList<?>)getEgyTB3End()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_WORD:
				return ((InternalEList<?>)getEgyWord()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__LINE_COUNT:
				return ((InternalEList<?>)getLineCount()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__FORMATTING_ELEMENT:
				return ((InternalEList<?>)getFormattingElement()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__LANGUAGE_PASSAGE:
				return ((InternalEList<?>)getLanguagePassage()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__BAUSTEIN_PASSAGE:
				return ((InternalEList<?>)getBausteinPassage()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__LEIPZIG_PASSAGE:
				return ((InternalEList<?>)getLeipzigPassage()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__GLOSSE_PASSAGE:
				return ((InternalEList<?>)getGlossePassage()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__PUNCTUATION:
				return ((InternalEList<?>)getPunctuation()).basicRemove(otherEnd, msgs);
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_PUNCTUATION:
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
			case CorpusDTDneuPackage.GLOSSE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_SENT:
				return getEgySent();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB1:
				return getEgyTB1();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_START:
				return getEgyTB3Start();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_END:
				return getEgyTB3End();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_WORD:
				return getEgyWord();
			case CorpusDTDneuPackage.GLOSSE_TYPE__LINE_COUNT:
				return getLineCount();
			case CorpusDTDneuPackage.GLOSSE_TYPE__NOTE:
				return getNote();
			case CorpusDTDneuPackage.GLOSSE_TYPE__FORMATTING_ELEMENT:
				return getFormattingElement();
			case CorpusDTDneuPackage.GLOSSE_TYPE__LANGUAGE_PASSAGE:
				return getLanguagePassage();
			case CorpusDTDneuPackage.GLOSSE_TYPE__BAUSTEIN_PASSAGE:
				return getBausteinPassage();
			case CorpusDTDneuPackage.GLOSSE_TYPE__LEIPZIG_PASSAGE:
				return getLeipzigPassage();
			case CorpusDTDneuPackage.GLOSSE_TYPE__GLOSSE_PASSAGE:
				return getGlossePassage();
			case CorpusDTDneuPackage.GLOSSE_TYPE__PUNCTUATION:
				return getPunctuation();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_PUNCTUATION:
				return getEgyPunctuation();
			case CorpusDTDneuPackage.GLOSSE_TYPE__PASSAGE_ID:
				return getPassageID();
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
			case CorpusDTDneuPackage.GLOSSE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_SENT:
				getEgySent().clear();
				getEgySent().addAll((Collection<? extends EgySentType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB1:
				getEgyTB1().clear();
				getEgyTB1().addAll((Collection<? extends EgyTB1Type>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_START:
				getEgyTB3Start().clear();
				getEgyTB3Start().addAll((Collection<? extends EgyTB3StartType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_END:
				getEgyTB3End().clear();
				getEgyTB3End().addAll((Collection<? extends EgyTB3EndType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_WORD:
				getEgyWord().clear();
				getEgyWord().addAll((Collection<? extends EgyWordType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__LINE_COUNT:
				getLineCount().clear();
				getLineCount().addAll((Collection<? extends LineCountType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__FORMATTING_ELEMENT:
				getFormattingElement().clear();
				getFormattingElement().addAll((Collection<? extends FormattingElementType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__LANGUAGE_PASSAGE:
				getLanguagePassage().clear();
				getLanguagePassage().addAll((Collection<? extends LanguagePassageType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__BAUSTEIN_PASSAGE:
				getBausteinPassage().clear();
				getBausteinPassage().addAll((Collection<? extends BausteinPassageType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__LEIPZIG_PASSAGE:
				getLeipzigPassage().clear();
				getLeipzigPassage().addAll((Collection<? extends LeipzigPassageType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__GLOSSE_PASSAGE:
				getGlossePassage().clear();
				getGlossePassage().addAll((Collection<? extends GlossePassageType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__PUNCTUATION:
				getPunctuation().clear();
				getPunctuation().addAll((Collection<? extends PunctuationType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_PUNCTUATION:
				getEgyPunctuation().clear();
				getEgyPunctuation().addAll((Collection<? extends EgyPunctuationType>)newValue);
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__PASSAGE_ID:
				setPassageID(newValue);
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
			case CorpusDTDneuPackage.GLOSSE_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_SENT:
				getEgySent().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB1:
				getEgyTB1().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_START:
				getEgyTB3Start().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_END:
				getEgyTB3End().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_WORD:
				getEgyWord().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__LINE_COUNT:
				getLineCount().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__NOTE:
				getNote().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__FORMATTING_ELEMENT:
				getFormattingElement().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__LANGUAGE_PASSAGE:
				getLanguagePassage().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__BAUSTEIN_PASSAGE:
				getBausteinPassage().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__LEIPZIG_PASSAGE:
				getLeipzigPassage().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__GLOSSE_PASSAGE:
				getGlossePassage().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__PUNCTUATION:
				getPunctuation().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_PUNCTUATION:
				getEgyPunctuation().clear();
				return;
			case CorpusDTDneuPackage.GLOSSE_TYPE__PASSAGE_ID:
				setPassageID(PASSAGE_ID_EDEFAULT);
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
			case CorpusDTDneuPackage.GLOSSE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_SENT:
				return !getEgySent().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB1:
				return !getEgyTB1().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_START:
				return !getEgyTB3Start().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_TB3_END:
				return !getEgyTB3End().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_WORD:
				return !getEgyWord().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__LINE_COUNT:
				return !getLineCount().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__NOTE:
				return !getNote().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__FORMATTING_ELEMENT:
				return !getFormattingElement().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__LANGUAGE_PASSAGE:
				return !getLanguagePassage().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__BAUSTEIN_PASSAGE:
				return !getBausteinPassage().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__LEIPZIG_PASSAGE:
				return !getLeipzigPassage().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__GLOSSE_PASSAGE:
				return !getGlossePassage().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__PUNCTUATION:
				return !getPunctuation().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__EGY_PUNCTUATION:
				return !getEgyPunctuation().isEmpty();
			case CorpusDTDneuPackage.GLOSSE_TYPE__PASSAGE_ID:
				return PASSAGE_ID_EDEFAULT == null ? passageID != null : !PASSAGE_ID_EDEFAULT.equals(passageID);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", passageID: ");
		result.append(passageID);
		result.append(')');
		return result.toString();
	}

} //GlosseTypeImpl
