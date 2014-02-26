/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.util.Date;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.GraphicSelectionCounter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic Selection Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.GraphicSelectionCounterImpl#getDateOfLastSelection <em>Date Of Last Selection</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.GraphicSelectionCounterImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphicSelectionCounterImpl extends BTSDBBaseObjectImpl implements GraphicSelectionCounter {
	/**
	 * The default value of the '{@link #getDateOfLastSelection() <em>Date Of Last Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfLastSelection()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_LAST_SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfLastSelection() <em>Date Of Last Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfLastSelection()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfLastSelection = DATE_OF_LAST_SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected int counter = COUNTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicSelectionCounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsmodelPackage.Literals.GRAPHIC_SELECTION_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfLastSelection() {
		return dateOfLastSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfLastSelection(Date newDateOfLastSelection) {
		Date oldDateOfLastSelection = dateOfLastSelection;
		dateOfLastSelection = newDateOfLastSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__DATE_OF_LAST_SELECTION, oldDateOfLastSelection, dateOfLastSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(int newCounter) {
		int oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__COUNTER, oldCounter, counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__DATE_OF_LAST_SELECTION:
				return getDateOfLastSelection();
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__COUNTER:
				return getCounter();
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
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__DATE_OF_LAST_SELECTION:
				setDateOfLastSelection((Date)newValue);
				return;
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__COUNTER:
				setCounter((Integer)newValue);
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
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__DATE_OF_LAST_SELECTION:
				setDateOfLastSelection(DATE_OF_LAST_SELECTION_EDEFAULT);
				return;
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__COUNTER:
				setCounter(COUNTER_EDEFAULT);
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
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__DATE_OF_LAST_SELECTION:
				return DATE_OF_LAST_SELECTION_EDEFAULT == null ? dateOfLastSelection != null : !DATE_OF_LAST_SELECTION_EDEFAULT.equals(dateOfLastSelection);
			case BtsmodelPackage.GRAPHIC_SELECTION_COUNTER__COUNTER:
				return counter != COUNTER_EDEFAULT;
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
		result.append(" (dateOfLastSelection: ");
		result.append(dateOfLastSelection);
		result.append(", counter: ");
		result.append(counter);
		result.append(')');
		return result.toString();
	}

} //GraphicSelectionCounterImpl
