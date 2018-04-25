package simpleexpressions.revisitor;

public interface SimpleexpressionsRevisitor<Simpleexpressions__BooleanBinaryExpressionT extends Simpleexpressions__BooleanExpressionT, Simpleexpressions__BooleanExpressionT extends Simpleexpressions__ExpressionT, Simpleexpressions__BooleanUnaryExpressionT extends Simpleexpressions__BooleanExpressionT, Simpleexpressions__BooleanValueT extends Simpleexpressions__ValueT, Simpleexpressions__BooleanVariableT extends Simpleexpressions__VariableT, Simpleexpressions__ExpressionT, Simpleexpressions__IntegerCalculationExpressionT extends Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerComparisonExpressionT extends Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerExpressionT extends Simpleexpressions__ExpressionT, Simpleexpressions__IntegerValueT extends Simpleexpressions__ValueT, Simpleexpressions__IntegerVariableT extends Simpleexpressions__VariableT, Simpleexpressions__ValueT, Simpleexpressions__VariableT> {
	Simpleexpressions__BooleanBinaryExpressionT booleanBinaryExpression(final simpleexpressions.BooleanBinaryExpression it);
	Simpleexpressions__BooleanUnaryExpressionT booleanUnaryExpression(final simpleexpressions.BooleanUnaryExpression it);
	Simpleexpressions__BooleanValueT booleanValue(final simpleexpressions.BooleanValue it);
	Simpleexpressions__BooleanVariableT booleanVariable(final simpleexpressions.BooleanVariable it);
	Simpleexpressions__IntegerCalculationExpressionT integerCalculationExpression(final simpleexpressions.IntegerCalculationExpression it);
	Simpleexpressions__IntegerComparisonExpressionT integerComparisonExpression(final simpleexpressions.IntegerComparisonExpression it);
	Simpleexpressions__IntegerValueT integerValue(final simpleexpressions.IntegerValue it);
	Simpleexpressions__IntegerVariableT integerVariable(final simpleexpressions.IntegerVariable it);

	default Simpleexpressions__BooleanBinaryExpressionT $(final simpleexpressions.BooleanBinaryExpression it) {
		return booleanBinaryExpression(it);
	}
	default Simpleexpressions__BooleanExpressionT $(final simpleexpressions.BooleanExpression it) {
		if (it.getClass() == simpleexpressions.impl.BooleanBinaryExpressionImpl.class)
			return booleanBinaryExpression((simpleexpressions.BooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.BooleanUnaryExpressionImpl.class)
			return booleanUnaryExpression((simpleexpressions.BooleanUnaryExpression) it);
		return null;
	}
	default Simpleexpressions__BooleanUnaryExpressionT $(final simpleexpressions.BooleanUnaryExpression it) {
		return booleanUnaryExpression(it);
	}
	default Simpleexpressions__BooleanValueT $(final simpleexpressions.BooleanValue it) {
		return booleanValue(it);
	}
	default Simpleexpressions__BooleanVariableT $(final simpleexpressions.BooleanVariable it) {
		return booleanVariable(it);
	}
	default Simpleexpressions__ExpressionT $(final simpleexpressions.Expression it) {
		if (it.getClass() == simpleexpressions.impl.BooleanBinaryExpressionImpl.class)
			return booleanBinaryExpression((simpleexpressions.BooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.BooleanUnaryExpressionImpl.class)
			return booleanUnaryExpression((simpleexpressions.BooleanUnaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerCalculationExpressionImpl.class)
			return integerCalculationExpression((simpleexpressions.IntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerComparisonExpressionImpl.class)
			return integerComparisonExpression((simpleexpressions.IntegerComparisonExpression) it);
		return null;
	}
	default Simpleexpressions__IntegerCalculationExpressionT $(final simpleexpressions.IntegerCalculationExpression it) {
		return integerCalculationExpression(it);
	}
	default Simpleexpressions__IntegerComparisonExpressionT $(final simpleexpressions.IntegerComparisonExpression it) {
		return integerComparisonExpression(it);
	}
	default Simpleexpressions__IntegerExpressionT $(final simpleexpressions.IntegerExpression it) {
		if (it.getClass() == simpleexpressions.impl.IntegerCalculationExpressionImpl.class)
			return integerCalculationExpression((simpleexpressions.IntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerComparisonExpressionImpl.class)
			return integerComparisonExpression((simpleexpressions.IntegerComparisonExpression) it);
		return null;
	}
	default Simpleexpressions__IntegerValueT $(final simpleexpressions.IntegerValue it) {
		return integerValue(it);
	}
	default Simpleexpressions__IntegerVariableT $(final simpleexpressions.IntegerVariable it) {
		return integerVariable(it);
	}
	default Simpleexpressions__ValueT $(final simpleexpressions.Value it) {
		if (it.getClass() == simpleexpressions.impl.BooleanValueImpl.class)
			return booleanValue((simpleexpressions.BooleanValue) it);
		if (it.getClass() == simpleexpressions.impl.IntegerValueImpl.class)
			return integerValue((simpleexpressions.IntegerValue) it);
		return null;
	}
	default Simpleexpressions__VariableT $(final simpleexpressions.Variable it) {
		if (it.getClass() == simpleexpressions.impl.BooleanVariableImpl.class)
			return booleanVariable((simpleexpressions.BooleanVariable) it);
		if (it.getClass() == simpleexpressions.impl.IntegerVariableImpl.class)
			return integerVariable((simpleexpressions.IntegerVariable) it);
		return null;
	}
}
