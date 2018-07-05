/**
 */
package simpleexpressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see simpleexpressions.SimpleexpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleexpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleexpressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simpleexpressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleexpressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleexpressionsPackage eINSTANCE = simpleexpressions.impl.SimpleexpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEExpressionImpl <em>SE Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEExpressionImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEExpression()
	 * @generated
	 */
	int SE_EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>SE Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>SE Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEIntegerExpressionImpl <em>SE Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEIntegerExpressionImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerExpression()
	 * @generated
	 */
	int SE_INTEGER_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_EXPRESSION__OPERAND2 = SE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_EXPRESSION__OPERAND1 = SE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SE Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_EXPRESSION_FEATURE_COUNT = SE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SE Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_EXPRESSION_OPERATION_COUNT = SE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEIntegerCalculationExpressionImpl <em>SE Integer Calculation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEIntegerCalculationExpressionImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerCalculationExpression()
	 * @generated
	 */
	int SE_INTEGER_CALCULATION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_CALCULATION_EXPRESSION__OPERAND2 = SE_INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_CALCULATION_EXPRESSION__OPERAND1 = SE_INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE = SE_INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_CALCULATION_EXPRESSION__OPERATOR = SE_INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SE Integer Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_CALCULATION_EXPRESSION_FEATURE_COUNT = SE_INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SE Integer Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_CALCULATION_EXPRESSION_OPERATION_COUNT = SE_INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEIntegerComparisonExpressionImpl <em>SE Integer Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEIntegerComparisonExpressionImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerComparisonExpression()
	 * @generated
	 */
	int SE_INTEGER_COMPARISON_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_COMPARISON_EXPRESSION__OPERAND2 = SE_INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_COMPARISON_EXPRESSION__OPERAND1 = SE_INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_COMPARISON_EXPRESSION__ASSIGNEE = SE_INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_COMPARISON_EXPRESSION__OPERATOR = SE_INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SE Integer Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT = SE_INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SE Integer Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_COMPARISON_EXPRESSION_OPERATION_COUNT = SE_INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEValueImpl <em>SE Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEValueImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEValue()
	 * @generated
	 */
	int SE_VALUE = 6;

	/**
	 * The number of structural features of the '<em>SE Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_VALUE_FEATURE_COUNT = SE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SE Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_VALUE_OPERATION_COUNT = SE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEBooleanValueImpl <em>SE Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEBooleanValueImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanValue()
	 * @generated
	 */
	int SE_BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_VALUE__VALUE = SE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SE Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_VALUE_FEATURE_COUNT = SE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SE Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_VALUE_OPERATION_COUNT = SE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEIntegerValueImpl <em>SE Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEIntegerValueImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerValue()
	 * @generated
	 */
	int SE_INTEGER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_VALUE__VALUE = SE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SE Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_VALUE_FEATURE_COUNT = SE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SE Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_VALUE_OPERATION_COUNT = SE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEBooleanExpressionImpl <em>SE Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEBooleanExpressionImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanExpression()
	 * @generated
	 */
	int SE_BOOLEAN_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_EXPRESSION__ASSIGNEE = SE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SE Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_EXPRESSION_FEATURE_COUNT = SE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SE Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_EXPRESSION_OPERATION_COUNT = SE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEBooleanBinaryExpressionImpl <em>SE Boolean Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEBooleanBinaryExpressionImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanBinaryExpression()
	 * @generated
	 */
	int SE_BOOLEAN_BINARY_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_BINARY_EXPRESSION__ASSIGNEE = SE_BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_BINARY_EXPRESSION__OPERAND1 = SE_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_BINARY_EXPRESSION__OPERAND2 = SE_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_BINARY_EXPRESSION__OPERATOR = SE_BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SE Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT = SE_BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SE Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_BINARY_EXPRESSION_OPERATION_COUNT = SE_BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEVariableImpl <em>SE Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEVariableImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEVariable()
	 * @generated
	 */
	int SE_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_VARIABLE__CURRENT_VALUE = SE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_VARIABLE__NAME = SE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_VARIABLE__INITIAL_VALUE = SE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SE Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_VARIABLE_FEATURE_COUNT = SE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SE Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_VARIABLE_OPERATION_COUNT = SE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEBooleanVariableImpl <em>SE Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEBooleanVariableImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanVariable()
	 * @generated
	 */
	int SE_BOOLEAN_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_VARIABLE__CURRENT_VALUE = SE_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_VARIABLE__NAME = SE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_VARIABLE__INITIAL_VALUE = SE_VARIABLE__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>SE Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_VARIABLE_FEATURE_COUNT = SE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SE Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_VARIABLE_OPERATION_COUNT = SE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEIntegerVariableImpl <em>SE Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEIntegerVariableImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerVariable()
	 * @generated
	 */
	int SE_INTEGER_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_VARIABLE__CURRENT_VALUE = SE_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_VARIABLE__NAME = SE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_VARIABLE__INITIAL_VALUE = SE_VARIABLE__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>SE Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_VARIABLE_FEATURE_COUNT = SE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SE Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_INTEGER_VARIABLE_OPERATION_COUNT = SE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.impl.SEBooleanUnaryExpressionImpl <em>SE Boolean Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.impl.SEBooleanUnaryExpressionImpl
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanUnaryExpression()
	 * @generated
	 */
	int SE_BOOLEAN_UNARY_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_UNARY_EXPRESSION__ASSIGNEE = SE_BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_UNARY_EXPRESSION__OPERAND = SE_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_UNARY_EXPRESSION__OPERATOR = SE_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SE Boolean Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT = SE_BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SE Boolean Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_BOOLEAN_UNARY_EXPRESSION_OPERATION_COUNT = SE_BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleexpressions.SEIntegerCalculationOperator <em>SE Integer Calculation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.SEIntegerCalculationOperator
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerCalculationOperator()
	 * @generated
	 */
	int SE_INTEGER_CALCULATION_OPERATOR = 13;

	/**
	 * The meta object id for the '{@link simpleexpressions.SEIntegerComparisonOperator <em>SE Integer Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.SEIntegerComparisonOperator
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerComparisonOperator()
	 * @generated
	 */
	int SE_INTEGER_COMPARISON_OPERATOR = 14;

	/**
	 * The meta object id for the '{@link simpleexpressions.SEBooleanUnaryOperator <em>SE Boolean Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.SEBooleanUnaryOperator
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanUnaryOperator()
	 * @generated
	 */
	int SE_BOOLEAN_UNARY_OPERATOR = 15;

	/**
	 * The meta object id for the '{@link simpleexpressions.SEBooleanBinaryOperator <em>SE Boolean Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleexpressions.SEBooleanBinaryOperator
	 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanBinaryOperator()
	 * @generated
	 */
	int SE_BOOLEAN_BINARY_OPERATOR = 16;


	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEIntegerExpression <em>SE Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Integer Expression</em>'.
	 * @see simpleexpressions.SEIntegerExpression
	 * @generated
	 */
	EClass getSEIntegerExpression();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEIntegerExpression#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see simpleexpressions.SEIntegerExpression#getOperand2()
	 * @see #getSEIntegerExpression()
	 * @generated
	 */
	EReference getSEIntegerExpression_Operand2();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEIntegerExpression#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see simpleexpressions.SEIntegerExpression#getOperand1()
	 * @see #getSEIntegerExpression()
	 * @generated
	 */
	EReference getSEIntegerExpression_Operand1();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEIntegerCalculationExpression <em>SE Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Integer Calculation Expression</em>'.
	 * @see simpleexpressions.SEIntegerCalculationExpression
	 * @generated
	 */
	EClass getSEIntegerCalculationExpression();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEIntegerCalculationExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see simpleexpressions.SEIntegerCalculationExpression#getAssignee()
	 * @see #getSEIntegerCalculationExpression()
	 * @generated
	 */
	EReference getSEIntegerCalculationExpression_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link simpleexpressions.SEIntegerCalculationExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see simpleexpressions.SEIntegerCalculationExpression#getOperator()
	 * @see #getSEIntegerCalculationExpression()
	 * @generated
	 */
	EAttribute getSEIntegerCalculationExpression_Operator();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEIntegerComparisonExpression <em>SE Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Integer Comparison Expression</em>'.
	 * @see simpleexpressions.SEIntegerComparisonExpression
	 * @generated
	 */
	EClass getSEIntegerComparisonExpression();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEIntegerComparisonExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see simpleexpressions.SEIntegerComparisonExpression#getAssignee()
	 * @see #getSEIntegerComparisonExpression()
	 * @generated
	 */
	EReference getSEIntegerComparisonExpression_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link simpleexpressions.SEIntegerComparisonExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see simpleexpressions.SEIntegerComparisonExpression#getOperator()
	 * @see #getSEIntegerComparisonExpression()
	 * @generated
	 */
	EAttribute getSEIntegerComparisonExpression_Operator();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEBooleanValue <em>SE Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Boolean Value</em>'.
	 * @see simpleexpressions.SEBooleanValue
	 * @generated
	 */
	EClass getSEBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link simpleexpressions.SEBooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see simpleexpressions.SEBooleanValue#isValue()
	 * @see #getSEBooleanValue()
	 * @generated
	 */
	EAttribute getSEBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEIntegerValue <em>SE Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Integer Value</em>'.
	 * @see simpleexpressions.SEIntegerValue
	 * @generated
	 */
	EClass getSEIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link simpleexpressions.SEIntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see simpleexpressions.SEIntegerValue#getValue()
	 * @see #getSEIntegerValue()
	 * @generated
	 */
	EAttribute getSEIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEBooleanBinaryExpression <em>SE Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Boolean Binary Expression</em>'.
	 * @see simpleexpressions.SEBooleanBinaryExpression
	 * @generated
	 */
	EClass getSEBooleanBinaryExpression();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEBooleanBinaryExpression#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see simpleexpressions.SEBooleanBinaryExpression#getOperand1()
	 * @see #getSEBooleanBinaryExpression()
	 * @generated
	 */
	EReference getSEBooleanBinaryExpression_Operand1();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEBooleanBinaryExpression#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see simpleexpressions.SEBooleanBinaryExpression#getOperand2()
	 * @see #getSEBooleanBinaryExpression()
	 * @generated
	 */
	EReference getSEBooleanBinaryExpression_Operand2();

	/**
	 * Returns the meta object for the attribute '{@link simpleexpressions.SEBooleanBinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see simpleexpressions.SEBooleanBinaryExpression#getOperator()
	 * @see #getSEBooleanBinaryExpression()
	 * @generated
	 */
	EAttribute getSEBooleanBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEValue <em>SE Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Value</em>'.
	 * @see simpleexpressions.SEValue
	 * @generated
	 */
	EClass getSEValue();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEBooleanVariable <em>SE Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Boolean Variable</em>'.
	 * @see simpleexpressions.SEBooleanVariable
	 * @generated
	 */
	EClass getSEBooleanVariable();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEExpression <em>SE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Expression</em>'.
	 * @see simpleexpressions.SEExpression
	 * @generated
	 */
	EClass getSEExpression();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEIntegerVariable <em>SE Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Integer Variable</em>'.
	 * @see simpleexpressions.SEIntegerVariable
	 * @generated
	 */
	EClass getSEIntegerVariable();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEBooleanUnaryExpression <em>SE Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Boolean Unary Expression</em>'.
	 * @see simpleexpressions.SEBooleanUnaryExpression
	 * @generated
	 */
	EClass getSEBooleanUnaryExpression();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEBooleanUnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see simpleexpressions.SEBooleanUnaryExpression#getOperand()
	 * @see #getSEBooleanUnaryExpression()
	 * @generated
	 */
	EReference getSEBooleanUnaryExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link simpleexpressions.SEBooleanUnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see simpleexpressions.SEBooleanUnaryExpression#getOperator()
	 * @see #getSEBooleanUnaryExpression()
	 * @generated
	 */
	EAttribute getSEBooleanUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEBooleanExpression <em>SE Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Boolean Expression</em>'.
	 * @see simpleexpressions.SEBooleanExpression
	 * @generated
	 */
	EClass getSEBooleanExpression();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEBooleanExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see simpleexpressions.SEBooleanExpression#getAssignee()
	 * @see #getSEBooleanExpression()
	 * @generated
	 */
	EReference getSEBooleanExpression_Assignee();

	/**
	 * Returns the meta object for class '{@link simpleexpressions.SEVariable <em>SE Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE Variable</em>'.
	 * @see simpleexpressions.SEVariable
	 * @generated
	 */
	EClass getSEVariable();

	/**
	 * Returns the meta object for the reference '{@link simpleexpressions.SEVariable#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Value</em>'.
	 * @see simpleexpressions.SEVariable#getCurrentValue()
	 * @see #getSEVariable()
	 * @generated
	 */
	EReference getSEVariable_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link simpleexpressions.SEVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleexpressions.SEVariable#getName()
	 * @see #getSEVariable()
	 * @generated
	 */
	EAttribute getSEVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link simpleexpressions.SEVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see simpleexpressions.SEVariable#getInitialValue()
	 * @see #getSEVariable()
	 * @generated
	 */
	EReference getSEVariable_InitialValue();

	/**
	 * Returns the meta object for enum '{@link simpleexpressions.SEIntegerCalculationOperator <em>SE Integer Calculation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SE Integer Calculation Operator</em>'.
	 * @see simpleexpressions.SEIntegerCalculationOperator
	 * @generated
	 */
	EEnum getSEIntegerCalculationOperator();

	/**
	 * Returns the meta object for enum '{@link simpleexpressions.SEIntegerComparisonOperator <em>SE Integer Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SE Integer Comparison Operator</em>'.
	 * @see simpleexpressions.SEIntegerComparisonOperator
	 * @generated
	 */
	EEnum getSEIntegerComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link simpleexpressions.SEBooleanUnaryOperator <em>SE Boolean Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SE Boolean Unary Operator</em>'.
	 * @see simpleexpressions.SEBooleanUnaryOperator
	 * @generated
	 */
	EEnum getSEBooleanUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link simpleexpressions.SEBooleanBinaryOperator <em>SE Boolean Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SE Boolean Binary Operator</em>'.
	 * @see simpleexpressions.SEBooleanBinaryOperator
	 * @generated
	 */
	EEnum getSEBooleanBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleexpressionsFactory getSimpleexpressionsFactory();

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
		 * The meta object literal for the '{@link simpleexpressions.impl.SEIntegerExpressionImpl <em>SE Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEIntegerExpressionImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerExpression()
		 * @generated
		 */
		EClass SE_INTEGER_EXPRESSION = eINSTANCE.getSEIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_INTEGER_EXPRESSION__OPERAND2 = eINSTANCE.getSEIntegerExpression_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_INTEGER_EXPRESSION__OPERAND1 = eINSTANCE.getSEIntegerExpression_Operand1();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEIntegerCalculationExpressionImpl <em>SE Integer Calculation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEIntegerCalculationExpressionImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerCalculationExpression()
		 * @generated
		 */
		EClass SE_INTEGER_CALCULATION_EXPRESSION = eINSTANCE.getSEIntegerCalculationExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE = eINSTANCE.getSEIntegerCalculationExpression_Assignee();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_INTEGER_CALCULATION_EXPRESSION__OPERATOR = eINSTANCE.getSEIntegerCalculationExpression_Operator();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEIntegerComparisonExpressionImpl <em>SE Integer Comparison Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEIntegerComparisonExpressionImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerComparisonExpression()
		 * @generated
		 */
		EClass SE_INTEGER_COMPARISON_EXPRESSION = eINSTANCE.getSEIntegerComparisonExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_INTEGER_COMPARISON_EXPRESSION__ASSIGNEE = eINSTANCE.getSEIntegerComparisonExpression_Assignee();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_INTEGER_COMPARISON_EXPRESSION__OPERATOR = eINSTANCE.getSEIntegerComparisonExpression_Operator();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEBooleanValueImpl <em>SE Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEBooleanValueImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanValue()
		 * @generated
		 */
		EClass SE_BOOLEAN_VALUE = eINSTANCE.getSEBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_BOOLEAN_VALUE__VALUE = eINSTANCE.getSEBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEIntegerValueImpl <em>SE Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEIntegerValueImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerValue()
		 * @generated
		 */
		EClass SE_INTEGER_VALUE = eINSTANCE.getSEIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_INTEGER_VALUE__VALUE = eINSTANCE.getSEIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEBooleanBinaryExpressionImpl <em>SE Boolean Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEBooleanBinaryExpressionImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanBinaryExpression()
		 * @generated
		 */
		EClass SE_BOOLEAN_BINARY_EXPRESSION = eINSTANCE.getSEBooleanBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_BOOLEAN_BINARY_EXPRESSION__OPERAND1 = eINSTANCE.getSEBooleanBinaryExpression_Operand1();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_BOOLEAN_BINARY_EXPRESSION__OPERAND2 = eINSTANCE.getSEBooleanBinaryExpression_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_BOOLEAN_BINARY_EXPRESSION__OPERATOR = eINSTANCE.getSEBooleanBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEValueImpl <em>SE Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEValueImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEValue()
		 * @generated
		 */
		EClass SE_VALUE = eINSTANCE.getSEValue();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEBooleanVariableImpl <em>SE Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEBooleanVariableImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanVariable()
		 * @generated
		 */
		EClass SE_BOOLEAN_VARIABLE = eINSTANCE.getSEBooleanVariable();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEExpressionImpl <em>SE Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEExpressionImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEExpression()
		 * @generated
		 */
		EClass SE_EXPRESSION = eINSTANCE.getSEExpression();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEIntegerVariableImpl <em>SE Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEIntegerVariableImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerVariable()
		 * @generated
		 */
		EClass SE_INTEGER_VARIABLE = eINSTANCE.getSEIntegerVariable();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEBooleanUnaryExpressionImpl <em>SE Boolean Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEBooleanUnaryExpressionImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanUnaryExpression()
		 * @generated
		 */
		EClass SE_BOOLEAN_UNARY_EXPRESSION = eINSTANCE.getSEBooleanUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_BOOLEAN_UNARY_EXPRESSION__OPERAND = eINSTANCE.getSEBooleanUnaryExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_BOOLEAN_UNARY_EXPRESSION__OPERATOR = eINSTANCE.getSEBooleanUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEBooleanExpressionImpl <em>SE Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEBooleanExpressionImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanExpression()
		 * @generated
		 */
		EClass SE_BOOLEAN_EXPRESSION = eINSTANCE.getSEBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_BOOLEAN_EXPRESSION__ASSIGNEE = eINSTANCE.getSEBooleanExpression_Assignee();

		/**
		 * The meta object literal for the '{@link simpleexpressions.impl.SEVariableImpl <em>SE Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.impl.SEVariableImpl
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEVariable()
		 * @generated
		 */
		EClass SE_VARIABLE = eINSTANCE.getSEVariable();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_VARIABLE__CURRENT_VALUE = eINSTANCE.getSEVariable_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_VARIABLE__NAME = eINSTANCE.getSEVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_VARIABLE__INITIAL_VALUE = eINSTANCE.getSEVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link simpleexpressions.SEIntegerCalculationOperator <em>SE Integer Calculation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.SEIntegerCalculationOperator
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerCalculationOperator()
		 * @generated
		 */
		EEnum SE_INTEGER_CALCULATION_OPERATOR = eINSTANCE.getSEIntegerCalculationOperator();

		/**
		 * The meta object literal for the '{@link simpleexpressions.SEIntegerComparisonOperator <em>SE Integer Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.SEIntegerComparisonOperator
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEIntegerComparisonOperator()
		 * @generated
		 */
		EEnum SE_INTEGER_COMPARISON_OPERATOR = eINSTANCE.getSEIntegerComparisonOperator();

		/**
		 * The meta object literal for the '{@link simpleexpressions.SEBooleanUnaryOperator <em>SE Boolean Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.SEBooleanUnaryOperator
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanUnaryOperator()
		 * @generated
		 */
		EEnum SE_BOOLEAN_UNARY_OPERATOR = eINSTANCE.getSEBooleanUnaryOperator();

		/**
		 * The meta object literal for the '{@link simpleexpressions.SEBooleanBinaryOperator <em>SE Boolean Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleexpressions.SEBooleanBinaryOperator
		 * @see simpleexpressions.impl.SimpleexpressionsPackageImpl#getSEBooleanBinaryOperator()
		 * @generated
		 */
		EEnum SE_BOOLEAN_BINARY_OPERATOR = eINSTANCE.getSEBooleanBinaryOperator();

	}

} //SimpleexpressionsPackage
