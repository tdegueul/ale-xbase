/**
 */
package iot_lua.impl;

import iot_lua.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Iot_luaFactoryImpl extends EFactoryImpl implements Iot_luaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Iot_luaFactory init() {
		try {
			Iot_luaFactory theIot_luaFactory = (Iot_luaFactory)EPackage.Registry.INSTANCE.getEFactory(Iot_luaPackage.eNS_URI);
			if (theIot_luaFactory != null) {
				return theIot_luaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Iot_luaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot_luaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Iot_luaPackage.EXPRESSION_BIND_STATEMENT: return createExpressionBindStatement();
			case Iot_luaPackage.BOOLEAN_VALUE_BIND_EXPRESSION: return createBooleanValueBindExpression();
			case Iot_luaPackage.BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT: return createBooleanVariableBindStatement_Assignment();
			case Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT: return createIntegerVariableBindStatement_Assignment();
			case Iot_luaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER: return createIntegerValueBindExpression_Number();
			case Iot_luaPackage.EXPRESSION_BIND_OPERATION_DEF: return createExpressionBindOperationDef();
			case Iot_luaPackage.IOT_ACTIVITY_BIND_ACTIVITY: return createIotActivityBindActivity();
			case Iot_luaPackage.IOT_OPERATION_DEF_BIND_OPERATION_DEF: return createIotOperationDefBindOperationDef();
			case Iot_luaPackage.IDL_STMT_BIND_BLOCK: return createIdlStmtBindBlock();
			case Iot_luaPackage.RUNTIME_DATA: return createRuntimeData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBindStatement createExpressionBindStatement() {
		ExpressionBindStatementImpl expressionBindStatement = new ExpressionBindStatementImpl();
		return expressionBindStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueBindExpression createBooleanValueBindExpression() {
		BooleanValueBindExpressionImpl booleanValueBindExpression = new BooleanValueBindExpressionImpl();
		return booleanValueBindExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableBindStatement_Assignment createBooleanVariableBindStatement_Assignment() {
		BooleanVariableBindStatement_AssignmentImpl booleanVariableBindStatement_Assignment = new BooleanVariableBindStatement_AssignmentImpl();
		return booleanVariableBindStatement_Assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableBindStatement_Assignment createIntegerVariableBindStatement_Assignment() {
		IntegerVariableBindStatement_AssignmentImpl integerVariableBindStatement_Assignment = new IntegerVariableBindStatement_AssignmentImpl();
		return integerVariableBindStatement_Assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueBindExpression_Number createIntegerValueBindExpression_Number() {
		IntegerValueBindExpression_NumberImpl integerValueBindExpression_Number = new IntegerValueBindExpression_NumberImpl();
		return integerValueBindExpression_Number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBindOperationDef createExpressionBindOperationDef() {
		ExpressionBindOperationDefImpl expressionBindOperationDef = new ExpressionBindOperationDefImpl();
		return expressionBindOperationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotActivityBindActivity createIotActivityBindActivity() {
		IotActivityBindActivityImpl iotActivityBindActivity = new IotActivityBindActivityImpl();
		return iotActivityBindActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotOperationDefBindOperationDef createIotOperationDefBindOperationDef() {
		IotOperationDefBindOperationDefImpl iotOperationDefBindOperationDef = new IotOperationDefBindOperationDefImpl();
		return iotOperationDefBindOperationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlStmtBindBlock createIdlStmtBindBlock() {
		IdlStmtBindBlockImpl idlStmtBindBlock = new IdlStmtBindBlockImpl();
		return idlStmtBindBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeData createRuntimeData() {
		RuntimeDataImpl runtimeData = new RuntimeDataImpl();
		return runtimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot_luaPackage getIot_luaPackage() {
		return (Iot_luaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Iot_luaPackage getPackage() {
		return Iot_luaPackage.eINSTANCE;
	}

} //Iot_luaFactoryImpl
