/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Lemma Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaEntryImpl#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaEntryImpl#getWords <em>Words</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaEntryImpl#getTranslations <em>Translations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSLemmaEntryImpl extends BTSCorpusObjectImpl implements BTSLemmaEntry {
	/**
	 * The default value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected boolean ignore = IGNORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWords() <em>Words</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWords()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSWord> words;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected BTSTranslations translations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSLemmaEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_LEMMA_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnore() {
		return ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnore(boolean newIgnore) {
		boolean oldIgnore = ignore;
		ignore = newIgnore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_LEMMA_ENTRY__IGNORE, oldIgnore, ignore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSWord> getWords() {
		if (words == null) {
			words = new EObjectContainmentEList<BTSWord>(BTSWord.class, this, BtsCorpusModelPackage.BTS_LEMMA_ENTRY__WORDS);
		}
		return words;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSTranslations getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(BTSTranslations newTranslations, NotificationChain msgs) {
		BTSTranslations oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(BTSTranslations newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__WORDS:
				return ((InternalEList<?>)getWords()).basicRemove(otherEnd, msgs);
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
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
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__IGNORE:
				return isIgnore();
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__WORDS:
				return getWords();
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS:
				return getTranslations();
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
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__IGNORE:
				setIgnore((Boolean)newValue);
				return;
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__WORDS:
				getWords().clear();
				getWords().addAll((Collection<? extends BTSWord>)newValue);
				return;
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS:
				setTranslations((BTSTranslations)newValue);
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
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__IGNORE:
				setIgnore(IGNORE_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__WORDS:
				getWords().clear();
				return;
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS:
				setTranslations((BTSTranslations)null);
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
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__IGNORE:
				return ignore != IGNORE_EDEFAULT;
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__WORDS:
				return words != null && !words.isEmpty();
			case BtsCorpusModelPackage.BTS_LEMMA_ENTRY__TRANSLATIONS:
				return translations != null;
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
		result.append(" (ignore: ");
		result.append(ignore);
		result.append(')');
		return result.toString();
	}
	

} //BTSLemmaEntryImpl
