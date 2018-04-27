package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedElementOperation;
import activitydiagramruntime.Context;
import activitydiagramruntime.Token;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityNodeOperation extends NamedElementOperation {
  public abstract List<Token> heldTokens();
  
  public abstract void execute(final Context c);
  
  public abstract void terminate();
  
  public abstract boolean isReady();
  
  public abstract void sendOffers(final List<Token> tokens);
  
  public abstract List<Token> takeOfferdTokens();
  
  public abstract void addTokens(final List<Token> tokens);
  
  public abstract boolean hasOffers();
  
  public abstract void removeToken(final Token token);
}
