package execad.revisitor.operations;

import activitydiagram.Token;
import execad.revisitor.operations.ActivityNodeOperation;
import java.util.List;

@SuppressWarnings("all")
public interface ActionOperation extends ActivityNodeOperation {
  public abstract void doAction();
  
  public abstract boolean isReady();
  
  public abstract void sendOffers();
  
  public abstract void fire(final List<Token> tokens);
}
