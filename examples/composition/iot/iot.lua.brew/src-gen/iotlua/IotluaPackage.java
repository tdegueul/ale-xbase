/**
 */
package iotlua;

import activitydiagram.ActivitydiagramPackage;

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
 * @see iotlua.IotluaFactory
 * @model kind="package"
 *        annotation="@BrewRequires platform:/resource/org.xtext.activitydiagram.ale.semantics.model/model/activitydiagramruntime.ecore='ecoreUrl' platform:/resource/org.xtext.lua/model/generated/Lua.ecore='ecoreUrl'"
 * @generated
 */
public interface IotluaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iotlua";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iotlua";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iotlua";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotluaPackage eINSTANCE = iotlua.impl.IotluaPackageImpl.init();

	/**
	 * The meta object id for the '{@link iotlua.impl.ExpressionBindStatementImpl <em>Expression Bind Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotlua.impl.ExpressionBindStatementImpl
	 * @see iotlua.impl.IotluaPackageImpl#getExpressionBindStatement()
	 * @generated
	 */
	int EXPRESSION_BIND_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_STATEMENT__DELEGATE = ActivitydiagramPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Bind Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_STATEMENT_FEATURE_COUNT = ActivitydiagramPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Bind Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_STATEMENT_OPERATION_COUNT = ActivitydiagramPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotlua.impl.ValueBindExpressionImpl <em>Value Bind Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotlua.impl.ValueBindExpressionImpl
	 * @see iotlua.impl.IotluaPackageImpl#getValueBindExpression()
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
	 * The meta object id for the '{@link iotlua.impl.BooleanValueBindExpressionImpl <em>Boolean Value Bind Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotlua.impl.BooleanValueBindExpressionImpl
	 * @see iotlua.impl.IotluaPackageImpl#getBooleanValueBindExpression()
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
	 * The meta object id for the '{@link iotlua.impl.BooleanVariableBindStatement_AssignmentImpl <em>Boolean Variable Bind Statement Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotlua.impl.BooleanVariableBindStatement_AssignmentImpl
	 * @see iotlua.impl.IotluaPackageImpl#getBooleanVariableBindStatement_Assignment()
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
	 * The meta object id for the '{@link iotlua.impl.IntegerVariableBindStatement_AssignmentImpl <em>Integer Variable Bind Statement Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotlua.impl.IntegerVariableBindStatement_AssignmentImpl
	 * @see iotlua.impl.IotluaPackageImpl#getIntegerVariableBindStatement_Assignment()
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
	 * The meta object id for the '{@link iotlua.impl.IntegerValueBindExpression_NumberImpl <em>Integer Value Bind Expression Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotlua.impl.IntegerValueBindExpression_NumberImpl
	 * @see iotlua.impl.IotluaPackageImpl#getIntegerValueBindExpression_Number()
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
	 * Returns the meta object for class '{@link iotlua.ExpressionBindStatement <em>Expression Bind Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Bind Statement</em>'.
	 * @see iotlua.ExpressionBindStatement
	 * @generated
	 */
	EClass getExpressionBindStatement();

	/**
	 * Returns the meta object for the reference '{@link iotlua.ExpressionBindStatement#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iotlua.ExpressionBindStatement#getDelegate()
	 * @see #getExpressionBindStatement()
	 * @generated
	 */
	EReference getExpressionBindStatement_Delegate();

	/**
	 * Returns the meta object for class '{@link iotlua.ValueBindExpression <em>Value Bind Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Bind Expression</em>'.
	 * @see iotlua.ValueBindExpression
	 * @generated
	 */
	EClass getValueBindExpression();

	/**
	 * Returns the meta object for the reference '{@link iotlua.ValueBindExpression#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iotlua.ValueBindExpression#getDelegate()
	 * @see #getValueBindExpression()
	 * @generated
	 */
	EReference getValueBindExpression_Delegate();

	/**
	 * Returns the meta object for class '{@link iotlua.BooleanValueBindExpression <em>Boolean Value Bind Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Bind Expression</em>'.
	 * @see iotlua.BooleanValueBindExpression
	 * @generated
	 */
	EClass getBooleanValueBindExpression();

	/**
	 * Returns the meta object for the reference '{@link iotlua.BooleanValueBindExpression#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iotlua.BooleanValueBindExpression#getDelegate()
	 * @see #getBooleanValueBindExpression()
	 * @generated
	 */
	EReference getBooleanValueBindExpression_Delegate();

	/**
	 * Returns the meta object for class '{@link iotlua.BooleanVariableBindStatement_Assignment <em>Boolean Variable Bind Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Bind Statement Assignment</em>'.
	 * @see iotlua.BooleanVariableBindStatement_Assignment
	 * @generated
	 */
	EClass getBooleanVariableBindStatement_Assignment();

	/**
	 * Returns the meta object for the reference '{@link iotlua.BooleanVariableBindStatement_Assignment#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iotlua.BooleanVariableBindStatement_Assignment#getDelegate()
	 * @see #getBooleanVariableBindStatement_Assignment()
	 * @generated
	 */
	EReference getBooleanVariableBindStatement_Assignment_Delegate();

	/**
	 * Returns the meta object for class '{@link iotlua.IntegerVariableBindStatement_Assignment <em>Integer Variable Bind Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Bind Statement Assignment</em>'.
	 * @see iotlua.IntegerVariableBindStatement_Assignment
	 * @generated
	 */
	EClass getIntegerVariableBindStatement_Assignment();

	/**
	 * Returns the meta object for the reference '{@link iotlua.IntegerVariableBindStatement_Assignment#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iotlua.IntegerVariableBindStatement_Assignment#getDelegate()
	 * @see #getIntegerVariableBindStatement_Assignment()
	 * @generated
	 */
	EReference getIntegerVariableBindStatement_Assignment_Delegate();

	/**
	 * Returns the meta object for class '{@link iotlua.IntegerValueBindExpression_Number <em>Integer Value Bind Expression Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Bind Expression Number</em>'.
	 * @see iotlua.IntegerValueBindExpression_Number
	 * @generated
	 */
	EClass getIntegerValueBindExpression_Number();

	/**
	 * Returns the meta object for the reference '{@link iotlua.IntegerValueBindExpression_Number#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iotlua.IntegerValueBindExpression_Number#getDelegate()
	 * @see #getIntegerValueBindExpression_Number()
	 * @generated
	 */
	EReference getIntegerValueBindExpression_Number_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IotluaFactory getIotluaFactory();

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
		 * The meta object literal for the '{@link iotlua.impl.ExpressionBindStatementImpl <em>Expression Bind Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotlua.impl.ExpressionBindStatementImpl
		 * @see iotlua.impl.IotluaPackageImpl#getExpressionBindStatement()
		 * @generated
		 */
		EClass EXPRESSION_BIND_STATEMENT = eINSTANCE.getExpressionBindStatement();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BIND_STATEMENT__DELEGATE = eINSTANCE.getExpressionBindStatement_Delegate();

		/**
		 * The meta object literal for the '{@link iotlua.impl.ValueBindExpressionImpl <em>Value Bind Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotlua.impl.ValueBindExpressionImpl
		 * @see iotlua.impl.IotluaPackageImpl#getValueBindExpression()
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
		 * The meta object literal for the '{@link iotlua.impl.BooleanValueBindExpressionImpl <em>Boolean Value Bind Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotlua.impl.BooleanValueBindExpressionImpl
		 * @see iotlua.impl.IotluaPackageImpl#getBooleanValueBindExpression()
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
		 * The meta object literal for the '{@link iotlua.impl.BooleanVariableBindStatement_AssignmentImpl <em>Boolean Variable Bind Statement Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotlua.impl.BooleanVariableBindStatement_AssignmentImpl
		 * @see iotlua.impl.IotluaPackageImpl#getBooleanVariableBindStatement_Assignment()
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
		 * The meta object literal for the '{@link iotlua.impl.IntegerVariableBindStatement_AssignmentImpl <em>Integer Variable Bind Statement Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotlua.impl.IntegerVariableBindStatement_AssignmentImpl
		 * @see iotlua.impl.IotluaPackageImpl#getIntegerVariableBindStatement_Assignment()
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
		 * The meta object literal for the '{@link iotlua.impl.IntegerValueBindExpression_NumberImpl <em>Integer Value Bind Expression Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotlua.impl.IntegerValueBindExpression_NumberImpl
		 * @see iotlua.impl.IotluaPackageImpl#getIntegerValueBindExpression_Number()
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

	}

} //IotluaPackage
