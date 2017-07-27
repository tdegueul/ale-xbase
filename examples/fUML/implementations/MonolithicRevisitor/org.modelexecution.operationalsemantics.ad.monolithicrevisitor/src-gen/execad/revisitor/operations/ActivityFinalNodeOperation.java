package execad.revisitor.operations;

import activitydiagram.Token;
import execad.revisitor.operations.ActivityNodeOperation;
import execad.revisitor.operations.ControlNodeOperation;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityFinalNodeOperation extends ControlNodeOperation, ActivityNodeOperation {
  public abstract void fire(final List<Token> tokens);
}
