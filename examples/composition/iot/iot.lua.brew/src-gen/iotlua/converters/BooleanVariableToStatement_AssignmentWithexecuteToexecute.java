package iotlua.converters;

import activitydiagram.InputValue;
import activitydiagramruntime.Context;
import java.util.function.Consumer;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class BooleanVariableToStatement_AssignmentWithexecuteToexecute {
  private final Context c;
  
  public BooleanVariableToStatement_AssignmentWithexecuteToexecute(final Context c) {
    this.c = c;
  }
  
  public void setC0(final Environment c0) {
    this.c0 = c0;
  }
  
  private Environment c0;
  
  public Environment adaptc() {
    Environment _xblockexpression = null;
    {
      final Environment e = new Environment();
      final Consumer<InputValue> _function = (InputValue it) -> {
        e.putVariable(it.getVariable().getName(), it.getValue());
      };
      this.c.getInputValues().forEach(_function);
      _xblockexpression = e;
    }
    return _xblockexpression;
  }
}
