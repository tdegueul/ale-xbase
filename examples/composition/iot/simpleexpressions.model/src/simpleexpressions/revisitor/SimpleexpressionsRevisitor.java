package simpleexpressions.revisitor;

public interface SimpleexpressionsRevisitor<Simpleexpressions__BooleanBinaryExpressionT extends Simpleexpressions__BooleanExpressionT, Simpleexpressions__BooleanExpressionT extends Simpleexpressions__ExpressionT, Simpleexpressions__BooleanUnaryExpressionT extends Simpleexpressions__BooleanExpressionT, Simpleexpressions__BooleanValueT extends Simpleexpressions__ValueT, Simpleexpressions__BooleanVariableT extends Simpleexpressions__VariableT, Simpleexpressions__ExpressionT, Simpleexpressions__IntegerCalculationExpressionT extends Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerComparisonExpressionT extends Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerExpressionT extends Simpleexpressions__ExpressionT, Simpleexpressions__IntegerValueT extends Simpleexpressions__ValueT, Simpleexpressions__IntegerVariableT extends Simpleexpressions__VariableT, Simpleexpressions__ValueT, Simpleexpressions__VariableT> {
	Simpleexpressions__BooleanBinaryExpressionT simpleexpressions__BooleanBinaryExpression(final simpleexpressions.BooleanBinaryExpression it);
	Simpleexpressions__BooleanUnaryExpressionT simpleexpressions__BooleanUnaryExpression(final simpleexpressions.BooleanUnaryExpression it);
	Simpleexpressions__BooleanValueT simpleexpressions__BooleanValue(final simpleexpressions.BooleanValue it);
	Simpleexpressions__BooleanVariableT simpleexpressions__BooleanVariable(final simpleexpressions.BooleanVariable it);
	Simpleexpressions__IntegerCalculationExpressionT simpleexpressions__IntegerCalculationExpression(final simpleexpressions.IntegerCalculationExpression it);
	Simpleexpressions__IntegerComparisonExpressionT simpleexpressions__IntegerComparisonExpression(final simpleexpressions.IntegerComparisonExpression it);
	Simpleexpressions__IntegerValueT simpleexpressions__IntegerValue(final simpleexpressions.IntegerValue it);
	Simpleexpressions__IntegerVariableT simpleexpressions__IntegerVariable(final simpleexpressions.IntegerVariable it);

	default Simpleexpressions__BooleanBinaryExpressionT $(final simpleexpressions.BooleanBinaryExpression it) {
		return simpleexpressions__BooleanBinaryExpression(it);
	}
	default Simpleexpressions__BooleanExpressionT $(final simpleexpressions.BooleanExpression it) {
		if (it.getClass() == simpleexpressions.impl.BooleanBinaryExpressionImpl.class)
			return simpleexpressions__BooleanBinaryExpression((simpleexpressions.BooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.BooleanUnaryExpressionImpl.class)
			return simpleexpressions__BooleanUnaryExpression((simpleexpressions.BooleanUnaryExpression) it);
		return null;
	}
	default Simpleexpressions__BooleanUnaryExpressionT $(final simpleexpressions.BooleanUnaryExpression it) {
		return simpleexpressions__BooleanUnaryExpression(it);
	}
	default Simpleexpressions__BooleanValueT $(final simpleexpressions.BooleanValue it) {
		return simpleexpressions__BooleanValue(it);
	}
	default Simpleexpressions__BooleanVariableT $(final simpleexpressions.BooleanVariable it) {
		return simpleexpressions__BooleanVariable(it);
	}
	default Simpleexpressions__ExpressionT $(final simpleexpressions.Expression it) {
		if (it.getClass() == simpleexpressions.impl.BooleanBinaryExpressionImpl.class)
			return simpleexpressions__BooleanBinaryExpression((simpleexpressions.BooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.BooleanUnaryExpressionImpl.class)
			return simpleexpressions__BooleanUnaryExpression((simpleexpressions.BooleanUnaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerCalculationExpressionImpl.class)
			return simpleexpressions__IntegerCalculationExpression((simpleexpressions.IntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerComparisonExpressionImpl.class)
			return simpleexpressions__IntegerComparisonExpression((simpleexpressions.IntegerComparisonExpression) it);
		return null;
	}
	default Simpleexpressions__IntegerCalculationExpressionT $(final simpleexpressions.IntegerCalculationExpression it) {
		return simpleexpressions__IntegerCalculationExpression(it);
	}
	default Simpleexpressions__IntegerComparisonExpressionT $(final simpleexpressions.IntegerComparisonExpression it) {
		return simpleexpressions__IntegerComparisonExpression(it);
	}
	default Simpleexpressions__IntegerExpressionT $(final simpleexpressions.IntegerExpression it) {
		if (it.getClass() == simpleexpressions.impl.IntegerCalculationExpressionImpl.class)
			return simpleexpressions__IntegerCalculationExpression((simpleexpressions.IntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerComparisonExpressionImpl.class)
			return simpleexpressions__IntegerComparisonExpression((simpleexpressions.IntegerComparisonExpression) it);
		return null;
	}
	default Simpleexpressions__IntegerValueT $(final simpleexpressions.IntegerValue it) {
		return simpleexpressions__IntegerValue(it);
	}
	default Simpleexpressions__IntegerVariableT $(final simpleexpressions.IntegerVariable it) {
		return simpleexpressions__IntegerVariable(it);
	}
	default Simpleexpressions__ValueT $(final simpleexpressions.Value it) {
		if (it.getClass() == simpleexpressions.impl.BooleanValueImpl.class)
			return simpleexpressions__BooleanValue((simpleexpressions.BooleanValue) it);
		if (it.getClass() == simpleexpressions.impl.IntegerValueImpl.class)
			return simpleexpressions__IntegerValue((simpleexpressions.IntegerValue) it);
		return null;
	}
	default Simpleexpressions__VariableT $(final simpleexpressions.Variable it) {
		if (it.getClass() == simpleexpressions.impl.BooleanVariableImpl.class)
			return simpleexpressions__BooleanVariable((simpleexpressions.BooleanVariable) it);
		if (it.getClass() == simpleexpressions.impl.IntegerVariableImpl.class)
			return simpleexpressions__IntegerVariable((simpleexpressions.IntegerVariable) it);
		return null;
	}
}
