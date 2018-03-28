/**
 * generated by Xtext 2.12.0
 */
package brew.xtext.brew.impl;

import brew.xtext.brew.AleImport;
import brew.xtext.brew.BrewPackage;
import brew.xtext.brew.BrewRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link brew.xtext.brew.impl.BrewRootImpl#getImportSemantics <em>Import Semantics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrewRootImpl extends MinimalEObjectImpl.Container implements BrewRoot
{
  /**
   * The cached value of the '{@link #getImportSemantics() <em>Import Semantics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportSemantics()
   * @generated
   * @ordered
   */
  protected EList<AleImport> importSemantics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BrewRootImpl()
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
    return BrewPackage.Literals.BREW_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AleImport> getImportSemantics()
  {
    if (importSemantics == null)
    {
      importSemantics = new EObjectContainmentEList<AleImport>(AleImport.class, this, BrewPackage.BREW_ROOT__IMPORT_SEMANTICS);
    }
    return importSemantics;
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
      case BrewPackage.BREW_ROOT__IMPORT_SEMANTICS:
        return ((InternalEList<?>)getImportSemantics()).basicRemove(otherEnd, msgs);
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
      case BrewPackage.BREW_ROOT__IMPORT_SEMANTICS:
        return getImportSemantics();
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
      case BrewPackage.BREW_ROOT__IMPORT_SEMANTICS:
        getImportSemantics().clear();
        getImportSemantics().addAll((Collection<? extends AleImport>)newValue);
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
      case BrewPackage.BREW_ROOT__IMPORT_SEMANTICS:
        getImportSemantics().clear();
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
      case BrewPackage.BREW_ROOT__IMPORT_SEMANTICS:
        return importSemantics != null && !importSemantics.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BrewRootImpl