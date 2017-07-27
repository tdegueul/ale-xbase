package fr.inria.diverse.ad.emfswitch.impl.operation.executable.expressionoperation;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerValue;

public class IntegerCalculationExpressionExpressionOperationImpl extends IntegerExpressionExpressionOperationImpl {
	private final IntegerCalculationExpression integerCalculationExpression;

	public IntegerCalculationExpressionExpressionOperationImpl(
			final IntegerCalculationExpression integerCalculationExpression) {
		this.integerCalculationExpression = integerCalculationExpression;
	}

	@Override
	public void execute() {
		final Integer operandValue1 = this.getCurrentValue(this.integerCalculationExpression.getOperand1());
		final Integer operandValue2 = this.getCurrentValue(this.integerCalculationExpression.getOperand2());

		Integer result = null;
		switch (this.integerCalculationExpression.getOperator()) {
		case ADD:
			result = operandValue1 + operandValue2;
			break;
		case SUBRACT:
			result = operandValue1 - operandValue2;
			break;
		}
		final IntegerValue resultValue = ActivitydiagramFactory.eINSTANCE.createIntegerValue();
		resultValue.setValue(result);
		this.integerCalculationExpression.getAssignee().setCurrentValue(resultValue);

	}
}