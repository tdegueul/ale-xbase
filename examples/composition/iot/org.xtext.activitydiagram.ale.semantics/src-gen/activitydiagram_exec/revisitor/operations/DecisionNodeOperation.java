package activitydiagram_exec.revisitor.operations;

import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;
import activitydiagramruntime.Context;
import activitydiagramruntime.Token;
import java.util.List;

@SuppressWarnings("all")
public interface DecisionNodeOperation extends ControlNodeOperation, ActivityNodeOperation, NamedElementOperation {
  public abstract void execute(final Context c);
  
  public abstract void sendOffers(final List<Token> tokens);
}
