/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.impl;

import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.Ending;
import org.bbaw.bts.corpus.text.egy.egyDsl.SuffixChars;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ending</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EndingImpl#getChars <em>Chars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndingImpl extends WordEndingImpl implements Ending
{
  /**
   * The cached value of the '{@link #getChars() <em>Chars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChars()
   * @generated
   * @ordered
   */
  protected SuffixChars chars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndingImpl()
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
    return EgyDslPackage.Literals.ENDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuffixChars getChars()
  {
    return chars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChars(SuffixChars newChars, NotificationChain msgs)
  {
    SuffixChars oldChars = chars;
    chars = newChars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgyDslPackage.ENDING__CHARS, oldChars, newChars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChars(SuffixChars newChars)
  {
    if (newChars != chars)
    {
      NotificationChain msgs = null;
      if (chars != null)
        msgs = ((InternalEObject)chars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.ENDING__CHARS, null, msgs);
      if (newChars != null)
        msgs = ((InternalEObject)newChars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.ENDING__CHARS, null, msgs);
      msgs = basicSetChars(newChars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgyDslPackage.ENDING__CHARS, newChars, newChars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EgyDslPackage.ENDING__CHARS:
        return basicSetChars(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EgyDslPackage.ENDING__CHARS:
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
      case EgyDslPackage.ENDING__CHARS:
        setChars((SuffixChars)newValue);
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
      case EgyDslPackage.ENDING__CHARS:
        setChars((SuffixChars)null);
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
      case EgyDslPackage.ENDING__CHARS:
        return chars != null;
    }
    return super.eIsSet(featureID);
  }

} //EndingImpl
