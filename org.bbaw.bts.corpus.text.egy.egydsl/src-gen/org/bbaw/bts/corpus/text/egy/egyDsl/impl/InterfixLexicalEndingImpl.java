/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.impl;

import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical;
import org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexicalEnding;
import org.bbaw.bts.corpus.text.egy.egyDsl.SuffixChars;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interfix Lexical Ending</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalEndingImpl#getInterfix <em>Interfix</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalEndingImpl#getChars <em>Chars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfixLexicalEndingImpl extends MinimalEObjectImpl.Container implements InterfixLexicalEnding
{
  /**
   * The cached value of the '{@link #getInterfix() <em>Interfix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfix()
   * @generated
   * @ordered
   */
  protected InterfixLexical interfix;

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
  protected InterfixLexicalEndingImpl()
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
    return EgyDslPackage.Literals.INTERFIX_LEXICAL_ENDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfixLexical getInterfix()
  {
    return interfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfix(InterfixLexical newInterfix, NotificationChain msgs)
  {
    InterfixLexical oldInterfix = interfix;
    interfix = newInterfix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX, oldInterfix, newInterfix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfix(InterfixLexical newInterfix)
  {
    if (newInterfix != interfix)
    {
      NotificationChain msgs = null;
      if (interfix != null)
        msgs = ((InternalEObject)interfix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX, null, msgs);
      if (newInterfix != null)
        msgs = ((InternalEObject)newInterfix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX, null, msgs);
      msgs = basicSetInterfix(newInterfix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX, newInterfix, newInterfix));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS, oldChars, newChars);
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
        msgs = ((InternalEObject)chars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS, null, msgs);
      if (newChars != null)
        msgs = ((InternalEObject)newChars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS, null, msgs);
      msgs = basicSetChars(newChars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS, newChars, newChars));
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
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX:
        return basicSetInterfix(null, msgs);
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS:
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
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX:
        return getInterfix();
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS:
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
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX:
        setInterfix((InterfixLexical)newValue);
        return;
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS:
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
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX:
        setInterfix((InterfixLexical)null);
        return;
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS:
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
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__INTERFIX:
        return interfix != null;
      case EgyDslPackage.INTERFIX_LEXICAL_ENDING__CHARS:
        return chars != null;
    }
    return super.eIsSet(featureID);
  }

} //InterfixLexicalEndingImpl
