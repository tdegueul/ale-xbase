package fr.inria.diverse.ad.emfswitch.impl.operation.executable.expressionoperation;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Value;
import fr.inria.diverse.ad.emfswitch.operation.ExpressionOperation;

public abstract class BooleanExpressionExpressionOperationImpl implements ExpressionOperation {

	private final BooleanExpression booleanExpression;

	public BooleanExpressionExpressionOperationImpl(final BooleanExpression booleanExpression) {
		this.booleanExpression = booleanExpression;
	}

	protected void assignValue(final Boolean value) {
		final BooleanValue resultValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
		resultValue.setValue(value);
		BooleanVariable assignee = this.booleanExpression.getAssignee();
		assignee.setCurrentValue(resultValue);
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
}
