package iotlua.converters;

import activitydiagram.InputValue;
import activitydiagramruntime.Context;
import java.util.function.Consumer;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class ExpressionToExpressionWithexecuteToexecute {
  private final Context c;
  
  public ExpressionToExpressionWithexecuteToexecute(final Context c) {
    this.c = c;
  }
  
  public void setC2(final Environment c2) {
    this.c2 = c2;
  }
  
  private Environment c2;
  
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
