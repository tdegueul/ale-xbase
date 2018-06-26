package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;
import activitydiagramruntime.Offer;
import activitydiagramruntime.Token;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityEdgeOperation extends NamedActivityOperation {
  public abstract List<Offer> offers();
  
  public abstract void sendOffer(final List<Token> tokens);
  
  public abstract List<Token> takeOfferedTokens();
  
  public abstract boolean hasOffer();
}
