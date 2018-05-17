/**
 */
package iot;

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
 * @see iot.IotFactory
 * @model kind="package"
 *        annotation="@BrewRequires platform:/resource/org.xtext.activitydiagram.ale.semantics.model/model/activitydiagramruntime.ecore='ecoreUrl' platform:/resource/simpleexpressions.model/model/simpleexpressions.ecore='ecoreUrl'"
 * @generated
 */
public interface IotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotPackage eINSTANCE = iot.impl.IotPackageImpl.init();

	/**
	 * The meta object id for the '{@link iot.impl.ExpressionBindExpressionImpl <em>Expression Bind Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.impl.ExpressionBindExpressionImpl
	 * @see iot.impl.IotPackageImpl#getExpressionBindExpression()
	 * @generated
	 */
	int EXPRESSION_BIND_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_EXPRESSION__DELEGATE = ActivitydiagramPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Bind Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_EXPRESSION_FEATURE_COUNT = ActivitydiagramPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Bind Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BIND_EXPRESSION_OPERATION_COUNT = ActivitydiagramPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot.impl.ValueBindValueImpl <em>Value Bind Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.impl.ValueBindValueImpl
	 * @see iot.impl.IotPackageImpl#getValueBindValue()
	 * @generated
	 */
	int VALUE_BIND_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BIND_VALUE__DELEGATE = ActivitydiagramPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Bind Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BIND_VALUE_FEATURE_COUNT = ActivitydiagramPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Bind Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BIND_VALUE_OPERATION_COUNT = ActivitydiagramPackage.VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot.impl.BooleanValueBindBooleanValueImpl <em>Boolean Value Bind Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.impl.BooleanValueBindBooleanValueImpl
	 * @see iot.impl.IotPackageImpl#getBooleanValueBindBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE_BIND_BOOLEAN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_BIND_BOOLEAN_VALUE__VALUE = ActivitydiagramPackage.BOOLEAN_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_BIND_BOOLEAN_VALUE__DELEGATE = ActivitydiagramPackage.BOOLEAN_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value Bind Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_BIND_BOOLEAN_VALUE_FEATURE_COUNT = ActivitydiagramPackage.BOOLEAN_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value Bind Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_BIND_BOOLEAN_VALUE_OPERATION_COUNT = ActivitydiagramPackage.BOOLEAN_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot.impl.BooleanVariableBindBooleanVariableImpl <em>Boolean Variable Bind Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.impl.BooleanVariableBindBooleanVariableImpl
	 * @see iot.impl.IotPackageImpl#getBooleanVariableBindBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE__INITIAL_VALUE = ActivitydiagramPackage.BOOLEAN_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE__NAME = ActivitydiagramPackage.BOOLEAN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE__CURRENT_VALUE = ActivitydiagramPackage.BOOLEAN_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE__DELEGATE = ActivitydiagramPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Bind Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE_FEATURE_COUNT = ActivitydiagramPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Variable Bind Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE_OPERATION_COUNT = ActivitydiagramPackage.BOOLEAN_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot.impl.IntegerVariableBindIntegerVariableImpl <em>Integer Variable Bind Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.impl.IntegerVariableBindIntegerVariableImpl
	 * @see iot.impl.IotPackageImpl#getIntegerVariableBindIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE_BIND_INTEGER_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__INITIAL_VALUE = ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__NAME = ActivitydiagramPackage.INTEGER_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__CURRENT_VALUE = ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE = ActivitydiagramPackage.INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Bind Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_INTEGER_VARIABLE_FEATURE_COUNT = ActivitydiagramPackage.INTEGER_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Variable Bind Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_BIND_INTEGER_VARIABLE_OPERATION_COUNT = ActivitydiagramPackage.INTEGER_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iot.impl.IntegerValueBindIntegerValueImpl <em>Integer Value Bind Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.impl.IntegerValueBindIntegerValueImpl
	 * @see iot.impl.IotPackageImpl#getIntegerValueBindIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE_BIND_INTEGER_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_BIND_INTEGER_VALUE__VALUE = ActivitydiagramPackage.INTEGER_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_BIND_INTEGER_VALUE__DELEGATE = ActivitydiagramPackage.INTEGER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value Bind Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_BIND_INTEGER_VALUE_FEATURE_COUNT = ActivitydiagramPackage.INTEGER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value Bind Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_BIND_INTEGER_VALUE_OPERATION_COUNT = ActivitydiagramPackage.INTEGER_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iot.ExpressionBindExpression <em>Expression Bind Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Bind Expression</em>'.
	 * @see iot.ExpressionBindExpression
	 * @generated
	 */
	EClass getExpressionBindExpression();

	/**
	 * Returns the meta object for the reference '{@link iot.ExpressionBindExpression#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot.ExpressionBindExpression#getDelegate()
	 * @see #getExpressionBindExpression()
	 * @generated
	 */
	EReference getExpressionBindExpression_Delegate();

	/**
	 * Returns the meta object for class '{@link iot.ValueBindValue <em>Value Bind Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Bind Value</em>'.
	 * @see iot.ValueBindValue
	 * @generated
	 */
	EClass getValueBindValue();

	/**
	 * Returns the meta object for the reference '{@link iot.ValueBindValue#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot.ValueBindValue#getDelegate()
	 * @see #getValueBindValue()
	 * @generated
	 */
	EReference getValueBindValue_Delegate();

	/**
	 * Returns the meta object for class '{@link iot.BooleanValueBindBooleanValue <em>Boolean Value Bind Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Bind Boolean Value</em>'.
	 * @see iot.BooleanValueBindBooleanValue
	 * @generated
	 */
	EClass getBooleanValueBindBooleanValue();

	/**
	 * Returns the meta object for the reference '{@link iot.BooleanValueBindBooleanValue#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot.BooleanValueBindBooleanValue#getDelegate()
	 * @see #getBooleanValueBindBooleanValue()
	 * @generated
	 */
	EReference getBooleanValueBindBooleanValue_Delegate();

	/**
	 * Returns the meta object for class '{@link iot.BooleanVariableBindBooleanVariable <em>Boolean Variable Bind Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Bind Boolean Variable</em>'.
	 * @see iot.BooleanVariableBindBooleanVariable
	 * @generated
	 */
	EClass getBooleanVariableBindBooleanVariable();

	/**
	 * Returns the meta object for the reference '{@link iot.BooleanVariableBindBooleanVariable#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot.BooleanVariableBindBooleanVariable#getDelegate()
	 * @see #getBooleanVariableBindBooleanVariable()
	 * @generated
	 */
	EReference getBooleanVariableBindBooleanVariable_Delegate();

	/**
	 * Returns the meta object for class '{@link iot.IntegerVariableBindIntegerVariable <em>Integer Variable Bind Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Bind Integer Variable</em>'.
	 * @see iot.IntegerVariableBindIntegerVariable
	 * @generated
	 */
	EClass getIntegerVariableBindIntegerVariable();

	/**
	 * Returns the meta object for the reference '{@link iot.IntegerVariableBindIntegerVariable#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot.IntegerVariableBindIntegerVariable#getDelegate()
	 * @see #getIntegerVariableBindIntegerVariable()
	 * @generated
	 */
	EReference getIntegerVariableBindIntegerVariable_Delegate();

	/**
	 * Returns the meta object for class '{@link iot.IntegerValueBindIntegerValue <em>Integer Value Bind Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Bind Integer Value</em>'.
	 * @see iot.IntegerValueBindIntegerValue
	 * @generated
	 */
	EClass getIntegerValueBindIntegerValue();

	/**
	 * Returns the meta object for the reference '{@link iot.IntegerValueBindIntegerValue#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see iot.IntegerValueBindIntegerValue#getDelegate()
	 * @see #getIntegerValueBindIntegerValue()
	 * @generated
	 */
	EReference getIntegerValueBindIntegerValue_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IotFactory getIotFactory();

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
		 * The meta object literal for the '{@link iot.impl.ExpressionBindExpressionImpl <em>Expression Bind Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.impl.ExpressionBindExpressionImpl
		 * @see iot.impl.IotPackageImpl#getExpressionBindExpression()
		 * @generated
		 */
		EClass EXPRESSION_BIND_EXPRESSION = eINSTANCE.getExpressionBindExpression();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BIND_EXPRESSION__DELEGATE = eINSTANCE.getExpressionBindExpression_Delegate();

		/**
		 * The meta object literal for the '{@link iot.impl.ValueBindValueImpl <em>Value Bind Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.impl.ValueBindValueImpl
		 * @see iot.impl.IotPackageImpl#getValueBindValue()
		 * @generated
		 */
		EClass VALUE_BIND_VALUE = eINSTANCE.getValueBindValue();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BIND_VALUE__DELEGATE = eINSTANCE.getValueBindValue_Delegate();

		/**
		 * The meta object literal for the '{@link iot.impl.BooleanValueBindBooleanValueImpl <em>Boolean Value Bind Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.impl.BooleanValueBindBooleanValueImpl
		 * @see iot.impl.IotPackageImpl#getBooleanValueBindBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_BIND_BOOLEAN_VALUE = eINSTANCE.getBooleanValueBindBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_BIND_BOOLEAN_VALUE__DELEGATE = eINSTANCE.getBooleanValueBindBooleanValue_Delegate();

		/**
		 * The meta object literal for the '{@link iot.impl.BooleanVariableBindBooleanVariableImpl <em>Boolean Variable Bind Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.impl.BooleanVariableBindBooleanVariableImpl
		 * @see iot.impl.IotPackageImpl#getBooleanVariableBindBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariableBindBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE__DELEGATE = eINSTANCE.getBooleanVariableBindBooleanVariable_Delegate();

		/**
		 * The meta object literal for the '{@link iot.impl.IntegerVariableBindIntegerVariableImpl <em>Integer Variable Bind Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.impl.IntegerVariableBindIntegerVariableImpl
		 * @see iot.impl.IotPackageImpl#getIntegerVariableBindIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_BIND_INTEGER_VARIABLE = eINSTANCE.getIntegerVariableBindIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE = eINSTANCE.getIntegerVariableBindIntegerVariable_Delegate();

		/**
		 * The meta object literal for the '{@link iot.impl.IntegerValueBindIntegerValueImpl <em>Integer Value Bind Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.impl.IntegerValueBindIntegerValueImpl
		 * @see iot.impl.IotPackageImpl#getIntegerValueBindIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE_BIND_INTEGER_VALUE = eINSTANCE.getIntegerValueBindIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_BIND_INTEGER_VALUE__DELEGATE = eINSTANCE.getIntegerValueBindIntegerValue_Delegate();

	}

} //IotPackage
