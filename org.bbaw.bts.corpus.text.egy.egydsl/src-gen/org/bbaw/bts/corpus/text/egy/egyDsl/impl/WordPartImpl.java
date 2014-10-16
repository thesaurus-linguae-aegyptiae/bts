/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.impl;

import java.util.Collection;

import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle;
import org.bbaw.bts.corpus.text.egy.egyDsl.WordPart;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl#getWChar <em>WChar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WordPartImpl extends MinimalEObjectImpl.Container implements WordPart
{
  /**
   * The cached value of the '{@link #getWChar() <em>WChar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWChar()
   * @generated
   * @ordered
   */
  protected EList<WordMiddle> wChar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WordPartImpl()
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
    return EgyDslPackage.Literals.WORD_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WordMiddle> getWChar()
  {
    if (wChar == null)
    {
      wChar = new EObjectContainmentEList<WordMiddle>(WordMiddle.class, this, EgyDslPackage.WORD_PART__WCHAR);
    }
    return wChar;
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
      case EgyDslPackage.WORD_PART__WCHAR:
        return ((InternalEList<?>)getWChar()).basicRemove(otherEnd, msgs);
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
      case EgyDslPackage.WORD_PART__WCHAR:
        return getWChar();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EgyDslPackage.WORD_PART__WCHAR:
        getWChar().clear();
        getWChar().addAll((Collection<? extends WordMiddle>)newValue);
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
      case EgyDslPackage.WORD_PART__WCHAR:
        getWChar().clear();
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
      case EgyDslPackage.WORD_PART__WCHAR:
        return wChar != null && !wChar.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WordPartImpl
