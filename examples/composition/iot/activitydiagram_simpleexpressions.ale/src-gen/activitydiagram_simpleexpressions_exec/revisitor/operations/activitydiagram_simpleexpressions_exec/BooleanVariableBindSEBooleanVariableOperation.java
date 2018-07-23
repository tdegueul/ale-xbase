package activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec;

import activitydiagram.Context;
import activitydiagram.Value;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;

@SuppressWarnings("all")
public interface BooleanVariableBindSEBooleanVariableOperation extends BooleanVariableOperation, activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.BooleanVariableOperation, VariableOperation, activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.VariableOperation {
  public abstract Value execute(final Context c);
  
  public abstract void init(final Context c);
  
  public abstract String print();
  
  public abstract String name();
}
