package execad.revisitor.operations;

import activitydiagram.Token;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityEdgeOperation {
  public abstract void sendOffer(final List<Token> tokens);
  
  public abstract List<Token> takeOfferedTokens();
  
  public abstract boolean hasOffer();
}
