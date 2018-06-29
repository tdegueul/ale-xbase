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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iot_lua.Iot_luaPackage
 * @generated
 */
public class Iot_luaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Iot_luaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iot_luaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Iot_luaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Iot_luaSwitch<Adapter> modelSwitch =
		new Iot_luaSwitch<Adapter>() {
			@Override
			public Adapter caseExpressionBindStatement(ExpressionBindStatement object) {
				return createExpressionBindStatementAdapter();
			}
			@Override
			public Adapter caseBooleanVariableBindStatement_Assignment(BooleanVariableBindStatement_Assignment object) {
				return createBooleanVariableBindStatement_AssignmentAdapter();
			}
			@Override
			public Adapter caseIntegerVariableBindStatement_Assignment(IntegerVariableBindStatement_Assignment object) {
				return createIntegerVariableBindStatement_AssignmentAdapter();
			}
			@Override
			public Adapter caseExpressionBindOperationDef(ExpressionBindOperationDef object) {
				return createExpressionBindOperationDefAdapter();
			}
			@Override
			public Adapter caseIotActivityBindActivity(IotActivityBindActivity object) {
				return createIotActivityBindActivityAdapter();
			}
			@Override
			public Adapter caseIotOperationDefBindOperationDef(IotOperationDefBindOperationDef object) {
				return createIotOperationDefBindOperationDefAdapter();
			}
			@Override
			public Adapter caseIdlStmtBindBlock(IdlStmtBindBlock object) {
				return createIdlStmtBindBlockAdapter();
			}
			@Override
			public Adapter caseExp(Exp object) {
				return createExpAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseBooleanVariable(BooleanVariable object) {
				return createBooleanVariableAdapter();
			}
			@Override
			public Adapter caseIntegerVariable(IntegerVariable object) {
				return createIntegerVariableAdapter();
			}
			@Override
			public Adapter caseIotActivity(IotActivity object) {
				return createIotActivityAdapter();
			}
			@Override
			public Adapter caseIotOperationDef(IotOperationDef object) {
				return createIotOperationDefAdapter();
			}
			@Override
			public Adapter caseIdlStmt(IdlStmt object) {
				return createIdlStmtAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link iot_lua.ExpressionBindStatement <em>Expression Bind Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot_lua.ExpressionBindStatement
	 * @generated
	 */
	public Adapter createExpressionBindStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot_lua.BooleanVariableBindStatement_Assignment <em>Boolean Variable Bind Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot_lua.BooleanVariableBindStatement_Assignment
	 * @generated
	 */
	public Adapter createBooleanVariableBindStatement_AssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot_lua.IntegerVariableBindStatement_Assignment <em>Integer Variable Bind Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot_lua.IntegerVariableBindStatement_Assignment
	 * @generated
	 */
	public Adapter createIntegerVariableBindStatement_AssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot_lua.ExpressionBindOperationDef <em>Expression Bind Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot_lua.ExpressionBindOperationDef
	 * @generated
	 */
	public Adapter createExpressionBindOperationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot_lua.IotActivityBindActivity <em>Iot Activity Bind Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot_lua.IotActivityBindActivity
	 * @generated
	 */
	public Adapter createIotActivityBindActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot_lua.IotOperationDefBindOperationDef <em>Iot Operation Def Bind Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot_lua.IotOperationDefBindOperationDef
	 * @generated
	 */
	public Adapter createIotOperationDefBindOperationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot_lua.IdlStmtBindBlock <em>Idl Stmt Bind Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot_lua.IdlStmtBindBlock
	 * @generated
	 */
	public Adapter createIdlStmtBindBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Exp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Exp
	 * @generated
	 */
	public Adapter createExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.BooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.IntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.IotActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.IotActivity
	 * @generated
	 */
	public Adapter createIotActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.IotOperationDef <em>Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.IotOperationDef
	 * @generated
	 */
	public Adapter createIotOperationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idlmm.IdlStmt <em>Idl Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idlmm.IdlStmt
	 * @generated
	 */
	public Adapter createIdlStmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Iot_luaAdapterFactory
