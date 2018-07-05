/**
 */
package simpleexpressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simpleexpressions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simpleexpressions.SimpleexpressionsPackage
 * @generated
 */
public class SimpleexpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleexpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleexpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimpleexpressionsPackage.eINSTANCE;
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
	protected SimpleexpressionsSwitch<Adapter> modelSwitch =
		new SimpleexpressionsSwitch<Adapter>() {
			@Override
			public Adapter caseSEIntegerExpression(SEIntegerExpression object) {
				return createSEIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseSEIntegerCalculationExpression(SEIntegerCalculationExpression object) {
				return createSEIntegerCalculationExpressionAdapter();
			}
			@Override
			public Adapter caseSEIntegerComparisonExpression(SEIntegerComparisonExpression object) {
				return createSEIntegerComparisonExpressionAdapter();
			}
			@Override
			public Adapter caseSEBooleanValue(SEBooleanValue object) {
				return createSEBooleanValueAdapter();
			}
			@Override
			public Adapter caseSEIntegerValue(SEIntegerValue object) {
				return createSEIntegerValueAdapter();
			}
			@Override
			public Adapter caseSEBooleanBinaryExpression(SEBooleanBinaryExpression object) {
				return createSEBooleanBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseSEValue(SEValue object) {
				return createSEValueAdapter();
			}
			@Override
			public Adapter caseSEBooleanVariable(SEBooleanVariable object) {
				return createSEBooleanVariableAdapter();
			}
			@Override
			public Adapter caseSEExpression(SEExpression object) {
				return createSEExpressionAdapter();
			}
			@Override
			public Adapter caseSEIntegerVariable(SEIntegerVariable object) {
				return createSEIntegerVariableAdapter();
			}
			@Override
			public Adapter caseSEBooleanUnaryExpression(SEBooleanUnaryExpression object) {
				return createSEBooleanUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseSEBooleanExpression(SEBooleanExpression object) {
				return createSEBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseSEVariable(SEVariable object) {
				return createSEVariableAdapter();
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
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEIntegerExpression <em>SE Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEIntegerExpression
	 * @generated
	 */
	public Adapter createSEIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEIntegerCalculationExpression <em>SE Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEIntegerCalculationExpression
	 * @generated
	 */
	public Adapter createSEIntegerCalculationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEIntegerComparisonExpression <em>SE Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEIntegerComparisonExpression
	 * @generated
	 */
	public Adapter createSEIntegerComparisonExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEBooleanValue <em>SE Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEBooleanValue
	 * @generated
	 */
	public Adapter createSEBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEIntegerValue <em>SE Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEIntegerValue
	 * @generated
	 */
	public Adapter createSEIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEBooleanBinaryExpression <em>SE Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEBooleanBinaryExpression
	 * @generated
	 */
	public Adapter createSEBooleanBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEValue <em>SE Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEValue
	 * @generated
	 */
	public Adapter createSEValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEBooleanVariable <em>SE Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEBooleanVariable
	 * @generated
	 */
	public Adapter createSEBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEExpression <em>SE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEExpression
	 * @generated
	 */
	public Adapter createSEExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEIntegerVariable <em>SE Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEIntegerVariable
	 * @generated
	 */
	public Adapter createSEIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEBooleanUnaryExpression <em>SE Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEBooleanUnaryExpression
	 * @generated
	 */
	public Adapter createSEBooleanUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEBooleanExpression <em>SE Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEBooleanExpression
	 * @generated
	 */
	public Adapter createSEBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleexpressions.SEVariable <em>SE Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleexpressions.SEVariable
	 * @generated
	 */
	public Adapter createSEVariableAdapter() {
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

} //SimpleexpressionsAdapterFactory
