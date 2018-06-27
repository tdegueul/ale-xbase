/**
 */
package iot_lua.impl;

import activitydiagram.ActivitydiagramPackage;

import idlmm.IdlmmPackage;

import iot.IotPackage;

import iot_lua.BooleanValueBindExpression;
import iot_lua.BooleanVariableBindStatement_Assignment;
import iot_lua.ExpressionBindOperationDef;
import iot_lua.ExpressionBindStatement;
import iot_lua.IdlStmtBindBlock;
import iot_lua.IntegerValueBindExpression_Number;
import iot_lua.IntegerVariableBindStatement_Assignment;
import iot_lua.IotActivityBindActivity;
import iot_lua.IotOperationDefBindOperationDef;
import iot_lua.Iot_luaFactory;
import iot_lua.Iot_luaPackage;
import iot_lua.ValueBindExpression;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.lua.lua.LuaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Iot_luaPackageImpl extends EPackageImpl implements Iot_luaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionBindStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueBindExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueBindExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableBindStatement_AssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableBindStatement_AssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueBindExpression_NumberEClass = null;

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
	private EClass iotActivityBindActivityEClass = null;

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
	 * @see iot_lua.Iot_luaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Iot_luaPackageImpl() {
		super(eNS_URI, Iot_luaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Iot_luaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Iot_luaPackage init() {
		if (isInited) return (Iot_luaPackage)EPackage.Registry.INSTANCE.getEPackage(Iot_luaPackage.eNS_URI);

		// Obtain or create and register package
		Iot_luaPackageImpl theIot_luaPackage = (Iot_luaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Iot_luaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Iot_luaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();
		IdlmmPackage.eINSTANCE.eClass();
		IotPackage.eINSTANCE.eClass();
		LuaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIot_luaPackage.createPackageContents();

		// Initialize created meta-data
		theIot_luaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIot_luaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Iot_luaPackage.eNS_URI, theIot_luaPackage);
		return theIot_luaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionBindStatement() {
		return expressionBindStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionBindStatement_Delegate() {
		return (EReference)expressionBindStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueBindExpression() {
		return valueBindExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBindExpression_Delegate() {
		return (EReference)valueBindExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueBindExpression() {
		return booleanValueBindExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValueBindExpression_Delegate() {
		return (EReference)booleanValueBindExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableBindStatement_Assignment() {
		return booleanVariableBindStatement_AssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanVariableBindStatement_Assignment_Delegate() {
		return (EReference)booleanVariableBindStatement_AssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableBindStatement_Assignment() {
		return integerVariableBindStatement_AssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerVariableBindStatement_Assignment_Delegate() {
		return (EReference)integerVariableBindStatement_AssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueBindExpression_Number() {
		return integerValueBindExpression_NumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValueBindExpression_Number_Delegate() {
		return (EReference)integerValueBindExpression_NumberEClass.getEStructuralFeatures().get(0);
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
	public EClass getIotActivityBindActivity() {
		return iotActivityBindActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIotActivityBindActivity_Delegate() {
		return (EReference)iotActivityBindActivityEClass.getEStructuralFeatures().get(0);
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
	public Iot_luaFactory getIot_luaFactory() {
		return (Iot_luaFactory)getEFactoryInstance();
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
		expressionBindStatementEClass = createEClass(EXPRESSION_BIND_STATEMENT);
		createEReference(expressionBindStatementEClass, EXPRESSION_BIND_STATEMENT__DELEGATE);

		valueBindExpressionEClass = createEClass(VALUE_BIND_EXPRESSION);
		createEReference(valueBindExpressionEClass, VALUE_BIND_EXPRESSION__DELEGATE);

		booleanValueBindExpressionEClass = createEClass(BOOLEAN_VALUE_BIND_EXPRESSION);
		createEReference(booleanValueBindExpressionEClass, BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE);

		booleanVariableBindStatement_AssignmentEClass = createEClass(BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT);
		createEReference(booleanVariableBindStatement_AssignmentEClass, BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE);

		integerVariableBindStatement_AssignmentEClass = createEClass(INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT);
		createEReference(integerVariableBindStatement_AssignmentEClass, INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE);

		integerValueBindExpression_NumberEClass = createEClass(INTEGER_VALUE_BIND_EXPRESSION_NUMBER);
		createEReference(integerValueBindExpression_NumberEClass, INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE);

		expressionBindOperationDefEClass = createEClass(EXPRESSION_BIND_OPERATION_DEF);
		createEReference(expressionBindOperationDefEClass, EXPRESSION_BIND_OPERATION_DEF__DELEGATE);

		iotActivityBindActivityEClass = createEClass(IOT_ACTIVITY_BIND_ACTIVITY);
		createEReference(iotActivityBindActivityEClass, IOT_ACTIVITY_BIND_ACTIVITY__DELEGATE);

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
		LuaPackage theLuaPackage = (LuaPackage)EPackage.Registry.INSTANCE.getEPackage(LuaPackage.eNS_URI);
		IdlmmPackage theIdlmmPackage = (IdlmmPackage)EPackage.Registry.INSTANCE.getEPackage(IdlmmPackage.eNS_URI);
		IotPackage theIotPackage = (IotPackage)EPackage.Registry.INSTANCE.getEPackage(IotPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionBindStatementEClass.getESuperTypes().add(theActivitydiagramPackage.getExp());
		valueBindExpressionEClass.getESuperTypes().add(theActivitydiagramPackage.getValue());
		booleanValueBindExpressionEClass.getESuperTypes().add(theActivitydiagramPackage.getBooleanValue());
		booleanVariableBindStatement_AssignmentEClass.getESuperTypes().add(theActivitydiagramPackage.getBooleanVariable());
		integerVariableBindStatement_AssignmentEClass.getESuperTypes().add(theActivitydiagramPackage.getIntegerVariable());
		integerValueBindExpression_NumberEClass.getESuperTypes().add(theActivitydiagramPackage.getIntegerValue());
		expressionBindOperationDefEClass.getESuperTypes().add(theActivitydiagramPackage.getExp());
		iotActivityBindActivityEClass.getESuperTypes().add(theIotPackage.getIotActivity());
		iotOperationDefBindOperationDefEClass.getESuperTypes().add(theIotPackage.getIotOperationDef());
		idlStmtBindBlockEClass.getESuperTypes().add(theIdlmmPackage.getIdlStmt());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionBindStatementEClass, ExpressionBindStatement.class, "ExpressionBindStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionBindStatement_Delegate(), theLuaPackage.getStatement(), null, "delegate", null, 0, 1, ExpressionBindStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueBindExpressionEClass, ValueBindExpression.class, "ValueBindExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueBindExpression_Delegate(), theLuaPackage.getExpression(), null, "delegate", null, 0, 1, ValueBindExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueBindExpressionEClass, BooleanValueBindExpression.class, "BooleanValueBindExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanValueBindExpression_Delegate(), theLuaPackage.getExpression(), null, "delegate", null, 0, 1, BooleanValueBindExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariableBindStatement_AssignmentEClass, BooleanVariableBindStatement_Assignment.class, "BooleanVariableBindStatement_Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanVariableBindStatement_Assignment_Delegate(), theLuaPackage.getStatement_FunctioncallOrAssignment(), null, "delegate", null, 0, 1, BooleanVariableBindStatement_Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableBindStatement_AssignmentEClass, IntegerVariableBindStatement_Assignment.class, "IntegerVariableBindStatement_Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerVariableBindStatement_Assignment_Delegate(), theLuaPackage.getStatement_FunctioncallOrAssignment(), null, "delegate", null, 0, 1, IntegerVariableBindStatement_Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueBindExpression_NumberEClass, IntegerValueBindExpression_Number.class, "IntegerValueBindExpression_Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerValueBindExpression_Number_Delegate(), theLuaPackage.getExpression_Number(), null, "delegate", null, 0, 1, IntegerValueBindExpression_Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionBindOperationDefEClass, ExpressionBindOperationDef.class, "ExpressionBindOperationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionBindOperationDef_Delegate(), theIdlmmPackage.getOperationDef(), null, "delegate", null, 0, 1, ExpressionBindOperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iotActivityBindActivityEClass, IotActivityBindActivity.class, "IotActivityBindActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIotActivityBindActivity_Delegate(), theActivitydiagramPackage.getActivity(), null, "delegate", null, 0, 1, IotActivityBindActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iotOperationDefBindOperationDefEClass, IotOperationDefBindOperationDef.class, "IotOperationDefBindOperationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIotOperationDefBindOperationDef_Delegate(), theIdlmmPackage.getOperationDef(), null, "delegate", null, 0, 1, IotOperationDefBindOperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idlStmtBindBlockEClass, IdlStmtBindBlock.class, "IdlStmtBindBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdlStmtBindBlock_Delegate(), theLuaPackage.getBlock(), null, "delegate", null, 0, 1, IdlStmtBindBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Iot_luaPackageImpl
