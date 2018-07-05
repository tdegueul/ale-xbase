/**
 */
package simpleexpressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleexpressions.SEBooleanBinaryExpression;
import simpleexpressions.SEBooleanBinaryOperator;
import simpleexpressions.SEBooleanExpression;
import simpleexpressions.SEBooleanUnaryExpression;
import simpleexpressions.SEBooleanUnaryOperator;
import simpleexpressions.SEBooleanValue;
import simpleexpressions.SEBooleanVariable;
import simpleexpressions.SEExpression;
import simpleexpressions.SEIntegerCalculationExpression;
import simpleexpressions.SEIntegerCalculationOperator;
import simpleexpressions.SEIntegerComparisonExpression;
import simpleexpressions.SEIntegerComparisonOperator;
import simpleexpressions.SEIntegerExpression;
import simpleexpressions.SEIntegerValue;
import simpleexpressions.SEIntegerVariable;
import simpleexpressions.SEValue;
import simpleexpressions.SEVariable;
import simpleexpressions.SimpleexpressionsFactory;
import simpleexpressions.SimpleexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleexpressionsPackageImpl extends EPackageImpl implements SimpleexpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seIntegerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seIntegerCalculationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seIntegerComparisonExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seIntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seBooleanBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seBooleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seIntegerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seBooleanUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seIntegerCalculationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seIntegerComparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seBooleanUnaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seBooleanBinaryOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simpleexpressions.SimpleexpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleexpressionsPackageImpl() {
		super(eNS_URI, SimpleexpressionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimpleexpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleexpressionsPackage init() {
		if (isInited) return (SimpleexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleexpressionsPackage.eNS_URI);

		// Obtain or create and register package
		SimpleexpressionsPackageImpl theSimpleexpressionsPackage = (SimpleexpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleexpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleexpressionsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimpleexpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleexpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleexpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleexpressionsPackage.eNS_URI, theSimpleexpressionsPackage);
		return theSimpleexpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEIntegerExpression() {
		return seIntegerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEIntegerExpression_Operand2() {
		return (EReference)seIntegerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEIntegerExpression_Operand1() {
		return (EReference)seIntegerExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEIntegerCalculationExpression() {
		return seIntegerCalculationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEIntegerCalculationExpression_Assignee() {
		return (EReference)seIntegerCalculationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEIntegerCalculationExpression_Operator() {
		return (EAttribute)seIntegerCalculationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEIntegerComparisonExpression() {
		return seIntegerComparisonExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEIntegerComparisonExpression_Assignee() {
		return (EReference)seIntegerComparisonExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEIntegerComparisonExpression_Operator() {
		return (EAttribute)seIntegerComparisonExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEBooleanValue() {
		return seBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEBooleanValue_Value() {
		return (EAttribute)seBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEIntegerValue() {
		return seIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEIntegerValue_Value() {
		return (EAttribute)seIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEBooleanBinaryExpression() {
		return seBooleanBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEBooleanBinaryExpression_Operand1() {
		return (EReference)seBooleanBinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEBooleanBinaryExpression_Operand2() {
		return (EReference)seBooleanBinaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEBooleanBinaryExpression_Operator() {
		return (EAttribute)seBooleanBinaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEValue() {
		return seValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEBooleanVariable() {
		return seBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEExpression() {
		return seExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEIntegerVariable() {
		return seIntegerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEBooleanUnaryExpression() {
		return seBooleanUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEBooleanUnaryExpression_Operand() {
		return (EReference)seBooleanUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEBooleanUnaryExpression_Operator() {
		return (EAttribute)seBooleanUnaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEBooleanExpression() {
		return seBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEBooleanExpression_Assignee() {
		return (EReference)seBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEVariable() {
		return seVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEVariable_CurrentValue() {
		return (EReference)seVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEVariable_Name() {
		return (EAttribute)seVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEVariable_InitialValue() {
		return (EReference)seVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSEIntegerCalculationOperator() {
		return seIntegerCalculationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSEIntegerComparisonOperator() {
		return seIntegerComparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSEBooleanUnaryOperator() {
		return seBooleanUnaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSEBooleanBinaryOperator() {
		return seBooleanBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleexpressionsFactory getSimpleexpressionsFactory() {
		return (SimpleexpressionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		seIntegerExpressionEClass = createEClass(SE_INTEGER_EXPRESSION);
		createEReference(seIntegerExpressionEClass, SE_INTEGER_EXPRESSION__OPERAND2);
		createEReference(seIntegerExpressionEClass, SE_INTEGER_EXPRESSION__OPERAND1);

		seIntegerCalculationExpressionEClass = createEClass(SE_INTEGER_CALCULATION_EXPRESSION);
		createEReference(seIntegerCalculationExpressionEClass, SE_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE);
		createEAttribute(seIntegerCalculationExpressionEClass, SE_INTEGER_CALCULATION_EXPRESSION__OPERATOR);

		seIntegerComparisonExpressionEClass = createEClass(SE_INTEGER_COMPARISON_EXPRESSION);
		createEReference(seIntegerComparisonExpressionEClass, SE_INTEGER_COMPARISON_EXPRESSION__ASSIGNEE);
		createEAttribute(seIntegerComparisonExpressionEClass, SE_INTEGER_COMPARISON_EXPRESSION__OPERATOR);

		seBooleanValueEClass = createEClass(SE_BOOLEAN_VALUE);
		createEAttribute(seBooleanValueEClass, SE_BOOLEAN_VALUE__VALUE);

		seIntegerValueEClass = createEClass(SE_INTEGER_VALUE);
		createEAttribute(seIntegerValueEClass, SE_INTEGER_VALUE__VALUE);

		seBooleanBinaryExpressionEClass = createEClass(SE_BOOLEAN_BINARY_EXPRESSION);
		createEReference(seBooleanBinaryExpressionEClass, SE_BOOLEAN_BINARY_EXPRESSION__OPERAND1);
		createEReference(seBooleanBinaryExpressionEClass, SE_BOOLEAN_BINARY_EXPRESSION__OPERAND2);
		createEAttribute(seBooleanBinaryExpressionEClass, SE_BOOLEAN_BINARY_EXPRESSION__OPERATOR);

		seValueEClass = createEClass(SE_VALUE);

		seBooleanVariableEClass = createEClass(SE_BOOLEAN_VARIABLE);

		seExpressionEClass = createEClass(SE_EXPRESSION);

		seIntegerVariableEClass = createEClass(SE_INTEGER_VARIABLE);

		seBooleanUnaryExpressionEClass = createEClass(SE_BOOLEAN_UNARY_EXPRESSION);
		createEReference(seBooleanUnaryExpressionEClass, SE_BOOLEAN_UNARY_EXPRESSION__OPERAND);
		createEAttribute(seBooleanUnaryExpressionEClass, SE_BOOLEAN_UNARY_EXPRESSION__OPERATOR);

		seBooleanExpressionEClass = createEClass(SE_BOOLEAN_EXPRESSION);
		createEReference(seBooleanExpressionEClass, SE_BOOLEAN_EXPRESSION__ASSIGNEE);

		seVariableEClass = createEClass(SE_VARIABLE);
		createEReference(seVariableEClass, SE_VARIABLE__CURRENT_VALUE);
		createEAttribute(seVariableEClass, SE_VARIABLE__NAME);
		createEReference(seVariableEClass, SE_VARIABLE__INITIAL_VALUE);

		// Create enums
		seIntegerCalculationOperatorEEnum = createEEnum(SE_INTEGER_CALCULATION_OPERATOR);
		seIntegerComparisonOperatorEEnum = createEEnum(SE_INTEGER_COMPARISON_OPERATOR);
		seBooleanUnaryOperatorEEnum = createEEnum(SE_BOOLEAN_UNARY_OPERATOR);
		seBooleanBinaryOperatorEEnum = createEEnum(SE_BOOLEAN_BINARY_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		seIntegerExpressionEClass.getESuperTypes().add(this.getSEExpression());
		seIntegerCalculationExpressionEClass.getESuperTypes().add(this.getSEIntegerExpression());
		seIntegerComparisonExpressionEClass.getESuperTypes().add(this.getSEIntegerExpression());
		seBooleanValueEClass.getESuperTypes().add(this.getSEValue());
		seIntegerValueEClass.getESuperTypes().add(this.getSEValue());
		seBooleanBinaryExpressionEClass.getESuperTypes().add(this.getSEBooleanExpression());
		seValueEClass.getESuperTypes().add(this.getSEExpression());
		seBooleanVariableEClass.getESuperTypes().add(this.getSEVariable());
		seIntegerVariableEClass.getESuperTypes().add(this.getSEVariable());
		seBooleanUnaryExpressionEClass.getESuperTypes().add(this.getSEBooleanExpression());
		seBooleanExpressionEClass.getESuperTypes().add(this.getSEExpression());
		seVariableEClass.getESuperTypes().add(this.getSEExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(seIntegerExpressionEClass, SEIntegerExpression.class, "SEIntegerExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEIntegerExpression_Operand2(), this.getSEIntegerVariable(), null, "operand2", null, 0, 1, SEIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSEIntegerExpression_Operand1(), this.getSEIntegerVariable(), null, "operand1", null, 0, 1, SEIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seIntegerCalculationExpressionEClass, SEIntegerCalculationExpression.class, "SEIntegerCalculationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEIntegerCalculationExpression_Assignee(), this.getSEIntegerVariable(), null, "assignee", null, 1, 1, SEIntegerCalculationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSEIntegerCalculationExpression_Operator(), this.getSEIntegerCalculationOperator(), "operator", null, 1, 1, SEIntegerCalculationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seIntegerComparisonExpressionEClass, SEIntegerComparisonExpression.class, "SEIntegerComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEIntegerComparisonExpression_Assignee(), this.getSEBooleanVariable(), null, "assignee", null, 1, 1, SEIntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSEIntegerComparisonExpression_Operator(), this.getSEIntegerComparisonOperator(), "operator", null, 1, 1, SEIntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seBooleanValueEClass, SEBooleanValue.class, "SEBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSEBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, SEBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seIntegerValueEClass, SEIntegerValue.class, "SEIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSEIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, SEIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seBooleanBinaryExpressionEClass, SEBooleanBinaryExpression.class, "SEBooleanBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEBooleanBinaryExpression_Operand1(), this.getSEBooleanVariable(), null, "operand1", null, 1, 1, SEBooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSEBooleanBinaryExpression_Operand2(), this.getSEBooleanVariable(), null, "operand2", null, 1, 1, SEBooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSEBooleanBinaryExpression_Operator(), this.getSEBooleanBinaryOperator(), "operator", null, 1, 1, SEBooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seValueEClass, SEValue.class, "SEValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seBooleanVariableEClass, SEBooleanVariable.class, "SEBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seExpressionEClass, SEExpression.class, "SEExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seIntegerVariableEClass, SEIntegerVariable.class, "SEIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seBooleanUnaryExpressionEClass, SEBooleanUnaryExpression.class, "SEBooleanUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEBooleanUnaryExpression_Operand(), this.getSEBooleanVariable(), null, "operand", null, 1, 1, SEBooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSEBooleanUnaryExpression_Operator(), this.getSEBooleanUnaryOperator(), "operator", null, 1, 1, SEBooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seBooleanExpressionEClass, SEBooleanExpression.class, "SEBooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEBooleanExpression_Assignee(), this.getSEBooleanVariable(), null, "assignee", null, 1, 1, SEBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seVariableEClass, SEVariable.class, "SEVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEVariable_CurrentValue(), this.getSEValue(), null, "currentValue", null, 0, 1, SEVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSEVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, SEVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSEVariable_InitialValue(), this.getSEValue(), null, "initialValue", null, 0, 1, SEVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(seIntegerCalculationOperatorEEnum, SEIntegerCalculationOperator.class, "SEIntegerCalculationOperator");
		addEEnumLiteral(seIntegerCalculationOperatorEEnum, SEIntegerCalculationOperator.ADD);
		addEEnumLiteral(seIntegerCalculationOperatorEEnum, SEIntegerCalculationOperator.SUBRACT);

		initEEnum(seIntegerComparisonOperatorEEnum, SEIntegerComparisonOperator.class, "SEIntegerComparisonOperator");
		addEEnumLiteral(seIntegerComparisonOperatorEEnum, SEIntegerComparisonOperator.SMALLER);
		addEEnumLiteral(seIntegerComparisonOperatorEEnum, SEIntegerComparisonOperator.SMALLER_EQUALS);
		addEEnumLiteral(seIntegerComparisonOperatorEEnum, SEIntegerComparisonOperator.EQUALS);
		addEEnumLiteral(seIntegerComparisonOperatorEEnum, SEIntegerComparisonOperator.GREATER_EQUALS);
		addEEnumLiteral(seIntegerComparisonOperatorEEnum, SEIntegerComparisonOperator.GREATER);

		initEEnum(seBooleanUnaryOperatorEEnum, SEBooleanUnaryOperator.class, "SEBooleanUnaryOperator");
		addEEnumLiteral(seBooleanUnaryOperatorEEnum, SEBooleanUnaryOperator.NOT);

		initEEnum(seBooleanBinaryOperatorEEnum, SEBooleanBinaryOperator.class, "SEBooleanBinaryOperator");
		addEEnumLiteral(seBooleanBinaryOperatorEEnum, SEBooleanBinaryOperator.AND);
		addEEnumLiteral(seBooleanBinaryOperatorEEnum, SEBooleanBinaryOperator.OR);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleexpressionsPackageImpl
