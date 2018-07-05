/**
 */
package activitydiagram_simpleexpressions;

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
 * @see activitydiagram_simpleexpressions.Activitydiagram_simpleexpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface Activitydiagram_simpleexpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagram_simpleexpressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/activitydiagram_simpleexpressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagram_simpleexpressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Activitydiagram_simpleexpressionsPackage eINSTANCE = activitydiagram_simpleexpressions.impl.Activitydiagram_simpleexpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagram_simpleexpressions.impl.ExpBindSEExpressionImpl <em>Exp Bind SE Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram_simpleexpressions.impl.ExpBindSEExpressionImpl
	 * @see activitydiagram_simpleexpressions.impl.Activitydiagram_simpleexpressionsPackageImpl#getExpBindSEExpression()
	 * @generated
	 */
	int EXP_BIND_SE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIND_SE_EXPRESSION__DELEGATE = ActivitydiagramPackage.EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exp Bind SE Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIND_SE_EXPRESSION_FEATURE_COUNT = ActivitydiagramPackage.EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exp Bind SE Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_BIND_SE_EXPRESSION_OPERATION_COUNT = ActivitydiagramPackage.EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram_simpleexpressions.impl.BooleanVariableBindSEBooleanVariableImpl <em>Boolean Variable Bind SE Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram_simpleexpressions.impl.BooleanVariableBindSEBooleanVariableImpl
	 * @see activitydiagram_simpleexpressions.impl.Activitydiagram_simpleexpressionsPackageImpl#getBooleanVariableBindSEBooleanVariable()
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
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
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
	 * The meta object id for the '{@link activitydiagram_simpleexpressions.impl.IntegerVariableBindSEIntegerVariableImpl <em>Integer Variable Bind SE Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram_simpleexpressions.impl.IntegerVariableBindSEIntegerVariableImpl
	 * @see activitydiagram_simpleexpressions.impl.Activitydiagram_simpleexpressionsPackageImpl#getIntegerVariableBindSEIntegerVariable()
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
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
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
	 * Returns the meta object for class '{@link activitydiagram_simpleexpressions.ExpBindSEExpression <em>Exp Bind SE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Bind SE Expression</em>'.
	 * @see activitydiagram_simpleexpressions.ExpBindSEExpression
	 * @generated
	 */
	EClass getExpBindSEExpression();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram_simpleexpressions.ExpBindSEExpression#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see activitydiagram_simpleexpressions.ExpBindSEExpression#getDelegate()
	 * @see #getExpBindSEExpression()
	 * @generated
	 */
	EReference getExpBindSEExpression_Delegate();

	/**
	 * Returns the meta object for class '{@link activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable <em>Boolean Variable Bind SE Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Bind SE Boolean Variable</em>'.
	 * @see activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable
	 * @generated
	 */
	EClass getBooleanVariableBindSEBooleanVariable();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable#getDelegate()
	 * @see #getBooleanVariableBindSEBooleanVariable()
	 * @generated
	 */
	EReference getBooleanVariableBindSEBooleanVariable_Delegate();

	/**
	 * Returns the meta object for class '{@link activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable <em>Integer Variable Bind SE Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Bind SE Integer Variable</em>'.
	 * @see activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable
	 * @generated
	 */
	EClass getIntegerVariableBindSEIntegerVariable();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable#getDelegate()
	 * @see #getIntegerVariableBindSEIntegerVariable()
	 * @generated
	 */
	EReference getIntegerVariableBindSEIntegerVariable_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Activitydiagram_simpleexpressionsFactory getActivitydiagram_simpleexpressionsFactory();

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
		 * The meta object literal for the '{@link activitydiagram_simpleexpressions.impl.ExpBindSEExpressionImpl <em>Exp Bind SE Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram_simpleexpressions.impl.ExpBindSEExpressionImpl
		 * @see activitydiagram_simpleexpressions.impl.Activitydiagram_simpleexpressionsPackageImpl#getExpBindSEExpression()
		 * @generated
		 */
		EClass EXP_BIND_SE_EXPRESSION = eINSTANCE.getExpBindSEExpression();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXP_BIND_SE_EXPRESSION__DELEGATE = eINSTANCE.getExpBindSEExpression_Delegate();

		/**
		 * The meta object literal for the '{@link activitydiagram_simpleexpressions.impl.BooleanVariableBindSEBooleanVariableImpl <em>Boolean Variable Bind SE Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram_simpleexpressions.impl.BooleanVariableBindSEBooleanVariableImpl
		 * @see activitydiagram_simpleexpressions.impl.Activitydiagram_simpleexpressionsPackageImpl#getBooleanVariableBindSEBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariableBindSEBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE = eINSTANCE.getBooleanVariableBindSEBooleanVariable_Delegate();

		/**
		 * The meta object literal for the '{@link activitydiagram_simpleexpressions.impl.IntegerVariableBindSEIntegerVariableImpl <em>Integer Variable Bind SE Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram_simpleexpressions.impl.IntegerVariableBindSEIntegerVariableImpl
		 * @see activitydiagram_simpleexpressions.impl.Activitydiagram_simpleexpressionsPackageImpl#getIntegerVariableBindSEIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE = eINSTANCE.getIntegerVariableBindSEIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE__DELEGATE = eINSTANCE.getIntegerVariableBindSEIntegerVariable_Delegate();

	}

} //Activitydiagram_simpleexpressionsPackage
