/**
 */
package boolExpEnv;

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
 * @see boolExpEnv.BoolExpEnvFactory
 * @model kind="package"
 * @generated
 */
public interface BoolExpEnvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boolExpEnv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/boolExpEnv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boolExpEnv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoolExpEnvPackage eINSTANCE = boolExpEnv.impl.BoolExpEnvPackageImpl.init();

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.ExpImpl <em>Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.ExpImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getExp()
	 * @generated
	 */
	int EXP = 0;

	/**
	 * The number of structural features of the '<em>Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.BinExpImpl <em>Bin Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.BinExpImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getBinExp()
	 * @generated
	 */
	int BIN_EXP = 1;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXP__LHS = EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXP__RHS = EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bin Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bin Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXP_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.LitImpl <em>Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.LitImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getLit()
	 * @generated
	 */
	int LIT = 2;

	/**
	 * The number of structural features of the '<em>Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIT_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIT_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.TruImpl <em>Tru</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.TruImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getTru()
	 * @generated
	 */
	int TRU = 3;

	/**
	 * The number of structural features of the '<em>Tru</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRU_FEATURE_COUNT = LIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tru</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRU_OPERATION_COUNT = LIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.FalsImpl <em>Fals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.FalsImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getFals()
	 * @generated
	 */
	int FALS = 4;

	/**
	 * The number of structural features of the '<em>Fals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALS_FEATURE_COUNT = LIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALS_OPERATION_COUNT = LIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.NotImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 5;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXP = EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.AndImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 6;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LHS = BIN_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RHS = BIN_EXP__RHS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BIN_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BIN_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.OrImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getOr()
	 * @generated
	 */
	int OR = 7;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LHS = BIN_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RHS = BIN_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BIN_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BIN_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolExpEnv.impl.VarRefImpl <em>Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolExpEnv.impl.VarRefImpl
	 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getVarRef()
	 * @generated
	 */
	int VAR_REF = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__NAME = EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link boolExpEnv.Exp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp</em>'.
	 * @see boolExpEnv.Exp
	 * @generated
	 */
	EClass getExp();

	/**
	 * Returns the meta object for class '{@link boolExpEnv.BinExp <em>Bin Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Exp</em>'.
	 * @see boolExpEnv.BinExp
	 * @generated
	 */
	EClass getBinExp();

	/**
	 * Returns the meta object for the containment reference '{@link boolExpEnv.BinExp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boolExpEnv.BinExp#getLhs()
	 * @see #getBinExp()
	 * @generated
	 */
	EReference getBinExp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boolExpEnv.BinExp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boolExpEnv.BinExp#getRhs()
	 * @see #getBinExp()
	 * @generated
	 */
	EReference getBinExp_Rhs();

	/**
	 * Returns the meta object for class '{@link boolExpEnv.Lit <em>Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lit</em>'.
	 * @see boolExpEnv.Lit
	 * @generated
	 */
	EClass getLit();

	/**
	 * Returns the meta object for class '{@link boolExpEnv.Tru <em>Tru</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tru</em>'.
	 * @see boolExpEnv.Tru
	 * @generated
	 */
	EClass getTru();

	/**
	 * Returns the meta object for class '{@link boolExpEnv.Fals <em>Fals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fals</em>'.
	 * @see boolExpEnv.Fals
	 * @generated
	 */
	EClass getFals();

	/**
	 * Returns the meta object for class '{@link boolExpEnv.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see boolExpEnv.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link boolExpEnv.Not#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see boolExpEnv.Not#getExp()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Exp();

	/**
	 * Returns the meta object for class '{@link boolExpEnv.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see boolExpEnv.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link boolExpEnv.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see boolExpEnv.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link boolExpEnv.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Ref</em>'.
	 * @see boolExpEnv.VarRef
	 * @generated
	 */
	EClass getVarRef();

	/**
	 * Returns the meta object for the attribute '{@link boolExpEnv.VarRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see boolExpEnv.VarRef#getName()
	 * @see #getVarRef()
	 * @generated
	 */
	EAttribute getVarRef_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoolExpEnvFactory getBoolExpEnvFactory();

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
		 * The meta object literal for the '{@link boolExpEnv.impl.ExpImpl <em>Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.ExpImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getExp()
		 * @generated
		 */
		EClass EXP = eINSTANCE.getExp();

		/**
		 * The meta object literal for the '{@link boolExpEnv.impl.BinExpImpl <em>Bin Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.BinExpImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getBinExp()
		 * @generated
		 */
		EClass BIN_EXP = eINSTANCE.getBinExp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_EXP__LHS = eINSTANCE.getBinExp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_EXP__RHS = eINSTANCE.getBinExp_Rhs();

		/**
		 * The meta object literal for the '{@link boolExpEnv.impl.LitImpl <em>Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.LitImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getLit()
		 * @generated
		 */
		EClass LIT = eINSTANCE.getLit();

		/**
		 * The meta object literal for the '{@link boolExpEnv.impl.TruImpl <em>Tru</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.TruImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getTru()
		 * @generated
		 */
		EClass TRU = eINSTANCE.getTru();

		/**
		 * The meta object literal for the '{@link boolExpEnv.impl.FalsImpl <em>Fals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.FalsImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getFals()
		 * @generated
		 */
		EClass FALS = eINSTANCE.getFals();

		/**
		 * The meta object literal for the '{@link boolExpEnv.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.NotImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXP = eINSTANCE.getNot_Exp();

		/**
		 * The meta object literal for the '{@link boolExpEnv.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.AndImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link boolExpEnv.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.OrImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link boolExpEnv.impl.VarRefImpl <em>Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolExpEnv.impl.VarRefImpl
		 * @see boolExpEnv.impl.BoolExpEnvPackageImpl#getVarRef()
		 * @generated
		 */
		EClass VAR_REF = eINSTANCE.getVarRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REF__NAME = eINSTANCE.getVarRef_Name();

	}

} //BoolExpEnvPackage
