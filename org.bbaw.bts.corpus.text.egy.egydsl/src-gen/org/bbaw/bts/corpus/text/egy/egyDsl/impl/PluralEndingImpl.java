/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.impl;

import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.PluralEnding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plural Ending</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralEndingImpl#getChars <em>Chars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PluralEndingImpl extends WordEndingImpl implements PluralEnding
{
  /**
   * The default value of the '{@link #getChars() <em>Chars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChars()
   * @generated
   * @ordered
   */
  protected static final String CHARS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChars() <em>Chars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChars()
   * @generated
   * @ordered
   */
  protected String chars = CHARS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluralEndingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EgyDslPackage.Literals.PLURAL_ENDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChars()
  {
    return chars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChars(String newChars)
  {
    String oldChars = chars;
    chars = newChars;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgyDslPackage.PLURAL_ENDING__CHARS, oldChars, chars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EgyDslPackage.PLURAL_ENDING__CHARS:
        return getChars();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EgyDslPackage.PLURAL_ENDING__CHARS:
        setChars((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EgyDslPackage.PLURAL_ENDING__CHARS:
        setChars(CHARS_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EgyDslPackage.PLURAL_ENDING__CHARS:
        return CHARS_EDEFAULT == null ? chars != null : !CHARS_EDEFAULT.equals(chars);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (chars: ");
    result.append(chars);
    result.append(')');
    return result.toString();
  }

} //PluralEndingImpl
