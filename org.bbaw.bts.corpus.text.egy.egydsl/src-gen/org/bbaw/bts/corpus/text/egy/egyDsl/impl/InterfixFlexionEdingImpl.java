/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.impl;

import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding;
import org.bbaw.bts.corpus.text.egy.egyDsl.SuffixChars;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interfix Flexion Eding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionEdingImpl#getInterfix <em>Interfix</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionEdingImpl#getChars <em>Chars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfixFlexionEdingImpl extends MinimalEObjectImpl.Container implements InterfixFlexionEding
{
  /**
   * The cached value of the '{@link #getInterfix() <em>Interfix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfix()
   * @generated
   * @ordered
   */
  protected InterfixFlexion interfix;

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
  protected InterfixFlexionEdingImpl()
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
    return EgyDslPackage.Literals.INTERFIX_FLEXION_EDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixFlexion getInterfix()
  {
    return interfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfix(InterfixFlexion newInterfix, NotificationChain msgs)
  {
    InterfixFlexion oldInterfix = interfix;
    interfix = newInterfix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX, oldInterfix, newInterfix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfix(InterfixFlexion newInterfix)
  {
    if (newInterfix != interfix)
    {
      NotificationChain msgs = null;
      if (interfix != null)
        msgs = ((InternalEObject)interfix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX, null, msgs);
      if (newInterfix != null)
        msgs = ((InternalEObject)newInterfix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX, null, msgs);
      msgs = basicSetInterfix(newInterfix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX, newInterfix, newInterfix));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS, oldChars, newChars);
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
        msgs = ((InternalEObject)chars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS, null, msgs);
      if (newChars != null)
        msgs = ((InternalEObject)newChars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS, null, msgs);
      msgs = basicSetChars(newChars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS, newChars, newChars));
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
      case EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX:
        return basicSetInterfix(null, msgs);
      case EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS:
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
      case EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX:
        return getInterfix();
      case EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS:
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
      case EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX:
        setInterfix((InterfixFlexion)newValue);
        return;
      case EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS:
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
      case EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX:
        setInterfix((InterfixFlexion)null);
        return;
      case EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS:
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
      case EgyDslPackage.INTERFIX_FLEXION_EDING__INTERFIX:
        return interfix != null;
      case EgyDslPackage.INTERFIX_FLEXION_EDING__CHARS:
        return chars != null;
    }
    return super.eIsSet(featureID);
  }

} //InterfixFlexionEdingImpl
