/**
 */
package simpleALEnv.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simpleALEnv.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simpleALEnv.SimpleALEnvPackage
 * @generated
 */
public class SimpleALEnvAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleALEnvPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleALEnvAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimpleALEnvPackage.eINSTANCE;
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
	protected SimpleALEnvSwitch<Adapter> modelSwitch =
		new SimpleALEnvSwitch<Adapter>() {
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseStmt(Stmt object) {
				return createStmtAdapter();
			}
			@Override
			public Adapter caseArith(Arith object) {
				return createArithAdapter();
			}
			@Override
			public Adapter caseALVarRef(ALVarRef object) {
				return createALVarRefAdapter();
			}
			@Override
			public Adapter caseArithLit(ArithLit object) {
				return createArithLitAdapter();
			}
			@Override
			public Adapter caseArithOp(ArithOp object) {
				return createArithOpAdapter();
			}
			@Override
			public Adapter caseArithPlus(ArithPlus object) {
				return createArithPlusAdapter();
			}
			@Override
			public Adapter caseArithMinus(ArithMinus object) {
				return createArithMinusAdapter();
			}
			@Override
			public Adapter casePrint(Print object) {
				return createPrintAdapter();
			}
			@Override
			public Adapter caseAssign(Assign object) {
				return createAssignAdapter();
			}
			@Override
			public Adapter caseIfStmt(IfStmt object) {
				return createIfStmtAdapter();
			}
			@Override
			public Adapter caseRandRange(RandRange object) {
				return createRandRangeAdapter();
			}
			@Override
			public Adapter caseEqualityTest(EqualityTest object) {
				return createEqualityTestAdapter();
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
	 * Creates a new adapter for an object of class '{@link simpleALEnv.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.Stmt <em>Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.Stmt
	 * @generated
	 */
	public Adapter createStmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.Arith <em>Arith</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.Arith
	 * @generated
	 */
	public Adapter createArithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.ALVarRef <em>AL Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.ALVarRef
	 * @generated
	 */
	public Adapter createALVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.ArithLit <em>Arith Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.ArithLit
	 * @generated
	 */
	public Adapter createArithLitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.ArithOp <em>Arith Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.ArithOp
	 * @generated
	 */
	public Adapter createArithOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.ArithPlus <em>Arith Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.ArithPlus
	 * @generated
	 */
	public Adapter createArithPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.ArithMinus <em>Arith Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.ArithMinus
	 * @generated
	 */
	public Adapter createArithMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.Print
	 * @generated
	 */
	public Adapter createPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.IfStmt <em>If Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.IfStmt
	 * @generated
	 */
	public Adapter createIfStmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.RandRange <em>Rand Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.RandRange
	 * @generated
	 */
	public Adapter createRandRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleALEnv.EqualityTest <em>Equality Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleALEnv.EqualityTest
	 * @generated
	 */
	public Adapter createEqualityTestAdapter() {
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

} //SimpleALEnvAdapterFactory
