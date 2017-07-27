package modularactivitydiagram.revisitor.operations;

public interface BooleanExpression_AspectOperation extends modularactivitydiagram.revisitor.operations.ExpressionOperation, modularactivitydiagram.revisitor.operations.BooleanExpressionOperation {
	void assignValue(Boolean value);
	Boolean getCurrentValue(adwithoutruntime.BooleanVariable variable);
}
