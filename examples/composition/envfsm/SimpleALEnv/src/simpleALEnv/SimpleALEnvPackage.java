/**
 */
package simpleALEnv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simpleALEnv.SimpleALEnvFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleALEnvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleALEnv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simpleALEnv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleALEnv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleALEnvPackage eINSTANCE = simpleALEnv.impl.SimpleALEnvPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.BlockImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STMTS = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.StmtImpl <em>Stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.StmtImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getStmt()
	 * @generated
	 */
	int STMT = 1;

	/**
	 * The number of structural features of the '<em>Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.ArithImpl <em>Arith</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.ArithImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArith()
	 * @generated
	 */
	int ARITH = 2;

	/**
	 * The number of structural features of the '<em>Arith</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arith</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.ALVarRefImpl <em>AL Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.ALVarRefImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getALVarRef()
	 * @generated
	 */
	int AL_VAR_REF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AL_VAR_REF__NAME = ARITH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AL Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AL_VAR_REF_FEATURE_COUNT = ARITH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AL Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AL_VAR_REF_OPERATION_COUNT = ARITH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.ArithLitImpl <em>Arith Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.ArithLitImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArithLit()
	 * @generated
	 */
	int ARITH_LIT = 4;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_LIT__VAL = ARITH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arith Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_LIT_FEATURE_COUNT = ARITH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arith Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_LIT_OPERATION_COUNT = ARITH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.ArithOpImpl <em>Arith Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.ArithOpImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArithOp()
	 * @generated
	 */
	int ARITH_OP = 5;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP__LHS = ARITH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP__RHS = ARITH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arith Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_FEATURE_COUNT = ARITH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arith Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_OPERATION_COUNT = ARITH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.ArithPlusImpl <em>Arith Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.ArithPlusImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArithPlus()
	 * @generated
	 */
	int ARITH_PLUS = 6;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_PLUS__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_PLUS__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_PLUS_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_PLUS_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.ArithMinusImpl <em>Arith Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.ArithMinusImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArithMinus()
	 * @generated
	 */
	int ARITH_MINUS = 7;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_MINUS__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_MINUS__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_MINUS_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_MINUS_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.PrintImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__NAME = STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = STMT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleALEnv.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleALEnv.impl.AssignImpl
	 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__VAL = STMT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = STMT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link simpleALEnv.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see simpleALEnv.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleALEnv.Block#getStmts <em>Stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stmts</em>'.
	 * @see simpleALEnv.Block#getStmts()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Stmts();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.Stmt <em>Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stmt</em>'.
	 * @see simpleALEnv.Stmt
	 * @generated
	 */
	EClass getStmt();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.Arith <em>Arith</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith</em>'.
	 * @see simpleALEnv.Arith
	 * @generated
	 */
	EClass getArith();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.ALVarRef <em>AL Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AL Var Ref</em>'.
	 * @see simpleALEnv.ALVarRef
	 * @generated
	 */
	EClass getALVarRef();

	/**
	 * Returns the meta object for the attribute '{@link simpleALEnv.ALVarRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleALEnv.ALVarRef#getName()
	 * @see #getALVarRef()
	 * @generated
	 */
	EAttribute getALVarRef_Name();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.ArithLit <em>Arith Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Lit</em>'.
	 * @see simpleALEnv.ArithLit
	 * @generated
	 */
	EClass getArithLit();

	/**
	 * Returns the meta object for the attribute '{@link simpleALEnv.ArithLit#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see simpleALEnv.ArithLit#getVal()
	 * @see #getArithLit()
	 * @generated
	 */
	EAttribute getArithLit_Val();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.ArithOp <em>Arith Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Op</em>'.
	 * @see simpleALEnv.ArithOp
	 * @generated
	 */
	EClass getArithOp();

	/**
	 * Returns the meta object for the containment reference '{@link simpleALEnv.ArithOp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see simpleALEnv.ArithOp#getLhs()
	 * @see #getArithOp()
	 * @generated
	 */
	EReference getArithOp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link simpleALEnv.ArithOp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see simpleALEnv.ArithOp#getRhs()
	 * @see #getArithOp()
	 * @generated
	 */
	EReference getArithOp_Rhs();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.ArithPlus <em>Arith Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Plus</em>'.
	 * @see simpleALEnv.ArithPlus
	 * @generated
	 */
	EClass getArithPlus();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.ArithMinus <em>Arith Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Minus</em>'.
	 * @see simpleALEnv.ArithMinus
	 * @generated
	 */
	EClass getArithMinus();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see simpleALEnv.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for the attribute '{@link simpleALEnv.Print#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleALEnv.Print#getName()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_Name();

	/**
	 * Returns the meta object for class '{@link simpleALEnv.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see simpleALEnv.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the attribute '{@link simpleALEnv.Assign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleALEnv.Assign#getName()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Name();

	/**
	 * Returns the meta object for the containment reference '{@link simpleALEnv.Assign#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val</em>'.
	 * @see simpleALEnv.Assign#getVal()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Val();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleALEnvFactory getSimpleALEnvFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.BlockImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STMTS = eINSTANCE.getBlock_Stmts();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.StmtImpl <em>Stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.StmtImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getStmt()
		 * @generated
		 */
		EClass STMT = eINSTANCE.getStmt();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.ArithImpl <em>Arith</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.ArithImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArith()
		 * @generated
		 */
		EClass ARITH = eINSTANCE.getArith();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.ALVarRefImpl <em>AL Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.ALVarRefImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getALVarRef()
		 * @generated
		 */
		EClass AL_VAR_REF = eINSTANCE.getALVarRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AL_VAR_REF__NAME = eINSTANCE.getALVarRef_Name();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.ArithLitImpl <em>Arith Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.ArithLitImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArithLit()
		 * @generated
		 */
		EClass ARITH_LIT = eINSTANCE.getArithLit();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITH_LIT__VAL = eINSTANCE.getArithLit_Val();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.ArithOpImpl <em>Arith Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.ArithOpImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArithOp()
		 * @generated
		 */
		EClass ARITH_OP = eINSTANCE.getArithOp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITH_OP__LHS = eINSTANCE.getArithOp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITH_OP__RHS = eINSTANCE.getArithOp_Rhs();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.ArithPlusImpl <em>Arith Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.ArithPlusImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArithPlus()
		 * @generated
		 */
		EClass ARITH_PLUS = eINSTANCE.getArithPlus();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.ArithMinusImpl <em>Arith Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.ArithMinusImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getArithMinus()
		 * @generated
		 */
		EClass ARITH_MINUS = eINSTANCE.getArithMinus();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.PrintImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__NAME = eINSTANCE.getPrint_Name();

		/**
		 * The meta object literal for the '{@link simpleALEnv.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleALEnv.impl.AssignImpl
		 * @see simpleALEnv.impl.SimpleALEnvPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__NAME = eINSTANCE.getAssign_Name();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__VAL = eINSTANCE.getAssign_Val();

	}

} //SimpleALEnvPackage
