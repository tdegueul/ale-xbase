/**
 */
package adruntime.util;

import adruntime.*;

import adwithoutruntime.Action;
import adwithoutruntime.Activity;
import adwithoutruntime.ActivityEdge;
import adwithoutruntime.ActivityFinalNode;
import adwithoutruntime.ActivityNode;
import adwithoutruntime.BooleanBinaryExpression;
import adwithoutruntime.BooleanExpression;
import adwithoutruntime.BooleanUnaryExpression;
import adwithoutruntime.BooleanVariable;
import adwithoutruntime.ControlFlow;
import adwithoutruntime.ControlNode;
import adwithoutruntime.DecisionNode;
import adwithoutruntime.ExecutableNode;
import adwithoutruntime.Expression;
import adwithoutruntime.FinalNode;
import adwithoutruntime.ForkNode;
import adwithoutruntime.InitialNode;
import adwithoutruntime.IntegerCalculationExpression;
import adwithoutruntime.IntegerComparisonExpression;
import adwithoutruntime.IntegerExpression;
import adwithoutruntime.IntegerVariable;
import adwithoutruntime.JoinNode;
import adwithoutruntime.MergeNode;
import adwithoutruntime.NamedElement;
import adwithoutruntime.OpaqueAction;
import adwithoutruntime.Variable;

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
 * @see adruntime.AdruntimePackage
 * @generated
 */
