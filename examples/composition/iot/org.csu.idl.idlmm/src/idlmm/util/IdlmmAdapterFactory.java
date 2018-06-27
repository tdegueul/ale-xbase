/**
 */
package idlmm.util;

import idlmm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see idlmm.IdlmmPackage
 * @generated
 */
public class IdlmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdlmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IdlmmPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected IdlmmSwitch<Adapter> modelSwitch =
		new IdlmmSwitch<Adapter>() {
			@Override
			public Adapter caseOperationDef(OperationDef object) {
				return createOperationDefAdapter();
			}
			@Override
			public Adapter caseContained(Contained object) {
				return createContainedAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseIDLType(IDLType object) {
				return createIDLTypeAdapter();
			}
			@Override
			public Adapter caseParameterDef(ParameterDef object) {
				return createParameterDefAdapter();
			}
			@Override
			public Adapter caseExceptionDef(ExceptionDef object) {
				return createExceptionDefAdapter();
			}
			@Override
			public Adapter caseFieldI(FieldI object) {
				return createFieldIAdapter();
			}
			@Override
			public Adapter casePrimitiveDef(PrimitiveDef object) {
				return createPrimitiveDefAdapter();
			}
			@Override
			public Adapter caseIdlStmt(IdlStmt object) {
				return createIdlStmtAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link idlmm.OperationDef <em>Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.OperationDef
	 * @generated
	 */
	public Adapter createOperationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.Contained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.Contained
	 * @generated
	 */
	public Adapter createContainedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.IDLType <em>IDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.IDLType
	 * @generated
	 */
	public Adapter createIDLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.ParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.ParameterDef
	 * @generated
	 */
	public Adapter createParameterDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.ExceptionDef <em>Exception Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.ExceptionDef
	 * @generated
	 */
	public Adapter createExceptionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.FieldI <em>Field I</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.FieldI
	 * @generated
	 */
	public Adapter createFieldIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.PrimitiveDef <em>Primitive Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.PrimitiveDef
	 * @generated
	 */
	public Adapter createPrimitiveDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.IdlStmt <em>Idl Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.IdlStmt
	 * @generated
	 */
	public Adapter createIdlStmtAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IdlmmAdapterFactory
