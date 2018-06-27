/**
 */
package iot_lua;

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
 * @see iot_lua.Iot_luaFactory
 * @model kind="package"
 * @generated
 */
public interface Iot_luaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iot_lua";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/iot_lua";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iot_lua";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Iot_luaPackage eINSTANCE = iot_lua.impl.Iot_luaPackageImpl.init();

	/**
	 * The meta object id for the '{@link iot_lua.impl.ExpressionBindStatementImpl <em>Expression Bind Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.ExpressionBindStatementImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getExpressionBindStatement()
	 * @generated
	 */
	int EXPRESSION_BIND_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_STATEMENT__DELEGATE = ActivitydiagramPackage.EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Bind Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_STATEMENT_FEATURE_COUNT = ActivitydiagramPackage.EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Bind Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_STATEMENT_OPERATION_COUNT = ActivitydiagramPackage.EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot_lua.impl.ValueBindExpressionImpl <em>Value Bind Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.ValueBindExpressionImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getValueBindExpression()
	 * @generated
	 */
	int VALUE_BIND_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BIND_EXPRESSION__DELEGATE = ActivitydiagramPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Bind Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BIND_EXPRESSION_FEATURE_COUNT = ActivitydiagramPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Bind Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BIND_EXPRESSION_OPERATION_COUNT = ActivitydiagramPackage.VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot_lua.impl.BooleanValueBindExpressionImpl <em>Boolean Value Bind Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.BooleanValueBindExpressionImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getBooleanValueBindExpression()
	 * @generated
	 */
	int BOOLEAN_VALUE_BIND_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_BIND_EXPRESSION__VALUE = ActivitydiagramPackage.BOOLEAN_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE = ActivitydiagramPackage.BOOLEAN_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value Bind Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_BIND_EXPRESSION_FEATURE_COUNT = ActivitydiagramPackage.BOOLEAN_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value Bind Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_BIND_EXPRESSION_OPERATION_COUNT = ActivitydiagramPackage.BOOLEAN_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot_lua.impl.BooleanVariableBindStatement_AssignmentImpl <em>Boolean Variable Bind Statement Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.BooleanVariableBindStatement_AssignmentImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getBooleanVariableBindStatement_Assignment()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT__INITIAL_VALUE = ActivitydiagramPackage.BOOLEAN_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT__NAME = ActivitydiagramPackage.BOOLEAN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT__CURRENT_VALUE = ActivitydiagramPackage.BOOLEAN_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE = ActivitydiagramPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Bind Statement Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT_FEATURE_COUNT = ActivitydiagramPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Variable Bind Statement Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT_OPERATION_COUNT = ActivitydiagramPackage.BOOLEAN_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot_lua.impl.IntegerVariableBindStatement_AssignmentImpl <em>Integer Variable Bind Statement Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.IntegerVariableBindStatement_AssignmentImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getIntegerVariableBindStatement_Assignment()
	 * @generated
	 */
	int INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__INITIAL_VALUE = ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__NAME = ActivitydiagramPackage.INTEGER_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__CURRENT_VALUE = ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE = ActivitydiagramPackage.INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Bind Statement Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT_FEATURE_COUNT = ActivitydiagramPackage.INTEGER_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Variable Bind Statement Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT_OPERATION_COUNT = ActivitydiagramPackage.INTEGER_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot_lua.impl.IntegerValueBindExpression_NumberImpl <em>Integer Value Bind Expression Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.IntegerValueBindExpression_NumberImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getIntegerValueBindExpression_Number()
	 * @generated
	 */
	int INTEGER_VALUE_BIND_EXPRESSION_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_BIND_EXPRESSION_NUMBER__VALUE = ActivitydiagramPackage.INTEGER_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE = ActivitydiagramPackage.INTEGER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value Bind Expression Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_BIND_EXPRESSION_NUMBER_FEATURE_COUNT = ActivitydiagramPackage.INTEGER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value Bind Expression Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_BIND_EXPRESSION_NUMBER_OPERATION_COUNT = ActivitydiagramPackage.INTEGER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot_lua.impl.ExpressionBindOperationDefImpl <em>Expression Bind Operation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.ExpressionBindOperationDefImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getExpressionBindOperationDef()
	 * @generated
	 */
	int EXPRESSION_BIND_OPERATION_DEF = 6;

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
	 * The meta object id for the '{@link iot_lua.impl.IotActivityBindActivityImpl <em>Iot Activity Bind Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.IotActivityBindActivityImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getIotActivityBindActivity()
	 * @generated
	 */
	int IOT_ACTIVITY_BIND_ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_ACTIVITY_BIND_ACTIVITY__DELEGATE = IotPackage.IOT_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iot Activity Bind Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_ACTIVITY_BIND_ACTIVITY_FEATURE_COUNT = IotPackage.IOT_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iot Activity Bind Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_ACTIVITY_BIND_ACTIVITY_OPERATION_COUNT = IotPackage.IOT_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot_lua.impl.IotOperationDefBindOperationDefImpl <em>Iot Operation Def Bind Operation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.IotOperationDefBindOperationDefImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getIotOperationDefBindOperationDef()
	 * @generated
	 */
	int IOT_OPERATION_DEF_BIND_OPERATION_DEF = 8;

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
	 * The meta object id for the '{@link iot_lua.impl.IdlStmtBindBlockImpl <em>Idl Stmt Bind Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot_lua.impl.IdlStmtBindBlockImpl
	 * @see iot_lua.impl.Iot_luaPackageImpl#getIdlStmtBindBlock()
	 * @generated
	 */
	int IDL_STMT_BIND_BLOCK = 9;

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
	 * Returns the meta object for class '{@link iot_lua.ExpressionBindStatement <em>Expression Bind Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Bind Statement</em>'.
	 * @see iot_lua.ExpressionBindStatement
	 * @generated
	 */
	EClass getExpressionBindStatement();

	/**
	 * Returns the meta object for the containment reference '{@link iot_lua.ExpressionBindStatement#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see iot_lua.ExpressionBindStatement#getDelegate()
	 * @see #getExpressionBindStatement()
	 * @generated
	 */
	EReference getExpressionBindStatement_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.ValueBindExpression <em>Value Bind Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Bind Expression</em>'.
	 * @see iot_lua.ValueBindExpression
	 * @generated
	 */
	EClass getValueBindExpression();

	/**
	 * Returns the meta object for the reference '{@link iot_lua.ValueBindExpression#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot_lua.ValueBindExpression#getDelegate()
	 * @see #getValueBindExpression()
	 * @generated
	 */
	EReference getValueBindExpression_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.BooleanValueBindExpression <em>Boolean Value Bind Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Bind Expression</em>'.
	 * @see iot_lua.BooleanValueBindExpression
	 * @generated
	 */
	EClass getBooleanValueBindExpression();

	/**
	 * Returns the meta object for the reference '{@link iot_lua.BooleanValueBindExpression#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot_lua.BooleanValueBindExpression#getDelegate()
	 * @see #getBooleanValueBindExpression()
	 * @generated
	 */
	EReference getBooleanValueBindExpression_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.BooleanVariableBindStatement_Assignment <em>Boolean Variable Bind Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Bind Statement Assignment</em>'.
	 * @see iot_lua.BooleanVariableBindStatement_Assignment
	 * @generated
	 */
	EClass getBooleanVariableBindStatement_Assignment();

	/**
	 * Returns the meta object for the reference '{@link iot_lua.BooleanVariableBindStatement_Assignment#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot_lua.BooleanVariableBindStatement_Assignment#getDelegate()
	 * @see #getBooleanVariableBindStatement_Assignment()
	 * @generated
	 */
	EReference getBooleanVariableBindStatement_Assignment_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.IntegerVariableBindStatement_Assignment <em>Integer Variable Bind Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Bind Statement Assignment</em>'.
	 * @see iot_lua.IntegerVariableBindStatement_Assignment
	 * @generated
	 */
	EClass getIntegerVariableBindStatement_Assignment();

	/**
	 * Returns the meta object for the reference '{@link iot_lua.IntegerVariableBindStatement_Assignment#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot_lua.IntegerVariableBindStatement_Assignment#getDelegate()
	 * @see #getIntegerVariableBindStatement_Assignment()
	 * @generated
	 */
	EReference getIntegerVariableBindStatement_Assignment_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.IntegerValueBindExpression_Number <em>Integer Value Bind Expression Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Bind Expression Number</em>'.
	 * @see iot_lua.IntegerValueBindExpression_Number
	 * @generated
	 */
	EClass getIntegerValueBindExpression_Number();

	/**
	 * Returns the meta object for the reference '{@link iot_lua.IntegerValueBindExpression_Number#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot_lua.IntegerValueBindExpression_Number#getDelegate()
	 * @see #getIntegerValueBindExpression_Number()
	 * @generated
	 */
	EReference getIntegerValueBindExpression_Number_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.ExpressionBindOperationDef <em>Expression Bind Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Bind Operation Def</em>'.
	 * @see iot_lua.ExpressionBindOperationDef
	 * @generated
	 */
	EClass getExpressionBindOperationDef();

	/**
	 * Returns the meta object for the reference '{@link iot_lua.ExpressionBindOperationDef#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot_lua.ExpressionBindOperationDef#getDelegate()
	 * @see #getExpressionBindOperationDef()
	 * @generated
	 */
	EReference getExpressionBindOperationDef_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.IotActivityBindActivity <em>Iot Activity Bind Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iot Activity Bind Activity</em>'.
	 * @see iot_lua.IotActivityBindActivity
	 * @generated
	 */
	EClass getIotActivityBindActivity();

	/**
	 * Returns the meta object for the containment reference '{@link iot_lua.IotActivityBindActivity#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see iot_lua.IotActivityBindActivity#getDelegate()
	 * @see #getIotActivityBindActivity()
	 * @generated
	 */
	EReference getIotActivityBindActivity_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.IotOperationDefBindOperationDef <em>Iot Operation Def Bind Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iot Operation Def Bind Operation Def</em>'.
	 * @see iot_lua.IotOperationDefBindOperationDef
	 * @generated
	 */
	EClass getIotOperationDefBindOperationDef();

	/**
	 * Returns the meta object for the containment reference '{@link iot_lua.IotOperationDefBindOperationDef#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see iot_lua.IotOperationDefBindOperationDef#getDelegate()
	 * @see #getIotOperationDefBindOperationDef()
	 * @generated
	 */
	EReference getIotOperationDefBindOperationDef_Delegate();

	/**
	 * Returns the meta object for class '{@link iot_lua.IdlStmtBindBlock <em>Idl Stmt Bind Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idl Stmt Bind Block</em>'.
	 * @see iot_lua.IdlStmtBindBlock
	 * @generated
	 */
	EClass getIdlStmtBindBlock();

	/**
	 * Returns the meta object for the containment reference '{@link iot_lua.IdlStmtBindBlock#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see iot_lua.IdlStmtBindBlock#getDelegate()
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
	Iot_luaFactory getIot_luaFactory();

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
		 * The meta object literal for the '{@link iot_lua.impl.ExpressionBindStatementImpl <em>Expression Bind Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.ExpressionBindStatementImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getExpressionBindStatement()
		 * @generated
		 */
		EClass EXPRESSION_BIND_STATEMENT = eINSTANCE.getExpressionBindStatement();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BIND_STATEMENT__DELEGATE = eINSTANCE.getExpressionBindStatement_Delegate();

		/**
		 * The meta object literal for the '{@link iot_lua.impl.ValueBindExpressionImpl <em>Value Bind Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.ValueBindExpressionImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getValueBindExpression()
		 * @generated
		 */
		EClass VALUE_BIND_EXPRESSION = eINSTANCE.getValueBindExpression();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BIND_EXPRESSION__DELEGATE = eINSTANCE.getValueBindExpression_Delegate();

		/**
		 * The meta object literal for the '{@link iot_lua.impl.BooleanValueBindExpressionImpl <em>Boolean Value Bind Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.BooleanValueBindExpressionImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getBooleanValueBindExpression()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_BIND_EXPRESSION = eINSTANCE.getBooleanValueBindExpression();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE = eINSTANCE.getBooleanValueBindExpression_Delegate();

		/**
		 * The meta object literal for the '{@link iot_lua.impl.BooleanVariableBindStatement_AssignmentImpl <em>Boolean Variable Bind Statement Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.BooleanVariableBindStatement_AssignmentImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getBooleanVariableBindStatement_Assignment()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT = eINSTANCE.getBooleanVariableBindStatement_Assignment();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE = eINSTANCE.getBooleanVariableBindStatement_Assignment_Delegate();

		/**
		 * The meta object literal for the '{@link iot_lua.impl.IntegerVariableBindStatement_AssignmentImpl <em>Integer Variable Bind Statement Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.IntegerVariableBindStatement_AssignmentImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getIntegerVariableBindStatement_Assignment()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT = eINSTANCE.getIntegerVariableBindStatement_Assignment();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE = eINSTANCE.getIntegerVariableBindStatement_Assignment_Delegate();

		/**
		 * The meta object literal for the '{@link iot_lua.impl.IntegerValueBindExpression_NumberImpl <em>Integer Value Bind Expression Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.IntegerValueBindExpression_NumberImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getIntegerValueBindExpression_Number()
		 * @generated
		 */
		EClass INTEGER_VALUE_BIND_EXPRESSION_NUMBER = eINSTANCE.getIntegerValueBindExpression_Number();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE = eINSTANCE.getIntegerValueBindExpression_Number_Delegate();

		/**
		 * The meta object literal for the '{@link iot_lua.impl.ExpressionBindOperationDefImpl <em>Expression Bind Operation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.ExpressionBindOperationDefImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getExpressionBindOperationDef()
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
		 * The meta object literal for the '{@link iot_lua.impl.IotActivityBindActivityImpl <em>Iot Activity Bind Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.IotActivityBindActivityImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getIotActivityBindActivity()
		 * @generated
		 */
		EClass IOT_ACTIVITY_BIND_ACTIVITY = eINSTANCE.getIotActivityBindActivity();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_ACTIVITY_BIND_ACTIVITY__DELEGATE = eINSTANCE.getIotActivityBindActivity_Delegate();

		/**
		 * The meta object literal for the '{@link iot_lua.impl.IotOperationDefBindOperationDefImpl <em>Iot Operation Def Bind Operation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.IotOperationDefBindOperationDefImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getIotOperationDefBindOperationDef()
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
		 * The meta object literal for the '{@link iot_lua.impl.IdlStmtBindBlockImpl <em>Idl Stmt Bind Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot_lua.impl.IdlStmtBindBlockImpl
		 * @see iot_lua.impl.Iot_luaPackageImpl#getIdlStmtBindBlock()
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

} //Iot_luaPackage
