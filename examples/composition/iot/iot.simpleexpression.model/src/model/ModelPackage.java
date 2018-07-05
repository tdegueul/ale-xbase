/**
 */
package model;

import activitydiagram.ActivitydiagramPackage;

import idlmm.IdlmmPackage;

import iot.IotPackage;

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
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.ExpressionBindSEExpressionImpl <em>Expression Bind SE Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ExpressionBindSEExpressionImpl
	 * @see model.impl.ModelPackageImpl#getExpressionBindSEExpression()
	 * @generated
	 */
	int EXPRESSION_BIND_SE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_SE_EXPRESSION__DELEGATE = ActivitydiagramPackage.EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Bind SE Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_SE_EXPRESSION_FEATURE_COUNT = ActivitydiagramPackage.EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Bind SE Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_SE_EXPRESSION_OPERATION_COUNT = ActivitydiagramPackage.EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BooleanVariableBindSEBooleanVariableImpl <em>Boolean Variable Bind SE Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BooleanVariableBindSEBooleanVariableImpl
	 * @see model.impl.ModelPackageImpl#getBooleanVariableBindSEBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__INITIAL_VALUE = ActivitydiagramPackage.BOOLEAN_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__CURRENT_VALUE = ActivitydiagramPackage.BOOLEAN_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE = ActivitydiagramPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Bind SE Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE_FEATURE_COUNT = ActivitydiagramPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Variable Bind SE Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE_OPERATION_COUNT = ActivitydiagramPackage.BOOLEAN_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.IntegerVariableBindSEIntegerVariableImpl <em>Integer Variable Bind SE Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.IntegerVariableBindSEIntegerVariableImpl
	 * @see model.impl.ModelPackageImpl#getIntegerVariableBindSEIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE__INITIAL_VALUE = ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE__CURRENT_VALUE = ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE__DELEGATE = ActivitydiagramPackage.INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Bind SE Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE_FEATURE_COUNT = ActivitydiagramPackage.INTEGER_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Variable Bind SE Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE_OPERATION_COUNT = ActivitydiagramPackage.INTEGER_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ExpressionBindOperationDefImpl <em>Expression Bind Operation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ExpressionBindOperationDefImpl
	 * @see model.impl.ModelPackageImpl#getExpressionBindOperationDef()
	 * @generated
	 */
	int EXPRESSION_BIND_OPERATION_DEF = 3;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_OPERATION_DEF__DELEGATE = ActivitydiagramPackage.EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Bind Operation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_OPERATION_DEF_FEATURE_COUNT = ActivitydiagramPackage.EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Bind Operation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_OPERATION_DEF_OPERATION_COUNT = ActivitydiagramPackage.EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.IoTActivityBindActivityImpl <em>Io TActivity Bind Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.IoTActivityBindActivityImpl
	 * @see model.impl.ModelPackageImpl#getIoTActivityBindActivity()
	 * @generated
	 */
	int IO_TACTIVITY_BIND_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTIVITY_BIND_ACTIVITY__DELEGATE = IotPackage.IOT_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Io TActivity Bind Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTIVITY_BIND_ACTIVITY_FEATURE_COUNT = IotPackage.IOT_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Io TActivity Bind Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTIVITY_BIND_ACTIVITY_OPERATION_COUNT = IotPackage.IOT_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.IotOperationDefBindOperationDefImpl <em>Iot Operation Def Bind Operation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.IotOperationDefBindOperationDefImpl
	 * @see model.impl.ModelPackageImpl#getIotOperationDefBindOperationDef()
	 * @generated
	 */
	int IOT_OPERATION_DEF_BIND_OPERATION_DEF = 5;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_OPERATION_DEF_BIND_OPERATION_DEF__DELEGATE = IotPackage.IOT_OPERATION_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iot Operation Def Bind Operation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_OPERATION_DEF_BIND_OPERATION_DEF_FEATURE_COUNT = IotPackage.IOT_OPERATION_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iot Operation Def Bind Operation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_OPERATION_DEF_BIND_OPERATION_DEF_OPERATION_COUNT = IotPackage.IOT_OPERATION_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.IdlStmtBindBlockImpl <em>Idl Stmt Bind Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.IdlStmtBindBlockImpl
	 * @see model.impl.ModelPackageImpl#getIdlStmtBindBlock()
	 * @generated
	 */
	int IDL_STMT_BIND_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STMT_BIND_BLOCK__DELEGATE = IdlmmPackage.IDL_STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Idl Stmt Bind Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STMT_BIND_BLOCK_FEATURE_COUNT = IdlmmPackage.IDL_STMT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Idl Stmt Bind Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STMT_BIND_BLOCK_OPERATION_COUNT = IdlmmPackage.IDL_STMT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link model.ExpressionBindSEExpression <em>Expression Bind SE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Bind SE Expression</em>'.
	 * @see model.ExpressionBindSEExpression
	 * @generated
	 */
	EClass getExpressionBindSEExpression();

	/**
	 * Returns the meta object for the containment reference '{@link model.ExpressionBindSEExpression#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see model.ExpressionBindSEExpression#getDelegate()
	 * @see #getExpressionBindSEExpression()
	 * @generated
	 */
	EReference getExpressionBindSEExpression_Delegate();

	/**
	 * Returns the meta object for class '{@link model.BooleanVariableBindSEBooleanVariable <em>Boolean Variable Bind SE Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Bind SE Boolean Variable</em>'.
	 * @see model.BooleanVariableBindSEBooleanVariable
	 * @generated
	 */
	EClass getBooleanVariableBindSEBooleanVariable();

	/**
	 * Returns the meta object for the containment reference '{@link model.BooleanVariableBindSEBooleanVariable#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see model.BooleanVariableBindSEBooleanVariable#getDelegate()
	 * @see #getBooleanVariableBindSEBooleanVariable()
	 * @generated
	 */
	EReference getBooleanVariableBindSEBooleanVariable_Delegate();

	/**
	 * Returns the meta object for class '{@link model.IntegerVariableBindSEIntegerVariable <em>Integer Variable Bind SE Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Bind SE Integer Variable</em>'.
	 * @see model.IntegerVariableBindSEIntegerVariable
	 * @generated
	 */
	EClass getIntegerVariableBindSEIntegerVariable();

	/**
	 * Returns the meta object for the containment reference '{@link model.IntegerVariableBindSEIntegerVariable#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see model.IntegerVariableBindSEIntegerVariable#getDelegate()
	 * @see #getIntegerVariableBindSEIntegerVariable()
	 * @generated
	 */
	EReference getIntegerVariableBindSEIntegerVariable_Delegate();

	/**
	 * Returns the meta object for class '{@link model.ExpressionBindOperationDef <em>Expression Bind Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Bind Operation Def</em>'.
	 * @see model.ExpressionBindOperationDef
	 * @generated
	 */
	EClass getExpressionBindOperationDef();

	/**
	 * Returns the meta object for the reference '{@link model.ExpressionBindOperationDef#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see model.ExpressionBindOperationDef#getDelegate()
	 * @see #getExpressionBindOperationDef()
	 * @generated
	 */
	EReference getExpressionBindOperationDef_Delegate();

	/**
	 * Returns the meta object for class '{@link model.IoTActivityBindActivity <em>Io TActivity Bind Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TActivity Bind Activity</em>'.
	 * @see model.IoTActivityBindActivity
	 * @generated
	 */
	EClass getIoTActivityBindActivity();

	/**
	 * Returns the meta object for the containment reference '{@link model.IoTActivityBindActivity#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see model.IoTActivityBindActivity#getDelegate()
	 * @see #getIoTActivityBindActivity()
	 * @generated
	 */
	EReference getIoTActivityBindActivity_Delegate();

	/**
	 * Returns the meta object for class '{@link model.IotOperationDefBindOperationDef <em>Iot Operation Def Bind Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iot Operation Def Bind Operation Def</em>'.
	 * @see model.IotOperationDefBindOperationDef
	 * @generated
	 */
	EClass getIotOperationDefBindOperationDef();

	/**
	 * Returns the meta object for the containment reference '{@link model.IotOperationDefBindOperationDef#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see model.IotOperationDefBindOperationDef#getDelegate()
	 * @see #getIotOperationDefBindOperationDef()
	 * @generated
	 */
	EReference getIotOperationDefBindOperationDef_Delegate();

	/**
	 * Returns the meta object for class '{@link model.IdlStmtBindBlock <em>Idl Stmt Bind Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idl Stmt Bind Block</em>'.
	 * @see model.IdlStmtBindBlock
	 * @generated
	 */
	EClass getIdlStmtBindBlock();

	/**
	 * Returns the meta object for the containment reference '{@link model.IdlStmtBindBlock#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see model.IdlStmtBindBlock#getDelegate()
	 * @see #getIdlStmtBindBlock()
	 * @generated
	 */
	EReference getIdlStmtBindBlock_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link model.impl.ExpressionBindSEExpressionImpl <em>Expression Bind SE Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ExpressionBindSEExpressionImpl
		 * @see model.impl.ModelPackageImpl#getExpressionBindSEExpression()
		 * @generated
		 */
		EClass EXPRESSION_BIND_SE_EXPRESSION = eINSTANCE.getExpressionBindSEExpression();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BIND_SE_EXPRESSION__DELEGATE = eINSTANCE.getExpressionBindSEExpression_Delegate();

		/**
		 * The meta object literal for the '{@link model.impl.BooleanVariableBindSEBooleanVariableImpl <em>Boolean Variable Bind SE Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BooleanVariableBindSEBooleanVariableImpl
		 * @see model.impl.ModelPackageImpl#getBooleanVariableBindSEBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariableBindSEBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE = eINSTANCE.getBooleanVariableBindSEBooleanVariable_Delegate();

		/**
		 * The meta object literal for the '{@link model.impl.IntegerVariableBindSEIntegerVariableImpl <em>Integer Variable Bind SE Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.IntegerVariableBindSEIntegerVariableImpl
		 * @see model.impl.ModelPackageImpl#getIntegerVariableBindSEIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE = eINSTANCE.getIntegerVariableBindSEIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE__DELEGATE = eINSTANCE.getIntegerVariableBindSEIntegerVariable_Delegate();

		/**
		 * The meta object literal for the '{@link model.impl.ExpressionBindOperationDefImpl <em>Expression Bind Operation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ExpressionBindOperationDefImpl
		 * @see model.impl.ModelPackageImpl#getExpressionBindOperationDef()
		 * @generated
		 */
		EClass EXPRESSION_BIND_OPERATION_DEF = eINSTANCE.getExpressionBindOperationDef();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BIND_OPERATION_DEF__DELEGATE = eINSTANCE.getExpressionBindOperationDef_Delegate();

		/**
		 * The meta object literal for the '{@link model.impl.IoTActivityBindActivityImpl <em>Io TActivity Bind Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.IoTActivityBindActivityImpl
		 * @see model.impl.ModelPackageImpl#getIoTActivityBindActivity()
		 * @generated
		 */
		EClass IO_TACTIVITY_BIND_ACTIVITY = eINSTANCE.getIoTActivityBindActivity();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TACTIVITY_BIND_ACTIVITY__DELEGATE = eINSTANCE.getIoTActivityBindActivity_Delegate();

		/**
		 * The meta object literal for the '{@link model.impl.IotOperationDefBindOperationDefImpl <em>Iot Operation Def Bind Operation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.IotOperationDefBindOperationDefImpl
		 * @see model.impl.ModelPackageImpl#getIotOperationDefBindOperationDef()
		 * @generated
		 */
		EClass IOT_OPERATION_DEF_BIND_OPERATION_DEF = eINSTANCE.getIotOperationDefBindOperationDef();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_OPERATION_DEF_BIND_OPERATION_DEF__DELEGATE = eINSTANCE.getIotOperationDefBindOperationDef_Delegate();

		/**
		 * The meta object literal for the '{@link model.impl.IdlStmtBindBlockImpl <em>Idl Stmt Bind Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.IdlStmtBindBlockImpl
		 * @see model.impl.ModelPackageImpl#getIdlStmtBindBlock()
		 * @generated
		 */
		EClass IDL_STMT_BIND_BLOCK = eINSTANCE.getIdlStmtBindBlock();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_STMT_BIND_BLOCK__DELEGATE = eINSTANCE.getIdlStmtBindBlock_Delegate();

	}

} //ModelPackage
