package activitydiagram_exec.revisitor.operations;

@SuppressWarnings("all")
public interface OfferOperation {
  public abstract boolean hasTokens();
  
  public abstract void removeWithdrawnTokens();
}
