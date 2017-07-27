package fr.inria.diverse.ad.emfswitch.impl.operation.executable.expressionoperation;

import activitydiagram.BooleanBinaryExpression;

public class BooleanBinaryExpressionExpressionOperationImpl extends BooleanExpressionExpressionOperationImpl {
	private final BooleanBinaryExpression booleanBinaryExpression;

	public BooleanBinaryExpressionExpressionOperationImpl(final BooleanBinaryExpression booleanBinaryExpression) {
		super(booleanBinaryExpression);
		this.booleanBinaryExpression = booleanBinaryExpression;
	}

	@Override
	public void execute() {
		final boolean operandValue1 = this.getCurrentValue(this.booleanBinaryExpression.getOperand1());
		final boolean operandValue2 = this.getCurrentValue(this.booleanBinaryExpression.getOperand2());

		Boolean result = null;
		switch (this.booleanBinaryExpression.getOperator()) {
		case AND:
			result = operandValue1 && operandValue2;
			break;
		case OR:
			result = operandValue1 || operandValue2;
			break;
		}
		this.assignValue(result);

	}
}