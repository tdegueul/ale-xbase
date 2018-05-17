package iotlua.converters;

import activitydiagram.InputValue;
import activitydiagramruntime.Context;
import java.util.function.Consumer;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class BooleanVariableToExpression_VariableNameWithexecuteToexecute {
  private final Context c;
  
  public BooleanVariableToExpression_VariableNameWithexecuteToexecute(final Context c) {
    this.c = c;
  }
  
  public void setC3(final Environment c3) {
    this.c3 = c3;
  }
  
  private Environment c3;
  
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
