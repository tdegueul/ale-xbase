/**
 */
package iot.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagramruntime.ActivitydiagramruntimePackage;

import iot.BooleanValueBindBooleanValue;
import iot.BooleanVariableBindBooleanVariable;
import iot.ExpressionBindExpression;
import iot.IntegerValueBindIntegerValue;
import iot.IntegerVariableBindIntegerVariable;
import iot.IotFactory;
import iot.IotPackage;
import iot.ValueBindValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleexpressions.SimpleexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotPackageImpl extends EPackageImpl implements IotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionBindExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueBindValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueBindBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableBindBooleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableBindIntegerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueBindIntegerValueEClass = null;

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
	 * @see iot.IotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IotPackageImpl() {
		super(eNS_URI, IotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IotPackage init() {
		if (isInited) return (IotPackage)EPackage.Registry.INSTANCE.getEPackage(IotPackage.eNS_URI);

		// Obtain or create and register package
		IotPackageImpl theIotPackage = (IotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IotPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramruntimePackage.eINSTANCE.eClass();
		SimpleexpressionsPackage.eINSTANCE.eClass();
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIotPackage.createPackageContents();

		// Initialize created meta-data
		theIotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIotPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IotPackage.eNS_URI, theIotPackage);
		return theIotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionBindExpression() {
		return expressionBindExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionBindExpression_Delegate() {
		return (EReference)expressionBindExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueBindValue() {
		return valueBindValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBindValue_Delegate() {
		return (EReference)valueBindValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueBindBooleanValue() {
		return booleanValueBindBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValueBindBooleanValue_Delegate() {
		return (EReference)booleanValueBindBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableBindBooleanVariable() {
		return booleanVariableBindBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanVariableBindBooleanVariable_Delegate() {
		return (EReference)booleanVariableBindBooleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableBindIntegerVariable() {
		return integerVariableBindIntegerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerVariableBindIntegerVariable_Delegate() {
		return (EReference)integerVariableBindIntegerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueBindIntegerValue() {
		return integerValueBindIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValueBindIntegerValue_Delegate() {
		return (EReference)integerValueBindIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotFactory getIotFactory() {
		return (IotFactory)getEFactoryInstance();
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
		expressionBindExpressionEClass = createEClass(EXPRESSION_BIND_EXPRESSION);
		createEReference(expressionBindExpressionEClass, EXPRESSION_BIND_EXPRESSION__DELEGATE);

		valueBindValueEClass = createEClass(VALUE_BIND_VALUE);
		createEReference(valueBindValueEClass, VALUE_BIND_VALUE__DELEGATE);

		booleanValueBindBooleanValueEClass = createEClass(BOOLEAN_VALUE_BIND_BOOLEAN_VALUE);
		createEReference(booleanValueBindBooleanValueEClass, BOOLEAN_VALUE_BIND_BOOLEAN_VALUE__DELEGATE);

		booleanVariableBindBooleanVariableEClass = createEClass(BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE);
		createEReference(booleanVariableBindBooleanVariableEClass, BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE__DELEGATE);

		integerVariableBindIntegerVariableEClass = createEClass(INTEGER_VARIABLE_BIND_INTEGER_VARIABLE);
		createEReference(integerVariableBindIntegerVariableEClass, INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE);

		integerValueBindIntegerValueEClass = createEClass(INTEGER_VALUE_BIND_INTEGER_VALUE);
		createEReference(integerValueBindIntegerValueEClass, INTEGER_VALUE_BIND_INTEGER_VALUE__DELEGATE);
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

		// Obtain other dependent packages
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);
		SimpleexpressionsPackage theSimpleexpressionsPackage = (SimpleexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleexpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionBindExpressionEClass.getESuperTypes().add(theActivitydiagramPackage.getExpression());
		valueBindValueEClass.getESuperTypes().add(theActivitydiagramPackage.getValue());
		booleanValueBindBooleanValueEClass.getESuperTypes().add(theActivitydiagramPackage.getBooleanValue());
		booleanVariableBindBooleanVariableEClass.getESuperTypes().add(theActivitydiagramPackage.getBooleanVariable());
		integerVariableBindIntegerVariableEClass.getESuperTypes().add(theActivitydiagramPackage.getIntegerVariable());
		integerValueBindIntegerValueEClass.getESuperTypes().add(theActivitydiagramPackage.getIntegerValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionBindExpressionEClass, ExpressionBindExpression.class, "ExpressionBindExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionBindExpression_Delegate(), theSimpleexpressionsPackage.getExpression(), null, "delegate", null, 1, 1, ExpressionBindExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueBindValueEClass, ValueBindValue.class, "ValueBindValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueBindValue_Delegate(), theSimpleexpressionsPackage.getValue(), null, "delegate", null, 1, 1, ValueBindValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueBindBooleanValueEClass, BooleanValueBindBooleanValue.class, "BooleanValueBindBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanValueBindBooleanValue_Delegate(), theSimpleexpressionsPackage.getBooleanValue(), null, "delegate", null, 1, 1, BooleanValueBindBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariableBindBooleanVariableEClass, BooleanVariableBindBooleanVariable.class, "BooleanVariableBindBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanVariableBindBooleanVariable_Delegate(), theSimpleexpressionsPackage.getBooleanVariable(), null, "delegate", null, 1, 1, BooleanVariableBindBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableBindIntegerVariableEClass, IntegerVariableBindIntegerVariable.class, "IntegerVariableBindIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerVariableBindIntegerVariable_Delegate(), theSimpleexpressionsPackage.getIntegerVariable(), null, "delegate", null, 1, 1, IntegerVariableBindIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueBindIntegerValueEClass, IntegerValueBindIntegerValue.class, "IntegerValueBindIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerValueBindIntegerValue_Delegate(), theSimpleexpressionsPackage.getIntegerValue(), null, "delegate", null, 1, 1, IntegerValueBindIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// @BrewRequires
		create_BrewRequiresAnnotations();
	}

	/**
	 * Initializes the annotations for <b>@BrewRequires</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_BrewRequiresAnnotations() {
		String source = "@BrewRequires";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "platform:/resource/org.xtext.activitydiagram.ale.semantics.model/model/activitydiagramruntime.ecore", "ecoreUrl",
			 "platform:/resource/simpleexpressions.model/model/simpleexpressions.ecore", "ecoreUrl"
		   });
	}

} //IotPackageImpl
