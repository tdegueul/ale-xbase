/**
 */
package simpleALEnv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simpleALEnv.SimpleALEnvPackage
 * @generated
 */
public interface SimpleALEnvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleALEnvFactory eINSTANCE = simpleALEnv.impl.SimpleALEnvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>AL Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AL Var Ref</em>'.
	 * @generated
	 */
	ALVarRef createALVarRef();

	/**
	 * Returns a new object of class '<em>Arith Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arith Lit</em>'.
	 * @generated
	 */
	ArithLit createArithLit();

	/**
	 * Returns a new object of class '<em>Arith Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arith Plus</em>'.
	 * @generated
	 */
	ArithPlus createArithPlus();

	/**
	 * Returns a new object of class '<em>Arith Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arith Minus</em>'.
	 * @generated
	 */
	ArithMinus createArithMinus();

	/**
	 * Returns a new object of class '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print</em>'.
	 * @generated
	 */
	Print createPrint();

	/**
	 * Returns a new object of class '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign</em>'.
	 * @generated
	 */
	Assign createAssign();

	/**
	 * Returns a new object of class '<em>If Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Stmt</em>'.
	 * @generated
	 */
	IfStmt createIfStmt();

	/**
	 * Returns a new object of class '<em>Rand Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rand Range</em>'.
	 * @generated
	 */
	RandRange createRandRange();

	/**
	 * Returns a new object of class '<em>Equality Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality Test</em>'.
	 * @generated
	 */
	EqualityTest createEqualityTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleALEnvPackage getSimpleALEnvPackage();

} //SimpleALEnvFactory
