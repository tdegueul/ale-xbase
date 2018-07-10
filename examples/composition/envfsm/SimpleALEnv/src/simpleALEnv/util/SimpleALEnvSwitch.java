/**
 */
package simpleALEnv.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import simpleALEnv.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see simpleALEnv.SimpleALEnvPackage
 * @generated
 */
public class SimpleALEnvSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleALEnvPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleALEnvSwitch() {
		if (modelPackage == null) {
			modelPackage = SimpleALEnvPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimpleALEnvPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.STMT: {
				Stmt stmt = (Stmt)theEObject;
				T result = caseStmt(stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.ARITH: {
				Arith arith = (Arith)theEObject;
				T result = caseArith(arith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.AL_VAR_REF: {
				ALVarRef alVarRef = (ALVarRef)theEObject;
				T result = caseALVarRef(alVarRef);
				if (result == null) result = caseArith(alVarRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.ARITH_LIT: {
				ArithLit arithLit = (ArithLit)theEObject;
				T result = caseArithLit(arithLit);
				if (result == null) result = caseArith(arithLit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.ARITH_OP: {
				ArithOp arithOp = (ArithOp)theEObject;
				T result = caseArithOp(arithOp);
				if (result == null) result = caseArith(arithOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.ARITH_PLUS: {
				ArithPlus arithPlus = (ArithPlus)theEObject;
				T result = caseArithPlus(arithPlus);
				if (result == null) result = caseArithOp(arithPlus);
				if (result == null) result = caseArith(arithPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.ARITH_MINUS: {
				ArithMinus arithMinus = (ArithMinus)theEObject;
				T result = caseArithMinus(arithMinus);
				if (result == null) result = caseArithOp(arithMinus);
				if (result == null) result = caseArith(arithMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.PRINT: {
				Print print = (Print)theEObject;
				T result = casePrint(print);
				if (result == null) result = caseStmt(print);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseStmt(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.IF_STMT: {
				IfStmt ifStmt = (IfStmt)theEObject;
				T result = caseIfStmt(ifStmt);
				if (result == null) result = caseStmt(ifStmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.RAND_RANGE: {
				RandRange randRange = (RandRange)theEObject;
				T result = caseRandRange(randRange);
				if (result == null) result = caseArith(randRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleALEnvPackage.EQUALITY_TEST: {
				EqualityTest equalityTest = (EqualityTest)theEObject;
				T result = caseEqualityTest(equalityTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStmt(Stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arith</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arith</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArith(Arith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AL Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AL Var Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALVarRef(ALVarRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arith Lit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arith Lit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithLit(ArithLit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arith Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arith Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithOp(ArithOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arith Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arith Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithPlus(ArithPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arith Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arith Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithMinus(ArithMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrint(Print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStmt(IfStmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rand Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rand Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandRange(RandRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityTest(EqualityTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimpleALEnvSwitch
