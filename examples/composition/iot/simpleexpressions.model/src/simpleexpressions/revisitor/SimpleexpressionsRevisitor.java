package simpleexpressions.revisitor;

public interface SimpleexpressionsRevisitor<Simpleexpressions__SEBooleanBinaryExpressionT extends Simpleexpressions__SEBooleanExpressionT, Simpleexpressions__SEBooleanExpressionT extends Simpleexpressions__SEExpressionT, Simpleexpressions__SEBooleanUnaryExpressionT extends Simpleexpressions__SEBooleanExpressionT, Simpleexpressions__SEBooleanValueT extends Simpleexpressions__SEValueT, Simpleexpressions__SEBooleanVariableT extends Simpleexpressions__SEVariableT, Simpleexpressions__SEExpressionT, Simpleexpressions__SEIntegerCalculationExpressionT extends Simpleexpressions__SEIntegerExpressionT, Simpleexpressions__SEIntegerComparisonExpressionT extends Simpleexpressions__SEIntegerExpressionT, Simpleexpressions__SEIntegerExpressionT extends Simpleexpressions__SEExpressionT, Simpleexpressions__SEIntegerValueT extends Simpleexpressions__SEValueT, Simpleexpressions__SEIntegerVariableT extends Simpleexpressions__SEVariableT, Simpleexpressions__SEValueT extends Simpleexpressions__SEExpressionT, Simpleexpressions__SEVariableT extends Simpleexpressions__SEExpressionT> {
	Simpleexpressions__SEBooleanBinaryExpressionT simpleexpressions__SEBooleanBinaryExpression(final simpleexpressions.SEBooleanBinaryExpression it);
	Simpleexpressions__SEBooleanUnaryExpressionT simpleexpressions__SEBooleanUnaryExpression(final simpleexpressions.SEBooleanUnaryExpression it);
	Simpleexpressions__SEBooleanValueT simpleexpressions__SEBooleanValue(final simpleexpressions.SEBooleanValue it);
	Simpleexpressions__SEBooleanVariableT simpleexpressions__SEBooleanVariable(final simpleexpressions.SEBooleanVariable it);
	Simpleexpressions__SEIntegerCalculationExpressionT simpleexpressions__SEIntegerCalculationExpression(final simpleexpressions.SEIntegerCalculationExpression it);
	Simpleexpressions__SEIntegerComparisonExpressionT simpleexpressions__SEIntegerComparisonExpression(final simpleexpressions.SEIntegerComparisonExpression it);
	Simpleexpressions__SEIntegerValueT simpleexpressions__SEIntegerValue(final simpleexpressions.SEIntegerValue it);
	Simpleexpressions__SEIntegerVariableT simpleexpressions__SEIntegerVariable(final simpleexpressions.SEIntegerVariable it);

	default Simpleexpressions__SEBooleanBinaryExpressionT $(final simpleexpressions.SEBooleanBinaryExpression it) {
		return simpleexpressions__SEBooleanBinaryExpression(it);
	}
	default Simpleexpressions__SEBooleanExpressionT $(final simpleexpressions.SEBooleanExpression it) {
		if (it.getClass() == simpleexpressions.impl.SEBooleanBinaryExpressionImpl.class)
			return simpleexpressions__SEBooleanBinaryExpression((simpleexpressions.SEBooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEBooleanUnaryExpressionImpl.class)
			return simpleexpressions__SEBooleanUnaryExpression((simpleexpressions.SEBooleanUnaryExpression) it);
		return null;
	}
	default Simpleexpressions__SEBooleanUnaryExpressionT $(final simpleexpressions.SEBooleanUnaryExpression it) {
		return simpleexpressions__SEBooleanUnaryExpression(it);
	}
	default Simpleexpressions__SEBooleanValueT $(final simpleexpressions.SEBooleanValue it) {
		return simpleexpressions__SEBooleanValue(it);
	}
	default Simpleexpressions__SEBooleanVariableT $(final simpleexpressions.SEBooleanVariable it) {
		return simpleexpressions__SEBooleanVariable(it);
	}
	default Simpleexpressions__SEExpressionT $(final simpleexpressions.SEExpression it) {
		if (it.getClass() == simpleexpressions.impl.SEBooleanBinaryExpressionImpl.class)
			return simpleexpressions__SEBooleanBinaryExpression((simpleexpressions.SEBooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEBooleanUnaryExpressionImpl.class)
			return simpleexpressions__SEBooleanUnaryExpression((simpleexpressions.SEBooleanUnaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEBooleanValueImpl.class)
			return simpleexpressions__SEBooleanValue((simpleexpressions.SEBooleanValue) it);
		if (it.getClass() == simpleexpressions.impl.SEBooleanVariableImpl.class)
			return simpleexpressions__SEBooleanVariable((simpleexpressions.SEBooleanVariable) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerCalculationExpressionImpl.class)
			return simpleexpressions__SEIntegerCalculationExpression((simpleexpressions.SEIntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerComparisonExpressionImpl.class)
			return simpleexpressions__SEIntegerComparisonExpression((simpleexpressions.SEIntegerComparisonExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerValueImpl.class)
			return simpleexpressions__SEIntegerValue((simpleexpressions.SEIntegerValue) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerVariableImpl.class)
			return simpleexpressions__SEIntegerVariable((simpleexpressions.SEIntegerVariable) it);
		return null;
	}
	default Simpleexpressions__SEIntegerCalculationExpressionT $(final simpleexpressions.SEIntegerCalculationExpression it) {
		return simpleexpressions__SEIntegerCalculationExpression(it);
	}
	default Simpleexpressions__SEIntegerComparisonExpressionT $(final simpleexpressions.SEIntegerComparisonExpression it) {
		return simpleexpressions__SEIntegerComparisonExpression(it);
	}
	default Simpleexpressions__SEIntegerExpressionT $(final simpleexpressions.SEIntegerExpression it) {
		if (it.getClass() == simpleexpressions.impl.SEIntegerCalculationExpressionImpl.class)
			return simpleexpressions__SEIntegerCalculationExpression((simpleexpressions.SEIntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerComparisonExpressionImpl.class)
			return simpleexpressions__SEIntegerComparisonExpression((simpleexpressions.SEIntegerComparisonExpression) it);
		return null;
	}
	default Simpleexpressions__SEIntegerValueT $(final simpleexpressions.SEIntegerValue it) {
		return simpleexpressions__SEIntegerValue(it);
	}
	default Simpleexpressions__SEIntegerVariableT $(final simpleexpressions.SEIntegerVariable it) {
		return simpleexpressions__SEIntegerVariable(it);
	}
	default Simpleexpressions__SEValueT $(final simpleexpressions.SEValue it) {
		if (it.getClass() == simpleexpressions.impl.SEBooleanValueImpl.class)
			return simpleexpressions__SEBooleanValue((simpleexpressions.SEBooleanValue) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerValueImpl.class)
			return simpleexpressions__SEIntegerValue((simpleexpressions.SEIntegerValue) it);
		return null;
	}
	default Simpleexpressions__SEVariableT $(final simpleexpressions.SEVariable it) {
		if (it.getClass() == simpleexpressions.impl.SEBooleanVariableImpl.class)
			return simpleexpressions__SEBooleanVariable((simpleexpressions.SEBooleanVariable) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerVariableImpl.class)
			return simpleexpressions__SEIntegerVariable((simpleexpressions.SEIntegerVariable) it);
		return null;
	}
}
