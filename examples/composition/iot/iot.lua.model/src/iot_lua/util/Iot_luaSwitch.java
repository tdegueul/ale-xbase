/**
 */
package iot_lua.util;

import activitydiagram.BooleanVariable;
import activitydiagram.Exp;
import activitydiagram.IntegerVariable;
import activitydiagram.Variable;

import idlmm.IdlStmt;

import iot.IotActivity;
import iot.IotOperationDef;

import iot_lua.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iot_lua.Iot_luaPackage
 * @generated
 */
public class Iot_luaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Iot_luaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot_luaSwitch() {
		if (modelPackage == null) {
			modelPackage = Iot_luaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Iot_luaPackage.EXPRESSION_BIND_STATEMENT: {
				ExpressionBindStatement expressionBindStatement = (ExpressionBindStatement)theEObject;
				T result = caseExpressionBindStatement(expressionBindStatement);
				if (result == null) result = caseExp(expressionBindStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot_luaPackage.BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT: {
				BooleanVariableBindStatement_Assignment booleanVariableBindStatement_Assignment = (BooleanVariableBindStatement_Assignment)theEObject;
				T result = caseBooleanVariableBindStatement_Assignment(booleanVariableBindStatement_Assignment);
				if (result == null) result = caseBooleanVariable(booleanVariableBindStatement_Assignment);
				if (result == null) result = caseVariable(booleanVariableBindStatement_Assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT: {
				IntegerVariableBindStatement_Assignment integerVariableBindStatement_Assignment = (IntegerVariableBindStatement_Assignment)theEObject;
				T result = caseIntegerVariableBindStatement_Assignment(integerVariableBindStatement_Assignment);
				if (result == null) result = caseIntegerVariable(integerVariableBindStatement_Assignment);
				if (result == null) result = caseVariable(integerVariableBindStatement_Assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot_luaPackage.EXPRESSION_BIND_OPERATION_DEF: {
				ExpressionBindOperationDef expressionBindOperationDef = (ExpressionBindOperationDef)theEObject;
				T result = caseExpressionBindOperationDef(expressionBindOperationDef);
				if (result == null) result = caseExp(expressionBindOperationDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot_luaPackage.IOT_ACTIVITY_BIND_ACTIVITY: {
				IotActivityBindActivity iotActivityBindActivity = (IotActivityBindActivity)theEObject;
				T result = caseIotActivityBindActivity(iotActivityBindActivity);
				if (result == null) result = caseIotActivity(iotActivityBindActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot_luaPackage.IOT_OPERATION_DEF_BIND_OPERATION_DEF: {
				IotOperationDefBindOperationDef iotOperationDefBindOperationDef = (IotOperationDefBindOperationDef)theEObject;
				T result = caseIotOperationDefBindOperationDef(iotOperationDefBindOperationDef);
				if (result == null) result = caseIotOperationDef(iotOperationDefBindOperationDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot_luaPackage.IDL_STMT_BIND_BLOCK: {
				IdlStmtBindBlock idlStmtBindBlock = (IdlStmtBindBlock)theEObject;
				T result = caseIdlStmtBindBlock(idlStmtBindBlock);
				if (result == null) result = caseIdlStmt(idlStmtBindBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iot_luaPackage.RUNTIME_DATA: {
				RuntimeData runtimeData = (RuntimeData)theEObject;
				T result = caseRuntimeData(runtimeData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Bind Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Bind Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionBindStatement(ExpressionBindStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Bind Statement Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Bind Statement Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariableBindStatement_Assignment(BooleanVariableBindStatement_Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Bind Statement Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Bind Statement Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVariableBindStatement_Assignment(IntegerVariableBindStatement_Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Bind Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Bind Operation Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionBindOperationDef(ExpressionBindOperationDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iot Activity Bind Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iot Activity Bind Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIotActivityBindActivity(IotActivityBindActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iot Operation Def Bind Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iot Operation Def Bind Operation Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIotOperationDefBindOperationDef(IotOperationDefBindOperationDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idl Stmt Bind Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idl Stmt Bind Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdlStmtBindBlock(IdlStmtBindBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeData(RuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExp(Exp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariable(BooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVariable(IntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIotActivity(IotActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIotOperationDef(IotOperationDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idl Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idl Stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdlStmt(IdlStmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Iot_luaSwitch
