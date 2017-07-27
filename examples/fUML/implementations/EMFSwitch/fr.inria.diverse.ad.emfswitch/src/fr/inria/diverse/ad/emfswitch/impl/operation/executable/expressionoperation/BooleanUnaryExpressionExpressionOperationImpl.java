package fr.inria.diverse.ad.emfswitch.impl.operation.executable.expressionoperation;

import activitydiagram.BooleanUnaryExpression;

public class BooleanUnaryExpressionExpressionOperationImpl extends BooleanExpressionExpressionOperationImpl {
	private final BooleanUnaryExpression booleanUnaryExpression;

	public BooleanUnaryExpressionExpressionOperationImpl(final BooleanUnaryExpression booleanUnaryExpression) {
		super(booleanUnaryExpression);
		this.booleanUnaryExpression = booleanUnaryExpression;
	}

	@Override
	public void execute() {
		final boolean operandValue = this.getCurrentValue(this.booleanUnaryExpression.getOperand());

		Boolean result = null;
		switch (this.booleanUnaryExpression.getOperator()) {
		case NOT:
			result = !operandValue;
			break;
		}
		this.assignValue(result);
	}

}