public class AdruntimeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdruntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdruntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = AdruntimePackage.eINSTANCE;
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
			case AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT: {
				BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect = (BooleanUnaryExpression_Aspect)theEObject;
				T result = caseBooleanUnaryExpression_Aspect(booleanUnaryExpression_Aspect);
				if (result == null) result = caseBooleanUnaryExpression(booleanUnaryExpression_Aspect);
				if (result == null) result = caseBooleanExpression_Aspect(booleanUnaryExpression_Aspect);
				if (result == null) result = caseBooleanExpression(booleanUnaryExpression_Aspect);
				if (result == null) result = caseExpression(booleanUnaryExpression_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.JOIN_NODE_ASPECT: {
				JoinNode_Aspect joinNode_Aspect = (JoinNode_Aspect)theEObject;
				T result = caseJoinNode_Aspect(joinNode_Aspect);
				if (result == null) result = caseJoinNode(joinNode_Aspect);
				if (result == null) result = caseControlNode_Aspect(joinNode_Aspect);
				if (result == null) result = caseControlNode(joinNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(joinNode_Aspect);
				if (result == null) result = caseActivityNode(joinNode_Aspect);
				if (result == null) result = caseNamedElement(joinNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.BOOLEAN_EXPRESSION_ASPECT: {
				BooleanExpression_Aspect booleanExpression_Aspect = (BooleanExpression_Aspect)theEObject;
				T result = caseBooleanExpression_Aspect(booleanExpression_Aspect);
				if (result == null) result = caseBooleanExpression(booleanExpression_Aspect);
				if (result == null) result = caseExpression(booleanExpression_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.OPAQUE_ACTION_ASPECT: {
				OpaqueAction_Aspect opaqueAction_Aspect = (OpaqueAction_Aspect)theEObject;
				T result = caseOpaqueAction_Aspect(opaqueAction_Aspect);
				if (result == null) result = caseOpaqueAction(opaqueAction_Aspect);
				if (result == null) result = caseAction_Aspect(opaqueAction_Aspect);
				if (result == null) result = caseAction(opaqueAction_Aspect);
				if (result == null) result = caseExecutableNode_Aspect(opaqueAction_Aspect);
				if (result == null) result = caseExecutableNode(opaqueAction_Aspect);
				if (result == null) result = caseActivityNode_Aspect(opaqueAction_Aspect);
				if (result == null) result = caseActivityNode(opaqueAction_Aspect);
				if (result == null) result = caseNamedElement(opaqueAction_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.INITIAL_NODE_ASPECT: {
				InitialNode_Aspect initialNode_Aspect = (InitialNode_Aspect)theEObject;
				T result = caseInitialNode_Aspect(initialNode_Aspect);
				if (result == null) result = caseInitialNode(initialNode_Aspect);
				if (result == null) result = caseControlNode_Aspect(initialNode_Aspect);
				if (result == null) result = caseControlNode(initialNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(initialNode_Aspect);
				if (result == null) result = caseActivityNode(initialNode_Aspect);
				if (result == null) result = caseNamedElement(initialNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.CONTROL_NODE_ASPECT: {
				ControlNode_Aspect controlNode_Aspect = (ControlNode_Aspect)theEObject;
				T result = caseControlNode_Aspect(controlNode_Aspect);
				if (result == null) result = caseControlNode(controlNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(controlNode_Aspect);
				if (result == null) result = caseActivityNode(controlNode_Aspect);
				if (result == null) result = caseNamedElement(controlNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.EXECUTABLE_NODE_ASPECT: {
				ExecutableNode_Aspect executableNode_Aspect = (ExecutableNode_Aspect)theEObject;
				T result = caseExecutableNode_Aspect(executableNode_Aspect);
				if (result == null) result = caseExecutableNode(executableNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(executableNode_Aspect);
				if (result == null) result = caseActivityNode(executableNode_Aspect);
				if (result == null) result = caseNamedElement(executableNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.ACTIVITY_ASPECT: {
				Activity_Aspect activity_Aspect = (Activity_Aspect)theEObject;
				T result = caseActivity_Aspect(activity_Aspect);
				if (result == null) result = caseActivity(activity_Aspect);
				if (result == null) result = caseNamedElement(activity_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.ACTION_ASPECT: {
				Action_Aspect action_Aspect = (Action_Aspect)theEObject;
				T result = caseAction_Aspect(action_Aspect);
				if (result == null) result = caseAction(action_Aspect);
				if (result == null) result = caseExecutableNode_Aspect(action_Aspect);
				if (result == null) result = caseExecutableNode(action_Aspect);
				if (result == null) result = caseActivityNode_Aspect(action_Aspect);
				if (result == null) result = caseActivityNode(action_Aspect);
				if (result == null) result = caseNamedElement(action_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT: {
				IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect = (IntegerComparisonExpression_Aspect)theEObject;
				T result = caseIntegerComparisonExpression_Aspect(integerComparisonExpression_Aspect);
				if (result == null) result = caseIntegerComparisonExpression(integerComparisonExpression_Aspect);
				if (result == null) result = caseIntegerExpression_Aspect(integerComparisonExpression_Aspect);
				if (result == null) result = caseIntegerExpression(integerComparisonExpression_Aspect);
				if (result == null) result = caseExpression(integerComparisonExpression_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.ACTIVITY_NODE_ASPECT: {
				ActivityNode_Aspect activityNode_Aspect = (ActivityNode_Aspect)theEObject;
				T result = caseActivityNode_Aspect(activityNode_Aspect);
				if (result == null) result = caseActivityNode(activityNode_Aspect);
				if (result == null) result = caseNamedElement(activityNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT: {
				BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect = (BooleanBinaryExpression_Aspect)theEObject;
				T result = caseBooleanBinaryExpression_Aspect(booleanBinaryExpression_Aspect);
				if (result == null) result = caseBooleanBinaryExpression(booleanBinaryExpression_Aspect);
				if (result == null) result = caseBooleanExpression_Aspect(booleanBinaryExpression_Aspect);
				if (result == null) result = caseBooleanExpression(booleanBinaryExpression_Aspect);
				if (result == null) result = caseExpression(booleanBinaryExpression_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.CONTROL_FLOW_ASPECT: {
				ControlFlow_Aspect controlFlow_Aspect = (ControlFlow_Aspect)theEObject;
				T result = caseControlFlow_Aspect(controlFlow_Aspect);
				if (result == null) result = caseControlFlow(controlFlow_Aspect);
				if (result == null) result = caseActivityEdge_Aspect(controlFlow_Aspect);
				if (result == null) result = caseActivityEdge(controlFlow_Aspect);
				if (result == null) result = caseNamedElement(controlFlow_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.OFFER: {
				Offer offer = (Offer)theEObject;
				T result = caseOffer(offer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.VARIABLE_ASPECT: {
				Variable_Aspect variable_Aspect = (Variable_Aspect)theEObject;
				T result = caseVariable_Aspect(variable_Aspect);
				if (result == null) result = caseVariable(variable_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT: {
				ActivityFinalNode_Aspect activityFinalNode_Aspect = (ActivityFinalNode_Aspect)theEObject;
				T result = caseActivityFinalNode_Aspect(activityFinalNode_Aspect);
				if (result == null) result = caseActivityFinalNode(activityFinalNode_Aspect);
				if (result == null) result = caseFinalNode_Aspect(activityFinalNode_Aspect);
				if (result == null) result = caseFinalNode(activityFinalNode_Aspect);
				if (result == null) result = caseControlNode_Aspect(activityFinalNode_Aspect);
				if (result == null) result = caseControlNode(activityFinalNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(activityFinalNode_Aspect);
				if (result == null) result = caseActivityNode(activityFinalNode_Aspect);
				if (result == null) result = caseNamedElement(activityFinalNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT: {
				IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect = (IntegerCalculationExpression_Aspect)theEObject;
				T result = caseIntegerCalculationExpression_Aspect(integerCalculationExpression_Aspect);
				if (result == null) result = caseIntegerCalculationExpression(integerCalculationExpression_Aspect);
				if (result == null) result = caseIntegerExpression_Aspect(integerCalculationExpression_Aspect);
				if (result == null) result = caseIntegerExpression(integerCalculationExpression_Aspect);
				if (result == null) result = caseExpression(integerCalculationExpression_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.INTEGER_EXPRESSION_ASPECT: {
				IntegerExpression_Aspect integerExpression_Aspect = (IntegerExpression_Aspect)theEObject;
				T result = caseIntegerExpression_Aspect(integerExpression_Aspect);
				if (result == null) result = caseIntegerExpression(integerExpression_Aspect);
				if (result == null) result = caseExpression(integerExpression_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.INTEGER_VARIABLE_ASPECT: {
				IntegerVariable_Aspect integerVariable_Aspect = (IntegerVariable_Aspect)theEObject;
				T result = caseIntegerVariable_Aspect(integerVariable_Aspect);
				if (result == null) result = caseIntegerVariable(integerVariable_Aspect);
				if (result == null) result = caseVariable_Aspect(integerVariable_Aspect);
				if (result == null) result = caseVariable(integerVariable_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.INPUT_VALUE: {
				InputValue inputValue = (InputValue)theEObject;
				T result = caseInputValue(inputValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.FORKED_TOKEN: {
				ForkedToken forkedToken = (ForkedToken)theEObject;
				T result = caseForkedToken(forkedToken);
				if (result == null) result = caseToken(forkedToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.BOOLEAN_VARIABLE_ASPECT: {
				BooleanVariable_Aspect booleanVariable_Aspect = (BooleanVariable_Aspect)theEObject;
				T result = caseBooleanVariable_Aspect(booleanVariable_Aspect);
				if (result == null) result = caseBooleanVariable(booleanVariable_Aspect);
				if (result == null) result = caseVariable_Aspect(booleanVariable_Aspect);
				if (result == null) result = caseVariable(booleanVariable_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.ACTIVITY_EDGE_ASPECT: {
				ActivityEdge_Aspect activityEdge_Aspect = (ActivityEdge_Aspect)theEObject;
				T result = caseActivityEdge_Aspect(activityEdge_Aspect);
				if (result == null) result = caseActivityEdge(activityEdge_Aspect);
				if (result == null) result = caseNamedElement(activityEdge_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.FORK_NODE_ASPECT: {
				ForkNode_Aspect forkNode_Aspect = (ForkNode_Aspect)theEObject;
				T result = caseForkNode_Aspect(forkNode_Aspect);
				if (result == null) result = caseForkNode(forkNode_Aspect);
				if (result == null) result = caseControlNode_Aspect(forkNode_Aspect);
				if (result == null) result = caseControlNode(forkNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(forkNode_Aspect);
				if (result == null) result = caseActivityNode(forkNode_Aspect);
				if (result == null) result = caseNamedElement(forkNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.FINAL_NODE_ASPECT: {
				FinalNode_Aspect finalNode_Aspect = (FinalNode_Aspect)theEObject;
				T result = caseFinalNode_Aspect(finalNode_Aspect);
				if (result == null) result = caseFinalNode(finalNode_Aspect);
				if (result == null) result = caseControlNode_Aspect(finalNode_Aspect);
				if (result == null) result = caseControlNode(finalNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(finalNode_Aspect);
				if (result == null) result = caseActivityNode(finalNode_Aspect);
				if (result == null) result = caseNamedElement(finalNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.DECISION_NODE_ASPECT: {
				DecisionNode_Aspect decisionNode_Aspect = (DecisionNode_Aspect)theEObject;
				T result = caseDecisionNode_Aspect(decisionNode_Aspect);
				if (result == null) result = caseDecisionNode(decisionNode_Aspect);
				if (result == null) result = caseControlNode_Aspect(decisionNode_Aspect);
				if (result == null) result = caseControlNode(decisionNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(decisionNode_Aspect);
				if (result == null) result = caseActivityNode(decisionNode_Aspect);
				if (result == null) result = caseNamedElement(decisionNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.CONTROL_TOKEN: {
				ControlToken controlToken = (ControlToken)theEObject;
				T result = caseControlToken(controlToken);
				if (result == null) result = caseToken(controlToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdruntimePackage.MERGE_NODE_ASPECT: {
				MergeNode_Aspect mergeNode_Aspect = (MergeNode_Aspect)theEObject;
				T result = caseMergeNode_Aspect(mergeNode_Aspect);
				if (result == null) result = caseMergeNode(mergeNode_Aspect);
				if (result == null) result = caseControlNode_Aspect(mergeNode_Aspect);
				if (result == null) result = caseControlNode(mergeNode_Aspect);
				if (result == null) result = caseActivityNode_Aspect(mergeNode_Aspect);
				if (result == null) result = caseActivityNode(mergeNode_Aspect);
				if (result == null) result = caseNamedElement(mergeNode_Aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanUnaryExpression_Aspect(BooleanUnaryExpression_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode_Aspect(JoinNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression_Aspect(BooleanExpression_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueAction_Aspect(OpaqueAction_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode_Aspect(InitialNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode_Aspect(ControlNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode_Aspect(ExecutableNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity_Aspect(Activity_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction_Aspect(Action_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerComparisonExpression_Aspect(IntegerComparisonExpression_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode_Aspect(ActivityNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinaryExpression_Aspect(BooleanBinaryExpression_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow_Aspect(ControlFlow_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffer(Offer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable_Aspect(Variable_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode_Aspect(ActivityFinalNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculation Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculation Expression Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerCalculationExpression_Aspect(IntegerCalculationExpression_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression_Aspect(IntegerExpression_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVariable_Aspect(IntegerVariable_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputValue(InputValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken(ForkedToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariable_Aspect(BooleanVariable_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge_Aspect(ActivityEdge_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode_Aspect(ForkNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode_Aspect(FinalNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode_Aspect(DecisionNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlToken(ControlToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode_Aspect(MergeNode_Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanUnaryExpression(BooleanUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueAction(OpaqueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
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
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression(IntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerComparisonExpression(IntegerComparisonExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinaryExpression(BooleanBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerCalculationExpression(IntegerCalculationExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
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

} //AdruntimeSwitch
