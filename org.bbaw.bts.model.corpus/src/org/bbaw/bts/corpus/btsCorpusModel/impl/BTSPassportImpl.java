/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
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
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportImpl#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSPassportImpl extends MinimalEObjectImpl.Container implements BTSPassport {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSPassportEntry> children;

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
		return BtsCorpusModelPackage.Literals.BTS_PASSPORT;
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
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT__DATE, oldDate, newDate);
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
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_PASSPORT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BtsCorpusModelPackage.BTS_PASSPORT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSPassportEntry> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<BTSPassportEntry>(BTSPassportEntry.class, this, BtsCorpusModelPackage.BTS_PASSPORT__CHILDREN);
		}
		return children;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_PASSPORT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSTranslations> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EObjectContainmentEList<BTSTranslations>(BTSTranslations.class, this, BtsCorpusModelPackage.BTS_PASSPORT__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public BTSPassportEntry getPassportEntryByPath(String path) {
		if (path == null) return null;
		String[] pathEntries = path.split(">>");
		BTSPassportEntry entry = findPassportEntryRecursively(this.getChildren(), pathEntries, 0);
		return entry;
		
	}

	private BTSPassportEntry findPassportEntryRecursively(EList<BTSPassportEntry> eList, String[] pathEntries,
			int index) {
		if (index >= pathEntries.length || pathEntries[index] == null) return null;
		String entryType = pathEntries[index];
		BTSPassportEntry entry = null;
		for (BTSPassportEntry child : eList)
		{
			if (entryType.equals(child.getType()))
			{
				entry = child;
				break;
			}
		}
		if (index == (pathEntries.length - 1))
		{
			return entry;
		}
		else if (entry != null)
		{
			return findPassportEntryRecursively(entry.getChildren(), pathEntries, index + 1);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public String getPassportEntryStringValueByPath(String path) {
		BTSPassportEntry entry = getPassportEntryByPath(path);
		if (entry != null)
		{
			return entry.getValue();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_PASSPORT__DATE:
				return basicSetDate(null, msgs);
			case BtsCorpusModelPackage.BTS_PASSPORT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case BtsCorpusModelPackage.BTS_PASSPORT__DESCRIPTIONS:
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
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_PASSPORT__DATE:
				return getDate();
			case BtsCorpusModelPackage.BTS_PASSPORT__CHILDREN:
				return getChildren();
			case BtsCorpusModelPackage.BTS_PASSPORT__COMMENT:
				return getComment();
			case BtsCorpusModelPackage.BTS_PASSPORT__DESCRIPTIONS:
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
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_PASSPORT__DATE:
				setDate((BTSTimespan)newValue);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends BTSPassportEntry>)newValue);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT__COMMENT:
				setComment((String)newValue);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT__DESCRIPTIONS:
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
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_PASSPORT__DATE:
				setDate((BTSTimespan)null);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT__CHILDREN:
				getChildren().clear();
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BtsCorpusModelPackage.BTS_PASSPORT__DESCRIPTIONS:
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
		switch (featureID) {
			case BtsCorpusModelPackage.BTS_PASSPORT__DATE:
				return date != null;
			case BtsCorpusModelPackage.BTS_PASSPORT__CHILDREN:
				return children != null && !children.isEmpty();
			case BtsCorpusModelPackage.BTS_PASSPORT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BtsCorpusModelPackage.BTS_PASSPORT__DESCRIPTIONS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BtsCorpusModelPackage.BTS_PASSPORT___GET_PASSPORT_ENTRY_BY_PATH__STRING:
				return getPassportEntryByPath((String)arguments.get(0));
			case BtsCorpusModelPackage.BTS_PASSPORT___GET_PASSPORT_ENTRY_STRING_VALUE_BY_PATH__STRING:
				return getPassportEntryStringValueByPath((String)arguments.get(0));
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //BTSPassportImpl
