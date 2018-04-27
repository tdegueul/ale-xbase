package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

@SuppressWarnings("all")
public interface OfferOperation {
  public abstract boolean hasTokens();
  
  public abstract void removeWithdrawnTokens();
}
