package activitydiagram.visitor;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.ControlToken;
import activitydiagram.DecisionNode;
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
import activitydiagram.Trace;

public interface ActivityDiagramVisitor<T> {

	T visitActivity(Activity activity, Object ctx);

	T visitActivityFinalNode(ActivityFinalNode activityFinalNode, Object ctx);

	T visitBooleanBinaryExpression(BooleanBinaryExpression booleanBinaryExpression, Object ctx);

	T visitBooleanUnaryExpression(BooleanUnaryExpression booleanUnaryExpression, Object ctx);

	T visitBooleanValue(BooleanValue booleanValue, Object ctx);

	T visitBooleanVariable(BooleanVariable booleanVariable, Object ctx);

	T visitControlFlow(ControlFlow controlFlow, Object ctx);

	T visitControlToken(ControlToken controlToken, Object ctx);

	T visitDecisionNode(DecisionNode decisionNode, Object ctx);

	T visitForkedToken(ForkedToken forkedToken, Object ctx);

	T visitForkNode(ForkNode forkNode, Object ctx);

	T visitInitialNode(InitialNode initialNode, Object ctx);

	T visitInput(Input input, Object ctx);

	T visitInputValue(InputValue inputValue, Object ctx);

	T visitIntegerCalculationExpression(IntegerCalculationExpression integerCalculationExpression, Object ctx);

	T visitIntegerComparisonExpression(IntegerComparisonExpression integerComparisonExpression, Object ctx);

	T visitIntegerValue(IntegerValue integerValue, Object ctx);

	T visitIntegerVariable(IntegerVariable integerVariable, Object ctx);

	T visitJoinNode(JoinNode joinNode, Object ctx);

	T visitMergeNode(MergeNode mergeNode, Object ctx);

	T visitOffer(Offer offer, Object ctx);

	T visitOpaqueAction(OpaqueAction opaqueAction, Object ctx);

	T visitTrace(Trace trace, Object ctx);

}
