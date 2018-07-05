/**
 */
package model.util;

import activitydiagram.BooleanVariable;
import activitydiagram.Exp;
import activitydiagram.IntegerVariable;
import activitydiagram.Variable;

import idlmm.IdlStmt;

import iot.IotActivity;
import iot.IotOperationDef;

import model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseExpressionBindSEExpression(ExpressionBindSEExpression object) {
				return createExpressionBindSEExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanVariableBindSEBooleanVariable(BooleanVariableBindSEBooleanVariable object) {
				return createBooleanVariableBindSEBooleanVariableAdapter();
			}
			@Override
			public Adapter caseIntegerVariableBindSEIntegerVariable(IntegerVariableBindSEIntegerVariable object) {
				return createIntegerVariableBindSEIntegerVariableAdapter();
			}
			@Override
			public Adapter caseExpressionBindOperationDef(ExpressionBindOperationDef object) {
				return createExpressionBindOperationDefAdapter();
			}
			@Override
			public Adapter caseIoTActivityBindActivity(IoTActivityBindActivity object) {
				return createIoTActivityBindActivityAdapter();
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
	 * Creates a new adapter for an object of class '{@link model.ExpressionBindSEExpression <em>Expression Bind SE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ExpressionBindSEExpression
	 * @generated
	 */
	public Adapter createExpressionBindSEExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BooleanVariableBindSEBooleanVariable <em>Boolean Variable Bind SE Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BooleanVariableBindSEBooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableBindSEBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.IntegerVariableBindSEIntegerVariable <em>Integer Variable Bind SE Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.IntegerVariableBindSEIntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableBindSEIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ExpressionBindOperationDef <em>Expression Bind Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ExpressionBindOperationDef
	 * @generated
	 */
	public Adapter createExpressionBindOperationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.IoTActivityBindActivity <em>Io TActivity Bind Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.IoTActivityBindActivity
	 * @generated
	 */
	public Adapter createIoTActivityBindActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.IotOperationDefBindOperationDef <em>Iot Operation Def Bind Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.IotOperationDefBindOperationDef
	 * @generated
	 */
	public Adapter createIotOperationDefBindOperationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.IdlStmtBindBlock <em>Idl Stmt Bind Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.IdlStmtBindBlock
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

} //ModelAdapterFactory
