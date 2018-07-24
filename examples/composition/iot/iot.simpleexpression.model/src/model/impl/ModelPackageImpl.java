/**
 */
package model.impl;

import activitydiagram.ActivitydiagramPackage;

import idlmm.IdlmmPackage;

import iot.IotPackage;

import model.BooleanVariableBindSEBooleanVariable;
import model.ExpressionBindOperationDef;
import model.ExpressionBindSEExpression;
import model.IdlStmtBindBlock;
import model.IntegerVariableBindSEIntegerVariable;
import model.IoTActivityBindActivity;
import model.IotOperationDefBindOperationDef;
import model.ModelFactory;
import model.ModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleALEnv.SimpleALEnvPackage;

import simpleexpressions.SimpleexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionBindSEExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableBindSEBooleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableBindSEIntegerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionBindOperationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTActivityBindActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iotOperationDefBindOperationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlStmtBindBlockEClass = null;

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
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl ? (ModelPackageImpl)registeredModelPackage : new ModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();
		IdlmmPackage.eINSTANCE.eClass();
		IotPackage.eINSTANCE.eClass();
		SimpleALEnvPackage.eINSTANCE.eClass();
		SimpleexpressionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionBindSEExpression() {
		return expressionBindSEExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionBindSEExpression_Delegate() {
		return (EReference)expressionBindSEExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableBindSEBooleanVariable() {
		return booleanVariableBindSEBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanVariableBindSEBooleanVariable_Delegate() {
		return (EReference)booleanVariableBindSEBooleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableBindSEIntegerVariable() {
		return integerVariableBindSEIntegerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerVariableBindSEIntegerVariable_Delegate() {
		return (EReference)integerVariableBindSEIntegerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionBindOperationDef() {
		return expressionBindOperationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionBindOperationDef_Delegate() {
		return (EReference)expressionBindOperationDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTActivityBindActivity() {
		return ioTActivityBindActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTActivityBindActivity_Delegate() {
		return (EReference)ioTActivityBindActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIotOperationDefBindOperationDef() {
		return iotOperationDefBindOperationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIotOperationDefBindOperationDef_Delegate() {
		return (EReference)iotOperationDefBindOperationDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdlStmtBindBlock() {
		return idlStmtBindBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdlStmtBindBlock_Delegate() {
		return (EReference)idlStmtBindBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		expressionBindSEExpressionEClass = createEClass(EXPRESSION_BIND_SE_EXPRESSION);
		createEReference(expressionBindSEExpressionEClass, EXPRESSION_BIND_SE_EXPRESSION__DELEGATE);

		booleanVariableBindSEBooleanVariableEClass = createEClass(BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE);
		createEReference(booleanVariableBindSEBooleanVariableEClass, BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE);

		integerVariableBindSEIntegerVariableEClass = createEClass(INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE);
		createEReference(integerVariableBindSEIntegerVariableEClass, INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE__DELEGATE);

		expressionBindOperationDefEClass = createEClass(EXPRESSION_BIND_OPERATION_DEF);
		createEReference(expressionBindOperationDefEClass, EXPRESSION_BIND_OPERATION_DEF__DELEGATE);

		ioTActivityBindActivityEClass = createEClass(IO_TACTIVITY_BIND_ACTIVITY);
		createEReference(ioTActivityBindActivityEClass, IO_TACTIVITY_BIND_ACTIVITY__DELEGATE);

		iotOperationDefBindOperationDefEClass = createEClass(IOT_OPERATION_DEF_BIND_OPERATION_DEF);
		createEReference(iotOperationDefBindOperationDefEClass, IOT_OPERATION_DEF_BIND_OPERATION_DEF__DELEGATE);

		idlStmtBindBlockEClass = createEClass(IDL_STMT_BIND_BLOCK);
		createEReference(idlStmtBindBlockEClass, IDL_STMT_BIND_BLOCK__DELEGATE);
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
		IdlmmPackage theIdlmmPackage = (IdlmmPackage)EPackage.Registry.INSTANCE.getEPackage(IdlmmPackage.eNS_URI);
		IotPackage theIotPackage = (IotPackage)EPackage.Registry.INSTANCE.getEPackage(IotPackage.eNS_URI);
		SimpleALEnvPackage theSimpleALEnvPackage = (SimpleALEnvPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleALEnvPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionBindSEExpressionEClass.getESuperTypes().add(theActivitydiagramPackage.getExp());
		booleanVariableBindSEBooleanVariableEClass.getESuperTypes().add(theActivitydiagramPackage.getBooleanVariable());
		integerVariableBindSEIntegerVariableEClass.getESuperTypes().add(theActivitydiagramPackage.getIntegerVariable());
		expressionBindOperationDefEClass.getESuperTypes().add(theActivitydiagramPackage.getExp());
		ioTActivityBindActivityEClass.getESuperTypes().add(theIotPackage.getIotActivity());
		iotOperationDefBindOperationDefEClass.getESuperTypes().add(theIotPackage.getIotOperationDef());
		idlStmtBindBlockEClass.getESuperTypes().add(theIdlmmPackage.getIdlStmt());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionBindSEExpressionEClass, ExpressionBindSEExpression.class, "ExpressionBindSEExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionBindSEExpression_Delegate(), theSimpleexpressionsPackage.getSEExpression(), null, "delegate", null, 0, 1, ExpressionBindSEExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariableBindSEBooleanVariableEClass, BooleanVariableBindSEBooleanVariable.class, "BooleanVariableBindSEBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanVariableBindSEBooleanVariable_Delegate(), theSimpleexpressionsPackage.getSEBooleanVariable(), null, "delegate", null, 0, 1, BooleanVariableBindSEBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableBindSEIntegerVariableEClass, IntegerVariableBindSEIntegerVariable.class, "IntegerVariableBindSEIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerVariableBindSEIntegerVariable_Delegate(), theSimpleexpressionsPackage.getSEIntegerVariable(), null, "delegate", null, 0, 1, IntegerVariableBindSEIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionBindOperationDefEClass, ExpressionBindOperationDef.class, "ExpressionBindOperationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionBindOperationDef_Delegate(), theIdlmmPackage.getOperationDef(), null, "delegate", null, 0, 1, ExpressionBindOperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioTActivityBindActivityEClass, IoTActivityBindActivity.class, "IoTActivityBindActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTActivityBindActivity_Delegate(), theActivitydiagramPackage.getActivity(), null, "delegate", null, 0, 1, IoTActivityBindActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iotOperationDefBindOperationDefEClass, IotOperationDefBindOperationDef.class, "IotOperationDefBindOperationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIotOperationDefBindOperationDef_Delegate(), theIdlmmPackage.getOperationDef(), null, "delegate", null, 0, 1, IotOperationDefBindOperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idlStmtBindBlockEClass, IdlStmtBindBlock.class, "IdlStmtBindBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdlStmtBindBlock_Delegate(), theSimpleALEnvPackage.getBlock(), null, "delegate", null, 0, 1, IdlStmtBindBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
