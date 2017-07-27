package fr.inria.diverse.ad.emfswitch.impl.operation.executable.expressionoperation;

import activitydiagram.IntegerValue;
import activitydiagram.Value;
import activitydiagram.Variable;
import fr.inria.diverse.ad.emfswitch.operation.ExpressionOperation;

public abstract class IntegerExpressionExpressionOperationImpl implements ExpressionOperation {

	protected Integer getCurrentValue(final Variable variable) {
		Integer currentValue = null;
		final Value value = variable.getCurrentValue();
		if (value instanceof IntegerValue) {
			final IntegerValue integerValue = (IntegerValue) value;
			currentValue = integerValue.getValue();
		}
		return currentValue;
	}

}
