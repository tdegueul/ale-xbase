package activitydiagram.algebra;

import activitydiagram.Activity;
import activitydiagram.ActivityEdge;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.ControlToken;
import activitydiagram.DecisionNode;
import activitydiagram.Expression;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.Offer;
import activitydiagram.OpaqueAction;
import activitydiagram.Token;
import activitydiagram.Trace;
import activitydiagram.Value;
import activitydiagram.Variable;

public interface ActivitydiagramAlgebra<A, B, C, D, E, F, G, H, I, K, L> {

	B activity(final Activity activity);

	A activityFinalNode(final ActivityFinalNode activityFinalNode);

	D booleanBinaryExpression(final BooleanBinaryExpression booleanBinaryExpression);

	D booleanUnaryExpression(final BooleanUnaryExpression booleanUnaryExpression);

	E booleanValue(final BooleanValue booleanValue);

	F booleanVariable(final BooleanVariable booleanVariable);

	C controlFlow(final ControlFlow controlFlow);

	G controlToken(final ControlToken controlToken);

	A decisionNode(final DecisionNode decisionNode);

	A forkNode(final ForkNode forkNode);

	G forkedToken(final ForkedToken forkedToken);

	A initialNode(final InitialNode initialNode);

	H input(final Input input);

	I inputValue(final InputValue inputValue);

	D integerCalculationExpression(final IntegerCalculationExpression integerCalculationExpression);

	D integerComparisonExpression(final IntegerComparisonExpression integerComparisonExpression);

	E integerValue(final IntegerValue integerValue);

	F integerVariable(final IntegerVariable integerVariable);

	A joinNode(final JoinNode joinNode);

	A mergeNode(final MergeNode mergeNode);

	K offer(final Offer offer);

	A opaqueAction(final OpaqueAction opaqueAction);

	L trace(final Trace trace);

	public default A $(final ActivityNode activityNode) {
		final A ret;
		if (activityNode.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE) {
			ret = this.activityFinalNode((ActivityFinalNode) activityNode);
		} else if (activityNode.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE) {
			ret = this.decisionNode((DecisionNode) activityNode);
		} else if (activityNode.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE) {
			ret = this.forkNode((ForkNode) activityNode);
		} else if (activityNode.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE) {
			ret = this.initialNode((InitialNode) activityNode);
		} else if (activityNode.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE) {
			ret = this.joinNode((JoinNode) activityNode);
		} else if (activityNode.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE) {
			ret = this.mergeNode((MergeNode) activityNode);
		} else if (activityNode.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION) {
			ret = this.opaqueAction((OpaqueAction) activityNode);
		} else {
			throw new RuntimeException("Unknow ActivityNode " + activityNode);
		}
		return ret;
	}
	public default B $(final Activity activity) {
		final B ret;
		if (activity.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY) {
			ret = this.activity((Activity) activity);
		} else {
			throw new RuntimeException("Unknow Activity " + activity);
		}
		return ret;
	}
	public default C $(final ActivityEdge activityEdge) {
		final C ret;
		if (activityEdge.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_FLOW) {
			ret = this.controlFlow((ControlFlow) activityEdge);
		} else {
			throw new RuntimeException("Unknow ActivityEdge " + activityEdge);
		}
		return ret;
	}
	public default D $(final Expression expression) {
		final D ret;
		if (expression.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION) {
			ret = this.booleanBinaryExpression((BooleanBinaryExpression) expression);
		} else if (expression.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION) {
			ret = this.booleanUnaryExpression((BooleanUnaryExpression) expression);
		} else if (expression.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION) {
			ret = this.integerCalculationExpression((IntegerCalculationExpression) expression);
		} else if (expression.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION) {
			ret = this.integerComparisonExpression((IntegerComparisonExpression) expression);
		} else {
			throw new RuntimeException("Unknow Expression " + expression);
		}
		return ret;
	}
	public default E $(final Value value) {
		final E ret;
		if (value.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_VALUE) {
			ret = this.booleanValue((BooleanValue) value);
		} else if (value.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_VALUE) {
			ret = this.integerValue((IntegerValue) value);
		} else {
			throw new RuntimeException("Unknow Value " + value);
		}
		return ret;
	}
	public default F $(final Variable variable) {
		final F ret;
		if (variable.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_VARIABLE) {
			ret = this.booleanVariable((BooleanVariable) variable);
		} else if (variable.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_VARIABLE) {
			ret = this.integerVariable((IntegerVariable) variable);
		} else {
			throw new RuntimeException("Unknow Variable " + variable);
		}
		return ret;
	}
	public default G $(final Token token) {
		final G ret;
		if (token.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_TOKEN) {
			ret = this.controlToken((ControlToken) token);
		} else if (token.eClass().getClassifierID() == ActivitydiagramPackage.FORKED_TOKEN) {
			ret = this.forkedToken((ForkedToken) token);
		} else {
			throw new RuntimeException("Unknow Token " + token);
		}
		return ret;
	}
	public default H $(final Input input) {
		final H ret;
		if (input.eClass().getClassifierID() == ActivitydiagramPackage.INPUT) {
			ret = this.input((Input) input);
		} else {
			throw new RuntimeException("Unknow Input " + input);
		}
		return ret;
	}
	public default I $(final InputValue inputValue) {
		final I ret;
		if (inputValue.eClass().getClassifierID() == ActivitydiagramPackage.INPUT_VALUE) {
			ret = this.inputValue((InputValue) inputValue);
		} else {
			throw new RuntimeException("Unknow InputValue " + inputValue);
		}
		return ret;
	}
	public default K $(final Offer offer) {
		final K ret;
		if (offer.eClass().getClassifierID() == ActivitydiagramPackage.OFFER) {
			ret = this.offer((Offer) offer);
		} else {
			throw new RuntimeException("Unknow Offer " + offer);
		}
		return ret;
	}
	public default L $(final Trace trace) {
		final L ret;
		if (trace.eClass().getClassifierID() == ActivitydiagramPackage.TRACE) {
			ret = this.trace((Trace) trace);
		} else {
			throw new RuntimeException("Unknow Trace " + trace);
		}
		return ret;
	}
}