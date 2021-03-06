/**
 * generated by Xtext 2.14.0
 */
package ale.xtext.ale.util;

import ale.xtext.ale.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ale.xtext.ale.AlePackage
 * @generated
 */
public class AleAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AleAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AlePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AleSwitch<Adapter> modelSwitch =
    new AleSwitch<Adapter>()
    {
      @Override
      public Adapter caseAleRoot(AleRoot object)
      {
        return createAleRootAdapter();
      }
      @Override
      public Adapter caseEcoreImport(EcoreImport object)
      {
        return createEcoreImportAdapter();
      }
      @Override
      public Adapter caseAleImport(AleImport object)
      {
        return createAleImportAdapter();
      }
      @Override
      public Adapter caseAleClass(AleClass object)
      {
        return createAleClassAdapter();
      }
      @Override
      public Adapter caseAleMethod(AleMethod object)
      {
        return createAleMethodAdapter();
      }
      @Override
      public Adapter caseConcreteMethod(ConcreteMethod object)
      {
        return createConcreteMethodAdapter();
      }
      @Override
      public Adapter caseAbstractMethod(AbstractMethod object)
      {
        return createAbstractMethodAdapter();
      }
      @Override
      public Adapter caseDefMethod(DefMethod object)
      {
        return createDefMethodAdapter();
      }
      @Override
      public Adapter caseOverrideMethod(OverrideMethod object)
      {
        return createOverrideMethodAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.AleRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.AleRoot
   * @generated
   */
  public Adapter createAleRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.EcoreImport <em>Ecore Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.EcoreImport
   * @generated
   */
  public Adapter createEcoreImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.AleImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.AleImport
   * @generated
   */
  public Adapter createAleImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.AleClass <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.AleClass
   * @generated
   */
  public Adapter createAleClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.AleMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.AleMethod
   * @generated
   */
  public Adapter createAleMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.ConcreteMethod <em>Concrete Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.ConcreteMethod
   * @generated
   */
  public Adapter createConcreteMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.AbstractMethod <em>Abstract Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.AbstractMethod
   * @generated
   */
  public Adapter createAbstractMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.DefMethod <em>Def Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.DefMethod
   * @generated
   */
  public Adapter createDefMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ale.xtext.ale.OverrideMethod <em>Override Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ale.xtext.ale.OverrideMethod
   * @generated
   */
  public Adapter createOverrideMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AleAdapterFactory
