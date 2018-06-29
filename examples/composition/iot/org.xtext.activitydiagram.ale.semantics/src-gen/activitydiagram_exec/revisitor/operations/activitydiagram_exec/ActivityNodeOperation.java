package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram.Context;
import activitydiagram.Token;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityNodeOperation extends NamedActivityOperation {
  public abstract void execute(final Context c);
  
  public abstract void terminate();
  
  public abstract boolean isReady();
  
  public abstract void sendOffers(final List<Token> tokens);
  
  public abstract List<Token> takeOfferdTokens();
  
  public abstract void addTokens(final List<Token> tokens);
  
  public abstract boolean hasOffers();
  
  public abstract void removeToken(final Token token);
}
