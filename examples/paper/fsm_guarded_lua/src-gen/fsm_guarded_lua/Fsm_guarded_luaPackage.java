/**
 */
package fsm_guarded_lua;

import basicFsmEnv.BasicFsmEnvPackage;

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
 * @see fsm_guarded_lua.Fsm_guarded_luaFactory
 * @model kind="package"
 *        annotation="@BrewRequires platform:/resource/BasicFsmEnv/model/basicFsmEnv.ecore='ecoreUrl' platform:/resource/org.xtext.lua/model/generated/Lua.ecore='ecoreUrl'"
 * @generated
 */
public interface Fsm_guarded_luaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsm_guarded_lua";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fsm_guarded_lua";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsm_guarded_lua";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fsm_guarded_luaPackage eINSTANCE = fsm_guarded_lua.impl.Fsm_guarded_luaPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsm_guarded_lua.impl.ActionBindStatementImpl <em>Action Bind Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsm_guarded_lua.impl.ActionBindStatementImpl
	 * @see fsm_guarded_lua.impl.Fsm_guarded_luaPackageImpl#getActionBindStatement()
	 * @generated
	 */
	int ACTION_BIND_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND_STATEMENT__DELEGATE = BasicFsmEnvPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Bind Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND_STATEMENT_FEATURE_COUNT = BasicFsmEnvPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Bind Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND_STATEMENT_OPERATION_COUNT = BasicFsmEnvPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsm_guarded_lua.impl.GuardBindExpressionImpl <em>Guard Bind Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsm_guarded_lua.impl.GuardBindExpressionImpl
	 * @see fsm_guarded_lua.impl.Fsm_guarded_luaPackageImpl#getGuardBindExpression()
	 * @generated
	 */
	int GUARD_BIND_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_EXPRESSION__DELEGATE = BasicFsmEnvPackage.GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guard Bind Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_EXPRESSION_FEATURE_COUNT = BasicFsmEnvPackage.GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guard Bind Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_EXPRESSION_OPERATION_COUNT = BasicFsmEnvPackage.GUARD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fsm_guarded_lua.ActionBindStatement <em>Action Bind Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Bind Statement</em>'.
	 * @see fsm_guarded_lua.ActionBindStatement
	 * @generated
	 */
	EClass getActionBindStatement();

	/**
	 * Returns the meta object for the reference '{@link fsm_guarded_lua.ActionBindStatement#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see fsm_guarded_lua.ActionBindStatement#getDelegate()
	 * @see #getActionBindStatement()
	 * @generated
	 */
	EReference getActionBindStatement_Delegate();

	/**
	 * Returns the meta object for class '{@link fsm_guarded_lua.GuardBindExpression <em>Guard Bind Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Bind Expression</em>'.
	 * @see fsm_guarded_lua.GuardBindExpression
	 * @generated
	 */
	EClass getGuardBindExpression();

	/**
	 * Returns the meta object for the reference '{@link fsm_guarded_lua.GuardBindExpression#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see fsm_guarded_lua.GuardBindExpression#getDelegate()
	 * @see #getGuardBindExpression()
	 * @generated
	 */
	EReference getGuardBindExpression_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Fsm_guarded_luaFactory getFsm_guarded_luaFactory();

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
		 * The meta object literal for the '{@link fsm_guarded_lua.impl.ActionBindStatementImpl <em>Action Bind Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsm_guarded_lua.impl.ActionBindStatementImpl
		 * @see fsm_guarded_lua.impl.Fsm_guarded_luaPackageImpl#getActionBindStatement()
		 * @generated
		 */
		EClass ACTION_BIND_STATEMENT = eINSTANCE.getActionBindStatement();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BIND_STATEMENT__DELEGATE = eINSTANCE.getActionBindStatement_Delegate();

		/**
		 * The meta object literal for the '{@link fsm_guarded_lua.impl.GuardBindExpressionImpl <em>Guard Bind Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsm_guarded_lua.impl.GuardBindExpressionImpl
		 * @see fsm_guarded_lua.impl.Fsm_guarded_luaPackageImpl#getGuardBindExpression()
		 * @generated
		 */
		EClass GUARD_BIND_EXPRESSION = eINSTANCE.getGuardBindExpression();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_BIND_EXPRESSION__DELEGATE = eINSTANCE.getGuardBindExpression_Delegate();

	}

} //Fsm_guarded_luaPackage
