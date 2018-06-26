package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;
import activitydiagramruntime.Context;
import activitydiagramruntime.Token;
import java.util.List;

@SuppressWarnings("all")
public interface DecisionNodeOperation extends ControlNodeOperation, ActivityNodeOperation, NamedActivityOperation {
  public abstract void execute(final Context c);
  
  public abstract void sendOffers(final List<Token> tokens);
}
