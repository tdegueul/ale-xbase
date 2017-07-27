package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.Value;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ExpressionExecutionVisitor extends ActivityDiagramVisitorDefault<Void> {

	private ExpressionExecutionVisitor() {
		
	}
	
	public final static ExpressionExecutionVisitor INSTANCE = new ExpressionExecutionVisitor();
	
	@Override
	public Void visitIntegerCalculationExpression(final IntegerCalculationExpression integerCalculationExpression, Object ctx) {
		final Integer operandValue1 = this.getCurrentValue(integerCalculationExpression.getOperand1());
		final Integer operandValue2 = this.getCurrentValue(integerCalculationExpression.getOperand2());

		Integer result = null;
		switch (integerCalculationExpression.getOperator()) {
		case ADD:
			result = operandValue1 + operandValue2;
			break;
		case SUBRACT:
			result = operandValue1 - operandValue2;
			break;
		}
		final IntegerValue resultValue = ActivitydiagramFactory.eINSTANCE.createIntegerValue();
		resultValue.setValue(result);
		integerCalculationExpression.getAssignee().setCurrentValue(resultValue);
		return null;
	}

	private Integer getCurrentValue(final IntegerVariable variable) {
		Integer currentValue = null;
		final Value value = variable.getCurrentValue();
		if (value instanceof IntegerValue) {
			final IntegerValue integerValue = (IntegerValue) value;
			currentValue = integerValue.getValue();
		}
		return currentValue;
	}

	@Override
	public Void visitIntegerComparisonExpression(final IntegerComparisonExpression integerComparisonExpression, Object ctx) {
		final int operandValue1 = this.getCurrentValue(integerComparisonExpression.getOperand1());
		final int operandValue2 = this.getCurrentValue(integerComparisonExpression.getOperand2());

		Boolean result = null;
		switch (integerComparisonExpression.getOperator()) {
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
		integerComparisonExpression.getAssignee().setCurrentValue(resultValue);
		return null;
	}

	@Override
	public Void visitBooleanBinaryExpression(final BooleanBinaryExpression booleanBinaryExpression, Object ctx) {
		final boolean operandValue1 = this.getCurrentValue(booleanBinaryExpression.getOperand1());
		final boolean operandValue2 = this.getCurrentValue(booleanBinaryExpression.getOperand2());

		Boolean result = null;
		switch (booleanBinaryExpression.getOperator()) {
		case AND:
			result = operandValue1 && operandValue2;
			break;
		case OR:
			result = operandValue1 || operandValue2;
			break;
		}
		this.assignValue(result, booleanBinaryExpression);

		return null;
	}

	protected boolean getCurrentValue(final BooleanVariable variable) {
		Boolean currentValue = null;
		final Value value = variable.getCurrentValue();
		if (value instanceof BooleanValue) {
			final BooleanValue booleanValue = (BooleanValue) value;
			currentValue = booleanValue.isValue();
		}
		return currentValue;
	}

	protected void assignValue(final Boolean value, final BooleanExpression booleanExpression) {
		final BooleanValue resultValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
		resultValue.setValue(value);
		booleanExpression.getAssignee().setCurrentValue(resultValue);
	}

	@Override
	public Void visitBooleanUnaryExpression(BooleanUnaryExpression booleanUnaryExpression, Object ctx) {
		final boolean operandValue = this.getCurrentValue(booleanUnaryExpression.getOperand());

		Boolean result = null;
		switch (booleanUnaryExpression.getOperator()) {
		case NOT:
			result = !operandValue;
			break;
		}
		this.assignValue(result, booleanUnaryExpression);

		return null;
	}

}
