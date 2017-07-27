package fr.inria.diverse.ad.emfswitch.impl.operation.executable.expressionoperation;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanValue;
import activitydiagram.IntegerComparisonExpression;

public class IntegerComparisonExpressionExpressionOperationImpl extends IntegerExpressionExpressionOperationImpl {
	private final IntegerComparisonExpression integerComparisonExpression;

	public IntegerComparisonExpressionExpressionOperationImpl(
			final IntegerComparisonExpression integerComparisonExpression) {
		this.integerComparisonExpression = integerComparisonExpression;
	}

	@Override
	public void execute() {
		final int operandValue1 = this.getCurrentValue(this.integerComparisonExpression.getOperand1());
		final int operandValue2 = this.getCurrentValue(this.integerComparisonExpression.getOperand2());

		Boolean result = null;
		switch (this.integerComparisonExpression.getOperator()) {
		case EQUALS:
			result = operandValue1 == operandValue2;
			break;
		case GREATER:
			result = operandValue1 > operandValue2;
			break;
		case GREATER_EQUALS:
			result = operandValue1 >= operandValue2;
			break;
		case SMALLER:
			result = operandValue1 < operandValue2;
			break;
		case SMALLER_EQUALS:
			result = operandValue1 <= operandValue2;
			break;
		}
		final BooleanValue resultValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
		resultValue.setValue(result);
		this.integerComparisonExpression.getAssignee().setCurrentValue(resultValue);
	}
}