/**
 */
package simpleexpressions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import simpleexpressions.*;

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
 * @see simpleexpressions.SimpleexpressionsPackage
 * @generated
 */
public class SimpleexpressionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleexpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleexpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = SimpleexpressionsPackage.eINSTANCE;
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
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION: {
				SEIntegerExpression seIntegerExpression = (SEIntegerExpression)theEObject;
				T result = caseSEIntegerExpression(seIntegerExpression);
				if (result == null) result = caseSEExpression(seIntegerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_INTEGER_CALCULATION_EXPRESSION: {
				SEIntegerCalculationExpression seIntegerCalculationExpression = (SEIntegerCalculationExpression)theEObject;
				T result = caseSEIntegerCalculationExpression(seIntegerCalculationExpression);
				if (result == null) result = caseSEIntegerExpression(seIntegerCalculationExpression);
				if (result == null) result = caseSEExpression(seIntegerCalculationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_INTEGER_COMPARISON_EXPRESSION: {
				SEIntegerComparisonExpression seIntegerComparisonExpression = (SEIntegerComparisonExpression)theEObject;
				T result = caseSEIntegerComparisonExpression(seIntegerComparisonExpression);
				if (result == null) result = caseSEIntegerExpression(seIntegerComparisonExpression);
				if (result == null) result = caseSEExpression(seIntegerComparisonExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_BOOLEAN_VALUE: {
				SEBooleanValue seBooleanValue = (SEBooleanValue)theEObject;
				T result = caseSEBooleanValue(seBooleanValue);
				if (result == null) result = caseSEValue(seBooleanValue);
				if (result == null) result = caseSEExpression(seBooleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_INTEGER_VALUE: {
				SEIntegerValue seIntegerValue = (SEIntegerValue)theEObject;
				T result = caseSEIntegerValue(seIntegerValue);
				if (result == null) result = caseSEValue(seIntegerValue);
				if (result == null) result = caseSEExpression(seIntegerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_BOOLEAN_BINARY_EXPRESSION: {
				SEBooleanBinaryExpression seBooleanBinaryExpression = (SEBooleanBinaryExpression)theEObject;
				T result = caseSEBooleanBinaryExpression(seBooleanBinaryExpression);
				if (result == null) result = caseSEBooleanExpression(seBooleanBinaryExpression);
				if (result == null) result = caseSEExpression(seBooleanBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_VALUE: {
				SEValue seValue = (SEValue)theEObject;
				T result = caseSEValue(seValue);
				if (result == null) result = caseSEExpression(seValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_BOOLEAN_VARIABLE: {
				SEBooleanVariable seBooleanVariable = (SEBooleanVariable)theEObject;
				T result = caseSEBooleanVariable(seBooleanVariable);
				if (result == null) result = caseSEVariable(seBooleanVariable);
				if (result == null) result = caseSEExpression(seBooleanVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_EXPRESSION: {
				SEExpression seExpression = (SEExpression)theEObject;
				T result = caseSEExpression(seExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_INTEGER_VARIABLE: {
				SEIntegerVariable seIntegerVariable = (SEIntegerVariable)theEObject;
				T result = caseSEIntegerVariable(seIntegerVariable);
				if (result == null) result = caseSEVariable(seIntegerVariable);
				if (result == null) result = caseSEExpression(seIntegerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_BOOLEAN_UNARY_EXPRESSION: {
				SEBooleanUnaryExpression seBooleanUnaryExpression = (SEBooleanUnaryExpression)theEObject;
				T result = caseSEBooleanUnaryExpression(seBooleanUnaryExpression);
				if (result == null) result = caseSEBooleanExpression(seBooleanUnaryExpression);
				if (result == null) result = caseSEExpression(seBooleanUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_BOOLEAN_EXPRESSION: {
				SEBooleanExpression seBooleanExpression = (SEBooleanExpression)theEObject;
				T result = caseSEBooleanExpression(seBooleanExpression);
				if (result == null) result = caseSEExpression(seBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleexpressionsPackage.SE_VARIABLE: {
				SEVariable seVariable = (SEVariable)theEObject;
				T result = caseSEVariable(seVariable);
				if (result == null) result = caseSEExpression(seVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEIntegerExpression(SEIntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Integer Calculation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Integer Calculation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEIntegerCalculationExpression(SEIntegerCalculationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Integer Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Integer Comparison Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEIntegerComparisonExpression(SEIntegerComparisonExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEBooleanValue(SEBooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEIntegerValue(SEIntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Boolean Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEBooleanBinaryExpression(SEBooleanBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEValue(SEValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEBooleanVariable(SEBooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEExpression(SEExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEIntegerVariable(SEIntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Boolean Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Boolean Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEBooleanUnaryExpression(SEBooleanUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEBooleanExpression(SEBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEVariable(SEVariable object) {
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

} //SimpleexpressionsSwitch
