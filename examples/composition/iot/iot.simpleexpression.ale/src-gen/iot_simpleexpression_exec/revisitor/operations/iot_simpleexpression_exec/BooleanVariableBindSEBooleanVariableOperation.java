package iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec;

import activitydiagram.Context;
import activitydiagram.Value;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BooleanVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.VariableOperation;

@SuppressWarnings("all")
public interface BooleanVariableBindSEBooleanVariableOperation extends BooleanVariableOperation, activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanVariableOperation, VariableOperation, activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation {
  public abstract Value execute(final Context c);
  
  public abstract void init(final Context c);
  
  public abstract String print();
  
  public abstract String name();
}
