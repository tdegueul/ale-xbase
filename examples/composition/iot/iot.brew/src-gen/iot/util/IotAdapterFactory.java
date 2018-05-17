/**
 */
package iot.util;

import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Expression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.Value;
import activitydiagram.Variable;

import iot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iot.IotPackage
 * @generated
 */
public class IotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IotPackage.eINSTANCE;
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
	protected IotSwitch<Adapter> modelSwitch =
		new IotSwitch<Adapter>() {
			@Override
			public Adapter caseExpressionBindExpression(ExpressionBindExpression object) {
				return createExpressionBindExpressionAdapter();
			}
			@Override
			public Adapter caseValueBindValue(ValueBindValue object) {
				return createValueBindValueAdapter();
			}
			@Override
			public Adapter caseBooleanValueBindBooleanValue(BooleanValueBindBooleanValue object) {
				return createBooleanValueBindBooleanValueAdapter();
			}
			@Override
			public Adapter caseBooleanVariableBindBooleanVariable(BooleanVariableBindBooleanVariable object) {
				return createBooleanVariableBindBooleanVariableAdapter();
			}
			@Override
			public Adapter caseIntegerVariableBindIntegerVariable(IntegerVariableBindIntegerVariable object) {
				return createIntegerVariableBindIntegerVariableAdapter();
			}
			@Override
			public Adapter caseIntegerValueBindIntegerValue(IntegerValueBindIntegerValue object) {
				return createIntegerValueBindIntegerValueAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
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
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link iot.ExpressionBindExpression <em>Expression Bind Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.ExpressionBindExpression
	 * @generated
	 */
	public Adapter createExpressionBindExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.ValueBindValue <em>Value Bind Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.ValueBindValue
	 * @generated
	 */
	public Adapter createValueBindValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.BooleanValueBindBooleanValue <em>Boolean Value Bind Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.BooleanValueBindBooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueBindBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.BooleanVariableBindBooleanVariable <em>Boolean Variable Bind Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.BooleanVariableBindBooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableBindBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.IntegerVariableBindIntegerVariable <em>Integer Variable Bind Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.IntegerVariableBindIntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableBindIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.IntegerValueBindIntegerValue <em>Integer Value Bind Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.IntegerValueBindIntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueBindIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagram.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
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

} //IotAdapterFactory
