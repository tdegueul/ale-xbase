/**
 */
package boolexp;

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
 * @see boolexp.BoolexpFactory
 * @model kind="package"
 * @generated
 */
public interface BoolexpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boolexp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://boolexp/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boolexp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoolexpPackage eINSTANCE = boolexp.impl.BoolexpPackageImpl.init();

	/**
	 * The meta object id for the '{@link boolexp.impl.ExpImpl <em>Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolexp.impl.ExpImpl
	 * @see boolexp.impl.BoolexpPackageImpl#getExp()
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
	 * The meta object id for the '{@link boolexp.impl.BinaryExpImpl <em>Binary Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolexp.impl.BinaryExpImpl
	 * @see boolexp.impl.BoolexpPackageImpl#getBinaryExp()
	 * @generated
	 */
	int BINARY_EXP = 1;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXP__LHS = EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXP__RHS = EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXP_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolexp.impl.LitImpl <em>Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolexp.impl.LitImpl
	 * @see boolexp.impl.BoolexpPackageImpl#getLit()
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
	 * The meta object id for the '{@link boolexp.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolexp.impl.AndImpl
	 * @see boolexp.impl.BoolexpPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 3;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BINARY_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boolexp.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolexp.impl.OrImpl
	 * @see boolexp.impl.BoolexpPackageImpl#getOr()
	 * @generated
	 */
	int OR = 4;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LHS = BINARY_EXP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RHS = BINARY_EXP__RHS;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BINARY_EXP_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link boolexp.impl.TruImpl <em>Tru</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolexp.impl.TruImpl
	 * @see boolexp.impl.BoolexpPackageImpl#getTru()
	 * @generated
	 */
	int TRU = 5;

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
	 * The meta object id for the '{@link boolexp.impl.FalsImpl <em>Fals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boolexp.impl.FalsImpl
	 * @see boolexp.impl.BoolexpPackageImpl#getFals()
	 * @generated
	 */
	int FALS = 6;

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
	 * Returns the meta object for class '{@link boolexp.Exp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp</em>'.
	 * @see boolexp.Exp
	 * @generated
	 */
	EClass getExp();

	/**
	 * Returns the meta object for class '{@link boolexp.BinaryExp <em>Binary Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Exp</em>'.
	 * @see boolexp.BinaryExp
	 * @generated
	 */
	EClass getBinaryExp();

	/**
	 * Returns the meta object for the containment reference '{@link boolexp.BinaryExp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boolexp.BinaryExp#getLhs()
	 * @see #getBinaryExp()
	 * @generated
	 */
	EReference getBinaryExp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boolexp.BinaryExp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boolexp.BinaryExp#getRhs()
	 * @see #getBinaryExp()
	 * @generated
	 */
	EReference getBinaryExp_Rhs();

	/**
	 * Returns the meta object for class '{@link boolexp.Lit <em>Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lit</em>'.
	 * @see boolexp.Lit
	 * @generated
	 */
	EClass getLit();

	/**
	 * Returns the meta object for class '{@link boolexp.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see boolexp.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link boolexp.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see boolexp.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link boolexp.Tru <em>Tru</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tru</em>'.
	 * @see boolexp.Tru
	 * @generated
	 */
	EClass getTru();

	/**
	 * Returns the meta object for class '{@link boolexp.Fals <em>Fals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fals</em>'.
	 * @see boolexp.Fals
	 * @generated
	 */
	EClass getFals();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoolexpFactory getBoolexpFactory();

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
		 * The meta object literal for the '{@link boolexp.impl.ExpImpl <em>Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolexp.impl.ExpImpl
		 * @see boolexp.impl.BoolexpPackageImpl#getExp()
		 * @generated
		 */
		EClass EXP = eINSTANCE.getExp();

		/**
		 * The meta object literal for the '{@link boolexp.impl.BinaryExpImpl <em>Binary Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolexp.impl.BinaryExpImpl
		 * @see boolexp.impl.BoolexpPackageImpl#getBinaryExp()
		 * @generated
		 */
		EClass BINARY_EXP = eINSTANCE.getBinaryExp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXP__LHS = eINSTANCE.getBinaryExp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXP__RHS = eINSTANCE.getBinaryExp_Rhs();

		/**
		 * The meta object literal for the '{@link boolexp.impl.LitImpl <em>Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolexp.impl.LitImpl
		 * @see boolexp.impl.BoolexpPackageImpl#getLit()
		 * @generated
		 */
		EClass LIT = eINSTANCE.getLit();

		/**
		 * The meta object literal for the '{@link boolexp.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolexp.impl.AndImpl
		 * @see boolexp.impl.BoolexpPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link boolexp.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolexp.impl.OrImpl
		 * @see boolexp.impl.BoolexpPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link boolexp.impl.TruImpl <em>Tru</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolexp.impl.TruImpl
		 * @see boolexp.impl.BoolexpPackageImpl#getTru()
		 * @generated
		 */
		EClass TRU = eINSTANCE.getTru();

		/**
		 * The meta object literal for the '{@link boolexp.impl.FalsImpl <em>Fals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boolexp.impl.FalsImpl
		 * @see boolexp.impl.BoolexpPackageImpl#getFals()
		 * @generated
		 */
		EClass FALS = eINSTANCE.getFals();

	}

} //BoolexpPackage
